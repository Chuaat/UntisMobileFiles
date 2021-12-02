// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a" }, d2 = { "Lkotlinx/coroutines/r2;", "Lkotlinx/coroutines/f0;", "Lkotlinx/coroutines/l1;", "Lkotlinx/coroutines/d2;", "Lkotlin/j2;", "dispose", "", "toString", "", "a", "()Z", "isActive", "Lkotlinx/coroutines/s2;", "J", "Lkotlinx/coroutines/s2;", "K0", "()Lkotlinx/coroutines/s2;", "L0", "(Lkotlinx/coroutines/s2;)V", "job", "Lkotlinx/coroutines/x2;", "q", "()Lkotlinx/coroutines/x2;", "list", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class r2 extends f0 implements l1, d2
{
    public s2 J;
    
    @org.jetbrains.annotations.e
    public final s2 K0() {
        final s2 j = this.J;
        if (j == null) {
            k0.S("job");
        }
        return j;
    }
    
    public final void L0(@org.jetbrains.annotations.e final s2 j) {
        this.J = j;
    }
    
    @Override
    public boolean a() {
        return true;
    }
    
    @Override
    public void dispose() {
        final s2 j = this.J;
        if (j == null) {
            k0.S("job");
        }
        j.e1(this);
    }
    
    @f
    @Override
    public x2 q() {
        return null;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(x0.a(this));
        sb.append('@');
        sb.append(x0.b(this));
        sb.append("[job@");
        final s2 j = this.J;
        if (j == null) {
            k0.S("job");
        }
        sb.append(x0.b(j));
        sb.append(']');
        return sb.toString();
    }
}
