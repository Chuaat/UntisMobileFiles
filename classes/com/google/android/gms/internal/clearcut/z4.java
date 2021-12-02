// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class z4 extends IOException
{
    z4(final int i, final int j) {
        final StringBuilder sb = new StringBuilder(108);
        sb.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb.append(i);
        sb.append(" limit ");
        sb.append(j);
        sb.append(").");
        super(sb.toString());
    }
}
