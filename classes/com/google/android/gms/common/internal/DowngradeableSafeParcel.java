// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.k0;
import h2.a;

@f2.a
public abstract class DowngradeableSafeParcel extends a implements ReflectedParcelable
{
    private static final Object H;
    @k0
    private static ClassLoader I;
    @k0
    private static Integer J;
    private boolean G;
    
    static {
        H = new Object();
    }
    
    public DowngradeableSafeParcel() {
        this.G = false;
    }
    
    @RecentlyNonNull
    @f2.a
    protected static boolean M(@RecentlyNonNull final String s) {
        N2();
        return true;
    }
    
    @k0
    private static ClassLoader N2() {
        synchronized (DowngradeableSafeParcel.H) {
            // monitorexit(DowngradeableSafeParcel.H)
            return null;
        }
    }
    
    @RecentlyNullable
    @f2.a
    protected static Integer g1() {
        synchronized (DowngradeableSafeParcel.H) {
            // monitorexit(DowngradeableSafeParcel.H)
            return null;
        }
    }
    
    @f2.a
    public void Q1(@RecentlyNonNull final boolean g) {
        this.G = g;
    }
    
    @RecentlyNonNull
    @f2.a
    protected boolean j2() {
        return this.G;
    }
    
    @RecentlyNonNull
    @f2.a
    protected abstract boolean q1(@RecentlyNonNull final int p0);
}
