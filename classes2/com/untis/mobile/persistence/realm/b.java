// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm;

import io.realm.internal.p;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import io.realm.a1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Lcom/untis/mobile/persistence/realm/b;", "Lio/realm/p0;", "", "J", "s8", "()J", "t8", "(J)V", "value", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements a1
{
    private long J;
    
    public b() {
        this(0L, 1, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final long n) {
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.Z5(n);
    }
    
    @Override
    public void Z5(final long j) {
        this.J = j;
    }
    
    @Override
    public long l0() {
        return this.J;
    }
    
    public final long s8() {
        return this.l0();
    }
    
    public final void t8(final long n) {
        this.Z5(n);
    }
}
