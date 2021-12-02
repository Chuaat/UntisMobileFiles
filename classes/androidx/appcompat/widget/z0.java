// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.content.res.Resources$NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.Context;
import java.lang.ref.WeakReference;
import androidx.annotation.t0;
import android.content.res.Resources;

@t0({ t0.a.I })
public class z0 extends Resources
{
    private static boolean b = false;
    public static final int c = 20;
    private final WeakReference<Context> a;
    
    public z0(@j0 final Context referent, @j0 final Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = new WeakReference<Context>(referent);
    }
    
    public static boolean a() {
        return z0.b;
    }
    
    public static void b(final boolean b) {
        z0.b = b;
    }
    
    public static boolean c() {
        return a() && Build$VERSION.SDK_INT <= 20;
    }
    
    final Drawable d(final int n) {
        return super.getDrawable(n);
    }
    
    public Drawable getDrawable(final int n) throws Resources$NotFoundException {
        final Context context = this.a.get();
        if (context != null) {
            return androidx.appcompat.widget.j0.h().t(context, this, n);
        }
        return super.getDrawable(n);
    }
}
