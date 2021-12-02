// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

public final class jg extends j
{
    private final Callable<Object> I;
    
    public jg(final String s, final Callable<Object> i) {
        super("internal.appMetadata");
        this.I = i;
    }
    
    @Override
    public final q a(final g5 g5, final List<q> list) {
        try {
            return i7.b(this.I.call());
        }
        catch (Exception ex) {
            return q.f;
        }
    }
}
