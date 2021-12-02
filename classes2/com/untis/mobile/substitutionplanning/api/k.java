// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.api;

import com.untis.mobile.services.profile.legacy.j0;
import kotlin.c1;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.i1;
import com.untis.mobile.substitutionplanning.model.RestDtoExtensionKt;
import rx.schedulers.c;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.substitutionplanning.model.PeriodGroupCollectionDto;
import kotlin.coroutines.d;
import rx.functions.p;
import com.untis.mobile.utils.extension.f;
import retrofit2.t;
import com.untis.wu.rest.model.TeacherAbsenceDto;
import com.untis.wu.rest.model.TeacherAbsenceViewDto;
import kotlin.jvm.internal.m0;
import com.untis.mobile.substitutionplanning.model.AskTeacherViewDto;
import n6.l;
import rx.g;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.w;
import retrofit2.u$b;
import kotlin.jvm.internal.k0;
import okhttp3.c0;
import retrofit2.f$a;
import retrofit2.c$a;
import com.untis.mobile.services.profile.legacy.a;
import org.jetbrains.annotations.e;
import com.untis.mobile.api.ApiService;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u00100\u001a\u00020\r\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b7\u00108JM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052'\u0010\u000b\u001a#\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0007H\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0010J,\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0010J,\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0010J,\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010J,\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069" }, d2 = { "Lcom/untis/mobile/substitutionplanning/api/k;", "", "T", "", "throwable", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "Lrx/g;", "function", "t", "", "authenticationToken", "H", "", "firstRun", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupCollectionDto;", "w", "(Lcom/untis/mobile/persistence/models/profile/Profile;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/wu/rest/model/TeacherAbsenceViewDto;", "B", "Lcom/untis/wu/rest/model/TeacherAbsenceDto;", "teacherAbsenceDto", "E", "Lretrofit2/t;", "Ljava/lang/Void;", "I", "q", "", "conflictId", "j", "n", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherViewDto;", "y", "Lcom/untis/mobile/substitutionplanning/api/a;", "c", "Lcom/untis/mobile/substitutionplanning/api/a;", "api", "Lcom/untis/mobile/services/profile/legacy/a;", "b", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/api/ApiService;", "a", "Lcom/untis/mobile/api/ApiService;", "apiService", "baseUrl", "Lretrofit2/c$a;", "callAdapterFactory", "Lretrofit2/f$a;", "converterFactory", "Lokhttp3/c0;", "client", "<init>", "(Ljava/lang/String;Lretrofit2/c$a;Lretrofit2/f$a;Lokhttp3/c0;Lcom/untis/mobile/api/ApiService;Lcom/untis/mobile/services/profile/legacy/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k
{
    @e
    private final ApiService a;
    @e
    private final a b;
    @e
    private final com.untis.mobile.substitutionplanning.api.a c;
    
    public k(@e final String s, @e final c$a c$a, @e final f$a f$a, @e final c0 c0, @e final ApiService a, @e final a b) {
        k0.p(s, "baseUrl");
        k0.p(c$a, "callAdapterFactory");
        k0.p(f$a, "converterFactory");
        k0.p(c0, "client");
        k0.p(a, "apiService");
        k0.p(b, "profileService");
        this.a = a;
        this.b = b;
        final Object g = new u$b().c(s).a(c$a).b(f$a).j(c0).f().g((Class)com.untis.mobile.substitutionplanning.api.a.class);
        k0.o(g, "Builder()\n        .baseUrl(baseUrl)\n        .addCallAdapterFactory(callAdapterFactory)\n        .addConverterFactory(converterFactory)\n        .client(client)\n        .build()\n        .create(SubstitutionPlanningApi::class.java)");
        this.c = (com.untis.mobile.substitutionplanning.api.a)g;
    }
    
    private static final g A(final k k, final Profile profile, final boolean b, final Throwable t) {
        k0.p(k, "this$0");
        k0.p(profile, "$profile");
        k0.o(t, "throwable");
        return k.t(t, profile, (l<? super Profile, ? extends rx.g<Object>>)new l<Profile, g<AskTeacherViewDto>>() {
            @e
            @Override
            public final g<AskTeacherViewDto> invoke(@e final Profile profile) {
                k0.p(profile, "p");
                if (b) {
                    k.y(profile, false);
                }
                final Throwable i = t;
                k0.o(i, "throwable");
                throw i;
            }
        });
    }
    
    private static final g D(final k k, final Profile profile, final boolean b, final Throwable t) {
        k0.p(k, "this$0");
        k0.p(profile, "$profile");
        k0.o(t, "throwable");
        return k.t(t, profile, (l<? super Profile, ? extends rx.g<Object>>)new l<Profile, g<TeacherAbsenceViewDto>>() {
            @e
            @Override
            public final g<TeacherAbsenceViewDto> invoke(@e final Profile profile) {
                k0.p(profile, "p");
                if (b) {
                    k.B(profile, false);
                }
                final Throwable i = t;
                k0.o(i, "throwable");
                throw i;
            }
        });
    }
    
    private static final g G(final k k, final Profile profile, final boolean b, final TeacherAbsenceDto teacherAbsenceDto, final Throwable t) {
        k0.p(k, "this$0");
        k0.p(profile, "$profile");
        k0.p(teacherAbsenceDto, "$teacherAbsenceDto");
        k0.o(t, "throwable");
        return k.t(t, profile, (l<? super Profile, ? extends rx.g<Object>>)new l<Profile, g<TeacherAbsenceDto>>() {
            @e
            @Override
            public final g<TeacherAbsenceDto> invoke(@e final Profile profile) {
                k0.p(profile, "p");
                if (b) {
                    k.E(profile, teacherAbsenceDto, false);
                }
                final Throwable j = t;
                k0.o(j, "throwable");
                throw j;
            }
        });
    }
    
    private final Profile H(final Profile profile, final String s) {
        profile.updateAuthenticationToken(s);
        this.b.d(profile);
        return profile;
    }
    
    private static final g K(final k k, final Profile profile, final boolean b, final TeacherAbsenceDto teacherAbsenceDto, final Throwable t) {
        k0.p(k, "this$0");
        k0.p(profile, "$profile");
        k0.p(teacherAbsenceDto, "$teacherAbsenceDto");
        k0.o(t, "throwable");
        return k.t(t, profile, (l<? super Profile, ? extends rx.g<Object>>)new l<Profile, g<t<Void>>>() {
            @e
            @Override
            public final g<retrofit2.t<Void>> invoke(@e final Profile profile) {
                k0.p(profile, "p");
                if (b) {
                    k.I(profile, teacherAbsenceDto, false);
                }
                final Throwable j = t;
                k0.o(j, "throwable");
                throw j;
            }
        });
    }
    
    private static final g l(final k k, final Profile profile, final boolean b, final long n, final Throwable t) {
        k0.p(k, "this$0");
        k0.p(profile, "$profile");
        k0.o(t, "throwable");
        return k.t(t, profile, (l<? super Profile, ? extends rx.g<Object>>)new l<Profile, g<t<Void>>>() {
            @e
            @Override
            public final g<retrofit2.t<Void>> invoke(@e final Profile profile) {
                k0.p(profile, "p");
                if (b) {
                    k.j(profile, n, false);
                }
                final Throwable j = t;
                k0.o(j, "throwable");
                throw j;
            }
        });
    }
    
    public static final /* synthetic */ com.untis.mobile.substitutionplanning.api.a m(final k k) {
        return k.c;
    }
    
    private static final g p(final k k, final Profile profile, final boolean b, final long n, final Throwable t) {
        k0.p(k, "this$0");
        k0.p(profile, "$profile");
        k0.o(t, "throwable");
        return k.t(t, profile, (l<? super Profile, ? extends rx.g<Object>>)new l<Profile, g<t<Void>>>() {
            @e
            @Override
            public final g<retrofit2.t<Void>> invoke(@e final Profile profile) {
                k0.p(profile, "p");
                if (b) {
                    k.n(profile, n, false);
                }
                final Throwable j = t;
                k0.o(j, "throwable");
                throw j;
            }
        });
    }
    
    private static final g s(final k k, final Profile profile, final boolean b, final TeacherAbsenceDto teacherAbsenceDto, final Throwable t) {
        k0.p(k, "this$0");
        k0.p(profile, "$profile");
        k0.p(teacherAbsenceDto, "$teacherAbsenceDto");
        k0.o(t, "throwable");
        return k.t(t, profile, (l<? super Profile, ? extends rx.g<Object>>)new l<Profile, g<t<Void>>>() {
            @e
            @Override
            public final g<retrofit2.t<Void>> invoke(@e final Profile profile) {
                k0.p(profile, "p");
                if (b) {
                    k.q(profile, teacherAbsenceDto, false);
                }
                final Throwable j = t;
                k0.o(j, "throwable");
                throw j;
            }
        });
    }
    
    private final <T> g<T> t(final Throwable t, final Profile profile, final l<? super Profile, ? extends g<T>> l) {
        if (f.a(t)) {
            final g j2 = this.a.getAuthenticationToken(profile).k3((p)new b(this, profile)).j2((p)new j(l));
            k0.o(j2, "apiService\n                .getAuthenticationToken(profile)\n                .map { updateProfile(profile, it) }\n                .flatMap { function.invoke(it) }");
            return (g<T>)j2;
        }
        throw t;
    }
    
    private static final Profile u(final k k, final Profile profile, final String s) {
        k0.p(k, "this$0");
        k0.p(profile, "$profile");
        k0.o(s, "it");
        return k.H(profile, s);
    }
    
    private static final g v(final l l, final Profile profile) {
        k0.p(l, "$function");
        k0.o(profile, "it");
        return l.invoke(profile);
    }
    
    @e
    public final g<TeacherAbsenceViewDto> B(@e final Profile profile, final boolean b) {
        k0.p(profile, "profile");
        final g d4 = this.c.c(profile.getWuRestApiUrl("view/teacher-absences/form"), k0.C("Bearer ", profile.getAuthenticationToken()), h.s(profile.getSchoolLogin())).E5(rx.schedulers.c.e()).d4((p)new com.untis.mobile.substitutionplanning.api.d(this, profile, b));
        k0.o(d4, "api\n            .getAddTeacherAbsenceForm(\n                url = profile.getWuRestApiUrl(\"view/teacher-absences/form\"),\n                authorization = \"Bearer ${profile.authenticationToken}\",\n                school = profile.schoolLogin.encoded()\n            )\n            .subscribeOn(Schedulers.io())\n            .onErrorResumeNext { throwable ->\n                fetchAuthenticationTokenAndRetry(throwable, profile) { p ->\n                    if (firstRun) requestTeacherAbsenceForm(p, false)\n                    throw throwable\n                }\n            }");
        return (g<TeacherAbsenceViewDto>)d4;
    }
    
    @e
    public final g<TeacherAbsenceDto> E(@e final Profile profile, @e final TeacherAbsenceDto teacherAbsenceDto, final boolean b) {
        k0.p(profile, "profile");
        k0.p(teacherAbsenceDto, "teacherAbsenceDto");
        final g d4 = this.c.b(profile.getWuRestApiUrl("view/teacher-absences"), k0.C("Bearer ", profile.getAuthenticationToken()), h.s(profile.getSchoolLogin()), teacherAbsenceDto).E5(rx.schedulers.c.e()).d4((p)new com.untis.mobile.substitutionplanning.api.h(this, profile, b, teacherAbsenceDto));
        k0.o(d4, "api\n            .submitTeacherAbsence(\n                url = profile.getWuRestApiUrl(\"view/teacher-absences\"),\n                authorization = \"Bearer ${profile.authenticationToken}\",\n                school = profile.schoolLogin.encoded(),\n                teacherAbsence = teacherAbsenceDto\n            )\n            .subscribeOn(Schedulers.io())\n            .onErrorResumeNext { throwable ->\n                fetchAuthenticationTokenAndRetry(throwable, profile) { p ->\n                    if (firstRun) submitTeacherAbsence(p, teacherAbsenceDto, false)\n                    throw throwable\n                }\n            }");
        return (g<TeacherAbsenceDto>)d4;
    }
    
    @e
    public final g<t<Void>> I(@e final Profile profile, @e final TeacherAbsenceDto teacherAbsenceDto, final boolean b) {
        k0.p(profile, "profile");
        k0.p(teacherAbsenceDto, "teacherAbsenceDto");
        final g d4 = this.c.f(profile.getWuRestApiUrl(k0.C("view/teacher-absences/", teacherAbsenceDto.getId())), k0.C("Bearer ", profile.getAuthenticationToken()), h.s(profile.getSchoolLogin()), RestDtoExtensionKt.toTeacherAbsenceUpdateDto(teacherAbsenceDto)).E5(rx.schedulers.c.e()).d4((p)new i(this, profile, b, teacherAbsenceDto));
        k0.o(d4, "api\n            .updateTeacherAbsence(\n                url = profile.getWuRestApiUrl(\"view/teacher-absences/${teacherAbsenceDto.id}\"),\n                authorization = \"Bearer ${profile.authenticationToken}\",\n                school = profile.schoolLogin.encoded(),\n                teacherAbsence = teacherAbsenceDto.toTeacherAbsenceUpdateDto()\n            )\n            .subscribeOn(Schedulers.io())\n            .onErrorResumeNext { throwable ->\n                fetchAuthenticationTokenAndRetry(throwable, profile) { p ->\n                    if (firstRun) updateTeacherAbsence(p, teacherAbsenceDto, false)\n                    throw throwable\n                }\n            }");
        return (g<t<Void>>)d4;
    }
    
    @e
    public final g<t<Void>> j(@e final Profile profile, final long lng, final boolean b) {
        k0.p(profile, "profile");
        final StringBuilder sb = new StringBuilder();
        sb.append("v2/periods/");
        sb.append(lng);
        sb.append("/changes/ask-teacher/teacher/accept");
        final g d4 = this.c.a(profile.getSpUrl(sb.toString()), h.s(profile.getSchoolLogin()), k0.C("Bearer ", profile.getAuthenticationToken())).E5(rx.schedulers.c.e()).d4((p)new com.untis.mobile.substitutionplanning.api.f(this, profile, b, lng));
        k0.o(d4, "api\n            .acceptAskTeacherRequest(\n                url = profile.getSpUrl(url),\n                authorization = \"Bearer ${profile.authenticationToken}\",\n                tenantId = profile.schoolLogin.encoded()\n            ).subscribeOn(Schedulers.io())\n            .onErrorResumeNext { throwable ->\n                fetchAuthenticationTokenAndRetry(throwable, profile) { p ->\n                    if (firstRun) acceptAskTeacherRequest(p, conflictId, false)\n                    throw throwable\n                }\n            }");
        return (g<t<Void>>)d4;
    }
    
    @e
    public final g<t<Void>> n(@e final Profile profile, final long lng, final boolean b) {
        k0.p(profile, "profile");
        final StringBuilder sb = new StringBuilder();
        sb.append("v2/periods/");
        sb.append(lng);
        sb.append("/changes/ask-teacher/teacher/decline");
        final g d4 = this.c.e(profile.getSpUrl(sb.toString()), h.s(profile.getSchoolLogin()), k0.C("Bearer ", profile.getAuthenticationToken())).E5(rx.schedulers.c.e()).d4((p)new com.untis.mobile.substitutionplanning.api.e(this, profile, b, lng));
        k0.o(d4, "api\n            .declineAskTeacherRequest(\n                url = profile.getSpUrl(url),\n                authorization = \"Bearer ${profile.authenticationToken}\",\n                tenantId = profile.schoolLogin.encoded()\n            ).subscribeOn(Schedulers.io())\n            .onErrorResumeNext { throwable ->\n                fetchAuthenticationTokenAndRetry(throwable, profile) { p ->\n                    if (firstRun) declineAskTeacherRequest(p, conflictId, false)\n                    throw throwable\n                }\n            }");
        return (g<t<Void>>)d4;
    }
    
    @e
    public final g<t<Void>> q(@e final Profile profile, @e final TeacherAbsenceDto teacherAbsenceDto, final boolean b) {
        k0.p(profile, "profile");
        k0.p(teacherAbsenceDto, "teacherAbsenceDto");
        final g d4 = this.c.d(profile.getWuRestApiUrl(k0.C("view/teacher-absences/", teacherAbsenceDto.getId())), k0.C("Bearer ", profile.getAuthenticationToken()), h.s(profile.getSchoolLogin())).E5(rx.schedulers.c.e()).d4((p)new com.untis.mobile.substitutionplanning.api.g(this, profile, b, teacherAbsenceDto));
        k0.o(d4, "api\n            .deleteTeacherAbsence(\n                url = profile.getWuRestApiUrl(\"view/teacher-absences/${teacherAbsenceDto.id}\"),\n                authorization = \"Bearer ${profile.authenticationToken}\",\n                school = profile.schoolLogin.encoded()\n            )\n            .subscribeOn(Schedulers.io())\n            .onErrorResumeNext { throwable ->\n                fetchAuthenticationTokenAndRetry(throwable, profile) { p ->\n                    if (firstRun) deleteTeacherAbsence(p, teacherAbsenceDto, false)\n                    throw throwable\n                }\n            }");
        return (g<t<Void>>)d4;
    }
    
    @org.jetbrains.annotations.f
    public final Object w(@e final Profile profile, final boolean b, @e final d<? super PeriodGroupCollectionDto> d) throws Exception {
        return kotlinx.coroutines.h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, d<? super PeriodGroupCollectionDto>, Object>(null) {
            int G;
            final /* synthetic */ k H;
            final /* synthetic */ Profile I;
            final /* synthetic */ boolean J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super PeriodGroupCollectionDto>, Object>(d) {
                    int G;
                    final /* synthetic */ k H = this.H;
                    final /* synthetic */ Profile I = this.I;
                    final /* synthetic */ boolean J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super PeriodGroupCollectionDto> d) {
                return ((k$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        timber.log.b.g(t, "could not fetch teacher own absences", new Object[0]);
                        if (!this.J || (!f.a(t) && !f.b(t))) {
                            break Label_0063;
                        }
                        final j0 g2 = j0.G;
                        final Profile i = this.I;
                        this.G = 2;
                        if (g2.i(i, this) == h) {
                            return h;
                        }
                        break Label_0063;
                        Label_0143: {
                            return o;
                        }
                        c1.n(o);
                        final com.untis.mobile.substitutionplanning.api.a m = k.m(this.H);
                        final String spUrl = this.I.getSpUrl("v2/view/teacher-absences");
                        final String s = com.untis.mobile.utils.extension.h.s(this.I.getSchoolLogin());
                        final String c = k0.C("Bearer ", this.I.getAuthenticationToken());
                        this.G = 1;
                        // iftrue(Label_0143:, o = m.h(spUrl, s, c, (d<? super PeriodGroupCollectionDto>)this) != h)
                        return h;
                    }
                }
                final k h2 = this.H;
                final Profile j = this.I;
                this.G = 3;
                if ((o = h2.w(j, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @e
    public final g<AskTeacherViewDto> y(@e final Profile profile, final boolean b) {
        k0.p(profile, "profile");
        final g d4 = this.c.g(profile.getSpUrl("v2/view/ask-teacher-requests-view"), h.s(profile.getSchoolLogin()), k0.C("Bearer ", profile.getAuthenticationToken())).E5(rx.schedulers.c.e()).d4((p)new com.untis.mobile.substitutionplanning.api.c(this, profile, b));
        k0.o(d4, "api\n            .getAskTeacherRequestView(\n                url = profile.getSpUrl(url),\n                authorization = \"Bearer ${profile.authenticationToken}\",\n                tenantId = profile.schoolLogin.encoded()\n            ).subscribeOn(Schedulers.io())\n            .onErrorResumeNext { throwable ->\n                fetchAuthenticationTokenAndRetry(throwable, profile) { p ->\n                    if (firstRun) getAskTeacherRequestView(p, false)\n                    throw throwable\n                }\n            }");
        return (g<AskTeacherViewDto>)d4;
    }
}
