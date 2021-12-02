// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.unsafe;

public final class p
{
    private p() {
        throw new IllegalStateException("No instances!");
    }
    
    public static boolean a(final int n) {
        return (n & n - 1) == 0x0;
    }
    
    public static int b(final int n) {
        return 1 << 32 - Integer.numberOfLeadingZeros(n - 1);
    }
}
