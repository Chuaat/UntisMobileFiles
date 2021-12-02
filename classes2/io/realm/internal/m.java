// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class m<T extends b>
{
    private List<T> a;
    private boolean b;
    
    public m() {
        this.a = new CopyOnWriteArrayList<T>();
        this.b = false;
    }
    
    public void a(final T t) {
        if (!this.a.contains(t)) {
            this.a.add(t);
            t.c = false;
        }
        if (this.b) {
            this.b = false;
        }
    }
    
    public void b() {
        this.b = true;
        this.a.clear();
    }
    
    public void c(final a<T> a) {
        for (final b b : this.a) {
            if (this.b) {
                break;
            }
            final Object value = b.a.get();
            if (value == null) {
                this.a.remove(b);
            }
            else {
                if (b.c) {
                    continue;
                }
                a.a((T)b, value);
            }
        }
    }
    
    public boolean d() {
        return this.a.isEmpty();
    }
    
    public <S, U> void e(final S n, final U u) {
        for (final b b : this.a) {
            if (n == b.a.get() && u.equals(b.b)) {
                b.c = true;
                this.a.remove(b);
                break;
            }
        }
    }
    
    void f(final Object o) {
        for (final b b : this.a) {
            final Object value = b.a.get();
            if (value == null || value == o) {
                b.c = true;
                this.a.remove(b);
            }
        }
    }
    
    public int g() {
        return this.a.size();
    }
    
    public interface a<T extends b>
    {
        void a(final T p0, final Object p1);
    }
    
    public abstract static class b<T, S>
    {
        final WeakReference<T> a;
        protected final S b;
        boolean c;
        
        public b(final T referent, final S b) {
            this.c = false;
            this.b = b;
            this.a = new WeakReference<T>(referent);
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o instanceof b) {
                final b b2 = (b)o;
                if (!this.b.equals(b2.b) || this.a.get() != b2.a.get()) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            final Object value = this.a.get();
            int hashCode = 0;
            int hashCode2;
            if (value != null) {
                hashCode2 = value.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final S b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return (527 + hashCode2) * 31 + hashCode;
        }
    }
}
