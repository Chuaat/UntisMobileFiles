// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import android.os.Bundle;
import androidx.annotation.k0;
import android.view.ViewGroup;
import androidx.annotation.j0;
import android.view.LayoutInflater;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.TextView;
import android.view.View;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.AdapterView$OnItemClickListener;
import android.os.Handler;

public class ListFragment extends Fragment
{
    static final int R = 16711681;
    static final int S = 16711682;
    static final int T = 16711683;
    private final Handler G;
    private final Runnable H;
    private final AdapterView$OnItemClickListener I;
    ListAdapter J;
    ListView K;
    View L;
    TextView M;
    View N;
    View O;
    CharSequence P;
    boolean Q;
    
    public ListFragment() {
        this.G = new Handler();
        this.H = new Runnable() {
            @Override
            public void run() {
                final ListView k = ListFragment.this.K;
                k.focusableViewAvailable((View)k);
            }
        };
        this.I = (AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
            public void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                ListFragment.this.w((ListView)adapterView, view, n, n2);
            }
        };
    }
    
    private void B(final boolean q, final boolean b) {
        this.r();
        final View n = this.N;
        if (n == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.Q == q) {
            return;
        }
        this.Q = q;
        if (q) {
            if (b) {
                n.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 17432577));
                this.O.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 17432576));
            }
            else {
                n.clearAnimation();
                this.O.clearAnimation();
            }
            this.N.setVisibility(8);
            this.O.setVisibility(0);
        }
        else {
            if (b) {
                n.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 17432576));
                this.O.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 17432577));
            }
            else {
                n.clearAnimation();
                this.O.clearAnimation();
            }
            this.N.setVisibility(0);
            this.O.setVisibility(8);
        }
    }
    
    private void r() {
        if (this.K != null) {
            return;
        }
        final View view = this.getView();
        if (view != null) {
            Label_0188: {
                if (view instanceof ListView) {
                    this.K = (ListView)view;
                }
                else {
                    final TextView m = (TextView)view.findViewById(16711681);
                    if ((this.M = m) == null) {
                        this.L = view.findViewById(16908292);
                    }
                    else {
                        m.setVisibility(8);
                    }
                    this.N = view.findViewById(16711682);
                    this.O = view.findViewById(16711683);
                    final View viewById = view.findViewById(16908298);
                    if (!(viewById instanceof ListView)) {
                        if (viewById == null) {
                            throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                        }
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                    else {
                        ListView k = (ListView)viewById;
                        this.K = k;
                        Object emptyView = this.L;
                        if (emptyView == null) {
                            final CharSequence p = this.P;
                            if (p == null) {
                                break Label_0188;
                            }
                            this.M.setText(p);
                            k = this.K;
                            emptyView = this.M;
                        }
                        k.setEmptyView((View)emptyView);
                    }
                }
            }
            this.Q = true;
            this.K.setOnItemClickListener(this.I);
            final ListAdapter j = this.J;
            if (j != null) {
                this.J = null;
                this.z(j);
            }
            else if (this.N != null) {
                this.B(false, false);
            }
            this.G.post(this.H);
            return;
        }
        throw new IllegalStateException("Content view not yet created");
    }
    
    public void A(final boolean b) {
        this.B(b, true);
    }
    
    public void C(final boolean b) {
        this.B(b, false);
    }
    
    public void D(final int selection) {
        this.r();
        this.K.setSelection(selection);
    }
    
    @k0
    @Override
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final Context requireContext = this.requireContext();
        final FrameLayout frameLayout = new FrameLayout(requireContext);
        final LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView((View)new ProgressBar(requireContext, (AttributeSet)null, 16842874), (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        frameLayout.addView((View)linearLayout, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        final TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView((View)textView, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView((View)listView, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        frameLayout.addView((View)frameLayout2, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        frameLayout.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        return (View)frameLayout;
    }
    
    @Override
    public void onDestroyView() {
        this.G.removeCallbacks(this.H);
        this.K = null;
        this.Q = false;
        this.O = null;
        this.N = null;
        this.L = null;
        this.M = null;
        super.onDestroyView();
    }
    
    @Override
    public void onViewCreated(@j0 final View view, @k0 final Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.r();
    }
    
    @k0
    public ListAdapter s() {
        return this.J;
    }
    
    @j0
    public ListView t() {
        this.r();
        return this.K;
    }
    
    public long u() {
        this.r();
        return this.K.getSelectedItemId();
    }
    
    public int v() {
        this.r();
        return this.K.getSelectedItemPosition();
    }
    
    public void w(@j0 final ListView listView, @j0 final View view, final int n, final long n2) {
    }
    
    @j0
    public final ListAdapter x() {
        final ListAdapter s = this.s();
        if (s != null) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ListFragment ");
        sb.append(this);
        sb.append(" does not have a ListAdapter.");
        throw new IllegalStateException(sb.toString());
    }
    
    public void y(@k0 final CharSequence charSequence) {
        this.r();
        final TextView m = this.M;
        if (m != null) {
            m.setText(charSequence);
            if (this.P == null) {
                this.K.setEmptyView((View)this.M);
            }
            this.P = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }
    
    public void z(@k0 final ListAdapter listAdapter) {
        final ListAdapter j = this.J;
        boolean b = false;
        final boolean b2 = j != null;
        this.J = listAdapter;
        final ListView k = this.K;
        if (k != null) {
            k.setAdapter(listAdapter);
            if (!this.Q && !b2) {
                if (this.requireView().getWindowToken() != null) {
                    b = true;
                }
                this.B(true, b);
            }
        }
    }
}
