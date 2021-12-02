// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.k0;
import android.os.Bundle;
import android.content.Intent;
import androidx.annotation.g0;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.annotation.Keep;
import android.content.ContextWrapper;
import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public class LifecycleCallback
{
    @RecentlyNonNull
    @a
    protected final m G;
    
    @a
    protected LifecycleCallback(@RecentlyNonNull final m g) {
        this.G = g;
    }
    
    @RecentlyNonNull
    @a
    public static m c(@RecentlyNonNull final Activity activity) {
        return e(new l(activity));
    }
    
    @RecentlyNonNull
    @a
    public static m d(@RecentlyNonNull final ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
    
    @RecentlyNonNull
    @a
    protected static m e(@RecentlyNonNull final l l) {
        if (l.e()) {
            return zzc.s(l.b());
        }
        if (l.f()) {
            return t3.d(l.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
    
    @Keep
    private static m getChimeraLifecycleFragmentImpl(final l l) {
        throw new IllegalStateException("Method not available in SDK.");
    }
    
    @g0
    @a
    public void a(@RecentlyNonNull final String s, @RecentlyNonNull final FileDescriptor fileDescriptor, @RecentlyNonNull final PrintWriter printWriter, @RecentlyNonNull final String[] array) {
    }
    
    @RecentlyNonNull
    @a
    public Activity b() {
        return this.G.f();
    }
    
    @g0
    @a
    public void f(@RecentlyNonNull final int n, @RecentlyNonNull final int n2, @RecentlyNonNull final Intent intent) {
    }
    
    @g0
    @a
    public void g(@k0 final Bundle bundle) {
    }
    
    @g0
    @a
    public void h() {
    }
    
    @g0
    @a
    public void i() {
    }
    
    @g0
    @a
    public void j(@RecentlyNonNull final Bundle bundle) {
    }
    
    @g0
    @a
    public void k() {
    }
    
    @g0
    @a
    public void l() {
    }
}
