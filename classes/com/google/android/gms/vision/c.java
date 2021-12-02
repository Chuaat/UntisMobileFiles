// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision;

import android.util.SparseArray;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public abstract class c<T> implements b<T>
{
    private com.google.android.gms.vision.b<T> G;
    private i<T> H;
    private int I;
    private boolean J;
    private int K;
    private int L;
    
    public c(@RecentlyNonNull final com.google.android.gms.vision.b<T> g, @RecentlyNonNull final i<T> h) {
        this.I = 3;
        this.J = false;
        this.L = 0;
        this.G = g;
        this.H = h;
    }
    
    public abstract int a(@RecentlyNonNull final a<T> p0);
    
    protected final void b(final int n) {
        if (n >= 0) {
            this.I = n;
            return;
        }
        final StringBuilder sb = new StringBuilder(28);
        sb.append("Invalid max gap: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public void o(@RecentlyNonNull final a<T> a) {
        final android.util.SparseArray<T> b = a.b();
        if (b.size() == 0) {
            if (this.L == this.I) {
                this.H.a();
                this.J = false;
            }
            else {
                this.H.b(a);
            }
            ++this.L;
            return;
        }
        this.L = 0;
        if (this.J) {
            final Object value = b.get(this.K);
            if (value != null) {
                this.H.d(a, (T)value);
                return;
            }
            this.H.a();
            this.J = false;
        }
        final int a2 = this.a(a);
        final Object value2 = b.get(a2);
        if (value2 == null) {
            final StringBuilder sb = new StringBuilder(35);
            sb.append("Invalid focus selected: ");
            sb.append(a2);
            Log.w("FocusingProcessor", sb.toString());
            return;
        }
        this.J = true;
        this.K = a2;
        this.G.e(a2);
        this.H.c(this.K, (T)value2);
        this.H.d(a, (T)value2);
    }
    
    @Override
    public void release() {
        this.H.a();
    }
}
