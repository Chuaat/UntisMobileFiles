// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.ext;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.d;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0002\"&\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005¨\u0006\u0007" }, d2 = { "Lkotlin/reflect/d;", "", "a", "b", "", "Ljava/util/Map;", "classNames", "koin-core" }, k = 2, mv = { 1, 4, 0 })
public final class a
{
    private static final Map<d<?>, String> a;
    
    static {
        a = new ConcurrentHashMap<d<?>, String>();
    }
    
    @e
    public static final String a(@e final d<?> d) {
        k0.q((Object)d, "$this$getFullName");
        final String s = org.koin.ext.a.a.get(d);
        String b;
        if (s != null) {
            b = s;
        }
        else {
            b = b(d);
        }
        return b;
    }
    
    private static final String b(@e final d<?> d) {
        final String name = m6.a.c((d)d).getName();
        final Map<d<?>, String> a = org.koin.ext.a.a;
        k0.h((Object)name, "name");
        a.put(d, name);
        return name;
    }
}
