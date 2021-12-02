// 
// Decompiled by Procyon v0.5.36
// 

package a5;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.o5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b$\b\u0016\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010-\u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0017\u0012\b\b\u0002\u00103\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010*\u001a\u00020\u0010\u0012\b\b\u0002\u00106\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010'\u001a\u00020\t¢\u0006\u0004\b9\u0010:R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\"\u0010$\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\"\u0010'\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u000fR\"\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0012\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\"\u0010-\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR\"\u00100\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R\"\u00103\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0012\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R\"\u00106\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u000b\u001a\u0004\b7\u0010\r\"\u0004\b8\u0010\u000f¨\u0006;" }, d2 = { "La5/a;", "Lio/realm/p0;", "", "deleted", "Z", "s8", "()Z", "F8", "(Z)V", "", "id", "I", "v8", "()I", "I8", "(I)V", "", "message", "Ljava/lang/String;", "x8", "()Ljava/lang/String;", "K8", "(Ljava/lang/String;)V", "", "target", "J", "C8", "()J", "P8", "(J)V", "publishDateTime", "B8", "O8", "profileId", "A8", "N8", "entityId", "t8", "G8", "offset", "z8", "M8", "messageLong", "y8", "L8", "jobId", "w8", "J8", "extras", "u8", "H8", "title", "D8", "Q8", "type", "E8", "R8", "<init>", "(IILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLjava/lang/String;JI)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements o5
{
    @e
    private int J;
    private int K;
    @org.jetbrains.annotations.e
    private String L;
    private long M;
    @org.jetbrains.annotations.e
    private String N;
    @org.jetbrains.annotations.e
    private String O;
    @org.jetbrains.annotations.e
    private String P;
    private int Q;
    private long R;
    private boolean S;
    @org.jetbrains.annotations.e
    private String T;
    private long U;
    private int V;
    
    public a() {
        this(0, 0, null, 0L, null, null, null, 0, 0L, false, null, 0L, 0, 8191, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final int n, final int n2, @org.jetbrains.annotations.e final String s, final long n3, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final String s3, @org.jetbrains.annotations.e final String s4, final int n4, final long n5, final boolean b, @org.jetbrains.annotations.e final String s5, final long n6, final int n7) {
        k0.p(s, "profileId");
        k0.p(s2, "title");
        k0.p(s3, "message");
        k0.p(s4, "messageLong");
        k0.p(s5, "extras");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.h2(n);
        this.I2(n2);
        this.G7(s);
        this.n2(n3);
        this.A3(s2);
        this.n5(s3);
        this.C3(s4);
        this.q0(n4);
        this.p(n5);
        this.D2(b);
        this.R4(s5);
        this.H5(n6);
        this.x3(n7);
    }
    
    @Override
    public void A3(final String n) {
        this.N = n;
    }
    
    @Override
    public String A4() {
        return this.P;
    }
    
    @org.jetbrains.annotations.e
    public final String A8() {
        return this.X2();
    }
    
    public final long B8() {
        return this.V6();
    }
    
    @Override
    public void C3(final String p) {
        this.P = p;
    }
    
    public final long C8() {
        return this.F7();
    }
    
    @Override
    public void D2(final boolean s) {
        this.S = s;
    }
    
    @org.jetbrains.annotations.e
    public final String D8() {
        return this.q6();
    }
    
    public final int E8() {
        return this.m0();
    }
    
    @Override
    public long F7() {
        return this.U;
    }
    
    public final void F8(final boolean b) {
        this.D2(b);
    }
    
    @Override
    public void G7(final String l) {
        this.L = l;
    }
    
    public final void G8(final long n) {
        this.p(n);
    }
    
    @Override
    public void H5(final long u) {
        this.U = u;
    }
    
    public final void H8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.R4(s);
    }
    
    @Override
    public void I2(final int k) {
        this.K = k;
    }
    
    public final void I8(final int n) {
        this.h2(n);
    }
    
    public final void J8(final int n) {
        this.I2(n);
    }
    
    public final void K8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.n5(s);
    }
    
    public final void L8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.C3(s);
    }
    
    public final void M8(final int n) {
        this.x3(n);
    }
    
    public final void N8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.G7(s);
    }
    
    public final void O8(final long n) {
        this.n2(n);
    }
    
    public final void P8(final long n) {
        this.H5(n);
    }
    
    public final void Q8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.A3(s);
    }
    
    @Override
    public void R4(final String t) {
        this.T = t;
    }
    
    @Override
    public String R7() {
        return this.T;
    }
    
    public final void R8(final int n) {
        this.q0(n);
    }
    
    @Override
    public long V6() {
        return this.M;
    }
    
    @Override
    public String X2() {
        return this.L;
    }
    
    @Override
    public int a() {
        return this.J;
    }
    
    @Override
    public void h2(final int j) {
        this.J = j;
    }
    
    @Override
    public boolean i6() {
        return this.S;
    }
    
    @Override
    public String k2() {
        return this.O;
    }
    
    @Override
    public int m0() {
        return this.Q;
    }
    
    @Override
    public void n2(final long m) {
        this.M = m;
    }
    
    @Override
    public void n5(final String o) {
        this.O = o;
    }
    
    @Override
    public long o() {
        return this.R;
    }
    
    @Override
    public void p(final long r) {
        this.R = r;
    }
    
    @Override
    public void q0(final int q) {
        this.Q = q;
    }
    
    @Override
    public String q6() {
        return this.N;
    }
    
    @Override
    public int s3() {
        return this.V;
    }
    
    public final boolean s8() {
        return this.i6();
    }
    
    public final long t8() {
        return this.o();
    }
    
    @org.jetbrains.annotations.e
    public final String u8() {
        return this.R7();
    }
    
    public final int v8() {
        return this.a();
    }
    
    public final int w8() {
        return this.x4();
    }
    
    @Override
    public void x3(final int v) {
        this.V = v;
    }
    
    @Override
    public int x4() {
        return this.K;
    }
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.k2();
    }
    
    @org.jetbrains.annotations.e
    public final String y8() {
        return this.A4();
    }
    
    public final int z8() {
        return this.s3();
    }
}
