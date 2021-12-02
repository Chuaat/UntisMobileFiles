// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import androidx.annotation.k0;
import android.util.Log;
import androidx.annotation.j0;
import androidx.lifecycle.c1;
import java.util.HashMap;
import androidx.lifecycle.z0;
import androidx.lifecycle.w0;

final class p extends w0
{
    private static final String h = "FragmentManager";
    private static final z0.b i;
    private final HashMap<String, Fragment> a;
    private final HashMap<String, p> b;
    private final HashMap<String, c1> c;
    private final boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    
    static {
        i = new z0.b() {
            @j0
            @Override
            public <T extends w0> T a(@j0 final Class<T> clazz) {
                return (T)new p(true);
            }
        };
    }
    
    p(final boolean d) {
        this.a = new HashMap<String, Fragment>();
        this.b = new HashMap<String, p>();
        this.c = new HashMap<String, c1>();
        this.e = false;
        this.f = false;
        this.g = false;
        this.d = d;
    }
    
    @j0
    static p e(final c1 c1) {
        return new z0(c1, p.i).a(p.class);
    }
    
    void a(@j0 final Fragment fragment) {
        if (this.g) {
            if (FragmentManager.T0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.a.containsKey(fragment.mWho)) {
            return;
        }
        this.a.put(fragment.mWho, fragment);
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    void b(@j0 final Fragment obj) {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(obj);
            Log.d("FragmentManager", sb.toString());
        }
        final p p = this.b.get(obj.mWho);
        if (p != null) {
            p.onCleared();
            this.b.remove(obj.mWho);
        }
        final c1 c1 = this.c.get(obj.mWho);
        if (c1 != null) {
            c1.a();
            this.c.remove(obj.mWho);
        }
    }
    
    @k0
    Fragment c(final String key) {
        return this.a.get(key);
    }
    
    @j0
    p d(@j0 final Fragment fragment) {
        p value;
        if ((value = this.b.get(fragment.mWho)) == null) {
            value = new p(this.d);
            this.b.put(fragment.mWho, value);
        }
        return value;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && p.class == o.getClass()) {
            final p p = (p)o;
            if (!this.a.equals(p.a) || !this.b.equals(p.b) || !this.c.equals(p.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @j0
    Collection<Fragment> f() {
        return new ArrayList<Fragment>(this.a.values());
    }
    
    @Deprecated
    @k0
    n g() {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty()) {
            return null;
        }
        final HashMap<String, n> hashMap = new HashMap<String, n>();
        for (final Map.Entry<String, p> entry : this.b.entrySet()) {
            final n g = entry.getValue().g();
            if (g != null) {
                hashMap.put(entry.getKey(), g);
            }
        }
        this.f = true;
        if (this.a.isEmpty() && hashMap.isEmpty() && this.c.isEmpty()) {
            return null;
        }
        return new n(new ArrayList<Fragment>(this.a.values()), hashMap, new HashMap<String, c1>(this.c));
    }
    
    @j0
    c1 h(@j0 final Fragment fragment) {
        c1 value;
        if ((value = this.c.get(fragment.mWho)) == null) {
            value = new c1();
            this.c.put(fragment.mWho, value);
        }
        return value;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
    
    boolean i() {
        return this.e;
    }
    
    void j(@j0 final Fragment obj) {
        if (this.g) {
            if (FragmentManager.T0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.a.remove(obj.mWho) != null && FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(obj);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    @Deprecated
    void k(@k0 final n n) {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        if (n != null) {
            final Collection<Fragment> b = n.b();
            if (b != null) {
                for (final Fragment value : b) {
                    if (value != null) {
                        this.a.put(value.mWho, value);
                    }
                }
            }
            final Map<String, n> a = n.a();
            if (a != null) {
                for (final Map.Entry<String, n> entry : a.entrySet()) {
                    final p value2 = new p(this.d);
                    value2.k(entry.getValue());
                    this.b.put(entry.getKey(), value2);
                }
            }
            final Map<String, c1> c = n.c();
            if (c != null) {
                this.c.putAll(c);
            }
        }
        this.f = false;
    }
    
    void l(final boolean g) {
        this.g = g;
    }
    
    boolean m(@j0 final Fragment fragment) {
        if (!this.a.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.d) {
            return this.e;
        }
        return this.f ^ true;
    }
    
    @Override
    protected void onCleared() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.e = true;
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        final Iterator<Fragment> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        final Iterator<String> iterator2 = this.b.keySet().iterator();
        while (iterator2.hasNext()) {
            sb.append(iterator2.next());
            if (iterator2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        final Iterator<String> iterator3 = this.c.keySet().iterator();
        while (iterator3.hasNext()) {
            sb.append(iterator3.next());
            if (iterator3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
