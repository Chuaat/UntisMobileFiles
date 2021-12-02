// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.k0;
import androidx.core.view.accessibility.e;
import java.util.WeakHashMap;
import java.util.Map;
import android.os.Bundle;
import androidx.core.view.accessibility.d;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import androidx.annotation.j0;
import androidx.core.view.a;

public class b0 extends androidx.core.view.a
{
    final RecyclerView d;
    private final a e;
    
    public b0(@j0 final RecyclerView d) {
        this.d = d;
        final androidx.core.view.a n = this.n();
        a e;
        if (n != null && n instanceof a) {
            e = (a)n;
        }
        else {
            e = new a(this);
        }
        this.e = e;
    }
    
    @Override
    public void f(final View view, final AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (view instanceof RecyclerView && !this.o()) {
            final RecyclerView recyclerView = (RecyclerView)view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().b1(accessibilityEvent);
            }
        }
    }
    
    @Override
    public void g(final View view, final d d) {
        super.g(view, d);
        if (!this.o() && this.d.getLayoutManager() != null) {
            this.d.getLayoutManager().d1(d);
        }
    }
    
    @Override
    public boolean j(final View view, final int n, final Bundle bundle) {
        return super.j(view, n, bundle) || (!this.o() && this.d.getLayoutManager() != null && this.d.getLayoutManager().x1(n, bundle));
    }
    
    @j0
    public androidx.core.view.a n() {
        return this.e;
    }
    
    boolean o() {
        return this.d.D0();
    }
    
    public static class a extends androidx.core.view.a
    {
        final b0 d;
        private Map<View, androidx.core.view.a> e;
        
        public a(@j0 final b0 d) {
            this.e = new WeakHashMap<View, androidx.core.view.a>();
            this.d = d;
        }
        
        @Override
        public boolean a(@j0 final View view, @j0 final AccessibilityEvent accessibilityEvent) {
            final androidx.core.view.a a = this.e.get(view);
            if (a != null) {
                return a.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }
        
        @k0
        @Override
        public e b(@j0 final View view) {
            final androidx.core.view.a a = this.e.get(view);
            if (a != null) {
                return a.b(view);
            }
            return super.b(view);
        }
        
        @Override
        public void f(@j0 final View view, @j0 final AccessibilityEvent accessibilityEvent) {
            final androidx.core.view.a a = this.e.get(view);
            if (a != null) {
                a.f(view, accessibilityEvent);
            }
            else {
                super.f(view, accessibilityEvent);
            }
        }
        
        @Override
        public void g(final View view, final d d) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().f1(view, d);
                final androidx.core.view.a a = this.e.get(view);
                if (a != null) {
                    a.g(view, d);
                    return;
                }
            }
            super.g(view, d);
        }
        
        @Override
        public void h(@j0 final View view, @j0 final AccessibilityEvent accessibilityEvent) {
            final androidx.core.view.a a = this.e.get(view);
            if (a != null) {
                a.h(view, accessibilityEvent);
            }
            else {
                super.h(view, accessibilityEvent);
            }
        }
        
        @Override
        public boolean i(@j0 final ViewGroup viewGroup, @j0 final View view, @j0 final AccessibilityEvent accessibilityEvent) {
            final androidx.core.view.a a = this.e.get(viewGroup);
            if (a != null) {
                return a.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }
        
        @Override
        public boolean j(final View view, final int n, final Bundle bundle) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                final androidx.core.view.a a = this.e.get(view);
                if (a != null) {
                    if (a.j(view, n, bundle)) {
                        return true;
                    }
                }
                else if (super.j(view, n, bundle)) {
                    return true;
                }
                return this.d.d.getLayoutManager().z1(view, n, bundle);
            }
            return super.j(view, n, bundle);
        }
        
        @Override
        public void l(@j0 final View view, final int n) {
            final androidx.core.view.a a = this.e.get(view);
            if (a != null) {
                a.l(view, n);
            }
            else {
                super.l(view, n);
            }
        }
        
        @Override
        public void m(@j0 final View view, @j0 final AccessibilityEvent accessibilityEvent) {
            final androidx.core.view.a a = this.e.get(view);
            if (a != null) {
                a.m(view, accessibilityEvent);
            }
            else {
                super.m(view, accessibilityEvent);
            }
        }
        
        androidx.core.view.a n(final View view) {
            return this.e.remove(view);
        }
        
        void o(final View view) {
            final androidx.core.view.a c = androidx.core.view.j0.C(view);
            if (c != null && c != this) {
                this.e.put(view, c);
            }
        }
    }
}
