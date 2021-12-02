// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import android.content.Context;
import io.realm.j0;
import java.lang.reflect.InvocationTargetException;
import io.realm.exceptions.RealmException;

public class l
{
    public static final int a = 14;
    private static final l b;
    private static l c;
    
    static {
        b = new l();
        l.c = null;
        try {
            l.c = (l)Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            goto Label_0093;
        }
        catch (InvocationTargetException ex) {
            throw new RealmException("Failed to init SyncObjectServerFacade", ex.getTargetException());
        }
        catch (NoSuchMethodException ex2) {
            throw new RealmException("Failed to init SyncObjectServerFacade", ex2);
        }
        catch (IllegalAccessException ex3) {
            throw new RealmException("Failed to init SyncObjectServerFacade", ex3);
        }
        catch (InstantiationException ex4) {
            throw new RealmException("Failed to init SyncObjectServerFacade", ex4);
        }
        catch (ClassNotFoundException ex5) {
            goto Label_0093;
        }
    }
    
    public static l c(final boolean b) {
        if (b) {
            return l.c;
        }
        return l.b;
    }
    
    public static l e() {
        final l c = l.c;
        if (c != null) {
            return c;
        }
        return l.b;
    }
    
    public void a(final j0 j0) {
    }
    
    public void b(final j0 j0) {
    }
    
    public Object[] d(final j0 j0) {
        return new Object[14];
    }
    
    public String f(final j0 j0) {
        return null;
    }
    
    public String g(final j0 j0) {
        return null;
    }
    
    public void h(final Context context, final String s) {
    }
    
    public void i(final j0 j0) {
    }
    
    public boolean j(final Throwable t) {
        return false;
    }
    
    public void k(final OsRealmConfig osRealmConfig) {
    }
}
