// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.savedstate.c;
import androidx.savedstate.d;
import androidx.lifecycle.d1;
import androidx.lifecycle.g1;
import androidx.lifecycle.f1;
import android.view.LayoutInflater;
import androidx.annotation.t0;
import android.view.Window;
import androidx.annotation.x0;
import androidx.annotation.j0;
import androidx.annotation.g0;
import android.os.Looper;
import android.content.Context;
import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.e0;
import android.view.View;
import android.util.Log;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import androidx.annotation.k0;
import android.app.Dialog;
import androidx.lifecycle.y;
import androidx.lifecycle.l0;
import android.os.Handler;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;

public class DialogFragment extends Fragment implements DialogInterface$OnCancelListener, DialogInterface$OnDismissListener
{
    public static final int W = 0;
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 3;
    private static final String a0 = "android:savedDialogState";
    private static final String b0 = "android:style";
    private static final String c0 = "android:theme";
    private static final String d0 = "android:cancelable";
    private static final String e0 = "android:showsDialog";
    private static final String f0 = "android:backStackId";
    private static final String g0 = "android:dialogShowing";
    private Handler G;
    private Runnable H;
    private DialogInterface$OnCancelListener I;
    private DialogInterface$OnDismissListener J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private int O;
    private boolean P;
    private l0<y> Q;
    @k0
    private Dialog R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    
    public DialogFragment() {
        this.H = new Runnable() {
            @SuppressLint({ "SyntheticAccessor" })
            @Override
            public void run() {
                DialogFragment.this.J.onDismiss((DialogInterface)DialogFragment.this.R);
            }
        };
        this.I = (DialogInterface$OnCancelListener)new DialogInterface$OnCancelListener() {
            @SuppressLint({ "SyntheticAccessor" })
            public void onCancel(@k0 final DialogInterface dialogInterface) {
                if (DialogFragment.this.R != null) {
                    final DialogFragment g = DialogFragment.this;
                    g.onCancel((DialogInterface)g.R);
                }
            }
        };
        this.J = (DialogInterface$OnDismissListener)new DialogInterface$OnDismissListener() {
            @SuppressLint({ "SyntheticAccessor" })
            public void onDismiss(@k0 final DialogInterface dialogInterface) {
                if (DialogFragment.this.R != null) {
                    final DialogFragment g = DialogFragment.this;
                    g.onDismiss((DialogInterface)g.R);
                }
            }
        };
        this.K = 0;
        this.L = 0;
        this.M = true;
        this.N = true;
        this.O = -1;
        this.Q = new l0<y>() {
            @SuppressLint({ "SyntheticAccessor" })
            public void b(final y y) {
                if (y != null && DialogFragment.this.N) {
                    final View requireView = DialogFragment.this.requireView();
                    if (requireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (DialogFragment.this.R != null) {
                        if (FragmentManager.T0(3)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("DialogFragment ");
                            sb.append(this);
                            sb.append(" setting the content view on ");
                            sb.append(DialogFragment.this.R);
                            Log.d("FragmentManager", sb.toString());
                        }
                        DialogFragment.this.R.setContentView(requireView);
                    }
                }
            }
        };
        this.V = false;
    }
    
    public DialogFragment(@e0 final int n) {
        super(n);
        this.H = new Runnable() {
            @SuppressLint({ "SyntheticAccessor" })
            @Override
            public void run() {
                DialogFragment.this.J.onDismiss((DialogInterface)DialogFragment.this.R);
            }
        };
        this.I = (DialogInterface$OnCancelListener)new DialogInterface$OnCancelListener() {
            @SuppressLint({ "SyntheticAccessor" })
            public void onCancel(@k0 final DialogInterface dialogInterface) {
                if (DialogFragment.this.R != null) {
                    final DialogFragment g = DialogFragment.this;
                    g.onCancel((DialogInterface)g.R);
                }
            }
        };
        this.J = (DialogInterface$OnDismissListener)new DialogInterface$OnDismissListener() {
            @SuppressLint({ "SyntheticAccessor" })
            public void onDismiss(@k0 final DialogInterface dialogInterface) {
                if (DialogFragment.this.R != null) {
                    final DialogFragment g = DialogFragment.this;
                    g.onDismiss((DialogInterface)g.R);
                }
            }
        };
        this.K = 0;
        this.L = 0;
        this.M = true;
        this.N = true;
        this.O = -1;
        this.Q = new l0<y>() {
            @SuppressLint({ "SyntheticAccessor" })
            public void b(final y y) {
                if (y != null && DialogFragment.this.N) {
                    final View requireView = DialogFragment.this.requireView();
                    if (requireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (DialogFragment.this.R != null) {
                        if (FragmentManager.T0(3)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("DialogFragment ");
                            sb.append(this);
                            sb.append(" setting the content view on ");
                            sb.append(DialogFragment.this.R);
                            Log.d("FragmentManager", sb.toString());
                        }
                        DialogFragment.this.R.setContentView(requireView);
                    }
                }
            }
        };
        this.V = false;
    }
    
    private void E(@k0 final Bundle bundle) {
        if (!this.N) {
            return;
        }
        if (!this.V) {
            try {
                this.P = true;
                final Dialog b = this.B(bundle);
                this.R = b;
                if (this.N) {
                    this.J(b, this.K);
                    final Context context = this.getContext();
                    if (context instanceof Activity) {
                        this.R.setOwnerActivity((Activity)context);
                    }
                    this.R.setCancelable(this.M);
                    this.R.setOnCancelListener(this.I);
                    this.R.setOnDismissListener(this.J);
                    this.V = true;
                }
                else {
                    this.R = null;
                }
            }
            finally {
                this.P = false;
            }
        }
    }
    
    private void w(final boolean b, final boolean b2) {
        if (this.T) {
            return;
        }
        this.T = true;
        this.U = false;
        final Dialog r = this.R;
        if (r != null) {
            r.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.R.dismiss();
            if (!b2) {
                if (Looper.myLooper() == this.G.getLooper()) {
                    this.onDismiss((DialogInterface)this.R);
                }
                else {
                    this.G.post(this.H);
                }
            }
        }
        this.S = true;
        if (this.O >= 0) {
            this.getParentFragmentManager().m1(this.O, 1);
            this.O = -1;
        }
        else {
            final a0 r2 = this.getParentFragmentManager().r();
            r2.C(this);
            if (b) {
                r2.s();
            }
            else {
                r2.r();
            }
        }
    }
    
    public boolean A() {
        return this.M;
    }
    
    @g0
    @j0
    public Dialog B(@k0 final Bundle bundle) {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        return new Dialog(this.requireContext(), this.z());
    }
    
    @k0
    View C(final int n) {
        final Dialog r = this.R;
        if (r != null) {
            return r.findViewById(n);
        }
        return null;
    }
    
    boolean D() {
        return this.V;
    }
    
    @j0
    public final Dialog F() {
        final Dialog x = this.x();
        if (x != null) {
            return x;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }
    
    public void G(final boolean b) {
        this.M = b;
        final Dialog r = this.R;
        if (r != null) {
            r.setCancelable(b);
        }
    }
    
    public void H(final boolean n) {
        this.N = n;
    }
    
    public void I(final int n, @x0 final int n2) {
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(n);
            sb.append(", ");
            sb.append(n2);
            Log.d("FragmentManager", sb.toString());
        }
        this.K = n;
        if (n == 2 || n == 3) {
            this.L = 16973913;
        }
        if (n2 != 0) {
            this.L = n2;
        }
    }
    
    @t0({ t0.a.I })
    public void J(@j0 final Dialog dialog, final int n) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return;
            }
            final Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }
    
