// 
// Decompiled by Procyon v0.5.36
// 

package r4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.a3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "Lr4/a;", "Lio/realm/p0;", "Lio/realm/l0;", "Lr4/d;", "absences", "Lio/realm/l0;", "s8", "()Lio/realm/l0;", "v8", "(Lio/realm/l0;)V", "Lr4/b;", "events", "t8", "w8", "", "klassenId", "J", "u8", "()J", "x8", "(J)V", "<init>", "(JLio/realm/l0;Lio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements a3
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private l0<b> K;
    @org.jetbrains.annotations.e
    private l0<d> L;
    
    public a() {
        this(0L, null, null, 7, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, @org.jetbrains.annotations.e final l0<b> l0, @org.jetbrains.annotations.e final l0<d> l2) {
        k0.p(l0, "events");
        k0.p(l2, "absences");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.h1(n);
        this.o0(l0);
        this.x0(l2);
    }
    
    @Override
    public long E0() {
        return this.J;
    }
    
    @Override
    public l0 V() {
        return this.L;
    }
    
    @Override
    public l0 X() {
        return this.K;
    }
    
    @Override
    public void h1(final long j) {
        this.J = j;
    }
    
    @Override
    public void o0(final l0 k) {
        this.K = (l0<b>)k;
    }
    
    @org.jetbrains.annotations.e
    public final l0<d> s8() {
        return (l0<d>)this.V();
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> t8() {
        return (l0<b>)this.X();
    }
    
    public final long u8() {
        return this.E0();
    }
    
    public final void v8(@org.jetbrains.annotations.e final l0<d> l0) {
        k0.p(l0, "<set-?>");
        this.x0(l0);
    }
    
    public final void w8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.o0(l0);
    }
    
    @Override
    public void x0(final l0 l) {
        this.L = (l0<d>)l;
    }
    
    public final void x8(final long n) {
        this.h1(n);
    }
}
