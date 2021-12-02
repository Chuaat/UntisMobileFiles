// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;
import android.util.SparseIntArray;
import android.util.SparseArray;
import androidx.annotation.j0;

interface m0
{
    @j0
    x a(final int p0);
    
    @j0
    c b(@j0 final x p0);
    
    public static class a implements m0
    {
        SparseArray<x> a;
        int b;
        
        public a() {
            this.a = (SparseArray<x>)new SparseArray();
            this.b = 0;
        }
        
        @j0
        @Override
        public x a(final int i) {
            final x x = (x)this.a.get(i);
            if (x != null) {
                return x;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find the wrapper for global view type ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        
        @j0
        @Override
        public c b(@j0 final x x) {
            return new m0.a.a(x);
        }
        
        int c(final x x) {
            final int n = this.b++;
            this.a.put(n, (Object)x);
            return n;
        }
        
        void d(@j0 final x x) {
            for (int i = this.a.size() - 1; i >= 0; --i) {
                if (this.a.valueAt(i) == x) {
                    this.a.removeAt(i);
                }
            }
        }
        
        class a implements c
        {
            private SparseIntArray a;
            private SparseIntArray b;
            final x c;
            
            a(final x c) {
                this.a = new SparseIntArray(1);
                this.b = new SparseIntArray(1);
                this.c = c;
            }
            
            @Override
            public int a(final int i) {
                final int indexOfKey = this.b.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.b.valueAt(indexOfKey);
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("requested global type ");
                sb.append(i);
                sb.append(" does not belong to the adapter:");
                sb.append(this.c.c);
                throw new IllegalStateException(sb.toString());
            }
            
            @Override
            public int b(final int n) {
                final int indexOfKey = this.a.indexOfKey(n);
                if (indexOfKey > -1) {
                    return this.a.valueAt(indexOfKey);
                }
                final int c = m0.a.this.c(this.c);
                this.a.put(n, c);
                this.b.put(c, n);
                return c;
            }
            
            @Override
            public void dispose() {
                m0.a.this.d(this.c);
            }
        }
    }
    
    public static class b implements m0
    {
        SparseArray<List<x>> a;
        
        public b() {
            this.a = (SparseArray<List<x>>)new SparseArray();
        }
        
        @j0
        @Override
        public x a(final int i) {
            final List list = (List)this.a.get(i);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find the wrapper for global view type ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        
        @j0
        @Override
        public c b(@j0 final x x) {
            return new a(x);
        }
        
        void c(@j0 final x x) {
            for (int i = this.a.size() - 1; i >= 0; --i) {
                final List list = (List)this.a.valueAt(i);
                if (list.remove(x) && list.isEmpty()) {
                    this.a.removeAt(i);
                }
            }
        }
        
        class a implements c
        {
            final x a;
            
            a(final x a) {
                this.a = a;
            }
            
            @Override
            public int a(final int n) {
                return n;
            }
            
            @Override
            public int b(final int n) {
                List<x> list;
                if ((list = (List<x>)m0.b.this.a.get(n)) == null) {
                    list = new ArrayList<x>();
                    m0.b.this.a.put(n, (Object)list);
                }
                if (!list.contains(this.a)) {
                    list.add(this.a);
                }
                return n;
            }
            
            @Override
            public void dispose() {
                m0.b.this.c(this.a);
            }
        }
    }
    
    public interface c
    {
        int a(final int p0);
        
        int b(final int p0);
        
        void dispose();
    }
}
