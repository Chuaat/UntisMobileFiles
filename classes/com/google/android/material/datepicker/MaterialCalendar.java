// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import androidx.recyclerview.widget.a0;
import android.widget.ListAdapter;
import android.widget.GridView;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Parcelable;
import android.os.Bundle;
import androidx.annotation.n0;
import android.content.Context;
import java.util.Iterator;
import androidx.core.util.j;
import androidx.recyclerview.widget.GridLayoutManager;
import android.graphics.Canvas;
import java.util.Calendar;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Build$VERSION;
import androidx.core.view.accessibility.d;
import com.google.android.material.button.MaterialButton;
import androidx.annotation.j0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.k0;
import androidx.annotation.x0;
import androidx.annotation.b1;
import androidx.annotation.t0;

@t0({ t0.a.H })
public final class MaterialCalendar<S> extends PickerFragment<S>
{
    private static final String R = "THEME_RES_ID_KEY";
    private static final String S = "GRID_SELECTOR_KEY";
    private static final String T = "CALENDAR_CONSTRAINTS_KEY";
    private static final String U = "CURRENT_MONTH_KEY";
    private static final int V = 3;
    @b1
    static final Object W;
    @b1
    static final Object X;
    @b1
    static final Object Y;
    @b1
    static final Object Z;
    @x0
    private int H;
    @k0
    private f<S> I;
    @k0
    private a J;
    @k0
    private com.google.android.material.datepicker.m K;
    private k L;
    private c M;
    private RecyclerView N;
    private RecyclerView O;
    private View P;
    private View Q;
    
    static {
        W = "MONTHS_VIEW_GROUP_TAG";
        X = "NAVIGATION_PREV_TAG";
        Y = "NAVIGATION_NEXT_TAG";
        Z = "SELECTOR_TOGGLE_TAG";
    }
    
