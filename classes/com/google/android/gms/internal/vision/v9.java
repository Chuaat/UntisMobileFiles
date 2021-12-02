// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

abstract class v9
{
    abstract int a(final int p0, final byte[] p1, final int p2, final int p3);
    
    abstract int b(final CharSequence p0, final byte[] p1, final int p2, final int p3);
    
    final boolean c(final byte[] array, final int n, final int n2) {
        return this.a(0, array, n, n2) == 0;
    }
    
    abstract String d(final byte[] p0, final int p1, final int p2) throws y6;
}
