// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide;

import java.util.Collection;
import com.bumptech.glide.load.engine.v;
import java.util.Collections;
import com.bumptech.glide.load.model.n;
import androidx.annotation.k0;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.model.o;
import java.util.Iterator;
import com.bumptech.glide.load.l;
import java.util.ArrayList;
import com.bumptech.glide.load.engine.i;
import androidx.annotation.j0;
import java.util.Arrays;
import java.util.List;
import androidx.core.util.m;
import com.bumptech.glide.provider.c;
import com.bumptech.glide.provider.d;
import com.bumptech.glide.provider.b;
import com.bumptech.glide.provider.f;
import com.bumptech.glide.provider.e;
import com.bumptech.glide.provider.a;
import com.bumptech.glide.load.model.p;

public class j
{
    public static final String k = "Gif";
    public static final String l = "Bitmap";
    public static final String m = "BitmapDrawable";
    private static final String n = "legacy_prepend_all";
    private static final String o = "legacy_append";
    private final p a;
    private final com.bumptech.glide.provider.a b;
    private final com.bumptech.glide.provider.e c;
    private final f d;
    private final com.bumptech.glide.load.data.f e;
    private final com.bumptech.glide.load.resource.transcode.f f;
    private final com.bumptech.glide.provider.b g;
    private final com.bumptech.glide.provider.d h;
    private final com.bumptech.glide.provider.c i;
    private final m.a<List<Throwable>> j;
    
