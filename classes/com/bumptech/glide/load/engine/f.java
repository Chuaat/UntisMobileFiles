// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import androidx.annotation.k0;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.g;

interface f
{
    boolean a();
    
    void cancel();
    
    public interface a
    {
        void b(final g p0, final Exception p1, final d<?> p2, final com.bumptech.glide.load.a p3);
        
        void d();
        
        void f(final g p0, @k0 final Object p1, final d<?> p2, final com.bumptech.glide.load.a p3, final g p4);
    }
}
