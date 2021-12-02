// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import java.util.Collections;
import androidx.annotation.RecentlyNullable;
import java.util.Iterator;
import androidx.annotation.j0;
import android.os.Looper;
import com.google.android.gms.common.h;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.api.k;
import android.os.Handler;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import androidx.annotation.k0;
import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import com.google.android.gms.common.api.a;
import android.os.IInterface;

@f2.a
public abstract class l<T extends IInterface> extends e<T> implements a.f, o0
{
    private final g L;
    private final Set<Scope> M;
    @k0
    private final Account N;
    
    @d0
    @f2.a
    protected l(@RecentlyNonNull final Context context, @RecentlyNonNull final Handler handler, @RecentlyNonNull final int n, @RecentlyNonNull final g g) {
        this(context, handler, com.google.android.gms.common.internal.m.d(context), com.google.android.gms.common.g.y(), n, g, null, null);
    }
    
    @d0
    private l(final Context context, final Handler handler, final m m, final com.google.android.gms.common.g g, final int n, final g g2, @k0 final f f, @k0 final q q) {
        super(context, handler, m, g, n, u0(null), v0(null));
        this.L = com.google.android.gms.common.internal.x.k(g2);
        this.N = g2.b();
        this.M = this.w0(g2.e());
    }
    
    @Deprecated
    @d0
    private l(final Context context, final Handler handler, final m m, final com.google.android.gms.common.g g, final int n, final g g2, @k0 final com.google.android.gms.common.api.k.b b, @k0 final com.google.android.gms.common.api.k.c c) {
        this(context, handler, m, g, n, g2, null, (q)null);
    }
    
    @f2.a
    protected l(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final int n, @RecentlyNonNull final g g) {
        this(context, looper, com.google.android.gms.common.internal.m.d(context), com.google.android.gms.common.g.y(), n, g, null, null);
    }
    
    @f2.a
    protected l(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final int n, @RecentlyNonNull final g g, @RecentlyNonNull final f f, @RecentlyNonNull final q q) {
        this(context, looper, com.google.android.gms.common.internal.m.d(context), com.google.android.gms.common.g.y(), n, g, com.google.android.gms.common.internal.x.k(f), com.google.android.gms.common.internal.x.k(q));
    }
    
    @Deprecated
    @f2.a
    protected l(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final int n, @RecentlyNonNull final g g, @RecentlyNonNull final com.google.android.gms.common.api.k.b b, @RecentlyNonNull final com.google.android.gms.common.api.k.c c) {
        this(context, looper, n, g, b, (q)c);
    }
    
    @d0
    private l(final Context context, final Looper looper, final m m, final com.google.android.gms.common.g g, final int n, final g l, @k0 final f f, @k0 final q q) {
        super(context, looper, m, g, n, u0(f), v0(q), l.m());
        this.L = l;
        this.N = l.b();
        this.M = this.w0(l.e());
    }
    
    @d0
    private l(final Context context, final Looper looper, final m m, final com.google.android.gms.common.g g, final int n, final g g2, @k0 final com.google.android.gms.common.api.k.b b, @k0 final com.google.android.gms.common.api.k.c c) {
        this(context, looper, m, g, n, g2, null, (q)null);
    }
    
    @k0
    private static a u0(@k0 final f f) {
        if (f == null) {
            return null;
        }
        return new com.google.android.gms.common.internal.k0(f);
    }
    
    @k0
    private static b v0(@k0 final q q) {
        if (q == null) {
            return null;
        }
        return new m0(q);
    }
    
    private final Set<Scope> w0(@j0 final Set<Scope> set) {
        final Set<Scope> t0 = this.t0(set);
        final Iterator<Scope> iterator = t0.iterator();
        while (iterator.hasNext()) {
            if (set.contains(iterator.next())) {
                continue;
            }
            throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
        }
        return t0;
    }
    
    @RecentlyNullable
    @Override
    public final Account D() {
        return this.N;
    }
    
    @RecentlyNonNull
    @f2.a
    @Override
    protected final Set<Scope> J() {
        return this.M;
    }
    
    @j0
    @f2.a
    @Override
    public Set<Scope> h() {
        if (this.w()) {
            return this.M;
        }
        return Collections.emptySet();
    }
    
    @RecentlyNonNull
    @f2.a
    @Override
    public com.google.android.gms.common.e[] p() {
        return new com.google.android.gms.common.e[0];
    }
    
    @RecentlyNonNull
    @f2.a
    protected final g s0() {
        return this.L;
    }
    
    @j0
    @f2.a
    protected Set<Scope> t0(@RecentlyNonNull final Set<Scope> set) {
        return set;
    }
}
