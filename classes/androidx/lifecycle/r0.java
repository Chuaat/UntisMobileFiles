// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.util.Collection;
import java.util.HashSet;
import android.annotation.SuppressLint;
import androidx.annotation.g0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import android.util.SparseArray;
import java.io.Serializable;
import android.os.Parcelable;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Binder;
import android.util.SizeF;
import android.util.Size;
import android.os.Build$VERSION;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;

public final class r0
{
    private static final String e = "values";
    private static final String f = "keys";
    private static final Class[] g;
    final Map<String, Object> a;
    final Map<String, SavedStateRegistry.b> b;
    private final Map<String, b<?>> c;
    private final SavedStateRegistry.b d;
    
    static {
        final Class<Boolean> type = Boolean.TYPE;
        final Class<Double> type2 = Double.TYPE;
        final Class<Integer> type3 = Integer.TYPE;
        final Class<Long> type4 = Long.TYPE;
        final Class<Byte> type5 = Byte.TYPE;
        final Class<Character> type6 = Character.TYPE;
        final Class<Float> type7 = Float.TYPE;
        final Class<Short> type8 = Short.TYPE;
        final int sdk_INT = Build$VERSION.SDK_INT;
        Serializable s;
        if (sdk_INT >= 21) {
            s = Size.class;
        }
        else {
            s = type3;
        }
        Serializable s2 = type3;
        if (sdk_INT >= 21) {
            s2 = SizeF.class;
        }
        g = new Class[] { type, boolean[].class, type2, double[].class, type3, int[].class, type4, long[].class, String.class, String[].class, Binder.class, Bundle.class, type5, byte[].class, type6, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, type7, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, type8, short[].class, SparseArray.class, (Class)s, (Class)s2 };
    }
    
    public r0() {
        this.b = new HashMap<String, SavedStateRegistry.b>();
        this.c = new HashMap<String, b<?>>();
        this.d = new SavedStateRegistry.b() {
            @j0
            @Override
            public Bundle a() {
                for (final Map.Entry<Object, SavedStateRegistry.b> entry : new HashMap<Object, SavedStateRegistry.b>(r0.this.b).entrySet()) {
                    r0.this.k(entry.getKey(), entry.getValue().a());
                }
                final Set<String> keySet = r0.this.a.keySet();
                final ArrayList list = new ArrayList<String>(keySet.size());
                final ArrayList list2 = new ArrayList<Object>(list.size());
                for (final String e : keySet) {
                    list.add(e);
                    list2.add(r0.this.a.get(e));
                }
                final Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", list);
                bundle.putParcelableArrayList("values", list2);
                return bundle;
            }
        };
        this.a = new HashMap<String, Object>();
    }
    
    public r0(@j0 final Map<String, Object> m) {
        this.b = new HashMap<String, SavedStateRegistry.b>();
        this.c = new HashMap<String, b<?>>();
        this.d = new SavedStateRegistry.b() {
            @j0
            @Override
            public Bundle a() {
                for (final Map.Entry<Object, SavedStateRegistry.b> entry : new HashMap<Object, SavedStateRegistry.b>(r0.this.b).entrySet()) {
                    r0.this.k(entry.getKey(), entry.getValue().a());
                }
                final Set<String> keySet = r0.this.a.keySet();
                final ArrayList list = new ArrayList<String>(keySet.size());
                final ArrayList list2 = new ArrayList<Object>(list.size());
                for (final String e : keySet) {
                    list.add(e);
                    list2.add(r0.this.a.get(e));
                }
                final Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", list);
                bundle.putParcelableArrayList("values", list2);
                return bundle;
            }
        };
        this.a = new HashMap<String, Object>(m);
    }
    
    static r0 c(@k0 final Bundle bundle, @k0 final Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new r0();
        }
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (bundle2 != null) {
            for (final String s : bundle2.keySet()) {
                hashMap.put(s, bundle2.get(s));
            }
        }
        if (bundle == null) {
            return new r0(hashMap);
        }
        final ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        final ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            for (int i = 0; i < parcelableArrayList.size(); ++i) {
                hashMap.put(parcelableArrayList.get(i), parcelableArrayList2.get(i));
            }
            return new r0(hashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }
    
    @j0
    private <T> androidx.lifecycle.k0<T> g(@j0 final String s, final boolean b, @k0 final T t) {
        final b<?> b2 = this.c.get(s);
        if (b2 != null) {
            return (androidx.lifecycle.k0<T>)b2;
        }
        b<Object> b3;
        if (this.a.containsKey(s)) {
            b3 = new b<Object>(this, s, this.a.get(s));
        }
        else if (b) {
            b3 = new b<Object>(this, s, t);
        }
        else {
            b3 = new b<Object>(this, s);
        }
        this.c.put(s, b3);
        return (androidx.lifecycle.k0<T>)b3;
    }
    
    private static void m(final Object o) {
        if (o == null) {
            return;
        }
        final Class[] g = r0.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            if (g[i].isInstance(o)) {
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        sb.append(o.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @g0
    public void a(@j0 final String s) {
        this.b.remove(s);
    }
    
    @g0
    public boolean b(@j0 final String s) {
        return this.a.containsKey(s);
    }
    
    @g0
    @k0
    public <T> T d(@j0 final String s) {
        return (T)this.a.get(s);
    }
    
    @g0
    @j0
    public <T> androidx.lifecycle.k0<T> e(@j0 final String s) {
        return this.g(s, false, (T)null);
    }
    
    @g0
    @j0
    public <T> androidx.lifecycle.k0<T> f(@j0 final String s, @SuppressLint({ "UnknownNullness" }) final T t) {
        return this.g(s, true, t);
    }
    
    @g0
    @j0
    public Set<String> h() {
        final HashSet<Object> set = (HashSet<Object>)new HashSet<String>(this.a.keySet());
        set.addAll(this.b.keySet());
        set.addAll(this.c.keySet());
        return (Set<String>)set;
    }
    
    @g0
    @k0
    public <T> T i(@j0 final String s) {
        final Object remove = this.a.remove(s);
        final b<?> b = this.c.remove(s);
        if (b != null) {
            b.r();
        }
        return (T)remove;
    }
    
    @j0
    SavedStateRegistry.b j() {
        return this.d;
    }
    
    @g0
    public <T> void k(@j0 final String s, @k0 final T t) {
        m(t);
        final b<?> b = this.c.get(s);
        if (b != null) {
            b.q(t);
        }
        else {
            this.a.put(s, t);
        }
    }
    
    @g0
    public void l(@j0 final String s, @j0 final SavedStateRegistry.b b) {
        this.b.put(s, b);
    }
    
    static class b<T> extends k0<T>
    {
        private String m;
        private r0 n;
        
        b(final r0 n, final String m) {
            this.m = m;
            this.n = n;
        }
        
        b(final r0 n, final String m, final T t) {
            super(t);
            this.m = m;
            this.n = n;
        }
        
        @Override
        public void q(final T t) {
            final r0 n = this.n;
            if (n != null) {
                n.a.put(this.m, t);
            }
            super.q(t);
        }
        
        void r() {
            this.n = null;
        }
    }
}
