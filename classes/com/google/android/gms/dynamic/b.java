// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import android.os.Bundle;
import com.google.android.gms.common.internal.x;
import android.view.View;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.k0;
import android.app.Fragment;
import f2.a;
import android.annotation.SuppressLint;

@SuppressLint({ "NewApi" })
@a
public final class b extends c.a
{
    private Fragment f;
    
    private b(final Fragment f) {
        this.f = f;
    }
    
    @RecentlyNullable
    @a
    public static b y2(@k0 final Fragment fragment) {
        if (fragment != null) {
            return new b(fragment);
        }
        return null;
    }
    
    @Override
    public final void F(@RecentlyNonNull final boolean menuVisibility) {
        this.f.setMenuVisibility(menuVisibility);
    }
    
    @Override
    public final void I(@RecentlyNonNull final Intent intent) {
        this.f.startActivity(intent);
    }
    
    @Override
    public final void P1(@RecentlyNonNull final boolean hasOptionsMenu) {
        this.f.setHasOptionsMenu(hasOptionsMenu);
    }
    
    @Override
    public final void T1(@RecentlyNonNull final d d) {
        this.f.registerForContextMenu((View)x.k(com.google.android.gms.dynamic.f.y2(d)));
    }
    
    @RecentlyNonNull
    @Override
    public final int a() {
        return this.f.getId();
    }
    
    @RecentlyNullable
    @Override
    public final c c() {
        return y2(this.f.getParentFragment());
    }
    
    @RecentlyNonNull
    @Override
    public final d e() {
        return com.google.android.gms.dynamic.f.z2(this.f.getResources());
    }
    
    @Override
    public final void f0(@RecentlyNonNull final boolean userVisibleHint) {
        this.f.setUserVisibleHint(userVisibleHint);
    }
    
    @Override
    public final void f1(@RecentlyNonNull final Intent intent, @RecentlyNonNull final int n) {
        this.f.startActivityForResult(intent, n);
    }
    
    @RecentlyNullable
    @Override
    public final c g() {
        return y2(this.f.getTargetFragment());
    }
    
    @Override
    public final void h1(@RecentlyNonNull final boolean retainInstance) {
        this.f.setRetainInstance(retainInstance);
    }
    
    @RecentlyNonNull
    @Override
    public final d i() {
        return com.google.android.gms.dynamic.f.z2(this.f.getView());
    }
    
    @RecentlyNonNull
    @Override
    public final boolean j() {
        return this.f.isRemoving();
    }
    
    @RecentlyNonNull
    @Override
    public final int k() {
        return this.f.getTargetRequestCode();
    }
    
    @RecentlyNonNull
    @Override
    public final boolean l() {
        return this.f.isVisible();
    }
    
    @RecentlyNullable
    @Override
    public final String m() {
        return this.f.getTag();
    }
    
    @RecentlyNonNull
    @Override
    public final boolean n() {
        return this.f.isResumed();
    }
    
    @RecentlyNonNull
    @Override
    public final boolean o() {
        return this.f.getRetainInstance();
    }
    
    @Override
    public final void o1(@RecentlyNonNull final d d) {
        this.f.unregisterForContextMenu((View)x.k(com.google.android.gms.dynamic.f.y2(d)));
    }
    
    @RecentlyNonNull
    @Override
    public final boolean p() {
        return this.f.isAdded();
    }
    
    @RecentlyNonNull
    @Override
    public final boolean q() {
        return this.f.isDetached();
    }
    
    @RecentlyNonNull
    @Override
    public final boolean r() {
        return this.f.getUserVisibleHint();
    }
    
    @RecentlyNonNull
    @Override
    public final boolean s() {
        return this.f.isHidden();
    }
    
    @RecentlyNonNull
    @Override
    public final boolean t() {
        return this.f.isInLayout();
    }
    
    @RecentlyNonNull
    @Override
    public final d zza() {
        return com.google.android.gms.dynamic.f.z2(this.f.getActivity());
    }
    
    @RecentlyNonNull
    @Override
    public final Bundle zzb() {
        return this.f.getArguments();
    }
}
