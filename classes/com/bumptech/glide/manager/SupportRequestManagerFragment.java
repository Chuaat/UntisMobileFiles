// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.manager;

import java.util.Iterator;
import java.util.Collections;
import android.util.Log;
import com.bumptech.glide.b;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.annotation.b1;
import android.annotation.SuppressLint;
import java.util.HashSet;
import androidx.annotation.j0;
import com.bumptech.glide.l;
import androidx.annotation.k0;
import java.util.Set;
import androidx.fragment.app.Fragment;

public class SupportRequestManagerFragment extends Fragment
{
    private static final String M = "SupportRMFragment";
    private final com.bumptech.glide.manager.a G;
    private final com.bumptech.glide.manager.m H;
    private final Set<SupportRequestManagerFragment> I;
    @k0
    private SupportRequestManagerFragment J;
    @k0
    private com.bumptech.glide.l K;
    @k0
    private Fragment L;
    
    public SupportRequestManagerFragment() {
        this(new com.bumptech.glide.manager.a());
    }
    
    @SuppressLint({ "ValidFragment" })
    @b1
    public SupportRequestManagerFragment(@j0 final com.bumptech.glide.manager.a g) {
        this.H = new a();
        this.I = new HashSet<SupportRequestManagerFragment>();
        this.G = g;
    }
    
    private void A(final SupportRequestManagerFragment supportRequestManagerFragment) {
        this.I.remove(supportRequestManagerFragment);
    }
    
    private void D() {
        final SupportRequestManagerFragment j = this.J;
        if (j != null) {
            j.A(this);
            this.J = null;
        }
    }
    
    private void r(final SupportRequestManagerFragment supportRequestManagerFragment) {
        this.I.add(supportRequestManagerFragment);
    }
    
    @k0
    private Fragment u() {
        Fragment fragment = this.getParentFragment();
        if (fragment == null) {
            fragment = this.L;
        }
        return fragment;
    }
    
    @k0
    private static FragmentManager x(@j0 Fragment parentFragment) {
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        return parentFragment.getFragmentManager();
    }
    
    private boolean y(@j0 Fragment parentFragment) {
        final Fragment u = this.u();
        while (true) {
            final Fragment parentFragment2 = parentFragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(u)) {
                return true;
            }
            parentFragment = parentFragment.getParentFragment();
        }
    }
    
    private void z(@j0 final Context context, @j0 final FragmentManager fragmentManager) {
        this.D();
        final SupportRequestManagerFragment r = b.d(context).n().r(context, fragmentManager);
        this.J = r;
        if (!this.equals(r)) {
            this.J.r(this);
        }
    }
    
    void B(@k0 final Fragment l) {
        this.L = l;
        if (l != null) {
            if (l.getContext() != null) {
                final FragmentManager x = x(l);
                if (x == null) {
                    return;
                }
                this.z(l.getContext(), x);
            }
        }
    }
    
    public void C(@k0 final com.bumptech.glide.l k) {
        this.K = k;
    }
    
    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);
        final FragmentManager x = x(this);
        if (x == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
            return;
        }
        try {
            this.z(this.getContext(), x);
        }
        catch (IllegalStateException ex) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", (Throwable)ex);
            }
        }
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.G.c();
        this.D();
    }
    
    @Override
    public void onDetach() {
        super.onDetach();
        this.L = null;
        this.D();
    }
    
    @Override
    public void onStart() {
        super.onStart();
        this.G.d();
    }
    
    @Override
    public void onStop() {
        super.onStop();
        this.G.e();
    }
    
    @j0
    Set<SupportRequestManagerFragment> s() {
        final SupportRequestManagerFragment j = this.J;
        if (j == null) {
            return Collections.emptySet();
        }
        if (this.equals(j)) {
            return Collections.unmodifiableSet((Set<? extends SupportRequestManagerFragment>)this.I);
        }
        final HashSet<SupportRequestManagerFragment> s = new HashSet<SupportRequestManagerFragment>();
        for (final SupportRequestManagerFragment supportRequestManagerFragment : this.J.s()) {
            if (this.y(supportRequestManagerFragment.u())) {
                s.add(supportRequestManagerFragment);
            }
        }
        return (Set<SupportRequestManagerFragment>)Collections.unmodifiableSet((Set<?>)s);
    }
    
    @j0
    com.bumptech.glide.manager.a t() {
        return this.G;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(this.u());
        sb.append("}");
        return sb.toString();
    }
    
    @k0
    public com.bumptech.glide.l v() {
        return this.K;
    }
    
    @j0
    public com.bumptech.glide.manager.m w() {
        return this.H;
    }
    
    private class a implements m
    {
        a() {
        }
        
        @j0
        @Override
        public Set<com.bumptech.glide.l> a() {
            final Set<SupportRequestManagerFragment> s = SupportRequestManagerFragment.this.s();
            final HashSet set = new HashSet<com.bumptech.glide.l>(s.size());
            for (final SupportRequestManagerFragment supportRequestManagerFragment : s) {
                if (supportRequestManagerFragment.v() != null) {
                    set.add(supportRequestManagerFragment.v());
                }
            }
            return (Set<com.bumptech.glide.l>)set;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(SupportRequestManagerFragment.this);
            sb.append("}");
            return sb.toString();
        }
    }
}
