// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

final class mb extends j
{
    final /* synthetic */ od I;
    
    mb(final nc nc, final String s, final od i) {
        this.I = i;
        super("getValue");
    }
    
    @Override
    public final q a(final g5 g5, final List<q> list) {
        h6.h("getValue", 2, list);
        final q b = g5.b(list.get(0));
        q b2 = g5.b(list.get(1));
        final String a = this.I.a(b.k());
        if (a != null) {
            b2 = new u(a);
        }
        return b2;
    }
}
