// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.core.view.i;
import android.view.KeyEvent;
import android.os.Parcelable;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.Rect;
import androidx.annotation.k0;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.HeaderViewListAdapter;
import android.widget.AdapterView$OnItemClickListener;
import android.util.AttributeSet;
import androidx.appcompat.widget.h0;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.annotation.x0;
import androidx.annotation.f;
import androidx.annotation.j0;
import c.a;
import android.view.ViewTreeObserver;
import android.view.View;
import androidx.appcompat.widget.g0;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.List;
import android.os.Handler;
import android.content.Context;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnKeyListener;

final class d extends l implements n, View$OnKeyListener, PopupWindow$OnDismissListener
{
    private static final int h0;
    static final int i0 = 0;
    static final int j0 = 1;
    static final int k0 = 200;
    private final Context H;
    private final int I;
    private final int J;
    private final int K;
    private final boolean L;
    final Handler M;
    private final List<g> N;
    final List<d> O;
    final ViewTreeObserver$OnGlobalLayoutListener P;
    private final View$OnAttachStateChangeListener Q;
    private final g0 R;
    private int S;
    private int T;
    private View U;
    View V;
    private int W;
    private boolean X;
    private boolean Y;
    private int Z;
    private int a0;
    private boolean b0;
    private boolean c0;
    private a d0;
    ViewTreeObserver e0;
    private PopupWindow$OnDismissListener f0;
    boolean g0;
    
    static {
        h0 = c.a.k.l;
    }
    
