// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server;

import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;
import android.net.LocalSocket;
import android.content.Context;
import java.util.ArrayList;

public class ProtocolDetectingSocketHandler extends SecureSocketHandler
{
    private static final int SENSING_BUFFER_SIZE = 256;
    private final ArrayList<HandlerInfo> mHandlers;
    
    public ProtocolDetectingSocketHandler(final Context context) {
        super(context);
        this.mHandlers = new ArrayList<HandlerInfo>(2);
    }
    
    public void addHandler(final MagicMatcher magicMatcher, final SocketLikeHandler socketLikeHandler) {
        this.mHandlers.add(new HandlerInfo(magicMatcher, socketLikeHandler));
    }
    
    @Override
    protected void onSecured(final LocalSocket localSocket) throws IOException {
        final LeakyBufferedInputStream leakyBufferedInputStream = new LeakyBufferedInputStream(localSocket.getInputStream(), 256);
        if (!this.mHandlers.isEmpty()) {
            for (int i = 0; i < this.mHandlers.size(); ++i) {
                final HandlerInfo handlerInfo = this.mHandlers.get(i);
                leakyBufferedInputStream.mark(256);
                final boolean matches = handlerInfo.magicMatcher.matches(leakyBufferedInputStream);
                leakyBufferedInputStream.reset();
                if (matches) {
                    handlerInfo.handler.onAccepted(new SocketLike(localSocket, leakyBufferedInputStream));
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No matching handler, firstByte=");
            sb.append(leakyBufferedInputStream.read());
            throw new IOException(sb.toString());
        }
        throw new IllegalStateException("No handlers added");
    }
    
    public static class AlwaysMatchMatcher implements MagicMatcher
    {
        @Override
        public boolean matches(final InputStream inputStream) throws IOException {
            return true;
        }
    }
    
    public static class ExactMagicMatcher implements MagicMatcher
    {
        private final byte[] mMagic;
        
        public ExactMagicMatcher(final byte[] mMagic) {
            this.mMagic = mMagic;
        }
        
        @Override
        public boolean matches(final InputStream inputStream) throws IOException {
            final int length = this.mMagic.length;
            final byte[] array = new byte[length];
            return inputStream.read(array) == length && Arrays.equals(array, this.mMagic);
        }
    }
    
    private static class HandlerInfo
    {
        public final SocketLikeHandler handler;
        public final MagicMatcher magicMatcher;
        
        private HandlerInfo(final MagicMatcher magicMatcher, final SocketLikeHandler handler) {
            this.magicMatcher = magicMatcher;
            this.handler = handler;
        }
    }
    
    public interface MagicMatcher
    {
        boolean matches(final InputStream p0) throws IOException;
    }
}
