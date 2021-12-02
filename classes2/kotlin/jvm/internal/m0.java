// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001c\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lkotlin/jvm/internal/m0;", "R", "Lkotlin/jvm/internal/d0;", "Ljava/io/Serializable;", "", "toString", "", "arity", "I", "getArity", "()I", "<init>", "(I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public abstract class m0<R> implements d0<R>, Serializable
{
    private final int arity;
    
    public m0(final int arity) {
        this.arity = arity;
    }
    
    @Override
    public int getArity() {
        return this.arity;
    }
    
    @e
    @Override
    public String toString() {
        final String u = k1.u(this);
        k0.o(u, "Reflection.renderLambdaToString(this)");
        return u;
    }
}
