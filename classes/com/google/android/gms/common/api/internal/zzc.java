// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.app.Activity;
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
import androidx.fragment.app.d;
import java.util.WeakHashMap;
import androidx.fragment.app.Fragment;

public final class zzc extends Fragment implements m
{
    private static WeakHashMap<d, WeakReference<zzc>> J;
    private Map<String, LifecycleCallback> G;
    private int H;
    @k0
    private Bundle I;
    
    static {
        zzc.J = new WeakHashMap<d, WeakReference<zzc>>();
    }
    
    public zzc() {
        this.G = Collections.synchronizedMap(new a<String, LifecycleCallback>());
        this.H = 0;
    }
    
    public static zzc s(final d d) {
        final WeakReference<zzc> weakReference = zzc.J.get(d);
        if (weakReference != null) {
            final zzc zzc = weakReference.get();
            if (zzc != null) {
                return zzc;
            }
        }
        try {
            final zzc zzc2 = (zzc)d.getSupportFragmentManager().q0("SupportLifecycleFragmentImpl");
            zzc referent = null;
            Label_0080: {
                if (zzc2 != null) {
                    referent = zzc2;
                    if (!zzc2.isRemoving()) {
                        break Label_0080;
                    }
                }
                referent = new zzc();
                d.getSupportFragmentManager().r().l(referent, "SupportLifecycleFragmentImpl").s();
            }
            zzc.J.put(d, new WeakReference<zzc>(referent));
            return referent;
        }
        catch (ClassCastException cause) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", cause);
        }
    }
    
    @Override
    public final boolean a() {
        return this.H > 0;
    }
    
    @Override
    public final void b(final String s, @j0 final LifecycleCallback lifecycleCallback) {
        if (!this.G.containsKey(s)) {
            this.G.put(s, lifecycleCallback);
            if (this.H > 0) {
                new com.google.android.gms.internal.common.i(Looper.getMainLooper()).post((Runnable)new u3(this, lifecycleCallback, s));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(s);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void dump(final String s, @k0 final FileDescriptor fileDescriptor, final PrintWriter printWriter, @k0 final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, fileDescriptor, printWriter, array);
        }
    }
    
    @k0
    @Override
    public final <T extends LifecycleCallback> T e(final String s, final Class<T> clazz) {
        return clazz.cast(this.G.get(s));
    }
    
    @Override
    public final boolean n() {
        return this.H >= 2;
    }
    
    @Override
    public final void onActivityResult(final int n, final int n2, @k0 final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().f(n, n2, intent);
        }
    }
    
    @Override
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
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        this.H = 5;
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().h();
        }
    }
    
    @Override
    public final void onResume() {
        super.onResume();
        this.H = 3;
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().i();
        }
    }
    
    @Override
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
    
    @Override
    public final void onStart() {
        super.onStart();
        this.H = 2;
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().k();
        }
    }
    
    @Override
    public final void onStop() {
        super.onStop();
        this.H = 4;
        final Iterator<LifecycleCallback> iterator = this.G.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().l();
        }
    }
}
