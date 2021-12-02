// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.n;
import com.google.android.gms.clearcut.g;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.api.internal.b;
import androidx.annotation.j0;
import android.content.Context;
import com.google.android.gms.clearcut.d;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.j;

public final class e3 extends j<com.google.android.gms.common.api.a.d.d> implements d
{
    @d0
    private e3(@j0 final Context context) {
        super(context, (a<com.google.android.gms.common.api.a.d>)com.google.android.gms.clearcut.a.p, null, new b());
    }
    
    public static d A(@j0 final Context context) {
        return new e3(context);
    }
    
    @Override
    public final n<Status> a(final g g) {
        return ((j<com.google.android.gms.common.api.a.d>)this).f((n<Status>)new h6(g, this.c()));
    }
}
