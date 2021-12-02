// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.ThreadFactory;
import com.google.android.gms.internal.base.q;
import com.google.android.gms.common.util.concurrent.c;
import com.google.android.gms.internal.base.l;
import java.util.concurrent.ExecutorService;

public final class g2
{
    private static final ExecutorService a;
    
    static {
        a = l.a().c(new c("GAC_Transform"), q.a);
    }
    
    public static ExecutorService a() {
        return g2.a;
    }
}
