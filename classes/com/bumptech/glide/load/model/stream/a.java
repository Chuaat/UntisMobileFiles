// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.model.h;
import java.util.Collections;
import com.bumptech.glide.load.data.d;
import android.text.TextUtils;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import androidx.annotation.k0;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.g;
import java.io.InputStream;
import com.bumptech.glide.load.model.n;

public abstract class a<Model> implements n<Model, InputStream>
{
    private final n<g, InputStream> a;
    @k0
    private final m<Model, g> b;
    
    protected a(final n<g, InputStream> n) {
        this(n, null);
    }
    
    protected a(final n<g, InputStream> a, @k0 final m<Model, g> b) {
        this.a = a;
        this.b = b;
    }
    
    private static List<com.bumptech.glide.load.g> c(final Collection<String> collection) {
        final ArrayList<g> list = (ArrayList<g>)new ArrayList<com.bumptech.glide.load.g>(collection.size());
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            list.add(new g(iterator.next()));
        }
        return (List<com.bumptech.glide.load.g>)list;
    }
    
    @k0
    @Override
    public n.a<InputStream> b(@j0 final Model model, final int n, final int n2, @j0 final j j) {
        final m<Model, g> b = this.b;
        g g;
        if (b != null) {
            g = b.b(model, n, n2);
        }
        else {
            g = null;
        }
        g g2 = g;
        if (g == null) {
            final String f = this.f(model, n, n2, j);
            if (TextUtils.isEmpty((CharSequence)f)) {
                return null;
            }
            g2 = new g(f, this.e(model, n, n2, j));
            final m<Model, g> b2 = this.b;
            if (b2 != null) {
                b2.c(model, n, n2, g2);
            }
        }
        final List<String> d = this.d(model, n, n2, j);
        final n.a<InputStream> b3 = this.a.b(g2, n, n2, j);
        if (b3 != null && !d.isEmpty()) {
            return (n.a<InputStream>)new n.a(b3.a, c(d), (d<Object>)b3.c);
        }
        return b3;
    }
    
    protected List<String> d(final Model model, final int n, final int n2, final j j) {
        return Collections.emptyList();
    }
    
    @k0
    protected h e(final Model model, final int n, final int n2, final j j) {
        return h.b;
    }
    
    protected abstract String f(final Model p0, final int p1, final int p2, final j p3);
}
