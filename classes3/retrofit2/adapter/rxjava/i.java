// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.adapter.rxjava;

import retrofit2.t;
import java.lang.reflect.ParameterizedType;
import rx.g;
import rx.b;
import rx.k;
import retrofit2.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import c6.h;
import rx.j;
import retrofit2.c;

public final class i extends a
{
    @h
    private final j a;
    private final boolean b;
    
    private i(@h final j a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public static i d() {
        return new i(null, false);
    }
    
    public static i e() {
        return new i(null, true);
    }
    
    public static i f(final j obj) {
        Objects.requireNonNull(obj, "scheduler == null");
        return new i(obj, false);
    }
    
    @h
    @Override
    public c<?, ?> a(Type type, final Annotation[] array, final u u) {
        final Class<?> c = retrofit2.c.a.c(type);
        final boolean b = c == k.class;
        final boolean b2 = c == b.class;
        if (c != g.class && !b && !b2) {
            return null;
        }
        if (b2) {
            return new retrofit2.adapter.rxjava.h<Object>(Void.class, this.a, this.b, false, true, false, true);
        }
        if (!(type instanceof ParameterizedType)) {
            String str;
            if (b) {
                str = "Single";
            }
            else {
                str = "Observable";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" return type must be parameterized as ");
            sb.append(str);
            sb.append("<Foo> or ");
            sb.append(str);
            sb.append("<? extends Foo>");
            throw new IllegalStateException(sb.toString());
        }
        type = retrofit2.c.a.b(0, (ParameterizedType)type);
        final Class<?> c2 = retrofit2.c.a.c(type);
        boolean b3;
        if (c2 == t.class) {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            type = retrofit2.c.a.b(0, (ParameterizedType)type);
            b3 = false;
        }
        else {
            if (c2 != f.class) {
                final boolean b4 = false;
                final boolean b5 = true;
                return new retrofit2.adapter.rxjava.h<Object>(type, this.a, this.b, b4, b5, b, false);
            }
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            type = retrofit2.c.a.b(0, (ParameterizedType)type);
            b3 = true;
        }
        final boolean b6 = false;
        final boolean b4 = b3;
        final boolean b5 = b6;
        return new retrofit2.adapter.rxjava.h<Object>(type, this.a, this.b, b4, b5, b, false);
    }
}
