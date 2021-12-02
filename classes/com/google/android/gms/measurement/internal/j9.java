// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.c1;
import com.google.android.gms.internal.measurement.a1;
import android.os.Looper;
import android.os.Handler;

public final class j9 extends f4
{
    private Handler c;
    protected final i9 d;
    protected final h9 e;
    protected final f9 f;
    
    j9(final z4 z4) {
        super(z4);
        this.d = new i9(this);
        this.e = new h9(this);
        this.f = new f9(this);
    }
    
    @c1
    private final void p() {
        this.e();
        if (this.c == null) {
            this.c = new a1(Looper.getMainLooper());
        }
    }
    
    @Override
    protected final boolean k() {
        return false;
    }
}
