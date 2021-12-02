// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.view.View;

public abstract class g1 extends k0
{
    private static final String a = "android:visibilityPropagation:visibility";
    private static final String b = "android:visibilityPropagation:center";
    private static final String[] c;
    
    static {
        c = new String[] { "android:visibilityPropagation:visibility", "android:visibilityPropagation:center" };
    }
    
    private static int d(final n0 n0, final int n2) {
        if (n0 == null) {
            return -1;
        }
        final int[] array = n0.a.get("android:visibilityPropagation:center");
        if (array == null) {
            return -1;
        }
        return array[n2];
    }
    
    @Override
    public void a(final n0 n0) {
        final View b = n0.b;
        Integer value;
        if ((value = n0.a.get("android:visibility:visibility")) == null) {
            value = b.getVisibility();
        }
        n0.a.put("android:visibilityPropagation:visibility", value);
        final int[] array = new int[2];
        b.getLocationOnScreen(array);
        array[0] += Math.round(b.getTranslationX());
        array[0] += b.getWidth() / 2;
        array[1] += Math.round(b.getTranslationY());
        array[1] += b.getHeight() / 2;
        n0.a.put("android:visibilityPropagation:center", array);
    }
    
    @Override
    public String[] b() {
        return g1.c;
    }
    
    public int e(final n0 n0) {
        if (n0 == null) {
            return 8;
        }
        final Integer n2 = n0.a.get("android:visibilityPropagation:visibility");
        if (n2 == null) {
            return 8;
        }
        return n2;
    }
    
    public int f(final n0 n0) {
        return d(n0, 0);
    }
    
    public int g(final n0 n0) {
        return d(n0, 1);
    }
}
