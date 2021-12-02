// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.k0;
import u1.b;
import com.bumptech.glide.util.a;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.resource.gif.c;

public class d implements e<c, byte[]>
{
    @k0
    @Override
    public v<byte[]> a(@j0 final v<c> v, @j0 final j j) {
        return new b(a.d(v.get().f()));
    }
}
