// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.timetable.placeholder;

import io.realm.f0;
import java.util.Objects;
import com.untis.mobile.api.enumeration.ElementType;
import io.realm.s0;
import com.untis.mobile.persistence.models.masterdata.CustomEntityColor;
import org.koin.core.c$a;
import com.untis.mobile.persistence.models.timegrid.TimeGrid;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;
import com.untis.mobile.persistence.models.timegrid.TimeGridDay;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import android.annotation.SuppressLint;
import java.util.Comparator;
import com.untis.mobile.api.common.timetable.UMPeriodText;
import java.io.Closeable;
import io.realm.q;
import kotlinx.coroutines.i1;
import com.untis.mobile.persistence.models.profile.Profile;
import org.joda.time.r;
import com.untis.mobile.api.enumeration.UMPeriodState;
import com.untis.mobile.api.common.timetable.UMPeriodElement;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodElementModel;
import com.untis.mobile.persistence.models.Displayable;
import com.untis.mobile.persistence.models.timetable.period.ui.HolidayModel;
import org.joda.time.l0;
import android.util.Log;
import com.untis.mobile.api.common.UMTimetable;
import org.joda.time.n0;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import android.content.Context;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import com.untis.mobile.api.common.UMMasterData;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.j2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.b2;
import com.untis.mobile.api.dto.GetTimetableResponse;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.UntisMobileApplication;
import java.util.Iterator;
import java.util.Collection;
import com.untis.mobile.api.common.classreg.UMHomeWork;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import java.util.Set;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import com.untis.mobile.utils.mapper.realmToModel.x;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.api.common.timetable.UMPeriod;
import com.untis.mobile.services.masterdata.cache.s;
import kotlin.jvm.internal.k0;
import com.untis.mobile.utils.settings.g;
import com.untis.mobile.persistence.dao.classbook.m;
import com.untis.mobile.persistence.dao.classbook.o;
import com.untis.mobile.api.ApiService;
import kotlin.jvm.internal.k1;
import com.untis.mobile.persistence.realm.d;
import kotlin.d0;
import com.untis.mobile.services.masterdata.b;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import com.untis.mobile.ui.activities.timetable.a;
import java.util.HashSet;
import com.untis.mobile.persistence.models.timegrid.TimeGridUnit;
import java.util.List;
import org.joda.time.t;
import java.util.HashMap;
import com.untis.mobile.persistence.models.DefaultColors;
import kotlin.b0;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00ca\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00d2\u00012\u00020\u00012\u00020\u0002:\u0003\\DsB\u0014\b\u0002\u0012\u0007\u0010´\u0001\u001a\u00020#¢\u0006\u0006\b\u00d0\u0001\u0010\u00d1\u0001J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u001e\u0010\u000e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u000bH\u0002J&\u0010\u0016\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J4\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0002J$\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u00192\b\u0010!\u001a\u0004\u0018\u00010\u0019H\u0002J\u0014\u0010%\u001a\u0004\u0018\u00010\u00192\b\u0010$\u001a\u0004\u0018\u00010#H\u0002J.\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002J\u0010\u0010,\u001a\u00020#2\u0006\u0010+\u001a\u00020*H\u0002J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u000f2\u0006\u0010.\u001a\u00020-H\u0002J\u001c\u00104\u001a\u00020#2\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u000101H\u0002J\u001c\u00105\u001a\u00020#2\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u000101H\u0002J\u001c\u00107\u001a\u0002062\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u000101H\u0002J\u001c\u00108\u001a\u0002062\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u000101H\u0002J\u001b\u0010;\u001a\u00020\u00152\u0006\u0010:\u001a\u000209H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*2\u0006\u0010=\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001b\u0010B\u001a\u00020\u00152\u0006\u0010A\u001a\u00020@H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bB\u0010CJ!\u0010D\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020-0\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u0012\u0010I\u001a\u0004\u0018\u00010-2\u0006\u0010H\u001a\u00020\u0013H\u0016J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020-0\u000f2\u0006\u0010J\u001a\u00020\u0013H\u0016J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020-0\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020-0\u000f2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00130MH\u0016J\u001b\u0010P\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bP\u0010QJ9\u0010T\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010R\u001a\u00020\u00132\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u001b\u0010V\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bV\u0010WJ#\u0010X\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u001b\u0010Z\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bZ\u0010QJ(\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0[2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0017J\u001b\u0010^\u001a\u00020\u00152\u0006\u0010]\u001a\u00020&H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b^\u0010_J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010a\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u000e\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fH\u0016J\u001a\u0010c\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001b\u0010d\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bd\u0010WJ\u0016\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010g\u001a\u0002062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010h\u001a\u0002062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010i\u001a\u0002062\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010j\u001a\u0002062\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u001a\u0010k\u001a\u0004\u0018\u00010&2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010n\u001a\u00020\u00152\u0006\u0010m\u001a\u00020lH\u0016J\b\u0010o\u001a\u00020\u0015H\u0016J \u0010p\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010m\u001a\u00020lH\u0016J\u0018\u0010q\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J+\u0010s\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010r\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bs\u0010tJ#\u0010v\u001a\u00020\u00152\u0006\u0010u\u001a\u00020#2\u0006\u0010J\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bv\u0010wJ\u0013\u0010x\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bx\u0010GJ\u0013\u0010y\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\by\u0010GJ!\u0010{\u001a\u00020\u00152\f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b{\u0010ER\u001f\u0010\u0081\u0001\u001a\u00020|8B@\u0002X\u0082\u0084\u0002¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\"\u0010\u0086\u0001\u001a\u00030\u0082\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010~\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R!\u0010\u008a\u0001\u001a\u00030\u0087\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bX\u0010~\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\"\u0010\u008f\u0001\u001a\u00030\u008b\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010~\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\"\u0010\u0098\u0001\u001a\u00030\u0094\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010~\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\"\u0010\u009d\u0001\u001a\u00030\u0099\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009a\u0001\u0010~\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R+\u0010¢\u0001\u001a\u0014\u0012\u0004\u0012\u00020l0\u009e\u0001j\t\u0012\u0004\u0012\u00020l`\u009f\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R!\u0010¦\u0001\u001a\u00030£\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b;\u0010~\u001a\u0006\b¤\u0001\u0010¥\u0001R\"\u0010«\u0001\u001a\u00030§\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¨\u0001\u0010~\u001a\u0006\b©\u0001\u0010ª\u0001R\"\u0010°\u0001\u001a\u00030¬\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u00ad\u0001\u0010~\u001a\u0006\b®\u0001\u0010¯\u0001R\u001d\u0010´\u0001\u001a\u00020#8\u0006@\u0006¢\u0006\u000f\n\u0005\bv\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\"\u0010¹\u0001\u001a\u00030µ\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¶\u0001\u0010~\u001a\u0006\b·\u0001\u0010¸\u0001R\"\u0010¾\u0001\u001a\u00030º\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b»\u0001\u0010~\u001a\u0006\b¼\u0001\u0010½\u0001R-\u0010\u00c1\u0001\u001a\u0016\u0012\u0005\u0012\u00030¿\u00010\u009e\u0001j\n\u0012\u0005\u0012\u00030¿\u0001`\u009f\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00c0\u0001\u0010¡\u0001R!\u0010\u00c5\u0001\u001a\u00030\u00c2\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bd\u0010~\u001a\u0006\b\u00c3\u0001\u0010\u00c4\u0001R\"\u0010\u00ca\u0001\u001a\u00030\u00c6\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u00c7\u0001\u0010~\u001a\u0006\b\u00c8\u0001\u0010\u00c9\u0001RC\u0010\u00cf\u0001\u001a,\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00cb\u0001j\u0015\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n`\u00cc\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00cd\u0001\u0010\u00ce\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u00d3\u0001" }, d2 = { "Lcom/untis/mobile/services/timetable/placeholder/p;", "Lcom/untis/mobile/services/timetable/placeholder/k;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "z0", "Lcom/untis/mobile/api/common/timetable/UMPeriod;", "first", "second", "", "w0", "", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit;", "units", "unit", "y0", "", "periods", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lkotlin/j2;", "A0", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Lorg/joda/time/t;", "monday", "sunday", "newStart", "newEnd", "a0", "date", "start", "end", "x0", "", "iso", "B0", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "b0", "Lcom/untis/mobile/persistence/models/timetable/period/ui/HolidayModel;", "v0", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "C0", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodElementModel;", "m0", "Lcom/untis/mobile/persistence/models/Displayable;", "current", "original", "h0", "i0", "", "s0", "e0", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "periodInfo", "H", "(Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;Lkotlin/coroutines/d;)Ljava/lang/Object;", "delete", "z", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;", "customEntityColor", "u", "(Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "r", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "id", "l", "lessonId", "v", "y", "", "ids", "D", "q", "(Lcom/untis/mobile/persistence/models/timetable/period/Period;Lkotlin/coroutines/d;)Ljava/lang/Object;", "firstPeriodId", "blockedUmPeriods", "E", "(Lcom/untis/mobile/persistence/models/EntityType;JJLjava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "(Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;Lkotlin/coroutines/d;)Ljava/lang/Object;", "I", "(Lcom/untis/mobile/persistence/models/EntityType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "k", "", "a", "model", "e", "(Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;Lkotlin/coroutines/d;)Ljava/lang/Object;", "n", "g", "t", "w", "J", "Lorg/joda/time/r;", "x", "o", "d", "f", "F", "h", "Lcom/untis/mobile/ui/activities/timetable/a;", "onTimeTableModelListener", "m", "p", "C", "i", "favorite", "c", "(Lcom/untis/mobile/persistence/models/EntityType;JZLkotlin/coroutines/d;)Ljava/lang/Object;", "channelId", "G", "(Ljava/lang/String;JLkotlin/coroutines/d;)Ljava/lang/Object;", "A", "B", "periodIds", "s", "Lcom/untis/mobile/persistence/dao/timetable/a;", "P", "Lkotlin/b0;", "l0", "()Lcom/untis/mobile/persistence/dao/timetable/a;", "periodDao", "Lcom/untis/mobile/utils/settings/g;", "Q", "r0", "()Lcom/untis/mobile/utils/settings/g;", "settings", "Lcom/untis/mobile/persistence/realm/d;", "q0", "()Lcom/untis/mobile/persistence/realm/d;", "realmService", "Lcom/untis/mobile/utils/a;", "R", "d0", "()Lcom/untis/mobile/utils/a;", "appsSettings", "Lcom/untis/mobile/persistence/models/DefaultColors;", "S", "Lcom/untis/mobile/persistence/models/DefaultColors;", "colors", "Lcom/untis/mobile/persistence/dao/classbook/a;", "K", "f0", "()Lcom/untis/mobile/persistence/dao/classbook/a;", "classbookDao", "Lcom/untis/mobile/persistence/dao/classbook/m;", "M", "j0", "()Lcom/untis/mobile/persistence/dao/classbook/m;", "lessontopicDao", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "W", "Ljava/util/HashSet;", "listeners", "Lcom/untis/mobile/services/masterdata/a;", "k0", "()Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/persistence/dao/classbook/o;", "L", "n0", "()Lcom/untis/mobile/persistence/dao/classbook/o;", "periodInfoDao", "Lcom/untis/mobile/persistence/dao/profile/a;", "O", "o0", "()Lcom/untis/mobile/persistence/dao/profile/a;", "profileDao", "Ljava/lang/String;", "p0", "()Ljava/lang/String;", "profileId", "Lcom/untis/mobile/services/masterdata/cache/s;", "T", "t0", "()Lcom/untis/mobile/services/masterdata/cache/s;", "timetableEntityCache", "Lcom/untis/mobile/persistence/dao/classbook/k;", "N", "g0", "()Lcom/untis/mobile/persistence/dao/classbook/k;", "homeworkDao", "Lcom/untis/mobile/services/timetable/placeholder/p$c;", "X", "requests", "Lcom/untis/mobile/api/ApiService;", "c0", "()Lcom/untis/mobile/api/ApiService;", "apiService", "Lcom/untis/mobile/services/masterdata/cache/t;", "U", "u0", "()Lcom/untis/mobile/services/masterdata/cache/t;", "timetableModelCache", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "V", "Ljava/util/HashMap;", "timeGridUnitCache", "<init>", "(Ljava/lang/String;)V", "Y", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class p implements k, org.koin.core.c
{
    @e
    public static final a Y;
    @e
    private static final Map<String, k> Z;
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
    private final DefaultColors S;
    @e
    private final b0 T;
    @e
    private final b0 U;
    @e
    private final HashMap<t, List<TimeGridUnit>> V;
    @e
    private final HashSet<com.untis.mobile.ui.activities.timetable.a> W;
    @e
    private final HashSet<c> X;
    
    static {
        Y = new a(null);
        Z = new HashMap<String, k>();
    }
    
    private p(final String g) {
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.masterdata.a>() {
            final /* synthetic */ p G;
            
            @e
            @Override
            public final com.untis.mobile.services.masterdata.a invoke() {
                return com.untis.mobile.services.masterdata.b.Z.a(this.G.p0());
            }
        });
        this.I = d0.c((n6.a<?>)new n6.a<d>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final d invoke() {
                return (d)this.G.t(k1.d(d.class), null, null);
            }
        });
        this.J = d0.c((n6.a<?>)new n6.a<ApiService>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final ApiService invoke() {
                return (ApiService)this.G.t(k1.d(ApiService.class), null, null);
            }
        });
        this.K = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.classbook.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.classbook.a invoke() {
                return (com.untis.mobile.persistence.dao.classbook.a)this.G.t(k1.d(com.untis.mobile.persistence.dao.classbook.a.class), null, null);
            }
        });
        this.L = d0.c((n6.a<?>)new n6.a<o>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final o invoke() {
                return (o)this.G.t(k1.d(o.class), null, null);
            }
        });
        this.M = d0.c((n6.a<?>)new n6.a<m>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final m invoke() {
                return (m)this.G.t(k1.d(m.class), null, null);
            }
        });
        this.N = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.classbook.k>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.classbook.k invoke() {
                return (com.untis.mobile.persistence.dao.classbook.k)this.G.t(k1.d(com.untis.mobile.persistence.dao.classbook.k.class), null, null);
            }
        });
        this.O = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.profile.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.profile.a invoke() {
                return (com.untis.mobile.persistence.dao.profile.a)this.G.t(k1.d(com.untis.mobile.persistence.dao.profile.a.class), null, null);
            }
        });
        this.P = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.timetable.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.timetable.a invoke() {
                return (com.untis.mobile.persistence.dao.timetable.a)this.G.t(k1.d(com.untis.mobile.persistence.dao.timetable.a.class), null, null);
            }
        });
        this.Q = d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final g invoke() {
                return (g)this.G.t(k1.d(g.class), null, null);
            }
        });
        this.R = d0.c((n6.a<?>)new n6.a<com.untis.mobile.utils.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.utils.a invoke() {
                return (com.untis.mobile.utils.a)this.G.t(k1.d(com.untis.mobile.utils.a.class), null, null);
            }
        });
        final DefaultColors g2 = this.d0().g(g);
        k0.o(g2, "appsSettings.getColors(profileId)");
        this.S = g2;
        this.T = d0.c((n6.a<?>)new n6.a<s>() {
            final /* synthetic */ p G;
            
            @e
            public final s a() {
                return new s(this.G.p0(), p.this.q0());
            }
        });
        this.U = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.masterdata.cache.t>() {
            final /* synthetic */ p G;
            
            @e
            public final com.untis.mobile.services.masterdata.cache.t a() {
                return new com.untis.mobile.services.masterdata.cache.t(this.G.p0(), p.this.q0(), p.this.k0(), p.this.f0());
            }
        });
        this.V = new HashMap<t, List<TimeGridUnit>>();
        this.W = new HashSet<com.untis.mobile.ui.activities.timetable.a>();
        this.X = new HashSet<c>();
    }
    
    private final void A0(final List<? extends UMPeriod> list, final EntityType entityType, final long n) {
        final Map<Long, List<UMPeriod>> a = this.a(list);
        final com.untis.mobile.persistence.dao.timetable.a l0 = this.l0();
        final String g = this.G;
        final ArrayList<Period> list2 = new ArrayList<Period>(v.Y((Iterable<?>)list, 10));
        for (final UMPeriod umPeriod : list) {
            final x a2 = x.a;
            List<? extends UMPeriod> e;
            if ((e = a.get(umPeriod.id)) == null) {
                e = v.E();
            }
            list2.add(a2.f(umPeriod, e));
        }
        l0.c(g, list2);
        for (final UMPeriod umPeriod2 : list) {
            PeriodInfo a3;
            if ((a3 = this.n0().a(this.p0(), umPeriod2.id)) == null) {
                a3 = new PeriodInfo(umPeriod2.id, null, null, null, null, false, null, 126, null);
            }
            com.untis.mobile.utils.mapper.realmToModel.w.a.d(a3, umPeriod2.text);
            this.n0().c(this.p0(), a3);
            if (umPeriod2.homeWorks != null) {
                Classbook a4;
                if ((a4 = this.f0().a(this.p0(), umPeriod2.id)) == null) {
                    a4 = new Classbook(umPeriod2.id, null, null, null, null, null, null, false, true, null, 766, null);
                }
                final Set<HomeWork> homeWorks = a4.getHomeWorks();
                final ArrayList<HomeWork> list3 = new ArrayList<HomeWork>();
                for (final Object next : homeWorks) {
                    if (((HomeWork)next).getLocal()) {
                        list3.add((T)next);
                    }
                }
                final List<Object> i5 = v.I5((Iterable<?>)list3);
                final List<UMHomeWork> homeWorks2 = umPeriod2.homeWorks;
                k0.o(homeWorks2, "umPeriod.homeWorks");
                final ArrayList list4 = new ArrayList<HomeWork>(v.Y((Iterable<?>)homeWorks2, 10));
                for (final UMHomeWork umHomeWork : homeWorks2) {
                    final long id = umPeriod2.id;
                    final com.untis.mobile.utils.mapper.realmToModel.p a5 = com.untis.mobile.utils.mapper.realmToModel.p.a;
                    k0.o(umHomeWork, "it");
                    list4.add((T)a5.a(id, umHomeWork, entityType, n));
                }
                a4.setHomeWorks(v.M5((Iterable<? extends HomeWork>)list4));
                a4.getHomeWorks().addAll((Collection<? extends HomeWork>)i5);
                final Iterator<Object> iterator5 = a4.getHomeWorks().iterator();
                while (iterator5.hasNext()) {
                    com.untis.mobile.persistence.dao.classbook.k.a.a(this.g0(), this.p0(), iterator5.next(), false, 4, null);
                }
                this.f0().h(this.p0(), a4);
            }
        }
    }
    
    private final t B0(final String s) {
        final t t = null;
        if (s == null) {
            return null;
        }
        try {
            return org.joda.time.t.c0(kotlin.text.s.k2(s, "Z", "", false, 4, (Object)null));
        }
        catch (Exception ex) {
            return t;
        }
    }
    
    private final String C0(final HomeWork homeWork) {
        final boolean completedStatus = homeWork.getCompletedStatus();
        String s = homeWork.getText();
        if (completedStatus) {
            s = k0.C("@completed@", s);
        }
        return s;
    }
    
    public static final /* synthetic */ Map N() {
        return p.Z;
    }
    
    private static final void X(final p p8, final UntisMobileApplication untisMobileApplication, final TimeTableEntity timeTableEntity, final t t, final t t2, final c o, long n, final GetTimetableResponse getTimetableResponse) {
        k0.p(p8, "this$0");
        k0.p(untisMobileApplication, "$context");
        k0.p(timeTableEntity, "$timeTableEntity");
        k0.p(o, "$timeTableEntityWeek");
        if (getTimetableResponse.masterData != null) {
            h.f((r0)b2.G, (kotlin.coroutines.g)null, (u0)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>(t2) {
                int G;
                final /* synthetic */ p H;
                final /* synthetic */ GetTimetableResponse I;
                final /* synthetic */ org.joda.time.t J;
                final /* synthetic */ org.joda.time.t K;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ p H = this.H;
                        final /* synthetic */ GetTimetableResponse I = this.I;
                        final /* synthetic */ org.joda.time.t J = this.J;
                        final /* synthetic */ org.joda.time.t K = this.K;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((p$d)this.create(r0, d)).invokeSuspend(j2.a);
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
                        final com.untis.mobile.services.masterdata.a q = p.this.k0();
                        final UMMasterData masterData = this.I.masterData;
                        k0.o(masterData, "response.masterData");
                        final org.joda.time.t j = this.J;
                        k0.o(j, "monday");
                        final org.joda.time.t k = this.K;
                        k0.o(k, "sunday");
                        this.G = 1;
                        if (q.j(masterData, j, k, false, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 3, (Object)null);
        }
        final UMTimetable timetable = getTimetableResponse.timetable;
        if (timetable != null) {
            final List<UMPeriod> periods = timetable.periods;
            com.untis.mobile.utils.s.a.x(new n6.a<j2>() {
                public final void invoke() {
                    final p g = p8;
                    final List<UMPeriod> h = periods;
                    k0.o(h, "periods");
                    g.A0(h, timeTableEntity.getEntityType(), timeTableEntity.getEntityId());
                }
            });
            final UMTimetable timetable2 = getTimetableResponse.timetable;
            String displayableStartDate;
            if (timetable2 == null) {
                displayableStartDate = null;
            }
            else {
                displayableStartDate = timetable2.displayableStartDate;
            }
            final t b0 = p8.B0(displayableStartDate);
            final UMTimetable timetable3 = getTimetableResponse.timetable;
            String displayableEndDate;
            if (timetable3 == null) {
                displayableEndDate = null;
            }
            else {
                displayableEndDate = timetable3.displayableEndDate;
            }
            final t b2 = p8.B0(displayableEndDate);
            final j j = new j((Context)untisMobileApplication, p8.p0(), timeTableEntity.getEntityType(), timeTableEntity.getEntityId(), b0, b2);
            k0.o(getTimetableResponse, "response");
            k0.o(periods, "periods");
            final List<TimeTableModel> d = j.d(getTimetableResponse, p8.a(periods));
            k0.o(t, "monday");
            k0.o(t2, "sunday");
            p8.a0(timeTableEntity, t, t2, b0, b2);
            final HashSet<com.untis.mobile.ui.activities.timetable.a> w = p8.W;
            final ArrayList<com.untis.mobile.ui.activities.timetable.a> list = new ArrayList<com.untis.mobile.ui.activities.timetable.a>();
            for (final com.untis.mobile.ui.activities.timetable.a next : w) {
                if (k0.g(next.j(), timeTableEntity)) {
                    list.add(next);
                }
            }
            for (final TimeTableModel timeTableModel : d) {
                timeTableModel.setPreLoadedPeriodData(false);
                timeTableModel.setTimestamp(n);
                timeTableModel.setLastRequestTimestamp(n);
                h.h((kotlin.coroutines.g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H;
                    final /* synthetic */ TimeTableModel I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ p H = this.H;
                            final /* synthetic */ TimeTableModel I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((p$f)this.create(r0, d)).invokeSuspend(j2.a);
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
                            final p h2 = this.H;
                            final TimeTableModel i = this.I;
                            this.G = 1;
                            if (h2.e(i, this) == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, 1, (Object)null);
                final ArrayList<com.untis.mobile.ui.activities.timetable.a> list2 = new ArrayList<com.untis.mobile.ui.activities.timetable.a>();
                for (final com.untis.mobile.ui.activities.timetable.a next2 : list) {
                    if (((org.joda.time.base.e)next2.q()).p((n0)timeTableModel.getDate())) {
                        list2.add(next2);
                    }
                }
                final Iterator<Object> iterator4 = list2.iterator();
                while (iterator4.hasNext()) {
                    iterator4.next().c(timeTableModel);
                }
            }
        }
        else {
            final EntityType entityType = timeTableEntity.getEntityType();
            n = timeTableEntity.getEntityId();
            k0.o(t, "monday");
            k0.o(t2, "sunday");
            final List<TimeTableModel> b3 = p8.b0(entityType, n, t, t2);
            final UMTimetable timetable4 = getTimetableResponse.timetable;
            String displayableStartDate2;
            if (timetable4 == null) {
                displayableStartDate2 = null;
            }
            else {
                displayableStartDate2 = timetable4.displayableStartDate;
            }
            t d2;
            if (displayableStartDate2 != null) {
                d2 = com.untis.mobile.utils.mapper.common.b.d(timetable4.displayableStartDate);
            }
            else {
                d2 = null;
            }
            final UMTimetable timetable5 = getTimetableResponse.timetable;
            String displayableEndDate2;
            if (timetable5 == null) {
                displayableEndDate2 = null;
            }
            else {
                displayableEndDate2 = timetable5.displayableEndDate;
            }
            t d3;
            if (displayableEndDate2 != null) {
                d3 = com.untis.mobile.utils.mapper.common.b.d(timetable5.displayableEndDate);
            }
            else {
                d3 = null;
            }
            final HashSet<com.untis.mobile.ui.activities.timetable.a> w2 = p8.W;
            final ArrayList<com.untis.mobile.ui.activities.timetable.a> list3 = new ArrayList<com.untis.mobile.ui.activities.timetable.a>();
            for (final com.untis.mobile.ui.activities.timetable.a next3 : w2) {
                if (k0.g(next3.j(), timeTableEntity)) {
                    list3.add(next3);
                }
            }
            p8.a0(timeTableEntity, t, t2, d2, d3);
            for (final TimeTableModel timeTableModel2 : b3) {
                if (p8.x0(timeTableModel2.getDate(), d2, d3)) {
                    final UMMasterData masterData = getTimetableResponse.masterData;
                    Long value;
                    if (masterData == null) {
                        value = null;
                    }
                    else {
                        value = masterData.timeStamp;
                    }
                    if (value == null) {
                        n = timeTableModel2.getTimestamp();
                    }
                    else {
                        n = value;
                    }
                }
                else {
                    n = 0L;
                }
                timeTableModel2.setTimestamp(n);
                final UMMasterData masterData2 = getTimetableResponse.masterData;
                Long value2;
                if (masterData2 == null) {
                    value2 = null;
                }
                else {
                    value2 = masterData2.timeStamp;
                }
                if (value2 == null) {
                    n = timeTableModel2.getLastRequestTimestamp();
                }
                else {
                    n = value2;
                }
                timeTableModel2.setLastRequestTimestamp(n);
                h.h((kotlin.coroutines.g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H;
                    final /* synthetic */ TimeTableModel I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ p H = this.H;
                            final /* synthetic */ TimeTableModel I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((p$g)this.create(r0, d)).invokeSuspend(j2.a);
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
                            final p h2 = this.H;
                            final TimeTableModel i = this.I;
                            this.G = 1;
                            if (h2.e(i, this) == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, 1, (Object)null);
                final ArrayList<com.untis.mobile.ui.activities.timetable.a> list4 = new ArrayList<com.untis.mobile.ui.activities.timetable.a>();
                for (final com.untis.mobile.ui.activities.timetable.a next4 : list3) {
                    if (((org.joda.time.base.e)next4.q()).p((n0)timeTableModel2.getDate())) {
                        list4.add(next4);
                    }
                }
                final Iterator<Object> iterator8 = list4.iterator();
                while (iterator8.hasNext()) {
                    iterator8.next().c(timeTableModel2);
                }
            }
        }
        p8.X.remove(o);
    }
    
    private static final void Y(final t t, final p p4, final c o, final Throwable t2) {
        k0.p(t, "$date");
        k0.p(p4, "this$0");
        k0.p(o, "$timeTableEntityWeek");
        final StringBuilder sb = new StringBuilder();
        sb.append(t.Z2());
        sb.append(" error on loading of timetable");
        Log.e("untis_log", sb.toString(), t2);
        p4.X.remove(o);
    }
    
    private static final int Z(final UMPeriod umPeriod, final UMPeriod umPeriod2) {
        return ((org.joda.time.base.c)com.untis.mobile.utils.mapper.common.b.c(umPeriod.startDateTime)).b((l0)com.untis.mobile.utils.mapper.common.b.c(umPeriod2.startDateTime));
    }
    
    private final void a0(final TimeTableEntity timeTableEntity, t t, final t t2, final t t3, final t t4) {
        if (t3 != null && !((org.joda.time.base.e)t3).p((n0)t)) {
            t = new t((Object)t);
            while (((org.joda.time.base.e)t).o((n0)t3)) {
                this.u0().a(timeTableEntity.getEntityType(), timeTableEntity.getEntityId(), t);
                t = t.l0(1);
                k0.o(t, "date.plusDays(1)");
            }
        }
        if (t4 != null && !((org.joda.time.base.e)t4).p((n0)t2)) {
            t = new t((Object)t2);
            while (((org.joda.time.base.e)t).m((n0)t4)) {
                this.u0().a(timeTableEntity.getEntityType(), timeTableEntity.getEntityId(), t);
                t = t.O(1);
                k0.o(t, "date.minusDays(1)");
            }
        }
    }
    
    private final List<TimeTableModel> b0(final EntityType entityType, final long n, t l0, final t t) {
        final ArrayList<TimeTableModel> list = new ArrayList<TimeTableModel>();
        l0 = new t((Object)l0);
        while (((org.joda.time.base.e)l0).o((n0)t.l0(1))) {
            TimeTableModel d;
            if ((d = this.u0().d(entityType, n, l0)) == null) {
                d = new TimeTableModel(null, entityType, n, l0, -1L, null, null, null, false, 0L, null, 2017, null);
            }
            list.add(d);
            l0 = l0.l0(1);
            k0.o(l0, "date.plusDays(1)");
        }
        return list;
    }
    
    private final ApiService c0() {
        return this.J.getValue();
    }
    
    private final com.untis.mobile.utils.a d0() {
        return this.R.getValue();
    }
    
    private final int e0(final Displayable displayable, final Displayable displayable2) {
        int n;
        if (displayable != null && displayable2 != null && k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
            n = displayable.getDisplayableBackColor();
        }
        else {
            DefaultColors.DefaultColor defaultColor = null;
            Label_0081: {
                if (displayable == null || displayable2 == null || k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
                    if (displayable == null || displayable2 != null) {
                        if (displayable == null && displayable2 != null) {
                            defaultColor = this.S.getCancelled();
                            break Label_0081;
                        }
                        n = 0;
                        return n;
                    }
                }
                defaultColor = this.S.getSubstitution();
            }
            n = defaultColor.backColor;
        }
        return n;
    }
    
    private final com.untis.mobile.persistence.dao.classbook.a f0() {
        return this.K.getValue();
    }
    
    private final com.untis.mobile.persistence.dao.classbook.k g0() {
        return this.N.getValue();
    }
    
    private final String h0(final Displayable displayable, final Displayable displayable2) {
        if (displayable == null || displayable2 == null || !k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
            if (displayable != null && displayable2 != null && !k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
                final StringBuilder sb = new StringBuilder();
                sb.append(displayable.getDisplayableTitle());
                sb.append('(');
                sb.append(displayable2.getDisplayableTitle());
                sb.append(')');
                return sb.toString();
            }
            if (displayable == null || displayable2 != null) {
                if (displayable == null && displayable2 != null) {
                    return displayable2.getDisplayableTitle();
                }
                return "?";
            }
        }
        return displayable.getDisplayableTitle();
    }
    
    private final String i0(final Displayable displayable, final Displayable displayable2) {
        if (displayable == null || displayable2 == null || !k0.g(displayable.getDisplayableDescription(), displayable2.getDisplayableDescription())) {
            if (displayable != null && displayable2 != null && !k0.g(displayable.getDisplayableDescription(), displayable2.getDisplayableDescription())) {
                final StringBuilder sb = new StringBuilder();
                sb.append(displayable.getDisplayableDescription());
                sb.append('(');
                sb.append(displayable2.getDisplayableDescription());
                sb.append(')');
                return sb.toString();
            }
            if (displayable == null || displayable2 != null) {
                if (displayable == null && displayable2 != null) {
                    return displayable2.getDisplayableDescription();
                }
                return "?";
            }
        }
        return displayable.getDisplayableDescription();
    }
    
    private final m j0() {
        return this.M.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.a k0() {
        return this.H.getValue();
    }
    
    private final com.untis.mobile.persistence.dao.timetable.a l0() {
        return this.P.getValue();
    }
    
    private final List<PeriodElementModel> m0(final Period period) {
        final ArrayList<PeriodElementModel> list = new ArrayList<PeriodElementModel>();
        if (period.getSubject() != null) {
            final com.untis.mobile.services.masterdata.a k0 = this.k0();
            final PeriodElement subject = period.getSubject();
            kotlin.jvm.internal.k0.m(subject);
            final Subject u = k0.U(subject.getCurrentId());
            final com.untis.mobile.services.masterdata.a k2 = this.k0();
            final PeriodElement subject2 = period.getSubject();
            kotlin.jvm.internal.k0.m(subject2);
            final Subject u2 = k2.U(subject2.getOriginalId());
            final EntityType subject3 = EntityType.SUBJECT;
            long id;
            if (u == null) {
                id = 0L;
            }
            else {
                id = u.getId();
            }
            long id2;
            if (u2 == null) {
                id2 = 0L;
            }
            else {
                id2 = u2.getId();
            }
            list.add(new PeriodElementModel(subject3, id, id2, this.h0(u, u2), this.i0(u, u2), this.s0(u, u2), this.e0(u, u2)));
        }
        for (final PeriodElement periodElement : period.getTeachers()) {
            final Teacher i = this.k0().k(periodElement.getCurrentId());
            final Teacher j = this.k0().k(periodElement.getOriginalId());
            list.add(new PeriodElementModel(EntityType.TEACHER, periodElement.getCurrentId(), periodElement.getOriginalId(), this.h0(i, j), this.i0(i, j), this.s0(i, j), this.e0(i, j)));
        }
        for (final PeriodElement periodElement2 : period.getKlassen()) {
            final Klasse n = this.k0().N(periodElement2.getCurrentId());
            final Klasse n2 = this.k0().N(periodElement2.getOriginalId());
            list.add(new PeriodElementModel(EntityType.CLASS, periodElement2.getCurrentId(), periodElement2.getOriginalId(), this.h0(n, n2), this.i0(n, n2), this.s0(n, n2), this.e0(n, n2)));
        }
        for (final PeriodElement periodElement3 : period.getRooms()) {
            final Room p = this.k0().P(periodElement3.getCurrentId());
            final Room p2 = this.k0().P(periodElement3.getOriginalId());
            final EntityType room = EntityType.ROOM;
            long id3;
            if (p == null) {
                id3 = 0L;
            }
            else {
                id3 = p.getId();
            }
            long id4;
            if (p2 == null) {
                id4 = 0L;
            }
            else {
                id4 = p2.getId();
            }
            list.add(new PeriodElementModel(room, id3, id4, this.h0(p, p2), this.i0(p, p2), this.s0(p, p2), this.e0(p, p2)));
        }
        return list;
    }
    
    private final o n0() {
        return this.L.getValue();
    }
    
    private final com.untis.mobile.persistence.dao.profile.a o0() {
        return this.O.getValue();
    }
    
    private final d q0() {
        return this.I.getValue();
    }
    
    private final g r0() {
        return this.Q.getValue();
    }
    
    private final int s0(final Displayable displayable, final Displayable displayable2) {
        int n;
        if (displayable != null && displayable2 != null && k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
            n = displayable.getDisplayableTextColor();
        }
        else {
            DefaultColors.DefaultColor defaultColor = null;
            Label_0081: {
                if (displayable == null || displayable2 == null || k0.g(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle())) {
                    if (displayable == null || displayable2 != null) {
                        if (displayable == null && displayable2 != null) {
                            defaultColor = this.S.getCancelled();
                            break Label_0081;
                        }
                        n = 0;
                        return n;
                    }
                }
                defaultColor = this.S.getSubstitution();
            }
            n = defaultColor.foreColor;
        }
        return n;
    }
    
    private final s t0() {
        return this.T.getValue();
    }
    
    private final com.untis.mobile.services.masterdata.cache.t u0() {
        return this.U.getValue();
    }
    
    private final HolidayModel v0(final t t) {
        final Holiday p = this.k0().p(t);
        if (p != null) {
            return new HolidayModel(p.getId());
        }
        return null;
    }
    
    private final boolean w0(final UMPeriod umPeriod, final UMPeriod umPeriod2) {
        final long lessonId = umPeriod.lessonId;
        final long lessonId2 = umPeriod2.lessonId;
        final boolean b = false;
        if (lessonId != lessonId2) {
            return false;
        }
        if (umPeriod.isOnlinePeriod != umPeriod2.isOnlinePeriod) {
            return false;
        }
        if (!k0.g(umPeriod.text.info, umPeriod2.text.info)) {
            return false;
        }
        if (!k0.g(umPeriod.text.substitution, umPeriod2.text.substitution)) {
            return false;
        }
        final org.joda.time.c c = com.untis.mobile.utils.mapper.common.b.c(umPeriod.endDateTime);
        k0.o(c, "isoStringToDateTime(first.endDateTime)");
        final org.joda.time.c c2 = com.untis.mobile.utils.mapper.common.b.c(umPeriod2.startDateTime);
        k0.o(c2, "isoStringToDateTime(second.startDateTime)");
        if (!((org.joda.time.base.c)c.V0(15)).R((l0)c2) && !((org.joda.time.base.c)c.V0(15)).X4((l0)c2)) {
            return false;
        }
        final List<UMPeriodState> is = umPeriod.is;
        final List<UMPeriodState> is2 = umPeriod2.is;
        k0.o(is2, "second.`is`");
        boolean b2 = b;
        if (is.containsAll(is2)) {
            final List<UMPeriodState> is3 = umPeriod2.is;
            final List<UMPeriodState> is4 = umPeriod.is;
            k0.o(is4, "first.`is`");
            if (!is3.containsAll(is4)) {
                b2 = b;
            }
            else {
                final List<UMPeriodElement> elements = umPeriod.elements;
                k0.o(elements, "first.elements");
                final ArrayList list = new ArrayList<b>(v.Y((Iterable<?>)elements, 10));
                for (final UMPeriodElement umPeriodElement : elements) {
                    k0.o(umPeriodElement, "it");
                    list.add(new b(umPeriodElement));
                }
                final List<UMPeriodElement> elements2 = umPeriod2.elements;
                k0.o(elements2, "second.elements");
                final ArrayList list2 = new ArrayList<Object>(v.Y((Iterable<?>)elements2, 10));
                for (final UMPeriodElement umPeriodElement2 : elements2) {
                    k0.o(umPeriodElement2, "it");
                    list2.add((Object)new b(umPeriodElement2));
                }
                b2 = b;
                if (list.containsAll(list2)) {
                    b2 = b;
                    if (list2.containsAll(list)) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    private final boolean x0(final t t, final t t2, final t t3) {
        if (t2 != null) {
            if (t3 != null) {
                if (((org.joda.time.base.e)t).o((n0)t2)) {
                    return false;
                }
                if (((org.joda.time.base.e)t).m((n0)t3)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private final boolean y0(final List<TimeGridUnit> list, final TimeGridUnit timeGridUnit) {
        for (final TimeGridUnit timeGridUnit2 : list) {
            if (((org.joda.time.base.d)new r((l0)timeGridUnit2.getStart().u0(), (l0)timeGridUnit2.getEnd().u0())).F((org.joda.time.m0)new r((l0)timeGridUnit.getStart().u0(), (l0)timeGridUnit.getEnd().u0()))) {
                return true;
            }
        }
        return false;
    }
    
    private final Profile z0() {
        return this.o0().g(this.G);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object A(@e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$k)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    p.this.l0().g(this.H.p0());
                    p.this.u0().b();
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
    public Object B(@e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$n)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    final com.untis.mobile.services.masterdata.cache.t v = p.this.u0();
                    final List<TimeTableModel> c = p.this.u0().c();
                    final ArrayList list = new ArrayList<TimeTableModel>(kotlin.collections.v.Y((Iterable<?>)c, 10));
                    for (final TimeTableModel timeTableModel : c) {
                        timeTableModel.setTimestamp(0L);
                        list.add(timeTableModel);
                    }
                    v.i((List<TimeTableModel>)list);
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
    
    @Override
    public void C(@e final TimeTableEntity timeTableEntity, @e final t t, @e final com.untis.mobile.ui.activities.timetable.a a) {
        k0.p(timeTableEntity, "timeTableEntity");
        k0.p(t, "date");
        k0.p(a, "onTimeTableModelListener");
        final long n = ((org.joda.time.base.g)com.untis.mobile.utils.v.a.e()).n();
        final Profile z0 = this.z0();
        if (z0 == null) {
            return;
        }
        final HashSet<com.untis.mobile.ui.activities.timetable.a> w = this.W;
        // monitorenter(w)
        try {
            final UntisMobileApplication b = UntisMobileApplication.I.b();
            if (b == null) {
                // monitorexit(w)
                return;
            }
            if (!timeTableEntity.getEntityType().isTimetableEntity()) {
                a.o(new TimeTableModel(l.K, timeTableEntity.getEntityType(), timeTableEntity.getEntityId(), t, 0L, null, null, this.v0(t), false, 0L, null, 1904, null));
                // monitorexit(w)
                return;
            }
            if (this.W.contains(a)) {
                // monitorexit(w)
                return;
            }
            this.W.add(a);
            final TimeTableModel d = this.u0().d(timeTableEntity.getEntityType(), timeTableEntity.getEntityId(), t);
            final HashSet<com.untis.mobile.ui.activities.timetable.a> w2 = this.W;
            final ArrayList<com.untis.mobile.ui.activities.timetable.a> list = new ArrayList<com.untis.mobile.ui.activities.timetable.a>();
            final Iterator<Object> iterator = w2.iterator();
            int n2;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                n2 = 1;
                boolean b2 = true;
                if (!hasNext) {
                    break;
                }
                final com.untis.mobile.ui.activities.timetable.a next = iterator.next();
                final com.untis.mobile.ui.activities.timetable.a a2 = next;
                if (!k0.g(a2.j(), timeTableEntity) || !((org.joda.time.base.e)a2.q()).p((n0)t)) {
                    b2 = false;
                }
                if (!b2) {
                    continue;
                }
                list.add(next);
            }
            final Iterator<Object> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().o(d);
            }
            final long d2 = com.untis.mobile.utils.settings.e.d(this.r0());
            Label_0679: {
                if (d != null && d.getState(d2, z0.getSchoolServerDelta()) == l.K) {
                    break Label_0679;
                }
                final t s0 = t.S0(1);
                final HashSet<c> x = this.X;
                int n3 = 0;
                Label_0500: {
                    if (!(x instanceof Collection) || !x.isEmpty()) {
                        for (final c c : x) {
                            if (c.b() == timeTableEntity.getEntityType() && c.a() == timeTableEntity.getEntityId() && ((org.joda.time.base.e)c.c()).p((n0)s0)) {
                                n3 = n2;
                                break Label_0500;
                            }
                        }
                    }
                    n3 = 0;
                }
                if (n3 != 0) {
                    // monitorexit(w)
                    return;
                }
                final EntityType entityType = timeTableEntity.getEntityType();
                final long entityId = timeTableEntity.getEntityId();
                k0.o(s0, "monday");
                final c e = new c(entityType, entityId, s0);
                this.X.add(e);
                final t s2 = t.S0(7);
                final ApiService c2 = this.c0();
                final EntityType entityType2 = timeTableEntity.getEntityType();
                final long entityId2 = timeTableEntity.getEntityId();
                final EntityType entityType3 = timeTableEntity.getEntityType();
                final long entityId3 = timeTableEntity.getEntityId();
                k0.o(s2, "sunday");
                final rx.g e2 = c2.getTimeTable(z0, entityType2, entityId2, this.b0(entityType3, entityId3, s0, s2)).Q3(rx.schedulers.c.f()).E5(rx.schedulers.c.f());
                try {
                    e2.C5((rx.functions.b)new n(this, b, timeTableEntity, s0, s2, e, n), (rx.functions.b)new com.untis.mobile.services.timetable.placeholder.o(t, this, e));
                    final j2 a3 = j2.a;
                    // monitorexit(w)
                    return;
                }
                finally {}
            }
        }
        finally {}
    }
    // monitorexit(w)
    
    @e
    @Override
    public List<Period> D(@e final Set<Long> set) {
        k0.p(set, "ids");
        return this.l0().f(this.G, v.I5((Iterable<? extends Long>)set));
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object E(@e final EntityType entityType, final long n, final long n2, @e final List<? extends UMPeriod> list, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ List<UMPeriod> H;
            final /* synthetic */ p I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ List<UMPeriod> H = this.H;
                    final /* synthetic */ p I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$p)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    if (this.H.isEmpty()) {
                        return j2.a;
                    }
                    final UMPeriod umPeriod = this.H.get(0);
                    o = p.this.q0().c(this.I.p0());
                    final List<UMPeriod> h = this.H;
                    try {
                        ((f0)o).beginTransaction();
                        ((f0)o).G0(x.a.h(umPeriod, h), new q[0]);
                        ((f0)o).n();
                        final j2 a = j2.a;
                        kotlin.io.c.a((Closeable)o, null);
                        o = com.untis.mobile.utils.mapper.realmToModel.w.a;
                        final long id = umPeriod.id;
                        final UMPeriodText text = umPeriod.text;
                        k0.o(text, "umPeriod.text");
                        o = ((com.untis.mobile.utils.mapper.realmToModel.w)o).a(id, text);
                        p.this.n0().c(this.I.p0(), (PeriodInfo)o);
                        return a;
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            kotlin.io.c.a((Closeable)o, t);
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
    
    @Override
    public int F(@e final t t) {
        k0.p(t, "date");
        final Iterator<TimeGridUnit> iterator = this.n(t).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final int j0 = iterator.next().getEnd().j0(org.joda.time.g.P());
            if (j0 > n) {
                n = j0;
            }
        }
        if (n == 0) {
            return 1440;
        }
        return n;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object G(@e final String s, final long n, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            Object G;
            Object H;
            Object I;
            int J;
            final /* synthetic */ p K;
            final /* synthetic */ long L;
            final /* synthetic */ String M;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    Object G;
                    Object H;
                    Object I;
                    int J;
                    final /* synthetic */ p K = this.K;
                    final /* synthetic */ long L = this.L;
                    final /* synthetic */ String M = this.M;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$s)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int j = this.J;
                Iterator<Object> iterator;
                String m;
                p k;
                if (j != 0) {
                    if (j != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iterator = (Iterator<Object>)this.I;
                    final p p = (p)this.H;
                    m = (String)this.G;
                    c1.n(o);
                    k = p;
                }
                else {
                    c1.n(o);
                    final List<Period> v = this.K.v(this.L);
                    m = this.M;
                    k = this.K;
                    iterator = v.iterator();
                }
                while (iterator.hasNext()) {
                    final Period period = iterator.next();
                    period.setChannelId(m);
                    this.G = m;
                    this.H = k;
                    this.I = iterator;
                    this.J = 1;
                    if (k.q(period, this) == h) {
                        return h;
                    }
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
    public Object H(@e final PeriodInfo periodInfo, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            final /* synthetic */ PeriodInfo I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                    final /* synthetic */ PeriodInfo I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$g0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    p.this.u0().l(this.I);
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
    public Object I(@e final EntityType entityType, final long n, @e final kotlin.coroutines.d<? super TimeTableEntity> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super TimeTableEntity>, Object>(null) {
            int G;
            final /* synthetic */ EntityType H;
            final /* synthetic */ p I;
            final /* synthetic */ long J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super TimeTableEntity>, Object>(d) {
                    int G;
                    final /* synthetic */ EntityType H = this.H;
                    final /* synthetic */ p I = this.I;
                    final /* synthetic */ long J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super TimeTableEntity> d) {
                return ((p$h)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                if (!this.H.isTimetableEntity()) {
                    return new TimeTableEntity(null, 0L, false, 0, 0L, null, 63, null);
                }
                return p.this.t0().b(this.H, this.J);
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object J(@e final TimeTableEntity timeTableEntity, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            final /* synthetic */ TimeTableEntity I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                    final /* synthetic */ TimeTableEntity I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    p.this.t0().c(this.I.getEntityType(), this.I.getEntityId());
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
    
    @SuppressLint({ "UseSparseArrays" })
    @e
    @Override
    public Map<Long, List<UMPeriod>> a(@e final List<? extends UMPeriod> list) {
        k0.p(list, "periods");
        final HashMap<Long, ArrayList<UMPeriod>> hashMap = (HashMap<Long, ArrayList<UMPeriod>>)new HashMap<Long, List<UMPeriod>>();
        final HashMap<Object, ArrayList<UMPeriod>> hashMap2 = (HashMap<Object, ArrayList<UMPeriod>>)new HashMap<Long, ArrayList<UMPeriod>>();
        for (final UMPeriod e : list) {
            ArrayList<UMPeriod> list2;
            if ((list2 = hashMap2.get(e.lessonId)) == null) {
                list2 = new ArrayList<UMPeriod>();
                hashMap2.put(e.lessonId, list2);
            }
            list2.add(e);
        }
        final Set<Map.Entry<Long, ArrayList<UMPeriod>>> entrySet = hashMap2.entrySet();
        k0.o(entrySet, "groupedByLessonId.entries");
        final Iterator<Map.Entry<K, Object>> iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            final Object value = iterator2.next().getValue();
            k0.o(value, "entry.value");
            final ArrayList<Object> list3 = (ArrayList<Object>)value;
            v.p0(list3, com.untis.mobile.services.timetable.placeholder.m.G);
            ArrayList<UMPeriod> list4 = new ArrayList<UMPeriod>();
            final Iterator<UMPeriod> iterator3 = list3.iterator();
            UMPeriod e2 = null;
            UMPeriod umPeriod2 = null;
        Label_0196:
            while (true) {
                UMPeriod umPeriod = e2;
                umPeriod2 = e2;
                while (iterator3.hasNext()) {
                    e2 = iterator3.next();
                    if (umPeriod2 == null || umPeriod == null) {
                        list4.add(e2);
                        continue Label_0196;
                    }
                    if (this.w0(umPeriod, e2)) {
                        list4.add(e2);
                    }
                    else {
                        hashMap.put(umPeriod2.id, list4);
                        list4 = new ArrayList<UMPeriod>();
                        list4.add(e2);
                        umPeriod2 = e2;
                    }
                    umPeriod = e2;
                }
                break;
            }
            k0.m(umPeriod2);
            hashMap.put(umPeriod2.id, list4);
        }
        return (Map<Long, List<UMPeriod>>)hashMap;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(@e final List<Period> list, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            final /* synthetic */ List<Period> I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                    final /* synthetic */ List<Period> I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$j0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    p.this.u0().o(this.I);
                    p.this.l0().c(this.H.p0(), this.I);
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
    public Object c(@e final EntityType entityType, final long n, final boolean b, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>(b) {
            int G;
            final /* synthetic */ p H;
            final /* synthetic */ EntityType I;
            final /* synthetic */ long J;
            final /* synthetic */ boolean K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                    final /* synthetic */ EntityType I = this.I;
                    final /* synthetic */ long J = this.J;
                    final /* synthetic */ boolean K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$t)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1 && g != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    TimeTableEntity w;
                    if ((w = this.H.w(this.I, this.J)) == null) {
                        w = new TimeTableEntity(this.I, this.J, false, 0, 0L, null, 60, null);
                    }
                    final boolean k = this.K;
                    if (k) {
                        w.setFavorite(k);
                        final p h2 = this.H;
                        this.G = 1;
                        if (h2.j(w, this) == h) {
                            return h;
                        }
                    }
                    else {
                        final p h3 = this.H;
                        this.G = 2;
                        if (h3.J(w, this) == h) {
                            return h;
                        }
                    }
                }
                return j2.a;
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @Override
    public int d(@e final TimeTableEntity timeTableEntity) {
        k0.p(timeTableEntity, "timeTableEntity");
        final List<TimeTableModel> e = this.u0().e(timeTableEntity.getEntityType(), timeTableEntity.getEntityId());
        final ArrayList list = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)e, 10));
        final Iterator<Object> iterator = e.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getPeriods());
        }
        final List<Object> c0 = v.c0((Iterable<? extends Iterable<?>>)list);
        final ArrayList list2 = new ArrayList<Number>(v.Y((Iterable<?>)c0, 10));
        final Iterator<PeriodModel> iterator2 = c0.iterator();
        while (iterator2.hasNext()) {
            list2.add(Integer.valueOf(iterator2.next().getEndMinute()));
        }
        final Iterator<Number> iterator3 = list2.iterator();
        int n = 0;
        while (iterator3.hasNext()) {
            final int intValue = iterator3.next().intValue();
            if (intValue > n) {
                n = intValue;
            }
        }
        if (n == 0) {
            return 1440;
        }
        return n;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object e(@e final TimeTableModel timeTableModel, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            final /* synthetic */ TimeTableModel I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                    final /* synthetic */ TimeTableModel I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$r)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    p.this.u0().h(this.I);
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
    
    @Override
    public int f(@e final t t) {
        k0.p(t, "date");
        final Iterator<TimeGridUnit> iterator = this.n(t).iterator();
        int n = 1440;
        while (iterator.hasNext()) {
            final int j0 = iterator.next().getStart().j0(org.joda.time.g.P());
            if (j0 < n) {
                n = j0;
            }
        }
        if (n == 1440) {
            return 0;
        }
        return n;
    }
    
    @Override
    public boolean g(@e final t t) {
        k0.p(t, "date");
        final Schoolyear m = this.k0().M(t);
        boolean b = true;
        if (m == null) {
            return true;
        }
        final TimeGrid b2 = this.k0().b(m);
        if (b2 == null) {
            return true;
        }
        while (true) {
            for (final TimeGridDay next : b2.getDays()) {
                if (next.getWeekDay().getDateTimeConstant() == t.p2()) {
                    final Object o = next;
                    if (o == null) {
                        b = false;
                    }
                    return b;
                }
            }
            final Object o = null;
            continue;
        }
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((org.koin.core.c)this);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public TimeTableModel h(@e final TimeTableEntity timeTableEntity, @e final t t) {
        k0.p(timeTableEntity, "timeTableEntity");
        k0.p(t, "date");
        return this.u0().d(timeTableEntity.getEntityType(), timeTableEntity.getEntityId(), t);
    }
    
    @Override
    public boolean i(@e final EntityType entityType, final long n) {
        k0.p(entityType, "entityType");
        final TimeTableEntity e = this.t0().e(entityType, n);
        boolean b = false;
        if (e != null) {
            if (e.getFavorite()) {
                b = true;
            }
        }
        return b;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object j(@e final TimeTableEntity timeTableEntity, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            final /* synthetic */ TimeTableEntity I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                    final /* synthetic */ TimeTableEntity I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$q)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    p.this.t0().f(this.I);
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
    public Object k(@e final Period period, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            final /* synthetic */ Period I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                    final /* synthetic */ Period I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$i)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    p.this.l0().e(this.H.p0(), v.k(kotlin.coroutines.jvm.internal.b.g(this.I.getId())));
                    p.this.f0().d(this.H.p0(), this.I.getId());
                    p.this.j0().d(this.H.p0(), this.I.getId());
                    p.this.n0().d(this.H.p0(), this.I.getId());
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
    public Period l(final long n) {
        return this.l0().a(this.G, n);
    }
    
    @Override
    public void m(@e final com.untis.mobile.ui.activities.timetable.a o) {
        k0.p(o, "onTimeTableModelListener");
        synchronized (this.W) {
            this.W.remove(o);
        }
    }
    
    @e
    @Override
    public List<TimeGridUnit> n(@e final t key) {
        k0.p(key, "date");
        ArrayList<TimeGridUnit> value;
        if ((value = this.V.get(key)) == null) {
            value = new ArrayList<TimeGridUnit>();
            final TimeGrid y = this.k0().y(key);
            if (y != null) {
                final List<TimeGridDay> days = y.getDays();
                if (days != null) {
                    final Iterator<Object> iterator = days.iterator();
                    while (iterator.hasNext()) {
                        for (final TimeGridUnit e : iterator.next().getUnits()) {
                            if (!this.y0(value, e)) {
                                value.add(e);
                            }
                        }
                    }
                }
            }
            this.V.put(key, value);
        }
        return value;
    }
    
    @Override
    public int o(@e final TimeTableEntity timeTableEntity) {
        k0.p(timeTableEntity, "timeTableEntity");
        final List<TimeTableModel> e = this.u0().e(timeTableEntity.getEntityType(), timeTableEntity.getEntityId());
        final ArrayList list = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)e, 10));
        final Iterator<Object> iterator = e.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getPeriods());
        }
        final List<Object> c0 = v.c0((Iterable<? extends Iterable<?>>)list);
        final ArrayList list2 = new ArrayList<Integer>(v.Y((Iterable<?>)c0, 10));
        final Iterator<PeriodModel> iterator2 = c0.iterator();
        while (iterator2.hasNext()) {
            list2.add(Integer.valueOf(iterator2.next().getStartMinute()));
        }
        final Iterator<Number> iterator3 = list2.iterator();
        int n = 1440;
        while (true) {
            final boolean hasNext = iterator3.hasNext();
            final boolean b = false;
            if (!hasNext) {
                break;
            }
            final int intValue = iterator3.next().intValue();
            int n2 = b ? 1 : 0;
            if (301 <= intValue) {
                n2 = (b ? 1 : 0);
                if (intValue <= n - 1) {
                    n2 = 1;
                }
            }
            if (n2 == 0) {
                continue;
            }
            n = intValue;
        }
        if (n == 1440) {
            return 0;
        }
        return n;
    }
    
    @Override
    public void p() {
        synchronized (this.W) {
            this.W.clear();
            final j2 a = j2.a;
        }
    }
    
    @e
    public final String p0() {
        return this.G;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object q(@e final Period period, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            final /* synthetic */ Period I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                    final /* synthetic */ Period I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$o)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    p.this.l0().c(this.H.p0(), v.k(this.I));
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
    public Object r(@e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$m)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final com.untis.mobile.services.masterdata.a q = p.this.k0();
                    this.G = 1;
                    if (q.L(this) == h) {
                        return h;
                    }
                }
                p.this.u0().g();
                p.this.u0().f();
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
    public Object s(@e final List<Long> list, @e final kotlin.coroutines.d<? super j2> d) {
        Iterator<Number> iterator = list.iterator();
        while (iterator.hasNext()) {
            final long longValue = iterator.next().longValue();
            final Period l = this.l(longValue);
            if (l == null) {
                return j2.a;
            }
            final Profile z0 = this.z0();
            Iterable<HomeWork> b0 = null;
            if (z0 != null) {
                final com.untis.mobile.services.classbook.a classBookService = z0.getClassBookService();
                if (classBookService != null) {
                    b0 = classBookService.b0(longValue);
                }
            }
            Object e = b0;
            if (b0 == null) {
                e = v.E();
            }
            final PeriodInfo a = this.n0().a(this.p0(), longValue);
            final List<TimeTableModel> c = this.u0().c();
            final ArrayList<TimeTableModel> list2 = new ArrayList<TimeTableModel>();
            for (final TimeTableModel next : c) {
                final List<PeriodModel> periods = next.getPeriods();
                boolean b2 = false;
                Label_0249: {
                    if (!(periods instanceof Collection) || !periods.isEmpty()) {
                        final Iterator<Object> iterator3 = periods.iterator();
                        while (iterator3.hasNext()) {
                            if (kotlin.coroutines.jvm.internal.b.a(iterator3.next().getId() == longValue)) {
                                b2 = true;
                                break Label_0249;
                            }
                        }
                    }
                    b2 = false;
                }
                if (kotlin.coroutines.jvm.internal.b.a(b2)) {
                    list2.add(next);
                }
            }
            final Iterator<Object> iterator4 = list2.iterator();
            final Iterator<Number> iterator5 = iterator;
        Label_0282:
            while (true) {
                iterator = iterator5;
                if (iterator4.hasNext()) {
                    final TimeTableModel timeTableModel = iterator4.next();
                    final Iterator<PeriodModel> iterator6 = timeTableModel.getPeriods().iterator();
                    int n = 0;
                    while (true) {
                        while (iterator6.hasNext()) {
                            if (kotlin.coroutines.jvm.internal.b.a(iterator6.next().getId() == longValue)) {
                                final t h1 = l.getEnd().h1();
                                final PeriodModel periodModel = timeTableModel.getPeriods().get(n);
                                final PeriodElement subject = l.getSubject();
                                long longValue2 = 0L;
                                if (subject != null) {
                                    final Long g = kotlin.coroutines.jvm.internal.b.g(subject.getCurrentId());
                                    if (g != null) {
                                        longValue2 = g;
                                    }
                                }
                                final List<PeriodElementModel> m0 = this.m0(l);
                                final ArrayList<HomeWork> list3 = new ArrayList<HomeWork>();
                                for (final HomeWork next2 : e) {
                                    final HomeWork homeWork = next2;
                                    if (kotlin.coroutines.jvm.internal.b.a(!homeWork.getLocal() && ((org.joda.time.base.e)homeWork.getEnd().h1()).p((n0)h1))) {
                                        list3.add(next2);
                                    }
                                }
                                final ArrayList list4 = new ArrayList<String>(v.Y((Iterable<?>)list3, 10));
                                final Iterator<Object> iterator8 = list3.iterator();
                                while (iterator8.hasNext()) {
                                    list4.add(this.C0(iterator8.next()));
                                }
                                final ArrayList<HomeWork> list5 = new ArrayList<HomeWork>();
                                for (final HomeWork next3 : e) {
                                    final HomeWork homeWork2 = next3;
                                    if (kotlin.coroutines.jvm.internal.b.a(homeWork2.getLocal() && ((org.joda.time.base.e)homeWork2.getEnd().h1()).p((n0)h1))) {
                                        list5.add(next3);
                                    }
                                }
                                final ArrayList list6 = new ArrayList<String>(v.Y((Iterable<?>)list5, 10));
                                final Iterator<Object> iterator10 = list5.iterator();
                                while (iterator10.hasNext()) {
                                    list6.add(this.C0(iterator10.next()));
                                }
                                String info = null;
                                Label_0796: {
                                    if (a != null) {
                                        info = a.getInfo();
                                        if (info != null) {
                                            break Label_0796;
                                        }
                                    }
                                    info = "";
                                }
                                String local = null;
                                Label_0824: {
                                    if (a != null) {
                                        local = a.getLocal();
                                        if (local != null) {
                                            break Label_0824;
                                        }
                                    }
                                    local = "";
                                }
                                String substitution = null;
                                Label_0852: {
                                    if (a != null) {
                                        substitution = a.getSubstitution();
                                        if (substitution != null) {
                                            break Label_0852;
                                        }
                                    }
                                    substitution = "";
                                }
                                String lesson = null;
                                Label_0880: {
                                    if (a != null) {
                                        lesson = a.getLesson();
                                        if (lesson != null) {
                                            break Label_0880;
                                        }
                                    }
                                    lesson = "";
                                }
                                final PeriodModel copy$default = PeriodModel.copy$default(periodModel, 0L, 0L, null, longValue2, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, m0, list4, list6, info, local, substitution, lesson, false, false, false, false, false, 0.0f, 0.0f, l.isOnlinePeriod(), 532709367, null);
                                final List<Object> l2 = v.L5((Collection<?>)timeTableModel.getPeriods());
                                l2.remove(n);
                                l2.add(copy$default);
                                timeTableModel.setPeriods((List<PeriodModel>)v.I5((Iterable<?>)v.N5((Iterable<?>)l2)));
                                this.u0().h(timeTableModel);
                                continue Label_0282;
                            }
                            ++n;
                        }
                        n = -1;
                        continue;
                    }
                }
                break;
            }
        }
        return j2.a;
    }
    
    @e
    @Override
    public List<TimeTableEntity> t() {
        return this.t0().d();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object u(@e final CustomEntityColor customEntityColor, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            final /* synthetic */ CustomEntityColor I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                    final /* synthetic */ CustomEntityColor I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$i0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    p.this.u0().m(this.I);
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
    public List<Period> v(final long n) {
        final List<Period> b = this.l0().b(this.G, n);
        final ArrayList<Period> list = new ArrayList<Period>();
        for (final Period next : b) {
            if (next.getLessonId() == n) {
                list.add(next);
            }
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public TimeTableEntity w(@e final EntityType entityType, final long n) {
        k0.p(entityType, "entityType");
        return this.t0().e(entityType, n);
    }
    
    @e
    @Override
    public List<r> x(@e TimeTableEntity c) {
        k0.p(c, "timeTableEntity");
        final t b = com.untis.mobile.utils.time.a.b();
        c = (TimeTableEntity)this.q0().c(this.G);
        try {
            final s0<com.untis.mobile.persistence.realm.period.c> b2 = ((f0)c).f3(com.untis.mobile.persistence.realm.period.c.class).D("breakSuperVision", Boolean.TRUE).b0();
            k0.o(b2, "realm.where(RealmPeriod::class.java).equalTo(\"breakSuperVision\", true)\n                    .findAll()");
            final ArrayList list = new ArrayList<r>(v.Y((Iterable<?>)b2, 10));
            for (final com.untis.mobile.persistence.realm.period.c c2 : b2) {
                list.add(new r((l0)new org.joda.time.c(c2.E8()).w1(b), (l0)new org.joda.time.c(c2.w8()).w1(b)));
            }
            final HashSet<Object> g5 = v.G5((Iterable<?>)list);
            final ArrayList<r> list2 = new ArrayList<r>();
            for (final r next : g5) {
                if (((org.joda.time.base.d)next).H().y() < 20L) {
                    list2.add(next);
                }
            }
            kotlin.io.c.a((Closeable)c, null);
            return list2;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a((Closeable)c, t);
            }
        }
    }
    
    @e
    @Override
    public List<Period> y(@e final TimeTableEntity timeTableEntity) {
        k0.p(timeTableEntity, "timeTableEntity");
        final List<TimeTableModel> e = this.u0().e(timeTableEntity.getEntityType(), timeTableEntity.getEntityId());
        final ArrayList list = new ArrayList<ArrayList<Long>>(v.Y((Iterable<?>)e, 10));
        final Iterator<Object> iterator = e.iterator();
        while (iterator.hasNext()) {
            final List<PeriodModel> periodsWithOutCancelled = iterator.next().getPeriodsWithOutCancelled();
            final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)periodsWithOutCancelled, 10));
            final Iterator<Object> iterator2 = periodsWithOutCancelled.iterator();
            while (iterator2.hasNext()) {
                list2.add(Long.valueOf(iterator2.next().getId()));
            }
            list.add((ArrayList<Long>)list2);
        }
        return this.l0().f(this.G, (List<Long>)v.I5((Iterable<?>)v.N5((Iterable<?>)v.c0((Iterable<? extends Iterable<?>>)list))));
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object z(@e final HomeWork homeWork, final boolean b, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ p H;
            final /* synthetic */ HomeWork I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ p H = this.H;
                    final /* synthetic */ HomeWork I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((p$h0)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    com.untis.mobile.services.masterdata.cache.t.n(p.this.u0(), this.I, false, 2, null);
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
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "com/untis/mobile/services/timetable/placeholder/p$a", "", "", "profileId", "Lcom/untis/mobile/services/timetable/placeholder/k;", "a", "", "cache", "Ljava/util/Map;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final k a(@e final String s) {
            k0.p(s, "profileId");
            k k;
            if ((k = p.N().get(s)) == null) {
                k = new p(s, null);
                p.N().put(s, k);
            }
            return k;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0015" }, d2 = { "com/untis/mobile/services/timetable/placeholder/p$b", "", "other", "", "equals", "", "hashCode", "", "c", "J", "originalId", "Lcom/untis/mobile/api/enumeration/ElementType;", "a", "Lcom/untis/mobile/api/enumeration/ElementType;", "elementType", "b", "currentId", "Lcom/untis/mobile/api/common/timetable/UMPeriodElement;", "element", "<init>", "(Lcom/untis/mobile/api/common/timetable/UMPeriodElement;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class b
    {
        @org.jetbrains.annotations.f
        private final ElementType a;
        private final long b;
        private final long c;
        
        public b(@e final UMPeriodElement umPeriodElement) {
            k0.p(umPeriodElement, "element");
            this.a = umPeriodElement.type;
            this.b = umPeriodElement.id;
            this.c = umPeriodElement.orgId;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object obj) {
            if (this == obj) {
                return true;
            }
            Object class1;
            if (obj == null) {
                class1 = null;
            }
            else {
                class1 = obj.getClass();
            }
            if (!k0.g(b.class, class1)) {
                return false;
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.services.timetable.placeholder.UmTimeTableService.ElementWithHashCode");
            final b b = (b)obj;
            return this.a == b.a && this.b == b.b && this.c == b.c;
        }
        
        @Override
        public int hashCode() {
            final ElementType a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return (hashCode * 31 + a4.a.a(this.b)) * 31 + a4.a.a(this.c);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0015\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0014¨\u0006\u0018" }, d2 = { "com/untis/mobile/services/timetable/placeholder/p$c", "", "other", "", "equals", "", "hashCode", "Lorg/joda/time/t;", "c", "Lorg/joda/time/t;", "()Lorg/joda/time/t;", "monday", "", "b", "J", "a", "()J", "entityId", "Lcom/untis/mobile/persistence/models/EntityType;", "Lcom/untis/mobile/persistence/models/EntityType;", "()Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "<init>", "(Lcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/t;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class c
    {
        @e
        private final EntityType a;
        private final long b;
        @e
        private final t c;
        
        public c(@e final EntityType a, final long b, @e final t c) {
            k0.p(a, "entityType");
            k0.p(c, "monday");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public final long a() {
            return this.b;
        }
        
        @e
        public final EntityType b() {
            return this.a;
        }
        
        @e
        public final t c() {
            return this.c;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object obj) {
            if (this == obj) {
                return true;
            }
            Object class1;
            if (obj == null) {
                class1 = null;
            }
            else {
                class1 = obj.getClass();
            }
            if (!k0.g(c.class, class1)) {
                return false;
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.services.timetable.placeholder.UmTimeTableService.TimeTableEntityWeek");
            final c c = (c)obj;
            return this.a == c.a && this.b == c.b && k0.g(this.c, c.c);
        }
        
        @Override
        public int hashCode() {
            return (this.a.hashCode() * 31 + a4.a.a(this.b)) * 31 + this.c.hashCode();
        }
    }
}
