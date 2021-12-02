// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import o2.a;
import androidx.core.content.d;
import android.view.accessibility.AccessibilityManager;
import android.os.Build$VERSION;

class f implements d, g, TimePickerView.f, ClockHandView.c, h
{
    private static final String[] L;
    private static final String[] M;
    private static final String[] N;
    private static final int O = 30;
    private static final int P = 6;
    private TimePickerView G;
    private com.google.android.material.timepicker.e H;
    private float I;
    private float J;
    private boolean K;
    
    static {
        L = new String[] { "12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" };
        M = new String[] { "00", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22" };
        N = new String[] { "00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" };
    }
    
    public f(final TimePickerView g, final com.google.android.material.timepicker.e h) {
        this.K = false;
        this.G = g;
        this.H = h;
        this.b();
    }
    
    private int i() {
        int n;
        if (this.H.I == 1) {
            n = 15;
        }
        else {
            n = 30;
        }
        return n;
    }
    
    private String[] j() {
        String[] array;
        if (this.H.I == 1) {
            array = f.M;
        }
        else {
            array = f.L;
        }
        return array;
    }
    
    private void k(int n, final int n2) {
        final com.google.android.material.timepicker.e h = this.H;
        if (h.K != n2 || h.J != n) {
            if (Build$VERSION.SDK_INT >= 21) {
                n = 4;
            }
            else {
                n = 1;
            }
            this.G.performHapticFeedback(n);
        }
    }
    
    private void m() {
        final TimePickerView g = this.G;
        final com.google.android.material.timepicker.e h = this.H;
        g.b(h.M, h.c(), this.H.K);
    }
    
    private void n() {
        this.o(f.L, "%d");
        this.o(f.M, "%d");
        this.o(f.N, "%02d");
    }
    
    private void o(final String[] array, final String s) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = com.google.android.material.timepicker.e.b(this.G.getResources(), array[i], s);
        }
    }
    
    @Override
    public void a() {
        this.G.setVisibility(0);
    }
    
    @Override
    public void b() {
        if (this.H.I == 0) {
            this.G.W();
        }
        this.G.L(this);
        this.G.T((TimePickerView.g)this);
        this.G.S((TimePickerView.f)this);
        this.G.Q(this);
        this.n();
        this.c();
    }
    
    @Override
    public void c() {
        this.J = (float)(this.H.c() * this.i());
        final com.google.android.material.timepicker.e h = this.H;
        this.I = (float)(h.K * 6);
        this.l(h.L, false);
        this.m();
    }
    
    @Override
    public void d(final float a, final boolean b) {
        if (this.K) {
            return;
        }
        final com.google.android.material.timepicker.e h = this.H;
        final int j = h.J;
        final int k = h.K;
        final int round = Math.round(a);
        final com.google.android.material.timepicker.e h2 = this.H;
        if (h2.L == 12) {
            h2.i((round + 3) / 6);
            this.I = (float)Math.floor(this.H.K * 6);
        }
        else {
            this.H.g((round + this.i() / 2) / this.i());
            this.J = (float)(this.H.c() * this.i());
        }
        if (!b) {
            this.m();
            this.k(j, k);
        }
    }
    
    @Override
    public void e(final float a, final boolean b) {
        this.K = true;
        final com.google.android.material.timepicker.e h = this.H;
        final int k = h.K;
        final int j = h.J;
        if (h.L == 10) {
            this.G.N(this.J, false);
            if (!androidx.core.content.d.o(this.G.getContext(), AccessibilityManager.class).isTouchExplorationEnabled()) {
                this.l(12, true);
            }
        }
        else {
            final int round = Math.round(a);
            if (!b) {
                this.H.i((round + 15) / 30 * 5);
                this.I = (float)(this.H.K * 6);
            }
            this.G.N(this.I, b);
        }
        this.K = false;
        this.m();
        this.k(j, k);
    }
    
    @Override
    public void f(final int n) {
        this.H.j(n);
    }
    
    @Override
    public void g(final int n) {
        this.l(n, true);
    }
    
    @Override
    public void h() {
        this.G.setVisibility(8);
    }
    
    void l(final int l, final boolean b) {
        final boolean b2 = l == 12;
        this.G.M(b2);
        this.H.L = l;
        final TimePickerView g = this.G;
        String[] array;
        if (b2) {
            array = f.N;
        }
        else {
            array = this.j();
        }
        int n;
        if (b2) {
            n = a.m.V;
        }
        else {
            n = a.m.T;
        }
        g.c(array, n);
        final TimePickerView g2 = this.G;
        float n2;
        if (b2) {
            n2 = this.I;
        }
        else {
            n2 = this.J;
        }
        g2.N(n2, b);
        this.G.a(l);
        this.G.P(new a(this.G.getContext(), a.m.S));
        this.G.O(new a(this.G.getContext(), a.m.U));
    }
}
