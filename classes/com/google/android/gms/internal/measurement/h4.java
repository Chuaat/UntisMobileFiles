// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class h4 extends f9<i4, h4> implements ta
{
    private h4() {
        super(i4.zza);
    }
    
    public final List<m3> A() {
        return Collections.unmodifiableList((List<? extends m3>)((i4)super.H).E());
    }
    
    public final int v() {
        return ((i4)super.H).w();
    }
    
    public final g4 w(final int n) {
        return ((i4)super.H).z(n);
    }
    
    public final h4 x() {
        if (super.I) {
            this.r();
            super.I = false;
        }
        i4.I((i4)super.H);
        return this;
    }
    
    public final h4 z(final int n, final e4 e4) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        i4.H((i4)super.H, n, ((f9<g4, BuilderType>)e4).n());
        return this;
    }
}
