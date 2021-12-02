// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api;

import org.joda.time.base.g;
import org.joda.time.base.e;
import android.os.Build$VERSION;
import org.joda.time.n0;
import java.util.Iterator;
import com.untis.mobile.api.dto.EditAbsenceRequest;
import com.untis.mobile.api.dto.DeleteAbsenceRequest;
import com.untis.mobile.utils.r0;
import com.untis.mobile.api.common.UMAuthenticationToken;
import com.untis.mobile.api.dto.SubmitRoomChangeRequest;
import com.untis.mobile.api.dto.SubmitPeriodInfoRequest;
import com.untis.mobile.api.dto.SubmitOwnAbsenceRequest;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import com.untis.mobile.api.dto.SubmitOfficeHourRegistrationRequest;
import com.untis.mobile.api.dto.legacy.SubmitLessonTopicRequest;
import com.untis.mobile.api.dto.legacy.SubmitHomeWorkRequest;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.api.dto.SubmitExcuseRequest;
import com.untis.mobile.api.dto.legacy.JsonTypedElement;
import com.untis.mobile.api.dto.legacy.JsonClassRegEvent;
import com.untis.mobile.api.dto.legacy.SubmitClassRegEventsRequest;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.utils.mapper.api.legacy.b;
import com.untis.mobile.api.dto.legacy.SubmitAbsencesRequest;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.api.dto.SubmitAbsencesCheckedRequest;
import com.untis.mobile.api.schoolsearch.SchoolSearchRequest;
import com.untis.mobile.api.dto.RequestPasswordResetRequest;
import com.untis.mobile.api.dto.IsPremiumAvailableRequest;
import com.untis.mobile.api.dto.CreateImmediateLatenessRequest;
import com.untis.mobile.api.dto.CreateImmediateAbsenceRequest;
import com.untis.mobile.api.dto.GetUserMessagesRequest;
import com.untis.mobile.api.enumeration.DeviceOs;
import com.untis.mobile.api.dto.GetUserDataRequest;
import java.util.Comparator;
import java.util.Collections;
import com.untis.mobile.api.dto.GetTimetableRequest;
import com.untis.mobile.api.dto.GetStudentAbsencesRequest;
import com.untis.mobile.api.dto.GetRoomChangeDataRequest;
import java.util.Set;
import java.util.HashSet;
import com.untis.mobile.api.dto.GetPeriodDataRequest;
import com.untis.mobile.api.dto.parentsday.GetPDayAppointmentsRequest;
import com.untis.mobile.api.dto.GetOfficeHoursRequest;
import com.untis.mobile.api.dto.GetOfficeHourRegistrationsRequest;
import com.untis.mobile.api.dto.GetMessengerCredentialsRequest;
import com.untis.mobile.api.dto.GetLessonChannelDataRequest;
import com.untis.mobile.api.dto.GetLessonTopicRequest;
import com.untis.mobile.api.dto.legacy.GetMessagesOfDayRequest;
import com.untis.mobile.api.dto.GetHomeWorkRequest;
import com.untis.mobile.api.enumeration.ElementType;
import com.untis.mobile.api.dto.GetExamsRequest;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.api.dto.GetColorsRequest;
import com.untis.mobile.api.dto.GetClassregDataRequest;
import org.joda.time.t;
import com.untis.mobile.api.dto.GetAvailableRoomsRequest;
import com.untis.mobile.api.authtoken.GetAuthTokenParameter;
import com.untis.mobile.api.dto.legacy.GetAppSharedSecretRequest;
import com.untis.mobile.api.common.EmptyJsonRpcParameter;
import com.untis.mobile.persistence.models.officehour.OfficeHourRegistration;
import com.untis.mobile.api.dto.DeleteOfficeHourRegistrationRequest;
import com.untis.mobile.persistence.models.infocenter.InfoCenterContactHour;
import com.untis.mobile.api.dto.CreateLessonChannelRequest;
import com.untis.mobile.api.dto.LinkLessonChannelRequest;
import java.util.Collection;
import java.util.ArrayList;
import com.untis.mobile.api.dto.CreateAbsencesRequest;
import com.untis.mobile.api.common.JsonRpcRequest;
import org.joda.time.c;
import java.util.List;
import com.untis.mobile.api.enumeration.CreateAbsenceStrategy;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;

public class JsonRpcRequestBuilder
{
    @j0
    static JsonRpcRequest<CreateAbsencesRequest> createAbsencesRequest(@j0 final Profile profile, @j0 final CreateAbsenceStrategy strategy, final long periodId, @j0 final List<Long> list, @j0 final c c, @j0 final c c2, final long absenceReasonId, @j0 final String s) {
        final CreateAbsencesRequest createAbsencesRequest = new CreateAbsencesRequest();
        createAbsencesRequest.auth = createUmAuthenticationToken(profile);
        createAbsencesRequest.strategy = strategy;
        createAbsencesRequest.periodId = periodId;
        (createAbsencesRequest.studentIds = new ArrayList<Long>()).addAll(list);
        createAbsencesRequest.startDateTime = ((org.joda.time.base.a)c).g4("yyyy-MM-dd'T'HH:mm'Z'");
        createAbsencesRequest.endDateTime = ((org.joda.time.base.a)c2).g4("yyyy-MM-dd'T'HH:mm'Z'");
        createAbsencesRequest.absenceReasonId = absenceReasonId;
        createAbsencesRequest.text = s.trim();
        return new JsonRpcRequest<CreateAbsencesRequest>("createAbsences2017", createAbsencesRequest);
    }
    
