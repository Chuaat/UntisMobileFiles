// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transformation;

import com.google.android.material.animation.j;
import com.google.android.material.animation.h;
import o2.a;
import androidx.annotation.i;
import android.view.ViewParent;
import java.util.HashMap;
import android.os.Build$VERSION;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.annotation.j0;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.k0;
import android.view.View;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior
{
    @k0
    private Map<View, Integer> l;
    
    public FabTransformationSheetBehavior() {
    }
    
    public FabTransformationSheetBehavior(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private void j0(@j0 final View view, final boolean b) {
        final ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)parent;
        final int childCount = coordinatorLayout.getChildCount();
        if (Build$VERSION.SDK_INT >= 16 && b) {
            this.l = new HashMap<View, Integer>(childCount);
        }
        for (int i = 0; i < childCount; ++i) {
            final View child = coordinatorLayout.getChildAt(i);
            final boolean b2 = child.getLayoutParams() instanceof g && ((g)child.getLayoutParams()).f() instanceof FabTransformationScrimBehavior;
            if (child != view) {
                if (!b2) {
                    int intValue;
                    if (!b) {
                        final Map<View, Integer> l = this.l;
                        if (l == null || !l.containsKey(child)) {
                            continue;
                        }
                        intValue = this.l.get(child);
                    }
                    else {
                        if (Build$VERSION.SDK_INT >= 16) {
                            this.l.put(child, child.getImportantForAccessibility());
                        }
                        intValue = 4;
                    }
                    androidx.core.view.j0.P1(child, intValue);
                }
            }
        }
        if (!b) {
            this.l = null;
        }
    }
    
    @androidx.annotation.i
    @Override
    protected boolean K(@j0 final View view, @j0 final View view2, final boolean b, final boolean b2) {
        this.j0(view2, b);
        return super.K(view, view2, b, b2);
    }
    
    @j0
    @Override
    protected e h0(final Context context, final boolean b) {
        int n;
        if (b) {
            n = o2.a.b.t;
        }
        else {
            n = o2.a.b.s;
        }
        final e e = new e();
        e.a = com.google.android.material.animation.h.d(context, n);
        e.b = new com.google.android.material.animation.j(17, 0.0f, 0.0f);
        return e;
    }
}
