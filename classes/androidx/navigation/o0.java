// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import androidx.annotation.j0;
import androidx.annotation.b;
import androidx.annotation.a;
import androidx.annotation.y;

public final class o0
{
    private boolean a;
    @y
    private int b;
    private boolean c;
    @androidx.annotation.a
    @b
    private int d;
    @androidx.annotation.a
    @b
    private int e;
    @androidx.annotation.a
    @b
    private int f;
    @androidx.annotation.a
    @b
    private int g;
    
    o0(final boolean a, @y final int b, final boolean c, @androidx.annotation.a @b final int d, @androidx.annotation.a @b final int e, @androidx.annotation.a @b final int f, @androidx.annotation.a @b final int g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @androidx.annotation.a
    @b
    public int a() {
        return this.d;
    }
    
    @androidx.annotation.a
    @b
    public int b() {
        return this.e;
    }
    
    @androidx.annotation.a
    @b
    public int c() {
        return this.f;
    }
    
    @androidx.annotation.a
    @b
    public int d() {
        return this.g;
    }
    
    @y
    public int e() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && o0.class == o.getClass()) {
            final o0 o2 = (o0)o;
            if (this.a != o2.a || this.b != o2.b || this.c != o2.c || this.d != o2.d || this.e != o2.e || this.f != o2.f || this.g != o2.g) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public boolean f() {
        return this.c;
    }
    
    public boolean g() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        return ((((((this.g() ? 1 : 0) * 31 + this.e()) * 31 + (this.f() ? 1 : 0)) * 31 + this.a()) * 31 + this.b()) * 31 + this.c()) * 31 + this.d();
    }
    
    public static final class a
    {
        boolean a;
        @y
        int b;
        boolean c;
        @androidx.annotation.a
        @b
        int d;
        @androidx.annotation.a
        @b
        int e;
        @androidx.annotation.a
        @b
        int f;
        @androidx.annotation.a
        @b
        int g;
        
        public a() {
            this.b = -1;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
        }
        
        @j0
        public o0 a() {
            return new o0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        
        @j0
        public a b(@androidx.annotation.a @b final int d) {
            this.d = d;
            return this;
        }
        
        @j0
        public a c(@androidx.annotation.a @b final int e) {
            this.e = e;
            return this;
        }
        
        @j0
        public a d(final boolean a) {
            this.a = a;
            return this;
        }
        
        @j0
        public a e(@androidx.annotation.a @b final int f) {
            this.f = f;
            return this;
        }
        
        @j0
        public a f(@androidx.annotation.a @b final int g) {
            this.g = g;
            return this;
        }
        
        @j0
        public a g(@y final int b, final boolean c) {
            this.b = b;
            this.c = c;
            return this;
        }
    }
}