    @j0
    static JsonRpcRequest<LinkLessonChannelRequest> createConnectMessengerChannelRequest(@j0 final Profile profile, final long lessonId, @j0 final String channelId) {
        final LinkLessonChannelRequest linkLessonChannelRequest = new LinkLessonChannelRequest();
        linkLessonChannelRequest.auth = createUmAuthenticationToken(profile);
        linkLessonChannelRequest.lessonId = lessonId;
        linkLessonChannelRequest.channelId = channelId;
        return new JsonRpcRequest<LinkLessonChannelRequest>("linkLessonChannel", linkLessonChannelRequest);
    }
    
    @j0
    static JsonRpcRequest<CreateLessonChannelRequest> createCreateMessengerChannelRequest(@j0 final Profile profile, final long lessonId, @j0 final String channelName) {
        final CreateLessonChannelRequest createLessonChannelRequest = new CreateLessonChannelRequest();
        createLessonChannelRequest.auth = createUmAuthenticationToken(profile);
        createLessonChannelRequest.lessonId = lessonId;
        createLessonChannelRequest.channelName = channelName;
        return new JsonRpcRequest<CreateLessonChannelRequest>("createLessonChannel", createLessonChannelRequest);
    }
    
    @j0
    static JsonRpcRequest<DeleteOfficeHourRegistrationRequest> createDeleteOfficeHourRegistrationRequest(@j0 final Profile profile, @j0 final InfoCenterContactHour infoCenterContactHour) {
        final DeleteOfficeHourRegistrationRequest deleteOfficeHourRegistrationRequest = new DeleteOfficeHourRegistrationRequest();
        deleteOfficeHourRegistrationRequest.auth = createUmAuthenticationToken(profile);
        deleteOfficeHourRegistrationRequest.periodId = infoCenterContactHour.getId();
        deleteOfficeHourRegistrationRequest.teacherId = infoCenterContactHour.getTeacherId();
        deleteOfficeHourRegistrationRequest.userText = infoCenterContactHour.getUserText();
        return new JsonRpcRequest<DeleteOfficeHourRegistrationRequest>("deleteOfficeHourRegistration2017", deleteOfficeHourRegistrationRequest);
    }
    
    @j0
    static JsonRpcRequest<DeleteOfficeHourRegistrationRequest> createDeleteOfficeHourRegistrationRequest(@j0 final Profile profile, @j0 final OfficeHourRegistration officeHourRegistration) {
        final DeleteOfficeHourRegistrationRequest deleteOfficeHourRegistrationRequest = new DeleteOfficeHourRegistrationRequest();
        deleteOfficeHourRegistrationRequest.auth = createUmAuthenticationToken(profile);
        deleteOfficeHourRegistrationRequest.periodId = officeHourRegistration.getOfficeHourId();
        deleteOfficeHourRegistrationRequest.teacherId = officeHourRegistration.getTeacher().getId();
        deleteOfficeHourRegistrationRequest.userText = officeHourRegistration.getUserText().trim();
        return new JsonRpcRequest<DeleteOfficeHourRegistrationRequest>("deleteOfficeHourRegistration2017", deleteOfficeHourRegistrationRequest);
    }
    
    @j0
    static JsonRpcRequest<EmptyJsonRpcParameter> createEmptyJsonRpcRequest(@j0 final String s) {
        return new JsonRpcRequest<EmptyJsonRpcParameter>(s);
    }
    
    @j0
    static JsonRpcRequest<GetAppSharedSecretRequest> createGetAppSharedSecretRequest(@j0 final String userName, @j0 final String password, final long l) {
        final GetAppSharedSecretRequest getAppSharedSecretRequest = new GetAppSharedSecretRequest();
        getAppSharedSecretRequest.userName = userName;
        getAppSharedSecretRequest.password = password;
        if (l != 0L) {
            getAppSharedSecretRequest.token = String.valueOf(l);
        }
        return new JsonRpcRequest<GetAppSharedSecretRequest>("getAppSharedSecret", getAppSharedSecretRequest);
    }
    
    @j0
    static JsonRpcRequest<GetAuthTokenParameter> createGetAuthenticationTokenRequest(@j0 final Profile profile) {
        final GetAuthTokenParameter getAuthTokenParameter = new GetAuthTokenParameter();
        getAuthTokenParameter.auth = createUmAuthenticationToken(profile);
        return new JsonRpcRequest<GetAuthTokenParameter>("getAuthToken", getAuthTokenParameter);
    }
    
    @j0
    static JsonRpcRequest<GetAvailableRoomsRequest> createGetAvailableRoomsRequest(@j0 final Profile profile, @j0 final c c, @j0 final c c2) {
        final GetAvailableRoomsRequest getAvailableRoomsRequest = new GetAvailableRoomsRequest();
        getAvailableRoomsRequest.auth = createUmAuthenticationToken(profile);
        getAvailableRoomsRequest.startDateTime = ((org.joda.time.base.a)c).g4("yyyy-MM-dd'T'HH:mm'Z'");
        getAvailableRoomsRequest.endDateTime = ((org.joda.time.base.a)c2).g4("yyyy-MM-dd'T'HH:mm'Z'");
        return new JsonRpcRequest<GetAvailableRoomsRequest>("getAvailableRooms2017", getAvailableRoomsRequest);
    }
    
