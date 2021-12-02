// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm.period;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.realm.b;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.realm.a;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.y4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001B\u00e3\u0001\u0012\b\b\u0002\u0010B\u001a\u00020\u001c\u0012\b\b\u0002\u0010#\u001a\u00020\u001c\u0012\b\b\u0002\u0010,\u001a\u00020\u001c\u0012\b\b\u0002\u00100\u001a\u00020\u001c\u0012\b\b\u0002\u00104\u001a\u00020\u0014\u0012\b\b\u0002\u0010N\u001a\u00020\u0014\u0012\b\b\u0002\u0010Y\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010]\u001a\b\u0012\u0004\u0012\u00020$0\u0002\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020$0\u0002\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\b\b\u0002\u0010J\u001a\u00020C\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010O\u0012\b\b\u0002\u0010a\u001a\u00020C¢\u0006\u0004\bb\u0010cR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010(\u001a\b\u0012\u0004\u0012\u00020$0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\"\u0010,\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\"\u00100\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\"\u00104\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001aR$\u0010;\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0005\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\"\u0010B\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001e\u001a\u0004\b@\u0010 \"\u0004\bA\u0010\"R\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0016\u001a\u0004\bL\u0010\u0018\"\u0004\bM\u0010\u001aR$\u0010U\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010\u0016\u001a\u0004\bW\u0010\u0018\"\u0004\bX\u0010\u001aR(\u0010]\u001a\b\u0012\u0004\u0012\u00020$0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0005\u001a\u0004\b[\u0010\u0007\"\u0004\b\\\u0010\tR\"\u0010a\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010E\u001a\u0004\b_\u0010G\"\u0004\b`\u0010I¨\u0006d" }, d2 = { "Lcom/untis/mobile/persistence/realm/period/c;", "Lio/realm/p0;", "Lio/realm/l0;", "Lcom/untis/mobile/persistence/realm/period/a;", "U", "Lio/realm/l0;", "A8", "()Lio/realm/l0;", "S8", "(Lio/realm/l0;)V", "klassen", "W", "H8", "a9", "teachers", "Lcom/untis/mobile/persistence/realm/b;", "X", "t8", "L8", "blockIds", "", "Q", "I", "z8", "()I", "R8", "(I)V", "innerTextColor", "", "K", "J", "B8", "()J", "T8", "(J)V", "lessonId", "Lcom/untis/mobile/persistence/realm/a;", "S", "F8", "Y8", "states", "L", "E8", "X8", "start", "M", "w8", "O8", "end", "N", "s8", "K8", "backgroundColor", "T", "Lcom/untis/mobile/persistence/realm/period/a;", "G8", "()Lcom/untis/mobile/persistence/realm/period/a;", "Z8", "(Lcom/untis/mobile/persistence/realm/period/a;)V", "subject", "V", "D8", "W8", "rooms", "x8", "P8", "id", "", "Y", "Z", "u8", "()Z", "M8", "(Z)V", "breakSuperVision", "O", "I8", "b9", "textColor", "", "Ljava/lang/String;", "v8", "()Ljava/lang/String;", "N8", "(Ljava/lang/String;)V", "channelId", "P", "y8", "Q8", "innerBackgroundColor", "R", "C8", "V8", "rights", "a0", "J8", "U8", "isOnlinePeriod", "<init>", "(JJJJIIIILio/realm/l0;Lio/realm/l0;Lcom/untis/mobile/persistence/realm/period/a;Lio/realm/l0;Lio/realm/l0;Lio/realm/l0;Lio/realm/l0;ZLjava/lang/String;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class c extends p0 implements y4
{
    @e
    private long J;
    private long K;
    private long L;
    private long M;
    private int N;
    private int O;
    private int P;
    private int Q;
    @org.jetbrains.annotations.e
    private l0<a> R;
    @org.jetbrains.annotations.e
    private l0<a> S;
    @f
    private com.untis.mobile.persistence.realm.period.a T;
    @org.jetbrains.annotations.e
    private l0<com.untis.mobile.persistence.realm.period.a> U;
    @org.jetbrains.annotations.e
    private l0<com.untis.mobile.persistence.realm.period.a> V;
    @org.jetbrains.annotations.e
    private l0<com.untis.mobile.persistence.realm.period.a> W;
    @org.jetbrains.annotations.e
    private l0<b> X;
    private boolean Y;
    @f
    private String Z;
    private boolean a0;
    
    public c() {
        this(0L, 0L, 0L, 0L, 0, 0, 0, 0, null, null, null, null, null, null, null, false, null, false, 262143, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public c(final long n, final long n2, final long n3, final long n4, final int n5, final int n6, final int n7, final int n8, @org.jetbrains.annotations.e final l0<a> l0, @org.jetbrains.annotations.e final l0<a> l2, @f final com.untis.mobile.persistence.realm.period.a a, @org.jetbrains.annotations.e final l0<com.untis.mobile.persistence.realm.period.a> l3, @org.jetbrains.annotations.e final l0<com.untis.mobile.persistence.realm.period.a> l4, @org.jetbrains.annotations.e final l0<com.untis.mobile.persistence.realm.period.a> l5, @org.jetbrains.annotations.e final l0<b> l6, final boolean b, @f final String s, final boolean b2) {
        k0.p(l0, "rights");
        k0.p(l2, "states");
        k0.p(l3, "klassen");
        k0.p(l4, "rooms");
        k0.p(l5, "teachers");
        k0.p(l6, "blockIds");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.G(n2);
        this.h(n3);
        this.i(n4);
        this.L1(n5);
        this.q(n6);
        this.S1(n7);
        this.i7(n8);
        this.V3(l0);
        this.j1(l2);
        this.k5(a);
        this.n1(l3);
        this.U(l4);
        this.t0(l5);
        this.s2(l6);
        this.q5(b);
        this.t7(s);
        this.H1(b2);
    }
    
    @Override
    public String A7() {
        return this.Z;
    }
    
    @org.jetbrains.annotations.e
    public final l0<com.untis.mobile.persistence.realm.period.a> A8() {
        return (l0<com.untis.mobile.persistence.realm.period.a>)this.a1();
    }
    
    @Override
    public int B6() {
        return this.N;
    }
    
    public final long B8() {
        return this.C();
    }
    
    @Override
    public long C() {
        return this.K;
    }
    
    @org.jetbrains.annotations.e
    public final l0<a> C8() {
        return (l0<a>)this.l7();
    }
    
    @org.jetbrains.annotations.e
    public final l0<com.untis.mobile.persistence.realm.period.a> D8() {
        return (l0<com.untis.mobile.persistence.realm.period.a>)this.Z();
    }
    
    public final long E8() {
        return this.d();
    }
    
    @org.jetbrains.annotations.e
    public final l0<a> F8() {
        return (l0<a>)this.b1();
    }
    
    @Override
    public void G(final long k) {
        this.K = k;
    }
    
    @f
    public final com.untis.mobile.persistence.realm.period.a G8() {
        return this.K();
    }
    
    @Override
    public void H1(final boolean a0) {
        this.a0 = a0;
    }
    
    @org.jetbrains.annotations.e
    public final l0<com.untis.mobile.persistence.realm.period.a> H8() {
        return (l0<com.untis.mobile.persistence.realm.period.a>)this.h0();
    }
    
    public final int I8() {
        return this.r();
    }
    
    public final boolean J8() {
        return this.O0();
    }
    
    @Override
    public com.untis.mobile.persistence.realm.period.a K() {
        return this.T;
    }
    
    public final void K8(final int n) {
        this.L1(n);
    }
    
    @Override
    public void L1(final int n) {
        this.N = n;
    }
    
    public final void L8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.s2(l0);
    }
    
    public final void M8(final boolean b) {
        this.q5(b);
    }
    
    public final void N8(@f final String s) {
        this.t7(s);
    }
    
    @Override
    public boolean O0() {
        return this.a0;
    }
    
    @Override
    public int O2() {
        return this.P;
    }
    
    public final void O8(final long n) {
        this.i(n);
    }
    
    @Override
    public boolean P5() {
        return this.Y;
    }
    
    public final void P8(final long n) {
        this.b(n);
    }
    
    public final void Q8(final int n) {
        this.S1(n);
    }
    
    public final void R8(final int n) {
        this.i7(n);
    }
    
    @Override
    public void S1(final int p) {
        this.P = p;
    }
    
    public final void S8(@org.jetbrains.annotations.e final l0<com.untis.mobile.persistence.realm.period.a> l0) {
        k0.p(l0, "<set-?>");
        this.n1(l0);
    }
    
    public final void T8(final long n) {
        this.G(n);
    }
    
    @Override
    public void U(final l0 v) {
        this.V = (l0<com.untis.mobile.persistence.realm.period.a>)v;
    }
    
    public final void U8(final boolean b) {
        this.H1(b);
    }
    
    @Override
    public void V3(final l0 r) {
        this.R = (l0<a>)r;
    }
    
    public final void V8(@org.jetbrains.annotations.e final l0<a> l0) {
        k0.p(l0, "<set-?>");
        this.V3(l0);
    }
    
    public final void W8(@org.jetbrains.annotations.e final l0<com.untis.mobile.persistence.realm.period.a> l0) {
        k0.p(l0, "<set-?>");
        this.U(l0);
    }
    
    public final void X8(final long n) {
        this.h(n);
    }
    
    @Override
    public int Y2() {
        return this.Q;
    }
    
    public final void Y8(@org.jetbrains.annotations.e final l0<a> l0) {
        k0.p(l0, "<set-?>");
        this.j1(l0);
    }
    
    @Override
    public l0 Z() {
        return this.V;
    }
    
    public final void Z8(@f final com.untis.mobile.persistence.realm.period.a a) {
        this.k5(a);
    }
    
    @Override
    public long a() {
        return this.J;
    }
    
    @Override
    public l0 a1() {
        return this.U;
    }
    
    public final void a9(@org.jetbrains.annotations.e final l0<com.untis.mobile.persistence.realm.period.a> l0) {
        k0.p(l0, "<set-?>");
        this.t0(l0);
    }
    
    @Override
    public void b(final long j) {
        this.J = j;
    }
    
    @Override
    public l0 b1() {
        return this.S;
    }
    
    public final void b9(final int n) {
        this.q(n);
    }
    
    @Override
    public long c() {
        return this.M;
    }
    
    @Override
    public long d() {
        return this.L;
    }
    
    @Override
    public l0 e6() {
        return this.X;
    }
    
    @Override
    public void h(final long l) {
        this.L = l;
    }
    
    @Override
    public l0 h0() {
        return this.W;
    }
    
    @Override
    public void i(final long m) {
        this.M = m;
    }
    
    @Override
    public void i7(final int q) {
        this.Q = q;
    }
    
    @Override
    public void j1(final l0 s) {
        this.S = (l0<a>)s;
    }
    
    @Override
    public void k5(final com.untis.mobile.persistence.realm.period.a t) {
        this.T = t;
    }
    
    @Override
    public l0 l7() {
        return this.R;
    }
    
    @Override
    public void n1(final l0 u) {
        this.U = (l0<com.untis.mobile.persistence.realm.period.a>)u;
    }
    
    @Override
    public void q(final int o) {
        this.O = o;
    }
    
    @Override
    public void q5(final boolean y) {
        this.Y = y;
    }
    
    @Override
    public int r() {
        return this.O;
    }
    
    @Override
    public void s2(final l0 x) {
        this.X = (l0<b>)x;
    }
    
    public final int s8() {
        return this.B6();
    }
    
    @Override
    public void t0(final l0 w) {
        this.W = (l0<com.untis.mobile.persistence.realm.period.a>)w;
    }
    
    @Override
    public void t7(final String z) {
        this.Z = z;
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> t8() {
        return (l0<b>)this.e6();
    }
    
    public final boolean u8() {
        return this.P5();
    }
    
    @f
    public final String v8() {
        return this.A7();
    }
    
    public final long w8() {
        return this.c();
    }
    
    public final long x8() {
        return this.a();
    }
    
    public final int y8() {
        return this.O2();
    }
    
    public final int z8() {
        return this.Y2();
    }
}
