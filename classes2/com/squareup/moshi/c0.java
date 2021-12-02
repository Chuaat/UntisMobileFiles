// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import com.squareup.moshi.internal.c;
import java.lang.reflect.WildcardType;
import java.lang.annotation.Annotation;
import java.util.Set;
import kotlin.q;
import kotlin.reflect.d0;
import kotlin.reflect.s;
import m6.a;
import kotlin.reflect.d;
import kotlin.jvm.internal.k0;
import java.lang.reflect.GenericArrayType;
import org.jetbrains.annotations.e;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\u0087\b\u001a\u0011\u0010\u0006\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\u0087\b\u001a\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0007\u001a\u000e\u0010\u000b\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\n\u001a\n\u0010\r\u001a\u00020\b*\u00020\f\"\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e*\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012" }, d2 = { "", "T", "", "e", "Ljava/lang/reflect/WildcardType;", "f", "g", "Lkotlin/reflect/s;", "Ljava/lang/reflect/GenericArrayType;", "c", "Lkotlin/reflect/d;", "b", "Ljava/lang/reflect/Type;", "a", "Ljava/lang/Class;", "d", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "rawType", "moshi" }, k = 2, mv = { 1, 4, 2 })
public final class c0
{
    @e
    public static final GenericArrayType a(@e final Type type) {
        k0.p(type, "$this$asArrayType");
        final GenericArrayType b = a0.b(type);
        k0.o(b, "Types.arrayOf(this)");
        return b;
    }
    
    @e
    public static final GenericArrayType b(@e final d<?> d) {
        k0.p(d, "$this$asArrayType");
        return a(a.c(d));
    }
    
    @q
    @e
    public static final GenericArrayType c(@e final s s) {
        k0.p(s, "$this$asArrayType");
        return a(d0.f(s));
    }
    
    @e
    public static final Class<?> d(@e final Type type) {
        k0.p(type, "$this$rawType");
        final Class<?> j = a0.j(type);
        k0.o(j, "Types.getRawType(this)");
        return j;
    }
}
