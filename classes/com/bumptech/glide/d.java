// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide;

import java.util.Iterator;
import com.bumptech.glide.request.target.r;
import android.widget.ImageView;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.w;
import androidx.annotation.k0;
import com.bumptech.glide.request.h;
import java.util.Map;
import com.bumptech.glide.request.g;
import java.util.List;
import com.bumptech.glide.request.target.k;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import androidx.annotation.b1;
import android.content.ContextWrapper;

public class d extends ContextWrapper
{
    @b1
    static final m<?, ?> k;
    private final b a;
    private final j b;
    private final k c;
    private final com.bumptech.glide.b.a d;
    private final List<g<Object>> e;
    private final Map<Class<?>, m<?, ?>> f;
    private final com.bumptech.glide.load.engine.k g;
    private final boolean h;
    private final int i;
    @k0
    @w("this")
    private h j;
    
    static {
        k = new a<Object>();
    }
    
    public d(@j0 final Context context, @j0 final b a, @j0 final j b, @j0 final k c, @j0 final com.bumptech.glide.b.a d, @j0 final Map<Class<?>, m<?, ?>> f, @j0 final List<g<Object>> e, @j0 final com.bumptech.glide.load.engine.k g, final boolean h, final int i) {
        super(context.getApplicationContext());
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @j0
    public <X> r<ImageView, X> a(@j0 final ImageView imageView, @j0 final Class<X> clazz) {
        return this.c.a(imageView, clazz);
    }
    
    @j0
    public b b() {
        return this.a;
    }
    
    public List<g<Object>> c() {
        return this.e;
    }
    
    public h d() {
        synchronized (this) {
            if (this.j == null) {
                this.j = this.d.h().s0();
            }
            return this.j;
        }
    }
    
    @j0
    public <T> m<?, T> e(@j0 final Class<T> clazz) {
        m<?, T> i;
        m<?, ?> m = i = (m<?, T>)this.f.get(clazz);
        if (m == null) {
            final Iterator<Map.Entry<Class<?>, m<?, ?>>> iterator = this.f.entrySet().iterator();
            while (true) {
                i = (m<?, T>)m;
                if (!iterator.hasNext()) {
                    break;
                }
                final Map.Entry<Class<?>, m<?, ?>> entry = iterator.next();
                if (!entry.getKey().isAssignableFrom(clazz)) {
                    continue;
                }
                m = entry.getValue();
            }
        }
        m<?, ?> k;
        if ((k = i) == null) {
            k = com.bumptech.glide.d.k;
        }
        return (m<?, T>)k;
    }
    
    @j0
    public com.bumptech.glide.load.engine.k f() {
        return this.g;
    }
    
    public int g() {
        return this.i;
    }
    
    @j0
    public j h() {
        return this.b;
    }
    
    public boolean i() {
        return this.h;
    }
}
