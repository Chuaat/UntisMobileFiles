// 
// Decompiled by Procyon v0.5.36
// 

package c5;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.c6;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\"\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&" }, d2 = { "Lc5/d;", "Lio/realm/p0;", "", "entityId", "J", "t8", "()J", "z8", "(J)V", "", "favorite", "Z", "v8", "()Z", "B8", "(Z)V", "", "entityType", "I", "u8", "()I", "A8", "(I)V", "timestamp", "x8", "D8", "counter", "s8", "y8", "", "id", "Ljava/lang/String;", "w8", "()Ljava/lang/String;", "C8", "(Ljava/lang/String;)V", "<init>", "(IJZIJLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class d extends p0 implements c6
{
    private int J;
    private long K;
    private boolean L;
    private int M;
    private long N;
    @e
    @org.jetbrains.annotations.e
    private String O;
    
    public d() {
        this(0, 0L, false, 0, 0L, null, 63, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public d(final int n, final long n2, final boolean b, final int n3, final long n4, @org.jetbrains.annotations.e final String s) {
        k0.p(s, "id");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.k(n);
        this.p(n2);
        this.R6(b);
        this.s7(n3);
        this.s0(n4);
        this.D1(s);
    }
    
    public final void A8(final int n) {
        this.k(n);
    }
    
    public final void B8(final boolean b) {
        this.R6(b);
    }
    
    public final void C8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.D1(s);
    }
    
    @Override
    public void D1(final String o) {
        this.O = o;
    }
    
    public final void D8(final long n) {
        this.s0(n);
    }
    
    @Override
    public void R6(final boolean l) {
        this.L = l;
    }
    
    @Override
    public String a() {
        return this.O;
    }
    
    @Override
    public long b0() {
        return this.N;
    }
    
    @Override
    public boolean c6() {
        return this.L;
    }
    
    @Override
    public void k(final int j) {
        this.J = j;
    }
    
    @Override
    public int l() {
        return this.J;
    }
    
    @Override
    public long o() {
        return this.K;
    }
    
    @Override
    public void p(final long k) {
        this.K = k;
    }
    
    @Override
    public void s0(final long n) {
        this.N = n;
    }
    
    @Override
    public void s7(final int m) {
        this.M = m;
    }
    
    public final int s8() {
        return this.t6();
    }
    
    @Override
    public int t6() {
        return this.M;
    }
    
    public final long t8() {
        return this.o();
    }
    
    public final int u8() {
        return this.l();
    }
    
    public final boolean v8() {
        return this.c6();
    }
    
    @org.jetbrains.annotations.e
    public final String w8() {
        return this.a();
    }
    
    public final long x8() {
        return this.b0();
    }
    
    public final void y8(final int n) {
        this.s7(n);
    }
    
    public final void z8(final long n) {
        this.p(n);
    }
}
