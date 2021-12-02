// 
// Decompiled by Procyon v0.5.36
// 

package androidx.annotation.experimental;

import kotlin.z0;
import kotlin.i;
import kotlin.annotation.b;
import kotlin.annotation.f;
import kotlin.annotation.e;
import kotlin.Metadata;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.ANNOTATION_TYPE })
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0013\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006" }, d2 = { "Landroidx/annotation/experimental/a;", "", "Landroidx/annotation/experimental/a$a;", "level", "()Landroidx/annotation/experimental/a$a;", "a", "annotation-experimental_release" }, k = 1, mv = { 1, 4, 2 })
@e(a.H)
@f(allowedTargets = { b.H })
@i(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @z0(expression = "RequiresOptIn", imports = { "androidx.annotation.RequiresOptIn" }))
public @interface a {
    a level() default a.H;
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "androidx/annotation/experimental/a$a", "", "Landroidx/annotation/experimental/a$a;", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release" }, k = 1, mv = { 1, 4, 2 })
    public enum a
    {
        G, 
        H;
    }
}
