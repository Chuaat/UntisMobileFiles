// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api;

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
import com.untis.mobile.api.schoolsearch.SchoolSearchResponse;
import com.untis.mobile.api.schoolsearch.SchoolSearchRequest;
import com.untis.mobile.api.dto.RequestPasswordResetResponse;
import com.untis.mobile.api.dto.RequestPasswordResetRequest;
import com.untis.mobile.api.dto.LinkLessonChannelResponse;
import com.untis.mobile.api.dto.LinkLessonChannelRequest;
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
import com.untis.mobile.api.dto.GetLessonChannelDataResponse;
import com.untis.mobile.api.dto.GetLessonChannelDataRequest;
import com.untis.mobile.api.dto.GetMessengerCredentialsResponse;
import com.untis.mobile.api.dto.GetMessengerCredentialsRequest;
import com.untis.mobile.api.dto.GetLessonTopicResponse;
import com.untis.mobile.api.dto.GetLessonTopicRequest;
import com.untis.mobile.api.dto.legacy.GetMessagesOfDayResponse;
import com.untis.mobile.api.dto.legacy.GetMessagesOfDayRequest;
import com.untis.mobile.api.dto.GetHomeWorkResponse;
import com.untis.mobile.api.dto.GetHomeWorkRequest;
import com.untis.mobile.api.dto.GetExamsResponse;
import com.untis.mobile.api.dto.GetExamsRequest;
import retrofit2.b;
import com.untis.mobile.api.dto.GetColorsResponse;
import com.untis.mobile.api.dto.GetColorsRequest;
import com.untis.mobile.api.dto.GetClassregDataResponse;
import com.untis.mobile.api.dto.GetClassregDataRequest;
import com.untis.mobile.api.dto.GetAvailableRoomsResponse;
import com.untis.mobile.api.dto.GetAvailableRoomsRequest;
import com.untis.mobile.api.authtoken.GetAuthTokenResult;
import com.untis.mobile.api.authtoken.GetAuthTokenParameter;
import com.untis.mobile.api.dto.legacy.GetAppSharedSecretRequest;
import com.untis.mobile.api.dto.GetAppInfoResponse;
import com.untis.mobile.api.common.EmptyJsonRpcParameter;
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
import p7.o;
import com.untis.mobile.api.dto.CreateAbsencesResponse;
import com.untis.mobile.api.common.JsonRpcResponse;
import rx.g;
import p7.a;
import com.untis.mobile.api.dto.CreateAbsencesRequest;
import com.untis.mobile.api.common.JsonRpcRequest;
import p7.i;
import p7.t;
import p7.y;

interface Api
{
    @o
    g<JsonRpcResponse<CreateAbsencesResponse>> createAbsences(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<CreateAbsencesRequest> p8);
    
    @o
    g<JsonRpcResponse<CreateImmediateAbsenceResponse>> createImmediateAbsence(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<CreateImmediateAbsenceRequest> p8);
    
    @o
    g<JsonRpcResponse<CreateImmediateLatenessResponse>> createImmediateLateness(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<CreateImmediateLatenessRequest> p8);
    
    @o
    g<JsonRpcResponse<CreateLessonChannelResponse>> createMessengerChannel(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<CreateLessonChannelRequest> p8);
    
    @o
    g<JsonRpcResponse<DeleteAbsenceResponse>> deleteAbsence(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<DeleteAbsenceRequest> p8);
    
    @o
    g<JsonRpcResponse<DeleteOfficeHourRegistrationResponse>> deleteOfficeHourRegistration(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<DeleteOfficeHourRegistrationRequest> p8);
    
    @o
    g<JsonRpcResponse<EditAbsenceResponse>> editAbsence(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<EditAbsenceRequest> p8);
    
    @o
    g<JsonRpcResponse<GetAppInfoResponse>> getAppInfo(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<EmptyJsonRpcParameter> p8);
    
    @o
    g<JsonRpcResponse<String>> getAppSharedSecret(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetAppSharedSecretRequest> p8);
    
    @o
    g<JsonRpcResponse<GetAuthTokenResult>> getAuthToken(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetAuthTokenParameter> p8);
    
    @o
    g<JsonRpcResponse<GetAvailableRoomsResponse>> getAvailableRooms(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetAvailableRoomsRequest> p8);
    
    @o
    g<JsonRpcResponse<GetClassregDataResponse>> getClassregData2017(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetClassregDataRequest> p8);
    
    @o
    g<JsonRpcResponse<GetColorsResponse>> getColors(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetColorsRequest> p8);
    
    @o
    b<JsonRpcResponse<GetAuthTokenResult>> getDirectAuthToken(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetAuthTokenParameter> p8);
    
    @o
    g<JsonRpcResponse<GetExamsResponse>> getExams(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetExamsRequest> p8);
    
    @o
    g<JsonRpcResponse<GetHomeWorkResponse>> getHomeWorks(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetHomeWorkRequest> p8);
    
