// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

final class f0 implements h0
{
    private f0() {
    }
    
    @Override
    public final byte[] a(final byte[] original, final int from, final int n) {
        return Arrays.copyOfRange(original, from, n + from);
    }
}
