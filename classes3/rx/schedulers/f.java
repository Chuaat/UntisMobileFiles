// 
// Decompiled by Procyon v0.5.36
// 

package rx.schedulers;

public final class f<T>
{
    private final long a;
    private final T b;
    
    public f(final long a, final T b) {
        this.b = b;
        this.a = a;
    }
    
    public long a() {
        return this.a;
    }
    
    public T b() {
        return this.b;
    }
    
    @Override
    public boolean equals(Object b) {
        final boolean b2 = true;
        if (this == b) {
            return true;
        }
        if (b == null) {
            return false;
        }
        if (!(b instanceof f)) {
            return false;
        }
        final f f = (f)b;
        if (this.a == f.a) {
            b = this.b;
            final T b3 = f.b;
            boolean b4 = b2;
            if (b == b3) {
                return b4;
            }
            if (b != null && b.equals(b3)) {
                b4 = b2;
                return b4;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final T b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return (n + 31) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", this.a, this.b.toString());
    }
}
