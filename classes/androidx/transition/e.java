// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.graphics.Path;
import java.util.Map;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.ViewGroup;
import androidx.annotation.k0;
import androidx.core.view.j0;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import androidx.core.content.res.i;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.Property;

public class e extends g0
{
    private static final String F0 = "android:changeBounds:bounds";
    private static final String G0 = "android:changeBounds:clip";
    private static final String H0 = "android:changeBounds:parent";
    private static final String I0 = "android:changeBounds:windowX";
    private static final String J0 = "android:changeBounds:windowY";
    private static final String[] K0;
    private static final Property<Drawable, PointF> L0;
    private static final Property<k, PointF> M0;
    private static final Property<k, PointF> N0;
    private static final Property<View, PointF> O0;
    private static final Property<View, PointF> P0;
    private static final Property<View, PointF> Q0;
    private static b0 R0;
    private int[] C0;
    private boolean D0;
    private boolean E0;
    
    static {
        K0 = new String[] { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
        L0 = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
            private Rect a = new Rect();
            
            public PointF a(final Drawable drawable) {
                drawable.copyBounds(this.a);
                final Rect a = this.a;
                return new PointF((float)a.left, (float)a.top);
            }
            
            public void b(final Drawable drawable, final PointF pointF) {
                drawable.copyBounds(this.a);
                this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds(this.a);
            }
        };
        M0 = new Property<k, PointF>(PointF.class, "topLeft") {
            public PointF a(final k k) {
                return null;
            }
            
            public void b(final k k, final PointF pointF) {
                k.c(pointF);
            }
        };
        N0 = new Property<k, PointF>(PointF.class, "bottomRight") {
            public PointF a(final k k) {
                return null;
            }
            
            public void b(final k k, final PointF pointF) {
                k.a(pointF);
            }
        };
        O0 = new Property<View, PointF>(PointF.class, "bottomRight") {
            public PointF a(final View view) {
                return null;
            }
            
            public void b(final View view, final PointF pointF) {
                androidx.transition.y0.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
            }
        };
        P0 = new Property<View, PointF>(PointF.class, "topLeft") {
            public PointF a(final View view) {
                return null;
            }
            
            public void b(final View view, final PointF pointF) {
                androidx.transition.y0.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
            }
        };
        Q0 = new Property<View, PointF>(PointF.class, "position") {
            public PointF a(final View view) {
                return null;
            }
            
            public void b(final View view, final PointF pointF) {
                final int round = Math.round(pointF.x);
                final int round2 = Math.round(pointF.y);
                androidx.transition.y0.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
            }
        };
        e.R0 = new b0();
    }
    
