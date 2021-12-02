// 
// Decompiled by Procyon v0.5.36
// 

package q4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.u2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010*\u001a\u00020\u0013\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b0\u00101R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\"\u0010'\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u000fR\"\u0010*\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\"\u0010-\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0015\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019¨\u00062" }, d2 = { "Lq4/b;", "Lio/realm/p0;", "", "absenceReasonId", "J", "s8", "()J", "C8", "(J)V", "", "excused", "Z", "v8", "()Z", "F8", "(Z)V", "id", "w8", "G8", "", "end", "Ljava/lang/String;", "t8", "()Ljava/lang/String;", "D8", "(Ljava/lang/String;)V", "klassenId", "x8", "H8", "Lq4/a;", "excuse", "Lq4/a;", "u8", "()Lq4/a;", "E8", "(Lq4/a;)V", "studentId", "A8", "K8", "owner", "y8", "I8", "text", "B8", "L8", "start", "z8", "J8", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJZZLq4/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements u2
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    @org.jetbrains.annotations.e
    private String M;
    private long N;
    private long O;
    private long P;
    private boolean Q;
    private boolean R;
    @f
    private a S;
    
    public b() {
        this(0L, null, null, null, 0L, 0L, 0L, false, false, null, 1023, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final String s3, final long n2, final long n3, final long n4, final boolean b, final boolean b2, @f final a a) {
        k0.p(s, "start");
        k0.p(s2, "end");
        k0.p(s3, "text");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.v(s);
        this.x(s2);
        this.j(s3);
        this.P(n2);
        this.h1(n3);
        this.T0(n4);
        this.N(b);
        this.L0(b2);
        this.Z2(a);
    }
    
    public final long A8() {
        return this.J();
    }
    
    @org.jetbrains.annotations.e
    public final String B8() {
        return this.f();
    }
    
    public final void C8(final long n) {
        this.T0(n);
    }
    
    public final void D8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.x(s);
    }
    
    @Override
    public long E0() {
        return this.O;
    }
    
    public final void E8(@f final a a) {
        this.Z2(a);
    }
    
    public final void F8(final boolean b) {
        this.N(b);
    }
    
    public final void G8(final long n) {
        this.b(n);
    }
    
    public final void H8(final long n) {
        this.h1(n);
    }
    
    public final void I8(final boolean b) {
        this.L0(b);
    }
    
    @Override
    public long J() {
        return this.N;
    }
    
    public final void J8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.v(s);
    }
    
    public final void K8(final long n) {
        this.P(n);
    }
    
    @Override
    public void L0(final boolean r) {
        this.R = r;
    }
    
    public final void L8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public void N(final boolean q) {
        this.Q = q;
    }
    
    @Override
    public void P(final long n) {
        this.N = n;
    }
    
    @Override
    public boolean S() {
        return this.Q;
    }
    
    @Override
    public void T0(final long p) {
        this.P = p;
    }
    
    @Override
    public long V0() {
        return this.P;
    }
    
    @Override
    public void Z2(final a s) {
        this.S = s;
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
    public String c() {
        return this.L;
    }
    
    @Override
    public String d() {
        return this.K;
    }
    
    @Override
    public String f() {
        return this.M;
    }
    
    @Override
    public void h1(final long o) {
        this.O = o;
    }
    
    @Override
    public void j(final String m) {
        this.M = m;
    }
    
    public final long s8() {
        return this.V0();
    }
    
    @org.jetbrains.annotations.e
    public final String t8() {
        return this.c();
    }
    
    @f
    public final a u8() {
        return this.w0();
    }
    
    @Override
    public void v(final String k) {
        this.K = k;
    }
    
    @Override
    public boolean v1() {
        return this.R;
    }
    
    public final boolean v8() {
        return this.S();
    }
    
    @Override
    public a w0() {
        return this.S;
    }
    
    public final long w8() {
        return this.a();
    }
    
    @Override
    public void x(final String l) {
        this.L = l;
    }
    
    public final long x8() {
        return this.E0();
    }
    
    public final boolean y8() {
        return this.v1();
    }
    
    @org.jetbrains.annotations.e
    public final String z8() {
        return this.d();
    }
}