    @j0
    static JsonRpcRequest<GetClassregDataRequest> createGetClassRegDataRequest(@j0 final Profile profile, final long klasseId, @j0 final t t, @j0 final t t2) {
        final GetClassregDataRequest getClassregDataRequest = new GetClassregDataRequest();
        getClassregDataRequest.auth = createUmAuthenticationToken(profile);
        getClassregDataRequest.klasseId = klasseId;
        getClassregDataRequest.startDate = t.g4("yyyy-MM-dd");
        getClassregDataRequest.endDate = t2.g4("yyyy-MM-dd");
        return new JsonRpcRequest<GetClassregDataRequest>("getClassregData2017", getClassregDataRequest);
    }
    
    @j0
    static JsonRpcRequest<GetColorsRequest> createGetColorsRequest(@j0 final Profile profile) {
        final GetColorsRequest getColorsRequest = new GetColorsRequest();
        getColorsRequest.auth = createUmAuthenticationToken(profile);
        return new JsonRpcRequest<GetColorsRequest>("getColors2017", getColorsRequest);
    }
    
    @j0
    public static JsonRpcRequest<GetExamsRequest> createGetExamsRequest(@j0 final Profile profile, @j0 final EntityType entityType, final long id, @j0 final t t, @j0 final t t2) {
        final GetExamsRequest getExamsRequest = new GetExamsRequest();
        getExamsRequest.auth = createUmAuthenticationToken(profile);
        getExamsRequest.type = ElementType.fromWebUntisType((byte)entityType.getWebuntisId());
        getExamsRequest.id = id;
        getExamsRequest.startDate = t.g4("yyyy-MM-dd");
        getExamsRequest.endDate = t2.g4("yyyy-MM-dd");
        return new JsonRpcRequest<GetExamsRequest>("getExams2017", getExamsRequest);
    }
    
    @j0
    public static JsonRpcRequest<GetHomeWorkRequest> createGetHomeWorkRequest(@j0 final Profile profile, @j0 final EntityType entityType, final long id, @j0 final t t, @j0 final t t2) {
        final GetHomeWorkRequest getHomeWorkRequest = new GetHomeWorkRequest();
        getHomeWorkRequest.auth = createUmAuthenticationToken(profile);
        getHomeWorkRequest.type = ElementType.fromWebUntisType((byte)entityType.getWebuntisId());
        getHomeWorkRequest.id = id;
        getHomeWorkRequest.startDate = t.g4("yyyy-MM-dd");
        getHomeWorkRequest.endDate = t2.g4("yyyy-MM-dd");
        return new JsonRpcRequest<GetHomeWorkRequest>("getHomeWork2017", getHomeWorkRequest);
    }
    
    @j0
    static JsonRpcRequest<GetMessagesOfDayRequest> createGetLegacyMesasgesOfDayRequest(@j0 final Profile profile, @j0 final c c) {
        final GetMessagesOfDayRequest getMessagesOfDayRequest = new GetMessagesOfDayRequest();
        getMessagesOfDayRequest.auth = createUmAuthenticationToken(profile);
        getMessagesOfDayRequest.date = ((org.joda.time.base.a)c).g4("yyyy-MM-dd");
        return new JsonRpcRequest<GetMessagesOfDayRequest>("getMessagesOfDay", getMessagesOfDayRequest);
    }
    
    @j0
    static JsonRpcRequest<GetLessonTopicRequest> createGetLessonTopicRequest(@j0 final Profile profile, final long periodId) {
        final GetLessonTopicRequest getLessonTopicRequest = new GetLessonTopicRequest();
        getLessonTopicRequest.auth = createUmAuthenticationToken(profile);
        getLessonTopicRequest.periodId = periodId;
        return new JsonRpcRequest<GetLessonTopicRequest>("getLessonTopic2017", getLessonTopicRequest);
    }
    
    @j0
    static JsonRpcRequest<com.untis.mobile.api.dto.GetMessagesOfDayRequest> createGetMessagesOfDayRequest(@j0 final Profile profile, @j0 final c c) {
        final com.untis.mobile.api.dto.GetMessagesOfDayRequest getMessagesOfDayRequest = new com.untis.mobile.api.dto.GetMessagesOfDayRequest();
        getMessagesOfDayRequest.auth = createUmAuthenticationToken(profile);
        getMessagesOfDayRequest.date = ((org.joda.time.base.a)c).g4("yyyy-MM-dd");
        return new JsonRpcRequest<com.untis.mobile.api.dto.GetMessagesOfDayRequest>("getMessagesOfDay2017", getMessagesOfDayRequest);
    }
    
    @j0
    static JsonRpcRequest<GetLessonChannelDataRequest> createGetMessengerChannelDataRequest(@j0 final Profile profile, final long lessonId) {
        final GetLessonChannelDataRequest getLessonChannelDataRequest = new GetLessonChannelDataRequest();
        getLessonChannelDataRequest.auth = createUmAuthenticationToken(profile);
        getLessonChannelDataRequest.lessonId = lessonId;
        return new JsonRpcRequest<GetLessonChannelDataRequest>("getLessonChannelData", getLessonChannelDataRequest);
    }
    
