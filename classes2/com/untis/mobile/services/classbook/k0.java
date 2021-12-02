// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.classbook;

import kotlinx.coroutines.k2;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import android.util.Log;
import com.untis.mobile.api.common.messenger.UMMessengerChannel;
import com.untis.mobile.api.common.timetable.UMPeriodText;
import kotlin.collections.j1;
import com.untis.mobile.api.enumeration.UMPeriodRight;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import com.untis.mobile.api.common.classreg.UMStudentExemption;
import com.untis.mobile.api.common.classreg.UMClassRole;
import com.untis.mobile.persistence.models.classbook.duty.ClassRole;
import com.untis.mobile.api.common.classreg.UMHomeWork;
import com.untis.mobile.api.common.classreg.UMPrioritizedAttendance;
import com.untis.mobile.persistence.models.classbook.absence.PrioritizedAttendance;
import org.koin.core.c$a;
import com.untis.mobile.persistence.models.profile.AbsenceEndTime;
import com.untis.mobile.api.common.UMSettings;
import com.untis.mobile.api.enumeration.CreateAbsenceStrategy;
import com.untis.mobile.persistence.models.classbook.absence.Exemption;
import java.util.HashSet;
import java.util.concurrent.Callable;
import com.untis.mobile.utils.g0;
import com.untis.mobile.UntisMobileApplication;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import com.untis.mobile.api.dto.EditAbsenceResponse;
import com.untis.mobile.utils.mapper.realmToModel.r;
import com.untis.mobile.api.dto.CreateImmediateAbsenceResponse;
import com.untis.mobile.api.common.absence.UMStudentAttendance;
import com.untis.mobile.persistence.models.classbook.absence.StudentAttendance;
import com.untis.mobile.api.common.absence.UMAbsenceResult;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsenceResult;
import com.untis.mobile.api.dto.CreateAbsencesResponse;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.error.JsonRpcError;
import com.untis.mobile.utils.mapper.realmToModel.j;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.untis.mobile.api.common.classreg.UMClassRegEvent;
import com.untis.mobile.api.dto.legacy.SubmitClassRegEventsResponse;
import com.untis.mobile.api.dto.legacy.SubmitLessonTopicResponse;
import com.untis.mobile.api.common.absence.UMStudentAbsence;
import com.untis.mobile.api.dto.legacy.SubmitAbsencesResponse;
import kotlin.text.s;
import com.untis.mobile.api.common.UMDriveFileDescriptor;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import com.untis.mobile.api.common.timetable.UMLessonTopic;
import com.untis.mobile.api.dto.GetLessonTopicResponse;
import com.untis.mobile.services.profile.legacy.j0;
import kotlinx.coroutines.u0;
import com.untis.mobile.api.common.timetable.UMPeriodData;
import kotlinx.coroutines.b2;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.api.common.UMPerson;
import com.untis.mobile.api.common.masterdata.UMStudent;
import com.untis.mobile.api.dto.CreateImmediateLatenessResponse;
import org.joda.time.t;
import java.util.Set;
import kotlinx.coroutines.h;
import io.realm.RealmQuery;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.api.dto.DeleteAbsenceResponse;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic;
import com.untis.mobile.api.dto.SubmitAbsencesCheckedResponse;
import com.untis.mobile.api.dto.SubmitPeriodInfoResponse;
import io.realm.s0;
import io.realm.f0;
import java.io.Closeable;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.api.dto.legacy.SubmitHomeWorkResponse;
import com.untis.mobile.api.dto.GetPeriodDataResponse;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.Iterator;
import java.util.List;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.joda.time.n0;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import java.util.Collection;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import com.untis.mobile.persistence.models.profile.ClassbookSettings;
import com.untis.mobile.utils.settings.g;
import com.untis.mobile.persistence.dao.classbook.q;
import com.untis.mobile.persistence.dao.classbook.i;
import com.untis.mobile.persistence.dao.classbook.o;
import com.untis.mobile.persistence.dao.classbook.m;
import com.untis.mobile.persistence.dao.classbook.k;
import com.untis.mobile.api.ApiService;
import com.untis.mobile.persistence.realm.d;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import android.content.Context;
import java.util.HashMap;
import kotlin.jvm.internal.w;
import kotlin.b0;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00ca\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 }2\u00020\u00012\u00020\u0002:\u0001CB\u0015\b\u0002\u0012\b\u0010\u0099\u0001\u001a\u00030\u0097\u0001¢\u0006\u0006\b\u00d0\u0001\u0010\u00d1\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0016\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002J\u001b\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b \u0010!J+\u0010'\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001c\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00110\r2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\r2\u0006\u0010,\u001a\u00020)H\u0016J*\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00110\r2\u0006\u0010/\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002020\r2\u0006\u00103\u001a\u000202H\u0016J*\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00110\r2\u0006\u0010\u001b\u001a\u00020\u00172\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0011H\u0016J#\u00109\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00108\u001a\u00020\nH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b;\u0010\tJ\u001b\u0010<\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u0002022\u0006\u00103\u001a\u000202H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u0002052\u0006\u0010B\u001a\u000205H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001b\u0010G\u001a\u00020E2\u0006\u0010F\u001a\u00020EH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010I\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bI\u0010\tJ\u001b\u0010J\u001a\u00020\u00072\u0006\u0010,\u001a\u00020)H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bJ\u0010=J\u001b\u0010K\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bK\u0010?J\u001b\u0010L\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bL\u0010AJ\u001b\u0010M\u001a\u00020\u00072\u0006\u0010B\u001a\u000205H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bM\u0010DJ\u001b\u0010O\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001b\u0010Q\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bQ\u0010PJ\u0012\u0010R\u001a\u0004\u0018\u00010\u00052\u0006\u0010N\u001a\u00020\u0017H\u0016J\u0012\u0010S\u001a\u0004\u0018\u00010)2\u0006\u0010N\u001a\u00020\u0017H\u0016J\u0012\u0010T\u001a\u0004\u0018\u00010.2\u0006\u0010N\u001a\u00020\u0017H\u0016J\u0012\u0010U\u001a\u0004\u0018\u0001022\u0006\u0010N\u001a\u00020\u0017H\u0016J\u0012\u0010V\u001a\u0004\u0018\u0001052\u0006\u0010N\u001a\u00020\u0017H\u0016J\u0012\u0010W\u001a\u0004\u0018\u00010E2\u0006\u0010N\u001a\u00020\u0017H\u0016J\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0016J\u000e\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0016J\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020.0\u00112\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0016J\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u0002050\u00112\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0016J\u000e\u0010]\u001a\b\u0012\u0004\u0012\u0002050\u0011H\u0016J\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020E0\u00112\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0016J\u0016\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u000e\u0010`\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0016J\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u0016J\u0013\u0010b\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bb\u0010\fJ\b\u0010c\u001a\u00020\nH\u0016J\b\u0010d\u001a\u00020\nH\u0016J\b\u0010e\u001a\u00020\nH\u0016J\n\u0010g\u001a\u0004\u0018\u00010fH\u0016J\n\u0010h\u001a\u0004\u0018\u00010fH\u0016J\b\u0010j\u001a\u00020iH\u0016J\n\u0010l\u001a\u0004\u0018\u00010kH\u0016J\u0016\u0010o\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010n\u001a\u00020mH\u0016J$\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00110\r2\u0006\u0010n\u001a\u00020m2\u0006\u0010q\u001a\u00020pH\u0016J$\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00110\r2\u0006\u0010n\u001a\u00020m2\u0006\u0010q\u001a\u00020pH\u0016J,\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020v0\u00110\r2\u0006\u0010n\u001a\u00020m2\u0006\u0010B\u001a\u0002052\u0006\u0010u\u001a\u00020tH\u0016J:\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020v0\u00110\r2\u0006\u0010n\u001a\u00020m2\u0006\u0010B\u001a\u0002052\f\u0010x\u001a\b\u0012\u0004\u0012\u00020p0\u00112\u0006\u0010u\u001a\u00020tH\u0016J&\u0010z\u001a\b\u0012\u0004\u0012\u00020v0\r2\u0006\u0010n\u001a\u00020m2\u0006\u0010B\u001a\u0002052\u0006\u0010u\u001a\u00020tH\u0016J\u001e\u0010{\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010n\u001a\u00020m2\u0006\u0010B\u001a\u000205H\u0016J\u001b\u0010}\u001a\u00020\u00072\u0006\u0010|\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b}\u0010~J\u0012\u0010\u007f\u001a\u0004\u0018\u00010\u00122\u0006\u0010N\u001a\u00020\u0017H\u0016J\u001d\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000¢\u0006\u0005\b\u0080\u0001\u0010~J$\u0010\u0081\u0001\u001a\u00020\u00072\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u0096@\u00f8\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001d\u0010\u0083\u0001\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010PJ\u001d\u0010\u0084\u0001\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000¢\u0006\u0005\b\u0084\u0001\u0010PJ\u0015\u0010\u0085\u0001\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000¢\u0006\u0005\b\u0085\u0001\u0010\fR\"\u0010\u008a\u0001\u001a\u00030\u0086\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b<\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R#\u0010\u008e\u0001\u001a\u00030\u008b\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0087\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\"\u0010\u0092\u0001\u001a\u00030\u008f\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bs\u0010\u0087\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\"\u0010\u0096\u0001\u001a\u00030\u0093\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\be\u0010\u0087\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0019\u0010\u0099\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bJ\u0010\u0098\u0001R\"\u0010\u009d\u0001\u001a\u00030\u009a\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bR\u0010\u0087\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\"\u0010¡\u0001\u001a\u00030\u009e\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bQ\u0010\u0087\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\"\u0010¥\u0001\u001a\u00030¢\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u007f\u0010\u0087\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\"\u0010©\u0001\u001a\u00030¦\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bY\u0010\u0087\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\"\u0010\u00ad\u0001\u001a\u00030ª\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b-\u0010\u0087\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\"\u0010±\u0001\u001a\u00030®\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b*\u0010\u0087\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\"\u0010µ\u0001\u001a\u00030²\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bO\u0010\u0087\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0017\u0010¶\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010VR\"\u0010º\u0001\u001a\u00030·\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\br\u0010\u0087\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R\"\u0010¾\u0001\u001a\u00030»\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bZ\u0010\u0087\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R\u0017\u0010¿\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010ZR\"\u0010\u00c3\u0001\u001a\u00030\u00c0\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bG\u0010\u0087\u0001\u001a\u0006\b\u00c1\u0001\u0010\u00c2\u0001R\"\u0010\u00c7\u0001\u001a\u00030\u00c4\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bd\u0010\u0087\u0001\u001a\u0006\b\u00c5\u0001\u0010\u00c6\u0001R\"\u0010\u00cb\u0001\u001a\u00030\u00c8\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b@\u0010\u0087\u0001\u001a\u0006\b\u00c9\u0001\u0010\u00ca\u0001R\"\u0010\u00cf\u0001\u001a\u00030\u00cc\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b`\u0010\u0087\u0001\u001a\u0006\b\u00cd\u0001\u0010\u00ce\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u00d2\u0001" }, d2 = { "Lcom/untis/mobile/services/classbook/k0;", "Lcom/untis/mobile/services/classbook/a;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "M1", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "Lkotlin/j2;", "Q1", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "L1", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lrx/g;", "p2", "m2", "f2", "", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "C1", "j2", "s2", "profile", "", "periodIds", "N1", "K1", "periodId", "", "A1", "Lcom/untis/mobile/api/common/UMSettings;", "umSettings", "c0", "(Lcom/untis/mobile/api/common/UMSettings;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/api/common/timetable/UMPeriodData;", "umPeriodData", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "s", "(Lcom/untis/mobile/api/common/timetable/UMPeriodData;Lcom/untis/mobile/persistence/models/EntityType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "T", "e0", "lessonTopic", "Y", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "additionalEntityIds", "r", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "periodInfo", "p", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "basicStudentAbsences", "C", "saveWithClassbook", "j", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "z", "Q", "(Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;Lkotlin/coroutines/d;)Ljava/lang/Object;", "q", "(Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Lkotlin/coroutines/d;)Ljava/lang/Object;", "R", "(Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;Lkotlin/coroutines/d;)Ljava/lang/Object;", "studentAbsence", "a", "(Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;", "exemption", "W", "(Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f0", "G", "X", "A", "f", "id", "O", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "P", "U", "D", "v", "d", "Z", "m", "ids", "H", "J", "E", "u", "k", "h", "b0", "I", "e", "t", "g", "K", "N", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "B", "i", "Lcom/untis/mobile/persistence/models/profile/AbsenceEndTime;", "y", "Lorg/joda/time/v;", "d0", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "n", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "L", "M", "Lcom/untis/mobile/api/enumeration/CreateAbsenceStrategy;", "strategy", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsenceResult;", "c", "students", "w", "b", "x", "classbook", "a0", "(Lcom/untis/mobile/persistence/models/timetable/period/Classbook;Lkotlin/coroutines/d;)Ljava/lang/Object;", "S", "l", "o", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "V", "F", "g0", "Lcom/untis/mobile/persistence/dao/classbook/e;", "Lkotlin/b0;", "w1", "()Lcom/untis/mobile/persistence/dao/classbook/e;", "eventDao", "Lcom/untis/mobile/persistence/dao/profile/a;", "F1", "()Lcom/untis/mobile/persistence/dao/profile/a;", "profileDao", "Lcom/untis/mobile/persistence/dao/timetable/c;", "J1", "()Lcom/untis/mobile/persistence/dao/timetable/c;", "timetableModelDao", "Lcom/untis/mobile/persistence/dao/classbook/k;", "y1", "()Lcom/untis/mobile/persistence/dao/classbook/k;", "homeworkDao", "", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/persistence/dao/classbook/a;", "s1", "()Lcom/untis/mobile/persistence/dao/classbook/a;", "classbookDao", "Lcom/untis/mobile/persistence/dao/classbook/c;", "t1", "()Lcom/untis/mobile/persistence/dao/classbook/c;", "classbookSettingDao", "Lcom/untis/mobile/persistence/dao/classbook/i;", "x1", "()Lcom/untis/mobile/persistence/dao/classbook/i;", "exemptionDao", "Landroid/content/Context;", "v1", "()Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "u1", "()Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "classbookSettings", "Lcom/untis/mobile/persistence/dao/classbook/q;", "I1", "()Lcom/untis/mobile/persistence/dao/classbook/q;", "studentAbsenceDao", "Lcom/untis/mobile/persistence/dao/classbook/m;", "z1", "()Lcom/untis/mobile/persistence/dao/classbook/m;", "lessonTopicDao", "syncronize", "Lcom/untis/mobile/persistence/dao/timetable/a;", "D1", "()Lcom/untis/mobile/persistence/dao/timetable/a;", "periodDao", "Lcom/untis/mobile/persistence/realm/d;", "G1", "()Lcom/untis/mobile/persistence/realm/d;", "realmService", "lastPeriodDataUpdate", "Lcom/untis/mobile/utils/settings/g;", "H1", "()Lcom/untis/mobile/utils/settings/g;", "settings", "Lcom/untis/mobile/api/ApiService;", "r1", "()Lcom/untis/mobile/api/ApiService;", "apiService", "Lcom/untis/mobile/persistence/dao/classbook/o;", "E1", "()Lcom/untis/mobile/persistence/dao/classbook/o;", "periodInfoDao", "Lcom/untis/mobile/services/masterdata/a;", "B1", "()Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k0 implements com.untis.mobile.services.classbook.a, c
{
    @e
    public static final a a0;
    @e
    private static final Map<String, com.untis.mobile.services.classbook.a> b0;
    @e
    private final String G;
    @e
    private final b0 H;
    @e
    private final b0 I;
    @e
    private final b0 J;
    @e
    private final b0 K;
    @e
    private final b0 L;
    @e
    private final b0 M;
    @e
    private final b0 N;
    @e
    private final b0 O;
    @e
    private final b0 P;
    @e
    private final b0 Q;
    @e
    private final b0 R;
    @e
    private final b0 S;
    @e
    private final b0 T;
    @e
    private final b0 U;
    @e
    private final b0 V;
    @e
    private final b0 W;
    private long X;
    @e
    private final b0 Y;
    private boolean Z;
    
    static {
        a0 = new a(null);
        b0 = new HashMap<String, com.untis.mobile.services.classbook.a>();
    }
    
    private k0(final String g) {
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<Context>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final Context invoke() {
                return (Context)this.G.t(k1.d(Context.class), null, null);
            }
        });
        this.I = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.masterdata.a>() {
            @e
            @Override
            public final com.untis.mobile.services.masterdata.a invoke() {
                return k0.this.M1().getMasterDataService();
            }
        });
        this.J = d0.c((n6.a<?>)new n6.a<d>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final d invoke() {
                return (d)this.G.t(k1.d(d.class), null, null);
            }
        });
        this.K = d0.c((n6.a<?>)new n6.a<ApiService>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final ApiService invoke() {
                return (ApiService)this.G.t(k1.d(ApiService.class), null, null);
            }
        });
        this.L = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.timetable.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.timetable.a invoke() {
                return (com.untis.mobile.persistence.dao.timetable.a)this.G.t(k1.d(com.untis.mobile.persistence.dao.timetable.a.class), null, null);
            }
        });
        this.M = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.timetable.c>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.timetable.c invoke() {
                return (com.untis.mobile.persistence.dao.timetable.c)this.G.t(k1.d(com.untis.mobile.persistence.dao.timetable.c.class), null, null);
            }
        });
        this.N = d0.c((n6.a<?>)new n6.a<k>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final k invoke() {
                return (k)this.G.t(k1.d(k.class), null, null);
            }
        });
        this.O = d0.c((n6.a<?>)new n6.a<m>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final m invoke() {
                return (m)this.G.t(k1.d(m.class), null, null);
            }
        });
        this.P = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.classbook.c>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.classbook.c invoke() {
                return (com.untis.mobile.persistence.dao.classbook.c)this.G.t(k1.d(com.untis.mobile.persistence.dao.classbook.c.class), null, null);
            }
        });
        this.Q = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.classbook.e>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.classbook.e invoke() {
                return (com.untis.mobile.persistence.dao.classbook.e)this.G.t(k1.d(com.untis.mobile.persistence.dao.classbook.e.class), null, null);
            }
        });
        this.R = d0.c((n6.a<?>)new n6.a<o>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final o invoke() {
                return (o)this.G.t(k1.d(o.class), null, null);
            }
        });
        this.S = d0.c((n6.a<?>)new n6.a<i>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final i invoke() {
                return (i)this.G.t(k1.d(i.class), null, null);
            }
        });
        this.T = d0.c((n6.a<?>)new n6.a<q>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final q invoke() {
                return (q)this.G.t(k1.d(q.class), null, null);
            }
        });
        this.U = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.classbook.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.classbook.a invoke() {
                return (com.untis.mobile.persistence.dao.classbook.a)this.G.t(k1.d(com.untis.mobile.persistence.dao.classbook.a.class), null, null);
            }
        });
        this.V = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.profile.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.profile.a invoke() {
                return (com.untis.mobile.persistence.dao.profile.a)this.G.t(k1.d(com.untis.mobile.persistence.dao.profile.a.class), null, null);
            }
        });
        this.W = d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final g invoke() {
                return (g)this.G.t(k1.d(g.class), null, null);
            }
        });
        this.Y = d0.c((n6.a<?>)new n6.a<ClassbookSettings>() {
            final /* synthetic */ k0 G;
            
            @e
            public final ClassbookSettings a() {
                return k0.this.t1().b(k0.b1(this.G));
            }
        });
    }
    
    private final Collection<HomeWork> A1(long lessonId) {
        final Period a = this.D1().a(this.G, lessonId);
        if (a == null) {
            return new ArrayList<HomeWork>();
        }
        final List<HomeWork> j = this.J();
        final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
        for (final HomeWork next : j) {
            final HomeWork homeWork = next;
            lessonId = homeWork.getLessonId();
            final long lessonId2 = a.getLessonId();
            boolean b = false;
            if (lessonId == lessonId2) {
                if (!((org.joda.time.base.e)homeWork.getStart().h1()).m((n0)a.getStart().h1())) {
                    if (!((org.joda.time.base.e)homeWork.getEnd().h1()).o((n0)a.getEnd().h1())) {
                        b = true;
                    }
                }
            }
            if (b) {
                list.add(next);
            }
        }
        return list;
    }
    
    private final com.untis.mobile.services.masterdata.a B1() {
        return this.I.getValue();
    }
    
    private final List<Classbook> C1() {
        final com.untis.mobile.utils.mapper.realmToModel.d d = new com.untis.mobile.utils.mapper.realmToModel.d(this.G);
        final ArrayList<Classbook> list = new ArrayList<Classbook>();
        final f0 c = this.G1().c(this.G);
        try {
            final s0<i4.a> b0 = c.f3(i4.a.class).D("synced", Boolean.FALSE).b0();
            kotlin.jvm.internal.k0.o(b0, "realm.where(RealmClassbook::class.java).equalTo(\"synced\", false)\n                    .findAll()");
            final ArrayList c2 = new ArrayList<Classbook>(v.Y((Iterable<?>)b0, 10));
            for (final i4.a a : b0) {
                kotlin.jvm.internal.k0.o(a, "it");
                c2.add(d.a(a));
            }
            list.addAll((Collection<? extends Classbook>)c2);
            kotlin.io.c.a(c, null);
            return list;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a(c, t);
            }
        }
    }
    
    private final com.untis.mobile.persistence.dao.timetable.a D1() {
        return this.L.getValue();
    }
    
    private final o E1() {
        return this.R.getValue();
    }
    
    private final com.untis.mobile.persistence.dao.profile.a F1() {
        return this.V.getValue();
    }
    
    private final d G1() {
        return this.J.getValue();
    }
    
    private final g H1() {
        return this.W.getValue();
    }
    
    private final q I1() {
        return this.T.getValue();
    }
    
    private final com.untis.mobile.persistence.dao.timetable.c J1() {
        return this.M.getValue();
    }
    
    private final boolean K1() {
        final Profile m1 = this.M1();
        return m1.getUserOriginalEntityType() == EntityType.TEACHER && com.untis.mobile.services.a.a.c(m1) && !kotlin.jvm.internal.k0.g("herodemomobile", m1.getUniqueId());
    }
    
    private final Object L1(final kotlin.coroutines.d<? super Boolean> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super Boolean>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Boolean>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Boolean> d) {
                return ((k0$v)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object c) {
                b.h();
                if (this.G == 0) {
                    c1.n(c);
                    c = k0.this.G1().c(k0.b1(this.H));
                    try {
                        final RealmQuery<j4.a> f3 = ((f0)c).f3(j4.a.class);
                        boolean b = false;
                        final long r = f3.D("synced", kotlin.coroutines.jvm.internal.b.a(false)).r();
                        final long r2 = ((f0)c).f3(i4.a.class).D("synced", kotlin.coroutines.jvm.internal.b.a(false)).r();
                        final long r3 = ((f0)c).f3(n4.a.class).D("sync", kotlin.coroutines.jvm.internal.b.a(false)).r();
                        if (((f0)c).f3(v4.a.class).D("synced", kotlin.coroutines.jvm.internal.b.a(false)).r() > 0L || ((f0)c).f3(m4.a.class).D("synced", kotlin.coroutines.jvm.internal.b.a(false)).r() > 0L || ((f0)c).f3(l4.a.class).D("synced", kotlin.coroutines.jvm.internal.b.a(false)).r() > 0L || r3 > 0L || r > 0L || r2 > 0L) {
                            b = true;
                        }
                        final Boolean a = kotlin.coroutines.jvm.internal.b.a(b);
                        kotlin.io.c.a((Closeable)c, null);
                        return a;
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            kotlin.io.c.a((Closeable)c, t);
                        }
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
    }
    
    private final Profile M1() {
        Profile g;
        if ((g = this.F1().g(this.G)) == null) {
            g = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        return g;
    }
    
    private final rx.g<Boolean> N1(final Profile profile, final List<Long> list) {
        rx.g g;
        String s;
        if (!com.untis.mobile.services.a.a.j(profile)) {
            g = rx.g.U2((Object)Boolean.TRUE).E5(rx.schedulers.c.e()).Q3(rx.android.schedulers.a.c());
            s = "just(true)\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())";
        }
        else {
            g = this.r1().getPeriodData(profile, list).Q3(rx.schedulers.c.e()).k3((rx.functions.p)new h0(profile, this)).Q3(rx.android.schedulers.a.c());
            s = "apiService\n            .getPeriodData(profile, periodIds)\n            .observeOn(Schedulers.io())\n            .map { response ->\n                if (response.referencedStudents != null) {\n                    runBlocking {\n                        return@runBlocking masterDataService.save(response.referencedStudents.mapNotNull { person ->\n                            val student = masterDataService.student(person.id)\n\n                            val umStudent = UMStudent()\n                            umStudent.id = person.id\n                            umStudent.firstName = person.firstName\n                            umStudent.lastName = person.lastName\n                            umStudent.birthDate =\n                                student?.birthday?.toString(Constant.Time.ISO_PATTERN_DATE)\n                                    ?: \"\"\n                            umStudent.klasseId = student?.klasse ?: 0\n                            return@mapNotNull umStudent\n                        })\n                    }\n                }\n\n                if (response.dataByTTId != null) {\n                    for (umPeriodData in response.dataByTTId.values) {\n                        GlobalScope.launch {\n                            save(umPeriodData)\n                        }\n                    }\n                }\n\n                profile.periodDataTimestamp = lastPeriodDataUpdate\n                UmProfileService.update(profile)\n\n                return@map true\n            }\n            .observeOn(AndroidSchedulers.mainThread())";
        }
        kotlin.jvm.internal.k0.o(g, s);
        return (rx.g<Boolean>)g;
    }
    
    private static final Boolean O1(final Profile profile, final k0 k0, final GetPeriodDataResponse getPeriodDataResponse) {
        k0.p(profile, "$profile");
        k0.p(k0, "this$0");
        if (getPeriodDataResponse.referencedStudents != null) {
            h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ k0 H;
                final /* synthetic */ GetPeriodDataResponse I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ k0 H = this.H;
                        final /* synthetic */ GetPeriodDataResponse I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((k0$y)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                        final com.untis.mobile.services.masterdata.a y0 = k0.this.B1();
                        final Set<UMPerson> referencedStudents = this.I.referencedStudents;
                        kotlin.jvm.internal.k0.o(referencedStudents, "response.referencedStudents");
                        final k0 h2 = this.H;
                        final ArrayList<UMStudent> list = new ArrayList<UMStudent>();
                        for (final UMPerson umPerson : referencedStudents) {
                            final Student v = h2.B1().V(umPerson.id);
                            final UMStudent umStudent = new UMStudent();
                            umStudent.id = umPerson.id;
                            umStudent.firstName = umPerson.firstName;
                            umStudent.lastName = umPerson.lastName;
                            String birthDate = "";
                            if (v != null) {
                                final org.joda.time.t birthday = v.getBirthday();
                                if (birthday != null) {
                                    final String g2 = birthday.g4("yyyy-MM-dd");
                                    if (g2 != null) {
                                        birthDate = g2;
                                    }
                                }
                            }
                            umStudent.birthDate = birthDate;
                            long longValue = 0L;
                            if (v != null) {
                                final Long klasse = v.getKlasse();
                                if (klasse != null) {
                                    longValue = klasse;
                                }
                            }
                            umStudent.klasseId = longValue;
                            list.add(umStudent);
                        }
                        this.G = 1;
                        if (a.a.i(y0, list, false, this, 2, null) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
        }
        final Map<Long, UMPeriodData> dataByTTId = getPeriodDataResponse.dataByTTId;
        if (dataByTTId != null) {
            final Iterator<UMPeriodData> iterator = dataByTTId.values().iterator();
            while (iterator.hasNext()) {
                h.f((r0)b2.G, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H;
                    final /* synthetic */ UMPeriodData I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ k0 H = this.H;
                            final /* synthetic */ UMPeriodData I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((k0$z)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                            final k0 h2 = this.H;
                            final UMPeriodData i = this.I;
                            kotlin.jvm.internal.k0.o(i, "umPeriodData");
                            this.G = 1;
                            if (a.g(h2, i, null, 0L, this, 6, null) == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
            }
        }
        profile.setPeriodDataTimestamp(k0.X);
        j0.G.d(profile);
        return Boolean.TRUE;
    }
    
    public static final /* synthetic */ Map P0() {
        return k0.b0;
    }
    
    private static final List P1(final GetLessonTopicResponse getLessonTopicResponse) {
        final List<UMLessonTopic> previousTopics = getLessonTopicResponse.previousTopics;
        kotlin.jvm.internal.k0.o(previousTopics, "response.previousTopics");
        final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)previousTopics, 10));
        for (final UMLessonTopic umLessonTopic : previousTopics) {
            final long periodId = umLessonTopic.periodId;
            String text;
            if ((text = umLessonTopic.text) == null) {
                text = "";
            }
            final org.joda.time.c c = com.untis.mobile.utils.mapper.common.b.c(umLessonTopic.startDateTime);
            kotlin.jvm.internal.k0.o(c, "isoStringToDateTime(umLessonTopic.startDateTime)");
            final org.joda.time.c c2 = com.untis.mobile.utils.mapper.common.b.c(umLessonTopic.endDateTime);
            kotlin.jvm.internal.k0.o(c2, "isoStringToDateTime(umLessonTopic.endDateTime)");
            final List<UMDriveFileDescriptor> attachments = umLessonTopic.attachments;
            kotlin.jvm.internal.k0.o(attachments, "umLessonTopic.attachments");
            final ArrayList list2 = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)attachments, 10));
            for (final UMDriveFileDescriptor umDriveFileDescriptor : attachments) {
                final long id = umDriveFileDescriptor.id;
                final String name = umDriveFileDescriptor.name;
                kotlin.jvm.internal.k0.o(name, "attachment.name");
                final String url = umDriveFileDescriptor.url;
                kotlin.jvm.internal.k0.o(url, "attachment.url");
                list2.add(new DriveAttachment(id, name, url));
            }
            list.add(new LessonTopic(periodId, text, c, c2, (List<DriveAttachment>)list2, true));
        }
        final ArrayList<LessonTopic> list3 = new ArrayList<LessonTopic>();
        for (final LessonTopic e : list) {
            final boolean empty = list3.isEmpty();
            final int n = 0;
            int n2 = 0;
            Label_0397: {
                if (!empty) {
                    for (final LessonTopic lessonTopic : list3) {
                        if (((org.joda.time.base.e)lessonTopic.getStart().h1()).p((n0)e.getStart().h1()) && s.K1(lessonTopic.getText(), e.getText(), true)) {
                            n2 = n;
                            break Label_0397;
                        }
                    }
                }
                n2 = 1;
            }
            if (n2 != 0) {
                list3.add(e);
            }
        }
        return list3;
    }
    
    private final Object Q1(final HomeWork homeWork, final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            Object I;
            int J;
            final /* synthetic */ HomeWork K;
            final /* synthetic */ k0 L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    Object I;
                    int J;
                    final /* synthetic */ HomeWork K = this.K;
                    final /* synthetic */ k0 L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$j0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object s) {
                final Object h = b.h();
                final int j = this.J;
                Iterator<Classbook> iterator;
                HomeWork i;
                k0 l;
                if (j != 0) {
                    if (j != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iterator = (Iterator<Classbook>)this.I;
                    final k0 k0 = (k0)this.H;
                    i = (HomeWork)this.G;
                    c1.n(s);
                    l = k0;
                }
                else {
                    c1.n(s);
                    final org.joda.time.t h2 = this.K.getStart().h1();
                    final org.joda.time.t h3 = this.K.getEnd().h1();
                    final List<Period> b = k0.this.D1().b(k0.b1(this.L), this.K.getLessonId());
                    final ArrayList<Period> list = new ArrayList<Period>();
                    for (final Period next : b) {
                        final org.joda.time.t h4 = next.getStart().h1();
                        if (kotlin.coroutines.jvm.internal.b.a((((org.joda.time.base.e)h4).p((n0)h2) || ((org.joda.time.base.e)h4).m((n0)h2)) && (((org.joda.time.base.e)h4).p((n0)h3) || ((org.joda.time.base.e)h4).o((n0)h3)))) {
                            list.add(next);
                        }
                    }
                    final k0 m = this.L;
                    final ArrayList list2 = new ArrayList<Classbook>(v.Y((Iterable<?>)list, 10));
                    for (final Period period : list) {
                        if ((s = m.S(period.getId())) == null) {
                            s = new Classbook(period.getId(), null, null, null, null, null, null, false, false, null, 1022, null);
                        }
                        list2.add((Classbook)s);
                    }
                    i = this.K;
                    l = this.L;
                    iterator = list2.iterator();
                }
                while (iterator.hasNext()) {
                    final Classbook classbook = iterator.next();
                    classbook.getHomeWorks().remove(i);
                    classbook.getHomeWorks().add(i);
                    this.G = i;
                    this.H = l;
                    this.I = iterator;
                    this.J = 1;
                    if (l.a0(classbook, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    private static final PeriodInfo R1(final PeriodInfo periodInfo, final k0 k0, final SubmitPeriodInfoResponse submitPeriodInfoResponse) {
        k0.p(periodInfo, "$periodInfo");
        k0.p(k0, "this$0");
        periodInfo.setSync(submitPeriodInfoResponse.success);
        return (PeriodInfo)h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super PeriodInfo>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ PeriodInfo I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super PeriodInfo>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ PeriodInfo I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super PeriodInfo> d) {
                return ((k0$f1)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object r) {
                final Object h = b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(r);
                }
                else {
                    c1.n(r);
                    final k0 h2 = this.H;
                    final PeriodInfo i = this.I;
                    this.G = 1;
                    if ((r = h2.R(i, this)) == h) {
                        return h;
                    }
                }
                return r;
            }
        }, 1, (Object)null);
    }
    
    private static final List S1(final com.untis.mobile.utils.mapper.apiToModel.d d, final long n, final k0 k0, final SubmitAbsencesResponse submitAbsencesResponse) {
        k0.p(d, "$studentAbsenceMapper");
        k0.p(k0, "this$0");
        final List<UMStudentAbsence> absences = submitAbsencesResponse.absences;
        k0.o(absences, "response.absences");
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        for (final UMStudentAbsence umStudentAbsence : absences) {
            k0.o(umStudentAbsence, "umStudentAbsence");
            final StudentAbsence g = d.g(n, umStudentAbsence);
            if (g != null) {
                list.add(g);
            }
        }
        h.f((r0)b2.G, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            int I;
            final /* synthetic */ List<StudentAbsence> J;
            final /* synthetic */ k0 K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ List<StudentAbsence> J = this.J;
                    final /* synthetic */ k0 K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$g1)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int i = this.I;
                Iterator<Object> iterator;
                k0 j;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iterator = (Iterator<Object>)this.H;
                    final k0 k0 = (k0)this.G;
                    c1.n(o);
                    j = k0;
                }
                else {
                    c1.n(o);
                    final List<StudentAbsence> l = this.J;
                    j = this.K;
                    iterator = l.iterator();
                }
                while (iterator.hasNext()) {
                    final StudentAbsence studentAbsence = iterator.next();
                    this.G = j;
                    this.H = iterator;
                    this.I = 1;
                    if (j.a(studentAbsence, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
        return list;
    }
    
    private static final HomeWork T1(final HomeWork homeWork, final k0 k0, final SubmitHomeWorkResponse submitHomeWorkResponse) {
        k0.p(homeWork, "$homeWork");
        k0.p(k0, "this$0");
        if (homeWork.getId() < 1L || homeWork.getPeriodId() == 0L) {
            h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ k0 H;
                final /* synthetic */ HomeWork I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ k0 H = this.H;
                        final /* synthetic */ HomeWork I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((k0$a1)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                        final k0 h2 = this.H;
                        final HomeWork i = this.I;
                        this.G = 1;
                        if (h2.f0(i, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
        }
        homeWork.setId(submitHomeWorkResponse.submittedHomeWorkId);
        homeWork.setSynced(submitHomeWorkResponse.success);
        HomeWork homeWork2 = homeWork;
        if (homeWork.getPeriodId() != 0L) {
            homeWork2 = (HomeWork)h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super HomeWork>, Object>() {
                int G;
                final /* synthetic */ k0 H;
                final /* synthetic */ HomeWork I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super HomeWork>, Object>() {
                        int G;
                        final /* synthetic */ k0 H = this.H;
                        final /* synthetic */ HomeWork I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super HomeWork> d) {
                    return ((k0$b1)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object h) {
                    final Object h2 = b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(h);
                    }
                    else {
                        c1.n(h);
                        final k0 h3 = this.H;
                        final HomeWork i = this.I;
                        this.G = 1;
                        if ((h = a.h(h3, i, false, this, 2, null)) == h2) {
                            return h2;
                        }
                    }
                    return h;
                }
            }, 1, (Object)null);
        }
        return homeWork2;
    }
    
    private static final LessonTopic U1(final LessonTopic lessonTopic, final k0 k0, final SubmitLessonTopicResponse submitLessonTopicResponse) {
        k0.p(lessonTopic, "$lessonTopic");
        k0.p(k0, "this$0");
        lessonTopic.setSynced(submitLessonTopicResponse.success);
        return (LessonTopic)h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super LessonTopic>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ LessonTopic I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super LessonTopic>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ LessonTopic I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super LessonTopic> d) {
                return ((k0$c1)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object q) {
                final Object h = b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(q);
                }
                else {
                    c1.n(q);
                    final k0 h2 = this.H;
                    final LessonTopic i = this.I;
                    this.G = 1;
                    if ((q = h2.Q(i, this)) == h) {
                        return h;
                    }
                }
                return q;
            }
        }, 1, (Object)null);
    }
    
    private static final Event V1(final k0 k0, final Event event, final SubmitClassRegEventsResponse submitClassRegEventsResponse) {
        k0.p(k0, "this$0");
        k0.p(event, "$event");
        h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ Event I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ Event I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$d1)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                    final k0 h2 = this.H;
                    final Event i = this.I;
                    this.G = 1;
                    if (h2.X(i, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        if (submitClassRegEventsResponse.classRegEvent != null) {
            return (Event)h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super Event>, Object>(null) {
                int G;
                final /* synthetic */ k0 H;
                final /* synthetic */ SubmitClassRegEventsResponse I;
                final /* synthetic */ Event J;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Event>, Object>(d) {
                        int G;
                        final /* synthetic */ k0 H = this.H;
                        final /* synthetic */ SubmitClassRegEventsResponse I = this.I;
                        final /* synthetic */ Event J = this.J;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Event> d) {
                    return ((k0$e1)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object q) {
                    final Object h = b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(q);
                    }
                    else {
                        c1.n(q);
                        final k0 h2 = this.H;
                        final long id = this.I.classRegEvent.id;
                        final long periodId = this.J.getPeriodId();
                        final EntityType by = EntityType.Companion.findBy(this.I.classRegEvent.elementType);
                        final UMClassRegEvent classRegEvent = this.I.classRegEvent;
                        final long elementId = classRegEvent.elementId;
                        final org.joda.time.c c = com.untis.mobile.utils.mapper.common.b.c(classRegEvent.dateTime);
                        kotlin.jvm.internal.k0.o(c, "isoStringToDateTime(response.classRegEvent.dateTime)");
                        String text;
                        if ((text = this.I.classRegEvent.text) == null) {
                            text = "";
                        }
                        q = new Event(id, periodId, by, elementId, c, text, k0.this.B1().w(this.I.classRegEvent.eventReasonId), true);
                        this.G = 1;
                        if ((q = h2.q((Event)q, this)) == h) {
                            return h;
                        }
                    }
                    return q;
                }
            }, 1, (Object)null);
        }
        return new Event(0L, 0L, null, 0L, null, null, null, false, 254, null);
    }
    
    private static final Boolean W1(final Event event) {
        return event.getId() > 0L;
    }
    
    private static final Boolean X1() {
        return Boolean.TRUE;
    }
    
    private static final rx.g Y1(final k0 k0, final Boolean b) {
        k0.p(k0, "this$0");
        return k0.p2();
    }
    
    private static final rx.g Z1(final k0 k0, final Boolean b) {
        k0.p(k0, "this$0");
        return k0.m2();
    }
    
    private static final rx.g a2(final k0 k0, final Boolean b) {
        k0.p(k0, "this$0");
        return k0.f2();
    }
    
    public static final /* synthetic */ String b1(final k0 k0) {
        return k0.G;
    }
    
    private static final rx.g b2(final k0 k0, final Boolean b) {
        k0.p(k0, "this$0");
        return k0.j2();
    }
    
    private static final rx.g c2(final k0 k0, final Boolean b) {
        k0.p(k0, "this$0");
        return k0.s2();
    }
    
    private static final void d2(final k0 k0) {
        k0.p(k0, "this$0");
        k0.Z = false;
    }
    
    private static final void e2(final k0 k0, final Throwable t) {
        k0.p(k0, "this$0");
        k0.Z = false;
    }
    
    private final rx.g<Boolean> f2() {
        final List<Classbook> c1 = this.C1();
        rx.g g;
        String s;
        if (c1.isEmpty()) {
            g = rx.g.U2((Object)Boolean.TRUE);
            s = "just(true)";
        }
        else {
            final ArrayList list = new ArrayList<rx.g>(v.Y((Iterable<?>)c1, 10));
            for (final Classbook classbook : c1) {
                list.add(this.C(classbook.getId(), this.u(classbook.getAbsences())).k3((rx.functions.p)new i0(classbook, this)).d4((rx.functions.p)com.untis.mobile.services.classbook.a0.G));
            }
            g = rx.g.w0((Iterable)list).k3((rx.functions.p)c0.G);
            s = "concat(classbooks\n            .map classbooks@{ classbook ->\n                val studentAbsences = studentAbsences(classbook.absences)\n\n                submit(classbook.id, studentAbsences)\n                    .map { absences ->\n                        classbook.absences = absences.map { it.id }.toMutableSet()\n\n                        runBlocking {\n                            save(classbook)\n                        }\n\n                        return@map absences\n                    }\n                    .onErrorResumeNext {\n                        return@onErrorResumeNext Observable.just(null)\n                    }\n            })\n            .map { true }";
        }
        kotlin.jvm.internal.k0.o(g, s);
        return (rx.g<Boolean>)g;
    }
    
    private static final List g2(final Classbook classbook, final k0 k0, final List list) {
        k0.p(classbook, "$classbook");
        k0.p(k0, "this$0");
        k0.o(list, "absences");
        final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
        final Iterator<StudentAbsence> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(Long.valueOf(iterator.next().getId()));
        }
        classbook.setAbsences(v.M5((Iterable<? extends Long>)list2));
        h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ Classbook I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ Classbook I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$h1)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                    final k0 h2 = this.H;
                    final Classbook i = this.I;
                    this.G = 1;
                    if (h2.a0(i, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        return list;
    }
    
    private static final rx.g h2(final Throwable t) {
        return rx.g.U2((Object)null);
    }
    
    private static final Boolean i2(final List list) {
        return Boolean.TRUE;
    }
    
    private final rx.g<Boolean> j2() {
        final ArrayList<Event> list = new ArrayList<Event>();
        final j j = new j(this.G);
        Object o = this.G1().c(this.G);
        try {
            final s0<l4.a> b0 = ((f0)o).f3(l4.a.class).D("synced", Boolean.FALSE).b0();
            kotlin.jvm.internal.k0.o(b0, "realm.where(RealmEvent::class.java).equalTo(\"synced\", false).findAll()");
            for (final l4.a a : b0) {
                kotlin.jvm.internal.k0.o(a, "realmEvent");
                list.add((T)j.b(a));
            }
            kotlin.io.c.a((Closeable)o, null);
            String s;
            if (list.isEmpty()) {
                o = rx.g.U2((Object)Boolean.TRUE);
                s = "just(true)";
            }
            else {
                o = new ArrayList<rx.g>(v.Y((Iterable<?>)list, 10));
                for (final Event event : list) {
                    ((Collection<rx.g>)o).add(com.untis.mobile.services.classbook.a.a.j(this, event, null, 2, null).d4((rx.functions.p)new com.untis.mobile.services.classbook.j(this, event)));
                }
                o = rx.g.w0((Iterable)o).k3((rx.functions.p)com.untis.mobile.services.classbook.b0.G);
                s = "concat(events.map { event ->\n                submit(event).onErrorResumeNext { throwable ->\n                    val cause = throwable.cause\n\n                    if (cause != null && cause is JsonRpcError) {\n                        if (cause.isAnyOf(NoRight)) {\n                            GlobalScope.launch {\n                                delete(event)\n                            }\n                        }\n                    }\n\n                    return@onErrorResumeNext Observable.just(null)\n                }\n            })\n            .map { true }";
            }
            kotlin.jvm.internal.k0.o(o, s);
            return (rx.g<Boolean>)o;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a((Closeable)o, t);
            }
        }
    }
    
    private static final Boolean k1(final k0 k0, final Period period, final SubmitAbsencesCheckedResponse submitAbsencesCheckedResponse) {
        k0.p(k0, "this$0");
        k0.p(period, "$period");
        final p<r0, kotlin.coroutines.d<? super j2>, Object> p3 = new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ Period I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ Period I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                    Classbook s;
                    if ((s = this.H.S(this.I.getId())) == null) {
                        s = new Classbook(this.I.getId(), null, null, null, null, null, null, false, false, null, 1022, null);
                    }
                    s.setAbsencesChecked(true);
                    final k0 h2 = this.H;
                    this.G = 1;
                    if (h2.a0(s, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        };
        boolean b = true;
        h.h((kotlin.coroutines.g)null, (p)p3, 1, (Object)null);
        if (submitAbsencesCheckedResponse == null) {
            b = false;
        }
        return b;
    }
    
    private static final rx.g k2(final k0 k0, final Event event, Throwable cause) {
        k0.p(k0, "this$0");
        k0.p(event, "$event");
        cause = cause.getCause();
        if (cause != null && cause instanceof JsonRpcError && ((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.NoRight)) {
            h.f((r0)b2.G, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ k0 H;
                final /* synthetic */ Event I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ k0 H = this.H;
                        final /* synthetic */ Event I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((k0$i1)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                        final k0 h2 = this.H;
                        final Event i = this.I;
                        this.G = 1;
                        if (h2.X(i, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 3, (Object)null);
        }
        return rx.g.U2((Object)null);
    }
    
    private static final List l1(final k0 k0, final com.untis.mobile.utils.mapper.apiToModel.d d, final Period period, final com.untis.mobile.utils.mapper.apiToModel.e e, final CreateAbsencesResponse createAbsencesResponse) {
        k0.p(k0, "this$0");
        k0.p(d, "$absenceMapper");
        k0.p(period, "$period");
        k0.p(e, "$attendanceMapper");
        final Set<Map.Entry<Long, UMAbsenceResult>> entrySet = createAbsencesResponse.resultPerStudent.entrySet();
        final ArrayList list = new ArrayList<StudentAbsenceResult>(v.Y((Iterable<?>)entrySet, 10));
        for (final Map.Entry<Object, V> entry : entrySet) {
            final com.untis.mobile.services.masterdata.a b1 = k0.B1();
            final Number key = entry.getKey();
            k0.o(key, "entry.key");
            Student v;
            if ((v = b1.V(key.longValue())) == null) {
                final Number key2 = entry.getKey();
                k0.o(key2, "entry.key");
                v = new Student(key2.longValue(), null, null, null, null, 30, null);
            }
            final List<UMStudentAbsence> absences = ((UMAbsenceResult)entry.getValue()).absences;
            k0.o(absences, "entry.value.absences");
            final ArrayList list2 = new ArrayList<StudentAbsence>(kotlin.collections.v.Y((Iterable<?>)absences, 10));
            for (final UMStudentAbsence umStudentAbsence : absences) {
                final long id = period.getId();
                k0.o(umStudentAbsence, "umStudentAbsence");
                list2.add(d.g(id, umStudentAbsence));
            }
            final List<UMStudentAbsence> conflicts = ((UMAbsenceResult)entry.getValue()).conflicts;
            k0.o(conflicts, "entry.value.conflicts");
            final ArrayList list3 = new ArrayList<StudentAbsence>(kotlin.collections.v.Y((Iterable<?>)conflicts, 10));
            for (final UMStudentAbsence umStudentAbsence2 : conflicts) {
                final long id2 = period.getId();
                k0.o(umStudentAbsence2, "umStudentAbsence");
                list3.add(d.g(id2, umStudentAbsence2));
            }
            final List<UMStudentAttendance> attendances = ((UMAbsenceResult)entry.getValue()).attendances;
            k0.o(attendances, "entry.value.attendances");
            final ArrayList list4 = new ArrayList<StudentAttendance>(kotlin.collections.v.Y((Iterable<?>)attendances, 10));
            for (final UMStudentAttendance umStudentAttendance : attendances) {
                k0.o(umStudentAttendance, "umStudentAttendance");
                list4.add(e.a(umStudentAttendance));
            }
            list.add(new StudentAbsenceResult(v, (List<StudentAbsence>)list2, (List<StudentAbsence>)list3, (List<StudentAttendance>)list4, ((UMAbsenceResult)entry.getValue()).separateSaveAllowed));
        }
        h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            Object I;
            int J;
            final /* synthetic */ List<StudentAbsenceResult> K;
            final /* synthetic */ k0 L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    Object I;
                    int J;
                    final /* synthetic */ List<StudentAbsenceResult> K = this.K;
                    final /* synthetic */ k0 L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int j = this.J;
                while (true) {
                    Iterator<Object> iterator = null;
                    Label_0089: {
                        if (j == 0) {
                            c1.n(o);
                            final List<StudentAbsenceResult> k = this.K;
                            final k0 l = this.L;
                            iterator = k.iterator();
                            final p<r0, kotlin.coroutines.d<? super j2>, Object> p = this;
                            break Label_0089;
                        }
                        if (j != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        final Iterator<Object> iterator2 = (Iterator<Object>)this.I;
                        iterator = (Iterator<Object>)this.H;
                        final k0 l = (k0)this.G;
                        c1.n(o);
                        final p<r0, kotlin.coroutines.d<? super j2>, Object> p = this;
                        while (iterator2.hasNext()) {
                            final StudentAbsence studentAbsence = iterator2.next();
                            p.G = l;
                            p.H = iterator;
                            p.I = iterator2;
                            p.J = 1;
                            if (l.a(studentAbsence, p) == h) {
                                return h;
                            }
                        }
                    }
                    if (iterator.hasNext()) {
                        final Iterator<Object> iterator2 = (Iterator<Object>)iterator.next().getAbsences().iterator();
                        continue;
                    }
                    break;
                }
                return j2.a;
            }
        }, 1, (Object)null);
        return list;
    }
    
    private static final Boolean l2(final List list) {
        return Boolean.TRUE;
    }
    
    private static final List m1(final k0 k0, final com.untis.mobile.utils.mapper.apiToModel.d d, final Period period, final com.untis.mobile.utils.mapper.apiToModel.e e, final CreateAbsencesResponse createAbsencesResponse) {
        k0.p(k0, "this$0");
        k0.p(d, "$absenceMapper");
        k0.p(period, "$period");
        k0.p(e, "$attendanceMapper");
        final Set<Map.Entry<Long, UMAbsenceResult>> entrySet = createAbsencesResponse.resultPerStudent.entrySet();
        final ArrayList list = new ArrayList<StudentAbsenceResult>(v.Y((Iterable<?>)entrySet, 10));
        for (final Map.Entry<Object, V> entry : entrySet) {
            final com.untis.mobile.services.masterdata.a b1 = k0.B1();
            final Number key = entry.getKey();
            k0.o(key, "entry.key");
            Student v;
            if ((v = b1.V(key.longValue())) == null) {
                final Number key2 = entry.getKey();
                k0.o(key2, "entry.key");
                v = new Student(key2.longValue(), null, null, null, null, 30, null);
            }
            final List<UMStudentAbsence> absences = ((UMAbsenceResult)entry.getValue()).absences;
            k0.o(absences, "entry.value.absences");
            final ArrayList list2 = new ArrayList<StudentAbsence>(kotlin.collections.v.Y((Iterable<?>)absences, 10));
            for (final UMStudentAbsence umStudentAbsence : absences) {
                final long id = period.getId();
                k0.o(umStudentAbsence, "umStudentAbsence");
                list2.add(d.g(id, umStudentAbsence));
            }
            final List<UMStudentAbsence> conflicts = ((UMAbsenceResult)entry.getValue()).conflicts;
            k0.o(conflicts, "entry.value.conflicts");
            final ArrayList list3 = new ArrayList<StudentAbsence>(kotlin.collections.v.Y((Iterable<?>)conflicts, 10));
            for (final UMStudentAbsence umStudentAbsence2 : conflicts) {
                final long id2 = period.getId();
                k0.o(umStudentAbsence2, "umStudentAbsence");
                list3.add(d.g(id2, umStudentAbsence2));
            }
            final List<UMStudentAttendance> attendances = ((UMAbsenceResult)entry.getValue()).attendances;
            k0.o(attendances, "entry.value.attendances");
            final ArrayList list4 = new ArrayList<StudentAttendance>(kotlin.collections.v.Y((Iterable<?>)attendances, 10));
            for (final UMStudentAttendance umStudentAttendance : attendances) {
                k0.o(umStudentAttendance, "umStudentAttendance");
                list4.add(e.a(umStudentAttendance));
            }
            list.add(new StudentAbsenceResult(v, (List<StudentAbsence>)list2, (List<StudentAbsence>)list3, (List<StudentAttendance>)list4, ((UMAbsenceResult)entry.getValue()).separateSaveAllowed));
        }
        h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            Object I;
            int J;
            final /* synthetic */ List<StudentAbsenceResult> K;
            final /* synthetic */ k0 L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    Object I;
                    int J;
                    final /* synthetic */ List<StudentAbsenceResult> K = this.K;
                    final /* synthetic */ k0 L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int j = this.J;
                while (true) {
                    Iterator<Object> iterator = null;
                    Label_0089: {
                        if (j == 0) {
                            c1.n(o);
                            final List<StudentAbsenceResult> k = this.K;
                            final k0 l = this.L;
                            iterator = k.iterator();
                            final p<r0, kotlin.coroutines.d<? super j2>, Object> p = this;
                            break Label_0089;
                        }
                        if (j != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        final Iterator<Object> iterator2 = (Iterator<Object>)this.I;
                        iterator = (Iterator<Object>)this.H;
                        final k0 l = (k0)this.G;
                        c1.n(o);
                        final p<r0, kotlin.coroutines.d<? super j2>, Object> p = this;
                        while (iterator2.hasNext()) {
                            final StudentAbsence studentAbsence = iterator2.next();
                            p.G = l;
                            p.H = iterator;
                            p.I = iterator2;
                            p.J = 1;
                            if (l.a(studentAbsence, p) == h) {
                                return h;
                            }
                        }
                    }
                    if (iterator.hasNext()) {
                        final Iterator<Object> iterator2 = (Iterator<Object>)iterator.next().getAbsences().iterator();
                        continue;
                    }
                    break;
                }
                return j2.a;
            }
        }, 1, (Object)null);
        return list;
    }
    
    private final rx.g<Boolean> m2() {
        final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
        Object c = this.G1().c(this.G);
        try {
            final s0<m4.a> b0 = ((f0)c).f3(m4.a.class).D("synced", Boolean.FALSE).b0();
            kotlin.jvm.internal.k0.o(b0, "realm.where(RealmHomework::class.java).equalTo(\"synced\", false).findAll()");
            final com.untis.mobile.utils.mapper.realmToModel.p a = com.untis.mobile.utils.mapper.realmToModel.p.a;
            final Iterator<Object> iterator = b0.iterator();
            while (iterator.hasNext()) {
                list.add((T)a.b(iterator.next()));
            }
            kotlin.io.c.a((Closeable)c, null);
            rx.g g;
            if (list.isEmpty()) {
                g = rx.g.U2((Object)Boolean.TRUE);
                c = "just(true)";
            }
            else {
                c = new ArrayList(v.Y((Iterable<?>)list, 10));
                for (final HomeWork homeWork : list) {
                    ((Collection<rx.g>)c).add(this.e0(homeWork).d4((rx.functions.p)new com.untis.mobile.services.classbook.k(this, homeWork)));
                }
                g = rx.g.w0((Iterable)c).k3((rx.functions.p)com.untis.mobile.services.classbook.w.G);
                c = "concat(homeWorks.map { homeWork ->\n                submit(homeWork).onErrorResumeNext { throwable ->\n                    val cause = throwable.cause\n\n                    if (cause != null && cause is JsonRpcError) {\n                        if (cause.isAnyOf(NoRight)) {\n                            GlobalScope.launch {\n                                delete(homeWork)\n                            }\n                        }\n                    }\n\n                    return@onErrorResumeNext Observable.just(null)\n                }\n            })\n            .map { true }";
            }
            kotlin.jvm.internal.k0.o(g, (String)c);
            return (rx.g<Boolean>)g;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a((Closeable)c, t);
            }
        }
    }
    
    private static final List n1(final com.untis.mobile.utils.mapper.apiToModel.d d, final Period period, final k0 k0, final CreateImmediateAbsenceResponse createImmediateAbsenceResponse) {
        k0.p(d, "$absenceMapper");
        k0.p(period, "$period");
        k0.p(k0, "this$0");
        final List<UMStudentAbsence> absences = createImmediateAbsenceResponse.absences;
        ArrayList<StudentAbsence> list;
        if (absences == null) {
            list = null;
        }
        else {
            final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
            final Iterator<Object> iterator = absences.iterator();
            while (true) {
                list = list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final UMStudentAbsence umStudentAbsence = iterator.next();
                final long id = period.getId();
                k0.o(umStudentAbsence, "umStudentAbsence");
                final StudentAbsence g = d.g(id, umStudentAbsence);
                if (g == null) {
                    continue;
                }
                list2.add(g);
            }
        }
        ArrayList<StudentAbsence> list3;
        if ((list3 = list) == null) {
            list3 = new ArrayList<StudentAbsence>();
        }
        h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            Object G;
            Object H;
            int I;
            final /* synthetic */ List<StudentAbsence> J;
            final /* synthetic */ k0 K;
            final /* synthetic */ Period L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ List<StudentAbsence> J = this.J;
                    final /* synthetic */ k0 K = this.K;
                    final /* synthetic */ Period L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object s) {
                final Object h = b.h();
                final int i = this.I;
                Iterator<Object> iterator;
                k0 j;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c1.n(s);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        iterator = (Iterator<Object>)this.H;
                        final k0 k0 = (k0)this.G;
                        c1.n(s);
                        j = k0;
                    }
                }
                else {
                    c1.n(s);
                    final List<StudentAbsence> l = this.J;
                    j = this.K;
                    iterator = l.iterator();
                }
                while (iterator.hasNext()) {
                    final StudentAbsence studentAbsence = iterator.next();
                    this.G = j;
                    this.H = iterator;
                    this.I = 1;
                    if (j.a(studentAbsence, this) == h) {
                        return h;
                    }
                }
                if ((s = this.K.S(this.L.getId())) == null) {
                    s = new Classbook(this.L.getId(), null, null, null, null, null, null, false, false, null, 1022, null);
                }
                final Set<Object> m5 = v.M5((Iterable<?>)((Classbook)s).getAbsences());
                final List<StudentAbsence> j2 = this.J;
                final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)j2, 10));
                final Iterator<Object> iterator2 = j2.iterator();
                while (iterator2.hasNext()) {
                    list.add(kotlin.coroutines.jvm.internal.b.g(iterator2.next().getId()));
                }
                m5.addAll(list);
                ((Classbook)s).setAbsences(v.M5((Iterable<? extends Long>)m5));
                final k0 k2 = this.K;
                this.G = null;
                this.H = null;
                this.I = 2;
                if (k2.a0((Classbook)s, this) == h) {
                    return h;
                }
                return kotlin.j2.a;
            }
        }, 1, (Object)null);
        return list3;
    }
    
    private static final rx.g n2(final k0 k0, final HomeWork homeWork, Throwable cause) {
        k0.p(k0, "this$0");
        k0.p(homeWork, "$homeWork");
        cause = cause.getCause();
        if (cause != null && cause instanceof JsonRpcError && ((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.NoRight)) {
            h.f((r0)b2.G, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ k0 H;
                final /* synthetic */ HomeWork I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ k0 H = this.H;
                        final /* synthetic */ HomeWork I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((k0$j1)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                        final k0 h2 = this.H;
                        final HomeWork i = this.I;
                        this.G = 1;
                        if (h2.f0(i, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 3, (Object)null);
        }
        return rx.g.U2((Object)null);
    }
    
    private static final List o1(final com.untis.mobile.utils.mapper.apiToModel.d d, final Period period, final k0 k0, final CreateImmediateLatenessResponse createImmediateLatenessResponse) {
        k0.p(d, "$absenceMapper");
        k0.p(period, "$period");
        k0.p(k0, "this$0");
        final List<UMStudentAbsence> absences = createImmediateLatenessResponse.absences;
        ArrayList<StudentAbsence> list;
        if (absences == null) {
            list = null;
        }
        else {
            final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
            final Iterator<Object> iterator = absences.iterator();
            while (true) {
                list = list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final UMStudentAbsence umStudentAbsence = iterator.next();
                final long id = period.getId();
                k0.o(umStudentAbsence, "umStudentAbsence");
                final StudentAbsence g = d.g(id, umStudentAbsence);
                if (g == null) {
                    continue;
                }
                list2.add(g);
            }
        }
        ArrayList<StudentAbsence> list3;
        if ((list3 = list) == null) {
            list3 = new ArrayList<StudentAbsence>();
        }
        h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            Object G;
            Object H;
            int I;
            final /* synthetic */ List<StudentAbsence> J;
            final /* synthetic */ k0 K;
            final /* synthetic */ Period L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ List<StudentAbsence> J = this.J;
                    final /* synthetic */ k0 K = this.K;
                    final /* synthetic */ Period L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object s) {
                final Object h = b.h();
                final int i = this.I;
                k0 k;
                Iterator<Object> iterator2;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c1.n(s);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final Iterator iterator = (Iterator)this.H;
                        k = (k0)this.G;
                        c1.n(s);
                        iterator2 = (Iterator<Object>)iterator;
                    }
                }
                else {
                    c1.n(s);
                    final List<StudentAbsence> j = this.J;
                    k = this.K;
                    iterator2 = j.iterator();
                }
                while (iterator2.hasNext()) {
                    final StudentAbsence studentAbsence = iterator2.next();
                    this.G = k;
                    this.H = iterator2;
                    this.I = 1;
                    if (k.a(studentAbsence, this) == h) {
                        return h;
                    }
                }
                if ((s = this.K.S(this.L.getId())) == null) {
                    s = new Classbook(this.L.getId(), null, null, null, null, null, null, false, false, null, 1022, null);
                }
                final Set<Long> absences = ((Classbook)s).getAbsences();
                final List<StudentAbsence> l = this.J;
                final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)l, 10));
                final Iterator<Object> iterator3 = l.iterator();
                while (iterator3.hasNext()) {
                    list.add(kotlin.coroutines.jvm.internal.b.g(iterator3.next().getId()));
                }
                absences.addAll((Collection<? extends Long>)list);
                final k0 m = this.K;
                this.G = null;
                this.H = null;
                this.I = 2;
                if (m.a0((Classbook)s, this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 1, (Object)null);
        return list3;
    }
    
    private static final Boolean o2(final HomeWork homeWork) {
        return Boolean.TRUE;
    }
    
    private static final Boolean p1(final k0 k0, final StudentAbsence studentAbsence, final Period period, final DeleteAbsenceResponse deleteAbsenceResponse) {
        k0.p(k0, "this$0");
        k0.p(studentAbsence, "$studentAbsence");
        k0.p(period, "$period");
        if (deleteAbsenceResponse.success) {
            h.f((r0)b2.G, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
                int G;
                final /* synthetic */ k0 H;
                final /* synthetic */ StudentAbsence I;
                final /* synthetic */ Period J;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                        int G;
                        final /* synthetic */ k0 H = this.H;
                        final /* synthetic */ StudentAbsence I = this.I;
                        final /* synthetic */ Period J = this.J;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((k0$n)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            if (g == 2) {
                                c1.n(o);
                                return j2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(o);
                        }
                    }
                    else {
                        c1.n(o);
                        final k0 h2 = this.H;
                        final StudentAbsence i = this.I;
                        this.G = 1;
                        if (h2.f(i, this) == h) {
                            return h;
                        }
                    }
                    Classbook s;
                    if ((s = this.H.S(this.J.getId())) == null) {
                        s = new Classbook(this.J.getId(), null, null, null, null, null, null, false, false, null, 1022, null);
                    }
                    s.getAbsences().remove(kotlin.coroutines.jvm.internal.b.g(this.I.getId()));
                    final k0 h3 = this.H;
                    this.G = 2;
                    if (h3.a0(s, this) == h) {
                        return h;
                    }
                    return j2.a;
                }
            }, 3, (Object)null);
        }
        return deleteAbsenceResponse.success;
    }
    
    private final rx.g<Boolean> p2() {
        final ArrayList<LessonTopic> list = new ArrayList<LessonTopic>();
        Object o = this.G1().c(this.G);
        try {
            final s0<v4.a> b0 = ((f0)o).f3(v4.a.class).D("synced", Boolean.FALSE).b0();
            kotlin.jvm.internal.k0.o(b0, "realm.where(RealmLessonTopic::class.java).equalTo(\"synced\", false).findAll()");
            for (final v4.a a : b0) {
                final r a2 = r.a;
                kotlin.jvm.internal.k0.o(a, "realmLessonTopic");
                list.add((T)a2.a(a));
            }
            kotlin.io.c.a((Closeable)o, null);
            String s;
            if (list.isEmpty()) {
                o = rx.g.U2((Object)Boolean.TRUE);
                s = "just(true)";
            }
            else {
                o = new ArrayList<rx.g>(v.Y((Iterable<?>)list, 10));
                for (final LessonTopic lessonTopic : list) {
                    ((Collection<rx.g>)o).add(this.Y(lessonTopic).d4((rx.functions.p)new com.untis.mobile.services.classbook.m(this, lessonTopic)));
                }
                o = rx.g.w0((Iterable)o).k3((rx.functions.p)z.G);
                s = "concat(lessontopics.map { lessonTopic ->\n                submit(lessonTopic).onErrorResumeNext { throwable ->\n                    val cause = throwable.cause\n\n                    if (cause != null && cause is JsonRpcError) {\n                        if (cause.isAnyOf(NoRight)) {\n                            GlobalScope.launch {\n                                delete(lessonTopic)\n                            }\n                        }\n                    }\n\n                    return@onErrorResumeNext Observable.just(null)\n                }\n            })\n            .map { true }";
            }
            kotlin.jvm.internal.k0.o(o, s);
            return (rx.g<Boolean>)o;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a((Closeable)o, t);
            }
        }
    }
    
    private static final StudentAbsenceResult q1(final StudentAbsence studentAbsence, final com.untis.mobile.utils.mapper.apiToModel.d d, final Period period, final com.untis.mobile.utils.mapper.apiToModel.e e, final k0 k0, final EditAbsenceResponse editAbsenceResponse) {
        k0.p(studentAbsence, "$studentAbsence");
        k0.p(d, "$absenceMapper");
        k0.p(period, "$period");
        k0.p(e, "$attendanceMapper");
        k0.p(k0, "this$0");
        final UMAbsenceResult result = editAbsenceResponse.result;
        final Student student = studentAbsence.getStudent();
        final List<UMStudentAbsence> absences = result.absences;
        k0.o(absences, "umAbsenceResult.absences");
        final ArrayList list = new ArrayList<StudentAbsence>(v.Y((Iterable<?>)absences, 10));
        for (final UMStudentAbsence umStudentAbsence : absences) {
            final long id = period.getId();
            k0.o(umStudentAbsence, "umStudentAbsence");
            list.add(d.g(id, umStudentAbsence));
        }
        final List<UMStudentAbsence> conflicts = result.conflicts;
        k0.o(conflicts, "umAbsenceResult.conflicts");
        final ArrayList list2 = new ArrayList<StudentAbsence>(v.Y((Iterable<?>)conflicts, 10));
        for (final UMStudentAbsence umStudentAbsence2 : conflicts) {
            final long id2 = period.getId();
            k0.o(umStudentAbsence2, "umStudentAbsence");
            list2.add(d.g(id2, umStudentAbsence2));
        }
        final List<UMStudentAttendance> attendances = result.attendances;
        k0.o(attendances, "umAbsenceResult.attendances");
        final ArrayList list3 = new ArrayList<StudentAttendance>(v.Y((Iterable<?>)attendances, 10));
        for (final UMStudentAttendance umStudentAttendance : attendances) {
            k0.o(umStudentAttendance, "umStudentAttendance");
            list3.add(e.a(umStudentAttendance));
        }
        final StudentAbsenceResult studentAbsenceResult = new StudentAbsenceResult(student, (List<StudentAbsence>)list, (List<StudentAbsence>)list2, (List<StudentAttendance>)list3, result.separateSaveAllowed);
        h.h((kotlin.coroutines.g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            int I;
            final /* synthetic */ StudentAbsenceResult J;
            final /* synthetic */ k0 K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ StudentAbsenceResult J = this.J;
                    final /* synthetic */ k0 K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$u)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int i = this.I;
                k0 k;
                Iterator<Object> iterator2;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final Iterator iterator = (Iterator)this.H;
                    k = (k0)this.G;
                    c1.n(o);
                    iterator2 = (Iterator<Object>)iterator;
                }
                else {
                    c1.n(o);
                    final List<StudentAbsence> absences = this.J.getAbsences();
                    k = this.K;
                    iterator2 = absences.iterator();
                }
                while (iterator2.hasNext()) {
                    final StudentAbsence studentAbsence = iterator2.next();
                    this.G = k;
                    this.H = iterator2;
                    this.I = 1;
                    if (k.a(studentAbsence, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        return studentAbsenceResult;
    }
    
    private static final rx.g q2(final k0 k0, final LessonTopic lessonTopic, Throwable cause) {
        k0.p(k0, "this$0");
        k0.p(lessonTopic, "$lessonTopic");
        cause = cause.getCause();
        if (cause != null && cause instanceof JsonRpcError && ((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.NoRight)) {
            h.f((r0)b2.G, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ k0 H;
                final /* synthetic */ LessonTopic I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ k0 H = this.H;
                        final /* synthetic */ LessonTopic I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((k0$k1)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                        final k0 h2 = this.H;
                        final LessonTopic i = this.I;
                        this.G = 1;
                        if (h2.G(i, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 3, (Object)null);
        }
        return rx.g.U2((Object)null);
    }
    
    private final ApiService r1() {
        return this.K.getValue();
    }
    
    private static final Boolean r2(final LessonTopic lessonTopic) {
        return Boolean.TRUE;
    }
    
    private final com.untis.mobile.persistence.dao.classbook.a s1() {
        return this.U.getValue();
    }
    
    private final rx.g<Boolean> s2() {
        final ArrayList<PeriodInfo> list = new ArrayList<PeriodInfo>();
        Object o = this.G1().c(this.G);
        try {
            final s0<n4.a> b0 = ((f0)o).f3(n4.a.class).D("sync", Boolean.FALSE).b0();
            kotlin.jvm.internal.k0.o(b0, "realm.where(RealmPeriodInfo::class.java).equalTo(\"sync\", false).findAll()");
            final com.untis.mobile.utils.mapper.realmToModel.w a = com.untis.mobile.utils.mapper.realmToModel.w.a;
            final Iterator<Object> iterator = b0.iterator();
            while (iterator.hasNext()) {
                list.add((T)a.b(iterator.next()));
            }
            kotlin.io.c.a((Closeable)o, null);
            String s;
            if (list.isEmpty()) {
                o = rx.g.U2((Object)Boolean.TRUE);
                s = "just(true)";
            }
            else {
                o = new ArrayList<rx.g>(v.Y((Iterable<?>)list, 10));
                for (final PeriodInfo periodInfo : list) {
                    ((Collection<rx.g>)o).add(this.p(periodInfo).d4((rx.functions.p)new l(this, periodInfo)));
                }
                o = rx.g.w0((Iterable)o).k3((rx.functions.p)x.G);
                s = "concat(periodInfos.map { periodInfo ->\n                submit(periodInfo).onErrorResumeNext { throwable ->\n                    val cause = throwable.cause\n\n                    if (cause != null && cause is JsonRpcError) {\n                        if (cause.isAnyOf(NoRight)) {\n                            GlobalScope.launch {\n                                delete(periodInfo)\n                            }\n                        }\n                    }\n\n                    return@onErrorResumeNext Observable.just(null)\n                }\n            })\n            .map { true }";
            }
            kotlin.jvm.internal.k0.o(o, s);
            return (rx.g<Boolean>)o;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a((Closeable)o, t);
            }
        }
    }
    
    private final com.untis.mobile.persistence.dao.classbook.c t1() {
        return this.P.getValue();
    }
    
    private static final rx.g t2(final k0 k0, final PeriodInfo periodInfo, Throwable cause) {
        k0.p(k0, "this$0");
        k0.p(periodInfo, "$periodInfo");
        cause = cause.getCause();
        if (cause != null && cause instanceof JsonRpcError && ((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.NoRight)) {
            h.f((r0)b2.G, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ k0 H;
                final /* synthetic */ PeriodInfo I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ k0 H = this.H;
                        final /* synthetic */ PeriodInfo I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((k0$l1)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                        final k0 h2 = this.H;
                        final PeriodInfo i = this.I;
                        this.G = 1;
                        if (h2.A(i, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 3, (Object)null);
        }
        return rx.g.U2((Object)null);
    }
    
    private final ClassbookSettings u1() {
        return this.Y.getValue();
    }
    
    private static final Boolean u2(final PeriodInfo periodInfo) {
        return Boolean.TRUE;
    }
    
    private final Context v1() {
        return this.H.getValue();
    }
    
    private final com.untis.mobile.persistence.dao.classbook.e w1() {
        return this.Q.getValue();
    }
    
    private final i x1() {
        return this.S.getValue();
    }
    
    private final k y1() {
        return this.N.getValue();
    }
    
    private final m z1() {
        return this.O.getValue();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object A(@e final PeriodInfo periodInfo, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ PeriodInfo I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ PeriodInfo I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$m)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object c) {
                b.h();
                if (this.G == 0) {
                    c1.n(c);
                    c = k0.this.G1().c(k0.b1(this.H));
                    final PeriodInfo i = this.I;
                    try {
                        ((f0)c).beginTransaction();
                        ((f0)c).f3(n4.a.class).I("id", kotlin.coroutines.jvm.internal.b.g(i.getId())).b0().T3();
                        ((f0)c).n();
                        final j2 a = j2.a;
                        kotlin.io.c.a((Closeable)c, null);
                        return a;
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            kotlin.io.c.a((Closeable)c, t);
                        }
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public AbsenceReason B() {
        return this.u1().getDefaultAbsenceReason();
    }
    
    @e
    @Override
    public rx.g<List<StudentAbsence>> C(final long n, @e final List<StudentAbsence> list) {
        kotlin.jvm.internal.k0.p(list, "basicStudentAbsences");
        final rx.g k3 = this.r1().submitAbsences(this.M1(), n, list).k3((rx.functions.p)new com.untis.mobile.services.classbook.r(new com.untis.mobile.utils.mapper.apiToModel.d(this.G), n, this));
        kotlin.jvm.internal.k0.o(k3, "apiService\n            .submitAbsences(profile(), periodId, basicStudentAbsences)\n            .map { response ->\n                val studentAbsences = response.absences.mapNotNull { umStudentAbsence ->\n                    studentAbsenceMapper.toStudentAbsence(\n                        periodId,\n                        umStudentAbsence\n                    )\n                }\n\n                GlobalScope.launch {\n                    studentAbsences.forEach { save(it) }\n                }\n\n                return@map studentAbsences\n            }");
        return (rx.g<List<StudentAbsence>>)k3;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public LessonTopic D(final long n) {
        return this.z1().a(this.G, n);
    }
    
    @e
    @Override
    public List<Event> E(@e final Collection<Long> collection) {
        kotlin.jvm.internal.k0.p(collection, "ids");
        final List<Event> b = this.w1().b(this.G);
        final ArrayList<Event> list = new ArrayList<Event>();
        for (final Event next : b) {
            if (collection.contains(next.getId())) {
                list.add(next);
            }
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object F(final long n, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$r)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.z1().d(k0.b1(this.H), this.I);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object G(@e final LessonTopic lessonTopic, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ LessonTopic I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ LessonTopic I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$k)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object c) {
                b.h();
                if (this.G == 0) {
                    c1.n(c);
                    c = k0.this.G1().c(k0.b1(this.H));
                    final LessonTopic i = this.I;
                    try {
                        ((f0)c).beginTransaction();
                        ((f0)c).f3(v4.a.class).I("periodId", kotlin.coroutines.jvm.internal.b.g(i.getPeriodId())).b0().T3();
                        ((f0)c).n();
                        final j2 a = j2.a;
                        kotlin.io.c.a((Closeable)c, null);
                        return a;
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            kotlin.io.c.a((Closeable)c, t);
                        }
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public List<HomeWork> H(@e final Collection<Long> collection) {
        kotlin.jvm.internal.k0.p(collection, "ids");
        final List<HomeWork> b = this.y1().b(this.G);
        final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
        for (final HomeWork next : b) {
            if (collection.contains(next.getId()) || collection.isEmpty()) {
                list.add(next);
            }
        }
        return list;
    }
    
    @e
    @Override
    public rx.g<Boolean> I() {
        rx.g g;
        String s;
        if (this.Z) {
            g = rx.g.U2((Object)Boolean.FALSE);
            s = "just(false)";
        }
        else if (g0.a((Context)UntisMobileApplication.I.b())) {
            this.Z = true;
            g = rx.g.H2((Callable)com.untis.mobile.services.classbook.c.G).E5(rx.schedulers.c.f()).j2((rx.functions.p)new com.untis.mobile.services.classbook.f(this)).j2((rx.functions.p)new com.untis.mobile.services.classbook.g(this)).j2((rx.functions.p)new com.untis.mobile.services.classbook.e(this)).j2((rx.functions.p)new com.untis.mobile.services.classbook.d(this)).j2((rx.functions.p)new com.untis.mobile.services.classbook.j0(this)).Q3(rx.android.schedulers.a.c()).P1((rx.functions.a)new n(this)).S1((rx.functions.b)new y(this));
            s = "fromCallable { true }\n                .subscribeOn(Schedulers.newThread())\n                .flatMap { synchronizeLessonTopics() }\n                .flatMap { synchronizeHomeWorks() }\n                .flatMap { synchronizeAbsences() }\n                .flatMap { synchronizeClassRegEvents() }\n                .flatMap { synchronizePeriodInfos() }\n                .observeOn(AndroidSchedulers.mainThread())\n                .doOnCompleted { syncronize = false }\n                .doOnError { syncronize = false }";
        }
        else {
            g = rx.g.U2((Object)Boolean.TRUE);
            s = "just(true)";
        }
        kotlin.jvm.internal.k0.o(g, s);
        return (rx.g<Boolean>)g;
    }
    
    @e
    @Override
    public List<HomeWork> J() {
        final List<HomeWork> b = this.y1().b(this.G);
        final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
        for (final HomeWork next : b) {
            if (next.getLocal()) {
                list.add(next);
            }
        }
        return list;
    }
    
    @Override
    public boolean K() {
        return this.u1().getShowAbsenceText();
    }
    
    @e
    @Override
    public rx.g<List<StudentAbsence>> L(@e final Period period, @e final Student student) {
        kotlin.jvm.internal.k0.p(period, "period");
        kotlin.jvm.internal.k0.p(student, "student");
        final rx.g q3 = this.r1().createImmediateAbsence(this.M1(), period.getId(), student.getId(), period.getStart(), period.getEnd()).Q3(rx.schedulers.c.e()).k3((rx.functions.p)new com.untis.mobile.services.classbook.s(new com.untis.mobile.utils.mapper.apiToModel.d(this.G), period, this)).Q3(rx.android.schedulers.a.c());
        kotlin.jvm.internal.k0.o(q3, "apiService\n            .createImmediateAbsence(profile(), period.id, student.id, period.start, period.end)\n            .observeOn(Schedulers.io())\n            .map { response ->\n                val absences = response.absences\n                    ?.mapNotNull { umStudentAbsence ->\n                        absenceMapper.toStudentAbsence(\n                            period.id,\n                            umStudentAbsence\n                        )\n                    }\n                    ?: ArrayList()\n\n                runBlocking {\n                    absences.forEach { absence -> save(absence) }\n\n                    val classbook = classbook(period.id) ?: Classbook(period.id)\n                    val classbookabsences = classbook.absences.toMutableSet()\n                    classbookabsences.addAll(absences.map { it.id })\n                    classbook.absences = classbookabsences.toMutableSet()\n                    save(classbook)\n                }\n\n\n                return@map absences\n            }\n            .observeOn(AndroidSchedulers.mainThread())");
        return (rx.g<List<StudentAbsence>>)q3;
    }
    
    @e
    @Override
    public rx.g<List<StudentAbsence>> M(@e final Period period, @e final Student student) {
        kotlin.jvm.internal.k0.p(period, "period");
        kotlin.jvm.internal.k0.p(student, "student");
        final rx.g q3 = this.r1().createImmediateLateness(this.M1(), period.getId(), student.getId()).Q3(rx.schedulers.c.e()).k3((rx.functions.p)new com.untis.mobile.services.classbook.t(new com.untis.mobile.utils.mapper.apiToModel.d(this.G), period, this)).Q3(rx.android.schedulers.a.c());
        kotlin.jvm.internal.k0.o(q3, "apiService\n            .createImmediateLateness(profile(), period.id, student.id)\n            .observeOn(Schedulers.io())\n            .map { response ->\n                val absences = response.absences?.mapNotNull { umStudentAbsence ->\n                    absenceMapper.toStudentAbsence(\n                        period.id,\n                        umStudentAbsence\n                    )\n                }\n                    ?: ArrayList()\n\n                runBlocking {\n                    absences.forEach { absence -> save(absence) }\n\n                    val classbook = classbook(period.id) ?: Classbook(period.id)\n                    classbook.absences.addAll(absences.map { it.id })\n                    save(classbook)\n                }\n\n\n                return@map absences\n            }\n            .observeOn(AndroidSchedulers.mainThread())");
        return (rx.g<List<StudentAbsence>>)q3;
    }
    
    @Override
    public boolean N() {
        return this.u1().getAbsenceCheckRequired();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object O(final long n, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$t)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.I1().d(k0.b1(this.H), this.I);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object P(final long n, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            Object I;
            int J;
            final /* synthetic */ k0 K;
            final /* synthetic */ long L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    Object I;
                    int J;
                    final /* synthetic */ k0 K = this.K;
                    final /* synthetic */ long L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$q)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int j = this.J;
                Iterator<Object> iterator;
                k0 k;
                Classbook s;
                if (j != 0) {
                    if (j != 1) {
                        if (j == 2) {
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        iterator = (Iterator<Object>)this.I;
                        k = (k0)this.H;
                        final Classbook classbook = (Classbook)this.G;
                        c1.n(o);
                        s = classbook;
                    }
                }
                else {
                    c1.n(o);
                    s = this.K.S(this.L);
                    if (s == null) {
                        return j2.a;
                    }
                    final Set<HomeWork> homeWorks = s.getHomeWorks();
                    k = this.K;
                    iterator = homeWorks.iterator();
                }
                while (iterator.hasNext()) {
                    final HomeWork homeWork = iterator.next();
                    this.G = s;
                    this.H = k;
                    this.I = iterator;
                    this.J = 1;
                    if (k.f0(homeWork, this) == h) {
                        return h;
                    }
                }
                s.setHomeWorks(new HashSet<HomeWork>());
                final k0 i = this.K;
                this.G = null;
                this.H = null;
                this.I = null;
                this.J = 2;
                if (i.a0(s, this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object Q(@e final LessonTopic lessonTopic, @e final kotlin.coroutines.d<? super LessonTopic> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super LessonTopic>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ LessonTopic I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super LessonTopic>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ LessonTopic I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super LessonTopic> d) {
                return ((k0$i0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.z1().c(k0.b1(this.H), this.I);
                    return this.I;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object R(@e final PeriodInfo periodInfo, @e final kotlin.coroutines.d<? super PeriodInfo> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super PeriodInfo>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ PeriodInfo I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super PeriodInfo>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ PeriodInfo I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super PeriodInfo> d) {
                return ((k0$b0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.E1().c(k0.b1(this.H), this.I);
                    return this.I;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Classbook S(final long n) {
        Classbook a;
        if ((a = this.s1().a(this.G, n)) == null) {
            a = new Classbook(n, null, null, null, null, null, null, false, false, null, 1022, null);
        }
        a.getHomeWorks().addAll(this.A1(n));
        return a;
    }
    
    @e
    @Override
    public rx.g<List<LessonTopic>> T(final long n) {
        final rx.g k3 = this.r1().getLessonTopic(this.M1(), n).k3((rx.functions.p)u.G);
        kotlin.jvm.internal.k0.o(k3, "apiService\n            .getLessonTopic(profile(), periodId)\n            .map { response ->\n                val list = response.previousTopics\n                    .map { umLessonTopic ->\n                        LessonTopic(\n                            periodId = umLessonTopic.periodId,\n                            text = umLessonTopic.text ?: \"\",\n                            start = Mapper.isoStringToDateTime(umLessonTopic.startDateTime),\n                            end = Mapper.isoStringToDateTime(umLessonTopic.endDateTime),\n                            attachments = umLessonTopic.attachments.map { attachment ->\n                                DriveAttachment(\n                                    id = attachment.id,\n                                    name = attachment.name,\n                                    url = attachment.url\n                                )\n                            },\n                            synced = true\n                        )\n                    }\n\n                val combined = ArrayList<LessonTopic>()\n\n                list.forEach { lessontopic ->\n                    if (combined.none {\n                            it.start.toLocalDate().isEqual(lessontopic.start.toLocalDate())\n                                    && it.text.equals(lessontopic.text, true)\n                        }) {\n                        combined.add(lessontopic)\n                    }\n                }\n\n                return@map combined\n            }");
        return (rx.g<List<LessonTopic>>)k3;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public HomeWork U(final long n) {
        return this.y1().a(this.G, n);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object V(final long n, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$o)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.s1().d(k0.b1(this.H), this.I);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object W(@e final Exemption exemption, @e final kotlin.coroutines.d<? super Exemption> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super Exemption>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ Exemption I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Exemption>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ Exemption I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Exemption> d) {
                return ((k0$d0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.x1().c(k0.b1(this.H), v.k(this.I));
                    return this.I;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object X(@e final Event event, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ Event I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ Event I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$l)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.w1().c(k0.b1(this.H), this.I);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public rx.g<LessonTopic> Y(@e final LessonTopic lessonTopic) {
        kotlin.jvm.internal.k0.p(lessonTopic, "lessonTopic");
        final rx.g k3 = this.r1().submitLessonTopic(this.M1(), lessonTopic).k3((rx.functions.p)new com.untis.mobile.services.classbook.g0(lessonTopic, this));
        kotlin.jvm.internal.k0.o(k3, "apiService\n            .submitLessonTopic(profile(), lessonTopic)\n            .map { response ->\n                lessonTopic.synced = response.success\n\n                return@map runBlocking { save(lessonTopic) }\n            }");
        return (rx.g<LessonTopic>)k3;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public StudentAbsence Z(final long n) {
        return this.I1().a(this.G, n);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object a(@e final StudentAbsence studentAbsence, @e final kotlin.coroutines.d<? super StudentAbsence> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super StudentAbsence>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ StudentAbsence I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super StudentAbsence>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ StudentAbsence I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super StudentAbsence> d) {
                return ((k0$c0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.I1().c(k0.b1(this.H), v.k(this.I));
                    return this.I;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object a0(@e final Classbook classbook, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ Classbook I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ Classbook I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$e0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object next) {
                b.h();
                if (this.G == 0) {
                    c1.n(next);
                    final Classbook a = k0.this.s1().a(k0.b1(this.H), this.I.getId());
                    ArrayList<?> list = null;
                    if (a != null) {
                        final Set<HomeWork> homeWorks = a.getHomeWorks();
                        if (homeWorks != null) {
                            final ArrayList<Object> list2 = new ArrayList<Object>();
                            final Iterator<Object> iterator = homeWorks.iterator();
                            while (true) {
                                list = list2;
                                if (!iterator.hasNext()) {
                                    break;
                                }
                                next = iterator.next();
                                if (!kotlin.coroutines.jvm.internal.b.a(((HomeWork)next).getLocal())) {
                                    continue;
                                }
                                list2.add(next);
                            }
                        }
                    }
                    List<?> e;
                    if ((e = list) == null) {
                        e = v.E();
                    }
                    final Set<Object> m5 = v.M5((Iterable<?>)this.I.getHomeWorks());
                    m5.addAll(e);
                    this.I.setHomeWorks(v.M5((Iterable<? extends HomeWork>)m5));
                    k0.this.s1().h(k0.b1(this.H), this.I);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public rx.g<StudentAbsenceResult> b(@e final Period period, @e final StudentAbsence studentAbsence, @e final CreateAbsenceStrategy createAbsenceStrategy) {
        kotlin.jvm.internal.k0.p(period, "period");
        kotlin.jvm.internal.k0.p(studentAbsence, "studentAbsence");
        kotlin.jvm.internal.k0.p(createAbsenceStrategy, "strategy");
        final rx.g q3 = this.r1().editAbsence(this.M1(), studentAbsence, createAbsenceStrategy).Q3(rx.schedulers.c.e()).k3((rx.functions.p)new com.untis.mobile.services.classbook.d0(studentAbsence, new com.untis.mobile.utils.mapper.apiToModel.d(this.G), period, new com.untis.mobile.utils.mapper.apiToModel.e(this.G), this)).Q3(rx.android.schedulers.a.c());
        kotlin.jvm.internal.k0.o(q3, "apiService\n            .editAbsence(profile(), studentAbsence, strategy)\n            .observeOn(Schedulers.io())\n            .map { result ->\n                val umAbsenceResult = result.result\n\n                val studentAbsenceResult = StudentAbsenceResult(\n                    student = studentAbsence.student,\n                    absences = umAbsenceResult.absences.map { umStudentAbsence ->\n                        absenceMapper.toStudentAbsence(\n                            period.id,\n                            umStudentAbsence\n                        )\n                    },\n                    conflicts = umAbsenceResult.conflicts.map { umStudentAbsence ->\n                        absenceMapper.toStudentAbsence(\n                            period.id,\n                            umStudentAbsence\n                        )\n                    },\n                    attendances = umAbsenceResult.attendances.map { umStudentAttendance ->\n                        attendanceMapper.toStudentAttendance(\n                            umStudentAttendance\n                        )\n                    },\n                    separateSaveAllowed = umAbsenceResult.separateSaveAllowed\n                )\n\n                runBlocking {\n                    studentAbsenceResult.absences.forEach { absence -> save(absence) }\n                }\n\n                return@map studentAbsenceResult\n            }\n            .observeOn(AndroidSchedulers.mainThread())");
        return (rx.g<StudentAbsenceResult>)q3;
    }
    
    @e
    @Override
    public List<HomeWork> b0(final long n) {
        final Classbook s = this.S(n);
        if (s == null) {
            return new ArrayList<HomeWork>();
        }
        return (List<HomeWork>)v.I5((Iterable<?>)s.getHomeWorks());
    }
    
    @e
    @Override
    public rx.g<List<StudentAbsenceResult>> c(@e final Period period, @e final StudentAbsence studentAbsence, @e final CreateAbsenceStrategy createAbsenceStrategy) {
        kotlin.jvm.internal.k0.p(period, "period");
        kotlin.jvm.internal.k0.p(studentAbsence, "studentAbsence");
        kotlin.jvm.internal.k0.p(createAbsenceStrategy, "strategy");
        final com.untis.mobile.utils.mapper.apiToModel.d d = new com.untis.mobile.utils.mapper.apiToModel.d(this.G);
        final com.untis.mobile.utils.mapper.apiToModel.e e = new com.untis.mobile.utils.mapper.apiToModel.e(this.G);
        final ArrayList<Long> list = new ArrayList<Long>();
        list.add(studentAbsence.getStudent().getId());
        final ApiService r1 = this.r1();
        final Profile m1 = this.M1();
        final long id = period.getId();
        final org.joda.time.c start = studentAbsence.getStart();
        final org.joda.time.c end = studentAbsence.getEnd();
        final AbsenceReason absenceReason = studentAbsence.getAbsenceReason();
        long id2;
        if (absenceReason == null) {
            id2 = 0L;
        }
        else {
            id2 = absenceReason.getId();
        }
        final rx.g q3 = r1.createAbsence(m1, createAbsenceStrategy, id, list, start, end, id2, studentAbsence.getText()).Q3(rx.schedulers.c.e()).k3((rx.functions.p)new com.untis.mobile.services.classbook.q(this, d, period, e)).Q3(rx.android.schedulers.a.c());
        kotlin.jvm.internal.k0.o(q3, "apiService\n            .createAbsence(\n                profile(),\n                strategy,\n                period.id,\n                studentIds,\n                studentAbsence.start,\n                studentAbsence.end,\n                studentAbsence.absenceReason?.id\n                    ?: 0,\n                studentAbsence.text\n            )\n            .observeOn(Schedulers.io())\n            .map { response ->\n                val studentAbsenceResults = response.resultPerStudent.entries\n                    .map { entry ->\n                        StudentAbsenceResult(\n                            student = masterDataService.student(entry.key)\n                                ?: Student(entry.key),\n                            absences = entry.value.absences.map { umStudentAbsence ->\n                                absenceMapper.toStudentAbsence(\n                                    period.id,\n                                    umStudentAbsence\n                                )\n                            },\n                            conflicts = entry.value.conflicts.map { umStudentAbsence ->\n                                absenceMapper.toStudentAbsence(\n                                    period.id,\n                                    umStudentAbsence\n                                )\n                            },\n                            attendances = entry.value.attendances.map { umStudentAttendance ->\n                                attendanceMapper.toStudentAttendance(\n                                    umStudentAttendance\n                                )\n                            },\n                            separateSaveAllowed = entry.value.separateSaveAllowed\n                        )\n                    }\n\n                runBlocking {\n                    studentAbsenceResults.forEach { studentAbsenceResult ->\n                        studentAbsenceResult.absences.forEach { absence ->\n                            save(\n                                absence\n                            )\n                        }\n                    }\n                }\n\n                studentAbsenceResults\n            }\n            .observeOn(AndroidSchedulers.mainThread())");
        return (rx.g<List<StudentAbsenceResult>>)q3;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c0(@e final UMSettings umSettings, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ UMSettings I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ UMSettings I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$f0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.u1().setShowAbsenceReason(this.I.showAbsenceReason);
                    k0.this.u1().setShowAbsenceText(this.I.showAbsenceText);
                    k0.this.u1().setAbsenceCheckRequired(this.I.absenceCheckRequired);
                    k0.this.u1().setDefaultAbsenceReason(k0.this.B1().H(this.I.defaultAbsenceReasonId));
                    k0.this.u1().setDefaultLatenessReason(k0.this.B1().H(this.I.defaultLatenessReasonId));
                    k0.this.u1().setDefaultAbsenceEndTime(AbsenceEndTime.Companion.fromUmDefaultAbsenceEndTime(this.I.defaultAbsenceEndTime));
                    final ClassbookSettings s0 = k0.this.u1();
                    final String customAbsenceEndTime = this.I.customAbsenceEndTime;
                    org.joda.time.v e;
                    if (customAbsenceEndTime == null) {
                        e = null;
                    }
                    else {
                        e = com.untis.mobile.utils.mapper.common.b.e(customAbsenceEndTime);
                    }
                    s0.setCustomAbsenceEndTime(e);
                    final f0 c = k0.this.G1().c(k0.b1(this.H));
                    final k0 h = this.H;
                    try {
                        c.beginTransaction();
                        final boolean showAbsenceReason = h.u1().getShowAbsenceReason();
                        final boolean showAbsenceText = h.u1().getShowAbsenceText();
                        final boolean absenceCheckRequired = h.u1().getAbsenceCheckRequired();
                        final AbsenceReason defaultAbsenceReason = h.u1().getDefaultAbsenceReason();
                        long longValue = 0L;
                        long longValue2 = 0L;
                        Label_0285: {
                            if (defaultAbsenceReason != null) {
                                final Long g = kotlin.coroutines.jvm.internal.b.g(defaultAbsenceReason.getId());
                                if (g != null) {
                                    longValue2 = g;
                                    break Label_0285;
                                }
                            }
                            longValue2 = 0L;
                        }
                        final AbsenceReason defaultLatenessReason = h.u1().getDefaultLatenessReason();
                        if (defaultLatenessReason != null) {
                            final Long g2 = kotlin.coroutines.jvm.internal.b.g(defaultLatenessReason.getId());
                            if (g2 != null) {
                                longValue = g2;
                            }
                        }
                        final int value = h.u1().getDefaultAbsenceEndTime().getValue();
                        final org.joda.time.v customAbsenceEndTime2 = h.u1().getCustomAbsenceEndTime();
                        String string;
                        if (customAbsenceEndTime2 == null || (string = customAbsenceEndTime2.toString()) == null) {
                            string = "";
                        }
                        c.G0(new z4.b(0L, showAbsenceReason, showAbsenceText, absenceCheckRequired, longValue2, longValue, value, string), new io.realm.q[0]);
                        c.n();
                        final j2 a = j2.a;
                        kotlin.io.c.a(c, null);
                        return a;
                    }
                    finally {
                        try {}
                        finally {
                            kotlin.io.c.a(c, (Throwable)o);
                        }
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public PeriodInfo d(final long n) {
        return this.E1().a(this.G, n);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public org.joda.time.v d0() {
        return this.u1().getCustomAbsenceEndTime();
    }
    
    @e
    @Override
    public rx.g<Boolean> e(@e final List<Long> list) {
        kotlin.jvm.internal.k0.p(list, "periodIds");
        return this.N1(this.M1(), list);
    }
    
    @e
    @Override
    public rx.g<HomeWork> e0(@e final HomeWork homeWork) {
        kotlin.jvm.internal.k0.p(homeWork, "homeWork");
        final rx.g k3 = this.r1().submitHomeWork(this.M1(), homeWork).k3((rx.functions.p)new e0(homeWork, this));
        kotlin.jvm.internal.k0.o(k3, "apiService\n            .submitHomeWork(profile(), homeWork)\n            .map { response ->\n                if (homeWork.id < 1 || homeWork.periodId == 0L) {\n                    runBlocking {\n                        delete(homeWork)\n                    }\n                }\n\n                homeWork.id = response.submittedHomeWorkId\n                homeWork.synced = response.success\n\n                return@map if (homeWork.periodId != 0L) runBlocking { save(homeWork) } else homeWork\n            }");
        return (rx.g<HomeWork>)k3;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object f(@e final StudentAbsence studentAbsence, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ StudentAbsence I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ StudentAbsence I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$h)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.I1().e(k0.b1(this.H), v.k(this.I));
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object f0(@e final HomeWork homeWork, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ HomeWork I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ HomeWork I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.y1().c(k0.b1(this.H), this.I);
                    k0.this.s1().g(k0.b1(this.H), this.I.getId());
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @Override
    public boolean g() {
        return this.u1().getShowAbsenceReason();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object g0(@e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$s)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.s1().f(k0.b1(this.H));
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @e
    @Override
    public List<Exemption> h(@e final Collection<Long> collection) {
        kotlin.jvm.internal.k0.p(collection, "ids");
        return this.x1().f(this.G, collection);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public AbsenceReason i() {
        return this.u1().getDefaultLatenessReason();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object j(@e final HomeWork homeWork, final boolean b, @e final kotlin.coroutines.d<? super HomeWork> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super HomeWork>, Object>(null) {
            int G;
            final /* synthetic */ HomeWork H;
            final /* synthetic */ k0 I;
            final /* synthetic */ boolean J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super HomeWork>, Object>(d) {
                    int G;
                    final /* synthetic */ HomeWork H = this.H;
                    final /* synthetic */ k0 I = this.I;
                    final /* synthetic */ boolean J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super HomeWork> d) {
                return ((k0$h0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                    if (this.H.getPeriodId() == 0L) {
                        k0.this.y1().c(k0.b1(this.I), this.H);
                        return this.H;
                    }
                    k0.this.y1().e(k0.b1(this.I), this.H, true);
                    if (this.J) {
                        final k0 i = this.I;
                        final HomeWork h2 = this.H;
                        this.G = 1;
                        if (i.Q1(h2, this) == h) {
                            return h;
                        }
                    }
                }
                return this.H;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @e
    @Override
    public List<StudentAbsence> k() {
        return this.I1().b(this.G);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object l(@e final Classbook classbook, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ Classbook I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ Classbook I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$i)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.s1().d(k0.b1(this.H), this.I.getId());
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Exemption m(final long n) {
        return this.x1().a(this.G, n);
    }
    
    @e
    @Override
    public rx.g<Boolean> n(@e final Period period) {
        kotlin.jvm.internal.k0.p(period, "period");
        final rx.g q3 = this.r1().submitAbsenceChecked(this.M1(), period.getAllPeriodIds()).Q3(rx.schedulers.c.e()).k3((rx.functions.p)new com.untis.mobile.services.classbook.o(this, period)).Q3(rx.android.schedulers.a.c());
        kotlin.jvm.internal.k0.o(q3, "apiService\n            .submitAbsenceChecked(profile(), period.getAllPeriodIds())\n            .observeOn(Schedulers.io())\n            .map { response ->\n                runBlocking {\n                    val classbook = classbook(period.id) ?: Classbook(period.id)\n                    classbook.absencesChecked = true\n                    save(classbook)\n                }\n\n                return@map response != null\n            }\n            .observeOn(AndroidSchedulers.mainThread())");
        return (rx.g<Boolean>)q3;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object o(@e final List<Long> list, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ List<Long> I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ List<Long> I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$p)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.s1().e(k0.b1(this.H), this.I);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public rx.g<PeriodInfo> p(@e final PeriodInfo periodInfo) {
        kotlin.jvm.internal.k0.p(periodInfo, "periodInfo");
        final rx.g k3 = this.r1().submitPeriodInfo(this.M1(), periodInfo).k3((rx.functions.p)new com.untis.mobile.services.classbook.f0(periodInfo, this));
        kotlin.jvm.internal.k0.o(k3, "apiService\n            .submitPeriodInfo(profile(), periodInfo)\n            .map { response ->\n                periodInfo.sync = response.success\n                return@map runBlocking { save(periodInfo) }\n            }");
        return (rx.g<PeriodInfo>)k3;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object q(@e final Event event, @e final kotlin.coroutines.d<? super Event> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super Event>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ Event I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Event>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ Event I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Event> d) {
                return ((k0$a0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.w1().d(k0.b1(this.H), this.I);
                    return this.I;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @e
    @Override
    public rx.g<List<Event>> r(@e final Event event, @e final List<Long> list) {
        kotlin.jvm.internal.k0.p(event, "event");
        kotlin.jvm.internal.k0.p(list, "additionalEntityIds");
        final Profile m1 = this.M1();
        final ArrayList<rx.g<SubmitClassRegEventsResponse>> list2 = new ArrayList<rx.g<SubmitClassRegEventsResponse>>();
        list2.add(this.r1().submitEvents(m1, event.getPeriodId(), event));
        final Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Event event2 = new Event(0L, event.getPeriodId(), event.getEntityType(), iterator.next().longValue(), event.getDateTime(), event.getText(), event.getEventReason(), false, 129, null);
            list2.add(this.r1().submitEvents(m1, event2.getPeriodId(), event2));
        }
        final rx.g d6 = rx.g.w0((Iterable)list2).k3((rx.functions.p)new com.untis.mobile.services.classbook.i(this, event)).d2((rx.functions.p)com.untis.mobile.services.classbook.v.G).D6();
        kotlin.jvm.internal.k0.o(d6, "concat(observables)\n            .map { response ->\n                runBlocking { delete(event) }\n\n                if (response.classRegEvent != null) {\n                    return@map runBlocking {\n                        save(\n                            Event(\n                                id = response.classRegEvent.id,\n                                periodId = event.periodId,\n                                entityType = EntityType.findBy(response.classRegEvent.elementType),\n                                entityId = response.classRegEvent.elementId,\n                                dateTime = Mapper.isoStringToDateTime(response.classRegEvent.dateTime),\n                                text = response.classRegEvent.text ?: \"\",\n                                eventReason = masterDataService.eventReason(response.classRegEvent.eventReasonId),\n                                synced = true\n                            )\n                        )\n                    }\n                }\n\n                return@map Event(id = 0L)\n            }\n            .filter { eventz -> eventz.id > 0L }\n            .toList()");
        return (rx.g<List<Event>>)d6;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object s(@e final UMPeriodData umPeriodData, @e final EntityType entityType, final long n, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(n) {
            Object G;
            Object H;
            Object I;
            Object J;
            Object K;
            Object L;
            int M;
            final /* synthetic */ k0 N;
            final /* synthetic */ UMPeriodData O;
            final /* synthetic */ EntityType P;
            final /* synthetic */ long Q;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    Object I;
                    Object J;
                    Object K;
                    Object L;
                    int M;
                    final /* synthetic */ k0 N = this.N;
                    final /* synthetic */ UMPeriodData O = this.O;
                    final /* synthetic */ EntityType P = this.P;
                    final /* synthetic */ long Q = this.Q;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$g0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int m = this.M;
                final String s = "";
                p<r0, kotlin.coroutines.d<? super j2>, Object> p = null;
                Label_2831: {
                    p<r0, kotlin.coroutines.d<? super j2>, Object> p2 = null;
                    String lesson = null;
                    Label_2419: {
                        p<r0, kotlin.coroutines.d<? super j2>, Object> p3 = null;
                    Label_0953_Outer:
                        while (true) {
                            Object i2 = null;
                            p<r0, kotlin.coroutines.d<? super j2>, Object> p9 = null;
                            Classbook classbook2 = null;
                            Label_1100: {
                                while (true) {
                                    k0 k0 = null;
                                    p<r0, kotlin.coroutines.d<? super j2>, Object> p6 = null;
                                    Label_1072: {
                                        Iterator<Object> iterator2 = null;
                                        k0 n2 = null;
                                        Classbook s2 = null;
                                        Label_0635: {
                                            Iterator<HomeWork> i = null;
                                            k0 h2 = null;
                                            Classbook g = null;
                                            p<r0, kotlin.coroutines.d<? super j2>, Object> p4 = null;
                                            Label_1859: {
                                                final Iterator<Object> j;
                                                final k0 n;
                                                final List<? extends HomeWork> h3;
                                                final Classbook g2;
                                                final p<r0, kotlin.coroutines.d<? super j2>, Object> p5;
                                                switch (m) {
                                                    default: {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    case 7: {
                                                        c1.n(o);
                                                        p = this;
                                                        break Label_2831;
                                                    }
                                                    case 6: {
                                                        c1.n(o);
                                                        p2 = this;
                                                        lesson = "";
                                                        break Label_2419;
                                                    }
                                                    case 5: {
                                                        c1.n(o);
                                                        p3 = this;
                                                        lesson = "";
                                                        break Label_0953_Outer;
                                                    }
                                                    case 4: {
                                                        i = (Iterator<HomeWork>)this.I;
                                                        h2 = (k0)this.H;
                                                        g = (Classbook)this.G;
                                                        c1.n(o);
                                                        p4 = this;
                                                        lesson = "";
                                                        break Label_1859;
                                                    }
                                                    case 3: {
                                                        j = (Iterator<Object>)this.J;
                                                        n = (k0)this.I;
                                                        h3 = (List<? extends HomeWork>)this.H;
                                                        g2 = (Classbook)this.G;
                                                        c1.n(o);
                                                        p5 = this;
                                                        lesson = "";
                                                        break;
                                                    }
                                                    case 2: {
                                                        final Iterator<Object> iterator = (Iterator<Object>)this.L;
                                                        final UMPeriodData o2 = (UMPeriodData)this.K;
                                                        k0 = (k0)this.J;
                                                        final com.untis.mobile.utils.mapper.apiToModel.d l = (com.untis.mobile.utils.mapper.apiToModel.d)this.I;
                                                        final List<? extends HomeWork> h4 = (List<? extends HomeWork>)this.H;
                                                        final Classbook g3 = (Classbook)this.G;
                                                        c1.n(o);
                                                        p6 = this;
                                                        lesson = "";
                                                        break Label_1072;
                                                    }
                                                    case 1: {
                                                        iterator2 = (Iterator<Object>)this.J;
                                                        n2 = (k0)this.I;
                                                        i2 = this.H;
                                                        final Classbook classbook = (Classbook)this.G;
                                                        c1.n(o);
                                                        s2 = classbook;
                                                        break Label_0635;
                                                    }
                                                    case 0: {
                                                        c1.n(o);
                                                        if ((s2 = this.N.S(this.O.ttId)) == null) {
                                                            s2 = new Classbook(this.O.ttId, null, null, null, null, null, null, false, false, null, 1022, null);
                                                        }
                                                        final Set<HomeWork> homeWorks = s2.getHomeWorks();
                                                        final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
                                                        for (final HomeWork next : homeWorks) {
                                                            if (kotlin.coroutines.jvm.internal.b.a(next.getLocal())) {
                                                                list.add(next);
                                                            }
                                                        }
                                                        i2 = v.I5((Iterable<?>)list);
                                                        s2.setAbsencesChecked(this.O.absenceChecked);
                                                        s2.setSynced(true);
                                                        final j j2 = new j(com.untis.mobile.services.classbook.k0.b1(this.N));
                                                        final UMPeriodData o3 = this.O;
                                                        final List<UMClassRegEvent> classRegEvents = o3.classRegEvents;
                                                        Object m2;
                                                        if (classRegEvents == null) {
                                                            m2 = null;
                                                        }
                                                        else {
                                                            final ArrayList<Event> list2 = new ArrayList<Event>();
                                                            for (final UMClassRegEvent umClassRegEvent : classRegEvents) {
                                                                final long ttId = o3.ttId;
                                                                kotlin.jvm.internal.k0.o(umClassRegEvent, "umEvent");
                                                                final Event a = j2.a(ttId, umClassRegEvent);
                                                                if (a != null) {
                                                                    list2.add(a);
                                                                }
                                                            }
                                                            m2 = v.M5((Iterable<?>)list2);
                                                        }
                                                        Object events = m2;
                                                        if (m2 == null) {
                                                            events = new HashSet<Event>();
                                                        }
                                                        s2.setEvents((Set<Event>)events);
                                                        final Set<Event> events2 = s2.getEvents();
                                                        n2 = this.N;
                                                        iterator2 = events2.iterator();
                                                        break Label_0635;
                                                    }
                                                }
                                                while (j.hasNext()) {
                                                    final Exemption exemption = j.next();
                                                    p5.G = g2;
                                                    p5.H = h3;
                                                    p5.I = n;
                                                    p5.J = j;
                                                    p5.K = null;
                                                    p5.L = null;
                                                    p5.M = 3;
                                                    if (n.W(exemption, p5) == h) {
                                                        return h;
                                                    }
                                                }
                                                final com.untis.mobile.utils.mapper.realmToModel.a0 a2 = new com.untis.mobile.utils.mapper.realmToModel.a0(com.untis.mobile.services.classbook.k0.b1(p5.N));
                                                final UMPeriodData o4 = p5.O;
                                                final List<UMPrioritizedAttendance> prioritizedAttendances = o4.prioritizedAttendances;
                                                Object m3;
                                                if (prioritizedAttendances == null) {
                                                    m3 = null;
                                                }
                                                else {
                                                    final ArrayList<PrioritizedAttendance> list3 = new ArrayList<PrioritizedAttendance>();
                                                    for (final UMPrioritizedAttendance umPrioritizedAttendance : prioritizedAttendances) {
                                                        final long ttId2 = o4.ttId;
                                                        kotlin.jvm.internal.k0.o(umPrioritizedAttendance, "umAttendance");
                                                        final PrioritizedAttendance a3 = a2.a(ttId2, umPrioritizedAttendance);
                                                        if (a3 != null) {
                                                            list3.add(a3);
                                                        }
                                                    }
                                                    m3 = v.M5((Iterable<?>)list3);
                                                }
                                                Object prioritizedAttendances2 = m3;
                                                if (m3 == null) {
                                                    prioritizedAttendances2 = new HashSet<PrioritizedAttendance>();
                                                }
                                                g2.setPrioritizedAttendances((Set<PrioritizedAttendance>)prioritizedAttendances2);
                                                final UMPeriodData o5 = p5.O;
                                                final List<UMHomeWork> homeWorks2 = o5.homeWorks;
                                                Object m4;
                                                if (homeWorks2 == null) {
                                                    m4 = null;
                                                }
                                                else {
                                                    final EntityType p7 = p5.P;
                                                    final long q = p5.Q;
                                                    final ArrayList<HomeWork> list4 = new ArrayList<HomeWork>();
                                                    for (final UMHomeWork umHomeWork : homeWorks2) {
                                                        final com.untis.mobile.utils.mapper.realmToModel.p a4 = com.untis.mobile.utils.mapper.realmToModel.p.a;
                                                        final long ttId3 = o5.ttId;
                                                        kotlin.jvm.internal.k0.o(umHomeWork, "umHomeWork");
                                                        final HomeWork a5 = a4.a(ttId3, umHomeWork, p7, q);
                                                        if (a5 != null) {
                                                            list4.add(a5);
                                                        }
                                                    }
                                                    m4 = v.M5((Iterable<?>)list4);
                                                }
                                                Object homeWorks3 = m4;
                                                if (m4 == null) {
                                                    homeWorks3 = new HashSet<HomeWork>();
                                                }
                                                g2.setHomeWorks((Set<HomeWork>)homeWorks3);
                                                final List<UMClassRole> classRoles = p5.O.classRoles;
                                                List<ClassRole> list5;
                                                if (classRoles == null) {
                                                    list5 = null;
                                                }
                                                else {
                                                    final com.untis.mobile.utils.mapper.realmToModel.c a6 = com.untis.mobile.utils.mapper.realmToModel.c.a;
                                                    final ArrayList<ClassRole> list6 = new ArrayList<ClassRole>();
                                                    final Iterator<Object> iterator7 = classRoles.iterator();
                                                    while (true) {
                                                        list5 = list6;
                                                        if (!iterator7.hasNext()) {
                                                            break;
                                                        }
                                                        final ClassRole a7 = a6.a(iterator7.next());
                                                        if (a7 == null) {
                                                            continue Label_0953_Outer;
                                                        }
                                                        list6.add(a7);
                                                    }
                                                }
                                                List<ClassRole> classRoles2;
                                                if ((classRoles2 = list5) == null) {
                                                    classRoles2 = new ArrayList<ClassRole>();
                                                }
                                                g2.setClassRoles(classRoles2);
                                                g2.getHomeWorks().addAll(h3);
                                                final Set<HomeWork> homeWorks4 = g2.getHomeWorks();
                                                final k0 n3 = p5.N;
                                                final Iterator<Object> iterator8 = homeWorks4.iterator();
                                                g = g2;
                                                p4 = p5;
                                                h2 = n3;
                                                i = (Iterator<HomeWork>)iterator8;
                                            }
                                            while (i.hasNext()) {
                                                final HomeWork homeWork = i.next();
                                                p4.G = g;
                                                p4.H = h2;
                                                p4.I = i;
                                                p4.J = null;
                                                p4.K = null;
                                                p4.L = null;
                                                p4.M = 4;
                                                if (a.h(h2, homeWork, false, p4, 2, null) == h) {
                                                    return h;
                                                }
                                            }
                                            final k0 n4 = p4.N;
                                            p4.G = null;
                                            p4.H = null;
                                            p4.I = null;
                                            p4.J = null;
                                            p4.K = null;
                                            p4.L = null;
                                            p4.M = 5;
                                            p3 = p4;
                                            if (n4.a0(g, p4) == h) {
                                                return h;
                                            }
                                            break Label_0953_Outer;
                                        }
                                        final p<r0, kotlin.coroutines.d<? super j2>, Object> p8 = this;
                                        while (iterator2.hasNext()) {
                                            final Event event = iterator2.next();
                                            p8.G = s2;
                                            p8.H = i2;
                                            p8.I = n2;
                                            p8.J = iterator2;
                                            p8.M = 1;
                                            if (n2.q(event, p8) == h) {
                                                return h;
                                            }
                                        }
                                        final List<Long> studentIds = p8.O.studentIds;
                                        Object m5;
                                        if (studentIds == null) {
                                            m5 = null;
                                        }
                                        else {
                                            m5 = v.M5((Iterable<?>)studentIds);
                                        }
                                        Set<Long> students = (Set<Long>)m5;
                                        if (m5 == null) {
                                            students = new HashSet<Long>();
                                        }
                                        s2.setStudents(students);
                                        final com.untis.mobile.utils.mapper.apiToModel.d l = new com.untis.mobile.utils.mapper.apiToModel.d(com.untis.mobile.services.classbook.k0.b1(p8.N));
                                        final List<UMStudentAbsence> absences = p8.O.absences;
                                        Set<Long> m6;
                                        if (absences == null) {
                                            m6 = null;
                                        }
                                        else {
                                            final ArrayList list7 = new ArrayList<Long>(v.Y((Iterable<?>)absences, 10));
                                            final Iterator<Object> iterator9 = absences.iterator();
                                            while (iterator9.hasNext()) {
                                                list7.add(kotlin.coroutines.jvm.internal.b.g(iterator9.next().id));
                                            }
                                            m6 = v.M5((Iterable<? extends Long>)list7);
                                        }
                                        Set<Long> absences2 = m6;
                                        if (m6 == null) {
                                            absences2 = new HashSet<Long>();
                                        }
                                        s2.setAbsences(absences2);
                                        final UMPeriodData o2 = p8.O;
                                        final List<UMStudentAbsence> absences3 = o2.absences;
                                        if (absences3 == null) {
                                            final String s3 = "";
                                            p9 = p8;
                                            classbook2 = s2;
                                            lesson = s3;
                                            break Label_1100;
                                        }
                                        final k0 n5 = p8.N;
                                        final Iterator<Object> iterator = absences3.iterator();
                                        final List<? extends HomeWork> h4 = (List<? extends HomeWork>)i2;
                                        final Classbook g3 = s2;
                                        lesson = s;
                                        if (!iterator.hasNext()) {
                                            final j2 a8 = j2.a;
                                            classbook2 = g3;
                                            i2 = h4;
                                            p9 = p8;
                                            break Label_1100;
                                        }
                                        final UMStudentAbsence umStudentAbsence = iterator.next();
                                        final long ttId4 = o2.ttId;
                                        kotlin.jvm.internal.k0.o(umStudentAbsence, "it");
                                        final StudentAbsence g4 = l.g(ttId4, umStudentAbsence);
                                        p8.G = g3;
                                        p8.H = h4;
                                        p8.I = l;
                                        p8.J = n5;
                                        p8.K = o2;
                                        p8.L = iterator;
                                        p8.M = 2;
                                        p6 = p8;
                                        k0 = n5;
                                        if (n5.a(g4, p8) == h) {
                                            return h;
                                        }
                                    }
                                    final p<r0, kotlin.coroutines.d<? super j2>, Object> p8 = p6;
                                    final k0 n5 = k0;
                                    continue;
                                }
                            }
                            final com.untis.mobile.utils.mapper.realmToModel.n n6 = new com.untis.mobile.utils.mapper.realmToModel.n(k0.b1(p9.N));
                            final List<UMStudentExemption> exemptions = p9.O.exemptions;
                            Object m7;
                            if (exemptions == null) {
                                m7 = null;
                            }
                            else {
                                final ArrayList<Exemption> list8 = new ArrayList<Exemption>();
                                for (final UMStudentExemption umStudentExemption : exemptions) {
                                    kotlin.jvm.internal.k0.o(umStudentExemption, "umExemption");
                                    final Exemption a9 = n6.a(umStudentExemption);
                                    if (a9 != null) {
                                        list8.add(a9);
                                    }
                                }
                                m7 = v.M5((Iterable<?>)list8);
                            }
                            Object exemptions2 = m7;
                            if (m7 == null) {
                                exemptions2 = new HashSet<Exemption>();
                            }
                            classbook2.setExemptions((Set<Exemption>)exemptions2);
                            final Set<Exemption> exemptions3 = classbook2.getExemptions();
                            k0 n = p9.N;
                            final Iterator<Object> iterator11 = exemptions3.iterator();
                            Classbook g2 = classbook2;
                            List<? extends HomeWork> h3 = (List<? extends HomeWork>)i2;
                            p<r0, kotlin.coroutines.d<? super j2>, Object> p5 = p9;
                            Iterator<Object> j = iterator11;
                            continue;
                        }
                        LessonTopic d;
                        if ((d = p3.N.D(p3.O.ttId)) == null) {
                            d = new LessonTopic(p3.O.ttId, null, null, null, null, true, 30, null);
                        }
                        final UMLessonTopic topic = p3.O.topic;
                        String text;
                        if (topic == null || (text = topic.text) == null) {
                            text = lesson;
                        }
                        d.setText(text);
                        final UMLessonTopic topic2 = p3.O.topic;
                        String startDateTime;
                        if (topic2 == null) {
                            startDateTime = null;
                        }
                        else {
                            startDateTime = topic2.startDateTime;
                        }
                        final org.joda.time.c c = com.untis.mobile.utils.mapper.common.b.c(startDateTime);
                        kotlin.jvm.internal.k0.o(c, "isoStringToDateTime(umPeriodData.topic?.startDateTime)");
                        d.setStart(c);
                        final UMLessonTopic topic3 = p3.O.topic;
                        String endDateTime;
                        if (topic3 == null) {
                            endDateTime = null;
                        }
                        else {
                            endDateTime = topic3.endDateTime;
                        }
                        final org.joda.time.c c2 = com.untis.mobile.utils.mapper.common.b.c(endDateTime);
                        kotlin.jvm.internal.k0.o(c2, "isoStringToDateTime(umPeriodData.topic?.endDateTime)");
                        d.setEnd(c2);
                        final UMLessonTopic topic4 = p3.O.topic;
                        List<DriveAttachment> list9 = null;
                        Label_2355: {
                            if (topic4 != null) {
                                final List<UMDriveFileDescriptor> attachments = topic4.attachments;
                                if (attachments != null) {
                                    list9 = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)attachments, 10));
                                    for (final UMDriveFileDescriptor umDriveFileDescriptor : attachments) {
                                        final long id = umDriveFileDescriptor.id;
                                        final String name = umDriveFileDescriptor.name;
                                        kotlin.jvm.internal.k0.o(name, "um.name");
                                        final String url = umDriveFileDescriptor.url;
                                        kotlin.jvm.internal.k0.o(url, "um.url");
                                        list9.add(new DriveAttachment(id, name, url));
                                    }
                                    break Label_2355;
                                }
                            }
                            list9 = null;
                        }
                        List<DriveAttachment> attachments2;
                        if ((attachments2 = list9) == null) {
                            attachments2 = new ArrayList<DriveAttachment>();
                        }
                        d.setAttachments(attachments2);
                        d.setSynced(true);
                        final k0 n7 = p3.N;
                        p3.M = 6;
                        p2 = p3;
                        if (n7.Q(d, p3) == h) {
                            return h;
                        }
                    }
                    final UMPeriodData o6 = p2.O;
                    p = p2;
                    if (o6.text != null) {
                        PeriodInfo d2;
                        if ((d2 = p2.N.d(o6.ttId)) == null) {
                            d2 = new PeriodInfo(p2.O.ttId, null, null, null, null, true, null, 94, null);
                        }
                        d2.setId(p2.O.ttId);
                        final UMPeriodText text2 = p2.O.text;
                        String info;
                        if (text2 == null || (info = text2.info) == null) {
                            info = lesson;
                        }
                        d2.setInfo(info);
                        final UMPeriodText text3 = p2.O.text;
                        String substitution;
                        if (text3 == null || (substitution = text3.substitution) == null) {
                            substitution = lesson;
                        }
                        d2.setSubstitution(substitution);
                        final UMPeriodText text4 = p2.O.text;
                        if (text4 != null) {
                            final String lesson2 = text4.lesson;
                            if (lesson2 != null) {
                                lesson = lesson2;
                            }
                        }
                        d2.setLesson(lesson);
                        final UMPeriodText text5 = p2.O.text;
                        Label_2775: {
                            if (text5 != null) {
                                final List<UMDriveFileDescriptor> attachments3 = text5.attachments;
                                if (attachments3 != null) {
                                    o = new ArrayList(v.Y((Iterable<?>)attachments3, 10));
                                    for (final UMDriveFileDescriptor umDriveFileDescriptor2 : attachments3) {
                                        final long id2 = umDriveFileDescriptor2.id;
                                        final String name2 = umDriveFileDescriptor2.name;
                                        kotlin.jvm.internal.k0.o(name2, "um.name");
                                        final String url2 = umDriveFileDescriptor2.url;
                                        kotlin.jvm.internal.k0.o(url2, "um.url");
                                        ((Collection<DriveAttachment>)o).add(new DriveAttachment(id2, name2, url2));
                                    }
                                    break Label_2775;
                                }
                            }
                            o = null;
                        }
                        Object e;
                        if ((e = o) == null) {
                            e = v.E();
                        }
                        d2.setDriveAttachments((List<DriveAttachment>)e);
                        d2.setSync(true);
                        final k0 n8 = p2.N;
                        p2.M = 7;
                        p = p2;
                        if (n8.R(d2, p2) == h) {
                            return h;
                        }
                    }
                }
                final Period a10 = k0.this.D1().a(k0.b1(p.N), p.O.ttId);
                if (a10 == null) {
                    return j2.a;
                }
                final List<UMPeriodRight> can = p.O.can;
                Object n9;
                if (can == null) {
                    n9 = null;
                }
                else {
                    final PeriodRight.Companion companion = PeriodRight.Companion;
                    final ArrayList<PeriodRight> list10 = new ArrayList<PeriodRight>();
                    final Iterator<Object> iterator14 = can.iterator();
                    while (iterator14.hasNext()) {
                        final PeriodRight fromUmPeriodRight = companion.fromUmPeriodRight(iterator14.next());
                        if (fromUmPeriodRight != null) {
                            list10.add(fromUmPeriodRight);
                        }
                    }
                    n9 = v.N5((Iterable<?>)list10);
                }
                Object k2 = n9;
                if (n9 == null) {
                    k2 = j1.k();
                }
                a10.setRights((Set<? extends PeriodRight>)k2);
                final UMMessengerChannel channel = p.O.channel;
                String id3;
                if (channel == null) {
                    id3 = null;
                }
                else {
                    id3 = channel.id;
                }
                a10.setChannelId(id3);
                k0.this.D1().d(k0.b1(p.N), a10);
                return j2.a;
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object t(@e final kotlin.coroutines.d<? super j2> d) {
        synchronized (this) {
            final k2 f = h.f((r0)b2.G, (kotlin.coroutines.g)i1.c(), (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                Object G;
                Object H;
                int I;
                final /* synthetic */ k0 J;
                
                private static final void q(final Boolean b) {
                    Log.d("untis_log", "yay, pre loading period data success!");
                }
                
                private static final void s(final kotlin.jvm.internal.j1.h h, final k0 k0, final Throwable t) {
                    ((TimeTableModel)h.G).setPreLoadedPeriodData(false);
                    k0.J1().a(k0.b1(k0), (TimeTableModel)h.G);
                    Log.e("untis_log", "error on asyn preload period data", t);
                }
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        Object G;
                        Object H;
                        int I;
                        final /* synthetic */ k0 J = this.J;
                        
                        private static final void q(final Boolean b) {
                            Log.d("untis_log", "yay, pre loading period data success!");
                        }
                        
                        private static final void s(final kotlin.jvm.internal.j1.h h, final k0 k0, final Throwable t) {
                            ((TimeTableModel)h.G).setPreLoadedPeriodData(false);
                            k0.J1().a(k0.b1(k0), (TimeTableModel)h.G);
                            Log.e("untis_log", "error on asyn preload period data", t);
                        }
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((k0$x)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object g) {
                    final Object h = b.h();
                    final int i = this.I;
                    Object o;
                    kotlin.jvm.internal.j1.h h3;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o = this.H;
                        final kotlin.jvm.internal.j1.h h2 = (kotlin.jvm.internal.j1.h)this.G;
                        c1.n(g);
                        h3 = h2;
                    }
                    else {
                        c1.n(g);
                        if (!k0.this.K1()) {
                            return j2.a;
                        }
                        final Profile i2 = k0.this.M1();
                        final kotlin.jvm.internal.j1.h g2 = new kotlin.jvm.internal.j1.h();
                        final TimeTableModel b = k0.this.J1().b(k0.b1(this.J), i2.getUserOriginalEntityType(), i2.getUserOriginalEntityId(), com.untis.mobile.utils.v.a.g());
                        g2.G = (T)b;
                        final TimeTableModel timeTableModel = b;
                        if (timeTableModel != null && timeTableModel.getPreLoadedPeriodData()) {
                            return j2.a;
                        }
                        final int p = ((org.joda.time.base.a)com.untis.mobile.utils.time.a.a()).p1();
                        g = g2.G;
                        Label_0359: {
                            if (g != null) {
                                final List<PeriodModel> periodsWithOutCancelled = ((TimeTableModel)g).getPeriodsWithOutCancelled();
                                boolean b2 = false;
                                Label_0268: {
                                    if (!(periodsWithOutCancelled instanceof Collection) || !periodsWithOutCancelled.isEmpty()) {
                                        final Iterator<Object> iterator = periodsWithOutCancelled.iterator();
                                        while (iterator.hasNext()) {
                                            if (kotlin.coroutines.jvm.internal.b.a(iterator.next().getEndMinute() >= p)) {
                                                b2 = false;
                                                break Label_0268;
                                            }
                                        }
                                    }
                                    b2 = true;
                                }
                                if (!b2) {
                                    break Label_0359;
                                }
                            }
                            final TimeTableModel b3 = k0.this.J1().b(k0.b1(this.J), i2.getUserOriginalEntityType(), i2.getUserOriginalEntityId(), com.untis.mobile.utils.v.a.h());
                            if (b3 == null) {
                                return j2.a;
                            }
                            g2.G = (T)b3;
                            if (b3.getPreLoadedPeriodData()) {
                                return j2.a;
                            }
                            if (((TimeTableModel)g2.G).getPeriodsWithOutCancelled().isEmpty()) {
                                return j2.a;
                            }
                        }
                        final com.untis.mobile.services.timetable.placeholder.l state = ((TimeTableModel)g2.G).getState(com.untis.mobile.utils.settings.e.d(k0.this.H1()), i2.getSchoolServerDelta());
                        if (state == com.untis.mobile.services.timetable.placeholder.l.L || state == com.untis.mobile.services.timetable.placeholder.l.I) {
                            return j2.a;
                        }
                        ((TimeTableModel)g2.G).setPreLoadedPeriodData(true);
                        k0.this.J1().a(k0.b1(this.J), (TimeTableModel)g2.G);
                        if (((org.joda.time.base.e)((TimeTableModel)g2.G).getDate()).p((n0)com.untis.mobile.utils.v.a.g())) {
                            final List<PeriodModel> periodsWithOutCancelled2 = ((TimeTableModel)g2.G).getPeriodsWithOutCancelled();
                            g = new ArrayList();
                            for (final PeriodModel next : periodsWithOutCancelled2) {
                                if (kotlin.coroutines.jvm.internal.b.a(next.getEndMinute() >= p)) {
                                    ((Collection<PeriodModel>)g).add(next);
                                }
                            }
                            final Collection<Long> collection = new ArrayList<Long>(v.Y((Iterable<?>)g, 10));
                            final Iterator<Object> iterator3 = ((Iterable<Object>)g).iterator();
                            while (true) {
                                g = collection;
                                if (!iterator3.hasNext()) {
                                    break;
                                }
                                collection.add(kotlin.coroutines.jvm.internal.b.g(iterator3.next().getId()));
                            }
                        }
                        else {
                            final List<PeriodModel> periodsWithOutCancelled3 = ((TimeTableModel)g2.G).getPeriodsWithOutCancelled();
                            g = new ArrayList(v.Y((Iterable<?>)periodsWithOutCancelled3, 10));
                            final Iterator<Object> iterator4 = periodsWithOutCancelled3.iterator();
                            while (iterator4.hasNext()) {
                                ((Collection<Long>)g).add(kotlin.coroutines.jvm.internal.b.g(iterator4.next().getId()));
                            }
                        }
                        final com.untis.mobile.calendar.service.b b4 = new com.untis.mobile.calendar.service.b(k0.this.v1(), i2);
                        final org.joda.time.t g3 = com.untis.mobile.utils.v.a.g();
                        final EntityType userOriginalEntityType = i2.getUserOriginalEntityType();
                        final long userOriginalEntityId = i2.getUserOriginalEntityId();
                        final org.joda.time.c f0 = g3.F0();
                        kotlin.jvm.internal.k0.o(f0, "today.toDateTimeAtStartOfDay()");
                        final org.joda.time.c f2 = g3.l0(2).F0();
                        kotlin.jvm.internal.k0.o(f2, "today.plusDays(2).toDateTimeAtStartOfDay()");
                        this.G = g2;
                        this.H = g;
                        this.I = 1;
                        if (b4.n(userOriginalEntityType, userOriginalEntityId, f0, f2, this) == h) {
                            return h;
                        }
                        o = g;
                        h3 = g2;
                    }
                    this.J.e((List<Long>)o).C5((rx.functions.b)com.untis.mobile.services.classbook.m0.G, (rx.functions.b)new l0(h3, this.J));
                    return j2.a;
                }
            }, 2, (Object)null);
            if (f == b.h()) {
                return f;
            }
            return j2.a;
        }
    }
    
    @e
    @Override
    public List<StudentAbsence> u(@e final Collection<Long> collection) {
        kotlin.jvm.internal.k0.p(collection, "ids");
        return this.I1().f(this.G, v.I5((Iterable<? extends Long>)collection));
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Event v(final long n) {
        return this.w1().a(this.G, n);
    }
    
    @e
    @Override
    public rx.g<List<StudentAbsenceResult>> w(@e final Period period, @e final StudentAbsence studentAbsence, @e final List<Student> list, @e final CreateAbsenceStrategy createAbsenceStrategy) {
        kotlin.jvm.internal.k0.p(period, "period");
        kotlin.jvm.internal.k0.p(studentAbsence, "studentAbsence");
        kotlin.jvm.internal.k0.p(list, "students");
        kotlin.jvm.internal.k0.p(createAbsenceStrategy, "strategy");
        final com.untis.mobile.utils.mapper.apiToModel.d d = new com.untis.mobile.utils.mapper.apiToModel.d(this.G);
        final com.untis.mobile.utils.mapper.apiToModel.e e = new com.untis.mobile.utils.mapper.apiToModel.e(this.G);
        final ApiService r1 = this.r1();
        final Profile m1 = this.M1();
        final long id = period.getId();
        final ArrayList<Long> list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((Student)iterator.next()).getId());
        }
        final org.joda.time.c start = studentAbsence.getStart();
        final org.joda.time.c end = studentAbsence.getEnd();
        final AbsenceReason absenceReason = studentAbsence.getAbsenceReason();
        long id2;
        if (absenceReason == null) {
            id2 = 0L;
        }
        else {
            id2 = absenceReason.getId();
        }
        final rx.g q3 = r1.createAbsence(m1, createAbsenceStrategy, id, list2, start, end, id2, studentAbsence.getText()).Q3(rx.schedulers.c.e()).k3((rx.functions.p)new com.untis.mobile.services.classbook.p(this, d, period, e)).Q3(rx.android.schedulers.a.c());
        kotlin.jvm.internal.k0.o(q3, "apiService\n            .createAbsence(\n                profile(),\n                strategy,\n                period.id,\n                students.map { it.id },\n                studentAbsence.start,\n                studentAbsence.end,\n                studentAbsence.absenceReason?.id\n                    ?: 0,\n                studentAbsence.text\n            )\n            .observeOn(Schedulers.io())\n            .map { response ->\n                val studentAbsenceResults = response.resultPerStudent.entries\n                    .map { entry ->\n                        StudentAbsenceResult(\n                            student = masterDataService.student(entry.key)\n                                ?: Student(entry.key),\n                            absences = entry.value.absences.map { umStudentAbsence ->\n                                absenceMapper.toStudentAbsence(\n                                    period.id,\n                                    umStudentAbsence\n                                )\n                            },\n                            conflicts = entry.value.conflicts.map { umStudentAbsence ->\n                                absenceMapper.toStudentAbsence(\n                                    period.id,\n                                    umStudentAbsence\n                                )\n                            },\n                            attendances = entry.value.attendances.map { umStudentAttendance ->\n                                attendanceMapper.toStudentAttendance(\n                                    umStudentAttendance\n                                )\n                            },\n                            separateSaveAllowed = entry.value.separateSaveAllowed\n                        )\n                    }\n\n                runBlocking {\n                    studentAbsenceResults.forEach { studentAbsenceResult ->\n                        studentAbsenceResult.absences.forEach { absence ->\n                            save(\n                                absence\n                            )\n                        }\n                    }\n                }\n\n                studentAbsenceResults\n            }\n            .observeOn(AndroidSchedulers.mainThread())");
        return (rx.g<List<StudentAbsenceResult>>)q3;
    }
    
    @e
    @Override
    public rx.g<Boolean> x(@e final Period period, @e final StudentAbsence studentAbsence) {
        kotlin.jvm.internal.k0.p(period, "period");
        kotlin.jvm.internal.k0.p(studentAbsence, "studentAbsence");
        final rx.g q3 = this.r1().deleteAbsence(this.M1(), studentAbsence.getId()).Q3(rx.schedulers.c.e()).k3((rx.functions.p)new com.untis.mobile.services.classbook.h(this, studentAbsence, period)).Q3(rx.android.schedulers.a.c());
        kotlin.jvm.internal.k0.o(q3, "apiService\n            .deleteAbsence(profile(), studentAbsence.id)\n            .observeOn(Schedulers.io())\n            .map { result ->\n                if (result.success) {\n                    GlobalScope.launch {\n                        delete(studentAbsence)\n\n                        val classbook = classbook(period.id) ?: Classbook(period.id)\n                        classbook.absences.remove(studentAbsence.id)\n                        save(classbook)\n                    }\n                }\n\n                return@map result.success\n            }\n            .observeOn(AndroidSchedulers.mainThread())");
        return (rx.g<Boolean>)q3;
    }
    
    @e
    @Override
    public AbsenceEndTime y() {
        return this.u1().getDefaultAbsenceEndTime();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object z(@e final HomeWork homeWork, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ HomeWork I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ HomeWork I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$k0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.this.y1().e(k0.b1(this.H), this.I, true);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "com/untis/mobile/services/classbook/k0$a", "", "", "profileId", "Lcom/untis/mobile/services/classbook/a;", "a", "", "cache", "Ljava/util/Map;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final com.untis.mobile.services.classbook.a a(@e final String s) {
            kotlin.jvm.internal.k0.p(s, "profileId");
            com.untis.mobile.services.classbook.a a;
            if ((a = k0.P0().get(s)) == null) {
                a = new k0(s, null);
                k0.P0().put(s, a);
            }
            return a;
        }
    }
}
