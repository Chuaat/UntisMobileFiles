// 
// Decompiled by Procyon v0.5.36
// 

package x4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.o4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$" }, d2 = { "Lx4/a;", "Lio/realm/p0;", "", "text", "Ljava/lang/String;", "w8", "()Ljava/lang/String;", "B8", "(Ljava/lang/String;)V", "Lio/realm/l0;", "Lo4/a;", "driveAttachments", "Lio/realm/l0;", "s8", "()Lio/realm/l0;", "x8", "(Lio/realm/l0;)V", "", "id", "J", "t8", "()J", "y8", "(J)V", "subject", "v8", "A8", "", "read", "Z", "u8", "()Z", "z8", "(Z)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lio/realm/l0;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements o4
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    @org.jetbrains.annotations.e
    private l0<o4.a> M;
    private boolean N;
    
    public a() {
        this(0L, null, null, null, false, 31, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final l0<o4.a> l0, final boolean b) {
        k0.p(s, "subject");
        k0.p(s2, "text");
        k0.p(l0, "driveAttachments");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.v4(s);
        this.j(s2);
        this.B(l0);
        this.E6(b);
    }
    
    public final void A8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.v4(s);
    }
    
    @Override
    public void B(final l0 m) {
        this.M = (l0<o4.a>)m;
    }
    
    public final void B8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public l0 E() {
        return this.M;
    }
    
    @Override
    public void E6(final boolean n) {
        this.N = n;
    }
    
    @Override
    public String K() {
        return this.K;
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
    public String f() {
        return this.L;
    }
    
    @Override
    public boolean i5() {
        return this.N;
    }
    
    @Override
    public void j(final String l) {
        this.L = l;
    }
    
    @org.jetbrains.annotations.e
    public final l0<o4.a> s8() {
        return (l0<o4.a>)this.E();
    }
    
    public final long t8() {
        return this.a();
    }
    
    public final boolean u8() {
        return this.i5();
    }
    
    @Override
    public void v4(final String k) {
        this.K = k;
    }
    
    @org.jetbrains.annotations.e
    public final String v8() {
        return this.K();
    }
    
    @org.jetbrains.annotations.e
    public final String w8() {
        return this.f();
    }
    
    public final void x8(@org.jetbrains.annotations.e final l0<o4.a> l0) {
        k0.p(l0, "<set-?>");
        this.B(l0);
    }
    
    public final void y8(final long n) {
        this.b(n);
    }
    
    public final void z8(final boolean b) {
        this.E6(b);
    }
}
