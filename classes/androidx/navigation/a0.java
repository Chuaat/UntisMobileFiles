// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.i;
import android.content.res.TypedArray;
import v0.a;
import android.util.AttributeSet;
import android.net.Uri;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import android.os.Bundle;
import androidx.annotation.k0;
import androidx.annotation.y;
import androidx.annotation.t0;
import android.content.res.Resources$NotFoundException;
import android.content.Context;
import androidx.annotation.j0;
import androidx.collection.n;
import java.util.ArrayList;
import java.util.HashMap;

public class a0
{
    private static final HashMap<String, Class<?>> O;
    private final String G;
    private e0 H;
    private int I;
    private String J;
    private CharSequence K;
    private ArrayList<u> L;
    private n<j> M;
    private HashMap<String, o> N;
    
    static {
        O = new HashMap<String, Class<?>>();
    }
    
    public a0(@j0 final u0<? extends a0> u0) {
        this(v0.c(u0.getClass()));
    }
    
    public a0(@j0 final String g) {
        this.G = g;
    }
    
    @j0
    protected static <C> Class<? extends C> A(@j0 final Context context, @j0 final String str, @j0 final Class<? extends C> obj) {
        String string = str;
        if (str.charAt(0) == '.') {
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            string = sb.toString();
        }
        final HashMap<String, Class<?>> o = a0.O;
        Class<?> forName;
        if ((forName = o.get(string)) == null) {
            try {
                forName = Class.forName(string, true, context.getClassLoader());
                o.put(string, forName);
            }
            catch (ClassNotFoundException cause) {
                throw new IllegalArgumentException(cause);
            }
        }
        if (obj.isAssignableFrom(forName)) {
            return (Class<? extends C>)forName;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(" must be a subclass of ");
        sb2.append(obj);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    @j0
    @t0({ t0.a.H })
    static String o(@j0 final Context context, final int n) {
        if (n <= 16777215) {
            return Integer.toString(n);
        }
        try {
            return context.getResources().getResourceName(n);
        }
        catch (Resources$NotFoundException ex) {
            return Integer.toString(n);
        }
    }
    
    public final void B(@y final int n, @y final int n2) {
        this.C(n, new j(n2));
    }
    
    public final void C(@y final int i, @j0 final j j) {
        if (!this.I()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot add action ");
            sb.append(i);
            sb.append(" to ");
            sb.append(this);
            sb.append(" as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            throw new UnsupportedOperationException(sb.toString());
        }
        if (i != 0) {
            if (this.M == null) {
                this.M = new n<j>();
            }
            this.M.s(i, j);
            return;
        }
        throw new IllegalArgumentException("Cannot have an action with actionId 0");
    }
    
    public final void D(@y final int n) {
        final n<j> m = this.M;
        if (m == null) {
            return;
        }
        m.v(n);
    }
    
    public final void E(@j0 final String key) {
        final HashMap<String, o> n = this.N;
        if (n == null) {
            return;
        }
        n.remove(key);
    }
    
    public final void F(@y final int i) {
        this.I = i;
        this.J = null;
    }
    
    public final void G(@k0 final CharSequence k) {
        this.K = k;
    }
    
    final void H(final e0 h) {
        this.H = h;
    }
    
    boolean I() {
        return true;
    }
    
    public final void b(@j0 final String key, @j0 final o value) {
        if (this.N == null) {
            this.N = new HashMap<String, o>();
        }
        this.N.put(key, value);
    }
    
    public final void f(@j0 final u e) {
        if (this.L == null) {
            this.L = new ArrayList<u>();
        }
        this.L.add(e);
    }
    
    public final void h(@j0 final String s) {
        this.f(new u.a().g(s).a());
    }
    
    @k0
    Bundle i(@k0 final Bundle bundle) {
        if (bundle == null) {
            final HashMap<String, o> n = this.N;
            if (n == null || n.isEmpty()) {
                return null;
            }
        }
        final Bundle bundle2 = new Bundle();
        final HashMap<String, o> n2 = this.N;
        if (n2 != null) {
            for (final Map.Entry<String, o> entry : n2.entrySet()) {
                entry.getValue().e(entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            final HashMap<String, o> n3 = this.N;
            if (n3 != null) {
                for (final Map.Entry<String, o> entry2 : n3.entrySet()) {
                    if (entry2.getValue().f(entry2.getKey(), bundle2)) {
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Wrong argument type for '");
                    sb.append(entry2.getKey());
                    sb.append("' in argument bundle. ");
                    sb.append(entry2.getValue().b().c());
                    sb.append(" expected.");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return bundle2;
    }
    
    @j0
    int[] k() {
        final ArrayDeque<a0> arrayDeque = new ArrayDeque<a0>();
        a0 e = this;
        while (true) {
            final e0 t = e.t();
            if (t == null || t.R() != e.p()) {
                arrayDeque.addFirst(e);
            }
            if (t == null) {
                break;
            }
            e = t;
        }
        final int[] array = new int[arrayDeque.size()];
        int n = 0;
        final Iterator<a0> iterator = arrayDeque.iterator();
        while (iterator.hasNext()) {
            array[n] = iterator.next().p();
            ++n;
        }
        return array;
    }
    
    @k0
    public final j l(@y final int n) {
        final n<j> m = this.M;
        final j j = null;
        j l;
        if (m == null) {
            l = null;
        }
        else {
            l = m.j(n);
        }
        if (l == null) {
            l = j;
            if (this.t() != null) {
                l = this.t().l(n);
            }
        }
        return l;
    }
    
    @j0
    public final Map<String, o> m() {
        final HashMap<String, o> n = this.N;
        Object o;
        if (n == null) {
            o = Collections.emptyMap();
        }
        else {
            o = Collections.unmodifiableMap((Map<?, ?>)n);
        }
        return (Map<String, o>)o;
    }
    
    @j0
    @t0({ t0.a.H })
    public String n() {
        if (this.J == null) {
            this.J = Integer.toString(this.I);
        }
        return this.J;
    }
    
    @y
    public final int p() {
        return this.I;
    }
    
    @k0
    public final CharSequence q() {
        return this.K;
    }
    
    @j0
    public final String r() {
        return this.G;
    }
    
    @k0
    public final e0 t() {
        return this.H;
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append("(");
        String str;
        if ((str = this.J) == null) {
            sb.append("0x");
            str = Integer.toHexString(this.I);
        }
        sb.append(str);
        sb.append(")");
        if (this.K != null) {
            sb.append(" label=");
            sb.append(this.K);
        }
        return sb.toString();
    }
    
    public boolean v(@j0 final Uri uri) {
        return this.w(new z(uri, null, null));
    }
    
    public boolean w(@j0 final z z) {
        return this.x(z) != null;
    }
    
    @k0
    b x(@j0 final z z) {
        final ArrayList<u> l = this.L;
        if (l == null) {
            return null;
        }
        final Iterator<u> iterator = l.iterator();
        b b = null;
        while (iterator.hasNext()) {
            final u u = iterator.next();
            final Uri c = z.c();
            Bundle c2;
            if (c != null) {
                c2 = u.c(c, this.m());
            }
            else {
                c2 = null;
            }
            final String a = z.a();
            final boolean b2 = a != null && a.equals(u.b());
            final String b3 = z.b();
            int e;
            if (b3 != null) {
                e = u.e(b3);
            }
            else {
                e = -1;
            }
            if (c2 != null || b2 || e > -1) {
                final b b4 = new b(this, c2, u.g(), b2, e);
                if (b != null && b4.b(b) <= 0) {
                    continue;
                }
                b = b4;
            }
        }
        return b;
    }
    
    @i
    public void z(@j0 final Context context, @j0 final AttributeSet set) {
        final TypedArray obtainAttributes = context.getResources().obtainAttributes(set, v0.a.j.j0);
        this.F(obtainAttributes.getResourceId(v0.a.j.l0, 0));
        this.J = o(context, this.I);
        this.G(obtainAttributes.getText(v0.a.j.k0));
        obtainAttributes.recycle();
    }
    
    @Retention(RetentionPolicy.CLASS)
    @Target({ ElementType.TYPE })
    public @interface a {
        Class<?> value();
    }
    
    static class b implements Comparable<b>
    {
        @j0
        private final a0 G;
        @k0
        private final Bundle H;
        private final boolean I;
        private final boolean J;
        private final int K;
        
        b(@j0 final a0 g, @k0 final Bundle h, final boolean i, final boolean j, final int k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        public int b(@j0 final b b) {
            final boolean i = this.I;
            if (i && !b.I) {
                return 1;
            }
            if (!i && b.I) {
                return -1;
            }
            final Bundle h = this.H;
            if (h != null && b.H == null) {
                return 1;
            }
            if (h == null && b.H != null) {
                return -1;
            }
            if (h != null) {
                final int n = h.size() - b.H.size();
                if (n > 0) {
                    return 1;
                }
                if (n < 0) {
                    return -1;
                }
            }
            final boolean j = this.J;
            if (j && !b.J) {
                return 1;
            }
            if (!j && b.J) {
                return -1;
            }
            return this.K - b.K;
        }
        
        @j0
        a0 d() {
            return this.G;
        }
        
        @k0
        Bundle f() {
            return this.H;
        }
    }
}
