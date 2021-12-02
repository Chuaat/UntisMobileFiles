// 
// Decompiled by Procyon v0.5.36
// 

package l4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.e2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&" }, d2 = { "Ll4/b;", "Lio/realm/p0;", "", "groupId", "J", "u8", "()J", "A8", "(J)V", "id", "v8", "B8", "", "longName", "Ljava/lang/String;", "w8", "()Ljava/lang/String;", "C8", "(Ljava/lang/String;)V", "name", "x8", "D8", "", "entityType", "I", "t8", "()I", "z8", "(I)V", "", "active", "Z", "s8", "()Z", "y8", "(Z)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;IJZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements e2
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    private int M;
    private long N;
    private boolean O;
    
    public b() {
        this(0L, null, null, 0, 0L, false, 63, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final int n2, final long n3, final boolean b) {
        k0.p(s, "name");
        k0.p(s2, "longName");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.e(s);
        this.m(s2);
        this.k(n2);
        this.M2(n3);
        this.s(b);
    }
    
    public final void A8(final long n) {
        this.M2(n);
    }
    
    public final void B8(final long n) {
        this.b(n);
    }
    
    public final void C8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.m(s);
    }
    
    public final void D8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
    
    @Override
    public long I4() {
        return this.N;
    }
    
    @Override
    public void M2(final long n) {
        this.N = n;
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
    public void k(final int m) {
        this.M = m;
    }
    
    @Override
    public int l() {
        return this.M;
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
        return this.l();
    }
    
    public final long u8() {
        return this.I4();
    }
    
    public final long v8() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    public final String w8() {
        return this.n();
    }
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.g();
    }
    
    public final void y8(final boolean b) {
        this.s(b);
    }
    
    public final void z8(final int n) {
        this.k(n);
    }
}
