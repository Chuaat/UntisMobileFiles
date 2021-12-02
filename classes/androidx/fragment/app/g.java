// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.content.res.Configuration;
import java.util.ArrayList;
import androidx.lifecycle.d1;
import androidx.collection.m;
import androidx.lifecycle.c1;
import java.util.Map;
import java.util.Collection;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import androidx.loader.app.a;
import android.annotation.SuppressLint;
import java.util.List;
import androidx.annotation.k0;
import androidx.core.util.n;
import androidx.annotation.j0;

public class g
{
    private final i<?> a;
    
    private g(final i<?> a) {
        this.a = a;
    }
    
    @j0
    public static g b(@j0 final i<?> i) {
        return new g(n.h(i, "callbacks == null"));
    }
    
    @k0
    public Fragment A(@j0 final String s) {
        return this.a.K.r0(s);
    }
    
    @j0
    public List<Fragment> B(@SuppressLint({ "UnknownNullness" }) final List<Fragment> list) {
        return this.a.K.x0();
    }
    
    public int C() {
        return this.a.K.w0();
    }
    
    @j0
    public FragmentManager D() {
        return this.a.K;
    }
    
    @Deprecated
    @SuppressLint({ "UnknownNullness" })
    public a E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }
    
    public void F() {
        this.a.K.h1();
    }
    
    @k0
    public View G(@k0 final View view, @j0 final String s, @j0 final Context context, @j0 final AttributeSet set) {
        return this.a.K.I0().onCreateView(view, s, context, set);
    }
    
    @Deprecated
    public void H() {
    }
    
    @Deprecated
    public void I(@k0 final Parcelable parcelable, @k0 final androidx.fragment.app.n n) {
        this.a.K.D1(parcelable, n);
    }
    
    @Deprecated
    public void J(@k0 final Parcelable parcelable, @k0 final List<Fragment> list) {
        this.a.K.D1(parcelable, new androidx.fragment.app.n(list, null, null));
    }
    
    @Deprecated
    public void K(@SuppressLint({ "UnknownNullness" }) final m<String, a> m) {
    }
    
    public void L(@k0 final Parcelable parcelable) {
        final i<?> a = this.a;
        if (a instanceof d1) {
            a.K.E1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }
    
    @Deprecated
    @k0
    public m<String, a> M() {
        return null;
    }
    
    @Deprecated
    @k0
    public androidx.fragment.app.n N() {
        return this.a.K.F1();
    }
    
    @Deprecated
    @k0
    public List<Fragment> O() {
        final androidx.fragment.app.n f1 = this.a.K.F1();
        ArrayList<Fragment> list;
        if (f1 != null && f1.b() != null) {
            list = new ArrayList<Fragment>(f1.b());
        }
        else {
            list = null;
        }
        return list;
    }
    
    @k0
    public Parcelable P() {
        return this.a.K.H1();
    }
    
    public void a(@k0 final Fragment fragment) {
        final i<?> a = this.a;
        a.K.p(a, a, fragment);
    }
    
    public void c() {
        this.a.K.D();
    }
    
    public void d(@j0 final Configuration configuration) {
        this.a.K.F(configuration);
    }
    
    public boolean e(@j0 final MenuItem menuItem) {
        return this.a.K.G(menuItem);
    }
    
    public void f() {
        this.a.K.H();
    }
    
    public boolean g(@j0 final Menu menu, @j0 final MenuInflater menuInflater) {
        return this.a.K.I(menu, menuInflater);
    }
    
    public void h() {
        this.a.K.J();
    }
    
    public void i() {
        this.a.K.K();
    }
    
    public void j() {
        this.a.K.L();
    }
    
    public void k(final boolean b) {
        this.a.K.M(b);
    }
    
    public boolean l(@j0 final MenuItem menuItem) {
        return this.a.K.O(menuItem);
    }
    
    public void m(@j0 final Menu menu) {
        this.a.K.P(menu);
    }
    
    public void n() {
        this.a.K.R();
    }
    
    public void o(final boolean b) {
        this.a.K.S(b);
    }
    
    public boolean p(@j0 final Menu menu) {
        return this.a.K.T(menu);
    }
    
    @Deprecated
    public void q() {
    }
    
    public void r() {
        this.a.K.V();
    }
    
    public void s() {
        this.a.K.W();
    }
    
    public void t() {
        this.a.K.Y();
    }
    
    @Deprecated
    public void u() {
    }
    
    @Deprecated
    public void v() {
    }
    
    @Deprecated
    public void w() {
    }
    
    @Deprecated
    public void x(final boolean b) {
    }
    
    @Deprecated
    public void y(@j0 final String s, @k0 final FileDescriptor fileDescriptor, @j0 final PrintWriter printWriter, @k0 final String[] array) {
    }
    
    public boolean z() {
        return this.a.K.h0(true);
    }
}
