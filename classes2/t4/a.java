// 
// Decompiled by Procyon v0.5.36
// 

package t4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import org.jetbrains.annotations.f;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.i3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0016\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u00107\u001a\u00020\u0002\u0012\b\b\u0002\u00104\u001a\u00020\t\u0012\b\b\u0002\u0010+\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010:\u001a\u00020\t\u0012\b\b\u0002\u0010=\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\b\b\u0002\u00101\u001a\u00020\t\u0012\b\b\u0002\u0010\"\u001a\u00020\t¢\u0006\u0004\b@\u0010AR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\"\u0010+\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u000b\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR$\u0010.\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u000b\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR\"\u00101\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u000b\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR\"\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR\"\u0010:\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\r\"\u0004\b<\u0010\u000fR\"\u0010=\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0015\u001a\u0004\b>\u0010\u0017\"\u0004\b?\u0010\u0019¨\u0006B" }, d2 = { "Lt4/a;", "Lio/realm/p0;", "", "key", "J", "w8", "()J", "L8", "(J)V", "", "end", "Ljava/lang/String;", "t8", "()Ljava/lang/String;", "I8", "(Ljava/lang/String;)V", "room", "A8", "P8", "", "registered", "Z", "y8", "()Z", "N8", "(Z)V", "Lio/realm/l0;", "Lt4/b;", "timeslots", "Lio/realm/l0;", "F8", "()Lio/realm/l0;", "U8", "(Lio/realm/l0;)V", "teacherText", "E8", "T8", "teacherId", "D8", "S8", "id", "u8", "J8", "phone", "x8", "M8", "start", "B8", "Q8", "userText", "G8", "V8", "email", "s8", "H8", "imageId", "v8", "K8", "teacher", "C8", "R8", "registrationAllowed", "z8", "O8", "<init>", "(JJLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLio/realm/l0;Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements i3
{
    @e
    private long J;
    private long K;
    @f
    private String L;
    @f
    private String M;
    private long N;
    private long O;
    @org.jetbrains.annotations.e
    private String P;
    @org.jetbrains.annotations.e
    private String Q;
    @org.jetbrains.annotations.e
    private String R;
    @org.jetbrains.annotations.e
    private String S;
    private boolean T;
    private boolean U;
    @org.jetbrains.annotations.e
    private l0<b> V;
    @org.jetbrains.annotations.e
    private String W;
    @org.jetbrains.annotations.e
    private String X;
    
    public a() {
        this(0L, 0L, null, null, 0L, 0L, null, null, null, null, false, false, null, null, null, 32767, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, final long n2, @f final String s, @f final String s2, final long n3, final long n4, @org.jetbrains.annotations.e final String s3, @org.jetbrains.annotations.e final String s4, @org.jetbrains.annotations.e final String s5, @org.jetbrains.annotations.e final String s6, final boolean b, final boolean b2, @org.jetbrains.annotations.e final l0<b> l0, @org.jetbrains.annotations.e final String s7, @org.jetbrains.annotations.e final String s8) {
        k0.p(s3, "email");
        k0.p(s4, "phone");
        k0.p(s5, "room");
        k0.p(s6, "teacher");
        k0.p(l0, "timeslots");
        k0.p(s7, "userText");
        k0.p(s8, "teacherText");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.f0(n);
        this.b(n2);
        this.v(s);
        this.x(s2);
        this.Y(n3);
        this.I1(n4);
        this.C1(s3);
        this.o1(s4);
        this.m2(s5);
        this.z6(s6);
        this.C6(b);
        this.r1(b2);
        this.H3(l0);
        this.Y0(s7);
        this.u1(s8);
    }
    
    @Override
    public boolean A0() {
        return this.U;
    }
    
    @Override
    public String A1() {
        return this.W;
    }
    
    @org.jetbrains.annotations.e
    public final String A8() {
        return this.r6();
    }
    
    @f
    public final String B8() {
        return this.d();
    }
    
    @Override
    public void C1(final String p) {
        this.P = p;
    }
    
    @Override
    public void C6(final boolean t) {
        this.T = t;
    }
    
    @org.jetbrains.annotations.e
    public final String C8() {
        return this.x1();
    }
    
    public final long D8() {
        return this.y0();
    }
    
    @org.jetbrains.annotations.e
    public final String E8() {
        return this.w1();
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> F8() {
        return (l0<b>)this.R5();
    }
    
    @org.jetbrains.annotations.e
    public final String G8() {
        return this.A1();
    }
    
    @Override
    public void H3(final l0 v) {
        this.V = (l0<b>)v;
    }
    
    public final void H8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.C1(s);
    }
    
    @Override
    public void I1(final long o) {
        this.O = o;
    }
    
    public final void I8(@f final String s) {
        this.x(s);
    }
    
    public final void J8(final long n) {
        this.b(n);
    }
    
    @Override
    public String K1() {
        return this.Q;
    }
    
    public final void K8(final long n) {
        this.I1(n);
    }
    
    public final void L8(final long n) {
        this.f0(n);
    }
    
    public final void M8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.o1(s);
    }
    
    public final void N8(final boolean b) {
        this.r1(b);
    }
    
    public final void O8(final boolean b) {
        this.C6(b);
    }
    
    public final void P8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.m2(s);
    }
    
    public final void Q8(@f final String s) {
        this.v(s);
    }
    
    @Override
    public l0 R5() {
        return this.V;
    }
    
    public final void R8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.z6(s);
    }
    
    public final void S8(final long n) {
        this.Y(n);
    }
    
    public final void T8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.u1(s);
    }
    
    public final void U8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.H3(l0);
    }
    
    public final void V8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.Y0(s);
    }
    
    @Override
    public void Y(final long n) {
        this.N = n;
    }
    
    @Override
    public void Y0(final String w) {
        this.W = w;
    }
    
    @Override
    public long a() {
        return this.K;
    }
    
    @Override
    public void b(final long k) {
        this.K = k;
    }
    
    @Override
    public String c() {
        return this.M;
    }
    
    @Override
    public boolean c5() {
        return this.T;
    }
    
    @Override
    public String d() {
        return this.L;
    }
    
    @Override
    public void f0(final long j) {
        this.J = j;
    }
    
    @Override
    public long g1() {
        return this.O;
    }
    
    @Override
    public String l1() {
        return this.P;
    }
    
    @Override
    public void m2(final String r) {
        this.R = r;
    }
    
    @Override
    public void o1(final String q) {
        this.Q = q;
    }
    
    @Override
    public void r1(final boolean u) {
        this.U = u;
    }
    
    @Override
    public String r6() {
        return this.R;
    }
    
    @org.jetbrains.annotations.e
    public final String s8() {
        return this.l1();
    }
    
    @f
    public final String t8() {
        return this.c();
    }
    
    @Override
    public void u1(final String x) {
        this.X = x;
    }
    
    public final long u8() {
        return this.a();
    }
    
    @Override
    public void v(final String l) {
        this.L = l;
    }
    
    public final long v8() {
        return this.g1();
    }
    
    @Override
    public String w1() {
        return this.X;
    }
    
    public final long w8() {
        return this.z();
    }
    
    @Override
    public void x(final String m) {
        this.M = m;
    }
    
    @Override
    public String x1() {
        return this.S;
    }
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.K1();
    }
    
    @Override
    public long y0() {
        return this.N;
    }
    
    public final boolean y8() {
        return this.A0();
    }
    
    @Override
    public long z() {
        return this.J;
    }
    
    @Override
    public void z6(final String s) {
        this.S = s;
    }
    
    public final boolean z8() {
        return this.c5();
    }
}
