// 
// Decompiled by Procyon v0.5.36
// 

package rx.plugins;

import rx.internal.schedulers.a;
import rx.internal.schedulers.b;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import rx.internal.util.n;
import rx.j;

public class g
{
    private static final g a;
    
    static {
        a = new g();
    }
    
    public static j a() {
        return b(new n("RxComputationScheduler-"));
    }
    
    public static j b(final ThreadFactory obj) {
        Objects.requireNonNull(obj, "threadFactory == null");
        return new b(obj);
    }
    
    public static j c() {
        return d(new n("RxIoScheduler-"));
    }
    
    public static j d(final ThreadFactory obj) {
        Objects.requireNonNull(obj, "threadFactory == null");
        return new a(obj);
    }
    
    public static j e() {
        return f(new n("RxNewThreadScheduler-"));
    }
    
    public static j f(final ThreadFactory obj) {
        Objects.requireNonNull(obj, "threadFactory == null");
        return new rx.internal.schedulers.g(obj);
    }
    
    public static g h() {
        return g.a;
    }
    
    public j g() {
        return null;
    }
    
    public j i() {
        return null;
    }
    
    public j j() {
        return null;
    }
    
    @Deprecated
    public rx.functions.a k(final rx.functions.a a) {
        return a;
    }
}
