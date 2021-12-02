// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.recyclerview.widget.k;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import androidx.appcompat.content.res.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.j0;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Handler;
import java.util.List;
import androidx.annotation.t0;
import androidx.recyclerview.widget.RecyclerView;

@t0({ androidx.annotation.t0.a.I })
public class i extends h<androidx.preference.n> implements Preference.c, PreferenceGroup.c
{
    private PreferenceGroup G;
    private List<Preference> H;
    private List<Preference> I;
    private List<d> J;
    private Handler K;
    private Runnable L;
    
    public i(PreferenceGroup g) {
        this.L = new Runnable() {
            @Override
            public void run() {
                i.this.o();
            }
        };
        this.G = g;
        this.K = new Handler();
        this.G.D1((Preference.c)this);
        this.H = new ArrayList<Preference>();
        this.I = new ArrayList<Preference>();
        this.J = new ArrayList<d>();
        g = this.G;
        ((RecyclerView.h)this).setHasStableIds(!(g instanceof PreferenceScreen) || ((PreferenceScreen)g).I2());
        this.o();
    }
    
    private c h(final PreferenceGroup preferenceGroup, final List<Preference> list) {
        final c c = new c(preferenceGroup.l(), list, preferenceGroup.v());
        c.J1((Preference.e)new e() {
            @Override
            public boolean a(final Preference preference) {
                preferenceGroup.D2(Integer.MAX_VALUE);
                i.this.b(preference);
                final PreferenceGroup.b n2 = preferenceGroup.n2();
                if (n2 != null) {
                    n2.a();
                }
                return true;
            }
        });
        return c;
    }
    
