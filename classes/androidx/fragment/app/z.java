// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.widget.TabHost$TabContentFactory;
import android.os.Bundle;
import android.widget.TabHost$TabSpec;
import android.content.res.TypedArray;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TabWidget;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import android.widget.TabHost$OnTabChangeListener;
import android.widget.TabHost;

@Deprecated
public class z extends TabHost implements TabHost$OnTabChangeListener
{
    private final ArrayList<c> G;
    private FrameLayout H;
    private Context I;
    private FragmentManager J;
    private int K;
    private TabHost$OnTabChangeListener L;
    private c M;
    private boolean N;
    
    @Deprecated
    public z(@j0 final Context context) {
        super(context, (AttributeSet)null);
        this.G = new ArrayList<c>();
        this.f(context, null);
    }
    
    @Deprecated
    public z(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.G = new ArrayList<c>();
        this.f(context, set);
    }
    
    @k0
    private a0 b(@k0 final String s, @k0 final a0 a0) {
        final c e = this.e(s);
        a0 r = a0;
        if (this.M != e) {
            if ((r = a0) == null) {
                r = this.J.r();
            }
            final c m = this.M;
            if (m != null) {
                final Fragment d = m.d;
                if (d != null) {
                    r.w(d);
                }
            }
            if (e != null) {
                final Fragment d2 = e.d;
                if (d2 == null) {
                    (e.d = this.J.E0().a(this.I.getClassLoader(), e.b.getName())).setArguments(e.c);
                    r.h(this.K, e.d, e.a);
                }
                else {
                    r.q(d2);
                }
            }
            this.M = e;
        }
        return r;
    }
    
    private void c() {
        if (this.H == null && (this.H = (FrameLayout)this.findViewById(this.K)) == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No tab content FrameLayout found for id ");
            sb.append(this.K);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    private void d(final Context context) {
        if (this.findViewById(16908307) == null) {
            final LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            this.addView((View)linearLayout, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
            final TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView((View)tabWidget, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2, 0.0f));
            final FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView((View)frameLayout, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, 0, 0.0f));
            final FrameLayout h = new FrameLayout(context);
            (this.H = h).setId(this.K);
            linearLayout.addView((View)h, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, 0, 1.0f));
        }
    }
    
    @k0
    private c e(final String anObject) {
        for (int size = this.G.size(), i = 0; i < size; ++i) {
            final c c = this.G.get(i);
            if (c.a.equals(anObject)) {
                return c;
            }
        }
        return null;
    }
    
    private void f(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16842995 }, 0, 0);
        this.K = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener((TabHost$OnTabChangeListener)this);
    }
    
    @Deprecated
    public void a(@j0 final TabHost$TabSpec tabHost$TabSpec, @j0 final Class<?> clazz, @k0 final Bundle bundle) {
        tabHost$TabSpec.setContent((TabHost$TabContentFactory)new a(this.I));
        final String tag = tabHost$TabSpec.getTag();
        final c e = new c(tag, clazz, bundle);
        if (this.N) {
            final Fragment q0 = this.J.q0(tag);
            if ((e.d = q0) != null && !q0.isDetached()) {
                final a0 r = this.J.r();
                r.w(e.d);
                r.r();
            }
        }
        this.G.add(e);
        this.addTab(tabHost$TabSpec);
    }
    
    @Deprecated
    public void g(@j0 final Context i, @j0 final FragmentManager j) {
        this.d(i);
        super.setup();
        this.I = i;
        this.J = j;
        this.c();
    }
    
    @Deprecated
    public void h(@j0 final Context i, @j0 final FragmentManager j, final int n) {
        this.d(i);
        super.setup();
        this.I = i;
        this.J = j;
        this.K = n;
        this.c();
        this.H.setId(n);
        if (this.getId() == -1) {
            this.setId(16908306);
        }
    }
    
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final String currentTabTag = this.getCurrentTabTag();
        final int size = this.G.size();
        a0 a0 = null;
        a0 r;
        for (int i = 0; i < size; ++i, a0 = r) {
            final c m = this.G.get(i);
            final Fragment q0 = this.J.q0(m.a);
            m.d = q0;
            r = a0;
            if (q0 != null) {
                r = a0;
                if (!q0.isDetached()) {
                    if (m.a.equals(currentTabTag)) {
                        this.M = m;
                        r = a0;
                    }
                    else {
                        if ((r = a0) == null) {
                            r = this.J.r();
                        }
                        r.w(m.d);
                    }
                }
            }
        }
        this.N = true;
        final a0 b = this.b(currentTabTag, a0);
        if (b != null) {
            b.r();
            this.J.l0();
        }
    }
    
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = false;
    }
    
    @Deprecated
    protected void onRestoreInstanceState(@SuppressLint({ "UnknownNullness" }) final Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final b b = (b)parcelable;
        super.onRestoreInstanceState(b.getSuperState());
        this.setCurrentTabByTag(b.G);
    }
    
    @Deprecated
    @j0
    protected Parcelable onSaveInstanceState() {
        final b b = new b(super.onSaveInstanceState());
        b.G = this.getCurrentTabTag();
        return (Parcelable)b;
    }
    
    @Deprecated
    public void onTabChanged(@k0 final String s) {
        if (this.N) {
            final a0 b = this.b(s, null);
            if (b != null) {
                b.r();
            }
        }
        final TabHost$OnTabChangeListener l = this.L;
        if (l != null) {
            l.onTabChanged(s);
        }
    }
    
    @Deprecated
    public void setOnTabChangedListener(@k0 final TabHost$OnTabChangeListener l) {
        this.L = l;
    }
    
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
    
    static class a implements TabHost$TabContentFactory
    {
        private final Context a;
        
        public a(final Context a) {
            this.a = a;
        }
        
        public View createTabContent(final String s) {
            final View view = new View(this.a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }
    
    static class b extends View$BaseSavedState
    {
        public static final Parcelable$Creator<b> CREATOR;
        String G;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
                public b a(final Parcel parcel) {
                    return new b(parcel);
                }
                
                public b[] b(final int n) {
                    return new b[n];
                }
            };
        }
        
        b(final Parcel parcel) {
            super(parcel);
            this.G = parcel.readString();
        }
        
        b(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @j0
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.G);
            sb.append("}");
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeString(this.G);
        }
    }
    
    static final class c
    {
        @j0
        final String a;
        @j0
        final Class<?> b;
        @k0
        final Bundle c;
        Fragment d;
        
        c(@j0 final String a, @j0 final Class<?> b, @k0 final Bundle c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
