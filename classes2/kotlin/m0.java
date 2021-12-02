// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.internal.f;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\nH\u0087\b\u001a\u0015\u0010\f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\nH\u0087\b\u001a\u0015\u0010\r\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010\u000f\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0012\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\nH\u0087\b\u001a\u0015\u0010\u0014\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\nH\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010\u0016\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0018\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0019\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u001b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\nH\u0087\b\u001a\u0015\u0010\u001c\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\nH\u0087\b\u001a\u0015\u0010\u001d\u001a\u00020\n*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010\u001e\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010\u001f\u001a\u00020\n*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010 \u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010!\u001a\u00020\n*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\"\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010#\u001a\u00020\n*\u00020\n2\u0006\u0010\u0001\u001a\u00020\nH\u0087\b\u001a\u0015\u0010$\u001a\u00020\n*\u00020\n2\u0006\u0010\u0001\u001a\u00020\nH\u0087\b\u001a\u0015\u0010&\u001a\u00020%*\u00020%2\u0006\u0010\u0001\u001a\u00020%H\u0087\b\u001a\u0015\u0010(\u001a\u00020'*\u00020%2\u0006\u0010\u0001\u001a\u00020'H\u0087\b\u001a\u0015\u0010)\u001a\u00020'*\u00020'2\u0006\u0010\u0001\u001a\u00020%H\u0087\b\u001a\u0015\u0010*\u001a\u00020'*\u00020'2\u0006\u0010\u0001\u001a\u00020'H\u0087\b¨\u0006+" }, d2 = { "", "other", "", "J", "Z", "", "L", "p0", "K", "h0", "", "S", "l0", "P", "c0", "R", "s0", "Q", "k0", "Y", "o0", "M", "a0", "O", "q0", "N", "i0", "T", "m0", "U", "b0", "X", "r0", "V", "j0", "W", "n0", "", "g0", "", "f0", "e0", "d0", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/NumbersKt")
class m0 extends l0
{
    public m0() {
    }
    
    @e1(version = "1.5")
    @f
    private static final int J(final byte b, final byte b2) {
        int n2;
        final int n = n2 = b / b2;
        if ((b ^ b2) < 0) {
            n2 = n;
            if (b2 * n != b) {
                n2 = n - 1;
            }
        }
        return n2;
    }
    
