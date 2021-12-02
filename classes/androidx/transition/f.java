// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;
import androidx.core.view.j0;
import android.util.AttributeSet;
import android.content.Context;

public class f extends g0
{
    private static final String C0 = "android:clipBounds:clip";
    private static final String D0 = "android:clipBounds:bounds";
    private static final String[] E0;
    
    static {
        E0 = new String[] { "android:clipBounds:clip" };
    }
    
    public f() {
    }
    
    public f(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private void I0(final n0 n0) {
        final View b = n0.b;
        if (b.getVisibility() == 8) {
            return;
        }
        final Rect n2 = androidx.core.view.j0.N(b);
        n0.a.put("android:clipBounds:clip", n2);
        if (n2 == null) {
            n0.a.put("android:clipBounds:bounds", new Rect(0, 0, b.getWidth(), b.getHeight()));
        }
    }
    
    @Override
    public String[] b0() {
        return f.E0;
    }
    
    @Override
    public void m(@androidx.annotation.j0 final n0 n0) {
        this.I0(n0);
    }
    
    @Override
    public void r(@androidx.annotation.j0 final n0 n0) {
        this.I0(n0);
    }
    
    @Override
    public Animator v(@androidx.annotation.j0 final ViewGroup viewGroup, final n0 n0, final n0 n2) {
        Animator ofObject;
        final Animator animator = ofObject = null;
        if (n0 != null) {
            ofObject = animator;
            if (n2 != null) {
                ofObject = animator;
                if (n0.a.containsKey("android:clipBounds:clip")) {
                    if (!n2.a.containsKey("android:clipBounds:clip")) {
                        ofObject = animator;
                    }
                    else {
                        final Rect rect = n0.a.get("android:clipBounds:clip");
                        final Rect rect2 = n2.a.get("android:clipBounds:clip");
                        final boolean b = rect2 == null;
                        if (rect == null && rect2 == null) {
                            return null;
                        }
                        Rect rect3;
                        Rect rect4;
                        if (rect == null) {
                            rect3 = n0.a.get("android:clipBounds:bounds");
                            rect4 = rect2;
                        }
                        else {
                            rect3 = rect;
                            if ((rect4 = rect2) == null) {
                                rect4 = n2.a.get("android:clipBounds:bounds");
                                rect3 = rect;
                            }
                        }
                        if (rect3.equals((Object)rect4)) {
                            return null;
                        }
                        androidx.core.view.j0.K1(n2.b, rect3);
                        final ObjectAnimator objectAnimator = (ObjectAnimator)(ofObject = (Animator)ObjectAnimator.ofObject((Object)n2.b, (Property)androidx.transition.y0.d, (TypeEvaluator)new b0(new Rect()), (Object[])new Rect[] { rect3, rect4 }));
                        if (b) {
                            objectAnimator.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                                final /* synthetic */ View a = n2.b;
                                
                                public void onAnimationEnd(final Animator animator) {
                                    androidx.core.view.j0.K1(this.a, null);
                                }
                            });
                            ofObject = (Animator)objectAnimator;
                        }
                    }
                }
            }
        }
        return ofObject;
    }
}
