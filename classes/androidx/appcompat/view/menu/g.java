// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import java.util.Collection;
import android.view.KeyCharacterMap$KeyData;
import android.view.KeyEvent;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import androidx.core.view.b;
import android.view.SubMenu;
import android.view.MenuItem;
import androidx.annotation.j0;
import androidx.core.view.k0;
import android.view.ViewConfiguration;
import android.util.SparseArray;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.Iterator;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.res.Resources;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import android.view.View;
import androidx.annotation.t0;
import o.a;

@t0({ t0.a.I })
public class g implements o.a
{
    private static final String L = "MenuBuilder";
    private static final String M = "android:menu:presenters";
    private static final String N = "android:menu:actionviewstates";
    private static final String O = "android:menu:expandedactionview";
    private static final int[] P;
    View A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private ArrayList<j> G;
    private CopyOnWriteArrayList<WeakReference<n>> H;
    private j I;
    private boolean J;
    private boolean K;
    private final Context l;
    private final Resources m;
    private boolean n;
    private boolean o;
    private a p;
    private ArrayList<j> q;
    private ArrayList<j> r;
    private boolean s;
    private ArrayList<j> t;
    private ArrayList<j> u;
    private boolean v;
    private int w;
    private ContextMenu$ContextMenuInfo x;
    CharSequence y;
    Drawable z;
    
    static {
        P = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    public g(final Context l) {
        this.w = 0;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = new ArrayList<j>();
        this.H = new CopyOnWriteArrayList<WeakReference<n>>();
        this.J = false;
        this.l = l;
        this.m = l.getResources();
        this.q = new ArrayList<j>();
        this.r = new ArrayList<j>();
        this.s = true;
        this.t = new ArrayList<j>();
        this.u = new ArrayList<j>();
        this.k0(this.v = true);
    }
    
    private static int E(final int n) {
        final int n2 = (0xFFFF0000 & n) >> 16;
        if (n2 >= 0) {
            final int[] p = g.P;
            if (n2 < p.length) {
                return (n & 0xFFFF) | p[n2] << 16;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }
    
    private void R(final int index, final boolean b) {
        if (index >= 0) {
            if (index < this.q.size()) {
                this.q.remove(index);
                if (b) {
                    this.N(true);
                }
            }
        }
    }
    
    private void d0(final int n, final CharSequence y, final int n2, final Drawable z, final View a) {
        final Resources f = this.F();
        if (a != null) {
            this.A = a;
            this.y = null;
            this.z = null;
        }
        else {
            if (n > 0) {
                this.y = f.getText(n);
            }
            else if (y != null) {
                this.y = y;
            }
            if (n2 > 0) {
                this.z = androidx.core.content.d.i(this.x(), n2);
            }
            else if (z != null) {
                this.z = z;
            }
            this.A = null;
        }
        this.N(false);
    }
    
    private j h(final int n, final int n2, final int n3, final int n4, final CharSequence charSequence, final int n5) {
        return new j(this, n, n2, n3, n4, charSequence, n5);
    }
    
    private void j(final boolean b) {
        if (this.H.isEmpty()) {
            return;
        }
        this.m0();
        for (final WeakReference<n> o : this.H) {
            final n n = o.get();
            if (n == null) {
                this.H.remove(o);
            }
            else {
                n.e(b);
            }
        }
        this.l0();
    }
    
    private void k(final Bundle bundle) {
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            if (!this.H.isEmpty()) {
                for (final WeakReference<n> o : this.H) {
                    final n n = o.get();
                    if (n == null) {
                        this.H.remove(o);
                    }
                    else {
                        final int b = n.b();
                        if (b <= 0) {
                            continue;
                        }
                        final Parcelable parcelable = (Parcelable)sparseParcelableArray.get(b);
                        if (parcelable == null) {
                            continue;
                        }
                        n.k(parcelable);
                    }
                }
            }
        }
    }
    
    private void k0(final boolean b) {
        final boolean b2 = true;
        this.o = (b && this.m.getConfiguration().keyboard != 1 && k0.g(ViewConfiguration.get(this.l), this.l) && b2);
    }
    
    private void l(final Bundle bundle) {
        if (this.H.isEmpty()) {
            return;
        }
        final SparseArray sparseArray = new SparseArray();
        for (final WeakReference<n> o : this.H) {
            final n n = o.get();
            if (n == null) {
                this.H.remove(o);
            }
            else {
                final int b = n.b();
                if (b <= 0) {
                    continue;
                }
                final Parcelable o2 = n.o();
                if (o2 == null) {
                    continue;
                }
                sparseArray.put(b, (Object)o2);
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }
    
    private boolean m(final s s, n n) {
        final boolean empty = this.H.isEmpty();
        boolean b = false;
        if (empty) {
            return false;
        }
        if (n != null) {
            b = n.m(s);
        }
        for (final WeakReference<n> o : this.H) {
            n = (n)o.get();
            if (n == null) {
                this.H.remove(o);
            }
            else {
                if (b) {
                    continue;
                }
                b = n.m(s);
            }
        }
        return b;
    }
    
    private static int q(final ArrayList<j> list, final int n) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i).i() <= n) {
                return i + 1;
            }
        }
        return 0;
    }
    
