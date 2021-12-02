// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import androidx.annotation.k0;
import androidx.annotation.j0;

public final class m
{
    private m() {
    }
    
    public interface a<T>
    {
        boolean a(@j0 final T p0);
        
        @k0
        T b();
    }
    
    public static class b<T> implements a<T>
    {
        private final Object[] a;
        private int b;
        
        public b(final int n) {
            if (n > 0) {
                this.a = new Object[n];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        
        private boolean c(@j0 final T t) {
            for (int i = 0; i < this.b; ++i) {
                if (this.a[i] == t) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public boolean a(@j0 final T t) {
            if (this.c(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            final int b = this.b;
            final Object[] a = this.a;
            if (b < a.length) {
                a[b] = t;
                this.b = b + 1;
                return true;
            }
            return false;
        }
        
        @Override
        public T b() {
            final int b = this.b;
            if (b > 0) {
                final int n = b - 1;
                final Object[] a = this.a;
                final Object o = a[n];
                a[n] = null;
                this.b = b - 1;
                return (T)o;
            }
            return null;
        }
    }
    
    public static class c<T> extends b<T>
    {
        private final Object c;
        
        public c(final int n) {
            super(n);
            this.c = new Object();
        }
        
        @Override
        public boolean a(@j0 final T t) {
            synchronized (this.c) {
                return super.a(t);
            }
        }
        
        @Override
        public T b() {
            synchronized (this.c) {
                return super.b();
            }
        }
    }
}
