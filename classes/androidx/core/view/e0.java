// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import androidx.annotation.t0;
import android.content.res.Resources;
import android.content.Context;
import android.view.PointerIcon;
import android.os.Build$VERSION;
import android.graphics.Bitmap;

public final class e0
{
    public static final int b = 0;
    public static final int c = 1000;
    public static final int d = 1001;
    public static final int e = 1002;
    public static final int f = 1003;
    public static final int g = 1004;
    public static final int h = 1006;
    public static final int i = 1007;
    public static final int j = 1008;
    public static final int k = 1009;
    public static final int l = 1010;
    public static final int m = 1011;
    public static final int n = 1012;
    public static final int o = 1013;
    public static final int p = 1014;
    public static final int q = 1015;
    public static final int r = 1016;
    public static final int s = 1017;
    public static final int t = 1018;
    public static final int u = 1019;
    public static final int v = 1020;
    public static final int w = 1021;
    public static final int x = 1000;
    private Object a;
    
    private e0(final Object a) {
        this.a = a;
    }
    
    public static e0 a(final Bitmap bitmap, final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 24) {
            return new e0(PointerIcon.create(bitmap, n, n2));
        }
        return new e0(null);
    }
    
    public static e0 c(final Context context, final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            return new e0(PointerIcon.getSystemIcon(context, n));
        }
        return new e0(null);
    }
    
    public static e0 d(final Resources resources, final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            return new e0(PointerIcon.load(resources, n));
        }
        return new e0(null);
    }
    
    @t0({ t0.a.I })
    public Object b() {
        return this.a;
    }
}
