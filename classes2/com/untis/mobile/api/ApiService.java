// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api;

import com.untis.mobile.api.dto.SubmitRoomChangeResponse;
import com.untis.mobile.api.dto.SubmitPeriodInfoResponse;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import com.untis.mobile.api.dto.SubmitOwnAbsenceResponse;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.api.dto.SubmitOfficeHourRegistrationResponse;
import com.untis.mobile.api.dto.legacy.SubmitLessonTopicResponse;
import com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic;
import com.untis.mobile.api.dto.legacy.SubmitHomeWorkResponse;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.api.dto.SubmitExcuseResponse;
import com.untis.mobile.api.dto.legacy.SubmitClassRegEventsResponse;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.api.dto.legacy.SubmitAbsencesResponse;
import com.untis.mobile.api.dto.SubmitAbsencesCheckedResponse;
import com.untis.mobile.api.schoolsearch.SchoolSearchSchool;
import com.untis.mobile.api.dto.GetUserMessagesResponse;
import com.untis.mobile.api.dto.GetUserDataResponse;
import com.untis.mobile.api.dto.GetTimetableResponse;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import com.untis.mobile.api.dto.GetStudentAbsencesResponse;
import com.untis.mobile.api.dto.GetRoomChangeDataResponse;
import java.util.Set;
import com.untis.mobile.api.dto.GetPeriodDataResponse;
import com.untis.mobile.api.dto.parentsday.GetPDayAppointmentsResponse;
import com.untis.mobile.api.dto.GetOfficeHourRegistrationsResponse;
import com.untis.mobile.persistence.models.messenger.MessengerChannelData;
import com.untis.mobile.persistence.models.messenger.MessengerCredential;
import com.untis.mobile.api.dto.GetLessonTopicResponse;
import com.untis.mobile.api.dto.legacy.GetMessagesOfDayResponse;
import com.untis.mobile.api.dto.GetHomeWorkResponse;
import com.untis.mobile.api.dto.GetExamsResponse;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.api.dto.GetOfficeHoursResponse;
import com.untis.mobile.api.dto.GetColorsResponse;
import com.untis.mobile.api.dto.GetClassregDataResponse;
import org.joda.time.t;
import com.untis.mobile.api.dto.GetAvailableRoomsResponse;
import com.untis.mobile.api.dto.EditAbsenceResponse;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.persistence.models.officehour.OfficeHourRegistration;
import com.untis.mobile.api.dto.DeleteOfficeHourRegistrationResponse;
import com.untis.mobile.persistence.models.infocenter.InfoCenterContactHour;
import com.untis.mobile.api.dto.DeleteAbsenceResponse;
import com.untis.mobile.api.dto.CreateImmediateLatenessResponse;
import com.untis.mobile.api.dto.CreateImmediateAbsenceResponse;
import com.untis.mobile.api.dto.CreateAbsencesResponse;
import org.joda.time.c;
import java.util.List;
import com.untis.mobile.api.enumeration.CreateAbsenceStrategy;
import com.untis.mobile.persistence.models.messenger.MessengerChannel;
import rx.g;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.Profile;

public interface ApiService
{
    @j0
    g<MessengerChannel> connectMessengerChannel(@j0 final Profile p0, final long p1, @j0 final String p2);
    
    @j0
    g<CreateAbsencesResponse> createAbsence(@j0 final Profile p0, @j0 final CreateAbsenceStrategy p1, final long p2, @j0 final List<Long> p3, @j0 final c p4, @j0 final c p5, final long p6, @j0 final String p7);
    
    @j0
    g<CreateImmediateAbsenceResponse> createImmediateAbsence(@j0 final Profile p0, final long p1, final long p2, @j0 final c p3, @j0 final c p4);
    
    @j0
    g<CreateImmediateLatenessResponse> createImmediateLateness(@j0 final Profile p0, final long p1, final long p2);
    
    @j0
    g<MessengerChannel> createMessengerChannel(@j0 final Profile p0, final long p1, @j0 final String p2);
    
    @j0
    g<DeleteAbsenceResponse> deleteAbsence(@j0 final Profile p0, final long p1);
    
    @j0
    g<DeleteOfficeHourRegistrationResponse> deleteOfficeHourRegistration(@j0 final Profile p0, @j0 final InfoCenterContactHour p1);
    
    @j0
    g<DeleteOfficeHourRegistrationResponse> deleteOfficeHourRegistration(@j0 final Profile p0, @j0 final OfficeHourRegistration p1);
    
    @j0
    g<EditAbsenceResponse> editAbsence(@j0 final Profile p0, @j0 final StudentAbsence p1, @j0 final CreateAbsenceStrategy p2);
    
    @j0
    g<AppInfo> getAppInfo(@j0 final Profile p0);
    
    @j0
    g<String> getAppSharedSecret(@j0 final Profile p0, @j0 final String p1, final long p2);
    
    @j0
    g<String> getAuthenticationToken(@j0 final Profile p0);
    
    @j0
    g<GetAvailableRoomsResponse> getAvailableRooms(@j0 final Profile p0, @j0 final c p1, @j0 final c p2);
    
