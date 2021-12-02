// 
// Decompiled by Procyon v0.5.36
// 

package rx.android.schedulers;

import r7.b;
import java.util.Objects;
import android.os.Looper;
import rx.j;
import java.util.concurrent.atomic.AtomicReference;

public final class a
{
    private static final AtomicReference<a> b;
    private final j a;
    
    static {
        b = new AtomicReference<a>();
    }
    
    private a() {
        j b = rx.android.plugins.a.a().b().b();
        if (b == null) {
            b = new c(Looper.getMainLooper());
        }
        this.a = b;
    }
    
    public static j a(final Looper obj) {
        Objects.requireNonNull(obj, "looper == null");
        return new c(obj);
    }
    
    private static a b() {
        AtomicReference<a> b;
        a newValue;
        do {
            b = a.b;
            final a a = b.get();
            if (a != null) {
                return a;
            }
            newValue = new a();
        } while (!b.compareAndSet(null, newValue));
        return newValue;
    }
    
    public static j c() {
        return b().a;
    }
    
    @b
    public static void d() {
        a.b.set(null);
    }
}
