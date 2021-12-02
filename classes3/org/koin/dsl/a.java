// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.dsl;

import kotlin.j2;
import n6.l;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.d;
import org.jetbrains.annotations.e;
import org.koin.core.definition.b;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0086\u0004\u001a.\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u00012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001e\u0010\f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0000`\u000bH\u0086\u0004\u001a?\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001e\u0010\u000f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0000`\u000eH\u0086\u0004¨\u0006\u0011" }, d2 = { "T", "Lorg/koin/core/definition/b;", "Lkotlin/reflect/d;", "clazz", "a", "", "classes", "b", "(Lorg/koin/core/definition/b;[Lkotlin/reflect/d;)Lorg/koin/core/definition/b;", "Lkotlin/Function1;", "Lkotlin/j2;", "Lorg/koin/core/definition/OnReleaseCallback;", "onRelease", "d", "Lorg/koin/core/definition/OnCloseCallback;", "onClose", "c", "koin-core" }, k = 2, mv = { 1, 4, 0 })
public final class a
{
    @e
    public static final <T> b<T> a(@e final b<T> b, @e final d<?> e) {
        k0.q((Object)b, "$this$bind");
        k0.q((Object)e, "clazz");
        b.m().add(e);
        return b;
    }
    
    @e
    public static final b<?> b(@e final b<?> b, @e final d<?>[] array) {
        k0.q((Object)b, "$this$binds");
        k0.q((Object)array, "classes");
        v.s0((Collection)b.m(), (Object[])array);
        return b;
    }
    
    @e
    public static final <T> b<T> c(@e final b<T> b, @e final l<? super T, j2> l) {
        k0.q((Object)b, "$this$onClose");
        k0.q((Object)l, "onClose");
        b.s(l);
        return b;
    }
    
    @e
    public static final <T> b<T> d(@e final b<T> b, @e final l<? super T, j2> l) {
        k0.q((Object)b, "$this$onRelease");
        k0.q((Object)l, "onRelease");
        b.t(l);
        return b;
    }
}
