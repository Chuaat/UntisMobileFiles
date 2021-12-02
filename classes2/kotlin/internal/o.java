// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.internal;

import kotlin.k;
import kotlin.e1;
import kotlin.annotation.b;
import kotlin.annotation.f;
import kotlin.annotation.a;
import kotlin.annotation.e;
import kotlin.annotation.d;
import kotlin.Metadata;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR })
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\fR\u0013\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0006\u001a\u00020\u00058\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\r\u001a\u00020\f8\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f" }, d2 = { "Lkotlin/internal/o;", "", "Lkotlin/internal/p;", "versionKind", "()Lkotlin/internal/p;", "Lkotlin/k;", "level", "()Lkotlin/k;", "", "version", "()Ljava/lang/String;", "message", "", "errorCode", "()I", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@d
@e(a.G)
@f(allowedTargets = { b.G, b.O, b.J, b.N, b.U })
@e1(version = "1.2")
public @interface o {
    int errorCode() default -1;
    
    k level() default k.H;
    
    String message() default "";
    
    String version();
    
    p versionKind() default p.G;
}
