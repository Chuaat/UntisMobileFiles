// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Arrays;

final class j5 implements l5
{
    private j5() {
    }
    
    @Override
    public final byte[] a(final byte[] original, final int from, final int n) {
        return Arrays.copyOfRange(original, from, n + from);
    }
}
