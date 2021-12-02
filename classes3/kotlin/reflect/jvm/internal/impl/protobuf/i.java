// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.IOException;
import java.io.Serializable;

public abstract class i extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable
{
    protected i() {
    }
    
    protected i(final b b) {
    }
    
    static Method l(final Class clazz, String value, final Class... parameterTypes) {
        try {
            return clazz.getMethod(value, (Class[])parameterTypes);
        }
        catch (NoSuchMethodException cause) {
            final String name = clazz.getName();
            value = String.valueOf(value);
            final StringBuilder sb = new StringBuilder(name.length() + 45 + value.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(value);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), cause);
        }
    }
    
    static Object m(final Method method, final Object obj, final Object... args) {
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
    
    public static <ContainingType extends q, Type> g<ContainingType, Type> o(final ContainingType containingType, final q q, final j.b<?> b, final int n, final z.b b2, final boolean b3, final Class clazz) {
        return new g<ContainingType, Type>(containingType, (Type)Collections.emptyList(), q, new f(b, n, b2, true, b3), clazz);
    }
    
    public static <ContainingType extends q, Type> g<ContainingType, Type> p(final ContainingType containingType, final Type type, final q q, final j.b<?> b, final int n, final z.b b2, final Class clazz) {
        return new g<ContainingType, Type>(containingType, type, q, new f(b, n, b2, false, false), clazz);
    }
    
    private static <MessageType extends q> boolean r(final h<f> h, final MessageType messageType, final kotlin.reflect.jvm.internal.impl.protobuf.e e, final kotlin.reflect.jvm.internal.impl.protobuf.f f, final kotlin.reflect.jvm.internal.impl.protobuf.g g, int n) throws IOException {
        final int b = z.b(n);
        final g<MessageType, ?> b2 = g.b(messageType, z.a(n));
        boolean b3 = false;
        boolean b4 = false;
        Label_0103: {
            Label_0028: {
                if (b2 != null) {
                    if (b == h.l(b2.d.d1(), false)) {
                        b3 = false;
                        break Label_0028;
                    }
                    final f d = b2.d;
                    if (d.J && d.I.f() && b == h.l(b2.d.d1(), true)) {
                        b3 = false;
                        b4 = true;
                        break Label_0103;
                    }
                }
                b3 = true;
            }
            b4 = false;
        }
        if (b3) {
            return e.P(n, f);
        }
        if (b4) {
            final int j = e.j(e.A());
            if (b2.d.d1() == z.b.V) {
                while (e.e() > 0) {
                    n = e.n();
                    final Object a = b2.d.d().a(n);
                    if (a == null) {
                        return true;
                    }
                    h.a(b2.d, b2.f(a));
                }
            }
            else {
                while (e.e() > 0) {
                    h.a(b2.d, h.u(e, b2.d.d1(), false));
                }
            }
            e.i(j);
        }
        else {
            final int n2 = i$a.a[b2.d.s5().ordinal()];
            Object o;
            if (n2 != 1) {
                if (n2 != 2) {
                    o = h.u(e, b2.d.d1(), false);
                }
                else {
                    final int n3 = e.n();
                    o = b2.d.d().a(n3);
                    if (o == null) {
                        f.o0(n);
                        f.y0(n3);
                        return true;
                    }
                }
            }
            else {
                Object c;
                final Object o2 = c = null;
                if (!b2.d.D0()) {
                    final q q = (q)h.h(b2.d);
                    c = o2;
                    if (q != null) {
                        c = q.c();
                    }
                }
                q.a g2;
                if ((g2 = (q.a)c) == null) {
                    g2 = b2.c().g();
                }
                if (b2.d.d1() == z.b.R) {
                    e.r(b2.d(), g2, g);
                }
                else {
                    e.v(g2, g);
                }
                o = g2.h();
            }
            if (b2.d.D0()) {
                h.a(b2.d, b2.f(o));
            }
            else {
                h.v(b2.d, b2.f(o));
            }
        }
        return true;
    }
    
    @Override
    public s<? extends q> i() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
    
    protected void n() {
    }
    
    protected boolean q(final kotlin.reflect.jvm.internal.impl.protobuf.e e, final kotlin.reflect.jvm.internal.impl.protobuf.f f, final kotlin.reflect.jvm.internal.impl.protobuf.g g, final int n) throws IOException {
        return e.P(n, f);
    }
    
    public abstract static class b<MessageType extends i, BuilderType extends b> extends a<BuilderType>
    {
        private kotlin.reflect.jvm.internal.impl.protobuf.d G;
        
        protected b() {
            this.G = kotlin.reflect.jvm.internal.impl.protobuf.d.G;
        }
        
        public BuilderType n() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
        
        public abstract MessageType q();
        
        public final kotlin.reflect.jvm.internal.impl.protobuf.d r() {
            return this.G;
        }
        
        public abstract BuilderType s(final MessageType p0);
        
        public final BuilderType t(final kotlin.reflect.jvm.internal.impl.protobuf.d g) {
            this.G = g;
            return (BuilderType)this;
        }
    }
    
    public abstract static class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements e<MessageType>
    {
        private h<f> H;
        private boolean I;
        
        protected c() {
            this.H = h.g();
        }
        
        private h<f> v() {
            this.H.q();
            this.I = false;
            return this.H;
        }
        
        private void x() {
            if (!this.I) {
                this.H = this.H.b();
                this.I = true;
            }
        }
        
        public BuilderType w() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
        
        protected boolean y() {
            return this.H.n();
        }
        
        protected final void z(final MessageType messageType) {
            this.x();
            this.H.r(((d<d>)messageType).H);
        }
    }
    
    public abstract static class d<MessageType extends d<MessageType>> extends i implements e<MessageType>
    {
        private final h<f> H;
        
        protected d() {
            this.H = h.t();
        }
        
        protected d(final c<MessageType, ?> c) {
            this.H = (h<f>)((c<d, c>)c).v();
        }
        
        private void B(final g<MessageType, ?> g) {
            if (g.b() == this.b()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        
        @Override
        protected void n() {
            this.H.q();
        }
        
        @Override
        protected boolean q(final kotlin.reflect.jvm.internal.impl.protobuf.e e, final kotlin.reflect.jvm.internal.impl.protobuf.f f, final kotlin.reflect.jvm.internal.impl.protobuf.g g, final int n) throws IOException {
            return r(this.H, this.b(), e, f, g, n);
        }
        
        protected boolean t() {
            return this.H.n();
        }
        
        protected int u() {
            return this.H.k();
        }
        
        public final <Type> Type v(final g<MessageType, Type> g) {
            this.B(g);
            final Object h = this.H.h(g.d);
            if (h == null) {
                return g.b;
            }
            return (Type)g.a(h);
        }
        
        public final <Type> Type w(final g<MessageType, List<Type>> g, final int n) {
            this.B(g);
            return (Type)g.e(this.H.i(g.d, n));
        }
        
        public final <Type> int x(final g<MessageType, List<Type>> g) {
            this.B(g);
            return this.H.j(g.d);
        }
        
        public final <Type> boolean y(final g<MessageType, Type> g) {
            this.B(g);
            return this.H.m(g.d);
        }
        
        protected a z() {
            return new a(false);
        }
        
        protected class a
        {
            private final Iterator<Map.Entry<f, Object>> a;
            private Map.Entry<f, Object> b;
            private final boolean c;
            
            private a(final boolean c) {
                final Iterator<Map.Entry<f, Object>> p2 = (Iterator<Map.Entry<f, Object>>)i.d.this.H.p();
                this.a = p2;
                if (p2.hasNext()) {
                    this.b = p2.next();
                }
                this.c = c;
            }
            
            public void a(final int n, final kotlin.reflect.jvm.internal.impl.protobuf.f f) throws IOException {
                while (true) {
                    final Map.Entry<f, Object> b = this.b;
                    if (b == null || b.getKey().q() >= n) {
                        break;
                    }
                    final f f2 = this.b.getKey();
                    if (this.c && f2.s5() == z.c.P && !f2.D0()) {
                        f.f0(f2.q(), this.b.getValue());
                    }
                    else {
                        h.z((h.b<?>)f2, this.b.getValue(), f);
                    }
                    Map.Entry<f, Object> b2;
                    if (this.a.hasNext()) {
                        b2 = (Map.Entry<f, Object>)this.a.next();
                    }
                    else {
                        b2 = null;
                    }
                    this.b = b2;
                }
            }
        }
    }
    
    public interface e<MessageType extends d> extends r
    {
    }
    
    static final class f implements h.b<f>
    {
        final j.b<?> G;
        final int H;
        final z.b I;
        final boolean J;
        final boolean K;
        
        f(final j.b<?> g, final int h, final z.b i, final boolean j, final boolean k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        @Override
        public boolean D0() {
            return this.J;
        }
        
        public int b(final f f) {
            return this.H - f.H;
        }
        
        public j.b<?> d() {
            return this.G;
        }
        
        @Override
        public z.b d1() {
            return this.I;
        }
        
        @Override
        public q.a p0(final q.a a, final q q) {
            return ((i.b)a).s((i)q);
        }
        
        @Override
        public int q() {
            return this.H;
        }
        
        @Override
        public z.c s5() {
            return this.I.b();
        }
        
        @Override
        public boolean t5() {
            return this.K;
        }
    }
    
    public static class g<ContainingType extends q, Type>
    {
        final ContainingType a;
        final Type b;
        final q c;
        final f d;
        final Class e;
        final Method f;
        
        g(final ContainingType a, final Type b, final q c, final f d, final Class e) {
            if (a == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (d.d1() == z.b.S && c == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            Method l;
            if (j.a.class.isAssignableFrom(e)) {
                l = i.l(e, "valueOf", Integer.TYPE);
            }
            else {
                l = null;
            }
            this.f = l;
        }
        
        Object a(final Object o) {
            if (!this.d.D0()) {
                return this.e(o);
            }
            if (this.d.s5() == z.c.O) {
                final ArrayList<Object> list = new ArrayList<Object>();
                final Iterator<Object> iterator = ((List)o).iterator();
                while (iterator.hasNext()) {
                    list.add(this.e(iterator.next()));
                }
                return list;
            }
            return o;
        }
        
        public ContainingType b() {
            return this.a;
        }
        
        public q c() {
            return this.c;
        }
        
        public int d() {
            return this.d.q();
        }
        
        Object e(final Object o) {
            Object m = o;
            if (this.d.s5() == z.c.O) {
                m = i.m(this.f, null, (Integer)o);
            }
            return m;
        }
        
        Object f(final Object o) {
            Object value = o;
            if (this.d.s5() == z.c.O) {
                value = ((j.a)o).q();
            }
            return value;
        }
    }
}