    public e() {
        this.C0 = new int[2];
        this.D0 = false;
        this.E0 = false;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public e(final Context context, final AttributeSet set) {
        super(context, set);
        this.C0 = new int[2];
        this.D0 = false;
        this.E0 = false;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.transition.f0.d);
        final boolean e = i.e(obtainStyledAttributes, (XmlPullParser)set, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.L0(e);
    }
    
    private void I0(final n0 n0) {
        final View b = n0.b;
        if (androidx.core.view.j0.T0(b) || b.getWidth() != 0 || b.getHeight() != 0) {
            n0.a.put("android:changeBounds:bounds", new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
            n0.a.put("android:changeBounds:parent", n0.b.getParent());
            if (this.E0) {
                n0.b.getLocationInWindow(this.C0);
                n0.a.put("android:changeBounds:windowX", this.C0[0]);
                n0.a.put("android:changeBounds:windowY", this.C0[1]);
            }
            if (this.D0) {
                n0.a.put("android:changeBounds:clip", androidx.core.view.j0.N(b));
            }
        }
    }
    
    private boolean K0(final View view, final View view2) {
        final boolean e0 = this.E0;
        boolean b = true;
        if (e0) {
            final n0 r = this.R(view, true);
            b = (((r != null) ? (view2 == r.b) : (view == view2)) && b);
        }
        return b;
    }
    
    public boolean J0() {
        return this.D0;
    }
    
    public void L0(final boolean d0) {
        this.D0 = d0;
    }
    
    @k0
    @Override
    public String[] b0() {
        return e.K0;
    }
    
    @Override
    public void m(@androidx.annotation.j0 final n0 n0) {
        this.I0(n0);
    }
    
    @Override
    public void r(@androidx.annotation.j0 final n0 n0) {
        this.I0(n0);
    }
    
    @k0
    @Override
    public Animator v(@androidx.annotation.j0 final ViewGroup viewGroup, @k0 final n0 n0, @k0 final n0 n2) {
        if (n0 == null || n2 == null) {
            return null;
        }
        final Map<String, Object> a = n0.a;
        final Map<String, Object> a2 = n2.a;
        final ViewGroup viewGroup2 = a.get("android:changeBounds:parent");
        final ViewGroup viewGroup3 = a2.get("android:changeBounds:parent");
        if (viewGroup2 != null && viewGroup3 != null) {
            final View b = n2.b;
            if (this.K0((View)viewGroup2, (View)viewGroup3)) {
                final Rect rect = n0.a.get("android:changeBounds:bounds");
                final Rect rect2 = n2.a.get("android:changeBounds:bounds");
                final int left = rect.left;
                final int left2 = rect2.left;
                final int top = rect.top;
                final int top2 = rect2.top;
                final int right = rect.right;
                final int right2 = rect2.right;
                final int bottom = rect.bottom;
                final int bottom2 = rect2.bottom;
                final int a3 = right - left;
                final int a4 = bottom - top;
                final int b2 = right2 - left2;
                final int b3 = bottom2 - top2;
                Rect rect3 = n0.a.get("android:changeBounds:clip");
                final Rect rect4 = n2.a.get("android:changeBounds:clip");
                int n4 = 0;
                Label_0299: {
                    if ((a3 != 0 && a4 != 0) || (b2 != 0 && b3 != 0)) {
                        int n3;
                        if (left == left2 && top == top2) {
                            n3 = 0;
                        }
                        else {
                            n3 = 1;
                        }
                        if (right == right2) {
                            n4 = n3;
                            if (bottom == bottom2) {
                                break Label_0299;
                            }
                        }
                        n4 = n3 + 1;
                    }
                    else {
                        n4 = 0;
                    }
                }
                int n5 = 0;
                Label_0335: {
                    if (rect3 == null || rect3.equals((Object)rect4)) {
                        n5 = n4;
                        if (rect3 != null) {
                            break Label_0335;
                        }
                        n5 = n4;
                        if (rect4 == null) {
                            break Label_0335;
                        }
                    }
                    n5 = n4 + 1;
                }
                if (n5 > 0) {
                    Object o = null;
                    Label_0800: {
                        if (!this.D0) {
                            final View view = b;
                            androidx.transition.y0.g(view, left, top, right, bottom);
                            Path path;
                            Property<View, PointF> property;
                            if (n5 == 2) {
                                if (a3 != b2 || a4 != b3) {
                                    final k k = new k(view);
                                    final ObjectAnimator a5 = v.a(k, e.M0, this.T().a((float)left, (float)top, (float)left2, (float)top2));
                                    final ObjectAnimator a6 = v.a(k, e.N0, this.T().a((float)right, (float)bottom, (float)right2, (float)bottom2));
                                    o = new AnimatorSet();
                                    ((AnimatorSet)o).playTogether(new Animator[] { (Animator)a5, (Animator)a6 });
                                    ((AnimatorSet)o).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                                        private k mViewBounds = k;
                                    });
                                    break Label_0800;
                                }
                                path = this.T().a((float)left, (float)top, (float)left2, (float)top2);
                                property = e.Q0;
                            }
                            else if (left == left2 && top == top2) {
                                path = this.T().a((float)right, (float)bottom, (float)right2, (float)bottom2);
                                property = e.O0;
                            }
                            else {
                                path = this.T().a((float)left, (float)top, (float)left2, (float)top2);
                                property = e.P0;
                            }
                            o = v.a(view, property, path);
                        }
                        else {
                            final View view2 = b;
                            androidx.transition.y0.g(view2, left, top, Math.max(a3, b2) + left, Math.max(a4, b3) + top);
                            Object a7;
                            if (left == left2 && top == top2) {
                                a7 = null;
                            }
                            else {
                                a7 = v.a(view2, e.Q0, this.T().a((float)left, (float)top, (float)left2, (float)top2));
                            }
                            if (rect3 == null) {
                                rect3 = new Rect(0, 0, a3, a4);
                            }
                            Rect rect5;
                            if (rect4 == null) {
                                rect5 = new Rect(0, 0, b2, b3);
                            }
                            else {
                                rect5 = rect4;
                            }
                            ObjectAnimator ofObject;
                            if (!rect3.equals((Object)rect5)) {
                                androidx.core.view.j0.K1(view2, rect3);
                                ofObject = ObjectAnimator.ofObject((Object)view2, "clipBounds", (TypeEvaluator)e.R0, new Object[] { rect3, rect5 });
                                ofObject.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                                    private boolean a;
                                    
                                    public void onAnimationCancel(final Animator animator) {
                                        this.a = true;
                                    }
                                    
                                    public void onAnimationEnd(final Animator animator) {
                                        if (!this.a) {
                                            androidx.core.view.j0.K1(view2, rect4);
                                            androidx.transition.y0.g(view2, left2, top2, right2, bottom2);
                                        }
                                    }
                                });
                            }
                            else {
                                ofObject = null;
                            }
                            o = androidx.transition.m0.c((Animator)a7, (Animator)ofObject);
                        }
                    }
                    if (b.getParent() instanceof ViewGroup) {
                        final ViewGroup viewGroup4 = (ViewGroup)b.getParent();
                        androidx.transition.t0.d(viewGroup4, true);
                        this.a((h)new i0() {
                            boolean a = false;
                            
                            @Override
                            public void b(@androidx.annotation.j0 final g0 g0) {
                                androidx.transition.t0.d(viewGroup4, false);
                            }
                            
                            @Override
                            public void c(@androidx.annotation.j0 final g0 g0) {
                                if (!this.a) {
                                    androidx.transition.t0.d(viewGroup4, false);
                                }
                                g0.p0((h)this);
                            }
                            
                            @Override
                            public void d(@androidx.annotation.j0 final g0 g0) {
                                androidx.transition.t0.d(viewGroup4, false);
                                this.a = true;
                            }
                            
                            @Override
                            public void e(@androidx.annotation.j0 final g0 g0) {
                                androidx.transition.t0.d(viewGroup4, true);
                            }
                        });
                    }
                    return (Animator)o;
                }
            }
            else {
                final int intValue = n0.a.get("android:changeBounds:windowX");
                final int intValue2 = n0.a.get("android:changeBounds:windowY");
                final int intValue3 = n2.a.get("android:changeBounds:windowX");
                final int intValue4 = n2.a.get("android:changeBounds:windowY");
                if (intValue != intValue3 || intValue2 != intValue4) {
                    viewGroup.getLocationInWindow(this.C0);
                    final Bitmap bitmap = Bitmap.createBitmap(b.getWidth(), b.getHeight(), Bitmap$Config.ARGB_8888);
                    b.draw(new Canvas(bitmap));
                    final BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                    final float c = androidx.transition.y0.c(b);
                    androidx.transition.y0.h(b, 0.0f);
                    androidx.transition.y0.b((View)viewGroup).a((Drawable)bitmapDrawable);
                    final w t = this.T();
                    final int[] c2 = this.C0;
                    final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)bitmapDrawable, new PropertyValuesHolder[] { z.a(e.L0, t.a((float)(intValue - c2[0]), (float)(intValue2 - c2[1]), (float)(intValue3 - c2[0]), (float)(intValue4 - c2[1]))) });
                    ofPropertyValuesHolder.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                        public void onAnimationEnd(final Animator animator) {
                            androidx.transition.y0.b((View)viewGroup).b((Drawable)bitmapDrawable);
                            androidx.transition.y0.h(b, c);
                        }
                    });
                    return (Animator)ofPropertyValuesHolder;
                }
            }
            return null;
        }
        return null;
    }
    
    private static class k
    {
        private int a;
        private int b;
        private int c;
        private int d;
        private View e;
        private int f;
        private int g;
        
        k(final View e) {
            this.e = e;
        }
        
        private void b() {
            androidx.transition.y0.g(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }
        
        void a(final PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            final int g = this.g + 1;
            this.g = g;
            if (this.f == g) {
                this.b();
            }
        }
        
        void c(final PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            final int f = this.f + 1;
            this.f = f;
            if (f == this.g) {
                this.b();
            }
        }
    }
}
