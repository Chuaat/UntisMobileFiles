// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import android.net.Uri;
import androidx.core.app.c0;
import androidx.lifecycle.d1;
import androidx.lifecycle.c1;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.t0;
import java.util.Map;
import android.util.Log;
import android.content.Intent;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import androidx.annotation.k0;
import android.content.ContextWrapper;
import java.util.Iterator;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import java.util.ArrayDeque;
import androidx.activity.c;
import androidx.lifecycle.x;
import java.util.concurrent.CopyOnWriteArrayList;
import androidx.lifecycle.y;
import java.util.Deque;
import android.os.Parcelable;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.j0;

public class NavController
{
    private static final String p = "NavController";
    private static final String q = "android-support-nav:controller:navigatorState";
    private static final String r = "android-support-nav:controller:navigatorState:names";
    private static final String s = "android-support-nav:controller:backStack";
    static final String t = "android-support-nav:controller:deepLinkIds";
    static final String u = "android-support-nav:controller:deepLinkExtras";
    static final String v = "android-support-nav:controller:deepLinkHandled";
    @j0
    public static final String w = "android-support-nav:controller:deepLinkIntent";
    private final Context a;
    private Activity b;
    private n0 c;
    e0 d;
    private Bundle e;
    private Parcelable[] f;
    private boolean g;
    final Deque<q> h;
    private y i;
    private t j;
    private v0 k;
    private final CopyOnWriteArrayList<b> l;
    private final x m;
    private final c n;
    private boolean o;
    
