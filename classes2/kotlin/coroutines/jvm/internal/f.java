// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import m6.g;
import kotlin.e1;
import kotlin.annotation.b;
import kotlin.Metadata;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0081\u0002\u0018\u00002\u00020\u0001B\\\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002R\u0013\u0010\u0005\u001a\u00020\u00028\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0007\u001a\u00020\u00028\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000f\u001a\u00020\f8\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u00020\u00028\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0013\u0010\u0015\u001a\u00020\u00128\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0013\u0010\u0019\u001a\u00020\f8\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001a" }, d2 = { "Lkotlin/coroutines/jvm/internal/f;", "", "", "m", "()Ljava/lang/String;", "methodName", "f", "sourceFile", "", "s", "()[Ljava/lang/String;", "spilled", "", "i", "()[I", "indexToLabel", "c", "className", "", "v", "()I", "version", "n", "localNames", "l", "lineNumbers", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@kotlin.annotation.f(allowedTargets = { b.G })
@e1(version = "1.3")
public @interface f {
    @g(name = "c")
    String c() default "";
    
    @g(name = "f")
    String f() default "";
    
    @g(name = "i")
    int[] i() default {};
    
    @g(name = "l")
    int[] l() default {};
    
    @g(name = "m")
    String m() default "";
    
    @g(name = "n")
    String[] n() default {};
    
    @g(name = "s")
    String[] s() default {};
    
    @g(name = "v")
    int v() default 1;
}
