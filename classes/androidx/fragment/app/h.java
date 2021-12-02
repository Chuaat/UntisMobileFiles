// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import androidx.annotation.j0;
import androidx.collection.m;

public class h
{
    private static final m<ClassLoader, m<String, Class<?>>> a;
    
    static {
        a = new m<ClassLoader, m<String, Class<?>>>();
    }
    
    static boolean b(@j0 final ClassLoader classLoader, @j0 final String s) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, s));
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    @j0
    private static Class<?> c(@j0 final ClassLoader loader, @j0 final String name) throws ClassNotFoundException {
        final m<ClassLoader, m<String, Class<?>>> a = h.a;
        m<String, Class<?>> m;
        if ((m = a.get(loader)) == null) {
            m = new m<String, Class<?>>();
            a.put(loader, m);
        }
        Class<?> forName;
        if ((forName = m.get(name)) == null) {
            forName = Class.forName(name, false, loader);
            m.put(name, forName);
        }
        return forName;
    }
    
    @j0
    public static Class<? extends Fragment> d(@j0 final ClassLoader classLoader, @j0 final String s) {
        try {
            return (Class<? extends Fragment>)c(classLoader, s);
        }
        catch (ClassCastException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to instantiate fragment ");
            sb.append(s);
            sb.append(": make sure class is a valid subclass of Fragment");
            throw new Fragment.j(sb.toString(), ex);
        }
        catch (ClassNotFoundException ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to instantiate fragment ");
            sb2.append(s);
            sb2.append(": make sure class name exists");
            throw new Fragment.j(sb2.toString(), ex2);
        }
    }
    
    @j0
    public Fragment a(@j0 final ClassLoader classLoader, @j0 final String s) {
        try {
            return (Fragment)d(classLoader, s).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (InvocationTargetException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to instantiate fragment ");
            sb.append(s);
            sb.append(": calling Fragment constructor caused an exception");
            throw new Fragment.j(sb.toString(), ex);
        }
        catch (NoSuchMethodException ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to instantiate fragment ");
            sb2.append(s);
            sb2.append(": could not find Fragment constructor");
            throw new Fragment.j(sb2.toString(), ex2);
        }
        catch (IllegalAccessException ex3) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to instantiate fragment ");
            sb3.append(s);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new Fragment.j(sb3.toString(), ex3);
        }
        catch (InstantiationException ex4) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Unable to instantiate fragment ");
            sb4.append(s);
            sb4.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new Fragment.j(sb4.toString(), ex4);
        }
    }
}
