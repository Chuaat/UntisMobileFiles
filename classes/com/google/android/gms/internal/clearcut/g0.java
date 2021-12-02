// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class g0 extends k0
{
    private final int K;
    private final int L;
    
    g0(final byte[] array, final int k, final int l) {
        super(array);
        d0.m(k, k + l, array.length);
        this.K = k;
        this.L = l;
    }
    
    @Override
    public final byte p(final int n) {
        final int size = this.size();
        if ((size - (n + 1) | n) >= 0) {
            return super.J[this.K + n];
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(n);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(n);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
    
    @Override
    public final int size() {
        return this.L;
    }
    
    @Override
    protected final int v() {
        return this.K;
    }
}
