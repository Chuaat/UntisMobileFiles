// 
// Decompiled by Procyon v0.5.36
// 

package w4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.k4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010$\u001a\u00020\u001d¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006)" }, d2 = { "Lw4/h;", "Lio/realm/p0;", "", "longName", "Ljava/lang/String;", "w8", "()Ljava/lang/String;", "D8", "(Ljava/lang/String;)V", "", "backColor", "I", "t8", "()I", "A8", "(I)V", "", "id", "J", "v8", "()J", "C8", "(J)V", "name", "x8", "E8", "textColor", "y8", "F8", "", "active", "Z", "s8", "()Z", "z8", "(Z)V", "displayable", "u8", "B8", "<init>", "(JLjava/lang/String;Ljava/lang/String;IIZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class h extends p0 implements k4
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    
    public h() {
        this(0L, null, null, 0, 0, false, false, 127, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public h(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final int n2, final int n3, final boolean b, final boolean b2) {
        k0.p(s, "name");
        k0.p(s2, "longName");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.e(s);
        this.m(s2);
        this.q(n2);
        this.w(n3);
        this.s(b);
        this.Q(b2);
    }
    
    public final void A8(final int n) {
        this.w(n);
    }
    
    public final void B8(final boolean b) {
        this.Q(b);
    }
    
    public final void C8(final long n) {
        this.b(n);
    }
    
    public final void D8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.m(s);
    }
    
    public final void E8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
    
    public final void F8(final int n) {
        this.q(n);
    }
    
    @Override
    public boolean L() {
        return this.P;
    }
    
    @Override
    public void Q(final boolean p) {
        this.P = p;
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
    public void e(final String k) {
        this.K = k;
    }
    
    @Override
    public String g() {
        return this.K;
    }
    
    @Override
    public void m(final String l) {
        this.L = l;
    }
    
    @Override
    public String n() {
        return this.L;
    }
    
    @Override
    public void q(final int m) {
        this.M = m;
    }
    
    @Override
    public int r() {
        return this.M;
    }
    
    @Override
    public void s(final boolean o) {
        this.O = o;
    }
    
    public final boolean s8() {
        return this.t();
    }
    
    @Override
    public boolean t() {
        return this.O;
    }
    
    public final int t8() {
        return this.u();
    }
    
    @Override
    public int u() {
        return this.N;
    }
    
    public final boolean u8() {
        return this.L();
    }
    
    public final long v8() {
        return this.a();
    }
    
    @Override
    public void w(final int n) {
        this.N = n;
    }
    
    @org.jetbrains.annotations.e
    public final String w8() {
        return this.n();
    }
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.g();
    }
    
    public final int y8() {
        return this.r();
    }
    
    public final void z8(final boolean b) {
        this.s(b);
    }
}
