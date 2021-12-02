// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.appcompat.view.menu.o;
import android.view.MotionEvent;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.KeyboardShortcutGroup;
import java.util.List;
import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.os.LocaleList;
import android.os.PowerManager;
import androidx.core.view.l;
import androidx.annotation.b1;
import androidx.appcompat.widget.z0;
import org.xmlpull.v1.XmlPullParser;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.view.q0;
import androidx.core.view.r0;
import androidx.appcompat.widget.Toolbar;
import android.app.UiModeManager;
import android.content.res.Resources$Theme;
import androidx.core.util.i;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.d0;
import androidx.core.view.x0;
import androidx.core.view.a0;
import android.util.TypedValue;
import android.view.LayoutInflater;
import androidx.core.content.d;
import android.content.res.Resources;
import androidx.lifecycle.s;
import androidx.lifecycle.y;
import android.util.DisplayMetrics;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.u0;
import androidx.annotation.k0;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import androidx.appcompat.widget.ContentFrameLayout;
import android.util.AndroidRuntimeException;
import android.os.Bundle;
import android.view.KeyCharacterMap;
import android.view.ViewParent;
import android.view.Window$Callback;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager;
import android.view.Menu;
import android.media.AudioManager;
import android.view.ViewConfiguration;
import android.view.KeyEvent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.ComponentName;
import android.app.Dialog;
import android.app.Activity;
import androidx.annotation.j0;
import android.content.res.Resources$NotFoundException;
import android.os.Build;
import android.os.Build$VERSION;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import androidx.core.view.p0;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.z;
import android.view.MenuInflater;
import android.view.Window;
import android.content.Context;
import android.graphics.Rect;
import androidx.collection.m;
import androidx.annotation.t0;
import android.view.LayoutInflater$Factory2;

@t0({ androidx.annotation.t0.a.G })
class h extends g implements androidx.appcompat.view.menu.g.a, LayoutInflater$Factory2
{
    private static final androidx.collection.m<String, Integer> T0;
    private static final boolean U0;
    private static final int[] V0;
    private static final boolean W0;
    private static final boolean X0;
    private static boolean Y0 = false;
    static final String Z0 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private boolean A0;
    private boolean B0;
    private boolean C0;
    private boolean D0;
    boolean E0;
    private int F0;
    private int G0;
    private boolean H0;
    private boolean I0;
    private q J0;
    private q K0;
    boolean L0;
    int M0;
    private final Runnable N0;
    private boolean O0;
    private Rect P0;
    private Rect Q0;
    private androidx.appcompat.app.j R0;
    private androidx.appcompat.app.k S0;
    final Object V;
    final Context W;
    Window X;
    private o Y;
    final f Z;
    androidx.appcompat.app.a a0;
    MenuInflater b0;
    private CharSequence c0;
    private z d0;
    private i e0;
    private v f0;
    androidx.appcompat.view.b g0;
    ActionBarContextView h0;
    PopupWindow i0;
    Runnable j0;
    p0 k0;
    private boolean l0;
    private boolean m0;
    ViewGroup n0;
    private TextView o0;
    private View p0;
    private boolean q0;
    private boolean r0;
    boolean s0;
    boolean t0;
    boolean u0;
    boolean v0;
    boolean w0;
    private boolean x0;
    private u[] y0;
    private u z0;
    
