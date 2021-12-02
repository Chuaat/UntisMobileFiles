// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.List;

public final class b4 extends RuntimeException
{
    private final List<String> G;
    
    public b4(final s2 s2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.G = null;
    }
}
