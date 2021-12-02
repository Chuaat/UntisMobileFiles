// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import f2.a;
import android.content.IntentSender$SendIntentException;
import android.util.Log;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import android.app.Activity;

public abstract class r<R extends t> extends v<R>
{
    private final Activity a;
    private final int b;
    
    protected r(@RecentlyNonNull final Activity activity, @RecentlyNonNull final int b) {
        this.a = x.l(activity, "Activity must not be null");
        this.b = b;
    }
    
    @a
    @Override
    public final void b(@RecentlyNonNull final Status status) {
        if (status.j2()) {
            try {
                status.O3(this.a, this.b);
                return;
            }
            catch (IntentSender$SendIntentException ex) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", (Throwable)ex);
                this.d(new Status(8));
                return;
            }
        }
        this.d(status);
    }
    
    @Override
    public abstract void c(@RecentlyNonNull final R p0);
    
    public abstract void d(@RecentlyNonNull final Status p0);
}
