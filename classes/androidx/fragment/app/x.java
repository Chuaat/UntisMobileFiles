// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import java.util.Iterator;
import android.util.Log;
import android.os.Bundle;
import androidx.annotation.k0;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.s;
import android.view.ViewGroup;
import androidx.annotation.j0;
import java.util.ArrayList;
import androidx.viewpager.widget.a;

@Deprecated
public abstract class x extends a
{
    private static final String h = "FragmentStatePagerAdapt";
    private static final boolean i = false;
    @Deprecated
    public static final int j = 0;
    public static final int k = 1;
    private final FragmentManager a;
    private final int b;
    private a0 c;
    private ArrayList<Fragment.m> d;
    private ArrayList<Fragment> e;
    private Fragment f;
    private boolean g;
    
    @Deprecated
    public x(@j0 final FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }
    
    public x(@j0 final FragmentManager a, final int b) {
        this.c = null;
        this.d = new ArrayList<Fragment.m>();
        this.e = new ArrayList<Fragment>();
        this.f = null;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void destroyItem(@j0 final ViewGroup viewGroup, final int n, @j0 final Object o) {
        final Fragment fragment = (Fragment)o;
        if (this.c == null) {
            this.c = this.a.r();
        }
        while (this.d.size() <= n) {
            this.d.add(null);
        }
        final ArrayList<Fragment.m> d = this.d;
        Fragment.m i1;
        if (fragment.isAdded()) {
            i1 = this.a.I1(fragment);
        }
        else {
            i1 = null;
        }
        d.set(n, i1);
        this.e.set(n, null);
        this.c.C(fragment);
        if (fragment.equals(this.f)) {
            this.f = null;
        }
    }
    
    @Override
    public void finishUpdate(@j0 final ViewGroup viewGroup) {
        final a0 c = this.c;
        if (c != null) {
            if (!this.g) {
                try {
                    this.g = true;
                    c.u();
                }
                finally {
                    this.g = false;
                }
            }
            this.c = null;
        }
    }
    
    @j0
    public abstract Fragment getItem(final int p0);
    
    @j0
    @Override
    public Object instantiateItem(@j0 final ViewGroup viewGroup, final int index) {
        if (this.e.size() > index) {
            final Fragment fragment = this.e.get(index);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.c == null) {
            this.c = this.a.r();
        }
        final Fragment item = this.getItem(index);
        if (this.d.size() > index) {
            final Fragment.m initialSavedState = this.d.get(index);
            if (initialSavedState != null) {
                item.setInitialSavedState(initialSavedState);
            }
        }
        while (this.e.size() <= index) {
            this.e.add(null);
        }
        item.setMenuVisibility(false);
        if (this.b == 0) {
            item.setUserVisibleHint(false);
        }
        this.e.set(index, item);
        this.c.g(viewGroup.getId(), item);
        if (this.b == 1) {
            this.c.P(item, s.c.J);
        }
        return item;
    }
    
    @Override
    public boolean isViewFromObject(@j0 final View view, @j0 final Object o) {
        return ((Fragment)o).getView() == view;
    }
    
    @Override
    public void restoreState(@k0 final Parcelable parcelable, @k0 final ClassLoader classLoader) {
        if (parcelable != null) {
            final Bundle bundle = (Bundle)parcelable;
            bundle.setClassLoader(classLoader);
            final Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.d.clear();
            this.e.clear();
            if (parcelableArray != null) {
                for (int i = 0; i < parcelableArray.length; ++i) {
                    this.d.add((Fragment.m)parcelableArray[i]);
                }
            }
            for (final String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    final int int1 = Integer.parseInt(str.substring(1));
                    final Fragment c0 = this.a.C0(bundle, str);
                    if (c0 != null) {
                        while (this.e.size() <= int1) {
                            this.e.add(null);
                        }
                        c0.setMenuVisibility(false);
                        this.e.set(int1, c0);
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Bad fragment at key ");
                        sb.append(str);
                        Log.w("FragmentStatePagerAdapt", sb.toString());
                    }
                }
            }
        }
    }
    
    @k0
    @Override
    public Parcelable saveState() {
        Bundle bundle;
        if (this.d.size() > 0) {
            bundle = new Bundle();
            final Fragment.m[] a = new Fragment.m[this.d.size()];
            this.d.toArray(a);
            bundle.putParcelableArray("states", (Parcelable[])a);
        }
        else {
            bundle = null;
        }
        Bundle bundle2;
        for (int i = 0; i < this.e.size(); ++i, bundle = bundle2) {
            final Fragment fragment = this.e.get(i);
            bundle2 = bundle;
            if (fragment != null) {
                bundle2 = bundle;
                if (fragment.isAdded()) {
                    if ((bundle2 = bundle) == null) {
                        bundle2 = new Bundle();
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("f");
                    sb.append(i);
                    this.a.u1(bundle2, sb.toString(), fragment);
                }
            }
        }
        return (Parcelable)bundle;
    }
    
    @Override
    public void setPrimaryItem(@j0 final ViewGroup viewGroup, final int n, @j0 final Object o) {
        final Fragment f = (Fragment)o;
        final Fragment f2 = this.f;
        if (f != f2) {
            if (f2 != null) {
                f2.setMenuVisibility(false);
                if (this.b == 1) {
                    if (this.c == null) {
                        this.c = this.a.r();
                    }
                    this.c.P(this.f, s.c.J);
                }
                else {
                    this.f.setUserVisibleHint(false);
                }
            }
            f.setMenuVisibility(true);
            if (this.b == 1) {
                if (this.c == null) {
                    this.c = this.a.r();
                }
                this.c.P(f, s.c.K);
            }
            else {
                f.setUserVisibleHint(true);
            }
            this.f = f;
        }
    }
    
    @Override
    public void startUpdate(@j0 final ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ViewPager with adapter ");
        sb.append(this);
        sb.append(" requires a view id");
        throw new IllegalStateException(sb.toString());
    }
}
