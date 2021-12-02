// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

public class d
{
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = -1;
    public static final int k = 0;
    public static final int l = 0;
    public static final int m = -2;
    public static final int n = 1;
    public static final int o = 0;
    ConstraintLayout.b a;
    View b;
    
    public d(final View b) {
        final ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.a = (ConstraintLayout.b)layoutParams;
            this.b = b;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }
    
    private String K(final int n) {
        switch (n) {
            default: {
                return "undefined";
            }
            case 7: {
                return "end";
            }
            case 6: {
                return "start";
            }
            case 5: {
                return "baseline";
            }
            case 4: {
                return "bottom";
            }
            case 3: {
                return "top";
            }
            case 2: {
                return "right";
            }
            case 1: {
                return "left";
            }
        }
    }
    
    public d A(final float k) {
        this.a.K = k;
        return this;
    }
    
    public d B(final int n, final int n2) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
            case 7: {
                this.a.setMarginEnd(n2);
                break;
            }
            case 6: {
                this.a.setMarginStart(n2);
                break;
            }
            case 5: {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            case 4: {
                this.a.bottomMargin = n2;
                break;
            }
            case 3: {
                this.a.topMargin = n2;
                break;
            }
            case 2: {
                this.a.rightMargin = n2;
                break;
            }
            case 1: {
                this.a.leftMargin = n2;
                break;
            }
        }
        return this;
    }
    
    public d C(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
            case 7: {
                final ConstraintLayout.b a = this.a;
                a.t = -1;
                a.setMarginEnd(a.u = -1);
                this.a.A = Integer.MIN_VALUE;
                break;
            }
            case 6: {
                final ConstraintLayout.b a2 = this.a;
                a2.r = -1;
                a2.setMarginStart(a2.s = -1);
                this.a.z = Integer.MIN_VALUE;
                break;
            }
            case 5: {
                this.a.l = -1;
                break;
            }
            case 4: {
                final ConstraintLayout.b a3 = this.a;
                a3.j = -1;
                a3.k = -1;
                a3.bottomMargin = -1;
                a3.y = Integer.MIN_VALUE;
                break;
            }
            case 3: {
                final ConstraintLayout.b a4 = this.a;
                a4.i = -1;
                a4.h = -1;
                a4.topMargin = -1;
                a4.w = Integer.MIN_VALUE;
                break;
            }
            case 2: {
                final ConstraintLayout.b a5 = this.a;
                a5.g = -1;
                a5.f = -1;
                a5.rightMargin = -1;
                a5.x = Integer.MIN_VALUE;
                break;
            }
            case 1: {
                final ConstraintLayout.b a6 = this.a;
                a6.e = -1;
                a6.d = -1;
                a6.leftMargin = -1;
                a6.v = Integer.MIN_VALUE;
                break;
            }
        }
        return this;
    }
    
    public d D() {
        final ConstraintLayout.b a = this.a;
        final int e = a.e;
        final int f = a.f;
        if (e == -1 && f == -1) {
            final int r = a.r;
            final int t = a.t;
            if (r != -1 || t != -1) {
                final d d = new d(((ViewGroup)this.b.getParent()).findViewById(r));
                final d d2 = new d(((ViewGroup)this.b.getParent()).findViewById(t));
                final ConstraintLayout.b a2 = this.a;
                if (r != -1 && t != -1) {
                    d.m(7, t, 6, 0);
                    d2.m(6, e, 7, 0);
                }
                else if (e != -1 || t != -1) {
                    final int g = a2.g;
                    if (g != -1) {
                        d.m(7, g, 7, 0);
                    }
                    else {
                        final int d3 = a2.d;
                        if (d3 != -1) {
                            d2.m(6, d3, 6, 0);
                        }
                    }
                }
            }
            this.C(6);
            this.C(7);
        }
        else {
            final d d4 = new d(((ViewGroup)this.b.getParent()).findViewById(e));
            final d d5 = new d(((ViewGroup)this.b.getParent()).findViewById(f));
            final ConstraintLayout.b a3 = this.a;
            if (e != -1 && f != -1) {
                d4.m(2, f, 1, 0);
                d5.m(1, e, 2, 0);
            }
            else if (e != -1 || f != -1) {
                final int g2 = a3.g;
                if (g2 != -1) {
                    d4.m(2, g2, 2, 0);
                }
                else {
                    final int d6 = a3.d;
                    if (d6 != -1) {
                        d5.m(1, d6, 1, 0);
                    }
                }
            }
            this.C(1);
            this.C(2);
        }
        return this;
    }
    
    public d E() {
        final ConstraintLayout.b a = this.a;
        final int i = a.i;
        final int j = a.j;
        if (i != -1 || j != -1) {
            final d d = new d(((ViewGroup)this.b.getParent()).findViewById(i));
            final d d2 = new d(((ViewGroup)this.b.getParent()).findViewById(j));
            final ConstraintLayout.b a2 = this.a;
            if (i != -1 && j != -1) {
                d.m(4, j, 3, 0);
                d2.m(3, i, 4, 0);
            }
            else if (i != -1 || j != -1) {
                final int k = a2.k;
                if (k != -1) {
                    d.m(4, k, 4, 0);
                }
                else {
                    final int h = a2.h;
                    if (h != -1) {
                        d2.m(3, h, 3, 0);
                    }
                }
            }
        }
        this.C(3);
        this.C(4);
        return this;
    }
    
    public d F(final float rotation) {
        this.b.setRotation(rotation);
        return this;
    }
    
    public d G(final float rotationX) {
        this.b.setRotationX(rotationX);
        return this;
    }
    
    public d H(final float rotationY) {
        this.b.setRotationY(rotationY);
        return this;
    }
    
    public d I(final float scaleY) {
        this.b.setScaleY(scaleY);
        return this;
    }
    
    public d J(final float n) {
        return this;
    }
    
    public d L(final float pivotX, final float pivotY) {
        this.b.setPivotX(pivotX);
        this.b.setPivotY(pivotY);
        return this;
    }
    
    public d M(final float pivotX) {
        this.b.setPivotX(pivotX);
        return this;
    }
    
    public d N(final float pivotY) {
        this.b.setPivotY(pivotY);
        return this;
    }
    
    public d O(final float translationX, final float translationY) {
        this.b.setTranslationX(translationX);
        this.b.setTranslationY(translationY);
        return this;
    }
    
    public d P(final float translationX) {
        this.b.setTranslationX(translationX);
        return this;
    }
    
    public d Q(final float translationY) {
        this.b.setTranslationY(translationY);
        return this;
    }
    
    public d R(final float translationZ) {
        if (Build$VERSION.SDK_INT >= 21) {
            this.b.setTranslationZ(translationZ);
        }
        return this;
    }
    
    public d S(final float g) {
        this.a.G = g;
        return this;
    }
    
    public d T(final int n) {
        this.a.N = n;
        return this;
    }
    
    public d U(final float l) {
        this.a.L = l;
        return this;
    }
    
    public d V(final int visibility) {
        this.b.setVisibility(visibility);
        return this;
    }
    
    public d a(final int n, final int n2) {
        int n3;
        if (n == 0) {
            n3 = 1;
        }
        else {
            n3 = 2;
        }
        this.m(1, n, n3, 0);
        int n4;
        if (n2 == 0) {
            n4 = 2;
        }
        else {
            n4 = 1;
        }
        this.m(2, n2, n4, 0);
        if (n != 0) {
            new d(((ViewGroup)this.b.getParent()).findViewById(n)).m(2, this.b.getId(), 1, 0);
        }
        if (n2 != 0) {
            new d(((ViewGroup)this.b.getParent()).findViewById(n2)).m(1, this.b.getId(), 2, 0);
        }
        return this;
    }
    
    public d b(final int n, final int n2) {
        int n3;
        if (n == 0) {
            n3 = 6;
        }
        else {
            n3 = 7;
        }
        this.m(6, n, n3, 0);
        int n4;
        if (n2 == 0) {
            n4 = 7;
        }
        else {
            n4 = 6;
        }
        this.m(7, n2, n4, 0);
        if (n != 0) {
            new d(((ViewGroup)this.b.getParent()).findViewById(n)).m(7, this.b.getId(), 6, 0);
        }
        if (n2 != 0) {
            new d(((ViewGroup)this.b.getParent()).findViewById(n2)).m(6, this.b.getId(), 7, 0);
        }
        return this;
    }
    
    public d c(final int n, final int n2) {
        int n3;
        if (n == 0) {
            n3 = 3;
        }
        else {
            n3 = 4;
        }
        this.m(3, n, n3, 0);
        int n4;
        if (n2 == 0) {
            n4 = 4;
        }
        else {
            n4 = 3;
        }
        this.m(4, n2, n4, 0);
        if (n != 0) {
            new d(((ViewGroup)this.b.getParent()).findViewById(n)).m(4, this.b.getId(), 3, 0);
        }
        if (n2 != 0) {
            new d(((ViewGroup)this.b.getParent()).findViewById(n2)).m(3, this.b.getId(), 4, 0);
        }
        return this;
    }
    
    public d d(final float alpha) {
        this.b.setAlpha(alpha);
        return this;
    }
    
    public void e() {
    }
    
    public d f(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7) {
        if (n3 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (n6 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (n7 > 0.0f && n7 <= 1.0f) {
            final int n8 = 2;
            final int n9 = 1;
            int n10 = n8;
            int n11 = n9;
            if (n2 != 1) {
                if (n2 == 2) {
                    n10 = n8;
                    n11 = n9;
                }
                else {
                    final int n12 = 7;
                    final int n13 = 6;
                    n10 = n12;
                    n11 = n13;
                    if (n2 != 6) {
                        if (n2 != 7) {
                            this.m(3, n, n2, n3);
                            this.m(4, n4, n5, n6);
                            this.a.G = n7;
                            return this;
                        }
                        n10 = n12;
                        n11 = n13;
                    }
                }
            }
            this.m(n11, n, n2, n3);
            this.m(n10, n4, n5, n6);
            this.a.F = n7;
            return this;
        }
        throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
    }
    
    public d g(int n) {
        int n2;
        int n3;
        int n4;
        if (n == 0) {
            n2 = 0;
            n3 = 1;
            n = 0;
            n4 = 2;
        }
        else {
            n3 = 2;
            n4 = 1;
            n2 = n;
        }
        this.f(n2, n3, 0, n, n4, 0, 0.5f);
        return this;
    }
    
    public d h(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float f) {
        this.m(1, n, n2, n3);
        this.m(2, n4, n5, n6);
        this.a.F = f;
        return this;
    }
    
    public d i(int n) {
        int n2;
        int n3;
        int n4;
        if (n == 0) {
            n2 = 0;
            n3 = 6;
            n4 = 0;
            n = 7;
        }
        else {
            n3 = 7;
            final int n5 = 6;
            n2 = n;
            n4 = n;
            n = n5;
        }
        this.f(n2, n3, 0, n4, n, 0, 0.5f);
        return this;
    }
    
    public d j(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float f) {
        this.m(6, n, n2, n3);
        this.m(7, n4, n5, n6);
        this.a.F = f;
        return this;
    }
    
    public d k(int n) {
        int n2;
        int n3;
        int n4;
        if (n == 0) {
            n2 = 0;
            n = 3;
            n3 = 0;
            n4 = 4;
        }
        else {
            final int n5 = 4;
            n4 = 3;
            n2 = n;
            n3 = n;
            n = n5;
        }
        this.f(n2, n, 0, n3, n4, 0, 0.5f);
        return this;
    }
    
    public d l(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float g) {
        this.m(3, n, n2, n3);
        this.m(4, n4, n5, n6);
        this.a.G = g;
        return this;
    }
    
    public d m(final int n, final int e, final int n2, final int leftMargin) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.K(n));
                sb.append(" to ");
                sb.append(this.K(n2));
                sb.append(" unknown");
                throw new IllegalArgumentException(sb.toString());
            }
            case 7: {
                if (n2 == 7) {
                    final ConstraintLayout.b a = this.a;
                    a.u = e;
                    a.t = -1;
                }
                else {
                    if (n2 != 6) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("right to ");
                        sb2.append(this.K(n2));
                        sb2.append(" undefined");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    final ConstraintLayout.b a2 = this.a;
                    a2.t = e;
                    a2.u = -1;
                }
                if (Build$VERSION.SDK_INT >= 17) {
                    this.a.setMarginEnd(leftMargin);
                    break;
                }
                break;
            }
            case 6: {
                if (n2 == 6) {
                    final ConstraintLayout.b a3 = this.a;
                    a3.s = e;
                    a3.r = -1;
                }
                else {
                    if (n2 != 7) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("right to ");
                        sb3.append(this.K(n2));
                        sb3.append(" undefined");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    final ConstraintLayout.b a4 = this.a;
                    a4.r = e;
                    a4.s = -1;
                }
                if (Build$VERSION.SDK_INT >= 17) {
                    this.a.setMarginStart(leftMargin);
                    break;
                }
                break;
            }
            case 5: {
                if (n2 == 5) {
                    final ConstraintLayout.b a5 = this.a;
                    a5.l = e;
                    a5.k = -1;
                    a5.j = -1;
                    a5.h = -1;
                    a5.i = -1;
                }
                ConstraintLayout.b b;
                if (n2 == 3) {
                    b = this.a;
                    b.m = e;
                }
                else {
                    if (n2 != 4) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("right to ");
                        sb4.append(this.K(n2));
                        sb4.append(" undefined");
                        throw new IllegalArgumentException(sb4.toString());
                    }
                    b = this.a;
                    b.n = e;
                }
                b.k = -1;
                b.j = -1;
                b.h = -1;
                b.i = -1;
                this.a.C = leftMargin;
                break;
            }
            case 4: {
                ConstraintLayout.b b2;
                if (n2 == 4) {
                    b2 = this.a;
                    b2.k = e;
                    b2.j = -1;
                }
                else {
                    if (n2 != 3) {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("right to ");
                        sb5.append(this.K(n2));
                        sb5.append(" undefined");
                        throw new IllegalArgumentException(sb5.toString());
                    }
                    b2 = this.a;
                    b2.j = e;
                    b2.k = -1;
                }
                b2.l = -1;
                b2.m = -1;
                b2.n = -1;
                this.a.bottomMargin = leftMargin;
                break;
            }
            case 3: {
                ConstraintLayout.b b3;
                if (n2 == 3) {
                    b3 = this.a;
                    b3.h = e;
                    b3.i = -1;
                }
                else {
                    if (n2 != 4) {
                        final StringBuilder sb6 = new StringBuilder();
                        sb6.append("right to ");
                        sb6.append(this.K(n2));
                        sb6.append(" undefined");
                        throw new IllegalArgumentException(sb6.toString());
                    }
                    b3 = this.a;
                    b3.i = e;
                    b3.h = -1;
                }
                b3.l = -1;
                b3.m = -1;
                b3.n = -1;
                this.a.topMargin = leftMargin;
                break;
            }
            case 2: {
                if (n2 == 1) {
                    final ConstraintLayout.b a6 = this.a;
                    a6.f = e;
                    a6.g = -1;
                }
                else {
                    if (n2 != 2) {
                        final StringBuilder sb7 = new StringBuilder();
                        sb7.append("right to ");
                        sb7.append(this.K(n2));
                        sb7.append(" undefined");
                        throw new IllegalArgumentException(sb7.toString());
                    }
                    final ConstraintLayout.b a7 = this.a;
                    a7.g = e;
                    a7.f = -1;
                }
                this.a.rightMargin = leftMargin;
                break;
            }
            case 1: {
                if (n2 == 1) {
                    final ConstraintLayout.b a8 = this.a;
                    a8.d = e;
                    a8.e = -1;
                }
                else {
                    if (n2 != 2) {
                        final StringBuilder sb8 = new StringBuilder();
                        sb8.append("Left to ");
                        sb8.append(this.K(n2));
                        sb8.append(" undefined");
                        throw new IllegalArgumentException(sb8.toString());
                    }
                    final ConstraintLayout.b a9 = this.a;
                    a9.e = e;
                    a9.d = -1;
                }
                this.a.leftMargin = leftMargin;
                break;
            }
        }
        return this;
    }
    
    public d n(final int p) {
        this.a.P = p;
        return this;
    }
    
    public d o(final int o) {
        this.a.O = o;
        return this;
    }
    
    public d p(final int height) {
        this.a.height = height;
        return this;
    }
    
    public d q(final int t) {
        this.a.T = t;
        return this;
    }
    
    public d r(final int s) {
        this.a.S = s;
        return this;
    }
    
    public d s(final int r) {
        this.a.R = r;
        return this;
    }
    
    public d t(final int q) {
        this.a.Q = q;
        return this;
    }
    
    public d u(final int width) {
        this.a.width = width;
        return this;
    }
    
    public d v(final String h) {
        this.a.H = h;
        return this;
    }
    
    public d w(final float elevation) {
        if (Build$VERSION.SDK_INT >= 21) {
            this.b.setElevation(elevation);
        }
        return this;
    }
    
    public d x(final int n, final int n2) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
            case 7: {
                this.a.A = n2;
                break;
            }
            case 6: {
                this.a.z = n2;
                break;
            }
            case 5: {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            case 4: {
                this.a.y = n2;
                break;
            }
            case 3: {
                this.a.w = n2;
                break;
            }
            case 2: {
                this.a.x = n2;
                break;
            }
            case 1: {
                this.a.v = n2;
                break;
            }
        }
        return this;
    }
    
    public d y(final float f) {
        this.a.F = f;
        return this;
    }
    
    public d z(final int m) {
        this.a.M = m;
        return this;
    }
}
