// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

class l0
{
    public static final int i = Integer.MIN_VALUE;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    
    l0() {
        this.a = 0;
        this.b = 0;
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = false;
    }
    
    public int a() {
        int n;
        if (this.g) {
            n = this.a;
        }
        else {
            n = this.b;
        }
        return n;
    }
    
    public int b() {
        return this.a;
    }
    
    public int c() {
        return this.b;
    }
    
    public int d() {
        int n;
        if (this.g) {
            n = this.b;
        }
        else {
            n = this.a;
        }
        return n;
    }
    
    public void e(final int n, final int n2) {
        this.h = false;
        if (n != Integer.MIN_VALUE) {
            this.e = n;
            this.a = n;
        }
        if (n2 != Integer.MIN_VALUE) {
            this.f = n2;
            this.b = n2;
        }
    }
    
    public void f(final boolean g) {
        if (g == this.g) {
            return;
        }
        this.g = g;
        int b = 0;
        Label_0114: {
            if (this.h) {
                if (g) {
                    int a = this.d;
                    if (a == Integer.MIN_VALUE) {
                        a = this.e;
                    }
                    this.a = a;
                    b = this.c;
                    if (b != Integer.MIN_VALUE) {
                        break Label_0114;
                    }
                }
                else {
                    int a2 = this.c;
                    if (a2 == Integer.MIN_VALUE) {
                        a2 = this.e;
                    }
                    this.a = a2;
                    b = this.d;
                    if (b != Integer.MIN_VALUE) {
                        break Label_0114;
                    }
                }
            }
            else {
                this.a = this.e;
            }
            b = this.f;
        }
        this.b = b;
    }
    
    public void g(final int a, final int b) {
        this.c = a;
        this.d = b;
        this.h = true;
        if (this.g) {
            if (b != Integer.MIN_VALUE) {
                this.a = b;
            }
            if (a != Integer.MIN_VALUE) {
                this.b = a;
            }
        }
        else {
            if (a != Integer.MIN_VALUE) {
                this.a = a;
            }
            if (b != Integer.MIN_VALUE) {
                this.b = b;
            }
        }
    }
}
