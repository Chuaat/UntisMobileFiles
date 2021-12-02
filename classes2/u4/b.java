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
import io.realm.m3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\"\u0010!\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017¨\u0006&" }, d2 = { "Lu4/b;", "Lio/realm/p0;", "", "cancelled", "Z", "s8", "()Z", "z8", "(Z)V", "Lio/realm/l0;", "Lu4/c;", "students", "Lio/realm/l0;", "x8", "()Lio/realm/l0;", "E8", "(Lio/realm/l0;)V", "", "roomId", "J", "v8", "()J", "C8", "(J)V", "id", "u8", "B8", "end", "t8", "A8", "start", "w8", "D8", "teacherId", "y8", "F8", "<init>", "(JJJJJZLio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements m3
{
    @e
    private long J;
    private long K;
    private long L;
    private long M;
    private long N;
    private boolean O;
    @org.jetbrains.annotations.e
    private l0<c> P;
    
    public b() {
        this(0L, 0L, 0L, 0L, 0L, false, null, 127, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, final long n2, final long n3, final long n4, final long n5, final boolean b, @org.jetbrains.annotations.e final l0<c> l0) {
        k0.p(l0, "students");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.h(n2);
        this.i(n3);
        this.Y(n4);
        this.C5(n5);
        this.y1(b);
        this.C0(l0);
    }
    
    public final void A8(final long n) {
        this.i(n);
    }
    
    public final void B8(final long n) {
        this.b(n);
    }
    
    @Override
    public void C0(final l0 p) {
        this.P = (l0<c>)p;
    }
    
    @Override
    public void C5(final long n) {
        this.N = n;
    }
    
    public final void C8(final long n) {
        this.C5(n);
    }
    
    public final void D8(final long n) {
        this.h(n);
    }
    
    public final void E8(@org.jetbrains.annotations.e final l0<c> l0) {
        k0.p(l0, "<set-?>");
        this.C0(l0);
    }
    
    public final void F8(final long n) {
        this.Y(n);
    }
    
    @Override
    public void Y(final long m) {
        this.M = m;
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
        return this.L;
    }
    
    @Override
    public long d() {
        return this.K;
    }
    
    @Override
    public void h(final long k) {
        this.K = k;
    }
    
    @Override
    public void i(final long l) {
        this.L = l;
    }
    
    @Override
    public boolean k1() {
        return this.O;
    }
    
    @Override
    public l0 p0() {
        return this.P;
    }
    
    public final boolean s8() {
        return this.k1();
    }
    
    public final long t8() {
        return this.c();
    }
    
    public final long u8() {
        return this.a();
    }
    
    @Override
    public long v7() {
        return this.N;
    }
    
    public final long v8() {
        return this.v7();
    }
    
    public final long w8() {
        return this.d();
    }
    
    @org.jetbrains.annotations.e
    public final l0<c> x8() {
        return (l0<c>)this.p0();
    }
    
    @Override
    public long y0() {
        return this.M;
    }
    
    @Override
    public void y1(final boolean o) {
        this.O = o;
    }
    
    public final long y8() {
        return this.y0();
    }
    
    public final void z8(final boolean b) {
        this.y1(b);
    }
}
