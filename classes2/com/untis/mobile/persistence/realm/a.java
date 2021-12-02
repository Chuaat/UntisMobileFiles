// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm;

import io.realm.internal.p;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import io.realm.y0;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/realm/a;", "Lio/realm/p0;", "", "J", "I", "s8", "()I", "t8", "(I)V", "value", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements y0
{
    private int J;
    
    public a() {
        this(0, 1, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final int n) {
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.f6(n);
    }
    
    @Override
    public void f6(final int j) {
        this.J = j;
    }
    
    @Override
    public int l0() {
        return this.J;
    }
    
    public final int s8() {
        return this.l0();
    }
    
    public final void t8(final int n) {
        this.f6(n);
    }
}
