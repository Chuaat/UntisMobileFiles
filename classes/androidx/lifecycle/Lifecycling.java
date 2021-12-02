// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import androidx.annotation.j0;
import androidx.annotation.k0;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class Lifecycling
{
    private static final int a = 1;
    private static final int b = 2;
    private static Map<Class<?>, Integer> c;
    private static Map<Class<?>, List<Constructor<? extends p>>> d;
    
    static {
        Lifecycling.c = new HashMap<Class<?>, Integer>();
        Lifecycling.d = new HashMap<Class<?>, List<Constructor<? extends p>>>();
    }
    
    private Lifecycling() {
    }
    
    private static p a(final Constructor<? extends p> constructor, final Object o) {
        try {
            return (p)constructor.newInstance(o);
        }
        catch (InvocationTargetException cause) {
            throw new RuntimeException(cause);
        }
        catch (InstantiationException cause2) {
            throw new RuntimeException(cause2);
        }
        catch (IllegalAccessException cause3) {
            throw new RuntimeException(cause3);
        }
    }
    
    @k0
    private static Constructor<? extends p> b(final Class<?> clazz) {
        try {
            final Package package1 = clazz.getPackage();
            String s = clazz.getCanonicalName();
            String name;
            if (package1 != null) {
                name = package1.getName();
            }
            else {
                name = "";
            }
            if (!name.isEmpty()) {
                s = s.substring(name.length() + 1);
            }
            final String c = c(s);
            String string;
            if (name.isEmpty()) {
                string = c;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".");
                sb.append(c);
                string = sb.toString();
            }
            final Constructor<?> declaredConstructor = Class.forName(string).getDeclaredConstructor(clazz);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return (Constructor<? extends p>)declaredConstructor;
        }
        catch (NoSuchMethodException cause) {
            throw new RuntimeException(cause);
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
    }
    
    public static String c(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
    
    @Deprecated
    @j0
    static q d(final Object o) {
        return new q() {
            final /* synthetic */ v G = g(o);
            
            @Override
            public void h(@j0 final y y, @j0 final s.b b) {
                this.G.h(y, b);
            }
        };
    }
    
    private static int e(final Class<?> clazz) {
        final Integer n = Lifecycling.c.get(clazz);
        if (n != null) {
            return n;
        }
        final int h = h(clazz);
        Lifecycling.c.put(clazz, h);
        return h;
    }
    
    private static boolean f(final Class<?> clazz) {
        return clazz != null && x.class.isAssignableFrom(clazz);
    }
    
    @j0
    static v g(final Object o) {
        final boolean b = o instanceof v;
        final boolean b2 = o instanceof o;
        if (b && b2) {
            return new FullLifecycleObserverAdapter((o)o, (v)o);
        }
        if (b2) {
            return new FullLifecycleObserverAdapter((o)o, null);
        }
        if (b) {
            return (v)o;
        }
        final Class<?> class1 = o.getClass();
        if (e(class1) != 2) {
            return new ReflectiveGenericLifecycleObserver(o);
        }
        final List<Constructor<? extends p>> list = Lifecycling.d.get(class1);
        final int size = list.size();
        int i = 0;
        if (size == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), o));
        }
        final p[] array = new p[list.size()];
        while (i < list.size()) {
            array[i] = a(list.get(i), o);
            ++i;
        }
        return new CompositeGeneratedAdaptersObserver(array);
    }
    
    private static int h(final Class<?> clazz) {
        if (clazz.getCanonicalName() == null) {
            return 1;
        }
        final Constructor<? extends p> b = b(clazz);
        if (b != null) {
            Lifecycling.d.put(clazz, Collections.singletonList(b));
            return 2;
        }
        if (androidx.lifecycle.d.c.d(clazz)) {
            return 1;
        }
        final Class<?> superclass = clazz.getSuperclass();
        List<Constructor<? extends p>> list = null;
        if (f(superclass)) {
            if (e(superclass) == 1) {
                return 1;
            }
            list = new ArrayList<Constructor<? extends p>>(Lifecycling.d.get(superclass));
        }
        final Class<?>[] interfaces = clazz.getInterfaces();
        List<Constructor<? extends p>> list2;
        for (int length = interfaces.length, i = 0; i < length; ++i, list = list2) {
            final Class<?> clazz2 = interfaces[i];
            if (!f(clazz2)) {
                list2 = list;
            }
            else {
                if (e(clazz2) == 1) {
                    return 1;
                }
                if ((list2 = list) == null) {
                    list2 = new ArrayList<Constructor<? extends p>>();
                }
                list2.addAll(Lifecycling.d.get(clazz2));
            }
        }
        if (list != null) {
            Lifecycling.d.put(clazz, list);
            return 2;
        }
        return 1;
    }
}
