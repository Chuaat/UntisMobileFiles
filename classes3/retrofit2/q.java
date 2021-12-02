// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import android.os.Looper;
import android.os.Handler;
import android.os.Build$VERSION;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import c6.h;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;

class q
{
    private static final q c;
    private final boolean a;
    @h
    private final Constructor<MethodHandles.Lookup> b;
    
    static {
        c = f();
    }
    
    q(final boolean a) {
        this.a = a;
        final Constructor<MethodHandles.Lookup> constructor = null;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        while (true) {
            if (!a) {
                break Label_0049;
            }
            declaredConstructor = constructor;
            try {
                final Constructor<MethodHandles.Lookup> constructor2 = declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor2.setAccessible(true);
                declaredConstructor = constructor2;
                this.b = declaredConstructor;
            }
            catch (NoClassDefFoundError | NoSuchMethodException noClassDefFoundError) {
                continue;
            }
            break;
        }
    }
    
    private static q f() {
        q q;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            q = new a();
        }
        else {
            q = new q(true);
        }
        return q;
    }
    
    static q g() {
        return q.c;
    }
    
    List<? extends c.a> a(@h final Executor executor) {
        final g o = new g(executor);
        Object o2;
        if (this.a) {
            o2 = Arrays.asList(e.a, o);
        }
        else {
            o2 = Collections.singletonList(o);
        }
        return (List<? extends c.a>)o2;
    }
    
    int b() {
        int n;
        if (this.a) {
            n = 2;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    @h
    Executor c() {
        return null;
    }
    
    List<? extends f.a> d() {
        List<? extends f.a> list;
        if (this.a) {
            list = Collections.singletonList(o.a);
        }
        else {
            list = Collections.emptyList();
        }
        return list;
    }
    
    int e() {
        return this.a ? 1 : 0;
    }
    
    @h
    @IgnoreJRERequirement
    Object h(final Method m, final Class<?> specialCaller, final Object x, final Object... arguments) throws Throwable {
        final Constructor<MethodHandles.Lookup> b = this.b;
        Object lookup;
        if (b != null) {
            lookup = b.newInstance(specialCaller, -1);
        }
        else {
            lookup = MethodHandles.lookup();
        }
        return ((MethodHandles.Lookup)lookup).unreflectSpecial(m, specialCaller).bindTo(x).invokeWithArguments(arguments);
    }
    
    @IgnoreJRERequirement
    boolean i(final Method method) {
        return this.a && method.isDefault();
    }
    
    static final class a extends q
    {
        a() {
            super(Build$VERSION.SDK_INT >= 24);
        }
        
        public Executor c() {
            return new q.a.a();
        }
        
        @h
        @Override
        Object h(final Method method, final Class<?> clazz, final Object o, final Object... array) throws Throwable {
            if (Build$VERSION.SDK_INT >= 26) {
                return super.h(method, clazz, o, array);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
        
        static final class a implements Executor
        {
            private final Handler G;
            
            a() {
                this.G = new Handler(Looper.getMainLooper());
            }
            
            @Override
            public void execute(final Runnable runnable) {
                this.G.post(runnable);
            }
        }
    }
}
