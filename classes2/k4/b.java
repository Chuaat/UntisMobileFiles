// 
// Decompiled by Procyon v0.5.36
// 

package k4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.y1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c" }, d2 = { "Lk4/b;", "Lio/realm/p0;", "", "longName", "Ljava/lang/String;", "t8", "()Ljava/lang/String;", "x8", "(Ljava/lang/String;)V", "", "type", "I", "v8", "()I", "z8", "(I)V", "name", "u8", "y8", "", "id", "J", "s8", "()J", "w8", "(J)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;I)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements y1
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    private int M;
    
    public b() {
        this(0L, null, null, 0, 15, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final int n2) {
        k0.p(s, "name");
        k0.p(s2, "longName");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.e(s);
        this.m(s2);
        this.q0(n2);
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
    public int m0() {
        return this.M;
    }
    
    @Override
    public String n() {
        return this.L;
    }
    
    @Override
    public void q0(final int m) {
        this.M = m;
    }
    
    public final long s8() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    public final String t8() {
        return this.n();
    }
    
    @org.jetbrains.annotations.e
    public final String u8() {
        return this.g();
    }
    
    public final int v8() {
        return this.m0();
    }
    
    public final void w8(final long n) {
        this.b(n);
    }
    
    public final void x8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.m(s);
    }
    
    public final void y8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
    
    public final void z8(final int n) {
        this.q0(n);
    }
}
