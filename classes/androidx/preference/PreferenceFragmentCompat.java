// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.fragment.app.FragmentManager;
import android.util.Log;
import androidx.annotation.j0;
import androidx.annotation.k0;
import androidx.annotation.d1;
import android.graphics.drawable.Drawable;
import androidx.annotation.t0;
import androidx.recyclerview.widget.b0;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.os.Message;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.Fragment;

public abstract class PreferenceFragmentCompat extends Fragment implements l.c, l.a, l.b, DialogPreference.a
{
    private static final String P = "PreferenceFragment";
    public static final String Q = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String R = "android:preferences";
    private static final String S = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int T = 1;
    private final d G;
    private l H;
    RecyclerView I;
    private boolean J;
    private boolean K;
    private int L;
    private Runnable M;
    private Handler N;
    private final Runnable O;
    
    public PreferenceFragmentCompat() {
        this.G = new d();
        this.L = androidx.preference.o.j.T;
        this.N = new Handler() {
            public void handleMessage(final Message message) {
                if (message.what == 1) {
                    PreferenceFragmentCompat.this.s();
                }
            }
        };
        this.O = new Runnable() {
            @Override
            public void run() {
                final RecyclerView i = PreferenceFragmentCompat.this.I;
                i.focusableViewAvailable((View)i);
            }
        };
    }
    
    private void D() {
        if (this.N.hasMessages(1)) {
            return;
        }
        this.N.obtainMessage(1).sendToTarget();
    }
    
