// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import java.io.IOException;
import kotlin.j2;
import p7.w;
import okhttp3.h0;
import c6.h;
import okhttp3.f0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

final class a extends retrofit2.f.a
{
    private boolean a;
    
    a() {
        this.a = true;
    }
    
    @h
    @Override
    public retrofit2.f<?, f0> c(final Type type, final Annotation[] array, final Annotation[] array2, final u u) {
        if (f0.class.isAssignableFrom(y.h(type))) {
            return b.a;
        }
        return null;
    }
    
    @h
    @Override
    public retrofit2.f<h0, ?> d(final Type type, final Annotation[] array, final u u) {
        if (type == h0.class) {
            retrofit2.f<h0, h0> f;
            if (y.l(array, w.class)) {
                f = c.a;
            }
            else {
                f = retrofit2.a.a.a;
            }
            return f;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (this.a && type == j2.class) {
            try {
                return e.a;
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                this.a = false;
            }
        }
        return null;
    }
    
    static final class a implements f<h0, h0>
    {
        static final a a;
        
        static {
            a = new a();
        }
        
        public h0 b(final h0 h0) throws IOException {
            try {
                return y.a(h0);
            }
            finally {
                h0.close();
            }
        }
    }
    
    static final class b implements f<f0, f0>
    {
        static final b a;
        
        static {
            a = new b();
        }
        
        public f0 b(final f0 f0) {
            return f0;
        }
    }
    
    static final class c implements f<h0, h0>
    {
        static final c a;
        
        static {
            a = new c();
        }
        
        public h0 b(final h0 h0) {
            return h0;
        }
    }
    
    static final class d implements f<Object, String>
    {
        static final d a;
        
        static {
            a = new d();
        }
        
        public String b(final Object o) {
            return o.toString();
        }
    }
    
    static final class e implements f<h0, j2>
    {
        static final e a;
        
        static {
            a = new e();
        }
        
        public j2 b(final h0 h0) {
            h0.close();
            return j2.a;
        }
    }
    
    static final class f implements retrofit2.f<h0, Void>
    {
        static final f a;
        
        static {
            a = new f();
        }
        
        public Void b(final h0 h0) {
            h0.close();
            return null;
        }
    }
}
