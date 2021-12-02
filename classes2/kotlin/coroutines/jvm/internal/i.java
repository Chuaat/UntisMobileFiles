// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import m6.d;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import java.lang.reflect.Method;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c2\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\r" }, d2 = { "Lkotlin/coroutines/jvm/internal/i;", "", "Lkotlin/coroutines/jvm/internal/a;", "continuation", "Lkotlin/coroutines/jvm/internal/i$a;", "a", "", "b", "Lkotlin/coroutines/jvm/internal/i$a;", "cache", "notOnJava9", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class i
{
    private static final a a;
    private static a b;
    @e
    public static final i c;
    
    static {
        c = new i();
        a = new a(null, null, null);
    }
    
    private i() {
    }
    
    private final a a(final kotlin.coroutines.jvm.internal.a a) {
        try {
            return i.b = new a(Class.class.getDeclaredMethod("getModule", (Class<?>[])new Class[0]), a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class<?>[])new Class[0]), a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class<?>[])new Class[0]));
        }
        catch (Exception ex) {
            return i.b = i.a;
        }
    }
    
    @f
    public final String b(@e final kotlin.coroutines.jvm.internal.a a) {
        k0.p(a, "continuation");
        a a2 = i.b;
        if (a2 == null) {
            a2 = this.a(a);
        }
        final a a3 = i.a;
        final String s = null;
        final String s2 = null;
        if (a2 == a3) {
            return null;
        }
        final Method a4 = a2.a;
        String s3 = s;
        if (a4 != null) {
            final Object invoke = a4.invoke(a.getClass(), new Object[0]);
            s3 = s;
            if (invoke != null) {
                final Method b = a2.b;
                s3 = s;
                if (b != null) {
                    final Object invoke2 = b.invoke(invoke, new Object[0]);
                    s3 = s;
                    if (invoke2 != null) {
                        final Method c = a2.c;
                        Object invoke3;
                        if (c != null) {
                            invoke3 = c.invoke(invoke2, new Object[0]);
                        }
                        else {
                            invoke3 = null;
                        }
                        if (!(invoke3 instanceof String)) {
                            invoke3 = s2;
                        }
                        s3 = (String)invoke3;
                    }
                }
            }
        }
        return s3;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\f" }, d2 = { "kotlin/coroutines/jvm/internal/i$a", "", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "getDescriptorMethod", "c", "nameMethod", "a", "getModuleMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a
    {
        @d
        @f
        public final Method a;
        @d
        @f
        public final Method b;
        @d
        @f
        public final Method c;
        
        public a(@f final Method a, @f final Method b, @f final Method c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
