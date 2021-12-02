// 
// Decompiled by Procyon v0.5.36
// 

package rx.android.plugins;

import java.util.concurrent.atomic.AtomicReference;

public final class a
{
    private static final a b;
    private final AtomicReference<b> a;
    
    static {
        b = new a();
    }
    
    a() {
        this.a = new AtomicReference<b>();
    }
    
    public static a a() {
        return a.b;
    }
    
    public b b() {
        if (this.a.get() == null) {
            this.a.compareAndSet(null, rx.android.plugins.b.a());
        }
        return this.a.get();
    }
    
    public void c(final b newValue) {
        if (this.a.compareAndSet(null, newValue)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Another strategy was already registered: ");
        sb.append(this.a.get());
        throw new IllegalStateException(sb.toString());
    }
    
    @r7.b
    public void d() {
        this.a.set(null);
    }
}
