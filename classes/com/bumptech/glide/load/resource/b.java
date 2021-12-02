// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource;

import com.bumptech.glide.util.k;
import androidx.annotation.j0;
import com.bumptech.glide.load.engine.v;

public class b<T> implements v<T>
{
    protected final T G;
    
    public b(@j0 final T t) {
        this.G = k.d(t);
    }
    
    @Override
    public void a() {
    }
    
    @j0
    @Override
    public final T get() {
        return this.G;
    }
    
    @Override
    public final int l0() {
        return 1;
    }
    
    @j0
    @Override
    public Class<T> m0() {
        return (Class<T>)this.G.getClass();
    }
}
