// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.List;

public final class l9 extends RuntimeException
{
    private final List<String> G;
    
    public l9(final z7 z7) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.G = null;
    }
}
