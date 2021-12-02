// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex;

import io.reactivex.annotations.g;
import io.reactivex.internal.util.q;
import io.reactivex.internal.functions.b;
import io.reactivex.annotations.f;

public final class a0<T>
{
    static final a0<Object> b;
    final Object a;
    
    static {
        b = new a0<Object>(null);
    }
    
    private a0(final Object a) {
        this.a = a;
    }
    
    @f
    public static <T> a0<T> a() {
        return (a0<T>)a0.b;
    }
    
    @f
    public static <T> a0<T> b(@f final Throwable t) {
        io.reactivex.internal.functions.b.g(t, "error is null");
        return new a0<T>(q.j(t));
    }
    
    @f
    public static <T> a0<T> c(@f final T t) {
        io.reactivex.internal.functions.b.g(t, "value is null");
        return new a0<T>(t);
    }
    
    @g
    public Throwable d() {
        final Object a = this.a;
        if (q.u(a)) {
            return q.l(a);
        }
        return null;
    }
    
    @g
    public T e() {
        final Object a = this.a;
        if (a != null && !q.u(a)) {
            return (T)this.a;
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof a0 && io.reactivex.internal.functions.b.c(this.a, ((a0)o).a);
    }
    
    public boolean f() {
        return this.a == null;
    }
    
    public boolean g() {
        return q.u(this.a);
    }
    
    public boolean h() {
        final Object a = this.a;
        return a != null && !q.u(a);
    }
    
    @Override
    public int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final Object a = this.a;
        if (a == null) {
            return "OnCompleteNotification";
        }
        if (q.u(a)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("OnErrorNotification[");
            sb.append(q.l(a));
            sb.append("]");
            return sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("OnNextNotification[");
        sb2.append(this.a);
        sb2.append("]");
        return sb2.toString();
    }
}
