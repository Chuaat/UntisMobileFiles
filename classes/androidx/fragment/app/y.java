// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.util.Log;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;
import androidx.annotation.k0;
import java.io.FileDescriptor;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import androidx.annotation.j0;
import java.util.HashMap;
import java.util.ArrayList;

class y
{
    private static final String d = "FragmentManager";
    private final ArrayList<Fragment> a;
    private final HashMap<String, v> b;
    private p c;
    
    y() {
        this.a = new ArrayList<Fragment>();
        this.b = new HashMap<String, v>();
    }
    
    void a(@j0 final Fragment obj) {
        if (!this.a.contains(obj)) {
            synchronized (this.a) {
                this.a.add(obj);
                // monitorexit(this.a)
                obj.mAdded = true;
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }
    
    void b() {
        this.b.values().removeAll(Collections.singleton((Object)null));
    }
    
    boolean c(@j0 final String key) {
        return this.b.get(key) != null;
    }
    
    void d(final int n) {
        for (final v v : this.b.values()) {
            if (v != null) {
                v.u(n);
            }
        }
    }
    
    void e(@j0 final String s, @k0 final FileDescriptor fileDescriptor, @j0 final PrintWriter printWriter, @k0 final String[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("    ");
        final String string = sb.toString();
        if (!this.b.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Active Fragments:");
            for (final v v : this.b.values()) {
                printWriter.print(s);
                if (v != null) {
                    final Fragment k = v.k();
                    printWriter.println(k);
                    k.dump(string, fileDescriptor, printWriter, array);
                }
                else {
                    printWriter.println("null");
                }
            }
        }
        final int size = this.a.size();
        if (size > 0) {
            printWriter.print(s);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; ++i) {
                final Fragment fragment = this.a.get(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }
    
    @k0
    Fragment f(@j0 final String key) {
        final v v = this.b.get(key);
        if (v != null) {
            return v.k();
        }
        return null;
    }
    
    @k0
    Fragment g(@androidx.annotation.y final int n) {
        for (int i = this.a.size() - 1; i >= 0; --i) {
            final Fragment fragment = this.a.get(i);
            if (fragment != null && fragment.mFragmentId == n) {
                return fragment;
            }
        }
        for (final v v : this.b.values()) {
            if (v != null) {
                final Fragment k = v.k();
                if (k.mFragmentId == n) {
                    return k;
                }
                continue;
            }
        }
        return null;
    }
    
    @k0
    Fragment h(@k0 final String s) {
        if (s != null) {
            for (int i = this.a.size() - 1; i >= 0; --i) {
                final Fragment fragment = this.a.get(i);
                if (fragment != null && s.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (s != null) {
            for (final v v : this.b.values()) {
                if (v != null) {
                    final Fragment k = v.k();
                    if (s.equals(k.mTag)) {
                        return k;
                    }
                    continue;
                }
            }
        }
        return null;
    }
    
    @k0
    Fragment i(@j0 final String s) {
        for (final v v : this.b.values()) {
            if (v != null) {
                final Fragment fragmentByWho = v.k().findFragmentByWho(s);
                if (fragmentByWho != null) {
                    return fragmentByWho;
                }
                continue;
            }
        }
        return null;
    }
    
    int j(@j0 Fragment o) {
        final ViewGroup mContainer = o.mContainer;
        if (mContainer == null) {
            return -1;
        }
        final int index = this.a.indexOf(o);
        int index2 = index - 1;
        int index3;
        while (true) {
            index3 = index;
            if (index2 < 0) {
                break;
            }
            o = this.a.get(index2);
            if (o.mContainer == mContainer) {
                final View mView = o.mView;
                if (mView != null) {
                    return mContainer.indexOfChild(mView) + 1;
                }
            }
            --index2;
        }
        while (++index3 < this.a.size()) {
            o = this.a.get(index3);
            if (o.mContainer == mContainer) {
                final View mView2 = o.mView;
                if (mView2 != null) {
                    return mContainer.indexOfChild(mView2);
                }
                continue;
            }
        }
        return -1;
    }
    
    int k() {
        return this.b.size();
    }
    
    @j0
    List<v> l() {
        final ArrayList<v> list = new ArrayList<v>();
        for (final v e : this.b.values()) {
            if (e != null) {
                list.add(e);
            }
        }
        return list;
    }
    
    @j0
    List<Fragment> m() {
        final ArrayList<Fragment> list = new ArrayList<Fragment>();
        for (final v v : this.b.values()) {
            Fragment k;
            if (v != null) {
                k = v.k();
            }
            else {
                k = null;
            }
            list.add(k);
        }
        return list;
    }
    
    @k0
    v n(@j0 final String key) {
        return this.b.get(key);
    }
    
    @j0
    List<Fragment> o() {
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            return new ArrayList<Fragment>(this.a);
        }
    }
    
    p p() {
        return this.c;
    }
    
    void q(@j0 final v value) {
        final Fragment k = value.k();
        if (this.c(k.mWho)) {
            return;
        }
        this.b.put(k.mWho, value);
        if (k.mRetainInstanceChangedWhileDetached) {
            if (k.mRetainInstance) {
                this.c.a(k);
            }
            else {
                this.c.j(k);
            }
            k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(k);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    void r(@j0 final v v) {
        final Fragment k = v.k();
        if (k.mRetainInstance) {
            this.c.j(k);
        }
        if (this.b.put(k.mWho, null) == null) {
            return;
        }
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(k);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    void s() {
        final Iterator<Fragment> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            final v v = this.b.get(iterator.next().mWho);
            if (v != null) {
                v.m();
            }
        }
        for (final v v2 : this.b.values()) {
            if (v2 != null) {
                v2.m();
                final Fragment k = v2.k();
                if (!k.mRemoving || k.isInBackStack()) {
                    continue;
                }
                this.r(v2);
            }
        }
    }
    
    void t(@j0 final Fragment o) {
        synchronized (this.a) {
            this.a.remove(o);
            // monitorexit(this.a)
            o.mAdded = false;
        }
    }
    
    void u() {
        this.b.clear();
    }
    
    void v(@k0 final List<String> list) {
        this.a.clear();
        if (list != null) {
            for (final String s : list) {
                final Fragment f = this.f(s);
                if (f == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No instantiated fragment for (");
                    sb.append(s);
                    sb.append(")");
                    throw new IllegalStateException(sb.toString());
                }
                if (FragmentManager.T0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: added (");
                    sb2.append(s);
                    sb2.append("): ");
                    sb2.append(f);
                    Log.v("FragmentManager", sb2.toString());
                }
                this.a(f);
            }
        }
    }
    
    @j0
    ArrayList<u> w() {
        final ArrayList<u> list = new ArrayList<u>(this.b.size());
        for (final v v : this.b.values()) {
            if (v != null) {
                final Fragment k = v.k();
                final u s = v.s();
                list.add(s);
                if (!FragmentManager.T0(2)) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Saved state of ");
                sb.append(k);
                sb.append(": ");
                sb.append(s.S);
                Log.v("FragmentManager", sb.toString());
            }
        }
        return list;
    }
    
    @k0
    ArrayList<String> x() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            final ArrayList<String> list = new ArrayList<String>(this.a.size());
            for (final Fragment obj : this.a) {
                list.add(obj.mWho);
                if (FragmentManager.T0(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(obj.mWho);
                    sb.append("): ");
                    sb.append(obj);
                    Log.v("FragmentManager", sb.toString());
                }
            }
            return list;
        }
    }
    
    void y(@j0 final p c) {
        this.c = c;
    }
}
