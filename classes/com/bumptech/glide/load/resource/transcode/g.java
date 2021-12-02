// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.k0;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import com.bumptech.glide.load.engine.v;

public class g<Z> implements e<Z, Z>
{
    private static final g<?> a;
    
    static {
        a = new g<Object>();
    }
    
    public static <Z> e<Z, Z> b() {
        return (e<Z, Z>)g.a;
    }
    
    @k0
    @Override
    public v<Z> a(@j0 final v<Z> v, @j0 final j j) {
        return v;
    }
}
