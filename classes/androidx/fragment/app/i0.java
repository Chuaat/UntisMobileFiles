// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.annotation.i;
import java.util.HashSet;
import java.util.Collection;
import android.view.View;
import java.util.List;
import android.util.Log;
import y.a;
import androidx.annotation.k0;
import java.util.Iterator;
import androidx.core.os.c;
import androidx.annotation.j0;
import java.util.ArrayList;
import android.view.ViewGroup;

abstract class i0
{
    private final ViewGroup a;
    final ArrayList<e> b;
    final ArrayList<e> c;
    boolean d;
    boolean e;
    
    i0(@j0 final ViewGroup a) {
        this.b = new ArrayList<e>();
        this.c = new ArrayList<e>();
        this.d = false;
        this.e = false;
        this.a = a;
    }
    
    private void a(@j0 final c c, @j0 final b b, @j0 final v v) {
        synchronized (this.b) {
            final androidx.core.os.c c2 = new androidx.core.os.c();
            final e h = this.h(v.k());
            if (h != null) {
                h.k(c, b);
                return;
            }
            final d e = new d(c, b, v, c2);
            this.b.add((e)e);
            ((e)e).a(new Runnable() {
                @Override
                public void run() {
                    if (i0.this.b.contains(e)) {
                        ((e)e).e().b(((e)e).f().mView);
                    }
                }
            });
            ((e)e).a(new Runnable() {
                @Override
                public void run() {
                    i0.this.b.remove(e);
                    i0.this.c.remove(e);
                }
            });
        }
    }
    
    @k0
    private e h(@j0 final Fragment fragment) {
        for (final e e : this.b) {
            if (e.f().equals(fragment) && !e.h()) {
                return e;
            }
        }
        return null;
    }
    
    @k0
    private e i(@j0 final Fragment fragment) {
        for (final e e : this.c) {
            if (e.f().equals(fragment) && !e.h()) {
                return e;
            }
        }
        return null;
    }
    
