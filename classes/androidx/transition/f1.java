// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.k0;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;
import androidx.annotation.j0;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import androidx.core.content.res.i;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.Context;

public abstract class f1 extends g0
{
    static final String D0 = "android:visibility:visibility";
    private static final String E0 = "android:visibility:parent";
    private static final String F0 = "android:visibility:screenLocation";
    public static final int G0 = 1;
    public static final int H0 = 2;
    private static final String[] I0;
    private int C0;
    
    static {
        I0 = new String[] { "android:visibility:visibility", "android:visibility:parent" };
    }
    
    public f1() {
        this.C0 = 3;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public f1(final Context context, final AttributeSet set) {
        super(context, set);
        this.C0 = 3;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.transition.f0.e);
        final int k = i.k(obtainStyledAttributes, (XmlPullParser)set, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k != 0) {
            this.Q0(k);
        }
    }
    
    private void I0(final n0 n0) {
        n0.a.put("android:visibility:visibility", n0.b.getVisibility());
        n0.a.put("android:visibility:parent", n0.b.getParent());
        final int[] array = new int[2];
        n0.b.getLocationOnScreen(array);
        n0.a.put("android:visibility:screenLocation", array);
    }
    
    private d K0(final n0 n0, final n0 n2) {
        final d d = new d();
        d.a = false;
        d.b = false;
        if (n0 != null && n0.a.containsKey("android:visibility:visibility")) {
            d.c = n0.a.get("android:visibility:visibility");
            d.e = n0.a.get("android:visibility:parent");
        }
        else {
            d.c = -1;
            d.e = null;
        }
        if (n2 != null && n2.a.containsKey("android:visibility:visibility")) {
            d.d = n2.a.get("android:visibility:visibility");
            d.f = n2.a.get("android:visibility:parent");
        }
        else {
            d.d = -1;
            d.f = null;
        }
        while (true) {
            Label_0276: {
                if (n0 != null && n2 != null) {
                    final int c = d.c;
                    final int d2 = d.d;
                    if (c == d2 && d.e == d.f) {
                        return d;
                    }
                    if (c != d2) {
                        if (c == 0) {
                            break Label_0276;
                        }
                        if (d2 != 0) {
                            return d;
                        }
                    }
                    else {
                        if (d.f == null) {
                            break Label_0276;
                        }
                        if (d.e != null) {
                            return d;
                        }
                    }
                }
                else if (n0 != null || d.d != 0) {
                    if (n2 == null && d.c == 0) {
                        break Label_0276;
                    }
                    return d;
                }
                d.b = true;
                d.a = true;
                return d;
            }
            d.b = false;
            continue;
        }
    }
    
    public int J0() {
        return this.C0;
    }
    
