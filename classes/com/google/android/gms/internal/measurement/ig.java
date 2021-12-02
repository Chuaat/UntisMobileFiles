// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class ig extends j
{
    private final gg I;
    
    public ig(final gg i) {
        super("internal.logger");
        this.I = i;
        super.H.put("log", new hg(this, false, true));
        super.H.put("silent", new pe(this, "silent"));
        super.H.get("silent").f("log", new hg(this, true, true));
        super.H.put("unmonitored", new qf(this, "unmonitored"));
        super.H.get("unmonitored").f("log", new hg(this, false, false));
    }
    
    @Override
    public final q a(final g5 g5, final List<q> list) {
        return q.f;
    }
}
