// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import kotlin.jvm.internal.k0;
import com.untis.mobile.utils.time.a;
import org.joda.time.c;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002J\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006J\u000e\u0010\u000b\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/utils/v;", "", "Lorg/joda/time/c;", "e", "kotlin.jvm.PlatformType", "a", "Lorg/joda/time/t;", "i", "g", "h", "d", "f", "c", "Lorg/joda/time/t;", "()Lorg/joda/time/t;", "START_OF_END_OF_PREMIUM_ANNOUNCEMENT", "b", "END_OF_PREMIUM", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class v
{
    @e
    public static final v a;
    @e
    private static final t b;
    @e
    private static final t c;
    
    static {
        a = new v();
        b = new t(2021, 7, 31);
        c = new t(2021, 6, 27);
    }
    
    private v() {
    }
    
    public final c a() {
        return org.joda.time.c.G0();
    }
    
    @e
    public final t b() {
        return v.b;
    }
    
    @e
    public final t c() {
        return v.c;
    }
    
    public final t d() {
        return this.g().S0(1);
    }
    
    @e
    public final c e() {
        return com.untis.mobile.utils.time.a.a();
    }
    
    public final t f() {
        return this.g().S0(7);
    }
    
    @e
    public final t g() {
        return com.untis.mobile.utils.time.a.b();
    }
    
    @e
    public final t h() {
        final t l0 = this.g().l0(1);
        k0.m(l0);
        return l0;
    }
    
    public final t i() {
        return this.g().O(1);
    }
}
