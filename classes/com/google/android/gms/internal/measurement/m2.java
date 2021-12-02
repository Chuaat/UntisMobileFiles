// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class m2 implements ThreadFactory
{
    private final ThreadFactory G;
    
    m2(final j3 j3) {
        this.G = Executors.defaultThreadFactory();
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.G.newThread(runnable);
        thread.setName("ScionFrontendApi");
        return thread;
    }
}
