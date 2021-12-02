// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.dumpapp;

import java.io.InputStream;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.common.LogUtil;
import java.util.Arrays;
import java.io.DataInputStream;
import java.io.IOException;
import com.facebook.stetho.server.SocketLikeHandler;

public class DumpappSocketLikeHandler implements SocketLikeHandler
{
    public static final byte[] PROTOCOL_MAGIC;
    public static final int PROTOCOL_VERSION = 1;
    private final Dumper mDumper;
    
    static {
        PROTOCOL_MAGIC = new byte[] { 68, 85, 77, 80 };
    }
    
    public DumpappSocketLikeHandler(final Dumper mDumper) {
        this.mDumper = mDumper;
    }
    
    static void dump(final Dumper dumper, final Framer framer, final String[] array) throws IOException {
        try {
            framer.writeExitCode(dumper.dump(framer.getStdin(), framer.getStdout(), framer.getStderr(), array));
        }
        catch (DumpappOutputBrokenException ex) {}
    }
    
    private void establishConversation(final DataInputStream dataInputStream) throws IOException {
        final byte[] array = new byte[4];
        dataInputStream.readFully(array);
        if (!Arrays.equals(DumpappSocketLikeHandler.PROTOCOL_MAGIC, array)) {
            throw logAndThrowProtocolException("Incompatible protocol, are you using an old dumpapp script?");
        }
        final int int1 = dataInputStream.readInt();
        if (int1 == 1) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected version=1; got=");
        sb.append(int1);
        throw logAndThrowProtocolException(sb.toString());
    }
    
    private static IOException logAndThrowProtocolException(final String message) throws IOException {
        LogUtil.w(message);
        throw new IOException(message);
    }
    
    private String[] readArgs(final Framer framer) throws IOException {
        synchronized (framer) {
            final byte frameType = framer.readFrameType();
            if (frameType == 33) {
                final int int1 = framer.readInt();
                final String[] array = new String[int1];
                for (int i = 0; i < int1; ++i) {
                    array[i] = framer.readString();
                }
                return array;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected enter frame, got: ");
            sb.append(frameType);
            throw new DumpappFramingException(sb.toString());
        }
    }
    
    @Override
    public void onAccepted(final SocketLike socketLike) throws IOException {
        final DataInputStream dataInputStream = new DataInputStream(socketLike.getInput());
        this.establishConversation(dataInputStream);
        final Framer framer = new Framer(dataInputStream, socketLike.getOutput());
        dump(this.mDumper, framer, this.readArgs(framer));
    }
}
