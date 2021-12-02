// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.os.Message;
import android.os.Looper;
import android.annotation.SuppressLint;
import com.google.android.gms.common.api.internal.t1;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.o;
import androidx.annotation.RecentlyNullable;
import android.content.Intent;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.api.GoogleApiActivity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.o1;
import com.google.android.gms.common.api.internal.q1;
import android.annotation.TargetApi;
import android.app.Notification;
import android.content.res.Resources;
import android.app.NotificationChannel;
import e2.a;
import com.google.android.gms.common.util.v;
import androidx.core.app.r;
import android.app.NotificationManager;
import android.app.PendingIntent;
import androidx.fragment.app.d;
import androidx.annotation.b1;
import com.google.android.gms.tasks.p;
import com.google.android.gms.common.api.internal.i;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.api.internal.c;
import java.util.Map;
import com.google.android.gms.tasks.m;
import com.google.android.gms.common.api.l;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.k0;
import com.google.android.gms.common.internal.f0;
import android.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import com.google.android.gms.common.internal.g0;
import android.view.View;
import android.app.AlertDialog$Builder;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;
import android.app.Dialog;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;
import androidx.annotation.w;
import androidx.annotation.j0;
import androidx.annotation.RecentlyNonNull;

public class g extends h
{
    private static final Object h;
    private static final g i;
    @RecentlyNonNull
    public static final int j;
    @j0
    public static final String k = "com.google.android.gms";
    @w("mLock")
    private String g;
    
    static {
        h = new Object();
        i = new g();
        j = com.google.android.gms.common.h.a;
    }
    
