// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import androidx.annotation.k0;
import android.view.KeyEvent;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import android.view.SubMenu;
import android.view.ViewDebug$CapturedViewProperty;
import androidx.appcompat.content.res.a;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.MenuItem$OnActionExpandListener;
import androidx.core.view.b;
import android.view.View;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem$OnMenuItemClickListener;
import androidx.annotation.t0;
import o.c;

@t0({ t0.a.I })
public final class j implements c
{
    private static final String Q = "MenuItemImpl";
    private static final int R = 3;
    private static final int S = 1;
    private static final int T = 2;
    private static final int U = 4;
    private static final int V = 8;
    private static final int W = 16;
    private static final int X = 32;
    static final int Y = 0;
    private Runnable A;
    private MenuItem$OnMenuItemClickListener B;
    private CharSequence C;
    private CharSequence D;
    private ColorStateList E;
    private PorterDuff$Mode F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private View L;
    private b M;
    private MenuItem$OnActionExpandListener N;
    private boolean O;
    private ContextMenu$ContextMenuInfo P;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private CharSequence p;
    private CharSequence q;
    private Intent r;
    private char s;
    private int t;
    private char u;
    private int v;
    private Drawable w;
    private int x;
    g y;
    private s z;
    
    j(final g y, final int m, final int l, final int n, final int o, final CharSequence p7, final int k) {
        this.t = 4096;
        this.v = 4096;
        this.x = 0;
        this.E = null;
        this.F = null;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 16;
        this.K = 0;
        this.O = false;
        this.y = y;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p7;
        this.K = k;
    }
    
    private static void f(final StringBuilder sb, final int n, final int n2, final String str) {
        if ((n & n2) == n2) {
            sb.append(str);
        }
    }
    
