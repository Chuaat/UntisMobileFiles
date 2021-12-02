// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import androidx.annotation.k0;
import com.bumptech.glide.h;
import com.bumptech.glide.load.a;
import androidx.annotation.j0;

public interface d<T>
{
    @j0
    Class<T> a();
    
    void b();
    
    void cancel();
    
    @j0
    com.bumptech.glide.load.a d();
    
    void e(@j0 final h p0, @j0 final a<? super T> p1);
    
    public interface a<T>
    {
        void c(@j0 final Exception p0);
        
        void f(@k0 final T p0);
    }
}
