// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class l0 extends x
{
    @Override
    public final q a(final String s, final g5 g5, final List<q> list) {
        if (s == null || s.isEmpty() || !g5.h(s)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", s));
        }
        final q d = g5.d(s);
        if (d instanceof j) {
            return ((j)d).a(g5, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", s));
    }
}
