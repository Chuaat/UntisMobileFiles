// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.Window$Callback;
import android.content.Context;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.core.view.p0;
import androidx.annotation.t0;

@t0({ t0.a.I })
public interface a0
{
    int A();
    
    void B(final int p0);
    
    p0 C(final int p0, final long p1);
    
    void D(final int p0);
    
    void E(final int p0);
    
    void F(final n.a p0, final g.a p1);
    
    ViewGroup G();
    
    void H(final boolean p0);
    
    void I(final SpinnerAdapter p0, final AdapterView$OnItemSelectedListener p1);
    
    void J(final SparseArray<Parcelable> p0);
    
    CharSequence K();
    
    int L();
    
    int M();
    
    void N(final int p0);
    
    void O(final View p0);
    
    void P();
    
    int Q();
    
    void R();
    
    void S(final Drawable p0);
    
    void T(final boolean p0);
    
    int a();
    
    void b(final Drawable p0);
    
    void c(final Menu p0, final n.a p1);
    
    void collapseActionView();
    
    boolean d();
    
    void e();
    
    boolean f();
    
    boolean g();
    
    Context getContext();
    
    CharSequence getTitle();
    
    int getVisibility();
    
    boolean h();
    
    boolean i();
    
    boolean j();
    
    boolean k();
    
    void l(final int p0);
    
    void m();
    
    View n();
    
    void o(final m0 p0);
    
    void p(final Drawable p0);
    
    boolean q();
    
    boolean r();
    
    void s(final int p0);
    
    void setIcon(final int p0);
    
    void setIcon(final Drawable p0);
    
    void setLogo(final int p0);
    
    void setTitle(final CharSequence p0);
    
    void setVisibility(final int p0);
    
    void setWindowCallback(final Window$Callback p0);
    
    void setWindowTitle(final CharSequence p0);
    
    void t(final CharSequence p0);
    
    void u(final CharSequence p0);
    
    void v(final Drawable p0);
    
    void w(final SparseArray<Parcelable> p0);
    
    void x(final int p0);
    
    Menu y();
    
    boolean z();
}
