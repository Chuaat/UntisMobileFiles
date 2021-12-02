// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import java.io.IOException;
import c6.h;
import java.lang.reflect.ParameterizedType;
import java.util.Optional;
import okhttp3.h0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
final class o extends f.a
{
    static final f.a a;
    
    static {
        a = new o();
    }
    
    @h
    @Override
    public f<h0, ?> d(final Type type, final Annotation[] array, final u u) {
        if (f.a.b(type) != Optional.class) {
            return null;
        }
        return new a<Object>(u.n(f.a.a(0, (ParameterizedType)type), array));
    }
    
    @IgnoreJRERequirement
    static final class a<T> implements f<h0, Optional<T>>
    {
        final f<h0, T> a;
        
        a(final f<h0, T> a) {
            this.a = a;
        }
        
        public Optional<T> b(final h0 h0) throws IOException {
            return Optional.ofNullable(this.a.a(h0));
        }
    }
}
