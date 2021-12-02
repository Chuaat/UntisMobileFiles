// 
// Decompiled by Procyon v0.5.36
// 

package y4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import org.jetbrains.annotations.f;
import w4.i;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.q4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u00102\u001a\u00020\u0010\u0012\b\b\u0002\u0010>\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u00108\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u00105\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\b\u0002\u0010;\u001a\u00020\t\u0012\b\b\u0002\u0010(\u001a\u00020\t¢\u0006\u0004\bA\u0010BR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\"\u0010(\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000b\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0012\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\"\u00105\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u000fR\"\u00108\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0012\u001a\u0004\b9\u0010\u0014\"\u0004\b:\u0010\u0016R\"\u0010;\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u000b\u001a\u0004\b<\u0010\r\"\u0004\b=\u0010\u000fR\"\u0010>\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0012\u001a\u0004\b?\u0010\u0014\"\u0004\b@\u0010\u0016¨\u0006C" }, d2 = { "Ly4/a;", "Lio/realm/p0;", "", "registered", "Z", "z8", "()Z", "N8", "(Z)V", "", "displayNameTeacher", "Ljava/lang/String;", "t8", "()Ljava/lang/String;", "H8", "(Ljava/lang/String;)V", "", "end", "J", "v8", "()J", "J8", "(J)V", "email", "u8", "I8", "displayNameRooms", "s8", "G8", "Lio/realm/l0;", "Ly4/b;", "timeSlots", "Lio/realm/l0;", "E8", "()Lio/realm/l0;", "S8", "(Lio/realm/l0;)V", "registrationPossible", "A8", "O8", "teacherText", "D8", "R8", "Lw4/i;", "teacher", "Lw4/i;", "C8", "()Lw4/i;", "Q8", "(Lw4/i;)V", "id", "w8", "K8", "phone", "y8", "M8", "imageId", "x8", "L8", "userText", "F8", "T8", "start", "B8", "P8", "<init>", "(JJJLw4/i;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLio/realm/l0;Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements q4
{
    @e
    private long J;
    private long K;
    private long L;
    @f
    private w4.i M;
    private long N;
    @org.jetbrains.annotations.e
    private String O;
    @org.jetbrains.annotations.e
    private String P;
    @org.jetbrains.annotations.e
    private String Q;
    @org.jetbrains.annotations.e
    private String R;
    private boolean S;
    private boolean T;
    @org.jetbrains.annotations.e
    private l0<b> U;
    @org.jetbrains.annotations.e
    private String V;
    @org.jetbrains.annotations.e
    private String W;
    
    public a() {
        this(0L, 0L, 0L, null, 0L, null, null, null, null, false, false, null, null, null, 16383, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, final long n2, final long n3, @f final w4.i i, final long n4, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final String s3, @org.jetbrains.annotations.e final String s4, final boolean b, final boolean b2, @org.jetbrains.annotations.e final l0<b> l0, @org.jetbrains.annotations.e final String s5, @org.jetbrains.annotations.e final String s6) {
        k0.p(s, "email");
        k0.p(s2, "phone");
        k0.p(s3, "displayNameRooms");
        k0.p(s4, "displayNameTeacher");
        k0.p(l0, "timeSlots");
        k0.p(s5, "userText");
        k0.p(s6, "teacherText");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.h(n2);
        this.i(n3);
        this.Q4(i);
        this.I1(n4);
        this.C1(s);
        this.o1(s2);
        this.F3(s3);
        this.h7(s4);
        this.u5(b);
        this.r1(b2);
        this.r4(l0);
        this.Y0(s5);
        this.u1(s6);
    }
    
    @Override
    public boolean A0() {
        return this.T;
    }
    
    @Override
    public String A1() {
        return this.V;
    }
    
    public final boolean A8() {
        return this.p7();
    }
    
    public final long B8() {
        return this.d();
    }
    
    @Override
    public void C1(final String o) {
        this.O = o;
    }
    
    @f
    public final w4.i C8() {
        return this.x1();
    }
    
    @org.jetbrains.annotations.e
    public final String D8() {
        return this.w1();
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> E8() {
        return (l0<b>)this.t2();
    }
    
    @Override
    public void F3(final String q) {
        this.Q = q;
    }
    
    @org.jetbrains.annotations.e
    public final String F8() {
        return this.A1();
    }
    
    public final void G8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.F3(s);
    }
    
    public final void H8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.h7(s);
    }
    
    @Override
    public void I1(final long n) {
        this.N = n;
    }
    
    public final void I8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.C1(s);
    }
    
    public final void J8(final long n) {
        this.i(n);
    }
    
    @Override
    public String K1() {
        return this.P;
    }
    
    public final void K8(final long n) {
        this.b(n);
    }
    
    public final void L8(final long n) {
        this.I1(n);
    }
    
    public final void M8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.o1(s);
    }
    
    public final void N8(final boolean b) {
        this.r1(b);
    }
    
    public final void O8(final boolean b) {
        this.u5(b);
    }
    
    public final void P8(final long n) {
        this.h(n);
    }
    
    @Override
    public void Q4(final w4.i m) {
        this.M = m;
    }
    
    public final void Q8(@f final w4.i i) {
        this.Q4(i);
    }
    
    public final void R8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.u1(s);
    }
    
    public final void S8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.r4(l0);
    }
    
    public final void T8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.Y0(s);
    }
    
    @Override
    public void Y0(final String v) {
        this.V = v;
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
    public String b4() {
        return this.Q;
    }
    
    @Override
    public long c() {
        return this.L;
    }
    
    @Override
    public long d() {
        return this.K;
    }
    
    @Override
    public long g1() {
        return this.N;
    }
    
    @Override
    public void h(final long k) {
        this.K = k;
    }
    
    @Override
    public void h7(final String r) {
        this.R = r;
    }
    
    @Override
    public void i(final long l) {
        this.L = l;
    }
    
    @Override
    public String l1() {
        return this.O;
    }
    
    @Override
    public void o1(final String p) {
        this.P = p;
    }
    
    @Override
    public boolean p7() {
        return this.S;
    }
    
    @Override
    public void r1(final boolean t) {
        this.T = t;
    }
    
    @Override
    public void r4(final l0 u) {
        this.U = (l0<b>)u;
    }
    
    @org.jetbrains.annotations.e
    public final String s8() {
        return this.b4();
    }
    
    @Override
    public l0 t2() {
        return this.U;
    }
    
    @org.jetbrains.annotations.e
    public final String t8() {
        return this.u4();
    }
    
    @Override
    public void u1(final String w) {
        this.W = w;
    }
    
    @Override
    public String u4() {
        return this.R;
    }
    
    @Override
    public void u5(final boolean s) {
        this.S = s;
    }
    
    @org.jetbrains.annotations.e
    public final String u8() {
        return this.l1();
    }
    
    public final long v8() {
        return this.c();
    }
    
    @Override
    public String w1() {
        return this.W;
    }
    
    public final long w8() {
        return this.a();
    }
    
    @Override
    public w4.i x1() {
        return this.M;
    }
    
    public final long x8() {
        return this.g1();
    }
    
    @org.jetbrains.annotations.e
    public final String y8() {
        return this.K1();
    }
    
    public final boolean z8() {
        return this.A0();
    }
}
