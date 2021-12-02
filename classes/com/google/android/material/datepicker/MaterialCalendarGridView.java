// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.view.View$MeasureSpec;
import android.view.KeyEvent;
import java.util.Iterator;
import com.google.android.material.internal.b0;
import androidx.core.util.j;
import android.graphics.Canvas;
import android.widget.ListAdapter;
import android.widget.Adapter;
import androidx.annotation.k0;
import android.graphics.Rect;
import androidx.annotation.j0;
import androidx.core.view.accessibility.d;
import android.view.View;
import o2.a;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Calendar;
import android.widget.GridView;

final class MaterialCalendarGridView extends GridView
{
    private final Calendar G;
    private final boolean H;
    
    public MaterialCalendarGridView(final Context context) {
        this(context, null);
    }
    
    public MaterialCalendarGridView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MaterialCalendarGridView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = u.v();
        if (MaterialDatePicker.k0(this.getContext())) {
            this.setNextFocusLeftId(a.h.B0);
            this.setNextFocusRightId(a.h.P0);
        }
        this.H = MaterialDatePicker.l0(this.getContext());
        androidx.core.view.j0.z1((View)this, new androidx.core.view.a() {
            @Override
            public void g(final View view, @j0 final d d) {
                super.g(view, d);
                d.W0(null);
            }
        });
    }
    
    private void a(int selection, final Rect rect) {
        if (selection == 33) {
            selection = this.b().i();
        }
        else {
            if (selection != 130) {
                super.onFocusChanged(true, selection, rect);
                return;
            }
            selection = this.b().b();
        }
        this.setSelection(selection);
    }
    
    private static int c(@j0 final View view) {
        return view.getLeft() + view.getWidth() / 2;
    }
    
    private static boolean d(@k0 final Long n, @k0 final Long n2, @k0 final Long n3, @k0 final Long n4) {
        boolean b2;
        final boolean b = b2 = true;
        if (n != null) {
            b2 = b;
            if (n2 != null) {
                b2 = b;
                if (n3 != null) {
                    if (n4 == null) {
                        b2 = b;
                    }
                    else {
                        b2 = b;
                        if (n3 <= n2) {
                            b2 = (n4 < n && b);
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    @j0
    public n b() {
        return (n)super.getAdapter();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b().notifyDataSetChanged();
    }
    
    protected final void onDraw(@j0 final Canvas canvas) {
        super.onDraw(canvas);
        n b = this.b();
        final f<?> h = b.H;
        final c j = b.J;
        final Long c = b.c(b.b());
        final Long c2 = b.c(b.i());
        for (final j<Long, Long> i : h.Z0()) {
            final Long a = i.a;
            n n = b;
            if (a != null) {
                if (i.b == null) {
                    continue;
                }
                final long longValue = a;
                final long longValue2 = i.b;
                if (d(c, c2, longValue, longValue2)) {
                    continue;
                }
                final boolean k = b0.j((View)this);
                int n2;
                int n3;
                if (longValue < c) {
                    n2 = b.b();
                    if (b.f(n2)) {
                        n3 = 0;
                    }
                    else {
                        final View child = this.getChildAt(n2 - 1);
                        if (!k) {
                            n3 = child.getRight();
                        }
                        else {
                            n3 = child.getLeft();
                        }
                    }
                }
                else {
                    this.G.setTimeInMillis(longValue);
                    n2 = b.a(this.G.get(5));
                    n3 = c(this.getChildAt(n2));
                }
                int n4;
                int n5;
                if (longValue2 > c2) {
                    n4 = Math.min(b.i(), this.getChildCount() - 1);
                    if (b.g(n4)) {
                        n5 = this.getWidth();
                    }
                    else {
                        final View child2 = this.getChildAt(n4);
                        if (!k) {
                            n5 = child2.getRight();
                        }
                        else {
                            n5 = child2.getLeft();
                        }
                    }
                }
                else {
                    this.G.setTimeInMillis(longValue2);
                    n4 = b.a(this.G.get(5));
                    n5 = c(this.getChildAt(n4));
                }
                int n6 = (int)b.getItemId(n2);
                final int n7 = (int)b.getItemId(n4);
                while (true) {
                    n = b;
                    if (n6 > n7) {
                        break;
                    }
                    final int n8 = this.getNumColumns() * n6;
                    final int n9 = this.getNumColumns() + n8 - 1;
                    final View child3 = this.getChildAt(n8);
                    final int top = child3.getTop();
                    final int e = j.a.e();
                    final int bottom = child3.getBottom();
                    final int b2 = j.a.b();
                    int n11;
                    int n12;
                    if (!k) {
                        int n10;
                        if (n8 > n2) {
                            n10 = 0;
                        }
                        else {
                            n10 = n3;
                        }
                        if (n4 > n9) {
                            final int width = this.getWidth();
                            n11 = n10;
                            n12 = width;
                        }
                        else {
                            final int n13 = n5;
                            n11 = n10;
                            n12 = n13;
                        }
                    }
                    else {
                        int n14;
                        if (n4 > n9) {
                            n14 = 0;
                        }
                        else {
                            n14 = n5;
                        }
                        int width2;
                        if (n8 > n2) {
                            width2 = this.getWidth();
                        }
                        else {
                            width2 = n3;
                        }
                        final int n15 = n14;
                        n12 = width2;
                        n11 = n15;
                    }
                    canvas.drawRect((float)n11, (float)(top + e), (float)n12, (float)(bottom - b2), j.h);
                    ++n6;
                }
            }
            b = n;
        }
    }
    
    protected void onFocusChanged(final boolean b, final int n, final Rect rect) {
        if (b) {
            this.a(n, rect);
        }
        else {
            super.onFocusChanged(false, n, rect);
        }
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (!super.onKeyDown(n, keyEvent)) {
            return false;
        }
        if (this.getSelectedItemPosition() == -1 || this.getSelectedItemPosition() >= this.b().b()) {
            return true;
        }
        if (19 == n) {
            this.setSelection(this.b().b());
            return true;
        }
        return false;
    }
    
    public void onMeasure(final int n, final int n2) {
        if (this.H) {
            super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            this.getLayoutParams().height = this.getMeasuredHeight();
        }
        else {
            super.onMeasure(n, n2);
        }
    }
    
    public final void setAdapter(final ListAdapter adapter) {
        if (adapter instanceof n) {
            super.setAdapter(adapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
    }
    
    public void setSelection(final int n) {
        int b = n;
        if (n < this.b().b()) {
            b = this.b().b();
        }
        super.setSelection(b);
    }
}
