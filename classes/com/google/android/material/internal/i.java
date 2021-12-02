// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import androidx.core.view.accessibility.d;
import android.widget.TextView;
import android.view.SubMenu;
import java.util.ArrayList;
import androidx.annotation.e0;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.view.menu.o;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.s;
import android.util.SparseArray;
import android.os.Bundle;
import android.os.Parcelable;
import o2.a;
import android.content.Context;
import androidx.annotation.x0;
import androidx.annotation.q;
import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.appcompat.view.menu.j;
import android.view.MenuItem;
import android.view.View;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.g;
import android.widget.LinearLayout;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.n;

@t0({ t0.a.H })
public class i implements n
{
    private static final String c0 = "android:menu:list";
    private static final String d0 = "android:menu:adapter";
    private static final String e0 = "android:menu:header";
    private NavigationMenuView G;
    LinearLayout H;
    private a I;
    androidx.appcompat.view.menu.g J;
    private int K;
    c L;
    LayoutInflater M;
    int N;
    boolean O;
    ColorStateList P;
    ColorStateList Q;
    Drawable R;
    int S;
    int T;
    int U;
    boolean V;
    boolean W;
    private int X;
    private int Y;
    int Z;
    private int a0;
    final View$OnClickListener b0;
    
    public i() {
        this.W = true;
        this.a0 = -1;
        this.b0 = (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView)view;
                final i g = i.this;
                boolean b = true;
                g.N(true);
                final androidx.appcompat.view.menu.j itemData = navigationMenuItemView.getItemData();
                final i g2 = i.this;
                final boolean p = g2.J.P((MenuItem)itemData, g2, 0);
                if (itemData != null && itemData.isCheckable() && p) {
                    i.this.L.q(itemData);
                }
                else {
                    b = false;
                }
                i.this.N(false);
                if (b) {
                    i.this.e(false);
                }
            }
        };
    }
    
    private void O() {
        int y;
        if (this.H.getChildCount() == 0 && this.W) {
            y = this.Y;
        }
        else {
            y = 0;
        }
        final NavigationMenuView g = this.G;
        g.setPadding(0, y, 0, g.getPaddingBottom());
    }
    
    public void A(@j0 final View view) {
        this.H.removeView(view);
        if (this.H.getChildCount() == 0) {
            final NavigationMenuView g = this.G;
            g.setPadding(0, this.Y, 0, g.getPaddingBottom());
        }
    }
    
    public void B(final boolean w) {
        if (this.W != w) {
            this.W = w;
            this.O();
        }
    }
    
    public void C(@j0 final androidx.appcompat.view.menu.j j) {
        this.L.q(j);
    }
    
    public void D(final int k) {
        this.K = k;
    }
    
    public void E(@k0 final Drawable r) {
        this.R = r;
        this.e(false);
    }
    
    public void F(final int s) {
        this.S = s;
        this.e(false);
    }
    
    public void G(final int t) {
        this.T = t;
        this.e(false);
    }
    
    public void H(@q final int u) {
        if (this.U != u) {
            this.U = u;
            this.V = true;
            this.e(false);
        }
    }
    
    public void I(@k0 final ColorStateList q) {
        this.Q = q;
        this.e(false);
    }
    
    public void J(final int x) {
        this.X = x;
        this.e(false);
    }
    
    public void K(@x0 final int n) {
        this.N = n;
        this.O = true;
        this.e(false);
    }
    
    public void L(@k0 final ColorStateList p) {
        this.P = p;
        this.e(false);
    }
    
    public void M(final int n) {
        this.a0 = n;
        final NavigationMenuView g = this.G;
        if (g != null) {
            g.setOverScrollMode(n);
        }
    }
    
    public void N(final boolean b) {
        final c l = this.L;
        if (l != null) {
            l.r(b);
        }
    }
    
    @Override
    public int b() {
        return this.K;
    }
    
    public void c(@j0 final View view) {
        this.H.addView(view);
        final NavigationMenuView g = this.G;
        g.setPadding(0, 0, 0, g.getPaddingBottom());
    }
    
    @Override
    public void d(final androidx.appcompat.view.menu.g g, final boolean b) {
        final a i = this.I;
        if (i != null) {
            i.d(g, b);
        }
    }
    
    @Override
    public void e(final boolean b) {
        final c l = this.L;
        if (l != null) {
            l.s();
        }
    }
    
    @Override
    public boolean f() {
        return false;
    }
    
    @Override
    public boolean g(final androidx.appcompat.view.menu.g g, final androidx.appcompat.view.menu.j j) {
        return false;
    }
    
    @Override
    public boolean h(final androidx.appcompat.view.menu.g g, final androidx.appcompat.view.menu.j j) {
        return false;
    }
    
    @Override
    public void i(final a i) {
        this.I = i;
    }
    
    @Override
    public void j(@j0 final Context context, @j0 final androidx.appcompat.view.menu.g j) {
        this.M = LayoutInflater.from(context);
        this.J = j;
        this.Z = context.getResources().getDimensionPixelOffset(o2.a.f.s1);
    }
    
    @Override
    public void k(final Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            final Bundle bundle = (Bundle)parcelable;
            final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.G.restoreHierarchyState(sparseParcelableArray);
            }
            final Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.L.p(bundle2);
            }
            final SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.H.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }
    
    public void l(@j0 final androidx.core.view.x0 x0) {
        final int r = x0.r();
        if (this.Y != r) {
            this.Y = r;
            this.O();
        }
        final NavigationMenuView g = this.G;
        g.setPadding(0, g.getPaddingTop(), 0, x0.o());
        androidx.core.view.j0.o((View)this.H, x0);
    }
    
    @Override
    public boolean m(final s s) {
        return false;
    }
    
    @Override
    public o n(final ViewGroup viewGroup) {
        if (this.G == null) {
            (this.G = (NavigationMenuView)this.M.inflate(o2.a.k.O, viewGroup, false)).setAccessibilityDelegateCompat(new h(this.G));
            if (this.L == null) {
                this.L = new c();
            }
            final int a0 = this.a0;
            if (a0 != -1) {
                this.G.setOverScrollMode(a0);
            }
            this.H = (LinearLayout)this.M.inflate(o2.a.k.L, (ViewGroup)this.G, false);
            this.G.setAdapter((RecyclerView.h)this.L);
        }
        return this.G;
    }
    
    @j0
    @Override
    public Parcelable o() {
        final Bundle bundle = new Bundle();
        if (this.G != null) {
            final SparseArray sparseArray = new SparseArray();
            this.G.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        final c l = this.L;
        if (l != null) {
            bundle.putBundle("android:menu:adapter", l.i());
        }
        if (this.H != null) {
            final SparseArray sparseArray2 = new SparseArray();
            this.H.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return (Parcelable)bundle;
    }
    
    @k0
    public androidx.appcompat.view.menu.j p() {
        return this.L.j();
    }
    
    public int q() {
        return this.H.getChildCount();
    }
    
    public View r(final int n) {
        return this.H.getChildAt(n);
    }
    
    @k0
    public Drawable s() {
        return this.R;
    }
    
    public int t() {
        return this.S;
    }
    
    public int u() {
        return this.T;
    }
    
    public int v() {
        return this.X;
    }
    
    @k0
    public ColorStateList w() {
        return this.P;
    }
    
    @k0
    public ColorStateList x() {
        return this.Q;
    }
    
    public View y(@e0 final int n) {
        final View inflate = this.M.inflate(n, (ViewGroup)this.H, false);
        this.c(inflate);
        return inflate;
    }
    
    public boolean z() {
        return this.W;
    }
    
    private static class b extends l
    {
        public b(final View view) {
            super(view);
        }
    }
    
    private class c extends RecyclerView.h<l>
    {
        private static final String e = "android:menu:checked";
        private static final String f = "android:menu:action_views";
        private static final int g = 0;
        private static final int h = 1;
        private static final int i = 2;
        private static final int j = 3;
        private final ArrayList<e> a;
        private j b;
        private boolean c;
        
        c() {
            this.a = new ArrayList<e>();
            this.o();
        }
        
        private void h(int i, final int n) {
            while (i < n) {
                this.a.get(i).b = true;
                ++i;
            }
        }
        
        private void o() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.clear();
            this.a.add(new d());
            int n = -1;
            final int size = com.google.android.material.internal.i.this.J.H().size();
            int i = 0;
            int n2 = 0;
            int n3 = 0;
            while (i < size) {
                final j j = com.google.android.material.internal.i.this.J.H().get(i);
                if (j.isChecked()) {
                    this.q(j);
                }
                if (j.isCheckable()) {
                    j.w(false);
                }
                int groupId;
                int b;
                int n4;
                if (j.hasSubMenu()) {
                    final SubMenu subMenu = j.getSubMenu();
                    groupId = n;
                    b = n2;
                    n4 = n3;
                    if (subMenu.hasVisibleItems()) {
                        if (i != 0) {
                            this.a.add(new f(com.google.android.material.internal.i.this.Z, 0));
                        }
                        this.a.add(new g(j));
                        final int size2 = this.a.size();
                        final int size3 = subMenu.size();
                        int k = 0;
                        int n5 = 0;
                        while (k < size3) {
                            final j l = (j)subMenu.getItem(k);
                            int n6 = n5;
                            if (l.isVisible()) {
                                if ((n6 = n5) == 0) {
                                    n6 = n5;
                                    if (l.getIcon() != null) {
                                        n6 = 1;
                                    }
                                }
                                if (l.isCheckable()) {
                                    l.w(false);
                                }
                                if (j.isChecked()) {
                                    this.q(j);
                                }
                                this.a.add(new g(l));
                            }
                            ++k;
                            n5 = n6;
                        }
                        groupId = n;
                        b = n2;
                        n4 = n3;
                        if (n5 != 0) {
                            this.h(size2, this.a.size());
                            groupId = n;
                            b = n2;
                            n4 = n3;
                        }
                    }
                }
                else {
                    groupId = j.getGroupId();
                    int n7;
                    if (groupId != n) {
                        final int size4 = this.a.size();
                        final boolean b2 = (b = ((j.getIcon() != null) ? 1 : 0)) != 0;
                        n7 = size4;
                        if (i != 0) {
                            n7 = size4 + 1;
                            final ArrayList<e> a = this.a;
                            final int z = com.google.android.material.internal.i.this.Z;
                            a.add(new f(z, z));
                            b = (b2 ? 1 : 0);
                        }
                    }
                    else {
                        b = n2;
                        n7 = n3;
                        if (n2 == 0) {
                            b = n2;
                            n7 = n3;
                            if (j.getIcon() != null) {
                                this.h(n3, this.a.size());
                                b = 1;
                                n7 = n3;
                            }
                        }
                    }
                    final g e = new g(j);
                    e.b = (b != 0);
                    this.a.add(e);
                    n4 = n7;
                }
                ++i;
                n = groupId;
                n2 = b;
                n3 = n4;
            }
            this.c = false;
        }
        
        @Override
        public int getItemCount() {
            return this.a.size();
        }
        
        @Override
        public long getItemId(final int n) {
            return n;
        }
        
        @Override
        public int getItemViewType(final int index) {
            final e e = this.a.get(index);
            if (e instanceof f) {
                return 2;
            }
            if (e instanceof d) {
                return 3;
            }
            if (!(e instanceof g)) {
                throw new RuntimeException("Unknown item type.");
            }
            if (((g)e).a().hasSubMenu()) {
                return 1;
            }
            return 0;
        }
        
        @j0
        public Bundle i() {
            final Bundle bundle = new Bundle();
            final j b = this.b;
            if (b != null) {
                bundle.putInt("android:menu:checked", b.getItemId());
            }
            final SparseArray sparseArray = new SparseArray();
            for (int i = 0; i < this.a.size(); ++i) {
                final e e = this.a.get(i);
                if (e instanceof g) {
                    final j a = ((g)e).a();
                    View actionView;
                    if (a != null) {
                        actionView = a.getActionView();
                    }
                    else {
                        actionView = null;
                    }
                    if (actionView != null) {
                        final k k = new k();
                        actionView.saveHierarchyState((SparseArray)k);
                        sparseArray.put(a.getItemId(), (Object)k);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }
        
        public j j() {
            return this.b;
        }
        
        int k() {
            final int childCount = com.google.android.material.internal.i.this.H.getChildCount();
            int i = 0;
            int n;
            if (childCount == 0) {
                n = 0;
            }
            else {
                n = 1;
            }
            while (i < com.google.android.material.internal.i.this.L.getItemCount()) {
                int n2 = n;
                if (com.google.android.material.internal.i.this.L.getItemViewType(i) == 0) {
                    n2 = n + 1;
                }
                ++i;
                n = n2;
            }
            return n;
        }
        
        public void l(@j0 final l l, final int index) {
            final int itemViewType = this.getItemViewType(index);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType == 2) {
                        final f f = this.a.get(index);
                        l.itemView.setPadding(0, f.b(), 0, f.a());
                    }
                }
                else {
                    ((TextView)l.itemView).setText(((g)this.a.get(index)).a().getTitle());
                }
            }
            else {
                final NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView)l.itemView;
                navigationMenuItemView.setIconTintList(com.google.android.material.internal.i.this.Q);
                final i d = com.google.android.material.internal.i.this;
                if (d.O) {
                    navigationMenuItemView.setTextAppearance(d.N);
                }
                final ColorStateList p2 = com.google.android.material.internal.i.this.P;
                if (p2 != null) {
                    navigationMenuItemView.setTextColor(p2);
                }
                final Drawable r = com.google.android.material.internal.i.this.R;
                Drawable drawable;
                if (r != null) {
                    drawable = r.getConstantState().newDrawable();
                }
                else {
                    drawable = null;
                }
                androidx.core.view.j0.G1((View)navigationMenuItemView, drawable);
                final g g = this.a.get(index);
                navigationMenuItemView.setNeedsEmptyIcon(g.b);
                navigationMenuItemView.setHorizontalPadding(com.google.android.material.internal.i.this.S);
                navigationMenuItemView.setIconPadding(com.google.android.material.internal.i.this.T);
                final i d2 = com.google.android.material.internal.i.this;
                if (d2.V) {
                    navigationMenuItemView.setIconSize(d2.U);
                }
                navigationMenuItemView.setMaxLines(com.google.android.material.internal.i.this.X);
                navigationMenuItemView.g(g.a(), 0);
            }
        }
        
        @k0
        public l m(final ViewGroup viewGroup, final int n) {
            if (n == 0) {
                final i d = com.google.android.material.internal.i.this;
                return new i(d.M, viewGroup, d.b0);
            }
            if (n == 1) {
                return new k(com.google.android.material.internal.i.this.M, viewGroup);
            }
            if (n == 2) {
                return new j(com.google.android.material.internal.i.this.M, viewGroup);
            }
            if (n != 3) {
                return null;
            }
            return new b((View)com.google.android.material.internal.i.this.H);
        }
        
        public void n(final l l) {
            if (l instanceof i) {
                ((NavigationMenuItemView)l.itemView).H();
            }
        }
        
        public void p(@j0 final Bundle bundle) {
            final int n = 0;
            final int int1 = bundle.getInt("android:menu:checked", 0);
            if (int1 != 0) {
                this.c = true;
                for (int size = this.a.size(), i = 0; i < size; ++i) {
                    final e e = this.a.get(i);
                    if (e instanceof g) {
                        final j a = ((g)e).a();
                        if (a != null && a.getItemId() == int1) {
                            this.q(a);
                            break;
                        }
                    }
                }
                this.c = false;
                this.o();
            }
            final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                for (int size2 = this.a.size(), j = n; j < size2; ++j) {
                    final e e2 = this.a.get(j);
                    if (e2 instanceof g) {
                        final j a2 = ((g)e2).a();
                        if (a2 != null) {
                            final View actionView = a2.getActionView();
                            if (actionView != null) {
                                final k k = (k)sparseParcelableArray.get(a2.getItemId());
                                if (k != null) {
                                    actionView.restoreHierarchyState((SparseArray)k);
                                }
                            }
                        }
                    }
                }
            }
        }
        
        public void q(@j0 final j b) {
            if (this.b != b) {
                if (b.isCheckable()) {
                    final j b2 = this.b;
                    if (b2 != null) {
                        b2.setChecked(false);
                    }
                    (this.b = b).setChecked(true);
                }
            }
        }
        
        public void r(final boolean c) {
            this.c = c;
        }
        
        public void s() {
            this.o();
            ((RecyclerView.h)this).notifyDataSetChanged();
        }
    }
    
    private static class d implements e
    {
        d() {
        }
    }
    
    private interface e
    {
    }
    
    private static class f implements e
    {
        private final int a;
        private final int b;
        
        public f(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public int a() {
            return this.b;
        }
        
        public int b() {
            return this.a;
        }
    }
    
    private static class g implements e
    {
        private final androidx.appcompat.view.menu.j a;
        boolean b;
        
        g(final androidx.appcompat.view.menu.j a) {
            this.a = a;
        }
        
        public androidx.appcompat.view.menu.j a() {
            return this.a;
        }
    }
    
    private class h extends b0
    {
        h(final RecyclerView recyclerView) {
            super(recyclerView);
        }
        
        @Override
        public void g(final View view, @j0 final androidx.core.view.accessibility.d d) {
            super.g(view, d);
            d.W0(d.b.e(i.this.L.k(), 0, false));
        }
    }
    
    private static class i extends l
    {
        public i(@j0 final LayoutInflater layoutInflater, final ViewGroup viewGroup, final View$OnClickListener onClickListener) {
            super(layoutInflater.inflate(a.k.K, viewGroup, false));
            super.itemView.setOnClickListener(onClickListener);
        }
    }
    
    private static class j extends l
    {
        public j(@j0 final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
            super(layoutInflater.inflate(a.k.M, viewGroup, false));
        }
    }
    
    private static class k extends l
    {
        public k(@j0 final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
            super(layoutInflater.inflate(o2.a.k.N, viewGroup, false));
        }
    }
    
    private abstract static class l extends g0
    {
        public l(final View view) {
            super(view);
        }
    }
}
