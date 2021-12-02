// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs;

import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.os.Parcelable;
import java.util.Objects;
import com.untis.mobile.services.profile.legacy.j0;
import android.annotation.SuppressLint;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.appcompat.app.d$a;
import android.app.Dialog;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import android.widget.CheckBox;
import com.untis.mobile.utils.u0;
import android.widget.LinearLayout;
import com.untis.mobile.ui.activities.InfoCenterActivity;
import org.joda.time.c;
import java.util.Iterator;
import org.joda.time.n0;
import org.joda.time.t;
import java.util.Collection;
import kotlin.collections.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.persistence.models.exam.Exam;
import kotlin.jvm.internal.k0;
import android.view.View;
import android.content.DialogInterface;
import androidx.fragment.app.d;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import com.untis.mobile.systemNotifications.b;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.adapters.j;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.fragment.app.DialogFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006," }, d2 = { "Lcom/untis/mobile/ui/dialogs/InfoCenterNotificationDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/untis/mobile/ui/adapters/j$a;", "thingToDo", "Landroid/view/View;", "view", "Lkotlin/j2;", "V", "P", "Lorg/joda/time/t;", "today", "", "offset", "", "S", "", "Lcom/untis/mobile/ui/dialogs/a;", "Q", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/app/Dialog;", "B", "outState", "onSaveInstanceState", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lcom/untis/mobile/persistence/models/profile/Profile;", "i0", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/systemNotifications/b;", "j0", "Lkotlin/b0;", "R", "()Lcom/untis/mobile/systemNotifications/b;", "systemNotificationService", "h0", "Lcom/untis/mobile/ui/adapters/j$a;", "<init>", "()V", "k0", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class InfoCenterNotificationDialog extends DialogFragment
{
    @e
    public static final a k0;
    @e
    public static final String l0 = "thatShouldBeFun";
    @e
    private static final String m0 = "soHelpMeGod";
    @e
    private static final String n0 = "bossOrNotBoss";
    private j.a h0;
    private Profile i0;
    @e
    private final b0 j0;
    
    static {
        k0 = new a(null);
    }
    
    public InfoCenterNotificationDialog() {
        this.j0 = d0.c((n6.a<?>)new n6.a<b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final b invoke() {
                return (b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(b.class), null, null);
            }
        });
    }
    
    private final void P(final j.a a) {
        if (a.j()) {
            final b r = this.R();
            final Profile i0 = this.i0;
            if (i0 == null) {
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
            final String uniqueId = i0.getUniqueId();
            final Exam c = a.c();
            kotlin.jvm.internal.k0.o(c, "thingToDo.exam");
            r.q(uniqueId, c);
        }
        if (a.k()) {
            final b r2 = this.R();
            final Profile i2 = this.i0;
            if (i2 == null) {
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
            final String uniqueId2 = i2.getUniqueId();
            final HomeWork d = a.d();
            kotlin.jvm.internal.k0.o(d, "thingToDo.homeWork");
            r2.j(uniqueId2, d);
        }
    }
    
    private final Set<com.untis.mobile.ui.dialogs.a> Q(final j.a a) {
        final HashSet<com.untis.mobile.ui.dialogs.a> set = new HashSet<com.untis.mobile.ui.dialogs.a>();
        final ArrayList<Object> list = new ArrayList<Object>();
        final Profile i0 = this.i0;
        if (i0 != null) {
            final String uniqueId = i0.getUniqueId();
            if (a.j()) {
                v.q0((Collection<? super Object>)list, (Iterable<?>)this.R().o(uniqueId, a.c().getId()));
            }
            if (a.k()) {
                v.q0((Collection<? super Object>)list, (Iterable<?>)this.R().k(uniqueId, a.d().getId()));
            }
            final t h1 = a.b().h1();
            for (final com.untis.mobile.systemNotifications.a a2 : list) {
                final t t = new t(a2.n());
                if (a2.j() != 0) {
                    set.add(a.H.a(a2.j()));
                }
                else {
                    for (final com.untis.mobile.ui.dialogs.a a3 : a.values()) {
                        if (((org.joda.time.base.e)t).p((n0)h1.l0(a3.d()))) {
                            set.add(a3);
                        }
                    }
                }
            }
            return set;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    private final b R() {
        return this.j0.getValue();
    }
    
    private final boolean S(final j.a a, final t t, final int n) {
        c c;
        if (a.j()) {
            c = a.g();
        }
        else {
            if (!a.k()) {
                return false;
            }
            c = a.b();
        }
        return ((org.joda.time.base.e)t).o((n0)c.h1().l0(n));
    }
    
    private static final void T(final InfoCenterNotificationDialog infoCenterNotificationDialog, final d d, final DialogInterface dialogInterface, final int n) {
        kotlin.jvm.internal.k0.p(infoCenterNotificationDialog, "this$0");
        kotlin.jvm.internal.k0.p(d, "$activity");
        final j.a h0 = infoCenterNotificationDialog.h0;
        if (h0 != null) {
            infoCenterNotificationDialog.P(h0);
            dialogInterface.dismiss();
            if (d instanceof InfoCenterActivity) {
                u0.n(((Activity)d).findViewById(com.untis.mobile.c.i.u6), ((Fragment)infoCenterNotificationDialog).getString(2131886314));
            }
            return;
        }
        kotlin.jvm.internal.k0.S("thingToDo");
        throw null;
    }
    
    private static final void U(final InfoCenterNotificationDialog infoCenterNotificationDialog, final View view, final DialogInterface dialogInterface, final int n) {
        kotlin.jvm.internal.k0.p(infoCenterNotificationDialog, "this$0");
        final j.a h0 = infoCenterNotificationDialog.h0;
        if (h0 != null) {
            kotlin.jvm.internal.k0.o(view, "view");
            infoCenterNotificationDialog.V(h0, view);
            return;
        }
        kotlin.jvm.internal.k0.S("thingToDo");
        throw null;
    }
    
    private final void V(final j.a a, final View view) {
        final Profile i0 = this.i0;
        if (i0 != null) {
            final String uniqueId = i0.getUniqueId();
            this.P(a);
            if (a.j()) {
                final Exam c = a.c();
                if (((CheckBox)view.findViewById(com.untis.mobile.c.i.ul)).isChecked()) {
                    final b r = this.R();
                    kotlin.jvm.internal.k0.o(c, "exam");
                    r.b(uniqueId, c, 1);
                }
                if (((CheckBox)view.findViewById(com.untis.mobile.c.i.vl)).isChecked()) {
                    final b r2 = this.R();
                    kotlin.jvm.internal.k0.o(c, "exam");
                    r2.b(uniqueId, c, 3);
                }
                if (((CheckBox)view.findViewById(com.untis.mobile.c.i.wl)).isChecked()) {
                    final b r3 = this.R();
                    kotlin.jvm.internal.k0.o(c, "exam");
                    r3.b(uniqueId, c, 7);
                }
                if (((CheckBox)view.findViewById(com.untis.mobile.c.i.xl)).isChecked()) {
                    final b r4 = this.R();
                    kotlin.jvm.internal.k0.o(c, "exam");
                    r4.b(uniqueId, c, 14);
                }
            }
            if (a.k()) {
                final HomeWork d = a.d();
                if (((CheckBox)view.findViewById(com.untis.mobile.c.i.ul)).isChecked()) {
                    final b r5 = this.R();
                    kotlin.jvm.internal.k0.o(d, "homeWork");
                    r5.m(uniqueId, d, 1);
                }
                if (((CheckBox)view.findViewById(com.untis.mobile.c.i.vl)).isChecked()) {
                    final b r6 = this.R();
                    kotlin.jvm.internal.k0.o(d, "homeWork");
                    r6.m(uniqueId, d, 3);
                }
                if (((CheckBox)view.findViewById(com.untis.mobile.c.i.wl)).isChecked()) {
                    final b r7 = this.R();
                    kotlin.jvm.internal.k0.o(d, "homeWork");
                    r7.m(uniqueId, d, 7);
                }
                if (((CheckBox)view.findViewById(com.untis.mobile.c.i.xl)).isChecked()) {
                    final b r8 = this.R();
                    kotlin.jvm.internal.k0.o(d, "homeWork");
                    r8.m(uniqueId, d, 14);
                }
            }
            if (((Fragment)this).getActivity() != null && ((Fragment)this).getActivity() instanceof InfoCenterActivity) {
                final d activity = ((Fragment)this).getActivity();
                kotlin.jvm.internal.k0.m(activity);
                u0.n(((Activity)activity).findViewById(com.untis.mobile.c.i.u6), ((Fragment)this).getString(2131886315));
            }
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @SuppressLint({ "InflateParams" })
    @e
    public Dialog B(@f final Bundle bundle) {
        final d activity = ((Fragment)this).getActivity();
        if (activity == null) {
            final Context context = ((Fragment)this).getContext();
            if (context != null) {
                return new Dialog(context);
            }
            throw new RuntimeException("no context available");
        }
        else {
            final d$a d$a = new d$a((Context)activity, 2131951624);
            final View inflate = LayoutInflater.from(((Fragment)this).getContext()).inflate(2131493041, (ViewGroup)null, false);
            final j.a h0 = this.h0;
            if (h0 == null) {
                kotlin.jvm.internal.k0.S("thingToDo");
                throw null;
            }
            final Set<com.untis.mobile.ui.dialogs.a> q = this.Q(h0);
            final int ul = com.untis.mobile.c.i.ul;
            final CheckBox checkBox = (CheckBox)inflate.findViewById(ul);
            final com.untis.mobile.ui.dialogs.a j = com.untis.mobile.ui.dialogs.a.J;
            checkBox.setChecked(q.contains(j));
            final int vl = com.untis.mobile.c.i.vl;
            final CheckBox checkBox2 = (CheckBox)inflate.findViewById(vl);
            final com.untis.mobile.ui.dialogs.a k = com.untis.mobile.ui.dialogs.a.K;
            checkBox2.setChecked(q.contains(k));
            final int wl = com.untis.mobile.c.i.wl;
            final CheckBox checkBox3 = (CheckBox)inflate.findViewById(wl);
            final com.untis.mobile.ui.dialogs.a l = com.untis.mobile.ui.dialogs.a.L;
            checkBox3.setChecked(q.contains(l));
            final int xl = com.untis.mobile.c.i.xl;
            final CheckBox checkBox4 = (CheckBox)inflate.findViewById(xl);
            final com.untis.mobile.ui.dialogs.a m = com.untis.mobile.ui.dialogs.a.M;
            checkBox4.setChecked(q.contains(m));
            final t b = com.untis.mobile.utils.time.a.b();
            final CheckBox checkBox5 = (CheckBox)inflate.findViewById(ul);
            final j.a h2 = this.h0;
            if (h2 == null) {
                kotlin.jvm.internal.k0.S("thingToDo");
                throw null;
            }
            checkBox5.setEnabled(this.S(h2, b, j.d()));
            final CheckBox checkBox6 = (CheckBox)inflate.findViewById(vl);
            final j.a h3 = this.h0;
            if (h3 == null) {
                kotlin.jvm.internal.k0.S("thingToDo");
                throw null;
            }
            checkBox6.setEnabled(this.S(h3, b, k.d()));
            final CheckBox checkBox7 = (CheckBox)inflate.findViewById(wl);
            final j.a h4 = this.h0;
            if (h4 == null) {
                kotlin.jvm.internal.k0.S("thingToDo");
                throw null;
            }
            checkBox7.setEnabled(this.S(h4, b, l.d()));
            final CheckBox checkBox8 = (CheckBox)inflate.findViewById(xl);
            final j.a h5 = this.h0;
            if (h5 != null) {
                checkBox8.setEnabled(this.S(h5, b, m.d()));
                d$a.M(inflate);
                d$a.s((CharSequence)((Activity)activity).getString(2131886653), (DialogInterface$OnClickListener)new g(this, activity));
                d$a.v((CharSequence)((Activity)activity).getString(2131886649), (DialogInterface$OnClickListener)null);
                d$a.C((CharSequence)((Activity)activity).getString(2131886664), (DialogInterface$OnClickListener)new com.untis.mobile.ui.dialogs.f(this, inflate));
                final androidx.appcompat.app.d a = d$a.a();
                kotlin.jvm.internal.k0.o(a, "builder.create()");
                return (Dialog)a;
            }
            kotlin.jvm.internal.k0.S("thingToDo");
            throw null;
        }
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        final j0 g = com.untis.mobile.services.profile.legacy.j0.G;
        Bundle arguments;
        if (bundle == null) {
            arguments = ((Fragment)this).getArguments();
        }
        else {
            arguments = bundle;
        }
        final String s = "";
        String string;
        if (arguments == null) {
            string = s;
        }
        else {
            string = arguments.getString("bossOrNotBoss");
            if (string == null) {
                string = s;
            }
        }
        Profile i0;
        if ((i0 = g.l(string)) == null) {
            i0 = g.n();
            if (i0 == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.i0 = i0;
        Bundle arguments2;
        if ((arguments2 = bundle) == null) {
            arguments2 = ((Fragment)this).getArguments();
        }
        j.a a;
        if (arguments2 == null) {
            a = null;
        }
        else {
            a = (j.a)arguments2.getParcelable("soHelpMeGod");
        }
        j.a h0 = a;
        if (a == null) {
            final Profile i2 = this.i0;
            if (i2 == null) {
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
            h0 = new j.a(i2.getUniqueId());
        }
        this.h0 = h0;
    }
    
    public void onDismiss(@e final DialogInterface dialogInterface) {
        kotlin.jvm.internal.k0.p(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (((Fragment)this).getActivity() instanceof InfoCenterActivity) {
            final d activity = ((Fragment)this).getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.untis.mobile.ui.activities.InfoCenterActivity");
            ((InfoCenterActivity)activity).a0();
        }
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        kotlin.jvm.internal.k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final j.a h0 = this.h0;
        if (h0 == null) {
            kotlin.jvm.internal.k0.S("thingToDo");
            throw null;
        }
        bundle.putParcelable("soHelpMeGod", (Parcelable)h0);
        final Profile i0 = this.i0;
        if (i0 != null) {
            bundle.putString("bossOrNotBoss", i0.getUniqueId());
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f" }, d2 = { "com/untis/mobile/ui/dialogs/InfoCenterNotificationDialog$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/ui/adapters/j$a;", "thingToDo", "Landroidx/fragment/app/DialogFragment;", "a", "", "BUNDLE_PROFILE_UNIQUE_ID", "Ljava/lang/String;", "BUNDLE_THING_TO_DO", "TAG", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final DialogFragment a(@e final Profile profile, @e final j.a a) {
            kotlin.jvm.internal.k0.p(profile, "profile");
            kotlin.jvm.internal.k0.p(a, "thingToDo");
            final InfoCenterNotificationDialog infoCenterNotificationDialog = new InfoCenterNotificationDialog();
            final Bundle arguments = new Bundle();
            arguments.putParcelable("soHelpMeGod", (Parcelable)a);
            arguments.putString("bossOrNotBoss", profile.getUniqueId());
            ((Fragment)infoCenterNotificationDialog).setArguments(arguments);
            return infoCenterNotificationDialog;
        }
    }
}
