// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class jc extends IllegalArgumentException
{
    jc(final int i, final int j) {
        final StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(j);
        super(sb.toString());
    }
}
