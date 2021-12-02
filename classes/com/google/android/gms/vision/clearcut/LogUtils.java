// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.clearcut;

import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.vision.e;
import com.google.android.gms.common.wrappers.c;
import java.util.ArrayList;
import com.google.android.gms.internal.vision.oa;
import java.util.List;
import androidx.annotation.k0;
import com.google.android.gms.internal.vision.p6;
import com.google.android.gms.internal.vision.q3;
import android.content.Context;
import androidx.annotation.Keep;

@Keep
public class LogUtils
{
    public static q3.a zza(final Context context) {
        final q3.a.a x = q3.a.F().x(context.getPackageName());
        final String zzb = zzb(context);
        if (zzb != null) {
            x.y(zzb);
        }
        return (q3.a)((p6.b)x).o();
    }
    
    public static q3.o zza(final long n, final int n2, @k0 final String s, final String s2, @k0 final List<q3.n> list, final oa oa) {
        final q3.i.a f = q3.i.F();
        final q3.f.b a = q3.f.F().z(s2).x(n).A(n2);
        a.y(list);
        final ArrayList<q3.f> list2 = new ArrayList<q3.f>();
        list2.add((q3.f)((p6.b)a).o());
        return (q3.o)((p6.b)q3.o.F().x((q3.i)((p6.b)f.z(list2).y((q3.j)((p6.b)q3.j.F().y(oa.H).x(oa.G).z(oa.I).A(oa.J)).o())).o())).o();
    }
    
    @k0
    private static String zzb(final Context context) {
        try {
            return c.a(context).e(context.getPackageName(), 0).versionName;
        }
        catch (PackageManager$NameNotFoundException ex) {
            e.d((Throwable)ex, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }
}
