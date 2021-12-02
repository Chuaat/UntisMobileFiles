// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import okhttp3.c0;
import java.net.URL;
import java.util.ArrayList;
import okhttp3.h0;
import okhttp3.f0;
import java.util.Objects;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentHashMap;
import c6.h;
import java.util.concurrent.Executor;
import java.util.List;
import okhttp3.w;
import okhttp3.e;
import java.lang.reflect.Method;
import java.util.Map;

public final class u
{
    private final Map<Method, v<?>> a;
    final e.a b;
    final w c;
    final List<f.a> d;
    final List<c.a> e;
    @h
    final Executor f;
    final boolean g;
    
    u(final e.a b, final w c, final List<f.a> d, final List<c.a> e, @h final Executor f, final boolean g) {
        this.a = new ConcurrentHashMap<Method, v<?>>();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    private void p(final Class<?> clazz) {
        if (clazz.isInterface()) {
            final ArrayDeque<Object> c = new ArrayDeque<Object>(1);
            c.add(clazz);
            while (!c.isEmpty()) {
                final Class<?> clazz2 = c.removeFirst();
                if (clazz2.getTypeParameters().length != 0) {
                    final StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(clazz2.getName());
                    if (clazz2 != clazz) {
                        sb.append(" which is an interface of ");
                        sb.append(clazz.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(c, clazz2.getInterfaces());
            }
            if (this.g) {
                final q g = q.g();
                for (final Method method : clazz.getDeclaredMethods()) {
                    if (!g.i(method) && !Modifier.isStatic(method.getModifiers())) {
                        this.h(method);
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }
    
    public w a() {
        return this.c;
    }
    
    public c<?, ?> b(final Type type, final Annotation[] array) {
        return this.j(null, type, array);
    }
    
    public List<c.a> c() {
        return this.e;
    }
    
    public e.a d() {
        return this.b;
    }
    
    @h
    public Executor e() {
        return this.f;
    }
    
    public List<f.a> f() {
        return this.d;
    }
    
    public <T> T g(final Class<T> clazz) {
        this.p(clazz);
        return (T)Proxy.newProxyInstance(clazz.getClassLoader(), new Class[] { clazz }, new InvocationHandler() {
            private final q a = q.g();
            private final Object[] b = new Object[0];
            
            @h
            @Override
            public Object invoke(Object o, final Method method, @h Object[] b) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, b);
                }
                if (b == null) {
                    b = this.b;
                }
                if (this.a.i(method)) {
                    o = this.a.h(method, clazz, o, b);
                }
                else {
                    o = u.this.h(method).a(b);
                }
                return o;
            }
        });
    }
    
    v<?> h(final Method method) {
        final v<?> v = this.a.get(method);
        if (v != null) {
            return v;
        }
        synchronized (this.a) {
            v<?> b;
            if ((b = this.a.get(method)) == null) {
                b = retrofit2.v.b(this, method);
                this.a.put(method, b);
            }
            return b;
        }
    }
    
    public b i() {
        return new b(this);
    }
    
    public c<?, ?> j(@h final c.a a, final Type type, final Annotation[] obj) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(obj, "annotations == null");
        int i = this.e.indexOf(a) + 1;
        for (int size = this.e.size(), j = i; j < size; ++j) {
            final c<?, ?> a2 = this.e.get(j).a(type, obj, this);
            if (a2 != null) {
                return a2;
            }
        }
        final StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (a != null) {
            sb.append("  Skipped:");
            for (int k = 0; k < i; ++k) {
                sb.append("\n   * ");
                sb.append(this.e.get(k).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        while (i < this.e.size()) {
            sb.append("\n   * ");
            sb.append(this.e.get(i).getClass().getName());
            ++i;
        }
        throw new IllegalArgumentException(sb.toString());
    }
    
    public <T> f<T, f0> k(@h final f.a a, final Type type, final Annotation[] obj, final Annotation[] obj2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(obj, "parameterAnnotations == null");
        Objects.requireNonNull(obj2, "methodAnnotations == null");
        int i = this.d.indexOf(a) + 1;
        for (int size = this.d.size(), j = i; j < size; ++j) {
            final f<?, f0> c = this.d.get(j).c(type, obj, obj2, this);
            if (c != null) {
                return (f<T, f0>)c;
            }
        }
        final StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (a != null) {
            sb.append("  Skipped:");
            for (int k = 0; k < i; ++k) {
                sb.append("\n   * ");
                sb.append(this.d.get(k).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        while (i < this.d.size()) {
            sb.append("\n   * ");
            sb.append(this.d.get(i).getClass().getName());
            ++i;
        }
        throw new IllegalArgumentException(sb.toString());
    }
    
    public <T> f<h0, T> l(@h final f.a a, final Type type, final Annotation[] obj) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(obj, "annotations == null");
        int i = this.d.indexOf(a) + 1;
        for (int size = this.d.size(), j = i; j < size; ++j) {
            final f<h0, ?> d = this.d.get(j).d(type, obj, this);
            if (d != null) {
                return (f<h0, T>)d;
            }
        }
        final StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (a != null) {
            sb.append("  Skipped:");
            for (int k = 0; k < i; ++k) {
                sb.append("\n   * ");
                sb.append(this.d.get(k).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        while (i < this.d.size()) {
            sb.append("\n   * ");
            sb.append(this.d.get(i).getClass().getName());
            ++i;
        }
        throw new IllegalArgumentException(sb.toString());
    }
    
    public <T> f<T, f0> m(final Type type, final Annotation[] array, final Annotation[] array2) {
        return this.k(null, type, array, array2);
    }
    
    public <T> f<h0, T> n(final Type type, final Annotation[] array) {
        return this.l(null, type, array);
    }
    
    public <T> f<T, String> o(final Type obj, final Annotation[] obj2) {
        Objects.requireNonNull(obj, "type == null");
        Objects.requireNonNull(obj2, "annotations == null");
        for (int size = this.d.size(), i = 0; i < size; ++i) {
            final f<?, String> e = this.d.get(i).e(obj, obj2, this);
            if (e != null) {
                return (f<T, String>)e;
            }
        }
        return (f<T, String>)retrofit2.a.d.a;
    }
    
    public static final class b
    {
        private final q a;
        @h
        private e.a b;
        @h
        private w c;
        private final List<f.a> d;
        private final List<c.a> e;
        @h
        private Executor f;
        private boolean g;
        
        public b() {
            this(q.g());
        }
        
        b(final q a) {
            this.d = new ArrayList<f.a>();
            this.e = new ArrayList<c.a>();
            this.a = a;
        }
        
        b(final u u) {
            this.d = new ArrayList<f.a>();
            this.e = new ArrayList<c.a>();
            final q g = q.g();
            this.a = g;
            this.b = u.b;
            this.c = u.c;
            for (int size = u.d.size(), e = g.e(), i = 1; i < size - e; ++i) {
                this.d.add(u.d.get(i));
            }
            for (int j = 0; j < u.e.size() - this.a.b(); ++j) {
                this.e.add(u.e.get(j));
            }
            this.f = u.f;
            this.g = u.g;
        }
        
        public b a(final c.a obj) {
            final List<c.a> e = this.e;
            Objects.requireNonNull(obj, "factory == null");
            e.add(obj);
            return this;
        }
        
        public b b(final f.a obj) {
            final List<f.a> d = this.d;
            Objects.requireNonNull(obj, "factory == null");
            d.add(obj);
            return this;
        }
        
        public b c(final String obj) {
            Objects.requireNonNull(obj, "baseUrl == null");
            return this.e(w.C(obj));
        }
        
        public b d(final URL obj) {
            Objects.requireNonNull(obj, "baseUrl == null");
            return this.e(w.C(obj.toString()));
        }
        
        public b e(final w obj) {
            Objects.requireNonNull(obj, "baseUrl == null");
            final List<String> l = obj.L();
            if ("".equals(l.get(l.size() - 1))) {
                this.c = obj;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("baseUrl must end in /: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public u f() {
            if (this.c != null) {
                e.a b;
                if ((b = this.b) == null) {
                    b = new c0();
                }
                Executor executor;
                if ((executor = this.f) == null) {
                    executor = this.a.c();
                }
                final ArrayList<c.a> list = new ArrayList<c.a>(this.e);
                list.addAll((Collection<?>)this.a.a(executor));
                final ArrayList<f.a> list2 = new ArrayList<f.a>(this.d.size() + 1 + this.a.e());
                list2.add(new a());
                list2.addAll((Collection<?>)this.d);
                list2.addAll((Collection<?>)this.a.d());
                return new u(b, this.c, (List<f.a>)Collections.unmodifiableList((List<?>)list2), Collections.unmodifiableList((List<? extends c.a>)list), executor, this.g);
            }
            throw new IllegalStateException("Base URL required.");
        }
        
        public List<c.a> g() {
            return this.e;
        }
        
        public b h(final e.a obj) {
            Objects.requireNonNull(obj, "factory == null");
            this.b = obj;
            return this;
        }
        
        public b i(final Executor obj) {
            Objects.requireNonNull(obj, "executor == null");
            this.f = obj;
            return this;
        }
        
        public b j(final c0 obj) {
            Objects.requireNonNull(obj, "client == null");
            return this.h(obj);
        }
        
        public List<f.a> k() {
            return this.d;
        }
        
        public b l(final boolean g) {
            this.g = g;
            return this;
        }
    }
}
