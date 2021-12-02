// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.profile.legacy;

import android.app.Application;
import com.google.gson.Gson;
import kotlin.collections.j1;
import com.untis.mobile.persistence.models.profile.LegacyChild;
import com.untis.mobile.persistence.models.profile.LegacyProfile;
import com.google.gson.GsonBuilder;
import java.io.Closeable;
import kotlinx.coroutines.i1;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.b2;
import org.koin.core.c$a;
import com.untis.mobile.api.common.messenger.UMMessengerSettings;
import com.untis.mobile.api.common.UMUserData;
import com.untis.mobile.api.enumeration.UMRight;
import com.untis.mobile.persistence.models.profile.Right;
import java.util.HashSet;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.timetable.period.ui.HolidayModel;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import com.untis.mobile.api.common.UMSettings;
import org.joda.time.t;
import com.untis.mobile.api.common.UMMasterData;
import java.util.Set;
import java.util.Collection;
import com.untis.mobile.api.common.UMPerson;
import kotlin.c1;
import kotlinx.coroutines.r0;
import com.untis.mobile.utils.s;
import java.util.Objects;
import com.untis.mobile.api.schoolsearch.SchoolSearchSchool;
import android.content.Context;
import com.untis.mobile.api.dto.GetColorsResponse;
import com.untis.mobile.UntisMobileApplication;
import java.util.List;
import com.untis.mobile.utils.v;
import timber.log.b;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.error.JsonRpcError;
import com.untis.mobile.persistence.models.profile.ProfileState;
import com.untis.mobile.utils.l0;
import com.untis.mobile.api.AppInfo;
import kotlin.j2;
import com.untis.mobile.api.dto.GetUserDataResponse;
import android.util.Log;
import com.untis.mobile.api.dto.GetTimetableResponse;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import rx.functions.y;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Child;
import rx.functions.p;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.utils.settings.g;
import com.untis.mobile.api.register.RegisterService;
import com.untis.mobile.api.ApiService;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.untis.mobile.persistence.realm.d;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\bf\u0010gJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001b\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0019H\u0002J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010-\u001a\u00020\u000fH\u0016J\b\u0010.\u001a\u00020\u0003H\u0016J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u000fH\u0016J0\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010/\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u000fH\u0016J\u0010\u00103\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u00104\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u00105\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u00107\u001a\u0004\u0018\u00010\u00032\u0006\u00106\u001a\u00020\u0019H\u0016J\u0012\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00108\u001a\u00020\u000bH\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030:H\u0016J\n\u0010<\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010>\u001a\u00020\u000fH\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030:H\u0016J\b\u0010@\u001a\u00020\u0016H\u0016J\b\u0010A\u001a\u00020\u000fH\u0016J\b\u0010B\u001a\u00020\u0016H\u0016J\u001b\u0010C\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bC\u0010\u001eR\u001d\u0010I\u001a\u00020D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010KR\u001d\u0010Q\u001a\u00020M8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010F\u001a\u0004\bO\u0010PR\u001d\u0010V\u001a\u00020R8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010F\u001a\u0004\bT\u0010UR\u001d\u0010[\u001a\u00020W8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010F\u001a\u0004\bY\u0010ZR\u001d\u0010`\u001a\u00020\\8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010F\u001a\u0004\b^\u0010_R\u001d\u0010e\u001a\u00020a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010F\u001a\u0004\bc\u0010d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006h" }, d2 = { "Lcom/untis/mobile/services/profile/legacy/j0;", "Lcom/untis/mobile/services/profile/legacy/a;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lrx/g;", "H0", "Lcom/untis/mobile/api/AppInfo;", "info", "w0", "O0", "", "authenticationToken", "y0", "R0", "", "t0", "checkForMobileServiceApi", "Y0", "b1", "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "school", "Lkotlin/j2;", "z0", "password", "", "token", "K0", "e1", "j0", "(Lcom/untis/mobile/persistence/models/profile/Profile;Lkotlin/coroutines/d;)Ljava/lang/Object;", "U0", "Lcom/untis/mobile/api/dto/GetUserDataResponse;", "response", "x0", "A0", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "r0", "W0", "k0", "f0", "e", "a", "prototype", "ignoreGetAppSharedSecretRequest", "q", "m", "c", "b", "d", "id", "s", "uniqueId", "l", "", "s0", "n", "h", "k", "o", "j", "r", "f", "i", "Lcom/untis/mobile/api/register/RegisterService;", "M", "Lkotlin/b0;", "p0", "()Lcom/untis/mobile/api/register/RegisterService;", "registerService", "H", "Ljava/lang/String;", "PREFERENCE_KEY_LEGACY_PROFILES", "Lcom/untis/mobile/persistence/realm/d;", "I", "o0", "()Lcom/untis/mobile/persistence/realm/d;", "realmService", "Lcom/untis/mobile/utils/settings/g;", "N", "q0", "()Lcom/untis/mobile/utils/settings/g;", "settings", "Lcom/untis/mobile/api/ApiService;", "J", "l0", "()Lcom/untis/mobile/api/ApiService;", "apiService", "Lcom/untis/mobile/persistence/dao/profile/a;", "K", "n0", "()Lcom/untis/mobile/persistence/dao/profile/a;", "profileDao", "Lcom/untis/mobile/lockscreen/a;", "L", "m0", "()Lcom/untis/mobile/lockscreen/a;", "lockScreen", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j0 implements a, c
{
    @e
    public static final j0 G;
    @e
    private static final String H = "profile_list";
    @e
    private static final b0 I;
    @e
    private static final b0 J;
    @e
    private static final b0 K;
    @e
    private static final b0 L;
    @e
    private static final b0 M;
    @e
    private static final b0 N;
    
    static {
        final j0 j0 = G = new j0();
        I = d0.c((n6.a<?>)new n6.a<d>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)j0).getKoin().y();
            
            @Override
            public final d invoke() {
                return (d)this.G.t(k1.d(d.class), null, null);
            }
        });
        J = d0.c((n6.a<?>)new n6.a<ApiService>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)j0).getKoin().y();
            
            @Override
            public final ApiService invoke() {
                return (ApiService)this.G.t(k1.d(ApiService.class), null, null);
            }
        });
        K = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.profile.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)j0).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.profile.a invoke() {
                return (com.untis.mobile.persistence.dao.profile.a)this.G.t(k1.d(com.untis.mobile.persistence.dao.profile.a.class), null, null);
            }
        });
        L = d0.c((n6.a<?>)new n6.a<com.untis.mobile.lockscreen.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)j0).getKoin().y();
            
            @Override
            public final com.untis.mobile.lockscreen.a invoke() {
                return (com.untis.mobile.lockscreen.a)this.G.t(k1.d(com.untis.mobile.lockscreen.a.class), null, null);
            }
        });
        M = d0.c((n6.a<?>)new n6.a<RegisterService>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)j0).getKoin().y();
            
            @Override
            public final RegisterService invoke() {
                return (RegisterService)this.G.t(k1.d(RegisterService.class), null, null);
            }
        });
        N = d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)j0).getKoin().y();
            
            @Override
            public final g invoke() {
                return (g)this.G.t(k1.d(g.class), null, null);
            }
        });
    }
    
    private j0() {
    }
    
    private final rx.g<Profile> A0(final Profile profile) {
        final ArrayList<rx.g> list = new ArrayList<rx.g>();
        if (profile.hasEntity()) {
            list.add(this.l0().getTimeTable(profile, profile.getEntityType(), profile.getEntityId(), this.r0(profile.getEntityType(), profile.getEntityId())).Q3(rx.schedulers.c.e()).k3((p)new g0(profile)).d4((p)new i(profile)));
        }
        if (profile.getEntityType().isParentRole() && (profile.getUserChildren().isEmpty() ^ true)) {
            for (final Child child : profile.getUserChildren()) {
                final ApiService l0 = this.l0();
                final EntityType student = EntityType.STUDENT;
                list.add(l0.getTimeTable(profile, student, child.getId(), this.r0(student, child.getId())).Q3(rx.schedulers.c.e()).k3((p)new e0(child, profile)).d4((p)new h(profile)));
            }
        }
        rx.g g;
        String s;
        if (list.isEmpty()) {
            g = rx.g.U2((Object)profile).Q3(rx.schedulers.c.e());
            s = "just(profile).observeOn(Schedulers.io())";
        }
        else {
            g = rx.g.r7((Iterable)list, (y)com.untis.mobile.services.profile.legacy.b0.G).Q3(rx.schedulers.c.e()).k3((p)new com.untis.mobile.services.profile.legacy.p(profile));
            s = "zip(observables) { }\n            .observeOn(Schedulers.io())\n            .map {\n                save(profile)\n            }";
        }
        k0.o(g, s);
        return (rx.g<Profile>)g;
    }
    
    private static final Profile B0(final Profile profile, final GetTimetableResponse getTimetableResponse) {
        k0.p(profile, "$profile");
        profile.setUserHasTimeTableAccess(true);
        return profile;
    }
    
    private static final rx.g C0(final Profile profile, final Throwable t) {
        k0.p(profile, "$profile");
        return rx.g.U2((Object)profile);
    }
    
    private static final Profile D0(final Child child, final Profile profile, final GetTimetableResponse getTimetableResponse) {
        k0.p(child, "$child");
        k0.p(profile, "$profile");
        child.setHasTimeTableAccess(true);
        return profile;
    }
    
    private static final rx.g E0(final Profile profile, final Throwable t) {
        k0.p(profile, "$profile");
        Log.e("untis_log", "could not load timetable for child", t);
        return rx.g.U2((Object)profile);
    }
    
    private static final j2 F0(final Object[] array) {
        return j2.a;
    }
    
    private static final Profile G0(final Profile profile, final j2 j2) {
        k0.p(profile, "$profile");
        return j0.G.b(profile);
    }
    
    private final rx.g<Profile> H0(final Profile profile) {
        final rx.g d4 = this.l0().getAppInfo(profile).k3((p)new f0(profile)).d4((p)new j(profile));
        k0.o(d4, "apiService\n            .getAppInfo(profile)\n            .map { updateProfileWithAppInfo(profile, it) }\n            .onErrorResumeNext { observable(profile) }");
        return (rx.g<Profile>)d4;
    }
    
    private static final Profile I0(final Profile profile, final AppInfo appInfo) {
        k0.p(profile, "$profile");
        final j0 g = j0.G;
        k0.o(appInfo, "it");
        return g.w0(profile, appInfo);
    }
    
    private static final rx.g J0(final Profile profile, final Throwable t) {
        k0.p(profile, "$profile");
        return l0.a(profile);
    }
    
    private final rx.g<Profile> K0(final Profile profile, final String userAppSharedSecret, final long n) {
        if (profile.isAnonymousUser()) {
            final rx.g k3 = this.l0().getAppSharedSecret(profile, "", 0L).Q3(rx.schedulers.c.e()).k3((p)new com.untis.mobile.services.profile.legacy.d(profile));
            k0.o(k3, "apiService\n                .getAppSharedSecret(profile, \"\", 0)\n                .observeOn(Schedulers.io())\n                .map { appSharedSecret ->\n                    profile.states.remove(ProfileState.InvalidApiSharedSecret)\n                    profile.userAppSharedSecret = appSharedSecret\n                    return@map profile\n                }");
            return (rx.g<Profile>)k3;
        }
        if (profile.isDemoUser()) {
            final rx.g q3 = rx.g.U2((Object)profile).Q3(rx.schedulers.c.e());
            k0.o(q3, "just(profile).observeOn(Schedulers.io())");
            return (rx.g<Profile>)q3;
        }
        if (userAppSharedSecret != null) {
            profile.setUserAppSharedSecret(userAppSharedSecret);
            final rx.g d4 = this.l0().getAppSharedSecret(profile, userAppSharedSecret, n).Q3(rx.schedulers.c.e()).k3((p)new f(profile)).d4((p)new com.untis.mobile.services.profile.legacy.g(profile));
            k0.o(d4, "apiService\n                .getAppSharedSecret(profile, password, token)\n                .observeOn(Schedulers.io())\n                .map { appSharedSecret ->\n                    profile.states.remove(ProfileState.InvalidApiSharedSecret)\n                    profile.userAppSharedSecret = appSharedSecret\n                    return@map profile\n                }\n                .onErrorResumeNext {\n                    val cause = it.cause\n\n                    if (cause is JsonRpcError && cause.isAnyOf(\n                            JsonRpcErrorType.LockedAccess,\n                            JsonRpcErrorType.Require2FactorAuthenticationToken\n                        )\n                    ) {\n                        throw it\n                    }\n\n                    Observable.just(profile)\n                }");
            return (rx.g<Profile>)d4;
        }
        final rx.g q4 = rx.g.U2((Object)profile).Q3(rx.schedulers.c.e());
        k0.o(q4, "just(profile).observeOn(Schedulers.io())");
        return (rx.g<Profile>)q4;
    }
    
    private static final Profile L0(final Profile profile, final String userAppSharedSecret) {
        k0.p(profile, "$profile");
        profile.getStates().remove(ProfileState.InvalidApiSharedSecret);
        k0.o(userAppSharedSecret, "appSharedSecret");
        profile.setUserAppSharedSecret(userAppSharedSecret);
        return profile;
    }
    
    private static final Profile M0(final Profile profile, final String userAppSharedSecret) {
        k0.p(profile, "$profile");
        profile.getStates().remove(ProfileState.InvalidApiSharedSecret);
        k0.o(userAppSharedSecret, "appSharedSecret");
        profile.setUserAppSharedSecret(userAppSharedSecret);
        return profile;
    }
    
    private static final rx.g N0(final Profile profile, final Throwable t) {
        k0.p(profile, "$profile");
        final Throwable cause = t.getCause();
        if (cause instanceof JsonRpcError && ((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.LockedAccess, JsonRpcErrorType.Require2FactorAuthenticationToken)) {
            k0.o(t, "it");
            throw t;
        }
        return rx.g.U2((Object)profile);
    }
    
    private final rx.g<Profile> O0(final Profile profile) {
        final rx.g d4 = this.l0().getAuthenticationToken(profile).k3((p)new com.untis.mobile.services.profile.legacy.e(profile)).d4((p)new l(profile));
        k0.o(d4, "apiService\n            .getAuthenticationToken(profile)\n            .map { updateProfileWithJwt(profile, it) }\n            .onErrorResumeNext { observable(profile) }");
        return (rx.g<Profile>)d4;
    }
    
    private static final Profile P0(final Profile profile, final String s) {
        k0.p(profile, "$profile");
        final j0 g = j0.G;
        k0.o(s, "it");
        return g.y0(profile, s);
    }
    
    private static final rx.g Q0(final Profile profile, final Throwable t) {
        k0.p(profile, "$profile");
        return l0.a(profile);
    }
    
    private final rx.g<Profile> R0(final Profile profile) {
        rx.g g;
        String s;
        if (profile.getRegistered() > 0L) {
            g = rx.g.U2((Object)profile).Q3(rx.schedulers.c.e());
            s = "just(profile)\n                .observeOn(Schedulers.io())";
        }
        else {
            g = RegisterService.DefaultImpls.register$default(this.p0(), profile, false, 2, null).k3((p)new i0(profile)).d4((p)new n(profile));
            s = "registerService\n            .register(profile)\n            .map {\n                Timber.d(\"registered: success!\")\n                profile.registered = Date.now().millis\n                profile\n            }\n            .onErrorResumeNext {\n                Timber.e(\"registered: error!\")\n                observable(profile)\n            }";
        }
        k0.o(g, s);
        return (rx.g<Profile>)g;
    }
    
    private static final Profile S0(final Profile profile, final Boolean b) {
        k0.p(profile, "$profile");
        b.b("registered: success!", new Object[0]);
        profile.setRegistered(((org.joda.time.base.g)v.a.e()).n());
        return profile;
    }
    
    private static final rx.g T0(final Profile profile, final Throwable t) {
        k0.p(profile, "$profile");
        b.e("registered: error!", new Object[0]);
        return l0.a(profile);
    }
    
    private final rx.g<Profile> U0(final Profile profile) {
        final rx.g k3 = this.l0().getVersion(profile).Q3(rx.schedulers.c.e()).k3((p)new com.untis.mobile.services.profile.legacy.c(profile));
        k0.o(k3, "apiService\n            .getVersion(profile)\n            .observeOn(Schedulers.io())\n            .map { version ->\n                Log.d(Constant.LOG, \"updating legacy version to '$version'\")\n                profile.schoolApiVersion = version\n                return@map profile\n            }");
        return (rx.g<Profile>)k3;
    }
    
    private static final Profile V0(final Profile profile, final Integer obj) {
        k0.p(profile, "$profile");
        final StringBuilder sb = new StringBuilder();
        sb.append("updating legacy version to '");
        sb.append(obj);
        sb.append('\'');
        Log.d("untis_log", sb.toString());
        k0.o(obj, "version");
        profile.setSchoolApiVersion(obj);
        return profile;
    }
    
    private final rx.g<Profile> W0(final Profile profile) {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        rx.g g;
        String s;
        if (b == null) {
            g = rx.g.U2((Object)profile);
            s = "just(profile)";
        }
        else {
            g = this.l0().getColors(profile).Q3(rx.schedulers.c.e()).k3((p)new com.untis.mobile.services.profile.legacy.d0(b, profile));
            s = "apiService\n            .getColors(profile)\n            .observeOn(Schedulers.io())\n            .map { response ->\n                AppSettings.appSettings(context)\n                    .setColors(profile, getColorResponseToDefaultColors().map(response))\n                profile\n            }";
        }
        k0.o(g, s);
        return (rx.g<Profile>)g;
    }
    
    private static final Profile X0(final UntisMobileApplication untisMobileApplication, final Profile profile, final GetColorsResponse getColorsResponse) {
        k0.p(untisMobileApplication, "$context");
        k0.p(profile, "$profile");
        com.untis.mobile.utils.a.a((Context)untisMobileApplication).Y(profile, com.untis.mobile.utils.mapper.api.a.i().j(getColorsResponse));
        return profile;
    }
    
    private final rx.g<Profile> Y0(final Profile profile, final boolean b) {
        final rx.g d4 = this.l0().searchSchool(profile.getSchoolId()).Q3(rx.schedulers.c.e()).k3((p)new r(profile, b)).d4((p)new k(profile));
        k0.o(d4, "apiService\n            .searchSchool(profile.schoolId)\n            .observeOn(Schedulers.io())\n            .map { schools ->\n\n                val school =\n                    schools.firstOrNull { school -> school.schoolId == profile.schoolId /*&& school.server == profile.schoolServerUrl*/ }\n                if (school != null) {\n                    updateProfileWithSchool(profile, school, checkForMobileServiceApi)\n                }\n\n                return@map profile\n            }\n            .onErrorResumeNext { throwable ->\n                if (throwable.cause is JsonRpcError && (throwable.cause as JsonRpcError).isAnyOf(\n                        JsonRpcErrorType.TooManySchoolSearchResults\n                    )\n                ) {\n                    return@onErrorResumeNext Observable.just(profile)\n                }\n\n                throw throwable\n            }");
        return (rx.g<Profile>)d4;
    }
    
    private static final Profile Z0(final Profile profile, final boolean b, final List list) {
        k0.p(profile, "$profile");
        k0.o(list, "schools");
        while (true) {
            for (final SchoolSearchSchool next : list) {
                if (next.getSchoolId() == profile.getSchoolId()) {
                    final SchoolSearchSchool schoolSearchSchool = next;
                    if (schoolSearchSchool != null) {
                        j0.G.z0(profile, schoolSearchSchool, b);
                    }
                    return profile;
                }
            }
            SchoolSearchSchool next = null;
            continue;
        }
    }
    
    private static final rx.g a1(final Profile profile, final Throwable t) {
        k0.p(profile, "$profile");
        if (t.getCause() instanceof JsonRpcError) {
            final Throwable cause = t.getCause();
            Objects.requireNonNull(cause, "null cannot be cast to non-null type com.untis.mobile.api.error.JsonRpcError");
            if (((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.TooManySchoolSearchResults)) {
                return rx.g.U2((Object)profile);
            }
        }
        k0.o(t, "throwable");
        throw t;
    }
    
    private final rx.g<Profile> b1(final Profile profile, final boolean b) {
        final rx.g d4 = this.l0().searchSchool(profile.getSchoolLogin()).Q3(rx.schedulers.c.e()).k3((p)new q(profile, b)).d4((p)new o(profile));
        k0.o(d4, "apiService\n            .searchSchool(profile.schoolLogin)\n            .observeOn(Schedulers.io())\n            .map { schools ->\n\n                val school =\n                    schools.firstOrNull { school -> school.loginName == profile.schoolLogin && school.server == profile.schoolServerUrl }\n                if (school != null) {\n                    updateProfileWithSchool(profile, school, checkForMobileServiceApi)\n                }\n                return@map profile\n            }\n            .onErrorResumeNext { throwable ->\n                if (throwable.cause is JsonRpcError && (throwable.cause as JsonRpcError).isAnyOf(\n                        JsonRpcErrorType.TooManySchoolSearchResults\n                    )\n                ) {\n                    return@onErrorResumeNext Observable.just(profile)\n                }\n\n                throw throwable\n            }");
        return (rx.g<Profile>)d4;
    }
    
    private static final Profile c1(final Profile profile, final boolean b, final List list) {
        k0.p(profile, "$profile");
        k0.o(list, "schools");
        while (true) {
            for (final SchoolSearchSchool next : list) {
                final SchoolSearchSchool schoolSearchSchool = next;
                if (k0.g(schoolSearchSchool.getLoginName(), profile.getSchoolLogin()) && k0.g(schoolSearchSchool.getServer(), profile.getSchoolServerUrl())) {
                    final SchoolSearchSchool schoolSearchSchool2 = next;
                    if (schoolSearchSchool2 != null) {
                        j0.G.z0(profile, schoolSearchSchool2, b);
                    }
                    return profile;
                }
            }
            SchoolSearchSchool next = null;
            continue;
        }
    }
    
    private static final rx.g d1(final Profile profile, final Throwable t) {
        k0.p(profile, "$profile");
        if (t.getCause() instanceof JsonRpcError) {
            final Throwable cause = t.getCause();
            Objects.requireNonNull(cause, "null cannot be cast to non-null type com.untis.mobile.api.error.JsonRpcError");
            if (((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.TooManySchoolSearchResults)) {
                return rx.g.U2((Object)profile);
            }
        }
        k0.o(t, "throwable");
        throw t;
    }
    
    private final rx.g<Profile> e1(final Profile profile) {
        rx.g g;
        String s;
        if (UntisMobileApplication.I.b() == null) {
            g = rx.g.U2((Object)profile);
            s = "just(profile)";
        }
        else {
            g = this.l0().getUserData(profile).Q3(rx.schedulers.c.e()).k3((p)new h0(profile));
            s = "apiService\n            .getUserData(profile)\n            .observeOn(Schedulers.io())\n            .map { response ->\n                return@map runBlocking {\n                    val saved = save(updateProfileWithData(profile, response))\n                    val masterDataService = saved.masterDataService\n\n                    deletePersonalData(saved)\n\n                    masterDataService.save(profile.userChildren.map { child ->\n                        val umPerson = UMPerson()\n                        umPerson.id = child.id\n                        umPerson.firstName = child.firstName\n                        umPerson.lastName = child.lastName\n                        umPerson\n                    })\n\n                    if (profile.userOriginalEntityType == EntityType.STUDENT) {\n                        val umPerson = UMPerson()\n\n                        umPerson.id = profile.userOriginalEntityId\n                        umPerson.firstName = \"\"\n                        umPerson.lastName = profile.userDisplayName.trim()\n\n                        masterDataService.save(listOf(umPerson))\n                    }\n\n                    masterDataService.save(\n                        response.masterData,\n                        SystemTime.localDate(),\n                        SystemTime.localDate(),\n                        true\n                    )\n\n                    if (response.settings != null) {\n                        saved.classBookService.save(response.settings)\n                    }\n\n                    return@runBlocking saved\n                }\n            }";
        }
        k0.o(g, s);
        return (rx.g<Profile>)g;
    }
    
    private final void f0(final Profile profile) {
        s.a.u(new n6.a<j2>() {
            public final void invoke() {
                final j0 g = j0.G;
                g.m0().stop();
                profile.setLockScreen(false);
                profile.getLockScreenIds().clear();
                g.d(profile);
                g.m0().start();
            }
        });
    }
    
    private static final Profile f1(final Profile profile, final GetUserDataResponse getUserDataResponse) {
        k0.p(profile, "$profile");
        return (Profile)kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super Profile>, Object>() {
            Object G;
            Object H;
            int I;
            final /* synthetic */ Profile J;
            final /* synthetic */ GetUserDataResponse K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Profile>, Object>() {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ Profile J = this.J;
                    final /* synthetic */ GetUserDataResponse K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Profile> d) {
                return ((j0$k)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int i = this.I;
                Profile g = null;
                Label_0562: {
                    Profile b = null;
                    com.untis.mobile.services.masterdata.a masterDataService = null;
                    Label_0496: {
                        Label_0387: {
                            if (i != 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        final com.untis.mobile.services.masterdata.a a = (com.untis.mobile.services.masterdata.a)this.H;
                                        b = (Profile)this.G;
                                        c1.n(o);
                                        masterDataService = a;
                                        break Label_0387;
                                    }
                                    if (i == 3) {
                                        final com.untis.mobile.services.masterdata.a a2 = (com.untis.mobile.services.masterdata.a)this.H;
                                        b = (Profile)this.G;
                                        c1.n(o);
                                        masterDataService = a2;
                                        break Label_0496;
                                    }
                                    if (i == 4) {
                                        final Profile profile = (Profile)this.G;
                                        c1.n(o);
                                        g = profile;
                                        break Label_0562;
                                    }
                                    if (i == 5) {
                                        final Profile profile2 = (Profile)this.G;
                                        c1.n(o);
                                        g = profile2;
                                        return g;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                else {
                                    final com.untis.mobile.services.masterdata.a a3 = (com.untis.mobile.services.masterdata.a)this.H;
                                    b = (Profile)this.G;
                                    c1.n(o);
                                    masterDataService = a3;
                                }
                            }
                            else {
                                c1.n(o);
                                final j0 g2 = j0.G;
                                final Profile j = this.J;
                                final GetUserDataResponse k = this.K;
                                k0.o(k, "response");
                                b = g2.b(g2.x0(j, k));
                                masterDataService = b.getMasterDataService();
                                this.G = b;
                                this.H = masterDataService;
                                this.I = 1;
                                if (g2.j0(b, this) == h) {
                                    return h;
                                }
                            }
                            final Set<Child> userChildren = this.J.getUserChildren();
                            final ArrayList list = new ArrayList<UMPerson>(kotlin.collections.v.Y((Iterable<?>)userChildren, 10));
                            for (final Child child : userChildren) {
                                final UMPerson umPerson = new UMPerson();
                                umPerson.id = child.getId();
                                umPerson.firstName = child.getFirstName();
                                umPerson.lastName = child.getLastName();
                                list.add(umPerson);
                            }
                            this.G = b;
                            this.H = masterDataService;
                            this.I = 2;
                            if (masterDataService.Y((Collection<? extends UMPerson>)list, this) == h) {
                                return h;
                            }
                        }
                        if (this.J.getUserOriginalEntityType() == EntityType.STUDENT) {
                            final UMPerson umPerson2 = new UMPerson();
                            umPerson2.id = this.J.getUserOriginalEntityId();
                            umPerson2.firstName = "";
                            final String userDisplayName = this.J.getUserDisplayName();
                            Objects.requireNonNull(userDisplayName, "null cannot be cast to non-null type kotlin.CharSequence");
                            umPerson2.lastName = kotlin.text.s.B5((CharSequence)userDisplayName).toString();
                            final List<UMPerson> l = kotlin.collections.v.k(umPerson2);
                            this.G = b;
                            this.H = masterDataService;
                            this.I = 3;
                            if (masterDataService.Y(l, this) == h) {
                                return h;
                            }
                        }
                    }
                    final UMMasterData masterData = this.K.masterData;
                    k0.o(masterData, "response.masterData");
                    final org.joda.time.t b2 = com.untis.mobile.utils.time.a.b();
                    final org.joda.time.t b3 = com.untis.mobile.utils.time.a.b();
                    this.G = b;
                    this.H = null;
                    this.I = 4;
                    if (masterDataService.j(masterData, b2, b3, true, this) == h) {
                        return h;
                    }
                    g = b;
                }
                Profile profile3 = g;
                if (this.K.settings == null) {
                    return profile3;
                }
                final com.untis.mobile.services.classbook.a classBookService = g.getClassBookService();
                final UMSettings settings = this.K.settings;
                k0.o(settings, "response.settings");
                this.G = g;
                this.I = 5;
                if (classBookService.c0(settings, this) == h) {
                    return h;
                }
                profile3 = g;
                return profile3;
            }
        }, 1, (Object)null);
    }
    
    private static final rx.g g0(final String s, final long n, final Profile profile) {
        final j0 g = j0.G;
        k0.o(profile, "it");
        return g.K0(profile, s, n);
    }
    
    private static final void h0(final Boolean b) {
    }
    
    private static final void i0(final Throwable t) {
        b.g(t, "could not deregister on delete profile", new Object[0]);
    }
    
    private final Object j0(Profile profile, final kotlin.coroutines.d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0052: {
            if (d instanceof j0$b) {
                final kotlin.coroutines.jvm.internal.d d2 = (j0$b)d;
                final int j = d2.J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    d2.J = j + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0052;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                /* synthetic */ Object H;
                int J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object h) {
                    this.H = h;
                    this.J |= Integer.MIN_VALUE;
                    return j0.this.j0(null, this);
                }
            };
        }
        final Object h = d3.H;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int i = d3.J;
        Label_0207: {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        profile = (Profile)d3.G;
                        c1.n(h);
                        break Label_0207;
                    }
                    if (i == 3) {
                        c1.n(h);
                        return j2.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    profile = (Profile)d3.G;
                    c1.n(h);
                }
            }
            else {
                c1.n(h);
                final com.untis.mobile.services.classbook.a classBookService = profile.getClassBookService();
                d3.G = profile;
                d3.J = 1;
                if (classBookService.g0(d3) == h2) {
                    return h2;
                }
            }
            final com.untis.mobile.services.timetable.placeholder.k timeTableService = profile.getTimeTableService();
            d3.G = profile;
            d3.J = 2;
            if (timeTableService.A(d3) == h2) {
                return h2;
            }
        }
        final com.untis.mobile.services.masterdata.a masterDataService = profile.getMasterDataService();
        d3.G = null;
        d3.J = 3;
        if (masterDataService.A(d3) == h2) {
            return h2;
        }
        return j2.a;
    }
    
    private final void k0(final Profile profile) {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        if (b == null) {
            return;
        }
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
        if (a.j() == profile.getId()) {
            a.c();
        }
    }
    
    private final ApiService l0() {
        return j0.J.getValue();
    }
    
    private final com.untis.mobile.lockscreen.a m0() {
        return j0.L.getValue();
    }
    
    private final com.untis.mobile.persistence.dao.profile.a n0() {
        return j0.K.getValue();
    }
    
    private final d o0() {
        return j0.I.getValue();
    }
    
    private final RegisterService p0() {
        return j0.M.getValue();
    }
    
    private final g q0() {
        return j0.N.getValue();
    }
    
    private final List<TimeTableModel> r0(final EntityType entityType, final long n) {
        return kotlin.collections.v.r(new TimeTableModel(null, entityType, n, com.untis.mobile.utils.time.a.b(), 0L, null, null, null, false, 0L, null, 2033, null));
    }
    
    private final boolean t0(final Profile profile) {
        return !kotlin.text.s.u2(profile.getSchoolServerUrl(), "http://", false, 2, (Object)null) && !kotlin.text.s.V2((CharSequence)profile.getSchoolServerUrl(), (CharSequence)"test.webuntis.com", false, 2, (Object)null) && !kotlin.text.s.V2((CharSequence)profile.getSchoolServerUrl(), (CharSequence)"demo.webuntis.com", false, 2, (Object)null) && !kotlin.text.s.V2((CharSequence)profile.getSchoolServerUrl(), (CharSequence)"kirke.webuntis.com", false, 2, (Object)null);
    }
    
    private static final void u0(final Profile profile, final String s) {
        k0.p(profile, "$profile");
        k0.o(s, "it");
        profile.updateAuthenticationToken(s);
        j0.G.b(profile);
    }
    
    private static final void v0(final Throwable t) {
        Log.e("untis_log", "error on getAuthenticationToken", t);
    }
    
    private final Profile w0(final Profile profile, final AppInfo appInfo) {
        profile.setSchoolSemanticApiVersion(appInfo.getApi());
        profile.setSchoolSemanticWuVersion(appInfo.getWebuntis());
        return profile;
    }
    
    private final Profile x0(final Profile profile, final GetUserDataResponse getUserDataResponse) {
        final UMUserData userData = getUserDataResponse.userData;
        if (userData == null) {
            return profile;
        }
        profile.setUserOriginalEntityType(EntityType.Companion.findBy(userData.elemType));
        profile.setUserOriginalEntityId(userData.elemId);
        final String displayName = userData.displayName;
        final String s = "";
        String userDisplayName;
        if ((userDisplayName = displayName) == null) {
            userDisplayName = "";
        }
        profile.setUserDisplayName(userDisplayName);
        String schoolName;
        if ((schoolName = userData.schoolName) == null) {
            schoolName = "";
        }
        profile.setSchoolDisplayName(schoolName);
        profile.setUserDepartmentId(userData.departmentId);
        try {
            profile.setShowCalendarDetails(getUserDataResponse.settings.showCalendarDetails);
        }
        catch (Exception ex) {}
        final List<UMPerson> children = userData.children;
        final Set<Object> set = null;
        Set<Child> n5;
        if (children == null) {
            n5 = null;
        }
        else {
            final ArrayList list = new ArrayList<Child>(kotlin.collections.v.Y((Iterable<?>)children, 10));
            for (final UMPerson umPerson : children) {
                final long id = umPerson.id;
                final String firstName = umPerson.firstName;
                k0.o(firstName, "umChild.firstName");
                final String lastName = umPerson.lastName;
                k0.o(lastName, "umChild.lastName");
                list.add(new Child(id, firstName, lastName, true));
            }
            n5 = kotlin.collections.v.N5((Iterable<? extends Child>)list);
        }
        Set<Child> userChildren = n5;
        if (n5 == null) {
            userChildren = new HashSet<Child>();
        }
        profile.setUserChildren(userChildren);
        final List<Long> klassenIds = userData.klassenIds;
        Object n6;
        if (klassenIds == null) {
            n6 = null;
        }
        else {
            n6 = kotlin.collections.v.N5((Iterable<?>)klassenIds);
        }
        Set<Long> userClasses = (Set<Long>)n6;
        if (n6 == null) {
            userClasses = new HashSet<Long>();
        }
        profile.setUserClasses(userClasses);
        final HashSet<Right> userRights = new HashSet<Right>();
        final Set<Right> userRights2 = profile.getUserRights();
        final Right substitution_PLANNING = Right.SUBSTITUTION_PLANNING;
        if (userRights2.contains(substitution_PLANNING)) {
            userRights.add(substitution_PLANNING);
        }
        final Set<Right> userRights3 = profile.getUserRights();
        final Right teacher_ABSENCE_CREATE = Right.TEACHER_ABSENCE_CREATE;
        if (userRights3.contains(teacher_ABSENCE_CREATE)) {
            userRights.add(teacher_ABSENCE_CREATE);
        }
        final Set<Right> userRights4 = profile.getUserRights();
        final Right teacher_ABSENCE_READ = Right.TEACHER_ABSENCE_READ;
        if (userRights4.contains(teacher_ABSENCE_READ)) {
            userRights.add(teacher_ABSENCE_READ);
        }
        final List<UMRight> rights = userData.rights;
        Set<Object> m5;
        if (rights == null) {
            m5 = set;
        }
        else {
            final Iterator<Object> iterator2 = rights.iterator();
            while (iterator2.hasNext()) {
                userRights.add(Right.Companion.fromUmRight(iterator2.next()));
            }
            m5 = kotlin.collections.v.M5((Iterable<?>)userRights);
        }
        if (m5 == null) {
            new HashSet();
        }
        profile.setUserRights(userRights);
        profile.setUpdated(true);
        profile.getStates().remove(ProfileState.InvalidApiSharedSecret);
        final UMMessengerSettings messengerSettings = getUserDataResponse.messengerSettings;
        String k2 = null;
        Label_0599: {
            if (messengerSettings != null) {
                final String serverUrl = messengerSettings.serverUrl;
                if (serverUrl != null) {
                    if ((k2 = kotlin.text.s.k2(serverUrl, "https://", "", false, 4, (Object)null)) != null) {
                        break Label_0599;
                    }
                }
            }
            k2 = "";
        }
        profile.setMessengerServerUrl(k2);
        String organizationId;
        if (messengerSettings == null) {
            organizationId = s;
        }
        else {
            organizationId = messengerSettings.organizationId;
            if (organizationId == null) {
                organizationId = s;
            }
        }
        profile.setMessengerOrganizationId(organizationId);
        return profile;
    }
    
    private final Profile y0(final Profile profile, final String s) {
        profile.updateAuthenticationToken(s);
        return profile;
    }
    
    private final void z0(final Profile profile, final SchoolSearchSchool schoolSearchSchool, final boolean b) {
        profile.setSchoolId(schoolSearchSchool.getSchoolId());
        profile.setSchoolLogin(schoolSearchSchool.getLoginName());
        profile.setSchoolDisplayName(schoolSearchSchool.getDisplayName());
        profile.setSchoolServerUrl(schoolSearchSchool.getServer());
        if (b) {
            profile.setSchoolUseMobileService(false);
            profile.setSchoolMobileServiceUrl(schoolSearchSchool.getMobileServiceUrl());
        }
    }
    
    @e
    @Override
    public Profile a() {
        return new Profile(0L, "hero", null, "EL4YJQXIPD3ZSG7U", 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, "demomobile", null, 7362200L, "demo.webuntis.com", false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -851979, 65535, null);
    }
    
    @e
    @Override
    public Profile b(@e final Profile profile) {
        k0.p(profile, "profile");
        return this.n0().b(profile);
    }
    
    @Override
    public void c(@e final Profile profile) {
        k0.p(profile, "profile");
        try {
            this.f0(profile);
            RegisterService.DefaultImpls.deregister$default(this.p0(), profile, false, 2, null).C5((rx.functions.b)m.G, (rx.functions.b)x.G);
            this.n0().c(profile);
            this.o0().b(profile);
            this.k0(profile);
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not delete profile", new Object[0]);
        }
    }
    
    @e
    @Override
    public Profile d(@e final Profile profile) {
        k0.p(profile, "profile");
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        if (b != null) {
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
            if (a.j() == profile.getId()) {
                a.b0(profile);
            }
        }
        return this.n0().d(profile);
    }
    
    @Override
    public boolean e() {
        for (final Profile next : this.s0()) {
            if (k0.g(next.getUniqueId(), "herodemomobile")) {
                return next != null;
            }
        }
        Profile next = null;
        return next != null;
    }
    
    @Override
    public void f() {
        final List<Profile> s0 = this.s0();
        final ArrayList<Profile> list = new ArrayList<Profile>();
        for (final Profile next : s0) {
            if (next.isAnonymousUser() ^ true) {
                list.add(next);
            }
        }
        for (final Profile profile : list) {
            j0.G.l0().getAuthenticationToken(profile).C5((rx.functions.b)new com.untis.mobile.services.profile.legacy.b(profile), (rx.functions.b)c0.G);
        }
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @e
    @Override
    public Profile h(@e final Profile profile) {
        k0.p(profile, "profile");
        final Profile n = this.n();
        boolean b = false;
        if (n != null) {
            if (n.getId() == profile.getId()) {
                b = true;
            }
        }
        if (b) {
            return profile;
        }
        final UntisMobileApplication b2 = UntisMobileApplication.I.b();
        if (b2 == null) {
            return profile;
        }
        kotlinx.coroutines.h.f((r0)kotlinx.coroutines.b2.G, (kotlin.coroutines.g)null, (u0)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
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
                return ((j0$c)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final j0 g2 = j0.G;
                    final Profile h2 = this.H;
                    this.G = 1;
                    if (g2.i(h2, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
        final com.untis.mobile.ui.activities.timetable.v.a b3 = com.untis.mobile.ui.activities.timetable.v.b0;
        b3.q(new TimeTableEntity(profile.getLastViewedEntityType(), profile.getLastViewedEntityId(), false, 0, 0L, null, 60, null));
        b3.o(profile.getUniqueId());
        b3.k(v.a.g());
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b2);
        final Profile b4 = this.b(profile);
        a.c0(b4.getId());
        a.b0(profile);
        return b4;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object i(@e final Profile profile, @e final kotlin.coroutines.d<? super Profile> d) {
        return kotlinx.coroutines.h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super Profile>, Object>() {
            int G;
            final /* synthetic */ Profile H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Profile>, Object>() {
                    int G;
                    final /* synthetic */ Profile H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Profile> d) {
                return ((j0$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                if (this.H.isAnonymousUser()) {
                    return this.H;
                }
                final UntisMobileApplication b = UntisMobileApplication.I.b();
                if (b == null) {
                    return this.H;
                }
                final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
                final j0 g = j0.G;
                final String directAuthenticationToken = g.l0().getDirectAuthenticationToken(this.H, kotlin.coroutines.jvm.internal.b.a(true));
                if (directAuthenticationToken != null) {
                    this.H.setAuthenticationToken(directAuthenticationToken);
                    g.b(this.H);
                    a.b0(this.H);
                }
                return this.H;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @Override
    public void j() {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        if (b == null) {
            return;
        }
        ((Application)b).getSharedPreferences((String)null, 0).edit().remove("profile_list").apply();
    }
    
    @Override
    public boolean k() {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        final boolean b2 = false;
        if (b == null) {
            return false;
        }
        final Set stringSet = ((Application)b).getSharedPreferences((String)null, 0).getStringSet("profile_list", (Set)null);
        boolean b3 = b2;
        if (stringSet != null) {
            b3 = b2;
            if (stringSet.isEmpty() ^ true) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Profile l(@e final String s) {
        k0.p(s, "uniqueId");
        return this.n0().g(s);
    }
    
    @e
    @Override
    public rx.g<Profile> m(@e final Profile profile, @org.jetbrains.annotations.f final String s, final long n, final boolean b) {
        k0.p(profile, "prototype");
        if (profile.getId() < 1L) {
            final io.realm.f0 d = this.o0().d();
            try {
                final Number h1 = d.f3(z4.c.class).h1("id");
                long longValue;
                if (h1 == null) {
                    longValue = 0L;
                }
                else {
                    longValue = h1.longValue();
                }
                profile.setId(longValue + 1L);
                final j2 a = j2.a;
                kotlin.io.c.a(d, null);
            }
            finally {
                try {}
                finally {
                    kotlin.io.c.a(d, (Throwable)profile);
                }
            }
        }
        rx.g g = rx.g.U2((Object)profile).Q3(rx.schedulers.c.e());
        if (!b) {
            g = g.j2((p)new a0(s, n));
        }
        final rx.g j2 = g.j2((p)new u(this)).j2((p)new com.untis.mobile.services.profile.legacy.w(this)).j2((p)new com.untis.mobile.services.profile.legacy.y(this)).j2((p)new z(this)).j2((p)new com.untis.mobile.services.profile.legacy.t(this)).j2((p)new com.untis.mobile.services.profile.legacy.s(this)).j2((p)new com.untis.mobile.services.profile.legacy.v(this));
        k0.o(j2, "observable\n            .flatMap(this::updateWithAppInfo)\n            .flatMap(this::updateWithUserData)\n            .flatMap(this::updateWithSchoolApiVersion)\n            .flatMap(this::updateTimeTableAccess)\n            .flatMap(this::updateWithSchoolColors)\n//            .flatMap(this::updateWithWebUntisPremium)\n            .flatMap(this::updateWithJwtRights)\n            .flatMap(this::updateWithRegisterDevice)");
        return (rx.g<Profile>)j2;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Profile n() {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        final Profile profile = null;
        if (b == null) {
            return null;
        }
        final long j = com.untis.mobile.utils.a.a((Context)b).j();
        final Iterator<Object> iterator = this.s0().iterator();
        Profile next;
        do {
            next = profile;
            if (!iterator.hasNext()) {
                break;
            }
            next = iterator.next();
        } while (next.getId() != j);
        return next;
    }
    
    @e
    @Override
    public List<Profile> o() {
        final Gson create = new GsonBuilder().create();
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        if (b == null) {
            return kotlin.collections.v.E();
        }
        Object o = null;
        final Set stringSet = ((Application)b).getSharedPreferences((String)null, 0).getStringSet("profile_list", (Set)null);
        if (stringSet != null) {
            final ArrayList<LegacyProfile> list = new ArrayList<LegacyProfile>();
            final Iterator<String> iterator = stringSet.iterator();
            Object o2;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                o2 = "untis_log";
                if (!hasNext) {
                    break;
                }
                final String obj = iterator.next();
                LegacyProfile legacyProfile;
                try {
                    legacyProfile = create.fromJson(obj, LegacyProfile.class);
                }
                catch (Exception ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("error while converting legacy json string to legacy profile; json:'");
                    sb.append((Object)obj);
                    sb.append('\'');
                    Log.e("untis_log", sb.toString(), (Throwable)ex);
                    legacyProfile = null;
                }
                if (legacyProfile == null) {
                    continue;
                }
                list.add(legacyProfile);
            }
            o = new ArrayList<LegacyChild>();
            Object o6 = null;
            Object o10;
            for (Object iterator2 = list.iterator(); ((Iterator)iterator2).hasNext(); iterator2 = o6, o2 = o10) {
                Object o4 = null;
                Object o5 = null;
            Label_0881_Outer:
                while (true) {
                    final LegacyProfile legacyProfile2 = ((Iterator<LegacyProfile>)iterator2).next();
                    Object o3 = o;
                    Object n5 = iterator2;
                    o4 = o2;
                    while (true) {
                        Object o9 = null;
                        Label_1107: {
                            try {
                                final String user = legacyProfile2.user;
                                if (user == null) {
                                    n5 = iterator2;
                                    o4 = null;
                                    o5 = o2;
                                    o6 = n5;
                                    break;
                                }
                                o3 = o;
                                n5 = iterator2;
                                o4 = o2;
                                String displayName = legacyProfile2.displayName;
                                final String s = "";
                                if (displayName == null) {
                                    displayName = "";
                                }
                                o3 = o;
                                n5 = iterator2;
                                o4 = o2;
                                String key = legacyProfile2.key;
                                if (key == null) {
                                    key = "";
                                }
                                o3 = o;
                                n5 = iterator2;
                                o4 = o2;
                                final long department = legacyProfile2.department;
                                o3 = o;
                                n5 = iterator2;
                                o4 = o2;
                                EntityType entityType;
                                if ((entityType = legacyProfile2.profileType) == null) {
                                    o3 = o;
                                    n5 = iterator2;
                                    o4 = o2;
                                    entityType = EntityType.NONE;
                                }
                                o3 = o;
                                n5 = iterator2;
                                o4 = o2;
                                k0.o(entityType, "legacyProfile.profileType\n                            ?: EntityType.NONE");
                                o3 = o;
                                n5 = iterator2;
                                o4 = o2;
                                final long id = legacyProfile2.id;
                                o3 = o;
                                n5 = iterator2;
                                o4 = o2;
                                Set<Right> can;
                                if ((can = legacyProfile2.can) == null) {
                                    o3 = o;
                                    n5 = iterator2;
                                    o4 = o2;
                                    can = new(java.util.HashSet.class);
                                    o3 = o;
                                    n5 = iterator2;
                                    o4 = o2;
                                    new HashSet();
                                }
                                o3 = o;
                                n5 = iterator2;
                                o4 = o2;
                                Object children = legacyProfile2.children;
                                Object k = null;
                            Label_0544_Outer:
                                while (true) {
                                    if (children == null) {
                                        o3 = o2;
                                        o4 = "";
                                        n5 = null;
                                        o6 = iterator2;
                                        o5 = o3;
                                        break Label_0751;
                                    }
                                    o3 = o;
                                    n5 = iterator2;
                                    o4 = o2;
                                    o3 = o;
                                    n5 = iterator2;
                                    o4 = o2;
                                    final ArrayList list2 = new ArrayList<Object>(kotlin.collections.v.Y((Iterable<?>)children, 10));
                                    o3 = o;
                                    n5 = iterator2;
                                    o4 = o2;
                                    final Iterator<LegacyChild> iterator3 = ((Iterable<LegacyChild>)children).iterator();
                                Block_36_Outer:
                                    while (true) {
                                        o3 = o;
                                        n5 = iterator2;
                                        o4 = o2;
                                        Label_0718: {
                                            if (!iterator3.hasNext()) {
                                                break Label_0718;
                                            }
                                            o3 = o;
                                            n5 = iterator2;
                                            o4 = o2;
                                            final LegacyChild legacyChild = iterator3.next();
                                            long id2 = 0L;
                                            String firstName = null;
                                            try {
                                                o4 = new(com.untis.mobile.persistence.models.profile.Child.class);
                                                try {
                                                    id2 = legacyChild.id;
                                                    firstName = legacyChild.firstName;
                                                    children = iterator2;
                                                    o3 = o2;
                                                    n5 = o;
                                                    final String s2 = firstName;
                                                    final String s3 = "legacyChild.firstName";
                                                    k0.o(s2, s3);
                                                    children = iterator2;
                                                    o3 = o2;
                                                    n5 = o;
                                                    final LegacyChild legacyChild2 = legacyChild;
                                                    final String s4 = legacyChild2.lastName;
                                                    children = iterator2;
                                                    o3 = o2;
                                                    n5 = o;
                                                    final String s5 = s4;
                                                    final String s6 = "legacyChild.lastName";
                                                    k0.o(s5, s6);
                                                    children = iterator2;
                                                    o3 = o2;
                                                    n5 = o;
                                                    final Object o7 = o4;
                                                    final long n6 = id2;
                                                    final String s7 = firstName;
                                                    final String s8 = s4;
                                                    final boolean b2 = false;
                                                    new Child(n6, s7, s8, b2);
                                                    children = iterator2;
                                                    o3 = o2;
                                                    n5 = o;
                                                    final ArrayList<? extends T> list3 = (ArrayList<? extends T>)list2;
                                                    final Object o8 = o4;
                                                    list3.add((T)o8);
                                                }
                                                catch (Exception o4) {
                                                    n5 = o;
                                                    o9 = o4;
                                                }
                                            }
                                            catch (Exception o4) {
                                                n5 = o;
                                                o9 = o4;
                                                break Label_1107;
                                            }
                                            try {
                                                final String s2 = firstName;
                                                final String s3 = "legacyChild.firstName";
                                                k0.o(s2, s3);
                                                children = iterator2;
                                                o3 = o2;
                                                n5 = o;
                                                final LegacyChild legacyChild2 = legacyChild;
                                                final String s4 = legacyChild2.lastName;
                                                children = iterator2;
                                                o3 = o2;
                                                n5 = o;
                                                final String s5 = s4;
                                                final String s6 = "legacyChild.lastName";
                                                k0.o(s5, s6);
                                                children = iterator2;
                                                o3 = o2;
                                                n5 = o;
                                                final Object o7 = o4;
                                                final long n6 = id2;
                                                final String s7 = firstName;
                                                final String s8 = s4;
                                                final boolean b2 = false;
                                                new Child(n6, s7, s8, b2);
                                                children = iterator2;
                                                o3 = o2;
                                                n5 = o;
                                                final ArrayList<? extends T> list3 = (ArrayList<? extends T>)list2;
                                                final Object o8 = o4;
                                                list3.add((T)o8);
                                                continue Block_36_Outer;
                                                // iftrue(Label_0787:, n5 != null)
                                                while (true) {
                                                    children = o6;
                                                    o3 = o5;
                                                    n5 = o;
                                                    k = j1.k();
                                                    break Label_0544_Outer;
                                                    k = n5;
                                                    continue Label_0881_Outer;
                                                }
                                                o4 = (children = iterator2);
                                                o3 = o2;
                                                n5 = o;
                                                final Set<? extends T> n7 = kotlin.collections.v.N5((Iterable<? extends T>)list2);
                                                o5 = o2;
                                                o6 = o4;
                                                o4 = s;
                                                n5 = n7;
                                                continue Label_0544_Outer;
                                            }
                                            catch (Exception o9) {
                                                iterator2 = children;
                                                o2 = o3;
                                                break Label_1107;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
                                o3 = o5;
                                n5 = o;
                                final List<Long> klassenIds = legacyProfile2.klassenIds;
                                if (klassenIds == null) {
                                    n5 = null;
                                }
                                else {
                                    o3 = o5;
                                    n5 = o;
                                    n5 = kotlin.collections.v.N5((Iterable<?>)klassenIds);
                                }
                                Object i = n5;
                                if (n5 == null) {
                                    o3 = o5;
                                    n5 = o;
                                    i = j1.k();
                                }
                                o3 = o5;
                                n5 = o;
                                final String school = legacyProfile2.school;
                                if (school == null) {
                                    o3 = o5;
                                    o4 = null;
                                    o5 = o3;
                                    break;
                                }
                                o3 = o5;
                                n5 = o;
                                Object schoolDisplayName = legacyProfile2.schoolDisplayName;
                                if (schoolDisplayName == null) {
                                    schoolDisplayName = o4;
                                }
                                o3 = o5;
                                n5 = o;
                                final long schoolId = legacyProfile2.schoolId;
                                o3 = o5;
                                n5 = o;
                                Object serverUrl = legacyProfile2.serverUrl;
                                if (serverUrl == null) {
                                    serverUrl = o4;
                                }
                                o3 = o5;
                                n5 = o;
                                final String mobileServiceUrl = legacyProfile2.mobileServiceUrl;
                                if (mobileServiceUrl != null) {
                                    o4 = mobileServiceUrl;
                                }
                                o3 = o5;
                                n5 = o;
                                o4 = new Profile(0L, user, displayName, key, department, entityType, id, null, null, can, (Set)k, (Set)i, false, false, 0L, null, school, (String)schoolDisplayName, schoolId, (String)serverUrl, false, (String)o4, legacyProfile2.serverDelta, 0, null, null, false, legacyProfile2.updateDone, legacyProfile2.lastPeriodDataSync, legacyProfile2.masterDataTimestamp, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, 58777984, 65533, null);
                                break;
                            }
                            catch (Exception o9) {
                                iterator2 = n5;
                                n5 = o3;
                                o2 = o4;
                            }
                        }
                        Log.e((String)o2, "error on converting legacyProfile to profile", (Throwable)o9);
                        o3 = o2;
                        o6 = iterator2;
                        o = n5;
                        continue;
                    }
                }
                if (o4 != null) {
                    ((Collection<? extends T>)o).add((T)o4);
                }
                o10 = o5;
            }
        }
        Object e;
        if ((e = o) == null) {
            e = kotlin.collections.v.E();
        }
        return (List<Profile>)e;
    }
    
    @Override
    public boolean p(@e final Profile profile) {
        return a.c(this, profile);
    }
    
    @e
    @Override
    public rx.g<Profile> q(@e final Profile profile, final boolean b) {
        k0.p(profile, "prototype");
        return this.m(profile, null, 0L, b);
    }
    
    @Override
    public boolean r() {
        final List<Profile> s0 = this.s0();
        final boolean b = s0 instanceof Collection;
        boolean b2 = true;
        if (!b || !s0.isEmpty()) {
            final Iterator<Object> iterator = s0.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getUpdated() ^ true) {
                    return b2;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Profile s(final long n) {
        return this.n0().h(n);
    }
    
    @e
    public List<Profile> s0() {
        return this.n0().a();
    }
}
