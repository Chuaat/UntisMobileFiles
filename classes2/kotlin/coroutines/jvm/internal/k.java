// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import kotlin.e1;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B!\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0011J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001c\u0010\f\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012" }, d2 = { "Lkotlin/coroutines/jvm/internal/k;", "Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/jvm/internal/d0;", "", "Lkotlin/coroutines/jvm/internal/n;", "", "toString", "", "G", "I", "getArity", "()I", "arity", "Lkotlin/coroutines/d;", "completion", "<init>", "(ILkotlin/coroutines/d;)V", "(I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public abstract class k extends j implements d0<Object>, n
{
    private final int G;
    
    public k(final int n) {
        this(n, null);
    }
    
    public k(final int g, @f final d<Object> d) {
        super(d);
        this.G = g;
    }
    
    @Override
    public int getArity() {
        return this.G;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        String s;
        if (this.getCompletion() == null) {
            s = k1.t(this);
            k0.o(s, "Reflection.renderLambdaToString(this)");
        }
        else {
            s = super.toString();
        }
        return s;
    }
}
