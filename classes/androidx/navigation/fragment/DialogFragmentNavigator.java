// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.fragment;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.v0;
import androidx.navigation.i;
import android.util.Log;
import androidx.lifecycle.x;
import androidx.navigation.o0;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.navigation.a0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.s;
import androidx.lifecycle.y;
import androidx.annotation.j0;
import androidx.lifecycle.v;
import java.util.HashSet;
import androidx.fragment.app.FragmentManager;
import android.content.Context;
import androidx.navigation.u0;

@b("dialog")
public final class DialogFragmentNavigator extends u0<a>
{
    private static final String f = "DialogFragmentNavigator";
    private static final String g = "androidx-nav-dialogfragment:navigator:count";
    private static final String h = "androidx-nav-fragment:navigator:dialog:";
    private final Context a;
    private final FragmentManager b;
    private int c;
    private final HashSet<String> d;
    private v e;
    
    public DialogFragmentNavigator(@j0 final Context a, @j0 final FragmentManager b) {
        this.c = 0;
        this.d = new HashSet<String>();
        this.e = new v() {
            @Override
            public void h(@j0 final y y, @j0 final s.b b) {
                if (b == s.b.ON_STOP) {
                    final DialogFragment dialogFragment = (DialogFragment)y;
                    if (!dialogFragment.F().isShowing()) {
                        NavHostFragment.u(dialogFragment).I();
                    }
                }
            }
        };
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void c(@k0 final Bundle bundle) {
        if (bundle != null) {
            int i = 0;
            this.c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            while (i < this.c) {
                final FragmentManager b = this.b;
                final StringBuilder sb = new StringBuilder();
                sb.append("androidx-nav-fragment:navigator:dialog:");
                sb.append(i);
                final DialogFragment dialogFragment = (DialogFragment)b.q0(sb.toString());
                if (dialogFragment != null) {
                    dialogFragment.getLifecycle().a(this.e);
                }
                else {
                    final HashSet<String> d = this.d;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("androidx-nav-fragment:navigator:dialog:");
                    sb2.append(i);
                    d.add(sb2.toString());
                }
                ++i;
            }
        }
    }
    
    @k0
    @Override
    public Bundle d() {
        if (this.c == 0) {
            return null;
        }
        final Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.c);
        return bundle;
    }
    
    @Override
    public boolean e() {
        if (this.c == 0) {
            return false;
        }
        if (this.b.Y0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        final FragmentManager b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        sb.append(--this.c);
        final Fragment q0 = b.q0(sb.toString());
        if (q0 != null) {
            q0.getLifecycle().c(this.e);
            ((DialogFragment)q0).u();
        }
        return true;
    }
    
    @j0
    public a f() {
        return new a(this);
    }
    
    @k0
    public a0 g(@j0 final a a, @k0 final Bundle arguments, @k0 final o0 o0, @k0 final u0.a a2) {
        if (this.b.Y0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String s;
        final String str = s = a.J();
        if (str.charAt(0) == '.') {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a.getPackageName());
            sb.append(str);
            s = sb.toString();
        }
        final Fragment a3 = this.b.E0().a(this.a.getClassLoader(), s);
        if (DialogFragment.class.isAssignableFrom(((DialogFragment)a3).getClass())) {
            final DialogFragment dialogFragment = (DialogFragment)a3;
            dialogFragment.setArguments(arguments);
            dialogFragment.getLifecycle().a(this.e);
            final FragmentManager b = this.b;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("androidx-nav-fragment:navigator:dialog:");
            sb2.append(this.c++);
            dialogFragment.L(b, sb2.toString());
            return a;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Dialog destination ");
        sb3.append(a.J());
        sb3.append(" is not an instance of DialogFragment");
        throw new IllegalArgumentException(sb3.toString());
    }
    
    void h(@j0 final Fragment fragment) {
        if (this.d.remove(fragment.getTag())) {
            fragment.getLifecycle().a(this.e);
        }
    }
    
    @a0.a(DialogFragment.class)
    public static class a extends a0 implements i
    {
        private String P;
        
        public a(@j0 final u0<? extends a> u0) {
            super(u0);
        }
        
        public a(@j0 final v0 v0) {
            this(v0.d(DialogFragmentNavigator.class));
        }
        
        @j0
        public final String J() {
            final String p = this.P;
            if (p != null) {
                return p;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
        
        @j0
        public final a K(@j0 final String p) {
            this.P = p;
            return this;
        }
        
        @androidx.annotation.i
        @Override
        public void z(@j0 final Context context, @j0 final AttributeSet set) {
            super.z(context, set);
            final TypedArray obtainAttributes = context.getResources().obtainAttributes(set, androidx.navigation.fragment.i.k.k);
            final String string = obtainAttributes.getString(androidx.navigation.fragment.i.k.l);
            if (string != null) {
                this.K(string);
            }
            obtainAttributes.recycle();
        }
    }
}
