// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0005R\u0016\u0010\u0007\u001a\u00020\u00008&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n" }, d2 = { "Lkotlinx/coroutines/w2;", "Lkotlinx/coroutines/m0;", "", "toString", "S", "M", "()Lkotlinx/coroutines/w2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class w2 extends m0
{
    @e
    public abstract w2 M();
    
    @f2
    @f
    protected final String S() {
        final w2 e = i1.e();
        if (this == e) {
            return "Dispatchers.Main";
        }
        w2 m;
        try {
            m = e.M();
        }
        catch (UnsupportedOperationException ex) {
            m = null;
        }
        if (this == m) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
    
    @e
    @Override
    public String toString() {
        String s = this.S();
        if (s == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(x0.a(this));
            sb.append('@');
            sb.append(x0.b(this));
            s = sb.toString();
        }
        return s;
    }
}