    @o
    g<JsonRpcResponse<GetMessagesOfDayResponse>> getLegacyMessagesOfDay(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetMessagesOfDayRequest> p8);
    
    @o
    g<JsonRpcResponse<GetLessonTopicResponse>> getLessonTopic(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetLessonTopicRequest> p8);
    
    @o
    g<JsonRpcResponse<com.untis.mobile.api.dto.GetMessagesOfDayResponse>> getMessagesOfDay(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<com.untis.mobile.api.dto.GetMessagesOfDayRequest> p8);
    
    @o
    g<JsonRpcResponse<GetMessengerCredentialsResponse>> getMessengerCredentials(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetMessengerCredentialsRequest> p8);
    
    @o
    g<JsonRpcResponse<GetLessonChannelDataResponse>> getMessengerData(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetLessonChannelDataRequest> p8);
    
    @o
    g<JsonRpcResponse<GetOfficeHourRegistrationsResponse>> getOfficeHourRegistration(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetOfficeHourRegistrationsRequest> p8);
    
    @o
    g<JsonRpcResponse<GetOfficeHoursResponse>> getOfficeHours(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetOfficeHoursRequest> p8);
    
    @o
    g<JsonRpcResponse<GetPDayAppointmentsResponse>> getPDayAppointments(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetPDayAppointmentsRequest> p8);
    
    @o
    g<JsonRpcResponse<GetPeriodDataResponse>> getPeriodData(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetPeriodDataRequest> p8);
    
    @o
    g<JsonRpcResponse<GetRoomChangeDataResponse>> getRoomChangeData(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetRoomChangeDataRequest> p8);
    
    @o
    g<JsonRpcResponse<GetStudentAbsencesResponse>> getStudentAbsences(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetStudentAbsencesRequest> p8);
    
    @o
    g<JsonRpcResponse<GetTimetableResponse>> getTimeTable(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetTimetableRequest> p8);
    
    @o
    g<JsonRpcResponse<GetUserDataResponse>> getUserData(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetUserDataRequest> p8);
    
    @o
    g<JsonRpcResponse<GetUserMessagesResponse>> getUserMessages(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<GetUserMessagesRequest> p8);
    
    @o
    g<JsonRpcResponse<Integer>> getVersion(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<EmptyJsonRpcParameter> p8);
    
    @o
    g<JsonRpcResponse<LinkLessonChannelResponse>> linkMessengerChannel(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<LinkLessonChannelRequest> p8);
    
    @o
    g<JsonRpcResponse<RequestPasswordResetResponse>> requestPasswordReset(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<RequestPasswordResetRequest> p8);
    
    @o
    g<JsonRpcResponse<SchoolSearchResponse>> searchSchool(@y final String p0, @t(encoded = true, value = "v") final String p1, @a final JsonRpcRequest<SchoolSearchRequest> p2);
    
    @o
    g<JsonRpcResponse<SubmitAbsencesResponse>> submitAbsences(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<SubmitAbsencesRequest> p8);
    
    @o
    g<JsonRpcResponse<SubmitAbsencesCheckedResponse>> submitAbsencesChecked(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<SubmitAbsencesCheckedRequest> p8);
    
    @o
    g<JsonRpcResponse<SubmitClassRegEventsResponse>> submitClassRegEvents(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<SubmitClassRegEventsRequest> p8);
    
    @o
    g<JsonRpcResponse<SubmitExcuseResponse>> submitExcuse(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<SubmitExcuseRequest> p8);
    
    @o
    g<JsonRpcResponse<SubmitHomeWorkResponse>> submitHomeWork(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<SubmitHomeWorkRequest> p8);
    
    @o
    g<JsonRpcResponse<SubmitLessonTopicResponse>> submitLessonTopic(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<SubmitLessonTopicRequest> p8);
    
    @o
    g<JsonRpcResponse<SubmitOfficeHourRegistrationResponse>> submitOfficeHourRegistration(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<SubmitOfficeHourRegistrationRequest> p8);
    
    @o
    g<JsonRpcResponse<SubmitOwnAbsenceResponse>> submitOwnAbsence(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<SubmitOwnAbsenceRequest> p8);
    
    @o
    g<JsonRpcResponse<SubmitPeriodInfoResponse>> submitPeriodInfo(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<SubmitPeriodInfoRequest> p8);
    
    @o
    g<JsonRpcResponse<SubmitRoomChangeResponse>> submitRoomChange(@y final String p0, @t(encoded = true, value = "school") final String p1, @t(encoded = true, value = "v") final String p2, @t(encoded = true, value = "m") final String p3, @t(encoded = true, value = "anonymous") final boolean p4, @i("anonymous") final boolean p5, @t(encoded = true, value = "server") final String p6, @i("server") final String p7, @a final JsonRpcRequest<SubmitRoomChangeRequest> p8);
}
