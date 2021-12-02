// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable.view;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import org.koin.core.c$a;
import android.os.Build$VERSION;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import kotlin.collections.t0;
import kotlin.ranges.k;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.util.Log;
import android.graphics.Canvas;
import java.util.HashSet;
import com.untis.mobile.persistence.models.DisplayableEntity;
import kotlin.text.s;
import java.util.Iterator;
import java.util.List;
import com.untis.mobile.utils.u;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodElementModel;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.period.t;
import java.util.Collection;
import com.untis.mobile.ui.activities.period.PeriodDetailActivity;
import com.untis.mobile.calendar.ui.CalendarActivity;
import com.untis.mobile.services.profile.legacy.j0;
import android.graphics.Paint$Style;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.untis.mobile.utils.settings.g;
import androidx.core.content.d;
import java.util.HashMap;
import com.untis.mobile.services.masterdata.b;
import android.content.Context;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import com.untis.mobile.persistence.models.DefaultColors;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import android.graphics.RectF;
import java.util.Map;
import com.untis.mobile.services.masterdata.a;
import org.jetbrains.annotations.e;
import com.untis.mobile.ui.activities.timetable.v;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import kotlin.Metadata;
import android.view.View;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00cc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b9\u0018\u00002\u00020\u00012\u00020\u0002B\u001a\u0012\u0006\u0010}\u001a\u00020z\u0012\u0007\u0010§\u0001\u001a\u00020\u001e¢\u0006\u0006\b\u00c0\u0001\u0010\u00c1\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J(\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J@\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J@\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J8\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J \u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J@\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J0\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J \u0010\"\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u000bH\u0002J\u0018\u0010+\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u000bH\u0002JP\u0010/\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0007H\u0002J0\u00104\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0002JD\u0010:\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000e2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u00112\b\b\u0002\u00109\u001a\u00020\u0011H\u0002J\u0018\u0010=\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010<\u001a\u00020;H\u0002J(\u00102\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u00101\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010>\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010?\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010A\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u000eH\u0002J\u0018\u0010D\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000bH\u0014J\u0018\u0010G\u001a\u00020\u00052\u0006\u0010F\u001a\u00020E2\b\u0010<\u001a\u0004\u0018\u00010;J\u0012\u0010H\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010K\u001a\u00020\u00112\b\u0010J\u001a\u0004\u0018\u00010IH\u0017R\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u001e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010WR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010c\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u001e0_8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010eR\u0016\u0010j\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010WR\u0016\u0010m\u001a\u00020k8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010lR\u0016\u0010q\u001a\u00020n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010WR\u001d\u0010y\u001a\u00020t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0016\u0010}\u001a\u00020z8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010TR\u0018\u0010\u0081\u0001\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010TR\u0019\u0010\u0084\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010WR\u0019\u0010\u0088\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\"\u0010\u008d\u0001\u001a\u00030\u0089\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010v\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010TR$\u0010\u0097\u0001\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u001e0_8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010bR\u0018\u0010\u0099\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010eR\u0019\u0010\u009b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0083\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0083\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0083\u0001R\u0018\u0010¡\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0001\u0010eR\u0019\u0010£\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010\u0083\u0001R\u0018\u0010¥\u0001\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¤\u0001\u0010TR\u0018\u0010§\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¦\u0001\u0010QR\u0018\u0010©\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¨\u0001\u0010QR\u0018\u0010«\u0001\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bª\u0001\u0010TR\u0018\u0010\u00ad\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¬\u0001\u0010eR\u0018\u0010¯\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010WR\u0018\u0010±\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u0010WR\u0018\u0010³\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b²\u0001\u0010eR\u0018\u0010µ\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010eR$\u0010·\u0001\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u001e0_8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¶\u0001\u0010bR\u0018\u0010¹\u0001\u001a\u00020n8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¸\u0001\u0010pR$\u0010»\u0001\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u001e0_8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bº\u0001\u0010bR\u0018\u0010½\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¼\u0001\u0010eR$\u0010¿\u0001\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070_8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¾\u0001\u0010b¨\u0006\u00c2\u0001" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/view/c;", "Landroid/view/View;", "Lorg/koin/core/c;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/j2;", "i", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "period", "Landroid/graphics/RectF;", "contentRectF", "", "textColor", "v", "", "rowHeight", "periodElementRows", "", "hideModus", "o", "l", "height", "m", "s", "k", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "n", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodElementModel;", "element", "", "f", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "entity", "e", "u", "A", "Lorg/joda/time/t;", "date", "minutes", "Lorg/joda/time/c;", "b", "index", "c", "spaceForPeriodInfoAvailable", "spaceForHomeWorksAvailable", "spaceForOfficeHourRegistrationAvailable", "j", "d", "x", "y", "text", "t", "Landroid/graphics/drawable/Drawable;", "icon", "color", "withRadiusOffset", "withCircle", "p", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "timeTableModel", "h", "z", "r", "unmodifiedTotal", "g", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "w", "onDraw", "Landroid/view/MotionEvent;", "motionEvent", "onTouchEvent", "Lcom/untis/mobile/persistence/models/DefaultColors;", "q0", "Lcom/untis/mobile/persistence/models/DefaultColors;", "colors", "J", "Ljava/lang/String;", "SEPARATOR", "d0", "Landroid/graphics/drawable/Drawable;", "officeHourRegistrationBaseIcon", "w0", "Z", "showFullSubjectNames", "t0", "showCancelledPeriods", "Landroid/graphics/Rect;", "j0", "Landroid/graphics/Rect;", "bounds", "", "", "m0", "Ljava/util/Map;", "localInfoCache", "h0", "I", "colorOnlineLesson", "U", "colorCancelled", "x0", "showElementBackground", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Landroid/graphics/Paint;", "M", "Landroid/graphics/Paint;", "paintNeutral", "u0", "showRooms", "Lcom/untis/mobile/utils/settings/g;", "y0", "Lkotlin/b0;", "getSettings", "()Lcom/untis/mobile/utils/settings/g;", "settings", "Lcom/untis/mobile/ui/activities/timetable/v;", "G", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "e0", "iconThereIsMore", "b0", "homeWorkLocalBaseIcon", "R", "F", "iconRadius", "s0", "useAlternateCancelled", "N", "padding", "Lcom/untis/mobile/utils/a;", "z0", "getAppSettings", "()Lcom/untis/mobile/utils/a;", "appSettings", "A0", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "getTimeTableModel", "()Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "setTimeTableModel", "(Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;)V", "f0", "isOnlineLessonIcon", "n0", "homeWorkCache", "p0", "lastWidthMeasureSpec", "P", "paddingShadow", "O", "paddingRow", "Q", "paddingIcon", "T", "colorHomeWork", "k0", "defaultStrokeWidth", "c0", "infoBaseIcon", "H", "profileId", "i0", "officeHourString", "a0", "homeWorkBaseIcon", "S", "colorInfo", "v0", "showFullTeacherNames", "r0", "useSubjectColor", "g0", "officeHourRegistrationColor", "W", "colorExam", "l0", "infoCache", "L", "paint", "o0", "officeHourCache", "V", "colorLocal", "K", "clickAreas", "<init>", "(Lcom/untis/mobile/ui/activities/timetable/v;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends View implements org.koin.core.c
{
    @f
    private TimeTableModel A0;
    @e
    private final v G;
    @e
    private final String H;
    @e
    private final com.untis.mobile.services.masterdata.a I;
    @e
    private final String J;
    @e
    private final Map<RectF, PeriodModel> K;
    @e
    private final Paint L;
    @e
    private final Paint M;
    private final float N;
    private final float O;
    private final float P;
    private final float Q;
    private final float R;
    private final int S;
    private final int T;
    private final int U;
    private final int V;
    private int W;
    @e
    private final Drawable a0;
    @e
    private final Drawable b0;
    @e
    private final Drawable c0;
    @e
    private final Drawable d0;
    @e
    private final Drawable e0;
    @e
    private final Drawable f0;
    private final int g0;
    private final int h0;
    @e
    private final String i0;
    @e
    private final Rect j0;
    private final float k0;
    @e
    private final Map<Long, String> l0;
    @e
    private final Map<Long, String> m0;
    @e
    private final Map<Long, String> n0;
    @e
    private final Map<Long, String> o0;
    private int p0;
    private DefaultColors q0;
    private boolean r0;
    private boolean s0;
    private boolean t0;
    private boolean u0;
    private boolean v0;
    private boolean w0;
    private boolean x0;
    @e
    private final b0 y0;
    @e
    private final b0 z0;
    
    public c(@e final v g, @e String string) {
        kotlin.jvm.internal.k0.p(g, "timeTableActivityService");
        kotlin.jvm.internal.k0.p(string, "profileId");
        super((Context)g.W0());
        this.G = g;
        this.H = string;
        this.I = b.Z.a(string);
        this.J = ",";
        this.K = new HashMap<RectF, PeriodModel>();
        final Paint l = new Paint(1);
        this.L = l;
        this.M = new Paint(1);
        final float dimension = this.getContext().getResources().getDimension(2131165280);
        this.N = dimension;
        this.O = dimension * 0.5f;
        final float p2 = 0.5f * dimension;
        this.P = p2;
        this.Q = p2 * 0.25f;
        this.R = dimension * 1.5f;
        this.S = d.f(this.getContext(), 2131099688);
        this.T = d.f(this.getContext(), 2131099993);
        this.U = d.f(this.getContext(), 2131099728);
        this.V = d.f(this.getContext(), 2131099692);
        final Drawable i = d.i(this.getContext(), 2131231112);
        kotlin.jvm.internal.k0.m(i);
        final Drawable mutate = i.mutate();
        kotlin.jvm.internal.k0.o(mutate, "getDrawable(context, R.drawable.untis_ic_homework_small)!!.mutate()");
        this.a0 = mutate;
        final Drawable j = d.i(this.getContext(), 2131231111);
        kotlin.jvm.internal.k0.m(j);
        final Drawable mutate2 = j.mutate();
        kotlin.jvm.internal.k0.o(mutate2, "getDrawable(context, R.drawable.untis_ic_homework_local_small)!!.mutate()");
        this.b0 = mutate2;
        final Drawable k = d.i(this.getContext(), 2131230903);
        kotlin.jvm.internal.k0.m(k);
        final Drawable mutate3 = k.mutate();
        kotlin.jvm.internal.k0.o(mutate3, "getDrawable(context, R.drawable.ic_i_white_18dp)!!.mutate()");
        this.c0 = mutate3;
        final Drawable m = d.i(this.getContext(), 2131230895);
        kotlin.jvm.internal.k0.m(m);
        final Drawable mutate4 = m.mutate();
        kotlin.jvm.internal.k0.o(mutate4, "getDrawable(context, R.drawable.ic_group_white_18dp)!!.mutate()");
        this.d0 = mutate4;
        final Drawable i2 = d.i(this.getContext(), 2131230917);
        kotlin.jvm.internal.k0.m(i2);
        final Drawable mutate5 = i2.mutate();
        kotlin.jvm.internal.k0.o(mutate5, "getDrawable(context, R.drawable.ic_more_horiz_24)!!.mutate()");
        this.e0 = mutate5;
        final Drawable i3 = d.i(this.getContext(), 2131231136);
        kotlin.jvm.internal.k0.m(i3);
        final Drawable mutate6 = i3.mutate();
        kotlin.jvm.internal.k0.o(mutate6, "getDrawable(context, R.drawable.untis_ic_online_lesson_white)!!.mutate()");
        this.f0 = mutate6;
        this.g0 = d.f(this.getContext(), 2131099692);
        this.h0 = d.f(this.getContext(), 2131099692);
        string = this.getContext().getString(2131886250);
        kotlin.jvm.internal.k0.o(string, "context.getString(R.string.contactHours_registrationAvailable_text)");
        this.i0 = string;
        this.j0 = new Rect();
        this.k0 = l.getStrokeWidth();
        this.l0 = new HashMap<Long, String>();
        this.m0 = new HashMap<Long, String>();
        this.n0 = new HashMap<Long, String>();
        this.o0 = new HashMap<Long, String>();
        this.t0 = true;
        this.u0 = true;
        this.y0 = kotlin.d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final g invoke() {
                return (g)this.G.t(k1.d(g.class), null, null);
            }
        });
        this.z0 = kotlin.d0.c((n6.a<?>)new n6.a<com.untis.mobile.utils.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.utils.a invoke() {
                return (com.untis.mobile.utils.a)this.G.t(k1.d(com.untis.mobile.utils.a.class), null, null);
            }
        });
        this.setBackgroundColor(0);
        l.setStyle(Paint$Style.FILL_AND_STROKE);
    }
    
    private final void A(final PeriodModel periodModel) {
        final TimeTableModel a0 = this.A0;
        if (a0 == null) {
            return;
        }
        final Profile l = com.untis.mobile.services.profile.legacy.j0.G.l(this.H);
        if (l == null) {
            return;
        }
        if (com.untis.mobile.b.G.b(l)) {
            final org.joda.time.c b = this.b(a0.getDate(), periodModel.getStartMinute());
            final org.joda.time.c b2 = this.b(a0.getDate(), periodModel.getEndMinute());
            final com.untis.mobile.ui.activities.common.b w0 = this.G.W0();
            final CalendarActivity.a h = CalendarActivity.H;
            final Context context = this.getContext();
            kotlin.jvm.internal.k0.o(context, "context");
            ((Activity)w0).startActivity(h.b(context, this.H, a0.getEntityType(), a0.getEntityId(), kotlin.collections.v.I5((Iterable<? extends Long>)a0.overlapping(periodModel)), periodModel.getId(), b, b2));
        }
        else {
            final PeriodDetailActivity.a w2 = PeriodDetailActivity.W;
            final Context context2 = this.getContext();
            kotlin.jvm.internal.k0.o(context2, "context");
            ((ComponentActivity)this.G.W0()).startActivityForResult(PeriodDetailActivity.a.c(w2, context2, this.H, this.G.k1(), a0.overlapping(periodModel), periodModel.getId(), null, 32, null), 150);
        }
    }
    
    private final org.joda.time.c b(final org.joda.time.t t, final int n) {
        final org.joda.time.c v0 = t.F0().V0(n);
        kotlin.jvm.internal.k0.o(v0, "date.toDateTimeAtStartOfDay().plusMinutes(minutes)");
        return v0;
    }
    
    private final EntityType c(final PeriodModel periodModel, final int n) {
        final TimeTableModel a0 = this.A0;
        if (a0 == null) {
            return EntityType.NONE;
        }
        final HashMap<EntityType, Integer> hashMap = new HashMap<EntityType, Integer>();
        final EntityType class1 = EntityType.CLASS;
        final List<PeriodElementModel> elements = periodModel.getElements();
        final ArrayList<PeriodElementModel> list = new ArrayList<PeriodElementModel>();
        final Iterator<Object> iterator = elements.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = true;
            if (!hasNext) {
                break;
            }
            final PeriodElementModel next = iterator.next();
            if (next.getEntityType() != EntityType.CLASS) {
                b = false;
            }
            if (!b) {
                continue;
            }
            list.add(next);
        }
        hashMap.put(class1, list.size());
        final EntityType room = EntityType.ROOM;
        final List<PeriodElementModel> elements2 = periodModel.getElements();
        final ArrayList<PeriodElementModel> list2 = new ArrayList<PeriodElementModel>();
        for (final PeriodElementModel next2 : elements2) {
            final PeriodElementModel periodElementModel = next2;
            if (this.u0 && periodElementModel.getEntityType() == EntityType.ROOM) {
                list2.add(next2);
            }
        }
        hashMap.put(room, list2.size());
        final EntityType subject = EntityType.SUBJECT;
        final List<PeriodElementModel> elements3 = periodModel.getElements();
        final ArrayList<PeriodElementModel> list3 = new ArrayList<PeriodElementModel>();
        for (final PeriodElementModel next3 : elements3) {
            if (next3.getEntityType() == EntityType.SUBJECT) {
                list3.add(next3);
            }
        }
        hashMap.put(subject, list3.size());
        final EntityType teacher = EntityType.TEACHER;
        final List<PeriodElementModel> elements4 = periodModel.getElements();
        final ArrayList<PeriodElementModel> list4 = new ArrayList<PeriodElementModel>();
        for (final PeriodElementModel next4 : elements4) {
            if (next4.getEntityType() == EntityType.TEACHER) {
                list4.add(next4);
            }
        }
        hashMap.put(teacher, list4.size());
        final int n2 = a.a[a0.getEntityType().ordinal()];
        if (n2 != 1) {
            if (n2 != 2 && n2 != 3) {
                if (n2 != 4) {
                    if (n2 == 5) {
                        final EntityType[] c = u.m.a.c;
                        kotlin.jvm.internal.k0.o(c, "SUBJECT");
                        final int length = c.length;
                        int i = 0;
                        int n3 = 0;
                        while (i < length) {
                            final EntityType key = c[i];
                            final int n4 = i + 1;
                            Integer value;
                            if ((value = hashMap.get(key)) == null) {
                                value = 0;
                            }
                            i = n4;
                            if (value.intValue() > 0) {
                                if (n == n3) {
                                    kotlin.jvm.internal.k0.o(key, "entity");
                                    return key;
                                }
                                ++n3;
                                i = n4;
                            }
                        }
                    }
                }
                else {
                    final EntityType[] d = u.m.a.d;
                    kotlin.jvm.internal.k0.o(d, "ROOM");
                    final int length2 = d.length;
                    int j = 0;
                    int n5 = 0;
                    while (j < length2) {
                        final EntityType key2 = d[j];
                        final int n6 = j + 1;
                        Integer value2;
                        if ((value2 = hashMap.get(key2)) == null) {
                            value2 = 0;
                        }
                        j = n6;
                        if (value2.intValue() > 0) {
                            if (n == n5) {
                                kotlin.jvm.internal.k0.o(key2, "entity");
                                return key2;
                            }
                            ++n5;
                            j = n6;
                        }
                    }
                }
            }
            else {
                final EntityType[] a2 = u.m.a.a;
                kotlin.jvm.internal.k0.o(a2, "CLASS");
                final int length3 = a2.length;
                int k = 0;
                int n7 = 0;
                while (k < length3) {
                    final EntityType key3 = a2[k];
                    final int n8 = k + 1;
                    Integer value3;
                    if ((value3 = hashMap.get(key3)) == null) {
                        value3 = 0;
                    }
                    k = n8;
                    if (value3.intValue() > 0) {
                        if (n == n7) {
                            kotlin.jvm.internal.k0.o(key3, "entity");
                            return key3;
                        }
                        ++n7;
                        k = n8;
                    }
                }
            }
        }
        else {
            final EntityType[] b2 = u.m.a.b;
            kotlin.jvm.internal.k0.o(b2, "TEACHER");
            final int length4 = b2.length;
            int l = 0;
            int n9 = 0;
            while (l < length4) {
                final EntityType key4 = b2[l];
                final int n10 = l + 1;
                Integer value4;
                if ((value4 = hashMap.get(key4)) == null) {
                    value4 = 0;
                }
                l = n10;
                if (value4.intValue() > 0) {
                    if (n == n9) {
                        kotlin.jvm.internal.k0.o(key4, "entity");
                        return key4;
                    }
                    ++n9;
                    l = n10;
                }
            }
        }
        return EntityType.NONE;
    }
    
    private final String d(final PeriodModel periodModel) {
        final int i = periodModel.getHomeworks().size() + periodModel.getLocalhomeWorks().size();
        if (i == 0) {
            return "";
        }
        if (i == 1 && (periodModel.getHomeworks().isEmpty() ^ true)) {
            return s.k2((String)periodModel.getHomeworks().get(0), "@completed@", "", false, 4, (Object)null);
        }
        if (i == 1 && (true ^ periodModel.getLocalhomeWorks().isEmpty())) {
            return s.k2((String)periodModel.getLocalhomeWorks().get(0), "@completed@", "", false, 4, (Object)null);
        }
        final String string = this.getContext().getString(2131886296);
        kotlin.jvm.internal.k0.o(string, "context.getString(R.string.homework_manyHomeworks_text)");
        return s.k2(string, "{0}", String.valueOf(i), false, 4, (Object)null);
    }
    
    private final String e(final EntityType entityType, final DisplayableEntity displayableEntity, final boolean b) {
        if (entityType == EntityType.TEACHER && this.v0 && !b) {
            return displayableEntity.getDisplayableDescription();
        }
        if (entityType == EntityType.SUBJECT && this.w0 && !b) {
            return displayableEntity.getDisplayableDescription();
        }
        return displayableEntity.getDisplayableTitle();
    }
    
    private final String f(final PeriodElementModel periodElementModel, final boolean b) {
        final DisplayableEntity v = this.I.v(periodElementModel.getEntityType(), periodElementModel.getCurrentId());
        final DisplayableEntity v2 = this.I.v(periodElementModel.getEntityType(), periodElementModel.getOriginalId());
        if (v == null || v2 == null || v.entityId() != v2.entityId()) {
            if (v != null && v2 != null && v.entityId() != v2.entityId()) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.e(periodElementModel.getEntityType(), v, b));
                sb.append('(');
                sb.append(this.e(periodElementModel.getEntityType(), v2, b));
                sb.append(')');
                return sb.toString();
            }
            if (v == null && v2 != null) {
                return this.e(periodElementModel.getEntityType(), v2, b);
            }
            if (v == null || v2 != null) {
                return "";
            }
        }
        return this.e(periodElementModel.getEntityType(), v, b);
    }
    
    private final float g(final boolean b, final float n) {
        if (b && n >= 3.0f) {
            return 3.0f;
        }
        return n;
    }
    
    private final com.untis.mobile.utils.a getAppSettings() {
        return this.z0.getValue();
    }
    
    private final g getSettings() {
        return this.y0.getValue();
    }
    
    private final int h(final PeriodModel periodModel, final TimeTableModel timeTableModel) {
        final HashSet<EntityType> set = new HashSet<EntityType>();
        final List<PeriodElementModel> elements = periodModel.getElements();
        final ArrayList<PeriodElementModel> list = new ArrayList<PeriodElementModel>();
        for (final PeriodElementModel next : elements) {
            final PeriodElementModel periodElementModel = next;
            if (this.u0 || periodElementModel.getEntityType() != EntityType.ROOM) {
                list.add(next);
            }
        }
        for (final PeriodElementModel periodElementModel2 : list) {
            if (periodElementModel2.getEntityType() == timeTableModel.getEntityType() && periodElementModel2.getCurrentId() == timeTableModel.getEntityId()) {
                continue;
            }
            set.add(periodElementModel2.getEntityType());
        }
        return set.size();
    }
    
    private final void i(final Canvas canvas) {
        final TimeTableModel a0 = this.A0;
        if (a0 == null) {
            return;
        }
        this.K.clear();
        this.L.setTextSize(this.G.j1());
        this.L.getTextBounds("1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ", 0, 36, this.j0);
        final float n = this.j0.height() + this.O;
        this.L.getTextBounds("AAA", 0, 3, this.j0);
        List<PeriodModel> list;
        if (this.t0) {
            list = a0.getPeriods();
        }
        else {
            list = a0.getPeriodsWithOutCancelled();
        }
        final boolean b = this.G.e1() > 2;
        final Iterator<Object> iterator = list.iterator();
        final TimeTableModel timeTableModel = a0;
        while (iterator.hasNext()) {
            final PeriodModel periodModel = iterator.next();
            Label_0173: {
                if (!b) {
                    break Label_0173;
                }
                try {
                    if (periodModel.getHide()) {
                        this.u(canvas, periodModel);
                    }
                    int n2;
                    if (this.r0 && periodModel.getTextColorCustom() != 0) {
                        n2 = periodModel.getTextColorCustom();
                    }
                    else if (this.r0 && periodModel.getTextColorSubject() != 0) {
                        n2 = periodModel.getTextColorSubject();
                    }
                    else {
                        n2 = periodModel.getTextColor();
                    }
                    final RectF r = this.r(canvas, periodModel, b);
                    final int h = this.h(periodModel, timeTableModel);
                    final float n3 = r.height() - h * n;
                    final boolean z = this.z(n3, n);
                    final boolean x = this.x(z, n3, n);
                    final boolean y = this.y(z, x, n3, n);
                    try {
                        r.set(this.j(canvas, periodModel, r, n, n2, z, x, y, b));
                        this.o(canvas, periodModel, r, n, h, n2, b);
                        this.v(canvas, periodModel, r, n2);
                    }
                    finally {}
                }
                finally {}
            }
            final Throwable t;
            Log.e("untis_log", "error while rendering period", t);
        }
    }
    
    private final RectF j(final Canvas canvas, final PeriodModel periodModel, final RectF rectF, float n, final int n2, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final RectF rectF2 = new RectF(rectF);
        final float width = rectF.width();
        final float r = this.R;
        final float n3 = r + r + this.P;
        final float n4 = n3 * 0.5f;
        float n5 = rectF.right - r;
        final float n6 = rectF.top + r;
        final float n7 = rectF.centerX() + this.R;
        float bottom = rectF.bottom;
        Label_0163: {
            if (periodModel.getInfo().length() > 0 || periodModel.getSubstitution().length() > 0 || (!b4 && periodModel.getLesson().length() > 0)) {
                if (b) {
                    String c = this.l0.get(periodModel.getId());
                    if (c == null) {
                        String s = periodModel.getSubstitution();
                        if (s.length() == 0) {
                            s = periodModel.getInfo();
                        }
                        final boolean b5 = s.length() == 0;
                        String lesson = s;
                        if (b5) {
                            lesson = s;
                            if (!b4) {
                                lesson = periodModel.getLesson();
                            }
                        }
                        this.L.getTextBounds(lesson, 0, lesson.length(), this.j0);
                        String substring = lesson;
                        while (this.j0.width() > width - n3) {
                            kotlin.jvm.internal.k0.m(substring);
                            if (substring.length() <= 0) {
                                break;
                            }
                            substring = substring.substring(0, substring.length() - 1);
                            kotlin.jvm.internal.k0.o(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                            this.L.getTextBounds(substring, 0, substring.length(), this.j0);
                        }
                        kotlin.jvm.internal.k0.m(substring);
                        c = substring;
                        if (substring.length() != lesson.length()) {
                            c = substring;
                            if (substring.length() > 3) {
                                final String substring2 = substring.substring(0, substring.length() - 2);
                                kotlin.jvm.internal.k0.o(substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                c = kotlin.jvm.internal.k0.C(substring2, "..");
                            }
                        }
                        this.l0.put(periodModel.getId(), c);
                    }
                    if (c.length() > 0) {
                        this.t(canvas, n7, bottom, c, n2);
                        final float n8 = (float)this.j0.centerX();
                        final float r2 = this.R;
                        q(this, canvas, n7 - n8 - r2 - this.P, bottom - r2 + this.Q, this.c0, this.S, false, false, 64, null);
                        bottom -= n;
                        rectF2.bottom -= n;
                        break Label_0163;
                    }
                }
                q(this, canvas, n5, n6, this.c0, this.S, false, false, 64, null);
                n5 -= n4;
            }
        }
        String s7 = null;
        String s8 = null;
        Label_1147: {
            if (periodModel.getLocal().length() > 0) {
                Drawable drawable;
                int n11;
                if (b) {
                    String s2 = this.m0.get(periodModel.getId());
                    if (s2 == null) {
                        String s3 = periodModel.getLocal();
                        Paint paint = this.L;
                        int n9 = s3.length();
                        Rect rect = this.j0;
                        while (true) {
                            paint.getTextBounds(s3, 0, n9, rect);
                            if (this.j0.width() <= width - n3) {
                                break;
                            }
                            kotlin.jvm.internal.k0.m(s3);
                            if (s3.length() <= 0) {
                                break;
                            }
                            s3 = s3.substring(0, s3.length() - 1);
                            kotlin.jvm.internal.k0.o(s3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                            paint = this.L;
                            n9 = s3.length();
                            rect = this.j0;
                        }
                        kotlin.jvm.internal.k0.m(s3);
                        if (s3.length() != periodModel.getLocal().length()) {
                            if (s3.length() > 3) {
                                final String substring3 = s3.substring(0, s3.length() - 2);
                                kotlin.jvm.internal.k0.o(substring3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                s3 = kotlin.jvm.internal.k0.C(substring3, "..");
                            }
                        }
                        this.m0.put(periodModel.getId(), s3);
                        s2 = s3;
                    }
                    final String s4 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)";
                    final String s5 = "..";
                    if (s2.length() > 0) {
                        this.t(canvas, n7, bottom, s2, n2);
                        final float n10 = (float)this.j0.centerX();
                        final float r3 = this.R;
                        final float p9 = this.P;
                        final float q = this.Q;
                        final Drawable c2 = this.c0;
                        final int v = this.V;
                        final String s6 = s5;
                        s7 = s4;
                        q(this, canvas, n7 - n10 - r3 - p9, bottom - r3 + q, c2, v, false, false, 96, null);
                        bottom -= n;
                        rectF2.bottom -= n;
                        s8 = s6;
                        break Label_1147;
                    }
                    final String s9 = s4;
                    drawable = this.c0;
                    n11 = this.V;
                    s8 = s5;
                    s7 = s9;
                }
                else {
                    s7 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)";
                    s8 = "..";
                    drawable = this.c0;
                    n11 = this.V;
                }
                q(this, canvas, n5, n6, drawable, n11, false, false, 96, null);
                n5 -= n4;
            }
            else {
                s7 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)";
                s8 = "..";
            }
        }
        Label_1523: {
            if (periodModel.getHasOfficeHourRegistrations()) {
                if (b3) {
                    String s10 = this.o0.get(periodModel.getId());
                    if (s10 == null) {
                        s10 = this.i0;
                        while (true) {
                            this.L.getTextBounds(s10, 0, s10.length(), this.j0);
                            if (this.j0.width() <= width - n3) {
                                break;
                            }
                            kotlin.jvm.internal.k0.m(s10);
                            if (s10.length() <= 0) {
                                break;
                            }
                            s10 = s10.substring(0, s10.length() - 1);
                            kotlin.jvm.internal.k0.o(s10, s7);
                        }
                        kotlin.jvm.internal.k0.m(s10);
                        if (s10.length() != this.i0.length()) {
                            if (s10.length() > 3) {
                                final String substring4 = s10.substring(0, s10.length() - 2);
                                kotlin.jvm.internal.k0.o(substring4, s7);
                                s10 = kotlin.jvm.internal.k0.C(substring4, s8);
                            }
                        }
                        this.o0.put(periodModel.getId(), s10);
                    }
                    if (s10.length() > 0) {
                        this.t(canvas, n7, bottom, s10, n2);
                        final float n12 = (float)this.j0.centerX();
                        final float r4 = this.R;
                        q(this, canvas, n7 - n12 - r4 - this.P, bottom - r4 + this.Q, this.d0, this.g0, false, false, 96, null);
                        rectF2.bottom -= n;
                        break Label_1523;
                    }
                }
                q(this, canvas, n5, n6, this.d0, this.g0, false, false, 96, null);
            }
        }
        final String s11 = s7;
        final float right = rectF.right;
        final float r5 = this.R;
        final float n13 = right - r5;
        final float n14 = rectF.bottom - r5;
        if ((periodModel.getHomeworks().isEmpty() ^ true) || (periodModel.getLocalhomeWorks().isEmpty() ^ true)) {
            while (true) {
                Label_2240: {
                    float n22;
                    if (b2) {
                        String c3 = this.n0.get(periodModel.getId());
                        if (c3 == null) {
                            final String d = this.d(periodModel);
                            this.L.getTextBounds(d, 0, d.length(), this.j0);
                            String substring5 = d;
                            while (this.j0.width() > width - n3) {
                                kotlin.jvm.internal.k0.m(substring5);
                                if (substring5.length() <= 0) {
                                    break;
                                }
                                substring5 = substring5.substring(0, substring5.length() - 1);
                                kotlin.jvm.internal.k0.o(substring5, s11);
                                this.L.getTextBounds(substring5, 0, substring5.length(), this.j0);
                            }
                            kotlin.jvm.internal.k0.m(substring5);
                            c3 = substring5;
                            if (substring5.length() != d.length()) {
                                c3 = substring5;
                                if (substring5.length() > 3) {
                                    final String substring6 = substring5.substring(0, substring5.length() - 2);
                                    kotlin.jvm.internal.k0.o(substring6, s11);
                                    c3 = kotlin.jvm.internal.k0.C(substring6, s8);
                                }
                            }
                            this.n0.put(periodModel.getId(), c3);
                        }
                        if (c3.length() > 0) {
                            this.t(canvas, n7, bottom, c3, n2);
                            Label_2013: {
                                float n17;
                                Drawable drawable2;
                                float n18;
                                if (periodModel.getHomeworks().isEmpty() ^ true) {
                                    final float n15 = (float)this.j0.centerX();
                                    final float r6 = this.R;
                                    final float n16 = n7 - n15 - r6 - this.P + 0.0f;
                                    n17 = bottom - r6 + this.Q;
                                    drawable2 = this.a0;
                                    n18 = n16;
                                }
                                else {
                                    if (!(periodModel.getLocalhomeWorks().isEmpty() ^ true)) {
                                        break Label_2013;
                                    }
                                    final float n19 = (float)this.j0.centerX();
                                    final float r7 = this.R;
                                    final float n20 = n7 - n19 - r7 - this.P + 0.0f;
                                    final float n21 = bottom - r7 + this.Q;
                                    drawable2 = this.b0;
                                    n18 = n20;
                                    n17 = n21;
                                }
                                q(this, canvas, n18, n17, drawable2, this.T, false, false, 64, null);
                            }
                            rectF2.bottom -= n;
                            return rectF2;
                        }
                        if (periodModel.getHomeworks().isEmpty() ^ true) {
                            n = (float)this.j0.centerX();
                            final float r8 = this.R;
                            n = n7 - n - r8 - this.P + 0.0f;
                            n22 = bottom - r8 + this.Q;
                        }
                        else {
                            if (periodModel.getLocalhomeWorks().isEmpty() ^ true) {
                                n = (float)this.j0.centerX();
                                final float r9 = this.R;
                                n = n7 - n - r9 - this.P + 0.0f;
                                final float n23 = bottom - r9 + this.Q;
                                final float n24 = n;
                                n = n23;
                                break Label_2240;
                            }
                            return rectF2;
                        }
                    }
                    else if (periodModel.getHomeworks().isEmpty() ^ true) {
                        n22 = n14;
                        n = n13;
                    }
                    else {
                        if (periodModel.getLocalhomeWorks().isEmpty() ^ true) {
                            n = n14;
                            final float n24 = n13;
                            break Label_2240;
                        }
                        return rectF2;
                    }
                    final Drawable drawable3 = this.a0;
                    final float n25 = n22;
                    final float n24 = n;
                    q(this, canvas, n24, n25, drawable3, this.T, false, false, 64, null);
                    return rectF2;
                }
                final Drawable drawable3 = this.b0;
                final float n25 = n;
                continue;
            }
        }
        return rectF2;
    }
    
    private final void k(final Canvas canvas, final PeriodModel periodModel, final RectF rectF, float n, final int n2, final int color, final boolean b) {
        final float height = rectF.height();
        final float n3 = 2;
        if (height > n * n3) {
            n = rectF.height() / n3;
        }
        float top = rectF.top;
        int n4 = 0;
        float bottom;
        while (true) {
            final float n5 = top + n;
            final float o = this.O;
            bottom = rectF.bottom;
            if (n5 - o > bottom) {
                break;
            }
            int n6;
            if (n2 == 3 && n4 == 2) {
                final float left = rectF.left;
                final Bitmap bitmap = Bitmap.createBitmap((int)(rectF.right - left), (int)n, Bitmap$Config.ARGB_8888);
                this.n(new Canvas(bitmap), periodModel, this.c(periodModel, n4), color, b);
                canvas.drawBitmap(bitmap, left, top, this.M);
                n6 = n4 + 1;
            }
            else {
                final Iterator<Integer> iterator = new k(0, 1).iterator();
                while (true) {
                    n6 = n4;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final int b2 = ((t0)iterator).b();
                    final float n7 = rectF.left + b2 * rectF.width() * 0.5f;
                    final Bitmap bitmap2 = Bitmap.createBitmap((int)(rectF.left + (b2 + 1) * rectF.width() * 0.5f - n7), (int)n, Bitmap$Config.ARGB_8888);
                    this.n(new Canvas(bitmap2), periodModel, this.c(periodModel, n4), color, b);
                    canvas.drawBitmap(bitmap2, n7, top, this.M);
                    ++n4;
                }
            }
            top = n5;
            n4 = n6;
        }
        if (bottom - top > this.Q) {
            this.L.getTextBounds("..", 0, 2, this.j0);
            this.L.setColor(color);
            canvas.drawText("..", 0, 2, rectF.centerX() - this.j0.width() * 0.5f, (rectF.bottom - top) * 0.5f + top, this.L);
        }
    }
    
    private final void l(final Canvas canvas, final PeriodModel periodModel, final RectF rectF, float n, int n2, final int n3, final boolean b) {
        final float n4 = (float)n2;
        if (n * n4 < rectF.height()) {
            n = rectF.height() / n4;
        }
        float top = rectF.top;
        n2 = 0;
        while (true) {
            final float n5 = top + n;
            if (n5 - this.O > rectF.bottom) {
                break;
            }
            final Bitmap bitmap = Bitmap.createBitmap((int)rectF.width(), (int)n, Bitmap$Config.ARGB_8888);
            this.n(new Canvas(bitmap), periodModel, this.c(periodModel, n2), n3, b);
            canvas.drawBitmap(bitmap, rectF.left, top, this.M);
            top = n5;
            ++n2;
        }
    }
    
    private final void m(final Canvas canvas, final PeriodModel periodModel, final RectF rectF, final float n, final int color, final boolean b) {
        float top = rectF.top;
        int n2 = 0;
        float bottom;
        while (true) {
            final float n3 = top + n;
            final float o = this.O;
            bottom = rectF.bottom;
            if (n3 - o > bottom) {
                break;
            }
            final Bitmap bitmap = Bitmap.createBitmap((int)rectF.width(), (int)n, Bitmap$Config.ARGB_8888);
            this.n(new Canvas(bitmap), periodModel, this.c(periodModel, n2), color, b);
            canvas.drawBitmap(bitmap, rectF.left, top, this.M);
            top = n3;
            ++n2;
        }
        if (bottom - top > this.Q) {
            this.L.getTextBounds("..", 0, 2, this.j0);
            this.L.setColor(color);
            canvas.drawText("..", 0, 2, rectF.centerX() - this.j0.width() * 0.5f, top + (rectF.bottom - top) * 0.5f, this.L);
        }
    }
    
    private final void n(final Canvas canvas, final PeriodModel periodModel, final EntityType entityType, final int color, final boolean b) {
        final int width = canvas.getWidth();
        final TimeTableEntity k1 = this.G.k1();
        final List<PeriodElementModel> elements = periodModel.getElements();
        final ArrayList<PeriodElementModel> list = new ArrayList<PeriodElementModel>();
        final Iterator<Object> iterator = elements.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final boolean b2 = true;
            if (!hasNext) {
                break;
            }
            final PeriodElementModel next = iterator.next();
            final PeriodElementModel periodElementModel = next;
            int n = 0;
            Label_0122: {
                if (periodElementModel.getEntityType() == entityType) {
                    n = (b2 ? 1 : 0);
                    if (k1.getEntityType() != periodElementModel.getEntityType()) {
                        break Label_0122;
                    }
                    if (periodElementModel.getCurrentId() != k1.getEntityId()) {
                        n = (b2 ? 1 : 0);
                        break Label_0122;
                    }
                }
                n = 0;
            }
            if (n == 0) {
                continue;
            }
            list.add(next);
        }
        final Iterator<Object> iterator2 = list.iterator();
        String c = "";
        while (iterator2.hasNext()) {
            final String f = this.f(iterator2.next(), b);
            final boolean b3 = c.length() > 0;
            String c2 = c;
            if (b3) {
                final boolean b4 = f.length() > 0;
                c2 = c;
                if (b4) {
                    c2 = kotlin.jvm.internal.k0.C(c, ", ");
                }
            }
            c = kotlin.jvm.internal.k0.C(c2, f);
        }
        this.L.getTextBounds("M", 0, 1, this.j0);
        final int height = this.j0.height();
        final float n2 = (canvas.getHeight() + height) * 0.5f;
        this.L.getTextBounds(c, 0, c.length(), this.j0);
        final int width2 = this.j0.width();
        float n3;
        if (width2 < width) {
            n3 = (width - width2) * 0.5f;
        }
        else {
            n3 = 0.0f;
        }
        final Iterator<Object> iterator3 = list.iterator();
        float n4 = 0.0f;
        while (iterator3.hasNext()) {
            final PeriodElementModel periodElementModel2 = iterator3.next();
            String s = this.f(periodElementModel2, b);
            final int length = s.length();
            while (true) {
                this.L.getTextBounds(s, 0, s.length(), this.j0);
                if (n3 + n4 + this.j0.width() <= width + this.P || s.length() <= 0) {
                    break;
                }
                s = s.substring(0, s.length() - 1);
                kotlin.jvm.internal.k0.o(s, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            }
            String substring = s;
            if (length != s.length()) {
                substring = s;
                if (s.length() > 1) {
                    substring = s.substring(0, s.length() - 1);
                    kotlin.jvm.internal.k0.o(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                }
            }
            String c3 = substring;
            if (length != substring.length()) {
                c3 = kotlin.jvm.internal.k0.C(substring, "..");
            }
            if (n4 > 0.0f) {
                final float n5 = n4 + this.P;
                this.L.setColor(color);
                final Paint l = this.L;
                final String j = this.J;
                l.getTextBounds(j, 0, j.length(), this.j0);
                final String i = this.J;
                canvas.drawText(i, 0, i.length(), n5 + n3, n2, this.L);
                n4 = n5 + (this.j0.width() + this.P);
            }
            this.L.getTextBounds(c3, 0, c3.length(), this.j0);
            if (this.x0 && periodElementModel2.getBackGround() != 0 && !periodModel.getCancelled()) {
                this.L.setColor(periodElementModel2.getBackGround());
                final float n6 = n3 + n4;
                final float p5 = this.P;
                final float n7 = (float)height;
                final float n8 = (float)this.j0.width();
                final float p6 = this.P;
                canvas.drawRect(n6 - p5, n2 - n7 - p5, n6 + n8 + p6, n2 + p6, this.L);
            }
            final Paint m = this.L;
            int textColor;
            if (this.x0 && periodElementModel2.getTextColor() != 0 && !periodModel.getCancelled()) {
                textColor = periodElementModel2.getTextColor();
            }
            else {
                textColor = color;
            }
            m.setColor(textColor);
            this.L.setStrikeThruText(periodModel.getCancelled() || periodElementModel2.getCurrentId() < 1L);
            canvas.drawText(c3, 0, c3.length(), n4 + n3, n2, this.L);
            this.L.setStrikeThruText(false);
            n4 += this.j0.width();
        }
    }
    
    private final void o(final Canvas canvas, final PeriodModel periodModel, final RectF rectF, final float n, final int n2, final int n3, final boolean b) {
        final boolean b2 = rectF.height() > rectF.width();
        final boolean b3 = b2 ^ true;
        if (b2 && rectF.height() >= n2 * n) {
            this.l(canvas, periodModel, rectF, n, n2, n3, b);
            return;
        }
        if (!b2 || rectF.height() < n) {
            if (b3 && rectF.height() > n2 * n) {
                this.l(canvas, periodModel, rectF, n, n2, n3, b);
                return;
            }
            if (!b3 || rectF.height() < n) {
                if (rectF.height() < n) {
                    this.s(canvas, rectF, n3);
                }
                return;
            }
            if (!b) {
                this.k(canvas, periodModel, rectF, n, n2, n3, b);
                return;
            }
        }
        this.m(canvas, periodModel, rectF, n, n3, b);
    }
    
    private final void p(final Canvas canvas, final float n, final float n2, final Drawable drawable, final int color, final boolean b, final boolean b2) {
        this.L.setColor(-1);
        if (b2) {
            canvas.drawCircle(n, n2, this.R, this.L);
        }
        this.L.setColor(color);
        if (b2) {
            canvas.drawCircle(n, n2, this.R - this.Q, this.L);
        }
        final float r = this.R;
        float q;
        if (b) {
            q = this.Q;
        }
        else {
            q = 0.0f;
        }
        final float n3 = r - q;
        drawable.setBounds((int)(n - n3), (int)(n2 - n3), (int)(n + n3), (int)(n2 + n3));
        drawable.draw(canvas);
    }
    
    static /* synthetic */ void q(final c c, final Canvas canvas, final float n, final float n2, final Drawable drawable, final int n3, boolean b, boolean b2, final int n4, final Object o) {
        if ((n4 & 0x20) != 0x0) {
            b = true;
        }
        if ((n4 & 0x40) != 0x0) {
            b2 = true;
        }
        c.p(canvas, n, n2, drawable, n3, b, b2);
    }
    
    private final RectF r(final Canvas canvas, final PeriodModel periodModel, final boolean b) {
        final float g = this.g(b, (float)periodModel.getTotalX());
        float n = periodModel.getStartX() / g;
        float n2 = (periodModel.getStartX() + periodModel.getWidthX()) / g;
        if (b) {
            n = periodModel.getHideStartX() / g;
            n2 = (periodModel.getHideStartX() + periodModel.getHideWidthX()) / g;
        }
        float n3 = n2;
        if (n2 > 1.0f) {
            n3 = n2;
            if (n < 1.0f) {
                n3 = 1.0f;
            }
        }
        final float n4 = n * canvas.getWidth() + this.N;
        final float n5 = n3 * canvas.getWidth() - this.P;
        final float n6 = this.G.m1(periodModel.getStartMinute()) + this.P;
        final float n7 = this.G.m1(periodModel.getEndMinute()) - this.P;
        final Map<RectF, PeriodModel> k = this.K;
        final float n8 = this.N;
        final float p3 = this.P;
        k.put(new RectF(n4 - n8, n6 - p3, n5 + p3, p3 + n7), periodModel);
        final float p4 = this.P;
        final RectF rectF = new RectF(n4 - p4, n6 - p4, n5, n7);
        final Paint l = this.L;
        int color;
        if (this.r0 && periodModel.getBackColorCustom() != 0) {
            color = periodModel.getBackColorCustom();
        }
        else if (this.r0 && periodModel.getBackColorSubject() != 0) {
            color = periodModel.getBackColorSubject();
        }
        else {
            color = periodModel.getBackColor();
        }
        l.setColor(color);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            final float n9 = this.N;
            canvas.drawRoundRect(rectF, n9, n9, this.L);
        }
        else {
            canvas.drawRect(rectF, this.L);
        }
        Label_0628: {
            if ((this.s0 || this.r0) && periodModel.getCancelled()) {
                this.L.setStrokeWidth(this.P);
                this.L.setColor(this.U);
                canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.L);
                this.L.setStyle(Paint$Style.STROKE);
                if (sdk_INT >= 21) {
                    final float n10 = this.N;
                    canvas.drawRoundRect(rectF, n10, n10, this.L);
                }
                else {
                    canvas.drawRect(rectF, this.L);
                }
            }
            else {
                if (!this.r0 || !periodModel.getExam()) {
                    break Label_0628;
                }
                this.L.setStrokeWidth(this.N);
                this.L.setStyle(Paint$Style.STROKE);
                this.L.setColor(this.W);
                final float left = rectF.left;
                final float q = this.Q;
                final RectF rectF2 = new RectF(left + q, rectF.top + q, rectF.right - q, rectF.bottom - q);
                if (sdk_INT >= 21) {
                    final float n11 = this.N;
                    canvas.drawRoundRect(rectF2, n11, n11, this.L);
                }
                else {
                    canvas.drawRect(rectF2, this.L);
                }
            }
            this.L.setStyle(Paint$Style.FILL_AND_STROKE);
            this.L.setStrokeWidth(this.k0);
        }
        final float left2 = rectF.left;
        final float o = this.O;
        rectF.set(left2 + o, rectF.top + o, rectF.right - this.P, rectF.bottom - o);
        return rectF;
    }
    
    private final void s(final Canvas canvas, final RectF rectF, final int color) {
        this.L.setColor(color);
        this.L.getTextBounds("..", 0, 2, this.j0);
        canvas.drawText("..", 0, 2, rectF.centerX() - this.j0.width() * 0.5f, rectF.bottom, this.L);
    }
    
    private final void t(final Canvas canvas, final float n, final float n2, final String s, final int color) {
        this.L.getTextBounds(s, 0, s.length(), this.j0);
        this.L.setColor(color);
        canvas.drawText(s, n - this.j0.centerX(), n2, this.L);
    }
    
    private final void u(final Canvas canvas, final PeriodModel periodModel) {
        q(this, canvas, canvas.getWidth() - this.R - this.O, this.G.m1(periodModel.getEndMinute()) - this.R - this.O, this.e0, d.f(this.getContext(), 2131099677), false, false, 96, null);
    }
    
    private final void v(final Canvas canvas, final PeriodModel periodModel, final RectF rectF, final int n) {
        if (periodModel.isOnlinePeriod()) {
            final float left = rectF.left;
            final float r = this.R;
            this.p(canvas, left + r + this.P, rectF.bottom - r - this.Q, this.f0, this.h0, true, true);
        }
    }
    
    private final boolean x(final boolean b, final float n, final float n2) {
        float n3;
        if (b) {
            n3 = n2;
        }
        else {
            n3 = 0.0f;
        }
        return n > n2 + n3;
    }
    
    private final boolean y(final boolean b, final boolean b2, final float n, final float n2) {
        float n3;
        if (b) {
            n3 = n2;
        }
        else {
            n3 = 0.0f;
        }
        float n4;
        if (b2) {
            n4 = n2;
        }
        else {
            n4 = 0.0f;
        }
        return n > n3 + n2 + n4;
    }
    
    private final boolean z(final float n, final float n2) {
        return n > n2;
    }
    
    public void a() {
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((org.koin.core.c)this);
    }
    
    @f
    public final TimeTableModel getTimeTableModel() {
        return this.A0;
    }
    
    protected void onDraw(@f final Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            this.i(canvas);
        }
    }
    
    protected void onMeasure(final int p2, final int n) {
        super.onMeasure(p2, n);
        if (this.p0 != p2) {
            this.l0.clear();
            this.m0.clear();
            this.n0.clear();
            this.o0.clear();
            this.p0 = p2;
        }
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public boolean onTouchEvent(@f final MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            final int n = (int)motionEvent.getAxisValue(1);
            final int n2 = (int)motionEvent.getAxisValue(0);
            for (final RectF rectF : this.K.keySet()) {
                final PeriodModel periodModel = this.K.get(rectF);
                if (periodModel == null) {
                    continue;
                }
                if (rectF.contains((float)n2, (float)n)) {
                    this.A(periodModel);
                    return true;
                }
            }
        }
        else if (motionEvent.getAction() == 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final void setTimeTableModel(@f final TimeTableModel a0) {
        this.A0 = a0;
    }
    
    public final void w(@e final Profile profile, @f final TimeTableModel a0) {
        kotlin.jvm.internal.k0.p(profile, "profile");
        this.A0 = a0;
        final com.untis.mobile.utils.a a2 = com.untis.mobile.utils.a.a(this.getContext());
        final DefaultColors g = a2.g(this.H);
        kotlin.jvm.internal.k0.o(g, "appSettings.getColors(profileId)");
        this.q0 = g;
        this.r0 = a2.I1(profile);
        this.s0 = a2.i1(profile);
        this.t0 = a2.j1();
        this.W = a2.g(this.H).getExam().backColor;
        this.u0 = a2.B1(profile);
        this.v0 = a2.r1();
        this.w0 = a2.q1();
        this.x0 = a2.p1(profile);
        this.postInvalidate();
    }
}
