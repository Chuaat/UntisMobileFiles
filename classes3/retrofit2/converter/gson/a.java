// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.converter.gson;

import okhttp3.h0;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import okhttp3.f0;
import retrofit2.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import com.google.gson.Gson;
import retrofit2.f;

public final class a extends f.a
{
    private final Gson a;
    
    private a(final Gson a) {
        this.a = a;
    }
    
    public static a f() {
        return g(new Gson());
    }
    
    public static a g(final Gson obj) {
        Objects.requireNonNull(obj, "gson == null");
        return new a(obj);
    }
    
    @Override
    public f<?, f0> c(final Type type, final Annotation[] array, final Annotation[] array2, final u u) {
        return new b<Object>(this.a, (com.google.gson.TypeAdapter<?>)this.a.getAdapter(TypeToken.get(type)));
    }
    
    @Override
    public f<h0, ?> d(final Type type, final Annotation[] array, final u u) {
        return new c<Object>(this.a, (com.google.gson.TypeAdapter<?>)this.a.getAdapter(TypeToken.get(type)));
    }
}
