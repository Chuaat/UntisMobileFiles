// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.Map;
import com.google.android.gms.internal.measurement.od;

final class p4 implements od
{
    final /* synthetic */ String a;
    final /* synthetic */ q4 b;
    
    p4(final q4 b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final String a(final String s) {
        final Map<Object, String> map = q4.n(this.b).get(this.a);
        if (map != null && map.containsKey(s)) {
            return map.get(s);
        }
        return null;
    }
}
