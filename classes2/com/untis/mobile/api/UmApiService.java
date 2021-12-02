// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api;

import com.untis.mobile.api.dto.SubmitRoomChangeResponse;
import com.untis.mobile.api.dto.SubmitPeriodInfoResponse;
import com.untis.mobile.api.dto.SubmitOwnAbsenceResponse;
import com.untis.mobile.api.dto.SubmitOfficeHourRegistrationResponse;
import com.untis.mobile.api.dto.legacy.SubmitLessonTopicResponse;
import com.untis.mobile.api.dto.legacy.SubmitHomeWorkResponse;
import com.untis.mobile.api.dto.SubmitExcuseResponse;
import com.untis.mobile.api.dto.legacy.SubmitClassRegEventsResponse;
import com.untis.mobile.api.dto.legacy.SubmitAbsencesResponse;
import com.untis.mobile.api.dto.SubmitAbsencesCheckedResponse;
import com.untis.mobile.api.dto.GetUserMessagesResponse;
import com.untis.mobile.api.dto.GetUserDataResponse;
import com.untis.mobile.api.dto.GetTimetableResponse;
import com.untis.mobile.api.dto.GetStudentAbsencesResponse;
import com.untis.mobile.api.dto.GetRoomChangeDataResponse;
import com.untis.mobile.api.dto.GetPeriodDataResponse;
import com.untis.mobile.api.dto.parentsday.GetPDayAppointmentsResponse;
import com.untis.mobile.api.dto.GetOfficeHourRegistrationsResponse;
import com.untis.mobile.persistence.models.messenger.MessengerChannelData;
import com.untis.mobile.persistence.models.messenger.MessengerCredential;
import com.untis.mobile.api.dto.GetLessonTopicResponse;
import com.untis.mobile.api.dto.legacy.GetMessagesOfDayResponse;
import com.untis.mobile.api.dto.GetHomeWorkResponse;
import com.untis.mobile.api.dto.GetExamsResponse;
import java.io.IOException;
import com.untis.mobile.api.authtoken.GetAuthTokenResult;
import com.untis.mobile.api.dto.GetOfficeHoursResponse;
import com.untis.mobile.api.dto.GetColorsResponse;
import com.untis.mobile.api.dto.GetClassregDataResponse;
import com.untis.mobile.api.dto.GetAvailableRoomsResponse;
import com.untis.mobile.api.dto.EditAbsenceResponse;
import com.untis.mobile.api.dto.DeleteOfficeHourRegistrationResponse;
import com.untis.mobile.api.dto.DeleteAbsenceResponse;
import com.untis.mobile.api.dto.CreateImmediateLatenessResponse;
import com.untis.mobile.api.dto.CreateImmediateAbsenceResponse;
import com.untis.mobile.api.dto.CreateAbsencesResponse;
import com.untis.mobile.persistence.models.messenger.MessengerChannel;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import android.content.Intent;
import com.untis.mobile.ui.activities.profile.InvalidApiKeyActivity;
import timber.log.b;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import android.util.Log;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.UntisMobileApplication;
import rx.functions.p;
import com.untis.mobile.utils.time.a;
import com.untis.mobile.persistence.models.profile.ProfileState;
import com.untis.mobile.api.common.DynamicApiCallCreator;
import com.untis.mobile.api.error.JsonRpcErrorInvalidClientTime;
import com.untis.mobile.api.error.JsonRpcErrorUnspecified;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.error.JsonRpcError;
import com.untis.mobile.api.dto.RequestPasswordResetResponse;
import com.untis.mobile.persistence.models.officehour.OfficeHourRegistration;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.infocenter.InfoCenterContactHour;
import com.untis.mobile.api.enumeration.CreateAbsenceStrategy;
import com.untis.mobile.api.dto.GetAppInfoResponse;
import com.untis.mobile.api.schoolsearch.SchoolSearchSchool;
import java.util.List;
import com.untis.mobile.api.schoolsearch.SchoolSearchResponse;
import org.joda.time.t;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.c;
import com.untis.mobile.api.common.JsonRpcResponse;
import java.util.Set;
import com.untis.mobile.persistence.models.profile.Profile;
import retrofit2.u$b;
import okhttp3.c0;
import retrofit2.c$a;
import retrofit2.f$a;
import com.untis.mobile.utils.settings.g;
import android.content.Context;
import androidx.annotation.j0;

