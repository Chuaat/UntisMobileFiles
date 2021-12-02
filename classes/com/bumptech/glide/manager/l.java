// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.manager;

import android.app.Application;
import android.util.Log;
import android.os.Message;
import androidx.fragment.app.d;
import java.util.Collection;
import java.util.Iterator;
import android.content.ContextWrapper;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.app.Activity;
import android.os.Looper;
import java.util.HashMap;
import androidx.annotation.k0;
import android.content.Context;
import androidx.annotation.j0;
import com.bumptech.glide.b;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.View;
import androidx.collection.a;
import android.os.Handler;
import android.app.FragmentManager;
import java.util.Map;
import androidx.annotation.b1;
import android.os.Handler$Callback;

public class l implements Handler$Callback
{
    @b1
    static final String k = "com.bumptech.glide.manager";
    private static final String l = "RMRetriever";
    private static final int m = 1;
    private static final int n = 2;
    private static final String o = "key";
    private static final b p;
    private volatile com.bumptech.glide.l c;
    @b1
    final Map<FragmentManager, k> d;
    @b1
    final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> e;
    private final Handler f;
    private final b g;
    private final a<View, Fragment> h;
    private final a<View, android.app.Fragment> i;
    private final Bundle j;
    
    static {
        p = (b)new b() {
            @j0
            @Override
            public com.bumptech.glide.l a(@j0 final com.bumptech.glide.b b, @j0 final h h, @j0 final m m, @j0 final Context context) {
                return new com.bumptech.glide.l(b, h, m, context);
            }
        };
    }
    
    public l(@k0 b p) {
        this.d = new HashMap<FragmentManager, k>();
        this.e = new HashMap<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment>();
        this.h = new a<View, Fragment>();
        this.i = new a<View, android.app.Fragment>();
        this.j = new Bundle();
        if (p == null) {
            p = com.bumptech.glide.manager.l.p;
        }
        this.g = p;
        this.f = new Handler(Looper.getMainLooper(), (Handler$Callback)this);
    }
    
