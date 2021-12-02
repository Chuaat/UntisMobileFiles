// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import androidx.annotation.k0;
import android.icu.util.ULocale;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import android.util.Log;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public final class e
{
    private static final String a = "ICUCompat";
    private static Method b;
    private static Method c;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 21) {
            try {
                final Class<?> forName = Class.forName("libcore.icu.ICU");
                e.b = forName.getMethod("getScript", String.class);
                e.c = forName.getMethod("addLikelySubtags", String.class);
            }
            catch (Exception ex) {
                e.b = null;
                e.c = null;
                Log.w("ICUCompat", (Throwable)ex);
            }
        }
        else if (sdk_INT < 24) {
            try {
                e.c = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            }
            catch (Exception cause) {
                throw new IllegalStateException(cause);
            }
        }
    }
    
    private e() {
    }
    
    private static String a(Locale c) {
        final String string = ((Locale)c).toString();
        try {
            c = (InvocationTargetException)e.c;
            if (c != null) {
                c = (InvocationTargetException)((Method)c).invoke(null, string);
                return (String)c;
            }
            return string;
        }
        catch (InvocationTargetException c) {}
        catch (IllegalAccessException ex) {}
        Log.w("ICUCompat", (Throwable)c);
        return string;
    }
    
    private static String b(String s) {
        try {
            final Method b = e.b;
            if (b != null) {
                s = (String)b.invoke(null, s);
                return (String)s;
            }
            return null;
        }
        catch (InvocationTargetException s) {}
        catch (IllegalAccessException ex) {}
        Log.w("ICUCompat", (Throwable)s);
        return null;
    }
    
    @k0
    public static String c(final Locale locale) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (sdk_INT >= 21) {
            String script = null;
            try {
                script = ((Locale)e.c.invoke(null, locale)).getScript();
                return script;
            }
            catch (IllegalAccessException script) {}
            catch (InvocationTargetException ex) {}
            Log.w("ICUCompat", (Throwable)script);
            return locale.getScript();
        }
        final String a = a(locale);
        if (a != null) {
            return b(a);
        }
        return null;
    }
}
