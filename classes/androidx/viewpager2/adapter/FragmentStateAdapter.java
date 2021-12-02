// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager2.adapter;

import androidx.viewpager2.widget.ViewPager2;
import androidx.fragment.app.a0;
import android.view.View$OnLayoutChangeListener;
import androidx.annotation.i;
import androidx.core.util.n;
import androidx.collection.c;
import android.view.ViewGroup;
import java.util.Iterator;
import android.os.Parcelable;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.v;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.View;
import androidx.fragment.app.d;
import androidx.annotation.j0;
import androidx.fragment.app.Fragment;
import androidx.collection.h;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.RecyclerView;

public abstract class FragmentStateAdapter extends h<androidx.viewpager2.adapter.a> implements b
{
    private static final String O = "f#";
    private static final String P = "s#";
    private static final long Q = 10000L;
    final androidx.lifecycle.s G;
    final FragmentManager H;
    final androidx.collection.h<Fragment> I;
    private final androidx.collection.h<Fragment.m> J;
    private final androidx.collection.h<Integer> K;
    private FragmentMaxLifecycleEnforcer L;
    boolean M;
    private boolean N;
    
    public FragmentStateAdapter(@j0 final Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }
    
    public FragmentStateAdapter(@j0 final FragmentManager h, @j0 final androidx.lifecycle.s g) {
        this.I = new androidx.collection.h<Fragment>();
        this.J = new androidx.collection.h<Fragment.m>();
        this.K = new androidx.collection.h<Integer>();
        this.M = false;
        this.N = false;
        this.H = h;
        this.G = g;
        super.setHasStableIds(true);
    }
    
    public FragmentStateAdapter(@j0 final androidx.fragment.app.d d) {
        this(d.getSupportFragmentManager(), d.getLifecycle());
    }
    
