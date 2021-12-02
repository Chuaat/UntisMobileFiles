// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.launcher;

import com.untis.mobile.persistence.models.profile.Right;
import com.untis.mobile.persistence.models.EntityType;
import androidx.lifecycle.x0;
import android.os.Bundle;
import com.untis.mobile.utils.l0;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.substitutionplanning.askteacher.list.SubstitutionRequestsActivity;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import org.joda.time.n0;
import com.untis.mobile.utils.v;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;
import java.util.Collection;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.b2;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.k0;
import org.joda.time.c;
import com.untis.mobile.utils.settings.g;
import com.untis.mobile.firebase.b;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.profile.legacy.a;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010.\u001a\u00020,¢\u0006\u0004\b7\u00108J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\tJ\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u0016J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010!\u001a\u00020\tR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069" }, d2 = { "Lcom/untis/mobile/ui/activities/launcher/k;", "Landroidx/lifecycle/w0;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "l", "f", "Landroid/content/Context;", "context", "Lkotlin/j2;", "n", "o", "isDemo", "e", "u", "k", "v", "m", "Lrx/g;", "r", "", "seconds", "", "j", "i", "", "g", "p", "profileId", "h", "Landroid/os/Bundle;", "data", "d", "q", "Lcom/untis/mobile/services/profile/legacy/a;", "a", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/utils/settings/g;", "Lcom/untis/mobile/utils/settings/g;", "settings", "Lorg/joda/time/c;", "Lorg/joda/time/c;", "lastUpdate", "Lcom/untis/mobile/analytics/base/b;", "Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lcom/untis/mobile/utils/a;", "b", "Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/firebase/b;", "c", "Lcom/untis/mobile/firebase/b;", "firebaseHelper", "<init>", "(Lcom/untis/mobile/services/profile/legacy/a;Lcom/untis/mobile/utils/a;Lcom/untis/mobile/firebase/b;Lcom/untis/mobile/utils/settings/g;Lcom/untis/mobile/analytics/base/b;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k extends w0
{
    @e
    private final com.untis.mobile.services.profile.legacy.a a;
    @e
    private final com.untis.mobile.utils.a b;
    @e
    private final b c;
    @e
    private final g d;
    @e
    private final com.untis.mobile.analytics.base.b e;
    @e
    private final c f;
    
    public k(@e final com.untis.mobile.services.profile.legacy.a a, @e final com.untis.mobile.utils.a b, @e final b c, @e final g d, @e final com.untis.mobile.analytics.base.b e) {
        k0.p(a, "profileService");
        k0.p(b, "appSettings");
        k0.p(c, "firebaseHelper");
        k0.p(d, "settings");
        k0.p(e, "analyticsTracker");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new c(b.q());
    }
    
    public static final /* synthetic */ com.untis.mobile.services.profile.legacy.a c(final k k) {
        return k.a;
    }
    
    private final void e(final boolean b) {
        this.e.a(b ^ true);
    }
    
    private final Profile f(final Profile profile) {
        final StringBuilder sb = new StringBuilder();
        sb.append("updating profile on launch '");
        sb.append(profile.getUniqueId());
        sb.append('\'');
        timber.log.b.b(sb.toString(), new Object[0]);
        h.f((r0)b2.G, (kotlin.coroutines.g)i1.c(), (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ Profile H;
            final /* synthetic */ k I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ Profile H = this.H;
                    final /* synthetic */ k I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0141: {
                    Label_0115: {
                        if (g != 0) {
                            if (g != 1) {
                                if (g == 2) {
                                    c1.n(o);
                                    break Label_0115;
                                }
                                if (g == 3) {
                                    c1.n(o);
                                    break Label_0141;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                            }
                        }
                        else {
                            c1.n(o);
                            final com.untis.mobile.services.timetable.placeholder.k timeTableService = this.H.getTimeTableService();
                            this.G = 1;
                            if (timeTableService.A(this) == h) {
                                return h;
                            }
                        }
                        final com.untis.mobile.services.classbook.a classBookService = this.H.getClassBookService();
                        this.G = 2;
                        if (classBookService.g0(this) == h) {
                            return h;
                        }
                    }
                    final com.untis.mobile.services.masterdata.a masterDataService = this.H.getMasterDataService();
                    this.G = 3;
                    if (masterDataService.A(this) == h) {
                        return h;
                    }
                }
                k.c(this.I).d(this.H);
                return j2.a;
            }
        }, 2, (Object)null);
        return profile;
    }
    
    private final boolean l(final Profile profile) {
        final List<Schoolyear> k = profile.getMasterDataService().K();
        final boolean b = k instanceof Collection;
        final boolean b2 = false;
        boolean b3;
        if (b && k.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator<Object> iterator = k.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (!((org.joda.time.base.e)iterator.next().getEnd()).m((n0)v.a.g()));
            b3 = true;
        }
        return b3;
    }
    
    private final void n(final Context context, final Profile profile) {
        context.startActivity(SubstitutionRequestsActivity.H.a(context, profile.getUniqueId()));
    }
    
    private final void o(final Context context, final Profile profile) {
        j0.G.h(profile);
        new androidx.navigation.v(context).h(2131689473).g(2131297321).a().send();
    }
    
    private static final rx.g s(final Profile profile, final Throwable t) {
        k0.p(profile, "$profile");
        timber.log.b.g(t, "error on update profile", new Object[0]);
        return l0.a(profile);
    }
    
    private static final Profile t(final k k, final Profile profile) {
        k0.p(k, "this$0");
        k0.o(profile, "it");
        return k.f(profile);
    }
    
    public final boolean d(@e final Context context, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(context, "context");
        if (bundle == null) {
            return false;
        }
        final Profile f = this.c.f(bundle.getString("profile"));
        if (f == null) {
            return false;
        }
        final com.untis.mobile.firebase.model.b e = this.c.e(bundle.getString("actions"));
        if (e.isEmpty()) {
            return false;
        }
        final Iterator<com.untis.mobile.firebase.model.a> iterator = e.iterator();
        while (iterator.hasNext()) {
            final int n = k.a.a[iterator.next().f().ordinal()];
            if (n == 1) {
                this.n(context, f);
                return true;
            }
            if (n == 2) {
                this.o(context, f);
                return true;
            }
            if (n != 3) {
                continue;
            }
            h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ Profile H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ Profile H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((k$b)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final com.untis.mobile.services.timetable.placeholder.k timeTableService = this.H.getTimeTableService();
                        this.G = 1;
                        if (timeTableService.B(this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 3, (Object)null);
        }
        return false;
    }
    
    @e
    public final List<Profile> g() {
        return kotlin.collections.v.I5((Iterable<? extends Profile>)this.a.g());
    }
    
    @org.jetbrains.annotations.f
    public final Profile h(@e final String s) {
        k0.p(s, "profileId");
        return this.a.l(s);
    }
    
    @org.jetbrains.annotations.f
    public final Profile i() {
        return this.a.n();
    }
    
    @e
    public final String j(final long n) {
        final int n2 = (int)(n % 4);
        String s;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    s = "";
                }
                else {
                    s = " . . .";
                }
            }
            else {
                s = " . .";
            }
        }
        else {
            s = " .";
        }
        return s;
    }
    
    public final boolean k() {
        return ((org.joda.time.base.c)this.f).C((org.joda.time.l0)v.a.e().z0((int)com.untis.mobile.utils.settings.e.a(this.d)));
    }
    
    public final boolean m(@org.jetbrains.annotations.f final Profile profile) {
        if (profile == null) {
            return false;
        }
        if (profile.isDemoUser()) {
            return false;
        }
        if (!profile.getUpdated()) {
            return true;
        }
        if (profile.getRegistered() <= 0L) {
            return true;
        }
        final boolean l = this.l(profile);
        final int n = (int)com.untis.mobile.utils.settings.e.a(this.d);
        final v a = v.a;
        final boolean c = ((org.joda.time.base.c)this.f).C((org.joda.time.l0)a.e().z0(n));
        if (l && c) {
            return true;
        }
        final boolean c2 = ((org.joda.time.base.c)this.f).C((org.joda.time.l0)a.e().z0((int)com.untis.mobile.utils.settings.e.b(this.d)));
        return !l && c2;
    }
    
    public final void p(@e final Profile profile) {
        k0.p(profile, "profile");
        this.a.h(profile);
    }
    
    public final void q() {
        final Profile i = this.i();
        if (i != null) {
            this.e(i.isDemoUser());
            com.untis.mobile.analytics.base.b b;
            String s;
            com.untis.mobile.analytics.base.c.g g;
            if (i.hasAnyRole(EntityType.TEACHER)) {
                b = this.e;
                s = com.untis.mobile.analytics.base.c.a.H.d();
                g = com.untis.mobile.analytics.base.c.g.H;
            }
            else if (i.getEntityType().isParentRole()) {
                b = this.e;
                s = com.untis.mobile.analytics.base.c.a.H.d();
                g = com.untis.mobile.analytics.base.c.g.J;
            }
            else if (i.getEntityType().isStudentRole()) {
                b = this.e;
                s = com.untis.mobile.analytics.base.c.a.H.d();
                g = com.untis.mobile.analytics.base.c.g.I;
            }
            else if (i.hasAnyRole(EntityType.CLASS)) {
                b = this.e;
                s = com.untis.mobile.analytics.base.c.a.H.d();
                g = com.untis.mobile.analytics.base.c.g.L;
            }
            else if (i.isAnonymousUser()) {
                b = this.e;
                s = com.untis.mobile.analytics.base.c.a.H.d();
                g = com.untis.mobile.analytics.base.c.g.K;
            }
            else if (i.hasAnyRole(EntityType.ROOM)) {
                b = this.e;
                s = com.untis.mobile.analytics.base.c.a.H.d();
                g = com.untis.mobile.analytics.base.c.g.M;
            }
            else if (i.hasAnyRole(EntityType.SUBJECT)) {
                b = this.e;
                s = com.untis.mobile.analytics.base.c.a.H.d();
                g = com.untis.mobile.analytics.base.c.g.N;
            }
            else {
                b = this.e;
                s = com.untis.mobile.analytics.base.c.a.H.d();
                g = com.untis.mobile.analytics.base.c.g.O;
            }
            b.b(s, g.d());
            if (i.hasAnyRight(Right.CLASSREGISTER)) {
                this.e.b(com.untis.mobile.analytics.base.c.a.I.d(), com.untis.mobile.analytics.base.c.f.H.d());
            }
            com.untis.mobile.analytics.base.b b2;
            String s2;
            String s3;
            if (i.isPremium()) {
                b2 = this.e;
                s2 = com.untis.mobile.analytics.base.c.a.J.d();
                s3 = "active";
            }
            else {
                b2 = this.e;
                s2 = com.untis.mobile.analytics.base.c.a.J.d();
                s3 = "inactive";
            }
            b2.b(s2, s3);
        }
    }
    
    @e
    public final rx.g<Profile> r(@e final Profile profile) {
        k0.p(profile, "profile");
        final rx.g k3 = this.a.q(profile, true).d4((rx.functions.p)new i(profile)).k3((rx.functions.p)new j(this));
        k0.o(k3, "profileService\n                .createProfileFromPrototype(\n                        prototype = profile,\n                        ignoreGetAppSharedSecretRequest = true\n                ).onErrorResumeNext { throwable ->\n                    Timber.e(throwable, \"error on update profile\")\n\n                    return@onErrorResumeNext observable(profile)\n                }\n                .map { cleanUp(it) }");
        return (rx.g<Profile>)k3;
    }
    
    public final void u() {
        this.a.f();
    }
    
    public final void v() {
        this.b.n0(((org.joda.time.base.g)v.a.e()).n());
        this.b.o0(603);
    }
}
