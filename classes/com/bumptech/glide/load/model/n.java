// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import com.bumptech.glide.util.k;
import java.util.Collections;
import com.bumptech.glide.load.data.d;
import java.util.List;
import com.bumptech.glide.load.g;
import androidx.annotation.k0;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;

public interface n<Model, Data>
{
    boolean a(@j0 final Model p0);
    
    @k0
    a<Data> b(@j0 final Model p0, final int p1, final int p2, @j0 final j p3);
    
    public static class a<Data>
    {
        public final g a;
        public final List<g> b;
        public final d<Data> c;
        
        public a(@j0 final g g, @j0 final d<Data> d) {
            this(g, Collections.emptyList(), d);
        }
        
        public a(@j0 final g g, @j0 final List<g> list, @j0 final d<Data> d) {
            this.a = k.d(g);
            this.b = k.d(list);
            this.c = k.d(d);
        }
    }
}
