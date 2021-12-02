// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view;

import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.res.Configuration;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class a
{
    private Context a;
    
    private a(final Context a) {
        this.a = a;
    }
    
    public static a b(final Context context) {
        return new a(context);
    }
    
    public boolean a() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }
    
    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }
    
    public int d() {
        final Configuration configuration = this.a.getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || screenWidthDp > 600 || (screenWidthDp > 960 && screenHeightDp > 720) || (screenWidthDp > 720 && screenHeightDp > 960)) {
            return 5;
        }
        if (screenWidthDp >= 500 || (screenWidthDp > 640 && screenHeightDp > 480) || (screenWidthDp > 480 && screenHeightDp > 640)) {
            return 4;
        }
        if (screenWidthDp >= 360) {
            return 3;
        }
        return 2;
    }
    
    public int e() {
        return this.a.getResources().getDimensionPixelSize(c.a.f.k);
    }
    
    public int f() {
        final TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet)null, c.a.n.a, c.a.c.f, 0);
        final int layoutDimension = obtainStyledAttributes.getLayoutDimension(c.a.n.o, 0);
        final Resources resources = this.a.getResources();
        int min = layoutDimension;
        if (!this.g()) {
            min = Math.min(layoutDimension, resources.getDimensionPixelSize(c.a.f.j));
        }
        obtainStyledAttributes.recycle();
        return min;
    }
    
    public boolean g() {
        return this.a.getResources().getBoolean(c.a.d.a);
    }
    
    public boolean h() {
        return Build$VERSION.SDK_INT >= 19 || (ViewConfiguration.get(this.a).hasPermanentMenuKey() ^ true);
    }
}
