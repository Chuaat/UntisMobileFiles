// 
// Decompiled by Procyon v0.5.36
// 

package b6;

public class a<F, S>
{
    public F a;
    public S b;
    
    public a(final F a, final S b) {
        this.a = a;
        this.b = b;
    }
    
    public static <A, B> a<A, B> a(final A a, final B b) {
        return new a<A, B>(a, b);
    }
    
    private boolean b(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof a;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final a a = (a)o;
        boolean b3 = b2;
        if (this.b(a.a, this.a)) {
            b3 = b2;
            if (this.b(a.b, this.b)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        final F a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final S b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.a));
        sb.append(" ");
        sb.append(String.valueOf(this.b));
        sb.append("}");
        return sb.toString();
    }
}
