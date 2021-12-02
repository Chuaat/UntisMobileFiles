// 
// Decompiled by Procyon v0.5.36
// 

package w4;

import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.w3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f¨\u0006\u001f" }, d2 = { "Lw4/a;", "Lio/realm/p0;", "", "key", "Ljava/lang/String;", "v8", "()Ljava/lang/String;", "A8", "(Ljava/lang/String;)V", "", "entityType", "I", "u8", "()I", "z8", "(I)V", "", "entityId", "J", "t8", "()J", "y8", "(J)V", "backColor", "s8", "x8", "textColor", "w8", "B8", "<init>", "(IJIILjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements w3
{
    private int J;
    private long K;
    private int L;
    private int M;
    @e
    @org.jetbrains.annotations.e
    private String N;
    
    public a() {
        this(0, 0L, 0, 0, null, 31, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final int n, final long n2, final int n3, final int n4, @org.jetbrains.annotations.e final String s) {
        k0.p(s, "key");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.k(n);
        this.p(n2);
        this.q(n3);
        this.w(n4);
        this.q1(s);
    }
    
    public final void A8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.q1(s);
    }
    
    public final void B8(final int n) {
        this.q(n);
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
    public void q(final int l) {
        this.L = l;
    }
    
    @Override
    public void q1(final String n) {
        this.N = n;
    }
    
    @Override
    public int r() {
        return this.L;
    }
    
    public final int s8() {
        return this.u();
    }
    
    public final long t8() {
        return this.o();
    }
    
    @Override
    public int u() {
        return this.M;
    }
    
    public final int u8() {
        return this.l();
    }
    
    @org.jetbrains.annotations.e
    public final String v8() {
        return this.z();
    }
    
    @Override
    public void w(final int m) {
        this.M = m;
    }
    
    public final int w8() {
        return this.r();
    }
    
    public final void x8(final int n) {
        this.w(n);
    }
    
    public final void y8(final long n) {
        this.p(n);
    }
    
    @Override
    public String z() {
        return this.N;
    }
    
    public final void z8(final int n) {
        this.k(n);
    }
}
