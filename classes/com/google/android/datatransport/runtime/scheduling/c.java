// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.n;
import com.google.android.datatransport.runtime.i;
import com.google.android.datatransport.j;
import com.google.android.datatransport.runtime.o;
import e6.a;
import com.google.android.datatransport.runtime.t;
import b2.b;
import java.util.concurrent.Executor;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.logging.Logger;

public class c implements e
{
    private static final Logger f;
    private final s a;
    private final Executor b;
    private final com.google.android.datatransport.runtime.backends.e c;
    private final com.google.android.datatransport.runtime.scheduling.persistence.c d;
    private final b e;
    
    static {
        f = Logger.getLogger(t.class.getName());
    }
    
    @a
    public c(final Executor b, final com.google.android.datatransport.runtime.backends.e c, final s a, final com.google.android.datatransport.runtime.scheduling.persistence.c d, final b e) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public void a(final o o, final i i, final j j) {
        this.b.execute(new com.google.android.datatransport.runtime.scheduling.b(this, o, j, i));
    }
}
