// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load;

import androidx.annotation.k0;
import java.io.IOException;

public final class e extends IOException
{
    private static final long H = 1L;
    public static final int I = -1;
    private final int G;
    
    public e(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Http request failed with status code: ");
        sb.append(i);
        this(sb.toString(), i);
    }
    
    public e(final String s) {
        this(s, -1);
    }
    
    public e(final String s, final int n) {
        this(s, n, null);
    }
    
    public e(final String message, final int g, @k0 final Throwable cause) {
        super(message, cause);
        this.G = g;
    }
    
    public int a() {
        return this.G;
    }
}
