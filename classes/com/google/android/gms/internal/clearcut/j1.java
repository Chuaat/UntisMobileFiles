// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public abstract class j1<MessageType extends j1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends t<MessageType, BuilderType>
{
    private static Map<Object, j1<?, ?>> zzjr;
    protected d4 zzjp;
    private int zzjq;
    
    static {
        j1.zzjr = new ConcurrentHashMap<Object, j1<?, ?>>();
    }
    
    public j1() {
        this.zzjp = d4.h();
        this.zzjq = -1;
    }
    
    public static <ContainingType extends s2, Type> f<ContainingType, Type> i(final ContainingType containingType, final Type type, final s2 s2, final n1<?> n1, final int n2, final r4 r4, final Class clazz) {
        return new f<ContainingType, Type>(containingType, type, s2, new e(null, 66321687, r4, false, false), clazz);
    }
    
    private static <T extends j1<T, ?>> T j(T t, final byte[] array) throws r1 {
        t = (T)t.k(g.d, null, null);
        try {
            f3.a().d(t).f(t, array, 0, array.length, new z());
            f3.a().d(t).b(t);
            if (t.zzex == 0) {
                return t;
            }
            throw new RuntimeException();
        }
        catch (IndexOutOfBoundsException ex2) {
            throw r1.a().f(t);
        }
        catch (IOException ex) {
            if (ex.getCause() instanceof r1) {
                throw (r1)ex.getCause();
            }
            throw new r1(ex.getMessage()).f(t);
        }
    }
    
    protected static Object m(final s2 s2, final String s3, final Object[] array) {
        return new h3(s2, s3, array);
    }
    
    static Object n(final Method method, final Object obj, final Object... args) {
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
    
    protected static <T extends j1<?, ?>> void o(final Class<T> clazz, final T t) {
        j1.zzjr.put(clazz, t);
    }
    
    protected static final <T extends j1<T, ?>> boolean p(final T t, final boolean b) {
        final byte byteValue = (byte)t.k(g.a, null, null);
        return byteValue == 1 || (byteValue != 0 && f3.a().d(t).h(t));
    }
    
    protected static o1 q() {
        return (o1)k1.i();
    }
    
    protected static <T extends j1<T, ?>> T r(final T t, final byte[] array) throws r1 {
        final j1 j = j((j1)t, array);
        if (j != null) {
            final byte byteValue = (byte)j.k(g.a, null, null);
            boolean h = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    h = false;
                }
                else {
                    h = f3.a().d(j).h((T)j);
                    final int b = g.b;
                    j1<T, ?> j2;
                    if (h) {
                        j2 = (j1<T, ?>)j;
                    }
                    else {
                        j2 = null;
                    }
                    j.k(b, j2, null);
                }
            }
            if (!h) {
                throw new r1(new b4(j).getMessage()).f(j);
            }
        }
        return (T)j;
    }
    
    protected static p1 s() {
        return (p1)g2.h();
    }
    
    protected static <E> q1<E> t() {
        return (q1<E>)g3.f();
    }
    
    static <T extends j1<?, ?>> T u(final Class<T> clazz) {
        j1<?, ?> j1;
        if ((j1 = com.google.android.gms.internal.clearcut.j1.zzjr.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                j1 = com.google.android.gms.internal.clearcut.j1.zzjr.get(clazz);
            }
            catch (ClassNotFoundException cause) {
                throw new IllegalStateException("Class initialization cannot fail.", cause);
            }
        }
        if (j1 == null) {
            final String name = clazz.getName();
            String concat;
            if (name.length() != 0) {
                concat = "Unable to get default instance for: ".concat(name);
            }
            else {
                concat = new String("Unable to get default instance for: ");
            }
            throw new IllegalStateException(concat);
        }
        return (T)j1;
    }
    
    @Override
    public final boolean a() {
        final byte byteValue = (byte)this.k(g.a, null, null);
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        final boolean h = f3.a().d(this).h(this);
        final int b = g.b;
        j1 j1;
        if (h) {
            j1 = this;
        }
        else {
            j1 = null;
        }
        this.k(b, j1, null);
        return h;
    }
    
    @Override
    public final void c(final p0 p) throws IOException {
        f3.a().b(this.getClass()).c((j1)this, (x4)r0.a(p));
    }
    
    @Override
    final void e(final int zzjq) {
        this.zzjq = zzjq;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (((j1)this.k(g.f, null, null)).getClass().isInstance(o) && f3.a().d(this).g(this, (j1)o));
    }
    
    @Override
    public final int f() {
        if (this.zzjq == -1) {
            this.zzjq = f3.a().d(this).e(this);
        }
        return this.zzjq;
    }
    
    @Override
    final int h() {
        return this.zzjq;
    }
    
    @Override
    public int hashCode() {
        final int zzex = super.zzex;
        if (zzex != 0) {
            return zzex;
        }
        return super.zzex = f3.a().d(this).i(this);
    }
    
    protected abstract Object k(final int p0, final Object p1, final Object p2);
    
    @Override
    public String toString() {
        return v2.a(this, super.toString());
    }
    
    public static class a<MessageType extends j1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends u<MessageType, BuilderType>
    {
        private final MessageType G;
        protected MessageType H;
        protected boolean I;
        
        protected a(final MessageType g) {
            this.G = g;
            this.H = (MessageType)g.k(g.d, null, null);
            this.I = false;
        }
        
        private static void n(final MessageType messageType, final MessageType messageType2) {
            f3.a().d(messageType).d(messageType, messageType2);
        }
        
        @Override
        public final boolean a() {
            return j1.p(this.H, false);
        }
        
        @Override
        public /* synthetic */ s2 i3() {
            return this.r();
        }
        
        public final BuilderType m(final MessageType messageType) {
            this.q();
            n(this.H, messageType);
            return (BuilderType)this;
        }
        
        protected void q() {
            if (this.I) {
                final j1 h = (j1)this.H.k(g.d, null, null);
                n((MessageType)h, this.H);
                this.H = (MessageType)h;
                this.I = false;
            }
        }
        
        public MessageType r() {
            if (this.I) {
                return this.H;
            }
            final j1<MessageType, BuilderType> h = this.H;
            f3.a().d(h).b(h);
            this.I = true;
            return this.H;
        }
        
        public final MessageType s() {
            final j1 j1 = (j1)this.i3();
            final byte byteValue = (byte)j1.k(g.a, null, null);
            boolean h = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    h = false;
                }
                else {
                    h = f3.a().d(j1).h((MessageType)j1);
                    final int b = g.b;
                    j1<MessageType, BuilderType> j2;
                    if (h) {
                        j2 = (j1<MessageType, BuilderType>)j1;
                    }
                    else {
                        j2 = null;
                    }
                    j1.k(b, j2, null);
                }
            }
            if (h) {
                return (MessageType)j1;
            }
            throw new b4(j1);
        }
    }
    
    public static final class b<T extends j1<T, ?>> extends v<T>
    {
        private T b;
        
        public b(final T b) {
            this.b = b;
        }
    }
    
    public static class c<MessageType extends d<MessageType, BuilderType>, BuilderType extends c<MessageType, BuilderType>> extends a<MessageType, BuilderType> implements u2
    {
        protected c(final MessageType messageType) {
            super(messageType);
        }
        
        @Override
        protected final void q() {
            if (!super.I) {
                return;
            }
            super.q();
            final d<MessageType, BuilderType> h = (d<MessageType, BuilderType>)super.H;
            h.zzjv = (a1<e>)h.zzjv.clone();
        }
    }
    
    public abstract static class d<MessageType extends d<MessageType, BuilderType>, BuilderType extends c<MessageType, BuilderType>> extends j1<MessageType, BuilderType> implements u2
    {
        protected a1<e> zzjv;
        
        public d() {
            this.zzjv = a1.l();
        }
    }
    
    static final class e implements d1<e>
    {
        private final n1<?> G;
        final int H;
        final r4 I;
        final boolean J;
        final boolean K;
        
        e(final n1<?> n1, final int n2, final r4 i, final boolean b, final boolean b2) {
            this.G = null;
            this.H = 66321687;
            this.I = i;
            this.J = false;
            this.K = false;
        }
        
        @Override
        public final w4 F() {
            return this.I.b();
        }
        
        @Override
        public final boolean L() {
            return false;
        }
        
        @Override
        public final t2 L0(final t2 t2, final s2 s2) {
            return ((a)t2).m((j1)s2);
        }
        
        @Override
        public final r4 X() {
            return this.I;
        }
        
        @Override
        public final int a() {
            return this.H;
        }
        
        @Override
        public final boolean a1() {
            return false;
        }
        
        @Override
        public final z2 u4(final z2 z2, final z2 z3) {
            throw new UnsupportedOperationException();
        }
    }
    
    public static final class f<ContainingType extends s2, Type> extends t0<ContainingType, Type>
    {
        private final ContainingType a;
        private final Type b;
        private final s2 c;
        private final e d;
        
        f(final ContainingType a, final Type b, final s2 c, final e d, final Class clazz) {
            if (a == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (d.I == r4.S && c == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
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
        public static final int i = 1;
        public static final int j = 2;
        public static final int l = 1;
        public static final int m = 2;
        
        static {
            h = new int[] { 1, 2, 3, 4, 5, 6, 7 };
            k = new int[] { 1, 2 };
            n = new int[] { 1, 2 };
        }
        
        public static int[] a() {
            return j1.g.h.clone();
        }
    }
}
