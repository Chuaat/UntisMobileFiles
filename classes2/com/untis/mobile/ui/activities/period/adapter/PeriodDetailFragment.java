// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.period.adapter;

import androidx.appcompat.widget.AppCompatEditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.app.Dialog;
import androidx.activity.ComponentActivity;
import android.os.Parcelable;
import android.graphics.PorterDuff$Mode;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import com.untis.mobile.utils.u0;
import android.widget.AdapterView;
import android.widget.ProgressBar;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.untis.mobile.ui.activities.booking.ChangeRoomActivity;
import android.util.Log;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.j2;
import kotlinx.coroutines.r0;
import java.util.Iterator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import com.untis.mobile.ui.activities.help.HelpActivity;
import java.util.ArrayList;
import androidx.appcompat.widget.AppCompatImageButton;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import org.apmem.tools.layouts.FlowLayout;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.LinearLayout;
import java.util.Set;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.untis.mobile.utils.extension.h;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.untis.mobile.ui.activities.period.PeriodDetailCustomNotificationActivity;
import com.untis.mobile.ui.activities.classbook.homeworks.HomeWorksActivity;
import com.untis.mobile.ui.activities.classbook.homeworks.HomeWorkDetailActivity;
import com.untis.mobile.utils.a0;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import android.annotation.SuppressLint;
import com.untis.mobile.ui.activities.classbook.ClassbookActivity;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.app.d$a;
import kotlin.n1;
import kotlin.s0;
import com.untis.mobile.utils.g0;
import com.untis.mobile.ui.activities.drive.DriveAttachmentListActivity;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.List;
import android.widget.CompoundButton;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import org.joda.time.n0;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import android.content.Context;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import android.view.View$OnClickListener;
import com.untis.mobile.persistence.models.Displayable;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.text.s;
import org.joda.time.c;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.DisplayableEntity;
import android.content.Intent;
import androidx.fragment.app.d;
import android.content.DialogInterface;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import com.untis.mobile.systemNotifications.b;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.untis.mobile.services.classbook.a;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.persistence.models.DefaultColors;
import android.graphics.drawable.Drawable;
import com.untis.mobile.ui.activities.period.t;
import android.view.View;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00ea\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0002®\u0001B\t¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0003J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\n\u0010!\u001a\u0004\u0018\u00010 H\u0002J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\tH\u0002J\b\u0010%\u001a\u00020\tH\u0002J\b\u0010&\u001a\u00020\tH\u0002J\b\u0010'\u001a\u00020\tH\u0002J\u001c\u0010,\u001a\u00020+2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020(H\u0002J\b\u0010/\u001a\u00020+H\u0002J\u0010\u00102\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0002J\u0010\u00103\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0002J\u0016\u00107\u001a\u00020\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\b\u00108\u001a\u00020\u0004H\u0002J\b\u00109\u001a\u00020\u0004H\u0003J\b\u0010:\u001a\u00020\u0004H\u0003J\u0014\u0010;\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010?\u001a\u00020\u0004H\u0002J\b\u0010@\u001a\u00020\u0004H\u0003J\u0012\u0010C\u001a\u00020\u00042\b\u0010B\u001a\u0004\u0018\u00010AH\u0016J&\u0010H\u001a\u0004\u0018\u00010\u00062\u0006\u0010E\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016J\u0012\u0010J\u001a\u00020\u00042\b\u0010I\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020AH\u0016J\u0006\u0010M\u001a\u00020\u0004J\u0018\u0010P\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u00122\b\b\u0002\u0010O\u001a\u00020\tR\u0016\u0010S\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010WR\u0016\u0010Z\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010UR\u0016\u0010d\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010YR\u0016\u0010h\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010l\u001a\u00020i8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010YR\u0016\u0010r\u001a\u00020o8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bp\u0010qR\u001d\u0010x\u001a\u00020s8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0016\u0010|\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010YR&\u0010=\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010YR\u0018\u0010\u0087\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010UR\u001a\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0091\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010RR\u0018\u0010\u0093\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010RR\u0019\u0010\u0096\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001a\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010 \u0001\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010YR\u0018\u0010¢\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¡\u0001\u0010UR\u0017\u0010£\u0001\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010YR\u0018\u0010¥\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010UR!\u0010©\u0001\u001a\u00030¦\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b&\u0010u\u001a\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010«\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010R¨\u0006¯\u0001" }, d2 = { "Lcom/untis/mobile/ui/activities/period/adapter/PeriodDetailFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/content/Context;", "context", "Lkotlin/j2;", "M0", "Landroid/view/View;", "view", "c0", "", "hide", "m1", "t1", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "", "B0", "K0", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "z0", "local", "a1", "s1", "v1", "k1", "Lcom/untis/mobile/systemNotifications/a;", "notification", "", "D0", "A0", "Z0", "Landroid/graphics/drawable/Drawable;", "y0", "text", "q1", "O0", "P0", "k0", "L0", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "current", "original", "Landroid/widget/TextView;", "H0", "entity", "C0", "F0", "Lcom/untis/mobile/persistence/models/Displayable;", "displayable", "N0", "T0", "", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "driveAttachments", "Q0", "Y0", "u0", "l0", "W0", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "x1", "i1", "R0", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "savedInstanceState", "onActivityCreated", "outState", "onSaveInstanceState", "l1", "homeWork", "delete", "o1", "Q", "Z", "showSubjectLongName", "U", "I", "colorLocal", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "a0", "Landroid/graphics/drawable/Drawable;", "drawableEmpty", "e0", "drawableClassbook", "Lcom/untis/mobile/ui/activities/period/t;", "O", "Lcom/untis/mobile/ui/activities/period/t;", "periodDetailMethod", "S", "colorDefaultIcon", "b0", "drawableLessontopicOpen", "Lcom/untis/mobile/services/classbook/a;", "h0", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "J", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "periodInfo", "d0", "drawableHomework", "Lcom/untis/mobile/services/masterdata/a;", "i0", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/systemNotifications/b;", "j0", "Lkotlin/b0;", "G0", "()Lcom/untis/mobile/systemNotifications/b;", "systemNotificationService", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "K", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "lessonTopic", "drawableLessontopicDone", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "E0", "()Lcom/untis/mobile/persistence/models/timetable/period/Period;", "j1", "(Lcom/untis/mobile/persistence/models/timetable/period/Period;)V", "X", "drawableEntityLink", "V", "colorDisabledIcon", "Lcom/untis/mobile/persistence/models/DefaultColors;", "f0", "Lcom/untis/mobile/persistence/models/DefaultColors;", "colors", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "R", "premium", "P", "showTeacherLongName", "M", "Landroid/view/View;", "rootView", "Lcom/untis/mobile/services/timetable/placeholder/k;", "g0", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "L", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Y", "drawableCheck", "T", "colorHomeWorkCompleted", "drawableNotDone", "W", "colorText", "Lcom/untis/mobile/analytics/base/b;", "x0", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "N", "currentPeriod", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodDetailFragment extends UmFragment
{
    @e
    public static final a l0;
    @e
    private static final String m0 = "trick";
    @e
    private static final String n0 = "track";
    @e
    private static final String o0 = "truck";
    @e
    private static final String p0 = "trock";
    @e
    private static final String q0 = "treck";
    private Profile G;
    public Period H;
    private Classbook I;
    private PeriodInfo J;
    private LessonTopic K;
    private TimeTableEntity L;
    private View M;
    private boolean N;
    private t O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private Drawable X;
    private Drawable Y;
    private Drawable Z;
    private Drawable a0;
    private Drawable b0;
    private Drawable c0;
    private Drawable d0;
    private Drawable e0;
    private DefaultColors f0;
    private k g0;
    private com.untis.mobile.services.classbook.a h0;
    private com.untis.mobile.services.masterdata.a i0;
    @e
    private final b0 j0;
    @e
    private final b0 k0;
    
    static {
        l0 = new a(null);
    }
    
    public PeriodDetailFragment() {
        this.W = -12303292;
        this.j0 = kotlin.d0.c((n6.a<?>)new n6.a<com.untis.mobile.systemNotifications.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.systemNotifications.b invoke() {
                return (com.untis.mobile.systemNotifications.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.systemNotifications.b.class), null, null);
            }
        });
        this.k0 = kotlin.d0.c((n6.a<?>)new n6.a<com.untis.mobile.analytics.base.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.analytics.base.b invoke() {
                return (com.untis.mobile.analytics.base.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.analytics.base.b.class), null, null);
            }
        });
    }
    
    private final String A0(final HomeWork homeWork) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getString(2131886294));
        sb.append(' ');
        sb.append((Object)((org.joda.time.base.a)homeWork.getEnd()).g4("E dd.MM."));
        return sb.toString();
    }
    
    private final int B0(final Classbook classbook, final boolean b) {
        if (classbook.getHomeWorks().isEmpty() ^ true) {
            return 0;
        }
        if (!b) {
            return 0;
        }
        return 8;
    }
    
    private final String C0(final DisplayableEntity displayableEntity) {
        if (displayableEntity.entityType() == EntityType.SUBJECT && this.Q) {
            return displayableEntity.getDisplayableDescription();
        }
        if (displayableEntity.entityType() == EntityType.TEACHER && this.P) {
            return displayableEntity.getDisplayableDescription();
        }
        return displayableEntity.getDisplayableTitle();
    }
    
    private final String D0(final com.untis.mobile.systemNotifications.a a) {
        if (a.s()) {
            final String string = this.getString(2131886584);
            kotlin.jvm.internal.k0.o(string, "getString(R.string.reminder_sendState_text)");
            return string;
        }
        final String string2 = this.getString(2131886568);
        kotlin.jvm.internal.k0.o(string2, "getString(R.string.reminder_atX_text)");
        final String g4 = ((org.joda.time.base.a)new c(a.n())).g4("E, H:mm, dd.MM.yyyy");
        kotlin.jvm.internal.k0.o(g4, "DateTime(notification.target).toString(Constant.Time.DISPLAY_PATTERN_DATE_TIME_WITH_WEEKDAY)");
        return s.k2(string2, "{0}", g4, false, 4, (Object)null);
    }
    
    private final TextView F0() {
        final TextView textView = new TextView(this.getContext(), (AttributeSet)null, 2131952239);
        textView.setTextColor(this.W);
        textView.setText((CharSequence)", ");
        return textView;
    }
    
    private final com.untis.mobile.systemNotifications.b G0() {
        return this.j0.getValue();
    }
    
    private final TextView H0(final DisplayableEntity displayableEntity, final DisplayableEntity displayableEntity2) {
        final AppCompatTextView appCompatTextView = new AppCompatTextView(this.requireContext(), (AttributeSet)null, 2131952239);
        ((TextView)appCompatTextView).setTextColor(this.W);
        String text;
        if (displayableEntity == null && displayableEntity2 != null) {
            text = this.C0(displayableEntity2);
        }
        else if ((displayableEntity == null || displayableEntity2 != null) && (displayableEntity == null || displayableEntity2 == null || displayableEntity.entityId() != displayableEntity2.entityId())) {
            if (displayableEntity != null && displayableEntity2 != null && displayableEntity.entityId() != displayableEntity2.entityId()) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.C0(displayableEntity));
                sb.append(" (");
                sb.append(this.C0(displayableEntity2));
                sb.append(')');
                text = sb.toString();
            }
            else {
                text = "";
            }
        }
        else {
            text = this.C0(displayableEntity);
        }
        ((TextView)appCompatTextView).setText((CharSequence)text);
        Label_0417: {
            DefaultColors.DefaultColor defaultColor;
            if (displayableEntity != null && displayableEntity2 != null && displayableEntity.entityId() != displayableEntity2.entityId()) {
                final DefaultColors f0 = this.f0;
                if (f0 == null) {
                    kotlin.jvm.internal.k0.S("colors");
                    throw null;
                }
                ((TextView)appCompatTextView).setTextColor(f0.getElementChanged().foreColor);
                final DefaultColors f2 = this.f0;
                if (f2 == null) {
                    kotlin.jvm.internal.k0.S("colors");
                    throw null;
                }
                defaultColor = f2.getElementChanged();
            }
            else if (displayableEntity2 == null) {
                final DefaultColors f3 = this.f0;
                if (f3 == null) {
                    kotlin.jvm.internal.k0.S("colors");
                    throw null;
                }
                ((TextView)appCompatTextView).setTextColor(f3.getSubstitution().foreColor);
                final DefaultColors f4 = this.f0;
                if (f4 == null) {
                    kotlin.jvm.internal.k0.S("colors");
                    throw null;
                }
                defaultColor = f4.getSubstitution();
            }
            else {
                if (displayableEntity != null) {
                    break Label_0417;
                }
                final DefaultColors f5 = this.f0;
                if (f5 == null) {
                    kotlin.jvm.internal.k0.S("colors");
                    throw null;
                }
                ((TextView)appCompatTextView).setTextColor(f5.getCancelled().foreColor);
                final DefaultColors f6 = this.f0;
                if (f6 != null) {
                    ((TextView)appCompatTextView).setBackgroundColor(f6.getCancelled().backColor);
                    ((TextView)appCompatTextView).setPaintFlags(((TextView)appCompatTextView).getPaintFlags() | 0x10);
                    break Label_0417;
                }
                kotlin.jvm.internal.k0.S("colors");
                throw null;
            }
            ((TextView)appCompatTextView).setBackgroundColor(defaultColor.backColor);
        }
        if (displayableEntity != null && this.N0(displayableEntity)) {
            final Drawable x = this.X;
            if (x == null) {
                kotlin.jvm.internal.k0.S("drawableEntityLink");
                throw null;
            }
            appCompatTextView.setCompoundDrawables((Drawable)null, (Drawable)null, x, (Drawable)null);
            ((TextView)appCompatTextView).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.period.adapter.k(this, displayableEntity));
        }
        else if (displayableEntity == null && displayableEntity2 != null && this.N0(displayableEntity2)) {
            final Drawable x2 = this.X;
            if (x2 == null) {
                kotlin.jvm.internal.k0.S("drawableEntityLink");
                throw null;
            }
            appCompatTextView.setCompoundDrawables((Drawable)null, (Drawable)null, x2, (Drawable)null);
            ((TextView)appCompatTextView).setOnClickListener((View$OnClickListener)new l(this, displayableEntity2));
        }
        if (this.E0().getStates().contains(PeriodState.CANCELLED)) {
            ((TextView)appCompatTextView).setPaintFlags(((TextView)appCompatTextView).getPaintFlags() | 0x10);
        }
        return (TextView)appCompatTextView;
    }
    
    private static final void I0(final PeriodDetailFragment periodDetailFragment, final DisplayableEntity displayableEntity, final View view) {
        k0.p(periodDetailFragment, "this$0");
        periodDetailFragment.T0(displayableEntity);
    }
    
    private static final void J0(final PeriodDetailFragment periodDetailFragment, final DisplayableEntity displayableEntity, final View view) {
        k0.p(periodDetailFragment, "this$0");
        periodDetailFragment.T0(displayableEntity);
    }
    
    private final boolean K0() {
        final boolean contains = this.E0().getRights().contains(PeriodRight.ACTION_CHANGE_ROOM);
        boolean b = true;
        if (!contains) {
            final com.untis.mobile.services.masterdata.a i0 = this.i0;
            if (i0 == null) {
                kotlin.jvm.internal.k0.S("masterDataService");
                throw null;
            }
            if (!(i0.m(true).isEmpty() ^ true)) {
                return false;
            }
        }
        if (!this.E0().getStates().contains(PeriodState.BREAK_SUPERVISION)) {
            return b;
        }
        b = false;
        return b;
    }
    
    private final boolean L0() {
        final Context context = this.getContext();
        boolean b = false;
        Object activity = context;
        if (context == null && (activity = this.getActivity()) == null) {
            return false;
        }
        if (!this.E0().getRights().contains(PeriodRight.WRITE_HOMEWORK)) {
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)activity);
            final Profile g = this.G;
            if (g == null) {
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
            if (!a.J(g)) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    private final void M0(final Context context) {
        this.W = androidx.core.content.d.f(context, 2131100016);
        this.S = androidx.core.content.d.f(context, 2131099992);
        this.T = androidx.core.content.d.f(context, 2131099989);
        this.U = androidx.core.content.d.f(context, 2131099677);
        this.V = androidx.core.content.d.f(context, 2131099680);
        final Drawable i = androidx.core.content.d.i(context, 2131230913);
        kotlin.jvm.internal.k0.m(i);
        final Drawable mutate = i.mutate();
        kotlin.jvm.internal.k0.o(mutate, "getDrawable(context, R.drawable.ic_link_18)!!.mutate()");
        this.X = mutate;
        final Drawable j = androidx.core.content.d.i(context, 2131230873);
        kotlin.jvm.internal.k0.m(j);
        final Drawable mutate2 = j.mutate();
        kotlin.jvm.internal.k0.o(mutate2, "getDrawable(context, R.drawable.ic_check_24)!!.mutate()");
        this.Y = mutate2;
        final Drawable k = androidx.core.content.d.i(context, 2131230907);
        kotlin.jvm.internal.k0.m(k);
        final Drawable mutate3 = k.mutate();
        kotlin.jvm.internal.k0.o(mutate3, "getDrawable(context, R.drawable.ic_info_outline_18)!!.mutate()");
        this.Z = mutate3;
        final Drawable l = androidx.core.content.d.i(context, 2131230924);
        kotlin.jvm.internal.k0.m(l);
        final Drawable mutate4 = l.mutate();
        kotlin.jvm.internal.k0.o(mutate4, "getDrawable(context, R.drawable.ic_not_interested_white_18dp)!!.mutate()");
        this.a0 = mutate4;
        final Drawable m = androidx.core.content.d.i(context, 2131230889);
        kotlin.jvm.internal.k0.m(m);
        final Drawable mutate5 = m.mutate();
        kotlin.jvm.internal.k0.o(mutate5, "getDrawable(context, R.drawable.ic_file_24)!!.mutate()");
        this.b0 = mutate5;
        final Drawable i2 = androidx.core.content.d.i(context, 2131230890);
        kotlin.jvm.internal.k0.m(i2);
        final Drawable mutate6 = i2.mutate();
        kotlin.jvm.internal.k0.o(mutate6, "getDrawable(context, R.drawable.ic_file_document_white_24dp)!!.mutate()");
        this.c0 = mutate6;
        final Drawable i3 = androidx.core.content.d.i(context, 2131230898);
        kotlin.jvm.internal.k0.m(i3);
        final Drawable mutate7 = i3.mutate();
        kotlin.jvm.internal.k0.o(mutate7, "getDrawable(context, R.drawable.ic_home_24)!!.mutate()");
        this.d0 = mutate7;
        final Drawable i4 = androidx.core.content.d.i(context, 2131230870);
        kotlin.jvm.internal.k0.m(i4);
        final Drawable mutate8 = i4.mutate();
        kotlin.jvm.internal.k0.o(mutate8, "getDrawable(context, R.drawable.ic_book_24)!!.mutate()");
        this.e0 = mutate8;
    }
    
    private final boolean N0(final Displayable displayable) {
        final org.joda.time.t b = com.untis.mobile.utils.time.a.b();
        final org.joda.time.t t = new org.joda.time.t(0L);
        final boolean b2 = displayable instanceof Klasse;
        final boolean b3 = false;
        if (b2) {
            final Klasse klasse = (Klasse)displayable;
            boolean b4 = b3;
            if (!klasse.getActive()) {
                return b4;
            }
            b4 = b3;
            if (!klasse.getDisplayable()) {
                return b4;
            }
            if (!kotlin.jvm.internal.k0.g(klasse.getStart(), t)) {
                b4 = b3;
                if (!((org.joda.time.base.e)klasse.getStart().O(1)).o((n0)b)) {
                    return b4;
                }
            }
            if (!kotlin.jvm.internal.k0.g(klasse.getEnd(), t)) {
                b4 = b3;
                if (!((org.joda.time.base.e)klasse.getEnd()).m((n0)b)) {
                    return b4;
                }
            }
        }
        else if (displayable instanceof Teacher) {
            final Teacher teacher = (Teacher)displayable;
            boolean b4 = b3;
            if (!teacher.getActive()) {
                return b4;
            }
            b4 = b3;
            if (!teacher.getDisplayable()) {
                return b4;
            }
            if (!kotlin.jvm.internal.k0.g(teacher.getStart(), t)) {
                b4 = b3;
                if (!((org.joda.time.base.e)teacher.getStart().O(1)).o((n0)b)) {
                    return b4;
                }
            }
            if (!kotlin.jvm.internal.k0.g(teacher.getEnd(), t)) {
                b4 = b3;
                if (!((org.joda.time.base.e)teacher.getEnd()).m((n0)b)) {
                    return b4;
                }
            }
        }
        else if (displayable instanceof Room) {
            final Room room = (Room)displayable;
            boolean b4 = b3;
            if (!room.getActive()) {
                return b4;
            }
            b4 = b3;
            if (!room.getDisplayable()) {
                return b4;
            }
        }
        else {
            boolean b4 = b3;
            if (!(displayable instanceof Subject)) {
                return b4;
            }
            final Subject subject = (Subject)displayable;
            b4 = b3;
            if (!subject.getActive()) {
                return b4;
            }
            b4 = b3;
            if (!subject.getDisplayable()) {
                return b4;
            }
        }
        return true;
    }
    
    private final boolean O0() {
        return this.E0().getRights().contains(PeriodRight.READ_LESSONTOPIC);
    }
    
    private final boolean P0() {
        return this.E0().getRights().contains(PeriodRight.WRITE_LESSONTOPIC);
    }
    
    private final void Q0(final List<DriveAttachment> list) {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        DriveAttachmentListActivity.s((Context)activity, list);
    }
    
    @SuppressLint({ "InflateParams" })
    private final void R0() {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        if (com.untis.mobile.utils.g0.a(this.getContext())) {
            this.x0().c(com.untis.mobile.analytics.base.c.e.M);
        }
        else {
            this.x0().d(com.untis.mobile.analytics.base.c.e.M, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
        }
        final Classbook i = this.I;
        if (i == null) {
            kotlin.jvm.internal.k0.S("classbook");
            throw null;
        }
        if (i.getStudents().isEmpty()) {
            new d$a((Context)activity, 2131951624).M(this.getLayoutInflater().inflate(2131493046, (ViewGroup)null, false)).B(2131886660, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.period.adapter.b0.G).O();
            return;
        }
        final ClassbookActivity.a u = ClassbookActivity.U;
        final Profile g = this.G;
        if (g != null) {
            ((ComponentActivity)activity).startActivityForResult(u.a((Context)activity, g.getUniqueId(), this.E0().getId()), 110);
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    private static final void S0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private final void T0(final DisplayableEntity displayableEntity) {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final TimeTableActivity.a l = TimeTableActivity.L;
        final Profile g = this.G;
        if (g != null) {
            final Intent e = l.e((Context)activity, g, new TimeTableEntity(displayableEntity.entityType(), displayableEntity.entityId(), false, 0, 0L, null, 60, null));
            e.setFlags(805339136);
            final androidx.appcompat.app.d a = new d$a((Context)activity).K((CharSequence)displayableEntity.getDisplayableTitle()).m(2131886507).B(2131886508, (DialogInterface$OnClickListener)new x(this, activity, e)).r(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.period.adapter.e0.G).a();
            kotlin.jvm.internal.k0.o(a, "Builder(activity)\n                .setTitle(current.getDisplayableTitle())\n                .setMessage(R.string.periodDetails_show_timetable_alert_message)\n                .setPositiveButton(R.string.periodDetails_show_timetable_alert_positive) { dialog, _ ->\n                    analyticsTracker.logEvent(UntisAnalyticsConstants.CalendarEntryDetailsAnalyticsEvents.TouchShowTimetablePeriodDetails)\n                    activity.startActivity(intent)\n                    activity.finish()\n                    dialog.dismiss()\n                }\n                .setNegativeButton(R.string.shared_alert_cancel_button) { dialog, _ ->\n                    dialog.dismiss()\n                }\n                .create()");
            ((Dialog)a).show();
            com.untis.mobile.utils.a0.a.a(a);
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    private static final void U0(final PeriodDetailFragment periodDetailFragment, final d d, final Intent intent, final DialogInterface dialogInterface, final int n) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(d, "$activity");
        k0.p(intent, "$intent");
        periodDetailFragment.x0().c(com.untis.mobile.analytics.base.c.c.M);
        ((Activity)d).startActivity(intent);
        ((Activity)d).finish();
        dialogInterface.dismiss();
    }
    
    private static final void V0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private final void W0(final HomeWork homeWork) {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        Object context;
        if ((context = this.getContext()) == null) {
            context = activity;
        }
        if (com.untis.mobile.utils.g0.a((Context)context)) {
            this.x0().c(com.untis.mobile.analytics.base.c.e.L);
        }
        else {
            this.x0().d(com.untis.mobile.analytics.base.c.e.L, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
        }
        if (!this.E0().getRights().contains(PeriodRight.READ_HOMEWORK) && !this.E0().getRights().contains(PeriodRight.WRITE_HOMEWORK)) {
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)context);
            final Profile g = this.G;
            if (g == null) {
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
            if (!a.J(g)) {
                return;
            }
        }
        Intent intent;
        if (homeWork != null) {
            final HomeWorkDetailActivity.a p = HomeWorkDetailActivity.P;
            final Profile g2 = this.G;
            if (g2 == null) {
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
            intent = p.d((Context)activity, g2.getUniqueId(), homeWork, true ^ this.x1(this.E0(), homeWork));
        }
        else {
            final Classbook i = this.I;
            if (i == null) {
                kotlin.jvm.internal.k0.S("classbook");
                throw null;
            }
            if (i.getHomeWorks().isEmpty() && this.E0().getRights().contains(PeriodRight.WRITE_HOMEWORK)) {
                final HomeWorkDetailActivity.a p2 = HomeWorkDetailActivity.P;
                final Profile g3 = this.G;
                if (g3 == null) {
                    kotlin.jvm.internal.k0.S("profile");
                    throw null;
                }
                final String uniqueId = g3.getUniqueId();
                final TimeTableEntity l = this.L;
                if (l == null) {
                    kotlin.jvm.internal.k0.S("timeTableEntity");
                    throw null;
                }
                intent = p2.e((Context)activity, uniqueId, l, this.E0());
            }
            else {
                final HomeWorksActivity.a m = HomeWorksActivity.M;
                final Profile g4 = this.G;
                if (g4 == null) {
                    kotlin.jvm.internal.k0.S("profile");
                    throw null;
                }
                intent = m.a((Context)activity, g4.getUniqueId(), this.E0().getId());
            }
        }
        ((ComponentActivity)activity).startActivityForResult(intent, 120);
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a X(final PeriodDetailFragment periodDetailFragment) {
        return periodDetailFragment.h0;
    }
    
    static /* synthetic */ void X0(final PeriodDetailFragment periodDetailFragment, HomeWork homeWork, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            homeWork = null;
        }
        periodDetailFragment.W0(homeWork);
    }
    
    public static final /* synthetic */ Classbook Y(final PeriodDetailFragment periodDetailFragment) {
        return periodDetailFragment.I;
    }
    
    private final void Y0() {
        final boolean contains = this.E0().getRights().contains(PeriodRight.READ_LESSONTOPIC);
        final boolean contains2 = this.E0().getRights().contains(PeriodRight.WRITE_LESSONTOPIC);
        if (!contains) {
            return;
        }
        if (!contains2) {
            final LessonTopic k = this.K;
            if (k == null) {
                kotlin.jvm.internal.k0.S("lessonTopic");
                throw null;
            }
            if (k.getText().length() == 0) {
                final LessonTopic i = this.K;
                if (i == null) {
                    kotlin.jvm.internal.k0.S("lessonTopic");
                    throw null;
                }
                if (i.getAttachments().isEmpty()) {
                    return;
                }
            }
        }
        if (!contains2) {
            this.u0();
            return;
        }
        this.l0();
    }
    
    public static final /* synthetic */ LessonTopic Z(final PeriodDetailFragment periodDetailFragment) {
        return periodDetailFragment.K;
    }
    
    private final void Z0(final com.untis.mobile.systemNotifications.a a) {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final Profile g = this.G;
        if (g == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        final long id = this.E0().getId();
        final long n = ((org.joda.time.base.g)this.E0().getStart()).n();
        final long n2 = ((org.joda.time.base.g)this.E0().getEnd()).n();
        final TimeTableEntity l = this.L;
        if (l == null) {
            kotlin.jvm.internal.k0.S("timeTableEntity");
            throw null;
        }
        final EntityType entityType = l.getEntityType();
        final TimeTableEntity i = this.L;
        if (i != null) {
            ((ComponentActivity)activity).startActivityForResult(PeriodDetailCustomNotificationActivity.H((Context)activity, g, a, id, n, n2, entityType, i.getEntityId()), 1000);
            return;
        }
        kotlin.jvm.internal.k0.S("timeTableEntity");
        throw null;
    }
    
    public static final /* synthetic */ PeriodInfo a0(final PeriodDetailFragment periodDetailFragment) {
        return periodDetailFragment.J;
    }
    
    @SuppressLint({ "InflateParams" })
    private final void a1(final View view, final boolean checked) {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        final int n = 0;
        final View inflate = layoutInflater.inflate(2131493047, (ViewGroup)null, false);
        final Set<PeriodRight> rights = this.E0().getRights();
        final PeriodRight write_PERIODINFO = PeriodRight.WRITE_PERIODINFO;
        if (!rights.contains(write_PERIODINFO) && !checked) {
            return;
        }
        final int ll = com.untis.mobile.c.i.Ll;
        final TextInputEditText textInputEditText = (TextInputEditText)inflate.findViewById(ll);
        TextInputEditText textInputEditText2;
        String text;
        if (checked) {
            ((EditText)textInputEditText).setHint(2131886503);
            ((TextInputLayout)inflate.findViewById(com.untis.mobile.c.i.Ml)).setHint((CharSequence)this.getString(2131886503));
            textInputEditText2 = (TextInputEditText)inflate.findViewById(ll);
            final PeriodInfo j = this.J;
            if (j == null) {
                kotlin.jvm.internal.k0.S("periodInfo");
                throw null;
            }
            text = j.getLocal();
        }
        else {
            ((EditText)textInputEditText).setHint(2131886505);
            ((TextInputLayout)inflate.findViewById(com.untis.mobile.c.i.Ml)).setHint((CharSequence)this.getString(2131886505));
            textInputEditText2 = (TextInputEditText)inflate.findViewById(ll);
            final PeriodInfo i = this.J;
            if (i == null) {
                kotlin.jvm.internal.k0.S("periodInfo");
                throw null;
            }
            text = i.getInfo();
        }
        ((EditText)textInputEditText2).setText((CharSequence)text);
        final TextInputEditText textInputEditText3 = (TextInputEditText)inflate.findViewById(com.untis.mobile.c.i.Ll);
        kotlin.jvm.internal.k0.o(textInputEditText3, "dialogView.dialog_period_info_edit");
        h.D(textInputEditText3, null, 1, null);
        final int kl = com.untis.mobile.c.i.Kl;
        ((SwitchCompat)inflate.findViewById(kl)).setChecked(checked);
        final SwitchCompat switchCompat = (SwitchCompat)inflate.findViewById(kl);
        int visibility;
        if (checked && !this.E0().getRights().contains(write_PERIODINFO)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((CompoundButton)switchCompat).setVisibility(visibility);
        ((CompoundButton)inflate.findViewById(kl)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new com.untis.mobile.ui.activities.period.adapter.s(inflate, this));
        final int jl = com.untis.mobile.c.i.Jl;
        final AppCompatButton appCompatButton = (AppCompatButton)inflate.findViewById(jl);
        final PeriodInfo k = this.J;
        if (k != null) {
            int visibility2 = n;
            if (k.getDriveAttachments().isEmpty()) {
                visibility2 = 8;
            }
            ((Button)appCompatButton).setVisibility(visibility2);
            ((Button)inflate.findViewById(jl)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.period.adapter.e(this));
            final androidx.appcompat.app.d a = new d$a((Context)activity, 2131951624).M(inflate).r(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.period.adapter.c0.G).B(2131886664, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.period.adapter.b(inflate, this, view)).a();
            kotlin.jvm.internal.k0.o(a, "Builder(activity, R.style.AppDialogTheme)\n                .setView(dialogView)\n                .setNegativeButton(R.string.shared_alert_cancel_button) { dialog, _ ->\n                    dialog.dismiss()\n                }\n                .setPositiveButton(R.string.shared_alert_save_button) { dialog, _ ->\n                    val info = dialogView.dialog_period_info_edit.text.toString()\n\n                    if (dialogView.dialog_period_info_action_local.isChecked) {\n                        if (periodInfo.local.isEmpty()) {\n                            analyticsTracker.logEvent(UntisAnalyticsConstants.CalendarEntryDetailsAnalyticsEvents.AddLocalPeriodInfoPeriodDetails)\n                        }\n                        periodInfo.local = info\n\n                        runBlocking {\n                            classBookService.save(periodInfo)\n                            timeTableService.updateModelsWith(periodInfo)\n                        }\n\n                        updatePeriodInfo(view)\n                        updateLocalInfo(view)\n\n                    } else {\n                        periodInfo.info = info\n                        if (Network.isNetworkAvailable(context)) {\n                            analyticsTracker.logEvent(UntisAnalyticsConstants.TimetableAnalyticsEvents.UpdateDetailsOfPeriodPeriodDetails)\n                        } else {\n                            analyticsTracker.logEventWithParams(UntisAnalyticsConstants.TimetableAnalyticsEvents.UpdateDetailsOfPeriodPeriodDetails,\n                            bundleOf(UntisAnalyticsConstants.AnalyticsParams.Offline.value to true))\n                        }\n                        classBookService\n                                .submit(periodInfo)\n                                .subscribe({\n\n                                    dialog.dismiss()\n                                    runBlocking {\n                                        classBookService.save(periodInfo)\n                                        timeTableService.updateModelsWith(periodInfo)\n                                    }\n\n                                    updatePeriodInfo(view)\n                                    updateLocalInfo(view)\n\n                                }, { throwable ->\n                                    Log.e(Constant.LOG, \"error on periodinfo submit\", throwable)\n                                    periodInfo.sync = false\n\n                                    runBlocking {\n                                        classBookService.save(periodInfo)\n                                        timeTableService.updateModelsWith(periodInfo)\n                                    }\n\n                                    updatePeriodInfo(view)\n                                    updateLocalInfo(view)\n\n                                })\n                    }\n                }\n                .create()");
            ((Dialog)a).show();
            com.untis.mobile.utils.a0.a.a(a);
            return;
        }
        kotlin.jvm.internal.k0.S("periodInfo");
        throw null;
    }
    
    public static final /* synthetic */ k b0(final PeriodDetailFragment periodDetailFragment) {
        return periodDetailFragment.g0;
    }
    
    static /* synthetic */ void b1(final PeriodDetailFragment periodDetailFragment, final View view, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        periodDetailFragment.a1(view, b);
    }
    
    @SuppressLint({ "InflateParams" })
    private final void c0(final View view) {
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        final boolean b = this.E0().getStates().contains(PeriodState.BREAK_SUPERVISION) || this.E0().getStates().contains(PeriodState.CANCELLED);
        final com.untis.mobile.services.masterdata.a i0 = this.i0;
        if (i0 == null) {
            kotlin.jvm.internal.k0.S("masterDataService");
            throw null;
        }
        final PeriodElement subject = this.E0().getSubject();
        final long n = 0L;
        long currentId;
        if (subject == null) {
            currentId = 0L;
        }
        else {
            currentId = subject.getCurrentId();
        }
        final Subject u = i0.U(currentId);
        final LinearLayout linearLayout = (LinearLayout)view.findViewById(com.untis.mobile.c.i.Kr);
        int visibility;
        if (this.E0().getSubject() != null) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        linearLayout.setVisibility(visibility);
        final com.untis.mobile.services.masterdata.a i2 = this.i0;
        if (i2 == null) {
            kotlin.jvm.internal.k0.S("masterDataService");
            throw null;
        }
        final PeriodElement subject2 = this.E0().getSubject();
        long currentId2;
        if (subject2 == null) {
            currentId2 = 0L;
        }
        else {
            currentId2 = subject2.getCurrentId();
        }
        final Subject u2 = i2.U(currentId2);
        final com.untis.mobile.services.masterdata.a i3 = this.i0;
        if (i3 == null) {
            kotlin.jvm.internal.k0.S("masterDataService");
            throw null;
        }
        final PeriodElement subject3 = this.E0().getSubject();
        long originalId;
        if (subject3 == null) {
            originalId = n;
        }
        else {
            originalId = subject3.getOriginalId();
        }
        final Subject u3 = i3.U(originalId);
        final int lr = com.untis.mobile.c.i.Lr;
        ((TextView)view.findViewById(lr)).setText(this.H0(u2, u3).getText());
        if (u2 != null && this.N0(u2)) {
            final TextView textView = (TextView)view.findViewById(lr);
            final Drawable x = this.X;
            if (x == null) {
                kotlin.jvm.internal.k0.S("drawableEntityLink");
                throw null;
            }
            textView.setCompoundDrawables((Drawable)null, (Drawable)null, x, (Drawable)null);
            ((TextView)view.findViewById(lr)).setOnClickListener((View$OnClickListener)new p(this, u2));
        }
        final Profile g = this.G;
        if (g == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        final com.untis.mobile.services.timetable.placeholder.h h = new com.untis.mobile.services.timetable.placeholder.h((Context)o, g.getUniqueId());
        final int b2 = com.untis.mobile.services.timetable.placeholder.h.b(h, this.E0(), true, false, false, 12, null);
        final int d = com.untis.mobile.services.timetable.placeholder.h.d(h, this.E0(), true, false, false, 12, null);
        ((TextView)view.findViewById(lr)).setBackgroundColor(b2);
        ((TextView)view.findViewById(lr)).setTextColor(d);
        final int qr = com.untis.mobile.c.i.qr;
        ((ImageView)view.findViewById(qr)).setBackgroundColor(b2);
        ((ImageView)view.findViewById(qr)).setVisibility(0);
        TextView textView2;
        int paintFlags;
        if (u != null && !this.E0().getStates().contains(PeriodState.CANCELLED)) {
            textView2 = (TextView)view.findViewById(lr);
            paintFlags = (((TextView)view.findViewById(lr)).getPaintFlags() & 0xFFFFFFEF);
        }
        else {
            textView2 = (TextView)view.findViewById(lr);
            paintFlags = (((TextView)view.findViewById(lr)).getPaintFlags() | 0x10);
        }
        textView2.setPaintFlags(paintFlags);
        final LinearLayout linearLayout2 = (LinearLayout)view.findViewById(com.untis.mobile.c.i.or);
        int visibility2;
        if (this.E0().getKlassen().isEmpty()) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        linearLayout2.setVisibility(visibility2);
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.pr)).removeAllViews();
        for (final PeriodElement periodElement : this.E0().getKlassen()) {
            final int pr = com.untis.mobile.c.i.pr;
            if (((ViewGroup)view.findViewById(pr)).getChildCount() > 0) {
                ((ViewGroup)view.findViewById(pr)).addView((View)this.F0());
            }
            final FlowLayout flowLayout = (FlowLayout)view.findViewById(pr);
            final com.untis.mobile.services.masterdata.a i4 = this.i0;
            if (i4 == null) {
                kotlin.jvm.internal.k0.S("masterDataService");
                throw null;
            }
            final Klasse n2 = i4.N(periodElement.getCurrentId());
            final com.untis.mobile.services.masterdata.a i5 = this.i0;
            if (i5 == null) {
                kotlin.jvm.internal.k0.S("masterDataService");
                throw null;
            }
            ((ViewGroup)flowLayout).addView((View)this.H0(n2, i5.N(periodElement.getOriginalId())));
        }
        final LinearLayout linearLayout3 = (LinearLayout)view.findViewById(com.untis.mobile.c.i.Mr);
        int visibility3;
        if (this.E0().getTeachers().isEmpty()) {
            visibility3 = 8;
        }
        else {
            visibility3 = 0;
        }
        linearLayout3.setVisibility(visibility3);
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Nr)).removeAllViews();
        for (final PeriodElement periodElement2 : this.E0().getTeachers()) {
            final int nr = com.untis.mobile.c.i.Nr;
            if (((ViewGroup)view.findViewById(nr)).getChildCount() > 0) {
                ((ViewGroup)view.findViewById(nr)).addView((View)this.F0());
            }
            final FlowLayout flowLayout2 = (FlowLayout)view.findViewById(nr);
            final com.untis.mobile.services.masterdata.a i6 = this.i0;
            if (i6 == null) {
                kotlin.jvm.internal.k0.S("masterDataService");
                throw null;
            }
            final Teacher k = i6.k(periodElement2.getCurrentId());
            final com.untis.mobile.services.masterdata.a i7 = this.i0;
            if (i7 == null) {
                kotlin.jvm.internal.k0.S("masterDataService");
                throw null;
            }
            ((ViewGroup)flowLayout2).addView((View)this.H0(k, i7.k(periodElement2.getOriginalId())));
        }
        ((LinearLayout)view.findViewById(com.untis.mobile.c.i.Ir)).setVisibility(0);
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Jr)).removeAllViews();
        for (final PeriodElement periodElement3 : this.E0().getRooms()) {
            final int jr = com.untis.mobile.c.i.Jr;
            if (((ViewGroup)view.findViewById(jr)).getChildCount() > 0) {
                ((ViewGroup)view.findViewById(jr)).addView((View)this.F0());
            }
            final FlowLayout flowLayout3 = (FlowLayout)view.findViewById(jr);
            final com.untis.mobile.services.masterdata.a i8 = this.i0;
            if (i8 == null) {
                kotlin.jvm.internal.k0.S("masterDataService");
                throw null;
            }
            final Room p = i8.P(periodElement3.getCurrentId());
            final com.untis.mobile.services.masterdata.a i9 = this.i0;
            if (i9 == null) {
                kotlin.jvm.internal.k0.S("masterDataService");
                throw null;
            }
            ((ViewGroup)flowLayout3).addView((View)this.H0(p, i9.P(periodElement3.getOriginalId())));
        }
        final int hr = com.untis.mobile.c.i.Hr;
        final AppCompatImageButton appCompatImageButton = (AppCompatImageButton)view.findViewById(hr);
        int visibility4;
        if (this.K0()) {
            visibility4 = 0;
        }
        else {
            visibility4 = 8;
        }
        ((ImageButton)appCompatImageButton).setVisibility(visibility4);
        ((ImageButton)view.findViewById(hr)).setOnClickListener((View$OnClickListener)new g(this));
        final Profile g2 = this.G;
        if (g2 == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        if (g2.isEndOfPremium()) {
            ((ImageView)view.findViewById(com.untis.mobile.c.i.Dr)).setVisibility(8);
        }
        else {
            ((ImageView)view.findViewById(com.untis.mobile.c.i.Dr)).setVisibility(0);
            ((LinearLayout)view.findViewById(com.untis.mobile.c.i.ur)).setOnClickListener((View$OnClickListener)new i(this, view));
        }
        this.s1(view);
        final LinearLayout linearLayout4 = (LinearLayout)view.findViewById(com.untis.mobile.c.i.xr);
        final PeriodInfo j = this.J;
        if (j == null) {
            kotlin.jvm.internal.k0.S("periodInfo");
            throw null;
        }
        int visibility5;
        if (j.getSubstitution().length() == 0) {
            visibility5 = 8;
        }
        else {
            visibility5 = 0;
        }
        linearLayout4.setVisibility(visibility5);
        final TextView textView3 = (TextView)view.findViewById(com.untis.mobile.c.i.yr);
        final PeriodInfo l = this.J;
        if (l == null) {
            kotlin.jvm.internal.k0.S("periodInfo");
            throw null;
        }
        textView3.setText((CharSequence)l.getSubstitution());
        if (this.E0().getRights().contains(PeriodRight.WRITE_PERIODINFO)) {
            ((LinearLayout)view.findViewById(com.untis.mobile.c.i.Ar)).setOnClickListener((View$OnClickListener)new j(this, view));
        }
        this.v1(view);
        final LinearLayout linearLayout5 = (LinearLayout)view.findViewById(com.untis.mobile.c.i.sr);
        final PeriodInfo m = this.J;
        if (m == null) {
            kotlin.jvm.internal.k0.S("periodInfo");
            throw null;
        }
        int visibility6;
        if (m.getLesson().length() == 0) {
            visibility6 = 8;
        }
        else {
            visibility6 = 0;
        }
        linearLayout5.setVisibility(visibility6);
        final TextView textView4 = (TextView)view.findViewById(com.untis.mobile.c.i.tr);
        final PeriodInfo j2 = this.J;
        if (j2 == null) {
            kotlin.jvm.internal.k0.S("periodInfo");
            throw null;
        }
        textView4.setText((CharSequence)j2.getLesson());
        final LinearLayout linearLayout6 = (LinearLayout)view.findViewById(com.untis.mobile.c.i.Fr);
        int visibility7;
        if (this.E0().getStates().contains(PeriodState.OFFICE_HOUR_REGISTRATION)) {
            visibility7 = 0;
        }
        else {
            visibility7 = 8;
        }
        linearLayout6.setVisibility(visibility7);
        final int rr = com.untis.mobile.c.i.rr;
        final LinearLayout linearLayout7 = (LinearLayout)view.findViewById(rr);
        final Classbook i10 = this.I;
        if (i10 == null) {
            kotlin.jvm.internal.k0.S("classbook");
            throw null;
        }
        linearLayout7.setVisibility(this.B0(i10, b));
        ((LinearLayout)view.findViewById(rr)).removeAllViews();
        final Classbook i11 = this.I;
        if (i11 == null) {
            kotlin.jvm.internal.k0.S("classbook");
            throw null;
        }
        final Set<HomeWork> homeWorks = i11.getHomeWorks();
        final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
        for (final HomeWork next : homeWorks) {
            final HomeWork homeWork = next;
            final org.joda.time.t h2 = homeWork.getStart().h1();
            final org.joda.time.t h3 = homeWork.getEnd().h1();
            final org.joda.time.t h4 = this.E0().getStart().h1();
            final org.joda.time.t h5 = this.E0().getEnd().h1();
            boolean b3 = false;
            Label_1776: {
                if (!((org.joda.time.base.e)h3).o((n0)h4)) {
                    if (!((org.joda.time.base.e)h2).m((n0)h5)) {
                        if (!((org.joda.time.base.e)h2).o((n0)h4) || !((org.joda.time.base.e)h3).m((n0)h5)) {
                            b3 = true;
                            break Label_1776;
                        }
                    }
                }
                b3 = false;
            }
            if (b3) {
                list.add(next);
            }
        }
        for (final HomeWork homeWork2 : list) {
            final View inflate = this.getLayoutInflater().inflate(2131493210, (ViewGroup)null, false);
            ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Cy)).setColorFilter(this.z0(homeWork2));
            ((LinearLayout)inflate.findViewById(com.untis.mobile.c.i.By)).setOnClickListener((View$OnClickListener)new n(this, homeWork2));
            ((TextView)inflate.findViewById(com.untis.mobile.c.i.Fy)).setText((CharSequence)homeWork2.getText());
            ((TextView)inflate.findViewById(com.untis.mobile.c.i.Ey)).setText((CharSequence)this.A0(homeWork2));
            final TextView textView5 = (TextView)inflate.findViewById(com.untis.mobile.c.i.Ay);
            int visibility8;
            if (homeWork2.getCompletedStatus()) {
                visibility8 = 0;
            }
            else {
                visibility8 = 8;
            }
            textView5.setVisibility(visibility8);
            final int yy = com.untis.mobile.c.i.yy;
            final AppCompatImageView appCompatImageView = (AppCompatImageView)inflate.findViewById(yy);
            int visibility9;
            if (homeWork2.getDriveAttachments().isEmpty()) {
                visibility9 = 8;
            }
            else {
                visibility9 = 0;
            }
            ((ImageView)appCompatImageView).setVisibility(visibility9);
            ((ImageView)inflate.findViewById(yy)).setOnClickListener((View$OnClickListener)new o(this, homeWork2));
            ((LinearLayout)view.findViewById(com.untis.mobile.c.i.rr)).addView(inflate);
        }
        this.t1(view);
        final LessonTopic k2 = this.K;
        if (k2 == null) {
            kotlin.jvm.internal.k0.S("lessonTopic");
            throw null;
        }
        this.q1(view, k2.getText());
        this.m1(view, b);
        final int mr = com.untis.mobile.c.i.mr;
        final AppCompatButton appCompatButton = (AppCompatButton)view.findViewById(mr);
        final Classbook i12 = this.I;
        if (i12 == null) {
            kotlin.jvm.internal.k0.S("classbook");
            throw null;
        }
        ((Button)appCompatButton).setVisibility(this.B0(i12, b));
        if (!this.L0()) {
            ((Button)view.findViewById(mr)).setBackgroundColor(this.V);
        }
        final AppCompatButton appCompatButton2 = (AppCompatButton)view.findViewById(mr);
        final Drawable d2 = this.d0;
        if (d2 == null) {
            kotlin.jvm.internal.k0.S("drawableHomework");
            throw null;
        }
        ((Button)appCompatButton2).setCompoundDrawablesWithIntrinsicBounds(d2, (Drawable)null, (Drawable)null, (Drawable)null);
        ((Button)view.findViewById(mr)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.period.adapter.c(this));
        final t o2 = this.O;
        if (o2 != null) {
            if (o2 == t.L) {
                final HelpActivity.a i13 = HelpActivity.I;
                final d activity = this.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.untis.mobile.ui.activities.common.UmActivity");
                final com.untis.mobile.ui.activities.common.b b4 = (com.untis.mobile.ui.activities.common.b)activity;
                final ConstraintLayout constraintLayout = (ConstraintLayout)((Activity)this.requireActivity()).findViewById(com.untis.mobile.c.i.W8);
                kotlin.jvm.internal.k0.o(constraintLayout, "requireActivity().activity_period_detail_root");
                i13.s(b4, (View)constraintLayout, this.E0().getRights().contains(PeriodRight.ACTION_CHANGE_ROOM) && !this.E0().getStates().contains(PeriodState.BREAK_SUPERVISION), this.O0() && !b, this.k0() && !b, b ^ true);
            }
            return;
        }
        kotlin.jvm.internal.k0.S("periodDetailMethod");
        throw null;
    }
    
    private static final void c1(final View view, final PeriodDetailFragment periodDetailFragment, final CompoundButton compoundButton, final boolean b) {
        k0.p(periodDetailFragment, "this$0");
        final TextInputEditText textInputEditText = (TextInputEditText)view.findViewById(com.untis.mobile.c.i.Ll);
        int hint;
        if (b) {
            hint = 2131886503;
        }
        else {
            hint = 2131886505;
        }
        ((EditText)textInputEditText).setHint(hint);
        ((TextInputLayout)view.findViewById(com.untis.mobile.c.i.Ml)).setHint((CharSequence)periodDetailFragment.getString(hint));
    }
    
    private static final void d0(final PeriodDetailFragment periodDetailFragment, final Subject subject, final View view) {
        k0.p(periodDetailFragment, "this$0");
        periodDetailFragment.T0(subject);
    }
    
    private static final void d1(final PeriodDetailFragment periodDetailFragment, final View view) {
        k0.p(periodDetailFragment, "this$0");
        final PeriodInfo j = periodDetailFragment.J;
        if (j != null) {
            periodDetailFragment.Q0(j.getDriveAttachments());
            return;
        }
        k0.S("periodInfo");
        throw null;
    }
    
    private static final void e0(final PeriodDetailFragment periodDetailFragment, final HomeWork homeWork, final View view) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(homeWork, "$homework");
        periodDetailFragment.W0(homeWork);
    }
    
    private static final void e1(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void f0(final PeriodDetailFragment periodDetailFragment, final HomeWork homeWork, final View view) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(homeWork, "$homework");
        periodDetailFragment.Q0(homeWork.getDriveAttachments());
    }
    
    private static final void f1(final View view, final PeriodDetailFragment periodDetailFragment, final View view2, final DialogInterface dialogInterface, int n) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(view2, "$view");
        final String value = String.valueOf(((AppCompatEditText)view.findViewById(com.untis.mobile.c.i.Ll)).getText());
        final boolean checked = ((CompoundButton)view.findViewById(com.untis.mobile.c.i.Kl)).isChecked();
        n = 0;
        if (checked) {
            final PeriodInfo j = periodDetailFragment.J;
            if (j == null) {
                k0.S("periodInfo");
                throw null;
            }
            if (j.getLocal().length() == 0) {
                n = 1;
            }
            if (n != 0) {
                periodDetailFragment.x0().c(com.untis.mobile.analytics.base.c.c.J);
            }
            final PeriodInfo i = periodDetailFragment.J;
            if (i == null) {
                k0.S("periodInfo");
                throw null;
            }
            i.setLocal(value);
            kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ PeriodDetailFragment H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ PeriodDetailFragment H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((PeriodDetailFragment$e)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
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
                        final a x = PeriodDetailFragment.X(this.H);
                        if (x == null) {
                            kotlin.jvm.internal.k0.S("classBookService");
                            throw null;
                        }
                        final PeriodInfo a0 = PeriodDetailFragment.a0(this.H);
                        if (a0 == null) {
                            kotlin.jvm.internal.k0.S("periodInfo");
                            throw null;
                        }
                        this.G = 1;
                        if (x.R(a0, this) == h) {
                            return h;
                        }
                    }
                    final k b0 = PeriodDetailFragment.b0(this.H);
                    if (b0 == null) {
                        kotlin.jvm.internal.k0.S("timeTableService");
                        throw null;
                    }
                    final PeriodInfo a2 = PeriodDetailFragment.a0(this.H);
                    if (a2 == null) {
                        kotlin.jvm.internal.k0.S("periodInfo");
                        throw null;
                    }
                    this.G = 2;
                    if (b0.H(a2, this) == h) {
                        return h;
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            periodDetailFragment.v1(view2);
            periodDetailFragment.s1(view2);
        }
        else {
            final PeriodInfo k = periodDetailFragment.J;
            if (k == null) {
                k0.S("periodInfo");
                throw null;
            }
            k.setInfo(value);
            if (g0.a(periodDetailFragment.getContext())) {
                periodDetailFragment.x0().c(com.untis.mobile.analytics.base.c.e.K);
            }
            else {
                periodDetailFragment.x0().d(com.untis.mobile.analytics.base.c.e.K, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
            }
            final com.untis.mobile.services.classbook.a h0 = periodDetailFragment.h0;
            if (h0 == null) {
                k0.S("classBookService");
                throw null;
            }
            final PeriodInfo l = periodDetailFragment.J;
            if (l == null) {
                k0.S("periodInfo");
                throw null;
            }
            h0.p(l).C5((rx.functions.b)new v(dialogInterface, periodDetailFragment, view2), (rx.functions.b)new z(periodDetailFragment, view2));
        }
    }
    
    private static final void g0(final PeriodDetailFragment periodDetailFragment, final View view) {
        k0.p(periodDetailFragment, "this$0");
        X0(periodDetailFragment, null, 1, null);
    }
    
    private static final void g1(final DialogInterface dialogInterface, final PeriodDetailFragment periodDetailFragment, final View view, final PeriodInfo periodInfo) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(view, "$view");
        dialogInterface.dismiss();
        kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ PeriodDetailFragment H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ PeriodDetailFragment H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((PeriodDetailFragment$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
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
                    final a x = PeriodDetailFragment.X(this.H);
                    if (x == null) {
                        kotlin.jvm.internal.k0.S("classBookService");
                        throw null;
                    }
                    final PeriodInfo a0 = PeriodDetailFragment.a0(this.H);
                    if (a0 == null) {
                        kotlin.jvm.internal.k0.S("periodInfo");
                        throw null;
                    }
                    this.G = 1;
                    if (x.R(a0, this) == h) {
                        return h;
                    }
                }
                final k b0 = PeriodDetailFragment.b0(this.H);
                if (b0 == null) {
                    kotlin.jvm.internal.k0.S("timeTableService");
                    throw null;
                }
                final PeriodInfo a2 = PeriodDetailFragment.a0(this.H);
                if (a2 == null) {
                    kotlin.jvm.internal.k0.S("periodInfo");
                    throw null;
                }
                this.G = 2;
                if (b0.H(a2, this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 1, (Object)null);
        periodDetailFragment.v1(view);
        periodDetailFragment.s1(view);
    }
    
    private static final void h0(final PeriodDetailFragment periodDetailFragment, final View view) {
        k0.p(periodDetailFragment, "this$0");
        periodDetailFragment.i1();
    }
    
    private static final void h1(final PeriodDetailFragment periodDetailFragment, final View view, final Throwable t) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(view, "$view");
        Log.e("untis_log", "error on periodinfo submit", t);
        final PeriodInfo j = periodDetailFragment.J;
        if (j != null) {
            j.setSync(false);
            kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ PeriodDetailFragment H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ PeriodDetailFragment H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((PeriodDetailFragment$g)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
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
                        final a x = PeriodDetailFragment.X(this.H);
                        if (x == null) {
                            kotlin.jvm.internal.k0.S("classBookService");
                            throw null;
                        }
                        final PeriodInfo a0 = PeriodDetailFragment.a0(this.H);
                        if (a0 == null) {
                            kotlin.jvm.internal.k0.S("periodInfo");
                            throw null;
                        }
                        this.G = 1;
                        if (x.R(a0, this) == h) {
                            return h;
                        }
                    }
                    final k b0 = PeriodDetailFragment.b0(this.H);
                    if (b0 == null) {
                        kotlin.jvm.internal.k0.S("timeTableService");
                        throw null;
                    }
                    final PeriodInfo a2 = PeriodDetailFragment.a0(this.H);
                    if (a2 == null) {
                        kotlin.jvm.internal.k0.S("periodInfo");
                        throw null;
                    }
                    this.G = 2;
                    if (b0.H(a2, this) == h) {
                        return h;
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            periodDetailFragment.v1(view);
            periodDetailFragment.s1(view);
            return;
        }
        k0.S("periodInfo");
        throw null;
    }
    
    private static final void i0(final PeriodDetailFragment periodDetailFragment, final View view, final View view2) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(view, "$view");
        periodDetailFragment.a1(view, true);
    }
    
    private final void i1() {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        this.getContext();
        final ChangeRoomActivity.a m = ChangeRoomActivity.M;
        final Profile g = this.G;
        if (g != null) {
            ((ComponentActivity)activity).startActivityForResult(m.a((Context)activity, g.getUniqueId(), this.E0().getId()), 300);
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    private static final void j0(final PeriodDetailFragment periodDetailFragment, final View view, final View view2) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(view, "$view");
        b1(periodDetailFragment, view, false, 2, null);
    }
    
    private final boolean k0() {
        return this.E0().getRights().contains(PeriodRight.WRITE_STUD_ABSENCE);
    }
    
    private final boolean k1() {
        if (this.E0().getStates().contains(PeriodState.BREAK_SUPERVISION)) {
            return false;
        }
        final PeriodInfo j = this.J;
        if (j != null) {
            if (j.getInfo().length() == 0) {
                final PeriodInfo i = this.J;
                if (i == null) {
                    kotlin.jvm.internal.k0.S("periodInfo");
                    throw null;
                }
                if (i.getLocal().length() > 0) {
                    return false;
                }
            }
            if (!this.E0().getRights().contains(PeriodRight.READ_PERIODINFO)) {
                final Profile g = this.G;
                if (g == null) {
                    kotlin.jvm.internal.k0.S("profile");
                    throw null;
                }
                if (!g.isAnonymousUser()) {
                    return this.E0().getRights().contains(PeriodRight.WRITE_PERIODINFO);
                }
            }
            final PeriodInfo k = this.J;
            if (k == null) {
                kotlin.jvm.internal.k0.S("periodInfo");
                throw null;
            }
            if (k.getInfo().length() > 0) {
                return true;
            }
            return this.E0().getRights().contains(PeriodRight.WRITE_PERIODINFO);
        }
        kotlin.jvm.internal.k0.S("periodInfo");
        throw null;
    }
    
    @SuppressLint({ "InflateParams" })
    private final void l0() {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        Object context;
        if ((context = this.getContext()) == null) {
            context = activity;
        }
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        int visibility = 0;
        final View inflate = layoutInflater.inflate(2131493042, (ViewGroup)null, false);
        final TextInputEditText textInputEditText = (TextInputEditText)inflate.findViewById(com.untis.mobile.c.i.zl);
        final LessonTopic k = this.K;
        if (k == null) {
            kotlin.jvm.internal.k0.S("lessonTopic");
            throw null;
        }
        ((EditText)textInputEditText).setText((CharSequence)k.getText());
        final com.untis.mobile.services.classbook.a h0 = this.h0;
        if (h0 == null) {
            kotlin.jvm.internal.k0.S("classBookService");
            throw null;
        }
        h0.T(this.E0().getId()).C5((rx.functions.b)new com.untis.mobile.ui.activities.period.adapter.t((Context)context, inflate), (rx.functions.b)new com.untis.mobile.ui.activities.period.adapter.w(inflate));
        final int yl = com.untis.mobile.c.i.yl;
        final AppCompatButton appCompatButton = (AppCompatButton)inflate.findViewById(yl);
        final LessonTopic i = this.K;
        if (i != null) {
            if (i.getAttachments().isEmpty()) {
                visibility = 8;
            }
            ((Button)appCompatButton).setVisibility(visibility);
            ((Button)inflate.findViewById(yl)).setOnClickListener((View$OnClickListener)new f0(this));
            final androidx.appcompat.app.d a = new d$a((Context)activity, 2131951624).M(inflate).r(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.period.adapter.a0.G).B(2131886664, (DialogInterface$OnClickListener)new m(this, inflate, (Context)context)).a();
            kotlin.jvm.internal.k0.o(a, "Builder(activity, R.style.AppDialogTheme)\n                .setView(dialogView)\n                .setNegativeButton(R.string.shared_alert_cancel_button) { dialog, _ ->\n                    dialog.dismiss()\n                }\n                .setPositiveButton(R.string.shared_alert_save_button) { dialog, _ ->\n                    lessonTopic.text = dialogView.dialog_lessontopic_edit.text.toString()\n\n                    updateLessontopic(rootView, dialogView.dialog_lessontopic_edit.text.toString())\n\n                    if (Network.isNetworkAvailable(context)) {\n                        classBookService\n                                .submit(lessonTopic)\n                                .subscribe({\n                                    dialog.dismiss()\n                                }, { throwable ->\n                                    Log.e(Constant.LOG, \"error while submitting lessontopic\", throwable)\n                                    lessonTopic.synced = false\n                                    runBlocking {\n                                        classBookService.save(lessonTopic)\n                                    }\n                                    UntisMobileSnackbar.error(rootView, throwable)\n                                    dialog.dismiss()\n                                })\n                        analyticsTracker.logEvent(UntisAnalyticsConstants.TimetableAnalyticsEvents.UpdateTeachingContentPeriodDetails)\n                    } else {\n                        lessonTopic.synced = false\n                        runBlocking {\n                            classBookService.save(lessonTopic)\n                        }\n                        analyticsTracker.logEventWithParams(UntisAnalyticsConstants.TimetableAnalyticsEvents.UpdateTeachingContentPeriodDetails,\n                                bundleOf(UntisAnalyticsConstants.AnalyticsParams.Offline.value to true))\n                    }\n                }\n                .create()");
            ((Dialog)a).show();
            com.untis.mobile.utils.a0.a.a(a);
            return;
        }
        kotlin.jvm.internal.k0.S("lessonTopic");
        throw null;
    }
    
    private static final void m0(final Context context, final View view, final List list) {
        k0.p(context, "$context");
        k0.o(list, "lessontopics");
        final i0 adapter = new i0(context, list);
        final int cl = com.untis.mobile.c.i.Cl;
        ((ListView)view.findViewById(cl)).setVisibility(0);
        ((ListView)view.findViewById(cl)).setAdapter((ListAdapter)adapter);
        ((ListView)view.findViewById(cl)).setOnItemClickListener((AdapterView$OnItemClickListener)new r(view, adapter));
        ((ListView)view.findViewById(cl)).setEmptyView((View)view.findViewById(com.untis.mobile.c.i.Dl));
        ((ProgressBar)view.findViewById(com.untis.mobile.c.i.El)).setVisibility(8);
        ((TextView)view.findViewById(com.untis.mobile.c.i.Bl)).setVisibility(8);
    }
    
    private final void m1(final View view, final boolean b) {
        final int lr = com.untis.mobile.c.i.lr;
        final AppCompatButton appCompatButton = (AppCompatButton)view.findViewById(lr);
        int visibility;
        if (this.k0() && !b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((Button)appCompatButton).setVisibility(visibility);
        final AppCompatButton appCompatButton2 = (AppCompatButton)view.findViewById(lr);
        final Drawable e0 = this.e0;
        if (e0 != null) {
            ((Button)appCompatButton2).setCompoundDrawablesWithIntrinsicBounds(e0, (Drawable)null, this.y0(), (Drawable)null);
            ((Button)view.findViewById(lr)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.period.adapter.g0(this));
            return;
        }
        kotlin.jvm.internal.k0.S("drawableClassbook");
        throw null;
    }
    
    private static final void n0(final View view, final i0 i0, final AdapterView adapterView, final View view2, final int n, final long n2) {
        k0.p(i0, "$adapter");
        ((EditText)view.findViewById(com.untis.mobile.c.i.zl)).setText((CharSequence)i0.a(n).getText());
    }
    
    private static final void n1(final PeriodDetailFragment periodDetailFragment, final View view) {
        k0.p(periodDetailFragment, "this$0");
        periodDetailFragment.R0();
    }
    
    private static final void o0(final View view, final Throwable t) {
        Log.e("untis_log", "error while loading previous lessontopics", t);
        ((TextView)view.findViewById(com.untis.mobile.c.i.Bl)).setText(2131886498);
        ((ProgressBar)view.findViewById(com.untis.mobile.c.i.El)).setVisibility(8);
    }
    
    private static final void p0(final PeriodDetailFragment periodDetailFragment, final View view) {
        k0.p(periodDetailFragment, "this$0");
        final LessonTopic k = periodDetailFragment.K;
        if (k != null) {
            periodDetailFragment.Q0(k.getAttachments());
            return;
        }
        k0.S("lessonTopic");
        throw null;
    }
    
    private static final void q0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private final void q1(final View view, final String text) {
        final boolean contains = this.E0().getStates().contains(PeriodState.BREAK_SUPERVISION);
        final int n = 1;
        boolean b = false;
        Label_0117: {
            Label_0114: {
                if (!contains && !this.E0().getStates().contains(PeriodState.CANCELLED)) {
                    if (!this.E0().getRights().contains(PeriodRight.WRITE_LESSONTOPIC)) {
                        final LessonTopic k = this.K;
                        if (k == null) {
                            kotlin.jvm.internal.k0.S("lessonTopic");
                            throw null;
                        }
                        if (k.getText().length() == 0) {
                            break Label_0114;
                        }
                    }
                    b = false;
                    break Label_0117;
                }
            }
            b = true;
        }
        final int nr = com.untis.mobile.c.i.nr;
        final AppCompatButton appCompatButton = (AppCompatButton)view.findViewById(nr);
        int visibility;
        if (this.O0() && !b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((Button)appCompatButton).setVisibility(visibility);
        ((Button)view.findViewById(nr)).setEnabled(this.P0());
        if (!((Button)view.findViewById(nr)).isEnabled()) {
            ((Button)view.findViewById(nr)).setBackgroundColor(this.V);
        }
        else {
            ((Button)view.findViewById(nr)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.period.adapter.f(this));
        }
        ((Button)view.findViewById(nr)).setText((CharSequence)text);
        final CharSequence text2 = ((Button)view.findViewById(nr)).getText();
        kotlin.jvm.internal.k0.o(text2, "view.fragment_period_detail_action_lessontopic.text");
        int n2;
        if (text2.length() == 0) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        AppCompatButton appCompatButton2 = (AppCompatButton)view.findViewById(nr);
        Drawable drawable;
        Drawable drawable2;
        if (n2 != 0) {
            ((Button)appCompatButton2).setText(2131886500);
            appCompatButton2 = (AppCompatButton)view.findViewById(nr);
            drawable = this.b0;
            if (drawable == null) {
                kotlin.jvm.internal.k0.S("drawableLessontopicOpen");
                throw null;
            }
            drawable2 = this.Z;
            if (drawable2 == null) {
                kotlin.jvm.internal.k0.S("drawableNotDone");
                throw null;
            }
        }
        else {
            drawable = this.c0;
            if (drawable == null) {
                kotlin.jvm.internal.k0.S("drawableLessontopicDone");
                throw null;
            }
            drawable2 = this.Y;
            if (drawable2 == null) {
                kotlin.jvm.internal.k0.S("drawableCheck");
                throw null;
            }
        }
        ((Button)appCompatButton2).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable)null, drawable2, (Drawable)null);
        ((Button)view.findViewById(nr)).invalidate();
    }
    
    private static final void r0(final PeriodDetailFragment periodDetailFragment, final View view, final Context context, final DialogInterface dialogInterface, int zl) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(context, "$context");
        final LessonTopic k = periodDetailFragment.K;
        if (k == null) {
            k0.S("lessonTopic");
            throw null;
        }
        zl = com.untis.mobile.c.i.zl;
        k.setText(String.valueOf(((AppCompatEditText)view.findViewById(zl)).getText()));
        final View m = periodDetailFragment.M;
        if (m != null) {
            periodDetailFragment.q1(m, String.valueOf(((AppCompatEditText)view.findViewById(zl)).getText()));
            if (g0.a(context)) {
                final com.untis.mobile.services.classbook.a h0 = periodDetailFragment.h0;
                if (h0 == null) {
                    k0.S("classBookService");
                    throw null;
                }
                final LessonTopic i = periodDetailFragment.K;
                if (i == null) {
                    k0.S("lessonTopic");
                    throw null;
                }
                h0.Y(i).C5((rx.functions.b)new u(dialogInterface), (rx.functions.b)new y(periodDetailFragment, dialogInterface));
                periodDetailFragment.x0().c(com.untis.mobile.analytics.base.c.e.J);
            }
            else {
                final LessonTopic j = periodDetailFragment.K;
                if (j == null) {
                    k0.S("lessonTopic");
                    throw null;
                }
                j.setSynced(false);
                kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super LessonTopic>, Object>() {
                    int G;
                    final /* synthetic */ PeriodDetailFragment H;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super LessonTopic>, Object>() {
                            int G;
                            final /* synthetic */ PeriodDetailFragment H = this.H;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super LessonTopic> d) {
                        return ((PeriodDetailFragment$d)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e Object q) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(q);
                        }
                        else {
                            c1.n(q);
                            final a x = PeriodDetailFragment.X(this.H);
                            if (x == null) {
                                kotlin.jvm.internal.k0.S("classBookService");
                                throw null;
                            }
                            final LessonTopic z = PeriodDetailFragment.Z(this.H);
                            if (z == null) {
                                kotlin.jvm.internal.k0.S("lessonTopic");
                                throw null;
                            }
                            this.G = 1;
                            if ((q = x.Q(z, this)) == h) {
                                return h;
                            }
                        }
                        return q;
                    }
                }, 1, (Object)null);
                periodDetailFragment.x0().d(com.untis.mobile.analytics.base.c.e.J, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
            }
            return;
        }
        k0.S("rootView");
        throw null;
    }
    
    private static final void r1(final PeriodDetailFragment periodDetailFragment, final View view) {
        k0.p(periodDetailFragment, "this$0");
        periodDetailFragment.Y0();
    }
    
    private static final void s0(final DialogInterface dialogInterface, final LessonTopic lessonTopic) {
        dialogInterface.dismiss();
    }
    
    private final void s1(final View view) {
        final Profile g = this.G;
        if (g != null) {
            final boolean endOfPremium = g.isEndOfPremium();
            final int n = 1;
            final int n2 = 1;
            boolean b = true;
            Label_0120: {
                TextView textView2 = null;
                String text = null;
                Label_0104: {
                    TextView textView = null;
                    PeriodInfo periodInfo = null;
                    Label_0093: {
                        if (endOfPremium) {
                            final PeriodInfo j = this.J;
                            if (j == null) {
                                kotlin.jvm.internal.k0.S("periodInfo");
                                throw null;
                            }
                            if (j.getLocal().length() <= 0) {
                                b = false;
                            }
                            if (!b) {
                                break Label_0120;
                            }
                            ((LinearLayout)view.findViewById(com.untis.mobile.c.i.ur)).setVisibility(0);
                            textView = (TextView)view.findViewById(com.untis.mobile.c.i.wr);
                            periodInfo = this.J;
                            if (periodInfo == null) {
                                kotlin.jvm.internal.k0.S("periodInfo");
                                throw null;
                            }
                        }
                        else {
                            final PeriodInfo i = this.J;
                            if (i != null) {
                                if (i.getInfo().length() == 0 && !this.E0().getRights().contains(PeriodRight.WRITE_PERIODINFO)) {
                                    ((LinearLayout)view.findViewById(com.untis.mobile.c.i.ur)).setVisibility(0);
                                    final PeriodInfo k = this.J;
                                    if (k == null) {
                                        kotlin.jvm.internal.k0.S("periodInfo");
                                        throw null;
                                    }
                                    int n3;
                                    if (k.getLocal().length() == 0) {
                                        n3 = n;
                                    }
                                    else {
                                        n3 = 0;
                                    }
                                    textView = (TextView)view.findViewById(com.untis.mobile.c.i.wr);
                                    if (n3 != 0) {
                                        textView2 = textView;
                                    }
                                    else {
                                        periodInfo = this.J;
                                        if (periodInfo != null) {
                                            break Label_0093;
                                        }
                                        kotlin.jvm.internal.k0.S("periodInfo");
                                        throw null;
                                    }
                                }
                                else {
                                    final PeriodInfo l = this.J;
                                    if (l == null) {
                                        kotlin.jvm.internal.k0.S("periodInfo");
                                        throw null;
                                    }
                                    if (l.getLocal().length() > 0) {
                                        ((LinearLayout)view.findViewById(com.untis.mobile.c.i.ur)).setVisibility(0);
                                        textView = (TextView)view.findViewById(com.untis.mobile.c.i.wr);
                                        periodInfo = this.J;
                                        if (periodInfo != null) {
                                            break Label_0093;
                                        }
                                        kotlin.jvm.internal.k0.S("periodInfo");
                                        throw null;
                                    }
                                    else {
                                        final PeriodInfo m = this.J;
                                        if (m == null) {
                                            kotlin.jvm.internal.k0.S("periodInfo");
                                            throw null;
                                        }
                                        int n4;
                                        if (m.getLocal().length() == 0) {
                                            n4 = n2;
                                        }
                                        else {
                                            n4 = 0;
                                        }
                                        if (n4 != 0 && !this.E0().getRights().contains(PeriodRight.WRITE_PERIODINFO)) {
                                            ((LinearLayout)view.findViewById(com.untis.mobile.c.i.ur)).setVisibility(0);
                                            textView2 = (TextView)view.findViewById(com.untis.mobile.c.i.wr);
                                        }
                                        else {
                                            if (!this.k1()) {
                                                ((LinearLayout)view.findViewById(com.untis.mobile.c.i.ur)).setVisibility(0);
                                                textView2 = (TextView)view.findViewById(com.untis.mobile.c.i.wr);
                                                text = this.getString(2131886504);
                                                break Label_0104;
                                            }
                                            break Label_0120;
                                        }
                                    }
                                }
                                text = this.getString(2131886502);
                                break Label_0104;
                            }
                            kotlin.jvm.internal.k0.S("periodInfo");
                            throw null;
                        }
                    }
                    final String local = periodInfo.getLocal();
                    textView2 = textView;
                    text = local;
                }
                textView2.setText((CharSequence)text);
                return;
            }
            ((LinearLayout)view.findViewById(com.untis.mobile.c.i.ur)).setVisibility(8);
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    private static final void t0(final PeriodDetailFragment periodDetailFragment, final DialogInterface dialogInterface, final Throwable t) {
        k0.p(periodDetailFragment, "this$0");
        Log.e("untis_log", "error while submitting lessontopic", t);
        final LessonTopic k = periodDetailFragment.K;
        if (k == null) {
            k0.S("lessonTopic");
            throw null;
        }
        k.setSynced(false);
        kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super LessonTopic>, Object>() {
            int G;
            final /* synthetic */ PeriodDetailFragment H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super LessonTopic>, Object>() {
                    int G;
                    final /* synthetic */ PeriodDetailFragment H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super LessonTopic> d) {
                return ((PeriodDetailFragment$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object q) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(q);
                }
                else {
                    c1.n(q);
                    final a x = PeriodDetailFragment.X(this.H);
                    if (x == null) {
                        kotlin.jvm.internal.k0.S("classBookService");
                        throw null;
                    }
                    final LessonTopic z = PeriodDetailFragment.Z(this.H);
                    if (z == null) {
                        kotlin.jvm.internal.k0.S("lessonTopic");
                        throw null;
                    }
                    this.G = 1;
                    if ((q = x.Q(z, this)) == h) {
                        return h;
                    }
                }
                return q;
            }
        }, 1, (Object)null);
        final View m = periodDetailFragment.M;
        if (m != null) {
            u0.d(m, t);
            dialogInterface.dismiss();
            return;
        }
        k0.S("rootView");
        throw null;
    }
    
    private final void t1(final View view) {
        final com.untis.mobile.systemNotifications.b g0 = this.G0();
        final Profile g2 = this.G;
        if (g2 != null) {
            final List<com.untis.mobile.systemNotifications.a> c = g0.c(g2.getUniqueId(), this.E0().getId());
            final int er = com.untis.mobile.c.i.Er;
            final LinearLayout linearLayout = (LinearLayout)view.findViewById(er);
            int visibility;
            if (c.isEmpty()) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            linearLayout.setVisibility(visibility);
            ((LinearLayout)view.findViewById(er)).removeAllViews();
            ((LinearLayout)view.findViewById(er)).removeAllViewsInLayout();
            for (final com.untis.mobile.systemNotifications.a a : c) {
                final View inflate = this.getLayoutInflater().inflate(2131493211, (ViewGroup)view.findViewById(com.untis.mobile.c.i.Er), true);
                ((TextView)inflate.findViewById(com.untis.mobile.c.i.Jy)).setText((CharSequence)a.h());
                ((TextView)inflate.findViewById(com.untis.mobile.c.i.Iy)).setText((CharSequence)this.D0(a));
                ((LinearLayout)inflate.findViewById(com.untis.mobile.c.i.Hy)).setOnClickListener((View$OnClickListener)new q(this, a));
            }
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @SuppressLint({ "InflateParams" })
    private final void u0() {
        final d activity = this.getActivity();
        if (activity == null) {
            return;
        }
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        int visibility = 0;
        final View inflate = layoutInflater.inflate(2131493043, (ViewGroup)null, false);
        final TextView textView = (TextView)inflate.findViewById(com.untis.mobile.c.i.Gl);
        final LessonTopic k = this.K;
        if (k == null) {
            kotlin.jvm.internal.k0.S("lessonTopic");
            throw null;
        }
        textView.setText((CharSequence)k.getText());
        final int fl = com.untis.mobile.c.i.Fl;
        final AppCompatButton appCompatButton = (AppCompatButton)inflate.findViewById(fl);
        final LessonTopic i = this.K;
        if (i != null) {
            if (i.getAttachments().isEmpty()) {
                visibility = 8;
            }
            ((Button)appCompatButton).setVisibility(visibility);
            ((Button)inflate.findViewById(fl)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.period.adapter.d(this));
            final androidx.appcompat.app.d a = new d$a((Context)activity, 2131951624).M(inflate).r(2131886660, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.period.adapter.d0.G).a();
            kotlin.jvm.internal.k0.o(a, "Builder(activity, R.style.AppDialogTheme)\n                .setView(dialogView)\n                .setNegativeButton(R.string.shared_alert_ok_button) { dialog, _ ->\n                    dialog.dismiss()\n                }\n                .create()");
            ((Dialog)a).show();
            com.untis.mobile.utils.a0.a.a(a);
            return;
        }
        kotlin.jvm.internal.k0.S("lessonTopic");
        throw null;
    }
    
    private static final void u1(final PeriodDetailFragment periodDetailFragment, final com.untis.mobile.systemNotifications.a a, final View view) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(a, "$notification");
        periodDetailFragment.Z0(a);
    }
    
    private static final void v0(final PeriodDetailFragment periodDetailFragment, final View view) {
        k0.p(periodDetailFragment, "this$0");
        final LessonTopic k = periodDetailFragment.K;
        if (k != null) {
            periodDetailFragment.Q0(k.getAttachments());
            return;
        }
        k0.S("lessonTopic");
        throw null;
    }
    
    private final void v1(final View view) {
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        final LinearLayout linearLayout = (LinearLayout)view.findViewById(com.untis.mobile.c.i.Ar);
        int visibility;
        if (this.k1()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        linearLayout.setVisibility(visibility);
        final int zr = com.untis.mobile.c.i.zr;
        final AppCompatImageButton appCompatImageButton = (AppCompatImageButton)view.findViewById(zr);
        final PeriodInfo j = this.J;
        if (j == null) {
            kotlin.jvm.internal.k0.S("periodInfo");
            throw null;
        }
        int visibility2;
        if (j.getDriveAttachments().isEmpty()) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        ((ImageButton)appCompatImageButton).setVisibility(visibility2);
        ((ImageButton)view.findViewById(zr)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.period.adapter.h(this, (Context)o));
        final int cr = com.untis.mobile.c.i.Cr;
        final TextView textView = (TextView)view.findViewById(cr);
        final PeriodInfo i = this.J;
        if (i == null) {
            kotlin.jvm.internal.k0.S("periodInfo");
            throw null;
        }
        textView.setText((CharSequence)i.getInfo());
        final PeriodInfo k = this.J;
        if (k != null) {
            if (k.getInfo().length() == 0) {
                ((TextView)view.findViewById(cr)).setText(2131886497);
            }
            if (!this.E0().getRights().contains(PeriodRight.WRITE_PERIODINFO)) {
                ((ImageView)view.findViewById(com.untis.mobile.c.i.Br)).setVisibility(8);
            }
            else {
                ((ImageView)view.findViewById(com.untis.mobile.c.i.Br)).setVisibility(0);
            }
            return;
        }
        kotlin.jvm.internal.k0.S("periodInfo");
        throw null;
    }
    
    private static final void w0(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void w1(final PeriodDetailFragment periodDetailFragment, Context context, final View view) {
        k0.p(periodDetailFragment, "this$0");
        k0.p(context, "$context");
        final Object activity = periodDetailFragment.getActivity();
        if (activity != null) {
            context = (Context)activity;
        }
        final PeriodInfo j = periodDetailFragment.J;
        if (j != null) {
            DriveAttachmentListActivity.s(context, j.getDriveAttachments());
            return;
        }
        k0.S("periodInfo");
        throw null;
    }
    
    private final com.untis.mobile.analytics.base.b x0() {
        return this.k0.getValue();
    }
    
    private final boolean x1(final Period period, final HomeWork homeWork) {
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return false;
        }
        if (homeWork.getId() < 0L) {
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)o);
            final Profile g = this.G;
            if (g == null) {
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
            if (a.J(g)) {
                return true;
            }
        }
        return period.getRights().contains(PeriodRight.WRITE_HOMEWORK);
    }
    
    private final Drawable y0() {
        final Classbook i = this.I;
        Drawable drawable = null;
        if (i != null) {
            if (i.getAbsencesChecked()) {
                drawable = this.Y;
                if (drawable == null) {
                    kotlin.jvm.internal.k0.S("drawableCheck");
                    throw null;
                }
            }
            else {
                final Classbook j = this.I;
                if (j == null) {
                    kotlin.jvm.internal.k0.S("classbook");
                    throw null;
                }
                if (j.getStudents().isEmpty()) {
                    drawable = this.a0;
                    if (drawable == null) {
                        kotlin.jvm.internal.k0.S("drawableEmpty");
                        throw null;
                    }
                }
                else if (((org.joda.time.base.c)this.E0().getStart().v0(15)).j()) {
                    drawable = this.Z;
                    if (drawable == null) {
                        kotlin.jvm.internal.k0.S("drawableNotDone");
                        throw null;
                    }
                }
            }
            return drawable;
        }
        kotlin.jvm.internal.k0.S("classbook");
        throw null;
    }
    
    private final int z0(final HomeWork homeWork) {
        if (homeWork.getCompletedStatus()) {
            return this.T;
        }
        if (homeWork.getLocal()) {
            return this.U;
        }
        return this.S;
    }
    
    @e
    public final Period E0() {
        final Period h = this.H;
        if (h != null) {
            return h;
        }
        kotlin.jvm.internal.k0.S("period");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public final void j1(@e final Period h) {
        kotlin.jvm.internal.k0.p(h, "<set-?>");
        this.H = h;
    }
    
    public final void l1() {
        final k g0 = this.g0;
        if (g0 == null) {
            kotlin.jvm.internal.k0.S("timeTableService");
            throw null;
        }
        Period l;
        if ((l = g0.l(this.E0().getId())) == null) {
            l = new Period(this.E0().getId(), 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.j1(l);
        final com.untis.mobile.services.classbook.a h0 = this.h0;
        if (h0 == null) {
            kotlin.jvm.internal.k0.S("classBookService");
            throw null;
        }
        Classbook s;
        if ((s = h0.S(this.E0().getId())) == null) {
            s = new Classbook(this.E0().getId(), null, null, null, null, null, null, false, false, null, 1022, null);
        }
        this.I = s;
        final com.untis.mobile.services.classbook.a h2 = this.h0;
        if (h2 == null) {
            kotlin.jvm.internal.k0.S("classBookService");
            throw null;
        }
        PeriodInfo d;
        if ((d = h2.d(this.E0().getId())) == null) {
            d = new PeriodInfo(this.E0().getId(), null, null, null, null, false, null, 126, null);
        }
        this.J = d;
        final com.untis.mobile.services.classbook.a h3 = this.h0;
        if (h3 == null) {
            kotlin.jvm.internal.k0.S("classBookService");
            throw null;
        }
        LessonTopic d2;
        if ((d2 = h3.D(this.E0().getId())) == null) {
            d2 = new LessonTopic(this.E0().getId(), null, null, null, null, false, 62, null);
        }
        this.K = d2;
        final View m = this.M;
        if (m != null) {
            this.c0(m);
            return;
        }
        kotlin.jvm.internal.k0.S("rootView");
        throw null;
    }
    
    public final void o1(@e final HomeWork homeWork, final boolean b) {
        kotlin.jvm.internal.k0.p(homeWork, "homeWork");
        if (homeWork.getLessonId() == this.E0().getLessonId() && homeWork.getPeriodId() != 0L) {
            final Classbook i = this.I;
            if (i == null) {
                kotlin.jvm.internal.k0.S("classbook");
                throw null;
            }
            i.getHomeWorks().remove(homeWork);
            if (!b) {
                final Classbook j = this.I;
                if (j == null) {
                    kotlin.jvm.internal.k0.S("classbook");
                    throw null;
                }
                j.getHomeWorks().add(homeWork);
            }
        }
        if (homeWork.getPeriodId() == 0L || b) {
            final Classbook k = this.I;
            if (k == null) {
                kotlin.jvm.internal.k0.S("classbook");
                throw null;
            }
            final Iterator<HomeWork> iterator = k.getHomeWorks().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getId() == homeWork.getId()) {
                    iterator.remove();
                }
            }
        }
        kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ PeriodDetailFragment H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ PeriodDetailFragment H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((PeriodDetailFragment$j)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final a x = PeriodDetailFragment.X(this.H);
                    if (x == null) {
                        kotlin.jvm.internal.k0.S("classBookService");
                        throw null;
                    }
                    final Classbook y = PeriodDetailFragment.Y(this.H);
                    if (y == null) {
                        kotlin.jvm.internal.k0.S("classbook");
                        throw null;
                    }
                    this.G = 1;
                    if (x.a0(y, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        final View m = this.M;
        if (m != null) {
            this.c0(m);
            return;
        }
        kotlin.jvm.internal.k0.S("rootView");
        throw null;
    }
    
    public void onActivityCreated(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onActivityCreated(bundle);
        final t o = this.O;
        if (o != null) {
            final int n = b.a[o.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        X0(this, null, 1, null);
                    }
                }
                else {
                    this.Y0();
                }
            }
            else {
                this.R0();
            }
            return;
        }
        kotlin.jvm.internal.k0.S("periodDetailMethod");
        throw null;
    }
    
    public void onCreate(@org.jetbrains.annotations.f Bundle arguments) {
        super.onCreate(arguments);
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        this.M0((Context)o);
        final j0 g = com.untis.mobile.services.profile.legacy.j0.G;
        Bundle arguments2;
        if (arguments == null) {
            arguments2 = this.getArguments();
        }
        else {
            arguments2 = arguments;
        }
        final String s = "";
        String string;
        if (arguments2 == null) {
            string = s;
        }
        else {
            string = arguments2.getString("trick", "");
            if (string == null) {
                string = s;
            }
        }
        Profile g2;
        if ((g2 = g.l(string)) == null) {
            g2 = g.n();
            if (g2 == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.G = g2;
        this.g0 = g2.getTimeTableService();
        final Profile g3 = this.G;
        if (g3 == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        this.h0 = g3.getClassBookService();
        final Profile g4 = this.G;
        if (g4 == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        this.i0 = g4.getMasterDataService();
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)o);
        final Profile g5 = this.G;
        if (g5 == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        final DefaultColors g6 = a.g(g5.getUniqueId());
        kotlin.jvm.internal.k0.o(g6, "appSettings.getColors(profile.getUniqueId())");
        this.f0 = g6;
        this.P = a.r1();
        this.Q = a.q1();
        final Profile g7 = this.G;
        if (g7 == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        this.R = a.I(g7);
        Bundle arguments3;
        if (arguments == null) {
            arguments3 = this.getArguments();
        }
        else {
            arguments3 = arguments;
        }
        long long1;
        if (arguments3 == null) {
            long1 = 0L;
        }
        else {
            long1 = arguments3.getLong("track");
        }
        final k g8 = this.g0;
        if (g8 == null) {
            kotlin.jvm.internal.k0.S("timeTableService");
            throw null;
        }
        Period l;
        if ((l = g8.l(long1)) == null) {
            l = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.j1(l);
        final com.untis.mobile.services.classbook.a h0 = this.h0;
        if (h0 == null) {
            kotlin.jvm.internal.k0.S("classBookService");
            throw null;
        }
        Classbook s2;
        if ((s2 = h0.S(long1)) == null) {
            s2 = new Classbook(long1, null, null, null, null, null, null, false, false, null, 1022, null);
        }
        this.I = s2;
        final com.untis.mobile.services.classbook.a h2 = this.h0;
        if (h2 == null) {
            kotlin.jvm.internal.k0.S("classBookService");
            throw null;
        }
        PeriodInfo d;
        if ((d = h2.d(long1)) == null) {
            d = new PeriodInfo(long1, null, null, null, null, false, null, 126, null);
        }
        this.J = d;
        final com.untis.mobile.services.classbook.a h3 = this.h0;
        if (h3 == null) {
            kotlin.jvm.internal.k0.S("classBookService");
            throw null;
        }
        LessonTopic d2;
        if ((d2 = h3.D(long1)) == null) {
            d2 = new LessonTopic(long1, null, null, null, null, false, 62, null);
        }
        this.K = d2;
        Bundle arguments4;
        if (arguments == null) {
            arguments4 = this.getArguments();
        }
        else {
            arguments4 = arguments;
        }
        TimeTableEntity timeTableEntity;
        if (arguments4 == null) {
            timeTableEntity = null;
        }
        else {
            timeTableEntity = (TimeTableEntity)arguments4.getParcelable("truck");
        }
        TimeTableEntity i = timeTableEntity;
        if (timeTableEntity == null) {
            i = new TimeTableEntity(null, 0L, false, 0, 0L, null, 63, null);
        }
        this.L = i;
        Bundle arguments5;
        if (arguments == null) {
            arguments5 = this.getArguments();
        }
        else {
            arguments5 = arguments;
        }
        int int1 = 0;
        this.N = (arguments5 != null && arguments5.getBoolean("trock"));
        final t.a h4 = t.H;
        if (arguments == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            int1 = arguments.getInt("treck", 0);
        }
        this.O = h4.a(int1);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131165635);
        final int dimensionPixelSize2 = this.getResources().getDimensionPixelSize(2131165636);
        final Drawable x = this.X;
        if (x == null) {
            kotlin.jvm.internal.k0.S("drawableEntityLink");
            throw null;
        }
        x.setBounds(dimensionPixelSize, dimensionPixelSize * -2, dimensionPixelSize + dimensionPixelSize2, dimensionPixelSize2 - dimensionPixelSize * 2);
        final Drawable x2 = this.X;
        if (x2 == null) {
            kotlin.jvm.internal.k0.S("drawableEntityLink");
            throw null;
        }
        x2.setColorFilter(this.S, PorterDuff$Mode.MULTIPLY);
        final Drawable y = this.Y;
        if (y != null) {
            y.setColorFilter(androidx.core.content.d.f((Context)o, 2131099682), PorterDuff$Mode.SRC_ATOP);
            return;
        }
        kotlin.jvm.internal.k0.S("drawableCheck");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493112, viewGroup, false);
        kotlin.jvm.internal.k0.o(inflate, "inflater.inflate(R.layout.fragment_period_detail, container, false)");
        this.M = inflate;
        if (com.untis.mobile.utils.g0.a(this.getContext())) {
            this.x0().c(com.untis.mobile.analytics.base.c.c.H);
        }
        else {
            this.x0().d(com.untis.mobile.analytics.base.c.e.I, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
        }
        final View m = this.M;
        if (m == null) {
            kotlin.jvm.internal.k0.S("rootView");
            throw null;
        }
        this.c0(m);
        final View i = this.M;
        if (i != null) {
            return i;
        }
        kotlin.jvm.internal.k0.S("rootView");
        throw null;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        kotlin.jvm.internal.k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        bundle.putString("trick", g.getUniqueId());
        bundle.putLong("track", this.E0().getId());
        final TimeTableEntity l = this.L;
        if (l != null) {
            bundle.putParcelable("truck", (Parcelable)l);
            return;
        }
        kotlin.jvm.internal.k0.S("timeTableEntity");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0017" }, d2 = { "com/untis/mobile/ui/activities/period/adapter/PeriodDetailFragment$a", "", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "periodId", "", "currentPeriod", "Lcom/untis/mobile/ui/activities/period/t;", "periodDetailMethod", "Lcom/untis/mobile/ui/activities/period/adapter/PeriodDetailFragment;", "a", "", "BUNDLE_CURRENT_PERIOD", "Ljava/lang/String;", "BUNDLE_PERIOD_ID", "BUNDLE_PERIOD_METHOD_VALUE", "BUNDLE_PROFILE_ID", "BUNDLE_TIME_TABLE_ENTITY", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final PeriodDetailFragment a(@e final TimeTableEntity timeTableEntity, @e final Profile profile, final long n, final boolean b, @e final t t) {
            kotlin.jvm.internal.k0.p(timeTableEntity, "timeTableEntity");
            kotlin.jvm.internal.k0.p(profile, "profile");
            kotlin.jvm.internal.k0.p(t, "periodDetailMethod");
            final PeriodDetailFragment periodDetailFragment = new PeriodDetailFragment();
            final Bundle arguments = new Bundle();
            arguments.putParcelable("truck", (Parcelable)timeTableEntity);
            arguments.putString("trick", profile.getUniqueId());
            arguments.putLong("track", n);
            arguments.putBoolean("trock", b);
            arguments.putInt("treck", t.d());
            periodDetailFragment.setArguments(arguments);
            return periodDetailFragment;
        }
    }
}
