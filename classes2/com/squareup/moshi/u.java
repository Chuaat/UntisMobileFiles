// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import org.jetbrains.annotations.f;
import c6.c;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;
import com.squareup.moshi.kotlin.reflect.b;
import kotlin.z0;
import kotlin.i;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ]\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022,\u0010\b\u001a(\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u00052\u000e\u0010\n\u001a\n \u0003*\u0004\u0018\u00010\t0\tH\u0097\u0001¨\u0006\u000f" }, d2 = { "Lcom/squareup/moshi/u;", "Lcom/squareup/moshi/h$e;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "p0", "", "", "", "p1", "Lcom/squareup/moshi/x;", "p2", "Lcom/squareup/moshi/h;", "a", "<init>", "()V", "reflect" }, k = 1, mv = { 1, 4, 2 })
@i(message = "this moved to avoid a package name conflict in the Java Platform Module System.", replaceWith = @z0(expression = "com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory", imports = {}))
public final class u implements e
{
    private final /* synthetic */ b a;
    
    public u() {
        this.a = new b();
    }
    
    @c
    @c6.h
    @f
    @Override
    public h<?> a(final Type type, final Set<? extends Annotation> set, final x x) {
        return this.a.a(type, set, x);
    }
}
