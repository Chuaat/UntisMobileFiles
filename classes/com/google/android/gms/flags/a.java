// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags;

import android.os.RemoteException;

@Deprecated
@a
public abstract class a<T>
{
    private final int a;
    private final String b;
    private final T c;
    
    private a(final int a, final String b, final T c) {
        this.a = a;
        this.b = b;
        this.c = c;
        e.a().b(this);
    }
    
    @Deprecated
    @a
    public static a a(final int n, final String s, final Boolean b) {
        return new a(n, s, b);
    }
    
    @Deprecated
    @a
    public static b b(final int n, final String s, final int i) {
        return new b(n, s, i);
    }
    
    @Deprecated
    @a
    public static c c(final int n, final String s, final long l) {
        return new c(n, s, l);
    }
    
    @Deprecated
    @a
    public static d d(final int n, final String s, final String s2) {
        return new d(n, s, s2);
    }
    
    @a
    public T e() {
        return e.c().b(this);
    }
    
    public final String f() {
        return this.b;
    }
    
    @Deprecated
    public final int g() {
        return this.a;
    }
    
    protected abstract T h(final h p0);
    
    public final T i() {
        return this.c;
    }
    
    @Deprecated
    public static class a extends com.google.android.gms.flags.a<Boolean>
    {
        public a(final int n, final String s, final Boolean b) {
            super(n, s, b, null);
        }
        
        private final Boolean j(final h h) {
            try {
                return h.getBooleanFlagValue(this.f(), this.i(), this.g());
            }
            catch (RemoteException ex) {
                return this.i();
            }
        }
    }
    
    @Deprecated
    @a
    public static class b extends a<Integer>
    {
        public b(final int n, final String s, final Integer n2) {
            super(n, s, n2, null);
        }
        
        private final Integer j(final h h) {
            try {
                return h.getIntFlagValue(this.f(), this.i(), this.g());
            }
            catch (RemoteException ex) {
                return this.i();
            }
        }
    }
    
    @Deprecated
    @a
    public static class c extends a<Long>
    {
        public c(final int n, final String s, final Long n2) {
            super(n, s, n2, null);
        }
        
        private final Long j(final h h) {
            try {
                return h.getLongFlagValue(this.f(), this.i(), this.g());
            }
            catch (RemoteException ex) {
                return this.i();
            }
        }
    }
    
    @Deprecated
    @a
    public static class d extends a<String>
    {
        public d(final int n, final String s, final String s2) {
            super(n, s, s2, null);
        }
        
        private final String j(final h h) {
            try {
                return h.getStringFlagValue(this.f(), this.i(), this.g());
            }
            catch (RemoteException ex) {
                return this.i();
            }
        }
    }
}