    @j0
    static JsonRpcRequest<GetMessengerCredentialsRequest> createGetMessengerCredentialsRequest(@j0 final Profile profile) {
        final GetMessengerCredentialsRequest getMessengerCredentialsRequest = new GetMessengerCredentialsRequest();
        getMessengerCredentialsRequest.auth = createUmAuthenticationToken(profile);
        return new JsonRpcRequest<GetMessengerCredentialsRequest>("getMessengerCredentials", getMessengerCredentialsRequest);
    }
    
    @j0
    static JsonRpcRequest<GetOfficeHourRegistrationsRequest> createGetOfficeHourRegistrationRequest(@j0 final Profile profile, final long periodId, final long teacherId) {
        final GetOfficeHourRegistrationsRequest getOfficeHourRegistrationsRequest = new GetOfficeHourRegistrationsRequest();
        getOfficeHourRegistrationsRequest.auth = createUmAuthenticationToken(profile);
        getOfficeHourRegistrationsRequest.periodId = periodId;
        getOfficeHourRegistrationsRequest.teacherId = teacherId;
        return new JsonRpcRequest<GetOfficeHourRegistrationsRequest>("getOfficeHourRegistrations2017", getOfficeHourRegistrationsRequest);
    }
    
    @j0
    static JsonRpcRequest<GetOfficeHoursRequest> createGetOfficeHoursRequest(@j0 final Profile profile, final long klasseId, @j0 final t t) {
        final GetOfficeHoursRequest getOfficeHoursRequest = new GetOfficeHoursRequest();
        getOfficeHoursRequest.auth = createUmAuthenticationToken(profile);
        getOfficeHoursRequest.klasseId = klasseId;
        getOfficeHoursRequest.startDate = t.g4("yyyy-MM-dd");
        return new JsonRpcRequest<GetOfficeHoursRequest>("getOfficeHours2017", getOfficeHoursRequest);
    }
    
    @j0
    static JsonRpcRequest<GetPDayAppointmentsRequest> createGetPDayAppointmentsRequest(@j0 final Profile profile) {
        final GetPDayAppointmentsRequest getPDayAppointmentsRequest = new GetPDayAppointmentsRequest();
        getPDayAppointmentsRequest.auth = createUmAuthenticationToken(profile);
        return new JsonRpcRequest<GetPDayAppointmentsRequest>("getPDayAppointments", getPDayAppointmentsRequest);
    }
    
    @j0
    static JsonRpcRequest<GetPeriodDataRequest> createGetPeriodDataRequest(@j0 final Profile profile, @j0 final List<Long> list) {
        final GetPeriodDataRequest getPeriodDataRequest = new GetPeriodDataRequest();
        getPeriodDataRequest.auth = createUmAuthenticationToken(profile);
        (getPeriodDataRequest.ttIds = new HashSet<Long>()).addAll(list);
        return new JsonRpcRequest<GetPeriodDataRequest>("getPeriodData2017", getPeriodDataRequest);
    }
    
    @j0
    static JsonRpcRequest<GetRoomChangeDataRequest> createGetRoomChangeDataRequest(@j0 final Profile profile, @j0 final Set<Long> periodIds) {
        final GetRoomChangeDataRequest getRoomChangeDataRequest = new GetRoomChangeDataRequest();
        getRoomChangeDataRequest.auth = createUmAuthenticationToken(profile);
        getRoomChangeDataRequest.periodIds = periodIds;
        return new JsonRpcRequest<GetRoomChangeDataRequest>("getRoomChangeData2017", getRoomChangeDataRequest);
    }
    
    @j0
    static JsonRpcRequest<GetStudentAbsencesRequest> createGetStudentAbsencesRequest(@j0 final Profile profile, @j0 final t t, @j0 final t t2) {
        final GetStudentAbsencesRequest getStudentAbsencesRequest = new GetStudentAbsencesRequest();
        getStudentAbsencesRequest.auth = createUmAuthenticationToken(profile);
        getStudentAbsencesRequest.includeUnExcused = true;
        getStudentAbsencesRequest.includeExcused = true;
        getStudentAbsencesRequest.startDate = t.g4("yyyy-MM-dd");
        getStudentAbsencesRequest.endDate = t2.g4("yyyy-MM-dd");
        return new JsonRpcRequest<GetStudentAbsencesRequest>("getStudentAbsences2017", getStudentAbsencesRequest);
    }
    
