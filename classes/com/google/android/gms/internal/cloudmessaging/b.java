// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.cloudmessaging;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public interface b
{
    ScheduledExecutorService a(final int p0, final ThreadFactory p1, final int p2);
    
    ExecutorService b(final ThreadFactory p0, final int p1);
}
