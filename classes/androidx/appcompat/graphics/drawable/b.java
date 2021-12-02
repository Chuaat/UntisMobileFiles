// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.graphics.drawable;

import android.util.SparseArray;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.content.res.Resources$Theme;
import android.os.SystemClock;
import androidx.annotation.k0;
import android.content.res.Resources;
import android.os.Build$VERSION;
import androidx.core.graphics.drawable.c;
import android.graphics.Rect;
import androidx.annotation.t0;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

@t0({ t0.a.I })
class b extends Drawable implements Drawable$Callback
{
    private static final boolean S = false;
    private static final String T = "DrawableContainer";
    private static final boolean U = true;
    private d G;
    private Rect H;
    private Drawable I;
    private Drawable J;
    private int K;
    private boolean L;
    private int M;
    private boolean N;
    private Runnable O;
    private long P;
    private long Q;
    private c R;
    
    b() {
        this.K = 255;
        this.M = -1;
    }
    
    private void e(final Drawable drawable) {
        if (this.R == null) {
            this.R = new c();
        }
        drawable.setCallback((Drawable$Callback)this.R.b(drawable.getCallback()));
        try {
            if (this.G.A <= 0 && this.L) {
                drawable.setAlpha(this.K);
            }
            final d g = this.G;
            if (g.E) {
                drawable.setColorFilter(g.D);
            }
            else {
                if (g.H) {
                    androidx.core.graphics.drawable.c.o(drawable, g.F);
                }
                final d g2 = this.G;
                if (g2.I) {
                    androidx.core.graphics.drawable.c.p(drawable, g2.G);
                }
            }
            drawable.setVisible(this.isVisible(), true);
            drawable.setDither(this.G.x);
            drawable.setState(this.getState());
            drawable.setLevel(this.getLevel());
            drawable.setBounds(this.getBounds());
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 23) {
                androidx.core.graphics.drawable.c.m(drawable, androidx.core.graphics.drawable.c.f(this));
            }
            if (sdk_INT >= 19) {
                androidx.core.graphics.drawable.c.j(drawable, this.G.C);
            }
            final Rect h = this.H;
            if (sdk_INT >= 21 && h != null) {
                androidx.core.graphics.drawable.c.l(drawable, h.left, h.top, h.right, h.bottom);
            }
        }
        finally {
            drawable.setCallback(this.R.a());
        }
    }
    
    private boolean f() {
        final boolean autoMirrored = this.isAutoMirrored();
        boolean b = true;
        if (!autoMirrored || androidx.core.graphics.drawable.c.f(this) != 1) {
            b = false;
        }
        return b;
    }
    
    static int g(@k0 final Resources resources, int densityDpi) {
        if (resources != null) {
            densityDpi = resources.getDisplayMetrics().densityDpi;
        }
        int n = densityDpi;
        if (densityDpi == 0) {
            n = 160;
        }
        return n;
    }
    
    void a(final boolean b) {
        final int n = 1;
        this.L = true;
        final long uptimeMillis = SystemClock.uptimeMillis();
        final Drawable i = this.I;
        int n2 = 0;
        Label_0103: {
            Label_0100: {
                if (i != null) {
                    final long p = this.P;
                    if (p == 0L) {
                        break Label_0100;
                    }
                    if (p > uptimeMillis) {
                        i.setAlpha((255 - (int)((p - uptimeMillis) * 255L) / this.G.A) * this.K / 255);
                        n2 = 1;
                        break Label_0103;
                    }
                    i.setAlpha(this.K);
                }
                this.P = 0L;
            }
            n2 = 0;
        }
        final Drawable j = this.J;
        Label_0192: {
            if (j != null) {
                final long q = this.Q;
                if (q == 0L) {
                    break Label_0192;
                }
                if (q > uptimeMillis) {
                    j.setAlpha((int)((q - uptimeMillis) * 255L) / this.G.B * this.K / 255);
                    n2 = n;
                    break Label_0192;
                }
                j.setVisible(false, false);
                this.J = null;
            }
            this.Q = 0L;
        }
        if (b && n2 != 0) {
            this.scheduleSelf(this.O, uptimeMillis + 16L);
        }
    }
    
    @p0(21)
    public void applyTheme(@j0 final Resources$Theme resources$Theme) {
        this.G.b(resources$Theme);
    }
    
    void b() {
        this.G.d();
        this.N = false;
    }
    
    d c() {
        return this.G;
    }
    
    @p0(21)
    public boolean canApplyTheme() {
        return this.G.canApplyTheme();
    }
    
    int d() {
        return this.M;
    }
    
    public void draw(@j0 final Canvas canvas) {
        final Drawable i = this.I;
        if (i != null) {
            i.draw(canvas);
        }
        final Drawable j = this.J;
        if (j != null) {
            j.draw(canvas);
        }
    }
    
    public int getAlpha() {
        return this.K;
    }
    
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.G.getChangingConfigurations();
    }
    
    public final Drawable$ConstantState getConstantState() {
        if (this.G.c()) {
            this.G.d = this.getChangingConfigurations();
            return this.G;
        }
        return null;
    }
    
    @j0
    public Drawable getCurrent() {
        return this.I;
    }
    
    public void getHotspotBounds(@j0 final Rect rect) {
        final Rect h = this.H;
        if (h != null) {
            rect.set(h);
        }
        else {
            super.getHotspotBounds(rect);
        }
    }
    
    public int getIntrinsicHeight() {
        if (this.G.t()) {
            return this.G.j();
        }
        final Drawable i = this.I;
        int intrinsicHeight;
        if (i != null) {
            intrinsicHeight = i.getIntrinsicHeight();
        }
        else {
            intrinsicHeight = -1;
        }
        return intrinsicHeight;
    }
    
    public int getIntrinsicWidth() {
        if (this.G.t()) {
            return this.G.n();
        }
        final Drawable i = this.I;
        int intrinsicWidth;
        if (i != null) {
            intrinsicWidth = i.getIntrinsicWidth();
        }
        else {
            intrinsicWidth = -1;
        }
        return intrinsicWidth;
    }
    
    public int getMinimumHeight() {
        if (this.G.t()) {
            return this.G.k();
        }
        final Drawable i = this.I;
        int minimumHeight;
        if (i != null) {
            minimumHeight = i.getMinimumHeight();
        }
        else {
            minimumHeight = 0;
        }
        return minimumHeight;
    }
    
    public int getMinimumWidth() {
        if (this.G.t()) {
            return this.G.l();
        }
        final Drawable i = this.I;
        int minimumWidth;
        if (i != null) {
            minimumWidth = i.getMinimumWidth();
        }
        else {
            minimumWidth = 0;
        }
        return minimumWidth;
    }
    
    public int getOpacity() {
        final Drawable i = this.I;
        int q;
        if (i != null && i.isVisible()) {
            q = this.G.q();
        }
        else {
            q = -2;
        }
        return q;
    }
    
    @p0(21)
    public void getOutline(@j0 final Outline outline) {
        final Drawable i = this.I;
        if (i != null) {
            b.b(i, outline);
        }
    }
    
    public boolean getPadding(@j0 final Rect rect) {
        final Rect m = this.G.m();
        boolean b;
        if (m != null) {
            rect.set(m);
            b = ((m.right | (m.left | m.top | m.bottom)) != 0x0);
        }
        else {
            final Drawable i = this.I;
            if (i != null) {
                b = i.getPadding(rect);
            }
            else {
                b = super.getPadding(rect);
            }
        }
        if (this.f()) {
            final int left = rect.left;
            rect.left = rect.right;
            rect.right = left;
        }
        return b;
    }
    
    boolean h(int a) {
        if (a == this.M) {
            return false;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (this.G.B > 0) {
            final Drawable j = this.J;
            if (j != null) {
                j.setVisible(false, false);
            }
            final Drawable i = this.I;
            if (i != null) {
                this.J = i;
                this.Q = this.G.B + uptimeMillis;
            }
            else {
                this.J = null;
                this.Q = 0L;
            }
        }
        else {
            final Drawable k = this.I;
            if (k != null) {
                k.setVisible(false, false);
            }
        }
        Label_0191: {
            if (a >= 0) {
                final d g = this.G;
                if (a < g.h) {
                    final Drawable h = g.h(a);
                    this.I = h;
                    this.M = a;
                    if (h != null) {
                        a = this.G.A;
                        if (a > 0) {
                            this.P = uptimeMillis + a;
                        }
                        this.e(h);
                    }
                    break Label_0191;
                }
            }
            this.I = null;
            this.M = -1;
        }
        if (this.P != 0L || this.Q != 0L) {
            final Runnable o = this.O;
            if (o == null) {
                this.O = new Runnable() {
                    @Override
                    public void run() {
                        b.this.a(true);
                        b.this.invalidateSelf();
                    }
                };
            }
            else {
                this.unscheduleSelf(o);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }
    
    void i(final d g) {
        this.G = g;
        final int m = this.M;
        if (m >= 0) {
            final Drawable h = g.h(m);
            if ((this.I = h) != null) {
                this.e(h);
            }
        }
        this.J = null;
    }
    
    public void invalidateDrawable(@j0 final Drawable drawable) {
        final d g = this.G;
        if (g != null) {
            g.s();
        }
        if (drawable == this.I && this.getCallback() != null) {
            this.getCallback().invalidateDrawable((Drawable)this);
        }
    }
    
    public boolean isAutoMirrored() {
        return this.G.C;
    }
    
    public boolean isStateful() {
        return this.G.u();
    }
    
    void j(final int n) {
        this.h(n);
    }
    
    public void jumpToCurrentState() {
        final Drawable j = this.J;
        final int n = 1;
        int n2;
        if (j != null) {
            j.jumpToCurrentState();
            this.J = null;
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Drawable i = this.I;
        if (i != null) {
            i.jumpToCurrentState();
            if (this.L) {
                this.I.setAlpha(this.K);
            }
        }
        if (this.Q != 0L) {
            this.Q = 0L;
            n2 = 1;
        }
        if (this.P != 0L) {
            this.P = 0L;
            n2 = n;
        }
        if (n2 != 0) {
            this.invalidateSelf();
        }
    }
    
    public void k(final int a) {
        this.G.A = a;
    }
    
    public void l(final int b) {
        this.G.B = b;
    }
    
    final void m(final Resources resources) {
        this.G.C(resources);
    }
    
    public Drawable mutate() {
        if (!this.N && super.mutate() == this) {
            final d c = this.c();
            c.v();
            this.i(c);
            this.N = true;
        }
        return this;
    }
    
    protected void onBoundsChange(final Rect rect) {
        final Drawable j = this.J;
        if (j != null) {
            j.setBounds(rect);
        }
        final Drawable i = this.I;
        if (i != null) {
            i.setBounds(rect);
        }
    }
    
    public boolean onLayoutDirectionChanged(final int n) {
        return this.G.A(n, this.d());
    }
    
    protected boolean onLevelChange(final int n) {
        final Drawable j = this.J;
        if (j != null) {
            return j.setLevel(n);
        }
        final Drawable i = this.I;
        return i != null && i.setLevel(n);
    }
    
    protected boolean onStateChange(final int[] array) {
        final Drawable j = this.J;
        if (j != null) {
            return j.setState(array);
        }
        final Drawable i = this.I;
        return i != null && i.setState(array);
    }
    
    public void scheduleDrawable(@j0 final Drawable drawable, @j0 final Runnable runnable, final long n) {
        if (drawable == this.I && this.getCallback() != null) {
            this.getCallback().scheduleDrawable((Drawable)this, runnable, n);
        }
    }
    
    public void setAlpha(final int n) {
        if (!this.L || this.K != n) {
            this.L = true;
            this.K = n;
            final Drawable i = this.I;
            if (i != null) {
                if (this.P == 0L) {
                    i.setAlpha(n);
                }
                else {
                    this.a(false);
                }
            }
        }
    }
    
    public void setAutoMirrored(final boolean c) {
        final d g = this.G;
        if (g.C != c) {
            g.C = c;
            final Drawable i = this.I;
            if (i != null) {
                c.j(i, c);
            }
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        final d g = this.G;
        g.E = true;
        if (g.D != colorFilter) {
            g.D = colorFilter;
            final Drawable i = this.I;
            if (i != null) {
                i.setColorFilter(colorFilter);
            }
        }
    }
    
    public void setDither(final boolean b) {
        final d g = this.G;
        if (g.x != b) {
            g.x = b;
            final Drawable i = this.I;
            if (i != null) {
                i.setDither(b);
            }
        }
    }
    
    public void setHotspot(final float n, final float n2) {
        final Drawable i = this.I;
        if (i != null) {
            androidx.core.graphics.drawable.c.k(i, n, n2);
        }
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Rect h = this.H;
        if (h == null) {
            this.H = new Rect(n, n2, n3, n4);
        }
        else {
            h.set(n, n2, n3, n4);
        }
        final Drawable i = this.I;
        if (i != null) {
            androidx.core.graphics.drawable.c.l(i, n, n2, n3, n4);
        }
    }
    
    public void setTintList(final ColorStateList f) {
        final d g = this.G;
        g.H = true;
        if (g.F != f) {
            g.F = f;
            androidx.core.graphics.drawable.c.o(this.I, f);
        }
    }
    
    public void setTintMode(@j0 final PorterDuff$Mode g) {
        final d g2 = this.G;
        g2.I = true;
        if (g2.G != g) {
            g2.G = g;
            androidx.core.graphics.drawable.c.p(this.I, g);
        }
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        final Drawable j = this.J;
        if (j != null) {
            j.setVisible(b, b2);
        }
        final Drawable i = this.I;
        if (i != null) {
            i.setVisible(b, b2);
        }
        return setVisible;
    }
    
    public void unscheduleDrawable(@j0 final Drawable drawable, @j0 final Runnable runnable) {
        if (drawable == this.I && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable((Drawable)this, runnable);
        }
    }
    
    @p0(21)
    private static class b
    {
        public static boolean a(final Drawable$ConstantState drawable$ConstantState) {
            return drawable$ConstantState.canApplyTheme();
        }
        
        public static void b(final Drawable drawable, final Outline outline) {
            drawable.getOutline(outline);
        }
        
        public static Resources c(final Resources$Theme resources$Theme) {
            return resources$Theme.getResources();
        }
    }
    
    static class c implements Drawable$Callback
    {
        private Drawable$Callback G;
        
        public Drawable$Callback a() {
            final Drawable$Callback g = this.G;
            this.G = null;
            return g;
        }
        
        public c b(final Drawable$Callback g) {
            this.G = g;
            return this;
        }
        
        public void invalidateDrawable(@j0 final Drawable drawable) {
        }
        
        public void scheduleDrawable(@j0 final Drawable drawable, @j0 final Runnable runnable, final long n) {
            final Drawable$Callback g = this.G;
            if (g != null) {
                g.scheduleDrawable(drawable, runnable, n);
            }
        }
        
        public void unscheduleDrawable(@j0 final Drawable drawable, @j0 final Runnable runnable) {
            final Drawable$Callback g = this.G;
            if (g != null) {
                g.unscheduleDrawable(drawable, runnable);
            }
        }
    }
    
    abstract static class d extends Drawable$ConstantState
    {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff$Mode G;
        boolean H;
        boolean I;
        final b a;
        Resources b;
        int c;
        int d;
        int e;
        SparseArray<Drawable$ConstantState> f;
        Drawable[] g;
        int h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;
        
        d(final d d, final b a, final Resources resources) {
            final int n = 0;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = a;
            final Rect rect = null;
            Resources b;
            if (resources != null) {
                b = resources;
            }
            else if (d != null) {
                b = d.b;
            }
            else {
                b = null;
            }
            this.b = b;
            int c;
            if (d != null) {
                c = d.c;
            }
            else {
                c = 0;
            }
            final int g = androidx.appcompat.graphics.drawable.b.g(resources, c);
            this.c = g;
            if (d != null) {
                this.d = d.d;
                this.e = d.e;
                this.v = true;
                this.w = true;
                this.i = d.i;
                this.l = d.l;
                this.x = d.x;
                this.y = d.y;
                this.z = d.z;
                this.A = d.A;
                this.B = d.B;
                this.C = d.C;
                this.D = d.D;
                this.E = d.E;
                this.F = d.F;
                this.G = d.G;
                this.H = d.H;
                this.I = d.I;
                if (d.c == g) {
                    if (d.j) {
                        Rect k = rect;
                        if (d.k != null) {
                            k = new Rect(d.k);
                        }
                        this.k = k;
                        this.j = true;
                    }
                    if (d.m) {
                        this.n = d.n;
                        this.o = d.o;
                        this.p = d.p;
                        this.q = d.q;
                        this.m = true;
                    }
                }
                if (d.r) {
                    this.s = d.s;
                    this.r = true;
                }
                if (d.t) {
                    this.u = d.u;
                    this.t = true;
                }
                final Drawable[] g2 = d.g;
                this.g = new Drawable[g2.length];
                this.h = d.h;
                final SparseArray<Drawable$ConstantState> f = d.f;
                SparseArray clone;
                if (f != null) {
                    clone = f.clone();
                }
                else {
                    clone = new SparseArray(this.h);
                }
                this.f = (SparseArray<Drawable$ConstantState>)clone;
                for (int h = this.h, i = n; i < h; ++i) {
                    if (g2[i] != null) {
                        final Drawable$ConstantState constantState = g2[i].getConstantState();
                        if (constantState != null) {
                            this.f.put(i, (Object)constantState);
                        }
                        else {
                            this.g[i] = g2[i];
                        }
                    }
                }
            }
            else {
                this.g = new Drawable[10];
                this.h = 0;
            }
        }
        
        private void f() {
            final SparseArray<Drawable$ConstantState> f = this.f;
            if (f != null) {
                for (int size = f.size(), i = 0; i < size; ++i) {
                    this.g[this.f.keyAt(i)] = this.w(((Drawable$ConstantState)this.f.valueAt(i)).newDrawable(this.b));
                }
                this.f = null;
            }
        }
        
        private Drawable w(Drawable mutate) {
            if (Build$VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.c.m(mutate, this.z);
            }
            mutate = mutate.mutate();
            mutate.setCallback((Drawable$Callback)this.a);
            return mutate;
        }
        
        final boolean A(final int z, final int n) {
            final int h = this.h;
            final Drawable[] g = this.g;
            int i = 0;
            boolean b = false;
            while (i < h) {
                boolean b2 = b;
                if (g[i] != null) {
                    final boolean b3 = Build$VERSION.SDK_INT >= 23 && androidx.core.graphics.drawable.c.m(g[i], z);
                    b2 = b;
                    if (i == n) {
                        b2 = b3;
                    }
                }
                ++i;
                b = b2;
            }
            this.z = z;
            return b;
        }
        
        public final void B(final boolean i) {
            this.i = i;
        }
        
        final void C(final Resources b) {
            if (b != null) {
                this.b = b;
                if (this.c != (this.c = b.g(b, this.c))) {
                    this.m = false;
                    this.j = false;
                }
            }
        }
        
        public final int a(final Drawable drawable) {
            final int h = this.h;
            if (h >= this.g.length) {
                this.r(h, h + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback((Drawable$Callback)this.a);
            this.g[h] = drawable;
            ++this.h;
            this.e |= drawable.getChangingConfigurations();
            this.s();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return h;
        }
        
        @p0(21)
        final void b(final Resources$Theme resources$Theme) {
            if (resources$Theme != null) {
                this.f();
                final int h = this.h;
                final Drawable[] g = this.g;
                for (int i = 0; i < h; ++i) {
                    if (g[i] != null && androidx.core.graphics.drawable.c.b(g[i])) {
                        androidx.core.graphics.drawable.c.a(g[i], resources$Theme);
                        this.e |= g[i].getChangingConfigurations();
                    }
                }
                this.C(androidx.appcompat.graphics.drawable.b.b.c(resources$Theme));
            }
        }
        
        public boolean c() {
            if (this.v) {
                return this.w;
            }
            this.f();
            this.v = true;
            final int h = this.h;
            final Drawable[] g = this.g;
            for (int i = 0; i < h; ++i) {
                if (g[i].getConstantState() == null) {
                    return this.w = false;
                }
            }
            return this.w = true;
        }
        
        @p0(21)
        public boolean canApplyTheme() {
            final int h = this.h;
            final Drawable[] g = this.g;
            for (int i = 0; i < h; ++i) {
                final Drawable drawable = g[i];
                if (drawable != null) {
                    if (androidx.core.graphics.drawable.c.b(drawable)) {
                        return true;
                    }
                }
                else {
                    final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)this.f.get(i);
                    if (drawable$ConstantState != null && androidx.appcompat.graphics.drawable.b.b.a(drawable$ConstantState)) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        final void d() {
            this.y = false;
        }
        
        protected void e() {
            this.m = true;
            this.f();
            final int h = this.h;
            final Drawable[] g = this.g;
            this.o = -1;
            this.n = -1;
            int i = 0;
            this.q = 0;
            this.p = 0;
            while (i < h) {
                final Drawable drawable = g[i];
                final int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                final int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                final int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                final int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
                ++i;
            }
        }
        
        final int g() {
            return this.g.length;
        }
        
        public int getChangingConfigurations() {
            return this.d | this.e;
        }
        
        public final Drawable h(final int n) {
            final Drawable drawable = this.g[n];
            if (drawable != null) {
                return drawable;
            }
            final SparseArray<Drawable$ConstantState> f = this.f;
            if (f != null) {
                final int indexOfKey = f.indexOfKey(n);
                if (indexOfKey >= 0) {
                    final Drawable w = this.w(((Drawable$ConstantState)this.f.valueAt(indexOfKey)).newDrawable(this.b));
                    this.g[n] = w;
                    this.f.removeAt(indexOfKey);
                    if (this.f.size() == 0) {
                        this.f = null;
                    }
                    return w;
                }
            }
            return null;
        }
        
        public final int i() {
            return this.h;
        }
        
        public final int j() {
            if (!this.m) {
                this.e();
            }
            return this.o;
        }
        
        public final int k() {
            if (!this.m) {
                this.e();
            }
            return this.q;
        }
        
        public final int l() {
            if (!this.m) {
                this.e();
            }
            return this.p;
        }
        
        public final Rect m() {
            final boolean i = this.i;
            Rect k = null;
            if (i) {
                return null;
            }
            final Rect j = this.k;
            if (j == null && !this.j) {
                this.f();
                final Rect rect = new Rect();
                final int h = this.h;
                final Drawable[] g = this.g;
                Rect rect2;
                for (int l = 0; l < h; ++l, k = rect2) {
                    rect2 = k;
                    if (g[l].getPadding(rect)) {
                        Rect rect3;
                        if ((rect3 = k) == null) {
                            rect3 = new Rect(0, 0, 0, 0);
                        }
                        final int left = rect.left;
                        if (left > rect3.left) {
                            rect3.left = left;
                        }
                        final int top = rect.top;
                        if (top > rect3.top) {
                            rect3.top = top;
                        }
                        final int right = rect.right;
                        if (right > rect3.right) {
                            rect3.right = right;
                        }
                        final int bottom = rect.bottom;
                        rect2 = rect3;
                        if (bottom > rect3.bottom) {
                            rect3.bottom = bottom;
                            rect2 = rect3;
                        }
                    }
                }
                this.j = true;
                return this.k = k;
            }
            return j;
        }
        
        public final int n() {
            if (!this.m) {
                this.e();
            }
            return this.n;
        }
        
        public final int o() {
            return this.A;
        }
        
        public final int p() {
            return this.B;
        }
        
        public final int q() {
            if (this.r) {
                return this.s;
            }
            this.f();
            final int h = this.h;
            final Drawable[] g = this.g;
            int s;
            if (h > 0) {
                s = g[0].getOpacity();
            }
            else {
                s = -2;
            }
            for (int i = 1; i < h; ++i) {
                s = Drawable.resolveOpacity(s, g[i].getOpacity());
            }
            this.s = s;
            this.r = true;
            return s;
        }
        
        public void r(final int n, final int n2) {
            final Drawable[] g = new Drawable[n2];
            final Drawable[] g2 = this.g;
            if (g2 != null) {
                System.arraycopy(g2, 0, g, 0, n);
            }
            this.g = g;
        }
        
        void s() {
            this.r = false;
            this.t = false;
        }
        
        public final boolean t() {
            return this.l;
        }
        
        public final boolean u() {
            if (this.t) {
                return this.u;
            }
            this.f();
            final int h = this.h;
            final Drawable[] g = this.g;
            final boolean b = false;
            int n = 0;
            boolean u;
            while (true) {
                u = b;
                if (n >= h) {
                    break;
                }
                if (g[n].isStateful()) {
                    u = true;
                    break;
                }
                ++n;
            }
            this.u = u;
            this.t = true;
            return u;
        }
        
        void v() {
            final int h = this.h;
            final Drawable[] g = this.g;
            for (int i = 0; i < h; ++i) {
                if (g[i] != null) {
                    g[i].mutate();
                }
            }
            this.y = true;
        }
        
        public final void x(final boolean l) {
            this.l = l;
        }
        
        public final void y(final int a) {
            this.A = a;
        }
        
        public final void z(final int b) {
            this.B = b;
        }
    }
}
