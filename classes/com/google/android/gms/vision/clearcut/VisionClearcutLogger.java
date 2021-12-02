// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.m3;
import com.google.android.gms.vision.e;
import com.google.android.gms.internal.vision.b6;
import com.google.android.gms.internal.vision.q3;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import com.google.android.gms.clearcut.a;
import androidx.annotation.Keep;

@Keep
public class VisionClearcutLogger
{
    private final a zza;
    private boolean zzb;
    
    public VisionClearcutLogger(@RecentlyNonNull final Context context) {
        this.zzb = true;
        this.zza = new a(context, "VISION", null);
    }
    
    public final void zza(final int i, final q3.o o) {
        final byte[] d = o.d();
        if (i >= 0) {
            if (i <= 3) {
                try {
                    if (this.zzb) {
                        this.zza.b(d).b(i).a();
                        return;
                    }
                    final q3.o.a f = q3.o.F();
                    try {
                        f.f(d, 0, d.length, b6.e());
                        e.c("Would have logged:\n%s", f.toString());
                        return;
                    }
                    catch (Exception ex) {
                        e.d(ex, "Parsing error", new Object[0]);
                        return;
                    }
                }
                catch (Exception ex2) {
                    m3.b(ex2);
                    e.d(ex2, "Failed to log", new Object[0]);
                    return;
                }
            }
        }
        e.e("Illegal event code: %d", i);
    }
}
