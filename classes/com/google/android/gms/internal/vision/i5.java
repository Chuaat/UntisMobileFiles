// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class i5 extends q5
{
    private final int L;
    private final int M;
    
    i5(final byte[] array, final int l, final int m) {
        super(array);
        f5.v(l, l + m, array.length);
        this.L = l;
        this.M = m;
    }
    
    @Override
    protected final int D() {
        return this.L;
    }
    
    @Override
    public final byte b(final int n) {
        final int f = this.f();
        if ((f - (n + 1) | n) >= 0) {
            return super.K[this.L + n];
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
        sb2.append(f);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
    
    @Override
    public final int f() {
        return this.M;
    }
    
    @Override
    protected final void q(final byte[] array, final int n, final int n2, final int n3) {
        System.arraycopy(super.K, this.D(), array, 0, n3);
    }
    
    @Override
    final byte r(final int n) {
        return super.K[this.L + n];
    }
}
