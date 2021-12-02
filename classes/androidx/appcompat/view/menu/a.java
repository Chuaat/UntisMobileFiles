// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.view.MenuItem$OnActionExpandListener;
import androidx.annotation.k0;
import androidx.core.content.d;
import android.view.KeyEvent;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ActionProvider;
import android.view.MenuItem;
import androidx.core.view.b;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.annotation.t0;
import o.c;

@t0({ t0.a.I })
public class a implements c
{
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 4;
    private static final int I = 8;
    private static final int J = 16;
    private ColorStateList A;
    private PorterDuff$Mode B;
    private boolean C;
    private boolean D;
    private int E;
    private final int l;
    private final int m;
    private final int n;
    private CharSequence o;
    private CharSequence p;
    private Intent q;
    private char r;
    private int s;
    private char t;
    private int u;
    private Drawable v;
    private Context w;
    private MenuItem$OnMenuItemClickListener x;
    private CharSequence y;
    private CharSequence z;
    
    public a(final Context w, final int m, final int l, final int n, final int n2, final CharSequence o) {
        this.s = 4096;
        this.u = 4096;
        this.A = null;
        this.B = null;
        this.C = false;
        this.D = false;
        this.E = 16;
        this.w = w;
        this.l = l;
        this.m = m;
        this.n = n2;
        this.o = o;
    }
    
    private void e() {
        final Drawable v = this.v;
        if (v != null && (this.C || this.D)) {
            final Drawable r = androidx.core.graphics.drawable.c.r(v);
            this.v = r;
            final Drawable mutate = r.mutate();
            this.v = mutate;
            if (this.C) {
                androidx.core.graphics.drawable.c.o(mutate, this.A);
            }
            if (this.D) {
                androidx.core.graphics.drawable.c.p(this.v, this.B);
            }
        }
    }
    
    @Override
    public c a(final b b) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public b b() {
        return null;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean collapseActionView() {
        return false;
    }
    
    @Override
    public boolean d() {
        return true;
    }
    
    @Override
    public boolean expandActionView() {
        return false;
    }
    
    public boolean f() {
        final MenuItem$OnMenuItemClickListener x = this.x;
        if (x != null && x.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        final Intent q = this.q;
        if (q != null) {
            this.w.startActivity(q);
            return true;
        }
        return false;
    }
    
    public c g(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public View getActionView() {
        return null;
    }
    
    @Override
    public int getAlphabeticModifiers() {
        return this.u;
    }
    
    public char getAlphabeticShortcut() {
        return this.t;
    }
    
    @Override
    public CharSequence getContentDescription() {
        return this.y;
    }
    
    public int getGroupId() {
        return this.m;
    }
    
    public Drawable getIcon() {
        return this.v;
    }
    
    @Override
    public ColorStateList getIconTintList() {
        return this.A;
    }
    
    @Override
    public PorterDuff$Mode getIconTintMode() {
        return this.B;
    }
    
    public Intent getIntent() {
        return this.q;
    }
    
    public int getItemId() {
        return this.l;
    }
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    @Override
    public int getNumericModifiers() {
        return this.s;
    }
    
    public char getNumericShortcut() {
        return this.r;
    }
    
    public int getOrder() {
        return this.n;
    }
    
    public SubMenu getSubMenu() {
        return null;
    }
    
    public CharSequence getTitle() {
        return this.o;
    }
    
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.p;
        if (charSequence == null) {
            charSequence = this.o;
        }
        return charSequence;
    }
    
    @Override
    public CharSequence getTooltipText() {
        return this.z;
    }
    
    public c h(final View view) {
        throw new UnsupportedOperationException();
    }
    
    public boolean hasSubMenu() {
        return false;
    }
    
    public a i(final boolean b) {
        final int e = this.E;
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.E = (n | (e & 0xFFFFFFFB));
        return this;
    }
    
    @Override
    public boolean isActionViewExpanded() {
        return false;
    }
    
    public boolean isCheckable() {
        final int e = this.E;
        boolean b = true;
        if ((e & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public boolean isChecked() {
        return (this.E & 0x2) != 0x0;
    }
    
    public boolean isEnabled() {
        return (this.E & 0x10) != 0x0;
    }
    
    public boolean isVisible() {
        return (this.E & 0x8) == 0x0;
    }
    
    public c j(final int showAsAction) {
        this.setShowAsAction(showAsAction);
        return this;
    }
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    public MenuItem setAlphabeticShortcut(final char ch) {
        this.t = Character.toLowerCase(ch);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setAlphabeticShortcut(final char ch, final int n) {
        this.t = Character.toLowerCase(ch);
        this.u = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean b) {
        this.E = ((b ? 1 : 0) | (this.E & 0xFFFFFFFE));
        return (MenuItem)this;
    }
    
    public MenuItem setChecked(final boolean b) {
        final int e = this.E;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.E = (n | (e & 0xFFFFFFFD));
        return (MenuItem)this;
    }
    
    @Override
    public c setContentDescription(final CharSequence y) {
        this.y = y;
        return this;
    }
    
    public MenuItem setEnabled(final boolean b) {
        final int e = this.E;
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.E = (n | (e & 0xFFFFFFEF));
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int n) {
        this.v = d.i(this.w, n);
        this.e();
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable v) {
        this.v = v;
        this.e();
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setIconTintList(@k0 final ColorStateList a) {
        this.A = a;
        this.C = true;
        this.e();
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setIconTintMode(final PorterDuff$Mode b) {
        this.B = b;
        this.D = true;
        this.e();
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent q) {
        this.q = q;
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char c) {
        this.r = c;
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setNumericShortcut(final char c, final int n) {
        this.r = c;
        this.s = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        throw new UnsupportedOperationException();
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener x) {
        this.x = x;
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char c, final char ch) {
        this.r = c;
        this.t = Character.toLowerCase(ch);
        return (MenuItem)this;
    }
    
    @Override
    public MenuItem setShortcut(final char c, final char ch, final int n, final int n2) {
        this.r = c;
        this.s = KeyEvent.normalizeMetaState(n);
        this.t = Character.toLowerCase(ch);
        this.u = KeyEvent.normalizeMetaState(n2);
        return (MenuItem)this;
    }
    
    @Override
    public void setShowAsAction(final int n) {
    }
    
    public MenuItem setTitle(final int n) {
        this.o = this.w.getResources().getString(n);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final CharSequence o) {
        this.o = o;
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(final CharSequence p) {
        this.p = p;
        return (MenuItem)this;
    }
    
    @Override
    public c setTooltipText(final CharSequence z) {
        this.z = z;
        return this;
    }
    
    public MenuItem setVisible(final boolean b) {
        final int e = this.E;
        int n = 8;
        if (b) {
            n = 0;
        }
        this.E = ((e & 0x8) | n);
        return (MenuItem)this;
    }
}
