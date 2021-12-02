// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.time;

import kotlin.jvm.internal.k0;
import org.joda.time.v;
import org.joda.time.t;
import m6.k;
import v5.b;
import v5.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/utils/time/a;", "", "Lkotlin/j2;", "e", "Lv5/c;", "newTimeSource", "f", "Lorg/joda/time/c;", "a", "Lorg/joda/time/t;", "b", "Lorg/joda/time/v;", "c", "", "d", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @e
    public static final a a;
    @e
    private static c b;
    
    static {
        a = new a();
        com.untis.mobile.utils.time.a.b = new b();
    }
    
    private a() {
    }
    
    @k
    @e
    public static final org.joda.time.c a() {
        return new org.joda.time.c(d());
    }
    
    @k
    @e
    public static final t b() {
        return new t(d());
    }
    
    @k
    @e
    public static final v c() {
        return new v(d());
    }
    
    @k
    public static final long d() {
        return com.untis.mobile.utils.time.a.b.a();
    }
    
    @k
    public static final void e() {
        com.untis.mobile.utils.time.a.b = new b();
    }
    
    @k
    public static final void f(@e final c b) {
        k0.p(b, "newTimeSource");
        com.untis.mobile.utils.time.a.b = b;
    }
}
