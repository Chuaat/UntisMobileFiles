// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.clearcut;

import com.google.android.gms.vision.e;
import com.google.android.gms.internal.vision.q3;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import com.google.android.gms.internal.vision.m5;
import com.google.android.gms.internal.vision.g2;
import java.util.concurrent.ExecutorService;
import androidx.annotation.Keep;

@Keep
public class DynamiteClearcutLogger
{
    private static final ExecutorService zza;
    private b zzb;
    private VisionClearcutLogger zzc;
    
    static {
        zza = g2.a().a(2, m5.a);
    }
    
    public DynamiteClearcutLogger(@RecentlyNonNull final Context context) {
        this.zzb = new b(0.03333333333333333);
        this.zzc = new VisionClearcutLogger(context);
    }
    
    public final void zza(final int n, final q3.o o) {
        if (n == 3 && !this.zzb.a()) {
            e.f("Skipping image analysis log due to rate limiting", new Object[0]);
            return;
        }
        DynamiteClearcutLogger.zza.execute(new a(this, n, o));
    }
}
