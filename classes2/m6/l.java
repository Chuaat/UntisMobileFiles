// 
// Decompiled by Procyon v0.5.36
// 

package m6;

import kotlin.annotation.b;
import kotlin.annotation.f;
import kotlin.annotation.a;
import kotlin.annotation.e;
import kotlin.annotation.c;
import kotlin.Metadata;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0013\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lm6/l;", "", "", "suppress", "()Z", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@c
@e(a.H)
@f(allowedTargets = { b.G, b.O, b.J, b.R })
public @interface l {
    boolean suppress() default true;
}
