// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.injection;

import n6.l;
import org.koin.dsl.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"\u0019\u0010\u0004\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0019\u0010\u0007\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0003\"\u0019\u0010\b\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003¨\u0006\t" }, d2 = { "Lorg/koin/core/module/a;", "b", "Lorg/koin/core/module/a;", "()Lorg/koin/core/module/a;", "substitutionPlanningModules", "a", "c", "untisMobileModules", "calendarModules", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class a
{
    @e
    private static final org.koin.core.module.a a;
    @e
    private static final org.koin.core.module.a b;
    @e
    private static final org.koin.core.module.a c;
    
    static {
        a = org.koin.dsl.c.b(false, false, (l)a$c.G, 3, (Object)null);
        b = org.koin.dsl.c.b(false, false, (l)a$b.G, 3, (Object)null);
        c = org.koin.dsl.c.b(false, false, (l)a$a.G, 3, (Object)null);
    }
    
    @e
    public static final org.koin.core.module.a a() {
        return com.untis.mobile.injection.a.c;
    }
    
    @e
    public static final org.koin.core.module.a b() {
        return com.untis.mobile.injection.a.b;
    }
    
    @e
    public static final org.koin.core.module.a c() {
        return com.untis.mobile.injection.a.a;
    }
}
