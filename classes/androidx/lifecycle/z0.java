// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import android.app.Application;
import androidx.annotation.g0;
import androidx.annotation.j0;

public class z0
{
    private static final String c = "androidx.lifecycle.ViewModelProvider.DefaultKey";
    private final b a;
    private final c1 b;
    
    public z0(@j0 final c1 b, @j0 final b a) {
        this.a = a;
        this.b = b;
    }
    
    public z0(@j0 final d1 d1) {
        final c1 viewModelStore = d1.getViewModelStore();
        b b;
        if (d1 instanceof r) {
            b = ((r)d1).getDefaultViewModelProviderFactory();
        }
        else {
            b = d.b();
        }
        this(viewModelStore, b);
    }
    
    public z0(@j0 final d1 d1, @j0 final b b) {
        this(d1.getViewModelStore(), b);
    }
    
    @g0
    @j0
    public <T extends w0> T a(@j0 final Class<T> clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return this.b(sb.toString(), clazz);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    @g0
    @j0
    public <T extends w0> T b(@j0 final String s, @j0 final Class<T> clazz) {
        final w0 b = this.b.b(s);
        if (clazz.isInstance(b)) {
            final b a = this.a;
            if (a instanceof e) {
                ((e)a).b(b);
            }
            return (T)b;
        }
        final b a2 = this.a;
        w0 w0;
        if (a2 instanceof c) {
            w0 = ((c)a2).c(s, clazz);
        }
        else {
            w0 = a2.a((Class<T>)clazz);
        }
        this.b.d(s, w0);
        return (T)w0;
    }
    
    public static class a extends d
    {
        private static a c;
        private Application b;
        
        public a(@j0 final Application b) {
            this.b = b;
        }
        
        @j0
        public static a c(@j0 final Application application) {
            if (a.c == null) {
                a.c = new a(application);
            }
            return a.c;
        }
        
        @j0
        @Override
        public <T extends w0> T a(@j0 final Class<T> clazz) {
            if (androidx.lifecycle.b.class.isAssignableFrom(clazz)) {
                try {
                    return clazz.getConstructor(Application.class).newInstance(this.b);
                }
                catch (InvocationTargetException cause) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Cannot create an instance of ");
                    sb.append(clazz);
                    throw new RuntimeException(sb.toString(), cause);
                }
                catch (InstantiationException cause2) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Cannot create an instance of ");
                    sb2.append(clazz);
                    throw new RuntimeException(sb2.toString(), cause2);
                }
                catch (IllegalAccessException cause3) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Cannot create an instance of ");
                    sb3.append(clazz);
                    throw new RuntimeException(sb3.toString(), cause3);
                }
                catch (NoSuchMethodException cause4) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Cannot create an instance of ");
                    sb4.append(clazz);
                    throw new RuntimeException(sb4.toString(), cause4);
                }
            }
            return super.a(clazz);
        }
    }
    
    public interface b
    {
        @j0
         <T extends w0> T a(@j0 final Class<T> p0);
    }
    
    abstract static class c extends e implements b
    {
        @j0
        @Override
        public <T extends w0> T a(@j0 final Class<T> clazz) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }
        
        @j0
        public abstract <T extends w0> T c(@j0 final String p0, @j0 final Class<T> p1);
    }
    
    public static class d implements b
    {
        private static d a;
        
        @j0
        static d b() {
            if (d.a == null) {
                d.a = new d();
            }
            return d.a;
        }
        
        @j0
        @Override
        public <T extends w0> T a(@j0 final Class<T> clazz) {
            try {
                return clazz.newInstance();
            }
            catch (IllegalAccessException cause) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot create an instance of ");
                sb.append(clazz);
                throw new RuntimeException(sb.toString(), cause);
            }
            catch (InstantiationException cause2) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot create an instance of ");
                sb2.append(clazz);
                throw new RuntimeException(sb2.toString(), cause2);
            }
        }
    }
    
    static class e
    {
        void b(@j0 final w0 w0) {
        }
    }
}