    @j0
    static JsonRpcRequest<GetTimetableRequest> createGetTimetableRequest(@j0 final Profile profile, @j0 final EntityType entityType, final long id, @j0 final List<TimeTableModel> list, final Long n) {
        final GetTimetableRequest getTimetableRequest = new GetTimetableRequest();
        Collections.sort((List<Object>)list, a.G);
        final t startDate = extractStartDate(list);
        final t endDate = extractEndDate(list);
        final long timeTableTimeStamp = extractTimeTableTimeStamp(list, n);
        final List<Long> timeTableTimeStamps = extractTimeTableTimeStamps(list, n);
        getTimetableRequest.auth = createUmAuthenticationToken(profile);
        getTimetableRequest.type = ElementType.fromWebUntisType((byte)entityType.getWebuntisId());
        getTimetableRequest.id = id;
        getTimetableRequest.startDate = startDate.g4("yyyy-MM-dd");
        getTimetableRequest.endDate = endDate.g4("yyyy-MM-dd");
        getTimetableRequest.timetableTimestamp = timeTableTimeStamp;
        getTimetableRequest.timetableTimestamps = timeTableTimeStamps;
        getTimetableRequest.masterDataTimestamp = profile.getMasterDataTimestamp();
        return new JsonRpcRequest<GetTimetableRequest>("getTimetable2017", getTimetableRequest);
    }
    
    @j0
    static JsonRpcRequest<GetUserDataRequest> createGetUserDataRequest(@j0 final Profile profile) {
        final GetUserDataRequest getUserDataRequest = new GetUserDataRequest();
        getUserDataRequest.auth = createUmAuthenticationToken(profile);
        getUserDataRequest.elementType = ElementType.fromWebUntisType((byte)profile.getEntityType().getWebuntisId());
        getUserDataRequest.elementId = profile.getEntityId();
        getUserDataRequest.deviceOs = DeviceOs.AND;
        getUserDataRequest.deviceOsVersion = getOsVersion();
        return new JsonRpcRequest<GetUserDataRequest>("getUserData2017", getUserDataRequest);
    }
    
    @j0
    static JsonRpcRequest<GetUserMessagesRequest> createGetUserMessagesRequest(@j0 final Profile profile) {
        final GetUserMessagesRequest getUserMessagesRequest = new GetUserMessagesRequest();
        getUserMessagesRequest.auth = createUmAuthenticationToken(profile);
        return new JsonRpcRequest<GetUserMessagesRequest>("getUserMessages2017", getUserMessagesRequest);
    }
    
    @j0
    static JsonRpcRequest<CreateImmediateAbsenceRequest> createImmediateAbsenceRequest(@j0 final Profile profile, final long periodId, final long studentId, @j0 final c c, @j0 final c c2) {
        final CreateImmediateAbsenceRequest createImmediateAbsenceRequest = new CreateImmediateAbsenceRequest();
        createImmediateAbsenceRequest.auth = createUmAuthenticationToken(profile);
        createImmediateAbsenceRequest.periodId = periodId;
        createImmediateAbsenceRequest.studentId = studentId;
        createImmediateAbsenceRequest.startTime = ((org.joda.time.base.a)c).g4("'T'HH:mm");
        createImmediateAbsenceRequest.endTime = ((org.joda.time.base.a)c2).g4("'T'HH:mm");
        return new JsonRpcRequest<CreateImmediateAbsenceRequest>("createImmediateAbsence2017", createImmediateAbsenceRequest);
    }
    
    @j0
    static JsonRpcRequest<CreateImmediateLatenessRequest> createImmediateLatenessRequest(@j0 final Profile profile, final long periodId, final long studentId) {
        final CreateImmediateLatenessRequest createImmediateLatenessRequest = new CreateImmediateLatenessRequest();
        createImmediateLatenessRequest.auth = createUmAuthenticationToken(profile);
        createImmediateLatenessRequest.periodId = periodId;
        createImmediateLatenessRequest.studentId = studentId;
        return new JsonRpcRequest<CreateImmediateLatenessRequest>("createImmediateLateness2017", createImmediateLatenessRequest);
    }
    
    @j0
    static JsonRpcRequest<IsPremiumAvailableRequest> createIsPremiumAvailableRequest(@j0 final Profile profile) {
        final IsPremiumAvailableRequest isPremiumAvailableRequest = new IsPremiumAvailableRequest();
        isPremiumAvailableRequest.auth = createUmAuthenticationToken(profile);
        return new JsonRpcRequest<IsPremiumAvailableRequest>("isPremiumAvailable", isPremiumAvailableRequest);
    }
    
    static JsonRpcRequest<RequestPasswordResetRequest> createRequestPasswordResetRequest(@j0 final String userName, @j0 final String email) {
        final RequestPasswordResetRequest requestPasswordResetRequest = new RequestPasswordResetRequest();
        requestPasswordResetRequest.userName = userName;
        requestPasswordResetRequest.email = email;
        return new JsonRpcRequest<RequestPasswordResetRequest>("requestPasswordReset", requestPasswordResetRequest);
    }
    
    @j0
    static JsonRpcRequest<SchoolSearchRequest> createSchoolSearchRequest(@j0 final String s) {
        return new JsonRpcRequest<SchoolSearchRequest>("searchSchool", new SchoolSearchRequest(s));
    }
    
    @j0
    static JsonRpcRequest<SchoolSearchRequest> createSchoolSearchRequestWithId(final long l) {
        return new JsonRpcRequest<SchoolSearchRequest>("searchSchool", new SchoolSearchRequest(null, l, null));
    }
    
    @j0
    static JsonRpcRequest<SchoolSearchRequest> createSchoolSearchRequestWithLogin(@j0 final String s) {
        return new JsonRpcRequest<SchoolSearchRequest>("searchSchool", new SchoolSearchRequest(null, null, s));
    }
    
