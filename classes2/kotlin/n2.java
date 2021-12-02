// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.annotation.b;
import kotlin.annotation.f;
import kotlin.annotation.a;
import kotlin.annotation.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE })
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B$\u0012\"\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u0002\"\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003R#\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009120\u0001¨\u0006\u0006" }, d2 = { "Lkotlin/n2;", "", "", "Lkotlin/reflect/d;", "markerClass", "()[Ljava/lang/Class;", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e(a.G)
@f(allowedTargets = { b.G, b.J, b.L, b.M, b.N, b.O, b.P, b.Q, b.S, b.T, b.U })
@i(message = "Please use OptIn instead.", replaceWith = @z0(expression = "OptIn(*markerClass)", imports = { "kotlin.OptIn" }))
@e1(version = "1.2")
public @interface n2 {
    Class<? extends Annotation>[] markerClass();
}
