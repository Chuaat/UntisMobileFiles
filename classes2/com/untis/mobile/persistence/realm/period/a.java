// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm.period;

import io.realm.internal.p;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import io.realm.u4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/persistence/realm/period/a;", "Lio/realm/p0;", "", "L", "J", "s8", "()J", "v8", "(J)V", "currentId", "", "I", "t8", "()I", "w8", "(I)V", "entityType", "K", "u8", "x8", "originalId", "<init>", "(IJJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements u4
{
    private int J;
    private long K;
    private long L;
    
    public a() {
        this(0, 0L, 0L, 7, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final int n, final long n2, final long n3) {
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.k(n);
        this.I0(n2);
        this.s1(n3);
    }
    
    @Override
    public void I0(final long k) {
        this.K = k;
    }
    
    @Override
    public long J1() {
        return this.K;
    }
    
    @Override
    public long N0() {
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
    public void s1(final long l) {
        this.L = l;
    }
    
    public final long s8() {
        return this.N0();
    }
    
    public final int t8() {
        return this.l();
    }
    
    public final long u8() {
        return this.J1();
    }
    
    public final void v8(final long n) {
        this.s1(n);
    }
    
    public final void w8(final int n) {
        this.k(n);
    }
    
    public final void x8(final long n) {
        this.I0(n);
    }
}
