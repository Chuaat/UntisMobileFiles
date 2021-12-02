// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.annotation.g0;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.w0;
import androidx.activity.result.ActivityResultRegistry;
import androidx.annotation.t0;
import android.view.animation.Animation;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import androidx.lifecycle.x;
import android.annotation.SuppressLint;
import androidx.lifecycle.c1;
import androidx.lifecycle.s;
import android.view.LayoutInflater$Factory2;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.content.res.Configuration;
import java.util.List;
import androidx.lifecycle.d1;
import android.os.Parcelable;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Set;
import android.view.ViewParent;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.Collection;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.Writer;
import java.io.PrintWriter;
import android.util.Log;
import java.util.Iterator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.HashMap;
import android.content.Intent;
import androidx.annotation.k0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashSet;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.activity.c;
import androidx.activity.OnBackPressedDispatcher;
import java.util.ArrayList;
import java.util.ArrayDeque;
import androidx.activity.result.f;
import androidx.activity.result.d;

public abstract class FragmentManager implements t
{
    private static boolean O = false;
    static final String P = "FragmentManager";
    static boolean Q = true;
    public static final int R = 1;
    private static final String S = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    private d<f> A;
    private d<String[]> B;
    ArrayDeque<n> C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<s> L;
    private androidx.fragment.app.p M;
    private Runnable N;
    private final ArrayList<q> a;
    private boolean b;
    private final y c;
    ArrayList<a> d;
    private ArrayList<Fragment> e;
    private final j f;
    private OnBackPressedDispatcher g;
    private final c h;
    private final AtomicInteger i;
    private final Map<String, Bundle> j;
    private final Map<String, o> k;
    private ArrayList<p> l;
    private Map<Fragment, HashSet<androidx.core.os.c>> m;
    private final c0.g n;
    private final androidx.fragment.app.k o;
    private final CopyOnWriteArrayList<androidx.fragment.app.q> p;
    int q;
    private i<?> r;
    private androidx.fragment.app.f s;
    private Fragment t;
    @k0
    Fragment u;
    private h v;
    private h w;
    private j0 x;
    private j0 y;
    private d<Intent> z;
    
    public FragmentManager() {
        this.a = new ArrayList<q>();
        this.c = new y();
        this.f = new j(this);
        this.h = new c(false) {
            @Override
            public void handleOnBackPressed() {
                FragmentManager.this.P0();
            }
        };
        this.i = new AtomicInteger();
        this.j = Collections.synchronizedMap(new HashMap<String, Bundle>());
        this.k = Collections.synchronizedMap(new HashMap<String, o>());
        this.m = Collections.synchronizedMap(new HashMap<Fragment, HashSet<androidx.core.os.c>>());
        this.n = new c0.g() {
            @Override
            public void a(@androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final androidx.core.os.c c) {
                if (!c.c()) {
                    FragmentManager.this.w1(fragment, c);
                }
            }
            
            @Override
            public void b(@androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final androidx.core.os.c c) {
                FragmentManager.this.j(fragment, c);
            }
        };
        this.o = new androidx.fragment.app.k(this);
        this.p = new CopyOnWriteArrayList<androidx.fragment.app.q>();
        this.q = -1;
        this.v = null;
        this.w = new h() {
            @androidx.annotation.j0
            @Override
            public Fragment a(@androidx.annotation.j0 final ClassLoader classLoader, @androidx.annotation.j0 final String s) {
                return FragmentManager.this.H0().b(FragmentManager.this.H0().f(), s, null);
            }
        };
        this.x = null;
        this.y = new j0() {
            @androidx.annotation.j0
            @Override
            public i0 a(@androidx.annotation.j0 final ViewGroup viewGroup) {
                return new androidx.fragment.app.c(viewGroup);
            }
        };
        this.C = new ArrayDeque<n>();
        this.N = new Runnable() {
            @Override
            public void run() {
                FragmentManager.this.h0(true);
            }
        };
    }
    
    @androidx.annotation.j0
    private androidx.fragment.app.p A0(@androidx.annotation.j0 final Fragment fragment) {
        return this.M.d(fragment);
    }
    