    public CharSequence A() {
        return this.y;
    }
    
    public View B() {
        return this.A;
    }
    
    public ArrayList<j> C() {
        this.u();
        return this.u;
    }
    
    boolean D() {
        return this.E;
    }
    
    Resources F() {
        return this.m;
    }
    
    public g G() {
        return this;
    }
    
    @j0
    public ArrayList<j> H() {
        if (!this.s) {
            return this.r;
        }
        this.r.clear();
        for (int size = this.q.size(), i = 0; i < size; ++i) {
            final j e = this.q.get(i);
            if (e.isVisible()) {
                this.r.add(e);
            }
        }
        this.s = false;
        this.v = true;
        return this.r;
    }
    
    public boolean I() {
        return this.J;
    }
    
    boolean J() {
        return this.n;
    }
    
    public boolean K() {
        return this.o;
    }
    
    void L(final j j) {
        this.N(this.v = true);
    }
    
    void M(final j j) {
        this.N(this.s = true);
    }
    
    public void N(final boolean b) {
        if (!this.B) {
            if (b) {
                this.s = true;
                this.v = true;
            }
            this.j(b);
        }
        else {
            this.C = true;
            if (b) {
                this.D = true;
            }
        }
    }
    
    public boolean O(final MenuItem menuItem, final int n) {
        return this.P(menuItem, null, n);
    }
    
    public boolean P(final MenuItem menuItem, final n n, final int n2) {
        final j j = (j)menuItem;
        if (j != null && j.isEnabled()) {
            final boolean n3 = j.n();
            final androidx.core.view.b b = j.b();
            final boolean b2 = b != null && b.b();
            boolean b4;
            if (j.m()) {
                final boolean b3 = b4 = (n3 | j.expandActionView());
                if (!b3) {
                    return b4;
                }
                b4 = b3;
            }
            else if (!j.hasSubMenu() && !b2) {
                b4 = n3;
                if ((n2 & 0x1) != 0x0) {
                    return b4;
                }
                b4 = n3;
            }
            else {
                if ((n2 & 0x4) == 0x0) {
                    this.f(false);
                }
                if (!j.hasSubMenu()) {
                    j.A(new s(this.x(), this, j));
                }
                final s s = (s)j.getSubMenu();
                if (b2) {
                    b.g((SubMenu)s);
                }
                final boolean b5 = b4 = (n3 | this.m(s, n));
                if (b5) {
                    return b4;
                }
                b4 = b5;
            }
            this.f(true);
            return b4;
        }
        return false;
    }
    
    public void Q(final int n) {
        this.R(n, true);
    }
    
    public void S(final n n) {
        for (final WeakReference<n> o : this.H) {
            final n n2 = o.get();
            if (n2 == null || n2 == n) {
                this.H.remove(o);
            }
        }
    }
    