    @j0
    static JsonRpcRequest<SubmitAbsencesCheckedRequest> createSubmitAbsenceCheckedRequest(@j0 final Profile profile, @j0 final List<Long> list) {
        final SubmitAbsencesCheckedRequest submitAbsencesCheckedRequest = new SubmitAbsencesCheckedRequest();
        submitAbsencesCheckedRequest.auth = createUmAuthenticationToken(profile);
        (submitAbsencesCheckedRequest.ttIds = new HashSet<Long>()).addAll(list);
        return new JsonRpcRequest<SubmitAbsencesCheckedRequest>("submitAbsencesChecked2017", submitAbsencesCheckedRequest);
    }
    
    @j0
    static JsonRpcRequest<SubmitAbsencesRequest> createSubmitAbsencesRequest(@j0 final Profile profile, final long periodId, @j0 final List<StudentAbsence> list) {
        final SubmitAbsencesRequest submitAbsencesRequest = new SubmitAbsencesRequest();
        submitAbsencesRequest.auth = createUmAuthenticationToken(profile);
        submitAbsencesRequest.periodId = periodId;
        submitAbsencesRequest.studentAbsenceCollection = b.m(profile.getTimeTableService().l(periodId), profile.getClassBookService().S(periodId)).j(list);
        return new JsonRpcRequest<SubmitAbsencesRequest>("submitAbsences", submitAbsencesRequest);
    }
    
    @j0
    static JsonRpcRequest<SubmitClassRegEventsRequest> createSubmitClassRegEventsRequest(@j0 final Profile profile, long id, @j0 final Event event) {
        final SubmitClassRegEventsRequest submitClassRegEventsRequest = new SubmitClassRegEventsRequest();
        submitClassRegEventsRequest.auth = createUmAuthenticationToken(profile);
        submitClassRegEventsRequest.ttId = id;
        final JsonClassRegEvent event2 = new JsonClassRegEvent();
        submitClassRegEventsRequest.event = event2;
        event2.id = event.getId();
        submitClassRegEventsRequest.event.element = new JsonTypedElement();
        submitClassRegEventsRequest.event.element.type = event.getEntityType().getWebuntisId();
        submitClassRegEventsRequest.event.element.id = event.getEntityId();
        submitClassRegEventsRequest.event.date = ((org.joda.time.base.a)event.getDateTime()).g4("yyyy-MM-dd");
        submitClassRegEventsRequest.event.startTime = ((org.joda.time.base.a)event.getDateTime()).g4("'T'HH:mm");
        submitClassRegEventsRequest.event.text = event.getText().trim();
        final JsonClassRegEvent event3 = submitClassRegEventsRequest.event;
        if (event.getEventReason() != null) {
            id = event.getEventReason().getId();
        }
        else {
            id = 0L;
        }
        event3.reasonId = id;
        return new JsonRpcRequest<SubmitClassRegEventsRequest>("submitClassRegEvents", submitClassRegEventsRequest);
    }
    
    @j0
    static JsonRpcRequest<SubmitExcuseRequest> createSubmitExcuseRequest(@j0 final Profile profile, final long absenceId, final long excuseStatusId, @j0 final String s) {
        final SubmitExcuseRequest submitExcuseRequest = new SubmitExcuseRequest();
        submitExcuseRequest.auth = createUmAuthenticationToken(profile);
        submitExcuseRequest.absenceId = absenceId;
        submitExcuseRequest.excuseStatusId = excuseStatusId;
        submitExcuseRequest.date = null;
        submitExcuseRequest.text = s.trim();
        return new JsonRpcRequest<SubmitExcuseRequest>("submitExcuse2017", submitExcuseRequest);
    }
    
    @j0
    static JsonRpcRequest<SubmitHomeWorkRequest> createSubmitHomeWorkRequest(@j0 final Profile profile, final long ttId, @j0 final HomeWork homeWork) {
        final SubmitHomeWorkRequest submitHomeWorkRequest = new SubmitHomeWorkRequest();
        submitHomeWorkRequest.auth = createUmAuthenticationToken(profile);
        submitHomeWorkRequest.ttId = ttId;
        submitHomeWorkRequest.homeWork = com.untis.mobile.utils.mapper.api.legacy.a.i().j(homeWork);
        return new JsonRpcRequest<SubmitHomeWorkRequest>("submitHomeWork", submitHomeWorkRequest);
    }
    
    @j0
    static JsonRpcRequest<SubmitLessonTopicRequest> createSubmitLessonTopicRequest(@j0 final Profile profile, final long ttId, @j0 final String s) {
        final SubmitLessonTopicRequest submitLessonTopicRequest = new SubmitLessonTopicRequest();
        submitLessonTopicRequest.auth = createUmAuthenticationToken(profile);
        submitLessonTopicRequest.ttId = ttId;
        submitLessonTopicRequest.lessonTopic = s.trim();
        return new JsonRpcRequest<SubmitLessonTopicRequest>("submitLessonTopic", submitLessonTopicRequest);
    }
    
