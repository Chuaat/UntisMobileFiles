// 
// Decompiled by Procyon v0.5.36
// 

package m4;

import kotlin.i;
import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.g2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u0010=\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010-\u001a\u00020\u001e\u0012\b\b\u0002\u0010@\u001a\u000206\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u00107\u001a\u000206\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010(\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bC\u0010DR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR(\u0010(\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010 \u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\"\u0010-\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\"\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\"\u00107\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\"\u0010@\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00108\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<¨\u0006E" }, d2 = { "Lm4/a;", "Lio/realm/p0;", "", "periodId", "J", "B8", "()J", "P8", "(J)V", "", "remark", "Ljava/lang/String;", "C8", "()Ljava/lang/String;", "Q8", "(Ljava/lang/String;)V", "Lio/realm/l0;", "Lo4/a;", "driveAttachments", "Lio/realm/l0;", "t8", "()Lio/realm/l0;", "I8", "(Lio/realm/l0;)V", "text", "G8", "U8", "entityId", "v8", "K8", "", "synced", "Z", "F8", "()Z", "T8", "(Z)V", "id", "x8", "M8", "local", "z8", "O8", "getLocal$annotations", "()V", "completed", "s8", "H8", "end", "u8", "J8", "lessonId", "y8", "N8", "", "status", "I", "E8", "()I", "S8", "(I)V", "start", "D8", "R8", "entityType", "w8", "L8", "<init>", "(JJJJLjava/lang/String;Ljava/lang/String;ZIJZILio/realm/l0;ZJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements g2
{
    @e
    private long J;
    private long K;
    private long L;
    private long M;
    @org.jetbrains.annotations.e
    private String N;
    @org.jetbrains.annotations.e
    private String O;
    private boolean P;
    private int Q;
    private long R;
    private boolean S;
    private int T;
    @org.jetbrains.annotations.e
    private l0<o4.a> U;
    private boolean V;
    private long W;
    
    public a() {
        this(0L, 0L, 0L, 0L, null, null, false, 0, 0L, false, 0, null, false, 0L, 16383, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, final long n2, final long n3, final long n4, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final boolean b, final int n5, final long n6, final boolean b2, final int n7, @org.jetbrains.annotations.e final l0<o4.a> l0, final boolean b3, final long n8) {
        k0.p(s, "text");
        k0.p(s2, "remark");
        k0.p(l0, "driveAttachments");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.G(n2);
        this.h(n3);
        this.i(n4);
        this.j(s);
        this.e0(s2);
        this.c0(b);
        this.k(n5);
        this.p(n6);
        this.F(b2);
        this.w7(n7);
        this.B(l0);
        this.H6(b3);
        this.y(n8);
    }
    
    @Override
    public boolean A() {
        return this.S;
    }
    
    @Override
    public void B(final l0 u) {
        this.U = (l0<o4.a>)u;
    }
    
    public final long B8() {
        return this.D();
    }
    
    @Override
    public long C() {
        return this.K;
    }
    
    @org.jetbrains.annotations.e
    public final String C8() {
        return this.j0();
    }
    
    @Override
    public long D() {
        return this.W;
    }
    
    public final long D8() {
        return this.d();
    }
    
    @Override
    public l0 E() {
        return this.U;
    }
    
    public final int E8() {
        return this.J2();
    }
    
    @Override
    public void F(final boolean s) {
        this.S = s;
    }
    
    public final boolean F8() {
        return this.A();
    }
    
    @Override
    public void G(final long k) {
        this.K = k;
    }
    
    @org.jetbrains.annotations.e
    public final String G8() {
        return this.f();
    }
    
    @Override
    public void H6(final boolean v) {
        this.V = v;
    }
    
    public final void H8(final boolean b) {
        this.c0(b);
    }
    
    public final void I8(@org.jetbrains.annotations.e final l0<o4.a> l0) {
        k0.p(l0, "<set-?>");
        this.B(l0);
    }
    
    @Override
    public int J2() {
        return this.T;
    }
    
    public final void J8(final long n) {
        this.i(n);
    }
    
    public final void K8(final long n) {
        this.p(n);
    }
    
    public final void L8(final int n) {
        this.k(n);
    }
    
    public final void M8(final long n) {
        this.b(n);
    }
    
    public final void N8(final long n) {
        this.G(n);
    }
    
    public final void O8(final boolean b) {
        this.H6(b);
    }
    
    public final void P8(final long n) {
        this.y(n);
    }
    
    public final void Q8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e0(s);
    }
    
    public final void R8(final long n) {
        this.h(n);
    }
    
    public final void S8(final int n) {
        this.w7(n);
    }
    
    public final void T8(final boolean b) {
        this.F(b);
    }
    
    public final void U8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
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
        return this.M;
    }
    
    @Override
    public void c0(final boolean p) {
        this.P = p;
    }
    
    @Override
    public long d() {
        return this.L;
    }
    
    @Override
    public void e0(final String o) {
        this.O = o;
    }
    
    @Override
    public String f() {
        return this.N;
    }
    
    @Override
    public boolean g0() {
        return this.V;
    }
    
    @Override
    public void h(final long l) {
        this.L = l;
    }
    
    @Override
    public void i(final long m) {
        this.M = m;
    }
    
    @Override
    public boolean i0() {
        return this.P;
    }
    
    @Override
    public void j(final String n) {
        this.N = n;
    }
    
    @Override
    public String j0() {
        return this.O;
    }
    
    @Override
    public void k(final int q) {
        this.Q = q;
    }
    
    @Override
    public int l() {
        return this.Q;
    }
    
    @Override
    public long o() {
        return this.R;
    }
    
    @Override
    public void p(final long r) {
        this.R = r;
    }
    
    public final boolean s8() {
        return this.i0();
    }
    
    @org.jetbrains.annotations.e
    public final l0<o4.a> t8() {
        return (l0<o4.a>)this.E();
    }
    
    public final long u8() {
        return this.c();
    }
    
    public final long v8() {
        return this.o();
    }
    
    @Override
    public void w7(final int t) {
        this.T = t;
    }
    
    public final int w8() {
        return this.l();
    }
    
    public final long x8() {
        return this.a();
    }
    
    @Override
    public void y(final long w) {
        this.W = w;
    }
    
    public final long y8() {
        return this.C();
    }
    
    public final boolean z8() {
        return this.g0();
    }
}
