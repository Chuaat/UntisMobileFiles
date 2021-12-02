// 
// Decompiled by Procyon v0.5.36
// 

package timber.log;

import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import android.util.Log;
import org.jetbrains.annotations.f;
import java.util.regex.Matcher;
import android.os.Build$VERSION;
import java.util.regex.Pattern;
import java.util.Objects;
import java.util.Collections;
import java.util.Collection;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;
import java.util.ArrayList;
import java.util.List;

public final class b
{
    private static final c[] a;
    private static final List<c> b;
    static volatile c[] c;
    private static final c d;
    
    static {
        final c[] c = a = new c[0];
        b = new ArrayList<c>();
        timber.log.b.c = c;
        d = (c)new c() {
            @Override
            public void A(final Throwable t) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].A(t);
                }
            }
            
            @Override
            public void B(final Throwable t, final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].B(t, s, array);
                }
            }
            
            @Override
            public void a(final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].a(s, array);
                }
            }
            
            @Override
            public void b(final Throwable t) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].b(t);
                }
            }
            
            @Override
            public void c(final Throwable t, final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].c(t, s, array);
                }
            }
            
            @Override
            public void d(final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].d(s, array);
                }
            }
            
            @Override
            public void e(final Throwable t) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].e(t);
                }
            }
            
            @Override
            public void f(final Throwable t, final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].f(t, s, array);
                }
            }
            
            @Override
            public void j(final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].j(s, array);
                }
            }
            
            @Override
            public void k(final Throwable t) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].k(t);
                }
            }
            
            @Override
            public void l(final Throwable t, final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].l(t, s, array);
                }
            }
            
            @Override
            protected void o(final int n, final String s, @e final String s2, final Throwable t) {
                throw new AssertionError((Object)"Missing override for log method.");
            }
            
            @Override
            public void p(final int n, final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].p(n, s, array);
                }
            }
            
            @Override
            public void q(final int n, final Throwable t) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].q(n, t);
                }
            }
            
            @Override
            public void r(final int n, final Throwable t, final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].r(n, t, s, array);
                }
            }
            
            @Override
            public void t(final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].t(s, array);
                }
            }
            
            @Override
            public void u(final Throwable t) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].u(t);
                }
            }
            
            @Override
            public void v(final Throwable t, final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].v(t, s, array);
                }
            }
            
            @Override
            public void w(final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].w(s, array);
                }
            }
            
            @Override
            public void x(final Throwable t) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].x(t);
                }
            }
            
            @Override
            public void y(final Throwable t, final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].y(t, s, array);
                }
            }
            
            @Override
            public void z(final String s, final Object... array) {
                final c[] c = timber.log.b.c;
                for (int length = c.length, i = 0; i < length; ++i) {
                    c[i].z(s, array);
                }
            }
        };
    }
    
    private b() {
        throw new AssertionError((Object)"No instances.");
    }
    
    public static void A(@d final String s, final Object... array) {
        timber.log.b.d.z(s, array);
    }
    
    public static void B(final Throwable t) {
        timber.log.b.d.A(t);
    }
    
    public static void C(final Throwable t, @d final String s, final Object... array) {
        timber.log.b.d.B(t, s, array);
    }
    
    @e
    public static c a() {
        return timber.log.b.d;
    }
    
    public static void b(@d final String s, final Object... array) {
        timber.log.b.d.a(s, array);
    }
    
    public static void c(final Throwable t) {
        timber.log.b.d.b(t);
    }
    
    public static void d(final Throwable t, @d final String s, final Object... array) {
        timber.log.b.d.c(t, s, array);
    }
    
    public static void e(@d final String s, final Object... array) {
        timber.log.b.d.d(s, array);
    }
    
    public static void f(final Throwable t) {
        timber.log.b.d.e(t);
    }
    
    public static void g(final Throwable t, @d final String s, final Object... array) {
        timber.log.b.d.f(t, s, array);
    }
    
    @e
    public static List<c> h() {
        final List<c> b = timber.log.b.b;
        synchronized (b) {
            return (List<c>)Collections.unmodifiableList((List<?>)new ArrayList<Object>(b));
        }
    }
    
    public static void i(@d final String s, final Object... array) {
        timber.log.b.d.j(s, array);
    }
    
    public static void j(final Throwable t) {
        timber.log.b.d.k(t);
    }
    
    public static void k(final Throwable t, @d final String s, final Object... array) {
        timber.log.b.d.l(t, s, array);
    }
    
    public static void l(final int n, @d final String s, final Object... array) {
        timber.log.b.d.p(n, s, array);
    }
    
    public static void m(final int n, final Throwable t) {
        timber.log.b.d.q(n, t);
    }
    
    public static void n(final int n, final Throwable t, @d final String s, final Object... array) {
        timber.log.b.d.r(n, t, s, array);
    }
    
    public static void o(@e final c obj) {
        Objects.requireNonNull(obj, "tree == null");
        if (obj != timber.log.b.d) {
            final List<c> b = timber.log.b.b;
            synchronized (b) {
                b.add(obj);
                timber.log.b.c = b.toArray(new c[b.size()]);
                return;
            }
        }
        throw new IllegalArgumentException("Cannot plant Timber into itself.");
    }
    
    public static void p(@e final c... array) {
        Objects.requireNonNull(array, "trees == null");
        for (final c obj : array) {
            Objects.requireNonNull(obj, "trees contains null");
            if (obj == timber.log.b.d) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
        }
        final List<c> b = timber.log.b.b;
        synchronized (b) {
            Collections.addAll(b, array);
            timber.log.b.c = b.toArray(new c[b.size()]);
        }
    }
    
    @e
    public static c q(final String value) {
        final c[] c = timber.log.b.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            c[i].a.set(value);
        }
        return timber.log.b.d;
    }
    
    public static int r() {
        final List<c> b = timber.log.b.b;
        synchronized (b) {
            return b.size();
        }
    }
    
    public static void s(@e final c obj) {
        final List<c> b = timber.log.b.b;
        synchronized (b) {
            if (b.remove(obj)) {
                timber.log.b.c = b.toArray(new c[b.size()]);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot uproot tree which is not planted: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    public static void t() {
        final List<c> b = timber.log.b.b;
        synchronized (b) {
            b.clear();
            timber.log.b.c = timber.log.b.a;
        }
    }
    
    public static void u(@d final String s, final Object... array) {
        timber.log.b.d.t(s, array);
    }
    
    public static void v(final Throwable t) {
        timber.log.b.d.u(t);
    }
    
    public static void w(final Throwable t, @d final String s, final Object... array) {
        timber.log.b.d.v(t, s, array);
    }
    
    public static void x(@d final String s, final Object... array) {
        timber.log.b.d.w(s, array);
    }
    
    public static void y(final Throwable t) {
        timber.log.b.d.x(t);
    }
    
    public static void z(final Throwable t, @d final String s, final Object... array) {
        timber.log.b.d.y(t, s, array);
    }
    
    public static class b extends c
    {
        private static final int b = 4000;
        private static final int c = 23;
        private static final int d = 5;
        private static final Pattern e;
        
        static {
            e = Pattern.compile("(\\$\\d+)+$");
        }
        
        @f
        protected String C(@e final StackTraceElement stackTraceElement) {
            String input = stackTraceElement.getClassName();
            final Matcher matcher = timber.log.b.b.e.matcher(input);
            if (matcher.find()) {
                input = matcher.replaceAll("");
            }
            String s2;
            final String s = s2 = input.substring(input.lastIndexOf(46) + 1);
            if (s.length() > 23) {
                if (Build$VERSION.SDK_INT >= 24) {
                    s2 = s;
                }
                else {
                    s2 = s.substring(0, 23);
                }
            }
            return s2;
        }
        
        @Override
        final String i() {
            final String i = super.i();
            if (i != null) {
                return i;
            }
            final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                return this.C(stackTrace[5]);
            }
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }
        
        @Override
        protected void o(final int n, final String s, @e final String s2, final Throwable t) {
            if (s2.length() < 4000) {
                if (n == 7) {
                    Log.wtf(s, s2);
                }
                else {
                    Log.println(n, s, s2);
                }
                return;
            }
            int min;
            for (int i = 0, length = s2.length(); i < length; i = min + 1) {
                int index = s2.indexOf(10, i);
                if (index == -1) {
                    index = length;
                }
                while (true) {
                    min = Math.min(index, i + 4000);
                    final String substring = s2.substring(i, min);
                    if (n == 7) {
                        Log.wtf(s, substring);
                    }
                    else {
                        Log.println(n, s, substring);
                    }
                    if (min >= index) {
                        break;
                    }
                    i = min;
                }
            }
        }
    }
    
    public abstract static class c
    {
        final ThreadLocal<String> a;
        
        public c() {
            this.a = new ThreadLocal<String>();
        }
        
        private String h(final Throwable t) {
            final StringWriter out = new StringWriter(256);
            final PrintWriter s = new PrintWriter(out, false);
            t.printStackTrace(s);
            s.flush();
            return out.toString();
        }
        
        private void s(final int n, final Throwable t, String g, final Object... array) {
            final String i = this.i();
            if (!this.n(i, n)) {
                return;
            }
            String s;
            if ((s = g) != null) {
                s = g;
                if (g.length() == 0) {
                    s = null;
                }
            }
            String s2;
            if (s == null) {
                if (t == null) {
                    return;
                }
                s2 = this.h(t);
            }
            else {
                g = s;
                if (array != null) {
                    g = s;
                    if (array.length > 0) {
                        g = this.g(s, array);
                    }
                }
                s2 = g;
                if (t != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(g);
                    sb.append("\n");
                    sb.append(this.h(t));
                    s2 = sb.toString();
                }
            }
            this.o(n, i, s2, t);
        }
        
        public void A(final Throwable t) {
            this.s(7, t, null, new Object[0]);
        }
        
        public void B(final Throwable t, final String s, final Object... array) {
            this.s(7, t, s, array);
        }
        
        public void a(final String s, final Object... array) {
            this.s(3, null, s, array);
        }
        
        public void b(final Throwable t) {
            this.s(3, t, null, new Object[0]);
        }
        
        public void c(final Throwable t, final String s, final Object... array) {
            this.s(3, t, s, array);
        }
        
        public void d(final String s, final Object... array) {
            this.s(6, null, s, array);
        }
        
        public void e(final Throwable t) {
            this.s(6, t, null, new Object[0]);
        }
        
        public void f(final Throwable t, final String s, final Object... array) {
            this.s(6, t, s, array);
        }
        
        protected String g(@e final String format, @e final Object[] args) {
            return String.format(format, args);
        }
        
        @f
        String i() {
            final String s = this.a.get();
            if (s != null) {
                this.a.remove();
            }
            return s;
        }
        
        public void j(final String s, final Object... array) {
            this.s(4, null, s, array);
        }
        
        public void k(final Throwable t) {
            this.s(4, t, null, new Object[0]);
        }
        
        public void l(final Throwable t, final String s, final Object... array) {
            this.s(4, t, s, array);
        }
        
        @Deprecated
        protected boolean m(final int n) {
            return true;
        }
        
        protected boolean n(@f final String s, final int n) {
            return this.m(n);
        }
        
        protected abstract void o(final int p0, @f final String p1, @e final String p2, @f final Throwable p3);
        
        public void p(final int n, final String s, final Object... array) {
            this.s(n, null, s, array);
        }
        
        public void q(final int n, final Throwable t) {
            this.s(n, t, null, new Object[0]);
        }
        
        public void r(final int n, final Throwable t, final String s, final Object... array) {
            this.s(n, t, s, array);
        }
        
        public void t(final String s, final Object... array) {
            this.s(2, null, s, array);
        }
        
        public void u(final Throwable t) {
            this.s(2, t, null, new Object[0]);
        }
        
        public void v(final Throwable t, final String s, final Object... array) {
            this.s(2, t, s, array);
        }
        
        public void w(final String s, final Object... array) {
            this.s(5, null, s, array);
        }
        
        public void x(final Throwable t) {
            this.s(5, t, null, new Object[0]);
        }
        
        public void y(final Throwable t, final String s, final Object... array) {
            this.s(5, t, s, array);
        }
        
        public void z(final String s, final Object... array) {
            this.s(7, null, s, array);
        }
    }
}
