// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import java.lang.reflect.Modifier;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.x0;
import androidx.lifecycle.s;
import androidx.annotation.b;
import androidx.annotation.a;
import androidx.annotation.w0;
import androidx.annotation.y;
import android.os.Bundle;
import androidx.annotation.j0;
import androidx.annotation.k0;
import java.util.ArrayList;

public abstract class a0
{
    static final int A = 7;
    static final int B = 8;
    static final int C = 9;
    static final int D = 10;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = -1;
    public static final int H = 0;
    public static final int I = 4097;
    public static final int J = 8194;
    public static final int K = 4099;
    static final int t = 0;
    static final int u = 1;
    static final int v = 2;
    static final int w = 3;
    static final int x = 4;
    static final int y = 5;
    static final int z = 6;
    private final h a;
    private final ClassLoader b;
    ArrayList<a> c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    boolean j;
    @k0
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList<String> p;
    ArrayList<String> q;
    boolean r;
    ArrayList<Runnable> s;
    
    @Deprecated
    public a0() {
        this.c = new ArrayList<a>();
        this.j = true;
        this.r = false;
        this.a = null;
        this.b = null;
    }
    
    a0(@j0 final h a, @k0 final ClassLoader b) {
        this.c = new ArrayList<a>();
        this.j = true;
        this.r = false;
        this.a = a;
        this.b = b;
    }
    
