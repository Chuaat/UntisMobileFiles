// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class o4 extends IllegalArgumentException
{
    o4(final int i, final int j) {
        final StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(j);
        super(sb.toString());
    }
}