    @j0
    g<GetClassregDataResponse> getClassregData(@j0 final Profile p0, final long p1, @j0 final t p2, @j0 final t p3);
    
    @j0
    g<GetColorsResponse> getColors(@j0 final Profile p0);
    
    @j0
    g<GetOfficeHoursResponse> getContactHours(@j0 final Profile p0, final long p1, @j0 final t p2);
    
    String getDirectAuthenticationToken(@j0 final Profile p0, final Boolean p1);
    
    @j0
    g<GetExamsResponse> getExams(@j0 final Profile p0, @j0 final EntityType p1, final long p2, @j0 final t p3, @j0 final t p4);
    
    @j0
    g<GetHomeWorkResponse> getHomeWorks(@j0 final Profile p0, @j0 final EntityType p1, final long p2, @j0 final t p3, @j0 final t p4);
    
    @j0
    g<GetMessagesOfDayResponse> getLegacyMessagesOfDay(@j0 final Profile p0, @j0 final c p1);
    
    @j0
    g<GetLessonTopicResponse> getLessonTopic(@j0 final Profile p0, final long p1);
    
    @j0
    g<com.untis.mobile.api.dto.GetMessagesOfDayResponse> getMessagesOfDay(@j0 final Profile p0, @j0 final c p1);
    
    @j0
    g<MessengerCredential> getMessengerAuthenticationCredentials(@j0 final Profile p0);
    
    @j0
    g<MessengerChannelData> getMessengerChannelData(@j0 final Profile p0, final long p1);
    
    @j0
    g<GetOfficeHourRegistrationsResponse> getOfficeHourRegistration(@j0 final Profile p0, final long p1, final long p2);
    
    @j0
    g<GetPDayAppointmentsResponse> getPDayAppointments(@j0 final Profile p0);
    
    @j0
    g<GetPeriodDataResponse> getPeriodData(@j0 final Profile p0, @j0 final List<Long> p1);
    
    @j0
    g<GetRoomChangeDataResponse> getRoomChangeData(@j0 final Profile p0, @j0 final Set<Long> p1);
    
    @j0
    g<GetStudentAbsencesResponse> getStudentAbsence(@j0 final Profile p0, @j0 final t p1, @j0 final t p2);
    
    @j0
    g<GetTimetableResponse> getTimeTable(@j0 final Profile p0, @j0 final EntityType p1, final long p2, @j0 final List<TimeTableModel> p3);
    
    @j0
    g<GetUserDataResponse> getUserData(@j0 final Profile p0);
    
    @j0
    g<GetUserMessagesResponse> getUserMessages(@j0 final Profile p0);
    
    @j0
    g<Integer> getVersion(@j0 final Profile p0);
    
    @Deprecated
    @j0
    g<List<SchoolSearchSchool>> searchSchool(final long p0);
    
    @j0
    g<List<SchoolSearchSchool>> searchSchool(@j0 final String p0);
    
    @j0
    g<SchoolSearchSchool> searchSchoolById(final long p0);
    
    @j0
    g<SchoolSearchSchool> searchSchoolByLogin(@j0 final String p0);
    
    @j0
    g<SubmitAbsencesCheckedResponse> submitAbsenceChecked(@j0 final Profile p0, @j0 final List<Long> p1);
    
    @j0
    g<SubmitAbsencesResponse> submitAbsences(@j0 final Profile p0, final long p1, @j0 final List<StudentAbsence> p2);
    
    @j0
    g<SubmitClassRegEventsResponse> submitEvents(@j0 final Profile p0, final long p1, @j0 final Event p2);
    
    @j0
    g<SubmitExcuseResponse> submitExcuse(@j0 final Profile p0, final long p1, final long p2, @j0 final String p3);
    
    @j0
    g<SubmitHomeWorkResponse> submitHomeWork(@j0 final Profile p0, @j0 final HomeWork p1);
    
    @j0
    g<SubmitLessonTopicResponse> submitLessonTopic(@j0 final Profile p0, @j0 final LessonTopic p1);
    
    @j0
    g<SubmitOfficeHourRegistrationResponse> submitOfficeHourRegistration(@j0 final Profile p0, @j0 final InfoCenterContactHour p1, @j0 final c p2, @j0 final c p3);
    
    @j0
    g<SubmitOfficeHourRegistrationResponse> submitOfficeHourRegistration(@j0 final Profile p0, @j0 final OfficeHourRegistration p1);
    
    @j0
    g<SubmitOwnAbsenceResponse> submitOwnAbsence(@j0 final Profile p0, final long p1, @j0 final Student p2, @j0 final c p3, @j0 final c p4, @j0 final String p5, @k0 final AbsenceReason p6);
    
    @j0
    g<SubmitPeriodInfoResponse> submitPeriodInfo(@j0 final Profile p0, @j0 final PeriodInfo p1);
    
    @j0
    g<Boolean> submitResetPassword(@j0 final Profile p0, @j0 final String p1);
    
    @j0
    g<SubmitRoomChangeResponse> submitRoomChange(@j0 final Profile p0, @j0 final Set<Long> p1, final long p2, final long p3);
}
