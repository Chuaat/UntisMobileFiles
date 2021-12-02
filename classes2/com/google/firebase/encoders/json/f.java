// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.encoders.json;

import java.util.Iterator;
import com.google.firebase.encoders.d;
import android.util.Base64;
import com.google.firebase.encoders.c;
import java.io.IOException;
import androidx.annotation.k0;
import java.util.Date;
import java.util.Collection;
import androidx.annotation.j0;
import java.io.Writer;
import com.google.firebase.encoders.g;
import com.google.firebase.encoders.e;
import java.util.Map;
import android.util.JsonWriter;
import com.google.firebase.encoders.h;

final class f implements com.google.firebase.encoders.f, h
{
    private f a;
    private boolean b;
    private final JsonWriter c;
    private final Map<Class<?>, e<?>> d;
    private final Map<Class<?>, g<?>> e;
    private final e<Object> f;
    private final boolean g;
    
    private f(final f f) {
        this.a = null;
        this.b = true;
        this.c = f.c;
        this.d = f.d;
        this.e = f.e;
        this.f = f.f;
        this.g = f.g;
    }
    
    f(@j0 final Writer writer, @j0 final Map<Class<?>, e<?>> d, @j0 final Map<Class<?>, g<?>> e, final e<Object> f, final boolean g) {
        this.a = null;
        this.b = true;
        this.c = new JsonWriter(writer);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    private boolean B(final Object o) {
        return o == null || o.getClass().isArray() || o instanceof Collection || o instanceof Date || o instanceof Enum || o instanceof Number;
    }
    
    private f E(@j0 final String s, @k0 final Object o) throws IOException, c {
        this.G();
        this.c.name(s);
        if (o == null) {
            this.c.nullValue();
            return this;
        }
        return this.s(o, false);
    }
    
    private f F(@j0 final String s, @k0 final Object o) throws IOException, c {
        if (o == null) {
            return this;
        }
        this.G();
        this.c.name(s);
        return this.s(o, false);
    }
    
    private void G() throws IOException {
        if (this.b) {
            final f a = this.a;
            if (a != null) {
                a.G();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
    
    @j0
    public f A(@k0 final byte[] array) throws IOException {
        this.G();
        if (array == null) {
            this.c.nullValue();
        }
        else {
            this.c.value(Base64.encodeToString(array, 2));
        }
        return this;
    }
    
    void C() throws IOException {
        this.G();
        this.c.flush();
    }
    
    f D(final e<Object> e, final Object o, final boolean b) throws IOException {
        if (!b) {
            this.c.beginObject();
        }
        e.a(o, this);
        if (!b) {
            this.c.endObject();
        }
        return this;
    }
    
    @j0
    @Override
    public com.google.firebase.encoders.f a(@j0 final d d, final boolean b) throws IOException {
        return this.y(d.b(), b);
    }
    
    @j0
    @Override
    public com.google.firebase.encoders.f b(@j0 final d d, final long n) throws IOException {
        return this.w(d.b(), n);
    }
    
    @j0
    @Override
    public com.google.firebase.encoders.f c(@j0 final d d, final int n) throws IOException {
        return this.v(d.b(), n);
    }
    
    @j0
    @Override
    public com.google.firebase.encoders.f d(@j0 final d d, final float n) throws IOException {
        return this.u(d.b(), n);
    }
    
    @j0
    @Override
    public com.google.firebase.encoders.f e(@j0 final d d) throws IOException {
        return this.m(d.b());
    }
    
    @j0
    @Override
    public com.google.firebase.encoders.f f(@j0 final d d, final double n) throws IOException {
        return this.u(d.b(), n);
    }
    
    @j0
    @Override
    public com.google.firebase.encoders.f g(@k0 final Object o) throws IOException {
        return this.s(o, true);
    }
    
    @j0
    @Override
    public com.google.firebase.encoders.f m(@j0 final String s) throws IOException {
        this.G();
        this.a = new f(this);
        this.c.name(s);
        this.c.beginObject();
        return this.a;
    }
    
    @j0
    @Override
    public com.google.firebase.encoders.f n(@j0 final d d, @k0 final Object o) throws IOException {
        return this.x(d.b(), o);
    }
    
    @j0
    public f o(final double n) throws IOException {
        this.G();
        this.c.value(n);
        return this;
    }
    
    @j0
    public f p(final float n) throws IOException {
        this.G();
        this.c.value((double)n);
        return this;
    }
    
    @j0
    public f q(final int n) throws IOException {
        this.G();
        this.c.value((long)n);
        return this;
    }
    
    @j0
    public f r(final long n) throws IOException {
        this.G();
        this.c.value(n);
        return this;
    }
    
    @j0
    f s(@k0 Object key, final boolean b) throws IOException {
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        if (b && this.B(key)) {
            Object class1;
            if (key == null) {
                class1 = null;
            }
            else {
                class1 = key.getClass();
            }
            throw new c(String.format("%s cannot be encoded inline", class1));
        }
        if (key == null) {
            this.c.nullValue();
            return this;
        }
        if (key instanceof Number) {
            this.c.value((Number)key);
            return this;
        }
        if (key.getClass().isArray()) {
            if (key instanceof byte[]) {
                return this.A((byte[])key);
            }
            this.c.beginArray();
            if (key instanceof int[]) {
                for (int[] array = (int[])key; i < array.length; ++i) {
                    this.c.value((long)array[i]);
                }
            }
            else if (key instanceof long[]) {
                final long[] array2 = (long[])key;
                for (int length = array2.length, j = n; j < length; ++j) {
                    this.r(array2[j]);
                }
            }
            else if (key instanceof double[]) {
                final double[] array3 = (double[])key;
                for (int length2 = array3.length, k = n2; k < length2; ++k) {
                    this.c.value(array3[k]);
                }
            }
            else if (key instanceof boolean[]) {
                final boolean[] array4 = (boolean[])key;
                for (int length3 = array4.length, l = n3; l < length3; ++l) {
                    this.c.value(array4[l]);
                }
            }
            else if (key instanceof Number[]) {
                final Number[] array5 = (Number[])key;
                for (int length4 = array5.length, n4 = 0; n4 < length4; ++n4) {
                    this.s(array5[n4], false);
                }
            }
            else {
                final Object[] array6 = (Object[])key;
                for (int length5 = array6.length, n5 = 0; n5 < length5; ++n5) {
                    this.s(array6[n5], false);
                }
            }
            this.c.endArray();
            return this;
        }
        else {
            if (key instanceof Collection) {
                final Collection collection = (Collection)key;
                this.c.beginArray();
                final Iterator<Object> iterator = collection.iterator();
                while (iterator.hasNext()) {
                    this.s(iterator.next(), false);
                }
                this.c.endArray();
                return this;
            }
            if (key instanceof Map) {
                final Map map = (Map)key;
                this.c.beginObject();
                for (final Map.Entry<Object, V> entry : map.entrySet()) {
                    key = entry.getKey();
                    try {
                        this.x((String)key, entry.getValue());
                        continue;
                    }
                    catch (ClassCastException ex) {
                        throw new c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), ex);
                    }
                    break;
                }
                this.c.endObject();
                return this;
            }
            final e<?> e = this.d.get(key.getClass());
            if (e != null) {
                return this.D((e<Object>)e, key, b);
            }
            final g<?> g = this.e.get(key.getClass());
            if (g != null) {
                g.a(key, this);
                return this;
            }
            if (key instanceof Enum) {
                this.t(((Enum)key).name());
                return this;
            }
            return this.D(this.f, key, b);
        }
    }
    
    @j0
    public f t(@k0 final String s) throws IOException {
        this.G();
        this.c.value(s);
        return this;
    }
    
    @j0
    public f u(@j0 final String s, final double n) throws IOException {
        this.G();
        this.c.name(s);
        return this.o(n);
    }
    
    @j0
    public f v(@j0 final String s, final int n) throws IOException {
        this.G();
        this.c.name(s);
        return this.q(n);
    }
    
    @j0
    public f w(@j0 final String s, final long n) throws IOException {
        this.G();
        this.c.name(s);
        return this.r(n);
    }
    
    @j0
    public f x(@j0 final String s, @k0 final Object o) throws IOException {
        if (this.g) {
            return this.F(s, o);
        }
        return this.E(s, o);
    }
    
    @j0
    public f y(@j0 final String s, final boolean b) throws IOException {
        this.G();
        this.c.name(s);
        return this.z(b);
    }
    
    @j0
    public f z(final boolean b) throws IOException {
        this.G();
        this.c.value(b);
        return this;
    }
}
