// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.providers;

import com.google.android.gms.internal.common.j;
import com.google.android.gms.internal.common.e;
import java.util.concurrent.ScheduledExecutorService;

final class b implements a
{
    @Override
    public final ScheduledExecutorService a() {
        return e.a().a(1, j.b);
    }
}
