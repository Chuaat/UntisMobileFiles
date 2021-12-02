// 
// Decompiled by Procyon v0.5.36
// 

package org.apmem.tools.layouts;

import java.util.ArrayList;
import android.view.View;
import java.util.List;

class c
{
    private final List<View> a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    public c(final int b) {
        this.a = new ArrayList<View>();
        this.e = 0;
        this.f = 0;
        this.b = b;
    }
    
    public void a(final int n, final View view) {
        final FlowLayout.a a = (FlowLayout.a)view.getLayoutParams();
        this.a.add(n, view);
        this.c = this.c + a.g() + a.h();
        this.d = Math.max(this.d, a.j() + a.i());
    }
    
    public void b(final View view) {
        this.a(this.a.size(), view);
    }
    
    public boolean c(final View view) {
        final FlowLayout.a a = (FlowLayout.a)view.getLayoutParams();
        return this.c + a.g() + a.h() <= this.b;
    }
    
    public int d() {
        return this.c;
    }
    
    public int e() {
        return this.f;
    }
    
    public int f() {
        return this.e;
    }
    
    public int g() {
        return this.d;
    }
    
    public List<View> h() {
        return this.a;
    }
    
    public void i(final int c) {
        this.c = c;
    }
    
    public void j(final int f) {
        this.f = f;
    }
    
    public void k(final int e) {
        this.e = e;
    }
    
    public void l(final int d) {
        this.d = d;
    }
}
