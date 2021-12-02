// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.fragment;

import java.util.Collections;
import java.util.LinkedHashMap;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.v0;
import android.view.View;
import java.util.Map;
import androidx.fragment.app.Fragment;
import android.util.Log;
import java.util.Iterator;
import androidx.navigation.o0;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.navigation.a0;
import androidx.annotation.j0;
import java.util.ArrayDeque;
import androidx.fragment.app.FragmentManager;
import android.content.Context;
import androidx.navigation.u0;

@u0.b("fragment")
public class e extends u0<a>
{
    private static final String e = "FragmentNavigator";
    private static final String f = "androidx-nav-fragment:navigator:backStackIds";
    private final Context a;
    private final FragmentManager b;
    private final int c;
    private ArrayDeque<Integer> d;
    
    public e(@j0 final Context a, @j0 final FragmentManager b, final int c) {
        this.d = new ArrayDeque<Integer>();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    private String g(final int i, final int j) {
        final StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("-");
        sb.append(j);
        return sb.toString();
    }
    
    @Override
    public void c(@k0 final Bundle bundle) {
        if (bundle != null) {
            final int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
            if (intArray != null) {
                this.d.clear();
                for (int length = intArray.length, i = 0; i < length; ++i) {
                    this.d.add(intArray[i]);
                }
            }
        }
    }
    
    @k0
    @Override
    public Bundle d() {
        final Bundle bundle = new Bundle();
        final int[] array = new int[this.d.size()];
        final Iterator<Integer> iterator = this.d.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            array[n] = iterator.next();
            ++n;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", array);
        return bundle;
    }
    
    @Override
    public boolean e() {
        if (this.d.isEmpty()) {
            return false;
        }
        if (this.b.Y0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.b.n1(this.g(this.d.size(), this.d.peekLast()), 1);
        this.d.removeLast();
        return true;
    }
    
    @j0
    public a f() {
        return new a(this);
    }
    
    @Deprecated
    @j0
    public Fragment h(@j0 final Context context, @j0 final FragmentManager fragmentManager, @j0 final String s, @k0 final Bundle bundle) {
        return fragmentManager.E0().a(context.getClassLoader(), s);
    }
    
    @k0
    public a0 i(@j0 final a a, @k0 final Bundle arguments, @k0 final o0 o0, @k0 final u0.a a2) {
        if (this.b.Y0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        final String j = a.J();
        final boolean b = false;
        String string = j;
        if (j.charAt(0) == '.') {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a.getPackageName());
            sb.append(j);
            string = sb.toString();
        }
        final Fragment h = this.h(this.a, this.b, string, arguments);
        h.setArguments(arguments);
        final androidx.fragment.app.a0 r = this.b.r();
        int a3;
        if (o0 != null) {
            a3 = o0.a();
        }
        else {
            a3 = -1;
        }
        int b2;
        if (o0 != null) {
            b2 = o0.b();
        }
        else {
            b2 = -1;
        }
        int c;
        if (o0 != null) {
            c = o0.c();
        }
        else {
            c = -1;
        }
        int d;
        if (o0 != null) {
            d = o0.d();
        }
        else {
            d = -1;
        }
        if (a3 != -1 || b2 != -1 || c != -1 || d != -1) {
            if (a3 == -1) {
                a3 = 0;
            }
            if (b2 == -1) {
                b2 = 0;
            }
            if (c == -1) {
                c = 0;
            }
            if (d == -1) {
                d = 0;
            }
            r.O(a3, b2, c, d);
        }
        r.D(this.c, h);
        r.Q(h);
        final int p4 = a.p();
        final boolean empty = this.d.isEmpty();
        final boolean b3 = o0 != null && !empty && o0.g() && this.d.peekLast() == p4;
        int n = 0;
        Label_0448: {
            if (!empty) {
                if (b3) {
                    n = (b ? 1 : 0);
                    if (this.d.size() > 1) {
                        this.b.n1(this.g(this.d.size(), this.d.peekLast()), 1);
                        r.p(this.g(this.d.size(), p4));
                        n = (b ? 1 : 0);
                    }
                    break Label_0448;
                }
                else {
                    r.p(this.g(this.d.size() + 1, p4));
                }
            }
            n = 1;
        }
        if (a2 instanceof b) {
            for (final Map.Entry<View, String> entry : ((b)a2).a().entrySet()) {
                r.o(entry.getKey(), entry.getValue());
            }
        }
        r.R(true);
        r.r();
        if (n != 0) {
            this.d.add(p4);
            return a;
        }
        return null;
    }
    
    @a0.a(Fragment.class)
    public static class a extends a0
    {
        private String P;
        
        public a(@j0 final u0<? extends a> u0) {
            super(u0);
        }
        
        public a(@j0 final v0 v0) {
            this(v0.d(e.class));
        }
        
        @j0
        public final String J() {
            final String p = this.P;
            if (p != null) {
                return p;
            }
            throw new IllegalStateException("Fragment class was not set");
        }
        
        @j0
        public final a K(@j0 final String p) {
            this.P = p;
            return this;
        }
        
        @j0
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String p;
            if ((p = this.P) == null) {
                p = "null";
            }
            sb.append(p);
            return sb.toString();
        }
        
        @androidx.annotation.i
        @Override
        public void z(@j0 final Context context, @j0 final AttributeSet set) {
            super.z(context, set);
            final TypedArray obtainAttributes = context.getResources().obtainAttributes(set, i.k.M);
            final String string = obtainAttributes.getString(i.k.N);
            if (string != null) {
                this.K(string);
            }
            obtainAttributes.recycle();
        }
    }
    
    public static final class b implements u0.a
    {
        private final LinkedHashMap<View, String> a;
        
        b(final Map<View, String> m) {
            (this.a = new LinkedHashMap<View, String>()).putAll((Map<?, ?>)m);
        }
        
        @j0
        public Map<View, String> a() {
            return Collections.unmodifiableMap((Map<? extends View, ? extends String>)this.a);
        }
        
        public static final class a
        {
            private final LinkedHashMap<View, String> a;
            
            public a() {
                this.a = new LinkedHashMap<View, String>();
            }
            
            @j0
            public a a(@j0 final View key, @j0 final String value) {
                this.a.put(key, value);
                return this;
            }
            
            @j0
            public a b(@j0 final Map<View, String> map) {
                for (final Map.Entry<View, String> entry : map.entrySet()) {
                    final View view = entry.getKey();
                    final String s = entry.getValue();
                    if (view != null && s != null) {
                        this.a(view, s);
                    }
                }
                return this;
            }
            
            @j0
            public b c() {
                return new b(this.a);
            }
        }
    }
}
