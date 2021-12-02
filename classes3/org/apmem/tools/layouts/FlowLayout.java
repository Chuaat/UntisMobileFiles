// 
// Decompiled by Procyon v0.5.36
// 

package org.apmem.tools.layouts;

import android.content.res.TypedArray;
import android.view.ViewDebug$IntToString;
import android.view.ViewDebug$ExportedProperty;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import java.lang.reflect.Method;
import android.graphics.Paint;
import android.view.View$MeasureSpec;
import android.view.Gravity;
import android.graphics.Rect;
import android.view.View;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.content.Context;
import java.util.List;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup
{
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 0;
    public static final int L = 1;
    private final b G;
    List<c> H;
    
    public FlowLayout(final Context context) {
        super(context);
        this.H = new ArrayList<c>();
        this.G = new b(context, null);
    }
    
    public FlowLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.H = new ArrayList<c>();
        this.G = new b(context, set);
    }
    
    public FlowLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.H = new ArrayList<c>();
        this.G = new b(context, set);
    }
    
    private void a(final c c) {
        final List<View> h = c.h();
        final int size = h.size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        float n = 0.0f;
        while (i < size) {
            n += this.n((a)h.get(i).getLayoutParams());
            ++i;
        }
        final a a = (a)h.get(size - 1).getLayoutParams();
        final int n2 = c.d() - (a.g() + a.h() + a.e());
        int j = 0;
        int left = 0;
        while (j < size) {
            final a a2 = (a)h.get(j).getLayoutParams();
            final float n3 = this.n(a2);
            final int l = this.l(a2);
            int round;
            if (n == 0.0f) {
                round = n2 / size;
            }
            else {
                round = Math.round(n2 * n3 / n);
            }
            final int n4 = a2.g() + a2.h();
            final int k = a2.j();
            final int m = a2.i();
            final Rect rect = new Rect();
            rect.top = 0;
            rect.left = left;
            rect.right = n4 + round + left;
            rect.bottom = c.g();
            final Rect rect2 = new Rect();
            Gravity.apply(l, n4, k + m, rect, rect2);
            left += round;
            a2.r(rect2.left + a2.e());
            a2.s(rect2.top);
            a2.t(rect2.width() - a2.h());
            a2.w(rect2.height() - a2.i());
            ++j;
        }
    }
    
    private void b(final List<c> list, final int right, int n) {
        final int size = list.size();
        if (size <= 0) {
            return;
        }
        final c c = list.get(size - 1);
        if ((n -= c.g() + c.f()) < 0) {
            n = 0;
        }
        int i = 0;
        int top = 0;
        while (i < size) {
            final c c2 = list.get(i);
            final int l = this.l(null);
            final int round = Math.round((float)(n * 1 / size));
            final int d = c2.d();
            final int g = c2.g();
            final Rect rect = new Rect();
            rect.top = top;
            rect.left = 0;
            rect.right = right;
            rect.bottom = g + round + top;
            final Rect rect2 = new Rect();
            Gravity.apply(l, d, g, rect, rect2);
            top += round;
            c2.j(c2.e() + rect2.left);
            c2.k(c2.f() + rect2.top);
            c2.i(rect2.width());
            c2.l(rect2.height());
            ++i;
        }
    }
    
    private void c(final c c) {
        final List<View> h = c.h();
        for (int size = h.size(), i = 0; i < size; ++i) {
            final View view = h.get(i);
            final a a = (a)view.getLayoutParams();
            int n;
            int n2;
            if (this.G.c() == 0) {
                a.v(this.getPaddingLeft() + c.e() + a.e(), this.getPaddingTop() + c.f() + a.f());
                n = View$MeasureSpec.makeMeasureSpec(a.g(), 1073741824);
                n2 = a.j();
            }
            else {
                a.v(this.getPaddingLeft() + c.f() + a.f(), this.getPaddingTop() + c.e() + a.e());
                n = View$MeasureSpec.makeMeasureSpec(a.j(), 1073741824);
                n2 = a.g();
            }
            view.measure(n, View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
        }
    }
    
    private void d(final List<c> list) {
        final int size = list.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final c c = list.get(i);
            c.k(n);
            final int n2 = n + c.g();
            final List<View> h = c.h();
            final int size2 = h.size();
            int j = 0;
            int n3 = 0;
            while (j < size2) {
                final a a = (a)h.get(j).getLayoutParams();
                a.r(n3);
                n3 += a.g() + a.h();
                ++j;
            }
            ++i;
            n = n2;
        }
    }
    
    private Paint e(final int color) {
        final Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStrokeWidth(2.0f);
        return paint;
    }
    
    private boolean f() {
        final boolean b = false;
        try {
            final Method declaredMethod = ViewGroup.class.getDeclaredMethod("debugDraw", (Class<?>[])null);
            declaredMethod.setAccessible(true);
            return (boolean)declaredMethod.invoke(this, null);
        }
        catch (Exception ex) {
            return b;
        }
    }
    
    private void g(final Canvas canvas, final View view) {
        if (!this.o()) {
            return;
        }
        final Paint e = this.e(-256);
        final Paint e2 = this.e(-65536);
        final a a = (a)view.getLayoutParams();
        if (a.rightMargin > 0) {
            final float n = (float)view.getRight();
            final float n2 = view.getTop() + view.getHeight() / 2.0f;
            canvas.drawLine(n, n2, n + a.rightMargin, n2, e);
            final int rightMargin = a.rightMargin;
            canvas.drawLine(rightMargin + n - 4.0f, n2 - 4.0f, n + rightMargin, n2, e);
            final int rightMargin2 = a.rightMargin;
            canvas.drawLine(rightMargin2 + n - 4.0f, n2 + 4.0f, n + rightMargin2, n2, e);
        }
        if (a.leftMargin > 0) {
            final float n3 = (float)view.getLeft();
            final float n4 = view.getTop() + view.getHeight() / 2.0f;
            canvas.drawLine(n3, n4, n3 - a.leftMargin, n4, e);
            final int leftMargin = a.leftMargin;
            canvas.drawLine(n3 - leftMargin + 4.0f, n4 - 4.0f, n3 - leftMargin, n4, e);
            final int leftMargin2 = a.leftMargin;
            canvas.drawLine(n3 - leftMargin2 + 4.0f, n4 + 4.0f, n3 - leftMargin2, n4, e);
        }
        if (a.bottomMargin > 0) {
            final float n5 = view.getLeft() + view.getWidth() / 2.0f;
            final float n6 = (float)view.getBottom();
            canvas.drawLine(n5, n6, n5, n6 + a.bottomMargin, e);
            final int bottomMargin = a.bottomMargin;
            canvas.drawLine(n5 - 4.0f, bottomMargin + n6 - 4.0f, n5, n6 + bottomMargin, e);
            final int bottomMargin2 = a.bottomMargin;
            canvas.drawLine(n5 + 4.0f, bottomMargin2 + n6 - 4.0f, n5, n6 + bottomMargin2, e);
        }
        if (a.topMargin > 0) {
            final float n7 = view.getLeft() + view.getWidth() / 2.0f;
            final float n8 = (float)view.getTop();
            canvas.drawLine(n7, n8, n7, n8 - a.topMargin, e);
            final int topMargin = a.topMargin;
            canvas.drawLine(n7 - 4.0f, n8 - topMargin + 4.0f, n7, n8 - topMargin, e);
            final int topMargin2 = a.topMargin;
            canvas.drawLine(n7 + 4.0f, n8 - topMargin2 + 4.0f, n7, n8 - topMargin2, e);
        }
        if (a.o()) {
            float n9;
            float n11;
            float n12;
            float n13;
            if (this.G.c() == 0) {
                n9 = (float)view.getLeft();
                final float n10 = view.getTop() + view.getHeight() / 2.0f;
                n11 = n10 - 6.0f;
                n12 = n10 + 6.0f;
                n13 = n9;
            }
            else {
                final float n14 = view.getLeft() + view.getWidth() / 2.0f;
                n12 = (float)view.getTop();
                n13 = n14 - 6.0f;
                n9 = n14 + 6.0f;
                n11 = n12;
            }
            canvas.drawLine(n13, n11, n9, n12, e2);
        }
    }
    
    private int h(final int n, int min, final int a) {
        if (n != Integer.MIN_VALUE) {
            if (n != 1073741824) {
                min = a;
            }
        }
        else {
            min = Math.min(a, min);
        }
        return min;
    }
    
    private int l(final a a) {
        final int a2 = this.G.a();
        int d;
        if (a != null && a.n()) {
            d = a.d();
        }
        else {
            d = a2;
        }
        final int m = this.m(d);
        final int i = this.m(a2);
        int n = m;
        if ((m & 0x7) == 0x0) {
            n = (m | (i & 0x7));
        }
        int n2 = n;
        if ((n & 0x70) == 0x0) {
            n2 = (n | (i & 0x70));
        }
        int n3 = n2;
        if ((n2 & 0x7) == 0x0) {
            n3 = (n2 | 0x3);
        }
        int n4 = n3;
        if ((n3 & 0x70) == 0x0) {
            n4 = (n3 | 0x30);
        }
        return n4;
    }
    
    private int m(int n) {
        final int c = this.G.c();
        int n2 = 0;
        int n3 = n;
        if (c == 1) {
            n3 = n;
            if ((n & 0x800000) == 0x0) {
                n3 = ((n & 0x70) >> 4 << 0 | ((n & 0x7) >> 0 << 4 | 0x0));
            }
        }
        n = n3;
        if (this.G.b() == 1) {
            n = n3;
            if ((n3 & 0x800000) != 0x0) {
                if ((n3 & 0x3) == 0x3) {
                    n = 5;
                }
                else {
                    n = 0;
                }
                if ((n3 & 0x5) == 0x5) {
                    n2 = 3;
                }
                n = (n | 0x0 | n2);
            }
        }
        return n;
    }
    
    private float n(final a a) {
        float n;
        if (a.y()) {
            n = a.k();
        }
        else {
            n = this.G.d();
        }
        return n;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof a;
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        final boolean drawChild = super.drawChild(canvas, view, n);
        this.g(canvas, view);
        return drawChild;
    }
    
    public int getGravity() {
        return this.G.a();
    }
    
    public int getLayoutDirection() {
        final b g = this.G;
        if (g == null) {
            return 0;
        }
        return g.b();
    }
    
    public int getOrientation() {
        return this.G.c();
    }
    
    public float getWeightDefault() {
        return this.G.d();
    }
    
    protected a i() {
        return new a(-2, -2);
    }
    
    public a j(final AttributeSet set) {
        return new a(this.getContext(), set);
    }
    
    protected a k(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new a(viewGroup$LayoutParams);
    }
    
    public boolean o() {
        return this.G.e() || this.f();
    }
    
    protected void onLayout(final boolean b, int i, int childCount, final int n, final int n2) {
        View child;
        a a;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            a = (a)child.getLayoutParams();
            child.layout(a.h + a.leftMargin, a.i + a.topMargin, a.h + a.leftMargin + child.getMeasuredWidth(), a.i + a.topMargin + child.getMeasuredHeight());
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        int n3 = View$MeasureSpec.getSize(n) - this.getPaddingRight() - this.getPaddingLeft();
        final int n4 = View$MeasureSpec.getSize(n2) - this.getPaddingTop() - this.getPaddingBottom();
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        int n5;
        if (this.G.c() == 0) {
            n5 = n3;
        }
        else {
            n5 = n4;
        }
        if (this.G.c() == 0) {
            n3 = n4;
        }
        int n6;
        if (this.G.c() == 0) {
            n6 = mode;
        }
        else {
            n6 = mode2;
        }
        this.G.c();
        this.H.clear();
        c c = new c(n5);
        this.H.add(c);
        final int childCount = this.getChildCount();
        final int n7 = 0;
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final a a = (a)child.getLayoutParams();
                child.measure(ViewGroup.getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight(), a.width), ViewGroup.getChildMeasureSpec(n2, this.getPaddingTop() + this.getPaddingBottom(), a.height));
                a.j = this.G.c();
                int n8;
                if (this.G.c() == 0) {
                    a.t(child.getMeasuredWidth());
                    n8 = child.getMeasuredHeight();
                }
                else {
                    a.t(child.getMeasuredHeight());
                    n8 = child.getMeasuredWidth();
                }
                a.w(n8);
                if (a.o() || (n6 != 0 && !c.c(child))) {
                    c = new c(n5);
                    if (this.G.c() == 1 && this.G.b() == 1) {
                        this.H.add(0, c);
                    }
                    else {
                        this.H.add(c);
                    }
                }
                if (this.G.c() == 0 && this.G.b() == 1) {
                    c.a(0, child);
                }
                else {
                    c.b(child);
                }
            }
        }
        this.d(this.H);
        final int size = this.H.size();
        int j = 0;
        int max = 0;
        while (j < size) {
            max = Math.max(max, this.H.get(j).d());
            ++j;
        }
        final int n9 = c.f() + c.g();
        this.b(this.H, this.h(n6, n5, max), this.h(mode2, n3, n9));
        for (int k = n7; k < size; ++k) {
            final c c2 = this.H.get(k);
            this.a(c2);
            this.c(c2);
        }
        final int n10 = this.getPaddingLeft() + this.getPaddingRight();
        final int n11 = this.getPaddingBottom() + this.getPaddingTop();
        int n12;
        int n13;
        if (this.G.c() == 0) {
            n12 = n10 + max;
            n13 = n11 + n9;
        }
        else {
            n12 = n10 + n9;
            n13 = n11 + max;
        }
        this.setMeasuredDimension(ViewGroup.resolveSize(n12, n), ViewGroup.resolveSize(n13, n2));
    }
    
    public void setDebugDraw(final boolean b) {
        this.G.f(b);
        this.invalidate();
    }
    
    public void setGravity(final int n) {
        this.G.g(n);
        this.requestLayout();
    }
    
    public void setLayoutDirection(final int n) {
        this.G.h(n);
        this.requestLayout();
    }
    
    public void setOrientation(final int n) {
        this.G.i(n);
        this.requestLayout();
    }
    
    public void setWeightDefault(final float n) {
        this.G.j(n);
        this.requestLayout();
    }
    
    public static class a extends ViewGroup$MarginLayoutParams
    {
        @ViewDebug$ExportedProperty(mapping = { @ViewDebug$IntToString(from = 0, to = "NONE"), @ViewDebug$IntToString(from = 48, to = "TOP"), @ViewDebug$IntToString(from = 80, to = "BOTTOM"), @ViewDebug$IntToString(from = 3, to = "LEFT"), @ViewDebug$IntToString(from = 5, to = "RIGHT"), @ViewDebug$IntToString(from = 16, to = "CENTER_VERTICAL"), @ViewDebug$IntToString(from = 112, to = "FILL_VERTICAL"), @ViewDebug$IntToString(from = 1, to = "CENTER_HORIZONTAL"), @ViewDebug$IntToString(from = 7, to = "FILL_HORIZONTAL"), @ViewDebug$IntToString(from = 17, to = "CENTER"), @ViewDebug$IntToString(from = 119, to = "FILL") })
        private boolean a;
        private int b;
        private float c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        
        public a(final int n, final int n2) {
            super(n, n2);
            this.a = false;
            this.b = 0;
            this.c = -1.0f;
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            this.a = false;
            this.b = 0;
            this.c = -1.0f;
            this.p(context, set);
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = false;
            this.b = 0;
            this.c = -1.0f;
        }
        
        private void p(Context obtainStyledAttributes, final AttributeSet set) {
            obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, org.apmem.tools.layouts.d.c.i);
            try {
                this.a = ((TypedArray)obtainStyledAttributes).getBoolean(org.apmem.tools.layouts.d.c.k, false);
                this.b = ((TypedArray)obtainStyledAttributes).getInt(org.apmem.tools.layouts.d.c.j, 0);
                this.c = ((TypedArray)obtainStyledAttributes).getFloat(org.apmem.tools.layouts.d.c.l, -1.0f);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
        
        public int d() {
            return this.b;
        }
        
        int e() {
            return this.d;
        }
        
        int f() {
            return this.g;
        }
        
        int g() {
            return this.e;
        }
        
        int h() {
            int n;
            int n2;
            if (this.j == 0) {
                n = super.leftMargin;
                n2 = super.rightMargin;
            }
            else {
                n = super.topMargin;
                n2 = super.bottomMargin;
            }
            return n + n2;
        }
        
        int i() {
            int n;
            int n2;
            if (this.j == 0) {
                n = super.topMargin;
                n2 = super.bottomMargin;
            }
            else {
                n = super.leftMargin;
                n2 = super.rightMargin;
            }
            return n + n2;
        }
        
        int j() {
            return this.f;
        }
        
        public float k() {
            return this.c;
        }
        
        public int l() {
            return this.h;
        }
        
        public int m() {
            return this.i;
        }
        
        public boolean n() {
            return this.b != 0;
        }
        
        public boolean o() {
            return this.a;
        }
        
        public void q(final int b) {
            this.b = b;
        }
        
        void r(final int d) {
            this.d = d;
        }
        
        void s(final int g) {
            this.g = g;
        }
        
        void t(final int e) {
            this.e = e;
        }
        
        public void u(final boolean a) {
            this.a = a;
        }
        
        void v(final int h, final int i) {
            this.h = h;
            this.i = i;
        }
        
        void w(final int f) {
            this.f = f;
        }
        
        public void x(final float c) {
            this.c = c;
        }
        
        public boolean y() {
            return this.c >= 0.0f;
        }
    }
}
