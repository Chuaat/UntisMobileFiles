// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core;

final class g
{
    private static final boolean a = false;
    
    private g() {
    }
    
    interface a<T>
    {
        boolean a(final T p0);
        
        T b();
        
        void c(final T[] p0, final int p1);
    }
    
    static class b<T> implements a<T>
    {
        private final Object[] a;
        private int b;
        
        b(final int n) {
            if (n > 0) {
                this.a = new Object[n];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        
        private boolean d(final T t) {
            for (int i = 0; i < this.b; ++i) {
                if (this.a[i] == t) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public boolean a(final T t) {
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
        
        @Override
        public void c(final T[] array, int i) {
            int length = i;
            if (i > array.length) {
                length = array.length;
            }
            T t;
            int b;
            Object[] a;
            for (i = 0; i < length; ++i) {
                t = array[i];
                b = this.b;
                a = this.a;
                if (b < a.length) {
                    a[b] = t;
                    this.b = b + 1;
                }
            }
        }
    }
}