    private List<Preference> i(final PreferenceGroup preferenceGroup) {
        final ArrayList<Preference> list = new ArrayList<Preference>();
        final ArrayList<c> list2 = new ArrayList<c>();
        final int r2 = preferenceGroup.r2();
        int i = 0;
        int n = 0;
        while (i < r2) {
            final Preference o2 = preferenceGroup.o2(i);
            if (o2.x0()) {
                if (this.l(preferenceGroup) && n >= preferenceGroup.m2()) {
                    list2.add((c)o2);
                }
                else {
                    list.add(o2);
                }
                if (!(o2 instanceof PreferenceGroup)) {
                    ++n;
                }
                else {
                    final PreferenceGroup preferenceGroup2 = (PreferenceGroup)o2;
                    if (preferenceGroup2.t2()) {
                        if (this.l(preferenceGroup) && this.l(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        final Iterator<Preference> iterator = this.i(preferenceGroup2).iterator();
                        int n2 = n;
                        while (true) {
                            n = n2;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final Preference preference = iterator.next();
                            if (this.l(preferenceGroup) && n2 >= preferenceGroup.m2()) {
                                list2.add((c)preference);
                            }
                            else {
                                list.add(preference);
                            }
                            ++n2;
                        }
                    }
                }
            }
            ++i;
        }
        if (this.l(preferenceGroup) && n > preferenceGroup.m2()) {
            list.add(this.h(preferenceGroup, (List<Preference>)list2));
        }
        return list;
    }
    
    private void j(final List<Preference> list, final PreferenceGroup preferenceGroup) {
        preferenceGroup.G2();
        for (int r2 = preferenceGroup.r2(), i = 0; i < r2; ++i) {
            final Preference o2 = preferenceGroup.o2(i);
            list.add(o2);
            final d d = new d(o2);
            if (!this.J.contains(d)) {
                this.J.add(d);
            }
            if (o2 instanceof PreferenceGroup) {
                final PreferenceGroup preferenceGroup2 = (PreferenceGroup)o2;
                if (preferenceGroup2.t2()) {
                    this.j(list, preferenceGroup2);
                }
            }
            o2.D1((Preference.c)this);
        }
    }
    
    private boolean l(final PreferenceGroup preferenceGroup) {
        return preferenceGroup.m2() != Integer.MAX_VALUE;
    }
    
    @Override
    public void b(final Preference preference) {
        this.K.removeCallbacks(this.L);
        this.K.post(this.L);
    }
    
    @Override
    public void d(final Preference preference) {
        this.b(preference);
    }
    
    @Override
    public int e(final Preference obj) {
        for (int size = this.I.size(), i = 0; i < size; ++i) {
            final Preference preference = this.I.get(i);
            if (preference != null && preference.equals(obj)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public void f(final Preference preference) {
        final int index = this.I.indexOf(preference);
        if (index != -1) {
            ((RecyclerView.h)this).notifyItemChanged(index, preference);
        }
    }
    
    @Override
    public int g(final String s) {
        for (int size = this.I.size(), i = 0; i < size; ++i) {
            if (TextUtils.equals((CharSequence)s, (CharSequence)this.I.get(i).z())) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public int getItemCount() {
        return this.I.size();
    }
    
    @Override
    public long getItemId(final int n) {
        if (!((RecyclerView.h)this).hasStableIds()) {
            return -1L;
        }
        return this.k(n).v();
    }
    
    @Override
    public int getItemViewType(int n) {
        final d d = new d(this.k(n));
        n = this.J.indexOf(d);
        if (n != -1) {
            return n;
        }
        n = this.J.size();
        this.J.add(d);
        return n;
    }
    
    public Preference k(final int n) {
        if (n >= 0 && n < this.getItemCount()) {
            return this.I.get(n);
        }
        return null;
    }
    
    public void m(@j0 final androidx.preference.n n, final int n2) {
        this.k(n2).G0(n);
    }
    
    @j0
    public androidx.preference.n n(@j0 final ViewGroup viewGroup, int b) {
        final d d = this.J.get(b);
        final LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        final TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet)null, androidx.preference.o.m.D3);
        Drawable drawable;
        if ((drawable = obtainStyledAttributes.getDrawable(androidx.preference.o.m.E3)) == null) {
            drawable = androidx.appcompat.content.res.a.d(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        final View inflate = from.inflate(d.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            androidx.core.view.j0.G1(inflate, drawable);
        }
        final ViewGroup viewGroup2 = (ViewGroup)inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            b = d.b;
            if (b != 0) {
                from.inflate(b, viewGroup2);
            }
            else {
                viewGroup2.setVisibility(8);
            }
        }
        return new androidx.preference.n(inflate);
    }
    
    void o() {
        final Iterator<Preference> iterator = this.H.iterator();
        while (iterator.hasNext()) {
            iterator.next().D1(null);
        }
        this.j(this.H = new ArrayList<Preference>(this.H.size()), this.G);
        final List<Preference> i = this.I;
        final List<Preference> j = this.i(this.G);
        this.I = j;
        final androidx.preference.l v = this.G.V();
        if (v != null && v.l() != null) {
            androidx.recyclerview.widget.k.b((androidx.recyclerview.widget.k.b)new androidx.recyclerview.widget.k.b() {
                final /* synthetic */ androidx.preference.l.d c = v.l();
                
                @Override
                public boolean a(final int n, final int n2) {
                    return this.c.a(i.get(n), j.get(n2));
                }
                
                @Override
                public boolean b(final int n, final int n2) {
                    return this.c.b(i.get(n), j.get(n2));
                }
                
                @Override
                public int d() {
                    return j.size();
                }
                
                @Override
                public int e() {
                    return i.size();
                }
            }).e(this);
        }
        else {
            ((RecyclerView.h)this).notifyDataSetChanged();
        }
        final Iterator<Preference> iterator2 = this.H.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().f();
        }
    }
    
    private static class d
    {
        int a;
        int b;
        String c;
        
        d(final Preference preference) {
            this.c = preference.getClass().getName();
            this.a = preference.A();
            this.b = preference.l0();
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof d;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final d d = (d)o;
            boolean b3 = b2;
            if (this.a == d.a) {
                b3 = b2;
                if (this.b == d.b) {
                    b3 = b2;
                    if (TextUtils.equals((CharSequence)this.c, (CharSequence)d.c)) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            return ((527 + this.a) * 31 + this.b) * 31 + this.c.hashCode();
        }
    }
}
