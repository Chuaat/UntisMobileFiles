// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.firebase;

import java.util.Iterator;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.firebase.model.c;
import java.util.ArrayList;
import kotlin.n1;
import android.os.Bundle;
import n6.l;
import androidx.navigation.v;
import com.untis.mobile.substitutionplanning.askteacher.list.SubstitutionRequestsActivity;
import com.untis.mobile.ui.activities.launcher.LauncherActivity;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import com.untis.mobile.services.timetable.placeholder.k;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import android.app.Notification;
import android.os.Build$VERSION;
import kotlin.jvm.internal.k0;
import android.media.RingtoneManager;
import android.content.Context;
import androidx.core.app.r$g;
import android.app.PendingIntent;
import com.google.firebase.messaging.p0;
import com.untis.mobile.persistence.models.profile.Profile;
import android.util.Log;
import android.app.NotificationManager;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import com.untis.mobile.api.register.RegisterService;
import n6.a;
import kotlin.b0;
import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import com.google.firebase.messaging.FirebaseMessagingService;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J&\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)¨\u0006-" }, d2 = { "Lcom/untis/mobile/firebase/UmFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/google/firebase/messaging/p0;", "remoteMessage", "Lkotlin/j2;", "D", "E", "J", "", "title", "body", "Landroid/app/PendingIntent;", "intent", "F", "H", "v", "x", "w", "token", "q", "o", "Ljava/util/concurrent/atomic/AtomicInteger;", "N", "Ljava/util/concurrent/atomic/AtomicInteger;", "counter", "Lcom/untis/mobile/api/register/RegisterService;", "O", "Lkotlin/b0;", "A", "()Lcom/untis/mobile/api/register/RegisterService;", "registerService", "Lcom/untis/mobile/firebase/b;", "P", "y", "()Lcom/untis/mobile/firebase/b;", "firebaseHelper", "Landroid/app/NotificationManager;", "Q", "z", "()Landroid/app/NotificationManager;", "notificationManager", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class UmFirebaseMessagingService extends FirebaseMessagingService
{
    @e
    private final AtomicInteger N;
    @e
    private final b0 O;
    @e
    private final b0 P;
    @e
    private final b0 Q;
    
    public UmFirebaseMessagingService() {
        this.N = new AtomicInteger();
        this.O = d0.c((n6.a<?>)new n6.a<RegisterService>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final RegisterService invoke() {
                return (RegisterService)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(RegisterService.class), null, null);
            }
        });
        this.P = d0.c((n6.a<?>)new n6.a<b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final b invoke() {
                return (b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(b.class), null, null);
            }
        });
        this.Q = d0.c((n6.a<?>)new n6.a<NotificationManager>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final NotificationManager invoke() {
                return (NotificationManager)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(NotificationManager.class), null, null);
            }
        });
    }
    
    private final RegisterService A() {
        return this.O.getValue();
    }
    
    private static final void B(final Boolean b) {
    }
    
    private static final void C(final Throwable t) {
        Log.e("untis_log", "error on register device", t);
    }
    
    private final void D(final Profile profile, final p0 p2) {
        final p0.d i3 = p2.i3();
        final String s = null;
        String w;
        if (i3 == null) {
            w = null;
        }
        else {
            w = i3.w();
        }
        final p0.d i4 = p2.i3();
        String a;
        if (i4 == null) {
            a = s;
        }
        else {
            a = i4.a();
        }
        this.H(w, a, this.w(profile));
    }
    
    private final void E(final Profile profile, final p0 p2) {
        final p0.d i3 = p2.i3();
        final String s = null;
        String w;
        if (i3 == null) {
            w = null;
        }
        else {
            w = i3.w();
        }
        final p0.d i4 = p2.i3();
        String a;
        if (i4 == null) {
            a = s;
        }
        else {
            a = i4.a();
        }
        this.F(w, a, this.x(profile));
    }
    
    private final void F(String s, final String s2, final PendingIntent pendingIntent) {
        final Object systemService = this.getSystemService("notification");
        NotificationManager notificationManager;
        if (systemService instanceof NotificationManager) {
            notificationManager = (NotificationManager)systemService;
        }
        else {
            notificationManager = null;
        }
        if (notificationManager == null) {
            return;
        }
        final r$g r0 = new r$g((Context)this, "untismobile_messages").v0(RingtoneManager.getDefaultUri(2)).r0(2131230954);
        String s3;
        if ((s3 = s) == null) {
            s3 = "";
        }
        final r$g o = r0.O((CharSequence)s3);
        if ((s = s2) == null) {
            s = "";
        }
        final r$g g = o.N((CharSequence)s).M(pendingIntent).b0(-1, 3000, 3000).D(1).F("msg").G("untismobile_messages");
        k0.o(g, "Builder(this, Constant.Channel.MESSAGES_CHANNEL_ID)\n                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))\n                .setSmallIcon(R.drawable.ic_untis_clock)\n                .setContentTitle(title ?: \"\")\n                .setContentText(body ?: \"\")\n                .setContentIntent(intent)\n                .setLights(Color.WHITE, 3000, 3000)\n                .setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL)\n                .setCategory(NotificationCompat.CATEGORY_MESSAGE)\n                .setChannelId(Constant.Channel.MESSAGES_CHANNEL_ID)");
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 24) {
            g.i0(4);
        }
        final Notification h = g.h();
        k0.o(h, "builder.build()");
        if (sdk_INT >= 21) {
            h.visibility = 1;
        }
        notificationManager.notify(this.N.getAndIncrement(), h);
    }
    
    private final void H(String s, final String s2, final PendingIntent pendingIntent) {
        final r$g r0 = new r$g((Context)this, "untismobile_important").r0(2131230954);
        String s3 = s;
        if (s == null) {
            s3 = "";
        }
        final r$g o = r0.O((CharSequence)s3);
        if ((s = s2) == null) {
            s = "";
        }
        final Notification h = o.N((CharSequence)s).M(pendingIntent).D(1).h();
        k0.o(h, "Builder(this, Constant.Channel.CHANNEL_HIGH_ID)\n                .setSmallIcon(R.drawable.ic_untis_clock)\n                .setContentTitle(title ?: \"\")\n                .setContentText(body ?: \"\")\n                .setContentIntent(intent)\n                .setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL)\n                .build()");
        if (Build$VERSION.SDK_INT >= 21) {
            h.visibility = 1;
        }
        this.z().notify("push-notification", this.N.getAndIncrement(), h);
    }
    
    static /* synthetic */ void I(final UmFirebaseMessagingService umFirebaseMessagingService, final String s, final String s2, PendingIntent v, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            v = umFirebaseMessagingService.v();
        }
        umFirebaseMessagingService.H(s, s2, v);
    }
    
    private final void J(final Profile profile) {
        kotlinx.coroutines.h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
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
                return ((UmFirebaseMessagingService$c)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final k timeTableService = this.H.getTimeTableService();
                    this.G = 1;
                    if (timeTableService.B(this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
    }
    
    private final PendingIntent v() {
        final LauncherActivity.a h = LauncherActivity.H;
        final Context applicationContext = this.getApplicationContext();
        k0.o(applicationContext, "applicationContext");
        final PendingIntent activity = PendingIntent.getActivity(this.getApplicationContext(), 0, h.a(applicationContext), 0);
        k0.o(activity, "getActivity(applicationContext, 0, intent, 0)");
        return activity;
    }
    
    private final PendingIntent w(final Profile profile) {
        final SubstitutionRequestsActivity.a h = SubstitutionRequestsActivity.H;
        final Context applicationContext = this.getApplicationContext();
        k0.o(applicationContext, "applicationContext");
        final PendingIntent activity = PendingIntent.getActivity(this.getApplicationContext(), 0, h.a(applicationContext, profile.getUniqueId()), 0);
        k0.o(activity, "getActivity(applicationContext, 0, intent, 0)");
        return activity;
    }
    
    private final PendingIntent x(final Profile profile) {
        final PendingIntent a = new v(this.getApplicationContext()).h(2131689473).g(2131297321).d(com.untis.mobile.utils.extension.h.d(new l<Bundle, j2>() {
            public final void a(@e final Bundle bundle) {
                k0.p(bundle, "$this$arguments");
                n1.a("profile_id", profile.getUniqueId());
            }
        })).a();
        k0.o(a, "profile: Profile): PendingIntent {\n        return NavDeepLinkBuilder(applicationContext)\n                .setGraph(R.navigation.core_navigation_graph)\n                .setDestination(R.id.coreMessagesFragment)\n                .setArguments(arguments { \"profile_id\" to profile.getUniqueId() })\n                .createPendingIntent()");
        return a;
    }
    
    private final b y() {
        return this.P.getValue();
    }
    
    private final NotificationManager z() {
        return this.Q.getValue();
    }
    
    @Override
    public void o(@e final p0 p) {
        k0.p(p, "remoteMessage");
        boolean b = false;
        timber.log.b.b("onMessageReceived", new Object[0]);
        final Profile f = this.y().f(p.g1().get("profile"));
        if (f == null) {
            return;
        }
        final com.untis.mobile.firebase.model.b e = this.y().e(p.g1().get("actions"));
        final boolean empty = e.isEmpty();
        final String s = null;
        final String s2 = null;
        Label_0321: {
            if (!empty) {
                if (e.size() == 1) {
                    final ArrayList list = new ArrayList<c>(kotlin.collections.v.Y((Iterable<?>)e, 10));
                    final Iterator<? extends T> iterator = ((Iterable<? extends T>)e).iterator();
                    while (iterator.hasNext()) {
                        list.add(((com.untis.mobile.firebase.model.a)iterator.next()).f());
                    }
                    if (list.contains(c.K)) {
                        break Label_0321;
                    }
                }
                final Iterator<? extends T> iterator2 = ((Iterable<? extends T>)e).iterator();
                while (iterator2.hasNext()) {
                    final int n = a.a[((com.untis.mobile.firebase.model.a)iterator2.next()).f().ordinal()];
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                continue;
                            }
                            this.J(f);
                            continue;
                        }
                        else {
                            this.E(f, p);
                        }
                    }
                    else {
                        this.D(f, p);
                    }
                    b = true;
                }
                if (!b) {
                    final p0.d i3 = p.i3();
                    String w;
                    if (i3 == null) {
                        w = null;
                    }
                    else {
                        w = i3.w();
                    }
                    final p0.d i4 = p.i3();
                    String a;
                    if (i4 == null) {
                        a = s2;
                    }
                    else {
                        a = i4.a();
                    }
                    this.H(w, a, this.v());
                }
                return;
            }
        }
        final p0.d i5 = p.i3();
        String w2;
        if (i5 == null) {
            w2 = null;
        }
        else {
            w2 = i5.w();
        }
        final p0.d i6 = p.i3();
        String a2;
        if (i6 == null) {
            a2 = s;
        }
        else {
            a2 = i6.a();
        }
        I(this, w2, a2, null, 4, null);
        final Iterator<Profile> iterator3 = (Iterator<Profile>)j0.G.s0().iterator();
        while (iterator3.hasNext()) {
            this.J(iterator3.next());
        }
    }
    
    @Override
    public void q(@e final String s) {
        k0.p(s, "token");
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
        final String h = a.h();
        k0.o(h, "settings.currentFcmToken");
        a.q0(h);
        a.a0(s);
        final Iterator<Profile> iterator = j0.G.s0().iterator();
        while (iterator.hasNext()) {
            RegisterService.DefaultImpls.register$default(this.A(), iterator.next(), false, 2, null).C5((rx.functions.b)com.untis.mobile.firebase.c.G, (rx.functions.b)com.untis.mobile.firebase.d.G);
        }
    }
}
