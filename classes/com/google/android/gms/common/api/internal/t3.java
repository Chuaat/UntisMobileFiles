// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.content.Intent;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import com.google.android.gms.internal.common.i;
import android.os.Looper;
import androidx.annotation.j0;
import java.util.Collections;
import androidx.collection.a;
import androidx.annotation.k0;
import android.os.Bundle;
import java.util.Map;
import java.lang.ref.WeakReference;
import android.app.Activity;
import java.util.WeakHashMap;
import android.app.Fragment;

public final class t3 extends Fragment implements m
{
    private static WeakHashMap<Activity, WeakReference<t3>> J;
    private Map<String, LifecycleCallback> G;
    private int H;
    @k0
    private Bundle I;
    
    static {
        t3.J = new WeakHashMap<Activity, WeakReference<t3>>();
    }
    
    public t3() {
        this.G = Collections.synchronizedMap(new a<String, LifecycleCallback>());
        this.H = 0;
    }
    
    public static t3 d(final Activity activity) {
        final WeakReference<t3> weakReference = t3.J.get(activity);
        if (weakReference != null) {
            final t3 t3 = weakReference.get();
            if (t3 != null) {
                return t3;
            }
        }
        try {
            final t3 t4 = (t3)activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            t3 referent = null;
            Label_0080: {
                if (t4 != null) {
                    referent = t4;
                    if (!t4.isRemoving()) {
                        break Label_0080;
                    }
                }
                referent = new t3();
                activity.getFragmentManager().beginTransaction().add((Fragment)referent, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            t3.J.put(activity, new WeakReference<t3>(referent));
            return referent;
        }
        catch (ClassCastException cause) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", cause);
        }
    }
    
    public final boolean a() {
        return this.H > 0;
    }
    
    public final void b(final String s, @j0 final LifecycleCallback lifecycleCallback) {
        if (!this.G.containsKey(s)) {
            this.G.put(s, lifecycleCallback);
            if (this.H > 0) {
                new i(Looper.getMainLooper()).post((Runnable)new s3(this, lifecycleCallback, s));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(s);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void dump(final String s, @k0 final FileDescriptor fileDescriptor, final PrintWriter printWriter, @k0 final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, fileDescriptor, printWriter, array);
        }
    }
    
    @k0
    public final <T extends LifecycleCallback> T e(final String s, final Class<T> clazz) {
        return clazz.cast(this.G.get(s));
    }
    
    public final Activity f() {
        return this.getActivity();
    }
    
    public final boolean n() {
        return this.H >= 2;
    }
    
    public final void onActivityResult(final int n, final int n2, @k0 final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().f(n, n2, intent);
        }
    }
    
    public final void onCreate(@k0 final Bundle i) {
        super.onCreate(i);
        this.H = 1;
        this.I = i;
        for (final Map.Entry<String, LifecycleCallback> entry : this.G.entrySet()) {
            final LifecycleCallback lifecycleCallback = entry.getValue();
            Bundle bundle;
            if (i != null) {
                bundle = i.getBundle((String)entry.getKey());
            }
            else {
                bundle = null;
            }
            lifecycleCallback.g(bundle);
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.H = 5;
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().h();
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.H = 3;
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().i();
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (final Map.Entry<String, LifecycleCallback> entry : this.G.entrySet()) {
            final Bundle bundle2 = new Bundle();
            entry.getValue().j(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.H = 2;
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().k();
        }
    }
    
    public final void onStop() {
        super.onStop();
        this.H = 4;
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().l();
        }
    }
}
