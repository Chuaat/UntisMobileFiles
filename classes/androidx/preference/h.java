// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.j0;
import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import androidx.recyclerview.widget.b0;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.annotation.t0;
import androidx.annotation.d1;
import android.view.View;
import android.os.Message;
import android.os.Handler;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Fragment;

@Deprecated
public abstract class h extends Fragment implements l.c, l.a, l.b, DialogPreference.a
{
    @Deprecated
    public static final String Q = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String R = "android:preferences";
    private static final String S = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int T = 1;
    private final d G;
    private l H;
    RecyclerView I;
    private boolean J;
    private boolean K;
    private Context L;
    private int M;
    private Runnable N;
    private final Handler O;
    private final Runnable P;
    
    public h() {
        this.G = new d();
        this.M = androidx.preference.o.j.T;
        this.O = new Handler() {
            public void handleMessage(final Message message) {
                if (message.what == 1) {
                    h.this.b();
                }
            }
        };
        this.P = new Runnable() {
            @Override
            public void run() {
                final RecyclerView i = h.this.I;
                i.focusableViewAvailable((View)i);
            }
        };
    }
    
    private void q() {
        if (this.O.hasMessages(1)) {
            return;
        }
        this.O.obtainMessage(1).sendToTarget();
    }
    
    private void r() {
        if (this.H != null) {
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }
    
    private void u(final Preference preference, final String s) {
        final Runnable n = new Runnable() {
            @Override
            public void run() {
                final RecyclerView.h adapter = h.this.I.getAdapter();
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
                        h.this.I.G1(n);
                    }
                    else {
                        adapter.registerAdapterDataObserver(new h(adapter, h.this.I, preference, s));
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
            this.N = n;
        }
        else {
            n.run();
        }
    }
    
    private void z() {
        final PreferenceScreen g = this.g();
        if (g != null) {
            g.K0();
        }
        this.p();
    }
    
    @Deprecated
    public void a(@d1 final int n) {
        this.r();
        this.x(this.H.r(this.L, n, this.g()));
    }
    
    void b() {
        final PreferenceScreen g = this.g();
        if (g != null) {
            this.e().setAdapter(this.i(g));
            g.C0();
        }
        this.h();
    }
    
    @t0({ androidx.annotation.t0.a.G })
    public Fragment c() {
        return null;
    }
    
    @Deprecated
    public <T extends Preference> T d(final CharSequence charSequence) {
        final l h = this.H;
        if (h == null) {
            return null;
        }
        return (T)h.b(charSequence);
    }
    
    @Deprecated
    public final RecyclerView e() {
        return this.I;
    }
    
    @Deprecated
    public l f() {
        return this.H;
    }
    
    @Deprecated
    public PreferenceScreen g() {
        return this.H.n();
    }
    
    @t0({ androidx.annotation.t0.a.G })
    protected void h() {
    }
    
    @Deprecated
    protected RecyclerView.h i(final PreferenceScreen preferenceScreen) {
        return new i(preferenceScreen);
    }
    
    @Deprecated
    public RecyclerView.p j() {
        return new LinearLayoutManager((Context)this.getActivity());
    }
    
    @Deprecated
    public void k(final Preference preference) {
        boolean a;
        final boolean b = a = (this.c() instanceof e && ((e)this.c()).a(this, preference));
        if (!b) {
            a = b;
            if (this.getActivity() instanceof e) {
                a = ((e)this.getActivity()).a(this, preference);
            }
        }
        if (a) {
            return;
        }
        if (this.getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        androidx.preference.g g;
        if (preference instanceof EditTextPreference) {
            g = androidx.preference.b.i(preference.z());
        }
        else if (preference instanceof ListPreference) {
            g = androidx.preference.d.i(preference.z());
        }
        else {
            if (!(preference instanceof MultiSelectListPreference)) {
                throw new IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
            }
            g = androidx.preference.e.i(preference.z());
        }
        g.setTargetFragment((Fragment)this, 0);
        g.show(this.getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }
    
    @Deprecated
    public void l(final PreferenceScreen preferenceScreen) {
        if ((!(this.c() instanceof g) || !((g)this.c()).a(this, preferenceScreen)) && this.getActivity() instanceof g) {
            ((g)this.getActivity()).a(this, preferenceScreen);
        }
    }
    
    @Deprecated
    public boolean m(final Preference preference) {
        final String s = preference.s();
        int a = 0;
        int a2 = 0;
        if (s != null) {
            if (this.c() instanceof f) {
                a2 = (((f)this.c()).a(this, preference) ? 1 : 0);
            }
            a = a2;
            if (a2 == 0) {
                a = a2;
                if (this.getActivity() instanceof f) {
                    a = (((f)this.getActivity()).a(this, preference) ? 1 : 0);
                }
            }
        }
        return a != 0;
    }
    
    @Deprecated
    public abstract void n(final Bundle p0, final String p1);
    
    @Deprecated
    public RecyclerView o(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        if (this.L.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            final RecyclerView recyclerView = (RecyclerView)viewGroup.findViewById(androidx.preference.o.g.X0);
            if (recyclerView != null) {
                return recyclerView;
            }
        }
        final RecyclerView recyclerView2 = (RecyclerView)layoutInflater.inflate(androidx.preference.o.j.V, viewGroup, false);
        recyclerView2.setLayoutManager(this.j());
        recyclerView2.setAccessibilityDelegateCompat(new m(recyclerView2));
        return recyclerView2;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final TypedValue typedValue = new TypedValue();
        this.getActivity().getTheme().resolveAttribute(androidx.preference.o.b.I3, typedValue, true);
        int n;
        if ((n = typedValue.resourceId) == 0) {
            n = androidx.preference.o.l.w2;
        }
        final ContextThemeWrapper l = new ContextThemeWrapper((Context)this.getActivity(), n);
        this.L = (Context)l;
        (this.H = new l((Context)l)).y((l.b)this);
        String string;
        if (this.getArguments() != null) {
            string = this.getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        else {
            string = null;
        }
        this.n(bundle, string);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, ViewGroup viewGroup, final Bundle bundle) {
        final Context l = this.L;
        final TypedArray obtainStyledAttributes = l.obtainStyledAttributes((AttributeSet)null, androidx.preference.o.m.G7, androidx.core.content.res.i.a(l, androidx.preference.o.b.E3, 16844038), 0);
        this.M = obtainStyledAttributes.getResourceId(androidx.preference.o.m.H7, this.M);
        final Drawable drawable = obtainStyledAttributes.getDrawable(androidx.preference.o.m.I7);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.preference.o.m.J7, -1);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(androidx.preference.o.m.K7, true);
        obtainStyledAttributes.recycle();
        final LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.L);
        final View inflate = cloneInContext.inflate(this.M, viewGroup, false);
        final View viewById = inflate.findViewById(16908351);
        if (!(viewById instanceof ViewGroup)) {
            throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        viewGroup = (ViewGroup)viewById;
        final RecyclerView o = this.o(cloneInContext, viewGroup, bundle);
        if (o != null) {
            (this.I = o).n((RecyclerView.o)this.G);
            this.v(drawable);
            if (dimensionPixelSize != -1) {
                this.w(dimensionPixelSize);
            }
            this.G.l(boolean1);
            if (this.I.getParent() == null) {
                viewGroup.addView((View)this.I);
            }
            this.O.post(this.P);
            return inflate;
        }
        throw new RuntimeException("Could not create RecyclerView");
    }
    
    public void onDestroyView() {
        this.O.removeCallbacks(this.P);
        this.O.removeMessages(1);
        if (this.J) {
            this.z();
        }
        this.I = null;
        super.onDestroyView();
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final PreferenceScreen g = this.g();
        if (g != null) {
            final Bundle bundle2 = new Bundle();
            g.m1(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }
    
    public void onStart() {
        super.onStart();
        this.H.z((l.c)this);
        this.H.x((l.a)this);
    }
    
    public void onStop() {
        super.onStop();
        this.H.z(null);
        this.H.x(null);
    }
    
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            final Bundle bundle2 = bundle.getBundle("android:preferences");
            if (bundle2 != null) {
                final PreferenceScreen g = this.g();
                if (g != null) {
                    g.l1(bundle2);
                }
            }
        }
        if (this.J) {
            this.b();
            final Runnable n = this.N;
            if (n != null) {
                n.run();
                this.N = null;
            }
        }
        this.K = true;
    }
    
    @t0({ androidx.annotation.t0.a.G })
    protected void p() {
    }
    
    @Deprecated
    public void s(final Preference preference) {
        this.u(preference, null);
    }
    
    @Deprecated
    public void t(final String s) {
        this.u(null, s);
    }
    
    @Deprecated
    public void v(final Drawable drawable) {
        this.G.m(drawable);
    }
    
    @Deprecated
    public void w(final int n) {
        this.G.n(n);
    }
    
    @Deprecated
    public void x(final PreferenceScreen preferenceScreen) {
        if (this.H.C(preferenceScreen) && preferenceScreen != null) {
            this.p();
            this.J = true;
            if (this.K) {
                this.q();
            }
        }
    }
    
    @Deprecated
    public void y(@d1 final int n, @k0 final String str) {
        this.r();
        PreferenceScreen preferenceScreen2;
        final PreferenceScreen preferenceScreen = preferenceScreen2 = this.H.r(this.L, n, null);
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
        this.x(preferenceScreen2);
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
            h.this.I.K0();
        }
        
        public void n(final int b) {
            this.b = b;
            h.this.I.K0();
        }
    }
    
    public interface e
    {
        boolean a(@j0 final h p0, final Preference p1);
    }
    
    public interface f
    {
        boolean a(final h p0, final Preference p1);
    }
    
    public interface g
    {
        boolean a(final h p0, final PreferenceScreen p1);
    }
    
    private static class h extends j
    {
        private final RecyclerView.h a;
        private final RecyclerView b;
        private final Preference c;
        private final String d;
        
        h(final RecyclerView.h a, final RecyclerView b, final Preference c, final String d) {
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
