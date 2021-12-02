// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class nc extends j
{
    private final od I;
    
    public nc(final String s, final od i) {
        super("internal.remoteConfig");
        this.I = i;
        super.H.put("getValue", new mb(this, "getValue", i));
    }
    
    @Override
    public final q a(final g5 g5, final List<q> list) {
        return q.f;
    }
}
