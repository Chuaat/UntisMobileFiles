// 
// Decompiled by Procyon v0.5.36
// 

package i4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.realm.b;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.m1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\t¨\u0006\u0019" }, d2 = { "Li4/d;", "Lio/realm/p0;", "Lio/realm/l0;", "Lcom/untis/mobile/persistence/realm/b;", "students", "Lio/realm/l0;", "v8", "()Lio/realm/l0;", "z8", "(Lio/realm/l0;)V", "absences", "s8", "w8", "", "klasseId", "J", "u8", "()J", "y8", "(J)V", "events", "t8", "x8", "<init>", "(JLio/realm/l0;Lio/realm/l0;Lio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class d extends p0 implements m1
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private l0<b> K;
    @org.jetbrains.annotations.e
    private l0<b> L;
    @org.jetbrains.annotations.e
    private l0<b> M;
    
    public d() {
        this(0L, null, null, null, 15, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public d(final long n, @org.jetbrains.annotations.e final l0<b> l0, @org.jetbrains.annotations.e final l0<b> l2, @org.jetbrains.annotations.e final l0<b> l3) {
        k0.p(l0, "students");
        k0.p(l2, "events");
        k0.p(l3, "absences");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.M0(n);
        this.C0(l0);
        this.o0(l2);
        this.x0(l3);
    }
    
    @Override
    public void C0(final l0 k) {
        this.K = (l0<b>)k;
    }
    
    @Override
    public long F1() {
        return this.J;
    }
    
    @Override
    public void M0(final long j) {
        this.J = j;
    }
    
    @Override
    public l0 V() {
        return this.M;
    }
    
    @Override
    public l0 X() {
        return this.L;
    }
    
    @Override
    public void o0(final l0 l) {
        this.L = (l0<b>)l;
    }
    
    @Override
    public l0 p0() {
        return this.K;
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> s8() {
        return (l0<b>)this.V();
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> t8() {
        return (l0<b>)this.X();
    }
    
    public final long u8() {
        return this.F1();
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> v8() {
        return (l0<b>)this.p0();
    }
    
    public final void w8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.x0(l0);
    }
    
    @Override
    public void x0(final l0 m) {
        this.M = (l0<b>)m;
    }
    
    public final void x8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.o0(l0);
    }
    
    public final void y8(final long n) {
        this.M0(n);
    }
    
    public final void z8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.C0(l0);
    }
}
