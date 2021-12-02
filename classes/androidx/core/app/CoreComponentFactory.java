// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.app.Application;
import android.app.Activity;
import androidx.annotation.k0;
import android.content.Intent;
import androidx.annotation.j0;
import androidx.annotation.t0;
import androidx.annotation.p0;
import android.app.AppComponentFactory;

@p0(api = 28)
@t0({ t0.a.I })
public class CoreComponentFactory extends AppComponentFactory
{
    static <T> T a(final T t) {
        if (t instanceof a) {
            final Object a = ((a)t).a();
            if (a != null) {
                return (T)a;
            }
        }
        return t;
    }
    
    @j0
    public Activity instantiateActivity(@j0 final ClassLoader classLoader, @j0 final String s, @k0 final Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return a(super.instantiateActivity(classLoader, s, intent));
    }
    
    @j0
    public Application instantiateApplication(@j0 final ClassLoader classLoader, @j0 final String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return a(super.instantiateApplication(classLoader, s));
    }
    
    @j0
    public ContentProvider instantiateProvider(@j0 final ClassLoader classLoader, @j0 final String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return a(super.instantiateProvider(classLoader, s));
    }
    
    @j0
    public BroadcastReceiver instantiateReceiver(@j0 final ClassLoader classLoader, @j0 final String s, @k0 final Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return a(super.instantiateReceiver(classLoader, s, intent));
    }
    
    @j0
    public Service instantiateService(@j0 final ClassLoader classLoader, @j0 final String s, @k0 final Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return a(super.instantiateService(classLoader, s, intent));
    }
    
    @t0({ t0.a.I })
    public interface a
    {
        Object a();
    }
}