    @j0
    static JsonRpcRequest<SubmitOfficeHourRegistrationRequest> createSubmitOfficeHourRegistrationRequest(@j0 final Profile profile, @j0 final InfoCenterContactHour infoCenterContactHour, @j0 final c c, @j0 final c c2) {
        final SubmitOfficeHourRegistrationRequest submitOfficeHourRegistrationRequest = new SubmitOfficeHourRegistrationRequest();
        submitOfficeHourRegistrationRequest.auth = createUmAuthenticationToken(profile);
        submitOfficeHourRegistrationRequest.periodId = infoCenterContactHour.getId();
        submitOfficeHourRegistrationRequest.teacherId = infoCenterContactHour.getTeacherId();
        submitOfficeHourRegistrationRequest.startDateTime = infoCenterContactHour.getStart().h1().K0(c.j1()).g4("yyyy-MM-dd'T'HH:mm'Z'");
        submitOfficeHourRegistrationRequest.endDateTime = infoCenterContactHour.getEnd().h1().K0(c2.j1()).g4("yyyy-MM-dd'T'HH:mm'Z'");
        submitOfficeHourRegistrationRequest.teacherText = infoCenterContactHour.getTeacherText();
        submitOfficeHourRegistrationRequest.userText = infoCenterContactHour.getUserText();
        return new JsonRpcRequest<SubmitOfficeHourRegistrationRequest>("submitOfficeHourRegistration2017", submitOfficeHourRegistrationRequest);
    }
    
    @j0
    public static JsonRpcRequest<SubmitOfficeHourRegistrationRequest> createSubmitOfficeHourRegistrationRequest(@j0 final Profile profile, @j0 final OfficeHourRegistration officeHourRegistration) {
        final SubmitOfficeHourRegistrationRequest submitOfficeHourRegistrationRequest = new SubmitOfficeHourRegistrationRequest();
        submitOfficeHourRegistrationRequest.auth = createUmAuthenticationToken(profile);
        submitOfficeHourRegistrationRequest.periodId = officeHourRegistration.getOfficeHourId();
        submitOfficeHourRegistrationRequest.teacherId = officeHourRegistration.getTeacher().getId();
        submitOfficeHourRegistrationRequest.startDateTime = ((org.joda.time.base.a)officeHourRegistration.getStart()).g4("yyyy-MM-dd'T'HH:mm'Z'");
        submitOfficeHourRegistrationRequest.endDateTime = ((org.joda.time.base.a)officeHourRegistration.getEnd()).g4("yyyy-MM-dd'T'HH:mm'Z'");
        submitOfficeHourRegistrationRequest.teacherText = "";
        submitOfficeHourRegistrationRequest.userText = officeHourRegistration.getUserText().trim();
        return new JsonRpcRequest<SubmitOfficeHourRegistrationRequest>("submitOfficeHourRegistration2017", submitOfficeHourRegistrationRequest);
    }
    
    @j0
    static JsonRpcRequest<SubmitOwnAbsenceRequest> createSubmitOwnAbsenceRequest(@j0 final Profile profile, final long absenceId, final long studentId, @j0 final c c, @j0 final c c2, @j0 final String s, @k0 final AbsenceReason absenceReason) {
        final SubmitOwnAbsenceRequest submitOwnAbsenceRequest = new SubmitOwnAbsenceRequest();
        submitOwnAbsenceRequest.auth = createUmAuthenticationToken(profile);
        submitOwnAbsenceRequest.absenceId = absenceId;
        submitOwnAbsenceRequest.studentId = studentId;
        submitOwnAbsenceRequest.startDateTime = ((org.joda.time.base.a)c).g4("yyyy-MM-dd'T'HH:mm'Z'");
        submitOwnAbsenceRequest.endDateTime = ((org.joda.time.base.a)c2).g4("yyyy-MM-dd'T'HH:mm'Z'");
        submitOwnAbsenceRequest.text = s.trim();
        if (absenceReason != null) {
            submitOwnAbsenceRequest.absenceReasonId = absenceReason.getId();
        }
        return new JsonRpcRequest<SubmitOwnAbsenceRequest>("submitOwnAbsence2017", submitOwnAbsenceRequest);
    }
    
    @j0
    static JsonRpcRequest<SubmitPeriodInfoRequest> createSubmitPeriodInfoRequest(@j0 final Profile profile, final long periodId, @j0 final String s) {
        final SubmitPeriodInfoRequest submitPeriodInfoRequest = new SubmitPeriodInfoRequest();
        submitPeriodInfoRequest.auth = createUmAuthenticationToken(profile);
        submitPeriodInfoRequest.periodId = periodId;
        submitPeriodInfoRequest.periodInfo = s.trim();
        return new JsonRpcRequest<SubmitPeriodInfoRequest>("submitPeriodInfo2017", submitPeriodInfoRequest);
    }
    
    @j0
    static JsonRpcRequest<SubmitRoomChangeRequest> createSubmitRoomChangeRequest(@j0 final Profile profile, @j0 final Set<Long> periodIds, final long orgRoomId, final long roomId) {
        final SubmitRoomChangeRequest submitRoomChangeRequest = new SubmitRoomChangeRequest();
        submitRoomChangeRequest.auth = createUmAuthenticationToken(profile);
        submitRoomChangeRequest.periodIds = periodIds;
        submitRoomChangeRequest.orgRoomId = orgRoomId;
        submitRoomChangeRequest.roomId = roomId;
        return new JsonRpcRequest<SubmitRoomChangeRequest>("submitRoomChange2017", submitRoomChangeRequest);
    }
    
