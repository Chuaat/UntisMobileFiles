// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import androidx.annotation.k0;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.i;
import java.io.InputStream;
import com.bumptech.glide.load.model.g;
import com.bumptech.glide.load.model.n;

public class b implements n<g, InputStream>
{
    public static final i<Integer> b;
    @k0
    private final m<g, g> a;
    
    static {
        b = i.g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    }
    
    public b() {
        this(null);
    }
    
    public b(@k0 final m<g, g> a) {
        this.a = a;
    }
    
    public n.a<InputStream> c(@j0 final g g, final int n, final int n2, @j0 final j j) {
        final m<g, g> a = this.a;
        g g2 = g;
        if (a != null) {
            g2 = a.b(g, 0, 0);
            if (g2 == null) {
                this.a.c(g, 0, 0, g);
                g2 = g;
            }
        }
        return (n.a<InputStream>)new n.a(g2, (d<Object>)new com.bumptech.glide.load.data.j(g2, j.c(com.bumptech.glide.load.model.stream.b.b)));
    }
    
    public boolean d(@j0 final g g) {
        return true;
    }
    
    public static class a implements o<g, InputStream>
    {
        private final m<g, g> a;
        
        public a() {
            this.a = new m<g, g>(500L);
        }
        
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<g, InputStream> c(final r r) {
            return new b(this.a);
        }
    }
}