public class UmApiService implements ApiService
{
    private static final String VERSION = "a5.1.0";
    @j0
    private final Api api;
    @j0
    private Context context;
    private final g settings;
    
    public UmApiService(@j0 final Context context, @j0 final f$a f$a, @j0 final c$a c$a, @j0 final c0 c0, final g settings) {
        this.context = context;
        this.settings = settings;
        this.api = (Api)new u$b().c("http://www.untis.at").b(f$a).a(c$a).j(c0).f().g((Class)Api.class);
    }
    
    @j0
    private <Result> Result findErrorOrReturnResponse(@j0 final JsonRpcResponse<Result> jsonRpcResponse) throws RuntimeException {
        final com.untis.mobile.api.common.JsonRpcError error = jsonRpcResponse.error;
        if (error != null) {
            switch (UmApiService$1.$SwitchMap$com$untis$mobile$api$common$JsonRpcErrorType[error.getJsonRpcErrorType().ordinal()]) {
                default: {
                    if (!"no right".equalsIgnoreCase(jsonRpcResponse.error.message) && !"IDS_ERR_NO_RIGHT".equalsIgnoreCase(jsonRpcResponse.error.message)) {
                        throw new RuntimeException(String.valueOf(jsonRpcResponse.error.code), new JsonRpcError(jsonRpcResponse.error.getJsonRpcErrorType()));
                    }
                    final JsonRpcErrorType noRight = JsonRpcErrorType.NoRight;
                    throw new RuntimeException(String.valueOf(noRight.getCode()), new JsonRpcError(noRight));
                }
                case 1: {
                    if (jsonRpcResponse.error.data == null) {
                        final com.untis.mobile.api.common.JsonRpcError error2 = jsonRpcResponse.error;
                        throw new RuntimeException("invalid error", new JsonRpcErrorUnspecified(error2.code, error2.message));
                    }
                    throw new RuntimeException("invalid client time", new JsonRpcErrorInvalidClientTime(jsonRpcResponse.error.data.serverTime));
                }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16: {
                    throw new RuntimeException(String.valueOf(jsonRpcResponse.error.code), new JsonRpcError(jsonRpcResponse.error.getJsonRpcErrorType()));
                }
            }
        }
        else {
            final Result result = jsonRpcResponse.result;
            if (result != null) {
                return result;
            }
            throw new RuntimeException("no result", new JsonRpcError(JsonRpcErrorType.NoResult));
        }
    }
    
    @j0
    private String getSchool(@j0 final Profile profile) {
        return profile.getSchoolLogin();
    }
    
    @j0
    private String getUrl(@j0 final Profile profile) {
        final String serverUrl = profile.getServerUrl();
        final int lastIndex = serverUrl.lastIndexOf("?");
        String substring = serverUrl;
        if (lastIndex >= 0) {
            substring = serverUrl.substring(0, lastIndex);
        }
        return substring;
    }
    
    @j0
    private <T> rx.g<T> handle(@j0 final DynamicApiCallCreator<T> dynamicApiCallCreator) {
        return this.handle(dynamicApiCallCreator, true);
    }
    
