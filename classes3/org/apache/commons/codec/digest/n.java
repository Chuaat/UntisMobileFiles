// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.digest;

import java.util.zip.Checksum;

public class n implements Checksum
{
    private static final int h = 16;
    private static final int i = 13;
    private static final int j = -1640531535;
    private static final int k = -2048144777;
    private static final int l = -1028477379;
    private static final int m = 668265263;
    private static final int n = 374761393;
    private final byte[] a;
    private final int[] b;
    private final byte[] c;
    private final int d;
    private int e;
    private int f;
    private boolean g;
    
    public n() {
        this(0);
    }
    
    public n(final int d) {
        this.a = new byte[1];
        this.b = new int[4];
        this.c = new byte[16];
        this.d = d;
        this.b();
    }
    
    private static int a(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16);
    }
    
    private void b() {
        final int[] b = this.b;
        final int d = this.d;
        b[0] = d - 1640531535 - 2048144777;
        b[1] = -2048144777 + d;
        b[3] = (b[2] = d) + 1640531535;
    }
    
    private void c(final byte[] array, int rotateLeft) {
        final int[] b = this.b;
        final int n = b[0];
        final int n2 = b[1];
        final int n3 = b[2];
        final int n4 = b[3];
        final int rotateLeft2 = Integer.rotateLeft(n + a(array, rotateLeft) * -2048144777, 13);
        final int rotateLeft3 = Integer.rotateLeft(n2 + a(array, rotateLeft + 4) * -2048144777, 13);
        final int rotateLeft4 = Integer.rotateLeft(n3 + a(array, rotateLeft + 8) * -2048144777, 13);
        rotateLeft = Integer.rotateLeft(n4 + a(array, rotateLeft + 12) * -2048144777, 13);
        final int[] b2 = this.b;
        b2[0] = rotateLeft2 * -1640531535;
        b2[1] = rotateLeft3 * -1640531535;
        b2[2] = rotateLeft4 * -1640531535;
        b2[3] = rotateLeft * -1640531535;
        this.g = true;
    }
    
    @Override
    public long getValue() {
        final boolean g = this.g;
        final int n = 0;
        int n2;
        if (g) {
            n2 = Integer.rotateLeft(this.b[0], 1) + Integer.rotateLeft(this.b[1], 7) + Integer.rotateLeft(this.b[2], 12) + Integer.rotateLeft(this.b[3], 18);
        }
        else {
            n2 = this.b[2] + 374761393;
        }
        final int n3 = n2 + this.e;
        final int f = this.f;
        int n4 = n;
        int n5 = n3;
        int n6;
        int i;
        while (true) {
            n6 = n5;
            i = n4;
            if (n4 > f - 4) {
                break;
            }
            n5 = Integer.rotateLeft(n5 + a(this.c, n4) * -1028477379, 17) * 668265263;
            n4 += 4;
        }
        while (i < this.f) {
            n6 = Integer.rotateLeft(n6 + (this.c[i] & 0xFF) * 374761393, 11) * -1640531535;
            ++i;
        }
        final int n7 = (n6 ^ n6 >>> 15) * -2048144777;
        final int n8 = (n7 ^ n7 >>> 13) * -1028477379;
        return (long)(n8 ^ n8 >>> 16) & 0xFFFFFFFFL;
    }
    
    @Override
    public void reset() {
        this.b();
        this.e = 0;
        this.f = 0;
        this.g = false;
    }
    
    @Override
    public void update(final int n) {
        final byte[] a = this.a;
        a[0] = (byte)(n & 0xFF);
        this.update(a, 0, 1);
    }
    
    @Override
    public void update(final byte[] array, int f, int i) {
        if (i <= 0) {
            return;
        }
        this.e += i;
        final int n = f + i;
        final int f2 = this.f;
        if (f2 + i - 16 < 0) {
            System.arraycopy(array, f, this.c, f2, i);
            this.f += i;
            return;
        }
        i = f;
        if (f2 > 0) {
            i = 16 - f2;
            System.arraycopy(array, f, this.c, f2, i);
            this.c(this.c, 0);
            i += f;
        }
        while (i <= n - 16) {
            this.c(array, i);
            i += 16;
        }
        if (i < n) {
            f = n - i;
            this.f = f;
            System.arraycopy(array, i, this.c, 0, f);
        }
        else {
            this.f = 0;
        }
    }
}
