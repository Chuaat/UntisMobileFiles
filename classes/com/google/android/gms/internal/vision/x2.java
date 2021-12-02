// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

public final class x2
{
    static Object a(final Object o, final int i) {
        if (o != null) {
            return o;
        }
        final StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
