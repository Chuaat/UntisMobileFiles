// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.f;
import android.view.View;
import android.content.Context;
import com.google.android.gms.dynamic.h;

public final class a1 extends h<q0>
{
    private static final a1 c;
    
    static {
        c = new a1();
    }
    
    private a1() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }
    
    public static View c(final Context context, final int n, final int n2) throws a {
        return a1.c.d(context, n, n2);
    }
    
    private final View d(final Context context, final int i, final int j) throws a {
        try {
            return f.y2(this.b(context).Y(f.z2(context), new y0(i, j, null)));
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(j);
            throw new a(sb.toString(), ex);
        }
    }
}
