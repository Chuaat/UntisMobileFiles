// 
// Decompiled by Procyon v0.5.36
// 

package s4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.g3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\t¨\u0006\u0019" }, d2 = { "Ls4/b;", "Lio/realm/p0;", "Lio/realm/l0;", "Lcom/untis/mobile/persistence/realm/b;", "klassenIds", "Lio/realm/l0;", "t8", "()Lio/realm/l0;", "x8", "(Lio/realm/l0;)V", "", "id", "J", "s8", "()J", "w8", "(J)V", "subjectId", "u8", "y8", "teacherIds", "v8", "z8", "<init>", "(JJLio/realm/l0;Lio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements g3
{
    @e
    private long J;
    private long K;
    @org.jetbrains.annotations.e
    private l0<com.untis.mobile.persistence.realm.b> L;
    @org.jetbrains.annotations.e
    private l0<com.untis.mobile.persistence.realm.b> M;
    
    public b() {
        this(0L, 0L, null, null, 15, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, final long n2, @org.jetbrains.annotations.e final l0<com.untis.mobile.persistence.realm.b> l0, @org.jetbrains.annotations.e final l0<com.untis.mobile.persistence.realm.b> l2) {
        k0.p(l0, "klassenIds");
        k0.p(l2, "teacherIds");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.u0(n2);
        this.p6(l0);
        this.j3(l2);
    }
    
    @Override
    public l0 N1() {
        return this.L;
    }
    
    @Override
    public long a() {
        return this.J;
    }
    
    @Override
    public long a0() {
        return this.K;
    }
    
    @Override
    public void b(final long j) {
        this.J = j;
    }
    
    @Override
    public void j3(final l0 m) {
        this.M = (l0<com.untis.mobile.persistence.realm.b>)m;
    }
    
    @Override
    public l0 p5() {
        return this.M;
    }
    
    @Override
    public void p6(final l0 l) {
        this.L = (l0<com.untis.mobile.persistence.realm.b>)l;
    }
    
    public final long s8() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    public final l0<com.untis.mobile.persistence.realm.b> t8() {
        return (l0<com.untis.mobile.persistence.realm.b>)this.N1();
    }
    
    @Override
    public void u0(final long k) {
        this.K = k;
    }
    
    public final long u8() {
        return this.a0();
    }
    
    @org.jetbrains.annotations.e
    public final l0<com.untis.mobile.persistence.realm.b> v8() {
        return (l0<com.untis.mobile.persistence.realm.b>)this.p5();
    }
    
    public final void w8(final long n) {
        this.b(n);
    }
    
    public final void x8(@org.jetbrains.annotations.e final l0<com.untis.mobile.persistence.realm.b> l0) {
        k0.p(l0, "<set-?>");
        this.p6(l0);
    }
    
    public final void y8(final long n) {
        this.u0(n);
    }
    
    public final void z8(@org.jetbrains.annotations.e final l0<com.untis.mobile.persistence.realm.b> l0) {
        k0.p(l0, "<set-?>");
        this.j3(l0);
    }
}
