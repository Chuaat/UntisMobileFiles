// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.util.d0;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c0;
import com.google.android.gms.common.internal.w1;
import com.google.android.gms.common.o;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import androidx.annotation.k0;
import f2.a;

@Deprecated
@a
public final class j
{
    private static final Object e;
    @k0
    @d6.a("sLock")
    private static j f;
    @k0
    private final String a;
    private final Status b;
    private final boolean c;
    private final boolean d;
    
    static {
        e = new Object();
    }
    
    @d0
    @a
    j(final Context context) {
        final Resources resources = context.getResources();
        final int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(o.b.a));
        boolean c = false;
        final boolean b = true;
        if (identifier != 0) {
            if (resources.getInteger(identifier) != 0) {
                c = true;
            }
            this.d = (c ^ true);
        }
        else {
            this.d = false;
            c = b;
        }
        this.c = c;
        String a;
        if ((a = w1.a(context)) == null) {
            a = new c0(context).a("google_app_id");
        }
        if (TextUtils.isEmpty((CharSequence)a)) {
            this.b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
            return;
        }
        this.a = a;
        this.b = Status.L;
    }
    
    @d0
    @a
    j(final String a, final boolean c) {
        this.a = a;
        this.b = Status.L;
        this.c = c;
        this.d = (c ^ true);
    }
    
    @a
    private static j b(final String s) {
        synchronized (j.e) {
            final j f = j.f;
            if (f != null) {
                return f;
            }
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 34);
            sb.append("Initialize must be called before ");
            sb.append(s);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    @d0
    @a
    static void c() {
        synchronized (j.e) {
            j.f = null;
        }
    }
    
    @RecentlyNullable
    @a
    public static String d() {
        return b("getGoogleAppId").a;
    }
    
    @RecentlyNonNull
    @a
    public static Status e(@RecentlyNonNull final Context context) {
        x.l(context, "Context must not be null.");
        synchronized (j.e) {
            if (j.f == null) {
                j.f = new j(context);
            }
            return j.f.b;
        }
    }
    
    @RecentlyNonNull
    @a
    public static Status f(@RecentlyNonNull final Context context, @RecentlyNonNull final String s, @RecentlyNonNull final boolean b) {
        x.l(context, "Context must not be null.");
        x.h(s, "App ID must be nonempty.");
        synchronized (j.e) {
            final j f = j.f;
            if (f != null) {
                return f.a(s);
            }
            return (j.f = new j(s, b)).b;
        }
    }
    
    @RecentlyNonNull
    @a
    public static boolean g() {
        final j b = b("isMeasurementEnabled");
        return b.b.j3() && b.c;
    }
    
    @RecentlyNonNull
    @a
    public static boolean h() {
        return b("isMeasurementExplicitlyDisabled").d;
    }
    
    @d0
    @a
    final Status a(final String anObject) {
        final String a = this.a;
        if (a != null && !a.equals(anObject)) {
            final String a2 = this.a;
            final StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 97);
            sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
            sb.append(a2);
            sb.append("'.");
            return new Status(10, sb.toString());
        }
        return Status.L;
    }
}
