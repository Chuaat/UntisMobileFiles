// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling;

import x1.i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import android.os.Build$VERSION;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import com.google.android.datatransport.runtime.time.b;
import com.google.android.datatransport.runtime.time.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.persistence.c;
import android.content.Context;

@x1.h
public abstract class h
{
    @i
    static s b(final Context context, final c c, final g g, @b final a a) {
        if (Build$VERSION.SDK_INT >= 21) {
            return new e(context, c, g);
        }
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(context, c, a, g);
    }
    
    @x1.a
    abstract com.google.android.datatransport.runtime.scheduling.e a(final com.google.android.datatransport.runtime.scheduling.c p0);
}
