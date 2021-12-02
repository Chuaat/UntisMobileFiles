// 
// Decompiled by Procyon v0.5.36
// 

package j4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import w4.d;
import org.jetbrains.annotations.f;
import w4.g;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.o1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010+\u001a\u00020\u0017\u0012\b\b\u0002\u0010%\u001a\u00020\u0017\u0012\b\b\u0002\u0010?\u001a\u00020\u0017\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u001e\u0012\b\b\u0002\u00105\u001a\u00020\u001e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bB\u0010CR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\"\u0010(\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\"\u0010+\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010 \u001a\u0004\b6\u0010\"\"\u0004\b7\u0010$R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u0019\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001d¨\u0006D" }, d2 = { "Lj4/a;", "Lio/realm/p0;", "Lj4/b;", "absenceReason", "Lj4/b;", "s8", "()Lj4/b;", "E8", "(Lj4/b;)V", "Lw4/d;", "klasse", "Lw4/d;", "x8", "()Lw4/d;", "J8", "(Lw4/d;)V", "Lj4/c;", "excuse", "Lj4/c;", "u8", "()Lj4/c;", "G8", "(Lj4/c;)V", "", "periodId", "J", "z8", "()J", "L8", "(J)V", "", "synced", "Z", "C8", "()Z", "O8", "(Z)V", "start", "A8", "M8", "excused", "v8", "H8", "id", "w8", "I8", "", "text", "Ljava/lang/String;", "D8", "()Ljava/lang/String;", "P8", "(Ljava/lang/String;)V", "owner", "y8", "K8", "Lw4/g;", "student", "Lw4/g;", "B8", "()Lw4/g;", "N8", "(Lw4/g;)V", "end", "t8", "F8", "<init>", "(JJJLjava/lang/String;Lw4/g;Lw4/d;Lj4/b;ZZLj4/c;JZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements o1
{
    @e
    private long J;
    private long K;
    private long L;
    @org.jetbrains.annotations.e
    private String M;
    @f
    private g N;
    @f
    private d O;
    @f
    private b P;
    private boolean Q;
    private boolean R;
    @f
    private c S;
    private long T;
    private boolean U;
    
    public a() {
        this(0L, 0L, 0L, null, null, null, null, false, false, null, 0L, false, 4095, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, final long n2, final long n3, @org.jetbrains.annotations.e final String s, @f final g g, @f final d d, @f final b b, final boolean b2, final boolean b3, @f final c c, final long n4, final boolean b4) {
        k0.p(s, "text");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.h(n2);
        this.i(n3);
        this.j(s);
        this.B5(g);
        this.F5(d);
        this.v5(b);
        this.N(b2);
        this.L0(b3);
        this.y3(c);
        this.y(n4);
        this.F(b4);
    }
    
    @Override
    public boolean A() {
        return this.U;
    }
    
    public final long A8() {
        return this.d();
    }
    
    @Override
    public void B5(final g n) {
        this.N = n;
    }
    
    @f
    public final g B8() {
        return this.d0();
    }
    
    public final boolean C8() {
        return this.A();
    }
    
    @Override
    public long D() {
        return this.T;
    }
    
    @org.jetbrains.annotations.e
    public final String D8() {
        return this.f();
    }
    
    public final void E8(@f final b b) {
        this.v5(b);
    }
    
    @Override
    public void F(final boolean u) {
        this.U = u;
    }
    
    @Override
    public void F5(final d o) {
        this.O = o;
    }
    
    public final void F8(final long n) {
        this.i(n);
    }
    
    public final void G8(@f final c c) {
        this.y3(c);
    }
    
    public final void H8(final boolean b) {
        this.N(b);
    }
    
    public final void I8(final long n) {
        this.b(n);
    }
    
    public final void J8(@f final d d) {
        this.F5(d);
    }
    
    public final void K8(final boolean b) {
        this.L0(b);
    }
    
    @Override
    public void L0(final boolean r) {
        this.R = r;
    }
    
    public final void L8(final long n) {
        this.y(n);
    }
    
    public final void M8(final long n) {
        this.h(n);
    }
    
    @Override
    public void N(final boolean q) {
        this.Q = q;
    }
    
    public final void N8(@f final g g) {
        this.B5(g);
    }
    
    public final void O8(final boolean b) {
        this.F(b);
    }
    
    public final void P8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public boolean S() {
        return this.Q;
    }
    
    @Override
    public b X4() {
        return this.P;
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
    public long c() {
        return this.L;
    }
    
    @Override
    public long d() {
        return this.K;
    }
    
    @Override
    public g d0() {
        return this.N;
    }
    
    @Override
    public String f() {
        return this.M;
    }
    
    @Override
    public void h(final long k) {
        this.K = k;
    }
    
    @Override
    public void i(final long l) {
        this.L = l;
    }
    
    @Override
    public void j(final String m) {
        this.M = m;
    }
    
    @f
    public final b s8() {
        return this.X4();
    }
    
    @Override
    public d t1() {
        return this.O;
    }
    
    public final long t8() {
        return this.c();
    }
    
    @f
    public final c u8() {
        return this.w0();
    }
    
    @Override
    public boolean v1() {
        return this.R;
    }
    
    @Override
    public void v5(final b p) {
        this.P = p;
    }
    
    public final boolean v8() {
        return this.S();
    }
    
    @Override
    public c w0() {
        return this.S;
    }
    
    public final long w8() {
        return this.a();
    }
    
    @f
    public final d x8() {
        return this.t1();
    }
    
    @Override
    public void y(final long t) {
        this.T = t;
    }
    
    @Override
    public void y3(final c s) {
        this.S = s;
    }
    
    public final boolean y8() {
        return this.v1();
    }
    
    public final long z8() {
        return this.D();
    }
}
