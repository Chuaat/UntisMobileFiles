// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.base;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;

public interface m
{
    ExecutorService a(final int p0, final int p1);
    
    ExecutorService b(final int p0, final ThreadFactory p1, final int p2);
    
    ExecutorService c(final ThreadFactory p0, final int p1);
}
