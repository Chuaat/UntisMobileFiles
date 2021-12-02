// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.location;

import androidx.annotation.r;
import androidx.annotation.p0;
import java.lang.reflect.InvocationTargetException;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.location.Location;
import androidx.annotation.k0;
import java.lang.reflect.Method;

public final class d
{
    private static final String a = "mockLocation";
    @k0
    private static Method b;
    
    private d() {
    }
    
    public static long a(@j0 final Location location) {
        if (Build$VERSION.SDK_INT >= 17) {
            return TimeUnit.NANOSECONDS.toMillis(d.a.a(location));
        }
        final long n = System.currentTimeMillis() - location.getTime();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (n < 0L) {
            return elapsedRealtime;
        }
        if (n > elapsedRealtime) {
            return 0L;
        }
        return elapsedRealtime - n;
    }
    
    public static long b(@j0 final Location location) {
        if (Build$VERSION.SDK_INT >= 17) {
            return d.a.a(location);
        }
        return TimeUnit.MILLISECONDS.toNanos(a(location));
    }
    
    private static Method c() throws NoSuchMethodException {
        if (d.b == null) {
            (d.b = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE)).setAccessible(true);
        }
        return d.b;
    }
    
    public static boolean d(@j0 final Location location) {
        if (Build$VERSION.SDK_INT >= 18) {
            return d.b.a(location);
        }
        final Bundle extras = location.getExtras();
        return extras != null && extras.getBoolean("mockLocation", false);
    }
    
    public static void e(@j0 final Location obj, final boolean b) {
        if (Build$VERSION.SDK_INT >= 18) {
            try {
                c().invoke(obj, b);
                return;
            }
            catch (InvocationTargetException cause) {
                throw new RuntimeException(cause);
            }
            catch (IllegalAccessException cause2) {
                final IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(cause2);
                throw illegalAccessError;
            }
            catch (NoSuchMethodException cause3) {
                final NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
                noSuchMethodError.initCause(cause3);
                throw noSuchMethodError;
            }
        }
        final Bundle extras = obj.getExtras();
        if (extras == null) {
            final Bundle extras2 = new Bundle();
            extras2.putBoolean("mockLocation", true);
            obj.setExtras(extras2);
        }
        else {
            extras.putBoolean("mockLocation", true);
        }
    }
    
    @p0(17)
    private static class a
    {
        @r
        static long a(final Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }
    
    @p0(18)
    private static class b
    {
        @r
        static boolean a(final Location location) {
            return location.isFromMockProvider();
        }
    }
}
