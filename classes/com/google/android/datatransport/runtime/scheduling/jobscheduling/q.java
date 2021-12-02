// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Iterator;
import com.google.android.datatransport.runtime.o;
import e6.a;
import b2.b;
import com.google.android.datatransport.runtime.scheduling.persistence.c;
import java.util.concurrent.Executor;

public class q
{
    private final Executor a;
    private final c b;
    private final s c;
    private final b d;
    
    @a
    q(final Executor a, final c b, final s c, final b d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void c() {
        this.a.execute(new p(this));
    }
}