    private Drawable g(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (this.I) {
                if (!this.G) {
                    mutate = drawable;
                    if (!this.H) {
                        return mutate;
                    }
                }
                mutate = androidx.core.graphics.drawable.c.r(drawable).mutate();
                if (this.G) {
                    androidx.core.graphics.drawable.c.o(mutate, this.E);
                }
                if (this.H) {
                    androidx.core.graphics.drawable.c.p(mutate, this.F);
                }
                this.I = false;
            }
        }
        return mutate;
    }
    
    public void A(final s z) {
        (this.z = z).setHeaderTitle(this.getTitle());
    }
    
    boolean B(final boolean b) {
        final int j = this.J;
        final boolean b2 = false;
        int n;
        if (b) {
            n = 0;
        }
        else {
            n = 8;
        }
        final int i = n | (j & 0xFFFFFFF7);
        this.J = i;
        boolean b3 = b2;
        if (j != i) {
            b3 = true;
        }
        return b3;
    }
    
    public boolean C() {
        return this.y.D();
    }
    
    boolean D() {
        return this.y.K() && this.j() != '\0';
    }
    
    public boolean E() {
        return (this.K & 0x4) == 0x4;
    }
    
    @Override
    public c a(b m) {
        final b i = this.M;
        if (i != null) {
            i.j();
        }
        this.L = null;
        this.M = m;
        this.y.N(true);
        m = this.M;
        if (m != null) {
            m.l((b.b)new b.b() {
                @Override
                public void onActionProviderVisibilityChanged(final boolean b) {
                    final j a = j.this;
                    a.y.M(a);
                }
            });
        }
        return this;
    }
    
    @Override
    public b b() {
        return this.M;
    }
    
    @Override
    public boolean c() {
        return !this.d() && !this.q();
    }
    
    @Override
    public boolean collapseActionView() {
        if ((this.K & 0x8) == 0x0) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        final MenuItem$OnActionExpandListener n = this.N;
        return (n == null || n.onMenuItemActionCollapse((MenuItem)this)) && this.y.g(this);
    }
    
    @Override
    public boolean d() {
        return (this.K & 0x2) == 0x2;
    }
    
    public void e() {
        this.y.L(this);
    }
    
    @Override
    public boolean expandActionView() {
        if (!this.m()) {
            return false;
        }
        final MenuItem$OnActionExpandListener n = this.N;
        return (n == null || n.onMenuItemActionExpand((MenuItem)this)) && this.y.n(this);
    }
    
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }
    
    @Override
    public View getActionView() {
        final View l = this.L;
        if (l != null) {
            return l;
        }
        final b m = this.M;
        if (m != null) {
            return this.L = m.e((MenuItem)this);
        }
        return null;
    }
    
    @Override
    public int getAlphabeticModifiers() {
        return this.v;
    }
    
    public char getAlphabeticShortcut() {
        return this.u;
    }
    
    @Override
    public CharSequence getContentDescription() {
        return this.C;
    }
    
    public int getGroupId() {
        return this.m;
    }
    
    public Drawable getIcon() {
        final Drawable w = this.w;
        if (w != null) {
            return this.g(w);
        }
        if (this.x != 0) {
            final Drawable d = a.d(this.y.x(), this.x);
            this.x = 0;
            this.w = d;
            return this.g(d);
        }
        return null;
    }
    
    @Override
    public ColorStateList getIconTintList() {
        return this.E;
    }
    
    @Override
    public PorterDuff$Mode getIconTintMode() {
        return this.F;
    }
    
    public Intent getIntent() {
        return this.r;
    }
    
    @ViewDebug$CapturedViewProperty
    public int getItemId() {
        return this.l;
    }
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
        return this.P;
    }
    
    @Override
    public int getNumericModifiers() {
        return this.t;
    }
    
    public char getNumericShortcut() {
        return this.s;
    }
    
    public int getOrder() {
        return this.n;
    }
    
    public SubMenu getSubMenu() {
        return (SubMenu)this.z;
    }
    
    @ViewDebug$CapturedViewProperty
    public CharSequence getTitle() {
        return this.p;
    }
    
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.q;
        if (charSequence == null) {
            charSequence = this.p;
        }
        CharSequence string = charSequence;
        if (Build$VERSION.SDK_INT < 18 && (string = charSequence) != null) {
            string = charSequence;
            if (!(charSequence instanceof String)) {
                string = charSequence.toString();
            }
        }
        return string;
    }
    
    @Override
    public CharSequence getTooltipText() {
        return this.D;
    }
    
    Runnable h() {
        return this.A;
    }
    
    public boolean hasSubMenu() {
        return this.z != null;
    }
    
    public int i() {
        return this.o;
    }
    
    @Override
    public boolean isActionViewExpanded() {
        return this.O;
    }
    
    public boolean isCheckable() {
        final int j = this.J;
        boolean b = true;
        if ((j & 0x1) != 0x1) {
            b = false;
        }
        return b;
    }
    
    public boolean isChecked() {
        return (this.J & 0x2) == 0x2;
    }
    
    public boolean isEnabled() {
        return (this.J & 0x10) != 0x0;
    }
    
    public boolean isVisible() {
        final b m = this.M;
        final boolean b = true;
        boolean b2 = true;
        if (m != null && m.h()) {
            if ((this.J & 0x8) != 0x0 || !this.M.c()) {
                b2 = false;
            }
            return b2;
        }
        return (this.J & 0x8) == 0x0 && b;
    }
    
    char j() {
        char c;
        if (this.y.J()) {
            c = this.u;
        }
        else {
            c = this.s;
        }
        return c;
    }
    
    String k() {
        final char j = this.j();
        if (j == '\0') {
            return "";
        }
        final Resources resources = this.y.x().getResources();
        final StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.y.x()).hasPermanentMenuKey()) {
            sb.append(resources.getString(c.a.l.r));
        }
        int n;
        if (this.y.J()) {
            n = this.v;
        }
        else {
            n = this.t;
        }
        f(sb, n, 65536, resources.getString(c.a.l.n));
        f(sb, n, 4096, resources.getString(c.a.l.j));
        f(sb, n, 2, resources.getString(c.a.l.i));
        f(sb, n, 1, resources.getString(c.a.l.o));
        f(sb, n, 4, resources.getString(c.a.l.q));
        f(sb, n, 8, resources.getString(c.a.l.m));
        int n2;
        if (j != '\b') {
            if (j != '\n') {
                if (j != ' ') {
                    sb.append(j);
                    return sb.toString();
                }
                n2 = c.a.l.p;
            }
            else {
                n2 = c.a.l.l;
            }
        }
        else {
            n2 = c.a.l.k;
        }
        sb.append(resources.getString(n2));
        return sb.toString();
    }
    
    CharSequence l(final o.a a) {
        CharSequence charSequence;
        if (a != null && a.d()) {
            charSequence = this.getTitleCondensed();
        }
        else {
            charSequence = this.getTitle();
        }
        return charSequence;
    }
    
    public boolean m() {
        final int k = this.K;
        boolean b = false;
        if ((k & 0x8) != 0x0) {
            if (this.L == null) {
                final b m = this.M;
                if (m != null) {
                    this.L = m.e((MenuItem)this);
                }
            }
            b = b;
            if (this.L != null) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean n() {
        final MenuItem$OnMenuItemClickListener b = this.B;
        if (b != null && b.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        final g y = this.y;
        if (y.i(y, (MenuItem)this)) {
            return true;
        }
        final Runnable a = this.A;
        if (a != null) {
            a.run();
            return true;
        }
        if (this.r != null) {
            try {
                this.y.x().startActivity(this.r);
                return true;
            }
            catch (ActivityNotFoundException ex) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)ex);
            }
        }
        final b m = this.M;
        return m != null && m.f();
    }
    
    public boolean o() {
        return (this.J & 0x20) == 0x20;
    }
    
    public boolean p() {
        return (this.J & 0x4) != 0x0;
    }
    
    public boolean q() {
        final int k = this.K;
        boolean b = true;
        if ((k & 0x1) != 0x1) {
            b = false;
        }
        return b;
    }
    
    public c r(final int n) {
        final Context x = this.y.x();
        this.s(LayoutInflater.from(x).inflate(n, (ViewGroup)new LinearLayout(x), false));
        return this;
    }
    
    public c s(final View l) {
        this.L = l;
        this.M = null;
        if (l != null && l.getId() == -1) {
            final int i = this.l;
            if (i > 0) {
                l.setId(i);
            }
        }
        this.y.L(this);
        return this;
    }
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }
    
    public MenuItem setAlphabeticShortcut(final char ch) {
        if (this.u == ch) {
            return (MenuItem)this;
        }
        this.u = Character.toLowerCase(ch);
        this.y.N(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setAlphabeticShortcut(final char ch, final int n) {
        if (this.u == ch && this.v == n) {
            return (MenuItem)this;
        }
        this.u = Character.toLowerCase(ch);
        this.v = KeyEvent.normalizeMetaState(n);
        this.y.N(false);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean b) {
        final int j = this.J;
        final int i = (b ? 1 : 0) | (j & 0xFFFFFFFE);
        this.J = i;
        if (j != i) {
            this.y.N(false);
        }
        return (MenuItem)this;
    }
    
    public MenuItem setChecked(final boolean b) {
        if ((this.J & 0x4) != 0x0) {
            this.y.a0((MenuItem)this);
        }
        else {
            this.v(b);
        }
        return (MenuItem)this;
    }
    
    @Override
    public c setContentDescription(final CharSequence c) {
        this.C = c;
        this.y.N(false);
        return this;
    }
    
    public MenuItem setEnabled(final boolean b) {
        int j;
        if (b) {
            j = (this.J | 0x10);
        }
        else {
            j = (this.J & 0xFFFFFFEF);
        }
        this.J = j;
        this.y.N(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int x) {
        this.w = null;
        this.x = x;
        this.I = true;
        this.y.N(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable w) {
        this.x = 0;
        this.w = w;
        this.I = true;
        this.y.N(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setIconTintList(@k0 final ColorStateList e) {
        this.E = e;
        this.G = true;
        this.I = true;
        this.y.N(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setIconTintMode(final PorterDuff$Mode f) {
        this.F = f;
        this.H = true;
        this.I = true;
        this.y.N(false);
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent r) {
        this.r = r;
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char c) {
        if (this.s == c) {
            return (MenuItem)this;
        }
        this.s = c;
        this.y.N(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setNumericShortcut(final char c, final int n) {
        if (this.s == c && this.t == n) {
            return (MenuItem)this;
        }
        this.s = c;
        this.t = KeyEvent.normalizeMetaState(n);
        this.y.N(false);
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener n) {
        this.N = n;
        return (MenuItem)this;
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener b) {
        this.B = b;
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char c, final char ch) {
        this.s = c;
        this.u = Character.toLowerCase(ch);
        this.y.N(false);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setShortcut(final char c, final char ch, final int n, final int n2) {
        this.s = c;
        this.t = KeyEvent.normalizeMetaState(n);
        this.u = Character.toLowerCase(ch);
        this.v = KeyEvent.normalizeMetaState(n2);
        this.y.N(false);
        return (MenuItem)this;
    }
    
    @Override
    public void setShowAsAction(final int k) {
        final int n = k & 0x3;
        if (n != 0 && n != 1 && n != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.K = k;
        this.y.L(this);
    }
    
    public MenuItem setTitle(final int n) {
        return this.setTitle(this.y.x().getString(n));
    }
    
    public MenuItem setTitle(final CharSequence charSequence) {
        this.p = charSequence;
        this.y.N(false);
        final s z = this.z;
        if (z != null) {
            z.setHeaderTitle(charSequence);
        }
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(final CharSequence q) {
        this.q = q;
        this.y.N(false);
        return (MenuItem)this;
    }
    
    @Override
    public c setTooltipText(final CharSequence d) {
        this.D = d;
        this.y.N(false);
        return this;
    }
    
    public MenuItem setVisible(final boolean b) {
        if (this.B(b)) {
            this.y.M(this);
        }
        return (MenuItem)this;
    }
    
    public void t(final boolean o) {
        this.O = o;
        this.y.N(false);
    }
    
    @Override
    public String toString() {
        final CharSequence p = this.p;
        String string;
        if (p != null) {
            string = p.toString();
        }
        else {
            string = null;
        }
        return string;
    }
    
    public MenuItem u(final Runnable a) {
        this.A = a;
        return (MenuItem)this;
    }
    
    void v(final boolean b) {
        final int j = this.J;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        final int i = n | (j & 0xFFFFFFFD);
        this.J = i;
        if (j != i) {
            this.y.N(false);
        }
    }
    
    public void w(final boolean b) {
        final int j = this.J;
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.J = (n | (j & 0xFFFFFFFB));
    }
    
    public void x(final boolean b) {
        int j;
        if (b) {
            j = (this.J | 0x20);
        }
        else {
            j = (this.J & 0xFFFFFFDF);
        }
        this.J = j;
    }
    
    void y(final ContextMenu$ContextMenuInfo p) {
        this.P = p;
    }
    
    public c z(final int showAsAction) {
        this.setShowAsAction(showAsAction);
        return this;
    }
}
