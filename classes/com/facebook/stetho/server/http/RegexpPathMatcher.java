// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server.http;

import java.util.regex.Pattern;

public class RegexpPathMatcher implements PathMatcher
{
    private final Pattern mPattern;
    
    public RegexpPathMatcher(final Pattern mPattern) {
        this.mPattern = mPattern;
    }
    
    @Override
    public boolean match(final String input) {
        return this.mPattern.matcher(input).matches();
    }
}
