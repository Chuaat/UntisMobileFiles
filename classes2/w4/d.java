// 
// Decompiled by Procyon v0.5.36
// 

package w4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.c4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010'\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010*\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R\"\u0010*\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&¨\u0006/" }, d2 = { "Lw4/d;", "Lio/realm/p0;", "", "displayable", "Z", "u8", "()Z", "D8", "(Z)V", "", "end", "J", "v8", "()J", "E8", "(J)V", "", "longName", "Ljava/lang/String;", "x8", "()Ljava/lang/String;", "G8", "(Ljava/lang/String;)V", "id", "w8", "F8", "start", "z8", "I8", "active", "s8", "B8", "", "backColor", "I", "t8", "()I", "C8", "(I)V", "name", "y8", "H8", "textColor", "A8", "J8", "<init>", "(JLjava/lang/String;Ljava/lang/String;JJIIZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class d extends p0 implements c4
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    private long M;
    private long N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    
    public d() {
        this(0L, null, null, 0L, 0L, 0, 0, false, false, 511, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public d(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final long n2, final long n3, final int n4, final int n5, final boolean b, final boolean b2) {
        k0.p(s, "name");
        k0.p(s2, "longName");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.e(s);
        this.m(s2);
        this.h(n2);
        this.i(n3);
        this.q(n4);
        this.w(n5);
        this.s(b);
        this.Q(b2);
    }
    
    public final int A8() {
        return this.r();
    }
    
    public final void B8(final boolean b) {
        this.s(b);
    }
    
    public final void C8(final int n) {
        this.w(n);
    }
    
    public final void D8(final boolean b) {
        this.Q(b);
    }
    
    public final void E8(final long n) {
        this.i(n);
    }
    
    public final void F8(final long n) {
        this.b(n);
    }
    
    public final void G8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.m(s);
    }
    
    public final void H8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
    
    public final void I8(final long n) {
        this.h(n);
    }
    
    public final void J8(final int n) {
        this.q(n);
    }
    
    @Override
    public boolean L() {
        return this.R;
    }
    
    @Override
    public void Q(final boolean r) {
        this.R = r;
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
        return this.N;
    }
    
    @Override
    public long d() {
        return this.M;
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
    public void h(final long m) {
        this.M = m;
    }
    
    @Override
    public void i(final long n) {
        this.N = n;
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
    public void q(final int o) {
        this.O = o;
    }
    
    @Override
    public int r() {
        return this.O;
    }
    
    @Override
    public void s(final boolean q) {
        this.Q = q;
    }
    
    public final boolean s8() {
        return this.t();
    }
    
    @Override
    public boolean t() {
        return this.Q;
    }
    
    public final int t8() {
        return this.u();
    }
    
    @Override
    public int u() {
        return this.P;
    }
    
    public final boolean u8() {
        return this.L();
    }
    
    public final long v8() {
        return this.c();
    }
    
    @Override
    public void w(final int p) {
        this.P = p;
    }
    
    public final long w8() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.n();
    }
    
    @org.jetbrains.annotations.e
    public final String y8() {
        return this.g();
    }
    
    public final long z8() {
        return this.d();
    }
}