    public j() {
        this.h = new com.bumptech.glide.provider.d();
        this.i = new com.bumptech.glide.provider.c();
        final m.a<List<Throwable>> f = com.bumptech.glide.util.pool.a.f();
        this.j = f;
        this.a = new p(f);
        this.b = new com.bumptech.glide.provider.a();
        this.c = new com.bumptech.glide.provider.e();
        this.d = new f();
        this.e = new com.bumptech.glide.load.data.f();
        this.f = new com.bumptech.glide.load.resource.transcode.f();
        this.g = new com.bumptech.glide.provider.b();
        this.z(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }
    
    @j0
    private <Data, TResource, Transcode> List<i<Data, TResource, Transcode>> f(@j0 final Class<Data> clazz, @j0 final Class<TResource> clazz2, @j0 final Class<Transcode> clazz3) {
        final ArrayList<i<Data, Z, Object>> list = (ArrayList<i<Data, Z, Object>>)new ArrayList<i<Data, TResource, Transcode>>();
        for (final Class<TResource> clazz4 : this.c.d(clazz, clazz2)) {
            for (final Class<Transcode> clazz5 : this.f.b((Class<R>)clazz4, clazz3)) {
                list.add(new i<Data, TResource, Transcode>((Class<Object>)clazz, (Class<Object>)clazz4, (Class<Object>)clazz5, (List<? extends l<Object, Object>>)this.c.b(clazz, (Class<Z>)clazz4), (com.bumptech.glide.load.resource.transcode.e<Object, Object>)this.f.a((Class<Z>)clazz4, clazz5), this.j));
            }
        }
        return (List<i<Data, TResource, Transcode>>)list;
    }
    
    @j0
    public <Data> j a(@j0 final Class<Data> clazz, @j0 final com.bumptech.glide.load.d<Data> d) {
        this.b.a(clazz, d);
        return this;
    }
    
    @j0
    public <TResource> j b(@j0 final Class<TResource> clazz, @j0 final com.bumptech.glide.load.m<TResource> m) {
        this.d.a(clazz, m);
        return this;
    }
    
    @j0
    public <Data, TResource> j c(@j0 final Class<Data> clazz, @j0 final Class<TResource> clazz2, @j0 final l<Data, TResource> l) {
        this.e("legacy_append", clazz, clazz2, l);
        return this;
    }
    
    @j0
    public <Model, Data> j d(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2, @j0 final o<Model, Data> o) {
        this.a.a(clazz, clazz2, (o<? extends Model, ? extends Data>)o);
        return this;
    }
    
    @j0
    public <Data, TResource> j e(@j0 final String s, @j0 final Class<Data> clazz, @j0 final Class<TResource> clazz2, @j0 final l<Data, TResource> l) {
        this.c.a(s, l, clazz, clazz2);
        return this;
    }
    
    @j0
    public List<ImageHeaderParser> g() {
        final List<ImageHeaderParser> b = this.g.b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new b();
    }
    
    @k0
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> h(@j0 final Class<Data> clazz, @j0 final Class<TResource> clazz2, @j0 final Class<Transcode> clazz3) {
        final t<Data, TResource, Transcode> a = this.i.a(clazz, clazz2, clazz3);
        if (this.i.c(a)) {
            return null;
        }
        t<?, ?, ?> t;
        if ((t = a) == null) {
            final List<i<Data, TResource, Transcode>> f = this.f(clazz, clazz2, clazz3);
            if (f.isEmpty()) {
                t = null;
            }
            else {
                t = new t<Data, TResource, Transcode>((Class<Object>)clazz, (Class<Object>)clazz2, (Class<Object>)clazz3, (List<i<Object, Object, Object>>)f, this.j);
            }
            this.i.d(clazz, clazz2, clazz3, t);
        }
        return (t<Data, TResource, Transcode>)t;
    }
    
    @j0
    public <Model> List<n<Model, ?>> i(@j0 final Model model) {
        return this.a.e(model);
    }
    
    @j0
    public <Model, TResource, Transcode> List<Class<?>> j(@j0 final Class<Model> clazz, @j0 final Class<TResource> clazz2, @j0 final Class<Transcode> clazz3) {
        List<Class<?>> b;
        if ((b = this.h.b(clazz, clazz2, clazz3)) == null) {
            b = (List<Class<?>>)new ArrayList<Class<TResource>>();
            final Iterator<Class<Object>> iterator = this.a.d(clazz).iterator();
            while (iterator.hasNext()) {
                for (final Class<TResource> clazz4 : this.c.d(iterator.next(), clazz2)) {
                    if (!this.f.b(clazz4, clazz3).isEmpty() && !b.contains(clazz4)) {
                        b.add(clazz4);
                    }
                }
            }
            this.h.c(clazz, clazz2, clazz3, (List<Class<?>>)Collections.unmodifiableList((List<?>)b));
        }
        return b;
    }
    
    @j0
    public <X> com.bumptech.glide.load.m<X> k(@j0 final v<X> v) throws d {
        final com.bumptech.glide.load.m<X> b = this.d.b(v.m0());
        if (b != null) {
            return b;
        }
        throw new d(v.m0());
    }
    
    @j0
    public <X> com.bumptech.glide.load.data.e<X> l(@j0 final X x) {
        return this.e.a(x);
    }
    
    @j0
    public <X> com.bumptech.glide.load.d<X> m(@j0 final X x) throws e {
        final com.bumptech.glide.load.d<?> b = this.b.b(x.getClass());
        if (b != null) {
            return (com.bumptech.glide.load.d<X>)b;
        }
        throw new e(x.getClass());
    }
    
    public boolean n(@j0 final v<?> v) {
        return this.d.b(v.m0()) != null;
    }
    
    @j0
    public <Data> j o(@j0 final Class<Data> clazz, @j0 final com.bumptech.glide.load.d<Data> d) {
        this.b.c(clazz, d);
        return this;
    }
    
    @j0
    public <TResource> j p(@j0 final Class<TResource> clazz, @j0 final com.bumptech.glide.load.m<TResource> m) {
        this.d.c(clazz, m);
        return this;
    }
    
    @j0
    public <Data, TResource> j q(@j0 final Class<Data> clazz, @j0 final Class<TResource> clazz2, @j0 final l<Data, TResource> l) {
        this.s("legacy_prepend_all", clazz, clazz2, l);
        return this;
    }
    
    @j0
    public <Model, Data> j r(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2, @j0 final o<Model, Data> o) {
        this.a.g(clazz, clazz2, (o<? extends Model, ? extends Data>)o);
        return this;
    }
    
    @j0
    public <Data, TResource> j s(@j0 final String s, @j0 final Class<Data> clazz, @j0 final Class<TResource> clazz2, @j0 final l<Data, TResource> l) {
        this.c.e(s, l, clazz, clazz2);
        return this;
    }
    
    @j0
    public j t(@j0 final ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }
    
    @j0
    public j u(@j0 final com.bumptech.glide.load.data.e.a<?> a) {
        this.e.b(a);
        return this;
    }
    
    @Deprecated
    @j0
    public <Data> j v(@j0 final Class<Data> clazz, @j0 final com.bumptech.glide.load.d<Data> d) {
        return this.a((Class<Object>)clazz, (com.bumptech.glide.load.d<Object>)d);
    }
    
    @Deprecated
    @j0
    public <TResource> j w(@j0 final Class<TResource> clazz, @j0 final com.bumptech.glide.load.m<TResource> m) {
        return this.b((Class<Object>)clazz, (com.bumptech.glide.load.m<Object>)m);
    }
    
    @j0
    public <TResource, Transcode> j x(@j0 final Class<TResource> clazz, @j0 final Class<Transcode> clazz2, @j0 final com.bumptech.glide.load.resource.transcode.e<TResource, Transcode> e) {
        this.f.c(clazz, clazz2, e);
        return this;
    }
    
    @j0
    public <Model, Data> j y(@j0 final Class<Model> clazz, @j0 final Class<Data> clazz2, @j0 final o<? extends Model, ? extends Data> o) {
        this.a.i(clazz, clazz2, o);
        return this;
    }
    
    @j0
    public final j z(@j0 final List<String> list) {
        final ArrayList list2 = new ArrayList<Object>(list.size());
        list2.addAll(list);
        list2.add(0, "legacy_prepend_all");
        list2.add("legacy_append");
        this.c.f(list2);
        return this;
    }
    
    public static class a extends RuntimeException
    {
        public a(@j0 final String message) {
            super(message);
        }
    }
    
    public static final class b extends a
    {
        public b() {
            super("Failed to find image header parser.");
        }
    }
    
    public static class c extends a
    {
        public c(@j0 final Class<?> obj, @j0 final Class<?> obj2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders for model: ");
            sb.append(obj);
            sb.append(" and data: ");
            sb.append(obj2);
            super(sb.toString());
        }
        
        public c(@j0 final Object o) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders registered for model class: ");
            sb.append(o.getClass());
            super(sb.toString());
        }
        
        public <M> c(@j0 final M obj, @j0 final List<n<M, ?>> obj2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Found ModelLoaders for model class: ");
            sb.append(obj2);
            sb.append(", but none that handle this specific model instance: ");
            sb.append(obj);
            super(sb.toString());
        }
    }
    
    public static class d extends a
    {
        public d(@j0 final Class<?> obj) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to find result encoder for resource class: ");
            sb.append(obj);
            sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
            super(sb.toString());
        }
    }
    
    public static class e extends a
    {
        public e(@j0 final Class<?> obj) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to find source encoder for data class: ");
            sb.append(obj);
            super(sb.toString());
        }
    }
}
