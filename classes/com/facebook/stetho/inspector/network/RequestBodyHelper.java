// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.network;

import java.io.IOException;
import java.util.zip.InflaterOutputStream;
import java.io.OutputStream;
import c6.h;
import java.io.ByteArrayOutputStream;

public class RequestBodyHelper
{
    private ByteArrayOutputStream mDeflatedOutput;
    private CountingOutputStream mDeflatingOutput;
    private final NetworkEventReporter mEventReporter;
    private final String mRequestId;
    
    public RequestBodyHelper(final NetworkEventReporter mEventReporter, final String mRequestId) {
        this.mEventReporter = mEventReporter;
        this.mRequestId = mRequestId;
    }
    
    private void throwIfNoBody() {
        if (this.hasBody()) {
            return;
        }
        throw new IllegalStateException("No body found; has createBodySink been called?");
    }
    
    public OutputStream createBodySink(@h final String s) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream create;
        if ("gzip".equals(s)) {
            create = GunzippingOutputStream.create(byteArrayOutputStream);
        }
        else if ("deflate".equals(s)) {
            create = new InflaterOutputStream(byteArrayOutputStream);
        }
        else {
            create = byteArrayOutputStream;
        }
        final CountingOutputStream mDeflatingOutput = new CountingOutputStream(create);
        this.mDeflatingOutput = mDeflatingOutput;
        this.mDeflatedOutput = byteArrayOutputStream;
        return mDeflatingOutput;
    }
    
    public byte[] getDisplayBody() {
        this.throwIfNoBody();
        return this.mDeflatedOutput.toByteArray();
    }
    
    public boolean hasBody() {
        return this.mDeflatedOutput != null;
    }
    
    public void reportDataSent() {
        this.throwIfNoBody();
        this.mEventReporter.dataSent(this.mRequestId, this.mDeflatedOutput.size(), (int)this.mDeflatingOutput.getCount());
    }
}
