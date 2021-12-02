// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import java.io.InputStream;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import android.net.Uri;

public class x<Data> implements n<Uri, Data>
{
    private static final Set<String> b;
    private final n<g, Data> a;
    
    static {
        b = Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(Arrays.asList("http", "https")));
    }
    
    public x(final n<g, Data> a) {
        this.a = a;
    }
    
    public n.a<Data> c(@j0 final Uri uri, final int n, final int n2, @j0 final j j) {
        return this.a.b(new g(uri.toString()), n, n2, j);
    }
    
    public boolean d(@j0 final Uri uri) {
        return x.b.contains(uri.getScheme());
    }
    
    public static class a implements o<Uri, InputStream>
    {
        @Override
        public void a() {
        }
        
        @j0
        @Override
        public n<Uri, InputStream> c(final r r) {
            return new x<InputStream>((n<g, InputStream>)r.d(g.class, (Class<Data>)InputStream.class));
        }
    }
}
