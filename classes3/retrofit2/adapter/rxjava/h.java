// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.adapter.rxjava;

import retrofit2.t;
import retrofit2.b;
import rx.j;
import java.lang.reflect.Type;
import retrofit2.c;

final class h<R> implements c<R, Object>
{
    private final Type a;
    @c6.h
    private final j b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    
    h(final Type a, @c6.h final j b, final boolean c, final boolean d, final boolean e, final boolean f, final boolean g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public Type a() {
        return this.a;
    }
    
    @Override
    public Object b(final b<R> b) {
        Object o;
        if (this.c) {
            o = new retrofit2.adapter.rxjava.c<Object>((b<Object>)b);
        }
        else {
            o = new d<Object>((b<Object>)b);
        }
        Object o3 = null;
        Label_0070: {
            Object o2;
            if (this.d) {
                o2 = new g((rx.g.a<t<Object>>)o);
            }
            else {
                o3 = o;
                if (!this.e) {
                    break Label_0070;
                }
                o2 = new retrofit2.adapter.rxjava.a((rx.g.a<t<Object>>)o);
            }
            o3 = o2;
        }
        final rx.g<Object> r1 = rx.g.r1((rx.g.a<Object>)o3);
        final j b2 = this.b;
        rx.g<Object> e5 = r1;
        if (b2 != null) {
            e5 = r1.E5(b2);
        }
        if (this.f) {
            return e5.L6();
        }
        Object c6 = e5;
        if (this.g) {
            c6 = e5.C6();
        }
        return c6;
    }
}
