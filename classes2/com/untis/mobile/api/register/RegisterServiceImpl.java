// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.register;

import kotlin.text.s;
import rx.schedulers.c;
import kotlin.jvm.internal.w;
import com.untis.mobile.api.common.MobileDeviceDTO;
import com.untis.mobile.utils.extension.k;
import rx.functions.p;
import com.untis.mobile.utils.l0;
import com.untis.mobile.utils.extension.f;
import android.util.Log;
import n6.l;
import rx.g;
import com.untis.mobile.persistence.models.profile.Profile;
import retrofit2.t;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.dao.profile.a;
import org.jetbrains.annotations.e;
import com.untis.mobile.api.ApiService;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032'\u0010\t\u001a#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0005H\u0002J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 " }, d2 = { "Lcom/untis/mobile/api/register/RegisterServiceImpl;", "Lcom/untis/mobile/api/register/RegisterService;", "T", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "Lrx/g;", "retry", "updateJwt", "", "authenticationToken", "updateProfile", "", "firstTry", "register", "deregister", "Lcom/untis/mobile/api/ApiService;", "apiService", "Lcom/untis/mobile/api/ApiService;", "Lcom/untis/mobile/api/register/RegisterApi;", "registerApi", "Lcom/untis/mobile/api/register/RegisterApi;", "Lcom/untis/mobile/persistence/dao/profile/a;", "profileDao", "Lcom/untis/mobile/persistence/dao/profile/a;", "Lcom/untis/mobile/utils/a;", "settings", "Lcom/untis/mobile/utils/a;", "<init>", "(Lcom/untis/mobile/utils/a;Lcom/untis/mobile/api/register/RegisterApi;Lcom/untis/mobile/api/ApiService;Lcom/untis/mobile/persistence/dao/profile/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class RegisterServiceImpl implements RegisterService
{
    @e
    private final ApiService apiService;
    @e
    private final a profileDao;
    @e
    private final RegisterApi registerApi;
    @e
    private final com.untis.mobile.utils.a settings;
    
    public RegisterServiceImpl(@e final com.untis.mobile.utils.a settings, @e final RegisterApi registerApi, @e final ApiService apiService, @e final a profileDao) {
        k0.p(settings, "settings");
        k0.p(registerApi, "registerApi");
        k0.p(apiService, "apiService");
        k0.p(profileDao, "profileDao");
        this.settings = settings;
        this.registerApi = registerApi;
        this.apiService = apiService;
        this.profileDao = profileDao;
    }
    
    private static final Boolean deregister$lambda-2(final t t) {
        Log.i("untis_log", k0.C("result received ", t));
        return Boolean.TRUE;
    }
    
    private static final g deregister$lambda-3(final boolean b, final RegisterServiceImpl registerServiceImpl, final Profile profile, final Throwable t) {
        k0.p(registerServiceImpl, "this$0");
        k0.p(profile, "$profile");
        t.printStackTrace();
        Log.e("untis_log", "error on deregistration", t);
        if (b) {
            k0.o(t, "it");
            if (f.a(t)) {
                return registerServiceImpl.updateJwt(profile, (l<? super Profile, ? extends rx.g<Object>>)new RegisterServiceImpl$deregister$2.RegisterServiceImpl$deregister$2$1(registerServiceImpl, profile));
            }
        }
        return l0.a(Boolean.TRUE);
    }
    
    private static final Boolean register$lambda-0(final RegisterMobileDeviceDtoResult registerMobileDeviceDtoResult) {
        Log.i("untis_log", k0.C("result received ", registerMobileDeviceDtoResult));
        return Boolean.TRUE;
    }
    
    private static final g register$lambda-1(final boolean b, final RegisterServiceImpl registerServiceImpl, final Profile profile, final Throwable t) {
        k0.p(registerServiceImpl, "this$0");
        k0.p(profile, "$profile");
        t.printStackTrace();
        Log.e("untis_log", "error on registration", t);
        k0.o(t, "it");
        if (!b) {
            throw t;
        }
        if (f.a(t)) {
            return registerServiceImpl.updateJwt(profile, (l<? super Profile, ? extends rx.g<Object>>)new RegisterServiceImpl$register$2.RegisterServiceImpl$register$2$1(registerServiceImpl, profile));
        }
        throw t;
    }
    
    private final <T> g<T> updateJwt(final Profile profile, final l<? super Profile, ? extends g<T>> l) {
        final g j2 = this.apiService.getAuthenticationToken(profile).j2((p)new com.untis.mobile.api.register.a(this, profile)).j2((p)new b(l));
        k0.o(j2, "apiService\n                .getAuthenticationToken(profile)\n                .flatMap { updateProfile(profile, it) }\n                .flatMap { retry.invoke(it) }");
        return (g<T>)j2;
    }
    
    private static final g updateJwt$lambda-4(final RegisterServiceImpl registerServiceImpl, final Profile profile, final String s) {
        k0.p(registerServiceImpl, "this$0");
        k0.p(profile, "$profile");
        k0.o(s, "it");
        return registerServiceImpl.updateProfile(profile, s);
    }
    
    private static final g updateJwt$lambda-5(final l l, final Profile profile) {
        k0.p(l, "$retry");
        k0.o(profile, "it");
        return l.invoke(profile);
    }
    
    private final g<Profile> updateProfile(final Profile profile, final String s) {
        profile.updateAuthenticationToken(s);
        this.profileDao.b(profile);
        return l0.a(profile);
    }
    
    @e
    @Override
    public g<Boolean> deregister(@e final Profile profile, final boolean b) {
        k0.p(profile, "profile");
        if (profile.isAnonymousUser()) {
            return l0.a(Boolean.TRUE);
        }
        if (!k.d(profile, 2021, 0, 0, 6, null)) {
            return l0.a(Boolean.TRUE);
        }
        final String authenticationToken = profile.getAuthenticationToken();
        final String e = this.settings.e();
        k0.o(e, "settings.androidId");
        final String h = this.settings.h();
        k0.o(h, "settings.currentFcmToken");
        final g d4 = this.registerApi.deregisterMobileDeviceDto(k0.C(profile.getRegistrationUrl(), "/api/register/"), k0.C("Bearer ", authenticationToken), new MobileDeviceDTO(null, e, h, null, null, 25, null)).E5(c.e()).k3((p)com.untis.mobile.api.register.f.G).d4((p)new d(b, this, profile));
        k0.o(d4, "registerApi\n                .deregisterMobileDeviceDto(\n                        url = \"${profile.registrationUrl}/api/register/\",\n                        authorization = \"Bearer $authenticationToken\",\n                        mobileDeviceDTO = mobileDeviceDTO\n                )\n                .subscribeOn(Schedulers.io())\n                .map {\n                    Log.i(Constant.LOG, \"result received $it\")\n\n                    true\n                }\n                .onErrorResumeNext {\n                    it.printStackTrace()\n\n                    Log.e(Constant.LOG, \"error on deregistration\", it)\n\n                    if (firstTry && (it.isHttp401Exception())) {\n                        return@onErrorResumeNext updateJwt(profile) { deregister(profile, false) }\n                    }\n\n                    return@onErrorResumeNext observable(true)\n                }");
        return (g<Boolean>)d4;
    }
    
    @e
    @Override
    public g<Boolean> register(@e final Profile profile, final boolean b) {
        k0.p(profile, "profile");
        final String h = this.settings.h();
        k0.o(h, "settings.currentFcmToken");
        if (s.U1((CharSequence)h)) {
            return l0.a(Boolean.FALSE);
        }
        if (profile.isAnonymousUser()) {
            return l0.a(Boolean.TRUE);
        }
        if (!k.d(profile, 2021, 0, 0, 6, null)) {
            return l0.a(Boolean.TRUE);
        }
        final String authenticationToken = profile.getAuthenticationToken();
        final String e = this.settings.e();
        k0.o(e, "settings.androidId");
        final String h2 = this.settings.h();
        k0.o(h2, "settings.currentFcmToken");
        final g d4 = this.registerApi.registerMobileDeviceDto(k0.C(profile.getRegistrationUrl(), "/api/register/"), k0.C("Bearer ", authenticationToken), new MobileDeviceDTO(null, e, h2, null, null, 25, null)).E5(c.e()).k3((p)com.untis.mobile.api.register.e.G).d4((p)new com.untis.mobile.api.register.c(b, this, profile));
        k0.o(d4, "registerApi\n                .registerMobileDeviceDto(\n                        url = \"${profile.registrationUrl}/api/register/\",\n                        authorization = \"Bearer $authenticationToken\",\n                        mobileDeviceDTO = mobileDeviceDTO\n                )\n                .subscribeOn(Schedulers.io())\n                .map {\n                    Log.i(Constant.LOG, \"result received $it\")\n\n                    true\n                }\n                .onErrorResumeNext {\n                    it.printStackTrace()\n\n                    Log.e(Constant.LOG, \"error on registration\", it)\n\n                    if (!firstTry) {\n                        throw it\n                    }\n\n                    if (it.isHttp401Exception()) {\n                        return@onErrorResumeNext updateJwt(profile) { register(profile, false) }\n                    }\n\n                    throw it\n                }");
        return (g<Boolean>)d4;
    }
}
