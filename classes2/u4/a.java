// 
// Decompiled by Procyon v0.5.36
// 

package u4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.l0;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.o3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 " }, d2 = { "Lu4/a;", "Lio/realm/p0;", "", "name", "Ljava/lang/String;", "v8", "()Ljava/lang/String;", "A8", "(Ljava/lang/String;)V", "", "end", "J", "t8", "()J", "y8", "(J)V", "id", "u8", "z8", "start", "w8", "B8", "Lio/realm/l0;", "Lu4/b;", "appointments", "Lio/realm/l0;", "s8", "()Lio/realm/l0;", "x8", "(Lio/realm/l0;)V", "<init>", "(JLjava/lang/String;JJLio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements o3
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    private long L;
    private long M;
    @org.jetbrains.annotations.e
    private l0<b> N;
    
    public a() {
        this(0L, null, 0L, 0L, null, 31, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, @org.jetbrains.annotations.e final String s, final long n2, final long n3, @org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(s, "name");
        k0.p(l0, "appointments");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.e(s);
        this.h(n2);
        this.i(n3);
        this.J5(l0);
    }
    
    public final void A8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
    
    public final void B8(final long n) {
        this.h(n);
    }
    
    @Override
    public l0 H7() {
        return this.N;
    }
    
    @Override
    public void J5(final l0 n) {
        this.N = (l0<b>)n;
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
    public long d() {
        return this.L;
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
    public void h(final long l) {
        this.L = l;
    }
    
    @Override
    public void i(final long m) {
        this.M = m;
    }
    
    @org.jetbrains.annotations.e
    public final l0<b> s8() {
        return (l0<b>)this.H7();
    }
    
    public final long t8() {
        return this.c();
    }
    
    public final long u8() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    public final String v8() {
        return this.g();
    }
    
    public final long w8() {
        return this.d();
    }
    
    public final void x8(@org.jetbrains.annotations.e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.J5(l0);
    }
    
    public final void y8(final long n) {
        this.i(n);
    }
    
    public final void z8(final long n) {
        this.b(n);
    }
}
