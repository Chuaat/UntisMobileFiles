// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import org.joda.time.base.g;
import org.joda.time.c;
import m6.k;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\n" }, d2 = { "Lcom/untis/mobile/utils/s0;", "", "", "b", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "id", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class s0
{
    @e
    public static final s0 a;
    @e
    private static final AtomicInteger b;
    
    static {
        b = new AtomicInteger((a = new s0()).b());
    }
    
    private s0() {
    }
    
    @k
    public static final int a() {
        return s0.b.incrementAndGet();
    }
    
    private final int b() {
        return (int)(((g)new c()).n() - ((g)c.G0().y1(1).h1().G0(((org.joda.time.base.c)new c()).K2())).n());
    }
}
