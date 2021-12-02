// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.debug;

import kotlin.io.b;
import kotlin.jvm.internal.k0;
import java.security.ProtectionDomain;
import m6.k;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import sun.misc.SignalHandler;
import sun.misc.Signal;
import kotlin.b1$a;
import kotlinx.coroutines.debug.internal.f;
import kotlin.c1;
import kotlin.b1;
import org.jetbrains.annotations.e;
import android.annotation.SuppressLint;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u00c1\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013" }, d2 = { "Lkotlinx/coroutines/debug/a;", "", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "Lkotlin/j2;", "c", "a", "", "b", "Z", "enableCreationStackTraces", "()Z", "d", "(Z)V", "isInstalledStatically", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@SuppressLint({ "all" })
public final class a
{
    private static boolean a;
    private static final boolean b;
    @e
    public static final a c;
    
    static {
        c = new a();
        final Boolean b2 = null;
        Object b3 = null;
        try {
            final b1$a h = b1.H;
            final String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            Boolean value;
            if (property != null) {
                value = Boolean.parseBoolean(property);
            }
            else {
                value = null;
            }
            b1.b((Object)value);
        }
        finally {
            final b1$a h2 = b1.H;
            final Throwable t;
            b3 = b1.b(c1.a(t));
        }
        if (b1.i(b3)) {
            b3 = b2;
        }
        final Boolean b4 = (Boolean)b3;
        boolean b5;
        if (b4 != null) {
            b5 = b4;
        }
        else {
            b5 = f.l.u();
        }
        b = b5;
    }
    
    private a() {
    }
    
    private final void a() {
        try {
            Signal.handle(new Signal("TRAP"), a$b.a);
        }
        finally {}
    }
    
    @k
    public static final void c(@org.jetbrains.annotations.f final String s, @e final Instrumentation instrumentation) {
        kotlinx.coroutines.debug.a.a = true;
        instrumentation.addTransformer(kotlinx.coroutines.debug.a.a.a);
        final f l = f.l;
        l.K(kotlinx.coroutines.debug.a.b);
        l.x();
        kotlinx.coroutines.debug.a.c.a();
    }
    
    public final boolean b() {
        return kotlinx.coroutines.debug.a.a;
    }
    
    public final void d(final boolean a) {
        a.a = a;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f" }, d2 = { "kotlinx/coroutines/debug/a$a", "Ljava/lang/instrument/ClassFileTransformer;", "Ljava/lang/ClassLoader;", "loader", "", "className", "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", "a", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class a implements ClassFileTransformer
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @org.jetbrains.annotations.f
        public byte[] a(@e final ClassLoader classLoader, @e final String s, @org.jetbrains.annotations.f final Class<?> clazz, @e final ProtectionDomain protectionDomain, @org.jetbrains.annotations.f final byte[] array) {
            if (k0.g((Object)s, (Object)"kotlin/coroutines/jvm/internal/DebugProbesKt") ^ true) {
                return null;
            }
            kotlinx.coroutines.debug.a.c.d(true);
            return kotlin.io.b.p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }
}
