// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import java.lang.reflect.Array;
import android.util.SparseArray;

class j0<T>
{
    final int a;
    private final SparseArray<a<T>> b;
    a<T> c;
    
    public j0(final int a) {
        this.b = (SparseArray<a<T>>)new SparseArray(10);
        this.a = a;
    }
    
    public a<T> a(final a<T> c) {
        final int indexOfKey = this.b.indexOfKey(c.b);
        if (indexOfKey < 0) {
            this.b.put(c.b, (Object)c);
            return null;
        }
        final a a = (a)this.b.valueAt(indexOfKey);
        this.b.setValueAt(indexOfKey, (Object)c);
        if (this.c == a) {
            this.c = c;
        }
        return (a<T>)a;
    }
    
    public void b() {
        this.b.clear();
    }
    
    public a<T> c(final int n) {
        if (n >= 0 && n < this.b.size()) {
            return (a<T>)this.b.valueAt(n);
        }
        return null;
    }
    
    public T d(final int n) {
        final a<T> c = this.c;
        if (c == null || !c.a(n)) {
            final int indexOfKey = this.b.indexOfKey(n - n % this.a);
            if (indexOfKey < 0) {
                return null;
            }
            this.c = (a<T>)this.b.valueAt(indexOfKey);
        }
        return this.c.b(n);
    }
    
    public a<T> e(final int n) {
        final a a = (a)this.b.get(n);
        if (this.c == a) {
            this.c = null;
        }
        this.b.delete(n);
        return (a<T>)a;
    }
    
    public int f() {
        return this.b.size();
    }
    
    public static class a<T>
    {
        public final T[] a;
        public int b;
        public int c;
        a<T> d;
        
        public a(final Class<T> componentType, final int length) {
            this.a = (T[])Array.newInstance(componentType, length);
        }
        
        boolean a(final int n) {
            final int b = this.b;
            return b <= n && n < b + this.c;
        }
        
        T b(final int n) {
            return this.a[n - this.b];
        }
    }
}
