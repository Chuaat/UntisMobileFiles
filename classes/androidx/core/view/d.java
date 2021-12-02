// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import androidx.core.util.n;
import android.view.Display$Mode;
import androidx.annotation.p0;
import android.text.TextUtils;
import android.app.UiModeManager;
import android.os.Build;
import androidx.annotation.k0;
import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import android.graphics.Point;
import android.view.Display;
import androidx.annotation.j0;
import android.content.Context;

public final class d
{
    private static final int a = 3840;
    private static final int b = 2160;
    
    private d() {
    }
    
    static Point a(@j0 final Context context, @j0 final Display display) {
        String s;
        if (Build$VERSION.SDK_INT < 28) {
            s = "sys.display-size";
        }
        else {
            s = "vendor.display-size";
        }
        final Point j = j(s, display);
        if (j != null) {
            return j;
        }
        final boolean g = g(context);
        Point point = null;
        if (g) {
            point = point;
            if (f(display)) {
                point = new Point(3840, 2160);
            }
        }
        return point;
    }
    
    @j0
    private static Point b(@j0 final Context context, @j0 final Display display) {
        final Point a = a(context, display);
        if (a != null) {
            return a;
        }
        final Point point = new Point();
        if (Build$VERSION.SDK_INT >= 17) {
            d.a.a(display, point);
        }
        else {
            display.getSize(point);
        }
        return point;
    }
    
    @j0
    public static c c(@j0 final Context context, @j0 final Display display) {
        if (Build$VERSION.SDK_INT >= 23) {
            return d.b.a(context, display);
        }
        return new c(b(context, display));
    }
    
    @SuppressLint({ "ArrayReturn" })
    @j0
    public static c[] d(@j0 final Context context, @j0 final Display display) {
        if (Build$VERSION.SDK_INT >= 23) {
            return d.b.b(context, display);
        }
        return new c[] { c(context, display) };
    }
    
    @k0
    private static String e(String s) {
        try {
            final Class<?> forName = Class.forName("android.os.SystemProperties");
            s = (String)forName.getMethod("get", String.class).invoke(forName, s);
            return s;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    static boolean f(@j0 final Display display) {
        return Build$VERSION.SDK_INT < 23 || d.b.c(display);
    }
    
    private static boolean g(@j0 final Context context) {
        return h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }
    
    private static boolean h(@j0 final Context context) {
        final UiModeManager uiModeManager = (UiModeManager)context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }
    
    private static Point i(@j0 final String s) throws NumberFormatException {
        final String[] split = s.trim().split("x", -1);
        if (split.length == 2) {
            final int int1 = Integer.parseInt(split[0]);
            final int int2 = Integer.parseInt(split[1]);
            if (int1 > 0 && int2 > 0) {
                return new Point(int1, int2);
            }
        }
        throw new NumberFormatException();
    }
    
    @k0
    private static Point j(@j0 String e, @j0 final Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        e = e(e);
        if (TextUtils.isEmpty((CharSequence)e)) {
            return null;
        }
        try {
            return i(e);
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    @p0(17)
    static class a
    {
        private a() {
        }
        
        static void a(final Display display, final Point point) {
            display.getRealSize(point);
        }
    }
    
    @p0(23)
    static class b
    {
        private b() {
        }
        
        @j0
        static c a(@j0 final Context context, @j0 final Display display) {
            final Display$Mode mode = display.getMode();
            final Point a = d.a(context, display);
            c c;
            if (a != null && !d(mode, a)) {
                c = new c(mode, a);
            }
            else {
                c = new c(mode, true);
            }
            return c;
        }
        
        @SuppressLint({ "ArrayReturn" })
        @j0
        public static c[] b(@j0 final Context context, @j0 final Display display) {
            final Display$Mode[] supportedModes = display.getSupportedModes();
            final c[] array = new c[supportedModes.length];
            final Display$Mode mode = display.getMode();
            final Point a = d.a(context, display);
            int i;
            final int n = i = 0;
            if (a != null) {
                if (!d(mode, a)) {
                    for (int j = 0; j < supportedModes.length; ++j) {
                        c c;
                        if (e(supportedModes[j], mode)) {
                            c = new c(supportedModes[j], a);
                        }
                        else {
                            c = new c(supportedModes[j], false);
                        }
                        array[j] = c;
                    }
                    return array;
                }
                i = n;
            }
            while (i < supportedModes.length) {
                array[i] = new c(supportedModes[i], e(supportedModes[i], mode));
                ++i;
            }
            return array;
        }
        
        static boolean c(@j0 final Display display) {
            final Display$Mode mode = display.getMode();
            final Display$Mode[] supportedModes = display.getSupportedModes();
            for (int i = 0; i < supportedModes.length; ++i) {
                if (mode.getPhysicalHeight() < supportedModes[i].getPhysicalHeight() || mode.getPhysicalWidth() < supportedModes[i].getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }
        
        static boolean d(final Display$Mode display$Mode, final Point point) {
            return (display$Mode.getPhysicalWidth() == point.x && display$Mode.getPhysicalHeight() == point.y) || (display$Mode.getPhysicalWidth() == point.y && display$Mode.getPhysicalHeight() == point.x);
        }
        
        static boolean e(final Display$Mode display$Mode, final Display$Mode display$Mode2) {
            return display$Mode.getPhysicalWidth() == display$Mode2.getPhysicalWidth() && display$Mode.getPhysicalHeight() == display$Mode2.getPhysicalHeight();
        }
    }
    
    public static final class c
    {
        private final Display$Mode a;
        private final Point b;
        private final boolean c;
        
        c(@j0 final Point b) {
            n.h(b, "physicalSize == null");
            this.b = b;
            this.a = null;
            this.c = true;
        }
        
        @p0(23)
        c(@j0 final Display$Mode a, @j0 final Point b) {
            n.h(a, "mode == null, can't wrap a null reference");
            n.h(b, "physicalSize == null");
            this.b = b;
            this.a = a;
            this.c = true;
        }
        
        @p0(23)
        c(@j0 final Display$Mode a, final boolean c) {
            n.h(a, "mode == null, can't wrap a null reference");
            this.b = new Point(a.getPhysicalWidth(), a.getPhysicalHeight());
            this.a = a;
            this.c = c;
        }
        
        public int a() {
            return this.b.y;
        }
        
        public int b() {
            return this.b.x;
        }
        
        @Deprecated
        public boolean c() {
            return this.c;
        }
        
        @k0
        @p0(23)
        public Display$Mode d() {
            return this.a;
        }
    }
}
