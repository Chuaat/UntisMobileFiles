// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.j2;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001c\u0010\r\u001a\u00020\u00038\u0010@\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00038P@\u0010X\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014" }, d2 = { "Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/s2;", "Lkotlinx/coroutines/b0;", "", "r1", "b", "", "exception", "f", "H", "Z", "B0", "()Z", "handlesException", "C0", "onCancelComplete", "Lkotlinx/coroutines/k2;", "parent", "<init>", "(Lkotlinx/coroutines/k2;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class n2 extends s2 implements b0
{
    private final boolean H;
    
    public n2(@f final k2 k2) {
        super(true);
        this.I0(k2);
        this.H = this.r1();
    }
    
    private final boolean r1() {
        u e0;
        if (!((e0 = this.E0()) instanceof v)) {
            e0 = null;
        }
        final v v = (v)e0;
        if (v != null) {
            s2 s2 = v.K0();
            if (s2 != null) {
                while (!s2.B0()) {
                    u e2;
                    if (!((e2 = s2.E0()) instanceof v)) {
                        e2 = null;
                    }
                    final v v2 = (v)e2;
                    if (v2 == null) {
                        return false;
                    }
                    s2 = v2.K0();
                    if (s2 != null) {
                        continue;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean B0() {
        return this.H;
    }
    
    @Override
    public boolean C0() {
        return true;
    }
    
    @Override
    public boolean b() {
        return this.Q0(j2.a);
    }
    
    @Override
    public boolean f(@e final Throwable t) {
        return this.Q0(new d0(t, false, 2, null));
    }
}
