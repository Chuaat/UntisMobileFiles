// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class ub extends RuntimeException
{
    public ub(final sa sa) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
