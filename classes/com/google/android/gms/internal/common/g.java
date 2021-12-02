// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class g implements f
{
    private g() {
    }
    
    @Override
    public final ScheduledExecutorService a(final int n, final int n2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
