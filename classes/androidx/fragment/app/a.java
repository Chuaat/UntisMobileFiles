// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import java.util.ArrayList;
import java.io.Writer;
import java.io.PrintWriter;
import android.util.Log;
import androidx.annotation.k0;
import androidx.lifecycle.s;
import androidx.annotation.j0;

final class a extends a0 implements k, q
{
    private static final String O = "FragmentManager";
    final FragmentManager L;
    boolean M;
    int N;
    
    a(@j0 final FragmentManager l) {
        final h e0 = l.E0();
        ClassLoader classLoader;
        if (l.H0() != null) {
            classLoader = l.H0().f().getClassLoader();
        }
        else {
            classLoader = null;
        }
        super(e0, classLoader);
        this.N = -1;
        this.L = l;
    }
    
    private static boolean e0(final a0.a a) {
        final Fragment b = a.b;
        return b != null && b.mAdded && b.mView != null && !b.mDetached && !b.mHidden && b.isPostponed();
    }
    
    @Override
    public boolean B() {
        return super.c.isEmpty();
    }
    
    @j0
    @Override
    public a0 C(@j0 final Fragment fragment) {
        final FragmentManager mFragmentManager = fragment.mFragmentManager;
        if (mFragmentManager != null && mFragmentManager != this.L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        return super.C(fragment);
    }
    
    @j0
    @Override
    public a0 P(@j0 final Fragment fragment, @j0 final androidx.lifecycle.s.c c) {
        if (fragment.mFragmentManager != this.L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.L);
            throw new IllegalArgumentException(sb.toString());
        }
        if (c == s.c.H && fragment.mState > -1) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set maximum Lifecycle to ");
            sb2.append(c);
            sb2.append(" after the Fragment has been created");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (c != s.c.G) {
            return super.P(fragment, c);
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Cannot set maximum Lifecycle to ");
        sb3.append(c);
        sb3.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        throw new IllegalArgumentException(sb3.toString());
    }
    
    @j0
    @Override
    public a0 Q(@k0 final Fragment fragment) {
        if (fragment != null) {
            final FragmentManager mFragmentManager = fragment.mFragmentManager;
            if (mFragmentManager != null) {
                if (mFragmentManager != this.L) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
                    sb.append(fragment.toString());
                    sb.append(" is already attached to a FragmentManager.");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        return super.Q(fragment);
    }
    
    @j0
    @Override
    public a0 U(@j0 final Fragment fragment) {
        final FragmentManager mFragmentManager = fragment.mFragmentManager;
        if (mFragmentManager != null && mFragmentManager != this.L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        return super.U(fragment);
    }
    
    void V(final int i) {
        if (!super.i) {
            return;
        }
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Bump nesting in ");
            sb.append(this);
            sb.append(" by ");
            sb.append(i);
            Log.v("FragmentManager", sb.toString());
        }
        for (int size = super.c.size(), j = 0; j < size; ++j) {
            final a0.a a = super.c.get(j);
            final Fragment b = a.b;
            if (b != null) {
                b.mBackStackNesting += i;
                if (FragmentManager.T0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bump nesting of ");
                    sb2.append(a.b);
                    sb2.append(" to ");
                    sb2.append(a.b.mBackStackNesting);
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
    }
    
    int W(final boolean b) {
        if (!this.M) {
            if (FragmentManager.T0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                final PrintWriter printWriter = new PrintWriter(new h0("FragmentManager"));
                this.X("  ", printWriter);
                printWriter.close();
            }
            this.M = true;
            int o;
            if (super.i) {
                o = this.L.o();
            }
            else {
                o = -1;
            }
            this.N = o;
            this.L.f0((FragmentManager.q)this, b);
            return this.N;
        }
        throw new IllegalStateException("commit already called");
    }
    
    public void X(final String s, final PrintWriter printWriter) {
        this.Y(s, printWriter, true);
    }
    
    public void Y(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(super.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.N);
            printWriter.print(" mCommitted=");
            printWriter.println(this.M);
            if (super.h != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(super.h));
            }
            if (super.d != 0 || super.e != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(super.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(super.e));
            }
            if (super.f != 0 || super.g != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(super.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(super.g));
            }
            if (super.l != 0 || super.m != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(super.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(super.m);
            }
            if (super.n != 0 || super.o != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(super.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(super.o);
            }
        }
        if (!super.c.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Operations:");
            for (int size = super.c.size(), i = 0; i < size; ++i) {
                final a0.a a = super.c.get(i);
                String string = null;
                switch (a.a) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(a.a);
                        string = sb.toString();
                        break;
                    }
                    case 10: {
                        string = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string = "ATTACH";
                        break;
                    }
                    case 6: {
                        string = "DETACH";
                        break;
                    }
                    case 5: {
                        string = "SHOW";
                        break;
                    }
                    case 4: {
                        string = "HIDE";
                        break;
                    }
                    case 3: {
                        string = "REMOVE";
                        break;
                    }
                    case 2: {
                        string = "REPLACE";
                        break;
                    }
                    case 1: {
                        string = "ADD";
                        break;
                    }
                    case 0: {
                        string = "NULL";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string);
                printWriter.print(" ");
                printWriter.println(a.b);
                if (b) {
                    if (a.c != 0 || a.d != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(a.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(a.d));
                    }
                    if (a.e != 0 || a.f != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(a.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(a.f));
                    }
                }
            }
        }
    }
    
    void Z() {
        for (int size = super.c.size(), i = 0; i < size; ++i) {
            final a0.a a = super.c.get(i);
            final Fragment b = a.b;
            if (b != null) {
                b.setPopDirection(false);
                b.setNextTransition(super.h);
                b.setSharedElementNames(super.p, super.q);
            }
            switch (a.a) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(a.a);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 10: {
                    this.L.M1(b, a.h);
                    break;
                }
                case 9: {
                    this.L.N1(null);
                    break;
                }
                case 8: {
                    this.L.N1(b);
                    break;
                }
                case 7: {
                    b.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.K1(b, false);
                    this.L.q(b);
                    break;
                }
                case 6: {
                    b.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.C(b);
                    break;
                }
                case 5: {
                    b.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.K1(b, false);
                    this.L.Q1(b);
                    break;
                }
                case 4: {
                    b.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.Q0(b);
                    break;
                }
                case 3: {
                    b.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.x1(b);
                    break;
                }
                case 1: {
                    b.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.K1(b, false);
                    this.L.k(b);
                    break;
                }
            }
            if (!super.r && a.a != 1 && b != null && !FragmentManager.Q) {
                this.L.d1(b);
            }
        }
        if (!super.r && !FragmentManager.Q) {
            final FragmentManager l = this.L;
            l.e1(l.q, true);
        }
    }
    
    @k0
    @Override
    public CharSequence a() {
        if (super.l != 0) {
            return this.L.H0().f().getText(super.l);
        }
        return super.m;
    }
    
    void a0(final boolean b) {
        for (int i = super.c.size() - 1; i >= 0; --i) {
            final a0.a a = super.c.get(i);
            final Fragment b2 = a.b;
            if (b2 != null) {
                b2.setPopDirection(true);
                b2.setNextTransition(FragmentManager.G1(super.h));
                b2.setSharedElementNames(super.q, super.p);
            }
            switch (a.a) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(a.a);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 10: {
                    this.L.M1(b2, a.g);
                    break;
                }
                case 9: {
                    this.L.N1(b2);
                    break;
                }
                case 8: {
                    this.L.N1(null);
                    break;
                }
                case 7: {
                    b2.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.K1(b2, true);
                    this.L.C(b2);
                    break;
                }
                case 6: {
                    b2.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.q(b2);
                    break;
                }
                case 5: {
                    b2.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.K1(b2, true);
                    this.L.Q0(b2);
                    break;
                }
                case 4: {
                    b2.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.Q1(b2);
                    break;
                }
                case 3: {
                    b2.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.k(b2);
                    break;
                }
                case 1: {
                    b2.setAnimations(a.c, a.d, a.e, a.f);
                    this.L.K1(b2, true);
                    this.L.x1(b2);
                    break;
                }
            }
            if (!super.r && a.a != 3 && b2 != null && !FragmentManager.Q) {
                this.L.d1(b2);
            }
        }
        if (!super.r && b && !FragmentManager.Q) {
            final FragmentManager l = this.L;
            l.e1(l.q, true);
        }
    }
    
    @Override
    public int b() {
        return this.N;
    }
    
    Fragment b0(final ArrayList<Fragment> list, Fragment b) {
        int i = 0;
        Fragment fragment = b;
        while (i < super.c.size()) {
            final a0.a a = super.c.get(i);
            final int a2 = a.a;
            int n = 0;
            Label_0441: {
                if (a2 != 1) {
                    if (a2 != 2) {
                        if (a2 != 3 && a2 != 6) {
                            if (a2 != 7) {
                                if (a2 != 8) {
                                    b = fragment;
                                    n = i;
                                    break Label_0441;
                                }
                                super.c.add(i, new a0.a(9, fragment));
                                n = i + 1;
                                b = a.b;
                                break Label_0441;
                            }
                        }
                        else {
                            list.remove(a.b);
                            final Fragment b2 = a.b;
                            b = fragment;
                            n = i;
                            if (b2 == fragment) {
                                super.c.add(i, new a0.a(9, b2));
                                n = i + 1;
                                b = null;
                            }
                            break Label_0441;
                        }
                    }
                    else {
                        final Fragment b3 = a.b;
                        final int mContainerId = b3.mContainerId;
                        int j = list.size() - 1;
                        int n2 = 0;
                        n = i;
                        b = fragment;
                        while (j >= 0) {
                            final Fragment o = list.get(j);
                            Fragment fragment2 = b;
                            int index = n;
                            int n3 = n2;
                            if (o.mContainerId == mContainerId) {
                                if (o == b3) {
                                    n3 = 1;
                                    fragment2 = b;
                                    index = n;
                                }
                                else {
                                    fragment2 = b;
                                    index = n;
                                    if (o == b) {
                                        super.c.add(n, new a0.a(9, o));
                                        index = n + 1;
                                        fragment2 = null;
                                    }
                                    final a0.a element = new a0.a(3, o);
                                    element.c = a.c;
                                    element.e = a.e;
                                    element.d = a.d;
                                    element.f = a.f;
                                    super.c.add(index, element);
                                    list.remove(o);
                                    ++index;
                                    n3 = n2;
                                }
                            }
                            --j;
                            b = fragment2;
                            n = index;
                            n2 = n3;
                        }
                        if (n2 != 0) {
                            super.c.remove(n);
                            --n;
                            break Label_0441;
                        }
                        a.a = 1;
                        list.add(b3);
                        break Label_0441;
                    }
                }
                list.add(a.b);
                n = i;
                b = fragment;
            }
            i = n + 1;
            fragment = b;
        }
        return fragment;
    }
    
    @Override
    public boolean c(@j0 final ArrayList<a> list, @j0 final ArrayList<Boolean> list2) {
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        list.add(this);
        list2.add(Boolean.FALSE);
        if (super.i) {
            this.L.i(this);
        }
        return true;
    }
    
    boolean c0(final int n) {
        for (int size = super.c.size(), i = 0; i < size; ++i) {
            final Fragment b = ((a0.a)super.c.get(i)).b;
            int mContainerId;
            if (b != null) {
                mContainerId = b.mContainerId;
            }
            else {
                mContainerId = 0;
            }
            if (mContainerId != 0 && mContainerId == n) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int d() {
        return super.n;
    }
    
    boolean d0(final ArrayList<a> list, final int n, final int n2) {
        if (n2 == n) {
            return false;
        }
        final int size = super.c.size();
        int n3 = -1;
        int n4;
        for (int i = 0; i < size; ++i, n3 = n4) {
            final Fragment b = ((a0.a)super.c.get(i)).b;
            int mContainerId;
            if (b != null) {
                mContainerId = b.mContainerId;
            }
            else {
                mContainerId = 0;
            }
            n4 = n3;
            if (mContainerId != 0 && mContainerId != (n4 = n3)) {
                for (int j = n; j < n2; ++j) {
                    final a a = list.get(j);
                    for (int size2 = a.c.size(), k = 0; k < size2; ++k) {
                        final Fragment b2 = ((a0.a)a.c.get(k)).b;
                        int mContainerId2;
                        if (b2 != null) {
                            mContainerId2 = b2.mContainerId;
                        }
                        else {
                            mContainerId2 = 0;
                        }
                        if (mContainerId2 == mContainerId) {
                            return true;
                        }
                    }
                }
                n4 = mContainerId;
            }
        }
        return false;
    }
    
    @Override
    public int e() {
        return super.l;
    }
    
    @k0
    @Override
    public CharSequence f() {
        if (super.n != 0) {
            return this.L.H0().f().getText(super.n);
        }
        return super.o;
    }
    
    boolean f0() {
        for (int i = 0; i < super.c.size(); ++i) {
            if (e0(super.c.get(i))) {
                return true;
            }
        }
        return false;
    }
    
    public void g0() {
        if (super.s != null) {
            for (int i = 0; i < super.s.size(); ++i) {
                super.s.get(i).run();
            }
            super.s = null;
        }
    }
    
    @k0
    @Override
    public String getName() {
        return super.k;
    }
    
    void h0(final Fragment.l onStartEnterTransitionListener) {
        for (int i = 0; i < super.c.size(); ++i) {
            final a0.a a = super.c.get(i);
            if (e0(a)) {
                a.b.setOnStartEnterTransitionListener(onStartEnterTransitionListener);
            }
        }
    }
    
    Fragment i0(final ArrayList<Fragment> list, Fragment b) {
        for (int i = super.c.size() - 1; i >= 0; --i) {
            final a0.a a = super.c.get(i);
            final int a2 = a.a;
            Label_0127: {
                if (a2 != 1) {
                    if (a2 != 3) {
                        switch (a2) {
                            default: {
                                continue;
                            }
                            case 10: {
                                a.h = a.g;
                                continue;
                            }
                            case 9: {
                                b = a.b;
                                continue;
                            }
                            case 8: {
                                b = null;
                                continue;
                            }
                            case 6: {
                                break;
                            }
                            case 7: {
                                break Label_0127;
                            }
                        }
                    }
                    list.add(a.b);
                    continue;
                }
            }
            list.remove(a.b);
        }
        return b;
    }
    
    @Override
    public int r() {
        return this.W(false);
    }
    
    @Override
    public int s() {
        return this.W(true);
    }
    
    @Override
    public void t() {
        this.x();
        this.L.i0((FragmentManager.q)this, false);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.N >= 0) {
            sb.append(" #");
            sb.append(this.N);
        }
        if (super.k != null) {
            sb.append(" ");
            sb.append(super.k);
        }
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public void u() {
        this.x();
        this.L.i0((FragmentManager.q)this, true);
    }
    
    @j0
    @Override
    public a0 w(@j0 final Fragment fragment) {
        final FragmentManager mFragmentManager = fragment.mFragmentManager;
        if (mFragmentManager != null && mFragmentManager != this.L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        return super.w(fragment);
    }
    
    @Override
    void y(final int n, final Fragment fragment, @k0 final String s, final int n2) {
        super.y(n, fragment, s, n2);
        fragment.mFragmentManager = this.L;
    }
    
    @j0
    @Override
    public a0 z(@j0 final Fragment fragment) {
        final FragmentManager mFragmentManager = fragment.mFragmentManager;
        if (mFragmentManager != null && mFragmentManager != this.L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
            sb.append(fragment.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        return super.z(fragment);
    }
}