    @e1(version = "1.5")
    @f
    private static final int K(final byte b, final int n) {
        int n3;
        final int n2 = n3 = b / n;
        if ((b ^ n) < 0) {
            n3 = n2;
            if (n * n2 != b) {
                n3 = n2 - 1;
            }
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @f
    private static final int L(final byte b, final short n) {
        int n3;
        final int n2 = n3 = b / n;
        if ((b ^ n) < 0) {
            n3 = n2;
            if (n * n2 != b) {
                n3 = n2 - 1;
            }
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @f
    private static final int M(final int n, final byte b) {
        int n3;
        final int n2 = n3 = n / b;
        if ((n ^ b) < 0) {
            n3 = n2;
            if (b * n2 != n) {
                n3 = n2 - 1;
            }
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @f
    private static final int N(final int n, final int n2) {
        int n4;
        final int n3 = n4 = n / n2;
        if ((n ^ n2) < 0) {
            n4 = n3;
            if (n2 * n3 != n) {
                n4 = n3 - 1;
            }
        }
        return n4;
    }
    
    @e1(version = "1.5")
    @f
    private static final int O(final int n, final short n2) {
        int n4;
        final int n3 = n4 = n / n2;
        if ((n ^ n2) < 0) {
            n4 = n3;
            if (n2 * n3 != n) {
                n4 = n3 - 1;
            }
        }
        return n4;
    }
    
    @e1(version = "1.5")
    @f
    private static final int P(final short n, final byte b) {
        int n3;
        final int n2 = n3 = n / b;
        if ((n ^ b) < 0) {
            n3 = n2;
            if (b * n2 != n) {
                n3 = n2 - 1;
            }
        }
        return n3;
    }
    
    @e1(version = "1.5")
    @f
    private static final int Q(final short n, final int n2) {
        int n4;
        final int n3 = n4 = n / n2;
        if ((n ^ n2) < 0) {
            n4 = n3;
            if (n2 * n3 != n) {
                n4 = n3 - 1;
            }
        }
        return n4;
    }
    
    @e1(version = "1.5")
    @f
    private static final int R(final short n, final short n2) {
        int n4;
        final int n3 = n4 = n / n2;
        if ((n ^ n2) < 0) {
            n4 = n3;
            if (n2 * n3 != n) {
                n4 = n3 - 1;
            }
        }
        return n4;
    }
    
    @e1(version = "1.5")
    @f
    private static final long S(final byte b, final long n) {
        final long n2 = b;
        long n4;
        final long n3 = n4 = n2 / n;
        if ((n2 ^ n) < 0L) {
            n4 = n3;
            if (n * n3 != n2) {
                n4 = n3 - 1L;
            }
        }
        return n4;
    }
    
    @e1(version = "1.5")
    @f
    private static final long T(final int n, final long n2) {
        final long n3 = n;
        long n5;
        final long n4 = n5 = n3 / n2;
        if ((n3 ^ n2) < 0L) {
            n5 = n4;
            if (n2 * n4 != n3) {
                n5 = n4 - 1L;
            }
        }
        return n5;
    }
    
    @e1(version = "1.5")
    @f
    private static final long U(final long n, final byte b) {
        final long n2 = b;
        long n4;
        final long n3 = n4 = n / n2;
        if ((n ^ n2) < 0L) {
            n4 = n3;
            if (n2 * n3 != n) {
                n4 = n3 - 1L;
            }
        }
        return n4;
    }
    
    @e1(version = "1.5")
    @f
    private static final long V(final long n, final int n2) {
        final long n3 = n2;
        long n5;
        final long n4 = n5 = n / n3;
        if ((n ^ n3) < 0L) {
            n5 = n4;
            if (n3 * n4 != n) {
                n5 = n4 - 1L;
            }
        }
        return n5;
    }
    
    @e1(version = "1.5")
    @f
    private static final long W(final long n, final long n2) {
        long n4;
        final long n3 = n4 = n / n2;
        if ((n ^ n2) < 0L) {
            n4 = n3;
            if (n2 * n3 != n) {
                n4 = n3 - 1L;
            }
        }
        return n4;
    }
    
    @e1(version = "1.5")
    @f
    private static final long X(final long n, final short n2) {
        final long n3 = n2;
        long n5;
        final long n4 = n5 = n / n3;
        if ((n ^ n3) < 0L) {
            n5 = n4;
            if (n3 * n4 != n) {
                n5 = n4 - 1L;
            }
        }
        return n5;
    }
    
    @e1(version = "1.5")
    @f
    private static final long Y(final short n, final long n2) {
        final long n3 = n;
        long n5;
        final long n4 = n5 = n3 / n2;
        if ((n3 ^ n2) < 0L) {
            n5 = n4;
            if (n2 * n4 != n3) {
                n5 = n4 - 1L;
            }
        }
        return n5;
    }
    
    @e1(version = "1.5")
    @f
    private static final byte Z(final byte b, final byte b2) {
        final int n = b % b2;
        return (byte)(n + (b2 & ((n ^ b2) & (-n | n)) >> 31));
    }
    
    @e1(version = "1.5")
    @f
    private static final byte a0(int n, final byte b) {
        n %= b;
        return (byte)(n + (b & ((n ^ b) & (-n | n)) >> 31));
    }
    
    @e1(version = "1.5")
    @f
    private static final byte b0(long n, final byte b) {
        final long n2 = b;
        n %= n2;
        return (byte)(n + (n2 & ((n ^ n2) & (-n | n)) >> 63));
    }
    
    @e1(version = "1.5")
    @f
    private static final byte c0(final short n, final byte b) {
        final int n2 = n % b;
        return (byte)(n2 + (b & ((n2 ^ b) & (-n2 | n2)) >> 31));
    }
    
    @e1(version = "1.5")
    @f
    private static final double d0(double n, final double d) {
        final double d2 = n %= d;
        if (d2 != 0.0) {
            n = d2;
            if (Math.signum(d2) != Math.signum(d)) {
                n = d2 + d;
            }
        }
        return n;
    }
    
    @e1(version = "1.5")
    @f
    private static final double e0(double n, final float n2) {
        final double d = n2;
        final double d2 = n %= d;
        if (d2 != 0.0) {
            n = d2;
            if (Math.signum(d2) != Math.signum(d)) {
                n = d2 + d;
            }
        }
        return n;
    }
    
    @e1(version = "1.5")
    @f
    private static final double f0(final float n, final double d) {
        double n2;
        final double d2 = n2 = n % d;
        if (d2 != 0.0) {
            n2 = d2;
            if (Math.signum(d2) != Math.signum(d)) {
                n2 = d2 + d;
            }
        }
        return n2;
    }
    
    @e1(version = "1.5")
    @f
    private static final float g0(float n, final float f) {
        final float f2 = n %= f;
        if (f2 != (float)0.0) {
            n = f2;
            if (Math.signum(f2) != Math.signum(f)) {
                n = f2 + f;
            }
        }
        return n;
    }
    
    @e1(version = "1.5")
    @f
    private static final int h0(final byte b, final int n) {
        final int n2 = b % n;
        return n2 + (n & ((n2 ^ n) & (-n2 | n2)) >> 31);
    }
    
    @e1(version = "1.5")
    @f
    private static final int i0(int n, final int n2) {
        n %= n2;
        return n + (n2 & ((n ^ n2) & (-n | n)) >> 31);
    }
    
    @e1(version = "1.5")
    @f
    private static final int j0(long n, final int n2) {
        final long n3 = n2;
        n %= n3;
        return (int)(n + (n3 & ((n ^ n3) & (-n | n)) >> 63));
    }
    
    @e1(version = "1.5")
    @f
    private static final int k0(final short n, final int n2) {
        final int n3 = n % n2;
        return n3 + (n2 & ((n3 ^ n2) & (-n3 | n3)) >> 31);
    }
    
    @e1(version = "1.5")
    @f
    private static final long l0(final byte b, final long n) {
        final long n2 = b % n;
        return n2 + (n & ((n2 ^ n) & (-n2 | n2)) >> 63);
    }
    
    @e1(version = "1.5")
    @f
    private static final long m0(final int n, final long n2) {
        final long n3 = n % n2;
        return n3 + (n2 & ((n3 ^ n2) & (-n3 | n3)) >> 63);
    }
    
    @e1(version = "1.5")
    @f
    private static final long n0(long n, final long n2) {
        n %= n2;
        return n + (n2 & ((n ^ n2) & (-n | n)) >> 63);
    }
    
    @e1(version = "1.5")
    @f
    private static final long o0(final short n, final long n2) {
        final long n3 = n % n2;
        return n3 + (n2 & ((n3 ^ n2) & (-n3 | n3)) >> 63);
    }
    
    @e1(version = "1.5")
    @f
    private static final short p0(final byte b, final short n) {
        final int n2 = b % n;
        return (short)(n2 + (n & ((n2 ^ n) & (-n2 | n2)) >> 31));
    }
    
    @e1(version = "1.5")
    @f
    private static final short q0(int n, final short n2) {
        n %= n2;
        return (short)(n + (n2 & ((n ^ n2) & (-n | n)) >> 31));
    }
    
    @e1(version = "1.5")
    @f
    private static final short r0(long n, final short n2) {
        final long n3 = n2;
        n %= n3;
        return (short)(n + (n3 & ((n ^ n3) & (-n | n)) >> 63));
    }
    
    @e1(version = "1.5")
    @f
    private static final short s0(final short n, final short n2) {
        final int n3 = n % n2;
        return (short)(n3 + (n2 & ((n3 ^ n2) & (-n3 | n3)) >> 31));
    }
}
