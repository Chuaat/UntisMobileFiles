// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.util.Base64;
import com.google.android.datatransport.runtime.util.a;
import com.google.android.datatransport.runtime.o;
import com.google.android.datatransport.runtime.t;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver
{
    public void onReceive(final Context context, final Intent intent) {
        final String queryParameter = intent.getData().getQueryParameter("backendName");
        final String queryParameter2 = intent.getData().getQueryParameter("extras");
        final int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority"));
        final int int1 = intent.getExtras().getInt("attemptNumber");
        t.f(context);
        final o.a d = o.a().b(queryParameter).d(a.b(intValue));
        if (queryParameter2 != null) {
            d.c(Base64.decode(queryParameter2, 0));
        }
        t.c().e().k(d.a(), int1, b.G);
    }
}
