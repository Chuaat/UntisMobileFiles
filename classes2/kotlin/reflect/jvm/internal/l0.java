// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0014\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u000b\u0010\u0019¨\u0006\u001d" }, d2 = { "Lkotlin/reflect/jvm/internal/l0;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ClassLoader;", "a", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "ref", "b", "I", "getIdentityHashCode", "()I", "identityHashCode", "c", "Ljava/lang/ClassLoader;", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "temporaryStrongRef", "classLoader", "<init>", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
final class l0
{
    @e
    private final WeakReference<ClassLoader> a;
    private final int b;
    @f
    private ClassLoader c;
    
    public l0(@e final ClassLoader classLoader) {
        k0.p(classLoader, "classLoader");
        this.a = new WeakReference<ClassLoader>(classLoader);
        this.b = System.identityHashCode(classLoader);
        this.c = classLoader;
    }
    
    public final void a(@f final ClassLoader c) {
        this.c = c;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof l0 && this.a.get() == ((l0)o).a.get();
    }
    
    @Override
    public int hashCode() {
        return this.b;
    }
    
    @e
    @Override
    public String toString() {
        final ClassLoader classLoader = this.a.get();
        if (classLoader != null) {
            final String string = classLoader.toString();
            if (string != null) {
                return string;
            }
        }
        return "<null>";
    }
}