    @j0
    private <T> rx.g<T> handle(@j0 final DynamicApiCallCreator<T> dynamicApiCallCreator, final boolean b) throws RuntimeException {
        final Profile profile = dynamicApiCallCreator.getProfile();
        if (profile.getId() > 0L) {
            if (profile.hasAnyState(ProfileState.ServerDownForMaintenance) && b && dynamicApiCallCreator.getProfile().getServerDownTimestamp() + 300000L > a.d()) {
                return (rx.g<T>)rx.g.b2((Throwable)new RuntimeException(new JsonRpcError(JsonRpcErrorType.AccessDeniedServerMaintenance)));
            }
            if (profile.hasAnyState(ProfileState.InvalidApiSharedSecret) && b) {
                return (rx.g<T>)rx.g.b2((Throwable)new RuntimeException(new JsonRpcError(JsonRpcErrorType.ApiKeyChangedAndWorkingOffline)));
            }
        }
        return (rx.g<T>)dynamicApiCallCreator.call().E5(rx.schedulers.c.e()).k3((p)new n0(this)).k3((p)new q0(dynamicApiCallCreator, b)).d4((p)new p0(this, dynamicApiCallCreator, b)).Q3(rx.android.schedulers.a.c());
    }
    
    private boolean isRunningInForeground() {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        return b != null && b.j();
    }
    
    @j0
    @Override
    public rx.g<MessengerChannel> connectMessengerChannel(@j0 final Profile profile, final long n, @j0 final String s) {
        return (rx.g<MessengerChannel>)this.handle((DynamicApiCallCreator<Object>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new k(this, n, s))).k3((p)x0.G);
    }
    
    @j0
    @Override
    public rx.g<CreateAbsencesResponse> createAbsence(@j0 final Profile profile, @j0 final CreateAbsenceStrategy createAbsenceStrategy, final long n, @j0 final List<Long> list, @j0 final c c, @j0 final c c2, final long n2, @j0 final String s) {
        return this.handle((DynamicApiCallCreator<CreateAbsencesResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new com.untis.mobile.api.p(this, createAbsenceStrategy, n, list, c, c2, n2, s)));
    }
    
    @j0
    @Override
    public rx.g<CreateImmediateAbsenceResponse> createImmediateAbsence(@j0 final Profile profile, final long n, final long n2, @j0 final c c, @j0 final c c2) {
        return this.handle((DynamicApiCallCreator<CreateImmediateAbsenceResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new com.untis.mobile.api.g(this, n, n2, c, c2)));
    }
    
    @j0
    @Override
    public rx.g<CreateImmediateLatenessResponse> createImmediateLateness(@j0 final Profile profile, final long n, final long n2) {
        return this.handle((DynamicApiCallCreator<CreateImmediateLatenessResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new d(this, n, n2)));
    }
    
    @j0
    @Override
    public rx.g<MessengerChannel> createMessengerChannel(@j0 final Profile profile, final long n, @j0 final String s) {
        return (rx.g<MessengerChannel>)this.handle((DynamicApiCallCreator<Object>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new j(this, n, s))).k3((p)u0.G);
    }
    
    @j0
    @Override
    public rx.g<DeleteAbsenceResponse> deleteAbsence(@j0 final Profile profile, final long n) {
        return this.handle((DynamicApiCallCreator<DeleteAbsenceResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new k1(this, n)));
    }
    
    @j0
    @Override
    public rx.g<DeleteOfficeHourRegistrationResponse> deleteOfficeHourRegistration(@j0 final Profile profile, @j0 final InfoCenterContactHour infoCenterContactHour) {
        return this.handle((DynamicApiCallCreator<DeleteOfficeHourRegistrationResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new y(this, infoCenterContactHour)));
    }
    
    @j0
    @Override
    public rx.g<DeleteOfficeHourRegistrationResponse> deleteOfficeHourRegistration(@j0 final Profile profile, @j0 final OfficeHourRegistration officeHourRegistration) {
        return this.handle((DynamicApiCallCreator<DeleteOfficeHourRegistrationResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new a0(this, officeHourRegistration)));
    }
    
    @j0
    @Override
    public rx.g<EditAbsenceResponse> editAbsence(@j0 final Profile profile, @j0 final StudentAbsence studentAbsence, @j0 final CreateAbsenceStrategy createAbsenceStrategy) {
        return this.handle((DynamicApiCallCreator<EditAbsenceResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new com.untis.mobile.api.t(this, studentAbsence, createAbsenceStrategy)));
    }
    
