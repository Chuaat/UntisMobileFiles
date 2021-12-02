// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.fragment;

import androidx.navigation.a0;
import androidx.navigation.u0;
import android.content.res.TypedArray;
import androidx.navigation.z0;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentContainerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.lifecycle.y;
import android.content.Context;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.t0;
import androidx.navigation.NavController;
import androidx.annotation.j0;
import android.os.Bundle;
import androidx.annotation.i0;
import android.view.View;
import androidx.navigation.l0;
import androidx.navigation.k0;
import androidx.fragment.app.Fragment;

public class NavHostFragment extends Fragment implements k0
{
    private static final String L = "android-support-nav:fragment:graphId";
    private static final String M = "android-support-nav:fragment:startDestinationArgs";
    private static final String N = "android-support-nav:fragment:navControllerState";
    private static final String O = "android-support-nav:fragment:defaultHost";
    private l0 G;
    private Boolean H;
    private View I;
    private int J;
    private boolean K;
    
    public NavHostFragment() {
        this.H = null;
    }
    
    @j0
    public static NavHostFragment r(@i0 final int n) {
        return s(n, null);
    }
    
    @j0
    public static NavHostFragment s(@i0 final int n, @androidx.annotation.k0 final Bundle bundle) {
        Bundle bundle2;
        if (n != 0) {
            bundle2 = new Bundle();
            bundle2.putInt("android-support-nav:fragment:graphId", n);
        }
        else {
            bundle2 = null;
        }
        Bundle arguments = bundle2;
        if (bundle != null) {
            if ((arguments = bundle2) == null) {
                arguments = new Bundle();
            }
            arguments.putBundle("android-support-nav:fragment:startDestinationArgs", bundle);
        }
        final NavHostFragment navHostFragment = new NavHostFragment();
        if (arguments != null) {
            navHostFragment.setArguments(arguments);
        }
        return navHostFragment;
    }
    
    @j0
    public static NavController u(@j0 final Fragment obj) {
        for (Fragment parentFragment = obj; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment)parentFragment).h();
            }
            final Fragment l0 = parentFragment.getParentFragmentManager().L0();
            if (l0 instanceof NavHostFragment) {
                return ((NavHostFragment)l0).h();
            }
        }
        final View view = obj.getView();
        if (view != null) {
            return t0.e(view);
        }
        Dialog x;
        if (obj instanceof DialogFragment) {
            x = ((DialogFragment)obj).x();
        }
        else {
            x = null;
        }
        if (x != null && x.getWindow() != null) {
            return t0.e(x.getWindow().getDecorView());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(obj);
        sb.append(" does not have a NavController set");
        throw new IllegalStateException(sb.toString());
    }
    
    private int v() {
        final int id = this.getId();
        if (id != 0 && id != -1) {
            return id;
        }
        return androidx.navigation.fragment.i.f.Z;
    }
    
    @j0
    @Override
    public final NavController h() {
        final l0 g = this.G;
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }
    
    @androidx.annotation.i
    @Override
    public void onAttach(@j0 final Context context) {
        super.onAttach(context);
        if (this.K) {
            this.getParentFragmentManager().r().Q(this).r();
        }
    }
    
    @Override
    public void onAttachFragment(@j0 final Fragment fragment) {
        super.onAttachFragment(fragment);
        this.G.o().d(DialogFragmentNavigator.class).h(fragment);
    }
    
    @androidx.annotation.i
    @Override
    public void onCreate(@androidx.annotation.k0 final Bundle bundle) {
        (this.G = new l0(this.requireContext())).S(this);
        this.G.U(this.requireActivity().getOnBackPressedDispatcher());
        final l0 g = this.G;
        final Boolean h = this.H;
        int int1 = 0;
        g.d(h != null && h);
        final Bundle bundle2 = null;
        this.H = null;
        this.G.V(this.getViewModelStore());
        this.w(this.G);
        Bundle bundle3;
        if (bundle != null) {
            bundle3 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.K = true;
                this.getParentFragmentManager().r().Q(this).r();
            }
            this.J = bundle.getInt("android-support-nav:fragment:graphId");
        }
        else {
            bundle3 = null;
        }
        if (bundle3 != null) {
            this.G.M(bundle3);
        }
        final int j = this.J;
        if (j != 0) {
            this.G.O(j);
        }
        else {
            final Bundle arguments = this.getArguments();
            if (arguments != null) {
                int1 = arguments.getInt("android-support-nav:fragment:graphId");
            }
            Bundle bundle4 = bundle2;
            if (arguments != null) {
                bundle4 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (int1 != 0) {
                this.G.P(int1, bundle4);
            }
        }
        super.onCreate(bundle);
    }
    
    @androidx.annotation.k0
    @Override
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @androidx.annotation.k0 final ViewGroup viewGroup, @androidx.annotation.k0 final Bundle bundle) {
        final FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(this.v());
        return (View)fragmentContainerView;
    }
    
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        final View i = this.I;
        if (i != null && t0.e(i) == this.G) {
            t0.h(this.I, null);
        }
        this.I = null;
    }
    
    @androidx.annotation.i
    @Override
    public void onInflate(@j0 final Context context, @j0 final AttributeSet set, @androidx.annotation.k0 final Bundle bundle) {
        super.onInflate(context, set, bundle);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, z0.j.p0);
        final int resourceId = obtainStyledAttributes.getResourceId(z0.j.q0, 0);
        if (resourceId != 0) {
            this.J = resourceId;
        }
        obtainStyledAttributes.recycle();
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, androidx.navigation.fragment.i.k.C0);
        if (obtainStyledAttributes2.getBoolean(androidx.navigation.fragment.i.k.D0, false)) {
            this.K = true;
        }
        obtainStyledAttributes2.recycle();
    }
    
    @androidx.annotation.i
    @Override
    public void onPrimaryNavigationFragmentChanged(final boolean b) {
        final l0 g = this.G;
        if (g != null) {
            g.d(b);
        }
        else {
            this.H = b;
        }
    }
    
    @androidx.annotation.i
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final Bundle n = this.G.N();
        if (n != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", n);
        }
        if (this.K) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        final int j = this.J;
        if (j != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", j);
        }
    }
    
    @Override
    public void onViewCreated(@j0 View view, @androidx.annotation.k0 final Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            t0.h(view, this.G);
            if (view.getParent() != null) {
                view = (View)view.getParent();
                this.I = view;
                if (view.getId() == this.getId()) {
                    t0.h(this.I, this.G);
                }
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("created host view ");
        sb.append(view);
        sb.append(" is not a ViewGroup");
        throw new IllegalStateException(sb.toString());
    }
    
    @Deprecated
    @j0
    protected u0<? extends e.a> t() {
        return (u0<? extends e.a>)new e(this.requireContext(), this.getChildFragmentManager(), this.v());
    }
    
    @androidx.annotation.i
    protected void w(@j0 final NavController navController) {
        navController.o().a(new DialogFragmentNavigator(this.requireContext(), this.getChildFragmentManager()));
        navController.o().a(this.t());
    }
}
