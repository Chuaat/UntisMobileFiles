// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.hardware.display;

import androidx.annotation.k0;
import android.view.WindowManager;
import android.hardware.display.DisplayManager;
import android.os.Build$VERSION;
import android.view.Display;
import androidx.annotation.j0;
import android.content.Context;
import java.util.WeakHashMap;

public final class a
{
    private static final WeakHashMap<Context, a> b;
    public static final String c = "android.hardware.display.category.PRESENTATION";
    private final Context a;
    
    static {
        b = new WeakHashMap<Context, a>();
    }
    
    private a(final Context a) {
        this.a = a;
    }
    
    @j0
    public static a d(@j0 final Context context) {
        final WeakHashMap<Context, a> b = a.b;
        synchronized (b) {
            a value;
            if ((value = b.get(context)) == null) {
                value = new a(context);
                b.put(context, value);
            }
            return value;
        }
    }
    
    @k0
    public Display a(final int n) {
        if (Build$VERSION.SDK_INT >= 17) {
            return ((DisplayManager)this.a.getSystemService("display")).getDisplay(n);
        }
        final Display defaultDisplay = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getDisplayId() == n) {
            return defaultDisplay;
        }
        return null;
    }
    
    @j0
    public Display[] b() {
        if (Build$VERSION.SDK_INT >= 17) {
            return ((DisplayManager)this.a.getSystemService("display")).getDisplays();
        }
        return new Display[] { ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay() };
    }
    
    @j0
    public Display[] c(@k0 final String s) {
        if (Build$VERSION.SDK_INT >= 17) {
            return ((DisplayManager)this.a.getSystemService("display")).getDisplays(s);
        }
        if (s == null) {
            return new Display[0];
        }
        return new Display[] { ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay() };
    }
}
