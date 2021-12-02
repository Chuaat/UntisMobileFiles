// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.messenger;

import org.koin.core.c$a;
import com.untis.mobile.persistence.models.messenger.MessengerChannelData;
import kotlin.text.s;
import com.untis.mobile.persistence.models.profile.Right;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.messenger.MessengerCredential;
import com.untis.mobile.persistence.models.messenger.MessengerChannel;
import com.untis.mobile.services.timetable.placeholder.p;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.untis.mobile.api.ApiService;
import kotlin.jvm.internal.k0;
import com.untis.mobile.services.timetable.placeholder.k;
import kotlin.b0;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%" }, d2 = { "Lcom/untis/mobile/services/messenger/e;", "Lcom/untis/mobile/services/messenger/a;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/messenger/MessengerCredential;", "credential", "o", "Lcom/untis/mobile/persistence/models/profile/Profile;", "m", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannel;", "channel", "", "lessonId", "n", "Lrx/g;", "b", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannelData;", "a", "", "channelName", "c", "channelId", "d", "G", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/api/ApiService;", "H", "Lkotlin/b0;", "k", "()Lcom/untis/mobile/api/ApiService;", "apiService", "Lcom/untis/mobile/services/timetable/placeholder/k;", "I", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e implements a, c
{
    @org.jetbrains.annotations.e
    private final String G;
    @org.jetbrains.annotations.e
    private final b0 H;
    @org.jetbrains.annotations.e
    private final k I;
    
    public e(@org.jetbrains.annotations.e final String g) {
        k0.p(g, "profileId");
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<ApiService>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final ApiService invoke() {
                return (ApiService)this.G.t(k1.d(ApiService.class), null, null);
            }
        });
        this.I = p.Y.a(g);
    }
    
    public static final /* synthetic */ k h(final e e) {
        return e.I;
    }
    
    private static final MessengerChannel i(final e e, final long n, final MessengerChannel messengerChannel) {
        k0.p(e, "this$0");
        k0.o(messengerChannel, "it");
        return e.n(messengerChannel, n);
    }
    
    private static final MessengerChannel j(final e e, final long n, final MessengerChannel messengerChannel) {
        k0.p(e, "this$0");
        k0.o(messengerChannel, "it");
        return e.n(messengerChannel, n);
    }
    
    private final ApiService k() {
        return this.H.getValue();
    }
    
    private static final MessengerCredential l(final e e, final MessengerCredential messengerCredential) {
        k0.p(e, "this$0");
        k0.o(messengerCredential, "it");
        return e.o(messengerCredential);
    }
    
    private final Profile m() {
        Profile l;
        if ((l = j0.G.l(this.G)) == null) {
            l = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        return l;
    }
    
    private final MessengerChannel n(final MessengerChannel messengerChannel, final long n) {
        h.h((g)null, (n6.p)new n6.p<r0, d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ e H;
            final /* synthetic */ MessengerChannel I;
            final /* synthetic */ long J;
            
            @e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ e H = this.H;
                    final /* synthetic */ MessengerChannel I = this.I;
                    final /* synthetic */ long J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((e$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final k h2 = e.h(this.H);
                    final String id = this.I.getId();
                    final long j = this.J;
                    this.G = 1;
                    if (h2.G(id, j, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        return messengerChannel;
    }
    
    private final MessengerCredential o(final MessengerCredential messengerCredential) {
        final j0 g = j0.G;
        final Profile l = g.l(this.G);
        if (l == null) {
            return messengerCredential;
        }
        final int length = messengerCredential.getServerUrl().length();
        final int n = 1;
        Label_0108: {
            if (length > 0) {
                int n2;
                if (messengerCredential.getOrganizationId().length() > 0) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 != 0) {
                    l.getUserRights().add(Right.MESSENGER);
                    break Label_0108;
                }
            }
            l.getUserRights().remove(Right.MESSENGER);
        }
        l.setMessengerServerUrl(s.k2(messengerCredential.getServerUrl(), "https://", "", false, 4, (Object)null));
        l.setMessengerOrganizationId(messengerCredential.getOrganizationId());
        g.d(l);
        return messengerCredential;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public rx.g<MessengerChannelData> a(final long n) {
        final rx.g<MessengerChannelData> messengerChannelData = this.k().getMessengerChannelData(this.m(), n);
        k0.o(messengerChannelData, "apiService\n                .getMessengerChannelData(getProfile(), lessonId)");
        return messengerChannelData;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public rx.g<MessengerCredential> b() {
        final rx.g k3 = this.k().getMessengerAuthenticationCredentials(this.m()).k3((rx.functions.p)new com.untis.mobile.services.messenger.b(this));
        k0.o(k3, "apiService\n                .getMessengerAuthenticationCredentials(getProfile())\n                .map { updateProfileAndSave(it) }");
        return (rx.g<MessengerCredential>)k3;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public rx.g<MessengerChannel> c(final long n, @org.jetbrains.annotations.e final String s) {
        k0.p(s, "channelName");
        final rx.g k3 = this.k().createMessengerChannel(this.m(), n, s).k3((rx.functions.p)new com.untis.mobile.services.messenger.c(this, n));
        k0.o(k3, "apiService\n                .createMessengerChannel(getProfile(), lessonId, channelName)\n                .map { updateAndSavePeriodWithChannelId(it, lessonId) }");
        return (rx.g<MessengerChannel>)k3;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public rx.g<MessengerChannel> d(final long n, @org.jetbrains.annotations.e final String s) {
        k0.p(s, "channelId");
        final rx.g k3 = this.k().connectMessengerChannel(this.m(), n, s).k3((rx.functions.p)new com.untis.mobile.services.messenger.d(this, n));
        k0.o(k3, "apiService\n                .connectMessengerChannel(getProfile(), lessonId, channelId)\n                .map { updateAndSavePeriodWithChannelId(it, lessonId) }");
        return (rx.g<MessengerChannel>)k3;
    }
    
    @org.jetbrains.annotations.e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
}
