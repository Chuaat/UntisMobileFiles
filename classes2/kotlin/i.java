// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.annotation.b;
import kotlin.annotation.f;
import kotlin.annotation.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE })
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001c\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\bR\u0013\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0006\u001a\u00020\u00058\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b" }, d2 = { "Lkotlin/i;", "", "", "message", "()Ljava/lang/String;", "Lkotlin/z0;", "replaceWith", "()Lkotlin/z0;", "Lkotlin/k;", "level", "()Lkotlin/k;", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@c
@f(allowedTargets = { b.G, b.O, b.J, b.H, b.N, b.Q, b.P, b.U })
public @interface i {
    k level() default k.G;
    
    String message();
    
    z0 replaceWith() default @z0(expression = "", imports = {});
}