    private void E() {
        if (this.H != null) {
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }
    
    private void H(final Preference preference, final String s) {
        final Runnable m = new Runnable() {
            @Override
            public void run() {
                final RecyclerView.h adapter = PreferenceFragmentCompat.this.I.getAdapter();
                if (adapter instanceof PreferenceGroup.c) {
                    final Preference g = preference;
                    int n;
                    if (g != null) {
                        n = ((PreferenceGroup.c)adapter).e(g);
                    }
                    else {
                        n = ((PreferenceGroup.c)adapter).g(s);
                    }
                    if (n != -1) {
                        PreferenceFragmentCompat.this.I.G1(n);
                    }
                    else {
                        adapter.registerAdapterDataObserver(new h(adapter, PreferenceFragmentCompat.this.I, preference, s));
                    }
                    return;
                }
                if (adapter == null) {
                    return;
                }
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
        };
        if (this.I == null) {
            this.M = m;
        }
        else {
            m.run();
        }
    }
    
    private void M() {
        this.u().setAdapter(null);
        final PreferenceScreen w = this.w();
        if (w != null) {
            w.K0();
        }
        this.C();
    }
    
    public abstract void A(final Bundle p0, final String p1);
    
    public RecyclerView B(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        if (this.getContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            final RecyclerView recyclerView = (RecyclerView)viewGroup.findViewById(androidx.preference.o.g.X0);
            if (recyclerView != null) {
                return recyclerView;
            }
        }
        final RecyclerView recyclerView2 = (RecyclerView)layoutInflater.inflate(androidx.preference.o.j.V, viewGroup, false);
        recyclerView2.setLayoutManager(this.z());
        recyclerView2.setAccessibilityDelegateCompat(new androidx.preference.m(recyclerView2));
        return recyclerView2;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected void C() {
    }
    
    public void F(final Preference preference) {
        this.H(preference, null);
    }
    
    public void G(final String s) {
        this.H(null, s);
    }
    
    public void I(final Drawable drawable) {
        this.G.m(drawable);
    }
    
    public void J(final int n) {
        this.G.n(n);
    }
    
    public void K(final PreferenceScreen preferenceScreen) {
        if (this.H.C(preferenceScreen) && preferenceScreen != null) {
            this.C();
            this.J = true;
            if (this.K) {
                this.D();
            }
        }
    }
    
    public void L(@androidx.annotation.d1 final int n, @k0 final String str) {
        this.E();
        PreferenceScreen preferenceScreen2;
        final PreferenceScreen preferenceScreen = preferenceScreen2 = this.H.r(this.getContext(), n, null);
        if (str != null) {
            preferenceScreen2 = (PreferenceScreen)preferenceScreen.l2(str);
            if (!(preferenceScreen2 instanceof PreferenceScreen)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Preference object with key ");
                sb.append(str);
                sb.append(" is not a PreferenceScreen");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.K(preferenceScreen2);
    }
    
    @k0
    @Override
    public <T extends Preference> T d(@j0 final CharSequence charSequence) {
        final l h = this.H;
        if (h == null) {
            return null;
        }
        return (T)h.b(charSequence);
    }
    
    @Override
    public void k(final Preference preference) {
        boolean a;
        final boolean b = a = (this.t() instanceof e && ((e)this.t()).a(this, preference));
        if (!b) {
            a = b;
            if (this.getActivity() instanceof e) {
                a = ((e)this.getActivity()).a(this, preference);
            }
        }
        if (a) {
            return;
        }
        if (this.getParentFragmentManager().q0("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        PreferenceDialogFragmentCompat preferenceDialogFragmentCompat;
        if (preference instanceof EditTextPreference) {
            preferenceDialogFragmentCompat = EditTextPreferenceDialogFragmentCompat.V(preference.z());
        }
        else if (preference instanceof ListPreference) {
            preferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.V(preference.z());
        }
        else {
            if (!(preference instanceof MultiSelectListPreference)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot display dialog for an unknown Preference type: ");
                sb.append(preference.getClass().getSimpleName());
                sb.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                throw new IllegalArgumentException(sb.toString());
            }
            preferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.V(preference.z());
        }
        preferenceDialogFragmentCompat.setTargetFragment(this, 0);
        preferenceDialogFragmentCompat.L(this.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }
    
    @Override
    public void l(final PreferenceScreen preferenceScreen) {
        if ((!(this.t() instanceof g) || !((g)this.t()).a(this, preferenceScreen)) && this.getActivity() instanceof g) {
            ((g)this.getActivity()).a(this, preferenceScreen);
        }
    }
    
    @Override
    public boolean m(final Preference preference) {
        if (preference.s() != null) {
            boolean a;
            final boolean b = a = (this.t() instanceof f && ((f)this.t()).a(this, preference));
            if (!b) {
                a = b;
                if (this.getActivity() instanceof f) {
                    a = ((f)this.getActivity()).a(this, preference);
                }
            }
            if (!a) {
                Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                final FragmentManager supportFragmentManager = this.requireActivity().getSupportFragmentManager();
                final Bundle o = preference.o();
                final Fragment a2 = supportFragmentManager.E0().a(this.requireActivity().getClassLoader(), preference.s());
                a2.setArguments(o);
                a2.setTargetFragment(this, 0);
                supportFragmentManager.r().D(((View)this.getView().getParent()).getId(), a2).p(null).r();
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        final TypedValue typedValue = new TypedValue();
        this.getActivity().getTheme().resolveAttribute(androidx.preference.o.b.I3, typedValue, true);
        int n;
        if ((n = typedValue.resourceId) == 0) {
            n = androidx.preference.o.l.w2;
        }
        this.getActivity().getTheme().applyStyle(n, false);
        (this.H = new l(this.getContext())).y((l.b)this);
        String string;
        if (this.getArguments() != null) {
            string = this.getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        else {
            string = null;
        }
        this.A(bundle, string);
    }
    
    @Override
    public View onCreateView(@j0 LayoutInflater cloneInContext, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes((AttributeSet)null, androidx.preference.o.m.L7, androidx.preference.o.b.C3, 0);
        this.L = obtainStyledAttributes.getResourceId(androidx.preference.o.m.M7, this.L);
        final Drawable drawable = obtainStyledAttributes.getDrawable(androidx.preference.o.m.N7);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.preference.o.m.O7, -1);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(androidx.preference.o.m.P7, true);
        obtainStyledAttributes.recycle();
        cloneInContext = cloneInContext.cloneInContext(this.getContext());
        final View inflate = cloneInContext.inflate(this.L, viewGroup, false);
        final View viewById = inflate.findViewById(16908351);
        if (!(viewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        final ViewGroup viewGroup2 = (ViewGroup)viewById;
        final RecyclerView b = this.B(cloneInContext, viewGroup2, bundle);
        if (b != null) {
            (this.I = b).n((RecyclerView.o)this.G);
            this.I(drawable);
            if (dimensionPixelSize != -1) {
                this.J(dimensionPixelSize);
            }
            this.G.l(boolean1);
            if (this.I.getParent() == null) {
                viewGroup2.addView((View)this.I);
            }
            this.N.post(this.O);
            return inflate;
        }
        throw new RuntimeException("Could not create RecyclerView");
    }
    
    @Override
    public void onDestroyView() {
        this.N.removeCallbacks(this.O);
        this.N.removeMessages(1);
        if (this.J) {
            this.M();
        }
        this.I = null;
        super.onDestroyView();
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final PreferenceScreen w = this.w();
        if (w != null) {
            final Bundle bundle2 = new Bundle();
            w.m1(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }
    
    @Override
    public void onStart() {
        super.onStart();
        this.H.z((l.c)this);
        this.H.x((l.a)this);
    }
    
    @Override
    public void onStop() {
        super.onStop();
        this.H.z(null);
        this.H.x(null);
    }
    
    @Override
    public void onViewCreated(@j0 final View view, @k0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            bundle = bundle.getBundle("android:preferences");
            if (bundle != null) {
                final PreferenceScreen w = this.w();
                if (w != null) {
                    w.l1(bundle);
                }
            }
        }
        if (this.J) {
            this.s();
            final Runnable m = this.M;
            if (m != null) {
                m.run();
                this.M = null;
            }
        }
        this.K = true;
    }
    
    public void r(@androidx.annotation.d1 final int n) {
        this.E();
        this.K(this.H.r(this.getContext(), n, this.w()));
    }
    
    void s() {
        final PreferenceScreen w = this.w();
        if (w != null) {
            this.u().setAdapter(this.y(w));
            w.C0();
        }
        this.x();
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public Fragment t() {
        return null;
    }
    
    public final RecyclerView u() {
        return this.I;
    }
    
    public l v() {
        return this.H;
    }
    
    public PreferenceScreen w() {
        return this.H.n();
    }
    
    @t0({ androidx.annotation.t0.a.I })
    protected void x() {
    }
    
    protected RecyclerView.h y(final PreferenceScreen preferenceScreen) {
        return new androidx.preference.i(preferenceScreen);
    }
    
    public RecyclerView.p z() {
        return new LinearLayoutManager(this.getContext());
    }
    
    private class d extends o
    {
        private Drawable a;
        private int b;
        private boolean c;
        
        d() {
            this.c = true;
        }
        
        private boolean o(final View view, final RecyclerView recyclerView) {
            final RecyclerView.g0 t0 = recyclerView.t0(view);
            final boolean b = t0 instanceof androidx.preference.n;
            final boolean b2 = false;
            if (!b || !((androidx.preference.n)t0).d()) {
                return false;
            }
            boolean c = this.c;
            final int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                final RecyclerView.g0 t2 = recyclerView.t0(recyclerView.getChildAt(indexOfChild + 1));
                c = b2;
                if (t2 instanceof androidx.preference.n) {
                    c = b2;
                    if (((androidx.preference.n)t2).c()) {
                        c = true;
                    }
                }
            }
            return c;
        }
        
        @Override
        public void g(final Rect rect, final View view, final RecyclerView recyclerView, final d0 d0) {
            if (this.o(view, recyclerView)) {
                rect.bottom = this.b;
            }
        }
        
        @Override
        public void k(final Canvas canvas, final RecyclerView recyclerView, final d0 d0) {
            if (this.a == null) {
                return;
            }
            final int childCount = recyclerView.getChildCount();
            final int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; ++i) {
                final View child = recyclerView.getChildAt(i);
                if (this.o(child, recyclerView)) {
                    final int n = (int)child.getY() + child.getHeight();
                    this.a.setBounds(0, n, width, this.b + n);
                    this.a.draw(canvas);
                }
            }
        }
        
        public void l(final boolean c) {
            this.c = c;
        }
        
        public void m(final Drawable a) {
            int intrinsicHeight;
            if (a != null) {
                intrinsicHeight = a.getIntrinsicHeight();
            }
            else {
                intrinsicHeight = 0;
            }
            this.b = intrinsicHeight;
            this.a = a;
            PreferenceFragmentCompat.this.I.K0();
        }
        
        public void n(final int b) {
            this.b = b;
            PreferenceFragmentCompat.this.I.K0();
        }
    }
    
    public interface e
    {
        boolean a(@j0 final PreferenceFragmentCompat p0, final Preference p1);
    }
    
    public interface f
    {
        boolean a(final PreferenceFragmentCompat p0, final Preference p1);
    }
    
    public interface g
    {
        boolean a(final PreferenceFragmentCompat p0, final PreferenceScreen p1);
    }
    
    private static class h extends RecyclerView.j
    {
        private final RecyclerView.h a;
        private final RecyclerView b;
        private final Preference c;
        private final String d;
        
        public h(final RecyclerView.h a, final RecyclerView b, final Preference c, final String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        private void h() {
            this.a.unregisterAdapterDataObserver(this);
            final Preference c = this.c;
            int n;
            if (c != null) {
                n = ((PreferenceGroup.c)this.a).e(c);
            }
            else {
                n = ((PreferenceGroup.c)this.a).g(this.d);
            }
            if (n != -1) {
                this.b.G1(n);
            }
        }
        
        @Override
        public void a() {
            this.h();
        }
        
        @Override
        public void b(final int n, final int n2) {
            this.h();
        }
        
        @Override
        public void c(final int n, final int n2, final Object o) {
            this.h();
        }
        
        @Override
        public void d(final int n, final int n2) {
            this.h();
        }
        
        @Override
        public void e(final int n, final int n2, final int n3) {
            this.h();
        }
        
        @Override
        public void f(final int n, final int n2) {
            this.h();
        }
    }
}