    private void C(@j0 final View view, @j0 final o o) {
        final MaterialButton materialButton = (MaterialButton)view.findViewById(o2.a.h.M2);
        materialButton.setTag(MaterialCalendar.Z);
        androidx.core.view.j0.z1((View)materialButton, new androidx.core.view.a() {
            @Override
            public void g(final View view, @j0 final d d) {
                super.g(view, d);
                MaterialCalendar materialCalendar;
                int n;
                if (MaterialCalendar.this.Q.getVisibility() == 0) {
                    materialCalendar = MaterialCalendar.this;
                    n = o2.a.m.S0;
                }
                else {
                    materialCalendar = MaterialCalendar.this;
                    n = o2.a.m.Q0;
                }
                d.j1(materialCalendar.getString(n));
            }
        });
        final MaterialButton materialButton2 = (MaterialButton)view.findViewById(o2.a.h.O2);
        materialButton2.setTag(MaterialCalendar.X);
        final MaterialButton materialButton3 = (MaterialButton)view.findViewById(o2.a.h.N2);
        materialButton3.setTag(MaterialCalendar.Y);
        this.P = view.findViewById(o2.a.h.Z2);
        this.Q = view.findViewById(o2.a.h.S2);
        this.M(k.G);
        materialButton.setText((CharSequence)this.K.k(view.getContext()));
        this.O.r((RecyclerView.u)new RecyclerView.u() {
            @Override
            public void a(@j0 final RecyclerView recyclerView, final int n) {
                if (n == 0) {
                    final CharSequence text = materialButton.getText();
                    if (Build$VERSION.SDK_INT >= 16) {
                        recyclerView.announceForAccessibility(text);
                    }
                    else {
                        recyclerView.sendAccessibilityEvent(2048);
                    }
                }
            }
            
            @Override
            public void b(@j0 final RecyclerView recyclerView, int n, final int n2) {
                final LinearLayoutManager i = MaterialCalendar.this.I();
                if (n < 0) {
                    n = i.x2();
                }
                else {
                    n = i.A2();
                }
                MaterialCalendar.this.K = o.i(n);
                materialButton.setText(o.j(n));
            }
        });
        materialButton.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                MaterialCalendar.this.N();
            }
        });
        materialButton3.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final int n = MaterialCalendar.this.I().x2() + 1;
                if (n < MaterialCalendar.this.O.getAdapter().getItemCount()) {
                    MaterialCalendar.this.L(o.i(n));
                }
            }
        });
        materialButton2.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final int n = MaterialCalendar.this.I().A2() - 1;
                if (n >= 0) {
                    MaterialCalendar.this.L(o.i(n));
                }
            }
        });
    }
    
    @j0
    private RecyclerView.o D() {
        return new RecyclerView.o() {
            private final Calendar a = com.google.android.material.datepicker.u.v();
            private final Calendar b = com.google.android.material.datepicker.u.v();
            
            @Override
            public void i(@j0 final Canvas canvas, @j0 final RecyclerView recyclerView, @j0 final d0 d0) {
                if (recyclerView.getAdapter() instanceof com.google.android.material.datepicker.v) {
                    if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                        final com.google.android.material.datepicker.v v = (com.google.android.material.datepicker.v)recyclerView.getAdapter();
                        final GridLayoutManager gridLayoutManager = (GridLayoutManager)recyclerView.getLayoutManager();
                        for (final j j : MaterialCalendar.this.I.Z0()) {
                            final F a = j.a;
                            if (a != null) {
                                if (j.b == null) {
                                    continue;
                                }
                                this.a.setTimeInMillis((long)a);
                                this.b.setTimeInMillis((long)j.b);
                                final int i = v.j(this.a.get(1));
                                final int k = v.j(this.b.get(1));
                                final View l = gridLayoutManager.J(i);
                                final View m = gridLayoutManager.J(k);
                                final int n = i / gridLayoutManager.D3();
                                for (int n2 = k / gridLayoutManager.D3(), n3 = n; n3 <= n2; ++n3) {
                                    final View j2 = gridLayoutManager.J(gridLayoutManager.D3() * n3);
                                    if (j2 != null) {
                                        final int top = j2.getTop();
                                        final int e = MaterialCalendar.this.M.d.e();
                                        final int bottom = j2.getBottom();
                                        final int b = MaterialCalendar.this.M.d.b();
                                        int n4;
                                        if (n3 == n) {
                                            n4 = l.getLeft() + l.getWidth() / 2;
                                        }
                                        else {
                                            n4 = 0;
                                        }
                                        int width;
                                        if (n3 == n2) {
                                            width = m.getLeft() + m.getWidth() / 2;
                                        }
                                        else {
                                            width = recyclerView.getWidth();
                                        }
                                        canvas.drawRect((float)n4, (float)(top + e), (float)width, (float)(bottom - b), MaterialCalendar.this.M.h);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        };
    }
    
    @n0
    static int H(@j0 final Context context) {
        return context.getResources().getDimensionPixelSize(o2.a.f.E3);
    }
    
    @j0
    public static <T> MaterialCalendar<T> J(@j0 final f<T> f, @x0 final int n, @j0 final a a) {
        final MaterialCalendar<T> materialCalendar = new MaterialCalendar<T>();
        final Bundle arguments = new Bundle();
        arguments.putInt("THEME_RES_ID_KEY", n);
        arguments.putParcelable("GRID_SELECTOR_KEY", (Parcelable)f);
        arguments.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)a);
        arguments.putParcelable("CURRENT_MONTH_KEY", (Parcelable)a.i());
        materialCalendar.setArguments(arguments);
        return materialCalendar;
    }
    
    private void K(final int n) {
        this.O.post((Runnable)new Runnable() {
            @Override
            public void run() {
                MaterialCalendar.this.O.O1(n);
            }
        });
    }
    
    @k0
    a E() {
        return this.J;
    }
    
    c F() {
        return this.M;
    }
    
    @k0
    com.google.android.material.datepicker.m G() {
        return this.K;
    }
    
    @j0
    LinearLayoutManager I() {
        return (LinearLayoutManager)this.O.getLayoutManager();
    }
    
    void L(final com.google.android.material.datepicker.m k) {
        final o o = (o)this.O.getAdapter();
        final int i = o.k(k);
        final int a = i - o.k(this.K);
        final int abs = Math.abs(a);
        boolean b = true;
        final boolean b2 = abs > 3;
        if (a <= 0) {
            b = false;
        }
        this.K = k;
        Label_0114: {
            RecyclerView recyclerView;
            int n;
            if (b2 && b) {
                recyclerView = this.O;
                n = i - 3;
            }
            else {
                if (!b2) {
                    break Label_0114;
                }
                recyclerView = this.O;
                n = i + 3;
            }
            recyclerView.G1(n);
        }
        this.K(i);
    }
    
    void M(final k l) {
        this.L = l;
        if (l == k.H) {
            this.N.getLayoutManager().R1(((v)this.N.getAdapter()).j(this.K.I));
            this.P.setVisibility(0);
            this.Q.setVisibility(8);
        }
        else if (l == k.G) {
            this.P.setVisibility(8);
            this.Q.setVisibility(0);
            this.L(this.K);
        }
    }
    
    void N() {
        final k l = this.L;
        final k h = k.H;
        if (l == h) {
            this.M(k.G);
        }
        else if (l == k.G) {
            this.M(h);
        }
    }
    
    @Override
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        this.H = arguments.getInt("THEME_RES_ID_KEY");
        this.I = (f<S>)arguments.getParcelable("GRID_SELECTOR_KEY");
        this.J = (a)arguments.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.K = (com.google.android.material.datepicker.m)arguments.getParcelable("CURRENT_MONTH_KEY");
    }
    
    @j0
    @Override
    public View onCreateView(@j0 LayoutInflater cloneInContext, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.getContext(), this.H);
        this.M = new c((Context)contextThemeWrapper);
        cloneInContext = cloneInContext.cloneInContext((Context)contextThemeWrapper);
        final com.google.android.material.datepicker.m j = this.J.j();
        int n;
        boolean b;
        if (MaterialDatePicker.k0((Context)contextThemeWrapper)) {
            n = o2.a.k.u0;
            b = true;
        }
        else {
            n = o2.a.k.p0;
            b = false;
        }
        final View inflate = cloneInContext.inflate(n, viewGroup, false);
        final GridView gridView = (GridView)inflate.findViewById(o2.a.h.T2);
        androidx.core.view.j0.z1((View)gridView, new androidx.core.view.a() {
            @Override
            public void g(final View view, @j0 final d d) {
                super.g(view, d);
                d.W0(null);
            }
        });
        gridView.setAdapter((ListAdapter)new com.google.android.material.datepicker.j());
        gridView.setNumColumns(j.J);
        gridView.setEnabled(false);
        (this.O = (RecyclerView)inflate.findViewById(o2.a.h.W2)).setLayoutManager((RecyclerView.p)new s(this.getContext(), b, false) {
            @Override
            protected void k2(@j0 final d0 d0, @j0 final int[] array) {
                if ((b ? 1 : 0) == 0) {
                    array[0] = MaterialCalendar.this.O.getWidth();
                    array[1] = MaterialCalendar.this.O.getWidth();
                }
                else {
                    array[0] = MaterialCalendar.this.O.getHeight();
                    array[1] = MaterialCalendar.this.O.getHeight();
                }
            }
        });
        this.O.setTag(MaterialCalendar.W);
        final o adapter = new o((Context)contextThemeWrapper, this.I, this.J, new l() {
            @Override
            public void a(final long n) {
                if (MaterialCalendar.this.J.f().S3(n)) {
                    MaterialCalendar.this.I.z5(n);
                    final Iterator<p<Object>> iterator = MaterialCalendar.this.G.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().b(MaterialCalendar.this.I.O4());
                    }
                    MaterialCalendar.this.O.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.N != null) {
                        MaterialCalendar.this.N.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.O.setAdapter((RecyclerView.h)adapter);
        final int integer = contextThemeWrapper.getResources().getInteger(o2.a.i.v);
        final RecyclerView n2 = (RecyclerView)inflate.findViewById(o2.a.h.Z2);
        this.N = n2;
        if (n2 != null) {
            n2.setHasFixedSize(true);
            this.N.setLayoutManager((RecyclerView.p)new GridLayoutManager((Context)contextThemeWrapper, integer, 1, false));
            this.N.setAdapter((RecyclerView.h)new v(this));
            this.N.n(this.D());
        }
        if (inflate.findViewById(o2.a.h.M2) != null) {
            this.C(inflate, adapter);
        }
        if (!MaterialDatePicker.k0((Context)contextThemeWrapper)) {
            new a0().b(this.O);
        }
        this.O.G1(adapter.k(this.K));
        return inflate;
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.H);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable)this.I);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)this.J);
        bundle.putParcelable("CURRENT_MONTH_KEY", (Parcelable)this.K);
    }
    
    public boolean r(@j0 final p<S> p) {
        return super.r(p);
    }
    
    @k0
    public f<S> t() {
        return this.I;
    }
    
    enum k
    {
        G, 
        H;
    }
    
    interface l
    {
        void a(final long p0);
    }
}
