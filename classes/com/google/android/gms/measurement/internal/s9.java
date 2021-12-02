// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class s9 implements p3
{
    final /* synthetic */ String a;
    final /* synthetic */ z9 b;
    
    s9(final z9 b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final int n, final Throwable t, final byte[] array, final Map<String, List<String>> map) {
        this.b.l(n, t, array, this.a);
    }
}
