// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public abstract class p6<MessageType extends p6<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends r4<MessageType, BuilderType>
{
    private static Map<Object, p6<?, ?>> zzd;
    protected n9 zzb;
    private int zzc;
    
    static {
        p6.zzd = new ConcurrentHashMap<Object, p6<?, ?>>();
    }
    
    public p6() {
        this.zzb = n9.a();
        this.zzc = -1;
    }
    
    private static <MessageType extends c<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>, T> e<MessageType, T> A(final z5<MessageType, T> z5) {
        return (e<MessageType, T>)z5;
    }
    
    protected static x6 D() {
        return (x6)r6.i();
    }
    
    protected static <E> z6<E> E() {
        return (z6<E>)r8.i();
    }
    
    public static <ContainingType extends z7, Type> e<ContainingType, Type> h(final ContainingType containingType, final z7 z7, final v6<?> v6, final int n, final ca ca, final boolean b, final Class clazz) {
        return new e<ContainingType, Type>(containingType, (Type)Collections.emptyList(), z7, new f(null, 202056002, ca, true, false), clazz);
    }
    
    private static <T extends p6<T, ?>> T k(final T t) throws y6 {
        if (t != null && !t.i()) {
            throw new y6(new l9(t).getMessage()).b(t);
        }
        return t;
    }
    
    protected static <T extends p6<T, ?>> T p(final T t, final byte[] array) throws y6 {
        return k((T)r((T)t, array, 0, array.length, b6.d()));
    }
    
    private static <T extends p6<T, ?>> T r(T t, final byte[] array, final int n, final int n2, final b6 b6) throws y6 {
        t = (T)t.v(g.d, null, null);
        try {
            final s8<T> c = n8.a().c(t);
            c.i(t, array, 0, n2, new z4(b6));
            c.b(t);
            if (t.zza == 0) {
                return t;
            }
            throw new RuntimeException();
        }
        catch (IndexOutOfBoundsException ex2) {
            throw y6.a().b(t);
        }
        catch (IOException ex) {
            if (ex.getCause() instanceof y6) {
                throw (y6)ex.getCause();
            }
            throw new y6(ex.getMessage()).b(t);
        }
    }
    
    protected static <T extends p6<T, ?>> T s(final T t, final byte[] array, final b6 b6) throws y6 {
        return k((T)r((T)t, array, 0, array.length, b6));
    }
    
    static <T extends p6<?, ?>> T t(final Class<T> clazz) {
        p6<?, ?> p;
        if ((p = p6.zzd.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                p = p6.zzd.get(clazz);
            }
            catch (ClassNotFoundException cause) {
                throw new IllegalStateException("Class initialization cannot fail.", cause);
            }
        }
        p6<?, ?> p2;
        if ((p2 = p) == null) {
            p2 = (p6<?, ?>)r9.c(clazz).v(g.f, null, null);
            if (p2 == null) {
                throw new IllegalStateException();
            }
            p6.zzd.put(clazz, p2);
        }
        return (T)p2;
    }
    
    protected static <E> z6<E> u(final z6<E> z6) {
        final int size = z6.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size << 1;
        }
        return z6.d(n);
    }
    
    protected static Object w(final z7 z7, final String s, final Object[] array) {
        return new q8(z7, s, array);
    }
    
    static Object x(final Method method, final Object obj, final Object... args) {
        try {
            return method.invoke(obj, args);
        }
        catch (InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
        catch (IllegalAccessException cause2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", cause2);
        }
    }
    
    protected static <T extends p6<?, ?>> void y(final Class<T> clazz, final T t) {
        p6.zzd.put(clazz, t);
    }
    
    protected static final <T extends p6<T, ?>> boolean z(final T t, final boolean b) {
        final byte byteValue = (byte)t.v(g.a, null, null);
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        final boolean e = n8.a().c(t).e(t);
        if (b) {
            final int b2 = g.b;
            p6<T, ?> p2;
            if (e) {
                p2 = t;
            }
            else {
                p2 = null;
            }
            t.v(b2, p2, null);
        }
        return e;
    }
    
    protected final <MessageType extends p6<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType B() {
        return (BuilderType)this.v(g.e, null, null);
    }
    
    public final BuilderType C() {
        final b b = (b)this.v(g.e, null, null);
        b.g(this);
        return (BuilderType)b;
    }
    
    @Override
    public final void a(final v5 v5) throws IOException {
        n8.a().c(this).g(this, y5.O(v5));
    }
    
    @Override
    final void c(final int zzc) {
        this.zzc = zzc;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && n8.a().c(this).f(this, (p6)o));
    }
    
    @Override
    final int f() {
        return this.zzc;
    }
    
    @Override
    public int hashCode() {
        final int zza = super.zza;
        if (zza != 0) {
            return zza;
        }
        return super.zza = n8.a().c(this).a(this);
    }
    
    @Override
    public final boolean i() {
        return z(this, true);
    }
    
    @Override
    public final /* synthetic */ z7 l() {
        return (p6)this.v(g.f, null, null);
    }
    
    @Override
    public final int q() {
        if (this.zzc == -1) {
            this.zzc = n8.a().c(this).c(this);
        }
        return this.zzc;
    }
    
    @Override
    public String toString() {
        return e8.a(this, super.toString());
    }
    
    protected abstract Object v(final int p0, final Object p1, final Object p2);
    
    protected static final class a<T extends p6<T, ?>> extends s4<T>
    {
        private final T b;
        
        public a(final T b) {
            this.b = b;
        }
    }
    
    public static class b<MessageType extends p6<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends q4<MessageType, BuilderType>
    {
        private final MessageType G;
        protected MessageType H;
        protected boolean I;
        
        protected b(final MessageType g) {
            this.G = g;
            this.H = (MessageType)g.v(g.d, null, null);
            this.I = false;
        }
        
        private static void r(final MessageType messageType, final MessageType messageType2) {
            n8.a().c(messageType).d(messageType, messageType2);
        }
        
        private final BuilderType s(final s5 s5, final b6 b6) throws IOException {
            if (this.I) {
                this.u();
                this.I = false;
            }
            try {
                n8.a().c(this.H).h(this.H, t5.Q(s5), b6);
                return (BuilderType)this;
            }
            catch (RuntimeException ex) {
                if (ex.getCause() instanceof IOException) {
                    throw (IOException)ex.getCause();
                }
                throw ex;
            }
        }
        
        private final BuilderType t(final byte[] array, final int n, final int n2, final b6 b6) throws y6 {
            if (this.I) {
                this.u();
                this.I = false;
            }
            try {
                n8.a().c(this.H).i(this.H, array, 0, n2, new z4(b6));
                return (BuilderType)this;
            }
            catch (IOException cause) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", cause);
            }
            catch (IndexOutOfBoundsException ex) {
                throw y6.a();
            }
            catch (y6 y6) {
                throw y6;
            }
        }
        
        @Override
        public /* synthetic */ z7 e() {
            return this.v();
        }
        
        public final BuilderType g(final MessageType messageType) {
            if (this.I) {
                this.u();
                this.I = false;
            }
            r(this.H, messageType);
            return (BuilderType)this;
        }
        
        @Override
        public final boolean i() {
            return p6.z(this.H, false);
        }
        
        protected void u() {
            final p6 h = (p6)this.H.v(g.d, null, null);
            r((MessageType)h, this.H);
            this.H = (MessageType)h;
        }
        
        public MessageType v() {
            if (this.I) {
                return this.H;
            }
            final p6<MessageType, BuilderType> h = this.H;
            n8.a().c(h).b(h);
            this.I = true;
            return this.H;
        }
        
        public final MessageType w() {
            final p6 p6 = (p6)this.e();
            if (p6.i()) {
                return (MessageType)p6;
            }
            throw new l9(p6);
        }
    }
    
    public abstract static class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends p6<MessageType, BuilderType> implements b8
    {
        protected h6<f> zzc;
        
        public c() {
            this.zzc = h6.c();
        }
        
        final h6<f> F() {
            if (this.zzc.o()) {
                this.zzc = (h6<f>)this.zzc.clone();
            }
            return this.zzc;
        }
        
        public final <Type> Type G(final z5<MessageType, Type> z5) {
            final e g = A((z5<c, Object>)z5);
            if (g.a != this.l()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            final Object d = this.zzc.d(g.d);
            if (d == null) {
                return (Type)g.b;
            }
            final f d2 = g.d;
            if (!d2.J) {
                return (Type)g.a(d);
            }
            if (d2.I.b() == fa.O) {
                final ArrayList<Object> list = new ArrayList<Object>();
                final Iterator<Object> iterator = ((List<Object>)d).iterator();
                while (iterator.hasNext()) {
                    list.add(g.a(iterator.next()));
                }
                return (Type)list;
            }
            return (Type)d;
        }
    }
    
    public static class d<MessageType extends c<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements b8
    {
        protected d(final MessageType messageType) {
            super(messageType);
        }
        
        @Override
        protected void u() {
            super.u();
            final c<MessageType, BuilderType> h = (c<MessageType, BuilderType>)super.H;
            h.zzc = (h6<f>)h.zzc.clone();
        }
    }
    
    public static final class e<ContainingType extends z7, Type> extends z5<ContainingType, Type>
    {
        final ContainingType a;
        final Type b;
        final z7 c;
        final f d;
        
        e(final ContainingType a, final Type b, final z7 c, final f d, final Class clazz) {
            if (a == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (d.I == ca.S && c == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        final Object a(final Object o) {
            if (this.d.I.b() != fa.O) {
                return o;
            }
            (int)o;
            throw null;
        }
    }
    
    static final class f implements j6<f>
    {
        final v6<?> G;
        final int H;
        final ca I;
        final boolean J;
        final boolean K;
        
        f(final v6<?> v6, final int n, final ca i, final boolean b, final boolean b2) {
            this.G = null;
            this.H = 202056002;
            this.I = i;
            this.J = true;
            this.K = false;
        }
        
        @Override
        public final fa a() {
            return this.I.b();
        }
        
        @Override
        public final boolean c() {
            return this.J;
        }
        
        @Override
        public final boolean e() {
            return false;
        }
        
        @Override
        public final c8 r5(final c8 c8, final z7 z7) {
            return ((b)c8).g((p6)z7);
        }
        
        @Override
        public final i8 s3(final i8 i8, final i8 i9) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final int zza() {
            return this.H;
        }
        
        @Override
        public final ca zzb() {
            return this.I;
        }
    }
    
    public enum g
    {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h;
        
        static {
            h = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        }
        
        public static int[] a() {
            return p6.g.h.clone();
        }
    }
}
