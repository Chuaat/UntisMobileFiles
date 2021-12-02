// 
// Decompiled by Procyon v0.5.36
// 

package v4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.s3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b%\u0010&R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'" }, d2 = { "Lv4/a;", "Lio/realm/p0;", "Lio/realm/l0;", "Lo4/a;", "driveAttachments", "Lio/realm/l0;", "s8", "()Lio/realm/l0;", "y8", "(Lio/realm/l0;)V", "", "end", "J", "t8", "()J", "z8", "(J)V", "periodId", "u8", "A8", "", "synced", "Z", "w8", "()Z", "C8", "(Z)V", "start", "v8", "B8", "", "text", "Ljava/lang/String;", "x8", "()Ljava/lang/String;", "D8", "(Ljava/lang/String;)V", "<init>", "(JLjava/lang/String;JJLio/realm/l0;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements s3
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    private long L;
    private long M;
    @org.jetbrains.annotations.e
    private l0<o4.a> N;
    private boolean O;
    
    public a() {
        this(0L, null, 0L, 0L, null, false, 63, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, @org.jetbrains.annotations.e final String s, final long n2, final long n3, @org.jetbrains.annotations.e final l0<o4.a> l0, final boolean b) {
        k0.p(s, "text");
        k0.p(l0, "driveAttachments");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.y(n);
        this.j(s);
        this.h(n2);
        this.i(n3);
        this.B(l0);
        this.F(b);
    }
    
    @Override
    public boolean A() {
        return this.O;
    }
    
    public final void A8(final long n) {
        this.y(n);
    }
    
    @Override
    public void B(final l0 n) {
        this.N = (l0<o4.a>)n;
    }
    
    public final void B8(final long n) {
        this.h(n);
    }
    
    public final void C8(final boolean b) {
        this.F(b);
    }
    
    @Override
    public long D() {
        return this.J;
    }
    
    public final void D8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public l0 E() {
        return this.N;
    }
    
    @Override
    public void F(final boolean o) {
        this.O = o;
    }
    
    @Override
    public long c() {
        return this.M;
    }
    
    @Override
    public long d() {
        return this.L;
    }
    
    @Override
    public String f() {
        return this.K;
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
    public void j(final String k) {
        this.K = k;
    }
    
    @org.jetbrains.annotations.e
    public final l0<o4.a> s8() {
        return (l0<o4.a>)this.E();
    }
    
    public final long t8() {
        return this.c();
    }
    
    public final long u8() {
        return this.D();
    }
    
    public final long v8() {
        return this.d();
    }
    
    public final boolean w8() {
        return this.A();
    }
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.f();
    }
    
    @Override
    public void y(final long j) {
        this.J = j;
    }
    
    public final void y8(@org.jetbrains.annotations.e final l0<o4.a> l0) {
        k0.p(l0, "<set-?>");
        this.B(l0);
    }
    
    public final void z8(final long n) {
        this.i(n);
    }
}
