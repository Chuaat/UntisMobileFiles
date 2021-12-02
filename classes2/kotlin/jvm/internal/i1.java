// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.c;
import kotlin.e1;
import kotlin.reflect.o;

public abstract class i1 extends q implements o
{
    public i1() {
    }
    
    @e1(version = "1.1")
    public i1(final Object o) {
        super(o);
    }
    
    @e1(version = "1.4")
    public i1(final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, (n & 0x1) == 0x1);
    }
    
    @e1(version = "1.1")
    @Override
    public boolean X() {
        return this.b0().X();
    }
    
    @e1(version = "1.1")
    protected o b0() {
        return (o)super.getReflected();
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i1) {
            final i1 i1 = (i1)o;
            if (!this.getOwner().equals(i1.getOwner()) || !this.getName().equals(i1.getName()) || !this.getSignature().equals(i1.getSignature()) || !k0.g(this.getBoundReceiver(), i1.getBoundReceiver())) {
                b = false;
            }
            return b;
        }
        return o instanceof o && o.equals(this.compute());
    }
    
    @Override
    public int hashCode() {
        return (this.getOwner().hashCode() * 31 + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
    }
    
    @e1(version = "1.1")
    @Override
    public boolean p() {
        return this.b0().p();
    }
    
    @Override
    public String toString() {
        final c compute = this.compute();
        if (compute != this) {
            return compute.toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("property ");
        sb.append(this.getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