    public d(@j0 final Context h, @j0 final View u, @f final int j, @x0 final int k, final boolean l) {
        this.N = new ArrayList<g>();
        this.O = new ArrayList<d>();
        this.P = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (d.this.c() && d.this.O.size() > 0 && !((d)d.this.O.get(0)).a.L()) {
                    final View v = d.this.V;
                    if (v != null && v.isShown()) {
                        final Iterator<d> iterator = d.this.O.iterator();
                        while (iterator.hasNext()) {
                            ((d)iterator.next()).a.a();
                        }
                    }
                    else {
                        d.this.dismiss();
                    }
                }
            }
        };
        this.Q = (View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View view) {
            }
            
            public void onViewDetachedFromWindow(final View view) {
                final ViewTreeObserver e0 = d.this.e0;
                if (e0 != null) {
                    if (!e0.isAlive()) {
                        d.this.e0 = view.getViewTreeObserver();
                    }
                    final d g = d.this;
                    g.e0.removeGlobalOnLayoutListener(g.P);
                }
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
        };
        this.R = new g0() {
            @Override
            public void e(@j0 final g g, @j0 final MenuItem menuItem) {
                final Handler m = d.this.M;
                d d = null;
                m.removeCallbacksAndMessages((Object)null);
                final int size = androidx.appcompat.view.menu.d.this.O.size();
                int i = 0;
                while (true) {
                    while (i < size) {
                        if (g == ((d)androidx.appcompat.view.menu.d.this.O.get(i)).b) {
                            if (i == -1) {
                                return;
                            }
                            if (++i < androidx.appcompat.view.menu.d.this.O.size()) {
                                d = (d)androidx.appcompat.view.menu.d.this.O.get(i);
                            }
                            androidx.appcompat.view.menu.d.this.M.postAtTime((Runnable)new Runnable() {
                                @Override
                                public void run() {
                                    final d g = d;
                                    if (g != null) {
                                        d.this.g0 = true;
                                        g.b.f(false);
                                        d.this.g0 = false;
                                    }
                                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                                        g.O(menuItem, 4);
                                    }
                                }
                            }, (Object)g, SystemClock.uptimeMillis() + 200L);
                            return;
                        }
                        else {
                            ++i;
                        }
                    }
                    i = -1;
                    continue;
                }
            }
            
            @Override
            public void h(@j0 final g g, @j0 final MenuItem menuItem) {
                d.this.M.removeCallbacksAndMessages((Object)g);
            }
        };
        this.S = 0;
        this.T = 0;
        this.H = h;
        this.U = u;
        this.J = j;
        this.K = k;
        this.L = l;
        this.b0 = false;
        this.W = this.H();
        final Resources resources = h.getResources();
        this.I = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.a.f.x));
        this.M = new Handler();
    }
    
    private h0 D() {
        final h0 h0 = new h0(this.H, null, this.J, this.K);
        h0.r0(this.R);
        h0.f0((AdapterView$OnItemClickListener)this);
        h0.e0((PopupWindow$OnDismissListener)this);
        h0.S(this.U);
        h0.W(this.T);
        h0.d0(true);
        h0.a0(2);
        return h0;
    }
    
    private int E(@j0 final g g) {
        for (int size = this.O.size(), i = 0; i < size; ++i) {
            if (g == this.O.get(i).b) {
                return i;
            }
        }
        return -1;
    }
    
    private MenuItem F(@j0 final g g, @j0 final g g2) {
        for (int size = g.size(), i = 0; i < size; ++i) {
            final MenuItem item = g.getItem(i);
            if (item.hasSubMenu() && g2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }
    
    @k0
    private View G(@j0 final d d, @j0 final g g) {
        final MenuItem f = this.F(d.b, g);
        if (f == null) {
            return null;
        }
        final ListView a = d.a();
        final ListAdapter adapter = a.getAdapter();
        final boolean b = adapter instanceof HeaderViewListAdapter;
        int i = 0;
        int headersCount;
        androidx.appcompat.view.menu.f f2;
        if (b) {
            final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            f2 = (androidx.appcompat.view.menu.f)headerViewListAdapter.getWrappedAdapter();
        }
        else {
            f2 = (androidx.appcompat.view.menu.f)adapter;
            headersCount = 0;
        }
        while (true) {
            while (i < f2.getCount()) {
                if (f == f2.d(i)) {
                    if (i == -1) {
                        return null;
                    }
                    final int n = i + headersCount - a.getFirstVisiblePosition();
                    if (n >= 0 && n < a.getChildCount()) {
                        return a.getChildAt(n);
                    }
                    return null;
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    private int H() {
        final int x = androidx.core.view.j0.X(this.U);
        int n = 1;
        if (x == 1) {
            n = 0;
        }
        return n;
    }
    
    private int I(final int n) {
        final List<d> o = this.O;
        final ListView a = o.get(o.size() - 1).a();
        final int[] array = new int[2];
        a.getLocationOnScreen(array);
        final Rect rect = new Rect();
        this.V.getWindowVisibleDisplayFrame(rect);
        if (this.W == 1) {
            if (array[0] + a.getWidth() + n > rect.right) {
                return 0;
            }
            return 1;
        }
        else {
            if (array[0] - n < 0) {
                return 1;
            }
            return 0;
        }
    }
    
    private void J(@j0 final g g) {
        final LayoutInflater from = LayoutInflater.from(this.H);
        final androidx.appcompat.view.menu.f f = new androidx.appcompat.view.menu.f(g, from, this.L, d.h0);
        if (!this.c() && this.b0) {
            f.e(true);
        }
        else if (this.c()) {
            f.e(l.B(g));
        }
        int n = l.s((ListAdapter)f, null, this.H, this.I);
        final h0 d = this.D();
        d.q((ListAdapter)f);
        d.U(n);
        d.W(this.T);
        Object o2;
        View g2;
        if (this.O.size() > 0) {
            final List<d> o = this.O;
            o2 = o.get(o.size() - 1);
            g2 = this.G((d)o2, g);
        }
        else {
            o2 = (g2 = null);
        }
        if (g2 != null) {
            d.s0(false);
            d.p0(null);
            final int i = this.I(n);
            final boolean b = i == 1;
            this.W = i;
            int n2;
            int n3;
            if (Build$VERSION.SDK_INT >= 26) {
                d.S(g2);
                n2 = 0;
                n3 = 0;
            }
            else {
                final int[] array = new int[2];
                this.U.getLocationOnScreen(array);
                final int[] array2 = new int[2];
                g2.getLocationOnScreen(array2);
                if ((this.T & 0x7) == 0x5) {
                    array[0] += this.U.getWidth();
                    array2[0] += g2.getWidth();
                }
                n3 = array2[0] - array[0];
                n2 = array2[1] - array[1];
            }
            int n4 = 0;
            Label_0372: {
                Label_0365: {
                    if ((this.T & 0x5) == 0x5) {
                        if (!b) {
                            n = g2.getWidth();
                            break Label_0365;
                        }
                    }
                    else {
                        if (!b) {
                            break Label_0365;
                        }
                        n = g2.getWidth();
                    }
                    n4 = n3 + n;
                    break Label_0372;
                }
                n4 = n3 - n;
            }
            d.f(n4);
            d.h0(true);
            d.k(n2);
        }
        else {
            if (this.X) {
                d.f(this.Z);
            }
            if (this.Y) {
                d.k(this.a0);
            }
            d.X(this.r());
        }
        this.O.add(new d(d, g, this.W));
        d.a();
        final ListView l = d.l();
        l.setOnKeyListener((View$OnKeyListener)this);
        if (o2 == null && this.c0 && g.A() != null) {
            final FrameLayout frameLayout = (FrameLayout)from.inflate(c.a.k.s, (ViewGroup)l, false);
            final TextView textView = (TextView)frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(g.A());
            l.addHeaderView((View)frameLayout, (Object)null, false);
            d.a();
        }
    }
    
    @Override
    public void A(final int a0) {
        this.Y = true;
        this.a0 = a0;
    }
    
    public void a() {
        if (this.c()) {
            return;
        }
        final Iterator<g> iterator = this.N.iterator();
        while (iterator.hasNext()) {
            this.J(iterator.next());
        }
        this.N.clear();
        final View u = this.U;
        if ((this.V = u) != null) {
            final boolean b = this.e0 == null;
            final ViewTreeObserver viewTreeObserver = u.getViewTreeObserver();
            this.e0 = viewTreeObserver;
            if (b) {
                viewTreeObserver.addOnGlobalLayoutListener(this.P);
            }
            this.V.addOnAttachStateChangeListener(this.Q);
        }
    }
    
    public boolean c() {
        final int size = this.O.size();
        boolean b = false;
        if (size > 0) {
            b = b;
            if (this.O.get(0).a.c()) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public void d(final g g, final boolean b) {
        final int e = this.E(g);
        if (e < 0) {
            return;
        }
        final int n = e + 1;
        if (n < this.O.size()) {
            this.O.get(n).b.f(false);
        }
        final d d = this.O.remove(e);
        d.b.S(this);
        if (this.g0) {
            d.a.q0(null);
            d.a.T(0);
        }
        d.a.dismiss();
        final int size = this.O.size();
        int w;
        if (size > 0) {
            w = this.O.get(size - 1).c;
        }
        else {
            w = this.H();
        }
        this.W = w;
        if (size == 0) {
            this.dismiss();
            final a d2 = this.d0;
            if (d2 != null) {
                d2.d(g, true);
            }
            final ViewTreeObserver e2 = this.e0;
            if (e2 != null) {
                if (e2.isAlive()) {
                    this.e0.removeGlobalOnLayoutListener(this.P);
                }
                this.e0 = null;
            }
            this.V.removeOnAttachStateChangeListener(this.Q);
            this.f0.onDismiss();
        }
        else if (b) {
            this.O.get(0).b.f(false);
        }
    }
    
    public void dismiss() {
        int i = this.O.size();
        if (i > 0) {
            final d[] array = this.O.toArray(new d[i]);
            --i;
            while (i >= 0) {
                final d d = array[i];
                if (d.a.c()) {
                    d.a.dismiss();
                }
                --i;
            }
        }
    }
    
    @Override
    public void e(final boolean b) {
        final Iterator<d> iterator = this.O.iterator();
        while (iterator.hasNext()) {
            l.C(iterator.next().a().getAdapter()).notifyDataSetChanged();
        }
    }
    
    @Override
    public boolean f() {
        return false;
    }
    
    @Override
    public void i(final a d0) {
        this.d0 = d0;
    }
    
    @Override
    public void k(final Parcelable parcelable) {
    }
    
    public ListView l() {
        ListView a;
        if (this.O.isEmpty()) {
            a = null;
        }
        else {
            final List<d> o = this.O;
            a = o.get(o.size() - 1).a();
        }
        return a;
    }
    
    @Override
    public boolean m(final s s) {
        for (final d d : this.O) {
            if (s == d.b) {
                d.a().requestFocus();
                return true;
            }
        }
        if (s.hasVisibleItems()) {
            this.p(s);
            final a d2 = this.d0;
            if (d2 != null) {
                d2.e(s);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public Parcelable o() {
        return null;
    }
    
    public void onDismiss() {
        while (true) {
            for (int size = this.O.size(), i = 0; i < size; ++i) {
                final d d = this.O.get(i);
                if (!d.a.c()) {
                    if (d != null) {
                        d.b.f(false);
                    }
                    return;
                }
            }
            final d d = null;
            continue;
        }
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }
    
    @Override
    public void p(final g g) {
        g.c(this, this.H);
        if (this.c()) {
            this.J(g);
        }
        else {
            this.N.add(g);
        }
    }
    
    @Override
    protected boolean q() {
        return false;
    }
    
    @Override
    public void t(@j0 final View u) {
        if (this.U != u) {
            this.U = u;
            this.T = i.d(this.S, androidx.core.view.j0.X(u));
        }
    }
    
    @Override
    public void v(final boolean b0) {
        this.b0 = b0;
    }
    
    @Override
    public void w(final int s) {
        if (this.S != s) {
            this.S = s;
            this.T = i.d(s, androidx.core.view.j0.X(this.U));
        }
    }
    
    @Override
    public void x(final int z) {
        this.X = true;
        this.Z = z;
    }
    
    @Override
    public void y(final PopupWindow$OnDismissListener f0) {
        this.f0 = f0;
    }
    
    @Override
    public void z(final boolean c0) {
        this.c0 = c0;
    }
    
    private static class d
    {
        public final h0 a;
        public final g b;
        public final int c;
        
        public d(@j0 final h0 a, @j0 final g b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public ListView a() {
            return this.a.l();
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }
}
