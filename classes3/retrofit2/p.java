// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import okhttp3.z;
import okhttp3.v;
import java.util.Map;
import java.util.Objects;
import okhttp3.f0;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.lang.reflect.Array;
import java.io.IOException;
import c6.h;

abstract class p<T>
{
    abstract void a(final r p0, @c6.h final T p1) throws IOException;
    
    final p<Object> b() {
        return new p<Object>() {
            @Override
            void a(final r r, @c6.h final Object o) throws IOException {
                if (o == null) {
                    return;
                }
                for (int i = 0; i < Array.getLength(o); ++i) {
                    p.this.a(r, Array.get(o, i));
                }
            }
        };
    }
    
    final p<Iterable<T>> c() {
        return new p<Iterable<T>>() {
            void d(final r r, @c6.h final Iterable<T> iterable) throws IOException {
                if (iterable == null) {
                    return;
                }
                final Iterator<T> iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    p.this.a(r, iterator.next());
                }
            }
        };
    }
    
    static final class c<T> extends p<T>
    {
        private final Method a;
        private final int b;
        private final retrofit2.f<T, f0> c;
        
        c(final Method a, final int b, final retrofit2.f<T, f0> c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        void a(final r r, @c6.h final T obj) {
            if (obj != null) {
                try {
                    r.l(this.c.a(obj));
                    return;
                }
                catch (IOException ex) {
                    final Method a = this.a;
                    final int b = this.b;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(obj);
                    sb.append(" to RequestBody");
                    throw y.p(a, ex, b, sb.toString(), new Object[0]);
                }
            }
            throw y.o(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
        }
    }
    
    static final class d<T> extends p<T>
    {
        private final String a;
        private final retrofit2.f<T, String> b;
        private final boolean c;
        
        d(final String obj, final retrofit2.f<T, String> b, final boolean c) {
            Objects.requireNonNull(obj, "name == null");
            this.a = obj;
            this.b = b;
            this.c = c;
        }
        
        @Override
        void a(final r r, @c6.h final T t) throws IOException {
            if (t == null) {
                return;
            }
            final String s = this.b.a(t);
            if (s == null) {
                return;
            }
            r.a(this.a, s, this.c);
        }
    }
    
    static final class e<T> extends p<Map<String, T>>
    {
        private final Method a;
        private final int b;
        private final retrofit2.f<T, String> c;
        private final boolean d;
        
        e(final Method a, final int b, final retrofit2.f<T, String> c, final boolean d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        void d(final r r, @c6.h final Map<String, T> map) throws IOException {
            if (map != null) {
                for (final Map.Entry<String, T> entry : map.entrySet()) {
                    final String s = entry.getKey();
                    if (s == null) {
                        throw y.o(this.a, this.b, "Field map contained null key.", new Object[0]);
                    }
                    final T value = entry.getValue();
                    if (value == null) {
                        final Method a = this.a;
                        final int b = this.b;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Field map contained null value for key '");
                        sb.append(s);
                        sb.append("'.");
                        throw y.o(a, b, sb.toString(), new Object[0]);
                    }
                    final String s2 = this.c.a(value);
                    if (s2 == null) {
                        final Method a2 = this.a;
                        final int b2 = this.b;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Field map value '");
                        sb2.append(value);
                        sb2.append("' converted to null by ");
                        sb2.append(this.c.getClass().getName());
                        sb2.append(" for key '");
                        sb2.append(s);
                        sb2.append("'.");
                        throw y.o(a2, b2, sb2.toString(), new Object[0]);
                    }
                    r.a(s, s2, this.d);
                }
                return;
            }
            throw y.o(this.a, this.b, "Field map was null.", new Object[0]);
        }
    }
    
    static final class f<T> extends p<T>
    {
        private final String a;
        private final retrofit2.f<T, String> b;
        
        f(final String obj, final retrofit2.f<T, String> b) {
            Objects.requireNonNull(obj, "name == null");
            this.a = obj;
            this.b = b;
        }
        
        @Override
        void a(final r r, @c6.h final T t) throws IOException {
            if (t == null) {
                return;
            }
            final String s = this.b.a(t);
            if (s == null) {
                return;
            }
            r.b(this.a, s);
        }
    }
    
    static final class g<T> extends p<Map<String, T>>
    {
        private final Method a;
        private final int b;
        private final retrofit2.f<T, String> c;
        
        g(final Method a, final int b, final retrofit2.f<T, String> c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        void d(final r r, @c6.h final Map<String, T> map) throws IOException {
            if (map != null) {
                for (final Map.Entry<String, T> entry : map.entrySet()) {
                    final String str = entry.getKey();
                    if (str == null) {
                        throw y.o(this.a, this.b, "Header map contained null key.", new Object[0]);
                    }
                    final T value = entry.getValue();
                    if (value == null) {
                        final Method a = this.a;
                        final int b = this.b;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Header map contained null value for key '");
                        sb.append(str);
                        sb.append("'.");
                        throw y.o(a, b, sb.toString(), new Object[0]);
                    }
                    r.b(str, this.c.a(value));
                }
                return;
            }
            throw y.o(this.a, this.b, "Header map was null.", new Object[0]);
        }
    }
    
    static final class h extends p<v>
    {
        private final Method a;
        private final int b;
        
        h(final Method a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        void d(final r r, @c6.h final v v) {
            if (v != null) {
                r.c(v);
                return;
            }
            throw y.o(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
    }
    
    static final class i<T> extends p<T>
    {
        private final Method a;
        private final int b;
        private final v c;
        private final retrofit2.f<T, f0> d;
        
        i(final Method a, final int b, final v c, final retrofit2.f<T, f0> d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        void a(final r r, @c6.h final T obj) {
            if (obj == null) {
                return;
            }
            try {
                r.d(this.c, this.d.a(obj));
            }
            catch (IOException ex) {
                final Method a = this.a;
                final int b = this.b;
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to convert ");
                sb.append(obj);
                sb.append(" to RequestBody");
                throw y.o(a, b, sb.toString(), ex);
            }
        }
    }
    
    static final class j<T> extends p<Map<String, T>>
    {
        private final Method a;
        private final int b;
        private final retrofit2.f<T, f0> c;
        private final String d;
        
        j(final Method a, final int b, final retrofit2.f<T, f0> c, final String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        void d(final r r, @c6.h final Map<String, T> map) throws IOException {
            if (map != null) {
                for (final Map.Entry<String, T> entry : map.entrySet()) {
                    final String s = entry.getKey();
                    if (s == null) {
                        throw y.o(this.a, this.b, "Part map contained null key.", new Object[0]);
                    }
                    final T value = entry.getValue();
                    if (value == null) {
                        final Method a = this.a;
                        final int b = this.b;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Part map contained null value for key '");
                        sb.append(s);
                        sb.append("'.");
                        throw y.o(a, b, sb.toString(), new Object[0]);
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("form-data; name=\"");
                    sb2.append(s);
                    sb2.append("\"");
                    r.d(v.r("Content-Disposition", sb2.toString(), "Content-Transfer-Encoding", this.d), this.c.a(value));
                }
                return;
            }
            throw y.o(this.a, this.b, "Part map was null.", new Object[0]);
        }
    }
    
    static final class k<T> extends p<T>
    {
        private final Method a;
        private final int b;
        private final String c;
        private final retrofit2.f<T, String> d;
        private final boolean e;
        
        k(final Method a, final int b, final String obj, final retrofit2.f<T, String> d, final boolean e) {
            this.a = a;
            this.b = b;
            Objects.requireNonNull(obj, "name == null");
            this.c = obj;
            this.d = d;
            this.e = e;
        }
        
        @Override
        void a(final r r, @c6.h final T t) throws IOException {
            if (t != null) {
                r.f(this.c, this.d.a(t), this.e);
                return;
            }
            final Method a = this.a;
            final int b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Path parameter \"");
            sb.append(this.c);
            sb.append("\" value must not be null.");
            throw y.o(a, b, sb.toString(), new Object[0]);
        }
    }
    
    static final class l<T> extends p<T>
    {
        private final String a;
        private final retrofit2.f<T, String> b;
        private final boolean c;
        
        l(final String obj, final retrofit2.f<T, String> b, final boolean c) {
            Objects.requireNonNull(obj, "name == null");
            this.a = obj;
            this.b = b;
            this.c = c;
        }
        
        @Override
        void a(final r r, @c6.h final T t) throws IOException {
            if (t == null) {
                return;
            }
            final String s = this.b.a(t);
            if (s == null) {
                return;
            }
            r.g(this.a, s, this.c);
        }
    }
    
    static final class m<T> extends p<Map<String, T>>
    {
        private final Method a;
        private final int b;
        private final retrofit2.f<T, String> c;
        private final boolean d;
        
        m(final Method a, final int b, final retrofit2.f<T, String> c, final boolean d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        void d(final r r, @c6.h final Map<String, T> map) throws IOException {
            if (map != null) {
                for (final Map.Entry<String, T> entry : map.entrySet()) {
                    final String s = entry.getKey();
                    if (s == null) {
                        throw y.o(this.a, this.b, "Query map contained null key.", new Object[0]);
                    }
                    final T value = entry.getValue();
                    if (value == null) {
                        final Method a = this.a;
                        final int b = this.b;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Query map contained null value for key '");
                        sb.append(s);
                        sb.append("'.");
                        throw y.o(a, b, sb.toString(), new Object[0]);
                    }
                    final String s2 = this.c.a(value);
                    if (s2 == null) {
                        final Method a2 = this.a;
                        final int b2 = this.b;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Query map value '");
                        sb2.append(value);
                        sb2.append("' converted to null by ");
                        sb2.append(this.c.getClass().getName());
                        sb2.append(" for key '");
                        sb2.append(s);
                        sb2.append("'.");
                        throw y.o(a2, b2, sb2.toString(), new Object[0]);
                    }
                    r.g(s, s2, this.d);
                }
                return;
            }
            throw y.o(this.a, this.b, "Query map was null", new Object[0]);
        }
    }
    
    static final class n<T> extends p<T>
    {
        private final retrofit2.f<T, String> a;
        private final boolean b;
        
        n(final retrofit2.f<T, String> a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        void a(final r r, @c6.h final T t) throws IOException {
            if (t == null) {
                return;
            }
            r.g(this.a.a(t), null, this.b);
        }
    }
    
    static final class o extends p<z.c>
    {
        static final o a;
        
        static {
            a = new o();
        }
        
        private o() {
        }
        
        void d(final r r, @c6.h final z.c c) {
            if (c != null) {
                r.e(c);
            }
        }
    }
    
    static final class p extends retrofit2.p<Object>
    {
        private final Method a;
        private final int b;
        
        p(final Method a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        void a(final r r, @c6.h final Object o) {
            if (o != null) {
                r.m(o);
                return;
            }
            throw y.o(this.a, this.b, "@Url parameter is null.", new Object[0]);
        }
    }
    
    static final class q<T> extends p<T>
    {
        final Class<T> a;
        
        q(final Class<T> a) {
            this.a = a;
        }
        
        @Override
        void a(final r r, @c6.h final T t) {
            r.h(this.a, t);
        }
    }
}
