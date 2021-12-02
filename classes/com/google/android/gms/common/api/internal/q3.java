// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.j0;
import com.google.android.gms.tasks.m;
import com.google.android.gms.tasks.n;
import com.google.android.gms.tasks.f;

final class q3 implements f<Object>
{
    private final /* synthetic */ n a;
    private final /* synthetic */ o3 b;
    
    q3(final o3 b, final n a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(@j0 final m<Object> m) {
        this.b.b.remove(this.a);
    }
}
