// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import x5.r;
import x5.d;
import o7.c;
import io.reactivex.i0;

public class a<T>
{
    final int a;
    final Object[] b;
    Object[] c;
    int d;
    
    public a(final int a) {
        this.a = a;
        final Object[] array = new Object[a + 1];
        this.b = array;
        this.c = array;
    }
    
    public <U> boolean a(final i0<? super U> i0) {
        Object[] b = this.b;
        final int a = this.a;
        while (true) {
            int j = 0;
            if (b == null) {
                return false;
            }
            while (j < a) {
                final Object o = b[j];
                if (o == null) {
                    break;
                }
                if (q.f(o, (i0<? super Object>)i0)) {
                    return true;
                }
                ++j;
            }
            b = (Object[])b[a];
        }
    }
    
    public <U> boolean b(final c<? super U> c) {
        Object[] b = this.b;
        final int a = this.a;
        while (true) {
            int i = 0;
            if (b == null) {
                return false;
            }
            while (i < a) {
                final Object o = b[i];
                if (o == null) {
                    break;
                }
                if (q.g(o, (o7.c<? super Object>)c)) {
                    return true;
                }
                ++i;
            }
            b = (Object[])b[a];
        }
    }
    
    public void c(final T t) {
        final int a = this.a;
        int d;
        if ((d = this.d) == a) {
            final Object[] c = new Object[a + 1];
            this.c[a] = c;
            this.c = c;
            d = 0;
        }
        this.c[d] = t;
        this.d = d + 1;
    }
    
    public void d(final a<? super T> a) {
        Object[] b = this.b;
        for (int a2 = this.a; b != null; b = (Object[])b[a2]) {
            for (final Object o : b) {
                if (o == null) {
                    break;
                }
                if (a.a((Object)o)) {
                    return;
                }
            }
        }
    }
    
    public <S> void e(final S n, final d<? super S, ? super T> d) throws Exception {
        Object[] b = this.b;
        final int a = this.a;
        while (true) {
            for (final Object o : b) {
                if (o == null) {
                    return;
                }
                if (d.a(n, (Object)o)) {
                    return;
                }
            }
            b = (Object[])b[a];
        }
    }
    
    public void f(final T t) {
        this.b[0] = t;
    }
    
    public interface a<T> extends r<T>
    {
        boolean a(final T p0);
    }
}
