// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import java.util.ArrayList;
import android.widget.BaseAdapter;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import c.a;
import android.view.ViewGroup;
import android.os.IBinder;
import android.util.SparseArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.widget.ListAdapter;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.annotation.t0;
import android.widget.AdapterView$OnItemClickListener;

@t0({ t0.a.I })
public class e implements n, AdapterView$OnItemClickListener
{
    private static final String Q = "ListMenuPresenter";
    public static final String R = "android:menu:list";
    Context G;
    LayoutInflater H;
    g I;
    ExpandedMenuView J;
    int K;
    int L;
    int M;
    private n.a N;
    a O;
    private int P;
    
    public e(final int m, final int l) {
        this.M = m;
        this.L = l;
    }
    
    public e(final Context g, final int n) {
        this(n, 0);
        this.G = g;
        this.H = LayoutInflater.from(g);
    }
    
    public ListAdapter a() {
        if (this.O == null) {
            this.O = new a();
        }
        return (ListAdapter)this.O;
    }
    
    @Override
    public int b() {
        return this.P;
    }
    
    int c() {
        return this.K;
    }
    
    @Override
    public void d(final g g, final boolean b) {
        final n.a n = this.N;
        if (n != null) {
            n.d(g, b);
        }
    }
    
    @Override
    public void e(final boolean b) {
        final a o = this.O;
        if (o != null) {
            o.notifyDataSetChanged();
        }
    }
    
    @Override
    public boolean f() {
        return false;
    }
    
    @Override
    public boolean g(final g g, final j j) {
        return false;
    }
    
    @Override
    public boolean h(final g g, final j j) {
        return false;
    }
    
    @Override
    public void i(final n.a n) {
        this.N = n;
    }
    
    @Override
    public void j(final Context g, final g i) {
        Label_0065: {
            LayoutInflater h;
            if (this.L != 0) {
                final ContextThemeWrapper g2 = new ContextThemeWrapper(g, this.L);
                this.G = (Context)g2;
                h = LayoutInflater.from((Context)g2);
            }
            else {
                if (this.G == null) {
                    break Label_0065;
                }
                this.G = g;
                if (this.H != null) {
                    break Label_0065;
                }
                h = LayoutInflater.from(g);
            }
            this.H = h;
        }
        this.I = i;
        final a o = this.O;
        if (o != null) {
            o.notifyDataSetChanged();
        }
    }
    
    @Override
    public void k(final Parcelable parcelable) {
        this.l((Bundle)parcelable);
    }
    
    public void l(final Bundle bundle) {
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            ((View)this.J).restoreHierarchyState(sparseParcelableArray);
        }
    }
    
    @Override
    public boolean m(final s s) {
        if (!s.hasVisibleItems()) {
            return false;
        }
        new h(s).c(null);
        final n.a n = this.N;
        if (n != null) {
            n.e(s);
        }
        return true;
    }
    
    @Override
    public o n(final ViewGroup viewGroup) {
        if (this.J == null) {
            this.J = (ExpandedMenuView)this.H.inflate(c.a.k.n, viewGroup, false);
            if (this.O == null) {
                this.O = new a();
            }
            this.J.setAdapter((ListAdapter)this.O);
            this.J.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        }
        return this.J;
    }
    
    @Override
    public Parcelable o() {
        if (this.J == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        this.p(bundle);
        return (Parcelable)bundle;
    }
    
    public void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        this.I.P((MenuItem)this.O.b(n), this, 0);
    }
    
    public void p(final Bundle bundle) {
        final SparseArray sparseArray = new SparseArray();
        final ExpandedMenuView j = this.J;
        if (j != null) {
            ((View)j).saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }
    
    public void q(final int p) {
        this.P = p;
    }
    
    public void r(final int k) {
        this.K = k;
        if (this.J != null) {
            this.e(false);
        }
    }
    
    private class a extends BaseAdapter
    {
        private int G;
        
        public a() {
            this.G = -1;
            this.a();
        }
        
        void a() {
            final j y = e.this.I.y();
            if (y != null) {
                final ArrayList<j> c = e.this.I.C();
                for (int size = c.size(), i = 0; i < size; ++i) {
                    if (c.get(i) == y) {
                        this.G = i;
                        return;
                    }
                }
            }
            this.G = -1;
        }
        
        public j b(int index) {
            final ArrayList<j> c = e.this.I.C();
            final int n = index + e.this.K;
            final int g = this.G;
            index = n;
            if (g >= 0 && (index = n) >= g) {
                index = n + 1;
            }
            return c.get(index);
        }
        
        public int getCount() {
            final int n = e.this.I.C().size() - e.this.K;
            if (this.G < 0) {
                return n;
            }
            return n - 1;
        }
        
        public long getItemId(final int n) {
            return n;
        }
        
        public View getView(final int n, final View view, final ViewGroup viewGroup) {
            View inflate = view;
            if (view == null) {
                final e h = e.this;
                inflate = h.H.inflate(h.M, viewGroup, false);
            }
            ((o.a)inflate).g(this.b(n), 0);
            return inflate;
        }
        
        public void notifyDataSetChanged() {
            this.a();
            super.notifyDataSetChanged();
        }
    }
}
