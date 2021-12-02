// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.view.View;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;

public class h extends g0
{
    private static final String C0 = "android:changeScroll:x";
    private static final String D0 = "android:changeScroll:y";
    private static final String[] E0;
    
    static {
        E0 = new String[] { "android:changeScroll:x", "android:changeScroll:y" };
    }
    
    public h() {
    }
    
    public h(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private void I0(final n0 n0) {
        n0.a.put("android:changeScroll:x", n0.b.getScrollX());
        n0.a.put("android:changeScroll:y", n0.b.getScrollY());
    }
    
    @k0
    @Override
    public String[] b0() {
        return h.E0;
    }
    
    @Override
    public void m(@j0 final n0 n0) {
        this.I0(n0);
    }
    
    @Override
    public void r(@j0 final n0 n0) {
        this.I0(n0);
    }
    
    @k0
    @Override
    public Animator v(@j0 final ViewGroup viewGroup, @k0 final n0 n0, @k0 final n0 n2) {
        final Animator animator = null;
        final Animator animator2 = null;
        Animator c = animator;
        if (n0 != null) {
            if (n2 == null) {
                c = animator;
            }
            else {
                final View b = n2.b;
                final int intValue = n0.a.get("android:changeScroll:x");
                final int intValue2 = n2.a.get("android:changeScroll:x");
                final int intValue3 = n0.a.get("android:changeScroll:y");
                final int intValue4 = n2.a.get("android:changeScroll:y");
                Object ofInt;
                if (intValue != intValue2) {
                    b.setScrollX(intValue);
                    ofInt = ObjectAnimator.ofInt((Object)b, "scrollX", new int[] { intValue, intValue2 });
                }
                else {
                    ofInt = null;
                }
                Object ofInt2 = animator2;
                if (intValue3 != intValue4) {
                    b.setScrollY(intValue3);
                    ofInt2 = ObjectAnimator.ofInt((Object)b, "scrollY", new int[] { intValue3, intValue4 });
                }
                c = androidx.transition.m0.c((Animator)ofInt, (Animator)ofInt2);
            }
        }
        return c;
    }
}
