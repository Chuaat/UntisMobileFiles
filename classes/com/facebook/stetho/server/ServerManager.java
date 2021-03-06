// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server;

import java.io.IOException;
import com.facebook.stetho.common.LogUtil;

public class ServerManager
{
    private static final String THREAD_PREFIX = "StethoListener";
    private final LocalSocketServer mServer;
    private volatile boolean mStarted;
    
    public ServerManager(final LocalSocketServer mServer) {
        this.mServer = mServer;
    }
    
    private void startServer(final LocalSocketServer localSocketServer) {
        final StringBuilder sb = new StringBuilder();
        sb.append("StethoListener-");
        sb.append(localSocketServer.getName());
        new Thread(sb.toString()) {
            @Override
            public void run() {
                try {
                    localSocketServer.run();
                }
                catch (IOException ex) {
                    LogUtil.e(ex, "Could not start Stetho server: %s", localSocketServer.getName());
                }
            }
        }.start();
    }
    
    public void start() {
        if (!this.mStarted) {
            this.mStarted = true;
            this.startServer(this.mServer);
            return;
        }
        throw new IllegalStateException("Already started");
    }
}
