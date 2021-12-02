// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.view.View$OnUnhandledKeyEventListener;
import androidx.collection.m;
import android.view.WindowInsetsController;
import android.view.View$OnApplyWindowInsetsListener;
import java.util.Iterator;
import java.util.Map;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.KeyEvent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.Collections;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.PointerIcon;
import android.view.WindowInsets;
import java.util.Collection;
import android.view.ViewParent;
import androidx.annotation.n0;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.g;
import java.util.Arrays;
import androidx.core.util.n;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.y;
import android.view.WindowManager;
import android.view.Display;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.view.ViewGroup;
import android.graphics.PorterDuff$Mode;
import java.util.ArrayList;
import androidx.core.view.accessibility.d;
import java.util.List;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.e;
import androidx.annotation.t;
import android.text.TextUtils;
import android.view.View$AccessibilityDelegate;
import android.view.View$DragShadowBuilder;
import android.content.ClipData;
import androidx.annotation.a1;
import androidx.annotation.k0;
import android.view.Window;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Build$VERSION;
import k.a;
import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;
import android.annotation.SuppressLint;

@SuppressLint({ "PrivateConstructorForUtilityClass" })
public class j0
{
    public static final int A = 1;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 16;
    public static final int G = 32;
    private static final AtomicInteger H;
    private static Field I;
    private static boolean J = false;
    private static Field K;
    private static boolean L = false;
    private static Method M;
    private static Method N;
    private static boolean O = false;
    private static WeakHashMap<View, String> P;
    private static WeakHashMap<View, p0> Q;
    private static Method R;
    private static Field S;
    private static boolean T = false;
    private static ThreadLocal<Rect> U;
    private static final int[] V;
    private static final c0 W;
    private static f X;
    private static final String a = "ViewCompat";
    @Deprecated
    public static final int b = 0;
    @Deprecated
    public static final int c = 1;
    @Deprecated
    public static final int d = 2;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 4;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    @Deprecated
    public static final int l = 0;
    @Deprecated
    public static final int m = 1;
    @Deprecated
    public static final int n = 2;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    @Deprecated
    public static final int s = 16777215;
    @Deprecated
    public static final int t = -16777216;
    @Deprecated
    public static final int u = 16;
    @Deprecated
    public static final int v = 16777216;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = 0;
    
    static {
        H = new AtomicInteger(1);
        j0.Q = null;
        j0.T = false;
        V = new int[] { k.a.e.b, k.a.e.c, k.a.e.n, k.a.e.y, k.a.e.B, k.a.e.C, k.a.e.D, k.a.e.E, k.a.e.F, k.a.e.G, k.a.e.d, k.a.e.e, k.a.e.f, k.a.e.g, k.a.e.h, k.a.e.i, k.a.e.j, k.a.e.k, k.a.e.l, k.a.e.m, k.a.e.o, k.a.e.p, k.a.e.q, k.a.e.r, k.a.e.s, k.a.e.t, k.a.e.u, k.a.e.v, k.a.e.w, k.a.e.x, k.a.e.z, k.a.e.A };
        W = new c0() {
            @Override
            public c a(@androidx.annotation.j0 final c c) {
                return c;
            }
        };
        j0.X = new f();
    }
    
    @Deprecated
    protected j0() {
    }
    
    public static void A(final View view) {
        if (Build$VERSION.SDK_INT >= 19) {
            g0(view);
        }
    }
    