    @j0
    static i0 n(@j0 final ViewGroup viewGroup, @j0 final FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.M0());
    }
    
    @j0
    static i0 o(@j0 final ViewGroup viewGroup, @j0 final androidx.fragment.app.j0 j0) {
        final int e0 = a.g.e0;
        final Object tag = viewGroup.getTag(e0);
        if (tag instanceof i0) {
            return (i0)tag;
        }
        final i0 a = j0.a(viewGroup);
        viewGroup.setTag(e0, (Object)a);
        return a;
    }
    
    private void q() {
        for (final e e : this.b) {
            if (e.g() == i0.e.b.H) {
                e.k(i0.e.c.d(e.f().requireView().getVisibility()), i0.e.b.G);
            }
        }
    }
    
    void b(@j0 final c c, @j0 final v v) {
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(v.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.a(c, i0.e.b.H, v);
    }
    
    void c(@j0 final v v) {
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(v.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.a(i0.e.c.I, i0.e.b.G, v);
    }
    
    void d(@j0 final v v) {
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(v.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.a(i0.e.c.G, i0.e.b.I, v);
    }
    
    void e(@j0 final v v) {
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(v.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.a(i0.e.c.H, i0.e.b.G, v);
    }
    
    abstract void f(@j0 final List<e> p0, final boolean p1);
    
    void g() {
        if (this.e) {
            return;
        }
        if (!androidx.core.view.j0.N0((View)this.a)) {
            this.j();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                final ArrayList<e> list = new ArrayList<e>(this.c);
                this.c.clear();
                for (final e e : list) {
                    if (FragmentManager.T0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Cancelling operation ");
                        sb.append(e);
                        Log.v("FragmentManager", sb.toString());
                    }
                    e.b();
                    if (!e.i()) {
                        this.c.add(e);
                    }
                }
                this.q();
                final ArrayList<e> c = new ArrayList<e>(this.b);
                this.b.clear();
                this.c.addAll(c);
                final Iterator<e> iterator2 = c.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().l();
                }
                this.f(c, this.d);
                this.d = false;
            }
        }
    }
    
    void j() {
        final boolean n0 = androidx.core.view.j0.N0((View)this.a);
        synchronized (this.b) {
            this.q();
            final Iterator<e> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                iterator.next().l();
            }
            for (final e obj : new ArrayList<e>(this.c)) {
                if (FragmentManager.T0(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    String string;
                    if (n0) {
                        string = "";
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.a);
                        sb2.append(" is not attached to window. ");
                        string = sb2.toString();
                    }
                    sb.append(string);
                    sb.append("Cancelling running operation ");
                    sb.append(obj);
                    Log.v("FragmentManager", sb.toString());
                }
                obj.b();
            }
            for (final e obj2 : new ArrayList<e>(this.b)) {
                if (FragmentManager.T0(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    String string2;
                    if (n0) {
                        string2 = "";
                    }
                    else {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Container ");
                        sb4.append(this.a);
                        sb4.append(" is not attached to window. ");
                        string2 = sb4.toString();
                    }
                    sb3.append(string2);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(obj2);
                    Log.v("FragmentManager", sb3.toString());
                }
                obj2.b();
            }
        }
    }
    
    void k() {
        if (this.e) {
            this.e = false;
            this.g();
        }
    }
    
    @k0
    b l(@j0 final v v) {
        final e h = this.h(v.k());
        Enum<b> g;
        if (h != null) {
            g = h.g();
        }
        else {
            g = null;
        }
        final e i = this.i(v.k());
        if (i != null && (g == null || g == i0.e.b.G)) {
            return i.g();
        }
        return (b)g;
    }
    
    @j0
    public ViewGroup m() {
        return this.a;
    }
    
    void p() {
        synchronized (this.b) {
            this.q();
            this.e = false;
            for (int i = this.b.size() - 1; i >= 0; --i) {
                final e e = this.b.get(i);
                final c f = i0.e.c.f(e.f().mView);
                final c e2 = e.e();
                final c h = i0.e.c.H;
                if (e2 == h && f != h) {
                    this.e = e.f().isPostponed();
                    break;
                }
            }
        }
    }
    
    void r(final boolean d) {
        this.d = d;
    }
    
    private static class d extends e
    {
        @j0
        private final v h;
        
        d(@j0 final c c, @j0 final b b, @j0 final v h, @j0 final androidx.core.os.c c2) {
            super(c, b, h.k(), c2);
            this.h = h;
        }
        
        @Override
        public void c() {
            super.c();
            this.h.m();
        }
        
        @Override
        void l() {
            if (((e)this).g() == i0.e.b.H) {
                final Fragment k = this.h.k();
                final View focus = k.mView.findFocus();
                if (focus != null) {
                    k.setFocusedView(focus);
                    if (FragmentManager.T0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(focus);
                        sb.append(" for Fragment ");
                        sb.append(k);
                        Log.v("FragmentManager", sb.toString());
                    }
                }
                final View requireView = ((e)this).f().requireView();
                if (requireView.getParent() == null) {
                    this.h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k.getPostOnViewCreatedAlpha());
            }
        }
    }
    
    static class e
    {
        @j0
        private c a;
        @j0
        private b b;
        @j0
        private final Fragment c;
        @j0
        private final List<Runnable> d;
        @j0
        private final HashSet<androidx.core.os.c> e;
        private boolean f;
        private boolean g;
        
        e(@j0 final c a, @j0 final b b, @j0 final Fragment c, @j0 final androidx.core.os.c c2) {
            this.d = new ArrayList<Runnable>();
            this.e = new HashSet<androidx.core.os.c>();
            this.f = false;
            this.g = false;
            this.a = a;
            this.b = b;
            this.c = c;
            c2.d((androidx.core.os.c.a)new androidx.core.os.c.a() {
                @Override
                public void onCancel() {
                    i0.e.this.b();
                }
            });
        }
        
        final void a(@j0 final Runnable runnable) {
            this.d.add(runnable);
        }
        
        final void b() {
            if (this.h()) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                this.c();
            }
            else {
                final Iterator<androidx.core.os.c> iterator = new ArrayList<androidx.core.os.c>(this.e).iterator();
                while (iterator.hasNext()) {
                    iterator.next().a();
                }
            }
        }
        
        @i
        public void c() {
            if (this.g) {
                return;
            }
            if (FragmentManager.T0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
                Log.v("FragmentManager", sb.toString());
            }
            this.g = true;
            final Iterator<Runnable> iterator = this.d.iterator();
            while (iterator.hasNext()) {
                iterator.next().run();
            }
        }
        
        public final void d(@j0 final androidx.core.os.c o) {
            if (this.e.remove(o) && this.e.isEmpty()) {
                this.c();
            }
        }
        
        @j0
        public c e() {
            return this.a;
        }
        
        @j0
        public final Fragment f() {
            return this.c;
        }
        
        @j0
        b g() {
            return this.b;
        }
        
        final boolean h() {
            return this.f;
        }
        
        final boolean i() {
            return this.g;
        }
        
        public final void j(@j0 final androidx.core.os.c e) {
            this.l();
            this.e.add(e);
        }
        
        final void k(@j0 final c c, @j0 final b b) {
            final int n = i0$c.b[b.ordinal()];
            b b2;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return;
                    }
                    if (this.a != i0.e.c.G) {
                        if (FragmentManager.T0(2)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: For fragment ");
                            sb.append(this.c);
                            sb.append(" mFinalState = ");
                            sb.append(this.a);
                            sb.append(" -> ");
                            sb.append(c);
                            sb.append(". ");
                            Log.v("FragmentManager", sb.toString());
                        }
                        this.a = c;
                    }
                    return;
                }
                else {
                    if (FragmentManager.T0(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: For fragment ");
                        sb2.append(this.c);
                        sb2.append(" mFinalState = ");
                        sb2.append(this.a);
                        sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb2.append(this.b);
                        sb2.append(" to REMOVING.");
                        Log.v("FragmentManager", sb2.toString());
                    }
                    this.a = i0.e.c.G;
                    b2 = i0.e.b.I;
                }
            }
            else {
                if (this.a != i0.e.c.G) {
                    return;
                }
                if (FragmentManager.T0(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.b);
                    sb3.append(" to ADDING.");
                    Log.v("FragmentManager", sb3.toString());
                }
                this.a = i0.e.c.H;
                b2 = i0.e.b.H;
            }
            this.b = b2;
        }
        
        void l() {
        }
        
        @j0
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Operation ");
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("} ");
            sb.append("{");
            sb.append("mFinalState = ");
            sb.append(this.a);
            sb.append("} ");
            sb.append("{");
            sb.append("mLifecycleImpact = ");
            sb.append(this.b);
            sb.append("} ");
            sb.append("{");
            sb.append("mFragment = ");
            sb.append(this.c);
            sb.append("}");
            return sb.toString();
        }
        
        enum b
        {
            G, 
            H, 
            I;
        }
        
        enum c
        {
            G, 
            H, 
            I, 
            J;
            
            @j0
            static c d(final int i) {
                if (i == 0) {
                    return c.H;
                }
                if (i == 4) {
                    return c.J;
                }
                if (i == 8) {
                    return c.I;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown visibility ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            
            @j0
            static c f(@j0 final View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return c.J;
                }
                return d(view.getVisibility());
            }
            
            void b(@j0 final View view) {
                final int n = i0$c.a[this.ordinal()];
                if (n != 1) {
                    int visibility;
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                return;
                            }
                            if (FragmentManager.T0(2)) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("SpecialEffectsController: Setting view ");
                                sb.append(view);
                                sb.append(" to INVISIBLE");
                                Log.v("FragmentManager", sb.toString());
                            }
                            view.setVisibility(4);
                            return;
                        }
                        else {
                            if (FragmentManager.T0(2)) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("SpecialEffectsController: Setting view ");
                                sb2.append(view);
                                sb2.append(" to GONE");
                                Log.v("FragmentManager", sb2.toString());
                            }
                            visibility = 8;
                        }
                    }
                    else {
                        if (FragmentManager.T0(2)) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("SpecialEffectsController: Setting view ");
                            sb3.append(view);
                            sb3.append(" to VISIBLE");
                            Log.v("FragmentManager", sb3.toString());
                        }
                        visibility = 0;
                    }
                    view.setVisibility(visibility);
                }
                else {
                    final ViewGroup obj = (ViewGroup)view.getParent();
                    if (obj != null) {
                        if (FragmentManager.T0(2)) {
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("SpecialEffectsController: Removing view ");
                            sb4.append(view);
                            sb4.append(" from container ");
                            sb4.append(obj);
                            Log.v("FragmentManager", sb4.toString());
                        }
                        obj.removeView(view);
                    }
                }
            }
        }
    }
}
