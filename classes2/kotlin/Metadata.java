// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import m6.g;
import kotlin.annotation.b;
import kotlin.annotation.f;
import kotlin.annotation.a;
import kotlin.annotation.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\b\u0087\u0002\u0018\u00002\u00020\u0001B\\\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\fR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00038\u0007@\u0007X\u0087\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005R\u0013\u0010\u000f\u001a\u00020\f8\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0007@\u0007X\u0087\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0007@\u0007X\u0087\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0017\u001a\u00020\u00038\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0013\u0010\u0019\u001a\u00020\u00128\u0007@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001a" }, d2 = { "Lkotlin/Metadata;", "", "", "", "d1", "()[Ljava/lang/String;", "data1", "pn", "()Ljava/lang/String;", "packageName", "d2", "data2", "", "k", "()I", "kind", "xi", "extraInt", "", "bv", "()[I", "bytecodeVersion", "xs", "extraString", "mv", "metadataVersion", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e(a.I)
@f(allowedTargets = { b.G })
@e1(version = "1.3")
public @interface Metadata {
    @g(name = "bv")
    int[] bv() default { 1, 0, 3 };
    
    @g(name = "d1")
    String[] d1() default {};
    
    @g(name = "d2")
    String[] d2() default {};
    
    @g(name = "k")
    int k() default 1;
    
    @g(name = "mv")
    int[] mv() default {};
    
    @g(name = "pn")
    String pn() default "";
    
    @g(name = "xi")
    int xi() default 0;
    
    @g(name = "xs")
    String xs() default "";
}
