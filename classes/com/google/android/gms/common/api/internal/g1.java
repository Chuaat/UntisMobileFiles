// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.ThreadFactory;
import com.google.android.gms.internal.base.q;
import com.google.android.gms.common.util.concurrent.c;
import com.google.android.gms.internal.base.l;
import java.util.concurrent.ExecutorService;

public final class g1
{
    private static final ExecutorService a;
    
    static {
        a = l.a().b(2, new c("GAC_Executor"), q.b);
    }
    
    public static ExecutorService a() {
        return g1.a;
    }
}
