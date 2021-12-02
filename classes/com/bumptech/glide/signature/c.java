// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.signature;

import java.security.MessageDigest;
import androidx.annotation.j0;
import com.bumptech.glide.load.g;

public final class c implements g
{
    private static final c c;
    
    static {
        c = new c();
    }
    
    private c() {
    }
    
    @j0
    public static c c() {
        return com.bumptech.glide.signature.c.c;
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
    }
    
    @Override
    public String toString() {
        return "EmptySignature";
    }
}
