// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.util.Iterator;
import java.util.Collection;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.io.IOException;
import com.google.firebase.encoders.d$b;
import java.lang.annotation.Annotation;
import com.google.firebase.encoders.g;
import java.io.OutputStream;
import java.util.Map;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.d;
import java.nio.charset.Charset;
import com.google.firebase.encoders.f;

final class c implements f
{
    private static final Charset f;
    private static final d g;
    private static final d h;
    private static final e<Map.Entry<Object, Object>> i;
    private OutputStream a;
    private final Map<Class<?>, e<?>> b;
    private final Map<Class<?>, g<?>> c;
    private final e<Object> d;
    private final com.google.android.gms.internal.firebase_messaging.g e;
    
    static {
        f = Charset.forName("UTF-8");
        final d$b a = d.a("key");
        final b0 b0 = new b0();
        b0.a(1);
        g = a.b((Annotation)b0.b()).a();
        final d$b a2 = d.a("value");
        final b0 b2 = new b0();
        b2.a(2);
        h = a2.b((Annotation)b2.b()).a();
        i = b.a;
    }
    
    c(final OutputStream a, final Map<Class<?>, e<?>> b, final Map<Class<?>, g<?>> c, final e<Object> d) {
        this.e = new com.google.android.gms.internal.firebase_messaging.g(this);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private static f0 A(final d d) {
        final f0 f0 = (f0)d.c((Class)f0.class);
        if (f0 != null) {
            return f0;
        }
        throw new com.google.firebase.encoders.c("Field has no @Protobuf config");
    }
    
    private final void B(int n) throws IOException {
        OutputStream a;
        while (true) {
            final long n2 = n & 0xFFFFFF80;
            a = this.a;
            if (n2 == 0L) {
                break;
            }
            a.write((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        a.write(n & 0x7F);
    }
    
    private final void C(long n) throws IOException {
        OutputStream a;
        while (true) {
            a = this.a;
            if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
                break;
            }
            a.write(((int)n & 0x7F) | 0x80);
            n >>>= 7;
        }
        a.write((int)n & 0x7F);
    }
    
    private final <T> c v(final e<T> e, final d d, final T t, final boolean b) throws IOException {
        final long w = this.w(e, t);
        if (b && w == 0L) {
            return this;
        }
        this.B(z(d) << 3 | 0x2);
        this.C(w);
        e.a((Object)t, (Object)this);
        return this;
    }
    
    private final <T> long w(final e<T> e, final T t) throws IOException {
        final c0 a = new c0();
        try {
            final OutputStream a2 = this.a;
            this.a = a;
            try {
                e.a((Object)t, (Object)this);
                this.a = a2;
                final long a3 = a.a();
                a.close();
                return a3;
            }
            finally {
                this.a = a2;
            }
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t2;
                z.a((Throwable)e, t2);
            }
        }
    }
    
    private final <T> c x(final g<T> g, final d d, final T t, final boolean b) throws IOException {
        this.e.a(d, b);
        g.a((Object)t, (Object)this.e);
        return this;
    }
    
    private static ByteBuffer y(final int capacity) {
        return ByteBuffer.allocate(capacity).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    private static int z(final d d) {
        final f0 f0 = (f0)d.c((Class)f0.class);
        if (f0 != null) {
            return f0.zza();
        }
        throw new com.google.firebase.encoders.c("Field has no @Protobuf config");
    }
    
    @j0
    public final f d(@j0 final d d, final float n) throws IOException {
        this.q(d, n, true);
        return (f)this;
    }
    
    @j0
    public final f e(@j0 final d d) throws IOException {
        throw new com.google.firebase.encoders.c("nested() is not implemented for protobuf encoding.");
    }
    
    @j0
    public final f f(@j0 final d d, final double n) throws IOException {
        this.p(d, n, true);
        return (f)this;
    }
    
    @j0
    public final f g(@k0 final Object o) throws IOException {
        this.t(o);
        return (f)this;
    }
    
    @j0
    public final f h(@j0 final String s, final boolean b) throws IOException {
        this.r(com.google.firebase.encoders.d.d(s), b ? 1 : 0, true);
        return (f)this;
    }
    
    @j0
    public final f i(@j0 final String s, final double n) throws IOException {
        this.p(com.google.firebase.encoders.d.d(s), n, true);
        return (f)this;
    }
    
    @j0
    public final f j(@j0 final String s, final long n) throws IOException {
        this.s(com.google.firebase.encoders.d.d(s), n, true);
        return (f)this;
    }
    
    @j0
    public final f k(@j0 final String s, final int n) throws IOException {
        this.r(com.google.firebase.encoders.d.d(s), n, true);
        return (f)this;
    }
    
    @j0
    public final f l(@j0 final String s, @k0 final Object o) throws IOException {
        this.o(com.google.firebase.encoders.d.d(s), o, true);
        return (f)this;
    }
    
    @j0
    public final f m(@j0 final String s) throws IOException {
        return this.e(com.google.firebase.encoders.d.d(s));
    }
    
    @j0
    public final f n(@j0 final d d, @k0 final Object o) throws IOException {
        this.o(d, o, true);
        return (f)this;
    }
    
    final f o(@j0 final d d, @k0 final Object o, final boolean b) throws IOException {
        if (o == null) {
            return (f)this;
        }
        if (o instanceof CharSequence) {
            final CharSequence charSequence = (CharSequence)o;
            if (b && charSequence.length() == 0) {
                return (f)this;
            }
            this.B(z(d) << 3 | 0x2);
            final byte[] bytes = charSequence.toString().getBytes(com.google.android.gms.internal.firebase_messaging.c.f);
            this.B(bytes.length);
            this.a.write(bytes);
            return (f)this;
        }
        else {
            if (o instanceof Collection) {
                final Iterator<Object> iterator = ((Collection)o).iterator();
                while (iterator.hasNext()) {
                    this.o(d, iterator.next(), false);
                }
                return (f)this;
            }
            if (o instanceof Map) {
                final Iterator iterator2 = ((Map)o).entrySet().iterator();
                while (iterator2.hasNext()) {
                    this.v(com.google.android.gms.internal.firebase_messaging.c.i, d, iterator2.next(), false);
                }
                return (f)this;
            }
            if (o instanceof Double) {
                this.p(d, (double)o, b);
                return (f)this;
            }
            if (o instanceof Float) {
                this.q(d, (float)o, b);
                return (f)this;
            }
            if (o instanceof Number) {
                this.s(d, ((Number)o).longValue(), b);
                return (f)this;
            }
            if (o instanceof Boolean) {
                this.r(d, ((boolean)o) ? 1 : 0, b);
                return (f)this;
            }
            if (o instanceof byte[]) {
                final byte[] b2 = (byte[])o;
                if (b && b2.length == 0) {
                    return (f)this;
                }
                this.B(z(d) << 3 | 0x2);
                this.B(b2.length);
                this.a.write(b2);
                return (f)this;
            }
            else {
                final e<?> e = this.b.get(o.getClass());
                if (e != null) {
                    this.v(e, d, o, b);
                    return (f)this;
                }
                final g<?> g = this.c.get(o.getClass());
                if (g != null) {
                    this.x(g, d, o, b);
                    return (f)this;
                }
                if (o instanceof d0) {
                    this.r(d, ((d0)o).q(), true);
                    return (f)this;
                }
                if (o instanceof Enum) {
                    this.r(d, ((Enum)o).ordinal(), true);
                    return (f)this;
                }
                this.v(this.d, d, o, b);
                return (f)this;
            }
        }
    }
    
    final f p(@j0 final d d, final double n, final boolean b) throws IOException {
        if (b && n == 0.0) {
            return (f)this;
        }
        this.B(z(d) << 3 | 0x1);
        this.a.write(y(8).putDouble(n).array());
        return (f)this;
    }
    
    final f q(@j0 final d d, final float n, final boolean b) throws IOException {
        if (b && n == 0.0f) {
            return (f)this;
        }
        this.B(z(d) << 3 | 0x5);
        this.a.write(y(4).putFloat(n).array());
        return (f)this;
    }
    
    final c r(@j0 final d d, final int n, final boolean b) throws IOException {
        if (b && n == 0) {
            return this;
        }
        final f0 a = A(d);
        final e0 g = e0.G;
        final int ordinal = a.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    this.B(a.zza() << 3 | 0x5);
                    this.a.write(y(4).putInt(n).array());
                }
            }
            else {
                this.B(a.zza() << 3);
                this.B(n + n ^ n >> 31);
            }
        }
        else {
            this.B(a.zza() << 3);
            this.B(n);
        }
        return this;
    }
    
    final c s(@j0 final d d, final long n, final boolean b) throws IOException {
        if (b && n == 0L) {
            return this;
        }
        final f0 a = A(d);
        final e0 g = e0.G;
        final int ordinal = a.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    this.B(a.zza() << 3 | 0x1);
                    this.a.write(y(8).putLong(n).array());
                }
            }
            else {
                this.B(a.zza() << 3);
                this.C(n >> 63 ^ n + n);
            }
        }
        else {
            this.B(a.zza() << 3);
            this.C(n);
        }
        return this;
    }
    
    final c t(@k0 final Object o) throws IOException {
        if (o == null) {
            return this;
        }
        final e<?> e = this.b.get(o.getClass());
        if (e != null) {
            e.a(o, (Object)this);
            return this;
        }
        final String value = String.valueOf(o.getClass());
        final StringBuilder sb = new StringBuilder(value.length() + 15);
        sb.append("No encoder for ");
        sb.append(value);
        throw new com.google.firebase.encoders.c(sb.toString());
    }
}