    @j0
    @Override
    public rx.g<AppInfo> getAppInfo(@j0 final Profile profile) {
        return (rx.g<AppInfo>)this.handle((DynamicApiCallCreator<Object>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new h1(this))).k3((p)v0.G);
    }
    
    @j0
    @Override
    public rx.g<String> getAppSharedSecret(@j0 final Profile profile, @j0 final String s, final long n) {
        return this.handle((DynamicApiCallCreator<String>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new e0(this, s, n)), false);
    }
    
    @j0
    @Override
    public rx.g<String> getAuthenticationToken(@j0 final Profile profile) {
        try {
            if (profile.isAnonymousUser()) {
                Log.d("untis_log", "no authentication token for anonymous user");
                return (rx.g<String>)rx.g.U2((Object)"").Q3(rx.android.schedulers.a.c());
            }
            return (rx.g<String>)this.handle((DynamicApiCallCreator<Object>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new e1(this))).k3((p)s0.G).d4((p)g1.G);
        }
        catch (Exception cause) {
            return (rx.g<String>)rx.g.b2((Throwable)new RuntimeException(cause));
        }
    }
    
    @j0
    @Override
    public rx.g<GetAvailableRoomsResponse> getAvailableRooms(@j0 final Profile profile, @j0 final c c, @j0 final c c2) {
        return this.handle((DynamicApiCallCreator<GetAvailableRoomsResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new l0(this, c, c2)));
    }
    
    @j0
    @Override
    public rx.g<GetClassregDataResponse> getClassregData(@j0 final Profile profile, final long n, @j0 final t t, @j0 final t t2) {
        return this.handle((DynamicApiCallCreator<GetClassregDataResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new o(this, n, t, t2)));
    }
    
    @j0
    @Override
    public rx.g<GetColorsResponse> getColors(@j0 final Profile profile) {
        return this.handle((DynamicApiCallCreator<GetColorsResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new i0(this)));
    }
    
    @j0
    @Override
    public rx.g<GetOfficeHoursResponse> getContactHours(@j0 final Profile profile, final long n, @j0 final t t) {
        return this.handle((DynamicApiCallCreator<GetOfficeHoursResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new n(this, n, t)));
    }
    
    @Override
    public String getDirectAuthenticationToken(@j0 final Profile profile, final Boolean b) {
        final retrofit2.b<JsonRpcResponse<GetAuthTokenResult>> directAuthToken = this.api.getDirectAuthToken(profile.getWuUrl(), profile.getSchoolLogin(), "a5.1.0", "getAuthToken", profile.isAnonymousUser(), profile.isAnonymousUser(), profile.getSchoolServerUrl(), profile.getSchoolServerUrl(), JsonRpcRequestBuilder.createGetAuthenticationTokenRequest(profile));
        try {
            final JsonRpcResponse jsonRpcResponse = (JsonRpcResponse)directAuthToken.p().a();
            if (jsonRpcResponse == null) {
                return null;
            }
            final com.untis.mobile.api.common.JsonRpcError error = jsonRpcResponse.error;
            if (error != null) {
                if (error.getJsonRpcErrorType().equals(JsonRpcErrorType.InvalidClientTime) && b) {
                    profile.setSchoolServerDelta(error.data.serverTime - a.d());
                    com.untis.mobile.services.profile.legacy.j0.G.b(profile);
                    return this.getDirectAuthenticationToken(profile, Boolean.FALSE);
                }
                return null;
            }
            else {
                final GetAuthTokenResult getAuthTokenResult = (GetAuthTokenResult)jsonRpcResponse.result;
                if (getAuthTokenResult == null) {
                    return null;
                }
                return getAuthTokenResult.getToken();
            }
        }
        catch (IOException ex) {
            Log.e("untis_log", "error on authentication", (Throwable)ex);
            return null;
        }
    }
    
