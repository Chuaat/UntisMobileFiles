// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity.result;

import androidx.annotation.g0;
import androidx.annotation.k0;
import androidx.core.app.c;
import android.annotation.SuppressLint;
import androidx.annotation.j0;
import androidx.activity.result.contract.a;

public abstract class d<I>
{
    @j0
    public abstract a<I, ?> a();
    
    public void b(@SuppressLint({ "UnknownNullness" }) final I n) {
        this.c(n, null);
    }
    
    public abstract void c(@SuppressLint({ "UnknownNullness" }) final I p0, @k0 final c p1);
    
    @g0
    public abstract void d();
}
