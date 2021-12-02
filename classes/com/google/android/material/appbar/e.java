// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.appbar;

import androidx.core.view.j0;
import android.view.View;

class e
{
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    
    public e(final View a) {
        this.f = true;
        this.g = true;
        this.a = a;
    }
    
    void a() {
        final View a = this.a;
        j0.d1(a, this.d - (a.getTop() - this.b));
        final View a2 = this.a;
        j0.c1(a2, this.e - (a2.getLeft() - this.c));
    }
    
    public int b() {
        return this.c;
    }
    
    public int c() {
        return this.b;
    }
    
    public int d() {
        return this.e;
    }
    
    public int e() {
        return this.d;
    }
    
    public boolean f() {
        return this.g;
    }
    
    public boolean g() {
        return this.f;
    }
    
    void h() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }
    
    public void i(final boolean g) {
        this.g = g;
    }
    
    public boolean j(final int e) {
        if (this.g && this.e != e) {
            this.e = e;
            this.a();
            return true;
        }
        return false;
    }
    
    public boolean k(final int d) {
        if (this.f && this.d != d) {
            this.d = d;
            this.a();
            return true;
        }
        return false;
    }
    
    public void l(final boolean f) {
        this.f = f;
    }
}
