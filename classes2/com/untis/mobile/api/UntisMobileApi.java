// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import com.untis.mobile.api.dto.SubmitRoomChangeResponse;
import com.untis.mobile.api.dto.SubmitRoomChangeRequest;
import com.untis.mobile.api.dto.SubmitPeriodInfoResponse;
import com.untis.mobile.api.dto.SubmitPeriodInfoRequest;
import com.untis.mobile.api.dto.SubmitOwnAbsenceResponse;
import com.untis.mobile.api.dto.SubmitOwnAbsenceRequest;
import com.untis.mobile.api.dto.SubmitOfficeHourRegistrationResponse;
import com.untis.mobile.api.dto.SubmitOfficeHourRegistrationRequest;
import com.untis.mobile.api.dto.legacy.SubmitLessonTopicResponse;
import com.untis.mobile.api.dto.legacy.SubmitLessonTopicRequest;
import com.untis.mobile.api.dto.legacy.SubmitHomeWorkResponse;
import com.untis.mobile.api.dto.legacy.SubmitHomeWorkRequest;
import com.untis.mobile.api.dto.SubmitExcuseResponse;
import com.untis.mobile.api.dto.SubmitExcuseRequest;
import com.untis.mobile.api.dto.legacy.SubmitClassRegEventsResponse;
import com.untis.mobile.api.dto.legacy.SubmitClassRegEventsRequest;
import com.untis.mobile.api.dto.SubmitAbsencesCheckedResponse;
import com.untis.mobile.api.dto.SubmitAbsencesCheckedRequest;
import com.untis.mobile.api.dto.legacy.SubmitAbsencesResponse;
import com.untis.mobile.api.dto.legacy.SubmitAbsencesRequest;
import com.untis.mobile.api.dto.RequestPasswordResetResponse;
import com.untis.mobile.api.dto.RequestPasswordResetRequest;
import com.untis.mobile.api.dto.LinkLessonChannelResponse;
import com.untis.mobile.api.dto.LinkLessonChannelRequest;
import com.untis.mobile.api.dto.IsPremiumAvailableResponse;
import com.untis.mobile.api.dto.IsPremiumAvailableRequest;
import com.untis.mobile.api.dto.GetUserMessagesResponse;
import com.untis.mobile.api.dto.GetUserMessagesRequest;
import com.untis.mobile.api.dto.GetUserDataResponse;
import com.untis.mobile.api.dto.GetUserDataRequest;
import com.untis.mobile.api.dto.GetTimetableResponse;
import com.untis.mobile.api.dto.GetTimetableRequest;
import com.untis.mobile.api.dto.GetStudentAbsencesResponse;
import com.untis.mobile.api.dto.GetStudentAbsencesRequest;
import com.untis.mobile.api.dto.GetRoomChangeDataResponse;
import com.untis.mobile.api.dto.GetRoomChangeDataRequest;
import com.untis.mobile.api.dto.GetPeriodDataResponse;
import com.untis.mobile.api.dto.GetPeriodDataRequest;
import com.untis.mobile.api.dto.parentsday.GetPDayAppointmentsResponse;
import com.untis.mobile.api.dto.parentsday.GetPDayAppointmentsRequest;
import com.untis.mobile.api.dto.GetOfficeHoursResponse;
import com.untis.mobile.api.dto.GetOfficeHoursRequest;
import com.untis.mobile.api.dto.GetOfficeHourRegistrationsResponse;
import com.untis.mobile.api.dto.GetOfficeHourRegistrationsRequest;
import com.untis.mobile.api.dto.GetMessengerCredentialsResponse;
import com.untis.mobile.api.dto.GetMessengerCredentialsRequest;
import com.untis.mobile.api.dto.legacy.GetMessagesOfDayResponse;
import com.untis.mobile.api.dto.legacy.GetMessagesOfDayRequest;
import com.untis.mobile.api.dto.GetLessonTopicResponse;
import com.untis.mobile.api.dto.GetLessonTopicRequest;
import com.untis.mobile.api.dto.GetLessonChannelDataResponse;
import com.untis.mobile.api.dto.GetLessonChannelDataRequest;
import com.untis.mobile.api.dto.GetHomeWorkResponse;
import com.untis.mobile.api.dto.GetHomeWorkRequest;
import com.untis.mobile.api.dto.GetExamsResponse;
import com.untis.mobile.api.dto.GetExamsRequest;
import com.untis.mobile.api.dto.GetDriveCredentialsResponse;
import com.untis.mobile.api.dto.GetDriveCredentialsRequest;
import com.untis.mobile.api.dto.GetColorsResponse;
import com.untis.mobile.api.dto.GetColorsRequest;
import com.untis.mobile.api.dto.GetClassregDataResponse;
import com.untis.mobile.api.dto.GetClassregDataRequest;
import com.untis.mobile.api.dto.GetAvailableRoomsResponse;
import com.untis.mobile.api.dto.GetAvailableRoomsRequest;
import com.untis.mobile.api.dto.GetAuthenticationTokenResponse;
import com.untis.mobile.api.dto.GetAuthenticationTokenRequest;
import com.untis.mobile.api.dto.legacy.GetAppSharedSecretRequest;
import com.untis.mobile.api.dto.GetAppInfoResponse;
import com.untis.mobile.api.dto.EditAbsenceResponse;
import com.untis.mobile.api.dto.EditAbsenceRequest;
import com.untis.mobile.api.dto.DeleteOfficeHourRegistrationResponse;
import com.untis.mobile.api.dto.DeleteOfficeHourRegistrationRequest;
import com.untis.mobile.api.dto.DeleteAbsenceResponse;
import com.untis.mobile.api.dto.DeleteAbsenceRequest;
import com.untis.mobile.api.dto.CreateLessonChannelResponse;
import com.untis.mobile.api.dto.CreateLessonChannelRequest;
import com.untis.mobile.api.dto.CreateImmediateLatenessResponse;
import com.untis.mobile.api.dto.CreateImmediateLatenessRequest;
import com.untis.mobile.api.dto.CreateImmediateAbsenceResponse;
import com.untis.mobile.api.dto.CreateImmediateAbsenceRequest;
import com.untis.mobile.api.dto.CreateAbsencesResponse;
import com.untis.mobile.api.dto.CreateAbsencesRequest;

