// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import android.util.LongSparseArray;
import androidx.annotation.p0;
import java.util.Map;
import android.util.Log;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.res.Resources;
import java.lang.reflect.Field;

class m
{
    private static final String a = "ResourcesFlusher";
    private static Field b;
    private static boolean c;
    private static Class<?> d;
    private static boolean e;
    private static Field f;
    private static boolean g;
    private static Field h;
    private static boolean i;
    
    private m() {
    }
    
    static void a(@j0 final Resources resources) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return;
        }
        if (sdk_INT >= 24) {
            d(resources);
        }
        else if (sdk_INT >= 23) {
            c(resources);
        }
        else if (sdk_INT >= 21) {
            b(resources);
        }
    }
    
    @p0(21)
    private static void b(@j0 final Resources obj) {
        if (!m.c) {
            try {
                (m.b = Resources.class.getDeclaredField("mDrawableCache")).setAccessible(true);
            }
            catch (NoSuchFieldException ex) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", (Throwable)ex);
            }
            m.c = true;
        }
        final Field b = m.b;
        if (b != null) {
            final Map map = null;
            Map map2;
            try {
                map2 = (Map)b.get(obj);
            }
            catch (IllegalAccessException ex2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", (Throwable)ex2);
                map2 = map;
            }
            if (map2 != null) {
                map2.clear();
            }
        }
    }
    
    @p0(23)
    private static void c(@j0 final Resources obj) {
        if (!m.c) {
            try {
                (m.b = Resources.class.getDeclaredField("mDrawableCache")).setAccessible(true);
            }
            catch (NoSuchFieldException ex) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", (Throwable)ex);
            }
            m.c = true;
        }
        final Object o = null;
        final Field b = m.b;
        Object value = o;
        if (b != null) {
            try {
                value = b.get(obj);
            }
            catch (IllegalAccessException ex2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", (Throwable)ex2);
                value = o;
            }
        }
        if (value == null) {
            return;
        }
        e(value);
    }
    
    @p0(24)
    private static void d(@j0 Resources value) {
        if (!m.i) {
            try {
                (m.h = Resources.class.getDeclaredField("mResourcesImpl")).setAccessible(true);
            }
            catch (NoSuchFieldException ex) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", (Throwable)ex);
            }
            m.i = true;
        }
        final Field h = m.h;
        if (h == null) {
            return;
        }
        final Object o = null;
        try {
            value = h.get(value);
        }
        catch (IllegalAccessException ex2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", (Throwable)ex2);
            value = null;
        }
        if (value == null) {
            return;
        }
        if (!m.c) {
            try {
                (m.b = value.getClass().getDeclaredField("mDrawableCache")).setAccessible(true);
            }
            catch (NoSuchFieldException ex3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", (Throwable)ex3);
            }
            m.c = true;
        }
        final Field b = m.b;
        Object value2 = o;
        if (b != null) {
            try {
                value2 = b.get(value);
            }
            catch (IllegalAccessException ex4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", (Throwable)ex4);
                value2 = o;
            }
        }
        if (value2 != null) {
            e(value2);
        }
    }
    
    @p0(16)
    private static void e(@j0 final Object obj) {
        if (!m.e) {
            try {
                m.d = Class.forName("android.content.res.ThemedResourceCache");
            }
            catch (ClassNotFoundException ex) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", (Throwable)ex);
            }
            m.e = true;
        }
        final Class<?> d = m.d;
        if (d == null) {
            return;
        }
        if (!m.g) {
            try {
                (m.f = d.getDeclaredField("mUnthemedEntries")).setAccessible(true);
            }
            catch (NoSuchFieldException ex2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", (Throwable)ex2);
            }
            m.g = true;
        }
        final Field f = m.f;
        if (f == null) {
            return;
        }
        final LongSparseArray longSparseArray = null;
        LongSparseArray longSparseArray2;
        try {
            longSparseArray2 = (LongSparseArray)f.get(obj);
        }
        catch (IllegalAccessException ex3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", (Throwable)ex3);
            longSparseArray2 = longSparseArray;
        }
        if (longSparseArray2 != null) {
            longSparseArray2.clear();
        }
    }
}
