// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import com.bumptech.glide.load.model.g;
import java.util.Set;
import java.io.InputStream;
import android.net.Uri;
import com.bumptech.glide.load.model.n;

public class c implements n<Uri, InputStream>
{
    private static final Set<String> b;
    private final n<g, InputStream> a;
    
    static {
        b = Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(Arrays.asList("http", "https")));
    }
    
    public c(final n<g, InputStream> a) {
        this.a = a;
    }
    
    public n.a<InputStream> c(@j0 final Uri uri, final int n, final int n2, @j0 final j j) {
        return this.a.b(new g(uri.toString()), n, n2, j);
    }
    
    public boolean d(@j0 final Uri uri) {
        return c.b.contains(uri.getScheme());
    }
    
    public static class a implements o<Uri, InputStream>
    {
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<Uri, InputStream> c(final r r) {
            return new c(r.d(g.class, InputStream.class));
        }
    }
}