    @j0
    private Fragment v(@j0 final Class<? extends Fragment> clazz, @k0 final Bundle arguments) {
        final h a = this.a;
        if (a == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        final ClassLoader b = this.b;
        if (b != null) {
            final Fragment a2 = a.a(b, clazz.getName());
            if (arguments != null) {
                a2.setArguments(arguments);
            }
            return a2;
        }
        throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
    }
    
    public boolean A() {
        return this.j;
    }
    
    public boolean B() {
        return this.c.isEmpty();
    }
    
    @j0
    public a0 C(@j0 final Fragment fragment) {
        this.n(new a(3, fragment));
        return this;
    }
    
    @j0
    public a0 D(@y final int n, @j0 final Fragment fragment) {
        return this.E(n, fragment, null);
    }
    
    @j0
    public a0 E(@y final int n, @j0 final Fragment fragment, @k0 final String s) {
        if (n != 0) {
            this.y(n, fragment, s, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
    
    @j0
    public final a0 F(@y final int n, @j0 final Class<? extends Fragment> clazz, @k0 final Bundle bundle) {
        return this.G(n, clazz, bundle, null);
    }
    
    @j0
    public final a0 G(@y final int n, @j0 final Class<? extends Fragment> clazz, @k0 final Bundle bundle, @k0 final String s) {
        return this.E(n, this.v(clazz, bundle), s);
    }
    
    @j0
    public a0 H(@j0 final Runnable e) {
        this.x();
        if (this.s == null) {
            this.s = new ArrayList<Runnable>();
        }
        this.s.add(e);
        return this;
    }
    
    @Deprecated
    @j0
    public a0 I(final boolean b) {
        return this.R(b);
    }
    
    @Deprecated
    @j0
    public a0 J(@w0 final int n) {
        this.n = n;
        this.o = null;
        return this;
    }
    
    @Deprecated
    @j0
    public a0 K(@k0 final CharSequence o) {
        this.n = 0;
        this.o = o;
        return this;
    }
    
    @Deprecated
    @j0
    public a0 L(@w0 final int l) {
        this.l = l;
        this.m = null;
        return this;
    }
    
    @Deprecated
    @j0
    public a0 M(@k0 final CharSequence m) {
        this.l = 0;
        this.m = m;
        return this;
    }
    
    @j0
    public a0 N(@androidx.annotation.a @b final int n, @androidx.annotation.a @b final int n2) {
        return this.O(n, n2, 0, 0);
    }
    
    @j0
    public a0 O(@androidx.annotation.a @b final int d, @androidx.annotation.a @b final int e, @androidx.annotation.a @b final int f, @androidx.annotation.a @b final int g) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        return this;
    }
    
    @j0
    public a0 P(@j0 final Fragment fragment, @j0 final s.c c) {
        this.n(new a(10, fragment, c));
        return this;
    }
    
    @j0
    public a0 Q(@k0 final Fragment fragment) {
        this.n(new a(8, fragment));
        return this;
    }
    
    @j0
    public a0 R(final boolean r) {
        this.r = r;
        return this;
    }
    
    @j0
    public a0 S(final int h) {
        this.h = h;
        return this;
    }
    
    @Deprecated
    @j0
    public a0 T(@x0 final int n) {
        return this;
    }
    
    @j0
    public a0 U(@j0 final Fragment fragment) {
        this.n(new a(5, fragment));
        return this;
    }
    
    @j0
    public a0 g(@y final int n, @j0 final Fragment fragment) {
        this.y(n, fragment, null, 1);
        return this;
    }
    
    @j0
    public a0 h(@y final int n, @j0 final Fragment fragment, @k0 final String s) {
        this.y(n, fragment, s, 1);
        return this;
    }
    
    @j0
    public final a0 i(@y final int n, @j0 final Class<? extends Fragment> clazz, @k0 final Bundle bundle) {
        return this.g(n, this.v(clazz, bundle));
    }
    
    @j0
    public final a0 j(@y final int n, @j0 final Class<? extends Fragment> clazz, @k0 final Bundle bundle, @k0 final String s) {
        return this.h(n, this.v(clazz, bundle), s);
    }
    
    a0 k(@j0 final ViewGroup mContainer, @j0 final Fragment fragment, @k0 final String s) {
        fragment.mContainer = mContainer;
        return this.h(mContainer.getId(), fragment, s);
    }
    
    @j0
    public a0 l(@j0 final Fragment fragment, @k0 final String s) {
        this.y(0, fragment, s, 1);
        return this;
    }
    
    @j0
    public final a0 m(@j0 final Class<? extends Fragment> clazz, @k0 final Bundle bundle, @k0 final String s) {
        return this.l(this.v(clazz, bundle), s);
    }
    
    void n(final a e) {
        this.c.add(e);
        e.c = this.d;
        e.d = this.e;
        e.e = this.f;
        e.f = this.g;
    }
    
    @j0
    public a0 o(@j0 final View view, @j0 final String e) {
        if (c0.D()) {
            final String w0 = androidx.core.view.j0.w0(view);
            if (w0 == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.p == null) {
                this.p = new ArrayList<String>();
                this.q = new ArrayList<String>();
            }
            else {
                if (this.q.contains(e)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("A shared element with the target name '");
                    sb.append(e);
                    sb.append("' has already been added to the transaction.");
                    throw new IllegalArgumentException(sb.toString());
                }
                if (this.p.contains(w0)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("A shared element with the source name '");
                    sb2.append(w0);
                    sb2.append("' has already been added to the transaction.");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            this.p.add(w0);
            this.q.add(e);
        }
        return this;
    }
    
    @j0
    public a0 p(@k0 final String k) {
        if (this.j) {
            this.i = true;
            this.k = k;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }
    
    @j0
    public a0 q(@j0 final Fragment fragment) {
        this.n(new a(7, fragment));
        return this;
    }
    
    public abstract int r();
    
    public abstract int s();
    
    public abstract void t();
    
    public abstract void u();
    
    @j0
    public a0 w(@j0 final Fragment fragment) {
        this.n(new a(6, fragment));
        return this;
    }
    
    @j0
    public a0 x() {
        if (!this.i) {
            this.j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
    
    void y(final int mContainerId, final Fragment obj, @k0 final String str, final int n) {
        final Class<? extends Fragment> class1 = obj.getClass();
        final int modifiers = class1.getModifiers();
        if (!class1.isAnonymousClass() && Modifier.isPublic(modifiers) && (!class1.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                final String mTag = obj.mTag;
                if (mTag != null && !str.equals(mTag)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't change tag of fragment ");
                    sb.append(obj);
                    sb.append(": was ");
                    sb.append(obj.mTag);
                    sb.append(" now ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
                obj.mTag = str;
            }
            if (mContainerId != 0) {
                if (mContainerId == -1) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Can't add fragment ");
                    sb2.append(obj);
                    sb2.append(" with tag ");
                    sb2.append(str);
                    sb2.append(" to container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final int mFragmentId = obj.mFragmentId;
                if (mFragmentId != 0 && mFragmentId != mContainerId) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(obj);
                    sb3.append(": was ");
                    sb3.append(obj.mFragmentId);
                    sb3.append(" now ");
                    sb3.append(mContainerId);
                    throw new IllegalStateException(sb3.toString());
                }
                obj.mFragmentId = mContainerId;
                obj.mContainerId = mContainerId;
            }
            this.n(new a(n, obj));
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(class1.getCanonicalName());
        sb4.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(sb4.toString());
    }
    
    @j0
    public a0 z(@j0 final Fragment fragment) {
        this.n(new a(4, fragment));
        return this;
    }
    
    static final class a
    {
        int a;
        Fragment b;
        int c;
        int d;
        int e;
        int f;
        s.c g;
        s.c h;
        
        a() {
        }
        
        a(final int a, final Fragment b) {
            this.a = a;
            this.b = b;
            final s.c k = s.c.K;
            this.g = k;
            this.h = k;
        }
        
        a(final int a, @j0 final Fragment b, final s.c h) {
            this.a = a;
            this.b = b;
            this.g = b.mMaxState;
            this.h = h;
        }
    }
}
