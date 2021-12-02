// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public abstract class j9<MessageType extends j9<MessageType, BuilderType>, BuilderType extends f9<MessageType, BuilderType>> extends q7<MessageType, BuilderType>
{
    private static final Map<Object, j9<?, ?>> zza;
    protected wb zzc;
    protected int zzd;
    
    static {
        zza = new ConcurrentHashMap<Object, j9<?, ?>>();
    }
    
    public j9() {
        this.zzc = wb.c();
        this.zzd = -1;
    }
    
    protected static <E> r9<E> j() {
        return (r9<E>)bb.f();
    }
    
    protected static <E> r9<E> k(final r9<E> r9) {
        final int size = r9.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return r9.s0(n);
    }
    
    static Object l(final Method method, final Object obj, final Object... args) {
        try {
            return method.invoke(obj, args);
        }
        catch (InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
        catch (IllegalAccessException cause2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", cause2);
        }
    }
    
    protected static Object m(final sa sa, final String s, final Object[] array) {
        return new cb(sa, s, array);
    }
    
    protected static <T extends j9> void n(final Class<T> clazz, final T t) {
        j9.zza.put(clazz, t);
    }
    
    static <T extends j9> T q(final Class<T> clazz) {
        final Map<Object, j9<?, ?>> zza = j9.zza;
        j9<?, ?> j9;
        if ((j9 = zza.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                j9 = zza.get(clazz);
            }
            catch (ClassNotFoundException cause) {
                throw new IllegalStateException("Class initialization cannot fail.", cause);
            }
        }
        j9<?, ?> j10;
        if ((j10 = j9) == null) {
            j10 = (j9<?, ?>)fc.j(clazz).u(6, null, null);
            if (j10 == null) {
                throw new IllegalStateException();
            }
            zza.put(clazz, j10);
        }
        return (T)j10;
    }
    
    protected static p9 r() {
        return l9.h();
    }
    
    protected static q9 s() {
        return ga.f();
    }
    
    protected static q9 t(final q9 q9) {
        final int size = q9.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return q9.W0(n);
    }
    
    @Override
    public final void c(final q8 q8) throws IOException {
        ab.a().b(this.getClass()).h((j9)this, r8.l(q8));
    }
    
    @Override
    final int e() {
        return this.zzd;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && ab.a().b(this.getClass()).i((j9)this, (j9)o));
    }
    
    @Override
    final void h(final int zzd) {
        this.zzd = zzd;
    }
    
    @Override
    public final int hashCode() {
        final int zzb = super.zzb;
        if (zzb != 0) {
            return zzb;
        }
        return super.zzb = ab.a().b(this.getClass()).c((j9)this);
    }
    
    protected final <MessageType extends j9<MessageType, BuilderType>, BuilderType extends f9<MessageType, BuilderType>> BuilderType o() {
        return (BuilderType)this.u(5, null, null);
    }
    
    public final BuilderType p() {
        final f9 f9 = (f9)this.u(5, null, null);
        f9.t(this);
        return (BuilderType)f9;
    }
    
    @Override
    public final String toString() {
        return ua.a(this, super.toString());
    }
    
    protected abstract Object u(final int p0, final Object p1, final Object p2);
    
    @Override
    public final int y() {
        int zzd;
        if ((zzd = this.zzd) == -1) {
            zzd = ab.a().b(this.getClass()).a((j9)this);
            this.zzd = zzd;
        }
        return zzd;
    }
}
