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
import io.realm.g1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010,\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\t¢\u0006\u0004\b/\u00100R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R(\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\f\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\"\u0010,\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001e¨\u00061" }, d2 = { "Li4/a;", "Lio/realm/p0;", "", "id", "J", "y8", "()J", "I8", "(J)V", "Lio/realm/l0;", "Li4/c;", "prioritizedAttendances", "Lio/realm/l0;", "z8", "()Lio/realm/l0;", "J8", "(Lio/realm/l0;)V", "Lcom/untis/mobile/persistence/realm/b;", "exemptions", "w8", "G8", "absences", "s8", "C8", "", "absencesChecked", "Z", "t8", "()Z", "D8", "(Z)V", "students", "A8", "K8", "events", "v8", "F8", "Lk4/a;", "classRoles", "u8", "E8", "homeWorks", "x8", "H8", "synced", "B8", "L8", "<init>", "(JLio/realm/l0;Lio/realm/l0;Lio/realm/l0;Lio/realm/l0;Lio/realm/l0;Lio/realm/l0;ZZLio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements g1
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private l0<b> K;
    @org.jetbrains.annotations.e
    private l0<b> L;
    @org.jetbrains.annotations.e
    private l0<b> M;
    @org.jetbrains.annotations.e
    private l0<b> N;
    @org.jetbrains.annotations.e
    private l0<c> O;
    @org.jetbrains.annotations.e
    private l0<b> P;
    private boolean Q;
    private boolean R;
    @org.jetbrains.annotations.e
    private l0<k4.a> S;
    
    public a() {
        this(0L, null, null, null, null, null, null, false, false, null, 1023, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, @org.jetbrains.annotations.e final l0<b> l0, @org.jetbrains.annotations.e final l0<b> l2, @org.jetbrains.annotations.e final l0<b> l3, @org.jetbrains.annotations.e final l0<b> l4, @org.jetbrains.annotations.e final l0<c> l5, @org.jetbrains.annotations.e final l0<b> l6, final boolean b, final boolean b2, @org.jetbrains.annotations.e final l0<k4.a> l7) {
        k0.p(l0, "students");
        k0.p(l2, "absences");
        k0.p(l3, "events");
        k0.p(l4, "exemptions");
        k0.p(l5, "prioritizedAttendances");
        k0.p(l6, "homeWorks");
        k0.p(l7, "classRoles");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.C0(l0);
        this.x0(l2);
        this.o0(l3);
        this.u3(l4);
        this.b7(l5);
        this.m1(l6);
        this.S7(b);
        this.F(b2);
        this.O3(l7);
    }
    
    @Override
    public boolean A() {
        return this.R;
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> A8() {
        return (l0<b>)this.p0();
    }
    
    public final boolean B8() {
        return this.A();
    }
    
    @Override
    public void C0(final l0 k) {
        this.K = (l0<b>)k;
    }
    
    public final void C8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.x0(l0);
    }
    
    public final void D8(final boolean b) {
        this.S7(b);
    }
    
    public final void E8(@org.jetbrains.annotations.e final l0<k4.a> l0) {
        k0.p(l0, "<set-?>");
        this.O3(l0);
    }
    
    @Override
    public void F(final boolean r) {
        this.R = r;
    }
    
    public final void F8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.o0(l0);
    }
    
    public final void G8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.u3(l0);
    }
    
    public final void H8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.m1(l0);
    }
    
    public final void I8(final long n) {
        this.b(n);
    }
    
    public final void J8(@org.jetbrains.annotations.e final l0<c> l0) {
        k0.p(l0, "<set-?>");
        this.b7(l0);
    }
    
    public final void K8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.C0(l0);
    }
    
    public final void L8(final boolean b) {
        this.F(b);
    }
    
    @Override
    public void O3(final l0 s) {
        this.S = (l0<k4.a>)s;
    }
    
    @Override
    public l0 Q7() {
        return this.S;
    }
    
    @Override
    public l0 R2() {
        return this.O;
    }
    
    @Override
    public void S7(final boolean q) {
        this.Q = q;
    }
    
    @Override
    public l0 V() {
        return this.L;
    }
    
    @Override
    public l0 X() {
        return this.M;
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
    public void b7(final l0 o) {
        this.O = (l0<c>)o;
    }
    
    @Override
    public void m1(final l0 p) {
        this.P = (l0<b>)p;
    }
    
    @Override
    public void o0(final l0 m) {
        this.M = (l0<b>)m;
    }
    
    @Override
    public boolean o3() {
        return this.Q;
    }
    
    @Override
    public l0 p0() {
        return this.K;
    }
    
    @Override
    public l0 p1() {
        return this.P;
    }
    
    @Override
    public l0 r7() {
        return this.N;
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> s8() {
        return (l0<b>)this.V();
    }
    
    public final boolean t8() {
        return this.o3();
    }
    
    @Override
    public void u3(final l0 n) {
        this.N = (l0<b>)n;
    }
    
    @org.jetbrains.annotations.e
    public final l0<k4.a> u8() {
        return (l0<k4.a>)this.Q7();
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> v8() {
        return (l0<b>)this.X();
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> w8() {
        return (l0<b>)this.r7();
    }
    
    @Override
    public void x0(final l0 l) {
        this.L = (l0<b>)l;
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> x8() {
        return (l0<b>)this.p1();
    }
    
    public final long y8() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    public final l0<c> z8() {
        return (l0<c>)this.R2();
    }
}
