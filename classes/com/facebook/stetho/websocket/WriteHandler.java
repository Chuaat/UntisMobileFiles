// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.websocket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import d6.d;

@d
class WriteHandler
{
    private final BufferedOutputStream mBufferedOutput;
    
    public WriteHandler(final OutputStream out) {
        this.mBufferedOutput = new BufferedOutputStream(out, 1024);
    }
    
    public void write(final Frame frame, final WriteCallback writeCallback) {
        // monitorenter(this)
        try {
            try {
                frame.writeTo(this.mBufferedOutput);
                this.mBufferedOutput.flush();
                writeCallback.onSuccess();
            }
            finally {}
        }
        catch (IOException ex) {
            writeCallback.onFailure(ex);
        }
        // monitorexit(this)
        return;
    }
    // monitorexit(this)
}
