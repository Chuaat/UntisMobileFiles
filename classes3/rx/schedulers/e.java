// 
// Decompiled by Procyon v0.5.36
// 

package rx.schedulers;

public class e<T>
{
    private final long a;
    private final T b;
    
    public e(final long a, final T b) {
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
        if (this == b) {
            return true;
        }
        if (b == null) {
            return false;
        }
        if (this.getClass() != b.getClass()) {
            return false;
        }
        final e e = (e)b;
        if (this.a != e.a) {
            return false;
        }
        b = this.b;
        final T b2 = e.b;
        if (b == null) {
            if (b2 != null) {
                return false;
            }
        }
        else if (!b.equals(b2)) {
            return false;
        }
        return true;
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
        final StringBuilder sb = new StringBuilder();
        sb.append("TimeInterval [intervalInMilliseconds=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }
}
