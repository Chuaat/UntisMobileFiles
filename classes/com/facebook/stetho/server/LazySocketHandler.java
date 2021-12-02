// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server;

import java.io.IOException;
import android.net.LocalSocket;
import c6.g;
import c6.h;

public class LazySocketHandler implements SocketHandler
{
    @h
    private SocketHandler mSocketHandler;
    private final SocketHandlerFactory mSocketHandlerFactory;
    
    public LazySocketHandler(final SocketHandlerFactory mSocketHandlerFactory) {
        this.mSocketHandlerFactory = mSocketHandlerFactory;
    }
    
    @g
    private SocketHandler getSocketHandler() {
        synchronized (this) {
            if (this.mSocketHandler == null) {
                this.mSocketHandler = this.mSocketHandlerFactory.create();
            }
            return this.mSocketHandler;
        }
    }
    
    @Override
    public void onAccepted(final LocalSocket localSocket) throws IOException {
        this.getSocketHandler().onAccepted(localSocket);
    }
}
