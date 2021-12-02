// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.os.Build$VERSION;
import androidx.core.graphics.drawable.c;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.view.View;
import android.widget.AbsListView;
import android.util.AttributeSet;
import c.a;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.widget.m;
import androidx.core.view.p0;
import java.lang.reflect.Field;
import android.graphics.Rect;
import android.widget.ListView;

class c0 extends ListView
{
    public static final int U = -1;
    public static final int V = -1;
    private final Rect G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private Field M;
    private a N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private p0 R;
    private m S;
    b T;
    
    c0(@j0 final Context context, final boolean p2) {
        super(context, (AttributeSet)null, c.a.c.n1);
        this.G = new Rect();
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.P = p2;
        this.setCacheColorHint(0);
        try {
            (this.M = AbsListView.class.getDeclaredField("mIsChildViewEnabled")).setAccessible(true);
        }
        catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        }
    }
    
    private void a() {
        this.setPressed(this.Q = false);
        this.drawableStateChanged();
        final View child = this.getChildAt(this.L - this.getFirstVisiblePosition());
        if (child != null) {
            child.setPressed(false);
        }
        final p0 r = this.R;
        if (r != null) {
            r.c();
            this.R = null;
        }
    }
    
    private void b(final View view, final int n) {
        this.performItemClick(view, n, this.getItemIdAtPosition(n));
    }
    
    private void c(final Canvas canvas) {
        if (!this.G.isEmpty()) {
            final Drawable selector = this.getSelector();
            if (selector != null) {
                selector.setBounds(this.G);
                selector.draw(canvas);
            }
        }
    }
    
    private void g(final int n, final View view) {
        final Rect g = this.G;
        g.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        g.left -= this.H;
        g.top -= this.I;
        g.right += this.J;
        g.bottom += this.K;
        try {
            final boolean boolean1 = this.M.getBoolean(this);
            if (view.isEnabled() != boolean1) {
                this.M.set(this, !boolean1);
                if (n != -1) {
                    this.refreshDrawableState();
                }
            }
        }
        catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }
    
    private void h(final int n, final View view) {
        final Drawable selector = this.getSelector();
        boolean b = true;
        final boolean b2 = selector != null && n != -1;
        if (b2) {
            selector.setVisible(false, false);
        }
        this.g(n, view);
        if (b2) {
            final Rect g = this.G;
            final float exactCenterX = g.exactCenterX();
            final float exactCenterY = g.exactCenterY();
            if (this.getVisibility() != 0) {
                b = false;
            }
            selector.setVisible(b, false);
            c.k(selector, exactCenterX, exactCenterY);
        }
    }
    
    private void i(final int n, final View view, final float n2, final float n3) {
        this.h(n, view);
        final Drawable selector = this.getSelector();
        if (selector != null && n != -1) {
            c.k(selector, n2, n3);
        }
    }
    
    private void j(final View view, final int l, final float n, final float n2) {
        this.Q = true;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            this.drawableHotspotChanged(n, n2);
        }
        if (!this.isPressed()) {
            this.setPressed(true);
        }
        this.layoutChildren();
        final int i = this.L;
        if (i != -1) {
            final View child = this.getChildAt(i - this.getFirstVisiblePosition());
            if (child != null && child != view && child.isPressed()) {
                child.setPressed(false);
            }
        }
        this.L = l;
        final float n3 = (float)view.getLeft();
        final float n4 = (float)view.getTop();
        if (sdk_INT >= 21) {
            view.drawableHotspotChanged(n - n3, n2 - n4);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        this.i(l, view, n, n2);
        this.setSelectorEnabled(false);
        this.refreshDrawableState();
    }
    
    private boolean k() {
        return this.Q;
    }
    
    private void l() {
        final Drawable selector = this.getSelector();
        if (selector != null && this.k() && this.isPressed()) {
            selector.setState(this.getDrawableState());
        }
    }
    
    private void setSelectorEnabled(final boolean b) {
        final a n = this.N;
        if (n != null) {
            n.c(b);
        }
    }
    
    public int d(int n, final boolean b) {
        final ListAdapter adapter = this.getAdapter();
        if (adapter != null) {
            if (!this.isInTouchMode()) {
                final int count = adapter.getCount();
                if (!this.getAdapter().areAllItemsEnabled()) {
                    int n2;
                    if (b) {
                        n = Math.max(0, n);
                        while (true) {
                            n2 = n;
                            if (n >= count) {
                                break;
                            }
                            n2 = n;
                            if (adapter.isEnabled(n)) {
                                break;
                            }
                            ++n;
                        }
                    }
                    else {
                        n = Math.min(n, count - 1);
                        while (true) {
                            n2 = n;
                            if (n < 0) {
                                break;
                            }
                            n2 = n;
                            if (adapter.isEnabled(n)) {
                                break;
                            }
                            --n;
                        }
                    }
                    if (n2 >= 0 && n2 < count) {
                        return n2;
                    }
                    return -1;
                }
                else if (n >= 0) {
                    if (n < count) {
                        return n;
                    }
                }
            }
        }
        return -1;
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        this.c(canvas);
        super.dispatchDraw(canvas);
    }
    
    protected void drawableStateChanged() {
        if (this.T != null) {
            return;
        }
        super.drawableStateChanged();
        this.setSelectorEnabled(true);
        this.l();
    }
    
    public int e(int n, int listPaddingTop, int listPaddingBottom, final int n2, final int n3) {
        listPaddingTop = this.getListPaddingTop();
        listPaddingBottom = this.getListPaddingBottom();
        int dividerHeight = this.getDividerHeight();
        final Drawable divider = this.getDivider();
        final ListAdapter adapter = this.getAdapter();
        listPaddingBottom += listPaddingTop;
        if (adapter == null) {
            return listPaddingBottom;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        final int count = adapter.getCount();
        View view = null;
        int i = 0;
        int n4 = 0;
        listPaddingTop = 0;
        while (i < count) {
            final int itemViewType = adapter.getItemViewType(i);
            int n5;
            if (itemViewType != (n5 = n4)) {
                view = null;
                n5 = itemViewType;
            }
            final View view2 = adapter.getView(i, view, (ViewGroup)this);
            ViewGroup$LayoutParams layoutParams;
            if ((layoutParams = view2.getLayoutParams()) == null) {
                layoutParams = this.generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            final int height = layoutParams.height;
            int n6;
            if (height > 0) {
                n6 = View$MeasureSpec.makeMeasureSpec(height, 1073741824);
            }
            else {
                n6 = View$MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(n, n6);
            view2.forceLayout();
            int n7 = listPaddingBottom;
            if (i > 0) {
                n7 = listPaddingBottom + dividerHeight;
            }
            listPaddingBottom = n7 + view2.getMeasuredHeight();
            if (listPaddingBottom >= n2) {
                n = n2;
                if (n3 >= 0) {
                    n = n2;
                    if (i > n3) {
                        n = n2;
                        if (listPaddingTop > 0 && listPaddingBottom != (n = n2)) {
                            n = listPaddingTop;
                        }
                    }
                }
                return n;
            }
            int n8 = listPaddingTop;
            if (n3 >= 0) {
                n8 = listPaddingTop;
                if (i >= n3) {
                    n8 = listPaddingBottom;
                }
            }
            ++i;
            n4 = n5;
            view = view2;
            listPaddingTop = n8;
        }
        return listPaddingBottom;
    }
    
    public boolean f(final MotionEvent motionEvent, int n) {
        final int actionMasked = motionEvent.getActionMasked();
        boolean b = false;
    Label_0139:
        while (true) {
            int pointerIndex;
            while (true) {
                Label_0045: {
                    if (actionMasked == 1) {
                        b = false;
                        break Label_0045;
                    }
                    if (actionMasked == 2) {
                        b = true;
                        break Label_0045;
                    }
                    if (actionMasked == 3) {
                        break Label_0028;
                    }
                    n = 0;
                    b = true;
                    break Label_0139;
                    n = 0;
                    b = false;
                    break Label_0139;
                }
                pointerIndex = motionEvent.findPointerIndex(n);
                if (pointerIndex < 0) {
                    continue;
                }
                break;
            }
            n = (int)motionEvent.getX(pointerIndex);
            final int n2 = (int)motionEvent.getY(pointerIndex);
            final int pointToPosition = this.pointToPosition(n, n2);
            if (pointToPosition == -1) {
                n = 1;
            }
            else {
                final View child = this.getChildAt(pointToPosition - this.getFirstVisiblePosition());
                this.j(child, pointToPosition, (float)n, (float)n2);
                if (actionMasked == 1) {
                    this.b(child, pointToPosition);
                }
                continue;
            }
            break;
        }
        if (!b || n != 0) {
            this.a();
        }
        if (b) {
            if (this.S == null) {
                this.S = new m(this);
            }
            this.S.o(true);
            this.S.onTouch((View)this, motionEvent);
        }
        else {
            final m s = this.S;
            if (s != null) {
                s.o(false);
            }
        }
        return b;
    }
    
    public boolean hasFocus() {
        return this.P || super.hasFocus();
    }
    
    public boolean hasWindowFocus() {
        return this.P || super.hasWindowFocus();
    }
    
    public boolean isFocused() {
        return this.P || super.isFocused();
    }
    
    public boolean isInTouchMode() {
        return (this.P && this.O) || super.isInTouchMode();
    }
    
    protected void onDetachedFromWindow() {
        this.T = null;
        super.onDetachedFromWindow();
    }
    
    public boolean onHoverEvent(@j0 final MotionEvent motionEvent) {
        if (Build$VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.T == null) {
            (this.T = new b()).b();
        }
        final boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            this.setSelection(-1);
        }
        else {
            final int pointToPosition = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != this.getSelectedItemPosition()) {
                final View child = this.getChildAt(pointToPosition - this.getFirstVisiblePosition());
                if (child.isEnabled()) {
                    this.setSelectionFromTop(pointToPosition, child.getTop() - this.getTop());
                }
                this.l();
            }
        }
        return onHoverEvent;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.L = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        }
        final b t = this.T;
        if (t != null) {
            t.a();
        }
        return super.onTouchEvent(motionEvent);
    }
    
    void setListSelectionHidden(final boolean o) {
        this.O = o;
    }
    
    public void setSelector(final Drawable drawable) {
        a n;
        if (drawable != null) {
            n = new a(drawable);
        }
        else {
            n = null;
        }
        super.setSelector((Drawable)(this.N = n));
        final Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.H = rect.left;
        this.I = rect.top;
        this.J = rect.right;
        this.K = rect.bottom;
    }
    
    private static class a extends c
    {
        private boolean H;
        
        a(final Drawable drawable) {
            super(drawable);
            this.H = true;
        }
        
        void c(final boolean h) {
            this.H = h;
        }
        
        @Override
        public void draw(final Canvas canvas) {
            if (this.H) {
                super.draw(canvas);
            }
        }
        
        @Override
        public void setHotspot(final float n, final float n2) {
            if (this.H) {
                super.setHotspot(n, n2);
            }
        }
        
        @Override
        public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
            if (this.H) {
                super.setHotspotBounds(n, n2, n3, n4);
            }
        }
        
        @Override
        public boolean setState(final int[] state) {
            return this.H && super.setState(state);
        }
        
        @Override
        public boolean setVisible(final boolean b, final boolean b2) {
            return this.H && super.setVisible(b, b2);
        }
    }
    
    private class b implements Runnable
    {
        b() {
        }
        
        public void a() {
            final c0 g = c0.this;
            g.T = null;
            g.removeCallbacks((Runnable)this);
        }
        
        public void b() {
            c0.this.post((Runnable)this);
        }
        
        @Override
        public void run() {
            final c0 g = c0.this;
            g.T = null;
            g.drawableStateChanged();
        }
    }
}
