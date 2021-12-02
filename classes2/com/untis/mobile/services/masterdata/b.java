// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.masterdata;

import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.api.common.masterdata.UMStudent;
import com.untis.mobile.api.common.masterdata.UMTimeGrid;
import com.untis.mobile.api.common.masterdata.UMExcuseStatus;
import com.untis.mobile.utils.mapper.realmToModel.l0;
import com.untis.mobile.api.common.masterdata.UMSchoolyear;
import com.untis.mobile.utils.mapper.realmToModel.e0;
import com.untis.mobile.api.common.masterdata.UMTeachingMethod;
import com.untis.mobile.utils.mapper.realmToModel.i0;
import com.untis.mobile.api.common.masterdata.UMEventReasonGroup;
import com.untis.mobile.utils.mapper.realmToModel.k;
import com.untis.mobile.api.common.masterdata.UMEventReason;
import com.untis.mobile.api.common.masterdata.UMDuty;
import com.untis.mobile.api.common.masterdata.UMDepartment;
import com.untis.mobile.api.common.masterdata.UMAbsenceReason;
import com.untis.mobile.api.common.masterdata.UMHoliday;
import com.untis.mobile.utils.mapper.realmToModel.h0;
import com.untis.mobile.api.common.masterdata.UMTeacher;
import com.untis.mobile.utils.mapper.realmToModel.c0;
import com.untis.mobile.api.common.masterdata.UMRoom;
import com.untis.mobile.utils.mapper.realmToModel.g0;
import com.untis.mobile.api.common.masterdata.UMSubject;
import com.untis.mobile.api.common.masterdata.UMKlasse;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.api.common.UMMasterData;
import org.koin.core.c$a;
import com.untis.mobile.utils.mapper.realmToModel.f0;
import com.untis.mobile.api.common.UMPerson;
import java.util.Collection;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.timegrid.TimeGrid;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.h;
import io.realm.RealmQuery;
import java.io.Closeable;
import com.untis.mobile.persistence.models.profile.Child;
import java.util.ArrayList;
import kotlin.c1;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.i1;
import kotlin.j2;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReasonGroup;
import com.untis.mobile.persistence.models.classbook.duty.Duty;
import com.untis.mobile.persistence.models.masterdata.Department;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.classbook.lessontopic.TeachingMethod;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Room;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;
import org.joda.time.n0;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.services.masterdata.cache.r;
import com.untis.mobile.services.masterdata.cache.m;
import com.untis.mobile.services.masterdata.cache.q;
import com.untis.mobile.services.masterdata.cache.g;
import com.untis.mobile.services.masterdata.cache.f;
import com.untis.mobile.services.masterdata.cache.i;
import com.untis.mobile.services.masterdata.cache.n;
import com.untis.mobile.services.masterdata.cache.p;
import com.untis.mobile.services.masterdata.cache.l;
import com.untis.mobile.persistence.models.masterdata.CustomEntityColor;
import com.untis.mobile.services.masterdata.cache.o;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.masterdata.cache.j;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.untis.mobile.persistence.realm.d;
import java.util.HashMap;
import kotlin.jvm.internal.w;
import kotlin.b0;
import java.util.Map;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ¡\u00012\u00020\u00012\u00020\u0002:\u0001PB\u0014\b\u0002\u0012\u0007\u0010\u008b\u0001\u001a\u00020b¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u00105\u001a\u0004\u0018\u0001042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u00109\u001a\u0004\u0018\u0001082\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010:\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001e0<2\u0006\u0010;\u001a\u00020\u000eH\u0016J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020 0<2\u0006\u0010;\u001a\u00020\u000eH\u0016J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\"0<2\u0006\u0010;\u001a\u00020\u000eH\u0016J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020$0<2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020&0<H\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020(0<H\u0016J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020*0<2\u0006\u0010;\u001a\u00020\u000eH\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020,0<H\u0016J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020.0<H\u0016J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u0002000<2\u0006\u0010;\u001a\u00020\u000eH\u0016J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u0002020<2\u0006\u0010;\u001a\u00020\u000eH\u0016J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u0002040<H\u0016J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u0002060<H\u0016J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u0002080<H\u0016J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070<H\u0016J\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001e0<2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001c0<H\u0016J\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020\"0<2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001c0<H\u0016J\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020$0<2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001c0<H\u0016J\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020 0<2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001c0<H\u0016J\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020&0<2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001c0<H\u0016J\u0012\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010T\u001a\u0004\u0018\u0001082\u0006\u0010S\u001a\u00020\u0007H\u0016J\u0012\u0010U\u001a\u0004\u0018\u0001082\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010V\u001a\u0004\u0018\u00010(2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001b\u0010Y\u001a\u00020\u00102\u0006\u0010X\u001a\u00020WH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u001b\u0010[\u001a\u00020\u00102\u0006\u0010X\u001a\u00020WH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b[\u0010ZJ\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00020W0<H\u0016J\u0013\u0010]\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b]\u0010^J\u0018\u0010c\u001a\u00020b2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020\u001cH\u0016J\u0018\u0010d\u001a\u00020b2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020\u001cH\u0016J\u001a\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020\u001cH\u0016J\u0013\u0010g\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bg\u0010^J!\u0010i\u001a\u00020\u00102\f\u0010h\u001a\b\u0012\u0004\u0012\u00020&0<H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bi\u0010jR#\u0010o\u001a\b\u0012\u0004\u0012\u00020.0k8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010l\u001a\u0004\bm\u0010nR#\u0010q\u001a\b\u0012\u0004\u0012\u00020*0k8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010l\u001a\u0004\bp\u0010nR#\u0010s\u001a\b\u0012\u0004\u0012\u0002000k8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010l\u001a\u0004\br\u0010nR\u001d\u0010w\u001a\u00020t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010l\u001a\u0004\bu\u0010vR\u001d\u0010{\u001a\u00020x8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010l\u001a\u0004\by\u0010zR#\u0010}\u001a\b\u0012\u0004\u0012\u00020$0k8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010l\u001a\u0004\b|\u0010nR#\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\"0k8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010l\u001a\u0004\b~\u0010nR%\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0k8B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b[\u0010l\u001a\u0005\b\u0080\u0001\u0010nR%\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020 0k8B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b]\u0010l\u001a\u0005\b\u0082\u0001\u0010nR%\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020(0k8B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b#\u0010l\u001a\u0005\b\u0084\u0001\u0010nR!\u0010\u0089\u0001\u001a\u00030\u0086\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b7\u0010l\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00020b8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010\u008a\u0001R!\u0010\u008f\u0001\u001a\u00030\u008c\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bH\u0010l\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010h\u001a\u00030\u0090\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bJ\u0010l\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R%\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u0002060k8B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b'\u0010l\u001a\u0005\b\u0093\u0001\u0010nR%\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020,0k8B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bN\u0010l\u001a\u0005\b\u0095\u0001\u0010nR%\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020W0k8B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\bK\u0010l\u001a\u0005\b\u0097\u0001\u0010nR%\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u0002020k8B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b!\u0010l\u001a\u0005\b\u0099\u0001\u0010nR!\u0010\u009e\u0001\u001a\u00030\u009b\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bI\u0010l\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¢\u0001" }, d2 = { "Lcom/untis/mobile/services/masterdata/b;", "Lcom/untis/mobile/services/masterdata/a;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "N0", "Lorg/joda/time/t;", "date", "Lcom/untis/mobile/persistence/models/masterdata/Schoolyear;", "B0", "C0", "Lcom/untis/mobile/api/common/UMMasterData;", "umMasterData", "start", "end", "", "deleteOldData", "Lkotlin/j2;", "j", "(Lcom/untis/mobile/api/common/UMMasterData;Lorg/joda/time/t;Lorg/joda/time/t;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lcom/untis/mobile/api/common/masterdata/UMStudent;", "umStudents", "o", "(Ljava/util/Collection;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/api/common/UMPerson;", "umPersons", "Y", "(Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "N", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "U", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "P", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "k", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "V", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "B", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "H", "Lcom/untis/mobile/persistence/models/masterdata/Department;", "g", "Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "u", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "w", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReasonGroup;", "C", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "c", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/TeachingMethod;", "W", "Lcom/untis/mobile/persistence/models/timegrid/TimeGrid;", "n", "z", "onlyDisplayable", "", "f", "x", "m", "h", "s", "E", "d", "T", "F", "r", "i", "X", "I", "O", "K", "ids", "D", "R", "Q", "a", "e", "M", "schoolyear", "b", "y", "p", "Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;", "customEntityColor", "q", "(Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;Lkotlin/coroutines/d;)Ljava/lang/Object;", "J", "t", "L", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "", "S", "G", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "v", "A", "students", "l", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/services/masterdata/cache/e;", "Lkotlin/b0;", "v0", "()Lcom/untis/mobile/services/masterdata/cache/e;", "duties", "t0", "absenceReasons", "x0", "eventReasons", "Lcom/untis/mobile/persistence/realm/d;", "E0", "()Lcom/untis/mobile/persistence/realm/d;", "realmService", "Lcom/untis/mobile/persistence/dao/classbook/g;", "y0", "()Lcom/untis/mobile/persistence/dao/classbook/g;", "excuseStatusDao", "L0", "teachers", "F0", "rooms", "A0", "klassen", "J0", "subjects", "z0", "holidays", "Lcom/untis/mobile/services/masterdata/cache/m;", "G0", "()Lcom/untis/mobile/services/masterdata/cache/m;", "schoolyears", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/services/masterdata/cache/r;", "M0", "()Lcom/untis/mobile/services/masterdata/cache/r;", "timegrids", "Lcom/untis/mobile/services/masterdata/cache/n;", "H0", "()Lcom/untis/mobile/services/masterdata/cache/n;", "K0", "teacherMethods", "u0", "departments", "I0", "subjectCustomColors", "w0", "eventReasonGroups", "Lcom/untis/mobile/persistence/dao/profile/a;", "D0", "()Lcom/untis/mobile/persistence/dao/profile/a;", "profileDao", "<init>", "(Ljava/lang/String;)V", "Z", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements com.untis.mobile.services.masterdata.a, c
{
    @e
    public static final a Z;
    @e
    private static final t a0;
    @e
    private static final Map<String, com.untis.mobile.services.masterdata.a> b0;
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
    @e
    private final b0 X;
    @e
    private final b0 Y;
    
    static {
        Z = new a(null);
        a0 = new t(0L);
        b0 = new HashMap<String, com.untis.mobile.services.masterdata.a>();
    }
    
    private b(final String g) {
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<d>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final d invoke() {
                return (d)this.G.t(k1.d(d.class), null, null);
            }
        });
        this.I = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.profile.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.profile.a invoke() {
                return (com.untis.mobile.persistence.dao.profile.a)this.G.t(k1.d(com.untis.mobile.persistence.dao.profile.a.class), null, null);
            }
        });
        this.J = d0.c((n6.a<?>)new n6.a<j>() {
            final /* synthetic */ b G;
            
            @e
            public final j a() {
                return new j(b.i0(this.G), b.this.E0());
            }
        });
        this.K = d0.c((n6.a<?>)new n6.a<b>() {
            final /* synthetic */ b G;
            
            @e
            public final b a() {
                return new b(b.i0(this.G), EntityType.SUBJECT, b.this.E0());
            }
        });
        this.L = d0.c((n6.a<?>)new n6.a<o>() {
            final /* synthetic */ b G;
            
            @e
            public final o a() {
                return new o(b.i0(this.G), b.this.I0(), b.this.E0());
            }
        });
        this.M = d0.c((n6.a<?>)new n6.a<l>() {
            final /* synthetic */ b G;
            
            @e
            public final l a() {
                return new l(b.i0(this.G), b.this.E0());
            }
        });
        this.N = d0.c((n6.a<?>)new n6.a<p>() {
            final /* synthetic */ b G;
            
            @e
            public final p a() {
                return new p(b.i0(this.G), b.this.E0());
            }
        });
        this.O = d0.c((n6.a<?>)new n6.a<n>() {
            final /* synthetic */ b G;
            
            @e
            public final n a() {
                return new n(b.i0(this.G), b.this.E0());
            }
        });
        this.P = d0.c((n6.a<?>)new n6.a<i>() {
            final /* synthetic */ b G;
            
            @e
            public final i a() {
                return new i(b.i0(this.G), b.this.E0());
            }
        });
        this.Q = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.masterdata.cache.a>() {
            final /* synthetic */ b G;
            
            @e
            public final com.untis.mobile.services.masterdata.cache.a a() {
                return new com.untis.mobile.services.masterdata.cache.a(b.i0(this.G), b.this.E0());
            }
        });
        this.R = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.masterdata.cache.c>() {
            final /* synthetic */ b G;
            
            @e
            public final com.untis.mobile.services.masterdata.cache.c a() {
                return new com.untis.mobile.services.masterdata.cache.c(b.i0(this.G), b.this.E0());
            }
        });
        this.S = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.masterdata.cache.d>() {
            final /* synthetic */ b G;
            
            @e
            public final com.untis.mobile.services.masterdata.cache.d a() {
                return new com.untis.mobile.services.masterdata.cache.d(b.i0(this.G), b.this.E0());
            }
        });
        this.T = d0.c((n6.a<?>)new n6.a<f>() {
            final /* synthetic */ b G;
            
            @e
            public final f a() {
                return new f(b.i0(this.G), b.this.E0());
            }
        });
        this.U = d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ b G;
            
            @e
            public final g a() {
                return new g(b.i0(this.G), b.this.E0());
            }
        });
        this.V = d0.c((n6.a<?>)new n6.a<q>() {
            final /* synthetic */ b G;
            
            @e
            public final q a() {
                return new q(b.i0(this.G), b.this.E0());
            }
        });
        this.W = d0.c((n6.a<?>)new n6.a<m>() {
            final /* synthetic */ b G;
            
            @e
            public final m a() {
                return new m(b.i0(this.G), b.this.E0());
            }
        });
        this.X = d0.c((n6.a<?>)new n6.a<r>() {
            final /* synthetic */ b G;
            
            @e
            public final r a() {
                return new r(b.i0(this.G), b.this.E0());
            }
        });
        this.Y = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.classbook.g>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.classbook.g invoke() {
                return (com.untis.mobile.persistence.dao.classbook.g)this.G.t(k1.d(com.untis.mobile.persistence.dao.classbook.g.class), null, null);
            }
        });
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<Klasse> A0() {
        return this.J.getValue();
    }
    
    private final Schoolyear B0(final t t) {
        final List<Schoolyear> k = this.K();
        final ListIterator<Schoolyear> listIterator = k.listIterator(k.size());
        while (listIterator.hasPrevious()) {
            final Schoolyear previous = listIterator.previous();
            if (((org.joda.time.base.e)previous.getEnd()).o((n0)t)) {
                return previous;
            }
        }
        return null;
    }
    
    private final Schoolyear C0(final t t) {
        for (final Schoolyear next : this.K()) {
            if (((org.joda.time.base.e)next.getStart()).m((n0)t)) {
                return next;
            }
        }
        return null;
    }
    
    private final com.untis.mobile.persistence.dao.profile.a D0() {
        return this.I.getValue();
    }
    
    private final d E0() {
        return this.H.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<Room> F0() {
        return this.M.getValue();
    }
    
    private final m G0() {
        return this.W.getValue();
    }
    
    private final n H0() {
        return this.O.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<CustomEntityColor> I0() {
        return this.K.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<Subject> J0() {
        return this.L.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<TeachingMethod> K0() {
        return this.V.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<Teacher> L0() {
        return this.N.getValue();
    }
    
    private final r M0() {
        return this.X.getValue();
    }
    
    private final Profile N0() {
        return this.D0().g(this.G);
    }
    
    public static final /* synthetic */ Map a0() {
        return b.b0;
    }
    
    public static final /* synthetic */ String i0(final b b) {
        return b.G;
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<AbsenceReason> t0() {
        return this.Q.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<Department> u0() {
        return this.R.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<Duty> v0() {
        return this.S.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<EventReasonGroup> w0() {
        return this.U.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<EventReason> x0() {
        return this.T.getValue();
    }
    
    private final com.untis.mobile.persistence.dao.classbook.g y0() {
        return this.Y.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.e<Holiday> z0() {
        return this.P.getValue();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object A(@e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object a) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(a);
                    final Profile s0 = b.this.N0();
                    if (s0 == null) {
                        return j2.a;
                    }
                    final ArrayList<Long> list = new ArrayList<Long>();
                    if (s0.getEntityType() == EntityType.STUDENT) {
                        list.add(kotlin.coroutines.jvm.internal.b.g(s0.getEntityId()));
                    }
                    final Iterator<Object> iterator = s0.getUserChildren().iterator();
                    while (iterator.hasNext()) {
                        list.add(kotlin.coroutines.jvm.internal.b.g(iterator.next().getId()));
                    }
                    if (list.isEmpty()) {
                        return j2.a;
                    }
                    a = b.this.E0().a(s0);
                    try {
                        ((io.realm.f0)a).beginTransaction();
                        final RealmQuery<w4.g> l1 = ((io.realm.f0)a).f3(w4.g.class).l1();
                        final Long[] array = list.toArray(new Long[0]);
                        if (array != null) {
                            l1.D0("id", array).b0().T3();
                            ((io.realm.f0)a).n();
                            final j2 a2 = j2.a;
                            kotlin.io.c.a((Closeable)a, null);
                            return a2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            kotlin.io.c.a((Closeable)a, t);
                        }
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Holiday B(final long n) {
        return this.z0().g(n);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public EventReasonGroup C(final long n) {
        return this.w0().g(n);
    }
    
    @e
    @Override
    public List<Klasse> D(@e final List<Long> list) {
        k0.p(list, "ids");
        return this.A0().h(list);
    }
    
    @e
    @Override
    public List<Holiday> E() {
        return this.z0().e();
    }
    
    @e
    @Override
    public List<Duty> F() {
        return this.v0().e();
    }
    
    @e
    @Override
    public String G(@e final EntityType entityType, final long n) {
        k0.p(entityType, "entityType");
        final int n2 = b.a[entityType.ordinal()];
        final String s = "";
        String s2;
        if (n2 != 2) {
            if (n2 != 3) {
                if (n2 != 4) {
                    if (n2 != 5) {
                        s2 = s;
                    }
                    else {
                        final Room p2 = this.P(n);
                        if (p2 == null) {
                            s2 = s;
                        }
                        else if ((s2 = p2.getName()) == null) {
                            s2 = s;
                        }
                    }
                }
                else {
                    final Subject u = this.U(n);
                    if (u == null) {
                        s2 = s;
                    }
                    else if ((s2 = u.getName()) == null) {
                        s2 = s;
                    }
                }
            }
            else {
                final Teacher k = this.k(n);
                if (k == null) {
                    s2 = s;
                }
                else if ((s2 = k.getName()) == null) {
                    s2 = s;
                }
            }
        }
        else {
            final Klasse n3 = this.N(n);
            if (n3 == null) {
                s2 = s;
            }
            else if ((s2 = n3.getName()) == null) {
                s2 = s;
            }
        }
        return s2;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public AbsenceReason H(final long n) {
        return this.t0().g(n);
    }
    
    @e
    @Override
    public List<TeachingMethod> I() {
        return this.K0().e();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object J(@e final CustomEntityColor customEntityColor, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ CustomEntityColor H;
            final /* synthetic */ b I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ CustomEntityColor H = this.H;
                    final /* synthetic */ b I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    b.this.I0().b(v.k(kotlin.coroutines.jvm.internal.b.g(this.H.getEntityId())));
                    b.this.J0().k();
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public List<Schoolyear> K() {
        return this.G0().e();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object L(@e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    b.this.I0().a();
                    b.this.J0().k();
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Schoolyear M(@e final t t) {
        k0.p(t, "date");
        return this.G0().n(t);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Klasse N(final long n) {
        return this.A0().g(n);
    }
    
    @e
    @Override
    public List<TimeGrid> O() {
        return this.M0().e();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Room P(final long n) {
        return this.F0().g(n);
    }
    
    @e
    @Override
    public List<Teacher> Q(@e final List<Long> list) {
        k0.p(list, "ids");
        return this.L0().h(list);
    }
    
    @e
    @Override
    public List<Room> R(@e final List<Long> list) {
        k0.p(list, "ids");
        return this.F0().h(list);
    }
    
    @e
    @Override
    public String S(@e final EntityType entityType, final long n) {
        k0.p(entityType, "entityType");
        final int n2 = b.a[entityType.ordinal()];
        final String s = "";
        String s2;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            s2 = s;
                        }
                        else {
                            final Room p2 = this.P(n);
                            if (p2 == null) {
                                s2 = s;
                            }
                            else if ((s2 = p2.getDisplayName()) == null) {
                                s2 = s;
                            }
                        }
                    }
                    else {
                        final Subject u = this.U(n);
                        if (u == null) {
                            s2 = s;
                        }
                        else if ((s2 = u.getDisplayName()) == null) {
                            s2 = s;
                        }
                    }
                }
                else {
                    final Teacher k = this.k(n);
                    if (k == null) {
                        s2 = s;
                    }
                    else if ((s2 = k.getDisplayName()) == null) {
                        s2 = s;
                    }
                }
            }
            else {
                final Klasse n3 = this.N(n);
                if (n3 == null) {
                    s2 = s;
                }
                else if ((s2 = n3.getDisplayName()) == null) {
                    s2 = s;
                }
            }
        }
        else {
            final Student v = this.V(n);
            if (v == null) {
                s2 = s;
            }
            else if ((s2 = v.getDisplayName()) == null) {
                s2 = s;
            }
        }
        return s2;
    }
    
    @e
    @Override
    public List<Department> T() {
        return this.u0().e();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Subject U(final long n) {
        return this.J0().g(n);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Student V(final long n) {
        return this.H0().g(n);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public TeachingMethod W(final long n) {
        return this.K0().g(n);
    }
    
    @e
    @Override
    public List<ExcuseStatus> X() {
        return this.y0().b(this.G);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object Y(@e final Collection<? extends UMPerson> collection, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ Collection<UMPerson> I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ Collection<UMPerson> I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$q)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    final com.untis.mobile.services.masterdata.cache.n m0 = b.this.H0();
                    final Collection<UMPerson> i = this.I;
                    final ArrayList list = new ArrayList<Student>(v.Y((Iterable<?>)i, 10));
                    final Iterator<Object> iterator = i.iterator();
                    while (iterator.hasNext()) {
                        list.add(f0.a.c(iterator.next()));
                    }
                    m0.o((List<Student>)list);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public List<Subject> a(@e final List<Long> list) {
        k0.p(list, "ids");
        return this.J0().h(list);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public TimeGrid b(@e final Schoolyear schoolyear) {
        k0.p(schoolyear, "schoolyear");
        return this.M0().g(schoolyear.getId());
    }
    
    @org.jetbrains.annotations.f
    @Override
    public ExcuseStatus c(final long n) {
        return this.y0().a(this.G, n);
    }
    
    @e
    @Override
    public List<AbsenceReason> d(final boolean b) {
        if (!b) {
            return this.t0().e();
        }
        final List<AbsenceReason> e = this.t0().e();
        final ArrayList<AbsenceReason> list = new ArrayList<AbsenceReason>();
        for (final AbsenceReason next : e) {
            if (next.getActive()) {
                list.add(next);
            }
        }
        return list;
    }
    
    @e
    @Override
    public List<Student> e(@e final List<Long> list) {
        k0.p(list, "ids");
        return this.H0().h(list);
    }
    
    @e
    @Override
    public List<Klasse> f(final boolean b) {
        if (!b) {
            return this.A0().e();
        }
        final t i = com.untis.mobile.utils.v.a.i();
        final List<Klasse> e = this.A0().e();
        final ArrayList<Klasse> list = new ArrayList<Klasse>();
        for (final Klasse next : e) {
            final Klasse klasse = next;
            if (klasse.getActive() && klasse.getDisplayable() && (((org.joda.time.base.e)klasse.getEnd()).m((n0)i) || ((org.joda.time.base.e)klasse.getEnd()).p((n0)b.a0))) {
                list.add(next);
            }
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Department g(final long n) {
        return this.u0().g(n);
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @e
    @Override
    public List<Teacher> h(final boolean b, @e final t t) {
        k0.p(t, "date");
        if (!b) {
            return this.L0().e();
        }
        final List<Teacher> e = this.L0().e();
        final ArrayList<Teacher> list = new ArrayList<Teacher>();
        for (final Teacher next : e) {
            final Teacher teacher = next;
            final boolean active = teacher.getActive();
            boolean b2 = false;
            if (active) {
                if (teacher.getDisplayable()) {
                    final t a0 = b.a0;
                    if (((org.joda.time.base.e)a0).p((n0)teacher.getStart()) || !((org.joda.time.base.e)teacher.getStart()).m((n0)t)) {
                        if (((org.joda.time.base.e)a0).p((n0)teacher.getEnd()) || !((org.joda.time.base.e)teacher.getEnd()).o((n0)t)) {
                            b2 = true;
                        }
                    }
                }
            }
            if (b2) {
                list.add(next);
            }
        }
        return list;
    }
    
    @e
    @Override
    public List<EventReasonGroup> i(final boolean b) {
        if (!b) {
            return this.w0().e();
        }
        final List<EventReasonGroup> e = this.w0().e();
        final ArrayList<EventReasonGroup> list = new ArrayList<EventReasonGroup>();
        for (final EventReasonGroup next : e) {
            if (next.getActive()) {
                list.add(next);
            }
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object j(@e final UMMasterData umMasterData, @e final t t, @e final t t2, final boolean b, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>(t) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ UMMasterData I;
            final /* synthetic */ boolean J;
            final /* synthetic */ org.joda.time.t K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ UMMasterData I = this.I;
                    final /* synthetic */ boolean J = this.J;
                    final /* synthetic */ org.joda.time.t K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$o)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final Profile s0 = b.this.N0();
                if (s0 == null) {
                    return j2.a;
                }
                s0.setMasterDataTimestamp(this.I.timeStamp);
                j0.G.d(s0);
                if (this.J) {
                    final com.untis.mobile.services.masterdata.cache.e h0 = b.this.A0();
                    final List<UMKlasse> klassen = this.I.klassen;
                    final Object o2 = null;
                    ArrayList<Klasse> list;
                    if (klassen == null) {
                        list = null;
                    }
                    else {
                        final ArrayList<Klasse> list2 = new ArrayList<Klasse>();
                        final Iterator<Object> iterator = klassen.iterator();
                        while (true) {
                            list = list2;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final UMKlasse umKlasse = iterator.next();
                            final com.untis.mobile.utils.mapper.realmToModel.q a = com.untis.mobile.utils.mapper.realmToModel.q.a;
                            k0.o(umKlasse, "it");
                            final Klasse a2 = a.a(umKlasse);
                            if (a2 == null) {
                                continue;
                            }
                            list2.add(a2);
                        }
                    }
                    Object e;
                    if ((e = list) == null) {
                        e = v.E();
                    }
                    h0.l((List)e, this.J);
                    final com.untis.mobile.services.masterdata.cache.e o3 = b.this.J0();
                    final List<UMSubject> subjects = this.I.subjects;
                    if (subjects == null) {
                        o = null;
                    }
                    else {
                        final Collection<Subject> collection = new ArrayList<Subject>();
                        final Iterator<Object> iterator2 = subjects.iterator();
                        while (true) {
                            o = collection;
                            if (!iterator2.hasNext()) {
                                break;
                            }
                            final UMSubject umSubject = iterator2.next();
                            final g0 a3 = g0.a;
                            k0.o(umSubject, "it");
                            final Subject c = a3.c(umSubject);
                            if (c == null) {
                                continue;
                            }
                            collection.add(c);
                        }
                    }
                    Object e2;
                    if ((e2 = o) == null) {
                        e2 = v.E();
                    }
                    o3.l((List)e2, this.J);
                    final com.untis.mobile.services.masterdata.cache.e k0 = b.this.F0();
                    final List<UMRoom> rooms = this.I.rooms;
                    if (rooms == null) {
                        o = null;
                    }
                    else {
                        final Collection<Room> collection2 = new ArrayList<Room>();
                        final Iterator<Object> iterator3 = rooms.iterator();
                        while (true) {
                            o = collection2;
                            if (!iterator3.hasNext()) {
                                break;
                            }
                            final UMRoom umRoom = iterator3.next();
                            final c0 a4 = c0.a;
                            kotlin.jvm.internal.k0.o(umRoom, "it");
                            final Room c2 = a4.c(umRoom);
                            if (c2 == null) {
                                continue;
                            }
                            collection2.add(c2);
                        }
                    }
                    Object e3;
                    if ((e3 = o) == null) {
                        e3 = v.E();
                    }
                    k0.l((List)e3, this.J);
                    final com.untis.mobile.services.masterdata.cache.e q0 = b.this.L0();
                    final List<UMTeacher> teachers = this.I.teachers;
                    if (teachers == null) {
                        o = null;
                    }
                    else {
                        final Collection<Teacher> collection3 = new ArrayList<Teacher>();
                        final Iterator<Object> iterator4 = teachers.iterator();
                        while (true) {
                            o = collection3;
                            if (!iterator4.hasNext()) {
                                break;
                            }
                            final UMTeacher umTeacher = iterator4.next();
                            final h0 a5 = com.untis.mobile.utils.mapper.realmToModel.h0.a;
                            kotlin.jvm.internal.k0.o(umTeacher, "it");
                            final Teacher c3 = a5.c(umTeacher);
                            if (c3 == null) {
                                continue;
                            }
                            collection3.add(c3);
                        }
                    }
                    Object e4;
                    if ((e4 = o) == null) {
                        e4 = v.E();
                    }
                    q0.l((List)e4, this.J);
                    final com.untis.mobile.services.masterdata.cache.e g0 = b.this.z0();
                    final List<UMHoliday> holidays = this.I.holidays;
                    if (holidays == null) {
                        o = null;
                    }
                    else {
                        final Collection<Holiday> collection4 = new ArrayList<Holiday>();
                        final Iterator<Object> iterator5 = holidays.iterator();
                        while (true) {
                            o = collection4;
                            if (!iterator5.hasNext()) {
                                break;
                            }
                            final UMHoliday umHoliday = iterator5.next();
                            final com.untis.mobile.utils.mapper.realmToModel.o a6 = com.untis.mobile.utils.mapper.realmToModel.o.a;
                            kotlin.jvm.internal.k0.o(umHoliday, "it");
                            final Holiday a7 = a6.a(umHoliday);
                            if (a7 == null) {
                                continue;
                            }
                            collection4.add(a7);
                        }
                    }
                    Object e5;
                    if ((e5 = o) == null) {
                        e5 = v.E();
                    }
                    g0.l((List)e5, this.J);
                    final com.untis.mobile.services.masterdata.cache.e z = b.this.t0();
                    final List<UMAbsenceReason> absenceReasons = this.I.absenceReasons;
                    if (absenceReasons == null) {
                        o = null;
                    }
                    else {
                        final Collection<AbsenceReason> collection5 = new ArrayList<AbsenceReason>();
                        final Iterator<Object> iterator6 = absenceReasons.iterator();
                        while (true) {
                            o = collection5;
                            if (!iterator6.hasNext()) {
                                break;
                            }
                            final AbsenceReason a8 = com.untis.mobile.utils.mapper.realmToModel.a.a.a(iterator6.next());
                            if (a8 == null) {
                                continue;
                            }
                            collection5.add(a8);
                        }
                    }
                    Object e6;
                    if ((e6 = o) == null) {
                        e6 = v.E();
                    }
                    z.l((List)e6, this.J);
                    final com.untis.mobile.services.masterdata.cache.e b0 = b.this.u0();
                    final List<UMDepartment> departments = this.I.departments;
                    if (departments == null) {
                        o = null;
                    }
                    else {
                        final Collection<Department> collection6 = new ArrayList<Department>();
                        final Iterator<Object> iterator7 = departments.iterator();
                        while (true) {
                            o = collection6;
                            if (!iterator7.hasNext()) {
                                break;
                            }
                            final Department a9 = com.untis.mobile.utils.mapper.realmToModel.g.a.a(iterator7.next());
                            if (a9 == null) {
                                continue;
                            }
                            collection6.add(a9);
                        }
                    }
                    Object e7;
                    if ((e7 = o) == null) {
                        e7 = v.E();
                    }
                    b0.l((List)e7, this.J);
                    final com.untis.mobile.services.masterdata.cache.e c4 = b.this.v0();
                    final List<UMDuty> duties = this.I.duties;
                    if (duties == null) {
                        o = null;
                    }
                    else {
                        final Collection<Duty> collection7 = new ArrayList<Duty>();
                        final Iterator<Object> iterator8 = duties.iterator();
                        while (true) {
                            o = collection7;
                            if (!iterator8.hasNext()) {
                                break;
                            }
                            final Duty a10 = com.untis.mobile.utils.mapper.realmToModel.i.a.a(iterator8.next());
                            if (a10 == null) {
                                continue;
                            }
                            collection7.add(a10);
                        }
                    }
                    Object e8;
                    if ((e8 = o) == null) {
                        e8 = v.E();
                    }
                    c4.l((List)e8, this.J);
                    final com.untis.mobile.services.masterdata.cache.e e9 = b.this.x0();
                    final List<UMEventReason> eventReasons = this.I.eventReasons;
                    if (eventReasons == null) {
                        o = null;
                    }
                    else {
                        final Collection<EventReason> collection8 = new ArrayList<EventReason>();
                        final Iterator<Object> iterator9 = eventReasons.iterator();
                        while (true) {
                            o = collection8;
                            if (!iterator9.hasNext()) {
                                break;
                            }
                            final EventReason a11 = com.untis.mobile.utils.mapper.realmToModel.l.a.a(iterator9.next());
                            if (a11 == null) {
                                continue;
                            }
                            collection8.add(a11);
                        }
                    }
                    Object e10;
                    if ((e10 = o) == null) {
                        e10 = v.E();
                    }
                    e9.l((List)e10, this.J);
                    final com.untis.mobile.services.masterdata.cache.e d0 = b.this.w0();
                    final List<UMEventReasonGroup> eventReasonGroups = this.I.eventReasonGroups;
                    if (eventReasonGroups == null) {
                        o = null;
                    }
                    else {
                        final Collection<EventReasonGroup> collection9 = new ArrayList<EventReasonGroup>();
                        final Iterator<Object> iterator10 = eventReasonGroups.iterator();
                        while (true) {
                            o = collection9;
                            if (!iterator10.hasNext()) {
                                break;
                            }
                            final EventReasonGroup a12 = k.a.a(iterator10.next());
                            if (a12 == null) {
                                continue;
                            }
                            collection9.add(a12);
                        }
                    }
                    Object e11;
                    if ((e11 = o) == null) {
                        e11 = v.E();
                    }
                    d0.l((List)e11, this.J);
                    b.this.y0().d(b.i0(this.H));
                    final com.untis.mobile.persistence.dao.classbook.g f0 = b.this.y0();
                    final String i0 = b.i0(this.H);
                    List<? extends UMExcuseStatus> list3;
                    if ((list3 = this.I.excuseStatuses) == null) {
                        list3 = v.E();
                    }
                    f0.c(i0, list3);
                    final com.untis.mobile.services.masterdata.cache.e p0 = b.this.K0();
                    final List<UMTeachingMethod> teachingMethods = this.I.teachingMethods;
                    if (teachingMethods == null) {
                        o = null;
                    }
                    else {
                        final Collection<TeachingMethod> collection10 = new ArrayList<TeachingMethod>();
                        final Iterator<Object> iterator11 = teachingMethods.iterator();
                        while (true) {
                            o = collection10;
                            if (!iterator11.hasNext()) {
                                break;
                            }
                            final TeachingMethod b2 = com.untis.mobile.utils.mapper.realmToModel.i0.a.b(iterator11.next());
                            if (b2 == null) {
                                continue;
                            }
                            collection10.add(b2);
                        }
                    }
                    Object e12;
                    if ((e12 = o) == null) {
                        e12 = v.E();
                    }
                    p0.l((List)e12, this.J);
                    final m l0 = b.this.G0();
                    final List<UMSchoolyear> schoolyears = this.I.schoolyears;
                    if (schoolyears == null) {
                        o = o2;
                    }
                    else {
                        final Collection<Schoolyear> collection11 = new ArrayList<Schoolyear>();
                        final Iterator<Object> iterator12 = schoolyears.iterator();
                        while (true) {
                            o = collection11;
                            if (!iterator12.hasNext()) {
                                break;
                            }
                            final Schoolyear j = e0.a.j(iterator12.next());
                            if (j == null) {
                                continue;
                            }
                            collection11.add(j);
                        }
                    }
                    Object e13;
                    if ((e13 = o) == null) {
                        e13 = v.E();
                    }
                    l0.l((List<? extends Schoolyear>)e13, this.J);
                }
                if (this.I.timeGrid != null) {
                    final r r0 = b.this.M0();
                    final l0 a13 = l0.a;
                    final UMTimeGrid timeGrid = this.I.timeGrid;
                    k0.o(timeGrid, "umMasterData.timeGrid");
                    final Schoolyear n = b.this.G0().n(this.K);
                    long longValue = 0L;
                    if (n != null) {
                        final Long g2 = kotlin.coroutines.jvm.internal.b.g(n.getId());
                        if (g2 != null) {
                            longValue = g2;
                        }
                    }
                    r0.l(v.k(a13.g(timeGrid, longValue)), false);
                }
                return j2.a;
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Teacher k(final long n) {
        return this.L0().g(n);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object l(@e final List<Student> list, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ List<Student> I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ List<Student> I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$n)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    b.this.H0().o(this.I);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public List<Room> m(final boolean b) {
        if (!b) {
            return this.F0().e();
        }
        final List<Room> e = this.F0().e();
        final ArrayList<Room> list = new ArrayList<Room>();
        for (final Room next : e) {
            final Room room = next;
            if (room.getActive() && room.getDisplayable()) {
                list.add(next);
            }
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public TimeGrid n(final long n) {
        return this.M0().g(n);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object o(@e final Collection<? extends UMStudent> collection, final boolean b, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ Collection<UMStudent> I;
            final /* synthetic */ boolean J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ Collection<UMStudent> I = this.I;
                    final /* synthetic */ boolean J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$p)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    final com.untis.mobile.services.masterdata.cache.n m0 = b.this.H0();
                    final Collection<UMStudent> i = this.I;
                    final ArrayList list = new ArrayList<Student>(v.Y((Iterable<?>)i, 10));
                    final Iterator<Object> iterator = i.iterator();
                    while (iterator.hasNext()) {
                        list.add(f0.a.d(iterator.next()));
                    }
                    m0.l((List<? extends Student>)list, this.J);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Holiday p(@e final t t) {
        k0.p(t, "date");
        for (final Holiday next : this.z0().e()) {
            final Holiday holiday = next;
            if (!((org.joda.time.base.e)t).o((n0)holiday.getStart()) && !((org.joda.time.base.e)t).m((n0)holiday.getEnd())) {
                return next;
            }
        }
        return null;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object q(@e final CustomEntityColor customEntityColor, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ CustomEntityColor I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ CustomEntityColor I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$r)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    b.this.I0().l(v.k((Target)this.I), false);
                    b.this.J0().k();
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public List<EventReason> r(final boolean b) {
        if (!b) {
            return this.x0().e();
        }
        final List<EventReason> e = this.x0().e();
        final ArrayList<EventReason> list = new ArrayList<EventReason>();
        for (final EventReason next : e) {
            if (next.getActive()) {
                list.add(next);
            }
        }
        return list;
    }
    
    @e
    @Override
    public List<Student> s() {
        return this.H0().e();
    }
    
    @e
    @Override
    public List<CustomEntityColor> t() {
        return this.I0().e();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Duty u(final long n) {
        return this.v0().g(n);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public DisplayableEntity v(@e final EntityType entityType, final long n) {
        k0.p(entityType, "entityType");
        final int n2 = b.a[entityType.ordinal()];
        DisplayableEntity displayableEntity;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            displayableEntity = null;
                        }
                        else {
                            displayableEntity = this.P(n);
                        }
                    }
                    else {
                        displayableEntity = this.U(n);
                    }
                }
                else {
                    displayableEntity = this.k(n);
                }
            }
            else {
                displayableEntity = this.N(n);
            }
        }
        else {
            displayableEntity = this.V(n);
        }
        return displayableEntity;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public EventReason w(final long n) {
        return this.x0().g(n);
    }
    
    @e
    @Override
    public List<Subject> x(final boolean b) {
        if (!b) {
            return this.J0().e();
        }
        final List<Subject> e = this.J0().e();
        final ArrayList<Subject> list = new ArrayList<Subject>();
        for (final Subject next : e) {
            final Subject subject = next;
            if (subject.getActive() && subject.getDisplayable()) {
                list.add(next);
            }
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public TimeGrid y(@e final t t) {
        k0.p(t, "date");
        final List<TimeGrid> e = this.M0().e();
        if (this.G0().e().isEmpty()) {
            return (TimeGrid)v.t2((List<?>)e);
        }
        final Schoolyear m = this.M(t);
        final TimeGrid timeGrid = null;
        Schoolyear schoolyear;
        if ((schoolyear = m) == null && (schoolyear = this.B0(t)) == null && (schoolyear = this.C0(t)) == null) {
            return null;
        }
        final Iterator<Object> iterator = e.iterator();
        TimeGrid next;
        do {
            next = timeGrid;
            if (!iterator.hasNext()) {
                break;
            }
            next = iterator.next();
        } while (next.getId() != schoolyear.getId());
        TimeGrid timeGrid2;
        if ((timeGrid2 = next) == null) {
            timeGrid2 = v.t2((List<? extends TimeGrid>)e);
        }
        return timeGrid2;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Schoolyear z(final long n) {
        return this.G0().g(n);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "com/untis/mobile/services/masterdata/b$a", "", "", "profileId", "Lcom/untis/mobile/services/masterdata/a;", "a", "Lorg/joda/time/t;", "NULL_DATE", "Lorg/joda/time/t;", "", "cache", "Ljava/util/Map;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final com.untis.mobile.services.masterdata.a a(@e final String s) {
            k0.p(s, "profileId");
            com.untis.mobile.services.masterdata.a a;
            if ((a = b.a0().get(s)) == null) {
                a = new b(s, null);
                b.a0().put(s, a);
            }
            return a;
        }
    }
}
