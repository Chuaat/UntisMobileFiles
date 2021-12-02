// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0004B%\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u0011" }, d2 = { "Lokhttp3/internal/platform/android/h;", "", "", "closer", "a", "closeGuardInstance", "", "b", "Ljava/lang/reflect/Method;", "c", "Ljava/lang/reflect/Method;", "warnIfOpenMethod", "openMethod", "getMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "d", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class h
{
    public static final a d;
    private final Method a;
    private final Method b;
    private final Method c;
    
    static {
        d = new a(null);
    }
    
    public h(@f final Method a, @f final Method b, @f final Method c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @f
    public final Object a(@e final String s) {
        k0.p((Object)s, "closer");
        final Method a = this.a;
        Label_0050: {
            if (a == null) {
                break Label_0050;
            }
            try {
                final Object invoke = a.invoke(null, new Object[0]);
                final Method b = this.b;
                k0.m((Object)b);
                b.invoke(invoke, s);
                return invoke;
                return null;
            }
            catch (Exception ex) {
                return null;
            }
        }
    }
    
    public final boolean b(@f final Object obj) {
        boolean b = false;
        if (obj == null) {
            return b;
        }
        try {
            final Method c = this.c;
            k0.m((Object)c);
            c.invoke(obj, new Object[0]);
            b = true;
            return b;
        }
        catch (Exception ex) {
            b = b;
            return b;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006" }, d2 = { "okhttp3/internal/platform/android/h$a", "", "Lokhttp3/internal/platform/android/h;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final h a() {
            Method method = null;
            Method method5;
            Method method6;
            try {
                final Class<?> forName = Class.forName("dalvik.system.CloseGuard");
                final Method method2 = forName.getMethod("get", (Class<?>[])new Class[0]);
                final Method method3 = forName.getMethod("open", String.class);
                final Method method4 = forName.getMethod("warnIfOpen", (Class<?>[])new Class[0]);
                method = method2;
                method5 = method4;
                method6 = method3;
            }
            catch (Exception ex) {
                method5 = (method6 = null);
            }
            return new h(method, method6, method5);
        }
    }
}
