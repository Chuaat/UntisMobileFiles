// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import androidx.annotation.k0;
import androidx.annotation.j0;

public class n<TResult>
{
    private final l0<TResult> a;
    
    public n() {
        this.a = new l0<TResult>();
    }
    
    public n(@j0 final a a) {
        this.a = new l0<TResult>();
        a.b(new com.google.android.gms.tasks.j0(this));
    }
    
    @j0
    public m<TResult> a() {
        return this.a;
    }
    
    public void b(@j0 final Exception ex) {
        this.a.y(ex);
    }
    
    public void c(@k0 final TResult tResult) {
        this.a.z(tResult);
    }
    
    public boolean d(@j0 final Exception ex) {
        return this.a.C(ex);
    }
    
    public boolean e(@k0 final TResult tResult) {
        return this.a.D(tResult);
    }
}