    @j0
    @Override
    public rx.g<GetExamsResponse> getExams(@j0 final Profile profile, @j0 final EntityType entityType, final long n, @j0 final t t, @j0 final t t2) {
        return this.handle((DynamicApiCallCreator<GetExamsResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new s(this, entityType, n, t, t2)));
    }
    
    @j0
    @Override
    public rx.g<GetHomeWorkResponse> getHomeWorks(@j0 final Profile profile, @j0 final EntityType entityType, final long n, @j0 final t t, @j0 final t t2) {
        return this.handle((DynamicApiCallCreator<GetHomeWorkResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new r(this, entityType, n, t, t2)));
    }
    
    @j0
    @Override
    public rx.g<GetMessagesOfDayResponse> getLegacyMessagesOfDay(@j0 final Profile profile, @j0 final c c) {
        return this.handle((DynamicApiCallCreator<GetMessagesOfDayResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new com.untis.mobile.api.c0(this, profile, c)));
    }
    
    @j0
    @Override
    public rx.g<GetLessonTopicResponse> getLessonTopic(@j0 final Profile profile, final long n) {
        return this.handle((DynamicApiCallCreator<GetLessonTopicResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new j1(this, n)));
    }
    
    @j0
    @Override
    public rx.g<com.untis.mobile.api.dto.GetMessagesOfDayResponse> getMessagesOfDay(@j0 final Profile profile, @j0 final c c) {
        return this.handle((DynamicApiCallCreator<com.untis.mobile.api.dto.GetMessagesOfDayResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new k0(this, c)));
    }
    
    @j0
    @Override
    public rx.g<MessengerCredential> getMessengerAuthenticationCredentials(@j0 final Profile profile) {
        return (rx.g<MessengerCredential>)this.handle((DynamicApiCallCreator<Object>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new x(this))).k3((p)w0.G);
    }
    
    @j0
    @Override
    public rx.g<MessengerChannelData> getMessengerChannelData(@j0 final Profile profile, final long n) {
        return (rx.g<MessengerChannelData>)this.handle((DynamicApiCallCreator<Object>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new com.untis.mobile.api.c(this, n))).k3((p)new r0(new com.untis.mobile.utils.mapper.realmToModel.t(profile.getMasterDataService())));
    }
    
    @j0
    @Override
    public rx.g<GetOfficeHourRegistrationsResponse> getOfficeHourRegistration(@j0 final Profile profile, final long n, final long n2) {
        return this.handle((DynamicApiCallCreator<GetOfficeHourRegistrationsResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new e(this, n, n2)));
    }
    
    @j0
    @Override
    public rx.g<GetPDayAppointmentsResponse> getPDayAppointments(@j0 final Profile profile) {
        return this.handle((DynamicApiCallCreator<GetPDayAppointmentsResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new t0(this)));
    }
    
    @j0
    @Override
    public rx.g<GetPeriodDataResponse> getPeriodData(@j0 final Profile profile, @j0 final List<Long> list) {
        return this.handle((DynamicApiCallCreator<GetPeriodDataResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new g0(this, list)));
    }
    
    @j0
    @Override
    public rx.g<GetRoomChangeDataResponse> getRoomChangeData(@j0 final Profile profile, @j0 final Set<Long> set) {
        return this.handle((DynamicApiCallCreator<GetRoomChangeDataResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new h0(this, set)));
    }
    
    @j0
    @Override
    public rx.g<GetStudentAbsencesResponse> getStudentAbsence(@j0 final Profile profile, @j0 final t t, @j0 final t t2) {
        return this.handle((DynamicApiCallCreator<GetStudentAbsencesResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new m0(this, t, t2)));
    }
    