    public int K(@j0 final a0 a0, @k0 final String s) {
        this.T = false;
        this.U = true;
        a0.l(this, s);
        this.S = false;
        return this.O = a0.r();
    }
    
    public void L(@j0 final FragmentManager fragmentManager, @k0 final String s) {
        this.T = false;
        this.U = true;
        final a0 r = fragmentManager.r();
        r.l(this, s);
        r.r();
    }
    
    public void M(@j0 final FragmentManager fragmentManager, @k0 final String s) {
        this.T = false;
        this.U = true;
        final a0 r = fragmentManager.r();
        r.l(this, s);
        r.t();
    }
    
    @j0
    @Override
    f createFragmentContainer() {
        return new f() {
            final /* synthetic */ f a = super.createFragmentContainer();
            
            @k0
            @Override
            public View c(final int n) {
                if (this.a.d()) {
                    return this.a.c(n);
                }
                return DialogFragment.this.C(n);
            }
            
            @Override
            public boolean d() {
                return this.a.d() || DialogFragment.this.D();
            }
        };
    }
    
    @g0
    @Override
    public void onAttach(@j0 final Context context) {
        super.onAttach(context);
        this.getViewLifecycleOwnerLiveData().k(this.Q);
        if (!this.U) {
            this.T = false;
        }
    }
    
