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
import io.realm.e3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u00105\u001a\u00020\u0010\u0012\b\b\u0002\u0010$\u001a\u00020\u0010\u0012\b\b\u0002\u0010*\u001a\u00020\u0017\u0012\b\b\u0002\u0010'\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b8\u00109R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\"\u0010$\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\"\u0010'\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\"\u0010*\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR(\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0012\u001a\u0004\b6\u0010\u0014\"\u0004\b7\u0010\u0016¨\u0006:" }, d2 = { "Ls4/a;", "Lio/realm/p0;", "", "completed", "Z", "s8", "()Z", "D8", "(Z)V", "", "entityType", "I", "w8", "()I", "H8", "(I)V", "", "key", "J", "y8", "()J", "J8", "(J)V", "", "remark", "Ljava/lang/String;", "A8", "()Ljava/lang/String;", "L8", "(Ljava/lang/String;)V", "text", "C8", "N8", "entityId", "v8", "G8", "lessonId", "z8", "K8", "end", "u8", "F8", "start", "B8", "M8", "Lio/realm/l0;", "Lo4/a;", "driveAttachments", "Lio/realm/l0;", "t8", "()Lio/realm/l0;", "E8", "(Lio/realm/l0;)V", "id", "x8", "I8", "<init>", "(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIJLio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements e3
{
    @e
    private long J;
    private long K;
    private long L;
    @org.jetbrains.annotations.e
    private String M;
    @org.jetbrains.annotations.e
    private String N;
    @org.jetbrains.annotations.e
    private String O;
    @org.jetbrains.annotations.e
    private String P;
    private boolean Q;
    private int R;
    private long S;
    @org.jetbrains.annotations.e
    private l0<o4.a> T;
    
    public a() {
        this(0L, 0L, 0L, null, null, null, null, false, 0, 0L, null, 2047, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, final long n2, final long n3, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final String s3, @org.jetbrains.annotations.e final String s4, final boolean b, final int n4, final long n5, @org.jetbrains.annotations.e final l0<o4.a> l0) {
        k0.p(s, "start");
        k0.p(s2, "end");
        k0.p(s3, "text");
        k0.p(s4, "remark");
        k0.p(l0, "driveAttachments");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.f0(n);
        this.b(n2);
        this.G(n3);
        this.v(s);
        this.x(s2);
        this.j(s3);
        this.e0(s4);
        this.c0(b);
        this.k(n4);
        this.p(n5);
        this.B(l0);
    }
    
    @org.jetbrains.annotations.e
    public final String A8() {
        return this.j0();
    }
    
    @Override
    public void B(final l0 t) {
        this.T = (l0<o4.a>)t;
    }
    
    @org.jetbrains.annotations.e
    public final String B8() {
        return this.d();
    }
    
    @Override
    public long C() {
        return this.L;
    }
    
    @org.jetbrains.annotations.e
    public final String C8() {
        return this.f();
    }
    
    public final void D8(final boolean b) {
        this.c0(b);
    }
    
    @Override
    public l0 E() {
        return this.T;
    }
    
    public final void E8(@org.jetbrains.annotations.e final l0<o4.a> l0) {
        k0.p(l0, "<set-?>");
        this.B(l0);
    }
    
    public final void F8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.x(s);
    }
    
    @Override
    public void G(final long l) {
        this.L = l;
    }
    
    public final void G8(final long n) {
        this.p(n);
    }
    
    public final void H8(final int n) {
        this.k(n);
    }
    
    public final void I8(final long n) {
        this.b(n);
    }
    
    public final void J8(final long n) {
        this.f0(n);
    }
    
    public final void K8(final long n) {
        this.G(n);
    }
    
    public final void L8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e0(s);
    }
    
    public final void M8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.v(s);
    }
    
    public final void N8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
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
        return this.N;
    }
    
    @Override
    public void c0(final boolean q) {
        this.Q = q;
    }
    
    @Override
    public String d() {
        return this.M;
    }
    
    @Override
    public void e0(final String p) {
        this.P = p;
    }
    
    @Override
    public String f() {
        return this.O;
    }
    
    @Override
    public void f0(final long j) {
        this.J = j;
    }
    
    @Override
    public boolean i0() {
        return this.Q;
    }
    
    @Override
    public void j(final String o) {
        this.O = o;
    }
    
    @Override
    public String j0() {
        return this.P;
    }
    
    @Override
    public void k(final int r) {
        this.R = r;
    }
    
    @Override
    public int l() {
        return this.R;
    }
    
    @Override
    public long o() {
        return this.S;
    }
    
    @Override
    public void p(final long s) {
        this.S = s;
    }
    
    public final boolean s8() {
        return this.i0();
    }
    
    @org.jetbrains.annotations.e
    public final l0<o4.a> t8() {
        return (l0<o4.a>)this.E();
    }
    
    @org.jetbrains.annotations.e
    public final String u8() {
        return this.c();
    }
    
    @Override
    public void v(final String m) {
        this.M = m;
    }
    
    public final long v8() {
        return this.o();
    }
    
    public final int w8() {
        return this.l();
    }
    
    @Override
    public void x(final String n) {
        this.N = n;
    }
    
    public final long x8() {
        return this.a();
    }
    
    public final long y8() {
        return this.z();
    }
    
    @Override
    public long z() {
        return this.J;
    }
    
    public final long z8() {
        return this.C();
    }
}
