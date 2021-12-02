// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.notification;

import kotlin.jvm.internal.k0;
import com.untis.mobile.systemNotifications.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\n" }, d2 = { "Lcom/untis/mobile/persistence/dao/notification/c;", "", "La5/a;", "realmSystemNotification", "Lcom/untis/mobile/systemNotifications/a;", "b", "systemNotification", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c
{
    @e
    public static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    @e
    public final a5.a a(@e final a a) {
        k0.p(a, "systemNotification");
        return new a5.a(a.e(), a.f(), a.m(), a.a(), a.q(), a.h(), a.i(), a.r().d(), a.c(), a.s(), a.d(), a.n(), a.j());
    }
    
    @e
    public final a b(@e final a5.a a) {
        k0.p(a, "realmSystemNotification");
        return new a(a.v8(), a.w8(), a.A8(), a.B8(), a.D8(), a.x8(), a.y8(), com.untis.mobile.systemNotifications.e.H.a(a.E8()), a.t8(), a.s8(), a.u8(), a.C8(), a.z8());
    }
}