    public void onCancel(@j0 final DialogInterface dialogInterface) {
    }
    
    @g0
    @Override
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.G = new Handler();
        this.N = (super.mContainerId == 0);
        if (bundle != null) {
            this.K = bundle.getInt("android:style", 0);
            this.L = bundle.getInt("android:theme", 0);
            this.M = bundle.getBoolean("android:cancelable", true);
            this.N = bundle.getBoolean("android:showsDialog", this.N);
            this.O = bundle.getInt("android:backStackId", -1);
        }
    }
    
    @g0
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        final Dialog r = this.R;
        if (r != null) {
            this.S = true;
            r.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.R.dismiss();
            if (!this.T) {
                this.onDismiss((DialogInterface)this.R);
            }
            this.R = null;
            this.V = false;
        }
    }
    
    @g0
    @Override
    public void onDetach() {
        super.onDetach();
        if (!this.U && !this.T) {
            this.T = true;
        }
        this.getViewLifecycleOwnerLiveData().o(this.Q);
    }
    
    public void onDismiss(@j0 final DialogInterface dialogInterface) {
        if (!this.S) {
            if (FragmentManager.T0(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            this.w(true, true);
        }
    }
    
    @j0
    @Override
    public LayoutInflater onGetLayoutInflater(@k0 final Bundle bundle) {
        final LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.N && !this.P) {
            this.E(bundle);
            if (FragmentManager.T0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("get layout inflater for DialogFragment ");
                sb.append(this);
                sb.append(" from dialog context");
                Log.d("FragmentManager", sb.toString());
            }
            final Dialog r = this.R;
            LayoutInflater cloneInContext = onGetLayoutInflater;
            if (r != null) {
                cloneInContext = onGetLayoutInflater.cloneInContext(r.getContext());
            }
            return cloneInContext;
        }
        if (FragmentManager.T0(2)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("getting layout inflater for DialogFragment ");
            sb2.append(this);
            final String string = sb2.toString();
            StringBuilder sb3;
            String str;
            if (!this.N) {
                sb3 = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            else {
                sb3 = new StringBuilder();
                str = "mCreatingDialog = true: ";
            }
            sb3.append(str);
            sb3.append(string);
            Log.d("FragmentManager", sb3.toString());
        }
        return onGetLayoutInflater;
    }
    
    @g0
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final Dialog r = this.R;
        if (r != null) {
            final Bundle onSaveInstanceState = r.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        final int k = this.K;
        if (k != 0) {
            bundle.putInt("android:style", k);
        }
        final int l = this.L;
        if (l != 0) {
            bundle.putInt("android:theme", l);
        }
        final boolean m = this.M;
        if (!m) {
            bundle.putBoolean("android:cancelable", m);
        }
        final boolean n = this.N;
        if (!n) {
            bundle.putBoolean("android:showsDialog", n);
        }
        final int o = this.O;
        if (o != -1) {
            bundle.putInt("android:backStackId", o);
        }
    }
    
    @g0
    @Override
    public void onStart() {
        super.onStart();
        final Dialog r = this.R;
        if (r != null) {
            this.S = false;
            r.show();
            final View decorView = this.R.getWindow().getDecorView();
            f1.b(decorView, this);
            g1.b(decorView, this);
            d.b(decorView, this);
        }
    }
    
    @g0
    @Override
    public void onStop() {
        super.onStop();
        final Dialog r = this.R;
        if (r != null) {
            r.hide();
        }
    }
    
    @g0
    @Override
    public void onViewStateRestored(@k0 Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (this.R != null && bundle != null) {
            bundle = bundle.getBundle("android:savedDialogState");
            if (bundle != null) {
                this.R.onRestoreInstanceState(bundle);
            }
        }
    }
    
    @Override
    void performCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (super.mView == null && this.R != null && bundle != null) {
            final Bundle bundle2 = bundle.getBundle("android:savedDialogState");
            if (bundle2 != null) {
                this.R.onRestoreInstanceState(bundle2);
            }
        }
    }
    
    public void u() {
        this.w(false, false);
    }
    
    public void v() {
        this.w(true, false);
    }
    
    @k0
    public Dialog x() {
        return this.R;
    }
    
    public boolean y() {
        return this.N;
    }
    
    @x0
    public int z() {
        return this.L;
    }
}
