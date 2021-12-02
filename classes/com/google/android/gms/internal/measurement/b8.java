// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class b8 extends e8
{
    private final int L;
    
    b8(final byte[] array, final int n, final int l) {
        super(array);
        h8.o(0, l, array.length);
        this.L = l;
    }
    
    @Override
    public final byte b(final int n) {
        final int l = this.L;
        if ((l - (n + 1) | n) >= 0) {
            return super.K[n];
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
        sb2.append(l);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
    
    @Override
    final byte f(final int n) {
        return super.K[n];
    }
    
    @Override
    public final int h() {
        return this.L;
    }
    
    @Override
    protected final int v() {
        return 0;
    }
}
