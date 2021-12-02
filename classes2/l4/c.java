// 
// Decompiled by Procyon v0.5.36
// 

package l4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.c2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\b¨\u0006\u001c" }, d2 = { "Ll4/c;", "Lio/realm/p0;", "", "name", "Ljava/lang/String;", "v8", "()Ljava/lang/String;", "z8", "(Ljava/lang/String;)V", "", "id", "J", "t8", "()J", "x8", "(J)V", "", "active", "Z", "s8", "()Z", "w8", "(Z)V", "longName", "u8", "y8", "<init>", "(JLjava/lang/String;Ljava/lang/String;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class c extends p0 implements c2
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    private boolean M;
    
    public c() {
        this(0L, null, null, false, 15, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public c(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final boolean b) {
        k0.p(s, "name");
        k0.p(s2, "longName");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.e(s);
        this.m(s2);
        this.s(b);
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
    public String n() {
        return this.L;
    }
    
    @Override
    public void s(final boolean m) {
        this.M = m;
    }
    
    public final boolean s8() {
        return this.t();
    }
    
    @Override
    public boolean t() {
        return this.M;
    }
    
    public final long t8() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    public final String u8() {
        return this.n();
    }
    
    @org.jetbrains.annotations.e
    public final String v8() {
        return this.g();
    }
    
    public final void w8(final boolean b) {
        this.s(b);
    }
    
    public final void x8(final long n) {
        this.b(n);
    }
    
    public final void y8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.m(s);
    }
    
    public final void z8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
}
