// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.core.widget.r;
import android.view.ActionMode$Callback;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Region$Op;
import android.text.TextUtils;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.view.MotionEvent;
import androidx.core.graphics.drawable.c;
import android.os.Build$VERSION;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.graphics.Rect;
import android.animation.ObjectAnimator;
import android.text.method.TransformationMethod;
import android.text.Layout;
import android.text.TextPaint;
import android.view.VelocityTracker;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton
{
    private static final String A0 = "android.widget.Switch";
    private static final int B0 = 1;
    private static final int C0 = 2;
    private static final int D0 = 3;
    private static final Property<SwitchCompat, Float> E0;
    private static final int[] F0;
    private static final int w0 = 250;
    private static final int x0 = 0;
    private static final int y0 = 1;
    private static final int z0 = 2;
    private Drawable G;
    private ColorStateList H;
    private PorterDuff$Mode I;
    private boolean J;
    private boolean K;
    private Drawable L;
    private ColorStateList M;
    private PorterDuff$Mode N;
    private boolean O;
    private boolean P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private CharSequence U;
    private CharSequence V;
    private boolean W;
    private int a0;
    private int b0;
    private float c0;
    private float d0;
    private VelocityTracker e0;
    private int f0;
    float g0;
    private int h0;
    private int i0;
    private int j0;
    private int k0;
    private int l0;
    private int m0;
    private int n0;
    private final TextPaint o0;
    private ColorStateList p0;
    private Layout q0;
    private Layout r0;
    private TransformationMethod s0;
    ObjectAnimator t0;
    private final w u0;
    private final Rect v0;
    
    static {
        E0 = new Property<SwitchCompat, Float>("thumbPos") {
            public Float a(final SwitchCompat switchCompat) {
                return switchCompat.g0;
            }
            
            public void b(final SwitchCompat switchCompat, final Float n) {
                switchCompat.setThumbPosition(n);
            }
        };
        F0 = new int[] { 16842912 };
    }
    
    public SwitchCompat(@j0 final Context context) {
        this(context, null);
    }
    
    public SwitchCompat(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.s3);
    }
    
    public SwitchCompat(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.H = null;
        this.I = null;
        this.J = false;
        this.K = false;
        this.M = null;
        this.N = null;
        this.O = false;
        this.P = false;
        this.e0 = VelocityTracker.obtain();
        this.v0 = new Rect();
        androidx.appcompat.widget.p0.a((View)this, this.getContext());
        final TextPaint o0 = new TextPaint(1);
        this.o0 = o0;
        o0.density = this.getResources().getDisplayMetrics().density;
        final int[] k6 = a.n.K6;
        final u0 g = androidx.appcompat.widget.u0.G(context, set, k6, n, 0);
        androidx.core.view.j0.x1((View)this, context, k6, set, g.B(), n, 0);
        final Drawable h = g.h(a.n.N6);
        this.G = h;
        if (h != null) {
            h.setCallback((Drawable$Callback)this);
        }
        final Drawable h2 = g.h(a.n.W6);
        if ((this.L = h2) != null) {
            h2.setCallback((Drawable$Callback)this);
        }
        this.U = g.x(a.n.L6);
        this.V = g.x(a.n.M6);
        this.W = g.a(a.n.O6, true);
        this.Q = g.g(a.n.T6, 0);
        this.R = g.g(a.n.Q6, 0);
        this.S = g.g(a.n.R6, 0);
        this.T = g.a(a.n.P6, false);
        final ColorStateList d = g.d(a.n.U6);
        if (d != null) {
            this.H = d;
            this.J = true;
        }
        final PorterDuff$Mode e = androidx.appcompat.widget.b0.e(g.o(a.n.V6, -1), null);
        if (this.I != e) {
            this.I = e;
            this.K = true;
        }
        if (this.J || this.K) {
            this.b();
        }
        final ColorStateList d2 = g.d(a.n.X6);
        if (d2 != null) {
            this.M = d2;
            this.O = true;
        }
        final PorterDuff$Mode e2 = androidx.appcompat.widget.b0.e(g.o(a.n.Y6, -1), null);
        if (this.N != e2) {
            this.N = e2;
            this.P = true;
        }
        if (this.O || this.P) {
            this.c();
        }
        final int u = g.u(a.n.S6, 0);
        if (u != 0) {
            this.k(context, u);
        }
        (this.u0 = new w((TextView)this)).m(set, n);
        g.I();
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.b0 = value.getScaledTouchSlop();
        this.f0 = value.getScaledMinimumFlingVelocity();
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }
    
    private void a(final boolean b) {
        float n;
        if (b) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        (this.t0 = ObjectAnimator.ofFloat((Object)this, (Property)SwitchCompat.E0, new float[] { n })).setDuration(250L);
        if (Build$VERSION.SDK_INT >= 18) {
            this.t0.setAutoCancel(true);
        }
        this.t0.start();
    }
    
    private void b() {
        final Drawable g = this.G;
        if (g != null && (this.J || this.K)) {
            final Drawable mutate = c.r(g).mutate();
            this.G = mutate;
            if (this.J) {
                c.o(mutate, this.H);
            }
            if (this.K) {
                c.p(this.G, this.I);
            }
            if (this.G.isStateful()) {
                this.G.setState(this.getDrawableState());
            }
        }
    }
    
    private void c() {
        final Drawable l = this.L;
        if (l != null && (this.O || this.P)) {
            final Drawable mutate = c.r(l).mutate();
            this.L = mutate;
            if (this.O) {
                c.o(mutate, this.M);
            }
            if (this.P) {
                c.p(this.L, this.N);
            }
            if (this.L.isStateful()) {
                this.L.setState(this.getDrawableState());
            }
        }
    }
    
    private void d() {
        final ObjectAnimator t0 = this.t0;
        if (t0 != null) {
            t0.cancel();
        }
    }
    
    private void e(MotionEvent obtain) {
        obtain = MotionEvent.obtain(obtain);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }
    
    private static float f(final float n, float n2, final float n3) {
        if (n >= n2) {
            n2 = n;
            if (n > n3) {
                n2 = n3;
            }
        }
        return n2;
    }
    
    private boolean g(final float n, final float n2) {
        final Drawable g = this.G;
        final boolean b = false;
        if (g == null) {
            return false;
        }
        final int thumbOffset = this.getThumbOffset();
        this.G.getPadding(this.v0);
        final int l0 = this.l0;
        final int b2 = this.b0;
        final int n3 = this.k0 + thumbOffset - b2;
        final int j0 = this.j0;
        final Rect v0 = this.v0;
        final int left = v0.left;
        final int right = v0.right;
        final int n4 = this.n0;
        boolean b3 = b;
        if (n > n3) {
            b3 = b;
            if (n < j0 + n3 + left + right + b2) {
                b3 = b;
                if (n2 > l0 - b2) {
                    b3 = b;
                    if (n2 < n4 + b2) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    private boolean getTargetCheckedState() {
        return this.g0 > 0.5f;
    }
    
    private int getThumbOffset() {
        float g0;
        if (a1.b((View)this)) {
            g0 = 1.0f - this.g0;
        }
        else {
            g0 = this.g0;
        }
        return (int)(g0 * this.getThumbScrollRange() + 0.5f);
    }
    
    private int getThumbScrollRange() {
        final Drawable l = this.L;
        if (l != null) {
            final Rect v0 = this.v0;
            l.getPadding(v0);
            final Drawable g = this.G;
            Rect rect;
            if (g != null) {
                rect = androidx.appcompat.widget.b0.d(g);
            }
            else {
                rect = androidx.appcompat.widget.b0.d;
            }
            return this.h0 - this.j0 - v0.left - v0.right - rect.left - rect.right;
        }
        return 0;
    }
    
    private Layout h(final CharSequence charSequence) {
        final TransformationMethod s0 = this.s0;
        CharSequence transformation = charSequence;
        if (s0 != null) {
            transformation = s0.getTransformation(charSequence, (View)this);
        }
        final TextPaint o0 = this.o0;
        int n;
        if (transformation != null) {
            n = (int)Math.ceil(Layout.getDesiredWidth(transformation, o0));
        }
        else {
            n = 0;
        }
        return (Layout)new StaticLayout(transformation, o0, n, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }
    
    private void i() {
        if (Build$VERSION.SDK_INT >= 30) {
            CharSequence charSequence;
            if ((charSequence = this.V) == null) {
                charSequence = this.getResources().getString(a.l.g);
            }
            androidx.core.view.j0.o2((View)this, charSequence);
        }
    }
    
    private void j() {
        if (Build$VERSION.SDK_INT >= 30) {
            CharSequence charSequence;
            if ((charSequence = this.U) == null) {
                charSequence = this.getResources().getString(a.l.h);
            }
            androidx.core.view.j0.o2((View)this, charSequence);
        }
    }
    
    private void m(final int n, final int n2) {
        Typeface typeface;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    typeface = null;
                }
                else {
                    typeface = Typeface.MONOSPACE;
                }
            }
            else {
                typeface = Typeface.SERIF;
            }
        }
        else {
            typeface = Typeface.SANS_SERIF;
        }
        this.l(typeface, n2);
    }
    
    private void n(final MotionEvent motionEvent) {
        this.a0 = 0;
        final int action = motionEvent.getAction();
        boolean targetCheckedState = true;
        final boolean b = action == 1 && this.isEnabled();
        final boolean checked = this.isChecked();
        Label_0117: {
            if (b) {
                this.e0.computeCurrentVelocity(1000);
                final float xVelocity = this.e0.getXVelocity();
                if (Math.abs(xVelocity) > this.f0) {
                    if (a1.b((View)this)) {
                        if (xVelocity < 0.0f) {
                            break Label_0117;
                        }
                    }
                    else if (xVelocity > 0.0f) {
                        break Label_0117;
                    }
                    targetCheckedState = false;
                }
                else {
                    targetCheckedState = this.getTargetCheckedState();
                }
            }
            else {
                targetCheckedState = checked;
            }
        }
        if (targetCheckedState != checked) {
            this.playSoundEffect(0);
        }
        this.setChecked(targetCheckedState);
        this.e(motionEvent);
    }
    
    public void draw(final Canvas canvas) {
        final Rect v0 = this.v0;
        int k0 = this.k0;
        final int l0 = this.l0;
        int m0 = this.m0;
        final int n0 = this.n0;
        final int n2 = this.getThumbOffset() + k0;
        final Drawable g = this.G;
        Rect rect;
        if (g != null) {
            rect = androidx.appcompat.widget.b0.d(g);
        }
        else {
            rect = androidx.appcompat.widget.b0.d;
        }
        final Drawable i = this.L;
        int n3 = n2;
        if (i != null) {
            i.getPadding(v0);
            final int left = v0.left;
            final int n4 = n2 + left;
            int n5 = 0;
            int n6 = 0;
            int n10 = 0;
            Label_0261: {
                int n8;
                if (rect != null) {
                    final int left2 = rect.left;
                    n5 = k0;
                    if (left2 > left) {
                        n5 = k0 + (left2 - left);
                    }
                    final int top = rect.top;
                    final int top2 = v0.top;
                    if (top > top2) {
                        n6 = top - top2 + l0;
                    }
                    else {
                        n6 = l0;
                    }
                    final int right = rect.right;
                    final int right2 = v0.right;
                    int n7 = m0;
                    if (right > right2) {
                        n7 = m0 - (right - right2);
                    }
                    final int bottom = rect.bottom;
                    final int bottom2 = v0.bottom;
                    k0 = n5;
                    m0 = n7;
                    n8 = n6;
                    if (bottom > bottom2) {
                        final int n9 = n0 - (bottom - bottom2);
                        m0 = n7;
                        n10 = n9;
                        break Label_0261;
                    }
                }
                else {
                    n8 = l0;
                }
                n10 = n0;
                n6 = n8;
                n5 = k0;
            }
            this.L.setBounds(n5, n6, m0, n10);
            n3 = n4;
        }
        final Drawable g2 = this.G;
        if (g2 != null) {
            g2.getPadding(v0);
            final int n11 = n3 - v0.left;
            final int n12 = n3 + this.j0 + v0.right;
            this.G.setBounds(n11, l0, n12, n0);
            final Drawable background = this.getBackground();
            if (background != null) {
                c.l(background, n11, l0, n12, n0);
            }
        }
        super.draw(canvas);
    }
    
    public void drawableHotspotChanged(final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(n, n2);
        }
        final Drawable g = this.G;
        if (g != null) {
            c.k(g, n, n2);
        }
        final Drawable l = this.L;
        if (l != null) {
            c.k(l, n, n2);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable g = this.G;
        int n2;
        final int n = n2 = 0;
        if (g != null) {
            n2 = n;
            if (g.isStateful()) {
                n2 = ((false | g.setState(drawableState)) ? 1 : 0);
            }
        }
        final Drawable l = this.L;
        int n3 = n2;
        if (l != null) {
            n3 = n2;
            if (l.isStateful()) {
                n3 = (n2 | (l.setState(drawableState) ? 1 : 0));
            }
        }
        if (n3 != 0) {
            this.invalidate();
        }
    }
    
    public int getCompoundPaddingLeft() {
        if (!a1.b((View)this)) {
            return super.getCompoundPaddingLeft();
        }
        int n = super.getCompoundPaddingLeft() + this.h0;
        if (!TextUtils.isEmpty(this.getText())) {
            n += this.S;
        }
        return n;
    }
    
    public int getCompoundPaddingRight() {
        if (a1.b((View)this)) {
            return super.getCompoundPaddingRight();
        }
        int n = super.getCompoundPaddingRight() + this.h0;
        if (!TextUtils.isEmpty(this.getText())) {
            n += this.S;
        }
        return n;
    }
    
    public boolean getShowText() {
        return this.W;
    }
    
    public boolean getSplitTrack() {
        return this.T;
    }
    
    public int getSwitchMinWidth() {
        return this.R;
    }
    
    public int getSwitchPadding() {
        return this.S;
    }
    
    public CharSequence getTextOff() {
        return this.V;
    }
    
    public CharSequence getTextOn() {
        return this.U;
    }
    
    public Drawable getThumbDrawable() {
        return this.G;
    }
    
    public int getThumbTextPadding() {
        return this.Q;
    }
    
    @k0
    public ColorStateList getThumbTintList() {
        return this.H;
    }
    
    @k0
    public PorterDuff$Mode getThumbTintMode() {
        return this.I;
    }
    
    public Drawable getTrackDrawable() {
        return this.L;
    }
    
    @k0
    public ColorStateList getTrackTintList() {
        return this.M;
    }
    
    @k0
    public PorterDuff$Mode getTrackTintMode() {
        return this.N;
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable g = this.G;
        if (g != null) {
            g.jumpToCurrentState();
        }
        final Drawable l = this.L;
        if (l != null) {
            l.jumpToCurrentState();
        }
        final ObjectAnimator t0 = this.t0;
        if (t0 != null && t0.isStarted()) {
            this.t0.end();
            this.t0 = null;
        }
    }
    
    public void k(final Context context, int g) {
        final u0 e = androidx.appcompat.widget.u0.E(context, g, a.n.Z6);
        ColorStateList p2 = e.d(a.n.d7);
        if (p2 == null) {
            p2 = this.getTextColors();
        }
        this.p0 = p2;
        g = e.g(a.n.a7, 0);
        if (g != 0) {
            final float textSize = (float)g;
            if (textSize != this.o0.getTextSize()) {
                this.o0.setTextSize(textSize);
                this.requestLayout();
            }
        }
        this.m(e.o(a.n.b7, -1), e.o(a.n.c7, -1));
        Object s0;
        if (e.a(a.n.o7, false)) {
            s0 = new e.a(this.getContext());
        }
        else {
            s0 = null;
        }
        this.s0 = (TransformationMethod)s0;
        e.I();
    }
    
    public void l(Typeface typeface, int n) {
        float textSkewX = 0.0f;
        boolean fakeBoldText = false;
        if (n > 0) {
            if (typeface == null) {
                typeface = Typeface.defaultFromStyle(n);
            }
            else {
                typeface = Typeface.create(typeface, n);
            }
            this.setSwitchTypeface(typeface);
            int style;
            if (typeface != null) {
                style = typeface.getStyle();
            }
            else {
                style = 0;
            }
            n &= ~style;
            final TextPaint o0 = this.o0;
            if ((n & 0x1) != 0x0) {
                fakeBoldText = true;
            }
            o0.setFakeBoldText(fakeBoldText);
            final TextPaint o2 = this.o0;
            if ((n & 0x2) != 0x0) {
                textSkewX = -0.25f;
            }
            o2.setTextSkewX(textSkewX);
        }
        else {
            this.o0.setFakeBoldText(false);
            this.o0.setTextSkewX(0.0f);
            this.setSwitchTypeface(typeface);
        }
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, SwitchCompat.F0);
        }
        return onCreateDrawableState;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Rect v0 = this.v0;
        final Drawable l = this.L;
        if (l != null) {
            l.getPadding(v0);
        }
        else {
            v0.setEmpty();
        }
        final int l2 = this.l0;
        final int n0 = this.n0;
        final int top = v0.top;
        final int bottom = v0.bottom;
        final Drawable g = this.G;
        if (l != null) {
            if (this.T && g != null) {
                final Rect d = androidx.appcompat.widget.b0.d(g);
                g.copyBounds(v0);
                v0.left += d.left;
                v0.right -= d.right;
                final int save = canvas.save();
                canvas.clipRect(v0, Region$Op.DIFFERENCE);
                l.draw(canvas);
                canvas.restoreToCount(save);
            }
            else {
                l.draw(canvas);
            }
        }
        final int save2 = canvas.save();
        if (g != null) {
            g.draw(canvas);
        }
        Layout layout;
        if (this.getTargetCheckedState()) {
            layout = this.q0;
        }
        else {
            layout = this.r0;
        }
        if (layout != null) {
            final int[] drawableState = this.getDrawableState();
            final ColorStateList p = this.p0;
            if (p != null) {
                this.o0.setColor(p.getColorForState(drawableState, 0));
            }
            this.o0.drawableState = drawableState;
            int width;
            if (g != null) {
                final Rect bounds = g.getBounds();
                width = bounds.left + bounds.right;
            }
            else {
                width = this.getWidth();
            }
            canvas.translate((float)(width / 2 - layout.getWidth() / 2), (float)((l2 + top + (n0 - bottom)) / 2 - layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"android.widget.Switch");
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.widget.Switch");
        if (Build$VERSION.SDK_INT < 30) {
            CharSequence charSequence;
            if (this.isChecked()) {
                charSequence = this.U;
            }
            else {
                charSequence = this.V;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                final CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                }
                else {
                    final StringBuilder text2 = new StringBuilder();
                    text2.append(text);
                    text2.append(' ');
                    text2.append(charSequence);
                    accessibilityNodeInfo.setText((CharSequence)text2);
                }
            }
        }
    }
    
    protected void onLayout(final boolean b, int l0, int max, int m0, int n0) {
        super.onLayout(b, l0, max, m0, n0);
        final Drawable g = this.G;
        l0 = 0;
        if (g != null) {
            final Rect v0 = this.v0;
            final Drawable i = this.L;
            if (i != null) {
                i.getPadding(v0);
            }
            else {
                v0.setEmpty();
            }
            final Rect d = androidx.appcompat.widget.b0.d(this.G);
            max = Math.max(0, d.left - v0.left);
            l0 = Math.max(0, d.right - v0.right);
        }
        else {
            max = 0;
        }
        if (a1.b((View)this)) {
            m0 = this.getPaddingLeft() + max;
            l0 = this.h0 + m0 - max - l0;
            max = m0;
            m0 = l0;
        }
        else {
            m0 = this.getWidth() - this.getPaddingRight() - l0;
            max = m0 - this.h0 + max + l0;
        }
        l0 = (this.getGravity() & 0x70);
        Label_0256: {
            if (l0 != 16) {
                if (l0 == 80) {
                    n0 = this.getHeight() - this.getPaddingBottom();
                    l0 = n0 - this.i0;
                    break Label_0256;
                }
                l0 = this.getPaddingTop();
                n0 = this.i0;
            }
            else {
                l0 = (this.getPaddingTop() + this.getHeight() - this.getPaddingBottom()) / 2;
                n0 = this.i0;
                l0 -= n0 / 2;
            }
            n0 += l0;
        }
        this.k0 = max;
        this.l0 = l0;
        this.n0 = n0;
        this.m0 = m0;
    }
    
    public void onMeasure(final int n, final int n2) {
        if (this.W) {
            if (this.q0 == null) {
                this.q0 = this.h(this.U);
            }
            if (this.r0 == null) {
                this.r0 = this.h(this.V);
            }
        }
        final Rect v0 = this.v0;
        final Drawable g = this.G;
        final int n3 = 0;
        int b;
        int intrinsicHeight;
        if (g != null) {
            g.getPadding(v0);
            b = this.G.getIntrinsicWidth() - v0.left - v0.right;
            intrinsicHeight = this.G.getIntrinsicHeight();
        }
        else {
            b = 0;
            intrinsicHeight = 0;
        }
        int a;
        if (this.W) {
            a = Math.max(this.q0.getWidth(), this.r0.getWidth()) + this.Q * 2;
        }
        else {
            a = 0;
        }
        this.j0 = Math.max(a, b);
        final Drawable l = this.L;
        int intrinsicHeight2;
        if (l != null) {
            l.getPadding(v0);
            intrinsicHeight2 = this.L.getIntrinsicHeight();
        }
        else {
            v0.setEmpty();
            intrinsicHeight2 = n3;
        }
        final int left = v0.left;
        final int right = v0.right;
        final Drawable g2 = this.G;
        int max = right;
        int max2 = left;
        if (g2 != null) {
            final Rect d = androidx.appcompat.widget.b0.d(g2);
            max2 = Math.max(left, d.left);
            max = Math.max(right, d.right);
        }
        final int max3 = Math.max(this.R, this.j0 * 2 + max2 + max);
        final int max4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.h0 = max3;
        this.i0 = max4;
        super.onMeasure(n, n2);
        if (this.getMeasuredHeight() < max4) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), max4);
        }
    }
    
    public void onPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence;
        if (this.isChecked()) {
            charSequence = this.U;
        }
        else {
            charSequence = this.V;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        this.e0.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
                else {
                    final int a0 = this.a0;
                    if (a0 != 1) {
                        if (a0 != 2) {
                            return super.onTouchEvent(motionEvent);
                        }
                        final float x = motionEvent.getX();
                        final int thumbScrollRange = this.getThumbScrollRange();
                        final float n = x - this.c0;
                        float n2;
                        if (thumbScrollRange != 0) {
                            n2 = n / thumbScrollRange;
                        }
                        else if (n > 0.0f) {
                            n2 = 1.0f;
                        }
                        else {
                            n2 = -1.0f;
                        }
                        float n3 = n2;
                        if (a1.b((View)this)) {
                            n3 = -n2;
                        }
                        final float f = f(this.g0 + n3, 0.0f, 1.0f);
                        if (f != this.g0) {
                            this.c0 = x;
                            this.setThumbPosition(f);
                        }
                        return true;
                    }
                    else {
                        final float x2 = motionEvent.getX();
                        final float y = motionEvent.getY();
                        if (Math.abs(x2 - this.c0) > this.b0 || Math.abs(y - this.d0) > this.b0) {
                            this.a0 = 2;
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                            this.c0 = x2;
                            this.d0 = y;
                            return true;
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            if (this.a0 == 2) {
                this.n(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.a0 = 0;
            this.e0.clear();
        }
        else {
            final float x3 = motionEvent.getX();
            final float y2 = motionEvent.getY();
            if (this.isEnabled() && this.g(x3, y2)) {
                this.a0 = 1;
                this.c0 = x3;
                this.d0 = y2;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setChecked(final boolean checked) {
        super.setChecked(checked);
        final boolean checked2 = this.isChecked();
        if (checked2) {
            this.j();
        }
        else {
            this.i();
        }
        if (this.getWindowToken() != null && androidx.core.view.j0.T0((View)this)) {
            this.a(checked2);
        }
        else {
            this.d();
            float thumbPosition;
            if (checked2) {
                thumbPosition = 1.0f;
            }
            else {
                thumbPosition = 0.0f;
            }
            this.setThumbPosition(thumbPosition);
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(r.H((TextView)this, actionMode$Callback));
    }
    
    public void setShowText(final boolean w) {
        if (this.W != w) {
            this.W = w;
            this.requestLayout();
        }
    }
    
    public void setSplitTrack(final boolean t) {
        this.T = t;
        this.invalidate();
    }
    
    public void setSwitchMinWidth(final int r) {
        this.R = r;
        this.requestLayout();
    }
    
    public void setSwitchPadding(final int s) {
        this.S = s;
        this.requestLayout();
    }
    
    public void setSwitchTypeface(final Typeface typeface) {
        if ((this.o0.getTypeface() != null && !this.o0.getTypeface().equals((Object)typeface)) || (this.o0.getTypeface() == null && typeface != null)) {
            this.o0.setTypeface(typeface);
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public void setTextOff(final CharSequence v) {
        this.V = v;
        this.requestLayout();
        if (!this.isChecked()) {
            this.i();
        }
    }
    
    public void setTextOn(final CharSequence u) {
        this.U = u;
        this.requestLayout();
        if (this.isChecked()) {
            this.j();
        }
    }
    
    public void setThumbDrawable(final Drawable g) {
        final Drawable g2 = this.G;
        if (g2 != null) {
            g2.setCallback((Drawable$Callback)null);
        }
        if ((this.G = g) != null) {
            g.setCallback((Drawable$Callback)this);
        }
        this.requestLayout();
    }
    
    void setThumbPosition(final float g0) {
        this.g0 = g0;
        this.invalidate();
    }
    
    public void setThumbResource(final int n) {
        this.setThumbDrawable(androidx.appcompat.content.res.a.d(this.getContext(), n));
    }
    
    public void setThumbTextPadding(final int q) {
        this.Q = q;
        this.requestLayout();
    }
    
    public void setThumbTintList(@k0 final ColorStateList h) {
        this.H = h;
        this.J = true;
        this.b();
    }
    
    public void setThumbTintMode(@k0 final PorterDuff$Mode i) {
        this.I = i;
        this.K = true;
        this.b();
    }
    
    public void setTrackDrawable(final Drawable l) {
        final Drawable i = this.L;
        if (i != null) {
            i.setCallback((Drawable$Callback)null);
        }
        if ((this.L = l) != null) {
            l.setCallback((Drawable$Callback)this);
        }
        this.requestLayout();
    }
    
    public void setTrackResource(final int n) {
        this.setTrackDrawable(androidx.appcompat.content.res.a.d(this.getContext(), n));
    }
    
    public void setTrackTintList(@k0 final ColorStateList m) {
        this.M = m;
        this.O = true;
        this.c();
    }
    
    public void setTrackTintMode(@k0 final PorterDuff$Mode n) {
        this.N = n;
        this.P = true;
        this.c();
    }
    
    public void toggle() {
        this.setChecked(this.isChecked() ^ true);
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.G || drawable == this.L;
    }
}
