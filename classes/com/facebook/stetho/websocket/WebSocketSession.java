// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.websocket;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

class WebSocketSession implements SimpleSession
{
    private final SimpleEndpoint mEndpoint;
    private final WriteCallback mErrorForwardingWriteCallback;
    private AtomicBoolean mIsOpen;
    private final ReadCallback mReadCallback;
    private final ReadHandler mReadHandler;
    private volatile boolean mSentClose;
    private final WriteHandler mWriteHandler;
    
    public WebSocketSession(final InputStream inputStream, final OutputStream outputStream, final SimpleEndpoint mEndpoint) {
        this.mIsOpen = new AtomicBoolean(false);
        this.mReadCallback = new ReadCallback() {
            private void handleBinaryFrame(final byte[] array, final int n) {
                WebSocketSession.this.mEndpoint.onMessage(WebSocketSession.this, array, n);
            }
            
            private void handleClose(final byte[] bytes, int n) {
                String s;
                if (n >= 2) {
                    final int n2 = (bytes[0] & 0xFF) << 8 | (bytes[1] & 0xFF);
                    if (n > 2) {
                        s = new String(bytes, 2, n - 2);
                        n = n2;
                    }
                    else {
                        s = null;
                        n = n2;
                    }
                }
                else {
                    n = 1006;
                    s = "Unparseable close frame";
                }
                if (!WebSocketSession.this.mSentClose) {
                    WebSocketSession.this.sendClose(1000, "Received close frame");
                }
                WebSocketSession.this.markAndSignalClosed(n, s);
            }
            
            private void handlePing(final byte[] array, final int n) {
                WebSocketSession.this.doWrite(FrameHelper.createPongFrame(array, n));
            }
            
            private void handlePong(final byte[] array, final int n) {
            }
            
            private void handleTextFrame(final byte[] bytes, final int length) {
                WebSocketSession.this.mEndpoint.onMessage(WebSocketSession.this, new String(bytes, 0, length));
            }
            
            @Override
            public void onCompleteFrame(final byte i, final byte[] array, final int n) {
                if (i != 1) {
                    if (i != 2) {
                        switch (i) {
                            default: {
                                final WebSocketSession this$0 = WebSocketSession.this;
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Unsupported frame opcode=");
                                sb.append(i);
                                this$0.signalError(new IOException(sb.toString()));
                                break;
                            }
                            case 10: {
                                this.handlePong(array, n);
                                break;
                            }
                            case 9: {
                                this.handlePing(array, n);
                                break;
                            }
                            case 8: {
                                this.handleClose(array, n);
                                break;
                            }
                        }
                    }
                    else {
                        this.handleBinaryFrame(array, n);
                    }
                }
                else {
                    this.handleTextFrame(array, n);
                }
            }
        };
        this.mErrorForwardingWriteCallback = new WriteCallback() {
            @Override
            public void onFailure(final IOException ex) {
                WebSocketSession.this.signalError(ex);
            }
            
            @Override
            public void onSuccess() {
            }
        };
        this.mReadHandler = new ReadHandler(inputStream, mEndpoint);
        this.mWriteHandler = new WriteHandler(outputStream);
        this.mEndpoint = mEndpoint;
    }
    
    private void doWrite(final Frame frame) {
        if (this.signalErrorIfNotOpen()) {
            return;
        }
        this.mWriteHandler.write(frame, this.mErrorForwardingWriteCallback);
    }
    
    private void sendClose(final int n, final String s) {
        this.doWrite(FrameHelper.createCloseFrame(n, s));
        this.markSentClose();
    }
    
    private void signalError(final IOException ex) {
        this.mEndpoint.onError(this, ex);
    }
    
    private boolean signalErrorIfNotOpen() {
        if (!this.isOpen()) {
            this.signalError(new IOException("Session is closed"));
            return true;
        }
        return false;
    }
    
    @Override
    public void close(final int n, final String s) {
        this.sendClose(n, s);
        this.markAndSignalClosed(n, s);
    }
    
    public void handle() throws IOException {
        this.markAndSignalOpen();
        try {
            this.mReadHandler.readLoop(this.mReadCallback);
        }
        catch (IOException ex) {
            this.markAndSignalClosed(1006, null);
            throw ex;
        }
        catch (EOFException ex2) {
            this.markAndSignalClosed(1011, "EOF while reading");
        }
    }
    
    @Override
    public boolean isOpen() {
        return this.mIsOpen.get();
    }
    
    void markAndSignalClosed(final int n, final String s) {
        if (this.mIsOpen.getAndSet(false)) {
            this.mEndpoint.onClose(this, n, s);
        }
    }
    
    void markAndSignalOpen() {
        if (!this.mIsOpen.getAndSet(true)) {
            this.mEndpoint.onOpen(this);
        }
    }
    
    void markSentClose() {
        this.mSentClose = true;
    }
    
    @Override
    public void sendBinary(final byte[] array) {
        this.doWrite(FrameHelper.createBinaryFrame(array));
    }
    
    @Override
    public void sendText(final String s) {
        this.doWrite(FrameHelper.createTextFrame(s));
    }
}