public interface UntisMobileApi
{
    CreateAbsencesResponse createAbsences2017(final CreateAbsencesRequest p0);
    
    CreateImmediateAbsenceResponse createImmediateAbsence2017(final CreateImmediateAbsenceRequest p0);
    
    CreateImmediateLatenessResponse createImmediateLateness2017(final CreateImmediateLatenessRequest p0);
    
    CreateLessonChannelResponse createLessonChannel(final CreateLessonChannelRequest p0);
    
    DeleteAbsenceResponse deleteAbsence2017(final DeleteAbsenceRequest p0);
    
    DeleteOfficeHourRegistrationResponse deleteOfficeHourRegistration2017(final DeleteOfficeHourRegistrationRequest p0);
    
    EditAbsenceResponse editAbsence2017(final EditAbsenceRequest p0);
    
    @NoMobileAuthentication
    GetAppInfoResponse getAppInfo();
    
    @NoMobileAuthentication
    String getAppSharedSecret(final GetAppSharedSecretRequest p0);
    
    GetAuthenticationTokenResponse getAuthToken(final GetAuthenticationTokenRequest p0);
    
    GetAvailableRoomsResponse getAvailableRooms2017(final GetAvailableRoomsRequest p0);
    
    GetClassregDataResponse getClassregData2017(final GetClassregDataRequest p0);
    
    GetColorsResponse getColors2017(final GetColorsRequest p0);
    
    GetDriveCredentialsResponse getDriveCredentials2017(final GetDriveCredentialsRequest p0);
    
    GetExamsResponse getExams2017(final GetExamsRequest p0);
    
    GetHomeWorkResponse getHomeWork2017(final GetHomeWorkRequest p0);
    
    GetLessonChannelDataResponse getLessonChannelData(final GetLessonChannelDataRequest p0);
    
    GetLessonTopicResponse getLessonTopic2017(final GetLessonTopicRequest p0);
    
    @Deprecated
    GetMessagesOfDayResponse getMessagesOfDay(final GetMessagesOfDayRequest p0);
    
    com.untis.mobile.api.dto.GetMessagesOfDayResponse getMessagesOfDay2017(final com.untis.mobile.api.dto.GetMessagesOfDayRequest p0);
    
    GetMessengerCredentialsResponse getMessengerCredentials(final GetMessengerCredentialsRequest p0);
    
    GetOfficeHourRegistrationsResponse getOfficeHourRegistrations2017(final GetOfficeHourRegistrationsRequest p0);
    
    GetOfficeHoursResponse getOfficeHours2017(final GetOfficeHoursRequest p0);
    
    GetPDayAppointmentsResponse getPDayAppointments(final GetPDayAppointmentsRequest p0);
    
    GetPeriodDataResponse getPeriodData2017(final GetPeriodDataRequest p0);
    
    GetRoomChangeDataResponse getRoomChangeData2017(final GetRoomChangeDataRequest p0);
    
    GetStudentAbsencesResponse getStudentAbsences2017(final GetStudentAbsencesRequest p0);
    
    GetTimetableResponse getTimetable2017(final GetTimetableRequest p0);
    
    GetUserDataResponse getUserData2017(final GetUserDataRequest p0);
    
    GetUserMessagesResponse getUserMessages2017(final GetUserMessagesRequest p0);
    
    @NoMobileAuthentication
    @Deprecated
    int getVersion();
    
    IsPremiumAvailableResponse isPremiumAvailable(final IsPremiumAvailableRequest p0);
    
    LinkLessonChannelResponse linkLessonChannel(final LinkLessonChannelRequest p0);
    
    @NoMobileAuthentication
    RequestPasswordResetResponse requestPasswordReset(final RequestPasswordResetRequest p0);
    
    SubmitAbsencesResponse submitAbsences(final SubmitAbsencesRequest p0);
    
    SubmitAbsencesCheckedResponse submitAbsencesChecked2017(final SubmitAbsencesCheckedRequest p0);
    
    SubmitClassRegEventsResponse submitClassRegEvents(final SubmitClassRegEventsRequest p0);
    
    SubmitExcuseResponse submitExcuse2017(final SubmitExcuseRequest p0);
    
    SubmitHomeWorkResponse submitHomeWork(final SubmitHomeWorkRequest p0);
    
    SubmitLessonTopicResponse submitLessonTopic(final SubmitLessonTopicRequest p0);
    
    SubmitOfficeHourRegistrationResponse submitOfficeHourRegistration2017(final SubmitOfficeHourRegistrationRequest p0);
    
    SubmitOwnAbsenceResponse submitOwnAbsence2017(final SubmitOwnAbsenceRequest p0);
    
    SubmitPeriodInfoResponse submitPeriodInfo2017(final SubmitPeriodInfoRequest p0);
    
    SubmitRoomChangeResponse submitRoomChange2017(final SubmitRoomChangeRequest p0);
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ ElementType.METHOD })
    public @interface NoMobileAuthentication {
    }
}