    @j0
    private static String k(@j0 final String str, final long lng) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(lng);
        return sb.toString();
    }
    
    private void l(final int n) {
        final long itemId = this.getItemId(n);
        if (!this.I.d(itemId)) {
            final Fragment j = this.j(n);
            j.setInitialSavedState((Fragment.m)this.J.j(itemId));
            this.I.s(itemId, j);
        }
    }
    
    private boolean n(final long n) {
        final boolean d = this.K.d(n);
        boolean b = true;
        if (d) {
            return true;
        }
        final Fragment fragment = this.I.j(n);
        if (fragment == null) {
            return false;
        }
        final View view = fragment.getView();
        if (view == null) {
            return false;
        }
        if (view.getParent() == null) {
            b = false;
        }
        return b;
    }
    
    private static boolean o(@j0 final String s, @j0 final String prefix) {
        return s.startsWith(prefix) && s.length() > prefix.length();
    }
    
    private Long p(final int n) {
        Long n2 = null;
        Long value;
        for (int i = 0; i < this.K.B(); ++i, n2 = value) {
            value = n2;
            if (this.K.C(i) == n) {
                if (n2 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                value = this.K.r(i);
            }
        }
        return n2;
    }
    
    private static long v(@j0 final String s, @j0 final String s2) {
        return Long.parseLong(s.substring(s2.length()));
    }
    
    private void x(final long n) {
        final Fragment fragment = this.I.j(n);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null) {
            final ViewParent parent = fragment.getView().getParent();
            if (parent != null) {
                ((FrameLayout)parent).removeAllViews();
            }
        }
        if (!this.i(n)) {
            this.J.v(n);
        }
        if (!fragment.isAdded()) {
            this.I.v(n);
            return;
        }
        if (this.A()) {
            this.N = true;
            return;
        }
        if (fragment.isAdded() && this.i(n)) {
            this.J.s(n, this.H.I1(fragment));
        }
        this.H.r().C(fragment).t();
        this.I.v(n);
    }
    
    private void y() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                final FragmentStateAdapter g = FragmentStateAdapter.this;
                g.M = false;
                g.m();
            }
        };
        this.G.a(new androidx.lifecycle.v() {
            @Override
            public void h(@j0 final androidx.lifecycle.y y, @j0 final androidx.lifecycle.s.b b) {
                if (b == androidx.lifecycle.s.b.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    y.getLifecycle().c(this);
                }
            }
        });
        handler.postDelayed((Runnable)runnable, 10000L);
    }
    
    private void z(final Fragment fragment, @j0 final FrameLayout frameLayout) {
        this.H.v1((FragmentManager.m)new FragmentManager.m() {
            @Override
            public void m(@j0 final FragmentManager fragmentManager, @j0 final Fragment fragment, @j0 final View view, @k0 final Bundle bundle) {
                if (fragment == fragment) {
                    fragmentManager.T1((FragmentManager.m)this);
                    FragmentStateAdapter.this.h(view, frameLayout);
                }
            }
        }, false);
    }
    
    boolean A() {
        return this.H.Y0();
    }
    
    @j0
    @Override
    public final Parcelable a() {
        final Bundle bundle = new Bundle(this.I.B() + this.J.B());
        final int n = 0;
        int n2 = 0;
        int i;
        while (true) {
            i = n;
            if (n2 >= this.I.B()) {
                break;
            }
            final long r = this.I.r(n2);
            final Fragment fragment = this.I.j(r);
            if (fragment != null && fragment.isAdded()) {
                this.H.u1(bundle, k("f#", r), fragment);
            }
            ++n2;
        }
        while (i < this.J.B()) {
            final long r2 = this.J.r(i);
            if (this.i(r2)) {
                bundle.putParcelable(k("s#", r2), (Parcelable)this.J.j(r2));
            }
            ++i;
        }
        return (Parcelable)bundle;
    }
    
    @Override
    public final void c(@j0 final Parcelable parcelable) {
        if (this.J.q() && this.I.q()) {
            final Bundle bundle = (Bundle)parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(this.getClass().getClassLoader());
            }
            for (final String str : bundle.keySet()) {
                long n;
                Object c0;
                Cloneable cloneable;
                if (o(str, "f#")) {
                    n = v(str, "f#");
                    c0 = this.H.C0(bundle, str);
                    cloneable = this.I;
                }
                else {
                    if (!o(str, "s#")) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected key in savedState: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    n = v(str, "s#");
                    c0 = bundle.getParcelable(str);
                    if (!this.i(n)) {
                        continue;
                    }
                    cloneable = this.J;
                }
                ((androidx.collection.h<Fragment>)cloneable).s(n, (Fragment)c0);
            }
            if (!this.I.q()) {
                this.N = true;
                this.M = true;
                this.m();
                this.y();
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }
    
    @Override
    public long getItemId(final int n) {
        return n;
    }
    
    void h(@j0 final View view, @j0 final FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup)view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }
    
    public boolean i(final long n) {
        return n >= 0L && n < ((RecyclerView.h)this).getItemCount();
    }
    
    @j0
    public abstract Fragment j(final int p0);
    
    void m() {
        if (this.N) {
            if (!this.A()) {
                final c<Long> c = new c<Long>();
                final int n = 0;
                for (int i = 0; i < this.I.B(); ++i) {
                    final long r = this.I.r(i);
                    if (!this.i(r)) {
                        c.add(r);
                        this.K.v(r);
                    }
                }
                if (!this.M) {
                    this.N = false;
                    for (int j = n; j < this.I.B(); ++j) {
                        final long r2 = this.I.r(j);
                        if (!this.n(r2)) {
                            c.add(r2);
                        }
                    }
                }
                final Iterator<Object> iterator = c.iterator();
                while (iterator.hasNext()) {
                    this.x(iterator.next());
                }
            }
        }
    }
    
    @androidx.annotation.i
    @Override
    public void onAttachedToRecyclerView(@j0 final RecyclerView recyclerView) {
        androidx.core.util.n.a(this.L == null);
        (this.L = new FragmentMaxLifecycleEnforcer()).b(recyclerView);
    }
    
    @androidx.annotation.i
    @Override
    public void onDetachedFromRecyclerView(@j0 final RecyclerView recyclerView) {
        this.L.c(recyclerView);
        this.L = null;
    }
    
    public final void q(@j0 final androidx.viewpager2.adapter.a a, final int n) {
        final long itemId = ((RecyclerView.g0)a).getItemId();
        final int id = a.b().getId();
        final Long p2 = this.p(id);
        if (p2 != null && p2 != itemId) {
            this.x(p2);
            this.K.v(p2);
        }
        this.K.s(itemId, id);
        this.l(n);
        final FrameLayout b = a.b();
        if (androidx.core.view.j0.N0((View)b)) {
            if (b.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            b.addOnLayoutChangeListener((View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
                public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
                    if (b.getParent() != null) {
                        b.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                        FragmentStateAdapter.this.w(a);
                    }
                }
            });
        }
        this.m();
    }
    
    @j0
    public final androidx.viewpager2.adapter.a r(@j0 final ViewGroup viewGroup, final int n) {
        return androidx.viewpager2.adapter.a.a(viewGroup);
    }
    
    public final boolean s(@j0 final androidx.viewpager2.adapter.a a) {
        return true;
    }
    
    @Override
    public final void setHasStableIds(final boolean b) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
    
    public final void t(@j0 final androidx.viewpager2.adapter.a a) {
        this.w(a);
        this.m();
    }
    
    public final void u(@j0 final androidx.viewpager2.adapter.a a) {
        final Long p = this.p(a.b().getId());
        if (p != null) {
            this.x(p);
            this.K.v(p);
        }
    }
    
    void w(@j0 final androidx.viewpager2.adapter.a a) {
        final Fragment fragment = this.I.j(((RecyclerView.g0)a).getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        final FrameLayout b = a.b();
        final View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            this.z(fragment, b);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != b) {
                this.h(view, b);
            }
            return;
        }
        if (fragment.isAdded()) {
            this.h(view, b);
            return;
        }
        if (!this.A()) {
            this.z(fragment, b);
            final androidx.fragment.app.a0 r = this.H.r();
            final StringBuilder sb = new StringBuilder();
            sb.append("f");
            sb.append(((RecyclerView.g0)a).getItemId());
            r.l(fragment, sb.toString()).P(fragment, androidx.lifecycle.s.c.J).t();
            this.L.d(false);
        }
        else {
            if (this.H.S0()) {
                return;
            }
            this.G.a(new androidx.lifecycle.v() {
                @Override
                public void h(@j0 final androidx.lifecycle.y y, @j0 final androidx.lifecycle.s.b b) {
                    if (FragmentStateAdapter.this.A()) {
                        return;
                    }
                    y.getLifecycle().c(this);
                    if (androidx.core.view.j0.N0((View)a.b())) {
                        FragmentStateAdapter.this.w(a);
                    }
                }
            });
        }
    }
    
    class FragmentMaxLifecycleEnforcer
    {
        private ViewPager2.j a;
        private j b;
        private androidx.lifecycle.v c;
        private ViewPager2 d;
        private long e;
        
        FragmentMaxLifecycleEnforcer() {
            this.e = -1L;
        }
        
        @j0
        private ViewPager2 a(@j0 final RecyclerView recyclerView) {
            final ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2)parent;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected ViewPager2 instance. Got: ");
            sb.append(parent);
            throw new IllegalStateException(sb.toString());
        }
        
        void b(@j0 final RecyclerView recyclerView) {
            this.d = this.a(recyclerView);
            final ViewPager2.j a = new ViewPager2.j() {
                @Override
                public void a(final int n) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
                
                @Override
                public void c(final int n) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.a = a;
            this.d.n((ViewPager2.j)a);
            final d b = new d() {
                @Override
                public void a() {
                    FragmentMaxLifecycleEnforcer.this.d(true);
                }
            };
            this.b = b;
            ((RecyclerView.h)FragmentStateAdapter.this).registerAdapterDataObserver(b);
            final androidx.lifecycle.v c = new androidx.lifecycle.v() {
                @Override
                public void h(@j0 final androidx.lifecycle.y y, @j0 final androidx.lifecycle.s.b b) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.c = c;
            FragmentStateAdapter.this.G.a(c);
        }
        
        void c(@j0 final RecyclerView recyclerView) {
            this.a(recyclerView).x(this.a);
            ((RecyclerView.h)FragmentStateAdapter.this).unregisterAdapterDataObserver(this.b);
            FragmentStateAdapter.this.G.c(this.c);
            this.d = null;
        }
        
        void d(final boolean b) {
            if (FragmentStateAdapter.this.A()) {
                return;
            }
            if (this.d.getScrollState() != 0) {
                return;
            }
            if (!FragmentStateAdapter.this.I.q()) {
                if (((RecyclerView.h)FragmentStateAdapter.this).getItemCount() != 0) {
                    final int currentItem = this.d.getCurrentItem();
                    if (currentItem >= ((RecyclerView.h)FragmentStateAdapter.this).getItemCount()) {
                        return;
                    }
                    final long itemId = FragmentStateAdapter.this.getItemId(currentItem);
                    if (itemId == this.e && !b) {
                        return;
                    }
                    final Fragment fragment = FragmentStateAdapter.this.I.j(itemId);
                    if (fragment != null) {
                        if (fragment.isAdded()) {
                            this.e = itemId;
                            final androidx.fragment.app.a0 r = FragmentStateAdapter.this.H.r();
                            Fragment fragment2 = null;
                            for (int i = 0; i < FragmentStateAdapter.this.I.B(); ++i) {
                                final long r2 = FragmentStateAdapter.this.I.r(i);
                                final Fragment fragment3 = FragmentStateAdapter.this.I.C(i);
                                if (fragment3.isAdded()) {
                                    if (r2 != this.e) {
                                        r.P(fragment3, androidx.lifecycle.s.c.J);
                                    }
                                    else {
                                        fragment2 = fragment3;
                                    }
                                    fragment3.setMenuVisibility(r2 == this.e);
                                }
                            }
                            if (fragment2 != null) {
                                r.P(fragment2, androidx.lifecycle.s.c.K);
                            }
                            if (!r.B()) {
                                r.t();
                            }
                        }
                    }
                }
            }
        }
    }
    
    private abstract static class d extends j
    {
        @Override
        public abstract void a();
        
        @Override
        public final void b(final int n, final int n2) {
            this.a();
        }
        
        @Override
        public final void c(final int n, final int n2, @k0 final Object o) {
            this.a();
        }
        
        @Override
        public final void d(final int n, final int n2) {
            this.a();
        }
        
        @Override
        public final void e(final int n, final int n2, final int n3) {
            this.a();
        }
        
        @Override
        public final void f(final int n, final int n2) {
            this.a();
        }
    }
}
