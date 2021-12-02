// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import java.util.Arrays;

final class a0 extends x
{
    private final byte[] g;
    
    a0(final byte[] array) {
        super(Arrays.copyOfRange(array, 0, 25));
        this.g = array;
    }
    
    @Override
    final byte[] y2() {
        return this.g;
    }
}
