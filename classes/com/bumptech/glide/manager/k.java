// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.manager;

import android.util.Log;
import java.util.Iterator;
import java.util.Collections;
import android.content.Context;
import com.bumptech.glide.b;
import android.app.Activity;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import androidx.annotation.b1;
import android.annotation.SuppressLint;
import java.util.HashSet;
import androidx.annotation.j0;
import androidx.annotation.k0;
import com.bumptech.glide.l;
import java.util.Set;
import android.app.Fragment;

@Deprecated
public class k extends Fragment
{
    private static final String M = "RMFragment";
    private final com.bumptech.glide.manager.a G;
    private final m H;
    private final Set<k> I;
    @k0
    private l J;
    @k0
    private k K;
    @k0
    private Fragment L;
    
    public k() {
        this(new com.bumptech.glide.manager.a());
    }
    
    @SuppressLint({ "ValidFragment" })
    @b1
    k(@j0 final com.bumptech.glide.manager.a g) {
        this.H = new a();
        this.I = new HashSet<k>();
        this.G = g;
    }
    
    private void a(final k k) {
        this.I.add(k);
    }
    
    @TargetApi(17)
    @k0
    private Fragment d() {
        Fragment fragment;
        if (Build$VERSION.SDK_INT >= 17) {
            fragment = this.getParentFragment();
        }
        else {
            fragment = null;
        }
        if (fragment == null) {
            fragment = this.L;
        }
        return fragment;
    }
    
    @TargetApi(17)
    private boolean g(@j0 Fragment parentFragment) {
        final Fragment parentFragment2 = this.getParentFragment();
        while (true) {
            final Fragment parentFragment3 = parentFragment.getParentFragment();
            if (parentFragment3 == null) {
                return false;
            }
            if (parentFragment3.equals((Object)parentFragment2)) {
                return true;
            }
            parentFragment = parentFragment.getParentFragment();
        }
    }
    
    private void h(@j0 final Activity activity) {
        this.l();
        final k p = b.d((Context)activity).n().p(activity);
        this.K = p;
        if (!this.equals((Object)p)) {
            this.K.a(this);
        }
    }
    
    private void i(final k k) {
        this.I.remove(k);
    }
    
    private void l() {
        final k k = this.K;
        if (k != null) {
            k.i(this);
            this.K = null;
        }
    }
    
    @TargetApi(17)
    @j0
    Set<k> b() {
        if (this.equals((Object)this.K)) {
            return Collections.unmodifiableSet((Set<? extends k>)this.I);
        }
        if (this.K != null && Build$VERSION.SDK_INT >= 17) {
            final HashSet<k> s = new HashSet<k>();
            for (final k k : this.K.b()) {
                if (this.g(k.getParentFragment())) {
                    s.add(k);
                }
            }
            return (Set<k>)Collections.unmodifiableSet((Set<?>)s);
        }
        return Collections.emptySet();
    }
    
    @j0
    com.bumptech.glide.manager.a c() {
        return this.G;
    }
    
    @k0
    public l e() {
        return this.J;
    }
    
    @j0
    public m f() {
        return this.H;
    }
    
    void j(@k0 final Fragment l) {
        this.L = l;
        if (l != null && l.getActivity() != null) {
            this.h(l.getActivity());
        }
    }
    
    public void k(@k0 final l j) {
        this.J = j;
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        try {
            this.h(activity);
        }
        catch (IllegalStateException ex) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", (Throwable)ex);
            }
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.G.c();
        this.l();
    }
    
    public void onDetach() {
        super.onDetach();
        this.l();
    }
    
    public void onStart() {
        super.onStart();
        this.G.d();
    }
    
    public void onStop() {
        super.onStop();
        this.G.e();
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(this.d());
        sb.append("}");
        return sb.toString();
    }
    
    private class a implements m
    {
        a() {
        }
        
        @j0
        @Override
        public Set<l> a() {
            final Set<k> b = k.this.b();
            final HashSet set = new HashSet<l>(b.size());
            for (final k k : b) {
                if (k.e() != null) {
                    set.add(k.e());
                }
            }
            return (Set<l>)set;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(k.this);
            sb.append("}");
            return sb.toString();
        }
    }
}
