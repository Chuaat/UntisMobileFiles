// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.f;
import com.google.android.gms.common.api.t;
import androidx.annotation.k0;
import java.util.Iterator;
import com.google.android.gms.common.api.b;
import java.util.HashMap;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.WeakHashMap;
import com.google.android.gms.tasks.n;
import java.util.Map;

public final class o3
{
    private final Map<BasePendingResult<?>, Boolean> a;
    private final Map<n<?>, Boolean> b;
    
    public o3() {
        this.a = Collections.synchronizedMap(new WeakHashMap<BasePendingResult<?>, Boolean>());
        this.b = Collections.synchronizedMap(new WeakHashMap<n<?>, Boolean>());
    }
    
    private final void e(final boolean b, final Status status) {
        Object o = this.a;
        synchronized (o) {
            final HashMap<Object, Object> hashMap = new HashMap<Object, Object>(this.a);
            // monitorexit(o)
            Object b2 = this.b;
            synchronized (b2) {
                o = new HashMap<Object, Object>(this.b);
                // monitorexit(b2)
                final Iterator<Map.Entry<?, ?>> iterator = hashMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    b2 = iterator.next();
                    if (b || ((Map.Entry<K, Boolean>)b2).getValue()) {
                        ((BasePendingResult)((Map.Entry)b2).getKey()).l(status);
                    }
                }
                o = ((Map<Object, Object>)o).entrySet().iterator();
                while (((Iterator)o).hasNext()) {
                    b2 = ((Iterator<Map.Entry<BasePendingResult, V>>)o).next();
                    if (b || ((Map.Entry<K, Boolean>)b2).getValue()) {
                        ((n)((Map.Entry)b2).getKey()).d(new b(status));
                    }
                }
            }
        }
    }
    
    final void b(final int n, @k0 final String str) {
        final StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        Label_0041: {
            String str2;
            if (n == 1) {
                str2 = " due to service disconnection.";
            }
            else {
                if (n != 3) {
                    break Label_0041;
                }
                str2 = " due to dead object exception.";
            }
            sb.append(str2);
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        this.e(true, new Status(20, sb.toString()));
    }
    
    final void c(final BasePendingResult<? extends t> basePendingResult, final boolean b) {
        this.a.put(basePendingResult, b);
        basePendingResult.c((com.google.android.gms.common.api.n.a)new n3(this, basePendingResult));
    }
    
    final <TResult> void d(final n<TResult> n, final boolean b) {
        this.b.put(n, b);
        n.a().e((f<TResult>)new q3(this, n));
    }
    
    final boolean f() {
        return !this.a.isEmpty() || !this.b.isEmpty();
    }
    
    public final void h() {
        this.e(false, i.q);
    }
}