    @k0
    public static y0 A0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 30) {
            return j0.k.a(view);
        }
        Context context = view.getContext();
        while (true) {
            final boolean b = context instanceof ContextWrapper;
            final y0 y0 = null;
            if (!b) {
                return null;
            }
            if (context instanceof Activity) {
                final Window window = ((Activity)context).getWindow();
                y0 a = y0;
                if (window != null) {
                    a = t0.a(window, view);
                }
                return a;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }
    }
    
    @a1
    public static void A1(final View view, final boolean b) {
        a().g(view, b);
    }
    
    public static boolean A2(@androidx.annotation.j0 final View view, final ClipData clipData, final View$DragShadowBuilder view$DragShadowBuilder, final Object o, final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            return view.startDragAndDrop(clipData, view$DragShadowBuilder, o, n);
        }
        return view.startDrag(clipData, view$DragShadowBuilder, o, n);
    }
    
    public static int B() {
        if (Build$VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        AtomicInteger h;
        int value;
        int newValue;
        do {
            h = j0.H;
            value = h.get();
            if ((newValue = value + 1) > 16777215) {
                newValue = 1;
            }
        } while (!h.compareAndSet(value, newValue));
        return value;
    }
    
    public static int B0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }
    
    public static void B1(@androidx.annotation.j0 final View view, final int accessibilityLiveRegion) {
        if (Build$VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(accessibilityLiveRegion);
        }
    }
    
    public static boolean B2(@androidx.annotation.j0 final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.startNestedScroll(n);
        }
        return view instanceof u && ((u)view).startNestedScroll(n);
    }
    
    @k0
    public static androidx.core.view.a C(@androidx.annotation.j0 final View view) {
        final View$AccessibilityDelegate d = D(view);
        if (d == null) {
            return null;
        }
        if (d instanceof androidx.core.view.a.a) {
            return ((androidx.core.view.a.a)d).a;
        }
        return new androidx.core.view.a(d);
    }
    
    @Deprecated
    public static float C0(final View view) {
        return view.getX();
    }
    
    @a1
    public static void C1(final View view, final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 19) {
            i1().g(view, charSequence);
            if (charSequence != null) {
                j0.X.a(view);
            }
            else {
                j0.X.d(view);
            }
        }
    }
    
    public static boolean C2(@androidx.annotation.j0 final View view, final int n, final int n2) {
        if (view instanceof androidx.core.view.s) {
            return ((androidx.core.view.s)view).f(n, n2);
        }
        return n2 == 0 && B2(view, n);
    }
    
    @k0
    private static View$AccessibilityDelegate D(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return E(view);
    }
    
    @Deprecated
    public static float D0(final View view) {
        return view.getY();
    }
    
    @Deprecated
    public static void D1(final View view, final boolean activated) {
        view.setActivated(activated);
    }
    
    private static g<CharSequence> D2() {
        return (g<CharSequence>)new g<CharSequence>(k.a.e.l0, CharSequence.class, 64, 30) {
            @androidx.annotation.p0(30)
            CharSequence i(final View view) {
                return view.getStateDescription();
            }
            
            @androidx.annotation.p0(30)
            void j(final View view, final CharSequence stateDescription) {
                view.setStateDescription(stateDescription);
            }
            
            boolean k(final CharSequence charSequence, final CharSequence charSequence2) {
                return TextUtils.equals(charSequence, charSequence2) ^ true;
            }
        };
    }
    
    @k0
    private static View$AccessibilityDelegate E(@androidx.annotation.j0 final View obj) {
        if (j0.T) {
            return null;
        }
        if (j0.S == null) {
            try {
                (j0.S = View.class.getDeclaredField("mAccessibilityDelegate")).setAccessible(true);
            }
            finally {
                j0.T = true;
                return null;
            }
        }
        try {
            final Object value = j0.S.get(obj);
            if (value instanceof View$AccessibilityDelegate) {
                return (View$AccessibilityDelegate)value;
            }
            return null;
        }
        finally {
            j0.T = true;
            return null;
        }
    }
    
    public static float E0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }
    
    @Deprecated
    public static void E1(final View view, @androidx.annotation.t(from = 0.0, to = 1.0) final float alpha) {
        view.setAlpha(alpha);
    }
    
    public static void E2(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        }
        else if (view instanceof u) {
            ((u)view).stopNestedScroll();
        }
    }
    
    public static int F(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }
    
    public static boolean F0(@androidx.annotation.j0 final View view) {
        return D(view) != null;
    }
    
    public static void F1(@androidx.annotation.j0 final View view, @k0 final String... autofillHints) {
        if (Build$VERSION.SDK_INT >= 26) {
            view.setAutofillHints(autofillHints);
        }
    }
    
    public static void F2(@androidx.annotation.j0 final View view, final int n) {
        if (view instanceof androidx.core.view.s) {
            ((androidx.core.view.s)view).g(n);
        }
        else if (n == 0) {
            E2(view);
        }
    }
    
    public static e G(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 16) {
            final AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
            if (accessibilityNodeProvider != null) {
                return new e(accessibilityNodeProvider);
            }
        }
        return null;
    }
    
    public static boolean G0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 26) {
            return view.hasExplicitFocusable();
        }
        return view.hasFocusable();
    }
    
    public static void G1(@androidx.annotation.j0 final View view, @k0 final Drawable drawable) {
        if (Build$VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        }
        else {
            view.setBackgroundDrawable(drawable);
        }
    }
    
    private static void G2(final View view) {
        final float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
    
    @a1
    public static CharSequence H(final View view) {
        return i1().f(view);
    }
    
    public static boolean H0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.hasNestedScrollingParent();
        }
        return view instanceof u && ((u)view).hasNestedScrollingParent();
    }
    
    public static void H1(@androidx.annotation.j0 final View view, final ColorStateList list) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            view.setBackgroundTintList(list);
            if (sdk_INT == 21) {
                final Drawable background = view.getBackground();
                final boolean b = view.getBackgroundTintList() != null || view.getBackgroundTintMode() != null;
                if (background != null && b) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }
        else if (view instanceof h0) {
            ((h0)view).setSupportBackgroundTintList(list);
        }
    }
    
    public static void H2(@androidx.annotation.j0 final View view, final View$DragShadowBuilder view$DragShadowBuilder) {
        if (Build$VERSION.SDK_INT >= 24) {
            view.updateDragShadow(view$DragShadowBuilder);
        }
    }
    
    private static List<d.a> I(final View view) {
        final int d0 = k.a.e.d0;
        ArrayList<d.a> list;
        if ((list = (ArrayList<d.a>)view.getTag(d0)) == null) {
            list = new ArrayList<d.a>();
            view.setTag(d0, (Object)list);
        }
        return list;
    }
    
    public static boolean I0(@androidx.annotation.j0 final View view, final int n) {
        if (view instanceof androidx.core.view.s) {
            ((androidx.core.view.s)view).d(n);
        }
        else if (n == 0) {
            return H0(view);
        }
        return false;
    }
    
    public static void I1(@androidx.annotation.j0 final View view, final PorterDuff$Mode porterDuff$Mode) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            view.setBackgroundTintMode(porterDuff$Mode);
            if (sdk_INT == 21) {
                final Drawable background = view.getBackground();
                final boolean b = view.getBackgroundTintList() != null || view.getBackgroundTintMode() != null;
                if (background != null && b) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }
        else if (view instanceof h0) {
            ((h0)view).setSupportBackgroundTintMode(porterDuff$Mode);
        }
    }
    
    @Deprecated
    public static float J(final View view) {
        return view.getAlpha();
    }
    
    public static boolean J0(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT >= 15 && view.hasOnClickListeners();
    }
    
    @Deprecated
    public static void J1(final ViewGroup obj, final boolean b) {
        if (j0.R == null) {
            try {
                j0.R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            }
            catch (NoSuchMethodException ex) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", (Throwable)ex);
            }
            j0.R.setAccessible(true);
        }
        try {
            j0.R.invoke(obj, b);
            return;
        }
        catch (InvocationTargetException obj) {}
        catch (IllegalArgumentException obj) {}
        catch (IllegalAccessException ex2) {}
        Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", (Throwable)obj);
    }
    
    private static int K(final View view, @androidx.annotation.j0 final CharSequence charSequence) {
        final List<d.a> i = I(view);
        for (int j = 0; j < i.size(); ++j) {
            if (TextUtils.equals(charSequence, i.get(j).c())) {
                return i.get(j).b();
            }
        }
        int n = 0;
        int n2 = -1;
        while (true) {
            final int[] v = j0.V;
            if (n >= v.length || n2 != -1) {
                break;
            }
            final int n3 = v[n];
            int k = 0;
            boolean b = true;
            while (k < i.size()) {
                b &= (i.get(k).b() != n3);
                ++k;
            }
            if (b) {
                n2 = n3;
            }
            ++n;
        }
        return n2;
    }
    
    public static boolean K0(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT < 16 || view.hasOverlappingRendering();
    }
    
    public static void K1(@androidx.annotation.j0 final View view, final Rect clipBounds) {
        if (Build$VERSION.SDK_INT >= 18) {
            view.setClipBounds(clipBounds);
        }
    }
    
    public static ColorStateList L(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        ColorStateList supportBackgroundTintList;
        if (view instanceof h0) {
            supportBackgroundTintList = ((h0)view).getSupportBackgroundTintList();
        }
        else {
            supportBackgroundTintList = null;
        }
        return supportBackgroundTintList;
    }
    
    public static boolean L0(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT >= 16 && view.hasTransientState();
    }
    
    public static void L1(@androidx.annotation.j0 final View view, final float elevation) {
        if (Build$VERSION.SDK_INT >= 21) {
            view.setElevation(elevation);
        }
    }
    
    public static PorterDuff$Mode M(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        PorterDuff$Mode supportBackgroundTintMode;
        if (view instanceof h0) {
            supportBackgroundTintMode = ((h0)view).getSupportBackgroundTintMode();
        }
        else {
            supportBackgroundTintMode = null;
        }
        return supportBackgroundTintMode;
    }
    
    @a1
    public static boolean M0(final View view) {
        final Boolean b = a().f(view);
        return b != null && b;
    }
    
    @Deprecated
    public static void M1(final View view, final boolean fitsSystemWindows) {
        view.setFitsSystemWindows(fitsSystemWindows);
    }
    
    @k0
    public static Rect N(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }
    
    public static boolean N0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }
    
    public static void N1(@androidx.annotation.j0 final View view, final boolean focusedByDefault) {
        if (Build$VERSION.SDK_INT >= 26) {
            view.setFocusedByDefault(focusedByDefault);
        }
    }
    
    @k0
    public static Display O(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (N0(view)) {
            return ((WindowManager)view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }
    
    public static boolean O0(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT >= 26 && view.isFocusedByDefault();
    }
    
    public static void O1(@androidx.annotation.j0 final View view, final boolean hasTransientState) {
        if (Build$VERSION.SDK_INT >= 16) {
            view.setHasTransientState(hasTransientState);
        }
    }
    
    public static float P(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }
    
    public static boolean P0(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT < 21 || view.isImportantForAccessibility();
    }
    
    public static void P1(@androidx.annotation.j0 final View view, final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        int importantForAccessibility;
        if (sdk_INT >= 19) {
            importantForAccessibility = n;
        }
        else {
            if (sdk_INT < 16) {
                return;
            }
            if ((importantForAccessibility = n) == 4) {
                importantForAccessibility = 2;
            }
        }
        view.setImportantForAccessibility(importantForAccessibility);
    }
    
    private static Rect Q() {
        if (j0.U == null) {
            j0.U = new ThreadLocal<Rect>();
        }
        Rect value;
        if ((value = j0.U.get()) == null) {
            value = new Rect();
            j0.U.set(value);
        }
        value.setEmpty();
        return value;
    }
    
    public static boolean Q0(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT < 26 || view.isImportantForAutofill();
    }
    
    public static void Q1(@androidx.annotation.j0 final View view, final int importantForAutofill) {
        if (Build$VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(importantForAutofill);
        }
    }
    
    private static c0 R(@androidx.annotation.j0 final View view) {
        if (view instanceof c0) {
            return (c0)view;
        }
        return j0.W;
    }
    
    public static boolean R0(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT >= 18 && view.isInLayout();
    }
    
    public static void R1(@androidx.annotation.j0 final View view, final boolean keyboardNavigationCluster) {
        if (Build$VERSION.SDK_INT >= 26) {
            view.setKeyboardNavigationCluster(keyboardNavigationCluster);
        }
    }
    
    public static boolean S(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT >= 16 && view.getFitsSystemWindows();
    }
    
    public static boolean S0(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT >= 26 && view.isKeyboardNavigationCluster();
    }
    
    public static void S1(@androidx.annotation.j0 final View view, @y final int labelFor) {
        if (Build$VERSION.SDK_INT >= 17) {
            view.setLabelFor(labelFor);
        }
    }
    
    public static int T(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }
    
    public static boolean T0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }
    
    public static void T1(@androidx.annotation.j0 final View view, final Paint layerPaint) {
        if (Build$VERSION.SDK_INT >= 17) {
            view.setLayerPaint(layerPaint);
        }
        else {
            view.setLayerType(view.getLayerType(), layerPaint);
            view.invalidate();
        }
    }
    
    @SuppressLint({ "InlinedApi" })
    public static int U(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }
    
    public static boolean U0(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT >= 19 && view.isLayoutDirectionResolved();
    }
    
    @Deprecated
    public static void U1(final View view, final int n, final Paint paint) {
        view.setLayerType(n, paint);
    }
    
    public static int V(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 17) {
            return view.getLabelFor();
        }
        return 0;
    }
    
    public static boolean V0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        return view instanceof u && ((u)view).isNestedScrollingEnabled();
    }
    
    public static void V1(@androidx.annotation.j0 final View view, final int layoutDirection) {
        if (Build$VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(layoutDirection);
        }
    }
    
    @Deprecated
    public static int W(final View view) {
        return view.getLayerType();
    }
    
    @Deprecated
    public static boolean W0(final View view) {
        return view.isOpaque();
    }
    
    public static void W1(@androidx.annotation.j0 final View view, final boolean b) {
        if (Build$VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(b);
        }
        else if (view instanceof u) {
            ((u)view).setNestedScrollingEnabled(b);
        }
    }
    
    public static int X(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }
    
    public static boolean X0(@androidx.annotation.j0 final View view) {
        return Build$VERSION.SDK_INT >= 17 && view.isPaddingRelative();
    }
    
    public static void X1(@androidx.annotation.j0 final View view, final int nextClusterForwardId) {
        if (Build$VERSION.SDK_INT >= 26) {
            view.setNextClusterForwardId(nextClusterForwardId);
        }
    }
    
    @Deprecated
    @k0
    public static Matrix Y(final View view) {
        return view.getMatrix();
    }
    
    @a1
    public static boolean Y0(final View view) {
        final Boolean b = y1().f(view);
        return b != null && b;
    }
    
    public static void Y1(@androidx.annotation.j0 final View view, @k0 final a0 a0) {
        if (Build$VERSION.SDK_INT >= 21) {
            j0.h.d(view, a0);
        }
    }
    
    @Deprecated
    public static int Z(final View view) {
        return view.getMeasuredHeightAndState();
    }
    
    @Deprecated
    public static void Z0(final View view) {
        view.jumpDrawablesToCurrentState();
    }
    
    public static void Z1(@androidx.annotation.j0 final View view, @k0 final String[] array, @k0 final b0 b0) {
        String[] a = null;
        Label_0013: {
            if (array != null) {
                a = array;
                if (array.length != 0) {
                    break Label_0013;
                }
            }
            a = null;
        }
        final int n = 0;
        if (b0 != null) {
            androidx.core.util.n.b(a != null, "When the listener is set, MIME types must also be set");
        }
        if (a != null) {
            final int length = a.length;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= length) {
                    break;
                }
                if (a[n2].startsWith("*")) {
                    n3 = 1;
                    break;
                }
                ++n2;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("A MIME type set here must not start with *: ");
            sb.append(Arrays.toString(a));
            androidx.core.util.n.b((boolean)((n3 ^ 0x1) != 0x0), sb.toString());
        }
        view.setTag(k.a.e.j0, (Object)a);
        view.setTag(k.a.e.i0, (Object)b0);
    }
    
    private static g<Boolean> a() {
        return (g<Boolean>)new g<Boolean>(k.a.e.f0, Boolean.class, 28) {
            @androidx.annotation.p0(28)
            Boolean i(final View view) {
                return view.isAccessibilityHeading();
            }
            
            @androidx.annotation.p0(28)
            void j(final View view, final Boolean b) {
                view.setAccessibilityHeading((boolean)b);
            }
            
            boolean k(final Boolean b, final Boolean b2) {
                return ((g)this).a(b, b2) ^ true;
            }
        };
    }
    
    @Deprecated
    public static int a0(final View view) {
        return view.getMeasuredState();
    }
    
    public static View a1(@androidx.annotation.j0 final View view, final View view2, final int n) {
        if (Build$VERSION.SDK_INT >= 26) {
            return view.keyboardNavigationClusterSearch(view2, n);
        }
        return null;
    }
    
    @Deprecated
    public static void a2(final View view, final int overScrollMode) {
        view.setOverScrollMode(overScrollMode);
    }
    
    public static int b(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final CharSequence charSequence, @androidx.annotation.j0 final androidx.core.view.accessibility.g g) {
        final int k = K(view, charSequence);
        if (k != -1) {
            c(view, new d.a(k, charSequence, g));
        }
        return k;
    }
    
    @Deprecated
    public static int b0(final View view) {
        return view.getMeasuredWidthAndState();
    }
    
    @androidx.annotation.p0(19)
    static void b1(final View source, final int n) {
        final AccessibilityManager accessibilityManager = (AccessibilityManager)source.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        final boolean b = H(source) != null && source.getVisibility() == 0;
        final int f = F(source);
        int eventType = 32;
        if (f == 0 && !b) {
            if (n == 32) {
                final AccessibilityEvent obtain = AccessibilityEvent.obtain();
                source.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                obtain.setContentChangeTypes(n);
                obtain.setSource(source);
                source.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(H(source));
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
            else if (source.getParent() != null) {
                try {
                    source.getParent().notifySubtreeAccessibilityStateChanged(source, source, n);
                }
                catch (AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(source.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), (Throwable)abstractMethodError);
                }
            }
        }
        else {
            final AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!b) {
                eventType = 2048;
            }
            obtain2.setEventType(eventType);
            obtain2.setContentChangeTypes(n);
            if (b) {
                obtain2.getText().add(H(source));
                v2(source);
            }
            source.sendAccessibilityEventUnchecked(obtain2);
        }
    }
    
    public static void b2(@androidx.annotation.j0 final View view, @n0 final int n, @n0 final int n2, @n0 final int n3, @n0 final int n4) {
        if (Build$VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(n, n2, n3, n4);
        }
        else {
            view.setPadding(n, n2, n3, n4);
        }
    }
    
    private static void c(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final d.a a) {
        if (Build$VERSION.SDK_INT >= 21) {
            g0(view);
            q1(a.b(), view);
            I(view).add(a);
            b1(view, 0);
        }
    }
    
    public static int c0(@androidx.annotation.j0 final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          16
        //     5: if_icmplt       13
        //     8: aload_0        
        //     9: invokevirtual   android/view/View.getMinimumHeight:()I
        //    12: ireturn        
        //    13: getstatic       androidx/core/view/j0.L:Z
        //    16: ifne            41
        //    19: ldc             Landroid/view/View;.class
        //    21: ldc_w           "mMinHeight"
        //    24: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    27: astore_1       
        //    28: aload_1        
        //    29: putstatic       androidx/core/view/j0.K:Ljava/lang/reflect/Field;
        //    32: aload_1        
        //    33: iconst_1       
        //    34: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    37: iconst_1       
        //    38: putstatic       androidx/core/view/j0.L:Z
        //    41: getstatic       androidx/core/view/j0.K:Ljava/lang/reflect/Field;
        //    44: astore_1       
        //    45: aload_1        
        //    46: ifnull          63
        //    49: aload_1        
        //    50: aload_0        
        //    51: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    54: checkcast       Ljava/lang/Integer;
        //    57: invokevirtual   java/lang/Integer.intValue:()I
        //    60: istore_2       
        //    61: iload_2        
        //    62: ireturn        
        //    63: iconst_0       
        //    64: ireturn        
        //    65: astore_1       
        //    66: goto            37
        //    69: astore_0       
        //    70: goto            63
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  19     37     65     69     Ljava/lang/NoSuchFieldException;
        //  49     61     69     73     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void c1(@androidx.annotation.j0 final View view, final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            view.offsetLeftAndRight(n);
        }
        else if (sdk_INT >= 21) {
            final Rect q = Q();
            boolean b = false;
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                final View view2 = (View)parent;
                q.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                b = (q.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ true);
            }
            l(view, n);
            if (b && q.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View)parent).invalidate(q);
            }
        }
        else {
            l(view, n);
        }
    }
    
    @Deprecated
    public static void c2(final View view, final float pivotX) {
        view.setPivotX(pivotX);
    }
    
    public static void d(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final Collection<View> collection, final int n) {
        if (Build$VERSION.SDK_INT >= 26) {
            view.addKeyboardNavigationClusters((Collection)collection, n);
        }
    }
    
    public static int d0(@androidx.annotation.j0 final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          16
        //     5: if_icmplt       13
        //     8: aload_0        
        //     9: invokevirtual   android/view/View.getMinimumWidth:()I
        //    12: ireturn        
        //    13: getstatic       androidx/core/view/j0.J:Z
        //    16: ifne            41
        //    19: ldc             Landroid/view/View;.class
        //    21: ldc_w           "mMinWidth"
        //    24: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    27: astore_1       
        //    28: aload_1        
        //    29: putstatic       androidx/core/view/j0.I:Ljava/lang/reflect/Field;
        //    32: aload_1        
        //    33: iconst_1       
        //    34: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    37: iconst_1       
        //    38: putstatic       androidx/core/view/j0.J:Z
        //    41: getstatic       androidx/core/view/j0.I:Ljava/lang/reflect/Field;
        //    44: astore_1       
        //    45: aload_1        
        //    46: ifnull          63
        //    49: aload_1        
        //    50: aload_0        
        //    51: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    54: checkcast       Ljava/lang/Integer;
        //    57: invokevirtual   java/lang/Integer.intValue:()I
        //    60: istore_2       
        //    61: iload_2        
        //    62: ireturn        
        //    63: iconst_0       
        //    64: ireturn        
        //    65: astore_1       
        //    66: goto            37
        //    69: astore_0       
        //    70: goto            63
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  19     37     65     69     Ljava/lang/NoSuchFieldException;
        //  49     61     69     73     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void d1(@androidx.annotation.j0 final View view, final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            view.offsetTopAndBottom(n);
        }
        else if (sdk_INT >= 21) {
            final Rect q = Q();
            boolean b = false;
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                final View view2 = (View)parent;
                q.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                b = (q.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ true);
            }
            m(view, n);
            if (b && q.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View)parent).invalidate(q);
            }
        }
        else {
            m(view, n);
        }
    }
    
    @Deprecated
    public static void d2(final View view, final float pivotY) {
        view.setPivotY(pivotY);
    }
    
    public static void e(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final q e) {
        if (Build$VERSION.SDK_INT >= 28) {
            j0.l.a(view, e);
            return;
        }
        final int o0 = k.a.e.o0;
        ArrayList<q> list;
        if ((list = (ArrayList<q>)view.getTag(o0)) == null) {
            list = new ArrayList<q>();
            view.setTag(o0, (Object)list);
        }
        list.add(e);
        if (list.size() == 1) {
            j0.t.h(view);
        }
    }
    
    public static int e0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 26) {
            return view.getNextClusterForwardId();
        }
        return -1;
    }
    
    @androidx.annotation.j0
    public static x0 e1(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final x0 x0) {
        if (Build$VERSION.SDK_INT >= 21) {
            final WindowInsets j = x0.J();
            if (j != null) {
                final WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(j);
                if (!onApplyWindowInsets.equals((Object)j)) {
                    return x0.L(onApplyWindowInsets, view);
                }
            }
        }
        return x0;
    }
    
    public static void e2(@androidx.annotation.j0 final View view, final e0 e0) {
        if (Build$VERSION.SDK_INT >= 24) {
            Object b;
            if (e0 != null) {
                b = e0.b();
            }
            else {
                b = null;
            }
            view.setPointerIcon((PointerIcon)b);
        }
    }
    
    @androidx.annotation.j0
    public static p0 f(@androidx.annotation.j0 final View view) {
        if (j0.Q == null) {
            j0.Q = new WeakHashMap<View, p0>();
        }
        p0 value;
        if ((value = j0.Q.get(view)) == null) {
            value = new p0(view);
            j0.Q.put(view, value);
        }
        return value;
    }
    
    @k0
    public static String[] f0(@androidx.annotation.j0 final View view) {
        return (String[])view.getTag(k.a.e.j0);
    }
    
    @Deprecated
    public static void f1(final View view, final AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }
    
    @Deprecated
    public static void f2(final View view, final float rotation) {
        view.setRotation(rotation);
    }
    
    private static void g() {
        try {
            j0.M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", (Class<?>[])new Class[0]);
            j0.N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", (Class<?>[])new Class[0]);
        }
        catch (NoSuchMethodException ex) {
            Log.e("ViewCompat", "Couldn't find method", (Throwable)ex);
        }
        j0.O = true;
    }
    
    static androidx.core.view.a g0(@androidx.annotation.j0 final View view) {
        androidx.core.view.a c;
        if ((c = C(view)) == null) {
            c = new androidx.core.view.a();
        }
        z1(view, c);
        return c;
    }
    
    public static void g1(@androidx.annotation.j0 final View view, final d d) {
        view.onInitializeAccessibilityNodeInfo(d.U1());
    }
    
    @Deprecated
    public static void g2(final View view, final float rotationX) {
        view.setRotationX(rotationX);
    }
    
    @Deprecated
    public static boolean h(final View view, final int n) {
        return view.canScrollHorizontally(n);
    }
    
    @Deprecated
    public static int h0(final View view) {
        return view.getOverScrollMode();
    }
    
    @Deprecated
    public static void h1(final View view, final AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    @Deprecated
    public static void h2(final View view, final float rotationY) {
        view.setRotationY(rotationY);
    }
    
    @Deprecated
    public static boolean i(final View view, final int n) {
        return view.canScrollVertically(n);
    }
    
    @n0
    public static int i0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }
    
    private static g<CharSequence> i1() {
        return (g<CharSequence>)new g<CharSequence>(k.a.e.g0, CharSequence.class, 8, 28) {
            @androidx.annotation.p0(28)
            CharSequence i(final View view) {
                return view.getAccessibilityPaneTitle();
            }
            
            @androidx.annotation.p0(28)
            void j(final View view, final CharSequence accessibilityPaneTitle) {
                view.setAccessibilityPaneTitle(accessibilityPaneTitle);
            }
            
            boolean k(final CharSequence charSequence, final CharSequence charSequence2) {
                return TextUtils.equals(charSequence, charSequence2) ^ true;
            }
        };
    }
    
    @Deprecated
    public static void i2(final View view, final boolean saveFromParentEnabled) {
        view.setSaveFromParentEnabled(saveFromParentEnabled);
    }
    
    public static void j(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 24) {
            view.cancelDragAndDrop();
        }
    }
    
    @n0
    public static int j0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }
    
    public static boolean j1(@androidx.annotation.j0 final View view, final int n, final Bundle bundle) {
        return Build$VERSION.SDK_INT >= 16 && view.performAccessibilityAction(n, bundle);
    }
    
    @Deprecated
    public static void j2(final View view, final float scaleX) {
        view.setScaleX(scaleX);
    }
    
    @Deprecated
    public static int k(final int n, final int n2) {
        return View.combineMeasuredStates(n, n2);
    }
    
    public static ViewParent k0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }
    
    @k0
    public static c k1(@androidx.annotation.j0 final View view, @androidx.annotation.j0 c a) {
        if (Log.isLoggable("ViewCompat", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(a);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
            Log.d("ViewCompat", sb.toString());
        }
        final b0 b0 = (b0)view.getTag(k.a.e.i0);
        if (b0 != null) {
            a = b0.a(view, a);
            c a2;
            if (a == null) {
                a2 = null;
            }
            else {
                a2 = R(view).a(a);
            }
            return a2;
        }
        return R(view).a(a);
    }
    
    @Deprecated
    public static void k2(final View view, final float scaleY) {
        view.setScaleY(scaleY);
    }
    
    private static void l(final View view, final int n) {
        view.offsetLeftAndRight(n);
        if (view.getVisibility() == 0) {
            G2(view);
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                G2((View)parent);
            }
        }
    }
    
    @Deprecated
    public static float l0(final View view) {
        return view.getPivotX();
    }
    
    public static void l1(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        }
        else {
            view.postInvalidate();
        }
    }
    
    @a1
    public static void l2(final View view, final boolean b) {
        y1().g(view, b);
    }
    
    private static void m(final View view, final int n) {
        view.offsetTopAndBottom(n);
        if (view.getVisibility() == 0) {
            G2(view);
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                G2((View)parent);
            }
        }
    }
    
    @Deprecated
    public static float m0(final View view) {
        return view.getPivotY();
    }
    
    public static void m1(@androidx.annotation.j0 final View view, final int n, final int n2, final int n3, final int n4) {
        if (Build$VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(n, n2, n3, n4);
        }
        else {
            view.postInvalidate(n, n2, n3, n4);
        }
    }
    
    public static void m2(@androidx.annotation.j0 final View view, final int scrollIndicators) {
        if (Build$VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(scrollIndicators);
        }
    }
    
    @androidx.annotation.j0
    public static x0 n(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final x0 x0, @androidx.annotation.j0 final Rect rect) {
        if (Build$VERSION.SDK_INT >= 21) {
            return j0.h.b(view, x0, rect);
        }
        return x0;
    }
    
    @k0
    public static x0 n0(@androidx.annotation.j0 final View view) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            return j0.i.a(view);
        }
        if (sdk_INT >= 21) {
            return j0.h.c(view);
        }
        return null;
    }
    
    public static void n1(@androidx.annotation.j0 final View view, final Runnable runnable) {
        if (Build$VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        }
        else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }
    
    public static void n2(@androidx.annotation.j0 final View view, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(n, n2);
        }
    }
    
    @androidx.annotation.j0
    public static x0 o(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final x0 x0) {
        if (Build$VERSION.SDK_INT >= 21) {
            final WindowInsets j = x0.J();
            if (j != null) {
                final WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(j);
                if (!dispatchApplyWindowInsets.equals((Object)j)) {
                    return x0.L(dispatchApplyWindowInsets, view);
                }
            }
        }
        return x0;
    }
    
    @Deprecated
    public static float o0(final View view) {
        return view.getRotation();
    }
    
    public static void o1(@androidx.annotation.j0 final View view, final Runnable runnable, final long n) {
        if (Build$VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, n);
        }
        else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + n);
        }
    }
    
    @a1
    public static void o2(@androidx.annotation.j0 final View view, @k0 final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 19) {
            D2().g(view, charSequence);
        }
    }
    
    public static void p(@androidx.annotation.j0 final View obj) {
        if (Build$VERSION.SDK_INT >= 24) {
            obj.dispatchFinishTemporaryDetach();
        }
        else {
            if (!j0.O) {
                g();
            }
            final Method n = j0.N;
            if (n != null) {
                try {
                    n.invoke(obj, new Object[0]);
                }
                catch (Exception ex) {
                    Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", (Throwable)ex);
                }
            }
            else {
                obj.onFinishTemporaryDetach();
            }
        }
    }
    
    @Deprecated
    public static float p0(final View view) {
        return view.getRotationX();
    }
    
    public static void p1(@androidx.annotation.j0 final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 21) {
            q1(n, view);
            b1(view, 0);
        }
    }
    
    public static void p2(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final List<Rect> systemGestureExclusionRects) {
        if (Build$VERSION.SDK_INT >= 29) {
            view.setSystemGestureExclusionRects((List)systemGestureExclusionRects);
        }
    }
    
    public static boolean q(@androidx.annotation.j0 final View view, final float n, final float n2, final boolean b) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.dispatchNestedFling(n, n2, b);
        }
        return view instanceof u && ((u)view).dispatchNestedFling(n, n2, b);
    }
    
    @Deprecated
    public static float q0(final View view) {
        return view.getRotationY();
    }
    
    private static void q1(final int n, final View view) {
        final List<d.a> i = I(view);
        for (int j = 0; j < i.size(); ++j) {
            if (i.get(j).b() == n) {
                i.remove(j);
                break;
            }
        }
    }
    
    public static void q2(@androidx.annotation.j0 final View view, @k0 final CharSequence tooltipText) {
        if (Build$VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
        }
    }
    
    public static boolean r(@androidx.annotation.j0 final View view, final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.dispatchNestedPreFling(n, n2);
        }
        return view instanceof u && ((u)view).dispatchNestedPreFling(n, n2);
    }
    
    @Deprecated
    public static float r0(final View view) {
        return view.getScaleX();
    }
    
    public static void r1(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final q o) {
        if (Build$VERSION.SDK_INT >= 28) {
            j0.l.b(view, o);
            return;
        }
        final ArrayList list = (ArrayList)view.getTag(k.a.e.o0);
        if (list != null) {
            list.remove(o);
            if (list.size() == 0) {
                j0.t.i(view);
            }
        }
    }
    
    public static void r2(@androidx.annotation.j0 final View key, final String s) {
        if (Build$VERSION.SDK_INT >= 21) {
            key.setTransitionName(s);
        }
        else {
            if (j0.P == null) {
                j0.P = new WeakHashMap<View, String>();
            }
            j0.P.put(key, s);
        }
    }
    
    public static boolean s(@androidx.annotation.j0 final View view, final int n, final int n2, @k0 final int[] array, @k0 final int[] array2) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.dispatchNestedPreScroll(n, n2, array, array2);
        }
        return view instanceof u && ((u)view).dispatchNestedPreScroll(n, n2, array, array2);
    }
    
    @Deprecated
    public static float s0(final View view) {
        return view.getScaleY();
    }
    
    public static void s1(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final d.a a, @k0 final CharSequence charSequence, @k0 final androidx.core.view.accessibility.g g) {
        if (g == null && charSequence == null) {
            p1(view, a.b());
        }
        else {
            c(view, a.a(charSequence, g));
        }
    }
    
    @Deprecated
    public static void s2(final View view, final float translationX) {
        view.setTranslationX(translationX);
    }
    
    public static boolean t(@androidx.annotation.j0 final View view, final int n, final int n2, @k0 final int[] array, @k0 final int[] array2, final int n3) {
        if (view instanceof androidx.core.view.s) {
            return ((androidx.core.view.s)view).b(n, n2, array, array2, n3);
        }
        return n3 == 0 && s(view, n, n2, array, array2);
    }
    
    public static int t0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 23) {
            return view.getScrollIndicators();
        }
        return 0;
    }
    
    public static void t1(@androidx.annotation.j0 final View view) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 20) {
            view.requestApplyInsets();
        }
        else if (sdk_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }
    
    @Deprecated
    public static void t2(final View view, final float translationY) {
        view.setTranslationY(translationY);
    }
    
    public static void u(@androidx.annotation.j0 final View view, final int n, final int n2, final int n3, final int n4, @k0 final int[] array, final int n5, @androidx.annotation.j0 final int[] array2) {
        if (view instanceof androidx.core.view.t) {
            ((androidx.core.view.t)view).c(n, n2, n3, n4, array, n5, array2);
        }
        else {
            w(view, n, n2, n3, n4, array, n5);
        }
    }
    
    @a1
    @k0
    public static final CharSequence u0(@androidx.annotation.j0 final View view) {
        return D2().f(view);
    }
    
    @androidx.annotation.j0
    public static <T extends View> T u1(@androidx.annotation.j0 View viewById, @y final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return (T)viewById.requireViewById(n);
        }
        viewById = viewById.findViewById(n);
        if (viewById != null) {
            return (T)viewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }
    
    public static void u2(@androidx.annotation.j0 final View view, final float translationZ) {
        if (Build$VERSION.SDK_INT >= 21) {
            view.setTranslationZ(translationZ);
        }
    }
    
    public static boolean v(@androidx.annotation.j0 final View view, final int n, final int n2, final int n3, final int n4, @k0 final int[] array) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.dispatchNestedScroll(n, n2, n3, n4, array);
        }
        return view instanceof u && ((u)view).dispatchNestedScroll(n, n2, n3, n4, array);
    }
    
    @androidx.annotation.j0
    public static List<Rect> v0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 29) {
            return (List<Rect>)view.getSystemGestureExclusionRects();
        }
        return Collections.emptyList();
    }
    
    @Deprecated
    public static int v1(final int n, final int n2, final int n3) {
        return View.resolveSizeAndState(n, n2, n3);
    }
    
    private static void v2(final View view) {
        if (T(view) == 0) {
            P1(view, 1);
        }
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
            if (T((View)viewParent) == 4) {
                P1(view, 2);
                break;
            }
        }
    }
    
    public static boolean w(@androidx.annotation.j0 final View view, final int n, final int n2, final int n3, final int n4, @k0 final int[] array, final int n5) {
        if (view instanceof androidx.core.view.s) {
            return ((androidx.core.view.s)view).a(n, n2, n3, n4, array, n5);
        }
        return n5 == 0 && v(view, n, n2, n3, n4, array);
    }
    
    @k0
    public static String w0(@androidx.annotation.j0 final View key) {
        if (Build$VERSION.SDK_INT >= 21) {
            return key.getTransitionName();
        }
        final WeakHashMap<View, String> p = j0.P;
        if (p == null) {
            return null;
        }
        return p.get(key);
    }
    
    public static boolean w1(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 26) {
            return view.restoreDefaultFocus();
        }
        return view.requestFocus();
    }
    
    public static void w2(@androidx.annotation.j0 final View view, @k0 final u0.b b) {
        u0.h(view, b);
    }
    
    public static void x(@androidx.annotation.j0 final View obj) {
        if (Build$VERSION.SDK_INT >= 24) {
            obj.dispatchStartTemporaryDetach();
        }
        else {
            if (!j0.O) {
                g();
            }
            final Method m = j0.M;
            if (m != null) {
                try {
                    m.invoke(obj, new Object[0]);
                }
                catch (Exception ex) {
                    Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", (Throwable)ex);
                }
            }
            else {
                obj.onStartTemporaryDetach();
            }
        }
    }
    
    @Deprecated
    public static float x0(final View view) {
        return view.getTranslationX();
    }
    
    public static void x1(@androidx.annotation.j0 final View view, @SuppressLint({ "ContextFirst" }) @androidx.annotation.j0 final Context context, @androidx.annotation.j0 final int[] array, @k0 final AttributeSet set, @androidx.annotation.j0 final TypedArray typedArray, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 29) {
            j0.j.a(view, context, array, set, typedArray, n, n2);
        }
    }
    
    @Deprecated
    public static void x2(final View view, final float x) {
        view.setX(x);
    }
    
    @a1
    static boolean y(final View view, final KeyEvent keyEvent) {
        return Build$VERSION.SDK_INT < 28 && j0.t.a(view).b(view, keyEvent);
    }
    
    @Deprecated
    public static float y0(final View view) {
        return view.getTranslationY();
    }
    
    private static g<Boolean> y1() {
        return (g<Boolean>)new g<Boolean>(k.a.e.k0, Boolean.class, 28) {
            @androidx.annotation.p0(28)
            Boolean i(final View view) {
                return view.isScreenReaderFocusable();
            }
            
            @androidx.annotation.p0(28)
            void j(final View view, final Boolean b) {
                view.setScreenReaderFocusable((boolean)b);
            }
            
            boolean k(final Boolean b, final Boolean b2) {
                return ((g)this).a(b, b2) ^ true;
            }
        };
    }
    
    @Deprecated
    public static void y2(final View view, final float y) {
        view.setY(y);
    }
    
    @a1
    static boolean z(final View view, final KeyEvent keyEvent) {
        return Build$VERSION.SDK_INT < 28 && j0.t.a(view).f(keyEvent);
    }
    
    public static float z0(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }
    
    public static void z1(@androidx.annotation.j0 final View view, final androidx.core.view.a a) {
        androidx.core.view.a a2 = a;
        if (a == null) {
            a2 = a;
            if (D(view) instanceof androidx.core.view.a.a) {
                a2 = new androidx.core.view.a();
            }
        }
        View$AccessibilityDelegate d;
        if (a2 == null) {
            d = null;
        }
        else {
            d = a2.d();
        }
        view.setAccessibilityDelegate(d);
    }
    
    public static void z2(@androidx.annotation.j0 final View view, final float z) {
        if (Build$VERSION.SDK_INT >= 21) {
            view.setZ(z);
        }
    }
    
    static class f implements ViewTreeObserver$OnGlobalLayoutListener, View$OnAttachStateChangeListener
    {
        private WeakHashMap<View, Boolean> G;
        
        f() {
            this.G = new WeakHashMap<View, Boolean>();
        }
        
        @androidx.annotation.p0(19)
        private void b(final View key, final boolean b) {
            final boolean b2 = key.getVisibility() == 0;
            if (b != b2) {
                int n;
                if (b2) {
                    n = 16;
                }
                else {
                    n = 32;
                }
                j0.b1(key, n);
                this.G.put(key, b2);
            }
        }
        
        @androidx.annotation.p0(19)
        private void c(final View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        
        @androidx.annotation.p0(19)
        private void e(final View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        
        @androidx.annotation.p0(19)
        void a(final View key) {
            this.G.put(key, key.getVisibility() == 0);
            key.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            if (key.isAttachedToWindow()) {
                this.c(key);
            }
        }
        
        @androidx.annotation.p0(19)
        void d(final View key) {
            this.G.remove(key);
            key.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            this.e(key);
        }
        
        @androidx.annotation.p0(19)
        public void onGlobalLayout() {
            if (Build$VERSION.SDK_INT < 28) {
                for (final Map.Entry<View, Boolean> entry : this.G.entrySet()) {
                    this.b(entry.getKey(), entry.getValue());
                }
            }
        }
        
        @androidx.annotation.p0(19)
        public void onViewAttachedToWindow(final View view) {
            this.c(view);
        }
        
        public void onViewDetachedFromWindow(final View view) {
        }
    }
    
    abstract static class g<T>
    {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;
        
        g(final int n, final Class<T> clazz, final int n2) {
            this(n, clazz, 0, n2);
        }
        
        g(final int a, final Class<T> b, final int d, final int c) {
            this.a = a;
            this.b = b;
            this.d = d;
            this.c = c;
        }
        
        private boolean b() {
            return Build$VERSION.SDK_INT >= 19;
        }
        
        private boolean c() {
            return Build$VERSION.SDK_INT >= this.c;
        }
        
        boolean a(final Boolean b, final Boolean b2) {
            boolean b3 = false;
            if ((b != null && b) == (b2 != null && b2)) {
                b3 = true;
            }
            return b3;
        }
        
        abstract T d(final View p0);
        
        abstract void e(final View p0, final T p1);
        
        T f(final View view) {
            if (this.c()) {
                return this.d(view);
            }
            if (this.b()) {
                final Object tag = view.getTag(this.a);
                if (this.b.isInstance(tag)) {
                    return (T)tag;
                }
            }
            return null;
        }
        
        void g(final View view, final T t) {
            if (this.c()) {
                this.e(view, t);
            }
            else if (this.b() && this.h(this.f(view), t)) {
                j0.g0(view);
                view.setTag(this.a, (Object)t);
                j0.b1(view, this.d);
            }
        }
        
        boolean h(final T obj, final T t) {
            return t.equals(obj) ^ true;
        }
    }
    
    @androidx.annotation.p0(21)
    private static class h
    {
        static void a(@androidx.annotation.j0 final WindowInsets windowInsets, @androidx.annotation.j0 final View view) {
            final View$OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener = (View$OnApplyWindowInsetsListener)view.getTag(k.a.e.p0);
            if (view$OnApplyWindowInsetsListener != null) {
                view$OnApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }
        
        static x0 b(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final x0 x0, @androidx.annotation.j0 final Rect rect) {
            final WindowInsets j = x0.J();
            if (j != null) {
                return x0.L(view.computeSystemWindowInsets(j, rect), view);
            }
            rect.setEmpty();
            return x0;
        }
        
        @k0
        public static x0 c(@androidx.annotation.j0 final View view) {
            return x0.a.a(view);
        }
        
        static void d(@androidx.annotation.j0 final View view, @k0 final a0 a0) {
            if (Build$VERSION.SDK_INT < 30) {
                view.setTag(k.a.e.h0, (Object)a0);
            }
            if (a0 == null) {
                view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)view.getTag(k.a.e.p0));
                return;
            }
            view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new View$OnApplyWindowInsetsListener() {
                x0 a = null;
                
                public WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
                    final x0 l = x0.L(windowInsets, view);
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    if (sdk_INT < 30) {
                        h.a(windowInsets, view);
                        if (l.equals(this.a)) {
                            return a0.a(view, l).J();
                        }
                    }
                    this.a = l;
                    final x0 a = a0.a(view, l);
                    if (sdk_INT >= 30) {
                        return a.J();
                    }
                    j0.t1(view);
                    return a.J();
                }
            });
        }
    }
    
    @androidx.annotation.p0(23)
    private static class i
    {
        @k0
        public static x0 a(@androidx.annotation.j0 final View view) {
            final WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            final x0 k = x0.K(rootWindowInsets);
            k.H(k);
            k.d(view.getRootView());
            return k;
        }
    }
    
    @androidx.annotation.p0(29)
    private static class j
    {
        static void a(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final Context context, @androidx.annotation.j0 final int[] array, @k0 final AttributeSet set, @androidx.annotation.j0 final TypedArray typedArray, final int n, final int n2) {
            view.saveAttributeDataForStyleable(context, array, set, typedArray, n, n2);
        }
    }
    
    @androidx.annotation.p0(30)
    private static class k
    {
        @k0
        public static y0 a(@androidx.annotation.j0 final View view) {
            final WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            y0 l;
            if (windowInsetsController != null) {
                l = y0.l(windowInsetsController);
            }
            else {
                l = null;
            }
            return l;
        }
    }
    
    @androidx.annotation.p0(28)
    static class l
    {
        private l() {
        }
        
        static void a(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final q q) {
            final int o0 = k.a.e.o0;
            androidx.collection.m<q, View$OnUnhandledKeyEventListener> m;
            if ((m = (androidx.collection.m<q, View$OnUnhandledKeyEventListener>)view.getTag(o0)) == null) {
                m = new androidx.collection.m<q, View$OnUnhandledKeyEventListener>();
                view.setTag(o0, (Object)m);
            }
            final View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener)new View$OnUnhandledKeyEventListener() {
                public boolean onUnhandledKeyEvent(final View view, final KeyEvent keyEvent) {
                    return q.onUnhandledKeyEvent(view, keyEvent);
                }
            };
            m.put(q, (View$OnUnhandledKeyEventListener)view$OnUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener((View$OnUnhandledKeyEventListener)view$OnUnhandledKeyEventListener);
        }
        
        static void b(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final q q) {
            final androidx.collection.m m = (androidx.collection.m)view.getTag(k.a.e.o0);
            if (m == null) {
                return;
            }
            final View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = m.get(q);
            if (view$OnUnhandledKeyEventListener != null) {
                view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
            }
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.t0({ androidx.annotation.t0.a.I })
    public @interface m {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.t0({ androidx.annotation.t0.a.I })
    public @interface n {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.t0({ androidx.annotation.t0.a.I })
    public @interface o {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.t0({ androidx.annotation.t0.a.I })
    public @interface p {
    }
    
    public interface q
    {
        boolean onUnhandledKeyEvent(final View p0, final KeyEvent p1);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.t0({ androidx.annotation.t0.a.I })
    public @interface r {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.t0({ androidx.annotation.t0.a.I })
    public @interface s {
    }
    
    static class t
    {
        private static final ArrayList<WeakReference<View>> d;
        @k0
        private WeakHashMap<View, Boolean> a;
        private SparseArray<WeakReference<View>> b;
        private WeakReference<KeyEvent> c;
        
        static {
            d = new ArrayList<WeakReference<View>>();
        }
        
        t() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        
        static t a(final View view) {
            final int n0 = k.a.e.n0;
            t t;
            if ((t = (t)view.getTag(n0)) == null) {
                t = new t();
                view.setTag(n0, (Object)t);
            }
            return t;
        }
        
        @k0
        private View c(final View key, final KeyEvent keyEvent) {
            final WeakHashMap<View, Boolean> a = this.a;
            if (a != null) {
                if (a.containsKey(key)) {
                    if (key instanceof ViewGroup) {
                        final ViewGroup viewGroup = (ViewGroup)key;
                        for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                            final View c = this.c(viewGroup.getChildAt(i), keyEvent);
                            if (c != null) {
                                return c;
                            }
                        }
                    }
                    if (this.e(key, keyEvent)) {
                        return key;
                    }
                }
            }
            return null;
        }
        
        private SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = (SparseArray<WeakReference<View>>)new SparseArray();
            }
            return this.b;
        }
        
        private boolean e(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final KeyEvent keyEvent) {
            final ArrayList list = (ArrayList)view.getTag(k.a.e.o0);
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; --i) {
                    if (list.get(i).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        private void g() {
            final WeakHashMap<View, Boolean> a = this.a;
            if (a != null) {
                a.clear();
            }
            final ArrayList<WeakReference<View>> d = t.d;
            if (d.isEmpty()) {
                return;
            }
            synchronized (d) {
                if (this.a == null) {
                    this.a = new WeakHashMap<View, Boolean>();
                }
                for (int i = d.size() - 1; i >= 0; --i) {
                    final ArrayList<WeakReference<View>> d2 = t.d;
                    final View key = d2.get(i).get();
                    if (key == null) {
                        d2.remove(i);
                    }
                    else {
                        this.a.put(key, Boolean.TRUE);
                        for (ViewParent viewParent = key.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                            this.a.put((View)viewParent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
        
        static void h(final View referent) {
            final ArrayList<WeakReference<View>> d = t.d;
            synchronized (d) {
                final Iterator<WeakReference<View>> iterator = d.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().get() == referent) {
                        return;
                    }
                }
                t.d.add(new WeakReference<View>(referent));
            }
        }
        
        static void i(final View view) {
            final ArrayList<WeakReference<View>> d = t.d;
            // monitorenter(d)
            int n = 0;
            try {
                while (true) {
                    final ArrayList<WeakReference<View>> d2 = t.d;
                    if (n >= d2.size()) {
                        return;
                    }
                    if (d2.get(n).get() == view) {
                        d2.remove(n);
                        return;
                    }
                    ++n;
                }
            }
            finally {
            }
            // monitorexit(d)
        }
        
        boolean b(View c, final KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                this.g();
            }
            c = this.c(c, keyEvent);
            if (keyEvent.getAction() == 0) {
                final int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    this.d().put(keyCode, (Object)new WeakReference(c));
                }
            }
            return c != null;
        }
        
        boolean f(final KeyEvent referent) {
            final WeakReference<KeyEvent> c = this.c;
            if (c != null && c.get() == referent) {
                return false;
            }
            this.c = new WeakReference<KeyEvent>(referent);
            final WeakReference<View> weakReference = null;
            final SparseArray<WeakReference<View>> d = this.d();
            WeakReference<View> weakReference2 = weakReference;
            if (referent.getAction() == 1) {
                final int indexOfKey = d.indexOfKey(referent.getKeyCode());
                weakReference2 = weakReference;
                if (indexOfKey >= 0) {
                    weakReference2 = (WeakReference<View>)d.valueAt(indexOfKey);
                    d.removeAt(indexOfKey);
                }
            }
            WeakReference<View> weakReference3;
            if ((weakReference3 = weakReference2) == null) {
                weakReference3 = (WeakReference<View>)d.get(referent.getKeyCode());
            }
            if (weakReference3 != null) {
                final View view = weakReference3.get();
                if (view != null && j0.N0(view)) {
                    this.e(view, referent);
                }
                return true;
            }
            return false;
        }
    }
}