    @RecentlyNonNull
    public static Dialog F(@RecentlyNonNull final Activity activity, @RecentlyNonNull final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final ProgressBar view = new ProgressBar((Context)activity, (AttributeSet)null, 16842874);
        view.setIndeterminate(true);
        view.setVisibility(0);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)activity);
        alertDialog$Builder.setView((View)view);
        alertDialog$Builder.setMessage((CharSequence)g0.g((Context)activity, 18));
        alertDialog$Builder.setPositiveButton((CharSequence)"", (DialogInterface$OnClickListener)null);
        final AlertDialog create = alertDialog$Builder.create();
        L(activity, (Dialog)create, "GooglePlayServicesUpdatingDialog", dialogInterface$OnCancelListener);
        return (Dialog)create;
    }
    
    @k0
    static Dialog G(@j0 final Context context, final int i, final f0 f0, @k0 final DialogInterface$OnCancelListener onCancelListener) {
        AlertDialog$Builder alertDialog$Builder = null;
        if (i == 0) {
            return null;
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            alertDialog$Builder = new AlertDialog$Builder(context, 5);
        }
        AlertDialog$Builder alertDialog$Builder2;
        if ((alertDialog$Builder2 = alertDialog$Builder) == null) {
            alertDialog$Builder2 = new AlertDialog$Builder(context);
        }
        alertDialog$Builder2.setMessage((CharSequence)g0.g(context, i));
        if (onCancelListener != null) {
            alertDialog$Builder2.setOnCancelListener(onCancelListener);
        }
        final String j = g0.i(context, i);
        if (j != null) {
            alertDialog$Builder2.setPositiveButton((CharSequence)j, (DialogInterface$OnClickListener)f0);
        }
        final String b = g0.b(context, i);
        if (b != null) {
            alertDialog$Builder2.setTitle((CharSequence)b);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", i), (Throwable)new IllegalArgumentException());
        return (Dialog)alertDialog$Builder2.create();
    }
    
    @j0
    private static m<Map<c<?>, String>> I(@j0 final l<?> l, @j0 final l<?>... a) {
        x.l(l, "Requested API must not be null.");
        for (int length = a.length, i = 0; i < length; ++i) {
            x.l(a[i], "Requested API must not be null.");
        }
        final ArrayList<l<?>> list = new ArrayList<l<?>>(a.length + 1);
        list.add(l);
        list.addAll((Collection<?>)Arrays.asList(a));
        return com.google.android.gms.common.api.internal.i.d().h(list);
    }
    
    @b1(otherwise = 2)
    private final String K() {
        synchronized (com.google.android.gms.common.g.h) {
            return this.g;
        }
    }
    
    static void L(final Activity activity, final Dialog dialog, final String s, @k0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        if (activity instanceof d) {
            SupportErrorDialogFragment.O(dialog, dialogInterface$OnCancelListener).L(((d)activity).getSupportFragmentManager(), s);
            return;
        }
        com.google.android.gms.common.d.b(dialog, dialogInterface$OnCancelListener).show(activity.getFragmentManager(), s);
    }
    
    @TargetApi(20)
    private final void N(final Context context, int i, @k0 String s, @k0 final PendingIntent pendingIntent) {
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", i, null), (Throwable)new IllegalArgumentException());
        if (i == 18) {
            this.M(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
            return;
        }
        final String f = g0.f(context, i);
        s = g0.h(context, i);
        final Resources resources = context.getResources();
        final NotificationManager notificationManager = x.k(context.getSystemService("notification"));
        final r.g x0 = new r.g(context).c0(true).C(true).O(f).x0(new r.e().A(s));
        if (com.google.android.gms.common.util.l.j(context)) {
            x.q(v.i());
            x0.r0(context.getApplicationInfo().icon).i0(2);
            if (com.google.android.gms.common.util.l.l(context)) {
                x0.a(e2.a.c.a, resources.getString(e2.a.e.o), pendingIntent);
            }
            else {
                x0.M(pendingIntent);
            }
        }
        else {
            x0.r0(17301642).z0(resources.getString(e2.a.e.h)).F0(System.currentTimeMillis()).M(pendingIntent).N(s);
        }
        if (v.n()) {
            x.q(v.n());
            Label_0346: {
                if ((s = this.K()) == null) {
                    final String s2 = "com.google.android.gms.availability";
                    final NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    final String a = g0.a(context);
                    NotificationChannel notificationChannel2;
                    if (notificationChannel == null) {
                        notificationChannel2 = new NotificationChannel("com.google.android.gms.availability", (CharSequence)a, 4);
                    }
                    else {
                        s = s2;
                        if (a.contentEquals(notificationChannel.getName())) {
                            break Label_0346;
                        }
                        notificationChannel.setName((CharSequence)a);
                        notificationChannel2 = notificationChannel;
                    }
                    notificationManager.createNotificationChannel(notificationChannel2);
                    s = s2;
                }
            }
            x0.G(s);
        }
        final Notification h = x0.h();
        if (i != 1 && i != 2 && i != 3) {
            i = 39789;
        }
        else {
            i = 10436;
            com.google.android.gms.common.l.k.set(false);
        }
        notificationManager.notify(i, h);
    }
    
    @j0
    public static g y() {
        return g.i;
    }
    
    @TargetApi(26)
    public void A(@RecentlyNonNull final Context context, @RecentlyNonNull final String g) {
        if (v.n()) {
            x.k(x.k(context.getSystemService("notification")).getNotificationChannel(g));
        }
        synchronized (g.h) {
            this.g = g;
        }
    }
    
    @RecentlyNonNull
    public boolean B(@RecentlyNonNull final Activity activity, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        return this.C(activity, n, n2, null);
    }
    
    @RecentlyNonNull
    public boolean C(@RecentlyNonNull final Activity activity, @RecentlyNonNull final int n, @RecentlyNonNull final int n2, @k0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final Dialog u = this.u(activity, n, n2, dialogInterface$OnCancelListener);
        if (u == null) {
            return false;
        }
        L(activity, u, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
        return true;
    }
    
    public void D(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) {
        this.N(context, n, null, this.g(context, n, 0, "n"));
    }
    
    public void E(@RecentlyNonNull final Context context, @RecentlyNonNull final com.google.android.gms.common.c c) {
        this.N(context, c.M(), null, this.x(context, c));
    }
    
    @k0
    public final o1 H(final Context context, final q1 q1) {
        final IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        final o1 o1 = new o1(q1);
        context.registerReceiver((BroadcastReceiver)o1, intentFilter);
        o1.b(context);
        if (!this.n(context, "com.google.android.gms")) {
            q1.a();
            o1.a();
            return null;
        }
        return o1;
    }
    
    final void M(final Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000L);
    }
    
    @RecentlyNonNull
    public final boolean O(@RecentlyNonNull final Activity activity, @RecentlyNonNull final com.google.android.gms.common.api.internal.m m, @RecentlyNonNull final int n, @RecentlyNonNull final int n2, @k0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final Dialog g = G((Context)activity, n, f0.c(m, this.e((Context)activity, n, "d"), 2), dialogInterface$OnCancelListener);
        if (g == null) {
            return false;
        }
        L(activity, g, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
        return true;
    }
    
    @RecentlyNonNull
    public final boolean P(@RecentlyNonNull final Context context, @RecentlyNonNull final com.google.android.gms.common.c c, @RecentlyNonNull final int n) {
        final PendingIntent x = this.x(context, c);
        if (x != null) {
            this.N(context, c.M(), null, GoogleApiActivity.a(context, x, n));
            return true;
        }
        return false;
    }
    
    @RecentlyNonNull
    @b0
    @f2.a
    @Override
    public int c(@RecentlyNonNull final Context context) {
        return super.c(context);
    }
    
    @RecentlyNullable
    @b0
    @f2.a
    @Override
    public Intent e(@k0 final Context context, @RecentlyNonNull final int n, @k0 final String s) {
        return super.e(context, n, s);
    }
    
    @RecentlyNullable
    @Override
    public PendingIntent f(@RecentlyNonNull final Context context, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        return super.f(context, n, n2);
    }
    
    @j0
    @Override
    public final String h(@RecentlyNonNull final int n) {
        return super.h(n);
    }
    
    @RecentlyNonNull
    @o
    @Override
    public int j(@RecentlyNonNull final Context context) {
        return super.j(context);
    }
    
    @RecentlyNonNull
    @b0
    @f2.a
    @Override
    public int k(@RecentlyNonNull final Context context, @RecentlyNonNull final int n) {
        return super.k(context, n);
    }
    
    @RecentlyNonNull
    @Override
    public final boolean o(@RecentlyNonNull final int n) {
        return super.o(n);
    }
    
    @j0
    public m<Void> r(@RecentlyNonNull final j<?> j, @RecentlyNonNull final j<?>... array) {
        return I(j, (l<?>[])array).w((com.google.android.gms.tasks.l<Map<c<?>, String>, Void>)s.a);
    }
    
    @j0
    public m<Void> s(@RecentlyNonNull final l<?> l, @RecentlyNonNull final l<?>... array) {
        return I(l, array).w((com.google.android.gms.tasks.l<Map<c<?>, String>, Void>)t.a);
    }
    
    @RecentlyNullable
    public Dialog t(@RecentlyNonNull final Activity activity, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        return this.u(activity, n, n2, null);
    }
    
    @RecentlyNullable
    public Dialog u(@RecentlyNonNull final Activity activity, @RecentlyNonNull final int n, @RecentlyNonNull final int n2, @k0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        return G((Context)activity, n, f0.a(activity, this.e((Context)activity, n, "d"), n2), dialogInterface$OnCancelListener);
    }
    
    @RecentlyNullable
    public Dialog v(@RecentlyNonNull final Fragment fragment, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        return this.w(fragment, n, n2, null);
    }
    
    @RecentlyNullable
    public Dialog w(@RecentlyNonNull final Fragment fragment, @RecentlyNonNull final int n, @RecentlyNonNull final int n2, @k0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        return G(fragment.requireContext(), n, f0.b(fragment, this.e(fragment.requireContext(), n, "d"), n2), dialogInterface$OnCancelListener);
    }
    
    @RecentlyNullable
    public PendingIntent x(@RecentlyNonNull final Context context, @RecentlyNonNull final com.google.android.gms.common.c c) {
        if (c.Q1()) {
            return c.q1();
        }
        return this.f(context, c.M(), 0);
    }
    
    @androidx.annotation.g0
    @j0
    public m<Void> z(@RecentlyNonNull final Activity activity) {
        final int j = com.google.android.gms.common.g.j;
        x.f("makeGooglePlayServicesAvailable must be called from the main thread");
        final int k = this.k((Context)activity, j);
        if (k == 0) {
            return p.g((Void)null);
        }
        final t1 r = t1.r(activity);
        r.q(new com.google.android.gms.common.c(k, null), 0);
        return r.s();
    }
    
    @SuppressLint({ "HandlerLeak" })
    private final class a extends p
    {
        private final Context b;
        
        public a(final Context context) {
            Looper looper;
            if (Looper.myLooper() == null) {
                looper = Looper.getMainLooper();
            }
            else {
                looper = Looper.myLooper();
            }
            super(looper);
            this.b = context.getApplicationContext();
        }
        
        public final void handleMessage(final Message message) {
            final int what = message.what;
            if (what != 1) {
                final StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(what);
                Log.w("GoogleApiAvailability", sb.toString());
            }
            else {
                final int j = com.google.android.gms.common.g.this.j(this.b);
                if (com.google.android.gms.common.g.this.o(j)) {
                    com.google.android.gms.common.g.this.D(this.b, j);
                }
            }
        }
    }
}
