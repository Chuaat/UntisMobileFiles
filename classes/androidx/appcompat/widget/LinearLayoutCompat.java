// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.core.view.i;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Canvas;
import androidx.annotation.t0;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.View;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class LinearLayoutCompat extends ViewGroup
{
    public static final int V = 0;
    public static final int W = 1;
    public static final int a0 = 0;
    public static final int b0 = 1;
    public static final int c0 = 2;
    public static final int d0 = 4;
    private static final int e0 = 4;
    private static final int f0 = 0;
    private static final int g0 = 1;
    private static final int h0 = 2;
    private static final int i0 = 3;
    private static final String j0 = "androidx.appcompat.widget.LinearLayoutCompat";
    private boolean G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private float M;
    private boolean N;
    private int[] O;
    private int[] P;
    private Drawable Q;
    private int R;
    private int S;
    private int T;
    private int U;
    
    public LinearLayoutCompat(@j0 final Context context) {
        this(context, null);
    }
    
    public LinearLayoutCompat(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public LinearLayoutCompat(@j0 final Context context, @k0 final AttributeSet set, int n) {
        super(context, set, n);
        this.G = true;
        this.H = -1;
        this.I = 0;
        this.K = 8388659;
        final int[] n2 = c.a.n.N4;
        final u0 g = u0.G(context, set, n2, n, 0);
        androidx.core.view.j0.x1((View)this, context, n2, set, g.B(), n, 0);
        n = g.o(c.a.n.P4, -1);
        if (n >= 0) {
            this.setOrientation(n);
        }
        n = g.o(c.a.n.O4, -1);
        if (n >= 0) {
            this.setGravity(n);
        }
        final boolean a = g.a(c.a.n.Q4, true);
        if (!a) {
            this.setBaselineAligned(a);
        }
        this.M = g.j(c.a.n.S4, -1.0f);
        this.H = g.o(c.a.n.R4, -1);
        this.N = g.a(c.a.n.V4, false);
        this.setDividerDrawable(g.h(c.a.n.T4));
        this.T = g.o(c.a.n.W4, 0);
        this.U = g.g(c.a.n.U4, 0);
        g.I();
    }
    
    private void E(final View view, final int n, final int n2, final int n3, final int n4) {
        view.layout(n, n2, n3 + n, n4 + n2);
    }
    
    private void m(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);
        for (int i = 0; i < n; ++i) {
            final View u = this.u(i);
            if (u.getVisibility() != 8) {
                final b b = (b)u.getLayoutParams();
                if (b.height == -1) {
                    final int width = b.width;
                    b.width = u.getMeasuredWidth();
                    this.measureChildWithMargins(u, n2, 0, measureSpec, 0);
                    b.width = width;
                }
            }
        }
    }
    
    private void n(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
        for (int i = 0; i < n; ++i) {
            final View u = this.u(i);
            if (u.getVisibility() != 8) {
                final b b = (b)u.getLayoutParams();
                if (b.width == -1) {
                    final int height = b.height;
                    b.height = u.getMeasuredHeight();
                    this.measureChildWithMargins(u, measureSpec, 0, n2, 0);
                    b.height = height;
                }
            }
        }
    }
    
    void A(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.measureChildWithMargins(view, n2, n3, n4, n5);
    }
    
    void B(final int n, final int n2) {
        this.L = 0;
        final int virtualChildCount = this.getVirtualChildCount();
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        if (this.O == null || this.P == null) {
            this.O = new int[4];
            this.P = new int[4];
        }
        final int[] o = this.O;
        final int[] p2 = this.P;
        o[2] = (o[3] = -1);
        o[0] = (o[1] = -1);
        p2[2] = (p2[3] = -1);
        p2[0] = (p2[1] = -1);
        final boolean g = this.G;
        final boolean n3 = this.N;
        final boolean b = mode == 1073741824;
        float n4 = 0.0f;
        int i = 0;
        int b2 = 0;
        int max = 0;
        int max2 = 0;
        int n5 = 0;
        boolean b3 = false;
        int n6 = 0;
        int n7 = 1;
        boolean b4 = false;
        while (i < virtualChildCount) {
            final View u = this.u(i);
            if (u == null) {
                this.L += this.C(i);
            }
            else if (u.getVisibility() == 8) {
                i += this.r(u, i);
            }
            else {
                if (this.v(i)) {
                    this.L += this.R;
                }
                final b b5 = (b)u.getLayoutParams();
                final float weight = b5.weight;
                n4 += weight;
                Label_0570: {
                    int max4;
                    if (mode == 1073741824 && b5.width == 0 && weight > 0.0f) {
                        final int l = this.L;
                        int max3;
                        if (b) {
                            max3 = l + (b5.leftMargin + b5.rightMargin);
                        }
                        else {
                            max3 = Math.max(l, b5.leftMargin + l + b5.rightMargin);
                        }
                        this.L = max3;
                        if (!g) {
                            b3 = true;
                            break Label_0570;
                        }
                        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                        u.measure(measureSpec, measureSpec);
                        max4 = b2;
                    }
                    else {
                        int width;
                        if (b5.width == 0 && weight > 0.0f) {
                            b5.width = -2;
                            width = 0;
                        }
                        else {
                            width = Integer.MIN_VALUE;
                        }
                        int j;
                        if (n4 == 0.0f) {
                            j = this.L;
                        }
                        else {
                            j = 0;
                        }
                        this.A(u, i, n, j, n2, 0);
                        if (width != Integer.MIN_VALUE) {
                            b5.width = width;
                        }
                        final int measuredWidth = u.getMeasuredWidth();
                        int max5;
                        if (b) {
                            max5 = this.L + (b5.leftMargin + measuredWidth + b5.rightMargin + this.t(u));
                        }
                        else {
                            final int k = this.L;
                            max5 = Math.max(k, k + measuredWidth + b5.leftMargin + b5.rightMargin + this.t(u));
                        }
                        this.L = max5;
                        max4 = b2;
                        if (n3) {
                            max4 = Math.max(measuredWidth, b2);
                        }
                    }
                    b2 = max4;
                }
                final int n8 = i;
                boolean b6;
                if (mode2 != 1073741824 && b5.height == -1) {
                    b6 = true;
                    b4 = true;
                }
                else {
                    b6 = false;
                }
                int n9 = b5.topMargin + b5.bottomMargin;
                final int b7 = u.getMeasuredHeight() + n9;
                final int combineMeasuredStates = View.combineMeasuredStates(n6, u.getMeasuredState());
                if (g) {
                    final int baseline = u.getBaseline();
                    if (baseline != -1) {
                        int n10;
                        if ((n10 = b5.gravity) < 0) {
                            n10 = this.K;
                        }
                        final int n11 = ((n10 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                        o[n11] = Math.max(o[n11], baseline);
                        p2[n11] = Math.max(p2[n11], b7 - baseline);
                    }
                }
                max = Math.max(max, b7);
                if (n7 != 0 && b5.height == -1) {
                    n7 = 1;
                }
                else {
                    n7 = 0;
                }
                int max6;
                if (b5.weight > 0.0f) {
                    if (!b6) {
                        n9 = b7;
                    }
                    max6 = Math.max(n5, n9);
                }
                else {
                    if (!b6) {
                        n9 = b7;
                    }
                    max2 = Math.max(max2, n9);
                    max6 = n5;
                }
                final int n12 = this.r(u, n8) + n8;
                n6 = combineMeasuredStates;
                n5 = max6;
                i = n12;
            }
            ++i;
        }
        if (this.L > 0 && this.v(virtualChildCount)) {
            this.L += this.R;
        }
        int max7;
        if (o[1] == -1 && o[0] == -1 && o[2] == -1 && o[3] == -1) {
            max7 = max;
        }
        else {
            max7 = Math.max(max, Math.max(o[3], Math.max(o[0], Math.max(o[1], o[2]))) + Math.max(p2[3], Math.max(p2[0], Math.max(p2[1], p2[2]))));
        }
        int n13 = n6;
        int n14 = max7;
        Label_1170: {
            if (n3) {
                if (mode != Integer.MIN_VALUE) {
                    n14 = max7;
                    if (mode != 0) {
                        break Label_1170;
                    }
                }
                this.L = 0;
                int n15 = 0;
                while (true) {
                    n14 = max7;
                    if (n15 >= virtualChildCount) {
                        break;
                    }
                    final View u2 = this.u(n15);
                    if (u2 == null) {
                        this.L += this.C(n15);
                    }
                    else if (u2.getVisibility() == 8) {
                        n15 += this.r(u2, n15);
                    }
                    else {
                        final b b8 = (b)u2.getLayoutParams();
                        final int m = this.L;
                        if (b) {
                            this.L = m + (b8.leftMargin + b2 + b8.rightMargin + this.t(u2));
                        }
                        else {
                            this.L = Math.max(m, m + b2 + b8.leftMargin + b8.rightMargin + this.t(u2));
                        }
                    }
                    ++n15;
                }
            }
        }
        final int n16 = this.L + (this.getPaddingLeft() + this.getPaddingRight());
        this.L = n16;
        final int resolveSizeAndState = View.resolveSizeAndState(Math.max(n16, this.getSuggestedMinimumWidth()), n, 0);
        final int n17 = (0xFFFFFF & resolveSizeAndState) - this.L;
        int n19;
        int n20;
        int n21;
        if (!b3 && (n17 == 0 || n4 <= 0.0f)) {
            final int max8 = Math.max(max2, n5);
            if (n3 && mode != 1073741824) {
                for (int n18 = 0; n18 < virtualChildCount; ++n18) {
                    final View u3 = this.u(n18);
                    if (u3 != null) {
                        if (u3.getVisibility() != 8) {
                            if (((b)u3.getLayoutParams()).weight > 0.0f) {
                                u3.measure(View$MeasureSpec.makeMeasureSpec(b2, 1073741824), View$MeasureSpec.makeMeasureSpec(u3.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                }
            }
            n19 = virtualChildCount;
            n20 = n14;
            n21 = max8;
        }
        else {
            final float m2 = this.M;
            if (m2 > 0.0f) {
                n4 = m2;
            }
            o[2] = (o[3] = -1);
            o[0] = (o[1] = -1);
            p2[2] = (p2[3] = -1);
            p2[0] = (p2[1] = -1);
            this.L = 0;
            final int n22 = n13;
            int max9 = -1;
            int n23 = 0;
            int n24 = n7;
            n19 = virtualChildCount;
            int combineMeasuredStates2 = n22;
            int max10 = max2;
            int n25 = n17;
            while (n23 < n19) {
                final View u4 = this.u(n23);
                if (u4 != null) {
                    if (u4.getVisibility() != 8) {
                        final b b9 = (b)u4.getLayoutParams();
                        final float weight2 = b9.weight;
                        if (weight2 > 0.0f) {
                            final int n26 = (int)(n25 * weight2 / n4);
                            final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n2, this.getPaddingTop() + this.getPaddingBottom() + b9.topMargin + b9.bottomMargin, b9.height);
                            int n27 = 0;
                            Label_1596: {
                                if (b9.width == 0 && mode == 1073741824) {
                                    if (n26 > 0) {
                                        n27 = n26;
                                        break Label_1596;
                                    }
                                }
                                else if ((n27 = u4.getMeasuredWidth() + n26) >= 0) {
                                    break Label_1596;
                                }
                                n27 = 0;
                            }
                            u4.measure(View$MeasureSpec.makeMeasureSpec(n27, 1073741824), childMeasureSpec);
                            combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates2, u4.getMeasuredState() & 0xFF000000);
                            n4 -= weight2;
                            n25 -= n26;
                        }
                        final int l2 = this.L;
                        if (b) {
                            this.L = l2 + (u4.getMeasuredWidth() + b9.leftMargin + b9.rightMargin + this.t(u4));
                        }
                        else {
                            this.L = Math.max(l2, u4.getMeasuredWidth() + l2 + b9.leftMargin + b9.rightMargin + this.t(u4));
                        }
                        final boolean b10 = mode2 != 1073741824 && b9.height == -1;
                        final int n28 = b9.topMargin + b9.bottomMargin;
                        final int b11 = u4.getMeasuredHeight() + n28;
                        max9 = Math.max(max9, b11);
                        int b12;
                        if (b10) {
                            b12 = n28;
                        }
                        else {
                            b12 = b11;
                        }
                        max10 = Math.max(max10, b12);
                        final boolean b13 = n24 != 0 && b9.height == -1;
                        if (g) {
                            final int baseline2 = u4.getBaseline();
                            if (baseline2 != -1) {
                                int n29;
                                if ((n29 = b9.gravity) < 0) {
                                    n29 = this.K;
                                }
                                final int n30 = ((n29 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                                o[n30] = Math.max(o[n30], baseline2);
                                p2[n30] = Math.max(p2[n30], b11 - baseline2);
                            }
                        }
                        n24 = (b13 ? 1 : 0);
                    }
                }
                ++n23;
            }
            this.L += this.getPaddingLeft() + this.getPaddingRight();
            int max11;
            if (o[1] == -1 && o[0] == -1 && o[2] == -1 && o[3] == -1) {
                max11 = max9;
            }
            else {
                max11 = Math.max(max9, Math.max(o[3], Math.max(o[0], Math.max(o[1], o[2]))) + Math.max(p2[3], Math.max(p2[0], Math.max(p2[1], p2[2]))));
            }
            n20 = max11;
            n21 = max10;
            n13 = combineMeasuredStates2;
            n7 = n24;
        }
        if (n7 != 0 || mode2 == 1073741824) {
            n21 = n20;
        }
        this.setMeasuredDimension(resolveSizeAndState | (n13 & 0xFF000000), View.resolveSizeAndState(Math.max(n21 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, n13 << 16));
        if (b4) {
            this.m(n19, n);
        }
    }
    
    int C(final int n) {
        return 0;
    }
    
    void D(final int n, final int n2) {
        this.L = 0;
        final int virtualChildCount = this.getVirtualChildCount();
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int h = this.H;
        final boolean n3 = this.N;
        float n4 = 0.0f;
        int combineMeasuredStates = 0;
        int n5 = 0;
        int max = 0;
        int max2 = 0;
        int max3 = 0;
        int i = 0;
        boolean b = false;
        int n6 = 1;
        boolean b2 = false;
        while (i < virtualChildCount) {
            final View u = this.u(i);
            if (u == null) {
                this.L += this.C(i);
            }
            else if (u.getVisibility() == 8) {
                i += this.r(u, i);
            }
            else {
                if (this.v(i)) {
                    this.L += this.S;
                }
                final b b3 = (b)u.getLayoutParams();
                final float weight = b3.weight;
                n4 += weight;
                if (mode2 == 1073741824 && b3.height == 0 && weight > 0.0f) {
                    final int l = this.L;
                    this.L = Math.max(l, b3.topMargin + l + b3.bottomMargin);
                    b = true;
                }
                else {
                    int height;
                    if (b3.height == 0 && weight > 0.0f) {
                        b3.height = -2;
                        height = 0;
                    }
                    else {
                        height = Integer.MIN_VALUE;
                    }
                    int j;
                    if (n4 == 0.0f) {
                        j = this.L;
                    }
                    else {
                        j = 0;
                    }
                    this.A(u, i, n, 0, n2, j);
                    if (height != Integer.MIN_VALUE) {
                        b3.height = height;
                    }
                    final int measuredHeight = u.getMeasuredHeight();
                    final int k = this.L;
                    this.L = Math.max(k, k + measuredHeight + b3.topMargin + b3.bottomMargin + this.t(u));
                    if (n3) {
                        max = Math.max(measuredHeight, max);
                    }
                }
                final int n7 = i;
                if (h >= 0 && h == n7 + 1) {
                    this.I = this.L;
                }
                if (n7 < h && b3.weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                boolean b4;
                if (mode != 1073741824 && b3.width == -1) {
                    b4 = true;
                    b2 = true;
                }
                else {
                    b4 = false;
                }
                final int n8 = b3.leftMargin + b3.rightMargin;
                int b5 = u.getMeasuredWidth() + n8;
                n5 = Math.max(n5, b5);
                final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, u.getMeasuredState());
                int n9;
                if (n6 != 0 && b3.width == -1) {
                    n9 = 1;
                }
                else {
                    n9 = 0;
                }
                int max4;
                if (b3.weight > 0.0f) {
                    if (b4) {
                        b5 = n8;
                    }
                    max2 = Math.max(max2, b5);
                    max4 = max3;
                }
                else {
                    if (b4) {
                        b5 = n8;
                    }
                    max4 = Math.max(max3, b5);
                }
                final int r = this.r(u, n7);
                max3 = max4;
                final int n10 = combineMeasuredStates2;
                i = r + n7;
                n6 = n9;
                combineMeasuredStates = n10;
            }
            ++i;
        }
        if (this.L > 0 && this.v(virtualChildCount)) {
            this.L += this.S;
        }
        final int n11 = virtualChildCount;
        if (n3 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.L = 0;
            for (int n12 = 0; n12 < n11; ++n12) {
                final View u2 = this.u(n12);
                int max5;
                if (u2 == null) {
                    max5 = this.L + this.C(n12);
                }
                else {
                    if (u2.getVisibility() == 8) {
                        n12 += this.r(u2, n12);
                        continue;
                    }
                    final b b6 = (b)u2.getLayoutParams();
                    final int m = this.L;
                    max5 = Math.max(m, m + max + b6.topMargin + b6.bottomMargin + this.t(u2));
                }
                this.L = max5;
            }
        }
        final int n13 = this.L + (this.getPaddingTop() + this.getPaddingBottom());
        this.L = n13;
        final int resolveSizeAndState = View.resolveSizeAndState(Math.max(n13, this.getSuggestedMinimumHeight()), n2, 0);
        final int n14 = (0xFFFFFF & resolveSizeAndState) - this.L;
        int n16;
        int n17;
        if (!b && (n14 == 0 || n4 <= 0.0f)) {
            final int max6 = Math.max(max3, max2);
            if (n3 && mode2 != 1073741824) {
                for (int n15 = 0; n15 < n11; ++n15) {
                    final View u3 = this.u(n15);
                    if (u3 != null) {
                        if (u3.getVisibility() != 8) {
                            if (((b)u3.getLayoutParams()).weight > 0.0f) {
                                u3.measure(View$MeasureSpec.makeMeasureSpec(u3.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(max, 1073741824));
                            }
                        }
                    }
                }
            }
            n16 = combineMeasuredStates;
            n17 = max6;
        }
        else {
            final float m2 = this.M;
            if (m2 > 0.0f) {
                n4 = m2;
            }
            this.L = 0;
            int n18 = n14;
            for (int n19 = 0; n19 < n11; ++n19) {
                final View u4 = this.u(n19);
                if (u4.getVisibility() != 8) {
                    final b b7 = (b)u4.getLayoutParams();
                    final float weight2 = b7.weight;
                    if (weight2 > 0.0f) {
                        final int n20 = (int)(n18 * weight2 / n4);
                        final int paddingLeft = this.getPaddingLeft();
                        final int paddingRight = this.getPaddingRight();
                        final int leftMargin = b7.leftMargin;
                        final int rightMargin = b7.rightMargin;
                        final int width = b7.width;
                        final int n21 = n18 - n20;
                        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n, paddingLeft + paddingRight + leftMargin + rightMargin, width);
                        int n22 = 0;
                        Label_1180: {
                            if (b7.height == 0 && mode2 == 1073741824) {
                                if (n20 > 0) {
                                    n22 = n20;
                                    break Label_1180;
                                }
                            }
                            else if ((n22 = u4.getMeasuredHeight() + n20) >= 0) {
                                break Label_1180;
                            }
                            n22 = 0;
                        }
                        u4.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(n22, 1073741824));
                        combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, u4.getMeasuredState() & 0xFFFFFF00);
                        n4 -= weight2;
                        n18 = n21;
                    }
                    final int n23 = b7.leftMargin + b7.rightMargin;
                    final int b8 = u4.getMeasuredWidth() + n23;
                    n5 = Math.max(n5, b8);
                    int b9;
                    if (mode != 1073741824 && b7.width == -1) {
                        b9 = n23;
                    }
                    else {
                        b9 = b8;
                    }
                    max3 = Math.max(max3, b9);
                    if (n6 != 0 && b7.width == -1) {
                        n6 = 1;
                    }
                    else {
                        n6 = 0;
                    }
                    final int l2 = this.L;
                    this.L = Math.max(l2, u4.getMeasuredHeight() + l2 + b7.topMargin + b7.bottomMargin + this.t(u4));
                }
            }
            this.L += this.getPaddingTop() + this.getPaddingBottom();
            n16 = combineMeasuredStates;
            n17 = max3;
        }
        if (n6 != 0 || mode == 1073741824) {
            n17 = n5;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(n17 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, n16), resolveSizeAndState);
        if (b2) {
            this.n(n11, n2);
        }
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof b;
    }
    
    public int getBaseline() {
        if (this.H < 0) {
            return super.getBaseline();
        }
        final int childCount = this.getChildCount();
        final int h = this.H;
        if (childCount <= h) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        final View child = this.getChildAt(h);
        final int baseline = child.getBaseline();
        if (baseline != -1) {
            int i;
            final int n = i = this.I;
            if (this.J == 1) {
                final int n2 = this.K & 0x70;
                i = n;
                if (n2 != 48) {
                    if (n2 != 16) {
                        if (n2 != 80) {
                            i = n;
                        }
                        else {
                            i = this.getBottom() - this.getTop() - this.getPaddingBottom() - this.L;
                        }
                    }
                    else {
                        i = n + (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.L) / 2;
                    }
                }
            }
            return i + ((b)child.getLayoutParams()).topMargin + baseline;
        }
        if (this.H == 0) {
            return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    }
    
    public int getBaselineAlignedChildIndex() {
        return this.H;
    }
    
    public Drawable getDividerDrawable() {
        return this.Q;
    }
    
    public int getDividerPadding() {
        return this.U;
    }
    
    @t0({ t0.a.I })
    public int getDividerWidth() {
        return this.R;
    }
    
    public int getGravity() {
        return this.K;
    }
    
    public int getOrientation() {
        return this.J;
    }
    
    public int getShowDividers() {
        return this.T;
    }
    
    int getVirtualChildCount() {
        return this.getChildCount();
    }
    
    public float getWeightSum() {
        return this.M;
    }
    
    void i(final Canvas canvas) {
        final int virtualChildCount = this.getVirtualChildCount();
        final boolean b = a1.b((View)this);
        for (int i = 0; i < virtualChildCount; ++i) {
            final View u = this.u(i);
            if (u != null && u.getVisibility() != 8 && this.v(i)) {
                final b b2 = (b)u.getLayoutParams();
                int n;
                if (b) {
                    n = u.getRight() + b2.rightMargin;
                }
                else {
                    n = u.getLeft() - b2.leftMargin - this.R;
                }
                this.l(canvas, n);
            }
        }
        if (this.v(virtualChildCount)) {
            final View u2 = this.u(virtualChildCount - 1);
            int paddingLeft = 0;
            Label_0218: {
                int n2;
                int n3;
                if (u2 == null) {
                    if (b) {
                        paddingLeft = this.getPaddingLeft();
                        break Label_0218;
                    }
                    n2 = this.getWidth();
                    n3 = this.getPaddingRight();
                }
                else {
                    final b b3 = (b)u2.getLayoutParams();
                    if (!b) {
                        paddingLeft = u2.getRight() + b3.rightMargin;
                        break Label_0218;
                    }
                    n2 = u2.getLeft();
                    n3 = b3.leftMargin;
                }
                paddingLeft = n2 - n3 - this.R;
            }
            this.l(canvas, paddingLeft);
        }
    }
    
    void j(final Canvas canvas) {
        final int virtualChildCount = this.getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; ++i) {
            final View u = this.u(i);
            if (u != null && u.getVisibility() != 8 && this.v(i)) {
                this.k(canvas, u.getTop() - ((b)u.getLayoutParams()).topMargin - this.S);
            }
        }
        if (this.v(virtualChildCount)) {
            final View u2 = this.u(virtualChildCount - 1);
            int n;
            if (u2 == null) {
                n = this.getHeight() - this.getPaddingBottom() - this.S;
            }
            else {
                n = u2.getBottom() + ((b)u2.getLayoutParams()).bottomMargin;
            }
            this.k(canvas, n);
        }
    }
    
    void k(final Canvas canvas, final int n) {
        this.Q.setBounds(this.getPaddingLeft() + this.U, n, this.getWidth() - this.getPaddingRight() - this.U, this.S + n);
        this.Q.draw(canvas);
    }
    
    void l(final Canvas canvas, final int n) {
        this.Q.setBounds(n, this.getPaddingTop() + this.U, this.R + n, this.getHeight() - this.getPaddingBottom() - this.U);
        this.Q.draw(canvas);
    }
    
    protected b o() {
        final int j = this.J;
        if (j == 0) {
            return new b(-2, -2);
        }
        if (j == 1) {
            return new b(-1, -2);
        }
        return null;
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.Q == null) {
            return;
        }
        if (this.J == 1) {
            this.j(canvas);
        }
        else {
            this.i(canvas);
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.J == 1) {
            this.z(n, n2, n3, n4);
        }
        else {
            this.y(n, n2, n3, n4);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.J == 1) {
            this.D(n, n2);
        }
        else {
            this.B(n, n2);
        }
    }
    
    public b p(final AttributeSet set) {
        return new b(this.getContext(), set);
    }
    
    protected b q(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new b(viewGroup$LayoutParams);
    }
    
    int r(final View view, final int n) {
        return 0;
    }
    
    int s(final View view) {
        return 0;
    }
    
    public void setBaselineAligned(final boolean g) {
        this.G = g;
    }
    
    public void setBaselineAlignedChildIndex(final int h) {
        if (h >= 0 && h < this.getChildCount()) {
            this.H = h;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("base aligned child index out of range (0, ");
        sb.append(this.getChildCount());
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void setDividerDrawable(final Drawable q) {
        if (q == this.Q) {
            return;
        }
        this.Q = q;
        boolean willNotDraw = false;
        if (q != null) {
            this.R = q.getIntrinsicWidth();
            this.S = q.getIntrinsicHeight();
        }
        else {
            this.R = 0;
            this.S = 0;
        }
        if (q == null) {
            willNotDraw = true;
        }
        this.setWillNotDraw(willNotDraw);
        this.requestLayout();
    }
    
    public void setDividerPadding(final int u) {
        this.U = u;
    }
    
    public void setGravity(int k) {
        if (this.K != k) {
            int n = k;
            if ((0x800007 & k) == 0x0) {
                n = (k | 0x800003);
            }
            k = n;
            if ((n & 0x70) == 0x0) {
                k = (n | 0x30);
            }
            this.K = k;
            this.requestLayout();
        }
    }
    
    public void setHorizontalGravity(int n) {
        n &= 0x800007;
        final int k = this.K;
        if ((0x800007 & k) != n) {
            this.K = (n | (0xFF7FFFF8 & k));
            this.requestLayout();
        }
    }
    
    public void setMeasureWithLargestChildEnabled(final boolean n) {
        this.N = n;
    }
    
    public void setOrientation(final int j) {
        if (this.J != j) {
            this.J = j;
            this.requestLayout();
        }
    }
    
    public void setShowDividers(final int t) {
        if (t != this.T) {
            this.requestLayout();
        }
        this.T = t;
    }
    
    public void setVerticalGravity(int n) {
        n &= 0x70;
        final int k = this.K;
        if ((k & 0x70) != n) {
            this.K = (n | (k & 0xFFFFFF8F));
            this.requestLayout();
        }
    }
    
    public void setWeightSum(final float b) {
        this.M = Math.max(0.0f, b);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    int t(final View view) {
        return 0;
    }
    
    View u(final int n) {
        return this.getChildAt(n);
    }
    
    @t0({ t0.a.G })
    protected boolean v(int n) {
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        if (n == 0) {
            if ((this.T & 0x1) != 0x0) {
                b3 = true;
            }
            return b3;
        }
        if (n == this.getChildCount()) {
            boolean b4 = b;
            if ((this.T & 0x4) != 0x0) {
                b4 = true;
            }
            return b4;
        }
        boolean b5 = b2;
        if ((this.T & 0x2) != 0x0) {
            --n;
            while (true) {
                b5 = b2;
                if (n < 0) {
                    break;
                }
                if (this.getChildAt(n).getVisibility() != 8) {
                    b5 = true;
                    break;
                }
                --n;
            }
        }
        return b5;
    }
    
    public boolean w() {
        return this.G;
    }
    
    public boolean x() {
        return this.N;
    }
    
    void y(int n, int n2, int n3, int n4) {
        final boolean b = a1.b((View)this);
        final int paddingTop = this.getPaddingTop();
        final int n5 = n4 - n2;
        final int paddingBottom = this.getPaddingBottom();
        final int paddingBottom2 = this.getPaddingBottom();
        final int virtualChildCount = this.getVirtualChildCount();
        n2 = this.K;
        n4 = (n2 & 0x70);
        final boolean g = this.G;
        final int[] o = this.O;
        final int[] p4 = this.P;
        n2 = i.d(0x800007 & n2, androidx.core.view.j0.X((View)this));
        if (n2 != 1) {
            if (n2 != 5) {
                n2 = this.getPaddingLeft();
            }
            else {
                n2 = this.getPaddingLeft() + n3 - n - this.L;
            }
        }
        else {
            n2 = this.getPaddingLeft() + (n3 - n - this.L) / 2;
        }
        int n6;
        int n7;
        if (b) {
            n6 = virtualChildCount - 1;
            n7 = -1;
        }
        else {
            n6 = 0;
            n7 = 1;
        }
        int i = 0;
        n3 = n4;
        n4 = paddingTop;
        while (i < virtualChildCount) {
            final int n8 = n6 + n7 * i;
            final View u = this.u(n8);
            if (u == null) {
                n2 += this.C(n8);
            }
            else if (u.getVisibility() != 8) {
                final int measuredWidth = u.getMeasuredWidth();
                final int measuredHeight = u.getMeasuredHeight();
                final b b2 = (b)u.getLayoutParams();
                int baseline;
                if (g && b2.height != -1) {
                    baseline = u.getBaseline();
                }
                else {
                    baseline = -1;
                }
                if ((n = b2.gravity) < 0) {
                    n = n3;
                }
                n &= 0x70;
                if (n != 16) {
                    if (n != 48) {
                        if (n != 80) {
                            n = n4;
                        }
                        else {
                            final int n9 = n = n5 - paddingBottom - measuredHeight - b2.bottomMargin;
                            if (baseline != -1) {
                                n = u.getMeasuredHeight();
                                n = n9 - (p4[2] - (n - baseline));
                            }
                        }
                    }
                    else {
                        final int n10 = n = b2.topMargin + n4;
                        if (baseline != -1) {
                            n = n10 + (o[1] - baseline);
                        }
                    }
                }
                else {
                    n = (n5 - paddingTop - paddingBottom2 - measuredHeight) / 2 + n4 + b2.topMargin - b2.bottomMargin;
                }
                int n11 = n2;
                if (this.v(n8)) {
                    n11 = n2 + this.R;
                }
                n2 = b2.leftMargin + n11;
                this.E(u, n2 + this.s(u), n, measuredWidth, measuredHeight);
                n = b2.rightMargin;
                final int t = this.t(u);
                i += this.r(u, n8);
                n2 += measuredWidth + n + t;
            }
            ++i;
        }
    }
    
    void z(int paddingTop, int i, int t, int gravity) {
        final int paddingLeft = this.getPaddingLeft();
        final int n = t - paddingTop;
        final int paddingRight = this.getPaddingRight();
        final int paddingRight2 = this.getPaddingRight();
        final int virtualChildCount = this.getVirtualChildCount();
        final int k = this.K;
        paddingTop = (k & 0x70);
        if (paddingTop != 16) {
            if (paddingTop != 80) {
                paddingTop = this.getPaddingTop();
            }
            else {
                paddingTop = this.getPaddingTop() + gravity - i - this.L;
            }
        }
        else {
            paddingTop = this.getPaddingTop() + (gravity - i - this.L) / 2;
        }
        View u;
        int measuredWidth;
        int measuredHeight;
        b b;
        int bottomMargin;
        for (i = 0; i < virtualChildCount; i = gravity + 1, paddingTop = t) {
            u = this.u(i);
            if (u == null) {
                t = paddingTop + this.C(i);
                gravity = i;
            }
            else {
                t = paddingTop;
                gravity = i;
                if (u.getVisibility() != 8) {
                    measuredWidth = u.getMeasuredWidth();
                    measuredHeight = u.getMeasuredHeight();
                    b = (b)u.getLayoutParams();
                    gravity = b.gravity;
                    if ((t = gravity) < 0) {
                        t = (k & 0x800007);
                    }
                    t = (i.d(t, androidx.core.view.j0.X((View)this)) & 0x7);
                    Label_0268: {
                        if (t != 1) {
                            if (t != 5) {
                                t = b.leftMargin + paddingLeft;
                                break Label_0268;
                            }
                            t = n - paddingRight - measuredWidth;
                        }
                        else {
                            t = (n - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + b.leftMargin;
                        }
                        t -= b.rightMargin;
                    }
                    gravity = paddingTop;
                    if (this.v(i)) {
                        gravity = paddingTop + this.S;
                    }
                    paddingTop = gravity + b.topMargin;
                    this.E(u, t, paddingTop + this.s(u), measuredWidth, measuredHeight);
                    bottomMargin = b.bottomMargin;
                    t = this.t(u);
                    gravity = i + this.r(u, i);
                    t = paddingTop + (measuredHeight + bottomMargin + t);
                }
            }
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface a {
    }
    
    public static class b extends LinearLayout$LayoutParams
    {
        public b(final int n, final int n2) {
            super(n, n2);
        }
        
        public b(final int n, final int n2, final float n3) {
            super(n, n2, n3);
        }
        
        public b(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
        
        public b(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface c {
    }
}
