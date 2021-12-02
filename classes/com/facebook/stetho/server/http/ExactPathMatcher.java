// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server.http;

public class ExactPathMatcher implements PathMatcher
{
    private final String mPath;
    
    public ExactPathMatcher(final String mPath) {
        this.mPath = mPath;
    }
    
    @Override
    public boolean match(final String anObject) {
        return this.mPath.equals(anObject);
    }
}
