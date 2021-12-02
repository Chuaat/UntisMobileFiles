// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

public abstract class z0 implements y0
{
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y0)) {
            return false;
        }
        final y0 y0 = (y0)o;
        return this.d() == y0.d() && this.c() == y0.c() && this.a().equals(y0.a());
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.c().hashCode();
        final boolean v = f1.v(this.a());
        final int n = hashCode * 31;
        int n2;
        if (v) {
            n2 = n + 19;
        }
        else {
            int hashCode2;
            if (this.d()) {
                hashCode2 = 17;
            }
            else {
                hashCode2 = this.a().hashCode();
            }
            n2 = n + hashCode2;
        }
        return n2;
    }
    
    @Override
    public String toString() {
        if (this.d()) {
            return "*";
        }
        if (this.c() == k1.K) {
            return this.a().toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.c());
        sb.append(" ");
        sb.append(this.a());
        return sb.toString();
    }
}
