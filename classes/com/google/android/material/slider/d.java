// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.slider;

import androidx.annotation.j0;
import java.util.Locale;

public final class d implements e
{
    private static final long d = 1000000000000L;
    private static final int e = 1000000000;
    private static final int f = 1000000;
    private static final int g = 1000;
    
    @j0
    @Override
    public String a(final float f) {
        if (f >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", f / 1.0E12f);
        }
        if (f >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", f / 1.0E9f);
        }
        if (f >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", f / 1000000.0f);
        }
        if (f >= 1000.0f) {
            return String.format(Locale.US, "%.1fK", f / 1000.0f);
        }
        return String.format(Locale.US, "%.0f", f);
    }
}
