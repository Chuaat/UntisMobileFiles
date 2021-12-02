// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.content.res.AssetManager;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.Context;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import androidx.annotation.t0;
import android.content.ContextWrapper;

@t0({ t0.a.I })
public class r0 extends ContextWrapper
{
    private static final Object c;
    private static ArrayList<WeakReference<r0>> d;
    private final Resources a;
    private final Resources$Theme b;
    
    static {
        c = new Object();
    }
    
    private r0(@j0 final Context context) {
        super(context);
        if (z0.c()) {
            final z0 a = new z0((Context)this, context.getResources());
            this.a = a;
            (this.b = a.newTheme()).setTo(context.getTheme());
        }
        else {
            this.a = new androidx.appcompat.widget.t0((Context)this, context.getResources());
            this.b = null;
        }
    }
    
    private static boolean a(@j0 final Context context) {
        final boolean b = context instanceof r0;
        boolean b3;
        final boolean b2 = b3 = false;
        if (!b) {
            b3 = b2;
            if (!(context.getResources() instanceof androidx.appcompat.widget.t0)) {
                if (context.getResources() instanceof z0) {
                    b3 = b2;
                }
                else {
                    if (Build$VERSION.SDK_INT >= 21) {
                        b3 = b2;
                        if (!z0.c()) {
                            return b3;
                        }
                    }
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public static Context b(@j0 final Context context) {
        if (a(context)) {
            synchronized (r0.c) {
                final ArrayList<WeakReference<r0>> d = r0.d;
                if (d == null) {
                    r0.d = new ArrayList<WeakReference<r0>>();
                }
                else {
                    for (int i = d.size() - 1; i >= 0; --i) {
                        final WeakReference<r0> weakReference = r0.d.get(i);
                        if (weakReference == null || weakReference.get() == null) {
                            r0.d.remove(i);
                        }
                    }
                    for (int j = r0.d.size() - 1; j >= 0; --j) {
                        final WeakReference<r0> weakReference2 = r0.d.get(j);
                        ContextWrapper contextWrapper;
                        if (weakReference2 != null) {
                            contextWrapper = weakReference2.get();
                        }
                        else {
                            contextWrapper = null;
                        }
                        if (contextWrapper != null && contextWrapper.getBaseContext() == context) {
                            return (Context)contextWrapper;
                        }
                    }
                }
                final r0 referent = new r0(context);
                r0.d.add(new WeakReference<r0>(referent));
                return (Context)referent;
            }
        }
        return context;
    }
    
    public AssetManager getAssets() {
        return this.a.getAssets();
    }
    
    public Resources getResources() {
        return this.a;
    }
    
    public Resources$Theme getTheme() {
        Resources$Theme resources$Theme;
        if ((resources$Theme = this.b) == null) {
            resources$Theme = super.getTheme();
        }
        return resources$Theme;
    }
    
    public void setTheme(final int theme) {
        final Resources$Theme b = this.b;
        if (b == null) {
            super.setTheme(theme);
        }
        else {
            b.applyStyle(theme, true);
        }
    }
}
