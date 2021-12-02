// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook;

import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import android.view.View$OnLongClickListener;
import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.utils.g0;
import com.untis.mobile.ui.activities.classbook.events.EventsActivity;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.untis.mobile.ui.activities.classbook.events.EventDetailActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.content.Intent;
import com.untis.mobile.ui.activities.classbook.absences.AbsencesActivity;
import com.untis.mobile.ui.activities.classbook.absences.AbsenceDetailActivity;
import com.untis.mobile.persistence.models.classbook.absence.PrioritizedAttendanceType;
import com.untis.mobile.persistence.models.classbook.absence.PrioritizedAttendance;
import com.untis.mobile.persistence.models.classbook.absence.Exemption;
import java.util.Objects;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsenceResult;
import kotlin.text.s;
import com.untis.mobile.api.enumeration.CreateAbsenceStrategy;
import kotlin.jvm.internal.j1;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import android.view.View;
import com.untis.mobile.utils.u0;
import android.widget.RelativeLayout;
import org.joda.time.t;
import java.util.Comparator;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.classbook.absence.Excuse;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import java.util.Collection;
import kotlin.collections.v;
import android.util.Log;
import org.joda.time.c;
import java.util.Set;
import java.util.ArrayList;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import java.util.Iterator;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import org.joda.time.m0;
import org.joda.time.l0;
import org.joda.time.r;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import org.joda.time.n0;
import com.untis.mobile.persistence.models.timegrid.TimeGridUnit;
import android.graphics.PorterDuff$Mode;
import androidx.core.content.d;
import android.content.Context;
import kotlin.jvm.internal.k0;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import java.util.HashSet;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.services.classbook.a;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.List;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.recyclerview.widget.RecyclerView$h;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\\\u001a\u00020Y\u0012\u0006\u0010`\u001a\u00020]\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010m\u001a\u00020j¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0002J&\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010/\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u00100\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u00101\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u00102\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u00103\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u00105\u001a\u00020.2\u0006\u00104\u001a\u00020\u000eH\u0002J\u0018\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u0002062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u00109\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010:\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010;\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010<\u001a\u00020\u0005H\u0002J\b\u0010=\u001a\u00020\u000bH\u0002J\b\u0010>\u001a\u00020\u000bH\u0002J\b\u0010?\u001a\u00020\u000bH\u0002J\u0018\u0010C\u001a\u00020\u00022\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u0007H\u0016J\u0018\u0010F\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u0007H\u0016J\u000e\u0010G\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010H\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010I\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010J\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010K\u001a\u00020\u0007H\u0016J\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dJ\u000e\u0010M\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u0007J\u0016\u0010P\u001a\u00020\u000b2\u0006\u00107\u001a\u0002062\u0006\u0010O\u001a\u00020NJ\u001e\u0010U\u001a\u00020\u000b2\u0016\u0010T\u001a\u0012\u0012\u0004\u0012\u00020R0Qj\b\u0012\u0004\u0012\u00020R`SR\u0018\u0010X\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u00100R\u0016\u0010d\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010WR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010WR\u0016\u0010i\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00100R\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001e\u0010r\u001a\n o*\u0004\u0018\u00010n0n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u00100R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010y\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010{\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010xR\u0016\u0010}\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010xR\u0018\u0010\u007f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010WR\u001a\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0085\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010WR!\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010WR\u0018\u0010\u008c\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010WR\u0018\u0010\u008e\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010xR\u001a\u0010\u0090\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010WR\u001a\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R(\u0010T\u001a\u0012\u0012\u0004\u0012\u00020R0Qj\b\u0012\u0004\u0012\u00020R`S8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009d\u0001" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/b0;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/untis/mobile/ui/activities/classbook/j0;", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "", "e0", "", "T", "Landroid/graphics/drawable/Drawable;", "S", "Lkotlin/j2;", "Z0", "T0", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "absence", "synced", "D0", "z", "G0", "y0", "viewHolder", "v0", "M0", "N0", "E0", "Y0", "Q0", "N", "", "absences", "c1", "j0", "F0", "O", "L0", "C0", "L", "M", "U", "x0", "m0", "K0", "c0", "J0", "b0", "", "a0", "Z", "R", "l0", "V", "studentAbsence", "Q", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "k0", "g0", "h0", "f0", "H0", "b1", "I0", "i0", "Landroid/view/ViewGroup;", "parent", "viewType", "w0", "holder", "position", "n0", "B0", "z0", "A0", "d0", "getItemCount", "X", "W", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "a1", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "selectedStudentIds", "d1", "s", "Landroid/graphics/drawable/Drawable;", "drawablePresent", "Lcom/untis/mobile/ui/activities/classbook/ClassbookActivity;", "a", "Lcom/untis/mobile/ui/activities/classbook/ClassbookActivity;", "activity", "Lcom/untis/mobile/persistence/models/profile/Profile;", "b", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "f", "classbookAbsenceChecked", "w", "drawableExemptionPresent", "d", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "q", "drawableEventNotEmpty", "writeClassbookEvents", "Lcom/untis/mobile/ui/activities/classbook/i;", "e", "Lcom/untis/mobile/ui/activities/classbook/i;", "pageType", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "l", "Landroid/view/LayoutInflater;", "inflater", "y", "readClassbookEvents", "c", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "o", "I", "colorAccent", "p", "colorIconDark", "n", "colorBackGroundSelected", "r", "drawableEventEmpty", "Lcom/untis/mobile/services/masterdata/a;", "j", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "v", "drawablePrioritizedAttendance", "g", "Ljava/util/List;", "students", "t", "drawableLate", "x", "drawableExemptionAbsent", "m", "colorBackGround", "u", "drawableAbsent", "Lcom/untis/mobile/services/timetable/placeholder/k;", "i", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "k", "Ljava/util/HashSet;", "Lcom/untis/mobile/services/classbook/a;", "h", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "<init>", "(Lcom/untis/mobile/ui/activities/classbook/ClassbookActivity;Lcom/untis/mobile/persistence/models/profile/Profile;Lcom/untis/mobile/persistence/models/timetable/period/Period;Lcom/untis/mobile/persistence/models/timetable/period/Classbook;Lcom/untis/mobile/ui/activities/classbook/i;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b0 extends RecyclerView$h<j0>
{
    @e
    private final ClassbookActivity a;
    @e
    private final Profile b;
    @e
    private Period c;
    @e
    private Classbook d;
    @e
    private i e;
    private boolean f;
    @f
    private List<Student> g;
    @e
    private final com.untis.mobile.services.classbook.a h;
    @e
    private final k i;
    @e
    private final com.untis.mobile.services.masterdata.a j;
    @e
    private HashSet<Long> k;
    private final LayoutInflater l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    @f
    private final Drawable q;
    @f
    private final Drawable r;
    @f
    private final Drawable s;
    @f
    private final Drawable t;
    @f
    private final Drawable u;
    @e
    private final Drawable v;
    @e
    private final Drawable w;
    @e
    private final Drawable x;
    private final boolean y;
    private final boolean z;
    
    public b0(@e final ClassbookActivity a, @e final Profile b, @e final Period c, @e final Classbook d, @e final i e) {
        k0.p(a, "activity");
        k0.p(b, "profile");
        k0.p(c, "period");
        k0.p(d, "classbook");
        k0.p(e, "pageType");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = d.getAbsencesChecked();
        this.h = b.getClassBookService();
        this.i = b.getTimeTableService();
        this.j = b.getMasterDataService();
        this.k = new HashSet<Long>();
        this.l = LayoutInflater.from((Context)a);
        this.m = androidx.core.content.d.f((Context)a, 2131099975);
        this.n = androidx.core.content.d.f((Context)a, 2131099973);
        this.o = androidx.core.content.d.f((Context)a, 2131099677);
        this.p = androidx.core.content.d.f((Context)a, 2131099992);
        this.q = androidx.core.content.d.i((Context)a, 2131231104);
        this.r = androidx.core.content.d.i((Context)a, 2131231105);
        this.s = androidx.core.content.d.i((Context)a, 2131231065);
        this.t = androidx.core.content.d.i((Context)a, 2131231064);
        this.u = androidx.core.content.d.i((Context)a, 2131231062);
        final Drawable i = androidx.core.content.d.i((Context)a, 2131230925);
        k0.m(i);
        final Drawable mutate = i.mutate();
        k0.o(mutate, "getDrawable(activity, R.drawable.ic_not_interested_white_24dp)!!\n            .mutate()");
        this.v = mutate;
        final Drawable j = androidx.core.content.d.i((Context)a, 2131230888);
        k0.m(j);
        final Drawable mutate2 = j.mutate();
        k0.o(mutate2, "getDrawable(activity, R.drawable.ic_excemption_24)!!.mutate()");
        this.w = mutate2;
        final Drawable k = androidx.core.content.d.i((Context)a, 2131230888);
        k0.m(k);
        final Drawable mutate3 = k.mutate();
        k0.o(mutate3, "getDrawable(activity, R.drawable.ic_excemption_24)!!.mutate()");
        this.x = mutate3;
        final com.untis.mobile.services.a a2 = com.untis.mobile.services.a.a;
        this.y = a2.k(this.c);
        this.z = a2.p(this.c);
        mutate.setColorFilter(androidx.core.content.d.f((Context)a, 2131099726), PorterDuff$Mode.SRC_ATOP);
        mutate2.setColorFilter(androidx.core.content.d.f((Context)a, 2131099741), PorterDuff$Mode.SRC_ATOP);
        mutate3.setColorFilter(androidx.core.content.d.f((Context)a, 2131099726), PorterDuff$Mode.SRC_ATOP);
    }
    
    private static final int A(final TimeGridUnit timeGridUnit, final TimeGridUnit timeGridUnit2) {
        return timeGridUnit.getStart().b((n0)timeGridUnit2.getStart());
    }
    
    private final boolean C0(final StudentAbsence studentAbsence) {
        return ((org.joda.time.base.d)new r((l0)studentAbsence.getStart(), (l0)studentAbsence.getEnd())).F((m0)new r((l0)this.c.getStart(), (l0)this.c.getEnd()));
    }
    
    private final void D0(final StudentAbsence studentAbsence, final boolean b) {
        kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ b0 H;
            final /* synthetic */ StudentAbsence I;
            final /* synthetic */ boolean J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ b0 H = this.H;
                    final /* synthetic */ StudentAbsence I = this.I;
                    final /* synthetic */ boolean J = this.J;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((b0$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
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
                    final Iterator<Long> iterator = b0.F(this.H).getAbsences().iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().longValue() == this.I.getId()) {
                            iterator.remove();
                            b0.F(this.H).setSynced(this.J);
                        }
                    }
                    b0.F(this.H).setAbsencesChecked(b0.this.j0());
                    final a e = b0.E(this.H);
                    final Classbook f = b0.F(this.H);
                    this.G = 1;
                    if (e.a0(f, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a E(final b0 b0) {
        return b0.h;
    }
    
    private final void E0(final Student student) {
        kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            Object I;
            int J;
            final /* synthetic */ b0 K;
            final /* synthetic */ Student L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    Object I;
                    int J;
                    final /* synthetic */ b0 K = this.K;
                    final /* synthetic */ Student L = this.L;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((b0$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object a) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int j = this.J;
                Label_0653: {
                    Label_0569: {
                        Iterator<Object> iterator = null;
                        List<StudentAbsence> g = null;
                        b0 k = null;
                        Label_0465: {
                            if (j != 0) {
                                if (j != 1) {
                                    if (j == 2) {
                                        iterator = (Iterator<Object>)this.I;
                                        final b0 b0 = (b0)this.H;
                                        g = (List<StudentAbsence>)this.G;
                                        c1.n(a);
                                        k = b0;
                                        break Label_0465;
                                    }
                                    if (j == 3) {
                                        c1.n(a);
                                        break Label_0653;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                else {
                                    c1.n(a);
                                }
                            }
                            else {
                                c1.n(a);
                                final Set<Long> absences = b0.F(this.K).getAbsences();
                                final b0 i = this.K;
                                final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
                                final Iterator<Number> iterator2 = absences.iterator();
                                while (iterator2.hasNext()) {
                                    final StudentAbsence z = b0.E(i).Z(iterator2.next().longValue());
                                    if (z != null) {
                                        list.add(z);
                                    }
                                }
                                final Student l = this.L;
                                a = new ArrayList();
                                for (final StudentAbsence next : list) {
                                    if (kotlin.coroutines.jvm.internal.b.a(k0.g(next.getStudent(), l))) {
                                        ((Collection<StudentAbsence>)a).add(next);
                                    }
                                }
                                final b0 m = this.K;
                                g = new ArrayList<StudentAbsence>();
                                for (final StudentAbsence next2 : a) {
                                    final StudentAbsence studentAbsence = next2;
                                    if (kotlin.coroutines.jvm.internal.b.a(m.C0(studentAbsence) || m.O(studentAbsence))) {
                                        g.add(next2);
                                    }
                                }
                                if (!g.isEmpty()) {
                                    k = this.K;
                                    iterator = list.iterator();
                                    break Label_0465;
                                }
                                final a e = b0.E(this.K);
                                final StudentAbsence b2 = b0.this.L(this.L);
                                this.J = 1;
                                if ((a = e.a(b2, this)) == h) {
                                    return h;
                                }
                            }
                            b0.F(this.K).getAbsences().add(kotlin.coroutines.jvm.internal.b.g(((StudentAbsence)a).getId()));
                            break Label_0569;
                        }
                        while (iterator.hasNext()) {
                            final StudentAbsence studentAbsence2 = iterator.next();
                            if (g.contains(studentAbsence2)) {
                                studentAbsence2.setSynced(false);
                                studentAbsence2.setEnd(b0.G(k).getEnd());
                                final a e2 = b0.E(k);
                                this.G = g;
                                this.H = k;
                                this.I = iterator;
                                this.J = 2;
                                if (e2.a(studentAbsence2, this) == h) {
                                    return h;
                                }
                                continue;
                            }
                        }
                    }
                    b0.F(this.K).setSynced(false);
                    b0.F(this.K).setAbsencesChecked(b0.this.j0());
                    final a e3 = b0.E(this.K);
                    final Classbook f = b0.F(this.K);
                    this.G = null;
                    this.H = null;
                    this.I = null;
                    this.J = 3;
                    if (e3.a0(f, this) == h) {
                        return h;
                    }
                }
                b0.this.b1();
                return j2.a;
            }
        }, 1, (Object)null);
    }
    
    public static final /* synthetic */ Classbook F(final b0 b0) {
        return b0.d;
    }
    
    private final void F0(final Student student) {
        kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            Object I;
            Object J;
            Object K;
            int L;
            final /* synthetic */ b0 M;
            final /* synthetic */ Student N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    Object I;
                    Object J;
                    Object K;
                    int L;
                    final /* synthetic */ b0 M = this.M;
                    final /* synthetic */ Student N = this.N;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((b0$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object next) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int l = this.L;
                Object i = null;
                p<r0, kotlin.coroutines.d<? super j2>, Object> p2 = null;
                Label_0911: {
                    while (true) {
                        StudentAbsence studentAbsence = null;
                        p<r0, kotlin.coroutines.d<? super j2>, Object> p = null;
                        Iterator<Number> j = null;
                        Object k = null;
                        List<Object> h3 = null;
                        c g = null;
                        Label_0825: {
                            Object iterator = null;
                            List<Object> h2 = null;
                            c a = null;
                            Label_0619: {
                                if (l != 0) {
                                    if (l == 1) {
                                        studentAbsence = (StudentAbsence)this.K;
                                        iterator = this.J;
                                        i = this.I;
                                        h2 = (List<Object>)this.H;
                                        a = (c)this.G;
                                        c1.n(next);
                                        p = this;
                                        break Label_0619;
                                    }
                                    if (l != 2) {
                                        if (l == 3) {
                                            c1.n(next);
                                            return j2.a;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    else {
                                        iterator = this.J;
                                        i = this.I;
                                        h2 = (List<Object>)this.H;
                                        a = (c)this.G;
                                        c1.n(next);
                                        p2 = this;
                                    }
                                }
                                else {
                                    c1.n(next);
                                    Log.d("untis_log", "setOfflineLateness");
                                    a = com.untis.mobile.utils.time.a.a();
                                    final Set<Long> absences = b0.F(this.M).getAbsences();
                                    final b0 m = this.M;
                                    final ArrayList<Object> list = new ArrayList<Object>();
                                    final Iterator<Number> iterator2 = absences.iterator();
                                    while (iterator2.hasNext()) {
                                        final StudentAbsence z = b0.E(m).Z(iterator2.next().longValue());
                                        if (z != null) {
                                            list.add(z);
                                        }
                                    }
                                    final Student n = this.N;
                                    h2 = new ArrayList<Object>();
                                    final Iterator<Object> iterator3 = list.iterator();
                                    while (iterator3.hasNext()) {
                                        next = iterator3.next();
                                        if (kotlin.coroutines.jvm.internal.b.a(k0.g(((StudentAbsence)next).getStudent(), n))) {
                                            h2.add(next);
                                        }
                                    }
                                    next = new ArrayList();
                                    if (h2.isEmpty()) {
                                        ((ArrayList<StudentAbsence>)next).add(b0.this.M(this.N));
                                        i = next;
                                        p2 = this;
                                        break Label_0911;
                                    }
                                    iterator = b0.F(this.M).getAbsences().iterator();
                                    i = next;
                                    p2 = this;
                                }
                                while (((Iterator)iterator).hasNext()) {
                                    final StudentAbsence z2 = b0.E(p2.M).Z(((Iterator<Number>)iterator).next().longValue());
                                    if (z2 == null) {
                                        continue;
                                    }
                                    if (!h2.contains(z2)) {
                                        continue;
                                    }
                                    if (b0.this.O(z2)) {
                                        z2.setPeriodId(b0.G(p2.M).getId());
                                        z2.setEnd(a);
                                        z2.setSynced(false);
                                        b0.F(p2.M).setSynced(false);
                                        studentAbsence = z2;
                                        j = (Iterator<Number>)iterator;
                                        k = i;
                                        h3 = h2;
                                        g = a;
                                        p = p2;
                                        break Label_0825;
                                    }
                                    if (b0.this.L0(z2)) {
                                        ((Iterator)iterator).remove();
                                        final a e = b0.E(p2.M);
                                        p2.G = a;
                                        p2.H = h2;
                                        p2.I = i;
                                        p2.J = iterator;
                                        p2.K = z2;
                                        p2.L = 1;
                                        studentAbsence = z2;
                                        p = p2;
                                        if (e.f(z2, p2) == h) {
                                            return h;
                                        }
                                        break Label_0619;
                                    }
                                    else {
                                        studentAbsence = z2;
                                        j = (Iterator<Number>)iterator;
                                        k = i;
                                        h3 = h2;
                                        g = a;
                                        p = p2;
                                        if (!b0.this.C0(z2)) {
                                            break Label_0825;
                                        }
                                        z2.setPeriodId(b0.G(p2.M).getId());
                                        z2.setEnd(a);
                                        z2.setSynced(false);
                                        b0.F(p2.M).setSynced(false);
                                        studentAbsence = z2;
                                        j = (Iterator<Number>)iterator;
                                        k = i;
                                        h3 = h2;
                                        g = a;
                                        p = p2;
                                        if (((org.joda.time.base.c)z2.getStart()).R((l0)b0.G(p2.M).getStart())) {
                                            z2.setStart(b0.G(p2.M).getStart());
                                            p = p2;
                                            g = a;
                                            h3 = h2;
                                            k = i;
                                            j = (Iterator<Number>)iterator;
                                            studentAbsence = z2;
                                        }
                                        break Label_0825;
                                    }
                                }
                                break Label_0911;
                            }
                            b0.F(p.M).setSynced(false);
                            ((ArrayList<StudentAbsence>)i).add(b0.this.M(p.N));
                            j = (Iterator<Number>)iterator;
                            k = i;
                            h3 = h2;
                            g = a;
                        }
                        final a e2 = b0.E(p.M);
                        p.G = g;
                        p.H = h3;
                        p.I = k;
                        p.J = j;
                        p.K = null;
                        p.L = 2;
                        Object iterator = j;
                        i = k;
                        List<Object> h2 = h3;
                        c a = g;
                        p2 = p;
                        if (e2.a(studentAbsence, p) == h) {
                            return h;
                        }
                        continue;
                    }
                }
                final Set<Long> absences2 = b0.F(p2.M).getAbsences();
                final ArrayList list2 = new ArrayList<Long>(kotlin.collections.v.Y((Iterable<?>)i, 10));
                final Iterator<StudentAbsence> iterator4 = ((Iterable<StudentAbsence>)i).iterator();
                while (iterator4.hasNext()) {
                    list2.add(kotlin.coroutines.jvm.internal.b.g(iterator4.next().getId()));
                }
                absences2.addAll((Collection<? extends Long>)list2);
                b0.F(p2.M).setAbsencesChecked(b0.this.j0());
                final a e3 = b0.E(p2.M);
                final Classbook f = b0.F(p2.M);
                p2.G = null;
                p2.H = null;
                p2.I = null;
                p2.J = null;
                p2.L = 3;
                if (e3.a0(f, p2) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 1, (Object)null);
    }
    
    public static final /* synthetic */ Period G(final b0 b0) {
        return b0.c;
    }
    
    private final void G0(final Student student) {
        kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            Object I;
            int J;
            final /* synthetic */ b0 K;
            final /* synthetic */ Student L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    Object I;
                    int J;
                    final /* synthetic */ b0 K = this.K;
                    final /* synthetic */ Student L = this.L;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((b0$h)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int j = this.J;
                p<r0, kotlin.coroutines.d<? super j2>, Object> p2 = null;
                Label_1026: {
                    while (true) {
                        Iterator<Number> iterator = null;
                        List<Long> list = null;
                        List<Long> list2 = null;
                        p<r0, kotlin.coroutines.d<? super j2>, Object> p = null;
                        Label_0772: {
                            List<Long> list5;
                            List<Long> list7;
                            Object iterator8;
                            p<r0, kotlin.coroutines.d<? super j2>, Object> p3;
                            if (j != 0) {
                                if (j == 1 || j == 2) {
                                    iterator = (Iterator<Number>)this.I;
                                    list = (List<Long>)this.H;
                                    list2 = (List<Long>)this.G;
                                    c1.n(o);
                                    p = this;
                                    break Label_0772;
                                }
                                if (j == 3) {
                                    c1.n(o);
                                    p2 = this;
                                    break Label_1026;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                final Set<Long> absences = b0.F(this.K).getAbsences();
                                final b0 k = this.K;
                                final ArrayList<StudentAbsence> list3 = new ArrayList<StudentAbsence>();
                                final Iterator<Number> iterator2 = absences.iterator();
                                while (iterator2.hasNext()) {
                                    final StudentAbsence z = b0.E(k).Z(iterator2.next().longValue());
                                    if (z != null) {
                                        list3.add(z);
                                    }
                                }
                                final Student l = this.L;
                                o = new ArrayList();
                                for (final StudentAbsence next : list3) {
                                    if (kotlin.coroutines.jvm.internal.b.a(k0.g(next.getStudent(), l))) {
                                        ((Collection<StudentAbsence>)o).add(next);
                                    }
                                }
                                final b0 i = this.K;
                                final ArrayList<StudentAbsence> list4 = new ArrayList<StudentAbsence>();
                                for (final StudentAbsence next2 : o) {
                                    final StudentAbsence studentAbsence = next2;
                                    if (kotlin.coroutines.jvm.internal.b.a(((org.joda.time.base.c)studentAbsence.getStart()).R((l0)b0.G(i).getStart()) || ((org.joda.time.base.c)studentAbsence.getStart()).X4((l0)b0.G(i).getStart()))) {
                                        list4.add(next2);
                                    }
                                }
                                list5 = new ArrayList<Long>(kotlin.collections.v.Y((Iterable<?>)list4, 10));
                                final Iterator<Object> iterator5 = list4.iterator();
                                while (iterator5.hasNext()) {
                                    list5.add(kotlin.coroutines.jvm.internal.b.g(iterator5.next().getId()));
                                }
                                final b0 m = this.K;
                                final ArrayList<StudentAbsence> list6 = new ArrayList<StudentAbsence>();
                                for (final StudentAbsence next3 : o) {
                                    final StudentAbsence studentAbsence2 = next3;
                                    if (kotlin.coroutines.jvm.internal.b.a(((org.joda.time.base.c)studentAbsence2.getStart()).C((l0)b0.G(m).getStart()) && ((org.joda.time.base.c)studentAbsence2.getEnd()).R((l0)b0.G(m).getStart()))) {
                                        list6.add(next3);
                                    }
                                }
                                list7 = new ArrayList<Long>(kotlin.collections.v.Y((Iterable<?>)list6, 10));
                                final Iterator<Object> iterator7 = list6.iterator();
                                while (iterator7.hasNext()) {
                                    list7.add(kotlin.coroutines.jvm.internal.b.g(iterator7.next().getId()));
                                }
                                Log.d("untis_log", k0.C("absences ", kotlin.coroutines.jvm.internal.b.f(((List)o).size())));
                                iterator8 = b0.F(this.K).getAbsences().iterator();
                                p3 = this;
                            }
                            while (((Iterator)iterator8).hasNext()) {
                                final long longValue = ((Iterator<Number>)iterator8).next().longValue();
                                if (list5.contains(kotlin.coroutines.jvm.internal.b.g(longValue))) {
                                    ((Iterator)iterator8).remove();
                                    final a e = b0.E(p3.K);
                                    p3.G = list5;
                                    p3.H = list7;
                                    p3.I = iterator8;
                                    p3.J = 1;
                                    iterator = (Iterator<Number>)iterator8;
                                    list = list7;
                                    list2 = list5;
                                    p = p3;
                                    if (e.O(longValue, p3) == h) {
                                        return h;
                                    }
                                    break Label_0772;
                                }
                                else {
                                    if (!list7.contains(kotlin.coroutines.jvm.internal.b.g(longValue))) {
                                        continue;
                                    }
                                    final StudentAbsence z2 = b0.E(p3.K).Z(longValue);
                                    iterator = (Iterator<Number>)iterator8;
                                    list = list7;
                                    list2 = list5;
                                    p = p3;
                                    if (z2 == null) {
                                        break Label_0772;
                                    }
                                    z2.setPeriodId(b0.G(p3.K).getId());
                                    z2.setSynced(false);
                                    z2.setEnd(b0.G(p3.K).getStart());
                                    final a e2 = b0.E(p3.K);
                                    p3.G = list5;
                                    p3.H = list7;
                                    p3.I = iterator8;
                                    p3.J = 2;
                                    iterator = (Iterator<Number>)iterator8;
                                    list = list7;
                                    list2 = list5;
                                    p = p3;
                                    if (e2.a(z2, p3) == h) {
                                        return h;
                                    }
                                    break Label_0772;
                                }
                            }
                            b0.F(p3.K).setAbsencesChecked(b0.this.j0());
                            final a e3 = b0.E(p3.K);
                            final Classbook f = b0.F(p3.K);
                            p3.G = null;
                            p3.H = null;
                            p3.I = null;
                            p3.J = 3;
                            p2 = p3;
                            if (e3.a0(f, p3) == h) {
                                return h;
                            }
                            break Label_1026;
                        }
                        b0.F(p.K).setSynced(false);
                        Object iterator8 = iterator;
                        List<Long> list7 = list;
                        List<Long> list5 = list2;
                        p<r0, kotlin.coroutines.d<? super j2>, Object> p3 = p;
                        continue;
                    }
                }
                b0.this.b1();
                return j2.a;
            }
        }, 1, (Object)null);
    }
    
    private final boolean H0() {
        return true;
    }
    
    private final void I0() {
        this.a.R();
    }
    
    private final boolean J0(final Student student) {
        return this.b0(student) && !this.d0(student);
    }
    
    private final boolean K0(final Student student) {
        return this.c0(student) && !this.d0(student);
    }
    
    private final StudentAbsence L(final Student student) {
        return (StudentAbsence)kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super StudentAbsence>, Object>() {
            int G;
            final /* synthetic */ b0 H;
            final /* synthetic */ Student I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super StudentAbsence>, Object>() {
                    int G;
                    final /* synthetic */ b0 H = this.H;
                    final /* synthetic */ Student I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super StudentAbsence> d) {
                return ((b0$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object a) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(a);
                }
                else {
                    c1.n(a);
                    final a e = b0.E(this.H);
                    final StudentAbsence studentAbsence = new StudentAbsence(0L, b0.G(this.H).getId(), this.I, null, b0.G(this.H).getStart(), b0.G(this.H).getEnd(), false, b0.E(this.H).B(), false, null, null, false, 1865, null);
                    this.G = 1;
                    if ((a = e.a(studentAbsence, this)) == h) {
                        return h;
                    }
                }
                return a;
            }
        }, 1, (Object)null);
    }
    
    private final boolean L0(final StudentAbsence studentAbsence) {
        return ((org.joda.time.base.c)studentAbsence.getStart()).g();
    }
    
    private final StudentAbsence M(final Student student) {
        return (StudentAbsence)kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super StudentAbsence>, Object>() {
            int G;
            final /* synthetic */ b0 H;
            final /* synthetic */ Student I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super StudentAbsence>, Object>() {
                    int G;
                    final /* synthetic */ b0 H = this.H;
                    final /* synthetic */ Student I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super StudentAbsence> d) {
                return ((b0$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object a) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(a);
                }
                else {
                    c1.n(a);
                    final a e = b0.E(this.H);
                    final StudentAbsence studentAbsence = new StudentAbsence(0L, b0.G(this.H).getId(), this.I, null, b0.G(this.H).getStart(), com.untis.mobile.utils.time.a.a(), false, b0.E(this.H).i(), false, null, null, false, 1865, null);
                    this.G = 1;
                    if ((a = e.a(studentAbsence, this)) == h) {
                        return h;
                    }
                }
                return a;
            }
        }, 1, (Object)null);
    }
    
    private final void M0(final Student student) {
        this.I0();
        if (this.b.getSchoolApiVersion() >= 102) {
            this.N0(student);
        }
        else {
            this.E0(student);
            this.i0();
            this.b1();
        }
    }
    
    private final void N() {
        if (this.j0() && !this.f) {
            com.untis.mobile.utils.extension.h.o((Context)this.a, 2131886215);
            this.f = true;
        }
    }
    
    private final void N0(final Student student) {
        this.h.L(this.c, student).C5((rx.functions.b)new com.untis.mobile.ui.activities.classbook.o(this, student), (rx.functions.b)new com.untis.mobile.ui.activities.classbook.k(this));
    }
    
    private final boolean O(final StudentAbsence studentAbsence) {
        final k i = this.i;
        final t h1 = this.c.getStart().h1();
        k0.o(h1, "period.start.toLocalDate()");
        final List<TimeGridUnit> n = i.n(h1);
        final ArrayList<TimeGridUnit> list = new ArrayList<TimeGridUnit>();
        for (final TimeGridUnit next : n) {
            if (((org.joda.time.base.e)next.getStart()).o((n0)this.c.getStart().j1())) {
                list.add(next);
            }
        }
        final List<Object> h2 = kotlin.collections.v.h5((Iterable<?>)list, (Comparator<? super Object>)com.untis.mobile.ui.activities.classbook.z.G);
        return h2.isEmpty() || ((org.joda.time.base.e)((TimeGridUnit)kotlin.collections.v.c3((List<?>)h2)).getEnd()).p((n0)studentAbsence.getEnd().j1());
    }
    
    private static final void O0(final b0 b0, final Student student, final List list) {
        k0.p(b0, "this$0");
        k0.p(student, "$student");
        k0.o(list, "absences");
        b0.c1(student, list, true);
        b0.i0();
        b0.b1();
        b0.N();
    }
    
    private static final int P(final TimeGridUnit timeGridUnit, final TimeGridUnit timeGridUnit2) {
        return timeGridUnit.getStart().b((n0)timeGridUnit2.getStart());
    }
    
    private static final void P0(final b0 b0, final Throwable t) {
        k0.p(b0, "this$0");
        Log.e("untis_log", "error while submitInstantAbsence", t);
        b0.i0();
        u0.d(b0.a.findViewById(com.untis.mobile.c.i.U3), t);
    }
    
    private final String Q(final StudentAbsence studentAbsence) {
        final AbsenceReason absenceReason = studentAbsence.getAbsenceReason();
        if (absenceReason == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(" (");
        sb.append(absenceReason.getDisplayName());
        sb.append(')');
        return sb.toString();
    }
    
    private final void Q0(final Student student) {
        Log.d("untis_log", "submitInstantLateness");
        this.h.M(this.c, student).C5((rx.functions.b)new n(this, student), (rx.functions.b)new l(this));
    }
    
    private final String R(final Student student) {
        final Set<Long> absences = this.d.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final StudentAbsence z = this.h.Z(iterator.next().longValue());
            if (z != null) {
                list.add(z);
            }
        }
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        final Iterator<Object> iterator2 = list.iterator();
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            final boolean b = false;
            if (!hasNext) {
                break;
            }
            final StudentAbsence next = iterator2.next();
            final StudentAbsence studentAbsence = next;
            int n = b ? 1 : 0;
            if (k0.g(studentAbsence.getStudent(), student)) {
                n = (b ? 1 : 0);
                if (!this.k0(this.c, studentAbsence)) {
                    n = 1;
                }
            }
            if (n == 0) {
                continue;
            }
            list2.add(next);
        }
        if (list2.size() == 1) {
            return k0.C(((Activity)this.a).getString(2131886802), this.Q((StudentAbsence)list2.get(0)));
        }
        final String string = ((Activity)this.a).getString(2131886802);
        k0.o(string, "activity.getString(R.string.students_absent_text)");
        return string;
    }
    
    private static final void R0(final b0 b0, final Student student, final List list) {
        k0.p(b0, "this$0");
        k0.p(student, "$student");
        if (list == null) {
            return;
        }
        k0.o(list, "absences");
        b0.c1(student, list, true);
        b0.i0();
        b0.b1();
        b0.N();
    }
    
    private final Drawable S(final Student student) {
        if (this.f0(student)) {
            if (this.d0(student)) {
                return this.x;
            }
            return this.w;
        }
        else {
            if (this.h0(student)) {
                return this.v;
            }
            if (this.g0(student)) {
                return this.t;
            }
            if (this.d0(student)) {
                return this.u;
            }
            return this.s;
        }
    }
    
    private static final void S0(final b0 b0, final Throwable t) {
        k0.p(b0, "this$0");
        Log.e("untis_log", "error while submitInstantLateness", t);
        b0.i0();
        u0.d(b0.a.findViewById(com.untis.mobile.c.i.U3), t);
    }
    
    private final int T(final Student student) {
        while (true) {
            for (final Event next : this.d.getEvents()) {
                final Event event = next;
                if (event.getEntityType() == EntityType.STUDENT && event.getEntityId() == student.entityId()) {
                    final Object o = next;
                    if (o != null) {
                        return this.o;
                    }
                    return this.p;
                }
            }
            final Object o = null;
            continue;
        }
    }
    
    private final void T0(final Student student) {
        final Set<Long> absences = this.d.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final StudentAbsence z = this.h.Z(iterator.next().longValue());
            if (z != null) {
                list.add(z);
            }
        }
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        for (final StudentAbsence next : list) {
            if (k0.g(next.getStudent(), student)) {
                list2.add(next);
            }
        }
        final ArrayList<StudentAbsence> list3 = (ArrayList<StudentAbsence>)new ArrayList<Object>();
        final Iterator<Object> iterator3 = list2.iterator();
        while (true) {
            final boolean hasNext = iterator3.hasNext();
            boolean b = false;
            if (!hasNext) {
                break;
            }
            final StudentAbsence next2 = iterator3.next();
            final StudentAbsence studentAbsence = next2;
            if (((org.joda.time.base.c)studentAbsence.getStart()).R((l0)this.c.getStart()) || ((org.joda.time.base.c)studentAbsence.getStart()).X4((l0)this.c.getStart()) || this.z(studentAbsence)) {
                b = true;
            }
            if (!b) {
                continue;
            }
            list3.add(next2);
        }
        final ArrayList<StudentAbsence> list4 = new ArrayList<StudentAbsence>();
        for (final StudentAbsence next3 : list) {
            if (k0.g(next3.getStudent(), student)) {
                list4.add(next3);
            }
        }
        final ArrayList<Object> list5 = new ArrayList<Object>();
        for (final StudentAbsence next4 : list4) {
            final StudentAbsence studentAbsence2 = next4;
            if (((org.joda.time.base.c)studentAbsence2.getStart()).C((l0)this.c.getStart()) && ((org.joda.time.base.c)studentAbsence2.getEnd()).R((l0)this.c.getStart()) && !this.z(studentAbsence2)) {
                list5.add(next4);
            }
        }
        final j1.f f = new j1.f();
        f.G = list3.size() + list5.size();
        for (final StudentAbsence studentAbsence3 : list3) {
            this.h.x(this.c, studentAbsence3).C5((rx.functions.b)new m(this, studentAbsence3, f), (rx.functions.b)new com.untis.mobile.ui.activities.classbook.r(f, this));
        }
        for (final StudentAbsence studentAbsence4 : list5) {
            studentAbsence4.setEnd(this.c.getStart());
            com.untis.mobile.services.classbook.a.a.c(this.h, this.c, studentAbsence4, null, 4, null).C5((rx.functions.b)new com.untis.mobile.ui.activities.classbook.p(this, student, f), (rx.functions.b)new q(f, this));
        }
        if (list3.isEmpty() && list5.isEmpty()) {
            this.i0();
        }
    }
    
    private final Drawable U(final Student student) {
        while (true) {
            for (final Event next : this.d.getEvents()) {
                final Event event = next;
                if (event.getEntityType() == EntityType.STUDENT && event.getEntityId() == student.entityId()) {
                    final Object o = next;
                    if (o != null) {
                        return this.q;
                    }
                    return this.r;
                }
            }
            final Object o = null;
            continue;
        }
    }
    
    private static final void U0(final b0 b0, final StudentAbsence studentAbsence, final j1.f f, final Boolean b2) {
        k0.p(b0, "this$0");
        k0.p(studentAbsence, "$absence");
        k0.p(f, "$counter");
        k0.o(b2, "success");
        if (b2) {
            b0.D0(studentAbsence, true);
            b0.b1();
            --f.G;
        }
        if (f.G <= 0) {
            b0.i0();
            b0.N();
        }
    }
    
    private final String V(final Student student) {
        final Set<Long> absences = this.d.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final StudentAbsence z = this.h.Z(iterator.next().longValue());
            if (z != null) {
                list.add(z);
            }
        }
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        final Iterator<Object> iterator2 = list.iterator();
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            final boolean b = false;
            if (!hasNext) {
                break;
            }
            final StudentAbsence next = iterator2.next();
            final StudentAbsence studentAbsence = next;
            int n = b ? 1 : 0;
            if (k0.g(studentAbsence.getStudent(), student)) {
                n = (b ? 1 : 0);
                if (this.k0(this.c, studentAbsence)) {
                    n = 1;
                }
            }
            if (n == 0) {
                continue;
            }
            list2.add(next);
        }
        if (list2.isEmpty()) {
            Log.e("untis_log", "this student is not late");
            return "";
        }
        if (list2.size() == 1) {
            final StudentAbsence studentAbsence2 = list2.get(0);
            if (((org.joda.time.base.c)studentAbsence2.getStart()).R((l0)this.c.getStart())) {
                final String string = ((Activity)this.a).getString(2131886804);
                k0.o(string, "activity.getString(R.string.students_leftAt_text)");
                final String g4 = ((org.joda.time.base.a)studentAbsence2.getStart()).g4("H:mm");
                k0.o(g4, "studentAbsence.start.toString(\"H:mm\")");
                return k0.C(kotlin.text.s.k2(string, "{0}", g4, false, 4, (Object)null), this.Q(studentAbsence2));
            }
            if (((org.joda.time.base.c)studentAbsence2.getEnd()).C((l0)this.c.getEnd())) {
                final String string2 = ((Activity)this.a).getString(2131886803);
                k0.o(string2, "activity.getString(R.string.students_arrivedAt_text)");
                final String g5 = ((org.joda.time.base.a)studentAbsence2.getEnd()).g4("H:mm");
                k0.o(g5, "studentAbsence.end.toString(\"H:mm\")");
                return k0.C(kotlin.text.s.k2(string2, "{0}", g5, false, 4, (Object)null), this.Q(studentAbsence2));
            }
        }
        final String string3 = ((Activity)this.a).getString(2131886802);
        k0.o(string3, "activity.getString(R.string.students_absent_text)");
        return string3;
    }
    
    private static final void V0(final j1.f f, final b0 b0, final Throwable t) {
        k0.p(f, "$counter");
        k0.p(b0, "this$0");
        Log.e("untis_log", "error while deleting absences for presence", t);
        final int g = f.G - 1;
        f.G = g;
        if (g <= 0) {
            b0.i0();
        }
        u0.d(b0.a.findViewById(com.untis.mobile.c.i.U3), t);
    }
    
    private static final void W0(final b0 b0, final Student student, final j1.f f, final StudentAbsenceResult studentAbsenceResult) {
        k0.p(b0, "this$0");
        k0.p(student, "$student");
        k0.p(f, "$counter");
        if (studentAbsenceResult.getAbsences().isEmpty() ^ true) {
            b0.c1(student, studentAbsenceResult.getAbsences(), true);
            b0.b1();
            --f.G;
        }
        if (f.G <= 0) {
            b0.i0();
            b0.N();
        }
    }
    
    private static final void X0(final j1.f f, final b0 b0, final Throwable t) {
        k0.p(f, "$counter");
        k0.p(b0, "this$0");
        Log.e("untis_log", "error while shortening absences to presence", t);
        final int g = f.G - 1;
        f.G = g;
        if (g <= 0) {
            b0.i0();
        }
        u0.d(b0.a.findViewById(com.untis.mobile.c.i.U3), t);
    }
    
    private static final int Y(final Student student, final Student student2) {
        String s = student.getLastName();
        final String lastName = student2.getLastName();
        final int length = s.length();
        final int n = 1;
        if (length == 0) {
            s = student.getDisplayableTitle();
        }
        int n2;
        if (lastName.length() == 0) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        String displayableTitle = lastName;
        if (n2 != 0) {
            displayableTitle = student2.getDisplayableTitle();
        }
        return com.untis.mobile.utils.comparator.b.G.b(s, displayableTitle);
    }
    
    private final void Y0(final Student student) {
        Log.d("untis_log", "submitlateness");
        this.I0();
        if (this.b.getSchoolApiVersion() >= 102) {
            this.Q0(student);
        }
        else {
            this.F0(student);
            this.i0();
            this.b1();
        }
    }
    
    private final String Z(final Student student) {
        String s;
        String s2;
        if (this.h0(student)) {
            if (this.l0(student)) {
                s = ((Activity)this.a).getString(2131886808);
                s2 = "activity.getString(R.string.students_prioritizedAttendanceExam_text)";
            }
            else {
                s = ((Activity)this.a).getString(2131886807);
                s2 = "activity.getString(R.string.students_prioritizedAttendanceActivity_text)";
            }
        }
        else if (this.f0(student)) {
            s = ((Activity)this.a).getString(2131886219);
            s2 = "activity.getString(R.string.classbook_exempt_text)";
        }
        else {
            if (this.g0(student)) {
                return this.V(student);
            }
            if (this.d0(student)) {
                return this.R(student);
            }
            if (this.b0(student)) {
                s = ((Activity)this.a).getString(2131886223);
                s2 = "activity.getString(R.string.classbook_thereafterAbsence_text)";
            }
            else {
                if (!this.c0(student)) {
                    return "";
                }
                s = ((Activity)this.a).getString(2131886222);
                s2 = "activity.getString(R.string.classbook_previousAbsent_text)";
            }
        }
        k0.o(s, s2);
        return s;
    }
    
    private final void Z0(final Student student) {
        this.I0();
        if (this.b.getSchoolApiVersion() >= 102) {
            this.T0(student);
        }
        else {
            this.G0(student);
            this.i0();
        }
    }
    
    private final String a0(final Student student) {
        final StringBuilder sb = new StringBuilder();
        sb.append(student.getLastName());
        sb.append(' ');
        sb.append(student.getFirstName());
        final String string = sb.toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
        return kotlin.text.s.B5((CharSequence)string).toString();
    }
    
    private final boolean b0(final Student student) {
        final Set<Long> absences = this.d.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final StudentAbsence z = this.h.Z(iterator.next().longValue());
            if (z != null) {
                list.add(z);
            }
        }
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        for (final StudentAbsence next : list) {
            if (k0.g(next.getStudent(), student)) {
                list2.add(next);
            }
        }
        final Iterator<Object> iterator3 = list2.iterator();
        while (true) {
            StudentAbsence studentAbsence;
            do {
                final boolean hasNext = iterator3.hasNext();
                boolean b = false;
                if (!hasNext) {
                    final StudentAbsence next2 = null;
                    if (next2 != null) {
                        b = true;
                    }
                    return b;
                }
                final StudentAbsence next2 = iterator3.next();
                studentAbsence = next2;
            } while (!((org.joda.time.base.c)studentAbsence.getStart()).R((l0)this.c.getEnd()) && !((org.joda.time.base.c)studentAbsence.getStart()).X4((l0)this.c.getEnd()));
            continue;
        }
    }
    
    private final void b1() {
        Log.d("untis_log", "kairo updateClassbookPageFragments");
        final List g0 = ((androidx.fragment.app.d)this.a).getSupportFragmentManager().G0();
        k0.o(g0, "activity.supportFragmentManager.fragments");
        final ArrayList<ClassbookPageFragment> list = new ArrayList<ClassbookPageFragment>();
        for (final ClassbookPageFragment next : g0) {
            if (next instanceof ClassbookPageFragment) {
                list.add(next);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            ClassbookPageFragment.v(iterator2.next(), null, null, 3, null);
        }
        this.a.d0(true);
    }
    
    private final boolean c0(final Student student) {
        final Set<Long> absences = this.d.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final StudentAbsence z = this.h.Z(iterator.next().longValue());
            if (z != null) {
                list.add(z);
            }
        }
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        for (final StudentAbsence next : list) {
            if (k0.g(next.getStudent(), student)) {
                list2.add(next);
            }
        }
        final Iterator<Object> iterator3 = list2.iterator();
        while (true) {
            StudentAbsence studentAbsence;
            do {
                final boolean hasNext = iterator3.hasNext();
                boolean b = false;
                if (!hasNext) {
                    final StudentAbsence next2 = null;
                    if (next2 != null) {
                        b = true;
                    }
                    return b;
                }
                final StudentAbsence next2 = iterator3.next();
                studentAbsence = next2;
            } while (!((org.joda.time.base.c)studentAbsence.getEnd()).C((l0)this.c.getStart()) && !((org.joda.time.base.c)studentAbsence.getEnd()).X4((l0)this.c.getStart()));
            continue;
        }
    }
    
    private final void c1(final Student student, final List<StudentAbsence> list, final boolean b) {
        kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(b) {
            Object G;
            Object H;
            int I;
            final /* synthetic */ b0 J;
            final /* synthetic */ Student K;
            final /* synthetic */ List<StudentAbsence> L;
            final /* synthetic */ boolean M;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ b0 J = this.J;
                    final /* synthetic */ Student K = this.K;
                    final /* synthetic */ List<StudentAbsence> L = this.L;
                    final /* synthetic */ boolean M = this.M;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((b0$i)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int i = this.I;
                while (true) {
                    List<Object> l5 = null;
                    Iterator<StudentAbsence> iterator = null;
                    Label_0147: {
                        if (i == 0) {
                            c1.n(o);
                            Log.d("untis_log", "updatePeriodAbsencesForStudent");
                            l5 = kotlin.collections.v.L5((Collection<?>)b0.E(this.J).u(b0.F(this.J).getAbsences()));
                            iterator = l5.iterator();
                            break Label_0147;
                        }
                        if (i == 1) {
                            iterator = (Iterator<StudentAbsence>)this.H;
                            final List list = (List)this.G;
                            c1.n(o);
                            l5 = (List<Object>)list;
                            break Label_0147;
                        }
                        Iterator<Object> iterator2;
                        b0 j;
                        if (i != 2) {
                            if (i == 3) {
                                c1.n(o);
                                return j2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            iterator2 = (Iterator<Object>)this.H;
                            final b0 b0 = (b0)this.G;
                            c1.n(o);
                            j = b0;
                        }
                        while (iterator2.hasNext()) {
                            final StudentAbsence studentAbsence = iterator2.next();
                            final a e = b0.E(j);
                            this.G = j;
                            this.H = iterator2;
                            this.I = 2;
                            if (e.a(studentAbsence, this) == h) {
                                return h;
                            }
                        }
                        b0.F(this.J).setAbsencesChecked(b0.this.j0());
                        final a e2 = b0.E(this.J);
                        final Classbook f = b0.F(this.J);
                        this.G = null;
                        this.H = null;
                        this.I = 3;
                        if (e2.a0(f, this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                    while (iterator.hasNext()) {
                        final StudentAbsence studentAbsence2 = iterator.next();
                        if (studentAbsence2.getStudent().getId() == this.K.getId()) {
                            iterator.remove();
                            final a e3 = b0.E(this.J);
                            final long id = studentAbsence2.getId();
                            this.G = l5;
                            this.H = iterator;
                            this.I = 1;
                            if (e3.O(id, this) == h) {
                                return h;
                            }
                            continue;
                        }
                    }
                    kotlin.collections.v.q0((Collection<? super Object>)l5, (Iterable<?>)this.L);
                    final Classbook f2 = b0.F(this.J);
                    final ArrayList list2 = new ArrayList<Long>(kotlin.collections.v.Y((Iterable<?>)l5, 10));
                    final Iterator<StudentAbsence> iterator3 = l5.iterator();
                    while (iterator3.hasNext()) {
                        list2.add(kotlin.coroutines.jvm.internal.b.g(iterator3.next().getId()));
                    }
                    f2.setAbsences(kotlin.collections.v.M5((Iterable<? extends Long>)list2));
                    b0.F(this.J).setSynced(this.M);
                    final List<StudentAbsence> k = this.L;
                    b0 j = this.J;
                    Iterator<Object> iterator2 = k.iterator();
                    continue;
                }
            }
        }, 1, (Object)null);
    }
    
    private final boolean e0(final Student student) {
        final Set<Event> events = this.d.getEvents();
        final boolean b = events instanceof Collection;
        boolean b2 = true;
        if (!b || !events.isEmpty()) {
            for (final Event event : events) {
                if (event.getEntityType() == EntityType.STUDENT && event.getEntityId() == student.entityId()) {
                    return b2;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    private final boolean f0(final Student student) {
        for (final Exemption next : this.d.getExemptions()) {
            if (k0.g(next.getStudent(), student)) {
                final Object o = next;
                return o != null;
            }
        }
        final Object o = null;
        return o != null;
    }
    
    private final boolean g0(final Student student) {
        final Set<Long> absences = this.d.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final StudentAbsence z = this.h.Z(iterator.next().longValue());
            if (z != null) {
                list.add(z);
            }
        }
        final boolean empty = list.isEmpty();
        boolean b = true;
        if (!empty) {
            for (final StudentAbsence studentAbsence : list) {
                if (k0.g(studentAbsence.getStudent(), student) && this.k0(this.c, studentAbsence)) {
                    return b;
                }
            }
        }
        b = false;
        return b;
    }
    
    private final boolean h0(final Student student) {
        for (final PrioritizedAttendance next : this.d.getPrioritizedAttendances()) {
            if (k0.g(next.getStudent(), student)) {
                final Object o = next;
                return o != null;
            }
        }
        final Object o = null;
        return o != null;
    }
    
    private final void i0() {
        this.a.K();
    }
    
    private final boolean j0() {
        return ((org.joda.time.base.c)this.c.getStart()).C((l0)com.untis.mobile.utils.v.a.e().U0((int)this.b.getSchoolServerDelta()).V0(15));
    }
    
    private final boolean k0(final Period period, final StudentAbsence studentAbsence) {
        return !((org.joda.time.base.c)studentAbsence.getEnd()).C((l0)period.getStart()) && !((org.joda.time.base.c)studentAbsence.getStart()).R((l0)period.getEnd()) && ((((org.joda.time.base.c)studentAbsence.getStart()).C((l0)period.getEnd()) && ((org.joda.time.base.c)studentAbsence.getStart()).R((l0)period.getStart())) || (((org.joda.time.base.c)studentAbsence.getEnd()).R((l0)period.getStart()) && ((org.joda.time.base.c)studentAbsence.getEnd()).C((l0)period.getEnd())));
    }
    
    private final boolean l0(final Student student) {
        final Set<PrioritizedAttendance> prioritizedAttendances = this.d.getPrioritizedAttendances();
        final boolean b = prioritizedAttendances instanceof Collection;
        boolean b2 = true;
        if (!b || !prioritizedAttendances.isEmpty()) {
            for (final PrioritizedAttendance prioritizedAttendance : prioritizedAttendances) {
                if (k0.g(prioritizedAttendance.getStudent(), student) && prioritizedAttendance.getType() == PrioritizedAttendanceType.EXAM) {
                    return b2;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    private final void m0(final Student student) {
        final Set<Long> absences = this.d.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final StudentAbsence z = this.h.Z(iterator.next().longValue());
            if (z != null) {
                list.add(z);
            }
        }
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        for (final StudentAbsence next : list) {
            if (k0.g(next.getStudent(), student)) {
                list2.add(next);
            }
        }
        ClassbookActivity classbookActivity;
        Intent intent;
        if (list2.isEmpty()) {
            classbookActivity = this.a;
            intent = AbsenceDetailActivity.M.b((Context)classbookActivity, this.b.getUniqueId(), student, this.c);
        }
        else {
            classbookActivity = this.a;
            intent = AbsencesActivity.M.a((Context)classbookActivity, this.b.getUniqueId(), this.c, student, list2);
        }
        ((ComponentActivity)classbookActivity).startActivityForResult(intent, 1300);
    }
    
    private static final void o0(final b0 b0, final Student student, final View view) {
        k0.p(b0, "this$0");
        k0.p(student, "$student");
        b0.x0(student);
    }
    
    private static final void p0(final b0 b0, final Student student, final View view) {
        k0.p(b0, "this$0");
        k0.p(student, "$student");
        b0.m0(student);
    }
    
    private static final void q0(final b0 b0, final Student student, final View view) {
        k0.p(b0, "this$0");
        k0.p(student, "$student");
        b0.B0(student);
    }
    
    private static final void r0(final b0 b0, final Student student, final View view) {
        k0.p(b0, "this$0");
        k0.p(student, "$student");
        b0.z0(student);
    }
    
    private static final void s0(final b0 b0, final Student student, final View view) {
        k0.p(b0, "this$0");
        k0.p(student, "$student");
        b0.A0(student);
    }
    
    private static final boolean t0(final b0 b0, final Student student, final View view) {
        k0.p(b0, "this$0");
        k0.p(student, "$student");
        return b0.y0(student);
    }
    
    private static final void u0(final b0 b0, final j0 j0, final Student student, final View view) {
        k0.p(b0, "this$0");
        k0.p(j0, "$holder");
        k0.p(student, "$student");
        b0.v0(j0, student);
    }
    
    private final void v0(final j0 j0, final Student student) {
        if (((ViewGroup)j0.itemView.findViewById(com.untis.mobile.c.i.Vu)).getTranslationX() != 0.0f) {
            this.notifyDataSetChanged();
        }
        this.a.Z(student.getId(), false);
    }
    
    private final void x0(final Student student) {
        while (true) {
            for (final Event next : this.d.getEvents()) {
                final Event event = next;
                if (event.getEntityType() == EntityType.STUDENT && event.getEntityId() == student.getId()) {
                    ClassbookActivity classbookActivity;
                    Intent intent;
                    if (next == null) {
                        classbookActivity = this.a;
                        intent = EventDetailActivity.Q.a((Context)classbookActivity, this.b.getUniqueId(), this.c.getId(), new Event(0L, this.c.getId(), EntityType.STUDENT, student.getId(), this.c.getStart(), null, null, false, 225, null), new ArrayList<Long>(), false);
                    }
                    else {
                        classbookActivity = this.a;
                        intent = EventsActivity.R.b((Context)classbookActivity, this.b.getUniqueId(), this.c.getId(), student);
                    }
                    ((ComponentActivity)classbookActivity).startActivityForResult(intent, 1400);
                    return;
                }
            }
            Event next = null;
            continue;
        }
    }
    
    private final boolean y0(final Student student) {
        ClassbookActivity.a0(this.a, student.getId(), false, 2, null);
        return true;
    }
    
    private final boolean z(final StudentAbsence studentAbsence) {
        final k i = this.i;
        final t h1 = this.c.getStart().h1();
        k0.o(h1, "period.start.toLocalDate()");
        final List<TimeGridUnit> n = i.n(h1);
        final ArrayList<TimeGridUnit> list = new ArrayList<TimeGridUnit>();
        for (final TimeGridUnit next : n) {
            if (((org.joda.time.base.e)next.getStart()).o((n0)this.c.getStart().j1())) {
                list.add(next);
            }
        }
        final List<Object> h2 = kotlin.collections.v.h5((Iterable<?>)list, (Comparator<? super Object>)a0.G);
        return (h2.isEmpty() ^ true) && (((org.joda.time.base.e)((TimeGridUnit)kotlin.collections.v.c3((List<?>)h2)).getEnd()).p((n0)studentAbsence.getStart().j1()) || ((org.joda.time.base.e)((TimeGridUnit)kotlin.collections.v.c3((List<?>)h2)).getEnd()).o((n0)studentAbsence.getStart().j1()));
    }
    
    public final void A0(@e final Student student) {
        k0.p(student, "student");
        Log.d("untis_log", "onSetLateClick");
        if (g0.a((Context)this.a)) {
            this.Y0(student);
        }
        else {
            this.F0(student);
            this.b1();
        }
    }
    
    public final void B0(@e final Student student) {
        k0.p(student, "student");
        if (g0.a((Context)this.a)) {
            this.Z0(student);
        }
        else {
            this.G0(student);
        }
        this.b1();
    }
    
    @e
    public final Student W(final int n) {
        return this.X().get(n);
    }
    
    @e
    public final List<Student> X() {
        final List<Student> g = this.g;
        if (g != null) {
            List<Student> e;
            if ((e = g) == null) {
                e = kotlin.collections.v.E();
            }
            return e;
        }
        final long n = ((org.joda.time.base.g)com.untis.mobile.utils.v.a.e()).n();
        Log.i("untis_log", "kairo starting getStudents");
        final Set<Long> absences = this.d.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final StudentAbsence z = this.h.Z(iterator.next().longValue());
            if (z != null) {
                list.add(z);
            }
        }
        final int n2 = b0.a.a[this.e.ordinal()];
        Object i5;
        if (n2 != 1) {
            if (n2 != 2) {
                i5 = kotlin.collections.v.I5((Iterable<?>)this.d.getStudents());
            }
            else {
                final Set<Long> students = this.d.getStudents();
                final ArrayList<Object> list2 = new ArrayList<Object>();
            Label_0181:
                for (final Number next : students) {
                    final long longValue = next.longValue();
                    while (true) {
                        for (final StudentAbsence next2 : list) {
                            final StudentAbsence studentAbsence = next2;
                            boolean b = false;
                            Label_0344: {
                                if (studentAbsence.getStudent().getId() == longValue && !((org.joda.time.base.c)studentAbsence.getEnd()).C((l0)this.c.getStart())) {
                                    if (!((org.joda.time.base.c)studentAbsence.getEnd()).X4((l0)this.c.getStart())) {
                                        if (!((org.joda.time.base.c)studentAbsence.getStart()).R((l0)this.c.getEnd())) {
                                            if (!((org.joda.time.base.c)studentAbsence.getStart()).X4((l0)this.c.getEnd())) {
                                                b = true;
                                                break Label_0344;
                                            }
                                        }
                                    }
                                }
                                b = false;
                            }
                            if (b) {
                                if (next2 == null) {
                                    list2.add(next);
                                }
                                continue Label_0181;
                            }
                        }
                        StudentAbsence next2 = null;
                        continue;
                    }
                }
                i5 = list2;
            }
        }
        else {
            final Set<Long> students2 = this.d.getStudents();
            final ArrayList<Object> list3 = new ArrayList<Object>();
        Label_0416:
            for (final Number next3 : students2) {
                final long longValue2 = next3.longValue();
                while (true) {
                    for (final StudentAbsence next4 : list) {
                        final StudentAbsence studentAbsence2 = next4;
                        boolean b2 = false;
                        Label_0579: {
                            if (studentAbsence2.getStudent().getId() == longValue2 && !((org.joda.time.base.c)studentAbsence2.getEnd()).C((l0)this.c.getStart())) {
                                if (!((org.joda.time.base.c)studentAbsence2.getEnd()).X4((l0)this.c.getStart())) {
                                    if (!((org.joda.time.base.c)studentAbsence2.getStart()).R((l0)this.c.getEnd())) {
                                        if (!((org.joda.time.base.c)studentAbsence2.getStart()).X4((l0)this.c.getEnd())) {
                                            b2 = true;
                                            break Label_0579;
                                        }
                                    }
                                }
                            }
                            b2 = false;
                        }
                        if (b2) {
                            if (next4 != null) {
                                list3.add(next3);
                                continue Label_0416;
                            }
                            continue Label_0416;
                        }
                    }
                    StudentAbsence next4 = null;
                    continue;
                }
            }
            i5 = list3;
        }
        final ArrayList<Student> list4 = new ArrayList<Student>();
        final Iterator<Number> iterator6 = ((Iterable<Number>)i5).iterator();
        while (iterator6.hasNext()) {
            final Student v = this.j.V(iterator6.next().longValue());
            if (v != null) {
                list4.add(v);
            }
        }
        final List<Object> h5 = kotlin.collections.v.h5((Iterable<?>)list4, (Comparator<? super Object>)com.untis.mobile.ui.activities.classbook.y.G);
        this.g = (List<Student>)h5;
        final StringBuilder sb = new StringBuilder();
        sb.append("kairo finishing getStudents after ");
        sb.append(((org.joda.time.base.g)com.untis.mobile.utils.v.a.e()).n() - n);
        sb.append("ms");
        Log.i("untis_log", sb.toString());
        return (List<Student>)h5;
    }
    
    public final void a1(@e final Period c, @e final Classbook d) {
        k0.p(c, "period");
        k0.p(d, "classbook");
        this.c = c;
        this.d = d;
        this.g = null;
        this.notifyDataSetChanged();
    }
    
    public final boolean d0(@e final Student student) {
        k0.p(student, "student");
        final Set<Long> absences = this.d.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final StudentAbsence z = this.h.Z(iterator.next().longValue());
            if (z != null) {
                list.add(z);
            }
        }
        final ArrayList<StudentAbsence> list2 = new ArrayList<StudentAbsence>();
        for (final StudentAbsence next : list) {
            if (k0.g(next.getStudent(), student)) {
                list2.add(next);
            }
        }
        final Iterator<Object> iterator3 = list2.iterator();
        while (true) {
            StudentAbsence studentAbsence;
            do {
                final boolean hasNext = iterator3.hasNext();
                boolean b = true;
                if (!hasNext) {
                    final StudentAbsence next2 = null;
                    if (next2 == null) {
                        b = false;
                    }
                    return b;
                }
                final StudentAbsence next2 = iterator3.next();
                studentAbsence = next2;
            } while ((!((org.joda.time.base.c)studentAbsence.getStart()).X4((l0)this.c.getStart()) && !((org.joda.time.base.c)studentAbsence.getStart()).C((l0)this.c.getStart())) || (!((org.joda.time.base.c)studentAbsence.getEnd()).X4((l0)this.c.getEnd()) && !((org.joda.time.base.c)studentAbsence.getEnd()).R((l0)this.c.getEnd())));
            continue;
        }
    }
    
    public final void d1(@e final HashSet<Long> k) {
        k0.p(k, "selectedStudentIds");
        this.k = k;
        this.notifyDataSetChanged();
    }
    
    public int getItemCount() {
        return this.X().size() + (this.H0() ? 1 : 0);
    }
    
    public void n0(@e final j0 j0, int backgroundColor) {
        k0.p(j0, "holder");
        final int size = this.X().size();
        final int n = 4;
        if (backgroundColor >= size) {
            j0.itemView.setVisibility(4);
            return;
        }
        final Student w = this.W(backgroundColor);
        final View itemView = j0.itemView;
        final int n2 = 0;
        itemView.setVisibility(0);
        ((AppCompatImageView)j0.itemView.findViewById(com.untis.mobile.c.i.Wu)).setImageDrawable(this.S(w));
        ((TextView)j0.itemView.findViewById(com.untis.mobile.c.i.hv)).setText((CharSequence)this.a0(w));
        final View itemView2 = j0.itemView;
        final int zu = com.untis.mobile.c.i.Zu;
        ((TextView)itemView2.findViewById(zu)).setText((CharSequence)this.Z(w));
        final TextView textView = (TextView)j0.itemView.findViewById(zu);
        final CharSequence text = ((TextView)j0.itemView.findViewById(zu)).getText();
        k0.o(text, "holder.itemView.item_classbook_student_subtitle.text");
        int visibility;
        if (text.length() == 0) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        textView.setVisibility(visibility);
        final View viewById = j0.itemView.findViewById(com.untis.mobile.c.i.Yu);
        int visibility2;
        if (this.K0(w)) {
            visibility2 = 0;
        }
        else {
            visibility2 = 4;
        }
        viewById.setVisibility(visibility2);
        final View viewById2 = j0.itemView.findViewById(com.untis.mobile.c.i.Xu);
        int visibility3 = n;
        if (this.J0(w)) {
            visibility3 = 0;
        }
        viewById2.setVisibility(visibility3);
        if ((this.y && this.e0(w)) || this.z) {
            final View itemView3 = j0.itemView;
            final int uu = com.untis.mobile.c.i.Uu;
            final AppCompatImageView appCompatImageView = (AppCompatImageView)itemView3.findViewById(uu);
            int visibility4;
            if (this.k.isEmpty()) {
                visibility4 = 0;
            }
            else {
                visibility4 = 8;
            }
            ((ImageView)appCompatImageView).setVisibility(visibility4);
            ((AppCompatImageView)j0.itemView.findViewById(uu)).setImageDrawable(this.U(w));
            ((ImageView)j0.itemView.findViewById(uu)).setOnClickListener((View$OnClickListener)new j(this, w));
        }
        else {
            ((ImageView)j0.itemView.findViewById(com.untis.mobile.c.i.Uu)).setVisibility(8);
        }
        final View itemView4 = j0.itemView;
        final int tu = com.untis.mobile.c.i.Tu;
        final AppCompatImageView appCompatImageView2 = (AppCompatImageView)itemView4.findViewById(tu);
        int visibility5;
        if (this.k.isEmpty()) {
            visibility5 = n2;
        }
        else {
            visibility5 = 8;
        }
        ((ImageView)appCompatImageView2).setVisibility(visibility5);
        ((ImageView)j0.itemView.findViewById(tu)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.s(this, w));
        ((LinearLayout)j0.itemView.findViewById(com.untis.mobile.c.i.fv)).setOnClickListener((View$OnClickListener)new u(this, w));
        ((LinearLayout)j0.itemView.findViewById(com.untis.mobile.c.i.av)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.v(this, w));
        ((LinearLayout)j0.itemView.findViewById(com.untis.mobile.c.i.cv)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.t(this, w));
        final View itemView5 = j0.itemView;
        final int vu = com.untis.mobile.c.i.Vu;
        ((ViewGroup)itemView5.findViewById(vu)).setTranslationX(0.0f);
        LinearLayoutCompat linearLayoutCompat;
        if (this.k.contains(this.W(backgroundColor).getId())) {
            linearLayoutCompat = (LinearLayoutCompat)j0.itemView.findViewById(vu);
            backgroundColor = this.n;
        }
        else {
            linearLayoutCompat = (LinearLayoutCompat)j0.itemView.findViewById(vu);
            backgroundColor = this.m;
        }
        ((ViewGroup)linearLayoutCompat).setBackgroundColor(backgroundColor);
        ((ViewGroup)j0.itemView.findViewById(vu)).setOnLongClickListener((View$OnLongClickListener)new x(this, w));
        ((ViewGroup)j0.itemView.findViewById(vu)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.classbook.w(this, j0, w));
        final View itemView6 = j0.itemView;
        k0.o(itemView6, "holder.itemView");
        com.untis.mobile.utils.extension.h.c(itemView6, new n6.a<j2>() {
            public final void invoke() {
                final int height = ((ViewGroup)j0.itemView.findViewById(com.untis.mobile.c.i.Vu)).getHeight();
                final StringBuilder sb = new StringBuilder();
                sb.append("height = '");
                sb.append(height);
                sb.append('\'');
                timber.log.b.b(sb.toString(), new Object[0]);
                final LinearLayout linearLayout = (LinearLayout)j0.itemView.findViewById(com.untis.mobile.c.i.dv);
                k0.o(linearLayout, "holder.itemView.item_classbook_student_swipe_left_to_right");
                com.untis.mobile.utils.extension.q.b((View)linearLayout, height);
                final LinearLayout linearLayout2 = (LinearLayout)j0.itemView.findViewById(com.untis.mobile.c.i.ev);
                k0.o(linearLayout2, "holder.itemView.item_classbook_student_swipe_left_to_right_absent_alternative");
                com.untis.mobile.utils.extension.q.b((View)linearLayout2, height);
                final LinearLayout linearLayout3 = (LinearLayout)j0.itemView.findViewById(com.untis.mobile.c.i.gv);
                k0.o(linearLayout3, "holder.itemView.item_classbook_student_swipe_right_to_left");
                com.untis.mobile.utils.extension.q.b((View)linearLayout3, height);
            }
        });
    }
    
    @e
    public j0 w0(@e final ViewGroup viewGroup, final int n) {
        k0.p(viewGroup, "parent");
        final View inflate = this.l.inflate(2131493170, viewGroup, false);
        k0.o(inflate, "inflater.inflate(\n                R.layout.item_classbook_student,\n                parent,\n                false\n            )");
        return new j0(inflate);
    }
    
    public final void z0(@e final Student student) {
        k0.p(student, "student");
        if (g0.a((Context)this.a)) {
            this.M0(student);
        }
        else {
            this.E0(student);
            this.b1();
        }
    }
}
