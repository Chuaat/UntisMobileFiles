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

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.ANNOTATION_TYPE })
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005R\u0013\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0006\u001a\u00020\u00058\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u0099F0\u0001¨\u0006\t" }, d2 = { "Lkotlin/a1;", "", "", "message", "()Ljava/lang/String;", "Lkotlin/a1$a;", "level", "()Lkotlin/a1$a;", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e(kotlin.annotation.a.H)
@f(allowedTargets = { b.H })
@e1(version = "1.3")
public @interface a1 {
    a level() default a.H;
    
    String message() default "";
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "kotlin/a1$a", "", "Lkotlin/a1$a;", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public enum a
    {
        G, 
        H;
    }
}
