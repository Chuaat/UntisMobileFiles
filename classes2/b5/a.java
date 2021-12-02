// 
// Decompiled by Procyon v0.5.36
// 

package b5;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.s5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "Lb5/a;", "Lio/realm/p0;", "", "id", "J", "t8", "()J", "v8", "(J)V", "Lio/realm/l0;", "Lb5/b;", "days", "Lio/realm/l0;", "s8", "()Lio/realm/l0;", "u8", "(Lio/realm/l0;)V", "<init>", "(JLio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements s5
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private l0<b> K;
    
    public a() {
        this(0L, null, 3, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, @org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "days");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.p2(l0);
    }
    
    @Override
    public l0 P7() {
        return this.K;
    }
    
    @Override
    public long a() {
        return this.J;
    }
    
    @Override
    public void b(final long j) {
        this.J = j;
    }
    
    @Override
    public void p2(final l0 k) {
        this.K = (l0<b>)k;
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> s8() {
        return (l0<b>)this.P7();
    }
    
    public final long t8() {
        return this.a();
    }
    
    public final void u8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.p2(l0);
    }
    
    public final void v8(final long n) {
        this.b(n);
    }
}