    @j0
    @Override
    public rx.g<GetTimetableResponse> getTimeTable(@j0 final Profile profile, @j0 final EntityType entityType, final long n, @j0 final List<TimeTableModel> list) {
        return this.handle((DynamicApiCallCreator<GetTimetableResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new q(this, entityType, n, list, this.settings.h(g.a.j(), 0L))));
    }
    
    @j0
    @Override
    public rx.g<GetUserDataResponse> getUserData(@j0 final Profile profile) {
        return this.handle((DynamicApiCallCreator<GetUserDataResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new com.untis.mobile.api.b(this)), false);
    }
    
    @j0
    @Override
    public rx.g<GetUserMessagesResponse> getUserMessages(@j0 final Profile profile) {
        return this.handle((DynamicApiCallCreator<GetUserMessagesResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new i1(this)));
    }
    
    @j0
    @Override
    public rx.g<Integer> getVersion(@j0 final Profile profile) {
        return this.handle((DynamicApiCallCreator<Integer>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new m(this)));
    }
    
    @j0
    @Override
    public rx.g<List<SchoolSearchSchool>> searchSchool(final long n) {
        return (rx.g<List<SchoolSearchSchool>>)this.api.searchSchool("https://mobile.webuntis.com/ms/schoolquery2/", "a5.1.0", JsonRpcRequestBuilder.createSchoolSearchRequestWithId(n)).E5(rx.schedulers.c.e()).k3((p)new o0(this)).k3((p)a1.G).Q3(rx.android.schedulers.a.c());
    }
    
    @j0
    @Override
    public rx.g<List<SchoolSearchSchool>> searchSchool(@j0 final String s) {
        return (rx.g<List<SchoolSearchSchool>>)this.api.searchSchool("https://mobile.webuntis.com/ms/schoolquery2/", "a5.1.0", JsonRpcRequestBuilder.createSchoolSearchRequest(s)).E5(rx.schedulers.c.e()).k3((p)new o0(this)).k3((p)d1.G).Q3(rx.android.schedulers.a.c());
    }
    
    @j0
    public rx.g<List<SchoolSearchSchool>> searchSchool(@j0 final String s, final long n) {
        return (rx.g<List<SchoolSearchSchool>>)this.api.searchSchool(s, "a5.1.0", JsonRpcRequestBuilder.createSchoolSearchRequestWithId(n)).E5(rx.schedulers.c.e()).k3((p)new o0(this)).k3((p)z0.G).Q3(rx.android.schedulers.a.c());
    }
    
    @j0
    public rx.g<List<SchoolSearchSchool>> searchSchool(@j0 final String s, @j0 final String s2) {
        return (rx.g<List<SchoolSearchSchool>>)this.api.searchSchool(s, "a5.1.0", JsonRpcRequestBuilder.createSchoolSearchRequest(s2)).E5(rx.schedulers.c.e()).k3((p)new o0(this)).k3((p)c1.G).Q3(rx.android.schedulers.a.c());
    }
    
    @j0
    @Override
    public rx.g<SchoolSearchSchool> searchSchoolById(final long n) {
        return (rx.g<SchoolSearchSchool>)this.api.searchSchool("https://mobile.webuntis.com/ms/schoolquery2/", "a5.1.0", JsonRpcRequestBuilder.createSchoolSearchRequestWithId(n)).E5(rx.schedulers.c.e()).k3((p)new o0(this)).k3((p)f1.G);
    }
    
    @j0
    @Override
    public rx.g<SchoolSearchSchool> searchSchoolByLogin(@j0 final String s) {
        return (rx.g<SchoolSearchSchool>)this.api.searchSchool("https://mobile.webuntis.com/ms/schoolquery2/", "a5.1.0", JsonRpcRequestBuilder.createSchoolSearchRequestWithLogin(s)).E5(rx.schedulers.c.e()).k3((p)new o0(this)).k3((p)b1.G);
    }
    
    @j0
    @Override
    public rx.g<SubmitAbsencesCheckedResponse> submitAbsenceChecked(@j0 final Profile profile, @j0 final List<Long> list) {
        return this.handle((DynamicApiCallCreator<SubmitAbsencesCheckedResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new f0(this, list)));
    }
    
