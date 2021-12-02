// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.v;
import android.content.Context;
import java.security.MessageDigest;
import androidx.annotation.j0;
import com.bumptech.glide.load.n;

public final class c<T> implements n<T>
{
    private static final n<?> c;
    
    static {
        c = new c<Object>();
    }
    
    private c() {
    }
    
    @j0
    public static <T> c<T> c() {
        return (c<T>)(c)com.bumptech.glide.load.resource.c.c;
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
    }
    
    @j0
    @Override
    public v<T> b(@j0 final Context context, @j0 final v<T> v, final int n, final int n2) {
        return v;
    }
}
