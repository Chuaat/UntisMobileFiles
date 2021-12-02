// 
// Decompiled by Procyon v0.5.36
// 

package n4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.k2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\b¨\u0006*" }, d2 = { "Ln4/a;", "Lio/realm/p0;", "", "info", "Ljava/lang/String;", "u8", "()Ljava/lang/String;", "B8", "(Ljava/lang/String;)V", "", "sync", "Z", "y8", "()Z", "F8", "(Z)V", "Lio/realm/l0;", "Lo4/a;", "driveAttachments", "Lio/realm/l0;", "s8", "()Lio/realm/l0;", "z8", "(Lio/realm/l0;)V", "", "id", "J", "t8", "()J", "A8", "(J)V", "local", "w8", "D8", "substitution", "x8", "E8", "lesson", "v8", "C8", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements k2
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    @org.jetbrains.annotations.e
    private String M;
    @org.jetbrains.annotations.e
    private String N;
    private boolean O;
    @org.jetbrains.annotations.e
    private l0<o4.a> P;
    
    public a() {
        this(0L, null, null, null, null, false, null, 127, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final String s3, @org.jetbrains.annotations.e final String s4, final boolean b, @org.jetbrains.annotations.e final l0<o4.a> l0) {
        k0.p(s, "info");
        k0.p(s2, "substitution");
        k0.p(s3, "lesson");
        k0.p(s4, "local");
        k0.p(l0, "driveAttachments");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.Z0(s);
        this.G1(s2);
        this.P0(s3);
        this.S0(s4);
        this.Z3(b);
        this.B(l0);
    }
    
    public final void A8(final long n) {
        this.b(n);
    }
    
    @Override
    public void B(final l0 p) {
        this.P = (l0<o4.a>)p;
    }
    
    public final void B8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.Z0(s);
    }
    
    public final void C8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.P0(s);
    }
    
    public final void D8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.S0(s);
    }
    
    @Override
    public l0 E() {
        return this.P;
    }
    
    public final void E8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.G1(s);
    }
    
    public final void F8(final boolean b) {
        this.Z3(b);
    }
    
    @Override
    public void G1(final String l) {
        this.L = l;
    }
    
    @Override
    public String H0() {
        return this.K;
    }
    
    @Override
    public String K0() {
        return this.L;
    }
    
    @Override
    public void P0(final String m) {
        this.M = m;
    }
    
    @Override
    public void S0(final String n) {
        this.N = n;
    }
    
    @Override
    public void Z0(final String k) {
        this.K = k;
    }
    
    @Override
    public void Z3(final boolean o) {
        this.O = o;
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
    public String g0() {
        return this.N;
    }
    
    @Override
    public String i1() {
        return this.M;
    }
    
    @org.jetbrains.annotations.e
    public final l0<o4.a> s8() {
        return (l0<o4.a>)this.E();
    }
    
    public final long t8() {
        return this.a();
    }
    
    @Override
    public boolean u2() {
        return this.O;
    }
    
    @org.jetbrains.annotations.e
    public final String u8() {
        return this.H0();
    }
    
    @org.jetbrains.annotations.e
    public final String v8() {
        return this.i1();
    }
    
    @org.jetbrains.annotations.e
    public final String w8() {
        return this.g0();
    }
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.K0();
    }
    
    public final boolean y8() {
        return this.u2();
    }
    
    public final void z8(@org.jetbrains.annotations.e final l0<o4.a> l0) {
        k0.p(l0, "<set-?>");
        this.B(l0);
    }
}
