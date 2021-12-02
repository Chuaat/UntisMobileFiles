// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision;

import java.util.Iterator;
import java.util.HashSet;
import androidx.annotation.RecentlyNonNull;
import android.util.SparseArray;

public class g<T> implements com.google.android.gms.vision.b.b<T>
{
    private b<T> G;
    private SparseArray<c> H;
    private int I;
    
    private g() {
        this.H = (SparseArray<c>)new SparseArray();
        this.I = 3;
    }
    
    @Override
    public void o(@RecentlyNonNull final com.google.android.gms.vision.b.a<T> a) {
        final android.util.SparseArray<T> b = a.b();
        for (int i = 0; i < b.size(); ++i) {
            final int key = b.keyAt(i);
            final Object value = b.valueAt(i);
            if (this.H.get(key) == null) {
                final c c = new c((n)null);
                c.a = this.G.a((T)value);
                c.a.c(key, value);
                this.H.append(key, (Object)c);
            }
        }
        final android.util.SparseArray<Object> b2 = a.b();
        final HashSet<Integer> set = new HashSet<Integer>();
        for (int j = 0; j < this.H.size(); ++j) {
            final int key2 = this.H.keyAt(j);
            if (b2.get(key2) == null) {
                final c c2 = (c)this.H.valueAt(j);
                c2.b++;
                if (c2.b >= this.I) {
                    c2.a.a();
                    set.add(key2);
                }
                else {
                    c2.a.b(a);
                }
            }
        }
        final Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            this.H.delete((int)iterator.next());
        }
        final android.util.SparseArray<Object> b3 = a.b();
        for (int k = 0; k < b3.size(); ++k) {
            final int key3 = b3.keyAt(k);
            final Object value2 = b3.valueAt(k);
            final c c3 = (c)this.H.get(key3);
            c.a(c3, 0);
            c3.a.d(a, value2);
        }
    }
    
    @Override
    public void release() {
        for (int i = 0; i < this.H.size(); ++i) {
            ((c)this.H.valueAt(i)).a.a();
        }
        this.H.clear();
    }
    
    public static class a<T>
    {
        private g<T> a;
        
        public a(@RecentlyNonNull final b<T> b) {
            final g<Object> a = new g<Object>(null);
            this.a = (g<T>)a;
            if (b != null) {
                a.G = (b<Object>)(b)b;
                return;
            }
            throw new IllegalArgumentException("No factory supplied.");
        }
        
        @RecentlyNonNull
        public g<T> a() {
            return this.a;
        }
        
        @RecentlyNonNull
        public a<T> b(final int i) {
            if (i >= 0) {
                ((g<Object>)this.a).I = i;
                return this;
            }
            final StringBuilder sb = new StringBuilder(28);
            sb.append("Invalid max gap: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    public interface b<T>
    {
        @RecentlyNonNull
        i<T> a(@RecentlyNonNull final T p0);
    }
    
    private final class c
    {
        private i<T> a;
        private int b;
        
        private c(final g g) {
            this.b = 0;
        }
        
        static /* synthetic */ int a(final c c, final int n) {
            return c.b = 0;
        }
    }
}
