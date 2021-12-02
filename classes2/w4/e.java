// 
// Decompiled by Procyon v0.5.36
// 

package w4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import io.realm.e4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)" }, d2 = { "Lw4/e;", "Lio/realm/p0;", "", "backColor", "I", "t8", "()I", "A8", "(I)V", "", "name", "Ljava/lang/String;", "x8", "()Ljava/lang/String;", "E8", "(Ljava/lang/String;)V", "textColor", "y8", "F8", "", "active", "Z", "s8", "()Z", "z8", "(Z)V", "displayable", "u8", "B8", "longName", "w8", "D8", "", "id", "J", "v8", "()J", "C8", "(J)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;IIZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class e extends p0 implements e4
{
    @io.realm.annotations.e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    
    public e() {
        this(0L, null, null, 0, 0, false, false, 127, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public e(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final int n2, final int n3, final boolean b, final boolean b2) {
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
