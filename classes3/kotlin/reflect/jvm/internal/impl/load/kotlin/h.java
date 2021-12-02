// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;

public class h<T>
{
    @e
    private final k<T> a;
    private int b;
    @f
    private T c;
    
    public void a() {
    }
    
    public void b() {
        if (this.c == null) {
            ++this.b;
        }
    }
    
    public void c(@e final T t) {
        k0.p((Object)t, "objectType");
        this.d(t);
    }
    
    protected final void d(@e final T t) {
        k0.p((Object)t, "type");
        if (this.c == null) {
            final int b = this.b;
            T b2 = t;
            if (b > 0) {
                b2 = this.a.b(k0.C(s.g2("[", b), (Object)this.a.a(t)));
            }
            this.c = b2;
        }
    }
    
    public void e(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final T t) {
        k0.p((Object)e, "name");
        k0.p((Object)t, "type");
        this.d(t);
    }
}
