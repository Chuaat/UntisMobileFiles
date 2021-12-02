// 
// Decompiled by Procyon v0.5.36
// 

package m4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.i2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%" }, d2 = { "Lm4/b;", "Lio/realm/p0;", "", "id", "J", "u8", "()J", "B8", "(J)V", "", "text", "Ljava/lang/String;", "y8", "()Ljava/lang/String;", "F8", "(Ljava/lang/String;)V", "start", "x8", "E8", "end", "t8", "A8", "lessonId", "v8", "C8", "remark", "w8", "D8", "", "completed", "Z", "s8", "()Z", "z8", "(Z)V", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements i2
{
    @e
    private long J;
    private long K;
    @org.jetbrains.annotations.e
    private String L;
    @org.jetbrains.annotations.e
    private String M;
    @org.jetbrains.annotations.e
    private String N;
    @org.jetbrains.annotations.e
    private String O;
    private boolean P;
    
    public b() {
        this(0L, 0L, null, null, null, null, false, 127, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n, final long n2, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final String s3, @org.jetbrains.annotations.e final String s4, final boolean b) {
        k0.p(s, "start");
        k0.p(s2, "end");
        k0.p(s3, "text");
        k0.p(s4, "remark");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.G(n2);
        this.v(s);
        this.x(s2);
        this.j(s3);
        this.e0(s4);
        this.c0(b);
    }
    
    public final void A8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.x(s);
    }
    
    public final void B8(final long n) {
        this.b(n);
    }
    
    @Override
    public long C() {
        return this.K;
    }
    
    public final void C8(final long n) {
        this.G(n);
    }
    
    public final void D8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e0(s);
    }
    
    public final void E8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.v(s);
    }
    
    public final void F8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public void G(final long k) {
        this.K = k;
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
    public String c() {
        return this.M;
    }
    
    @Override
    public void c0(final boolean p) {
        this.P = p;
    }
    
    @Override
    public String d() {
        return this.L;
    }
    
    @Override
    public void e0(final String o) {
        this.O = o;
    }
    
    @Override
    public String f() {
        return this.N;
    }
    
    @Override
    public boolean i0() {
        return this.P;
    }
    
    @Override
    public void j(final String n) {
        this.N = n;
    }
    
    @Override
    public String j0() {
        return this.O;
    }
    
    public final boolean s8() {
        return this.i0();
    }
    
    @org.jetbrains.annotations.e
    public final String t8() {
        return this.c();
    }
    
    public final long u8() {
        return this.a();
    }
    
    @Override
    public void v(final String l) {
        this.L = l;
    }
    
    public final long v8() {
        return this.C();
    }
    
    @org.jetbrains.annotations.e
    public final String w8() {
        return this.j0();
    }
    
    @Override
    public void x(final String m) {
        this.M = m;
    }
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.d();
    }
    
    @org.jetbrains.annotations.e
    public final String y8() {
        return this.f();
    }
    
    public final void z8(final boolean b) {
        this.c0(b);
    }
}
