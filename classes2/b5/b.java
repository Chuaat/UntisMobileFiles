// 
// Decompiled by Procyon v0.5.36
// 

package b5;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import io.realm.l0;
import kotlin.Metadata;
import io.realm.q5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "Lb5/b;", "Lio/realm/p0;", "Lio/realm/l0;", "Lb5/c;", "units", "Lio/realm/l0;", "s8", "()Lio/realm/l0;", "u8", "(Lio/realm/l0;)V", "", "weekday", "I", "t8", "()I", "v8", "(I)V", "<init>", "(ILio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements q5
{
    private int J;
    @e
    private l0<c> K;
    
    public b() {
        this(0, null, 3, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final int n, @e final l0<c> l0) {
        k0.p(l0, "units");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.d2(n);
        this.i2(l0);
    }
    
    @Override
    public int E5() {
        return this.J;
    }
    
    @Override
    public l0 O1() {
        return this.K;
    }
    
    @Override
    public void d2(final int j) {
        this.J = j;
    }
    
    @Override
    public void i2(final l0 k) {
        this.K = (l0<c>)k;
    }
    
    @e
    public final l0<c> s8() {
        return (l0<c>)this.O1();
    }
    
    public final int t8() {
        return this.E5();
    }
    
    public final void u8(@e final l0<c> l0) {
        k0.p(l0, "<set-?>");
        this.i2(l0);
    }
    
    public final void v8(final int n) {
        this.d2(n);
    }
}
