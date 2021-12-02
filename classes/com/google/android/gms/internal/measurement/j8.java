// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.Map;

public final class j8
{
    final Map<String, Callable<? extends j>> a;
    
    public j8() {
        this.a = new HashMap<String, Callable<? extends j>>();
    }
    
    public final void a(final String s, final Callable<? extends j> callable) {
        this.a.put(s, callable);
    }
}
