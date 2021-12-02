// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.a;
import rx.n;
import rx.g;

public final class v0<T> implements g.a<T>
{
    public static volatile boolean I;
    final g.a<T> G;
    final String H;
    
    public v0(final g.a<T> g) {
        this.G = g;
        this.H = b();
    }
    
    static String b() {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final StringBuilder sb = new StringBuilder("Assembly trace:");
        for (final StackTraceElement stackTraceElement : stackTrace) {
            final String string = stackTraceElement.toString();
            Label_0201: {
                if (!v0.I) {
                    if (stackTraceElement.getLineNumber() <= 1) {
                        break Label_0201;
                    }
                    if (string.contains("RxJavaHooks.")) {
                        break Label_0201;
                    }
                    if (string.contains("OnSubscribeOnAssembly")) {
                        break Label_0201;
                    }
                    if (string.contains(".junit.runner")) {
                        break Label_0201;
                    }
                    if (string.contains(".junit4.runner")) {
                        break Label_0201;
                    }
                    if (string.contains(".junit.internal")) {
                        break Label_0201;
                    }
                    if (string.contains("sun.reflect")) {
                        break Label_0201;
                    }
                    if (string.contains("java.lang.Thread.")) {
                        break Label_0201;
                    }
                    if (string.contains("ThreadPoolExecutor")) {
                        break Label_0201;
                    }
                    if (string.contains("org.apache.catalina.")) {
                        break Label_0201;
                    }
                    if (string.contains("org.apache.tomcat.")) {
                        break Label_0201;
                    }
                }
                sb.append("\n at ");
                sb.append(string);
            }
        }
        sb.append("\nOriginal exception:");
        return sb.toString();
    }
    
    public void a(final n<? super T> n) {
        this.G.h(new a<Object>((n<? super Object>)n, this.H));
    }
    
    static final class a<T> extends n<T>
    {
        final n<? super T> L;
        final String M;
        
        public a(final n<? super T> l, final String m) {
            super(l);
            this.L = l;
            this.M = m;
        }
        
        @Override
        public void b(final Throwable t) {
            new rx.exceptions.a(this.M).a(t);
            this.L.b(t);
        }
        
        @Override
        public void c() {
            this.L.c();
        }
        
        @Override
        public void m(final T t) {
            this.L.m((Object)t);
        }
    }
}