    private void A1(@androidx.annotation.j0 final ArrayList<a> list, @androidx.annotation.j0 final ArrayList<Boolean> list2) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == list2.size()) {
            this.m0(list, list2);
            final int size = list.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                int n2 = i;
                int n3 = n;
                if (!list.get(i).r) {
                    if (n != i) {
                        this.k0(list, list2, n, i);
                    }
                    int n4 = n3 = i + 1;
                    if (list2.get(i)) {
                        while ((n3 = n4) < size) {
                            n3 = n4;
                            if (!list2.get(n4)) {
                                break;
                            }
                            n3 = n4;
                            if (list.get(n4).r) {
                                break;
                            }
                            ++n4;
                        }
                    }
                    this.k0(list, list2, i, n3);
                    n2 = n3 - 1;
                }
                i = n2 + 1;
                n = n3;
            }
            if (n != size) {
                this.k0(list, list2, n, size);
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }
    
    private void B(@androidx.annotation.j0 final Fragment fragment) {
        fragment.performDestroyView();
        this.o.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.q(null);
        fragment.mInLayout = false;
    }
    
    private void C1() {
        if (this.l != null) {
            for (int i = 0; i < this.l.size(); ++i) {
                this.l.get(i).a();
            }
        }
    }
    
    private ViewGroup D0(@androidx.annotation.j0 final Fragment fragment) {
        final ViewGroup mContainer = fragment.mContainer;
        if (mContainer != null) {
            return mContainer;
        }
        if (fragment.mContainerId <= 0) {
            return null;
        }
        if (this.s.d()) {
            final View c = this.s.c(fragment.mContainerId);
            if (c instanceof ViewGroup) {
                return (ViewGroup)c;
            }
        }
        return null;
    }
    
    static int G1(final int n) {
        int n2 = 8194;
        if (n != 4097) {
            if (n != 4099) {
                if (n != 8194) {
                    n2 = 0;
                }
                else {
                    n2 = 4097;
                }
            }
            else {
                n2 = 4099;
            }
        }
        return n2;
    }
    
    @k0
    static Fragment N0(@androidx.annotation.j0 final View view) {
        final Object tag = view.getTag(y.a.g.R);
        if (tag instanceof Fragment) {
            return (Fragment)tag;
        }
        return null;
    }
    
    private void P1(@androidx.annotation.j0 final Fragment fragment) {
        final ViewGroup d0 = this.D0(fragment);
        if (d0 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            final int u0 = y.a.g.u0;
            if (d0.getTag(u0) == null) {
                d0.setTag(u0, (Object)fragment);
            }
            ((Fragment)d0.getTag(u0)).setPopDirection(fragment.getPopDirection());
        }
    }
    
    private void Q(@k0 final Fragment fragment) {
        if (fragment != null && fragment.equals(this.n0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }
    
    private void R1() {
        final Iterator<v> iterator = this.c.l().iterator();
        while (iterator.hasNext()) {
            this.k1(iterator.next());
        }
    }
    
    private void S1(final RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        final PrintWriter printWriter = new PrintWriter(new h0("FragmentManager"));
        final i<?> r = this.r;
        while (true) {
            if (r != null) {
                try {
                    r.h("  ", null, printWriter, new String[0]);
                    throw ex;
                    this.b0("  ", null, printWriter, new String[0]);
                }
                catch (Exception ex2) {
                    Log.e("FragmentManager", "Failed dumping state", (Throwable)ex2);
                }
                throw ex;
            }
            continue;
        }
    }
    
    static boolean T0(final int n) {
        return FragmentManager.O || Log.isLoggable("FragmentManager", n);
    }
    
    private boolean U0(@androidx.annotation.j0 final Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.t();
    }
    
    private void U1() {
        synchronized (this.a) {
            final boolean empty = this.a.isEmpty();
            boolean enabled = true;
            if (!empty) {
                this.h.setEnabled(true);
                return;
            }
            // monitorexit(this.a)
            final c h = this.h;
            if (this.z0() <= 0 || !this.W0(this.t)) {
                enabled = false;
            }
            h.setEnabled(enabled);
        }
    }
    
    private void X(final int n) {
        try {
            this.b = true;
            this.c.d(n);
            this.e1(n, false);
            if (FragmentManager.Q) {
                final Iterator<i0> iterator = this.w().iterator();
                while (iterator.hasNext()) {
                    iterator.next().j();
                }
            }
            this.b = false;
            this.h0(true);
        }
        finally {
            this.b = false;
        }
    }
    
    private void a0() {
        if (this.H) {
            this.H = false;
            this.R1();
        }
    }
    
    @Deprecated
    public static void c0(final boolean o) {
        FragmentManager.O = o;
    }
    
    private void c1(@androidx.annotation.j0 final androidx.collection.c<Fragment> c) {
        for (int size = c.size(), i = 0; i < size; ++i) {
            final Fragment fragment = c.p(i);
            if (!fragment.mAdded) {
                final View requireView = fragment.requireView();
                fragment.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }
    
    @w
    public static void d0(final boolean q) {
        FragmentManager.Q = q;
    }
    
    private void e0() {
        if (FragmentManager.Q) {
            final Iterator<i0> iterator = this.w().iterator();
            while (iterator.hasNext()) {
                iterator.next().j();
            }
        }
        else if (!this.m.isEmpty()) {
            for (final Fragment fragment : this.m.keySet()) {
                this.s(fragment);
                this.f1(fragment);
            }
        }
    }
    
    private void g0(final boolean b) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.r != null) {
            if (Looper.myLooper() == this.r.g().getLooper()) {
                if (!b) {
                    this.u();
                }
                if (this.I == null) {
                    this.I = new ArrayList<a>();
                    this.J = new ArrayList<Boolean>();
                }
                this.b = true;
                try {
                    this.m0(null, null);
                    return;
                }
                finally {
                    this.b = false;
                }
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (this.G) {
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }
    
    private void h(@androidx.annotation.j0 final androidx.collection.c<Fragment> c) {
        final int q = this.q;
        if (q < 1) {
            return;
        }
        final int min = Math.min(q, 5);
        for (final Fragment fragment : this.c.o()) {
            if (fragment.mState < min) {
                this.g1(fragment, min);
                if (fragment.mView == null || fragment.mHidden || !fragment.mIsNewlyAdded) {
                    continue;
                }
                c.add(fragment);
            }
        }
    }
    
    private static void j0(@androidx.annotation.j0 final ArrayList<a> list, @androidx.annotation.j0 final ArrayList<Boolean> list2, int i, final int n) {
        while (i < n) {
            final a a = list.get(i);
            final boolean booleanValue = list2.get(i);
            boolean b = true;
            if (booleanValue) {
                a.V(-1);
                if (i != n - 1) {
                    b = false;
                }
                a.a0(b);
            }
            else {
                a.V(1);
                a.Z();
            }
            ++i;
        }
    }
    
    private void k0(@androidx.annotation.j0 final ArrayList<a> list, @androidx.annotation.j0 ArrayList<Boolean> list2, int i, final int n) {
        final boolean r = list.get(i).r;
        final ArrayList<Fragment> k = this.K;
        if (k == null) {
            this.K = new ArrayList<Fragment>();
        }
        else {
            k.clear();
        }
        this.K.addAll(this.c.o());
        Fragment fragment = this.L0();
        int j = i;
        int n2 = 0;
        while (j < n) {
            final a a = list.get(j);
            if (!list2.get(j)) {
                fragment = a.b0(this.K, fragment);
            }
            else {
                fragment = a.i0(this.K, fragment);
            }
            if (n2 == 0 && !a.i) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            ++j;
        }
        this.K.clear();
        if (!r && this.q >= 1) {
            if (FragmentManager.Q) {
                for (int l = i; l < n; ++l) {
                    final Iterator<a0.a> iterator = list.get(l).c.iterator();
                    while (iterator.hasNext()) {
                        final Fragment b = ((a0.a)iterator.next()).b;
                        if (b != null && b.mFragmentManager != null) {
                            this.c.q(this.A(b));
                        }
                    }
                }
            }
            else {
                c0.C(this.r.f(), this.s, list, list2, i, n, false, this.n);
            }
        }
        j0(list, list2, i, n);
        if (FragmentManager.Q) {
            final boolean booleanValue = list2.get(n - 1);
            for (int index = i; index < n; ++index) {
                final a a2 = list.get(index);
                if (booleanValue) {
                    for (int index2 = a2.c.size() - 1; index2 >= 0; --index2) {
                        final Fragment b2 = ((a0.a)a2.c.get(index2)).b;
                        if (b2 != null) {
                            this.A(b2).m();
                        }
                    }
                }
                else {
                    final Iterator<a0.a> iterator2 = a2.c.iterator();
                    while (iterator2.hasNext()) {
                        final Fragment b3 = ((a0.a)iterator2.next()).b;
                        if (b3 != null) {
                            this.A(b3).m();
                        }
                    }
                }
            }
            this.e1(this.q, true);
            for (final i0 i2 : this.x(list, i, n)) {
                i2.r(booleanValue);
                i2.p();
                i2.g();
            }
        }
        else {
            int t1;
            if (r) {
                final androidx.collection.c<Fragment> c = new androidx.collection.c<Fragment>();
                this.h(c);
                t1 = this.t1(list, list2, i, n, c);
                this.c1(c);
            }
            else {
                t1 = n;
            }
            final ArrayList<Boolean> list3 = list2;
            if (t1 != i && r) {
                if (this.q >= 1) {
                    c0.C(this.r.f(), this.s, list, list2, i, t1, true, this.n);
                }
                list2 = list3;
                this.e1(this.q, true);
            }
            else {
                list2 = list3;
            }
        }
        while (i < n) {
            final a a3 = list.get(i);
            if (list2.get(i) && a3.N >= 0) {
                a3.N = -1;
            }
            a3.g0();
            ++i;
        }
        if (n2 != 0) {
            this.C1();
        }
    }
    
    private void m0(@k0 final ArrayList<a> list, @k0 final ArrayList<Boolean> list2) {
        final ArrayList<s> l = this.L;
        int size;
        if (l == null) {
            size = 0;
        }
        else {
            size = l.size();
        }
        int n2;
        int n3;
    Label_0241:
        for (int i = 0, n = size; i < n; i = n2 + 1, n = n3) {
            final s s = this.L.get(i);
            while (true) {
                Label_0123: {
                    if (list == null || s.a) {
                        break Label_0123;
                    }
                    final int index = list.indexOf(s.b);
                    if (index == -1 || list2 == null || !list2.get(index)) {
                        break Label_0123;
                    }
                    this.L.remove(i);
                    n2 = i - 1;
                    n3 = n - 1;
                    s.c();
                    continue Label_0241;
                }
                if (!s.e()) {
                    n3 = n;
                    n2 = i;
                    if (list == null) {
                        continue Label_0241;
                    }
                    n3 = n;
                    n2 = i;
                    if (!s.b.d0(list, 0, list.size())) {
                        continue Label_0241;
                    }
                }
                this.L.remove(i);
                n2 = i - 1;
                n3 = n - 1;
                if (list != null && !s.a) {
                    final int index2 = list.indexOf(s.b);
                    if (index2 != -1 && list2 != null && list2.get(index2)) {
                        continue;
                    }
                }
                break;
            }
            s.d();
        }
    }
    
    @androidx.annotation.j0
    public static <F extends Fragment> F o0(@androidx.annotation.j0 final View obj) {
        final Fragment t0 = t0(obj);
        if (t0 != null) {
            return (F)t0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(obj);
        sb.append(" does not have a Fragment set");
        throw new IllegalStateException(sb.toString());
    }
    
    private boolean r1(@k0 final String s, final int n, final int n2) {
        this.h0(false);
        this.g0(true);
        final Fragment u = this.u;
        if (u != null && n < 0 && s == null && u.getChildFragmentManager().o1()) {
            return true;
        }
        final boolean s2 = this.s1(this.I, this.J, s, n, n2);
        if (s2) {
            this.b = true;
            try {
                this.A1(this.I, this.J);
            }
            finally {
                this.v();
            }
        }
        this.U1();
        this.a0();
        this.c.b();
        return s2;
    }
    
    private void s(@androidx.annotation.j0 final Fragment fragment) {
        final HashSet<androidx.core.os.c> set = this.m.get(fragment);
        if (set != null) {
            final Iterator<androidx.core.os.c> iterator = set.iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
            }
            set.clear();
            this.B(fragment);
            this.m.remove(fragment);
        }
    }
    
    @androidx.annotation.j0
    static FragmentManager s0(@androidx.annotation.j0 final View view) {
        final Fragment t0 = t0(view);
        FragmentManager fragmentManager;
        if (t0 != null) {
            if (!t0.isAdded()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The Fragment ");
                sb.append(t0);
                sb.append(" that owns View ");
                sb.append(view);
                sb.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
                throw new IllegalStateException(sb.toString());
            }
            fragmentManager = t0.getChildFragmentManager();
        }
        else {
            Context context = view.getContext();
            final androidx.fragment.app.d d = null;
            androidx.fragment.app.d d2;
            while (true) {
                d2 = d;
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof androidx.fragment.app.d) {
                    d2 = (androidx.fragment.app.d)context;
                    break;
                }
                context = ((ContextWrapper)context).getBaseContext();
            }
            if (d2 == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("View ");
                sb2.append(view);
                sb2.append(" is not within a subclass of FragmentActivity.");
                throw new IllegalStateException(sb2.toString());
            }
            fragmentManager = d2.getSupportFragmentManager();
        }
        return fragmentManager;
    }
    
    @k0
    private static Fragment t0(@androidx.annotation.j0 View view) {
        while (view != null) {
            final Fragment n0 = N0(view);
            if (n0 != null) {
                return n0;
            }
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View)parent;
            }
            else {
                view = null;
            }
        }
        return null;
    }
    
    private int t1(@androidx.annotation.j0 final ArrayList<a> list, @androidx.annotation.j0 final ArrayList<Boolean> list2, final int n, final int n2, @androidx.annotation.j0 final androidx.collection.c<Fragment> c) {
        int i = n2 - 1;
        int n3 = n2;
        while (i >= n) {
            final a element = list.get(i);
            final boolean booleanValue = list2.get(i);
            final boolean b = element.f0() && !element.d0(list, i + 1, n2);
            int index = n3;
            if (b) {
                if (this.L == null) {
                    this.L = new ArrayList<s>();
                }
                final s e = new s(element, booleanValue);
                this.L.add(e);
                element.h0(e);
                if (booleanValue) {
                    element.Z();
                }
                else {
                    element.a0(false);
                }
                index = n3 - 1;
                if (i != index) {
                    list.remove(i);
                    list.add(index, element);
                }
                this.h(c);
            }
            --i;
            n3 = index;
        }
        return n3;
    }
    
    private void u() {
        if (!this.Y0()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    
    private void u0() {
        if (FragmentManager.Q) {
            final Iterator<i0> iterator = this.w().iterator();
            while (iterator.hasNext()) {
                iterator.next().k();
            }
        }
        else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }
    
    private void v() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }
    
    private boolean v0(@androidx.annotation.j0 final ArrayList<a> list, @androidx.annotation.j0 final ArrayList<Boolean> list2) {
        synchronized (this.a) {
            final boolean empty = this.a.isEmpty();
            int i = 0;
            if (empty) {
                return false;
            }
            final int size = this.a.size();
            boolean b = false;
            while (i < size) {
                b |= this.a.get(i).c(list, list2);
                ++i;
            }
            this.a.clear();
            this.r.g().removeCallbacks(this.N);
            return b;
        }
    }
    
    private Set<i0> w() {
        final HashSet<i0> set = new HashSet<i0>();
        final Iterator<v> iterator = this.c.l().iterator();
        while (iterator.hasNext()) {
            final ViewGroup mContainer = iterator.next().k().mContainer;
            if (mContainer != null) {
                set.add(i0.o(mContainer, this.M0()));
            }
        }
        return set;
    }
    
    private Set<i0> x(@androidx.annotation.j0 final ArrayList<a> list, int i, final int n) {
        final HashSet<i0> set = new HashSet<i0>();
        while (i < n) {
            final Iterator<a0.a> iterator = list.get(i).c.iterator();
            while (iterator.hasNext()) {
                final Fragment b = ((a0.a)iterator.next()).b;
                if (b != null) {
                    final ViewGroup mContainer = b.mContainer;
                    if (mContainer == null) {
                        continue;
                    }
                    set.add(i0.n(mContainer, this));
                }
            }
            ++i;
        }
        return set;
    }
    
    private void z(@androidx.annotation.j0 final Fragment fragment) {
        Label_0196: {
            if (fragment.mView != null) {
                final e.d c = androidx.fragment.app.e.c(this.r.f(), fragment, fragment.mHidden ^ true, fragment.getPopDirection());
                if (c != null) {
                    final Animator b = c.b;
                    if (b != null) {
                        b.setTarget((Object)fragment.mView);
                        if (fragment.mHidden) {
                            if (fragment.isHideReplaced()) {
                                fragment.setHideReplaced(false);
                            }
                            else {
                                final ViewGroup mContainer = fragment.mContainer;
                                final View mView = fragment.mView;
                                mContainer.startViewTransition(mView);
                                c.b.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                                    public void onAnimationEnd(final Animator animator) {
                                        mContainer.endViewTransition(mView);
                                        animator.removeListener((Animator$AnimatorListener)this);
                                        final Fragment c = fragment;
                                        final View mView = c.mView;
                                        if (mView != null && c.mHidden) {
                                            mView.setVisibility(8);
                                        }
                                    }
                                });
                            }
                        }
                        else {
                            fragment.mView.setVisibility(0);
                        }
                        c.b.start();
                        break Label_0196;
                    }
                }
                if (c != null) {
                    fragment.mView.startAnimation(c.a);
                    c.a.start();
                }
                int visibility;
                if (fragment.mHidden && !fragment.isHideReplaced()) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                fragment.mView.setVisibility(visibility);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            }
        }
        this.R0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }
    
    @androidx.annotation.j0
    v A(@androidx.annotation.j0 final Fragment fragment) {
        final v n = this.c.n(fragment.mWho);
        if (n != null) {
            return n;
        }
        final v v = new v(this.o, this.c, fragment);
        v.o(this.r.f().getClassLoader());
        v.u(this.q);
        return v;
    }
    
    @androidx.annotation.j0
    androidx.fragment.app.f B0() {
        return this.s;
    }
    
    void B1(@androidx.annotation.j0 final Fragment fragment) {
        this.M.j(fragment);
    }
    
    void C(@androidx.annotation.j0 final Fragment fragment) {
        if (T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (T0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                this.c.t(fragment);
                if (this.U0(fragment)) {
                    this.D = true;
                }
                this.P1(fragment);
            }
        }
    }
    
    @k0
    public Fragment C0(@androidx.annotation.j0 final Bundle bundle, @androidx.annotation.j0 final String str) {
        final String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        final Fragment n0 = this.n0(string);
        if (n0 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": unique id ");
            sb.append(string);
            this.S1(new IllegalStateException(sb.toString()));
        }
        return n0;
    }
    
    void D() {
        this.E = false;
        this.F = false;
        this.M.l(false);
        this.X(4);
    }
    
    void D1(@k0 final Parcelable parcelable, @k0 final androidx.fragment.app.n n) {
        if (this.r instanceof d1) {
            this.S1(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.M.k(n);
        this.E1(parcelable);
    }
    
    void E() {
        this.E = false;
        this.F = false;
        this.M.l(false);
        this.X(0);
    }
    
    @androidx.annotation.j0
    public h E0() {
        final h v = this.v;
        if (v != null) {
            return v;
        }
        final Fragment t = this.t;
        if (t != null) {
            return t.mFragmentManager.E0();
        }
        return this.w;
    }
    
    void E1(@k0 final Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        final androidx.fragment.app.o o = (androidx.fragment.app.o)parcelable;
        if (o.G == null) {
            return;
        }
        this.c.u();
        for (final u u : o.G) {
            if (u != null) {
                final Fragment c = this.M.c(u.H);
                v v;
                if (c != null) {
                    if (T0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(c);
                        Log.v("FragmentManager", sb.toString());
                    }
                    v = new v(this.o, this.c, c, u);
                }
                else {
                    v = new v(this.o, this.c, this.r.f().getClassLoader(), this.E0(), u);
                }
                final Fragment k = v.k();
                k.mFragmentManager = this;
                if (T0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(k.mWho);
                    sb2.append("): ");
                    sb2.append(k);
                    Log.v("FragmentManager", sb2.toString());
                }
                v.o(this.r.f().getClassLoader());
                this.c.q(v);
                v.u(this.q);
            }
        }
        for (final Fragment obj : this.M.f()) {
            if (!this.c.c(obj.mWho)) {
                if (T0(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(obj);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(o.G);
                    Log.v("FragmentManager", sb3.toString());
                }
                this.M.j(obj);
                obj.mFragmentManager = this;
                final v v2 = new v(this.o, this.c, obj);
                v2.u(1);
                v2.m();
                obj.mRemoving = true;
                v2.m();
            }
        }
        this.c.v(o.H);
        final b[] i = o.I;
        final int n = 0;
        if (i != null) {
            this.d = new ArrayList<a>(o.I.length);
            int j = 0;
            while (true) {
                final b[] l = o.I;
                if (j >= l.length) {
                    break;
                }
                final a a = l[j].a(this);
                if (T0(2)) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(j);
                    sb4.append(" (index ");
                    sb4.append(a.N);
                    sb4.append("): ");
                    sb4.append(a);
                    Log.v("FragmentManager", sb4.toString());
                    final PrintWriter printWriter = new PrintWriter(new h0("FragmentManager"));
                    a.Y("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(a);
                ++j;
            }
        }
        else {
            this.d = null;
        }
        this.i.set(o.J);
        final String m = o.K;
        if (m != null) {
            this.Q(this.u = this.n0(m));
        }
        final ArrayList<String> l2 = o.L;
        if (l2 != null) {
            for (int n2 = n; n2 < l2.size(); ++n2) {
                final Bundle bundle = o.M.get(n2);
                bundle.setClassLoader(this.r.f().getClassLoader());
                this.j.put(l2.get(n2), bundle);
            }
        }
        this.C = new ArrayDeque<n>(o.N);
    }
    
    void F(@androidx.annotation.j0 final Configuration configuration) {
        for (final Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }
    
    @androidx.annotation.j0
    y F0() {
        return this.c;
    }
    
    @Deprecated
    androidx.fragment.app.n F1() {
        if (this.r instanceof d1) {
            this.S1(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.M.g();
    }
    
    boolean G(@androidx.annotation.j0 final MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    @androidx.annotation.j0
    public List<Fragment> G0() {
        return this.c.o();
    }
    
    void H() {
        this.E = false;
        this.F = false;
        this.M.l(false);
        this.X(1);
    }
    
    @androidx.annotation.j0
    i<?> H0() {
        return this.r;
    }
    
    Parcelable H1() {
        this.u0();
        this.e0();
        this.h0(true);
        this.E = true;
        this.M.l(true);
        final ArrayList<u> w = this.c.w();
        final boolean empty = w.isEmpty();
        final b[] array = null;
        if (empty) {
            if (T0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        final ArrayList<String> x = this.c.x();
        final ArrayList<a> d = this.d;
        b[] i = array;
        if (d != null) {
            final int size = d.size();
            i = array;
            if (size > 0) {
                final b[] array2 = new b[size];
                int index = 0;
                while (true) {
                    i = array2;
                    if (index >= size) {
                        break;
                    }
                    array2[index] = new b(this.d.get(index));
                    if (T0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(index);
                        sb.append(": ");
                        sb.append(this.d.get(index));
                        Log.v("FragmentManager", sb.toString());
                    }
                    ++index;
                }
            }
        }
        final androidx.fragment.app.o o = new androidx.fragment.app.o();
        o.G = w;
        o.H = x;
        o.I = i;
        o.J = this.i.get();
        final Fragment u = this.u;
        if (u != null) {
            o.K = u.mWho;
        }
        o.L.addAll(this.j.keySet());
        o.M.addAll(this.j.values());
        o.N = new ArrayList<n>((Collection<? extends n>)this.C);
        return (Parcelable)o;
    }
    
    boolean I(@androidx.annotation.j0 final Menu menu, @androidx.annotation.j0 final MenuInflater menuInflater) {
        final int q = this.q;
        int i = 0;
        if (q < 1) {
            return false;
        }
        ArrayList<Fragment> e = null;
        final Iterator<Fragment> iterator = this.c.o().iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final Fragment e2 = iterator.next();
            if (e2 != null && this.V0(e2) && e2.performCreateOptionsMenu(menu, menuInflater)) {
                ArrayList<Fragment> list;
                if ((list = e) == null) {
                    list = new ArrayList<Fragment>();
                }
                list.add(e2);
                b = true;
                e = list;
            }
        }
        if (this.e != null) {
            while (i < this.e.size()) {
                final Fragment o = this.e.get(i);
                if (e == null || !e.contains(o)) {
                    o.onDestroyOptionsMenu();
                }
                ++i;
            }
        }
        this.e = e;
        return b;
    }
    
    @androidx.annotation.j0
    LayoutInflater$Factory2 I0() {
        return (LayoutInflater$Factory2)this.f;
    }
    
    @k0
    public Fragment.m I1(@androidx.annotation.j0 final Fragment obj) {
        final v n = this.c.n(obj.mWho);
        if (n == null || !n.k().equals(obj)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(obj);
            sb.append(" is not currently in the FragmentManager");
            this.S1(new IllegalStateException(sb.toString()));
        }
        return n.r();
    }
    
    void J() {
        this.h0(this.G = true);
        this.e0();
        this.X(-1);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.g != null) {
            this.h.remove();
            this.g = null;
        }
        final d<Intent> z = this.z;
        if (z != null) {
            z.d();
            this.A.d();
            this.B.d();
        }
    }
    
    @androidx.annotation.j0
    androidx.fragment.app.k J0() {
        return this.o;
    }
    
    void J1() {
        synchronized (this.a) {
            final ArrayList<s> l = this.L;
            boolean b = false;
            final boolean b2 = l != null && !l.isEmpty();
            if (this.a.size() == 1) {
                b = true;
            }
            if (b2 || b) {
                this.r.g().removeCallbacks(this.N);
                this.r.g().post(this.N);
                this.U1();
            }
        }
    }
    
    void K() {
        this.X(1);
    }
    
    @k0
    Fragment K0() {
        return this.t;
    }
    
    void K1(@androidx.annotation.j0 final Fragment fragment, final boolean b) {
        final ViewGroup d0 = this.D0(fragment);
        if (d0 != null && d0 instanceof FragmentContainerView) {
            ((FragmentContainerView)d0).setDrawDisappearingViewsLast(b ^ true);
        }
    }
    
    void L() {
        for (final Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }
    
    @k0
    public Fragment L0() {
        return this.u;
    }
    
    public void L1(@androidx.annotation.j0 final h v) {
        this.v = v;
    }
    
    void M(final boolean b) {
        for (final Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(b);
            }
        }
    }
    
    @androidx.annotation.j0
    j0 M0() {
        final j0 x = this.x;
        if (x != null) {
            return x;
        }
        final Fragment t = this.t;
        if (t != null) {
            return t.mFragmentManager.M0();
        }
        return this.y;
    }
    
    void M1(@androidx.annotation.j0 final Fragment obj, @androidx.annotation.j0 final androidx.lifecycle.s.c mMaxState) {
        if (obj.equals(this.n0(obj.mWho)) && (obj.mHost == null || obj.mFragmentManager == this)) {
            obj.mMaxState = mMaxState;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(obj);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }
    
    void N(@androidx.annotation.j0 final Fragment fragment) {
        final Iterator<androidx.fragment.app.q> iterator = this.p.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this, fragment);
        }
    }
    
    void N1(@k0 final Fragment fragment) {
        Label_0085: {
            if (fragment != null) {
                if (fragment.equals(this.n0(fragment.mWho))) {
                    if (fragment.mHost == null) {
                        break Label_0085;
                    }
                    if (fragment.mFragmentManager == this) {
                        break Label_0085;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragment);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        final Fragment u = this.u;
        this.u = fragment;
        this.Q(u);
        this.Q(this.u);
    }
    
    boolean O(@androidx.annotation.j0 final MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    @androidx.annotation.j0
    c1 O0(@androidx.annotation.j0 final Fragment fragment) {
        return this.M.h(fragment);
    }
    
    void O1(@androidx.annotation.j0 final j0 x) {
        this.x = x;
    }
    
    void P(@androidx.annotation.j0 final Menu menu) {
        if (this.q < 1) {
            return;
        }
        for (final Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }
    
    void P0() {
        this.h0(true);
        if (this.h.isEnabled()) {
            this.o1();
        }
        else {
            this.g.e();
        }
    }
    
    void Q0(@androidx.annotation.j0 final Fragment obj) {
        if (T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(obj);
            Log.v("FragmentManager", sb.toString());
        }
        if (!obj.mHidden) {
            obj.mHidden = true;
            obj.mHiddenChanged ^= true;
            this.P1(obj);
        }
    }
    
    void Q1(@androidx.annotation.j0 final Fragment obj) {
        if (T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(obj);
            Log.v("FragmentManager", sb.toString());
        }
        if (obj.mHidden) {
            obj.mHidden = false;
            obj.mHiddenChanged ^= true;
        }
    }
    
    void R() {
        this.X(5);
    }
    
    void R0(@androidx.annotation.j0 final Fragment fragment) {
        if (fragment.mAdded && this.U0(fragment)) {
            this.D = true;
        }
    }
    
    void S(final boolean b) {
        for (final Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(b);
            }
        }
    }
    
    public boolean S0() {
        return this.G;
    }
    
    boolean T(@androidx.annotation.j0 final Menu menu) {
        final int q = this.q;
        boolean b = false;
        if (q < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.o()) {
            if (fragment != null && this.V0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                b = true;
            }
        }
        return b;
    }
    
    public void T1(@androidx.annotation.j0 final m m) {
        this.o.p(m);
    }
    
    void U() {
        this.U1();
        this.Q(this.u);
    }
    
    void V() {
        this.E = false;
        this.F = false;
        this.M.l(false);
        this.X(7);
    }
    
    boolean V0(@k0 final Fragment fragment) {
        return fragment == null || fragment.isMenuVisible();
    }
    
    void W() {
        this.E = false;
        this.F = false;
        this.M.l(false);
        this.X(5);
    }
    
    boolean W0(@k0 final Fragment fragment) {
        boolean b = true;
        if (fragment == null) {
            return true;
        }
        final FragmentManager mFragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(mFragmentManager.L0()) || !this.W0(mFragmentManager.t)) {
            b = false;
        }
        return b;
    }
    
    boolean X0(final int n) {
        return this.q >= n;
    }
    
    void Y() {
        this.F = true;
        this.M.l(true);
        this.X(4);
    }
    
    public boolean Y0() {
        return this.E || this.F;
    }
    
    void Z() {
        this.X(2);
    }
    
    void Z0(@androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final String[] array, final int n) {
        if (this.B != null) {
            this.C.addLast(new n(fragment.mWho, n));
            this.B.b(array);
        }
        else {
            this.r.m(fragment, array, n);
        }
    }
    
    @Override
    public final void a(@androidx.annotation.j0 final String s, @androidx.annotation.j0 final Bundle bundle) {
        final o o = this.k.get(s);
        if (o != null && o.b(androidx.lifecycle.s.c.J)) {
            o.a(s, bundle);
        }
        else {
            this.j.put(s, bundle);
        }
    }
    
    void a1(@androidx.annotation.j0 final Fragment fragment, @SuppressLint({ "UnknownNullness" }) final Intent intent, final int n, @k0 final Bundle bundle) {
        if (this.z != null) {
            this.C.addLast(new n(fragment.mWho, n));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.z.b(intent);
        }
        else {
            this.r.q(fragment, intent, n, bundle);
        }
    }
    
    @SuppressLint({ "SyntheticAccessor" })
    @Override
    public final void b(@androidx.annotation.j0 final String s, @androidx.annotation.j0 final androidx.lifecycle.y y, @androidx.annotation.j0 final androidx.fragment.app.s s2) {
        final androidx.lifecycle.s lifecycle = y.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.s.c.G) {
            return;
        }
        final androidx.lifecycle.v v = new androidx.lifecycle.v() {
            @Override
            public void h(@androidx.annotation.j0 final androidx.lifecycle.y y, @androidx.annotation.j0 final androidx.lifecycle.s.b b) {
                if (b == androidx.lifecycle.s.b.ON_START) {
                    final Bundle bundle = FragmentManager.this.j.get(s);
                    if (bundle != null) {
                        s2.a(s, bundle);
                        FragmentManager.this.d(s);
                    }
                }
                if (b == androidx.lifecycle.s.b.ON_DESTROY) {
                    lifecycle.c(this);
                    FragmentManager.this.k.remove(s);
                }
            }
        };
        lifecycle.a(v);
        final o o = this.k.put(s, new o(lifecycle, s2, v));
        if (o != null) {
            o.c();
        }
    }
    
    public void b0(@androidx.annotation.j0 final String s, @k0 final FileDescriptor fileDescriptor, @androidx.annotation.j0 final PrintWriter printWriter, @k0 final String[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("    ");
        final String string = sb.toString();
        this.c.e(s, fileDescriptor, printWriter, array);
        final ArrayList<Fragment> e = this.e;
        final int n = 0;
        if (e != null) {
            final int size = e.size();
            if (size > 0) {
                printWriter.print(s);
                printWriter.println("Fragments Created Menus:");
                for (int i = 0; i < size; ++i) {
                    final Fragment fragment = this.e.get(i);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        final ArrayList<a> d = this.d;
        if (d != null) {
            final int size2 = d.size();
            if (size2 > 0) {
                printWriter.print(s);
                printWriter.println("Back Stack:");
                for (int j = 0; j < size2; ++j) {
                    final a a = this.d.get(j);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(j);
                    printWriter.print(": ");
                    printWriter.println(a.toString());
                    a.X(string, printWriter);
                }
            }
        }
        printWriter.print(s);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Back Stack Index: ");
        sb2.append(this.i.get());
        printWriter.println(sb2.toString());
        synchronized (this.a) {
            final int size3 = this.a.size();
            if (size3 > 0) {
                printWriter.print(s);
                printWriter.println("Pending Actions:");
                for (int k = n; k < size3; ++k) {
                    final q x = this.a.get(k);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(k);
                    printWriter.print(": ");
                    printWriter.println(x);
                }
            }
            // monitorexit(this.a)
            printWriter.print(s);
            printWriter.println("FragmentManager misc state:");
            printWriter.print(s);
            printWriter.print("  mHost=");
            printWriter.println(this.r);
            printWriter.print(s);
            printWriter.print("  mContainer=");
            printWriter.println(this.s);
            if (this.t != null) {
                printWriter.print(s);
                printWriter.print("  mParent=");
                printWriter.println(this.t);
            }
            printWriter.print(s);
            printWriter.print("  mCurState=");
            printWriter.print(this.q);
            printWriter.print(" mStateSaved=");
            printWriter.print(this.E);
            printWriter.print(" mStopped=");
            printWriter.print(this.F);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.G);
            if (this.D) {
                printWriter.print(s);
                printWriter.print("  mNeedMenuInvalidate=");
                printWriter.println(this.D);
            }
        }
    }
    
    void b1(@androidx.annotation.j0 final Fragment fragment, @SuppressLint({ "UnknownNullness" }) final IntentSender intentSender, final int n, @k0 Intent obj, final int n2, final int n3, final int n4, @k0 final Bundle obj2) throws IntentSender$SendIntentException {
        if (this.A != null) {
            if (obj2 != null) {
                if (obj == null) {
                    obj = new Intent();
                    obj.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                if (T0(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("ActivityOptions ");
                    sb.append(obj2);
                    sb.append(" were added to fillInIntent ");
                    sb.append(obj);
                    sb.append(" for fragment ");
                    sb.append(fragment);
                    Log.v("FragmentManager", sb.toString());
                }
                obj.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", obj2);
            }
            final f a = new f.b(intentSender).b(obj).c(n3, n2).a();
            this.C.addLast(new n(fragment.mWho, n));
            if (T0(2)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(fragment);
                sb2.append("is launching an IntentSender for result ");
                Log.v("FragmentManager", sb2.toString());
            }
            this.A.b(a);
        }
        else {
            this.r.r(fragment, intentSender, n, obj, n2, n3, n4, obj2);
        }
    }
    
    @Override
    public final void c(@androidx.annotation.j0 final String s) {
        final o o = this.k.remove(s);
        if (o != null) {
            o.c();
        }
    }
    
    @Override
    public final void d(@androidx.annotation.j0 final String s) {
        this.j.remove(s);
    }
    
    void d1(@androidx.annotation.j0 final Fragment obj) {
        if (!this.c.c(obj.mWho)) {
            if (T0(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignoring moving ");
                sb.append(obj);
                sb.append(" to state ");
                sb.append(this.q);
                sb.append("since it is not added to ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            return;
        }
        this.f1(obj);
        final View mView = obj.mView;
        if (mView != null && obj.mIsNewlyAdded && obj.mContainer != null) {
            final float mPostponedAlpha = obj.mPostponedAlpha;
            if (mPostponedAlpha > 0.0f) {
                mView.setAlpha(mPostponedAlpha);
            }
            obj.mPostponedAlpha = 0.0f;
            obj.mIsNewlyAdded = false;
            final e.d c = androidx.fragment.app.e.c(this.r.f(), obj, true, obj.getPopDirection());
            if (c != null) {
                final Animation a = c.a;
                if (a != null) {
                    obj.mView.startAnimation(a);
                }
                else {
                    c.b.setTarget((Object)obj.mView);
                    c.b.start();
                }
            }
        }
        if (obj.mHiddenChanged) {
            this.z(obj);
        }
    }
    
    void e1(int q, final boolean b) {
        if (this.r == null && q != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!b && q == this.q) {
            return;
        }
        this.q = q;
        if (FragmentManager.Q) {
            this.c.s();
        }
        else {
            final Iterator<Fragment> iterator = this.c.o().iterator();
            while (iterator.hasNext()) {
                this.d1(iterator.next());
            }
            for (final v v : this.c.l()) {
                final Fragment k = v.k();
                if (!k.mIsNewlyAdded) {
                    this.d1(k);
                }
                if (k.mRemoving && !k.isInBackStack()) {
                    q = 1;
                }
                else {
                    q = 0;
                }
                if (q != 0) {
                    this.c.r(v);
                }
            }
        }
        this.R1();
        if (this.D) {
            final i<?> r = this.r;
            if (r != null && this.q == 7) {
                r.s();
                this.D = false;
            }
        }
    }
    
    void f0(@androidx.annotation.j0 final q e, final boolean b) {
        if (!b) {
            if (this.r == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            else {
                this.u();
            }
        }
        synchronized (this.a) {
            if (this.r != null) {
                this.a.add(e);
                this.J1();
                return;
            }
            if (b) {
                return;
            }
            throw new IllegalStateException("Activity has been destroyed");
        }
    }
    
    void f1(@androidx.annotation.j0 final Fragment fragment) {
        this.g1(fragment, this.q);
    }
    
    void g1(@androidx.annotation.j0 final Fragment obj, int min) {
        final v n = this.c.n(obj.mWho);
        final int n2 = 1;
        v v = n;
        if (n == null) {
            v = new v(this.o, this.c, obj);
            v.u(1);
        }
        int max = min;
        if (obj.mFromLayout) {
            max = min;
            if (obj.mInLayout) {
                max = min;
                if (obj.mState == 2) {
                    max = Math.max(min, 2);
                }
            }
        }
        min = Math.min(max, v.d());
        final int mState = obj.mState;
        int n3 = 0;
        Label_0687: {
            if (mState <= min) {
                if (mState < min && !this.m.isEmpty()) {
                    this.s(obj);
                }
                final int mState2 = obj.mState;
                Label_0236: {
                    Label_0226: {
                        Label_0216: {
                            Label_0196: {
                                if (mState2 != -1) {
                                    if (mState2 != 0) {
                                        if (mState2 == 1) {
                                            break Label_0196;
                                        }
                                        if (mState2 == 2) {
                                            break Label_0216;
                                        }
                                        if (mState2 == 4) {
                                            break Label_0226;
                                        }
                                        if (mState2 != 5) {
                                            n3 = min;
                                            break Label_0687;
                                        }
                                        break Label_0236;
                                    }
                                }
                                else if (min > -1) {
                                    v.c();
                                }
                                if (min > 0) {
                                    v.e();
                                }
                            }
                            if (min > -1) {
                                v.j();
                            }
                            if (min > 1) {
                                v.f();
                            }
                        }
                        if (min > 2) {
                            v.a();
                        }
                    }
                    if (min > 4) {
                        v.v();
                    }
                }
                if ((n3 = min) > 5) {
                    v.p();
                    n3 = min;
                }
            }
            else if (mState > (n3 = min)) {
                if (mState != 0) {
                    if (mState != 1) {
                        if (mState != 2) {
                            if (mState != 4) {
                                if (mState != 5) {
                                    if (mState != 7) {
                                        n3 = min;
                                        break Label_0687;
                                    }
                                    if (min < 7) {
                                        v.n();
                                    }
                                }
                                if (min < 5) {
                                    v.w();
                                }
                            }
                            if (min < 4) {
                                if (T0(3)) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("movefrom ACTIVITY_CREATED: ");
                                    sb.append(obj);
                                    Log.d("FragmentManager", sb.toString());
                                }
                                if (obj.mView != null && this.r.n(obj) && obj.mSavedViewState == null) {
                                    v.t();
                                }
                            }
                        }
                        if (min < 2) {
                            final e.d d = null;
                            final View mView = obj.mView;
                            if (mView != null) {
                                final ViewGroup mContainer = obj.mContainer;
                                if (mContainer != null) {
                                    mContainer.endViewTransition(mView);
                                    obj.mView.clearAnimation();
                                    if (!obj.isRemovingParent()) {
                                        e.d c = d;
                                        if (this.q > -1) {
                                            c = d;
                                            if (!this.G) {
                                                c = d;
                                                if (obj.mView.getVisibility() == 0) {
                                                    c = d;
                                                    if (obj.mPostponedAlpha >= 0.0f) {
                                                        c = androidx.fragment.app.e.c(this.r.f(), obj, false, obj.getPopDirection());
                                                    }
                                                }
                                            }
                                        }
                                        obj.mPostponedAlpha = 0.0f;
                                        final ViewGroup mContainer2 = obj.mContainer;
                                        final View mView2 = obj.mView;
                                        if (c != null) {
                                            androidx.fragment.app.e.a(obj, c, this.n);
                                        }
                                        mContainer2.removeView(mView2);
                                        if (T0(2)) {
                                            final StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Removing view ");
                                            sb2.append(mView2);
                                            sb2.append(" for fragment ");
                                            sb2.append(obj);
                                            sb2.append(" from container ");
                                            sb2.append(mContainer2);
                                            Log.v("FragmentManager", sb2.toString());
                                        }
                                        if (mContainer2 != obj.mContainer) {
                                            return;
                                        }
                                    }
                                }
                            }
                            if (this.m.get(obj) == null) {
                                v.h();
                            }
                        }
                    }
                    if (min < 1) {
                        if (this.m.get(obj) != null) {
                            min = n2;
                        }
                        else {
                            v.g();
                        }
                    }
                }
                if (min < 0) {
                    v.i();
                }
                n3 = min;
            }
        }
        if (obj.mState != n3) {
            if (T0(3)) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("moveToState: Fragment state for ");
                sb3.append(obj);
                sb3.append(" not updated inline; expected state ");
                sb3.append(n3);
                sb3.append(" found ");
                sb3.append(obj.mState);
                Log.d("FragmentManager", sb3.toString());
            }
            obj.mState = n3;
        }
    }
    
    boolean h0(boolean b) {
        this.g0(b);
        b = false;
        while (this.v0(this.I, this.J)) {
            this.b = true;
            try {
                this.A1(this.I, this.J);
                this.v();
                b = true;
                continue;
            }
            finally {
                this.v();
            }
            break;
        }
        this.U1();
        this.a0();
        this.c.b();
        return b;
    }
    
    void h1() {
        if (this.r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.l(false);
        for (final Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }
    
    void i(final a e) {
        if (this.d == null) {
            this.d = new ArrayList<a>();
        }
        this.d.add(e);
    }
    
    void i0(@androidx.annotation.j0 final q q, final boolean b) {
        if (b && (this.r == null || this.G)) {
            return;
        }
        this.g0(b);
        if (q.c(this.I, this.J)) {
            this.b = true;
            try {
                this.A1(this.I, this.J);
            }
            finally {
                this.v();
            }
        }
        this.U1();
        this.a0();
        this.c.b();
    }
    
    void i1(@androidx.annotation.j0 final FragmentContainerView mContainer) {
        for (final v v : this.c.l()) {
            final Fragment k = v.k();
            if (k.mContainerId == mContainer.getId()) {
                final View mView = k.mView;
                if (mView == null || mView.getParent() != null) {
                    continue;
                }
                k.mContainer = (ViewGroup)mContainer;
                v.b();
            }
        }
    }
    
    void j(@androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final androidx.core.os.c e) {
        if (this.m.get(fragment) == null) {
            this.m.put(fragment, new HashSet<androidx.core.os.c>());
        }
        this.m.get(fragment).add(e);
    }
    
    @Deprecated
    @androidx.annotation.j0
    @t0({ t0.a.I })
    public a0 j1() {
        return this.r();
    }
    
    v k(@androidx.annotation.j0 final Fragment obj) {
        if (T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(obj);
            Log.v("FragmentManager", sb.toString());
        }
        final v a = this.A(obj);
        obj.mFragmentManager = this;
        this.c.q(a);
        if (!obj.mDetached) {
            this.c.a(obj);
            obj.mRemoving = false;
            if (obj.mView == null) {
                obj.mHiddenChanged = false;
            }
            if (this.U0(obj)) {
                this.D = true;
            }
        }
        return a;
    }
    
    void k1(@androidx.annotation.j0 final v v) {
        final Fragment k = v.k();
        if (k.mDeferStart) {
            if (this.b) {
                this.H = true;
                return;
            }
            k.mDeferStart = false;
            if (FragmentManager.Q) {
                v.m();
            }
            else {
                this.f1(k);
            }
        }
    }
    
    public void l(@androidx.annotation.j0 final androidx.fragment.app.q e) {
        this.p.add(e);
    }
    
    public boolean l0() {
        final boolean h0 = this.h0(true);
        this.u0();
        return h0;
    }
    
    public void l1() {
        this.f0((q)new r(null, -1, 0), false);
    }
    
    public void m(@androidx.annotation.j0 final p e) {
        if (this.l == null) {
            this.l = new ArrayList<p>();
        }
        this.l.add(e);
    }
    
    public void m1(final int i, final int n) {
        if (i >= 0) {
            this.f0((q)new r(null, i, n), false);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    void n(@androidx.annotation.j0 final Fragment fragment) {
        this.M.a(fragment);
    }
    
    @k0
    Fragment n0(@androidx.annotation.j0 final String s) {
        return this.c.f(s);
    }
    
    public void n1(@k0 final String s, final int n) {
        this.f0((q)new r(s, -1, n), false);
    }
    
    int o() {
        return this.i.getAndIncrement();
    }
    
    public boolean o1() {
        return this.r1(null, -1, 0);
    }
    
    @SuppressLint({ "SyntheticAccessor" })
    void p(@androidx.annotation.j0 final i<?> r, @androidx.annotation.j0 final androidx.fragment.app.f s, @k0 final Fragment t) {
        if (this.r == null) {
            this.r = r;
            this.s = s;
            Label_0059: {
                androidx.fragment.app.q q;
                if ((this.t = t) != null) {
                    q = new androidx.fragment.app.q() {
                        @Override
                        public void a(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment) {
                            t.onAttachFragment(fragment);
                        }
                    };
                }
                else {
                    if (!(r instanceof androidx.fragment.app.q)) {
                        break Label_0059;
                    }
                    q = (androidx.fragment.app.q)r;
                }
                this.l(q);
            }
            if (this.t != null) {
                this.U1();
            }
            if (r instanceof androidx.activity.e) {
                Object o = r;
                final OnBackPressedDispatcher onBackPressedDispatcher = ((androidx.activity.e)o).getOnBackPressedDispatcher();
                this.g = onBackPressedDispatcher;
                if (t != null) {
                    o = t;
                }
                onBackPressedDispatcher.b((androidx.lifecycle.y)o, this.h);
            }
            androidx.fragment.app.p m;
            if (t != null) {
                m = t.mFragmentManager.A0(t);
            }
            else if (r instanceof d1) {
                m = androidx.fragment.app.p.e(((d1)r).getViewModelStore());
            }
            else {
                m = new androidx.fragment.app.p(false);
            }
            (this.M = m).l(this.Y0());
            this.c.y(this.M);
            final i<?> r2 = this.r;
            if (r2 instanceof androidx.activity.result.e) {
                final ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.e)r2).getActivityResultRegistry();
                String string;
                if (t != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(t.mWho);
                    sb.append(":");
                    string = sb.toString();
                }
                else {
                    string = "";
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentManager:");
                sb2.append(string);
                final String string2 = sb2.toString();
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append("StartActivityForResult");
                this.z = activityResultRegistry.i(sb3.toString(), (androidx.activity.result.contract.a<Intent, Object>)new androidx.activity.result.contract.b.j(), (androidx.activity.result.b<Object>)new androidx.activity.result.b<androidx.activity.result.a>() {
                    public void b(final androidx.activity.result.a a) {
                        final n n = FragmentManager.this.C.pollFirst();
                        if (n == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("No Activities were started for result for ");
                            sb.append(this);
                            Log.w("FragmentManager", sb.toString());
                            return;
                        }
                        final String g = n.G;
                        final int h = n.H;
                        final Fragment i = FragmentManager.this.c.i(g);
                        if (i == null) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Activity result delivered for unknown Fragment ");
                            sb2.append(g);
                            Log.w("FragmentManager", sb2.toString());
                            return;
                        }
                        i.onActivityResult(h, a.b(), a.a());
                    }
                });
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string2);
                sb4.append("StartIntentSenderForResult");
                this.A = activityResultRegistry.i(sb4.toString(), (androidx.activity.result.contract.a<f, Object>)new l(), (androidx.activity.result.b<Object>)new androidx.activity.result.b<androidx.activity.result.a>() {
                    public void b(final androidx.activity.result.a a) {
                        final n n = FragmentManager.this.C.pollFirst();
                        if (n == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("No IntentSenders were started for ");
                            sb.append(this);
                            Log.w("FragmentManager", sb.toString());
                            return;
                        }
                        final String g = n.G;
                        final int h = n.H;
                        final Fragment i = FragmentManager.this.c.i(g);
                        if (i == null) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Intent Sender result delivered for unknown Fragment ");
                            sb2.append(g);
                            Log.w("FragmentManager", sb2.toString());
                            return;
                        }
                        i.onActivityResult(h, a.b(), a.a());
                    }
                });
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string2);
                sb5.append("RequestPermissions");
                this.B = activityResultRegistry.i(sb5.toString(), (androidx.activity.result.contract.a<String[], Object>)new androidx.activity.result.contract.b.h(), (androidx.activity.result.b<Object>)new androidx.activity.result.b<Map<String, Boolean>>() {
                    @SuppressLint({ "SyntheticAccessor" })
                    public void b(final Map<String, Boolean> map) {
                        final String[] array = map.keySet().toArray(new String[0]);
                        final ArrayList<Boolean> list = new ArrayList<Boolean>(map.values());
                        final int[] array2 = new int[list.size()];
                        for (int i = 0; i < list.size(); ++i) {
                            int n;
                            if (list.get(i)) {
                                n = 0;
                            }
                            else {
                                n = -1;
                            }
                            array2[i] = n;
                        }
                        final n n2 = FragmentManager.this.C.pollFirst();
                        StringBuilder sb;
                        if (n2 == null) {
                            sb = new StringBuilder();
                            sb.append("No permissions were requested for ");
                            sb.append(this);
                        }
                        else {
                            final String g = n2.G;
                            final int h = n2.H;
                            final Fragment j = FragmentManager.this.c.i(g);
                            if (j != null) {
                                j.onRequestPermissionsResult(h, array, array2);
                                return;
                            }
                            sb = new StringBuilder();
                            sb.append("Permission request result delivered for unknown Fragment ");
                            sb.append(g);
                        }
                        Log.w("FragmentManager", sb.toString());
                    }
                });
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }
    
    @k0
    public Fragment p0(@androidx.annotation.y final int n) {
        return this.c.g(n);
    }
    
    public boolean p1(final int i, final int n) {
        if (i >= 0) {
            return this.r1(null, i, n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    void q(@androidx.annotation.j0 final Fragment fragment) {
        if (T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.c.a(fragment);
                if (T0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                if (this.U0(fragment)) {
                    this.D = true;
                }
            }
        }
    }
    
    @k0
    public Fragment q0(@k0 final String s) {
        return this.c.h(s);
    }
    
    public boolean q1(@k0 final String s, final int n) {
        return this.r1(s, -1, n);
    }
    
    @androidx.annotation.j0
    public a0 r() {
        return new a(this);
    }
    
    Fragment r0(@androidx.annotation.j0 final String s) {
        return this.c.i(s);
    }
    
    boolean s1(@androidx.annotation.j0 final ArrayList<a> list, @androidx.annotation.j0 final ArrayList<Boolean> list2, @k0 final String s, int index, int i) {
        final ArrayList<a> d = this.d;
        if (d == null) {
            return false;
        }
        if (s == null && index < 0 && (i & 0x1) == 0x0) {
            index = d.size() - 1;
            if (index < 0) {
                return false;
            }
            list.add(this.d.remove(index));
            list2.add(Boolean.TRUE);
        }
        else {
            if (s == null && index < 0) {
                index = -1;
            }
            else {
                int j;
                for (j = d.size() - 1; j >= 0; --j) {
                    final a a = this.d.get(j);
                    if (s != null && s.equals(a.getName())) {
                        break;
                    }
                    if (index >= 0 && index == a.N) {
                        break;
                    }
                }
                if (j < 0) {
                    return false;
                }
                int n = j;
                if ((i & 0x1) != 0x0) {
                    while (true) {
                        i = j - 1;
                        if ((n = i) < 0) {
                            break;
                        }
                        final a a2 = this.d.get(i);
                        if (s != null) {
                            j = i;
                            if (s.equals(a2.getName())) {
                                continue;
                            }
                        }
                        n = i;
                        if (index < 0) {
                            break;
                        }
                        n = i;
                        if (index != a2.N) {
                            break;
                        }
                        j = i;
                    }
                }
                index = n;
            }
            if (index == this.d.size() - 1) {
                return false;
            }
            for (i = this.d.size() - 1; i > index; --i) {
                list.add(this.d.remove(i));
                list2.add(Boolean.TRUE);
            }
        }
        return true;
    }
    
    boolean t() {
        final Iterator<Fragment> iterator = this.c.m().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Fragment fragment = iterator.next();
            int u0 = n;
            if (fragment != null) {
                u0 = (this.U0(fragment) ? 1 : 0);
            }
            if ((n = u0) != 0) {
                return true;
            }
        }
        return false;
    }
    
    @androidx.annotation.j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        final Fragment t = this.t;
        Label_0141: {
            Object o;
            if (t != null) {
                sb.append(t.getClass().getSimpleName());
                sb.append("{");
                o = this.t;
            }
            else {
                final i<?> r = this.r;
                if (r == null) {
                    sb.append("null");
                    break Label_0141;
                }
                sb.append(r.getClass().getSimpleName());
                sb.append("{");
                o = this.r;
            }
            sb.append(Integer.toHexString(System.identityHashCode(o)));
            sb.append("}");
        }
        sb.append("}}");
        return sb.toString();
    }
    
    public void u1(@androidx.annotation.j0 final Bundle bundle, @androidx.annotation.j0 final String s, @androidx.annotation.j0 final Fragment obj) {
        if (obj.mFragmentManager != this) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(obj);
            sb.append(" is not currently in the FragmentManager");
            this.S1(new IllegalStateException(sb.toString()));
        }
        bundle.putString(s, obj.mWho);
    }
    
    public void v1(@androidx.annotation.j0 final m m, final boolean b) {
        this.o.o(m, b);
    }
    
    int w0() {
        return this.c.k();
    }
    
    void w1(@androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final androidx.core.os.c o) {
        final HashSet<androidx.core.os.c> set = this.m.get(fragment);
        if (set != null && set.remove(o) && set.isEmpty()) {
            this.m.remove(fragment);
            if (fragment.mState < 5) {
                this.B(fragment);
                this.f1(fragment);
            }
        }
    }
    
    @androidx.annotation.j0
    List<Fragment> x0() {
        return this.c.m();
    }
    
    void x1(@androidx.annotation.j0 final Fragment obj) {
        if (T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(obj);
            sb.append(" nesting=");
            sb.append(obj.mBackStackNesting);
            Log.v("FragmentManager", sb.toString());
        }
        final boolean inBackStack = obj.isInBackStack();
        if (!obj.mDetached || (inBackStack ^ true)) {
            this.c.t(obj);
            if (this.U0(obj)) {
                this.D = true;
            }
            obj.mRemoving = true;
            this.P1(obj);
        }
    }
    
    void y(@androidx.annotation.j0 final a e, final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            e.a0(b3);
        }
        else {
            e.Z();
        }
        final ArrayList<a> list = new ArrayList<a>(1);
        final ArrayList<Boolean> list2 = new ArrayList<Boolean>(1);
        list.add(e);
        list2.add(b);
        if (b2 && this.q >= 1) {
            c0.C(this.r.f(), this.s, list, list2, 0, 1, true, this.n);
        }
        if (b3) {
            this.e1(this.q, true);
        }
        for (final Fragment fragment : this.c.m()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && e.c0(fragment.mContainerId)) {
                final float mPostponedAlpha = fragment.mPostponedAlpha;
                if (mPostponedAlpha > 0.0f) {
                    fragment.mView.setAlpha(mPostponedAlpha);
                }
                if (b3) {
                    fragment.mPostponedAlpha = 0.0f;
                }
                else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }
    
    @androidx.annotation.j0
    public k y0(final int index) {
        return (k)this.d.get(index);
    }
    
    public void y1(@androidx.annotation.j0 final androidx.fragment.app.q o) {
        this.p.remove(o);
    }
    
    public int z0() {
        final ArrayList<a> d = this.d;
        int size;
        if (d != null) {
            size = d.size();
        }
        else {
            size = 0;
        }
        return size;
    }
    
    public void z1(@androidx.annotation.j0 final p o) {
        final ArrayList<p> l = this.l;
        if (l != null) {
            l.remove(o);
        }
    }
    
    public interface k
    {
        @Deprecated
        @k0
        CharSequence a();
        
        int b();
        
        @Deprecated
        @w0
        int d();
        
        @Deprecated
        @w0
        int e();
        
        @Deprecated
        @k0
        CharSequence f();
        
        @k0
        String getName();
    }
    
    static class l extends androidx.activity.result.contract.a<f, androidx.activity.result.a>
    {
        @androidx.annotation.j0
        public Intent d(@androidx.annotation.j0 final Context context, final f f) {
            final Intent obj = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            final Intent a = f.a();
            f a2 = f;
            if (a != null) {
                final Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2 = f;
                if (bundleExtra != null) {
                    obj.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    a2 = f;
                    if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        a2 = new f.b(f.d()).b(null).c(f.c(), f.b()).a();
                    }
                }
            }
            obj.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)a2);
            if (FragmentManager.T0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(obj);
                Log.v("FragmentManager", sb.toString());
            }
            return obj;
        }
        
        @androidx.annotation.j0
        public androidx.activity.result.a e(final int n, @k0 final Intent intent) {
            return new androidx.activity.result.a(n, intent);
        }
    }
    
    public abstract static class m
    {
        @Deprecated
        public void a(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment, @k0 final Bundle bundle) {
        }
        
        public void b(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final Context context) {
        }
        
        public void c(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment, @k0 final Bundle bundle) {
        }
        
        public void d(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment) {
        }
        
        public void e(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment) {
        }
        
        public void f(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment) {
        }
        
        public void g(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final Context context) {
        }
        
        public void h(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment, @k0 final Bundle bundle) {
        }
        
        public void i(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment) {
        }
        
        public void j(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final Bundle bundle) {
        }
        
        public void k(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment) {
        }
        
        public void l(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment) {
        }
        
        public void m(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final View view, @k0 final Bundle bundle) {
        }
        
        public void n(@androidx.annotation.j0 final FragmentManager fragmentManager, @androidx.annotation.j0 final Fragment fragment) {
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    static class n implements Parcelable
    {
        public static final Parcelable$Creator<n> CREATOR;
        String G;
        int H;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<n>() {
                public n a(final Parcel parcel) {
                    return new n(parcel);
                }
                
                public n[] b(final int n) {
                    return new n[n];
                }
            };
        }
        
        n(@androidx.annotation.j0 final Parcel parcel) {
            this.G = parcel.readString();
            this.H = parcel.readInt();
        }
        
        n(@androidx.annotation.j0 final String g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.G);
            parcel.writeInt(this.H);
        }
    }
    
    private static class o implements s
    {
        private final s a;
        private final s b;
        private final androidx.lifecycle.v c;
        
        o(@androidx.annotation.j0 final s a, @androidx.annotation.j0 final s b, @androidx.annotation.j0 final androidx.lifecycle.v c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public void a(@androidx.annotation.j0 final String s, @androidx.annotation.j0 final Bundle bundle) {
            this.b.a(s, bundle);
        }
        
        public boolean b(final androidx.lifecycle.s.c c) {
            return this.a.b().b(c);
        }
        
        public void c() {
            this.a.c(this.c);
        }
    }
    
    public interface p
    {
        @g0
        void a();
    }
    
    interface q
    {
        boolean c(@androidx.annotation.j0 final ArrayList<a> p0, @androidx.annotation.j0 final ArrayList<Boolean> p1);
    }
    
    private class r implements q
    {
        final String a;
        final int b;
        final int c;
        
        r(final String a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public boolean c(@androidx.annotation.j0 final ArrayList<a> list, @androidx.annotation.j0 final ArrayList<Boolean> list2) {
            final Fragment u = FragmentManager.this.u;
            return (u == null || this.b >= 0 || this.a != null || !u.getChildFragmentManager().o1()) && FragmentManager.this.s1(list, list2, this.a, this.b, this.c);
        }
    }
    
    static class s implements Fragment.l
    {
        final boolean a;
        final a b;
        private int c;
        
        s(@androidx.annotation.j0 final a b, final boolean a) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void a() {
            ++this.c;
        }
        
        @Override
        public void b() {
            final int c = this.c - 1;
            this.c = c;
            if (c != 0) {
                return;
            }
            this.b.L.J1();
        }
        
        void c() {
            final a b = this.b;
            b.L.y(b, this.a, false, false);
        }
        
        void d() {
            final boolean b = this.c > 0;
            for (final Fragment fragment : this.b.L.G0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (b && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            final a b2 = this.b;
            b2.L.y(b2, this.a, b ^ true, true);
        }
        
        public boolean e() {
            return this.c == 0;
        }
    }
}
