// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.t;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import com.google.android.gms.common.util.d0;
import java.util.Set;
import com.google.android.gms.common.api.Status;

public final class r2
{
    public static final Status c;
    @d0
    final Set<BasePendingResult<?>> a;
    private final t2 b;
    
    static {
        c = new Status(8, "The connection to Google Play services was lost");
    }
    
    public r2() {
        this.a = Collections.synchronizedSet((Set<BasePendingResult<?>>)Collections.newSetFromMap((Map<T, Boolean>)new WeakHashMap<Object, Boolean>()));
        this.b = new u2(this);
    }
    
    public final void a() {
        final Set<BasePendingResult<?>> a = this.a;
        int i = 0;
        for (BasePendingResult[] array = a.toArray(new BasePendingResult[0]); i < array.length; ++i) {
            final BasePendingResult basePendingResult = array[i];
            basePendingResult.s(null);
            if (basePendingResult.t()) {
                this.a.remove(basePendingResult);
            }
        }
    }
    
    final void b(final BasePendingResult<? extends t> basePendingResult) {
        this.a.add(basePendingResult);
        basePendingResult.s(this.b);
    }
}
