// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity.result;

import java.util.Iterator;
import androidx.lifecycle.x;
import android.util.Log;
import androidx.lifecycle.v;
import androidx.lifecycle.s;
import androidx.lifecycle.y;
import java.io.Serializable;
import java.util.Collection;
import androidx.core.app.c;
import androidx.annotation.j0;
import android.annotation.SuppressLint;
import androidx.annotation.g0;
import android.os.Parcelable;
import androidx.annotation.k0;
import android.content.Intent;
import java.util.HashMap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry
{
    private static final String i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final String j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final String k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final String l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final String m = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";
    private static final String n = "ActivityResultRegistry";
    private static final int o = 65536;
    private Random a;
    private final Map<Integer, String> b;
    final Map<String, Integer> c;
    private final Map<String, d> d;
    ArrayList<String> e;
    final transient Map<String, c<?>> f;
    final Map<String, Object> g;
    final Bundle h;
    
    public ActivityResultRegistry() {
        this.a = new Random();
        this.b = new HashMap<Integer, String>();
        this.c = new HashMap<String, Integer>();
        this.d = new HashMap<String, d>();
        this.e = new ArrayList<String>();
        this.f = new HashMap<String, c<?>>();
        this.g = new HashMap<String, Object>();
        this.h = new Bundle();
    }
    
    private void a(final int n, final String s) {
        this.b.put(n, s);
        this.c.put(s, n);
    }
    
    private <O> void d(final String s, final int n, @k0 final Intent intent, @k0 final c<O> c) {
        if (c != null) {
            final b<O> a = c.a;
            if (a != null) {
                a.a(c.b.c(n, intent));
                return;
            }
        }
        this.g.remove(s);
        this.h.putParcelable(s, (Parcelable)new a(n, intent));
    }
    
    private int e() {
        int n = this.a.nextInt(2147418112);
        int i;
        while (true) {
            i = n + 65536;
            if (!this.b.containsKey(i)) {
                break;
            }
            n = this.a.nextInt(2147418112);
        }
        return i;
    }
    
    private int k(final String s) {
        final Integer n = this.c.get(s);
        if (n != null) {
            return n;
        }
        final int e = this.e();
        this.a(e, s);
        return e;
    }
    
    @g0
    public final boolean b(final int i, final int n, @k0 final Intent intent) {
        final String o = this.b.get(i);
        if (o == null) {
            return false;
        }
        this.e.remove(o);
        this.d(o, n, intent, this.f.get(o));
        return true;
    }
    
    @g0
    public final <O> boolean c(final int i, @SuppressLint({ "UnknownNullness" }) final O o) {
        final String o2 = this.b.get(i);
        if (o2 == null) {
            return false;
        }
        this.e.remove(o2);
        final c<?> c = this.f.get(o2);
        if (c != null) {
            final b<?> a = c.a;
            if (a != null) {
                a.a(o);
                return true;
            }
        }
        this.h.remove(o2);
        this.g.put(o2, o);
        return true;
    }
    
    @g0
    public abstract <I, O> void f(final int p0, @j0 final androidx.activity.result.contract.a<I, O> p1, @SuppressLint({ "UnknownNullness" }) final I p2, @k0 final androidx.core.app.c p3);
    
    public final void g(@k0 final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        final ArrayList integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        final ArrayList stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null) {
            if (integerArrayList != null) {
                this.e = (ArrayList<String>)bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.a = (Random)bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); ++i) {
                    final String s = stringArrayList.get(i);
                    if (this.c.containsKey(s)) {
                        final Integer n = this.c.remove(s);
                        if (!this.h.containsKey(s)) {
                            this.b.remove(n);
                        }
                    }
                    this.a(integerArrayList.get(i), stringArrayList.get(i));
                }
            }
        }
    }
    
    public final void h(@j0 final Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList((Collection<? extends E>)this.c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList((Collection<? extends E>)this.c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList((Collection<? extends E>)this.e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)this.h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", (Serializable)this.a);
    }
    
    @j0
    public final <I, O> androidx.activity.result.d<I> i(@j0 final String s, @j0 final androidx.activity.result.contract.a<I, O> a, @j0 final b<O> b) {
        final int k = this.k(s);
        this.f.put(s, new c<Object>((b<Object>)b, (androidx.activity.result.contract.a<?, Object>)a));
        if (this.g.containsKey(s)) {
            final Object value = this.g.get(s);
            this.g.remove(s);
            b.a((O)value);
        }
        final a a2 = (a)this.h.getParcelable(s);
        if (a2 != null) {
            this.h.remove(s);
            b.a(a.c(a2.b(), a2.a()));
        }
        return new androidx.activity.result.d<I>() {
            @j0
            @Override
            public androidx.activity.result.contract.a<I, ?> a() {
                return a;
            }
            
            @Override
            public void c(final I n, @k0 final androidx.core.app.c c) {
                ActivityResultRegistry.this.e.add(s);
                final Integer n2 = ActivityResultRegistry.this.c.get(s);
                final ActivityResultRegistry d = ActivityResultRegistry.this;
                int n3;
                if (n2 != null) {
                    n3 = n2;
                }
                else {
                    n3 = k;
                }
                d.f(n3, (androidx.activity.result.contract.a<I, Object>)a, n, c);
            }
            
            @Override
            public void d() {
                ActivityResultRegistry.this.l(s);
            }
        };
    }
    
    @j0
    public final <I, O> androidx.activity.result.d<I> j(@j0 final String s, @j0 final y obj, @j0 final androidx.activity.result.contract.a<I, O> a, @j0 final b<O> b) {
        final s lifecycle = obj.getLifecycle();
        if (!lifecycle.b().b(androidx.lifecycle.s.c.J)) {
            final int k = this.k(s);
            d d;
            if ((d = this.d.get(s)) == null) {
                d = new d(lifecycle);
            }
            d.a(new v() {
                @Override
                public void h(@j0 final y y, @j0 final s.b other) {
                    if (androidx.lifecycle.s.b.ON_START.equals(other)) {
                        ActivityResultRegistry.this.f.put(s, new c<Object>(b, a));
                        if (ActivityResultRegistry.this.g.containsKey(s)) {
                            final Object value = ActivityResultRegistry.this.g.get(s);
                            ActivityResultRegistry.this.g.remove(s);
                            b.a(value);
                        }
                        final a a = (a)ActivityResultRegistry.this.h.getParcelable(s);
                        if (a != null) {
                            ActivityResultRegistry.this.h.remove(s);
                            b.a(a.c(a.b(), a.a()));
                        }
                    }
                    else if (androidx.lifecycle.s.b.ON_STOP.equals(other)) {
                        ActivityResultRegistry.this.f.remove(s);
                    }
                    else if (androidx.lifecycle.s.b.ON_DESTROY.equals(other)) {
                        ActivityResultRegistry.this.l(s);
                    }
                }
            });
            this.d.put(s, d);
            return new androidx.activity.result.d<I>() {
                @j0
                @Override
                public androidx.activity.result.contract.a<I, ?> a() {
                    return a;
                }
                
                @Override
                public void c(final I n, @k0 final androidx.core.app.c c) {
                    ActivityResultRegistry.this.e.add(s);
                    final Integer n2 = ActivityResultRegistry.this.c.get(s);
                    final ActivityResultRegistry d = ActivityResultRegistry.this;
                    int n3;
                    if (n2 != null) {
                        n3 = n2;
                    }
                    else {
                        n3 = k;
                    }
                    d.f(n3, (androidx.activity.result.contract.a<I, Object>)a, n, c);
                }
                
                @Override
                public void d() {
                    ActivityResultRegistry.this.l(s);
                }
            };
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("LifecycleOwner ");
        sb.append(obj);
        sb.append(" is attempting to register while current state is ");
        sb.append(lifecycle.b());
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }
    
    @g0
    final void l(@j0 final String str) {
        if (!this.e.contains(str)) {
            final Integer n = this.c.remove(str);
            if (n != null) {
                this.b.remove(n);
            }
        }
        this.f.remove(str);
        if (this.g.containsKey(str)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.g.get(str));
            Log.w("ActivityResultRegistry", sb.toString());
            this.g.remove(str);
        }
        if (this.h.containsKey(str)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.h.getParcelable(str));
            Log.w("ActivityResultRegistry", sb2.toString());
            this.h.remove(str);
        }
        final d d = this.d.get(str);
        if (d != null) {
            d.b();
            this.d.remove(str);
        }
    }
    
    private static class c<O>
    {
        final b<O> a;
        final androidx.activity.result.contract.a<?, O> b;
        
        c(final b<O> a, final androidx.activity.result.contract.a<?, O> b) {
            this.a = a;
            this.b = b;
        }
    }
    
    private static class d
    {
        final s a;
        private final ArrayList<v> b;
        
        d(@j0 final s a) {
            this.a = a;
            this.b = new ArrayList<v>();
        }
        
        void a(@j0 final v e) {
            this.a.a(e);
            this.b.add(e);
        }
        
        void b() {
            final Iterator<v> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                this.a.c(iterator.next());
            }
            this.b.clear();
        }
    }
}
