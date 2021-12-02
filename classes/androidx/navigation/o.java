// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.k0;
import androidx.annotation.j0;

public final class o
{
    @j0
    private final s0 a;
    private final boolean b;
    private final boolean c;
    @k0
    private final Object d;
    
    o(@j0 final s0<?> a, final boolean b, @k0 final Object d, final boolean c) {
        if (!a.f() && b) {
            final StringBuilder sb = new StringBuilder();
            sb.append(a.c());
            sb.append(" does not allow nullable values");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!b && c && d == null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Argument with type ");
            sb2.append(a.c());
            sb2.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(sb2.toString());
        }
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @k0
    public Object a() {
        return this.d;
    }
    
    @j0
    public s0<?> b() {
        return (s0<?>)this.a;
    }
    
    public boolean c() {
        return this.c;
    }
    
    public boolean d() {
        return this.b;
    }
    
    void e(@j0 final String s, @j0 final Bundle bundle) {
        if (this.c) {
            this.a.i(bundle, s, this.d);
        }
    }
    
    @Override
    public boolean equals(Object d) {
        boolean equals = true;
        if (this == d) {
            return true;
        }
        if (d == null || o.class != d.getClass()) {
            return false;
        }
        final o o = (o)d;
        if (this.b != o.b) {
            return false;
        }
        if (this.c != o.c) {
            return false;
        }
        if (!this.a.equals(o.a)) {
            return false;
        }
        d = this.d;
        final Object d2 = o.d;
        if (d != null) {
            equals = d.equals(d2);
        }
        else if (d2 != null) {
            equals = false;
        }
        return equals;
    }
    
    boolean f(@j0 final String s, @j0 final Bundle bundle) {
        if (!this.b && bundle.containsKey(s) && bundle.get(s) == null) {
            return false;
        }
        try {
            this.a.b(bundle, s);
            return true;
        }
        catch (ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        final int c = this.c ? 1 : 0;
        final Object d = this.d;
        int hashCode2;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return ((hashCode * 31 + b) * 31 + c) * 31 + hashCode2;
    }
    
    public static final class a
    {
        @k0
        private s0<?> a;
        private boolean b;
        @k0
        private Object c;
        private boolean d;
        
        public a() {
            this.b = false;
            this.d = false;
        }
        
        @j0
        public o a() {
            if (this.a == null) {
                this.a = s0.e(this.c);
            }
            return new o(this.a, this.b, this.c, this.d);
        }
        
        @j0
        public a b(@k0 final Object c) {
            this.c = c;
            this.d = true;
            return this;
        }
        
        @j0
        public a c(final boolean b) {
            this.b = b;
            return this;
        }
        
        @j0
        public a d(@j0 final s0<?> a) {
            this.a = a;
            return this;
        }
    }
}
