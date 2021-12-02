// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.model;

import a4.a;
import java.util.ArrayList;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodStudentGroup;
import android.os.Parcelable$Creator;
import com.untis.mobile.utils.extension.j;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodVideoCall;
import com.untis.mobile.utils.jsonadapter.g;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodType;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodTeacher;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodSubject;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodSubType;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodStudent;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodStatus;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodRoom;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodResource;
import com.untis.mobile.utils.jsonadapter.b;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodPermission;
import com.untis.mobile.calendar.persistence.model.common.CalendarOriginalPeriod;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodAttachment;
import com.untis.mobile.calendar.persistence.model.common.CalendarMessengerChannel;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodLesson;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodKlasse;
import androidx.room.l1;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodExam;
import com.untis.mobile.utils.jsonadapter.h;
import org.joda.time.c;
import com.untis.mobile.utils.jsonadapter.i;
import com.google.gson.annotations.JsonAdapter;
import com.untis.mobile.calendar.persistence.model.common.CalendarBooking;
import java.util.List;
import org.jetbrains.annotations.f;
import androidx.room.i0;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import androidx.room.s0;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\br\b\u0087\b\u0018\u0000 \u00d6\u00012\u00020\u0001:\u0002\u00d6\u0001B\u00e1\u0002\u0012\u0006\u0010@\u001a\u00020\t\u0012\b\u0010A\u001a\u0004\u0018\u00010\t\u0012\b\u0010B\u001a\u0004\u0018\u00010\r\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010D\u001a\u00020\u0011\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010I\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010J\u001a\u0004\u0018\u00010\u001d\u0012\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\b\u0010L\u001a\u0004\u0018\u00010\u001d\u0012\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\b\u0010N\u001a\u0004\u0018\u00010#\u0012\f\u0010O\u001a\b\u0012\u0004\u0012\u00020%0\u0015\u0012\f\u0010P\u001a\b\u0012\u0004\u0012\u00020'0\u0015\u0012\u0006\u0010Q\u001a\u00020\u0011\u0012\u0006\u0010R\u001a\u00020*\u0012\f\u0010S\u001a\b\u0012\u0004\u0012\u00020,0\u0015\u0012\b\u0010T\u001a\u0004\u0018\u00010.\u0012\b\u0010U\u001a\u0004\u0018\u000100\u0012\b\u0010V\u001a\u0004\u0018\u00010\u001d\u0012\f\u0010W\u001a\b\u0012\u0004\u0012\u0002030\u0015\u0012\b\u0010X\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0015\u0012\u0006\u0010Z\u001a\u000207\u0012\f\u0010[\u001a\b\u0012\u0004\u0012\u0002090\u0015\u0012\u000e\u0010\\\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u0015\u0012\b\u0010]\u001a\u0004\u0018\u00010=\u0012\b\u0010^\u001a\u0004\u0018\u00010\u001d¢\u0006\u0006\b\u00d3\u0001\u0010\u00d4\u0001B\u0013\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0006\b\u00d3\u0001\u0010\u00d5\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0015H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0015H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010#H\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0015H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0015H\u00c6\u0003J\t\u0010)\u001a\u00020\u0011H\u00c6\u0003J\t\u0010+\u001a\u00020*H\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0015H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010.H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u000100H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0015H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0015H\u00c6\u0003J\t\u00108\u001a\u000207H\u00c6\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0015H\u00c6\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010=H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J¦\u0003\u0010_\u001a\u00020\u00002\b\b\u0002\u0010@\u001a\u00020\t2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010D\u001a\u00020\u00112\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\n\b\u0002\u0010N\u001a\u0004\u0018\u00010#2\u000e\b\u0002\u0010O\u001a\b\u0012\u0004\u0012\u00020%0\u00152\u000e\b\u0002\u0010P\u001a\b\u0012\u0004\u0012\u00020'0\u00152\b\b\u0002\u0010Q\u001a\u00020\u00112\b\b\u0002\u0010R\u001a\u00020*2\u000e\b\u0002\u0010S\u001a\b\u0012\u0004\u0012\u00020,0\u00152\n\b\u0002\u0010T\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010U\u001a\u0004\u0018\u0001002\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010W\u001a\b\u0012\u0004\u0012\u0002030\u00152\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00152\b\b\u0002\u0010Z\u001a\u0002072\u000e\b\u0002\u0010[\u001a\b\u0012\u0004\u0012\u0002090\u00152\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u00152\n\b\u0002\u0010]\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u001dH\u00c6\u0001¢\u0006\u0004\b_\u0010`J\t\u0010a\u001a\u00020\u001dH\u00d6\u0001J\t\u0010b\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010f\u001a\u00020e2\b\u0010d\u001a\u0004\u0018\u00010cH\u00d6\u0003R*\u0010\\\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR(\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010g\u001a\u0004\bl\u0010i\"\u0004\bm\u0010kR$\u0010H\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR*\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010g\u001a\u0004\bs\u0010i\"\u0004\bt\u0010kR$\u0010G\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010n\u001a\u0004\bu\u0010p\"\u0004\bv\u0010rR(\u0010P\u001a\b\u0012\u0004\u0012\u00020'0\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010g\u001a\u0004\bw\u0010i\"\u0004\bx\u0010kR\"\u0010D\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R'\u0010L\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0004\bL\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010C\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bC\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010\u0010\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010O\u001a\b\u0012\u0004\u0012\u00020%0\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bO\u0010g\u001a\u0005\b\u0087\u0001\u0010i\"\u0005\b\u0088\u0001\u0010kR)\u0010N\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bN\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010W\u001a\b\u0012\u0004\u0012\u0002030\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bW\u0010g\u001a\u0005\b\u008e\u0001\u0010i\"\u0005\b\u008f\u0001\u0010kR(\u0010X\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0004\bX\u0010~\u001a\u0006\b\u0090\u0001\u0010\u0080\u0001\"\u0006\b\u0091\u0001\u0010\u0082\u0001R*\u0010[\u001a\b\u0012\u0004\u0012\u0002090\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b[\u0010g\u001a\u0005\b\u0092\u0001\u0010i\"\u0005\b\u0093\u0001\u0010kR)\u0010I\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bI\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R(\u0010A\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bA\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010\f\"\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010R\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bR\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R'\u0010Z\u001a\u0002078\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bZ\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R*\u0010S\u001a\b\u0012\u0004\u0012\u00020,0\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bS\u0010g\u001a\u0005\b§\u0001\u0010i\"\u0005\b¨\u0001\u0010kR*\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bM\u0010g\u001a\u0005\b©\u0001\u0010i\"\u0005\bª\u0001\u0010kR)\u0010B\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bB\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R*\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bF\u0010g\u001a\u0005\b°\u0001\u0010i\"\u0005\b±\u0001\u0010kR)\u0010U\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bU\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R'\u0010@\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b@\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R(\u0010J\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0004\bJ\u0010~\u001a\u0006\b¼\u0001\u0010\u0080\u0001\"\u0006\b½\u0001\u0010\u0082\u0001R)\u0010]\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\b]\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010\u00c0\u0001\"\u0006\b\u00c1\u0001\u0010\u00c2\u0001R(\u0010V\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0004\bV\u0010~\u001a\u0006\b\u00c3\u0001\u0010\u0080\u0001\"\u0006\b\u00c4\u0001\u0010\u0082\u0001R)\u0010T\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bT\u0010\u00c5\u0001\u001a\u0006\b\u00c6\u0001\u0010\u00c7\u0001\"\u0006\b\u00c8\u0001\u0010\u00c9\u0001R$\u0010Q\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bQ\u0010y\u001a\u0005\b\u00ca\u0001\u0010{\"\u0005\b\u00cb\u0001\u0010}R(\u0010^\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0004\b^\u0010~\u001a\u0006\b\u00cc\u0001\u0010\u0080\u0001\"\u0006\b\u00cd\u0001\u0010\u0082\u0001R)\u0010E\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0005\bE\u0010\u00ce\u0001\u001a\u0006\b\u00cf\u0001\u0010\u00d0\u0001\"\u0006\b\u00d1\u0001\u0010\u00d2\u0001¨\u0006\u00d7\u0001" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "component1", "component2", "()Ljava/lang/Long;", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarBooking;", "component3", "component4", "()Ljava/lang/Integer;", "Lorg/joda/time/c;", "component5", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "component6", "", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodKlasse;", "component7", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;", "component8", "component9", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarMessengerChannel;", "component10", "", "component11", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodAttachment;", "component12", "component13", "component14", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod;", "component15", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodResource;", "component16", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "component17", "component18", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus;", "component19", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodStudent;", "component20", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodSubType;", "component21", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodSubject;", "component22", "component23", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodTeacher;", "component24", "component25", "component26", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodType;", "component27", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodPermission;", "component28", "Lcom/untis/mobile/calendar/persistence/model/CalendarBlockPeriod;", "component29", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;", "component30", "component31", "id", "absenceReasonId", "booking", "color", "end", "exam", "klassen", "lesson", "mainStudentGroup", "messengerChannel", "notesAll", "notesAllFiles", "notesStaff", "notesStaffFiles", "originalCalendarPeriod", "resources", "rooms", "start", "status", "students", "subType", "subject", "substitutionText", "teachers", "teachingContent", "teachingContentFiles", "type", "permissions", "blockPeriods", "videoCall", "lessonInfo", "copy", "(JLjava/lang/Long;Lcom/untis/mobile/calendar/persistence/model/common/CalendarBooking;Ljava/lang/Integer;Lorg/joda/time/c;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;Ljava/util/List;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;Lcom/untis/mobile/calendar/persistence/model/common/CalendarMessengerChannel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod;Ljava/util/List;Ljava/util/List;Lorg/joda/time/c;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus;Ljava/util/List;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodSubType;Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodSubject;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodType;Ljava/util/List;Ljava/util/List;Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;Ljava/lang/String;)Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "toString", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "getBlockPeriods", "()Ljava/util/List;", "setBlockPeriods", "(Ljava/util/List;)V", "getNotesAllFiles", "setNotesAllFiles", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;", "getMainStudentGroup", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;", "setMainStudentGroup", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;)V", "getTeachingContentFiles", "setTeachingContentFiles", "getLesson", "setLesson", "getRooms", "setRooms", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "Ljava/lang/String;", "getNotesStaff", "()Ljava/lang/String;", "setNotesStaff", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getColor", "setColor", "(Ljava/lang/Integer;)V", "getResources", "setResources", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod;", "getOriginalCalendarPeriod", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod;", "setOriginalCalendarPeriod", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod;)V", "getTeachers", "setTeachers", "getTeachingContent", "setTeachingContent", "getPermissions", "setPermissions", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarMessengerChannel;", "getMessengerChannel", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarMessengerChannel;", "setMessengerChannel", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarMessengerChannel;)V", "Ljava/lang/Long;", "getAbsenceReasonId", "setAbsenceReasonId", "(Ljava/lang/Long;)V", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus;", "getStatus", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus;", "setStatus", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus;)V", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodType;", "getType", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodType;", "setType", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodType;)V", "getStudents", "setStudents", "getNotesStaffFiles", "setNotesStaffFiles", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarBooking;", "getBooking", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarBooking;", "setBooking", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarBooking;)V", "getKlassen", "setKlassen", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodSubject;", "getSubject", "()Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodSubject;", "setSubject", "(Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodSubject;)V", "J", "getId", "()J", "setId", "(J)V", "getNotesAll", "setNotesAll", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;", "getVideoCall", "()Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;", "setVideoCall", "(Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;)V", "getSubstitutionText", "setSubstitutionText", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodSubType;", "getSubType", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodSubType;", "setSubType", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodSubType;)V", "getStart", "setStart", "getLessonInfo", "setLessonInfo", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "getExam", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "setExam", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;)V", "<init>", "(JLjava/lang/Long;Lcom/untis/mobile/calendar/persistence/model/common/CalendarBooking;Ljava/lang/Integer;Lorg/joda/time/c;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;Ljava/util/List;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;Lcom/untis/mobile/calendar/persistence/model/common/CalendarMessengerChannel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod;Ljava/util/List;Ljava/util/List;Lorg/joda/time/c;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus;Ljava/util/List;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodSubType;Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodSubject;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodType;Ljava/util/List;Ljava/util/List;Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@s0(tableName = "calendar_period")
public final class CalendarPeriod implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @SerializedName("absenceReasonId")
    @i0(name = "absence_reason_id")
    @f
    private Long absenceReasonId;
    @SerializedName("singleEntries")
    @i0(name = "block_periods")
    @f
    private List<CalendarBlockPeriod> blockPeriods;
    @SerializedName("booking")
    @i0(name = "booking")
    @f
    private CalendarBooking booking;
    @JsonAdapter(i.class)
    @SerializedName("color")
    @i0(name = "color")
    @f
    private Integer color;
    @JsonAdapter(h.class)
    @SerializedName("endDateTime")
    @i0(name = "end")
    @e
    private c end;
    @SerializedName("exam")
    @i0(name = "exam")
    @f
    private CalendarPeriodExam exam;
    @SerializedName("id")
    @i0(name = "period_id")
    @l1(autoGenerate = false)
    private long id;
    @SerializedName("klasses")
    @i0(name = "klassen")
    @e
    private List<CalendarPeriodKlasse> klassen;
    @SerializedName("lesson")
    @i0(name = "lesson")
    @f
    private CalendarPeriodLesson lesson;
    @SerializedName("lessonInfo")
    @i0(name = "lesson_info")
    @f
    private String lessonInfo;
    @SerializedName("mainStudentGroup")
    @i0(name = "student_group")
    @f
    private CalendarPeriodLesson mainStudentGroup;
    @SerializedName("messengerChannel")
    @i0(name = "messenger_channel")
    @f
    private CalendarMessengerChannel messengerChannel;
    @SerializedName("notesAll")
    @i0(name = "notes_all")
    @f
    private String notesAll;
    @SerializedName("notesAllFiles")
    @i0(name = "notes_all_files")
    @e
    private List<CalendarPeriodAttachment> notesAllFiles;
    @SerializedName("notesStaff")
    @i0(name = "notes_staff")
    @f
    private String notesStaff;
    @SerializedName("notesStaffFiles")
    @i0(name = "notes_staff_files")
    @e
    private List<CalendarPeriodAttachment> notesStaffFiles;
    @SerializedName("originalCalendarEntry")
    @i0(name = "original_period")
    @f
    private CalendarOriginalPeriod originalCalendarPeriod;
    @JsonAdapter(b.class)
    @SerializedName("permissions")
    @i0(name = "permissions")
    @e
    private List<? extends CalendarPeriodPermission> permissions;
    @SerializedName("resources")
    @i0(name = "resources")
    @e
    private List<CalendarPeriodResource> resources;
    @SerializedName("rooms")
    @i0(name = "rooms")
    @e
    private List<CalendarPeriodRoom> rooms;
    @JsonAdapter(h.class)
    @SerializedName("startDateTime")
    @i0(name = "start")
    @e
    private c start;
    @JsonAdapter(com.untis.mobile.utils.jsonadapter.e.class)
    @SerializedName("status")
    @i0(name = "status")
    @e
    private CalendarPeriodStatus status;
    @SerializedName("students")
    @i0(name = "students")
    @e
    private List<CalendarPeriodStudent> students;
    @SerializedName("subType")
    @i0(name = "type_sub")
    @f
    private CalendarPeriodSubType subType;
    @SerializedName("subject")
    @i0(name = "subject")
    @f
    private CalendarPeriodSubject subject;
    @SerializedName("substText")
    @i0(name = "substitution_text")
    @f
    private String substitutionText;
    @SerializedName("teachers")
    @i0(name = "teachers")
    @e
    private List<CalendarPeriodTeacher> teachers;
    @SerializedName("teachingContent")
    @i0(name = "teaching_content")
    @f
    private String teachingContent;
    @SerializedName("teachingContentFiles")
    @i0(name = "teaching_content_files")
    @f
    private List<CalendarPeriodAttachment> teachingContentFiles;
    @JsonAdapter(g.class)
    @SerializedName("type")
    @i0(name = "type")
    @e
    private CalendarPeriodType type;
    @SerializedName("videoCall")
    @i0(name = "video_call")
    @f
    private CalendarPeriodVideoCall videoCall;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public CalendarPeriod(final long id, @f final Long absenceReasonId, @f final CalendarBooking booking, @f final Integer color, @e final c end, @f final CalendarPeriodExam exam, @e final List<CalendarPeriodKlasse> klassen, @f final CalendarPeriodLesson lesson, @f final CalendarPeriodLesson mainStudentGroup, @f final CalendarMessengerChannel messengerChannel, @f final String notesAll, @e final List<CalendarPeriodAttachment> notesAllFiles, @f final String notesStaff, @e final List<CalendarPeriodAttachment> notesStaffFiles, @f final CalendarOriginalPeriod originalCalendarPeriod, @e final List<CalendarPeriodResource> resources, @e final List<CalendarPeriodRoom> rooms, @e final c start, @e final CalendarPeriodStatus status, @e final List<CalendarPeriodStudent> students, @f final CalendarPeriodSubType subType, @f final CalendarPeriodSubject subject, @f final String substitutionText, @e final List<CalendarPeriodTeacher> teachers, @f final String teachingContent, @f final List<CalendarPeriodAttachment> teachingContentFiles, @e final CalendarPeriodType type, @e final List<? extends CalendarPeriodPermission> permissions, @f final List<CalendarBlockPeriod> blockPeriods, @f final CalendarPeriodVideoCall videoCall, @f final String lessonInfo) {
        k0.p(end, "end");
        k0.p(klassen, "klassen");
        k0.p(notesAllFiles, "notesAllFiles");
        k0.p(notesStaffFiles, "notesStaffFiles");
        k0.p(resources, "resources");
        k0.p(rooms, "rooms");
        k0.p(start, "start");
        k0.p(status, "status");
        k0.p(students, "students");
        k0.p(teachers, "teachers");
        k0.p(type, "type");
        k0.p(permissions, "permissions");
        this.id = id;
        this.absenceReasonId = absenceReasonId;
        this.booking = booking;
        this.color = color;
        this.end = end;
        this.exam = exam;
        this.klassen = klassen;
        this.lesson = lesson;
        this.mainStudentGroup = mainStudentGroup;
        this.messengerChannel = messengerChannel;
        this.notesAll = notesAll;
        this.notesAllFiles = notesAllFiles;
        this.notesStaff = notesStaff;
        this.notesStaffFiles = notesStaffFiles;
        this.originalCalendarPeriod = originalCalendarPeriod;
        this.resources = resources;
        this.rooms = rooms;
        this.start = start;
        this.status = status;
        this.students = students;
        this.subType = subType;
        this.subject = subject;
        this.substitutionText = substitutionText;
        this.teachers = teachers;
        this.teachingContent = teachingContent;
        this.teachingContentFiles = teachingContentFiles;
        this.type = type;
        this.permissions = permissions;
        this.blockPeriods = blockPeriods;
        this.videoCall = videoCall;
        this.lessonInfo = lessonInfo;
    }
    
    public CalendarPeriod(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final Object value = parcel.readValue(Long.TYPE.getClassLoader());
        Long n;
        if (value instanceof Long) {
            n = (Long)value;
        }
        else {
            n = null;
        }
        final Object value2 = parcel.readValue(Integer.TYPE.getClassLoader());
        Integer n2;
        if (value2 instanceof Integer) {
            n2 = (Integer)value2;
        }
        else {
            n2 = null;
        }
        final c f = j.f(parcel);
        final CalendarBooking calendarBooking = (CalendarBooking)parcel.readParcelable(CalendarBooking.class.getClassLoader());
        final CalendarPeriodExam calendarPeriodExam = (CalendarPeriodExam)parcel.readParcelable(CalendarPeriodExam.class.getClassLoader());
        final ArrayList<CalendarPeriodKlasse> j = com.untis.mobile.utils.extension.j.j(parcel, (android.os.Parcelable$Creator<CalendarPeriodKlasse>)CalendarPeriodKlasse.CREATOR);
        final CalendarPeriodLesson calendarPeriodLesson = com.untis.mobile.utils.extension.j.g(parcel, CalendarPeriodLesson.class.getClassLoader());
        final CalendarPeriodLesson calendarPeriodLesson2 = (CalendarPeriodLesson)parcel.readParcelable(CalendarPeriodStudentGroup.class.getClassLoader());
        final CalendarMessengerChannel calendarMessengerChannel = (CalendarMessengerChannel)parcel.readParcelable(CalendarMessengerChannel.class.getClassLoader());
        final String string = parcel.readString();
        final CalendarPeriodAttachment.CREATOR creator = CalendarPeriodAttachment.CREATOR;
        this(long1, n, calendarBooking, n2, f, calendarPeriodExam, j, calendarPeriodLesson, calendarPeriodLesson2, calendarMessengerChannel, string, (List<CalendarPeriodAttachment>)com.untis.mobile.utils.extension.j.j(parcel, (android.os.Parcelable$Creator<Object>)creator), parcel.readString(), (List<CalendarPeriodAttachment>)com.untis.mobile.utils.extension.j.j(parcel, (android.os.Parcelable$Creator<Object>)creator), (CalendarOriginalPeriod)parcel.readParcelable(CalendarOriginalPeriod.class.getClassLoader()), (List<CalendarPeriodResource>)com.untis.mobile.utils.extension.j.j(parcel, (android.os.Parcelable$Creator<Object>)CalendarPeriodResource.CREATOR), (List<CalendarPeriodRoom>)com.untis.mobile.utils.extension.j.j(parcel, (android.os.Parcelable$Creator<Object>)CalendarPeriodRoom.CREATOR), com.untis.mobile.utils.extension.j.f(parcel), com.untis.mobile.utils.extension.j.c(parcel), (List<CalendarPeriodStudent>)com.untis.mobile.utils.extension.j.j(parcel, (android.os.Parcelable$Creator<Object>)CalendarPeriodStudent.CREATOR), com.untis.mobile.utils.extension.j.g(parcel, CalendarPeriodSubType.class.getClassLoader()), com.untis.mobile.utils.extension.j.g(parcel, CalendarPeriodSubject.class.getClassLoader()), com.untis.mobile.utils.extension.j.h(parcel), (List<CalendarPeriodTeacher>)com.untis.mobile.utils.extension.j.j(parcel, (android.os.Parcelable$Creator<Object>)CalendarPeriodTeacher.CREATOR), parcel.readString(), (List<CalendarPeriodAttachment>)com.untis.mobile.utils.extension.j.j(parcel, (android.os.Parcelable$Creator<Object>)creator), com.untis.mobile.utils.extension.j.e(parcel), com.untis.mobile.utils.extension.j.a(parcel), (List<CalendarBlockPeriod>)com.untis.mobile.utils.extension.j.j(parcel, (android.os.Parcelable$Creator<Object>)CalendarBlockPeriod.CREATOR), (CalendarPeriodVideoCall)parcel.readParcelable(CalendarPeriodVideoCall.class.getClassLoader()), parcel.readString());
    }
    
    public final long component1() {
        return this.id;
    }
    
    @f
    public final CalendarMessengerChannel component10() {
        return this.messengerChannel;
    }
    
    @f
    public final String component11() {
        return this.notesAll;
    }
    
    @e
    public final List<CalendarPeriodAttachment> component12() {
        return this.notesAllFiles;
    }
    
    @f
    public final String component13() {
        return this.notesStaff;
    }
    
    @e
    public final List<CalendarPeriodAttachment> component14() {
        return this.notesStaffFiles;
    }
    
    @f
    public final CalendarOriginalPeriod component15() {
        return this.originalCalendarPeriod;
    }
    
    @e
    public final List<CalendarPeriodResource> component16() {
        return this.resources;
    }
    
    @e
    public final List<CalendarPeriodRoom> component17() {
        return this.rooms;
    }
    
    @e
    public final c component18() {
        return this.start;
    }
    
    @e
    public final CalendarPeriodStatus component19() {
        return this.status;
    }
    
    @f
    public final Long component2() {
        return this.absenceReasonId;
    }
    
    @e
    public final List<CalendarPeriodStudent> component20() {
        return this.students;
    }
    
    @f
    public final CalendarPeriodSubType component21() {
        return this.subType;
    }
    
    @f
    public final CalendarPeriodSubject component22() {
        return this.subject;
    }
    
    @f
    public final String component23() {
        return this.substitutionText;
    }
    
    @e
    public final List<CalendarPeriodTeacher> component24() {
        return this.teachers;
    }
    
    @f
    public final String component25() {
        return this.teachingContent;
    }
    
    @f
    public final List<CalendarPeriodAttachment> component26() {
        return this.teachingContentFiles;
    }
    
    @e
    public final CalendarPeriodType component27() {
        return this.type;
    }
    
    @e
    public final List<CalendarPeriodPermission> component28() {
        return (List<CalendarPeriodPermission>)this.permissions;
    }
    
    @f
    public final List<CalendarBlockPeriod> component29() {
        return this.blockPeriods;
    }
    
    @f
    public final CalendarBooking component3() {
        return this.booking;
    }
    
    @f
    public final CalendarPeriodVideoCall component30() {
        return this.videoCall;
    }
    
    @f
    public final String component31() {
        return this.lessonInfo;
    }
    
    @f
    public final Integer component4() {
        return this.color;
    }
    
    @e
    public final c component5() {
        return this.end;
    }
    
    @f
    public final CalendarPeriodExam component6() {
        return this.exam;
    }
    
    @e
    public final List<CalendarPeriodKlasse> component7() {
        return this.klassen;
    }
    
    @f
    public final CalendarPeriodLesson component8() {
        return this.lesson;
    }
    
    @f
    public final CalendarPeriodLesson component9() {
        return this.mainStudentGroup;
    }
    
    @e
    public final CalendarPeriod copy(final long n, @f final Long n2, @f final CalendarBooking calendarBooking, @f final Integer n3, @e final c c, @f final CalendarPeriodExam calendarPeriodExam, @e final List<CalendarPeriodKlasse> list, @f final CalendarPeriodLesson calendarPeriodLesson, @f final CalendarPeriodLesson calendarPeriodLesson2, @f final CalendarMessengerChannel calendarMessengerChannel, @f final String s, @e final List<CalendarPeriodAttachment> list2, @f final String s2, @e final List<CalendarPeriodAttachment> list3, @f final CalendarOriginalPeriod calendarOriginalPeriod, @e final List<CalendarPeriodResource> list4, @e final List<CalendarPeriodRoom> list5, @e final c c2, @e final CalendarPeriodStatus calendarPeriodStatus, @e final List<CalendarPeriodStudent> list6, @f final CalendarPeriodSubType calendarPeriodSubType, @f final CalendarPeriodSubject calendarPeriodSubject, @f final String s3, @e final List<CalendarPeriodTeacher> list7, @f final String s4, @f final List<CalendarPeriodAttachment> list8, @e final CalendarPeriodType calendarPeriodType, @e final List<? extends CalendarPeriodPermission> list9, @f final List<CalendarBlockPeriod> list10, @f final CalendarPeriodVideoCall calendarPeriodVideoCall, @f final String s5) {
        k0.p(c, "end");
        k0.p(list, "klassen");
        k0.p(list2, "notesAllFiles");
        k0.p(list3, "notesStaffFiles");
        k0.p(list4, "resources");
        k0.p(list5, "rooms");
        k0.p(c2, "start");
        k0.p(calendarPeriodStatus, "status");
        k0.p(list6, "students");
        k0.p(list7, "teachers");
        k0.p(calendarPeriodType, "type");
        k0.p(list9, "permissions");
        return new CalendarPeriod(n, n2, calendarBooking, n3, c, calendarPeriodExam, list, calendarPeriodLesson, calendarPeriodLesson2, calendarMessengerChannel, s, list2, s2, list3, calendarOriginalPeriod, list4, list5, c2, calendarPeriodStatus, list6, calendarPeriodSubType, calendarPeriodSubject, s3, list7, s4, list8, calendarPeriodType, list9, list10, calendarPeriodVideoCall, s5);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriod)) {
            return false;
        }
        final CalendarPeriod calendarPeriod = (CalendarPeriod)o;
        return this.id == calendarPeriod.id && k0.g(this.absenceReasonId, calendarPeriod.absenceReasonId) && k0.g(this.booking, calendarPeriod.booking) && k0.g(this.color, calendarPeriod.color) && k0.g(this.end, calendarPeriod.end) && k0.g(this.exam, calendarPeriod.exam) && k0.g(this.klassen, calendarPeriod.klassen) && k0.g(this.lesson, calendarPeriod.lesson) && k0.g(this.mainStudentGroup, calendarPeriod.mainStudentGroup) && k0.g(this.messengerChannel, calendarPeriod.messengerChannel) && k0.g(this.notesAll, calendarPeriod.notesAll) && k0.g(this.notesAllFiles, calendarPeriod.notesAllFiles) && k0.g(this.notesStaff, calendarPeriod.notesStaff) && k0.g(this.notesStaffFiles, calendarPeriod.notesStaffFiles) && k0.g(this.originalCalendarPeriod, calendarPeriod.originalCalendarPeriod) && k0.g(this.resources, calendarPeriod.resources) && k0.g(this.rooms, calendarPeriod.rooms) && k0.g(this.start, calendarPeriod.start) && this.status == calendarPeriod.status && k0.g(this.students, calendarPeriod.students) && k0.g(this.subType, calendarPeriod.subType) && k0.g(this.subject, calendarPeriod.subject) && k0.g(this.substitutionText, calendarPeriod.substitutionText) && k0.g(this.teachers, calendarPeriod.teachers) && k0.g(this.teachingContent, calendarPeriod.teachingContent) && k0.g(this.teachingContentFiles, calendarPeriod.teachingContentFiles) && this.type == calendarPeriod.type && k0.g(this.permissions, calendarPeriod.permissions) && k0.g(this.blockPeriods, calendarPeriod.blockPeriods) && k0.g(this.videoCall, calendarPeriod.videoCall) && k0.g(this.lessonInfo, calendarPeriod.lessonInfo);
    }
    
    @f
    public final Long getAbsenceReasonId() {
        return this.absenceReasonId;
    }
    
    @f
    public final List<CalendarBlockPeriod> getBlockPeriods() {
        return this.blockPeriods;
    }
    
    @f
    public final CalendarBooking getBooking() {
        return this.booking;
    }
    
    @f
    public final Integer getColor() {
        return this.color;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    @f
    public final CalendarPeriodExam getExam() {
        return this.exam;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final List<CalendarPeriodKlasse> getKlassen() {
        return this.klassen;
    }
    
    @f
    public final CalendarPeriodLesson getLesson() {
        return this.lesson;
    }
    
    @f
    public final String getLessonInfo() {
        return this.lessonInfo;
    }
    
    @f
    public final CalendarPeriodLesson getMainStudentGroup() {
        return this.mainStudentGroup;
    }
    
    @f
    public final CalendarMessengerChannel getMessengerChannel() {
        return this.messengerChannel;
    }
    
    @f
    public final String getNotesAll() {
        return this.notesAll;
    }
    
    @e
    public final List<CalendarPeriodAttachment> getNotesAllFiles() {
        return this.notesAllFiles;
    }
    
    @f
    public final String getNotesStaff() {
        return this.notesStaff;
    }
    
    @e
    public final List<CalendarPeriodAttachment> getNotesStaffFiles() {
        return this.notesStaffFiles;
    }
    
    @f
    public final CalendarOriginalPeriod getOriginalCalendarPeriod() {
        return this.originalCalendarPeriod;
    }
    
    @e
    public final List<CalendarPeriodPermission> getPermissions() {
        return (List<CalendarPeriodPermission>)this.permissions;
    }
    
    @e
    public final List<CalendarPeriodResource> getResources() {
        return this.resources;
    }
    
    @e
    public final List<CalendarPeriodRoom> getRooms() {
        return this.rooms;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @e
    public final CalendarPeriodStatus getStatus() {
        return this.status;
    }
    
    @e
    public final List<CalendarPeriodStudent> getStudents() {
        return this.students;
    }
    
    @f
    public final CalendarPeriodSubType getSubType() {
        return this.subType;
    }
    
    @f
    public final CalendarPeriodSubject getSubject() {
        return this.subject;
    }
    
    @f
    public final String getSubstitutionText() {
        return this.substitutionText;
    }
    
    @e
    public final List<CalendarPeriodTeacher> getTeachers() {
        return this.teachers;
    }
    
    @f
    public final String getTeachingContent() {
        return this.teachingContent;
    }
    
    @f
    public final List<CalendarPeriodAttachment> getTeachingContentFiles() {
        return this.teachingContentFiles;
    }
    
    @e
    public final CalendarPeriodType getType() {
        return this.type;
    }
    
    @f
    public final CalendarPeriodVideoCall getVideoCall() {
        return this.videoCall;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.id);
        final Long absenceReasonId = this.absenceReasonId;
        int hashCode = 0;
        int hashCode2;
        if (absenceReasonId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = absenceReasonId.hashCode();
        }
        final CalendarBooking booking = this.booking;
        int hashCode3;
        if (booking == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = booking.hashCode();
        }
        final Integer color = this.color;
        int hashCode4;
        if (color == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = color.hashCode();
        }
        final int hashCode5 = ((org.joda.time.base.c)this.end).hashCode();
        final CalendarPeriodExam exam = this.exam;
        int hashCode6;
        if (exam == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = exam.hashCode();
        }
        final int hashCode7 = this.klassen.hashCode();
        final CalendarPeriodLesson lesson = this.lesson;
        int hashCode8;
        if (lesson == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = lesson.hashCode();
        }
        final CalendarPeriodLesson mainStudentGroup = this.mainStudentGroup;
        int hashCode9;
        if (mainStudentGroup == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = mainStudentGroup.hashCode();
        }
        final CalendarMessengerChannel messengerChannel = this.messengerChannel;
        int hashCode10;
        if (messengerChannel == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = messengerChannel.hashCode();
        }
        final String notesAll = this.notesAll;
        int hashCode11;
        if (notesAll == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = notesAll.hashCode();
        }
        final int hashCode12 = this.notesAllFiles.hashCode();
        final String notesStaff = this.notesStaff;
        int hashCode13;
        if (notesStaff == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = notesStaff.hashCode();
        }
        final int hashCode14 = this.notesStaffFiles.hashCode();
        final CalendarOriginalPeriod originalCalendarPeriod = this.originalCalendarPeriod;
        int hashCode15;
        if (originalCalendarPeriod == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = originalCalendarPeriod.hashCode();
        }
        final int hashCode16 = this.resources.hashCode();
        final int hashCode17 = this.rooms.hashCode();
        final int hashCode18 = ((org.joda.time.base.c)this.start).hashCode();
        final int hashCode19 = this.status.hashCode();
        final int hashCode20 = this.students.hashCode();
        final CalendarPeriodSubType subType = this.subType;
        int hashCode21;
        if (subType == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = subType.hashCode();
        }
        final CalendarPeriodSubject subject = this.subject;
        int hashCode22;
        if (subject == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = subject.hashCode();
        }
        final String substitutionText = this.substitutionText;
        int hashCode23;
        if (substitutionText == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = substitutionText.hashCode();
        }
        final int hashCode24 = this.teachers.hashCode();
        final String teachingContent = this.teachingContent;
        int hashCode25;
        if (teachingContent == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = teachingContent.hashCode();
        }
        final List<CalendarPeriodAttachment> teachingContentFiles = this.teachingContentFiles;
        int hashCode26;
        if (teachingContentFiles == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = teachingContentFiles.hashCode();
        }
        final int hashCode27 = this.type.hashCode();
        final int hashCode28 = this.permissions.hashCode();
        final List<CalendarBlockPeriod> blockPeriods = this.blockPeriods;
        int hashCode29;
        if (blockPeriods == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = blockPeriods.hashCode();
        }
        final CalendarPeriodVideoCall videoCall = this.videoCall;
        int hashCode30;
        if (videoCall == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = videoCall.hashCode();
        }
        final String lessonInfo = this.lessonInfo;
        if (lessonInfo != null) {
            hashCode = lessonInfo.hashCode();
        }
        return (((((((((((((((((((((((((((((a * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode18) * 31 + hashCode19) * 31 + hashCode20) * 31 + hashCode21) * 31 + hashCode22) * 31 + hashCode23) * 31 + hashCode24) * 31 + hashCode25) * 31 + hashCode26) * 31 + hashCode27) * 31 + hashCode28) * 31 + hashCode29) * 31 + hashCode30) * 31 + hashCode;
    }
    
    public final void setAbsenceReasonId(@f final Long absenceReasonId) {
        this.absenceReasonId = absenceReasonId;
    }
    
    public final void setBlockPeriods(@f final List<CalendarBlockPeriod> blockPeriods) {
        this.blockPeriods = blockPeriods;
    }
    
    public final void setBooking(@f final CalendarBooking booking) {
        this.booking = booking;
    }
    
    public final void setColor(@f final Integer color) {
        this.color = color;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setExam(@f final CalendarPeriodExam exam) {
        this.exam = exam;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setKlassen(@e final List<CalendarPeriodKlasse> klassen) {
        k0.p(klassen, "<set-?>");
        this.klassen = klassen;
    }
    
    public final void setLesson(@f final CalendarPeriodLesson lesson) {
        this.lesson = lesson;
    }
    
    public final void setLessonInfo(@f final String lessonInfo) {
        this.lessonInfo = lessonInfo;
    }
    
    public final void setMainStudentGroup(@f final CalendarPeriodLesson mainStudentGroup) {
        this.mainStudentGroup = mainStudentGroup;
    }
    
    public final void setMessengerChannel(@f final CalendarMessengerChannel messengerChannel) {
        this.messengerChannel = messengerChannel;
    }
    
    public final void setNotesAll(@f final String notesAll) {
        this.notesAll = notesAll;
    }
    
    public final void setNotesAllFiles(@e final List<CalendarPeriodAttachment> notesAllFiles) {
        k0.p(notesAllFiles, "<set-?>");
        this.notesAllFiles = notesAllFiles;
    }
    
    public final void setNotesStaff(@f final String notesStaff) {
        this.notesStaff = notesStaff;
    }
    
    public final void setNotesStaffFiles(@e final List<CalendarPeriodAttachment> notesStaffFiles) {
        k0.p(notesStaffFiles, "<set-?>");
        this.notesStaffFiles = notesStaffFiles;
    }
    
    public final void setOriginalCalendarPeriod(@f final CalendarOriginalPeriod originalCalendarPeriod) {
        this.originalCalendarPeriod = originalCalendarPeriod;
    }
    
    public final void setPermissions(@e final List<? extends CalendarPeriodPermission> permissions) {
        k0.p(permissions, "<set-?>");
        this.permissions = permissions;
    }
    
    public final void setResources(@e final List<CalendarPeriodResource> resources) {
        k0.p(resources, "<set-?>");
        this.resources = resources;
    }
    
    public final void setRooms(@e final List<CalendarPeriodRoom> rooms) {
        k0.p(rooms, "<set-?>");
        this.rooms = rooms;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setStatus(@e final CalendarPeriodStatus status) {
        k0.p(status, "<set-?>");
        this.status = status;
    }
    
    public final void setStudents(@e final List<CalendarPeriodStudent> students) {
        k0.p(students, "<set-?>");
        this.students = students;
    }
    
    public final void setSubType(@f final CalendarPeriodSubType subType) {
        this.subType = subType;
    }
    
    public final void setSubject(@f final CalendarPeriodSubject subject) {
        this.subject = subject;
    }
    
    public final void setSubstitutionText(@f final String substitutionText) {
        this.substitutionText = substitutionText;
    }
    
    public final void setTeachers(@e final List<CalendarPeriodTeacher> teachers) {
        k0.p(teachers, "<set-?>");
        this.teachers = teachers;
    }
    
    public final void setTeachingContent(@f final String teachingContent) {
        this.teachingContent = teachingContent;
    }
    
    public final void setTeachingContentFiles(@f final List<CalendarPeriodAttachment> teachingContentFiles) {
        this.teachingContentFiles = teachingContentFiles;
    }
    
    public final void setType(@e final CalendarPeriodType type) {
        k0.p(type, "<set-?>");
        this.type = type;
    }
    
    public final void setVideoCall(@f final CalendarPeriodVideoCall videoCall) {
        this.videoCall = videoCall;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriod(id=");
        sb.append(this.id);
        sb.append(", absenceReasonId=");
        sb.append(this.absenceReasonId);
        sb.append(", booking=");
        sb.append(this.booking);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", exam=");
        sb.append(this.exam);
        sb.append(", klassen=");
        sb.append(this.klassen);
        sb.append(", lesson=");
        sb.append(this.lesson);
        sb.append(", mainStudentGroup=");
        sb.append(this.mainStudentGroup);
        sb.append(", messengerChannel=");
        sb.append(this.messengerChannel);
        sb.append(", notesAll=");
        sb.append((Object)this.notesAll);
        sb.append(", notesAllFiles=");
        sb.append(this.notesAllFiles);
        sb.append(", notesStaff=");
        sb.append((Object)this.notesStaff);
        sb.append(", notesStaffFiles=");
        sb.append(this.notesStaffFiles);
        sb.append(", originalCalendarPeriod=");
        sb.append(this.originalCalendarPeriod);
        sb.append(", resources=");
        sb.append(this.resources);
        sb.append(", rooms=");
        sb.append(this.rooms);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", students=");
        sb.append(this.students);
        sb.append(", subType=");
        sb.append(this.subType);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", substitutionText=");
        sb.append((Object)this.substitutionText);
        sb.append(", teachers=");
        sb.append(this.teachers);
        sb.append(", teachingContent=");
        sb.append((Object)this.teachingContent);
        sb.append(", teachingContentFiles=");
        sb.append(this.teachingContentFiles);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", permissions=");
        sb.append(this.permissions);
        sb.append(", blockPeriods=");
        sb.append(this.blockPeriods);
        sb.append(", videoCall=");
        sb.append(this.videoCall);
        sb.append(", lessonInfo=");
        sb.append((Object)this.lessonInfo);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeValue((Object)this.absenceReasonId);
        parcel.writeValue((Object)this.color);
        parcel.writeLong(((org.joda.time.base.g)this.end).n());
        parcel.writeParcelable((Parcelable)this.booking, n);
        parcel.writeParcelable((Parcelable)this.exam, n);
        parcel.writeTypedList((List)this.klassen);
        parcel.writeParcelable((Parcelable)this.lesson, n);
        parcel.writeParcelable((Parcelable)this.mainStudentGroup, n);
        parcel.writeParcelable((Parcelable)this.messengerChannel, n);
        parcel.writeString(this.notesAll);
        parcel.writeTypedList((List)this.notesAllFiles);
        parcel.writeString(this.notesStaff);
        parcel.writeTypedList((List)this.notesStaffFiles);
        parcel.writeParcelable((Parcelable)this.originalCalendarPeriod, n);
        parcel.writeTypedList((List)this.resources);
        parcel.writeTypedList((List)this.rooms);
        parcel.writeLong(((org.joda.time.base.g)this.start).n());
        parcel.writeString(this.status.getKey());
        parcel.writeTypedList((List)this.students);
        parcel.writeParcelable((Parcelable)this.subType, n);
        parcel.writeParcelable((Parcelable)this.subject, n);
        parcel.writeString(this.substitutionText);
        parcel.writeTypedList((List)this.teachers);
        parcel.writeString(this.teachingContent);
        parcel.writeTypedList((List)this.teachingContentFiles);
        parcel.writeString(this.type.getKey());
        j.k(parcel, this.permissions);
        parcel.writeTypedList((List)this.blockPeriods);
        parcel.writeParcelable((Parcelable)this.videoCall, n);
        parcel.writeString(this.lessonInfo);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<CalendarPeriod>
    {
        private CREATOR() {
        }
        
        @e
        public CalendarPeriod createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new CalendarPeriod(parcel);
        }
        
        @e
        public CalendarPeriod[] newArray(final int n) {
            return new CalendarPeriod[n];
        }
    }
}
