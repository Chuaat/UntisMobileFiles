// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.c;
import kotlin.e1;
import kotlin.reflect.i;

public class f0 extends q implements d0, i
{
    private final int arity;
    @e1(version = "1.4")
    private final int flags;
    
    public f0(final int n) {
        this(n, q.NO_RECEIVER, null, null, null, 0);
    }
    
    @e1(version = "1.1")
    public f0(final int n, final Object o) {
        this(n, o, null, null, null, 0);
    }
    
    @e1(version = "1.4")
    public f0(final int arity, final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, (n & 0x1) == 0x1);
        this.arity = arity;
        this.flags = n >> 1;
    }
    
    @e1(version = "1.1")
    @Override
    protected c computeReflected() {
        return k1.c(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof f0) {
            final f0 f0 = (f0)o;
            if (!k0.g(this.getOwner(), f0.getOwner()) || !this.getName().equals(f0.getName()) || !this.getSignature().equals(f0.getSignature()) || this.flags != f0.flags || this.arity != f0.arity || !k0.g(this.getBoundReceiver(), f0.getBoundReceiver())) {
                b = false;
            }
            return b;
        }
        return o instanceof i && o.equals(this.compute());
    }
    
    @Override
    public int getArity() {
        return this.arity;
    }
    
    @e1(version = "1.1")
    @Override
    protected i getReflected() {
        return (i)super.getReflected();
    }
    
    @Override
    public int hashCode() {
        int n;
        if (this.getOwner() == null) {
            n = 0;
        }
        else {
            n = this.getOwner().hashCode() * 31;
        }
        return (n + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
    }
    
    @e1(version = "1.1")
    @Override
    public boolean isExternal() {
        return this.getReflected().isExternal();
    }
    
    @e1(version = "1.1")
    @Override
    public boolean isInfix() {
        return this.getReflected().isInfix();
    }
    
    @e1(version = "1.1")
    @Override
    public boolean isInline() {
        return this.getReflected().isInline();
    }
    
    @e1(version = "1.1")
    @Override
    public boolean isOperator() {
        return this.getReflected().isOperator();
    }
    
    @e1(version = "1.1")
    @Override
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }
    
    @Override
    public String toString() {
        final c compute = this.compute();
        if (compute != this) {
            return compute.toString();
        }
        String string;
        if ("<init>".equals(this.getName())) {
            string = "constructor (Kotlin reflection is not available)";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("function ");
            sb.append(this.getName());
            sb.append(" (Kotlin reflection is not available)");
            string = sb.toString();
        }
        return string;
    }
}
