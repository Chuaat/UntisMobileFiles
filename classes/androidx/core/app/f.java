// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import android.app.Activity;
import androidx.annotation.k0;
import android.content.Intent;
import androidx.annotation.j0;
import androidx.annotation.p0;
import android.app.AppComponentFactory;

@p0(28)
public class f extends AppComponentFactory
{
    @j0
    public Activity a(@j0 ClassLoader ex, @j0 final String name, @k0 final Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            ex = (NoSuchMethodException)Class.forName(name, false, (ClassLoader)ex).asSubclass(Activity.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            return (Activity)ex;
        }
        catch (NoSuchMethodException ex) {}
        catch (InvocationTargetException ex2) {}
        throw new RuntimeException("Couldn't call constructor", ex);
    }
    
    @j0
    public Application b(@j0 ClassLoader ex, @j0 final String name) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            ex = (NoSuchMethodException)Class.forName(name, false, (ClassLoader)ex).asSubclass(Application.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            return (Application)ex;
        }
        catch (NoSuchMethodException ex) {}
        catch (InvocationTargetException ex2) {}
        throw new RuntimeException("Couldn't call constructor", ex);
    }
    
    @j0
    public ContentProvider c(@j0 ClassLoader ex, @j0 final String name) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            ex = (NoSuchMethodException)Class.forName(name, false, (ClassLoader)ex).asSubclass(ContentProvider.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            return (ContentProvider)ex;
        }
        catch (NoSuchMethodException ex) {}
        catch (InvocationTargetException ex2) {}
        throw new RuntimeException("Couldn't call constructor", ex);
    }
    
    @j0
    public BroadcastReceiver d(@j0 ClassLoader ex, @j0 final String name, @k0 final Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            ex = (NoSuchMethodException)Class.forName(name, false, (ClassLoader)ex).asSubclass(BroadcastReceiver.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            return (BroadcastReceiver)ex;
        }
        catch (NoSuchMethodException ex) {}
        catch (InvocationTargetException ex2) {}
        throw new RuntimeException("Couldn't call constructor", ex);
    }
    
    @j0
    public Service e(@j0 ClassLoader ex, @j0 final String name, @k0 final Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            ex = (NoSuchMethodException)Class.forName(name, false, (ClassLoader)ex).asSubclass(Service.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            return (Service)ex;
        }
        catch (NoSuchMethodException ex) {}
        catch (InvocationTargetException ex2) {}
        throw new RuntimeException("Couldn't call constructor", ex);
    }
    
    @j0
    public final Activity instantiateActivity(@j0 final ClassLoader classLoader, @j0 final String s, @k0 final Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.a(this.a(classLoader, s, intent));
    }
    
    @j0
    public final Application instantiateApplication(@j0 final ClassLoader classLoader, @j0 final String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.a(this.b(classLoader, s));
    }
    
    @j0
    public final ContentProvider instantiateProvider(@j0 final ClassLoader classLoader, @j0 final String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.a(this.c(classLoader, s));
    }
    
    @j0
    public final BroadcastReceiver instantiateReceiver(@j0 final ClassLoader classLoader, @j0 final String s, @k0 final Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.a(this.d(classLoader, s, intent));
    }
    
    @j0
    public final Service instantiateService(@j0 final ClassLoader classLoader, @j0 final String s, @k0 final Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.a(this.e(classLoader, s, intent));
    }
}
