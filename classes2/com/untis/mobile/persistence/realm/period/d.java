// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm.period;

import io.realm.internal.p;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import io.realm.a5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/persistence/realm/period/d;", "Lio/realm/p0;", "", "J", "t8", "()J", "v8", "(J)V", "original", "K", "s8", "u8", "current", "<init>", "(JJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class d extends p0 implements a5
{
    private long J;
    private long K;
    
    public d() {
        this(0L, 0L, 3, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public d(final long n, final long n2) {
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.R(n);
        this.M(n2);
    }
    
    @Override
    public long I() {
        return this.J;
    }
    
    @Override
    public void M(final long k) {
        this.K = k;
    }
    
    @Override
    public long O() {
        return this.K;
    }
    
    @Override
    public void R(final long j) {
        this.J = j;
    }
    
    public final long s8() {
        return this.O();
    }
    
    public final long t8() {
        return this.I();
    }
    
    public final void u8(final long n) {
        this.M(n);
    }
    
    public final void v8(final long n) {
        this.R(n);
    }
}
