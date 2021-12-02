// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Base64;
import android.net.Uri$Builder;
import com.google.android.datatransport.runtime.o;
import androidx.annotation.b1;
import android.app.AlarmManager;
import com.google.android.datatransport.runtime.scheduling.persistence.c;
import android.content.Context;

public class a implements s
{
    private static final String f = "AlarmManagerScheduler";
    static final String g = "attemptNumber";
    static final String h = "backendName";
    static final String i = "priority";
    static final String j = "extras";
    private final Context a;
    private final c b;
    private AlarmManager c;
    private final g d;
    private final com.google.android.datatransport.runtime.time.a e;
    
    @b1
    a(final Context a, final c b, final AlarmManager c, final com.google.android.datatransport.runtime.time.a e, final g d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    public a(final Context context, final c c, final com.google.android.datatransport.runtime.time.a a, final g g) {
        this(context, c, (AlarmManager)context.getSystemService("alarm"), a, g);
    }
    
    @Override
    public void a(final o o, final int n) {
        this.b(o, n, false);
    }
    
    @Override
    public void b(final o o, final int i, final boolean b) {
        final Uri$Builder uri$Builder = new Uri$Builder();
        uri$Builder.appendQueryParameter("backendName", o.b());
        uri$Builder.appendQueryParameter("priority", String.valueOf(com.google.android.datatransport.runtime.util.a.a(o.d())));
        if (o.c() != null) {
            uri$Builder.appendQueryParameter("extras", Base64.encodeToString(o.c(), 0));
        }
        final Intent intent = new Intent(this.a, (Class)AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(uri$Builder.build());
        intent.putExtra("attemptNumber", i);
        if (!b && this.c(intent)) {
            z1.a.b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", o);
            return;
        }
        final long t4 = this.b.T4(o);
        final long h = this.d.h(o.d(), t4, i);
        z1.a.d("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", o, h, t4, i);
        this.c.set(3, this.e.a() + h, PendingIntent.getBroadcast(this.a, 0, intent, 0));
    }
    
    @b1
    boolean c(final Intent intent) {
        final Context a = this.a;
        boolean b = false;
        if (PendingIntent.getBroadcast(a, 0, intent, 536870912) != null) {
            b = true;
        }
        return b;
    }
}
