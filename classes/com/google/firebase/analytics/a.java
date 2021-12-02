// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

final class a extends ThreadPoolExecutor
{
    a(final FirebaseAnalytics firebaseAnalytics, final int n, final int n2, final long n3, final TimeUnit unit, final BlockingQueue workQueue) {
        super(0, 1, 30L, unit, workQueue);
    }
}