    @j0
    private static UMAuthenticationToken createUmAuthenticationToken(@j0 final Profile profile) {
        final UMAuthenticationToken umAuthenticationToken = new UMAuthenticationToken();
        umAuthenticationToken.user = profile.getUserLogin();
        final long clientTime = com.untis.mobile.utils.time.a.d() + profile.getSchoolServerDelta();
        umAuthenticationToken.clientTime = clientTime;
        umAuthenticationToken.otp = r0.a(clientTime, profile.getUserAppSharedSecret());
        return umAuthenticationToken;
    }
    
    @j0
    static JsonRpcRequest<DeleteAbsenceRequest> deleteAbsenceResponse(@j0 final Profile profile, final long absenceId) {
        final DeleteAbsenceRequest deleteAbsenceRequest = new DeleteAbsenceRequest();
        deleteAbsenceRequest.auth = createUmAuthenticationToken(profile);
        deleteAbsenceRequest.absenceId = absenceId;
        return new JsonRpcRequest<DeleteAbsenceRequest>("deleteAbsence2017", deleteAbsenceRequest);
    }
    
    @j0
    static JsonRpcRequest<EditAbsenceRequest> editAbsenceRequest(@j0 final Profile profile, @j0 final StudentAbsence studentAbsence, @j0 final CreateAbsenceStrategy strategy) {
        final EditAbsenceRequest editAbsenceRequest = new EditAbsenceRequest();
        editAbsenceRequest.auth = createUmAuthenticationToken(profile);
        editAbsenceRequest.strategy = strategy;
        editAbsenceRequest.absenceId = studentAbsence.getId();
        editAbsenceRequest.periodId = studentAbsence.getPeriodId();
        editAbsenceRequest.startDateTime = ((org.joda.time.base.a)studentAbsence.getStart()).g4("yyyy-MM-dd'T'HH:mm'Z'");
        editAbsenceRequest.endDateTime = ((org.joda.time.base.a)studentAbsence.getEnd()).g4("yyyy-MM-dd'T'HH:mm'Z'");
        long id;
        if (studentAbsence.getAbsenceReason() != null) {
            id = studentAbsence.getAbsenceReason().getId();
        }
        else {
            id = 0L;
        }
        editAbsenceRequest.absenceReasonId = id;
        editAbsenceRequest.text = studentAbsence.getText().trim();
        return new JsonRpcRequest<EditAbsenceRequest>("editAbsence2017", editAbsenceRequest);
    }
    
    @j0
    private static t extractEndDate(@j0 final List<TimeTableModel> list) {
        final Iterator<TimeTableModel> iterator = list.iterator();
        n0 n0 = null;
        while (iterator.hasNext()) {
            final t date = iterator.next().getDate();
            if (n0 == null || ((e)date).m(n0)) {
                n0 = (n0)date;
            }
        }
        if (n0 == null) {
            return com.untis.mobile.utils.time.a.b();
        }
        return (t)n0;
    }
    
    @j0
    private static t extractStartDate(@j0 final List<TimeTableModel> list) {
        final Iterator<TimeTableModel> iterator = list.iterator();
        n0 n0 = null;
        while (iterator.hasNext()) {
            final t date = iterator.next().getDate();
            if (n0 == null || ((e)date).o(n0)) {
                n0 = (n0)date;
            }
        }
        if (n0 == null) {
            return com.untis.mobile.utils.time.a.b();
        }
        return (t)n0;
    }
    
    private static long extractTimeTableTimeStamp(@j0 final List<TimeTableModel> list, final Long n) {
        if (list.isEmpty()) {
            return 0L;
        }
        long n2 = Long.MAX_VALUE;
        final Iterator<TimeTableModel> iterator = list.iterator();
        while (iterator.hasNext()) {
            final long timestamp = iterator.next().getTimestamp();
            if (timestamp < n2) {
                n2 = timestamp;
            }
        }
        if (n2 <= 0L) {
            return 0L;
        }
        if (n2 <= ((g)c.G0().z0(n.intValue())).n()) {
            return 0L;
        }
        return n2;
    }
    
    @j0
    private static List<Long> extractTimeTableTimeStamps(@j0 final List<TimeTableModel> list, final Long n) {
        final ArrayList<Long> list2 = new ArrayList<Long>();
        final long n2 = ((g)c.G0().z0(n.intValue())).n();
        for (final TimeTableModel timeTableModel : list) {
            final long timestamp = timeTableModel.getTimestamp();
            Long n3;
            if (timestamp > 0L && timestamp > n2) {
                n3 = timeTableModel.getTimestamp();
            }
            else {
                n3 = 0L;
            }
            list2.add(n3);
        }
        return list2;
    }
    
    @j0
    private static String getOsVersion() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        StringBuilder sb;
        if (sdk_INT >= 23 && !Build$VERSION.BASE_OS.isEmpty()) {
            sb = new StringBuilder();
            sb.append(Build$VERSION.BASE_OS);
            sb.append(" - ");
        }
        else {
            sb = new StringBuilder();
            sb.append("Android");
        }
        sb.append(Build$VERSION.RELEASE);
        sb.append(" API ");
        sb.append(sdk_INT);
        sb.append(" - ");
        sb.append(Build$VERSION.INCREMENTAL);
        return sb.toString();
    }
}