    static {
        T0 = new androidx.collection.m<String, Integer>();
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean x0 = false;
        final boolean b = U0 = (sdk_INT < 21);
        V0 = new int[] { 16842836 };
        W0 = ("robolectric".equals(Build.FINGERPRINT) ^ true);
        if (sdk_INT >= 17) {
            x0 = true;
        }
        X0 = x0;
        if (b && !h.Y0) {
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Thread.UncaughtExceptionHandler() {
                final /* synthetic */ UncaughtExceptionHandler a;
                
                private boolean a(final Throwable t) {
                    final boolean b = t instanceof Resources$NotFoundException;
                    boolean b3;
                    final boolean b2 = b3 = false;
                    if (b) {
                        final String message = t.getMessage();
                        b3 = b2;
                        if (message != null) {
                            if (!message.contains("drawable")) {
                                b3 = b2;
                                if (!message.contains("Drawable")) {
                                    return b3;
                                }
                            }
                            b3 = true;
                        }
                    }
                    return b3;
                }
                
                @Override
                public void uncaughtException(@j0 final Thread thread, @j0 final Throwable t) {
                    if (this.a(t)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(t.getMessage());
                        sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        final Resources$NotFoundException ex = new Resources$NotFoundException(sb.toString());
                        ((Throwable)ex).initCause(t.getCause());
                        ((Throwable)ex).setStackTrace(t.getStackTrace());
                        this.a.uncaughtException(thread, (Throwable)ex);
                    }
                    else {
                        this.a.uncaughtException(thread, t);
                    }
                }
            });
            h.Y0 = true;
        }
    }
    
    h(final Activity activity, final f f) {
        this((Context)activity, null, f, activity);
    }
    
    h(final Dialog dialog, final f f) {
        this(dialog.getContext(), dialog.getWindow(), f, dialog);
    }
    
    h(final Context context, final Activity activity, final f f) {
        this(context, null, f, activity);
    }
    
    h(final Context context, final Window window, final f f) {
        this(context, window, f, context);
    }
    
    private h(final Context w, final Window window, final f z, final Object v) {
        this.k0 = null;
        this.l0 = true;
        this.F0 = -100;
        this.N0 = new Runnable() {
            @Override
            public void run() {
                final h g = h.this;
                if ((g.M0 & 0x1) != 0x0) {
                    g.h0(0);
                }
                final h g2 = h.this;
                if ((g2.M0 & 0x1000) != 0x0) {
                    g2.h0(108);
                }
                final h g3 = h.this;
                g3.L0 = false;
                g3.M0 = 0;
            }
        };
        this.W = w;
        this.Z = z;
        this.V = v;
        if (this.F0 == -100 && v instanceof Dialog) {
            final e v2 = this.V0();
            if (v2 != null) {
                this.F0 = v2.getDelegate().q();
            }
        }
        if (this.F0 == -100) {
            final androidx.collection.m<String, Integer> t0 = h.T0;
            final Integer n = t0.get(v.getClass().getName());
            if (n != null) {
                this.F0 = n;
                t0.remove(v.getClass().getName());
            }
        }
        if (window != null) {
            this.W(window);
        }
        androidx.appcompat.widget.j.i();
    }
    
    private boolean A0() {
        if (!this.I0 && this.V instanceof Activity) {
            final PackageManager packageManager = this.W.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                final int sdk_INT = Build$VERSION.SDK_INT;
                int n;
                if (sdk_INT >= 29) {
                    n = 269221888;
                }
                else if (sdk_INT >= 24) {
                    n = 786432;
                }
                else {
                    n = 0;
                }
                final ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.W, (Class)this.V.getClass()), n);
                this.H0 = (activityInfo != null && (activityInfo.configChanges & 0x200) != 0x0);
            }
            catch (PackageManager$NameNotFoundException ex) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", (Throwable)ex);
                this.H0 = false;
            }
        }
        this.I0 = true;
        return this.H0;
    }
    
    private boolean E0(final int n, final KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            final u r0 = this.r0(n, true);
            if (!r0.o) {
                return this.O0(r0, keyEvent);
            }
        }
        return false;
    }
    
    private boolean H0(final int n, final KeyEvent keyEvent) {
        if (this.g0 != null) {
            return false;
        }
        final boolean b = true;
        final u r0 = this.r0(n, true);
        boolean b2 = false;
        Label_0205: {
            Label_0192: {
                if (n == 0) {
                    final z d0 = this.d0;
                    if (d0 != null && d0.g() && !ViewConfiguration.get(this.W).hasPermanentMenuKey()) {
                        if (this.d0.d()) {
                            b2 = this.d0.j();
                            break Label_0205;
                        }
                        if (!this.E0 && this.O0(r0, keyEvent)) {
                            b2 = this.d0.k();
                            break Label_0205;
                        }
                        break Label_0192;
                    }
                }
                b2 = r0.o;
                if (b2 || r0.n) {
                    this.c0(r0, true);
                    break Label_0205;
                }
                if (r0.m) {
                    boolean o0;
                    if (r0.r) {
                        r0.m = false;
                        o0 = this.O0(r0, keyEvent);
                    }
                    else {
                        o0 = true;
                    }
                    if (o0) {
                        this.L0(r0, keyEvent);
                        b2 = b;
                        break Label_0205;
                    }
                }
            }
            b2 = false;
        }
        if (b2) {
            final AudioManager audioManager = (AudioManager)this.W.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            }
            else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return b2;
    }
    
    private void L0(final u u, final KeyEvent keyEvent) {
        if (!u.o) {
            if (!this.E0) {
                if (u.a == 0 && (this.W.getResources().getConfiguration().screenLayout & 0xF) == 0x4) {
                    return;
                }
                final Window$Callback u2 = this.u0();
                if (u2 != null && !u2.onMenuOpened(u.a, (Menu)u.j)) {
                    this.c0(u, true);
                    return;
                }
                final WindowManager windowManager = (WindowManager)this.W.getSystemService("window");
                if (windowManager == null) {
                    return;
                }
                if (!this.O0(u, keyEvent)) {
                    return;
                }
                final ViewGroup g = u.g;
                int n = 0;
                Label_0336: {
                    if (g != null && !u.q) {
                        final View i = u.i;
                        if (i != null) {
                            final ViewGroup$LayoutParams layoutParams = i.getLayoutParams();
                            if (layoutParams != null && layoutParams.width == -1) {
                                n = -1;
                                break Label_0336;
                            }
                        }
                    }
                    else {
                        if (g == null) {
                            if (!this.x0(u) || u.g == null) {
                                return;
                            }
                        }
                        else if (u.q && g.getChildCount() > 0) {
                            u.g.removeAllViews();
                        }
                        if (!this.w0(u) || !u.d()) {
                            u.q = true;
                            return;
                        }
                        ViewGroup$LayoutParams layoutParams2;
                        if ((layoutParams2 = u.h.getLayoutParams()) == null) {
                            layoutParams2 = new ViewGroup$LayoutParams(-2, -2);
                        }
                        u.g.setBackgroundResource(u.b);
                        final ViewParent parent = u.h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup)parent).removeView(u.h);
                        }
                        u.g.addView(u.h, layoutParams2);
                        if (!u.h.hasFocus()) {
                            u.h.requestFocus();
                        }
                    }
                    n = -2;
                }
                u.n = false;
                final WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams(n, -2, u.d, u.e, 1002, 8519680, -3);
                windowManager$LayoutParams.gravity = u.c;
                windowManager$LayoutParams.windowAnimations = u.f;
                windowManager.addView((View)u.g, (ViewGroup$LayoutParams)windowManager$LayoutParams);
                u.o = true;
            }
        }
    }
    
    private boolean N0(final u u, final int n, final KeyEvent keyEvent, final int n2) {
        final boolean system = keyEvent.isSystem();
        final boolean b = false;
        if (system) {
            return false;
        }
        boolean performShortcut = false;
        Label_0062: {
            if (!u.m) {
                performShortcut = b;
                if (!this.O0(u, keyEvent)) {
                    break Label_0062;
                }
            }
            final androidx.appcompat.view.menu.g j = u.j;
            performShortcut = b;
            if (j != null) {
                performShortcut = j.performShortcut(n, keyEvent, n2);
            }
        }
        if (performShortcut && (n2 & 0x1) == 0x0 && this.d0 == null) {
            this.c0(u, true);
        }
        return performShortcut;
    }
    
    private boolean O0(final u z0, final KeyEvent keyEvent) {
        if (this.E0) {
            return false;
        }
        if (z0.m) {
            return true;
        }
        final u z2 = this.z0;
        if (z2 != null && z2 != z0) {
            this.c0(z2, false);
        }
        final Window$Callback u0 = this.u0();
        if (u0 != null) {
            z0.i = u0.onCreatePanelView(z0.a);
        }
        final int a = z0.a;
        final boolean b = a == 0 || a == 108;
        if (b) {
            final z d0 = this.d0;
            if (d0 != null) {
                d0.e();
            }
        }
        if (z0.i == null && (!b || !(this.M0() instanceof androidx.appcompat.app.n))) {
            final androidx.appcompat.view.menu.g j = z0.j;
            if (j == null || z0.r) {
                if (j == null && (!this.y0(z0) || z0.j == null)) {
                    return false;
                }
                if (b && this.d0 != null) {
                    if (this.e0 == null) {
                        this.e0 = new i();
                    }
                    this.d0.c((Menu)z0.j, this.e0);
                }
                z0.j.m0();
                if (!u0.onCreatePanelMenu(z0.a, (Menu)z0.j)) {
                    z0.g(null);
                    if (b) {
                        final z d2 = this.d0;
                        if (d2 != null) {
                            d2.c(null, this.e0);
                        }
                    }
                    return false;
                }
                z0.r = false;
            }
            z0.j.m0();
            final Bundle u2 = z0.u;
            if (u2 != null) {
                z0.j.T(u2);
                z0.u = null;
            }
            if (!u0.onPreparePanel(0, z0.i, (Menu)z0.j)) {
                if (b) {
                    final z d3 = this.d0;
                    if (d3 != null) {
                        d3.c(null, this.e0);
                    }
                }
                z0.j.l0();
                return false;
            }
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            final boolean b2 = KeyCharacterMap.load(deviceId).getKeyboardType() != 1;
            z0.p = b2;
            z0.j.setQwertyMode(b2);
            z0.j.l0();
        }
        z0.m = true;
        z0.n = false;
        this.z0 = z0;
        return true;
    }
    
    private void P0(final boolean b) {
        final z d0 = this.d0;
        if (d0 != null && d0.g() && (!ViewConfiguration.get(this.W).hasPermanentMenuKey() || this.d0.i())) {
            final Window$Callback u0 = this.u0();
            if (this.d0.d() && b) {
                this.d0.j();
                if (!this.E0) {
                    u0.onPanelClosed(108, (Menu)this.r0(0, true).j);
                }
            }
            else if (u0 != null && !this.E0) {
                if (this.L0 && (this.M0 & 0x1) != 0x0) {
                    this.X.getDecorView().removeCallbacks(this.N0);
                    this.N0.run();
                }
                final u r0 = this.r0(0, true);
                final androidx.appcompat.view.menu.g j = r0.j;
                if (j != null && !r0.r && u0.onPreparePanel(0, r0.i, (Menu)j)) {
                    u0.onMenuOpened(108, (Menu)r0.j);
                    this.d0.k();
                }
            }
            return;
        }
        final u r2 = this.r0(0, true);
        r2.q = true;
        this.c0(r2, false);
        this.L0(r2, null);
    }
    
    private int Q0(final int n) {
        if (n == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        int n2;
        if ((n2 = n) == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            n2 = 109;
        }
        return n2;
    }
    
    private boolean S0(ViewParent parent) {
        if (parent == null) {
            return false;
        }
        final View decorView = this.X.getDecorView();
        while (parent != null) {
            if (parent == decorView || !(parent instanceof View) || androidx.core.view.j0.N0((View)parent)) {
                return false;
            }
            parent = parent.getParent();
        }
        return true;
    }
    
    private boolean U(final boolean b) {
        if (this.E0) {
            return false;
        }
        final int x = this.X();
        final boolean w0 = this.W0(this.B0(this.W, x), b);
        if (x == 0) {
            this.q0(this.W).f();
        }
        else {
            final q j0 = this.J0;
            if (j0 != null) {
                j0.a();
            }
        }
        if (x == 3) {
            this.o0(this.W).f();
        }
        else {
            final q k0 = this.K0;
            if (k0 != null) {
                k0.a();
            }
        }
        return w0;
    }
    
    private void U0() {
        if (!this.m0) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
    
    private void V() {
        final ContentFrameLayout contentFrameLayout = (ContentFrameLayout)this.n0.findViewById(16908290);
        final View decorView = this.X.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        final TypedArray obtainStyledAttributes = this.W.obtainStyledAttributes(c.a.n.f1);
        obtainStyledAttributes.getValue(c.a.n.A3, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(c.a.n.B3, contentFrameLayout.getMinWidthMinor());
        final int y3 = c.a.n.y3;
        if (obtainStyledAttributes.hasValue(y3)) {
            obtainStyledAttributes.getValue(y3, contentFrameLayout.getFixedWidthMajor());
        }
        final int z3 = c.a.n.z3;
        if (obtainStyledAttributes.hasValue(z3)) {
            obtainStyledAttributes.getValue(z3, contentFrameLayout.getFixedWidthMinor());
        }
        final int w3 = c.a.n.w3;
        if (obtainStyledAttributes.hasValue(w3)) {
            obtainStyledAttributes.getValue(w3, contentFrameLayout.getFixedHeightMajor());
        }
        final int x3 = c.a.n.x3;
        if (obtainStyledAttributes.hasValue(x3)) {
            obtainStyledAttributes.getValue(x3, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }
    
    @k0
    private e V0() {
        for (Context context = this.W; context != null; context = ((ContextWrapper)context).getBaseContext()) {
            if (context instanceof e) {
                return (e)context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }
    
    private void W(@j0 final Window x) {
        if (this.X != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        final Window$Callback callback = x.getCallback();
        if (!(callback instanceof o)) {
            x.setCallback((Window$Callback)(this.Y = new o(callback)));
            final u0 f = androidx.appcompat.widget.u0.F(this.W, null, h.V0);
            final Drawable i = f.i(0);
            if (i != null) {
                x.setBackgroundDrawable(i);
            }
            f.I();
            this.X = x;
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    
    private boolean W0(final int n, final boolean b) {
        final Configuration d0 = this.d0(this.W, n, null);
        final boolean a0 = this.A0();
        final int n2 = this.W.getResources().getConfiguration().uiMode & 0x30;
        final int n3 = d0.uiMode & 0x30;
        final boolean b2 = true;
        boolean b3 = false;
        Label_0122: {
            if (n2 != n3 && b && !a0 && this.B0 && (h.W0 || this.C0)) {
                final Object v = this.V;
                if (v instanceof Activity && !((Activity)v).isChild()) {
                    androidx.core.app.a.B((Activity)this.V);
                    b3 = true;
                    break Label_0122;
                }
            }
            b3 = false;
        }
        if (!b3 && n2 != n3) {
            this.X0(n3, a0, null);
            b3 = b2;
        }
        if (b3) {
            final Object v2 = this.V;
            if (v2 instanceof e) {
                ((e)v2).onNightModeChanged(n);
            }
        }
        return b3;
    }
    
    private int X() {
        int n = this.F0;
        if (n == -100) {
            n = g.o();
        }
        return n;
    }
    
    private void X0(int sdk_INT, final boolean b, @k0 final Configuration configuration) {
        final Resources resources = this.W.getResources();
        final Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = (sdk_INT | (resources.getConfiguration().uiMode & 0xFFFFFFCF));
        resources.updateConfiguration(configuration2, (DisplayMetrics)null);
        sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 26) {
            androidx.appcompat.app.m.a(resources);
        }
        final int g0 = this.G0;
        if (g0 != 0) {
            this.W.setTheme(g0);
            if (sdk_INT >= 23) {
                this.W.getTheme().applyStyle(this.G0, true);
            }
        }
        if (b) {
            final Object v = this.V;
            if (v instanceof Activity) {
                final Activity activity = (Activity)v;
                if (activity instanceof y) {
                    if (!((y)activity).getLifecycle().b().b(androidx.lifecycle.s.c.J)) {
                        return;
                    }
                }
                else if (!this.D0) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }
    
    private void Z0(final View view) {
        Context context;
        int n;
        if ((androidx.core.view.j0.B0(view) & 0x2000) != 0x0) {
            context = this.W;
            n = c.a.e.g;
        }
        else {
            context = this.W;
            n = c.a.e.f;
        }
        view.setBackgroundColor(androidx.core.content.d.f(context, n));
    }
    
    private void a0() {
        final q j0 = this.J0;
        if (j0 != null) {
            j0.a();
        }
        final q k0 = this.K0;
        if (k0 != null) {
            k0.a();
        }
    }
    
    @j0
    private Configuration d0(@j0 final Context context, int n, @k0 final Configuration to) {
        if (n != 1) {
            if (n != 2) {
                n = (context.getApplicationContext().getResources().getConfiguration().uiMode & 0x30);
            }
            else {
                n = 32;
            }
        }
        else {
            n = 16;
        }
        final Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        if (to != null) {
            configuration.setTo(to);
        }
        configuration.uiMode = (n | (configuration.uiMode & 0xFFFFFFCF));
        return configuration;
    }
    
    private ViewGroup e0() {
        final TypedArray obtainStyledAttributes = this.W.obtainStyledAttributes(c.a.n.f1);
        final int t3 = c.a.n.t3;
        if (!obtainStyledAttributes.hasValue(t3)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(c.a.n.C3, false)) {
            this.I(1);
        }
        else if (obtainStyledAttributes.getBoolean(t3, false)) {
            this.I(108);
        }
        if (obtainStyledAttributes.getBoolean(c.a.n.u3, false)) {
            this.I(109);
        }
        if (obtainStyledAttributes.getBoolean(c.a.n.v3, false)) {
            this.I(10);
        }
        this.v0 = obtainStyledAttributes.getBoolean(c.a.n.g1, false);
        obtainStyledAttributes.recycle();
        this.k0();
        this.X.getDecorView();
        final LayoutInflater from = LayoutInflater.from(this.W);
        ViewGroup contentView;
        if (!this.w0) {
            if (this.v0) {
                contentView = (ViewGroup)from.inflate(c.a.k.m, (ViewGroup)null);
                this.t0 = false;
                this.s0 = false;
            }
            else if (this.s0) {
                final TypedValue typedValue = new TypedValue();
                this.W.getTheme().resolveAttribute(c.a.c.j, typedValue, true);
                Object w;
                if (typedValue.resourceId != 0) {
                    w = new androidx.appcompat.view.d(this.W, typedValue.resourceId);
                }
                else {
                    w = this.W;
                }
                final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)w).inflate(c.a.k.x, (ViewGroup)null);
                (this.d0 = (z)viewGroup.findViewById(c.a.h.m0)).setWindowCallback(this.u0());
                if (this.t0) {
                    this.d0.m(109);
                }
                if (this.q0) {
                    this.d0.m(2);
                }
                contentView = viewGroup;
                if (this.r0) {
                    this.d0.m(5);
                    contentView = viewGroup;
                }
            }
            else {
                contentView = null;
            }
        }
        else {
            int n;
            if (this.u0) {
                n = c.a.k.w;
            }
            else {
                n = c.a.k.v;
            }
            contentView = (ViewGroup)from.inflate(n, (ViewGroup)null);
        }
        if (contentView != null) {
            if (Build$VERSION.SDK_INT >= 21) {
                androidx.core.view.j0.Y1((View)contentView, new a0() {
                    @Override
                    public x0 a(final View view, final x0 x0) {
                        final int r = x0.r();
                        final int y0 = h.this.Y0(x0, null);
                        x0 d = x0;
                        if (r != y0) {
                            d = x0.D(x0.p(), y0, x0.q(), x0.o());
                        }
                        return androidx.core.view.j0.e1(view, d);
                    }
                });
            }
            else if (contentView instanceof d0) {
                ((d0)contentView).setOnFitSystemWindowsListener((d0.a)new d0.a() {
                    @Override
                    public void a(final Rect rect) {
                        rect.top = h.this.Y0(null, rect);
                    }
                });
            }
            if (this.d0 == null) {
                this.o0 = (TextView)contentView.findViewById(c.a.h.L1);
            }
            a1.c((View)contentView);
            final ContentFrameLayout contentFrameLayout = (ContentFrameLayout)contentView.findViewById(c.a.h.I);
            final ViewGroup viewGroup2 = (ViewGroup)this.X.findViewById(16908290);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    final View child = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(child);
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout)viewGroup2).setForeground((Drawable)null);
                }
            }
            this.X.setContentView((View)contentView);
            contentFrameLayout.setAttachListener((ContentFrameLayout.a)new ContentFrameLayout.a() {
                @Override
                public void a() {
                }
                
                @Override
                public void onDetachedFromWindow() {
                    h.this.f0();
                }
            });
            return contentView;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
        sb.append(this.s0);
        sb.append(", windowActionBarOverlay: ");
        sb.append(this.t0);
        sb.append(", android:windowIsFloating: ");
        sb.append(this.v0);
        sb.append(", windowActionModeOverlay: ");
        sb.append(this.u0);
        sb.append(", windowNoTitle: ");
        sb.append(this.w0);
        sb.append(" }");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private void j0() {
        if (!this.m0) {
            this.n0 = this.e0();
            final CharSequence t0 = this.t0();
            if (!TextUtils.isEmpty(t0)) {
                final z d0 = this.d0;
                if (d0 != null) {
                    d0.setWindowTitle(t0);
                }
                else if (this.M0() != null) {
                    this.M0().B0(t0);
                }
                else {
                    final TextView o0 = this.o0;
                    if (o0 != null) {
                        o0.setText(t0);
                    }
                }
            }
            this.V();
            this.K0(this.n0);
            this.m0 = true;
            final u r0 = this.r0(0, false);
            if (!this.E0 && (r0 == null || r0.j == null)) {
                this.z0(108);
            }
        }
    }
    
    private void k0() {
        if (this.X == null) {
            final Object v = this.V;
            if (v instanceof Activity) {
                this.W(((Activity)v).getWindow());
            }
        }
        if (this.X != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }
    
    @j0
    private static Configuration m0(@j0 final Configuration configuration, @k0 final Configuration configuration2) {
        final Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null) {
            if (configuration.diff(configuration2) != 0) {
                final float fontScale = configuration.fontScale;
                final float fontScale2 = configuration2.fontScale;
                if (fontScale != fontScale2) {
                    configuration3.fontScale = fontScale2;
                }
                final int mcc = configuration.mcc;
                final int mcc2 = configuration2.mcc;
                if (mcc != mcc2) {
                    configuration3.mcc = mcc2;
                }
                final int mnc = configuration.mnc;
                final int mnc2 = configuration2.mnc;
                if (mnc != mnc2) {
                    configuration3.mnc = mnc2;
                }
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 24) {
                    m.a(configuration, configuration2, configuration3);
                }
                else if (!androidx.core.util.i.a(configuration.locale, configuration2.locale)) {
                    configuration3.locale = configuration2.locale;
                }
                final int touchscreen = configuration.touchscreen;
                final int touchscreen2 = configuration2.touchscreen;
                if (touchscreen != touchscreen2) {
                    configuration3.touchscreen = touchscreen2;
                }
                final int keyboard = configuration.keyboard;
                final int keyboard2 = configuration2.keyboard;
                if (keyboard != keyboard2) {
                    configuration3.keyboard = keyboard2;
                }
                final int keyboardHidden = configuration.keyboardHidden;
                final int keyboardHidden2 = configuration2.keyboardHidden;
                if (keyboardHidden != keyboardHidden2) {
                    configuration3.keyboardHidden = keyboardHidden2;
                }
                final int navigation = configuration.navigation;
                final int navigation2 = configuration2.navigation;
                if (navigation != navigation2) {
                    configuration3.navigation = navigation2;
                }
                final int navigationHidden = configuration.navigationHidden;
                final int navigationHidden2 = configuration2.navigationHidden;
                if (navigationHidden != navigationHidden2) {
                    configuration3.navigationHidden = navigationHidden2;
                }
                final int orientation = configuration.orientation;
                final int orientation2 = configuration2.orientation;
                if (orientation != orientation2) {
                    configuration3.orientation = orientation2;
                }
                final int screenLayout = configuration.screenLayout;
                final int screenLayout2 = configuration2.screenLayout;
                if ((screenLayout & 0xF) != (screenLayout2 & 0xF)) {
                    configuration3.screenLayout |= (screenLayout2 & 0xF);
                }
                final int screenLayout3 = configuration.screenLayout;
                final int screenLayout4 = configuration2.screenLayout;
                if ((screenLayout3 & 0xC0) != (screenLayout4 & 0xC0)) {
                    configuration3.screenLayout |= (screenLayout4 & 0xC0);
                }
                final int screenLayout5 = configuration.screenLayout;
                final int screenLayout6 = configuration2.screenLayout;
                if ((screenLayout5 & 0x30) != (screenLayout6 & 0x30)) {
                    configuration3.screenLayout |= (screenLayout6 & 0x30);
                }
                final int screenLayout7 = configuration.screenLayout;
                final int screenLayout8 = configuration2.screenLayout;
                if ((screenLayout7 & 0x300) != (screenLayout8 & 0x300)) {
                    configuration3.screenLayout |= (screenLayout8 & 0x300);
                }
                if (sdk_INT >= 26) {
                    n.a(configuration, configuration2, configuration3);
                }
                final int uiMode = configuration.uiMode;
                final int uiMode2 = configuration2.uiMode;
                if ((uiMode & 0xF) != (uiMode2 & 0xF)) {
                    configuration3.uiMode |= (uiMode2 & 0xF);
                }
                final int uiMode3 = configuration.uiMode;
                final int uiMode4 = configuration2.uiMode;
                if ((uiMode3 & 0x30) != (uiMode4 & 0x30)) {
                    configuration3.uiMode |= (uiMode4 & 0x30);
                }
                final int screenWidthDp = configuration.screenWidthDp;
                final int screenWidthDp2 = configuration2.screenWidthDp;
                if (screenWidthDp != screenWidthDp2) {
                    configuration3.screenWidthDp = screenWidthDp2;
                }
                final int screenHeightDp = configuration.screenHeightDp;
                final int screenHeightDp2 = configuration2.screenHeightDp;
                if (screenHeightDp != screenHeightDp2) {
                    configuration3.screenHeightDp = screenHeightDp2;
                }
                final int smallestScreenWidthDp = configuration.smallestScreenWidthDp;
                final int smallestScreenWidthDp2 = configuration2.smallestScreenWidthDp;
                if (smallestScreenWidthDp != smallestScreenWidthDp2) {
                    configuration3.smallestScreenWidthDp = smallestScreenWidthDp2;
                }
                if (sdk_INT >= 17) {
                    k.b(configuration, configuration2, configuration3);
                }
            }
        }
        return configuration3;
    }
    
    private q o0(@j0 final Context context) {
        if (this.K0 == null) {
            this.K0 = (q)new p(context);
        }
        return this.K0;
    }
    
    private q q0(@j0 final Context context) {
        if (this.J0 == null) {
            this.J0 = (q)new r(androidx.appcompat.app.p.a(context));
        }
        return this.J0;
    }
    
    private void v0() {
        this.j0();
        if (this.s0) {
            if (this.a0 == null) {
                final Object v = this.V;
                Label_0085: {
                    androidx.appcompat.app.q a0;
                    if (v instanceof Activity) {
                        a0 = new androidx.appcompat.app.q((Activity)this.V, this.t0);
                    }
                    else {
                        if (!(v instanceof Dialog)) {
                            break Label_0085;
                        }
                        a0 = new androidx.appcompat.app.q((Dialog)this.V);
                    }
                    this.a0 = a0;
                }
                final androidx.appcompat.app.a a2 = this.a0;
                if (a2 != null) {
                    a2.X(this.O0);
                }
            }
        }
    }
    
    private boolean w0(final u u) {
        final View i = u.i;
        boolean b = true;
        if (i != null) {
            u.h = i;
            return true;
        }
        if (u.j == null) {
            return false;
        }
        if (this.f0 == null) {
            this.f0 = new v();
        }
        if ((u.h = (View)u.c(this.f0)) == null) {
            b = false;
        }
        return b;
    }
    
    private boolean x0(final u u) {
        u.h(this.n0());
        u.g = (ViewGroup)new t(u.l);
        u.c = 81;
        return true;
    }
    
    private boolean y0(final u u) {
        final Context w = this.W;
        final int a = u.a;
        Object o = null;
        Label_0202: {
            if (a != 0) {
                o = w;
                if (a != 108) {
                    break Label_0202;
                }
            }
            o = w;
            if (this.d0 != null) {
                final TypedValue typedValue = new TypedValue();
                final Resources$Theme theme = w.getTheme();
                theme.resolveAttribute(c.a.c.j, typedValue, true);
                Resources$Theme theme2 = null;
                if (typedValue.resourceId != 0) {
                    theme2 = w.getResources().newTheme();
                    theme2.setTo(theme);
                    theme2.applyStyle(typedValue.resourceId, true);
                    theme2.resolveAttribute(c.a.c.k, typedValue, true);
                }
                else {
                    theme.resolveAttribute(c.a.c.k, typedValue, true);
                }
                Resources$Theme theme3 = theme2;
                if (typedValue.resourceId != 0) {
                    if ((theme3 = theme2) == null) {
                        theme3 = w.getResources().newTheme();
                        theme3.setTo(theme);
                    }
                    theme3.applyStyle(typedValue.resourceId, true);
                }
                o = w;
                if (theme3 != null) {
                    o = new androidx.appcompat.view.d(w, 0);
                    ((Context)o).getTheme().setTo(theme3);
                }
            }
        }
        final androidx.appcompat.view.menu.g g = new androidx.appcompat.view.menu.g((Context)o);
        g.X((androidx.appcompat.view.menu.g.a)this);
        u.g(g);
        return true;
    }
    
    private void z0(final int n) {
        this.M0 |= 1 << n;
        if (!this.L0) {
            androidx.core.view.j0.n1(this.X.getDecorView(), this.N0);
            this.L0 = true;
        }
    }
    
    @Override
    public void A() {
        if (this.V instanceof Activity) {
            g.G(this);
        }
        if (this.L0) {
            this.X.getDecorView().removeCallbacks(this.N0);
        }
        this.D0 = false;
        this.E0 = true;
        Label_0121: {
            if (this.F0 != -100) {
                final Object v = this.V;
                if (v instanceof Activity && ((Activity)v).isChangingConfigurations()) {
                    h.T0.put(this.V.getClass().getName(), this.F0);
                    break Label_0121;
                }
            }
            h.T0.remove(this.V.getClass().getName());
        }
        final androidx.appcompat.app.a a0 = this.a0;
        if (a0 != null) {
            a0.J();
        }
        this.a0();
    }
    
    @Override
    public void B(final Bundle bundle) {
        this.j0();
    }
    
    int B0(@j0 final Context context, final int n) {
        if (n != -100) {
            if (n != -1) {
                q q;
                if (n != 0) {
                    if (n == 1 || n == 2) {
                        return n;
                    }
                    if (n != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    q = this.o0(context);
                }
                else {
                    if (Build$VERSION.SDK_INT >= 23 && ((UiModeManager)context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                        return -1;
                    }
                    q = this.q0(context);
                }
                return q.c();
            }
            return n;
        }
        return -1;
    }
    
    @Override
    public void C() {
        final androidx.appcompat.app.a s = this.s();
        if (s != null) {
            s.u0(true);
        }
    }
    
    boolean C0() {
        final androidx.appcompat.view.b g0 = this.g0;
        if (g0 != null) {
            g0.c();
            return true;
        }
        final androidx.appcompat.app.a s = this.s();
        return s != null && s.m();
    }
    
    @Override
    public void D(final Bundle bundle) {
    }
    
    boolean D0(final int n, final KeyEvent keyEvent) {
        boolean a0 = true;
        if (n != 4) {
            if (n == 82) {
                this.E0(0, keyEvent);
                return true;
            }
        }
        else {
            if ((keyEvent.getFlags() & 0x80) == 0x0) {
                a0 = false;
            }
            this.A0 = a0;
        }
        return false;
    }
    
    @Override
    public void E() {
        this.D0 = true;
        this.e();
    }
    
    @Override
    public void F() {
        this.D0 = false;
        final androidx.appcompat.app.a s = this.s();
        if (s != null) {
            s.u0(false);
        }
    }
    
    boolean F0(final int n, final KeyEvent keyEvent) {
        final androidx.appcompat.app.a s = this.s();
        if (s != null && s.K(n, keyEvent)) {
            return true;
        }
        final u z0 = this.z0;
        if (z0 != null && this.N0(z0, keyEvent.getKeyCode(), keyEvent, 1)) {
            final u z2 = this.z0;
            if (z2 != null) {
                z2.n = true;
            }
            return true;
        }
        if (this.z0 == null) {
            final u r0 = this.r0(0, true);
            this.O0(r0, keyEvent);
            final boolean n2 = this.N0(r0, keyEvent.getKeyCode(), keyEvent, 1);
            r0.m = false;
            if (n2) {
                return true;
            }
        }
        return false;
    }
    
    boolean G0(final int n, final KeyEvent keyEvent) {
        if (n != 4) {
            if (n == 82) {
                this.H0(0, keyEvent);
                return true;
            }
        }
        else {
            final boolean a0 = this.A0;
            this.A0 = false;
            final u r0 = this.r0(0, false);
            if (r0 != null && r0.o) {
                if (!a0) {
                    this.c0(r0, true);
                }
                return true;
            }
            if (this.C0()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean I(int q0) {
        q0 = this.Q0(q0);
        if (this.w0 && q0 == 108) {
            return false;
        }
        if (this.s0 && q0 == 1) {
            this.s0 = false;
        }
        if (q0 == 1) {
            this.U0();
            return this.w0 = true;
        }
        if (q0 == 2) {
            this.U0();
            return this.q0 = true;
        }
        if (q0 == 5) {
            this.U0();
            return this.r0 = true;
        }
        if (q0 == 10) {
            this.U0();
            return this.u0 = true;
        }
        if (q0 == 108) {
            this.U0();
            return this.s0 = true;
        }
        if (q0 != 109) {
            return this.X.requestFeature(q0);
        }
        this.U0();
        return this.t0 = true;
    }
    
    void I0(final int n) {
        if (n == 108) {
            final androidx.appcompat.app.a s = this.s();
            if (s != null) {
                s.n(true);
            }
        }
    }
    
    void J0(final int n) {
        if (n == 108) {
            final androidx.appcompat.app.a s = this.s();
            if (s != null) {
                s.n(false);
            }
        }
        else if (n == 0) {
            final u r0 = this.r0(n, true);
            if (r0.o) {
                this.c0(r0, false);
            }
        }
    }
    
    @Override
    public void K(final int n) {
        this.j0();
        final ViewGroup viewGroup = (ViewGroup)this.n0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.W).inflate(n, viewGroup);
        this.Y.a().onContentChanged();
    }
    
    void K0(final ViewGroup viewGroup) {
    }
    
    @Override
    public void L(final View view) {
        this.j0();
        final ViewGroup viewGroup = (ViewGroup)this.n0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.Y.a().onContentChanged();
    }
    
    @Override
    public void M(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.j0();
        final ViewGroup viewGroup = (ViewGroup)this.n0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, viewGroup$LayoutParams);
        this.Y.a().onContentChanged();
    }
    
    final androidx.appcompat.app.a M0() {
        return this.a0;
    }
    
    @Override
    public void O(final boolean l0) {
        this.l0 = l0;
    }
    
    @androidx.annotation.p0(17)
    @Override
    public void P(final int f0) {
        if (this.F0 != f0) {
            this.F0 = f0;
            if (this.B0) {
                this.e();
            }
        }
    }
    
    @Override
    public void Q(final Toolbar toolbar) {
        if (!(this.V instanceof Activity)) {
            return;
        }
        final androidx.appcompat.app.a s = this.s();
        if (!(s instanceof androidx.appcompat.app.q)) {
            this.b0 = null;
            if (s != null) {
                s.J();
            }
            Window window;
            Object callback;
            if (toolbar != null) {
                final androidx.appcompat.app.n a0 = new androidx.appcompat.app.n(toolbar, this.t0(), (Window$Callback)this.Y);
                this.a0 = a0;
                window = this.X;
                callback = a0.F0();
            }
            else {
                this.a0 = null;
                window = this.X;
                callback = this.Y;
            }
            window.setCallback((Window$Callback)callback);
            this.v();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }
    
    @Override
    public void R(@androidx.annotation.x0 final int g0) {
        this.G0 = g0;
    }
    
    final boolean R0() {
        if (this.m0) {
            final ViewGroup n0 = this.n0;
            if (n0 != null && androidx.core.view.j0.T0((View)n0)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final void S(final CharSequence text) {
        this.c0 = text;
        final z d0 = this.d0;
        if (d0 != null) {
            d0.setWindowTitle(text);
        }
        else if (this.M0() != null) {
            this.M0().B0(text);
        }
        else {
            final TextView o0 = this.o0;
            if (o0 != null) {
                o0.setText(text);
            }
        }
    }
    
    @Override
    public androidx.appcompat.view.b T(@j0 final androidx.appcompat.view.b.a a) {
        if (a != null) {
            final androidx.appcompat.view.b g0 = this.g0;
            if (g0 != null) {
                g0.c();
            }
            final j j = new j(a);
            final androidx.appcompat.app.a s = this.s();
            if (s != null) {
                final androidx.appcompat.view.b d0 = s.D0(j);
                if ((this.g0 = d0) != null) {
                    final f z = this.Z;
                    if (z != null) {
                        z.onSupportActionModeStarted(d0);
                    }
                }
            }
            if (this.g0 == null) {
                this.g0 = this.T0(j);
            }
            return this.g0;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }
    
    androidx.appcompat.view.b T0(@j0 final androidx.appcompat.view.b.a a) {
        this.i0();
        final androidx.appcompat.view.b g0 = this.g0;
        if (g0 != null) {
            g0.c();
        }
        Object z = a;
        if (!(a instanceof j)) {
            z = new j(a);
        }
        final f z2 = this.Z;
        while (true) {
            if (z2 == null || this.E0) {
                break Label_0063;
            }
            try {
                androidx.appcompat.view.b onWindowStartingSupportActionMode = z2.onWindowStartingSupportActionMode((androidx.appcompat.view.b.a)z);
                while (true) {
                    if (onWindowStartingSupportActionMode != null) {
                        this.g0 = onWindowStartingSupportActionMode;
                    }
                    else {
                        final ActionBarContextView h0 = this.h0;
                        boolean b = true;
                        if (h0 == null) {
                            if (this.v0) {
                                final TypedValue typedValue = new TypedValue();
                                final Resources$Theme theme = this.W.getTheme();
                                theme.resolveAttribute(c.a.c.j, typedValue, true);
                                Object w;
                                if (typedValue.resourceId != 0) {
                                    final Resources$Theme theme2 = this.W.getResources().newTheme();
                                    theme2.setTo(theme);
                                    theme2.applyStyle(typedValue.resourceId, true);
                                    w = new androidx.appcompat.view.d(this.W, 0);
                                    ((Context)w).getTheme().setTo(theme2);
                                }
                                else {
                                    w = this.W;
                                }
                                this.h0 = new ActionBarContextView((Context)w);
                                androidx.core.widget.p.d(this.i0 = new PopupWindow((Context)w, (AttributeSet)null, c.a.c.y), 2);
                                this.i0.setContentView((View)this.h0);
                                this.i0.setWidth(-1);
                                ((Context)w).getTheme().resolveAttribute(c.a.c.d, typedValue, true);
                                this.h0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, ((Context)w).getResources().getDisplayMetrics()));
                                this.i0.setHeight(-2);
                                this.j0 = new Runnable() {
                                    @Override
                                    public void run() {
                                        final h g = h.this;
                                        g.i0.showAtLocation((View)g.h0, 55, 0, 0);
                                        h.this.i0();
                                        if (h.this.R0()) {
                                            h.this.h0.setAlpha(0.0f);
                                            final h g2 = h.this;
                                            g2.k0 = androidx.core.view.j0.f((View)g2.h0).a(1.0f);
                                            h.this.k0.s(new r0() {
                                                @Override
                                                public void b(final View view) {
                                                    h.this.h0.setAlpha(1.0f);
                                                    h.this.k0.s(null);
                                                    h.this.k0 = null;
                                                }
                                                
                                                @Override
                                                public void c(final View view) {
                                                    h.this.h0.setVisibility(0);
                                                }
                                            });
                                        }
                                        else {
                                            h.this.h0.setAlpha(1.0f);
                                            h.this.h0.setVisibility(0);
                                        }
                                    }
                                };
                            }
                            else {
                                final ViewStubCompat viewStubCompat = (ViewStubCompat)this.n0.findViewById(a.h.V);
                                if (viewStubCompat != null) {
                                    viewStubCompat.setLayoutInflater(LayoutInflater.from(this.n0()));
                                    this.h0 = (ActionBarContextView)viewStubCompat.a();
                                }
                            }
                        }
                        if (this.h0 != null) {
                            this.i0();
                            this.h0.t();
                            final Context context = this.h0.getContext();
                            final ActionBarContextView h2 = this.h0;
                            if (this.i0 != null) {
                                b = false;
                            }
                            final androidx.appcompat.view.e g2 = new androidx.appcompat.view.e(context, h2, (androidx.appcompat.view.b.a)z, b);
                            if (((androidx.appcompat.view.b.a)z).b(g2, g2.e())) {
                                g2.k();
                                this.h0.q(g2);
                                this.g0 = g2;
                                if (this.R0()) {
                                    this.h0.setAlpha(0.0f);
                                    (this.k0 = androidx.core.view.j0.f((View)this.h0).a(1.0f)).s(new r0() {
                                        @Override
                                        public void b(final View view) {
                                            h.this.h0.setAlpha(1.0f);
                                            h.this.k0.s(null);
                                            h.this.k0 = null;
                                        }
                                        
                                        @Override
                                        public void c(final View view) {
                                            h.this.h0.setVisibility(0);
                                            h.this.h0.sendAccessibilityEvent(32);
                                            if (h.this.h0.getParent() instanceof View) {
                                                androidx.core.view.j0.t1((View)h.this.h0.getParent());
                                            }
                                        }
                                    });
                                }
                                else {
                                    this.h0.setAlpha(1.0f);
                                    this.h0.setVisibility(0);
                                    this.h0.sendAccessibilityEvent(32);
                                    if (this.h0.getParent() instanceof View) {
                                        androidx.core.view.j0.t1((View)this.h0.getParent());
                                    }
                                }
                                if (this.i0 != null) {
                                    this.X.getDecorView().post(this.j0);
                                }
                            }
                            else {
                                this.g0 = null;
                            }
                        }
                    }
                    final androidx.appcompat.view.b g3 = this.g0;
                    if (g3 != null) {
                        z = this.Z;
                        if (z != null) {
                            ((f)z).onSupportActionModeStarted(g3);
                        }
                    }
                    return this.g0;
                    onWindowStartingSupportActionMode = null;
                    continue;
                }
            }
            catch (AbstractMethodError abstractMethodError) {
                continue;
            }
            break;
        }
    }
    
    void Y(final int n, final u u, final Menu menu) {
        u u2 = u;
        Object j = menu;
        if (menu == null) {
            u u3;
            if ((u3 = u) == null) {
                u3 = u;
                if (n >= 0) {
                    final u[] y0 = this.y0;
                    u3 = u;
                    if (n < y0.length) {
                        u3 = y0[n];
                    }
                }
            }
            u2 = u3;
            j = menu;
            if (u3 != null) {
                j = u3.j;
                u2 = u3;
            }
        }
        if (u2 != null && !u2.o) {
            return;
        }
        if (!this.E0) {
            this.Y.a().onPanelClosed(n, (Menu)j);
        }
    }
    
    final int Y0(@k0 x0 n0, @k0 final Rect rect) {
        final int n2 = 0;
        int n3;
        if (n0 != null) {
            n3 = n0.r();
        }
        else if (rect != null) {
            n3 = rect.top;
        }
        else {
            n3 = 0;
        }
        final ActionBarContextView h0 = this.h0;
        int n10;
        int n11;
        if (h0 != null && h0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)this.h0.getLayoutParams();
            final boolean shown = this.h0.isShown();
            int n4 = 1;
            final int n5 = 1;
            int n9;
            if (shown) {
                if (this.P0 == null) {
                    this.P0 = new Rect();
                    this.Q0 = new Rect();
                }
                final Rect p2 = this.P0;
                final Rect q0 = this.Q0;
                if (n0 == null) {
                    p2.set(rect);
                }
                else {
                    p2.set(n0.p(), n0.r(), n0.q(), n0.o());
                }
                a1.a((View)this.n0, p2, q0);
                final int top = p2.top;
                final int left = p2.left;
                final int right = p2.right;
                n0 = androidx.core.view.j0.n0((View)this.n0);
                int p3;
                if (n0 == null) {
                    p3 = 0;
                }
                else {
                    p3 = n0.p();
                }
                int q2;
                if (n0 == null) {
                    q2 = 0;
                }
                else {
                    q2 = n0.q();
                }
                int n6;
                if (layoutParams.topMargin == top && layoutParams.leftMargin == left && layoutParams.rightMargin == right) {
                    n6 = 0;
                }
                else {
                    layoutParams.topMargin = top;
                    layoutParams.leftMargin = left;
                    layoutParams.rightMargin = right;
                    n6 = 1;
                }
                if (top > 0 && this.p0 == null) {
                    (this.p0 = new View(this.W)).setVisibility(8);
                    final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, layoutParams.topMargin, 51);
                    frameLayout$LayoutParams.leftMargin = p3;
                    frameLayout$LayoutParams.rightMargin = q2;
                    this.n0.addView(this.p0, -1, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
                }
                else {
                    final View p4 = this.p0;
                    if (p4 != null) {
                        final ViewGroup$MarginLayoutParams layoutParams2 = (ViewGroup$MarginLayoutParams)p4.getLayoutParams();
                        final int height = layoutParams2.height;
                        final int topMargin = layoutParams.topMargin;
                        if (height != topMargin || layoutParams2.leftMargin != p3 || layoutParams2.rightMargin != q2) {
                            layoutParams2.height = topMargin;
                            layoutParams2.leftMargin = p3;
                            layoutParams2.rightMargin = q2;
                            this.p0.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                        }
                    }
                }
                final View p5 = this.p0;
                int n7;
                if (p5 != null) {
                    n7 = n5;
                }
                else {
                    n7 = 0;
                }
                if (n7 != 0 && p5.getVisibility() != 0) {
                    this.Z0(this.p0);
                }
                int n8 = n3;
                if (!this.u0) {
                    n8 = n3;
                    if (n7 != 0) {
                        n8 = 0;
                    }
                }
                n3 = n8;
                n4 = n6;
                n9 = n7;
            }
            else if (layoutParams.topMargin != 0) {
                layoutParams.topMargin = 0;
                n9 = 0;
            }
            else {
                n9 = 0;
                n4 = 0;
            }
            n10 = n3;
            n11 = n9;
            if (n4 != 0) {
                this.h0.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                n10 = n3;
                n11 = n9;
            }
        }
        else {
            n11 = 0;
            n10 = n3;
        }
        final View p6 = this.p0;
        if (p6 != null) {
            int visibility;
            if (n11 != 0) {
                visibility = n2;
            }
            else {
                visibility = 8;
            }
            p6.setVisibility(visibility);
        }
        return n10;
    }
    
    void Z(@j0 final androidx.appcompat.view.menu.g g) {
        if (this.x0) {
            return;
        }
        this.x0 = true;
        this.d0.n();
        final Window$Callback u0 = this.u0();
        if (u0 != null && !this.E0) {
            u0.onPanelClosed(108, (Menu)g);
        }
        this.x0 = false;
    }
    
    @Override
    public boolean a(@j0 final androidx.appcompat.view.menu.g g, @j0 final MenuItem menuItem) {
        final Window$Callback u0 = this.u0();
        if (u0 != null && !this.E0) {
            final u l0 = this.l0((Menu)g.G());
            if (l0 != null) {
                return u0.onMenuItemSelected(l0.a, menuItem);
            }
        }
        return false;
    }
    
    @Override
    public void b(@j0 final androidx.appcompat.view.menu.g g) {
        this.P0(true);
    }
    
    void b0(final int n) {
        this.c0(this.r0(n, true), true);
    }
    
    void c0(final u u, final boolean b) {
        if (b && u.a == 0) {
            final z d0 = this.d0;
            if (d0 != null && d0.d()) {
                this.Z(u.j);
                return;
            }
        }
        final WindowManager windowManager = (WindowManager)this.W.getSystemService("window");
        if (windowManager != null && u.o) {
            final ViewGroup g = u.g;
            if (g != null) {
                windowManager.removeView((View)g);
                if (b) {
                    this.Y(u.a, u, null);
                }
            }
        }
        u.m = false;
        u.n = false;
        u.o = false;
        u.h = null;
        u.q = true;
        if (this.z0 == u) {
            this.z0 = null;
        }
    }
    
    @Override
    public void d(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.j0();
        ((ViewGroup)this.n0.findViewById(16908290)).addView(view, viewGroup$LayoutParams);
        this.Y.a().onContentChanged();
    }
    
    @Override
    public boolean e() {
        return this.U(true);
    }
    
    void f0() {
        final z d0 = this.d0;
        if (d0 != null) {
            d0.n();
        }
        Label_0059: {
            if (this.i0 == null) {
                break Label_0059;
            }
            this.X.getDecorView().removeCallbacks(this.j0);
            while (true) {
                if (!this.i0.isShowing()) {
                    break Label_0054;
                }
                try {
                    this.i0.dismiss();
                    this.i0 = null;
                    this.i0();
                    final u r0 = this.r0(0, false);
                    if (r0 != null) {
                        final androidx.appcompat.view.menu.g j = r0.j;
                        if (j != null) {
                            j.close();
                        }
                    }
                }
                catch (IllegalArgumentException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    boolean g0(final KeyEvent keyEvent) {
        final Object v = this.V;
        final boolean b = v instanceof androidx.core.view.k.a;
        boolean b2 = true;
        if (b || v instanceof androidx.appcompat.app.i) {
            final View decorView = this.X.getDecorView();
            if (decorView != null && androidx.core.view.k.d(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82 && this.Y.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        final int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            b2 = false;
        }
        boolean b3;
        if (b2) {
            b3 = this.D0(keyCode, keyEvent);
        }
        else {
            b3 = this.G0(keyCode, keyEvent);
        }
        return b3;
    }
    
    @androidx.annotation.i
    @j0
    @Override
    public Context h(@j0 final Context context) {
        int n = 1;
        this.B0 = true;
        final int b0 = this.B0(context, this.X());
        final boolean x0 = h.X0;
        final Configuration configuration = null;
        if (x0 && context instanceof ContextThemeWrapper) {
            final Configuration d0 = this.d0(context, b0, null);
            try {
                s.a((ContextThemeWrapper)context, d0);
                return context;
            }
            catch (IllegalStateException ex) {}
        }
        if (context instanceof androidx.appcompat.view.d) {
            final Configuration d2 = this.d0(context, b0, null);
            try {
                ((androidx.appcompat.view.d)context).a(d2);
                return context;
            }
            catch (IllegalStateException ex2) {}
        }
        if (!h.W0) {
            return super.h(context);
        }
        Configuration m0 = configuration;
        if (Build$VERSION.SDK_INT >= 17) {
            final Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            final Configuration configuration3 = k.a(context, configuration2).getResources().getConfiguration();
            final Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            m0 = configuration;
            if (!configuration3.equals(configuration4)) {
                m0 = m0(configuration3, configuration4);
            }
        }
        final Configuration d3 = this.d0(context, b0, m0);
        final androidx.appcompat.view.d d4 = new androidx.appcompat.view.d(context, c.a.m.g4);
        d4.a(d3);
        final int n2 = 0;
        try {
            if (context.getTheme() == null) {
                n = 0;
            }
        }
        catch (NullPointerException ex3) {
            n = n2;
        }
        if (n != 0) {
            androidx.core.content.res.g.e.a(d4.getTheme());
        }
        return super.h((Context)d4);
    }
    
    void h0(final int n) {
        final u r0 = this.r0(n, true);
        if (r0.j != null) {
            final Bundle u = new Bundle();
            r0.j.V(u);
            if (u.size() > 0) {
                r0.u = u;
            }
            r0.j.m0();
            r0.j.clear();
        }
        r0.r = true;
        r0.q = true;
        if ((n == 108 || n == 0) && this.d0 != null) {
            final u r2 = this.r0(0, false);
            if (r2 != null) {
                r2.m = false;
                this.O0(r2, null);
            }
        }
    }
    
    void i0() {
        final p0 k0 = this.k0;
        if (k0 != null) {
            k0.c();
        }
    }
    
    u l0(final Menu menu) {
        final u[] y0 = this.y0;
        int i = 0;
        int length;
        if (y0 != null) {
            length = y0.length;
        }
        else {
            length = 0;
        }
        while (i < length) {
            final u u = y0[i];
            if (u != null && u.j == menu) {
                return u;
            }
            ++i;
        }
        return null;
    }
    
    @Override
    public View m(final View view, final String s, @j0 final Context context, @j0 final AttributeSet set) {
        final androidx.appcompat.app.j r0 = this.R0;
        boolean s2 = false;
        Label_0147: {
            if (r0 == null) {
                final String string = this.W.obtainStyledAttributes(c.a.n.f1).getString(c.a.n.s3);
                androidx.appcompat.app.j r2 = null;
                Label_0046: {
                    if (string != null) {
                        try {
                            this.R0 = (androidx.appcompat.app.j)Class.forName(string).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                        }
                        finally {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Failed to instantiate custom view inflater ");
                            sb.append(string);
                            sb.append(". Falling back to default.");
                            final Throwable t;
                            Log.i("AppCompatDelegate", sb.toString(), t);
                            r2 = new androidx.appcompat.app.j();
                            break Label_0046;
                        }
                        break Label_0147;
                    }
                    r2 = new androidx.appcompat.app.j();
                }
                this.R0 = r2;
            }
        }
        final boolean u0 = h.U0;
        if (u0) {
            if (this.S0 == null) {
                this.S0 = new androidx.appcompat.app.k();
            }
            if (this.S0.a(set)) {
                s2 = true;
            }
            else if (set instanceof XmlPullParser) {
                if (((XmlPullParser)set).getDepth() > 1) {
                    s2 = true;
                }
            }
            else {
                s2 = this.S0((ViewParent)view);
            }
        }
        else {
            s2 = false;
        }
        return this.R0.q(view, s, context, set, s2, u0, true, androidx.appcompat.widget.z0.c());
    }
    
    @k0
    @Override
    public <T extends View> T n(@androidx.annotation.y final int n) {
        this.j0();
        return (T)this.X.findViewById(n);
    }
    
    final Context n0() {
        final androidx.appcompat.app.a s = this.s();
        Context a;
        if (s != null) {
            a = s.A();
        }
        else {
            a = null;
        }
        Context w = a;
        if (a == null) {
            w = this.W;
        }
        return w;
    }
    
    public final View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        return this.m(view, s, context, set);
    }
    
    public View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
    
    @Override
    public final androidx.appcompat.app.b.b p() {
        return new h();
    }
    
    @b1
    @j0
    @t0({ androidx.annotation.t0.a.G })
    final q p0() {
        return this.q0(this.W);
    }
    
    @Override
    public int q() {
        return this.F0;
    }
    
    @Override
    public MenuInflater r() {
        if (this.b0 == null) {
            this.v0();
            final androidx.appcompat.app.a a0 = this.a0;
            Context context;
            if (a0 != null) {
                context = a0.A();
            }
            else {
                context = this.W;
            }
            this.b0 = new androidx.appcompat.view.g(context);
        }
        return this.b0;
    }
    
    protected u r0(final int n, final boolean b) {
        final u[] y0 = this.y0;
        u[] y2 = null;
        Label_0046: {
            if (y0 != null) {
                y2 = y0;
                if (y0.length > n) {
                    break Label_0046;
                }
            }
            y2 = new u[n + 1];
            if (y0 != null) {
                System.arraycopy(y0, 0, y2, 0, y0.length);
            }
            this.y0 = y2;
        }
        u u;
        if ((u = y2[n]) == null) {
            u = new u(n);
            y2[n] = u;
        }
        return u;
    }
    
    @Override
    public androidx.appcompat.app.a s() {
        this.v0();
        return this.a0;
    }
    
    ViewGroup s0() {
        return this.n0;
    }
    
    @Override
    public boolean t(final int n) {
        final int q0 = this.Q0(n);
        final boolean b = true;
        boolean b2;
        if (q0 != 1) {
            if (q0 != 2) {
                if (q0 != 5) {
                    if (q0 != 10) {
                        if (q0 != 108) {
                            b2 = (q0 == 109 && this.t0);
                        }
                        else {
                            b2 = this.s0;
                        }
                    }
                    else {
                        b2 = this.u0;
                    }
                }
                else {
                    b2 = this.r0;
                }
            }
            else {
                b2 = this.q0;
            }
        }
        else {
            b2 = this.w0;
        }
        boolean b3 = b;
        if (!b2) {
            b3 = (this.X.hasFeature(n) && b);
        }
        return b3;
    }
    
    final CharSequence t0() {
        final Object v = this.V;
        if (v instanceof Activity) {
            return ((Activity)v).getTitle();
        }
        return this.c0;
    }
    
    @Override
    public void u() {
        final LayoutInflater from = LayoutInflater.from(this.W);
        if (from.getFactory() == null) {
            androidx.core.view.l.d(from, (LayoutInflater$Factory2)this);
        }
        else if (!(from.getFactory2() instanceof h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }
    
    final Window$Callback u0() {
        return this.X.getCallback();
    }
    
    @Override
    public void v() {
        final androidx.appcompat.app.a s = this.s();
        if (s != null && s.D()) {
            return;
        }
        this.z0(0);
    }
    
    @Override
    public boolean x() {
        return this.l0;
    }
    
    @Override
    public void y(final Configuration configuration) {
        if (this.s0 && this.m0) {
            final androidx.appcompat.app.a s = this.s();
            if (s != null) {
                s.I(configuration);
            }
        }
        androidx.appcompat.widget.j.b().g(this.W);
        this.U(false);
    }
    
    @Override
    public void z(Bundle d) {
        this.B0 = true;
        this.U(false);
        this.k0();
        final Object v = this.V;
        if (v instanceof Activity) {
            d = null;
            try {
                d = (Bundle)androidx.core.app.n.d((Activity)v);
            }
            catch (IllegalArgumentException ex) {}
            if (d != null) {
                final androidx.appcompat.app.a m0 = this.M0();
                if (m0 == null) {
                    this.O0 = true;
                }
                else {
                    m0.X(true);
                }
            }
            g.c(this);
        }
        this.C0 = true;
    }
    
    private class h implements b.b
    {
        h() {
        }
        
        @Override
        public void a(final Drawable drawable, final int n) {
            final androidx.appcompat.app.a s = androidx.appcompat.app.h.this.s();
            if (s != null) {
                s.l0(drawable);
                s.i0(n);
            }
        }
        
        @Override
        public Drawable b() {
            final u0 f = u0.F(this.e(), null, new int[] { c.a.c.L1 });
            final Drawable h = f.h(0);
            f.I();
            return h;
        }
        
        @Override
        public void c(final int n) {
            final androidx.appcompat.app.a s = androidx.appcompat.app.h.this.s();
            if (s != null) {
                s.i0(n);
            }
        }
        
        @Override
        public boolean d() {
            final androidx.appcompat.app.a s = androidx.appcompat.app.h.this.s();
            return s != null && (s.p() & 0x4) != 0x0;
        }
        
        @Override
        public Context e() {
            return androidx.appcompat.app.h.this.n0();
        }
    }
    
    private final class i implements n.a
    {
        i() {
        }
        
        @Override
        public void d(@j0 final androidx.appcompat.view.menu.g g, final boolean b) {
            h.this.Z(g);
        }
        
        @Override
        public boolean e(@j0 final androidx.appcompat.view.menu.g g) {
            final Window$Callback u0 = h.this.u0();
            if (u0 != null) {
                u0.onMenuOpened(108, (Menu)g);
            }
            return true;
        }
    }
    
    class j implements b.a
    {
        private b.a a;
        
        public j(final b.a a) {
            this.a = a;
        }
        
        @Override
        public void a(final b b) {
            this.a.a(b);
            final h b2 = h.this;
            if (b2.i0 != null) {
                b2.X.getDecorView().removeCallbacks(h.this.j0);
            }
            final h b3 = h.this;
            if (b3.h0 != null) {
                b3.i0();
                final h b4 = h.this;
                b4.k0 = androidx.core.view.j0.f((View)b4.h0).a(0.0f);
                h.this.k0.s(new r0() {
                    @Override
                    public void b(final View view) {
                        h.this.h0.setVisibility(8);
                        final h b = h.this;
                        final PopupWindow i0 = b.i0;
                        if (i0 != null) {
                            i0.dismiss();
                        }
                        else if (b.h0.getParent() instanceof View) {
                            androidx.core.view.j0.t1((View)h.this.h0.getParent());
                        }
                        h.this.h0.t();
                        h.this.k0.s(null);
                        final h b2 = h.this;
                        b2.k0 = null;
                        androidx.core.view.j0.t1((View)b2.n0);
                    }
                });
            }
            final h b5 = h.this;
            final f z = b5.Z;
            if (z != null) {
                z.onSupportActionModeFinished(b5.g0);
            }
            final h b6 = h.this;
            b6.g0 = null;
            androidx.core.view.j0.t1((View)b6.n0);
        }
        
        @Override
        public boolean b(final b b, final Menu menu) {
            return this.a.b(b, menu);
        }
        
        @Override
        public boolean c(final b b, final Menu menu) {
            androidx.core.view.j0.t1((View)h.this.n0);
            return this.a.c(b, menu);
        }
        
        @Override
        public boolean d(final b b, final MenuItem menuItem) {
            return this.a.d(b, menuItem);
        }
    }
    
    @androidx.annotation.p0(17)
    static class k
    {
        private k() {
        }
        
        static Context a(@j0 final Context context, @j0 final Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }
        
        static void b(@j0 final Configuration configuration, @j0 final Configuration configuration2, @j0 final Configuration configuration3) {
            final int densityDpi = configuration.densityDpi;
            final int densityDpi2 = configuration2.densityDpi;
            if (densityDpi != densityDpi2) {
                configuration3.densityDpi = densityDpi2;
            }
        }
    }
    
    @androidx.annotation.p0(21)
    static class l
    {
        private l() {
        }
        
        static boolean a(final PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }
    
    @androidx.annotation.p0(24)
    static class m
    {
        private m() {
        }
        
        static void a(@j0 final Configuration configuration, @j0 final Configuration configuration2, @j0 final Configuration configuration3) {
            final LocaleList locales = configuration.getLocales();
            final LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals((Object)locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }
    
    @androidx.annotation.p0(26)
    static class n
    {
        private n() {
        }
        
        static void a(@j0 final Configuration configuration, @j0 final Configuration configuration2, @j0 final Configuration configuration3) {
            final int colorMode = configuration.colorMode;
            final int colorMode2 = configuration2.colorMode;
            if ((colorMode & 0x3) != (colorMode2 & 0x3)) {
                configuration3.colorMode |= (colorMode2 & 0x3);
            }
            final int colorMode3 = configuration.colorMode;
            final int colorMode4 = configuration2.colorMode;
            if ((colorMode3 & 0xC) != (colorMode4 & 0xC)) {
                configuration3.colorMode |= (colorMode4 & 0xC);
            }
        }
    }
    
    class o extends androidx.appcompat.view.i
    {
        o(final Window$Callback window$Callback) {
            super(window$Callback);
        }
        
        final ActionMode b(final ActionMode$Callback actionMode$Callback) {
            final androidx.appcompat.view.f.a a = new androidx.appcompat.view.f.a(h.this.W, actionMode$Callback);
            final androidx.appcompat.view.b t = h.this.T(a);
            if (t != null) {
                return a.e(t);
            }
            return null;
        }
        
        @Override
        public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
            return h.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }
        
        @Override
        public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.F0(keyEvent.getKeyCode(), keyEvent);
        }
        
        @Override
        public void onContentChanged() {
        }
        
        @Override
        public boolean onCreatePanelMenu(final int n, final Menu menu) {
            return (n != 0 || menu instanceof androidx.appcompat.view.menu.g) && super.onCreatePanelMenu(n, menu);
        }
        
        @Override
        public boolean onMenuOpened(final int n, final Menu menu) {
            super.onMenuOpened(n, menu);
            h.this.I0(n);
            return true;
        }
        
        @Override
        public void onPanelClosed(final int n, final Menu menu) {
            super.onPanelClosed(n, menu);
            h.this.J0(n);
        }
        
        @Override
        public boolean onPreparePanel(final int n, final View view, final Menu menu) {
            androidx.appcompat.view.menu.g g;
            if (menu instanceof androidx.appcompat.view.menu.g) {
                g = (androidx.appcompat.view.menu.g)menu;
            }
            else {
                g = null;
            }
            if (n == 0 && g == null) {
                return false;
            }
            if (g != null) {
                g.i0(true);
            }
            final boolean onPreparePanel = super.onPreparePanel(n, view, menu);
            if (g != null) {
                g.i0(false);
            }
            return onPreparePanel;
        }
        
        @androidx.annotation.p0(24)
        @Override
        public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
            final u r0 = h.this.r0(0, true);
            if (r0 != null) {
                final androidx.appcompat.view.menu.g j = r0.j;
                if (j != null) {
                    super.onProvideKeyboardShortcuts(list, (Menu)j, n);
                    return;
                }
            }
            super.onProvideKeyboardShortcuts(list, menu, n);
        }
        
        @Override
        public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
            if (Build$VERSION.SDK_INT >= 23) {
                return null;
            }
            if (h.this.x()) {
                return this.b(actionMode$Callback);
            }
            return super.onWindowStartingActionMode(actionMode$Callback);
        }
        
        @androidx.annotation.p0(23)
        @Override
        public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
            if (h.this.x() && n == 0) {
                return this.b(actionMode$Callback);
            }
            return super.onWindowStartingActionMode(actionMode$Callback, n);
        }
    }
    
    private class p extends q
    {
        private final PowerManager c;
        
        p(final Context context) {
            this.c = (PowerManager)context.getApplicationContext().getSystemService("power");
        }
        
        @Override
        IntentFilter b() {
            if (Build$VERSION.SDK_INT >= 21) {
                final IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }
        
        public int c() {
            final int sdk_INT = Build$VERSION.SDK_INT;
            int n = 1;
            if (sdk_INT >= 21) {
                n = n;
                if (l.a(this.c)) {
                    n = 2;
                }
            }
            return n;
        }
        
        public void e() {
            h.this.e();
        }
    }
    
    @b1
    @t0({ androidx.annotation.t0.a.G })
    abstract class q
    {
        private BroadcastReceiver a;
        
        void a() {
            final BroadcastReceiver a = this.a;
            if (a == null) {
                return;
            }
            while (true) {
                try {
                    h.this.W.unregisterReceiver(a);
                    this.a = null;
                }
                catch (IllegalArgumentException ex) {
                    continue;
                }
                break;
            }
        }
        
        @k0
        abstract IntentFilter b();
        
        abstract int c();
        
        boolean d() {
            return this.a != null;
        }
        
        abstract void e();
        
        void f() {
            this.a();
            final IntentFilter b = this.b();
            if (b != null) {
                if (b.countActions() != 0) {
                    if (this.a == null) {
                        this.a = new BroadcastReceiver() {
                            public void onReceive(final Context context, final Intent intent) {
                                q.this.e();
                            }
                        };
                    }
                    h.this.W.registerReceiver(this.a, b);
                }
            }
        }
    }
    
    private class r extends q
    {
        private final androidx.appcompat.app.p c;
        
        r(final androidx.appcompat.app.p c) {
            this.c = c;
        }
        
        @Override
        IntentFilter b() {
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
        
        public int c() {
            int n;
            if (this.c.d()) {
                n = 2;
            }
            else {
                n = 1;
            }
            return n;
        }
        
        public void e() {
            h.this.e();
        }
    }
    
    @androidx.annotation.p0(17)
    private static class s
    {
        static void a(final ContextThemeWrapper contextThemeWrapper, final Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }
    
    private class t extends ContentFrameLayout
    {
        public t(final Context context) {
            super(context);
        }
        
        private boolean c(final int n, final int n2) {
            return n < -5 || n2 < -5 || n > this.getWidth() + 5 || n2 > this.getHeight() + 5;
        }
        
        public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
            return h.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }
        
        public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && this.c((int)motionEvent.getX(), (int)motionEvent.getY())) {
                h.this.b0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        
        public void setBackgroundResource(final int n) {
            this.setBackgroundDrawable(androidx.appcompat.content.res.a.d(this.getContext(), n));
        }
    }
    
    protected static final class u
    {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.g j;
        androidx.appcompat.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q;
        boolean r;
        boolean s;
        Bundle t;
        Bundle u;
        
        u(final int a) {
            this.a = a;
            this.q = false;
        }
        
        void a() {
            final androidx.appcompat.view.menu.g j = this.j;
            if (j != null) {
                final Bundle t = this.t;
                if (t != null) {
                    j.U(t);
                    this.t = null;
                }
            }
        }
        
        public void b() {
            final androidx.appcompat.view.menu.g j = this.j;
            if (j != null) {
                j.S(this.k);
            }
            this.k = null;
        }
        
        androidx.appcompat.view.menu.o c(final androidx.appcompat.view.menu.n.a a) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                (this.k = new androidx.appcompat.view.menu.e(this.l, c.a.k.q)).i(a);
                this.j.b(this.k);
            }
            return this.k.n(this.g);
        }
        
        public boolean d() {
            final View h = this.h;
            boolean b = false;
            if (h == null) {
                return false;
            }
            if (this.i != null) {
                return true;
            }
            if (this.k.a().getCount() > 0) {
                b = true;
            }
            return b;
        }
        
        void e(final Parcelable parcelable) {
            final a a = (a)parcelable;
            this.a = a.G;
            this.s = a.H;
            this.t = a.I;
            this.h = null;
            this.g = null;
        }
        
        Parcelable f() {
            final a a = new a();
            a.G = this.a;
            a.H = this.o;
            if (this.j != null) {
                final Bundle i = new Bundle();
                a.I = i;
                this.j.W(i);
            }
            return (Parcelable)a;
        }
        
        void g(final androidx.appcompat.view.menu.g j) {
            final androidx.appcompat.view.menu.g i = this.j;
            if (j == i) {
                return;
            }
            if (i != null) {
                i.S(this.k);
            }
            if ((this.j = j) != null) {
                final androidx.appcompat.view.menu.e k = this.k;
                if (k != null) {
                    j.b(k);
                }
            }
        }
        
        void h(final Context context) {
            final TypedValue typedValue = new TypedValue();
            final Resources$Theme theme = context.getResources().newTheme();
            theme.setTo(context.getTheme());
            theme.resolveAttribute(c.a.c.c, typedValue, true);
            final int resourceId = typedValue.resourceId;
            if (resourceId != 0) {
                theme.applyStyle(resourceId, true);
            }
            theme.resolveAttribute(c.a.c.E2, typedValue, true);
            int n = typedValue.resourceId;
            if (n == 0) {
                n = c.a.m.U3;
            }
            theme.applyStyle(n, true);
            final androidx.appcompat.view.d l = new androidx.appcompat.view.d(context, 0);
            ((Context)l).getTheme().setTo(theme);
            this.l = (Context)l;
            final TypedArray obtainStyledAttributes = ((Context)l).obtainStyledAttributes(c.a.n.f1);
            this.b = obtainStyledAttributes.getResourceId(c.a.n.O2, 0);
            this.f = obtainStyledAttributes.getResourceId(c.a.n.h1, 0);
            obtainStyledAttributes.recycle();
        }
        
        @SuppressLint({ "BanParcelableUsage" })
        private static class a implements Parcelable
        {
            public static final Parcelable$Creator<a> CREATOR;
            int G;
            boolean H;
            Bundle I;
            
            static {
                CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<a>() {
                    public a a(final Parcel parcel) {
                        return a.a(parcel, null);
                    }
                    
                    public a b(final Parcel parcel, final ClassLoader classLoader) {
                        return a.a(parcel, classLoader);
                    }
                    
                    public a[] c(final int n) {
                        return new a[n];
                    }
                };
            }
            
            a() {
            }
            
            static a a(final Parcel parcel, final ClassLoader classLoader) {
                final a a = new a();
                a.G = parcel.readInt();
                final int int1 = parcel.readInt();
                boolean h = true;
                if (int1 != 1) {
                    h = false;
                }
                a.H = h;
                if (h) {
                    a.I = parcel.readBundle(classLoader);
                }
                return a;
            }
            
            public int describeContents() {
                return 0;
            }
            
            public void writeToParcel(final Parcel parcel, final int n) {
                parcel.writeInt(this.G);
                parcel.writeInt((int)(this.H ? 1 : 0));
                if (this.H) {
                    parcel.writeBundle(this.I);
                }
            }
        }
    }
    
    private final class v implements n.a
    {
        v() {
        }
        
        @Override
        public void d(@j0 androidx.appcompat.view.menu.g g, final boolean b) {
            final Object g2 = g.G();
            final boolean b2 = g2 != g;
            final h g3 = h.this;
            if (b2) {
                g = (androidx.appcompat.view.menu.g)g2;
            }
            final u l0 = g3.l0((Menu)g);
            if (l0 != null) {
                if (b2) {
                    h.this.Y(l0.a, l0, (Menu)g2);
                    h.this.c0(l0, true);
                }
                else {
                    h.this.c0(l0, b);
                }
            }
        }
        
        @Override
        public boolean e(@j0 final androidx.appcompat.view.menu.g g) {
            if (g == g.G()) {
                final h g2 = h.this;
                if (g2.s0) {
                    final Window$Callback u0 = g2.u0();
                    if (u0 != null && !h.this.E0) {
                        u0.onMenuOpened(108, (Menu)g);
                    }
                }
            }
            return true;
        }
    }
}