    public NavController(@j0 Context baseContext) {
        this.h = new ArrayDeque<q>();
        this.k = new v0();
        this.l = new CopyOnWriteArrayList<b>();
        this.m = new v() {
            @Override
            public void h(@j0 final y y, @j0 final s.b b) {
                final NavController g = NavController.this;
                if (g.d != null) {
                    final Iterator<q> iterator = g.h.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().f(b);
                    }
                }
            }
        };
        this.n = new c(false) {
            @Override
            public void handleOnBackPressed() {
                NavController.this.I();
            }
        };
        this.o = true;
        this.a = baseContext;
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                this.b = (Activity)baseContext;
                break;
            }
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
        final v0 k = this.k;
        k.a(new i0(k));
        this.k.a(new d(this.a));
    }
    
    private void C(@j0 a0 a0, @k0 final Bundle bundle, @k0 final o0 o0, @k0 final u0.a a2) {
        final int n = 0;
        final boolean b = o0 != null && o0.e() != -1 && this.K(o0.e(), o0.f());
        final u0<a0> e = this.k.e(a0.r());
        final Bundle i = a0.i(bundle);
        final a0 b2 = e.b(a0, i, o0, a2);
        int n2;
        if (b2 != null) {
            if (!(b2 instanceof i)) {
                while (!this.h.isEmpty() && this.h.peekLast().b() instanceof i && this.K(this.h.peekLast().b().p(), true)) {}
            }
            final ArrayDeque<q> arrayDeque = new ArrayDeque<q>();
            if (a0 instanceof e0) {
                a0 t = b2;
                do {
                    t = t.t();
                    if (t != null) {
                        arrayDeque.addFirst(new q(this.a, t, i, this.i, this.j));
                        if (!this.h.isEmpty() && this.h.getLast().b() == t) {
                            this.K(t.p(), true);
                        }
                    }
                    if (t == null) {
                        break;
                    }
                } while (t != a0);
            }
            if (arrayDeque.isEmpty()) {
                a0 = b2;
            }
            else {
                a0 = arrayDeque.getFirst().b();
            }
            while (a0 != null && this.e(a0.p()) == null) {
                final e0 t2 = a0.t();
                if ((a0 = t2) != null) {
                    arrayDeque.addFirst(new q(this.a, t2, i, this.i, this.j));
                    a0 = t2;
                }
            }
            if (arrayDeque.isEmpty()) {
                a0 = b2;
            }
            else {
                a0 = arrayDeque.getLast().b();
            }
            while (!this.h.isEmpty() && this.h.getLast().b() instanceof e0 && ((e0)this.h.getLast().b()).O(a0.p(), false) == null && this.K(this.h.getLast().b().p(), true)) {}
            this.h.addAll(arrayDeque);
            if (this.h.isEmpty() || this.h.getFirst().b() != this.d) {
                this.h.addFirst(new q(this.a, this.d, i, this.i, this.j));
            }
            this.h.add(new q(this.a, b2, b2.i(i), this.i, this.j));
            n2 = n;
        }
        else {
            n2 = n;
            if (o0 != null) {
                n2 = n;
                if (o0.g()) {
                    final q q = this.h.peekLast();
                    if (q != null) {
                        q.g(i);
                    }
                    n2 = 1;
                }
            }
        }
        this.W();
        if (b || b2 != null || n2 != 0) {
            this.c();
        }
    }
    
    private void H(@k0 final Bundle bundle) {
        final Bundle e = this.e;
        if (e != null) {
            final ArrayList stringArrayList = e.getStringArrayList("android-support-nav:controller:navigatorState:names");
            if (stringArrayList != null) {
                for (final String s : stringArrayList) {
                    final u0 e2 = this.k.e(s);
                    final Bundle bundle2 = this.e.getBundle(s);
                    if (bundle2 != null) {
                        e2.c(bundle2);
                    }
                }
            }
        }
        final Parcelable[] f = this.f;
        final boolean b = false;
        if (f != null) {
            for (int length = f.length, i = 0; i < length; ++i) {
                final r r = (r)f[i];
                final a0 e3 = this.e(r.b());
                if (e3 == null) {
                    final String o = a0.o(this.a, r.b());
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Restoring the Navigation back stack failed: destination ");
                    sb.append(o);
                    sb.append(" cannot be found from the current destination ");
                    sb.append(this.k());
                    throw new IllegalStateException(sb.toString());
                }
                final Bundle a = r.a();
                if (a != null) {
                    a.setClassLoader(this.a.getClassLoader());
                }
                this.h.add(new q(this.a, e3, a, this.i, this.j, r.d(), r.c()));
            }
            this.W();
            this.f = null;
        }
        if (this.d != null && this.h.isEmpty()) {
            int n = b ? 1 : 0;
            if (!this.g) {
                final Activity b2 = this.b;
                n = (b ? 1 : 0);
                if (b2 != null) {
                    n = (b ? 1 : 0);
                    if (this.r(b2.getIntent())) {
                        n = 1;
                    }
                }
            }
            if (n == 0) {
                this.C(this.d, bundle, null, null);
            }
        }
        else {
            this.c();
        }
    }
    
    private void W() {
        final c n = this.n;
        final boolean o = this.o;
        boolean enabled = true;
        if (!o || this.l() <= 1) {
            enabled = false;
        }
        n.setEnabled(enabled);
    }
    
    private boolean c() {
        while (!this.h.isEmpty() && this.h.peekLast().b() instanceof e0 && this.K(this.h.peekLast().b().p(), true)) {}
        if (!this.h.isEmpty()) {
            a0 a0 = this.h.peekLast().b();
            a0 a3;
            final a0 a2 = a3 = null;
            if (a0 instanceof i) {
                final Iterator<q> descendingIterator = this.h.descendingIterator();
                do {
                    a3 = a2;
                    if (!descendingIterator.hasNext()) {
                        break;
                    }
                    a3 = descendingIterator.next().b();
                } while (a3 instanceof e0 || a3 instanceof i);
            }
            final HashMap<q, s.c> hashMap = new HashMap<q, s.c>();
            final Iterator<q> descendingIterator2 = this.h.descendingIterator();
            while (descendingIterator2.hasNext()) {
                final q q = descendingIterator2.next();
                final s.c c = q.c();
                final a0 b = q.b();
                if (a0 != null && b.p() == a0.p()) {
                    final s.c k = androidx.lifecycle.s.c.K;
                    if (c != k) {
                        hashMap.put(q, k);
                    }
                    a0 = a0.t();
                }
                else if (a3 != null && b.p() == a3.p()) {
                    if (c == androidx.lifecycle.s.c.K) {
                        q.i(androidx.lifecycle.s.c.J);
                    }
                    else {
                        final s.c j = androidx.lifecycle.s.c.J;
                        if (c != j) {
                            hashMap.put(q, j);
                        }
                    }
                    a3 = a3.t();
                }
                else {
                    q.i(androidx.lifecycle.s.c.I);
                }
            }
            for (final q key : this.h) {
                final s.c c2 = hashMap.get(key);
                if (c2 != null) {
                    key.i(c2);
                }
                else {
                    key.j();
                }
            }
            final q q2 = this.h.peekLast();
            final Iterator<b> iterator2 = this.l.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().a(this, q2.b(), q2.a());
            }
            return true;
        }
        return false;
    }
    
    @k0
    private String f(@j0 final int[] array) {
        e0 d = this.d;
        int n = 0;
        while (true) {
            final int length = array.length;
            a0 a0 = null;
            if (n >= length) {
                return null;
            }
            final int n2 = array[n];
            if (n == 0) {
                if (this.d.p() == n2) {
                    a0 = this.d;
                }
            }
            else {
                a0 = d.N(n2);
            }
            if (a0 == null) {
                return androidx.navigation.a0.o(this.a, n2);
            }
            if (n != array.length - 1) {
                e0 e0;
                for (e0 = (e0)a0; e0.N(e0.R()) instanceof e0; e0 = (e0)e0.N(e0.R())) {}
                d = e0;
            }
            ++n;
        }
    }
    
    private int l() {
        final Iterator<q> iterator = this.h.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (!(iterator.next().b() instanceof e0)) {
                ++n;
            }
        }
        return n;
    }
    
    public void A(@j0 final z z, @k0 final o0 o0) {
        this.B(z, o0, null);
    }
    
    public void B(@j0 final z obj, @k0 final o0 o0, @k0 final u0.a a) {
        final a0.b x = this.d.x(obj);
        if (x != null) {
            Bundle i;
            if ((i = x.d().i(x.f())) == null) {
                i = new Bundle();
            }
            final a0 d = x.d();
            final Intent intent = new Intent();
            intent.setDataAndType(obj.c(), obj.b());
            intent.setAction(obj.a());
            i.putParcelable("android-support-nav:controller:deepLinkIntent", (Parcelable)intent);
            this.C(d, i, o0, a);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Navigation destination that matches request ");
        sb.append(obj);
        sb.append(" cannot be found in the navigation graph ");
        sb.append(this.d);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void D(@j0 final d0 d0) {
        this.t(d0.getActionId(), d0.getArguments());
    }
    
    public void E(@j0 final d0 d0, @k0 final o0 o0) {
        this.u(d0.getActionId(), d0.getArguments(), o0);
    }
    
    public void F(@j0 final d0 d0, @j0 final u0.a a) {
        this.v(d0.getActionId(), d0.getArguments(), null, a);
    }
    
    public boolean G() {
        if (this.l() == 1) {
            a0 k = this.k();
            e0 t;
            int p;
            do {
                p = k.p();
                t = k.t();
                if (t == null) {
                    return false;
                }
                k = t;
            } while (t.R() == p);
            final Bundle bundle = new Bundle();
            final Activity b = this.b;
            if (b != null && b.getIntent() != null && this.b.getIntent().getData() != null) {
                bundle.putParcelable("android-support-nav:controller:deepLinkIntent", (Parcelable)this.b.getIntent());
                final a0.b x = this.d.x(new z(this.b.getIntent()));
                if (x != null) {
                    bundle.putAll(x.d().i(x.f()));
                }
            }
            new androidx.navigation.v(this).g(t.p()).d(bundle).b().v();
            final Activity b2 = this.b;
            if (b2 != null) {
                b2.finish();
            }
            return true;
        }
        return this.I();
    }
    
    public boolean I() {
        return !this.h.isEmpty() && this.J(this.k().p(), true);
    }
    
    public boolean J(@androidx.annotation.y final int n, final boolean b) {
        return this.K(n, b) && this.c();
    }
    
    boolean K(@androidx.annotation.y final int n, final boolean b) {
        final boolean empty = this.h.isEmpty();
        final boolean b2 = false;
        if (empty) {
            return false;
        }
        final ArrayList<u0> list = new ArrayList<u0>();
        final Iterator<q> descendingIterator = this.h.descendingIterator();
        while (true) {
            while (descendingIterator.hasNext()) {
                final a0 b3 = descendingIterator.next().b();
                final u0 e = this.k.e(b3.r());
                if (b || b3.p() != n) {
                    list.add(e);
                }
                if (b3.p() == n) {
                    final boolean b4 = true;
                    if (!b4) {
                        final String o = a0.o(this.a, n);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Ignoring popBackStack to destination ");
                        sb.append(o);
                        sb.append(" as it was not found on the current back stack");
                        Log.i("NavController", sb.toString());
                        return false;
                    }
                    final Iterator<u0> iterator = list.iterator();
                    boolean b5 = b2;
                    while (iterator.hasNext() && iterator.next().e()) {
                        final q q = this.h.removeLast();
                        if (q.getLifecycle().b().b(androidx.lifecycle.s.c.I)) {
                            q.i(androidx.lifecycle.s.c.G);
                        }
                        final t j = this.j;
                        if (j != null) {
                            j.a(q.L);
                        }
                        b5 = true;
                    }
                    this.W();
                    return b5;
                }
            }
            final boolean b4 = false;
            continue;
        }
    }
    
    public void L(@j0 final b o) {
        this.l.remove(o);
    }
    
    @androidx.annotation.i
    public void M(@k0 final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.a.getClassLoader());
        this.e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }
    
    @androidx.annotation.i
    @k0
    public Bundle N() {
        final ArrayList<String> list = new ArrayList<String>();
        final Bundle bundle = new Bundle();
        for (final Map.Entry<String, u0<? extends a0>> entry : this.k.f().entrySet()) {
            final String e = entry.getKey();
            final Bundle d = entry.getValue().d();
            if (d != null) {
                list.add(e);
                bundle.putBundle(e, d);
            }
        }
        Bundle bundle2;
        if (!list.isEmpty()) {
            bundle2 = new Bundle();
            bundle.putStringArrayList("android-support-nav:controller:navigatorState:names", (ArrayList)list);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle);
        }
        else {
            bundle2 = null;
        }
        Bundle bundle3 = bundle2;
        if (!this.h.isEmpty()) {
            if ((bundle3 = bundle2) == null) {
                bundle3 = new Bundle();
            }
            final Parcelable[] array = new Parcelable[this.h.size()];
            int n = 0;
            final Iterator<q> iterator2 = this.h.iterator();
            while (iterator2.hasNext()) {
                array[n] = (Parcelable)new r(iterator2.next());
                ++n;
            }
            bundle3.putParcelableArray("android-support-nav:controller:backStack", array);
        }
        Bundle bundle4 = bundle3;
        if (this.g) {
            if ((bundle4 = bundle3) == null) {
                bundle4 = new Bundle();
            }
            bundle4.putBoolean("android-support-nav:controller:deepLinkHandled", this.g);
        }
        return bundle4;
    }
    
    @androidx.annotation.i
    public void O(@androidx.annotation.i0 final int n) {
        this.P(n, null);
    }
    
    @androidx.annotation.i
    public void P(@androidx.annotation.i0 final int n, @k0 final Bundle bundle) {
        this.R(this.n().c(n), bundle);
    }
    
    @androidx.annotation.i
    public void Q(@j0 final e0 e0) {
        this.R(e0, null);
    }
    
    @androidx.annotation.i
    public void R(@j0 final e0 d, @k0 final Bundle bundle) {
        final e0 d2 = this.d;
        if (d2 != null) {
            this.K(d2.p(), true);
        }
        this.d = d;
        this.H(bundle);
    }
    
    void S(@j0 final y i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        i.getLifecycle().a(this.m);
    }
    
    @t0({ t0.a.H })
    public void T(@j0 final v0 k) {
        if (this.h.isEmpty()) {
            this.k = k;
            return;
        }
        throw new IllegalStateException("NavigatorProvider must be set before setGraph call");
    }
    
    void U(@j0 final OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.i != null) {
            this.n.remove();
            onBackPressedDispatcher.b(this.i, this.n);
            this.i.getLifecycle().c(this.m);
            this.i.getLifecycle().a(this.m);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }
    
    void V(@j0 final c1 c1) {
        if (this.j == androidx.navigation.t.b(c1)) {
            return;
        }
        if (this.h.isEmpty()) {
            this.j = androidx.navigation.t.b(c1);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
    }
    
    public void a(@j0 final b e) {
        if (!this.h.isEmpty()) {
            final q q = this.h.peekLast();
            e.a(this, q.b(), q.a());
        }
        this.l.add(e);
    }
    
    @j0
    public androidx.navigation.v b() {
        return new androidx.navigation.v(this);
    }
    
    void d(final boolean o) {
        this.o = o;
        this.W();
    }
    
    a0 e(@androidx.annotation.y final int n) {
        final e0 d = this.d;
        if (d == null) {
            return null;
        }
        if (d.p() == n) {
            return this.d;
        }
        a0 a0;
        if (this.h.isEmpty()) {
            a0 = this.d;
        }
        else {
            a0 = this.h.getLast().b();
        }
        e0 t;
        if (a0 instanceof e0) {
            t = (e0)a0;
        }
        else {
            t = a0.t();
        }
        return t.N(n);
    }
    
    @j0
    @t0({ t0.a.H })
    public Deque<q> g() {
        return this.h;
    }
    
    @j0
    public q h(@androidx.annotation.y final int i) {
        final Iterator<q> descendingIterator = this.h.descendingIterator();
        while (true) {
            while (descendingIterator.hasNext()) {
                final q q = descendingIterator.next();
                if (q.b().p() == i) {
                    if (q != null) {
                        return q;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No destination with ID ");
                    sb.append(i);
                    sb.append(" is on the NavController's back stack. The current destination is ");
                    sb.append(this.k());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            final q q = null;
            continue;
        }
    }
    
    @j0
    Context i() {
        return this.a;
    }
    
    @k0
    public q j() {
        if (this.h.isEmpty()) {
            return null;
        }
        return this.h.getLast();
    }
    
    @k0
    public a0 k() {
        final q j = this.j();
        a0 b;
        if (j != null) {
            b = j.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    @j0
    public e0 m() {
        final e0 d = this.d;
        if (d != null) {
            return d;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }
    
    @j0
    public n0 n() {
        if (this.c == null) {
            this.c = new n0(this.a, this.k);
        }
        return this.c;
    }
    
    @j0
    public v0 o() {
        return this.k;
    }
    
    @k0
    public q p() {
        final Iterator<q> descendingIterator = this.h.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            final q q = descendingIterator.next();
            if (!(q.b() instanceof e0)) {
                return q;
            }
        }
        return null;
    }
    
    @j0
    public d1 q(@androidx.annotation.y final int i) {
        if (this.j == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().");
        }
        final q h = this.h(i);
        if (h.b() instanceof e0) {
            return h;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No NavGraph with ID ");
        sb.append(i);
        sb.append(" is on the NavController's back stack");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public boolean r(@k0 final Intent obj) {
        if (obj == null) {
            return false;
        }
        final Bundle extras = obj.getExtras();
        int[] intArray;
        if (extras != null) {
            intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        }
        else {
            intArray = null;
        }
        final Bundle bundle = new Bundle();
        Bundle bundle2;
        if (extras != null) {
            bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        }
        else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        int[] k = null;
        Label_0131: {
            if (intArray != null) {
                k = intArray;
                if (intArray.length != 0) {
                    break Label_0131;
                }
            }
            k = intArray;
            if (obj.getData() != null) {
                final a0.b x = this.d.x(new z(obj));
                k = intArray;
                if (x != null) {
                    final a0 d = x.d();
                    k = d.k();
                    bundle.putAll(d.i(x.f()));
                }
            }
        }
        if (k == null || k.length == 0) {
            return false;
        }
        final String f = this.f(k);
        if (f != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not find destination ");
            sb.append(f);
            sb.append(" in the navigation graph, ignoring the deep link from ");
            sb.append(obj);
            Log.i("NavController", sb.toString());
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", (Parcelable)obj);
        final int flags = obj.getFlags();
        final int n = 0x10000000 & flags;
        if (n != 0 && (flags & 0x8000) == 0x0) {
            obj.addFlags(32768);
            c0.l(this.a).f(obj).v();
            final Activity b = this.b;
            if (b != null) {
                b.finish();
                this.b.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (n != 0) {
            if (!this.h.isEmpty()) {
                this.K(this.d.p(), true);
            }
            for (int i = 0; i < k.length; ++i) {
                final int n2 = k[i];
                final a0 e = this.e(n2);
                if (e == null) {
                    final String o = a0.o(this.a, n2);
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Deep Linking failed: destination ");
                    sb2.append(o);
                    sb2.append(" cannot be found from the current destination ");
                    sb2.append(this.k());
                    throw new IllegalStateException(sb2.toString());
                }
                this.C(e, bundle, new o0.a().b(0).c(0).a(), null);
            }
            return true;
        }
        e0 d2 = this.d;
        for (int j = 0; j < k.length; ++j) {
            final int n3 = k[j];
            a0 a0;
            if (j == 0) {
                a0 = this.d;
            }
            else {
                a0 = d2.N(n3);
            }
            if (a0 == null) {
                final String o2 = androidx.navigation.a0.o(this.a, n3);
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Deep Linking failed: destination ");
                sb3.append(o2);
                sb3.append(" cannot be found in graph ");
                sb3.append(d2);
                throw new IllegalStateException(sb3.toString());
            }
            if (j != k.length - 1) {
                for (d2 = (e0)a0; d2.N(d2.R()) instanceof e0; d2 = (e0)d2.N(d2.R())) {}
            }
            else {
                this.C(a0, a0.i(bundle), new o0.a().g(this.d.p(), true).b(0).c(0).a(), null);
            }
        }
        return this.g = true;
    }
    
    public void s(@androidx.annotation.y final int n) {
        this.t(n, null);
    }
    
    public void t(@androidx.annotation.y final int n, @k0 final Bundle bundle) {
        this.u(n, bundle, null);
    }
    
    public void u(@androidx.annotation.y final int n, @k0 final Bundle bundle, @k0 final o0 o0) {
        this.v(n, bundle, o0, null);
    }
    
    public void v(@androidx.annotation.y final int n, @k0 final Bundle bundle, @k0 final o0 o0, @k0 final u0.a a) {
        a0 a2;
        if (this.h.isEmpty()) {
            a2 = this.d;
        }
        else {
            a2 = this.h.getLast().b();
        }
        if (a2 == null) {
            throw new IllegalStateException("no current navigation node");
        }
        final j l = a2.l(n);
        final Bundle bundle2 = null;
        Bundle bundle3;
        int n2;
        o0 o2;
        if (l != null) {
            o0 c;
            if ((c = o0) == null) {
                c = l.c();
            }
            final int b = l.b();
            final Bundle a3 = l.a();
            bundle3 = bundle2;
            n2 = b;
            o2 = c;
            if (a3 != null) {
                bundle3 = new Bundle();
                bundle3.putAll(a3);
                n2 = b;
                o2 = c;
            }
        }
        else {
            n2 = n;
            o2 = o0;
            bundle3 = bundle2;
        }
        Bundle bundle4 = bundle3;
        if (bundle != null) {
            if ((bundle4 = bundle3) == null) {
                bundle4 = new Bundle();
            }
            bundle4.putAll(bundle);
        }
        if (n2 == 0 && o2 != null && o2.e() != -1) {
            this.J(o2.e(), o2.f());
            return;
        }
        if (n2 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        final a0 e = this.e(n2);
        if (e != null) {
            this.C(e, bundle4, o2, a);
            return;
        }
        final String o3 = a0.o(this.a, n2);
        if (l != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Navigation destination ");
            sb.append(o3);
            sb.append(" referenced from action ");
            sb.append(a0.o(this.a, n));
            sb.append(" cannot be found from the current destination ");
            sb.append(a2);
            throw new IllegalArgumentException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Navigation action/destination ");
        sb2.append(o3);
        sb2.append(" cannot be found from the current destination ");
        sb2.append(a2);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public void w(@j0 final Uri uri) {
        this.z(new z(uri, null, null));
    }
    
    public void x(@j0 final Uri uri, @k0 final o0 o0) {
        this.A(new z(uri, null, null), o0);
    }
    
    public void y(@j0 final Uri uri, @k0 final o0 o0, @k0 final u0.a a) {
        this.B(new z(uri, null, null), o0, a);
    }
    
    public void z(@j0 final z z) {
        this.A(z, null);
    }
    
    public interface b
    {
        void a(@j0 final NavController p0, @j0 final a0 p1, @k0 final Bundle p2);
    }
}
