// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import java.io.InputStream;
import java.net.URL;
import com.bumptech.glide.load.model.n;

public class g implements n<URL, InputStream>
{
    private final n<com.bumptech.glide.load.model.g, InputStream> a;
    
    public g(final n<com.bumptech.glide.load.model.g, InputStream> a) {
        this.a = a;
    }
    
    public n.a<InputStream> c(@j0 final URL url, final int n, final int n2, @j0 final j j) {
        return this.a.b(new com.bumptech.glide.load.model.g(url), n, n2, j);
    }
    
    public boolean d(@j0 final URL url) {
        return true;
    }
    
    public static class a implements o<URL, InputStream>
    {
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<URL, InputStream> c(final r r) {
            return new g(r.d(com.bumptech.glide.load.model.g.class, InputStream.class));
        }
    }
}