    public boolean L0(final n0 n0) {
        final boolean b = false;
        if (n0 == null) {
            return false;
        }
        final int intValue = n0.a.get("android:visibility:visibility");
        final View view = n0.a.get("android:visibility:parent");
        boolean b2 = b;
        if (intValue == 0) {
            b2 = b;
            if (view != null) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public Animator M0(final ViewGroup viewGroup, final View view, final n0 n0, final n0 n2) {
        return null;
    }
    
    public Animator N0(final ViewGroup viewGroup, final n0 n0, final int n2, final n0 n3, final int n4) {
        if ((this.C0 & 0x1) == 0x1 && n3 != null) {
            if (n0 == null) {
                final View view = (View)n3.b.getParent();
                if (this.K0(this.R(view, false), this.c0(view, false)).a) {
                    return null;
                }
            }
            return this.M0(viewGroup, n3.b, n0, n3);
        }
        return null;
    }
    
    public Animator O0(final ViewGroup viewGroup, final View view, final n0 n0, final n0 n2) {
        return null;
    }
    
    public Animator P0(final ViewGroup viewGroup, final n0 n0, int n2, final n0 n3, int n4) {
        if ((this.C0 & 0x2) != 0x2) {
            return null;
        }
        if (n0 == null) {
            return null;
        }
        final View b = n0.b;
        View b2;
        if (n3 != null) {
            b2 = n3.b;
        }
        else {
            b2 = null;
        }
        final int z0 = androidx.transition.a0.g.Z0;
        View view = (View)b.getTag(z0);
        View view2 = null;
        Label_0292: {
            if (view != null) {
                view2 = null;
                n2 = 1;
            }
            else {
                View view3 = null;
                Label_0138: {
                    Label_0129: {
                        if (b2 != null && b2.getParent() != null) {
                            if (n4 != 4) {
                                if (b != b2) {
                                    break Label_0129;
                                }
                            }
                            view3 = b2;
                            n2 = 0;
                            b2 = null;
                            break Label_0138;
                        }
                        if (b2 != null) {
                            view3 = null;
                            n2 = 0;
                            break Label_0138;
                        }
                    }
                    b2 = (view3 = null);
                    n2 = 1;
                }
                View a = b2;
                Label_0282: {
                    if (n2 != 0) {
                        if (b.getParent() != null) {
                            a = b2;
                            if (!(b.getParent() instanceof View)) {
                                break Label_0282;
                            }
                            final View view4 = (View)b.getParent();
                            if (!this.K0(this.c0(view4, true), this.R(view4, true)).a) {
                                a = androidx.transition.m0.a(viewGroup, b, view4);
                                break Label_0282;
                            }
                            n2 = view4.getId();
                            a = b2;
                            if (view4.getParent() != null) {
                                break Label_0282;
                            }
                            a = b2;
                            if (n2 == -1) {
                                break Label_0282;
                            }
                            a = b2;
                            if (viewGroup.findViewById(n2) == null) {
                                break Label_0282;
                            }
                            a = b2;
                            if (!super.c0) {
                                break Label_0282;
                            }
                        }
                        view2 = view3;
                        n2 = 0;
                        view = b;
                        break Label_0292;
                    }
                }
                n2 = 0;
                view2 = view3;
                view = a;
            }
        }
        if (view != null) {
            if (n2 == 0) {
                final int[] array = n0.a.get("android:visibility:screenLocation");
                final int n5 = array[0];
                n4 = array[1];
                final int[] array2 = new int[2];
                viewGroup.getLocationOnScreen(array2);
                view.offsetLeftAndRight(n5 - array2[0] - view.getLeft());
                view.offsetTopAndBottom(n4 - array2[1] - view.getTop());
                androidx.transition.t0.b(viewGroup).c(view);
            }
            final Animator o0 = this.O0(viewGroup, view, n0, n3);
            if (n2 == 0) {
                if (o0 == null) {
                    androidx.transition.t0.b(viewGroup).d(view);
                }
                else {
                    b.setTag(z0, (Object)view);
                    this.a((h)new i0() {
                        @Override
                        public void b(@j0 final g0 g0) {
                            androidx.transition.t0.b(viewGroup).d(view);
                        }
                        
                        @Override
                        public void c(@j0 final g0 g0) {
                            b.setTag(androidx.transition.a0.g.Z0, (Object)null);
                            androidx.transition.t0.b(viewGroup).d(view);
                            g0.p0((h)this);
                        }
                        
                        @Override
                        public void e(@j0 final g0 g0) {
                            if (view.getParent() == null) {
                                androidx.transition.t0.b(viewGroup).c(view);
                            }
                            else {
                                f1.this.cancel();
                            }
                        }
                    });
                }
            }
            return o0;
        }
        if (view2 != null) {
            n2 = view2.getVisibility();
            androidx.transition.y0.i(view2, 0);
            final Animator o2 = this.O0(viewGroup, view2, n0, n3);
            if (o2 != null) {
                final b b3 = new b(view2, n4, true);
                o2.addListener((Animator$AnimatorListener)b3);
                a.a(o2, b3);
                this.a((h)b3);
            }
            else {
                androidx.transition.y0.i(view2, n2);
            }
            return o2;
        }
        return null;
    }
    
    public void Q0(final int c0) {
        if ((c0 & 0xFFFFFFFC) == 0x0) {
            this.C0 = c0;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
    
    @k0
    @Override
    public String[] b0() {
        return f1.I0;
    }
    
    @Override
    public boolean d0(final n0 n0, final n0 n2) {
        final boolean b = false;
        if (n0 == null && n2 == null) {
            return false;
        }
        if (n0 != null && n2 != null && n2.a.containsKey("android:visibility:visibility") != n0.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        final d k0 = this.K0(n0, n2);
        boolean b2 = b;
        if (k0.a) {
            if (k0.c != 0) {
                b2 = b;
                if (k0.d != 0) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
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
        final d k0 = this.K0(n0, n2);
        if (!k0.a || (k0.e == null && k0.f == null)) {
            return null;
        }
        if (k0.b) {
            return this.N0(viewGroup, n0, k0.c, n2, k0.d);
        }
        return this.P0(viewGroup, n0, k0.c, n2, k0.d);
    }
    
    private static class b extends AnimatorListenerAdapter implements h, a
    {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        boolean f;
        
        b(final View a, final int b, final boolean d) {
            this.f = false;
            this.a = a;
            this.b = b;
            this.c = (ViewGroup)a.getParent();
            this.d = d;
            this.g(true);
        }
        
        private void f() {
            if (!this.f) {
                androidx.transition.y0.i(this.a, this.b);
                final ViewGroup c = this.c;
                if (c != null) {
                    c.invalidate();
                }
            }
            this.g(false);
        }
        
        private void g(final boolean e) {
            if (this.d && this.e != e) {
                final ViewGroup c = this.c;
                if (c != null) {
                    androidx.transition.t0.d(c, this.e = e);
                }
            }
        }
        
        public void a(@j0 final g0 g0) {
        }
        
        public void b(@j0 final g0 g0) {
            this.g(false);
        }
        
        public void c(@j0 final g0 g0) {
            this.f();
            g0.p0((h)this);
        }
        
        public void d(@j0 final g0 g0) {
        }
        
        public void e(@j0 final g0 g0) {
            this.g(true);
        }
        
        public void onAnimationCancel(final Animator animator) {
            this.f = true;
        }
        
        public void onAnimationEnd(final Animator animator) {
            this.f();
        }
        
        public void onAnimationPause(final Animator animator) {
            if (!this.f) {
                androidx.transition.y0.i(this.a, this.b);
            }
        }
        
        public void onAnimationRepeat(final Animator animator) {
        }
        
        public void onAnimationResume(final Animator animator) {
            if (!this.f) {
                androidx.transition.y0.i(this.a, 0);
            }
        }
        
        public void onAnimationStart(final Animator animator) {
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @SuppressLint({ "UniqueConstants" })
    @androidx.annotation.t0({ androidx.annotation.t0.a.I })
    public @interface c {
    }
    
    private static class d
    {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;
        
        d() {
        }
    }
}