    @j0
    @Override
    public rx.g<SubmitAbsencesResponse> submitAbsences(@j0 final Profile profile, final long n, @j0 final List<StudentAbsence> list) {
        return this.handle((DynamicApiCallCreator<SubmitAbsencesResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new l(this, n, list)));
    }
    
    @j0
    @Override
    public rx.g<SubmitClassRegEventsResponse> submitEvents(@j0 final Profile profile, final long n, @j0 final Event event) {
        return this.handle((DynamicApiCallCreator<SubmitClassRegEventsResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new h(this, n, event)));
    }
    
    @j0
    @Override
    public rx.g<SubmitExcuseResponse> submitExcuse(@j0 final Profile profile, final long n, final long n2, @j0 final String s) {
        return this.handle((DynamicApiCallCreator<SubmitExcuseResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new f(this, n, n2, s)));
    }
    
    @j0
    @Override
    public rx.g<SubmitHomeWorkResponse> submitHomeWork(@j0 final Profile profile, @j0 final HomeWork homeWork) {
        return this.handle((DynamicApiCallCreator<SubmitHomeWorkResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new u(this, homeWork)));
    }
    
    @j0
    @Override
    public rx.g<SubmitLessonTopicResponse> submitLessonTopic(@j0 final Profile profile, @j0 final LessonTopic lessonTopic) {
        return this.handle((DynamicApiCallCreator<SubmitLessonTopicResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new w(this, lessonTopic)));
    }
    
    @j0
    @Override
    public rx.g<SubmitOfficeHourRegistrationResponse> submitOfficeHourRegistration(@j0 final Profile profile, @j0 final InfoCenterContactHour infoCenterContactHour, @j0 final c c, @j0 final c c2) {
        return this.handle((DynamicApiCallCreator<SubmitOfficeHourRegistrationResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new z(this, infoCenterContactHour, c, c2)));
    }
    
    @j0
    @Override
    public rx.g<SubmitOfficeHourRegistrationResponse> submitOfficeHourRegistration(@j0 final Profile profile, @j0 final OfficeHourRegistration officeHourRegistration) {
        return this.handle((DynamicApiCallCreator<SubmitOfficeHourRegistrationResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new b0(this, officeHourRegistration)));
    }
    
    @j0
    @Override
    public rx.g<SubmitOwnAbsenceResponse> submitOwnAbsence(@j0 final Profile profile, final long n, @j0 final Student student, @j0 final c c, @j0 final c c2, @j0 final String s, @androidx.annotation.k0 final AbsenceReason absenceReason) {
        return this.handle((DynamicApiCallCreator<SubmitOwnAbsenceResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new i(this, n, student, c, c2, s, absenceReason)));
    }
    
    @j0
    @Override
    public rx.g<SubmitPeriodInfoResponse> submitPeriodInfo(@j0 final Profile profile, @j0 final PeriodInfo periodInfo) {
        return this.handle((DynamicApiCallCreator<SubmitPeriodInfoResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new v(this, periodInfo)));
    }
    
    @j0
    @Override
    public rx.g<Boolean> submitResetPassword(@j0 final Profile profile, @j0 final String s) {
        return (rx.g<Boolean>)this.handle((DynamicApiCallCreator<Object>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new d0(this, s))).k3((p)y0.G);
    }
    
    @j0
    @Override
    public rx.g<SubmitRoomChangeResponse> submitRoomChange(@j0 final Profile profile, @j0 final Set<Long> set, final long n, final long n2) {
        return this.handle((DynamicApiCallCreator<SubmitRoomChangeResponse>)DynamicApiCallCreator.dynamicApiCall(this.context, profile, (DynamicApiCallCreator.DynamicApiCall<T>)new com.untis.mobile.api.j0(this, set, n, n2)));
    }
}
