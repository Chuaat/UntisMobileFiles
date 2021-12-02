// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load;

import androidx.annotation.j0;
import java.security.MessageDigest;
import java.nio.charset.Charset;

public interface g
{
    public static final String a = "UTF-8";
    public static final Charset b = Charset.forName("UTF-8");
    
    void a(@j0 final MessageDigest p0);
    
    boolean equals(final Object p0);
    
    int hashCode();
}