    public void T(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(this.w());
        for (int size = this.size(), i = 0; i < size; ++i) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((s)item.getSubMenu()).T(bundle);
            }
        }
        final int int1 = bundle.getInt("android:menu:expandedactionview");
        if (int1 > 0) {
            final MenuItem item2 = this.findItem(int1);
            if (item2 != null) {
                item2.expandActionView();
            }
        }
    }
    
    public void U(final Bundle bundle) {
        this.k(bundle);
    }
    
    public void V(final Bundle bundle) {
        final int size = this.size();
        SparseArray sparseArray = null;
        SparseArray sparseArray2;
        for (int i = 0; i < size; ++i, sparseArray = sparseArray2) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            sparseArray2 = sparseArray;
            if (actionView != null) {
                sparseArray2 = sparseArray;
                if (actionView.getId() != -1) {
                    SparseArray sparseArray3;
                    if ((sparseArray3 = sparseArray) == null) {
                        sparseArray3 = new SparseArray();
                    }
                    actionView.saveHierarchyState(sparseArray3);
                    sparseArray2 = sparseArray3;
                    if (item.isActionViewExpanded()) {
                        bundle.putInt("android:menu:expandedactionview", item.getItemId());
                        sparseArray2 = sparseArray3;
                    }
                }
            }
            if (item.hasSubMenu()) {
                ((s)item.getSubMenu()).V(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(this.w(), sparseArray);
        }
    }
    
    public void W(final Bundle bundle) {
        this.l(bundle);
    }
    
    public void X(final a p) {
        this.p = p;
    }
    
    public void Y(final ContextMenu$ContextMenuInfo x) {
        this.x = x;
    }
    
    public g Z(final int w) {
        this.w = w;
        return this;
    }
    
    protected MenuItem a(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final int e = E(n3);
        final j h = this.h(n, n2, n3, e, charSequence, this.w);
        final ContextMenu$ContextMenuInfo x = this.x;
        if (x != null) {
            h.y(x);
        }
        final ArrayList<j> q = this.q;
        q.add(q(q, e), h);
        this.N(true);
        return (MenuItem)h;
    }
    
    void a0(final MenuItem menuItem) {
        final int groupId = menuItem.getGroupId();
        final int size = this.q.size();
        this.m0();
        for (int i = 0; i < size; ++i) {
            final j j = this.q.get(i);
            if (j.getGroupId() == groupId) {
                if (j.p()) {
                    if (j.isCheckable()) {
                        j.v(j == menuItem);
                    }
                }
            }
        }
        this.l0();
    }
    
    public MenuItem add(final int n) {
        return this.a(0, 0, 0, this.m.getString(n));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.a(n, n2, n3, this.m.getString(n4));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.a(n, n2, n3, charSequence);
    }
    
    public MenuItem add(final CharSequence charSequence) {
        return this.a(0, 0, 0, charSequence);
    }
    
    public int addIntentOptions(final int n, final int n2, final int n3, final ComponentName componentName, final Intent[] array, final Intent intent, int n4, final MenuItem[] array2) {
        final PackageManager packageManager = this.l.getPackageManager();
        final int n5 = 0;
        final List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, array, intent, 0);
        int size;
        if (queryIntentActivityOptions != null) {
            size = queryIntentActivityOptions.size();
        }
        else {
            size = 0;
        }
        int i = n5;
        if ((n4 & 0x1) == 0x0) {
            this.removeGroup(n);
            i = n5;
        }
        while (i < size) {
            final ResolveInfo resolveInfo = queryIntentActivityOptions.get(i);
            n4 = resolveInfo.specificIndex;
            Intent intent2;
            if (n4 < 0) {
                intent2 = intent;
            }
            else {
                intent2 = array[n4];
            }
            final Intent intent3 = new Intent(intent2);
            final ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            final MenuItem setIntent = this.add(n, n2, n3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (array2 != null) {
                n4 = resolveInfo.specificIndex;
                if (n4 >= 0) {
                    array2[n4] = setIntent;
                }
            }
            ++i;
        }
        return size;
    }
    
    public SubMenu addSubMenu(final int n) {
        return this.addSubMenu(0, 0, 0, this.m.getString(n));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.addSubMenu(n, n2, n3, this.m.getString(n4));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final j j = (j)this.a(n, n2, n3, charSequence);
        final s s = new s(this.l, this, j);
        j.A(s);
        return (SubMenu)s;
    }
    
    public SubMenu addSubMenu(final CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }
    
    public void b(final n n) {
        this.c(n, this.l);
    }
    
    protected g b0(final int n) {
        this.d0(0, null, n, null, null);
        return this;
    }
    
    public void c(final n referent, final Context context) {
        this.H.add(new WeakReference<n>(referent));
        referent.j(context, this);
        this.v = true;
    }
    
    protected g c0(final Drawable drawable) {
        this.d0(0, null, 0, drawable, null);
        return this;
    }
    
    public void clear() {
        final j i = this.I;
        if (i != null) {
            this.g(i);
        }
        this.q.clear();
        this.N(true);
    }
    
    public void clearHeader() {
        this.z = null;
        this.y = null;
        this.A = null;
        this.N(false);
    }
    
    public void close() {
        this.f(true);
    }
    
    public void d() {
        final a p = this.p;
        if (p != null) {
            p.b(this);
        }
    }
    
    public void e() {
        this.B = true;
        this.clear();
        this.clearHeader();
        this.H.clear();
        this.B = false;
        this.C = false;
        this.D = false;
        this.N(true);
    }
    
    protected g e0(final int n) {
        this.d0(n, null, 0, null, null);
        return this;
    }
    
    public final void f(final boolean b) {
        if (this.F) {
            return;
        }
        this.F = true;
        for (final WeakReference<n> o : this.H) {
            final n n = o.get();
            if (n == null) {
                this.H.remove(o);
            }
            else {
                n.d(this, b);
            }
        }
        this.F = false;
    }
    
    protected g f0(final CharSequence charSequence) {
        this.d0(0, charSequence, 0, null, null);
        return this;
    }
    
    public MenuItem findItem(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            final j j = this.q.get(i);
            if (j.getItemId() == n) {
                return (MenuItem)j;
            }
            if (j.hasSubMenu()) {
                final MenuItem item = j.getSubMenu().findItem(n);
                if (item != null) {
                    return item;
                }
            }
        }
        return null;
    }
    
    public boolean g(final j j) {
        final boolean empty = this.H.isEmpty();
        final boolean b = false;
        final int n = 0;
        boolean b2 = b;
        if (!empty) {
            if (this.I != j) {
                b2 = b;
            }
            else {
                this.m0();
                final Iterator<WeakReference<n>> iterator = this.H.iterator();
                boolean g = n != 0;
                boolean b3;
                while (true) {
                    b3 = g;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final WeakReference<n> o = iterator.next();
                    final n n2 = o.get();
                    if (n2 == null) {
                        this.H.remove(o);
                    }
                    else {
                        b3 = (g = n2.g(this, j));
                        if (b3) {
                            break;
                        }
                        continue;
                    }
                }
                this.l0();
                b2 = b3;
                if (b3) {
                    this.I = null;
                    b2 = b3;
                }
            }
        }
        return b2;
    }
    
    protected g g0(final View view) {
        this.d0(0, null, 0, null, view);
        return this;
    }
    
    public MenuItem getItem(final int index) {
        return (MenuItem)this.q.get(index);
    }
    
    public void h0(final boolean e) {
        this.E = e;
    }
    
    public boolean hasVisibleItems() {
        if (this.K) {
            return true;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.q.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }
    
    boolean i(@j0 final g g, @j0 final MenuItem menuItem) {
        final a p2 = this.p;
        return p2 != null && p2.a(g, menuItem);
    }
    
    public void i0(final boolean k) {
        this.K = k;
    }
    
    public boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.s(n, keyEvent) != null;
    }
    
    public void j0(final boolean b) {
        if (this.o == b) {
            return;
        }
        this.k0(b);
        this.N(false);
    }
    
    public void l0() {
        this.B = false;
        if (this.C) {
            this.C = false;
            this.N(this.D);
        }
    }
    
    public void m0() {
        if (!this.B) {
            this.B = true;
            this.C = false;
            this.D = false;
        }
    }
    
    public boolean n(final j i) {
        final boolean empty = this.H.isEmpty();
        boolean h = false;
        if (empty) {
            return false;
        }
        this.m0();
        final Iterator<WeakReference<n>> iterator = this.H.iterator();
        boolean b;
        while (true) {
            b = h;
            if (!iterator.hasNext()) {
                break;
            }
            final WeakReference<n> o = iterator.next();
            final n n = o.get();
            if (n == null) {
                this.H.remove(o);
            }
            else {
                b = (h = n.h(this, i));
                if (b) {
                    break;
                }
                continue;
            }
        }
        this.l0();
        if (b) {
            this.I = i;
        }
        return b;
    }
    
    public int o(final int n) {
        return this.p(n, 0);
    }
    
    public int p(final int n, final int n2) {
        final int size = this.size();
        int i = n2;
        if (n2 < 0) {
            i = 0;
        }
        while (i < size) {
            if (this.q.get(i).getGroupId() == n) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public boolean performIdentifierAction(final int n, final int n2) {
        return this.O(this.findItem(n), n2);
    }
    
    public boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        final j s = this.s(n, keyEvent);
        final boolean b = s != null && this.O((MenuItem)s, n2);
        if ((n2 & 0x2) != 0x0) {
            this.f(true);
        }
        return b;
    }
    
    public int r(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.q.get(i).getItemId() == n) {
                return i;
            }
        }
        return -1;
    }
    
    public void removeGroup(final int n) {
        final int o = this.o(n);
        if (o >= 0) {
            for (int size = this.q.size(), n2 = 0; n2 < size - o && this.q.get(o).getGroupId() == n; ++n2) {
                this.R(o, false);
            }
            this.N(true);
        }
    }
    
    public void removeItem(final int n) {
        this.R(this.r(n), true);
    }
    
    j s(final int n, final KeyEvent keyEvent) {
        final ArrayList<j> g = this.G;
        g.clear();
        this.t(g, n, keyEvent);
        if (g.isEmpty()) {
            return null;
        }
        final int metaState = keyEvent.getMetaState();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        keyEvent.getKeyData(keyCharacterMap$KeyData);
        final int size = g.size();
        if (size == 1) {
            return g.get(0);
        }
        final boolean j = this.J();
        for (int i = 0; i < size; ++i) {
            final j k = g.get(i);
            char c;
            if (j) {
                c = k.getAlphabeticShortcut();
            }
            else {
                c = k.getNumericShortcut();
            }
            final char[] meta = keyCharacterMap$KeyData.meta;
            if ((c == meta[0] && (metaState & 0x2) == 0x0) || (c == meta[2] && (metaState & 0x2) != 0x0) || (j && c == '\b' && n == 67)) {
                return k;
            }
        }
        return null;
    }
    
    public void setGroupCheckable(final int n, final boolean checkable, final boolean b) {
        for (int size = this.q.size(), i = 0; i < size; ++i) {
            final j j = this.q.get(i);
            if (j.getGroupId() == n) {
                j.w(b);
                j.setCheckable(checkable);
            }
        }
    }
    
    @Override
    public void setGroupDividerEnabled(final boolean j) {
        this.J = j;
    }
    
    public void setGroupEnabled(final int n, final boolean enabled) {
        for (int size = this.q.size(), i = 0; i < size; ++i) {
            final j j = this.q.get(i);
            if (j.getGroupId() == n) {
                j.setEnabled(enabled);
            }
        }
    }
    
    public void setGroupVisible(final int n, final boolean b) {
        final int size = this.q.size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final j j = this.q.get(i);
            int n3 = n2;
            if (j.getGroupId() == n) {
                n3 = n2;
                if (j.B(b)) {
                    n3 = 1;
                }
            }
            ++i;
            n2 = n3;
        }
        if (n2 != 0) {
            this.N(true);
        }
    }
    
    public void setQwertyMode(final boolean n) {
        this.n = n;
        this.N(false);
    }
    
    public int size() {
        return this.q.size();
    }
    
    void t(final List<j> list, final int n, final KeyEvent keyEvent) {
        final boolean j = this.J();
        final int modifiers = keyEvent.getModifiers();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        if (!keyEvent.getKeyData(keyCharacterMap$KeyData) && n != 67) {
            return;
        }
        for (int size = this.q.size(), i = 0; i < size; ++i) {
            final j k = this.q.get(i);
            if (k.hasSubMenu()) {
                ((g)k.getSubMenu()).t(list, n, keyEvent);
            }
            char c;
            if (j) {
                c = k.getAlphabeticShortcut();
            }
            else {
                c = k.getNumericShortcut();
            }
            int n2;
            if (j) {
                n2 = k.getAlphabeticModifiers();
            }
            else {
                n2 = k.getNumericModifiers();
            }
            if ((modifiers & 0x1100F) == (n2 & 0x1100F) && c != '\0') {
                final char[] meta = keyCharacterMap$KeyData.meta;
                if ((c == meta[0] || c == meta[2] || (j && c == '\b' && n == 67)) && k.isEnabled()) {
                    list.add(k);
                }
            }
        }
    }
    
    public void u() {
        final ArrayList<j> h = this.H();
        if (!this.v) {
            return;
        }
        final Iterator<WeakReference<n>> iterator = this.H.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final WeakReference<n> o = iterator.next();
            final n n = o.get();
            if (n == null) {
                this.H.remove(o);
            }
            else {
                b |= n.f();
            }
        }
        if (b) {
            this.t.clear();
            this.u.clear();
            for (int size = h.size(), i = 0; i < size; ++i) {
                final j e = h.get(i);
                ArrayList<j> list;
                if (e.o()) {
                    list = this.t;
                }
                else {
                    list = this.u;
                }
                list.add(e);
            }
        }
        else {
            this.t.clear();
            this.u.clear();
            this.u.addAll(this.H());
        }
        this.v = false;
    }
    
    public ArrayList<j> v() {
        this.u();
        return this.t;
    }
    
    protected String w() {
        return "android:menu:actionviewstates";
    }
    
    public Context x() {
        return this.l;
    }
    
    public j y() {
        return this.I;
    }
    
    public Drawable z() {
        return this.z;
    }
    
    @t0({ t0.a.I })
    public interface a
    {
        boolean a(@j0 final g p0, @j0 final MenuItem p1);
        
        void b(@j0 final g p0);
    }
    
    @t0({ t0.a.I })
    public interface b
    {
        boolean a(final j p0);
    }
}
