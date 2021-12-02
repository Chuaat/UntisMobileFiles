// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector;

public class MismatchedResponseException extends MessageHandlingException
{
    public long mRequestId;
    
    public MismatchedResponseException(final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Response for request id ");
        sb.append(n);
        sb.append(", but no such request is pending");
        super(sb.toString());
        this.mRequestId = n;
    }
    
    public long getRequestId() {
        return this.mRequestId;
    }
}
