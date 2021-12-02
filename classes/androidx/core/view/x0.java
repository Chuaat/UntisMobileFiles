// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.WindowInsets$Type;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.t0;
import java.util.Objects;
import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import android.view.DisplayCutout;
import android.view.WindowInsets$Builder;
import java.lang.reflect.Constructor;
import android.util.Log;
import java.lang.reflect.Field;
import androidx.annotation.b0;
import androidx.core.util.i;
import android.graphics.Rect;
import androidx.core.graphics.j;
import androidx.core.util.n;
import android.view.View;
import androidx.annotation.k0;
import androidx.annotation.p0;
import android.view.WindowInsets;
import android.os.Build$VERSION;
import androidx.annotation.j0;

public class x0
{
    private static final String b = "WindowInsetsCompat";
    @j0
    public static final x0 c;
    private final l a;
    
    static {
        x0 c2;
        if (Build$VERSION.SDK_INT >= 30) {
            c2 = k.r;
        }
        else {
            c2 = l.b;
        }
        c = c2;
    }
    
    @p0(20)
    private x0(@j0 final WindowInsets windowInsets) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        l a;
        if (sdk_INT >= 30) {
            a = new k(this, windowInsets);
        }
        else if (sdk_INT >= 29) {
            a = new j(this, windowInsets);
        }
        else if (sdk_INT >= 28) {
            a = new i(this, windowInsets);
        }
        else if (sdk_INT >= 21) {
            a = new h(this, windowInsets);
        }
        else {
            if (sdk_INT < 20) {
                this.a = new l(this);
                return;
            }
            a = new g(this, windowInsets);
        }
        this.a = a;
    }
    
    public x0(@k0 final x0 x0) {
        if (x0 != null) {
            final l a = x0.a;
            final int sdk_INT = Build$VERSION.SDK_INT;
            Object a2;
            if (sdk_INT >= 30 && a instanceof k) {
                a2 = new k(this, (k)a);
            }
            else if (sdk_INT >= 29 && a instanceof j) {
                a2 = new j(this, (j)a);
            }
            else if (sdk_INT >= 28 && a instanceof i) {
                a2 = new i(this, (i)a);
            }
            else if (sdk_INT >= 21 && a instanceof h) {
                a2 = new h(this, (h)a);
            }
            else if (sdk_INT >= 20 && a instanceof g) {
                a2 = new g(this, (g)a);
            }
            else {
                a2 = new l(this);
            }
            this.a = (l)a2;
            a.e(this);
        }
        else {
            this.a = new l(this);
        }
    }
    
    @j0
    @p0(20)
    public static x0 K(@j0 final WindowInsets windowInsets) {
        return L(windowInsets, null);
    }
    
    @j0
    @p0(20)
    public static x0 L(@j0 final WindowInsets windowInsets, @k0 final View view) {
        final x0 x0 = new x0(androidx.core.util.n.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            x0.H(androidx.core.view.j0.n0(view));
            x0.d(view.getRootView());
        }
        return x0;
    }
    
    static androidx.core.graphics.j z(@j0 final androidx.core.graphics.j j, final int n, final int n2, final int n3, final int n4) {
        final int max = Math.max(0, j.a - n);
        final int max2 = Math.max(0, j.b - n2);
        final int max3 = Math.max(0, j.c - n3);
        final int max4 = Math.max(0, j.d - n4);
        if (max == n && max2 == n2 && max3 == n3 && max4 == n4) {
            return j;
        }
        return j.d(max, max2, max3, max4);
    }
    
    public boolean A() {
        return this.a.o();
    }
    
    public boolean B() {
        return this.a.p();
    }
    
    public boolean C(final int n) {
        return this.a.q(n);
    }
    
    @Deprecated
    @j0
    public x0 D(final int n, final int n2, final int n3, final int n4) {
        return new b(this).h(androidx.core.graphics.j.d(n, n2, n3, n4)).a();
    }
    
    @Deprecated
    @j0
    public x0 E(@j0 final Rect rect) {
        return new b(this).h(androidx.core.graphics.j.e(rect)).a();
    }
    
    void F(final androidx.core.graphics.j[] array) {
        this.a.r(array);
    }
    
    void G(@j0 final androidx.core.graphics.j j) {
        this.a.s(j);
    }
    
    void H(@k0 final x0 x0) {
        this.a.t(x0);
    }
    
    void I(@k0 final androidx.core.graphics.j j) {
        this.a.u(j);
    }
    
    @k0
    @p0(20)
    public WindowInsets J() {
        final l a = this.a;
        WindowInsets c;
        if (a instanceof g) {
            c = ((g)a).c;
        }
        else {
            c = null;
        }
        return c;
    }
    
    @Deprecated
    @j0
    public x0 a() {
        return this.a.a();
    }
    
    @Deprecated
    @j0
    public x0 b() {
        return this.a.b();
    }
    
    @Deprecated
    @j0
    public x0 c() {
        return this.a.c();
    }
    
    void d(@j0 final View view) {
        this.a.d(view);
    }
    
    @k0
    public androidx.core.view.e e() {
        return this.a.f();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof x0 && androidx.core.util.i.a(this.a, ((x0)o).a));
    }
    
    @j0
    public androidx.core.graphics.j f(final int n) {
        return this.a.g(n);
    }
    
    @j0
    public androidx.core.graphics.j g(final int n) {
        return this.a.h(n);
    }
    
    @Deprecated
    @j0
    public androidx.core.graphics.j h() {
        return this.a.i();
    }
    
    @Override
    public int hashCode() {
        final l a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Deprecated
    public int i() {
        return this.a.j().d;
    }
    
    @Deprecated
    public int j() {
        return this.a.j().a;
    }
    
    @Deprecated
    public int k() {
        return this.a.j().c;
    }
    
    @Deprecated
    public int l() {
        return this.a.j().b;
    }
    
    @Deprecated
    @j0
    public androidx.core.graphics.j m() {
        return this.a.j();
    }
    
    @Deprecated
    @j0
    public androidx.core.graphics.j n() {
        return this.a.k();
    }
    
    @Deprecated
    public int o() {
        return this.a.l().d;
    }
    
    @Deprecated
    public int p() {
        return this.a.l().a;
    }
    
    @Deprecated
    public int q() {
        return this.a.l().c;
    }
    
    @Deprecated
    public int r() {
        return this.a.l().b;
    }
    
    @Deprecated
    @j0
    public androidx.core.graphics.j s() {
        return this.a.l();
    }
    
    @Deprecated
    @j0
    public androidx.core.graphics.j t() {
        return this.a.m();
    }
    
    public boolean u() {
        final androidx.core.graphics.j f = this.f(m.a());
        final androidx.core.graphics.j e = androidx.core.graphics.j.e;
        return !f.equals(e) || !this.g(m.a() ^ m.d()).equals(e) || this.e() != null;
    }
    
    @Deprecated
    public boolean v() {
        return this.a.j().equals(androidx.core.graphics.j.e) ^ true;
    }
    
    @Deprecated
    public boolean w() {
        return this.a.l().equals(androidx.core.graphics.j.e) ^ true;
    }
    
    @j0
    public x0 x(@b0(from = 0L) final int n, @b0(from = 0L) final int n2, @b0(from = 0L) final int n3, @b0(from = 0L) final int n4) {
        return this.a.n(n, n2, n3, n4);
    }
    
    @j0
    public x0 y(@j0 final androidx.core.graphics.j j) {
        return this.x(j.a, j.b, j.c, j.d);
    }
    
    @p0(21)
    static class a
    {
        private static Field a;
        private static Field b;
        private static Field c;
        private static boolean d;
        
        static {
            try {
                (x0.a.a = View.class.getDeclaredField("mAttachInfo")).setAccessible(true);
                final Class<?> forName = Class.forName("android.view.View$AttachInfo");
                (x0.a.b = forName.getDeclaredField("mStableInsets")).setAccessible(true);
                (x0.a.c = forName.getDeclaredField("mContentInsets")).setAccessible(true);
                x0.a.d = true;
            }
            catch (ReflectiveOperationException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(ex.getMessage());
                Log.w("WindowInsetsCompat", sb.toString(), (Throwable)ex);
            }
        }
        
        private a() {
        }
        
        @k0
        public static x0 a(@j0 final View view) {
            if (x0.a.d) {
                if (view.isAttachedToWindow()) {
                    final View rootView = view.getRootView();
                    try {
                        final Object value = x0.a.a.get(rootView);
                        if (value != null) {
                            final Rect rect = (Rect)x0.a.b.get(value);
                            final Rect rect2 = (Rect)x0.a.c.get(value);
                            if (rect != null && rect2 != null) {
                                final x0 a = new b().f(androidx.core.graphics.j.e(rect)).h(androidx.core.graphics.j.e(rect2)).a();
                                a.H(a);
                                a.d(view.getRootView());
                                return a;
                            }
                        }
                    }
                    catch (IllegalAccessException ex) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Failed to get insets from AttachInfo. ");
                        sb.append(ex.getMessage());
                        Log.w("WindowInsetsCompat", sb.toString(), (Throwable)ex);
                    }
                }
            }
            return null;
        }
    }
    
    public static final class b
    {
        private final f a;
        
        public b() {
            final int sdk_INT = Build$VERSION.SDK_INT;
            Object a;
            if (sdk_INT >= 30) {
                a = new e();
            }
            else if (sdk_INT >= 29) {
                a = new d();
            }
            else if (sdk_INT >= 20) {
                a = new c();
            }
            else {
                a = new f();
            }
            this.a = (f)a;
        }
        
        public b(@j0 final x0 x0) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            Object a;
            if (sdk_INT >= 30) {
                a = new e(x0);
            }
            else if (sdk_INT >= 29) {
                a = new d(x0);
            }
            else if (sdk_INT >= 20) {
                a = new c(x0);
            }
            else {
                a = new f(x0);
            }
            this.a = (f)a;
        }
        
        @j0
        public x0 a() {
            return this.a.b();
        }
        
        @j0
        public b b(@k0 final androidx.core.view.e e) {
            this.a.c(e);
            return this;
        }
        
        @j0
        public b c(final int n, @j0 final androidx.core.graphics.j j) {
            this.a.d(n, j);
            return this;
        }
        
        @j0
        public b d(final int n, @j0 final androidx.core.graphics.j j) {
            this.a.e(n, j);
            return this;
        }
        
        @Deprecated
        @j0
        public b e(@j0 final androidx.core.graphics.j j) {
            this.a.f(j);
            return this;
        }
        
        @Deprecated
        @j0
        public b f(@j0 final androidx.core.graphics.j j) {
            this.a.g(j);
            return this;
        }
        
        @Deprecated
        @j0
        public b g(@j0 final androidx.core.graphics.j j) {
            this.a.h(j);
            return this;
        }
        
        @Deprecated
        @j0
        public b h(@j0 final androidx.core.graphics.j j) {
            this.a.i(j);
            return this;
        }
        
        @Deprecated
        @j0
        public b i(@j0 final androidx.core.graphics.j j) {
            this.a.j(j);
            return this;
        }
        
        @j0
        public b j(final int n, final boolean b) {
            this.a.k(n, b);
            return this;
        }
    }
    
    @p0(api = 20)
    private static class c extends f
    {
        private static Field e;
        private static boolean f = false;
        private static Constructor<WindowInsets> g;
        private static boolean h = false;
        private WindowInsets c;
        private androidx.core.graphics.j d;
        
        c() {
            this.c = l();
        }
        
        c(@j0 final x0 x0) {
            super(x0);
            this.c = x0.J();
        }
        
        @k0
        private static WindowInsets l() {
            if (!c.f) {
                try {
                    c.e = WindowInsets.class.getDeclaredField("CONSUMED");
                }
                catch (ReflectiveOperationException ex) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", (Throwable)ex);
                }
                c.f = true;
            }
            final Field e = c.e;
            if (e != null) {
                try {
                    final WindowInsets windowInsets = (WindowInsets)e.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                }
                catch (ReflectiveOperationException ex2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", (Throwable)ex2);
                }
            }
            if (!c.h) {
                try {
                    c.g = WindowInsets.class.getConstructor(Rect.class);
                }
                catch (ReflectiveOperationException ex3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", (Throwable)ex3);
                }
                c.h = true;
            }
            final Constructor<WindowInsets> g = c.g;
            if (g != null) {
                try {
                    return g.newInstance(new Rect());
                }
                catch (ReflectiveOperationException ex4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", (Throwable)ex4);
                }
            }
            return null;
        }
        
        @j0
        @Override
        x0 b() {
            ((f)this).a();
            final x0 k = x0.K(this.c);
            k.F(super.b);
            k.I(this.d);
            return k;
        }
        
        @Override
        void g(@k0 final androidx.core.graphics.j d) {
            this.d = d;
        }
        
        @Override
        void i(@j0 final androidx.core.graphics.j j) {
            final WindowInsets c = this.c;
            if (c != null) {
                this.c = c.replaceSystemWindowInsets(j.a, j.b, j.c, j.d);
            }
        }
    }
    
    @p0(api = 29)
    private static class d extends f
    {
        final WindowInsets$Builder c;
        
        d() {
            this.c = new WindowInsets$Builder();
        }
        
        d(@j0 final x0 x0) {
            super(x0);
            final WindowInsets j = x0.J();
            WindowInsets$Builder c;
            if (j != null) {
                c = new WindowInsets$Builder(j);
            }
            else {
                c = new WindowInsets$Builder();
            }
            this.c = c;
        }
        
        @j0
        @Override
        x0 b() {
            ((f)this).a();
            final x0 k = x0.K(this.c.build());
            k.F(super.b);
            return k;
        }
        
        @Override
        void c(@k0 final androidx.core.view.e e) {
            final WindowInsets$Builder c = this.c;
            DisplayCutout h;
            if (e != null) {
                h = e.h();
            }
            else {
                h = null;
            }
            c.setDisplayCutout(h);
        }
        
        @Override
        void f(@j0 final androidx.core.graphics.j j) {
            this.c.setMandatorySystemGestureInsets(j.h());
        }
        
        @Override
        void g(@j0 final androidx.core.graphics.j j) {
            this.c.setStableInsets(j.h());
        }
        
        @Override
        void h(@j0 final androidx.core.graphics.j j) {
            this.c.setSystemGestureInsets(j.h());
        }
        
        @Override
        void i(@j0 final androidx.core.graphics.j j) {
            this.c.setSystemWindowInsets(j.h());
        }
        
        @Override
        void j(@j0 final androidx.core.graphics.j j) {
            this.c.setTappableElementInsets(j.h());
        }
    }
    
    @p0(30)
    private static class e extends d
    {
        e() {
        }
        
        e(@j0 final x0 x0) {
            super(x0);
        }
        
        @Override
        void d(final int n, @j0 final androidx.core.graphics.j j) {
            super.c.setInsets(x0.n.a(n), j.h());
        }
        
        @Override
        void e(final int n, @j0 final androidx.core.graphics.j j) {
            super.c.setInsetsIgnoringVisibility(x0.n.a(n), j.h());
        }
        
        @Override
        void k(final int n, final boolean b) {
            super.c.setVisible(x0.n.a(n), b);
        }
    }
    
    private static class f
    {
        private final x0 a;
        androidx.core.graphics.j[] b;
        
        f() {
            this(new x0((x0)null));
        }
        
        f(@j0 final x0 a) {
            this.a = a;
        }
        
        protected final void a() {
            final androidx.core.graphics.j[] b = this.b;
            if (b != null) {
                final androidx.core.graphics.j j = b[m.e(1)];
                androidx.core.graphics.j f;
                if ((f = this.b[m.e(2)]) == null) {
                    f = this.a.f(2);
                }
                androidx.core.graphics.j f2;
                if ((f2 = j) == null) {
                    f2 = this.a.f(1);
                }
                this.i(androidx.core.graphics.j.b(f2, f));
                final androidx.core.graphics.j i = this.b[m.e(16)];
                if (i != null) {
                    this.h(i);
                }
                final androidx.core.graphics.j k = this.b[m.e(32)];
                if (k != null) {
                    this.f(k);
                }
                final androidx.core.graphics.j l = this.b[m.e(64)];
                if (l != null) {
                    this.j(l);
                }
            }
        }
        
        @j0
        x0 b() {
            this.a();
            return this.a;
        }
        
        void c(@k0 final androidx.core.view.e e) {
        }
        
        void d(final int n, @j0 final androidx.core.graphics.j j) {
            if (this.b == null) {
                this.b = new androidx.core.graphics.j[9];
            }
            for (int i = 1; i <= 256; i <<= 1) {
                if ((n & i) != 0x0) {
                    this.b[m.e(i)] = j;
                }
            }
        }
        
        void e(final int n, @j0 final androidx.core.graphics.j j) {
            if (n != 8) {
                return;
            }
            throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
        }
        
        void f(@j0 final androidx.core.graphics.j j) {
        }
        
        void g(@j0 final androidx.core.graphics.j j) {
        }
        
        void h(@j0 final androidx.core.graphics.j j) {
        }
        
        void i(@j0 final androidx.core.graphics.j j) {
        }
        
        void j(@j0 final androidx.core.graphics.j j) {
        }
        
        void k(final int n, final boolean b) {
        }
    }
    
    @p0(20)
    private static class g extends l
    {
        private static boolean h = false;
        private static Method i;
        private static Class<?> j;
        private static Class<?> k;
        private static Field l;
        private static Field m;
        @j0
        final WindowInsets c;
        private androidx.core.graphics.j[] d;
        private androidx.core.graphics.j e;
        private x0 f;
        androidx.core.graphics.j g;
        
        g(@j0 final x0 x0, @j0 final WindowInsets c) {
            super(x0);
            this.e = null;
            this.c = c;
        }
        
        g(@j0 final x0 x0, @j0 final g g) {
            this(x0, new WindowInsets(g.c));
        }
        
        @SuppressLint({ "PrivateApi" })
        private static void A() {
            try {
                g.i = View.class.getDeclaredMethod("getViewRootImpl", (Class<?>[])new Class[0]);
                g.j = Class.forName("android.view.ViewRootImpl");
                g.l = (g.k = Class.forName("android.view.View$AttachInfo")).getDeclaredField("mVisibleInsets");
                g.m = g.j.getDeclaredField("mAttachInfo");
                g.l.setAccessible(true);
                g.m.setAccessible(true);
            }
            catch (ReflectiveOperationException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(ex.getMessage());
                Log.e("WindowInsetsCompat", sb.toString(), (Throwable)ex);
            }
            g.h = true;
        }
        
        @SuppressLint({ "WrongConstant" })
        @j0
        private androidx.core.graphics.j v(final int n, final boolean b) {
            androidx.core.graphics.j j = androidx.core.graphics.j.e;
            for (int i = 1; i <= 256; i <<= 1) {
                if ((n & i) != 0x0) {
                    j = androidx.core.graphics.j.b(j, this.w(i, b));
                }
            }
            return j;
        }
        
        private androidx.core.graphics.j x() {
            final x0 f = this.f;
            if (f != null) {
                return f.m();
            }
            return androidx.core.graphics.j.e;
        }
        
        @k0
        private androidx.core.graphics.j y(@j0 final View obj) {
            if (Build$VERSION.SDK_INT < 30) {
                if (!x0.g.h) {
                    A();
                }
                final Method i = x0.g.i;
                final androidx.core.graphics.j j = null;
                if (i != null && x0.g.k != null) {
                    if (x0.g.l != null) {
                        try {
                            final Object invoke = i.invoke(obj, new Object[0]);
                            if (invoke == null) {
                                Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", (Throwable)new NullPointerException());
                                return null;
                            }
                            final Rect rect = (Rect)x0.g.l.get(x0.g.m.get(invoke));
                            androidx.core.graphics.j e = j;
                            if (rect != null) {
                                e = androidx.core.graphics.j.e(rect);
                            }
                            return e;
                        }
                        catch (ReflectiveOperationException ex) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Failed to get visible insets. (Reflection error). ");
                            sb.append(ex.getMessage());
                            Log.e("WindowInsetsCompat", sb.toString(), (Throwable)ex);
                        }
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        
        @Override
        void d(@j0 final View view) {
            androidx.core.graphics.j j;
            if ((j = this.y(view)) == null) {
                j = androidx.core.graphics.j.e;
            }
            this.s(j);
        }
        
        @Override
        void e(@j0 final x0 x0) {
            x0.H(this.f);
            x0.G(this.g);
        }
        
        @Override
        public boolean equals(final Object o) {
            return super.equals(o) && Objects.equals(this.g, ((g)o).g);
        }
        
        @j0
        public androidx.core.graphics.j g(final int n) {
            return this.v(n, false);
        }
        
        @j0
        public androidx.core.graphics.j h(final int n) {
            return this.v(n, true);
        }
        
        @j0
        @Override
        final androidx.core.graphics.j l() {
            if (this.e == null) {
                this.e = androidx.core.graphics.j.d(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }
        
        @j0
        @Override
        x0 n(final int n, final int n2, final int n3, final int n4) {
            final b b = new b(x0.K(this.c));
            b.h(x0.z(this.l(), n, n2, n3, n4));
            b.f(x0.z(((l)this).j(), n, n2, n3, n4));
            return b.a();
        }
        
        @Override
        boolean p() {
            return this.c.isRound();
        }
        
        @SuppressLint({ "WrongConstant" })
        @Override
        boolean q(final int n) {
            for (int i = 1; i <= 256; i <<= 1) {
                if ((n & i) != 0x0) {
                    if (!this.z(i)) {
                        return false;
                    }
                }
            }
            return true;
        }
        
        @Override
        public void r(final androidx.core.graphics.j[] d) {
            this.d = d;
        }
        
        @Override
        void s(@j0 final androidx.core.graphics.j g) {
            this.g = g;
        }
        
        @Override
        void t(@k0 final x0 f) {
            this.f = f;
        }
        
        @j0
        protected androidx.core.graphics.j w(int n, final boolean b) {
            if (n != 1) {
                androidx.core.graphics.j m = null;
                final androidx.core.graphics.j j = null;
                if (n != 2) {
                    if (n != 8) {
                        if (n == 16) {
                            return ((l)this).k();
                        }
                        if (n == 32) {
                            return ((l)this).i();
                        }
                        if (n == 64) {
                            return ((l)this).m();
                        }
                        if (n != 128) {
                            return androidx.core.graphics.j.e;
                        }
                        final x0 f = this.f;
                        androidx.core.view.e e;
                        if (f != null) {
                            e = f.e();
                        }
                        else {
                            e = ((l)this).f();
                        }
                        if (e != null) {
                            return androidx.core.graphics.j.d(e.d(), e.f(), e.e(), e.c());
                        }
                        return androidx.core.graphics.j.e;
                    }
                    else {
                        final androidx.core.graphics.j[] d = this.d;
                        androidx.core.graphics.j i = j;
                        if (d != null) {
                            i = d[x0.m.e(8)];
                        }
                        if (i != null) {
                            return i;
                        }
                        final androidx.core.graphics.j l = this.l();
                        final androidx.core.graphics.j x = this.x();
                        n = l.d;
                        if (n > x.d) {
                            return androidx.core.graphics.j.d(0, 0, 0, n);
                        }
                        final androidx.core.graphics.j g = this.g;
                        if (g != null && !g.equals(androidx.core.graphics.j.e)) {
                            n = this.g.d;
                            if (n > x.d) {
                                return androidx.core.graphics.j.d(0, 0, 0, n);
                            }
                        }
                        return androidx.core.graphics.j.e;
                    }
                }
                else {
                    if (b) {
                        final androidx.core.graphics.j x2 = this.x();
                        final androidx.core.graphics.j k = ((l)this).j();
                        return androidx.core.graphics.j.d(Math.max(x2.a, k.a), 0, Math.max(x2.c, k.c), Math.max(x2.d, k.d));
                    }
                    final androidx.core.graphics.j l2 = this.l();
                    final x0 f2 = this.f;
                    if (f2 != null) {
                        m = f2.m();
                    }
                    final int a = n = l2.d;
                    if (m != null) {
                        n = Math.min(a, m.d);
                    }
                    return androidx.core.graphics.j.d(l2.a, 0, l2.c, n);
                }
            }
            else {
                if (b) {
                    return androidx.core.graphics.j.d(0, Math.max(this.x().b, this.l().b), 0, 0);
                }
                return androidx.core.graphics.j.d(0, this.l().b, 0, 0);
            }
        }
        
        protected boolean z(final int n) {
            if (n != 1 && n != 2) {
                if (n == 4) {
                    return false;
                }
                if (n != 8 && n != 128) {
                    return true;
                }
            }
            return this.w(n, false).equals(androidx.core.graphics.j.e) ^ true;
        }
    }
    
    @p0(21)
    private static class h extends g
    {
        private androidx.core.graphics.j n;
        
        h(@j0 final x0 x0, @j0 final WindowInsets windowInsets) {
            super(x0, windowInsets);
            this.n = null;
        }
        
        h(@j0 final x0 x0, @j0 final h h) {
            super(x0, (g)h);
            this.n = null;
            this.n = h.n;
        }
        
        @j0
        @Override
        x0 b() {
            return x0.K(super.c.consumeStableInsets());
        }
        
        @j0
        @Override
        x0 c() {
            return x0.K(super.c.consumeSystemWindowInsets());
        }
        
        @j0
        @Override
        final androidx.core.graphics.j j() {
            if (this.n == null) {
                this.n = j.d(super.c.getStableInsetLeft(), super.c.getStableInsetTop(), super.c.getStableInsetRight(), super.c.getStableInsetBottom());
            }
            return this.n;
        }
        
        @Override
        boolean o() {
            return super.c.isConsumed();
        }
        
        @Override
        public void u(@k0 final androidx.core.graphics.j n) {
            this.n = n;
        }
    }
    
    @p0(28)
    private static class i extends h
    {
        i(@j0 final x0 x0, @j0 final WindowInsets windowInsets) {
            super(x0, windowInsets);
        }
        
        i(@j0 final x0 x0, @j0 final i i) {
            super(x0, (h)i);
        }
        
        @j0
        @Override
        x0 a() {
            return x0.K(super.c.consumeDisplayCutout());
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            if (!Objects.equals(super.c, i.c) || !Objects.equals(super.g, i.g)) {
                b = false;
            }
            return b;
        }
        
        @k0
        @Override
        androidx.core.view.e f() {
            return e.i(super.c.getDisplayCutout());
        }
        
        @Override
        public int hashCode() {
            return super.c.hashCode();
        }
    }
    
    @p0(29)
    private static class j extends i
    {
        private androidx.core.graphics.j o;
        private androidx.core.graphics.j p;
        private androidx.core.graphics.j q;
        
        j(@j0 final x0 x0, @j0 final WindowInsets windowInsets) {
            super(x0, windowInsets);
            this.o = null;
            this.p = null;
            this.q = null;
        }
        
        j(@j0 final x0 x0, @j0 final j j) {
            super(x0, (i)j);
            this.o = null;
            this.p = null;
            this.q = null;
        }
        
        @j0
        @Override
        androidx.core.graphics.j i() {
            if (this.p == null) {
                this.p = androidx.core.graphics.j.g(super.c.getMandatorySystemGestureInsets());
            }
            return this.p;
        }
        
        @j0
        @Override
        androidx.core.graphics.j k() {
            if (this.o == null) {
                this.o = androidx.core.graphics.j.g(super.c.getSystemGestureInsets());
            }
            return this.o;
        }
        
        @j0
        @Override
        androidx.core.graphics.j m() {
            if (this.q == null) {
                this.q = androidx.core.graphics.j.g(super.c.getTappableElementInsets());
            }
            return this.q;
        }
        
        @j0
        @Override
        x0 n(final int n, final int n2, final int n3, final int n4) {
            return x0.K(super.c.inset(n, n2, n3, n4));
        }
        
        @Override
        public void u(@k0 final androidx.core.graphics.j j) {
        }
    }
    
    @p0(30)
    private static class k extends j
    {
        @j0
        static final x0 r;
        
        static {
            r = x0.K(WindowInsets.CONSUMED);
        }
        
        k(@j0 final x0 x0, @j0 final WindowInsets windowInsets) {
            super(x0, windowInsets);
        }
        
        k(@j0 final x0 x0, @j0 final k k) {
            super(x0, (j)k);
        }
        
        @Override
        final void d(@j0 final View view) {
        }
        
        @j0
        @Override
        public androidx.core.graphics.j g(final int n) {
            return androidx.core.graphics.j.g(super.c.getInsets(x0.n.a(n)));
        }
        
        @j0
        @Override
        public androidx.core.graphics.j h(final int n) {
            return androidx.core.graphics.j.g(super.c.getInsetsIgnoringVisibility(x0.n.a(n)));
        }
        
        public boolean q(final int n) {
            return super.c.isVisible(x0.n.a(n));
        }
    }
    
    private static class l
    {
        @j0
        static final x0 b;
        final x0 a;
        
        static {
            b = new b().a().a().b().c();
        }
        
        l(@j0 final x0 a) {
            this.a = a;
        }
        
        @j0
        x0 a() {
            return this.a;
        }
        
        @j0
        x0 b() {
            return this.a;
        }
        
        @j0
        x0 c() {
            return this.a;
        }
        
        void d(@j0 final View view) {
        }
        
        void e(@j0 final x0 x0) {
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof l)) {
                return false;
            }
            final l l = (l)o;
            if (this.p() != l.p() || this.o() != l.o() || !androidx.core.util.i.a(this.l(), l.l()) || !androidx.core.util.i.a(this.j(), l.j()) || !androidx.core.util.i.a(this.f(), l.f())) {
                b = false;
            }
            return b;
        }
        
        @k0
        androidx.core.view.e f() {
            return null;
        }
        
        @j0
        androidx.core.graphics.j g(final int n) {
            return androidx.core.graphics.j.e;
        }
        
        @j0
        androidx.core.graphics.j h(final int n) {
            if ((n & 0x8) == 0x0) {
                return androidx.core.graphics.j.e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }
        
        @Override
        public int hashCode() {
            return androidx.core.util.i.b(this.p(), this.o(), this.l(), this.j(), this.f());
        }
        
        @j0
        androidx.core.graphics.j i() {
            return this.l();
        }
        
        @j0
        androidx.core.graphics.j j() {
            return androidx.core.graphics.j.e;
        }
        
        @j0
        androidx.core.graphics.j k() {
            return this.l();
        }
        
        @j0
        androidx.core.graphics.j l() {
            return androidx.core.graphics.j.e;
        }
        
        @j0
        androidx.core.graphics.j m() {
            return this.l();
        }
        
        @j0
        x0 n(final int n, final int n2, final int n3, final int n4) {
            return l.b;
        }
        
        boolean o() {
            return false;
        }
        
        boolean p() {
            return false;
        }
        
        boolean q(final int n) {
            return true;
        }
        
        public void r(final androidx.core.graphics.j[] array) {
        }
        
        void s(@j0 final androidx.core.graphics.j j) {
        }
        
        void t(@k0 final x0 x0) {
        }
        
        public void u(final androidx.core.graphics.j j) {
        }
    }
    
    public static final class m
    {
        static final int a = 1;
        static final int b = 1;
        static final int c = 2;
        static final int d = 4;
        static final int e = 8;
        static final int f = 16;
        static final int g = 32;
        static final int h = 64;
        static final int i = 128;
        static final int j = 256;
        static final int k = 9;
        static final int l = 256;
        
        private m() {
        }
        
        @SuppressLint({ "WrongConstant" })
        @t0({ t0.a.H })
        static int a() {
            return -1;
        }
        
        public static int b() {
            return 4;
        }
        
        public static int c() {
            return 128;
        }
        
        public static int d() {
            return 8;
        }
        
        static int e(final int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("type needs to be >= FIRST and <= LAST, type=");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public static int f() {
            return 32;
        }
        
        public static int g() {
            return 2;
        }
        
        public static int h() {
            return 1;
        }
        
        public static int i() {
            return 7;
        }
        
        public static int j() {
            return 16;
        }
        
        public static int k() {
            return 64;
        }
        
        @Retention(RetentionPolicy.SOURCE)
        @t0({ t0.a.H })
        public @interface a {
        }
    }
    
    @p0(30)
    private static final class n
    {
        static int a(final int n) {
            int n2 = 0;
            int n3;
            for (int i = 1; i <= 256; i <<= 1, n2 = n3) {
                n3 = n2;
                if ((n & i) != 0x0) {
                    int n4;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 8) {
                                    if (i != 16) {
                                        if (i != 32) {
                                            if (i != 64) {
                                                if (i != 128) {
                                                    n3 = n2;
                                                    continue;
                                                }
                                                n4 = WindowInsets$Type.displayCutout();
                                            }
                                            else {
                                                n4 = WindowInsets$Type.tappableElement();
                                            }
                                        }
                                        else {
                                            n4 = WindowInsets$Type.mandatorySystemGestures();
                                        }
                                    }
                                    else {
                                        n4 = WindowInsets$Type.systemGestures();
                                    }
                                }
                                else {
                                    n4 = WindowInsets$Type.ime();
                                }
                            }
                            else {
                                n4 = WindowInsets$Type.captionBar();
                            }
                        }
                        else {
                            n4 = WindowInsets$Type.navigationBars();
                        }
                    }
                    else {
                        n4 = WindowInsets$Type.statusBars();
                    }
                    n3 = (n2 | n4);
                }
            }
            return n2;
        }
    }
}
