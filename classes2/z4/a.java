// 
// Decompiled by Procyon v0.5.36
// 

package z4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.i5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\b¨\u0006\u001c" }, d2 = { "Lz4/a;", "Lio/realm/p0;", "", "firstName", "Ljava/lang/String;", "s8", "()Ljava/lang/String;", "w8", "(Ljava/lang/String;)V", "", "id", "J", "u8", "()J", "y8", "(J)V", "", "hasTimeTableAccess", "Z", "t8", "()Z", "x8", "(Z)V", "lastName", "v8", "z8", "<init>", "(JLjava/lang/String;Ljava/lang/String;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements i5
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    private boolean M;
    
    public a() {
        this(0L, null, null, false, 15, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final boolean b) {
        k0.p(s, "firstName");
        k0.p(s2, "lastName");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.v0(s);
        this.k0(s2);
        this.c2(b);
    }
    
    @Override
    public String B0() {
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
    public void c2(final boolean m) {
        this.M = m;
    }
    
    @Override
    public boolean e5() {
        return this.M;
    }
    
    @Override
    public void k0(final String l) {
        this.L = l;
    }
    
    @org.jetbrains.annotations.e
    public final String s8() {
        return this.B0();
    }
    
    public final boolean t8() {
        return this.e5();
    }
    
    public final long u8() {
        return this.a();
    }
    
    @Override
    public void v0(final String k) {
        this.K = k;
    }
    
    @org.jetbrains.annotations.e
    public final String v8() {
        return this.z0();
    }
    
    public final void w8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.v0(s);
    }
    
    public final void x8(final boolean b) {
        this.c2(b);
    }
    
    public final void y8(final long n) {
        this.b(n);
    }
    
    @Override
    public String z0() {
        return this.L;
    }
    
    public final void z8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.k0(s);
    }
}