    @TargetApi(17)
    private static void a(@j0 final Activity activity) {
        if (Build$VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }
    
    @k0
    private static Activity b(@j0 final Context context) {
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper)context).getBaseContext());
        }
        return null;
    }
    
    @Deprecated
    @TargetApi(26)
    private void c(@j0 final FragmentManager fragmentManager, @j0 final a<View, android.app.Fragment> a) {
        if (Build$VERSION.SDK_INT >= 26) {
            for (final android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    a.put(fragment.getView(), fragment);
                    this.c(fragment.getChildFragmentManager(), a);
                }
            }
        }
        else {
            this.d(fragmentManager, a);
        }
    }
    
    @Deprecated
    private void d(@j0 final FragmentManager fragmentManager, @j0 final a<View, android.app.Fragment> a) {
        int n = 0;
        while (true) {
            this.j.putInt("key", n);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.j, "key");
            }
            catch (Exception ex) {}
            if (fragment == null) {
                break;
            }
            if (fragment.getView() != null) {
                a.put(fragment.getView(), fragment);
                if (Build$VERSION.SDK_INT >= 17) {
                    this.c(fragment.getChildFragmentManager(), a);
                }
            }
            ++n;
        }
    }
    
    private static void e(@k0 final Collection<Fragment> collection, @j0 final Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (final Fragment fragment : collection) {
            if (fragment != null) {
                if (fragment.getView() == null) {
                    continue;
                }
                map.put(fragment.getView(), fragment);
                e(fragment.getChildFragmentManager().G0(), map);
            }
        }
    }
    
    @Deprecated
    @k0
    private android.app.Fragment f(@j0 final View view, @j0 final Activity activity) {
        this.i.clear();
        this.c(activity.getFragmentManager(), this.i);
        final View viewById = activity.findViewById(16908290);
        final android.app.Fragment fragment = null;
        View view2 = view;
        android.app.Fragment fragment2 = fragment;
        android.app.Fragment fragment3;
        while (true) {
            fragment3 = fragment2;
            if (view2.equals(viewById)) {
                break;
            }
            fragment2 = this.i.get(view2);
            if (fragment2 != null) {
                fragment3 = fragment2;
                break;
            }
            fragment3 = fragment2;
            if (!(view2.getParent() instanceof View)) {
                break;
            }
            view2 = (View)view2.getParent();
        }
        this.i.clear();
        return fragment3;
    }
    
    @k0
    private Fragment g(@j0 final View view, @j0 final d d) {
        this.h.clear();
        e(d.getSupportFragmentManager().G0(), this.h);
        final View viewById = d.findViewById(16908290);
        final Fragment fragment = null;
        View view2 = view;
        Fragment fragment2 = fragment;
        Fragment fragment3;
        while (true) {
            fragment3 = fragment2;
            if (view2.equals(viewById)) {
                break;
            }
            fragment2 = this.h.get(view2);
            if (fragment2 != null) {
                fragment3 = fragment2;
                break;
            }
            fragment3 = fragment2;
            if (!(view2.getParent() instanceof View)) {
                break;
            }
            view2 = (View)view2.getParent();
        }
        this.h.clear();
        return fragment3;
    }
    
    @Deprecated
    @j0
    private com.bumptech.glide.l h(@j0 final Context context, @j0 final FragmentManager fragmentManager, @k0 final android.app.Fragment fragment, final boolean b) {
        final k q = this.q(fragmentManager, fragment, b);
        com.bumptech.glide.l l;
        if ((l = q.e()) == null) {
            l = this.g.a(b.d(context), q.c(), q.f(), context);
            q.k(l);
        }
        return l;
    }
    
    @j0
    private com.bumptech.glide.l o(@j0 final Context context) {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = this.g.a(com.bumptech.glide.b.d(context.getApplicationContext()), new com.bumptech.glide.manager.b(), new g(), context.getApplicationContext());
                }
            }
        }
        return this.c;
    }
    
    @j0
    private k q(@j0 final FragmentManager fragmentManager, @k0 final android.app.Fragment fragment, final boolean b) {
        k k;
        if ((k = (k)fragmentManager.findFragmentByTag("com.bumptech.glide.manager")) == null && (k = this.d.get(fragmentManager)) == null) {
            k = new k();
            k.j(fragment);
            if (b) {
                k.c().d();
            }
            this.d.put(fragmentManager, k);
            fragmentManager.beginTransaction().add((android.app.Fragment)k, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f.obtainMessage(1, (Object)fragmentManager).sendToTarget();
        }
        return k;
    }
    
    @j0
    private SupportRequestManagerFragment s(@j0 final androidx.fragment.app.FragmentManager fragmentManager, @k0 final Fragment fragment, final boolean b) {
        SupportRequestManagerFragment supportRequestManagerFragment;
        if ((supportRequestManagerFragment = (SupportRequestManagerFragment)fragmentManager.q0("com.bumptech.glide.manager")) == null && (supportRequestManagerFragment = this.e.get(fragmentManager)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.B(fragment);
            if (b) {
                supportRequestManagerFragment.t().d();
            }
            this.e.put(fragmentManager, supportRequestManagerFragment);
            fragmentManager.r().l(supportRequestManagerFragment, "com.bumptech.glide.manager").s();
            this.f.obtainMessage(2, (Object)fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment;
    }
    
    private static boolean t(final Context context) {
        final Activity b = b(context);
        return b == null || !b.isFinishing();
    }
    
    @j0
    private com.bumptech.glide.l u(@j0 final Context context, @j0 final androidx.fragment.app.FragmentManager fragmentManager, @k0 final Fragment fragment, final boolean b) {
        final SupportRequestManagerFragment s = this.s(fragmentManager, fragment, b);
        com.bumptech.glide.l l;
        if ((l = s.v()) == null) {
            l = this.g.a(b.d(context), s.t(), s.w(), context);
            s.C(l);
        }
        return l;
    }
    
    public boolean handleMessage(final Message message) {
        final int what = message.what;
        Object remove = null;
        boolean b = true;
        Object obj = null;
        Label_0065: {
            Object o;
            if (what != 1) {
                if (what != 2) {
                    b = false;
                    obj = null;
                    break Label_0065;
                }
                obj = message.obj;
                o = this.e;
            }
            else {
                obj = message.obj;
                o = this.d;
            }
            remove = ((Map<K, Object>)o).remove(obj);
        }
        if (b && remove == null && Log.isLoggable("RMRetriever", 5)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to remove expected request manager fragment, manager: ");
            sb.append(obj);
            Log.w("RMRetriever", sb.toString());
        }
        return b;
    }
    
    @j0
    public com.bumptech.glide.l i(@j0 final Activity activity) {
        if (com.bumptech.glide.util.m.s()) {
            return this.k(activity.getApplicationContext());
        }
        a(activity);
        return this.h((Context)activity, activity.getFragmentManager(), null, t((Context)activity));
    }
    
    @Deprecated
    @TargetApi(17)
    @j0
    public com.bumptech.glide.l j(@j0 final android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (!com.bumptech.glide.util.m.s() && Build$VERSION.SDK_INT >= 17) {
            return this.h((Context)fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
        return this.k(fragment.getActivity().getApplicationContext());
    }
    
    @j0
    public com.bumptech.glide.l k(@j0 final Context context) {
        if (context != null) {
            if (com.bumptech.glide.util.m.t() && !(context instanceof Application)) {
                if (context instanceof d) {
                    return this.n((d)context);
                }
                if (context instanceof Activity) {
                    return this.i((Activity)context);
                }
                if (context instanceof ContextWrapper) {
                    final ContextWrapper contextWrapper = (ContextWrapper)context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return this.k(contextWrapper.getBaseContext());
                    }
                }
            }
            return this.o(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }
    
    @j0
    public com.bumptech.glide.l l(@j0 final View view) {
        if (!com.bumptech.glide.util.m.s()) {
            com.bumptech.glide.util.k.d(view);
            com.bumptech.glide.util.k.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            final Activity b = b(view.getContext());
            if (b != null) {
                if (b instanceof d) {
                    final d d = (d)b;
                    final Fragment g = this.g(view, d);
                    com.bumptech.glide.l l;
                    if (g != null) {
                        l = this.m(g);
                    }
                    else {
                        l = this.n(d);
                    }
                    return l;
                }
                final android.app.Fragment f = this.f(view, b);
                if (f == null) {
                    return this.i(b);
                }
                return this.j(f);
            }
        }
        return this.k(view.getContext().getApplicationContext());
    }
    
    @j0
    public com.bumptech.glide.l m(@j0 final Fragment fragment) {
        com.bumptech.glide.util.k.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (com.bumptech.glide.util.m.s()) {
            return this.k(fragment.getContext().getApplicationContext());
        }
        return this.u(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }
    
    @j0
    public com.bumptech.glide.l n(@j0 final d d) {
        if (com.bumptech.glide.util.m.s()) {
            return this.k(d.getApplicationContext());
        }
        a(d);
        return this.u((Context)d, d.getSupportFragmentManager(), null, t((Context)d));
    }
    
    @Deprecated
    @j0
    k p(final Activity activity) {
        return this.q(activity.getFragmentManager(), null, t((Context)activity));
    }
    
    @j0
    SupportRequestManagerFragment r(final Context context, final androidx.fragment.app.FragmentManager fragmentManager) {
        return this.s(fragmentManager, null, t(context));
    }
    
    public interface b
    {
        @j0
        com.bumptech.glide.l a(@j0 final com.bumptech.glide.b p0, @j0 final h p1, @j0 final m p2, @j0 final Context p3);
    }
}
