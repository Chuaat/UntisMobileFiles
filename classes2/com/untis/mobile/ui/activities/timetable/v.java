// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable;

import android.view.ViewGroup$MarginLayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.Button;
import android.app.PendingIntent;
import com.untis.mobile.ui.core.CoreActivity;
import android.content.Intent;
import androidx.cardview.widget.CardView;
import android.view.animation.AnimationUtils;
import org.koin.core.c$a;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.widget.RelativeLayout;
import com.untis.mobile.persistence.models.profile.ProfileState;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.constraintlayout.widget.ConstraintLayout$b;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import com.untis.mobile.persistence.models.timegrid.TimeGridDay;
import com.untis.mobile.persistence.models.timegrid.TimeGrid;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.LayoutInflater;
import com.google.android.material.navigation.NavigationView;
import android.app.Activity;
import com.untis.mobile.ui.fragments.common.UmFragment;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import android.app.DatePickerDialog;
import org.joda.time.s0;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.ui.activities.timetableselection.TeacherTimeTableSelectionActivity;
import com.untis.mobile.ui.activities.timetableselection.SubjectTimeTableSelectionActivity;
import com.untis.mobile.ui.activities.timetableselection.room.RoomSelectionActivity;
import android.widget.DatePicker;
import android.app.DatePickerDialog$OnDateSetListener;
import androidx.fragment.app.Fragment;
import com.untis.mobile.ui.activities.timetableselection.KlassenTimeTableSelectionActivity;
import com.untis.mobile.ui.activities.profile.ProfileEntityActivity;
import androidx.appcompat.app.d$a;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.k2;
import com.untis.mobile.persistence.models.profile.Right;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatButton;
import com.untis.mobile.ui.activities.views.VerticalZoomableScrollView;
import kotlin.jvm.internal.j1;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.utils.e0;
import android.widget.AdapterView$OnItemClickListener;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import com.untis.mobile.services.profile.legacy.j0;
import android.widget.ListAdapter;
import java.util.Objects;
import android.widget.ListView;
import android.widget.AdapterView;
import java.util.Set;
import org.joda.time.n0;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;
import com.untis.mobile.persistence.models.profile.Child;
import java.util.Collection;
import java.util.Comparator;
import android.util.Log;
import java.util.Iterator;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.x;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager$j;
import com.untis.mobile.ui.activities.views.SyncedViewPager;
import com.untis.mobile.ui.activities.timetable.view.TimeTableGridView;
import kotlin.j2;
import com.untis.mobile.utils.s;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import androidx.core.content.d;
import android.content.Context;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.untis.mobile.ui.activities.timetable.navigation.i;
import android.view.View;
import com.untis.mobile.persistence.models.timegrid.TimeGridUnit;
import android.annotation.SuppressLint;
import java.util.HashMap;
import org.joda.time.r;
import java.util.ArrayList;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.ui.activities.common.b;
import org.joda.time.t;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00cc\u00012\u00020\u0001:\u0004\u00cd\u0001\u00ce\u0001B\u0013\u0012\b\u0010\u008c\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u00ca\u0001\u0010\u00cb\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0014\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0002J\u0014\u0010\"\u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0002J\b\u0010#\u001a\u00020\u0004H\u0002J\b\u0010$\u001a\u00020\u0004H\u0002J\b\u0010%\u001a\u00020\u0004H\u0002J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020\u0004H\u0002J\b\u0010*\u001a\u00020\u0004H\u0002J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020&H\u0002J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010+\u001a\u00020&H\u0002J\u0010\u0010/\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u00100\u001a\u00020\u0004H\u0002J\u0010\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0002J\u0010\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0002J\b\u00107\u001a\u00020\u0004H\u0002J\b\u00108\u001a\u00020\u0004H\u0002J\b\u00109\u001a\u00020\u0004H\u0002J\b\u0010:\u001a\u00020\u0004H\u0002J\b\u0010;\u001a\u00020\u0004H\u0002J\b\u0010<\u001a\u00020\u0004H\u0002J\b\u0010=\u001a\u00020\u0004H\u0002J\b\u0010>\u001a\u00020\u0004H\u0002J\b\u0010?\u001a\u00020\u0004H\u0002J\b\u0010@\u001a\u00020\u0004H\u0002J\b\u0010A\u001a\u00020\u0004H\u0002J\b\u0010B\u001a\u00020\u0004H\u0002J\b\u0010C\u001a\u00020\u0004H\u0002J\b\u0010E\u001a\u00020DH\u0002J\b\u0010F\u001a\u00020\u0004H\u0002J\b\u0010G\u001a\u00020\u0004H\u0002J\b\u0010H\u001a\u00020\rH\u0002J\b\u0010I\u001a\u00020 H\u0002J\b\u0010J\u001a\u00020\rH\u0002J\u001e\u0010L\u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010K\u001a\u00020.H\u0002J\u0010\u0010M\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0002J\b\u0010O\u001a\u00020NH\u0002J\u0010\u0010Q\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0019H\u0002J\u0006\u0010R\u001a\u00020\u0014J\u0010\u0010U\u001a\u00020\u00042\b\u0010T\u001a\u0004\u0018\u00010SJ\u000e\u0010W\u001a\u00020\u00042\u0006\u0010V\u001a\u00020SJ\u0006\u0010X\u001a\u00020\u0004J\u0018\u0010Z\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010Y\u001a\u00020.J\u0006\u0010[\u001a\u00020\u0004J\u000e\u0010\\\u001a\u00020\u00042\u0006\u0010+\u001a\u00020&J\u0010\u0010^\u001a\u00020\u00042\b\u0010]\u001a\u0004\u0018\u00010SJ\u0006\u0010_\u001a\u00020\u0004J\u0006\u0010`\u001a\u00020\u0004J\u000e\u0010b\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020\rJ\u0016\u0010f\u001a\u0012\u0012\u0004\u0012\u00020d0cj\b\u0012\u0004\u0012\u00020d`eJ\u0006\u0010g\u001a\u00020\rJ\u001a\u0010i\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 J\u0006\u0010j\u001a\u00020\u000bJ\u000e\u0010l\u001a\u00020\u00042\u0006\u0010k\u001a\u00020\u000bJ\u000e\u0010n\u001a\u00020 2\u0006\u0010m\u001a\u00020\rJ\u0006\u0010o\u001a\u00020\u0004J\u0006\u0010p\u001a\u00020\u0004J\u000e\u0010q\u001a\u00020\u00042\u0006\u00102\u001a\u000201J\u0006\u0010r\u001a\u000201J\u000e\u0010s\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\rJ\u000e\u0010t\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 J\u0006\u0010u\u001a\u00020\u000bJ\u0006\u0010v\u001a\u00020\u0004J\u0016\u0010w\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u0019J\u000e\u0010x\u001a\u00020.2\u0006\u0010m\u001a\u00020\rJ\u000e\u0010y\u001a\u00020\r2\u0006\u0010m\u001a\u00020\rJ\u0006\u0010z\u001a\u00020\u0004J\u0006\u0010{\u001a\u00020\u0004J\u0006\u0010|\u001a\u00020\u0004J\u0006\u0010}\u001a\u00020\u0004J\u0006\u0010~\u001a\u00020.J\u000f\u0010\u0080\u0001\u001a\u00020\u00042\u0006\u0010\u007f\u001a\u00020.J\u0007\u0010\u0081\u0001\u001a\u00020.J\u000f\u0010\u0082\u0001\u001a\u00020\u00042\u0006\u0010\u007f\u001a\u00020.J\u0007\u0010\u0083\u0001\u001a\u00020.R\u0019\u0010\u0086\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001f\u0010\u008c\u0001\u001a\u00030\u0087\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008e\u0001R\u001b\u0010\b\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R/\u0010\u009c\u0001\u001a\u0018\u0012\u0005\u0012\u00030\u0099\u0001\u0018\u00010cj\u000b\u0012\u0005\u0012\u00030\u0099\u0001\u0018\u0001`e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0085\u0001R\u001a\u0010¡\u0001\u001a\u00030\u009f\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010 \u0001R\u0019\u0010£\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0085\u0001R\u0019\u0010¥\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u0085\u0001R\u001a\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R&\u0010«\u0001\u001a\u000f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0¨\u00018\u0002@\u0003X\u0083\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R&\u0010\u00ad\u0001\u001a\u000f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00190¨\u00018\u0002@\u0003X\u0083\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010ª\u0001R\u0017\u0010+\u001a\u0004\u0018\u00010&8F@\u0006¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u001c\u0010³\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001f\u0010¹\u0001\u001a\u00030´\u00018\u0006@\u0006¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010»\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010\u008e\u0001R\u0019\u0010½\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010\u0085\u0001R#\u0010\u00c3\u0001\u001a\u00030¾\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¿\u0001\u0010\u00c0\u0001\u001a\u0006\b\u00c1\u0001\u0010\u00c2\u0001R-\u0010\u00c5\u0001\u001a\u0016\u0012\u0004\u0012\u00020d\u0018\u00010cj\n\u0012\u0004\u0012\u00020d\u0018\u0001`e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00c4\u0001\u0010\u009b\u0001R\u001c\u0010\u00c9\u0001\u001a\u0005\u0018\u00010\u00c6\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00c7\u0001\u0010\u00c8\u0001¨\u0006\u00cf\u0001" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/v;", "Lorg/koin/core/c;", "Lkotlinx/coroutines/k2;", "F0", "Lkotlin/j2;", "v1", "r2", "Lcom/untis/mobile/services/billing/b;", "purchaseService", "A0", "x1", "", "R0", "", "c1", "K0", "Q0", "b1", "J0", "y2", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "Z0", "", "b2", "d1", "E1", "B2", "u1", "I0", "Lorg/joda/time/t;", "date", "B1", "A1", "r1", "s1", "Landroid/view/View;", "header", "t1", "H0", "Z1", "view", "D1", "z2", "", "K1", "P1", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Y1", "Lcom/untis/mobile/persistence/models/profile/Child;", "child", "L1", "N1", "W1", "U1", "X1", "M1", "z1", "I2", "q2", "G2", "L0", "E2", "p1", "n2", "Landroid/app/DatePickerDialog$OnDateSetListener;", "O0", "c2", "G0", "V0", "S0", "T0", "hardReset", "N2", "g1", "", "i1", "timestamp", "D2", "a2", "Landroid/os/Bundle;", "arguments", "z0", "save", "V1", "A2", "ignoreAccess", "R1", "O1", "M2", "args", "o1", "Q1", "T1", "minute", "m1", "Ljava/util/ArrayList;", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit;", "Lkotlin/collections/ArrayList;", "u2", "e1", "numberOfDayz", "e2", "h1", "newScale", "h2", "position", "Y0", "p2", "n1", "k2", "k1", "I1", "w2", "j1", "J1", "d2", "U0", "f1", "g2", "C2", "x2", "t2", "l2", "value", "i2", "m2", "j2", "o2", "S", "I", "colorTextDefault", "Lcom/untis/mobile/ui/activities/timetable/TimeTableActivity;", "G", "Lcom/untis/mobile/ui/activities/timetable/TimeTableActivity;", "a1", "()Lcom/untis/mobile/ui/activities/timetable/TimeTableActivity;", "fragment", "L", "F", "scale", "K", "scaleCorrection", "Lcom/untis/mobile/services/billing/i;", "a0", "Lcom/untis/mobile/services/billing/i;", "Lcom/untis/mobile/services/masterdata/a;", "J", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lorg/joda/time/r;", "N", "Ljava/util/ArrayList;", "breakSuperVisions", "T", "colorIconDefault", "Lcom/untis/mobile/services/timetable/placeholder/k;", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Q", "minMinute", "R", "maxMinute", "V", "Landroid/view/View;", "Ljava/util/HashMap;", "O", "Ljava/util/HashMap;", "minuteToYCache", "W", "timestampsPerPosition", "l1", "()Landroid/view/View;", "Lcom/untis/mobile/ui/activities/timetable/navigation/e;", "X", "Lcom/untis/mobile/ui/activities/timetable/navigation/e;", "timeTableNavigationFavoritesAdapter", "Lcom/untis/mobile/ui/activities/common/b;", "H", "Lcom/untis/mobile/ui/activities/common/b;", "W0", "()Lcom/untis/mobile/ui/activities/common/b;", "activity", "M", "textSize", "U", "colorHighlight", "Lcom/untis/mobile/utils/a;", "Z", "Lkotlin/b0;", "X0", "()Lcom/untis/mobile/utils/a;", "appSettings", "P", "timeGridUnits", "Lcom/untis/mobile/ui/activities/timetable/navigation/i;", "Y", "Lcom/untis/mobile/ui/activities/timetable/navigation/i;", "timeTableNavigationHistoriesAdapter", "<init>", "(Lcom/untis/mobile/ui/activities/timetable/TimeTableActivity;)V", "b0", "a", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class v implements c
{
    @e
    public static final a b0;
    @e
    private static String c0;
    @e
    private static TimeTableEntity d0;
    private static boolean e0;
    private static boolean f0;
    private static int g0;
    @f
    private static v h0;
    @e
    private static t i0;
    @e
    private final TimeTableActivity G;
    @e
    private final com.untis.mobile.ui.activities.common.b H;
    private k I;
    private com.untis.mobile.services.masterdata.a J;
    private final float K;
    private float L;
    private float M;
    @f
    private ArrayList<r> N;
    @SuppressLint({ "UseSparseArrays" })
    @e
    private final HashMap<Integer, Float> O;
    @f
    private ArrayList<TimeGridUnit> P;
    private int Q;
    private int R;
    private final int S;
    private final int T;
    private final int U;
    @f
    private View V;
    @SuppressLint({ "UseSparseArrays" })
    @e
    private final HashMap<Integer, Long> W;
    @f
    private com.untis.mobile.ui.activities.timetable.navigation.e X;
    @f
    private i Y;
    @e
    private final b0 Z;
    @f
    private com.untis.mobile.services.billing.i a0;
    
    static {
        b0 = new a(null);
        v.c0 = "";
        v.d0 = new TimeTableEntity(null, 0L, false, 0, 0L, null, 63, null);
        v.g0 = 7;
        v.i0 = com.untis.mobile.utils.v.a.g();
    }
    
    public v(@e final TimeTableActivity g) {
        k0.p(g, "fragment");
        this.G = g;
        v.h0 = this;
        final androidx.fragment.app.d activity = g.getActivity();
        androidx.appcompat.app.e h;
        if (activity instanceof com.untis.mobile.ui.activities.common.b) {
            h = (com.untis.mobile.ui.activities.common.b)activity;
        }
        else {
            h = null;
        }
        if (h != null) {
            this.H = (com.untis.mobile.ui.activities.common.b)h;
            final float u = com.untis.mobile.utils.a.a((Context)h).u();
            this.K = u;
            this.L = u * 1.0f;
            this.M = h.getResources().getDimension(2131165285);
            this.O = new HashMap<Integer, Float>();
            this.Q = -1;
            this.R = -1;
            this.S = d.f((Context)h, 2131099995);
            this.T = d.f((Context)h, 2131099992);
            this.U = d.f((Context)h, 2131099677);
            this.W = new HashMap<Integer, Long>();
            this.Z = kotlin.d0.c((n6.a<?>)new n6.a<com.untis.mobile.utils.a>() {
                final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
                
                @Override
                public final com.untis.mobile.utils.a invoke() {
                    return (com.untis.mobile.utils.a)this.G.t(k1.d(com.untis.mobile.utils.a.class), null, null);
                }
            });
            return;
        }
        throw new IllegalStateException("no parent activity");
    }
    
    private final void A0(com.untis.mobile.services.billing.b b) {
        final com.untis.mobile.services.billing.i a0 = this.a0;
        if (a0 != null) {
            b = a0;
        }
        if (b == null) {
            timber.log.b.e("purchaseService is null, we cannot update anything in checkForPremiumAndUpdate", new Object[0]);
            return;
        }
        b.a().D5((rx.functions.b)new l(this, b), (rx.functions.b)new com.untis.mobile.ui.activities.timetable.k(b, this), (rx.functions.a)new j(this));
    }
    
    private final void A1() {
        s.a.x(new n6.a<j2>() {
            final /* synthetic */ v G;
            
            public final void invoke() {
                final View l1 = this.G.l1();
                if (l1 != null) {
                    final TimeTableGridView timeTableGridView = (TimeTableGridView)l1.findViewById(com.untis.mobile.c.i.Qc);
                    if (timeTableGridView != null) {
                        timeTableGridView.setUpWith(this.G);
                    }
                }
            }
        });
    }
    
    public static final /* synthetic */ View B(final v v) {
        return v.V;
    }
    
    private final void B1(final t t) {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        final int pc = com.untis.mobile.c.i.Pc;
        ((SyncedViewPager)l1.findViewById(pc)).setOffscreenPageLimit(1);
        final int vc = com.untis.mobile.c.i.Vc;
        ((SyncedViewPager)l1.findViewById(vc)).setOffscreenPageLimit(1);
        final Profile a2 = this.a2();
        SyncedViewPager syncedViewPager2;
        x adapter;
        if (v.g0 == 7) {
            final SyncedViewPager syncedViewPager = (SyncedViewPager)l1.findViewById(pc);
            final FragmentManager childFragmentManager = this.a1().getChildFragmentManager();
            k0.o(childFragmentManager, "fragment.childFragmentManager");
            syncedViewPager.setAdapter((androidx.viewpager.widget.a)new com.untis.mobile.ui.activities.timetable.k0(childFragmentManager, a2.getUniqueId(), this));
            syncedViewPager2 = (SyncedViewPager)l1.findViewById(vc);
            final FragmentManager childFragmentManager2 = this.a1().getChildFragmentManager();
            k0.o(childFragmentManager2, "fragment.childFragmentManager");
            adapter = new l0(childFragmentManager2, a2.getUniqueId(), v.d0, this);
        }
        else {
            final SyncedViewPager syncedViewPager3 = (SyncedViewPager)l1.findViewById(pc);
            final FragmentManager childFragmentManager3 = this.G.getChildFragmentManager();
            k0.o(childFragmentManager3, "fragment.childFragmentManager");
            syncedViewPager3.setAdapter((androidx.viewpager.widget.a)new com.untis.mobile.ui.activities.timetable.b(childFragmentManager3, a2.getUniqueId(), this));
            syncedViewPager2 = (SyncedViewPager)l1.findViewById(vc);
            final FragmentManager childFragmentManager4 = this.G.getChildFragmentManager();
            k0.o(childFragmentManager4, "fragment.childFragmentManager");
            adapter = new g0(childFragmentManager4, a2.getUniqueId(), v.d0, this);
        }
        syncedViewPager2.setAdapter((androidx.viewpager.widget.a)adapter);
        if (t != null) {
            ((SyncedViewPager)l1.findViewById(pc)).setCurrentItem(this.g1(t), false);
            ((SyncedViewPager)l1.findViewById(vc)).setCurrentItem(this.g1(t), false);
        }
        else {
            ((SyncedViewPager)l1.findViewById(pc)).setCurrentItem(250, false);
            ((SyncedViewPager)l1.findViewById(vc)).setCurrentItem(250, false);
        }
        ((SyncedViewPager)l1.findViewById(pc)).setOtherViewPager((SyncedViewPager)l1.findViewById(vc));
        ((SyncedViewPager)l1.findViewById(vc)).setOtherViewPager((SyncedViewPager)l1.findViewById(pc));
        ((SyncedViewPager)l1.findViewById(vc)).addOnPageChangeListener((ViewPager$j)new ViewPager$j() {
            final /* synthetic */ v G;
            
            public void b(final int n, final float n2, final int n3) {
            }
            
            public void k(final int n) {
            }
            
            public void l(final int i) {
                v.b0.k(this.G.Y0(i));
                this.G.I1(i);
                final v g = this.G;
                Long value;
                if ((value = v.N(g).get(i)) == null) {
                    value = -1L;
                }
                g.D2(value.longValue());
            }
        });
    }
    
    private final void B2() {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        final int g0 = v.g0;
        TextView textView = null;
        String text = null;
        Label_0131: {
            com.untis.mobile.ui.activities.common.b b;
            int n;
            if (g0 != 1) {
                if (g0 != 7) {
                    textView = (TextView)l1.findViewById(com.untis.mobile.c.i.N9);
                    final String string = ((Activity)this.H).getString(2131886795);
                    k0.o(string, "activity.getString(R.string.shared_xDays_text)");
                    text = kotlin.text.s.k2(string, "{0}", String.valueOf(v.g0), false, 4, (Object)null);
                    break Label_0131;
                }
                textView = (TextView)l1.findViewById(com.untis.mobile.c.i.N9);
                b = this.H;
                n = 2131886794;
            }
            else {
                textView = (TextView)l1.findViewById(com.untis.mobile.c.i.N9);
                b = this.H;
                n = 2131886751;
            }
            text = ((Activity)b).getString(n);
        }
        textView.setText((CharSequence)text);
        ((SeekBar)l1.findViewById(com.untis.mobile.c.i.P9)).setProgress(v.g0 - 1);
    }
    
    public static final /* synthetic */ v C() {
        return v.h0;
    }
    
    private static final void C0(final v v, final com.untis.mobile.services.billing.b b, final List list) {
        k0.p(v, "this$0");
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)v.W0());
        a.r0(false);
        a.s0(false);
        a.u0(false);
        a.t0(false);
        a.g1(false);
        k0.o(list, "purchases");
        final ArrayList<com.untis.mobile.utils.billing.f> list2 = new ArrayList<com.untis.mobile.utils.billing.f>();
        final Iterator<Object> iterator = list.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b2 = true;
            if (!hasNext) {
                break;
            }
            final com.untis.mobile.utils.billing.f next = iterator.next();
            if (next.f() != 0) {
                b2 = false;
            }
            if (!b2) {
                continue;
            }
            list2.add(next);
        }
        for (final com.untis.mobile.utils.billing.f f : list2) {
            final String i = f.i();
            if (i != null) {
                Label_0393: {
                    Label_0388: {
                        switch (i.hashCode()) {
                            default: {
                                continue;
                            }
                            case 1500718020: {
                                if (!i.equals("product_id_homework")) {
                                    continue;
                                }
                                a.s0(true);
                                continue;
                            }
                            case 284580103: {
                                if (!i.equals("subscription_premium_year")) {
                                    continue;
                                }
                                break;
                            }
                            case 221276918: {
                                if (!i.equals("subscription_premium_month")) {
                                    continue;
                                }
                                break Label_0388;
                            }
                            case 18924763: {
                                if (!i.equals("product_id_widgets")) {
                                    continue;
                                }
                                a.u0(true);
                                continue;
                            }
                            case 18747182: {
                                if (!i.equals("product_id_tt_settings")) {
                                    continue;
                                }
                                a.t0(true);
                                continue;
                            }
                            case -1396424965: {
                                if (!i.equals("subscription_premium_year_3")) {
                                    continue;
                                }
                                break;
                            }
                            case -1639865213: {
                                if (!i.equals("product_id_premium")) {
                                    continue;
                                }
                                break Label_0388;
                            }
                            case -2101243607: {
                                if (!i.equals("subscription_premium_month_2")) {
                                    continue;
                                }
                                break Label_0388;
                            }
                        }
                        a.r0(true);
                        a.g1(f.k());
                        break Label_0393;
                    }
                    a.r0(true);
                }
                a.g0(f.k());
            }
        }
        b.onDestroy();
        v.a0 = null;
        v.C2();
    }
    
    public static final /* synthetic */ com.untis.mobile.services.masterdata.a D(final v v) {
        return v.J;
    }
    
    private static final void D0(final com.untis.mobile.services.billing.b b, final v v, final Throwable t) {
        k0.p(v, "this$0");
        Log.e("untis_log", "could not update", t);
        b.onDestroy();
        v.a0 = null;
    }
    
    private final void D1(final View view) {
        s.a.J((n6.a<?>)new n6.a<b>() {
            final /* synthetic */ v G;
            
            private static final int c(final TimeTableEntity timeTableEntity, final TimeTableEntity timeTableEntity2) {
                if (timeTableEntity.getCounter() < timeTableEntity2.getCounter()) {
                    return 1;
                }
                if (timeTableEntity.getCounter() > timeTableEntity2.getCounter()) {
                    return -1;
                }
                if (timeTableEntity.getTimestamp() < timeTableEntity2.getTimestamp()) {
                    return 1;
                }
                if (timeTableEntity.getTimestamp() > timeTableEntity2.getTimestamp()) {
                    return -1;
                }
                return 0;
            }
            
            @e
            public final b b() {
                final Profile a2 = this.G.a2();
                final k m = v.M(this.G);
                if (m == null) {
                    k0.S("timeTableService");
                    throw null;
                }
                final List<TimeTableEntity> t = m.t();
                final ArrayList<TimeTableEntity> list = new ArrayList<TimeTableEntity>();
                final Iterator<Object> iterator = t.iterator();
                while (true) {
                    final boolean hasNext = iterator.hasNext();
                    final boolean b = false;
                    if (!hasNext) {
                        break;
                    }
                    final TimeTableEntity next = iterator.next();
                    final TimeTableEntity timeTableEntity = next;
                    int n = 0;
                    Label_0133: {
                        if (timeTableEntity.getEntityType() == a2.getEntityType()) {
                            n = (b ? 1 : 0);
                            if (timeTableEntity.getEntityId() == a2.getEntityId()) {
                                break Label_0133;
                            }
                        }
                        if (timeTableEntity.getEntityType() == EntityType.STUDENT) {
                            n = (b ? 1 : 0);
                            if (a2.hasChild(timeTableEntity.getEntityId())) {
                                break Label_0133;
                            }
                        }
                        n = 1;
                    }
                    if (n == 0) {
                        continue;
                    }
                    list.add(next);
                }
                final List<Object> h5 = kotlin.collections.v.h5((Iterable<?>)list, (Comparator<? super Object>)com.untis.mobile.ui.activities.timetable.x.G);
                final ArrayList<TimeTableEntity> list2 = new ArrayList<TimeTableEntity>();
                for (final TimeTableEntity next2 : h5) {
                    if (next2.getFavorite()) {
                        list2.add(next2);
                    }
                }
                final List<Object> l5 = kotlin.collections.v.L5((Collection<?>)list2);
                final ArrayList<TimeTableEntity> list3 = new ArrayList<TimeTableEntity>();
                for (final TimeTableEntity next3 : h5) {
                    if (next3.getFavorite() ^ true) {
                        list3.add(next3);
                    }
                }
                Object o = kotlin.collections.v.L5((Collection<?>)list3);
                final int size = ((List)o).size();
                final int size2 = l5.size();
                final Set<Child> userChildren = a2.getUserChildren();
                final ArrayList<Child> list4 = new ArrayList<Child>();
                for (final Child next4 : userChildren) {
                    if (next4.getHasTimeTableAccess()) {
                        list4.add(next4);
                    }
                }
                final int n2 = size + size2 + list4.size() + (a2.getUserHasTimeTableAccess() ? 1 : 0);
                if (n2 > 5) {
                    final int n3 = 5 - (n2 - ((List)o).size());
                    if (n3 <= 0) {
                        ((List)o).clear();
                    }
                    else if (n3 < ((List)o).size()) {
                        o = ((List<TimeTableEntity>)o).subList(0, n3);
                    }
                }
                final a d = v.D(this.G);
                if (d == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final boolean b2 = d.f(true).isEmpty() ^ true;
                final a d2 = v.D(this.G);
                if (d2 == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final boolean b3 = a.a.n(d2, true, null, 2, null).isEmpty() ^ true;
                final a d3 = v.D(this.G);
                if (d3 == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final boolean b4 = d3.x(true).isEmpty() ^ true;
                final a d4 = v.D(this.G);
                if (d4 == null) {
                    k0.S("masterDataService");
                    throw null;
                }
                final boolean b5 = d4.m(true).isEmpty() ^ true;
                final boolean b6 = !b2 && !b3 && !b4 && !b5;
                final org.joda.time.t g = com.untis.mobile.utils.v.a.g();
                final a d5 = v.D(this.G);
                if (d5 != null) {
                    final List<Schoolyear> k = d5.K();
                    if (!(k instanceof Collection) || !k.isEmpty()) {
                        final Iterator<Object> iterator5 = k.iterator();
                        while (iterator5.hasNext()) {
                            if (((org.joda.time.base.e)iterator5.next().getEnd()).m((n0)g)) {
                                final int n4 = 1;
                                return new b((List<TimeTableEntity>)l5, (List<TimeTableEntity>)o, b2, b3, b4, b5, (n4 ^ 0x1) && b6);
                            }
                        }
                    }
                    final int n4 = 0;
                    return new b((List<TimeTableEntity>)l5, (List<TimeTableEntity>)o, b2, b3, b4, b5, (n4 ^ 0x1) && b6);
                }
                k0.S("masterDataService");
                throw null;
            }
        }, (n6.l<? super Object, j2>)new n6.l<b, j2>() {
            final /* synthetic */ v G;
            
            private static final void D(final v v, final View view) {
                k0.p(v, "this$0");
                v.X1();
            }
            
            private static final void p(final v v, final View view) {
                k0.p(v, "this$0");
                v.P1();
            }
            
            private static final void q(final v v, final View view, final AdapterView adapterView, final View view2, final int n, final long n2) {
                k0.p(v, "this$0");
                k0.p(view, "$view");
                final ListAdapter adapter = ((ListView)view.findViewById(com.untis.mobile.c.i.cI)).getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.ui.activities.timetable.navigation.TimeTableNavigationChildrenAdapter");
                v.L1(((com.untis.mobile.ui.activities.timetable.navigation.a)adapter).a(n));
            }
            
            private static final void s(final v v, final View view, final AdapterView adapterView, final View view2, final int n, final long n2) {
                k0.p(v, "this$0");
                k0.p(view, "$view");
                final ListAdapter adapter = ((ListView)view.findViewById(com.untis.mobile.c.i.dI)).getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.ui.activities.timetable.navigation.TimeTableNavigationFavoritesAdapter");
                v.Y1(((com.untis.mobile.ui.activities.timetable.navigation.e)adapter).f(n));
            }
            
            private static final void t(final v v, final View view, final AdapterView adapterView, final View view2, final int n, final long n2) {
                k0.p(v, "this$0");
                k0.p(view, "$view");
                final ListAdapter adapter = ((ListView)view.findViewById(com.untis.mobile.c.i.eI)).getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.ui.activities.timetable.navigation.TimeTableNavigationHistoriesAdapter");
                v.Y1(((i)adapter).f(n));
            }
            
            private static final void u(final v v, final View view) {
                k0.p(v, "this$0");
                v.N1();
            }
            
            private static final void w(final v v, final View view) {
                k0.p(v, "this$0");
                v.W1();
            }
            
            private static final void x(final v v, final View view) {
                k0.p(v, "this$0");
                v.U1();
            }
            
            public final void n(@e final b b) {
                k0.p(b, "data");
                final Profile a2 = this.G.a2();
                if (a2.getUserOriginalEntityType().isParentRole() && a2.getUserCustomEntityId() != null && a2.getUserCustomEntityType() != null) {
                    a2.setUserCustomEntityId(null);
                    a2.setUserCustomEntityType(null);
                    a2.setUserHasTimeTableAccess(false);
                    j0.G.d(a2);
                }
                ((LinearLayout)view.findViewById(com.untis.mobile.c.i.UH)).setOnClickListener((View$OnClickListener)new a0(this.G));
                v.this.z2(view);
                final Set<Child> userChildren = a2.getUserChildren();
                final ArrayList<Child> list = new ArrayList<Child>();
                for (final Child next : userChildren) {
                    if (next.getHasTimeTableAccess()) {
                        list.add(next);
                    }
                }
                final List<Object> i5 = kotlin.collections.v.I5((Iterable<?>)list);
                final View h = view;
                final int ci = com.untis.mobile.c.i.cI;
                ((ListView)h.findViewById(ci)).setAdapter((ListAdapter)new com.untis.mobile.ui.activities.timetable.navigation.a(this.G, (List<Child>)i5));
                ((ListView)view.findViewById(ci)).setDivider((Drawable)null);
                ((ListView)view.findViewById(ci)).setOnItemClickListener((AdapterView$OnItemClickListener)new f0(this.G, view));
                final ListView listView = (ListView)view.findViewById(ci);
                k0.o(listView, "view.navigation_time_table_list_children");
                com.untis.mobile.utils.extension.h.c((View)listView, new n6.a<j2>() {
                    public final void invoke() {
                        final e0.a a = com.untis.mobile.utils.e0.a;
                        final ListView listView = (ListView)view.findViewById(com.untis.mobile.c.i.cI);
                        k0.o(listView, "view.navigation_time_table_list_children");
                        a.a(listView);
                    }
                });
                v.r0(this.G, new com.untis.mobile.ui.activities.timetable.navigation.e(this.G, a2.getUniqueId(), b.a()));
                final View h2 = view;
                final int di = com.untis.mobile.c.i.dI;
                ((ListView)h2.findViewById(di)).setAdapter((ListAdapter)v.K(this.G));
                ((ListView)view.findViewById(di)).setDivider((Drawable)null);
                ((ListView)view.findViewById(di)).setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.activities.timetable.e0(this.G, view));
                final ListView listView2 = (ListView)view.findViewById(di);
                k0.o(listView2, "view.navigation_time_table_list_favorites");
                com.untis.mobile.utils.extension.h.c((View)listView2, new n6.a<j2>() {
                    public final void invoke() {
                        final e0.a a = com.untis.mobile.utils.e0.a;
                        final ListView listView = (ListView)view.findViewById(com.untis.mobile.c.i.dI);
                        k0.o(listView, "view.navigation_time_table_list_favorites");
                        a.a(listView);
                    }
                });
                v.s0(this.G, new i(this.G, a2.getUniqueId(), b.b()));
                final View h3 = view;
                final int ei = com.untis.mobile.c.i.eI;
                ((ListView)h3.findViewById(ei)).setAdapter((ListAdapter)v.L(this.G));
                ((ListView)view.findViewById(ei)).setDivider((Drawable)null);
                ((ListView)view.findViewById(ei)).setOnItemClickListener((AdapterView$OnItemClickListener)new com.untis.mobile.ui.activities.timetable.d0(this.G, view));
                final ListView listView3 = (ListView)view.findViewById(ei);
                k0.o(listView3, "view.navigation_time_table_list_history");
                com.untis.mobile.utils.extension.h.c((View)listView3, new n6.a<j2>() {
                    public final void invoke() {
                        final e0.a a = com.untis.mobile.utils.e0.a;
                        final ListView listView = (ListView)view.findViewById(com.untis.mobile.c.i.eI);
                        k0.o(listView, "view.navigation_time_table_list_history");
                        a.a(listView);
                    }
                });
                final View h4 = view;
                final int th = com.untis.mobile.c.i.TH;
                final LinearLayout linearLayout = (LinearLayout)h4.findViewById(th);
                final boolean c = b.c();
                final int n = 8;
                int visibility;
                if (c) {
                    visibility = 0;
                }
                else {
                    visibility = 8;
                }
                linearLayout.setVisibility(visibility);
                ((LinearLayout)view.findViewById(th)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.b0(this.G));
                final View h5 = view;
                final int zh = com.untis.mobile.c.i.ZH;
                final LinearLayout linearLayout2 = (LinearLayout)h5.findViewById(zh);
                int visibility2;
                if (b.f()) {
                    visibility2 = 0;
                }
                else {
                    visibility2 = 8;
                }
                linearLayout2.setVisibility(visibility2);
                ((LinearLayout)view.findViewById(zh)).setOnClickListener((View$OnClickListener)new z(this.G));
                final View h6 = view;
                final int yh = com.untis.mobile.c.i.YH;
                final LinearLayout linearLayout3 = (LinearLayout)h6.findViewById(yh);
                int visibility3;
                if (b.e()) {
                    visibility3 = 0;
                }
                else {
                    visibility3 = 8;
                }
                linearLayout3.setVisibility(visibility3);
                ((LinearLayout)view.findViewById(yh)).setOnClickListener((View$OnClickListener)new y(this.G));
                final View h7 = view;
                final int ai = com.untis.mobile.c.i.aI;
                final LinearLayout linearLayout4 = (LinearLayout)h7.findViewById(ai);
                int visibility4 = n;
                if (b.g()) {
                    visibility4 = 0;
                }
                linearLayout4.setVisibility(visibility4);
                ((LinearLayout)view.findViewById(ai)).setOnClickListener((View$OnClickListener)new c0(this.G));
                ((TextView)view.findViewById(com.untis.mobile.c.i.fI)).setVisibility(com.untis.mobile.utils.extension.h.U(b.d(), 0, 1, null));
            }
        });
    }
    
    private final void D2(final long n) {
        final j1.h h = new j1.h();
        h.G = (T)"";
        if (n != -1L) {
            final org.joda.time.c c = new org.joda.time.c(n);
            if (((org.joda.time.base.a)c).k2() > 1970) {
                final String g4 = ((org.joda.time.base.a)c).g4("HH:mm dd.MM.yyyy");
                k0.o(g4, "dateTime.toString(\"HH:mm dd.MM.yyyy\")");
                h.G = (T)g4;
            }
        }
        s.a.J((n6.a<?>)new n6.a<String>() {
            @e
            public final String a() {
                return (String)h.G;
            }
        }, (n6.l<? super Object, j2>)new n6.l<String, j2>() {
            final /* synthetic */ v G;
            
            public final void invoke(@e final String text) {
                k0.p(text, "text");
                final View l1 = this.G.l1();
                TextView textView;
                if (l1 == null) {
                    textView = null;
                }
                else {
                    textView = (TextView)l1.findViewById(com.untis.mobile.c.i.Rc);
                }
                if (textView != null) {
                    textView.setText((CharSequence)text);
                }
            }
        });
    }
    
    public static final /* synthetic */ boolean E() {
        return v.e0;
    }
    
    private static final void E0(final v v) {
        k0.p(v, "this$0");
        n5.e.i(v.a1(), v.l1());
    }
    
    private final void E1() {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        ((VerticalZoomableScrollView)l1.findViewById(com.untis.mobile.c.i.Wc)).setTimeTableActivityAndInit(this);
        ((Button)l1.findViewById(com.untis.mobile.c.i.kd)).setOnClickListener((View$OnClickListener)new u(this, l1));
        ((ImageButton)l1.findViewById(com.untis.mobile.c.i.ld)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.t(this));
        ((ImageButton)l1.findViewById(com.untis.mobile.c.i.md)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.s(this));
    }
    
    private final void E2() {
        final View l1 = this.l1();
        if (l1 != null) {
            final AppCompatImageView appCompatImageView = (AppCompatImageView)l1.findViewById(com.untis.mobile.c.i.Cc);
            if (appCompatImageView != null) {
                ((ImageView)appCompatImageView).setVisibility(h.U(v.e0 = this.a2().hasAnyRight(Right.MESSENGER), 0, 1, null));
                ((ImageView)appCompatImageView).setOnClickListener((View$OnClickListener)new p(this));
            }
        }
    }
    
    private final k2 F0() {
        return kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ v H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ v H = this.H;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((v$e)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final com.untis.mobile.calendar.service.b b = new com.untis.mobile.calendar.service.b((Context)this.H.W0(), this.H.a2());
                    this.G = 1;
                    if (b.f(this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    private static final void F1(final v v, final View view, final View view2) {
        k0.p(v, "this$0");
        k0.p(view, "$view");
        v.h2(v.K * 1.0f);
        v.p2();
        v.n1();
        ((VerticalZoomableScrollView)view.findViewById(com.untis.mobile.c.i.Wc)).h(v.K * 1.0f);
    }
    
    private static final void F2(final v v, final View view) {
        k0.p(v, "this$0");
        v.O1();
    }
    
    public static final /* synthetic */ int G() {
        return v.g0;
    }
    
    private final void G0() {
        this.O.clear();
        this.N = null;
        this.P = null;
    }
    
    private static final void G1(final v v, final View view) {
        k0.p(v, "this$0");
        v.h2(v.L - 0.5f);
        v.p2();
        v.n1();
    }
    
    private final void G2() {
        final View l1 = this.l1();
        if (l1 != null) {
            final AppCompatImageView appCompatImageView = (AppCompatImageView)l1.findViewById(com.untis.mobile.c.i.Dc);
            if (appCompatImageView != null) {
                ((ImageView)appCompatImageView).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.o(this));
            }
        }
        this.y2();
    }
    
    public static final /* synthetic */ String H() {
        return v.c0;
    }
    
    private final void H0() {
        final View l1 = this.l1();
        if (l1 != null) {
            final DrawerLayout drawerLayout = (DrawerLayout)l1.findViewById(com.untis.mobile.c.i.Kc);
            if (drawerLayout != null) {
                drawerLayout.d(8388611);
            }
        }
    }
    
    private static final void H1(final v v, final View view) {
        k0.p(v, "this$0");
        v.h2(v.L + 0.5f);
        v.p2();
        v.n1();
    }
    
    private static final void H2(final v v, final View view) {
        k0.p(v, "this$0");
        v.L0();
    }
    
    public static final /* synthetic */ boolean I() {
        return v.f0;
    }
    
    private final void I0() {
        kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ v I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ v I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((v$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                Object o2;
                Object i;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o2 = this.G;
                    c1.n(o);
                    i = o;
                }
                else {
                    c1.n(o);
                    final v.a b0 = v.b0;
                    final k m = v.M(this.I);
                    if (m == null) {
                        k0.S("timeTableService");
                        throw null;
                    }
                    final EntityType entityType = b0.j().getEntityType();
                    final long entityId = b0.j().getEntityId();
                    this.G = b0;
                    this.H = 1;
                    i = m.I(entityType, entityId, this);
                    if (i == h) {
                        return h;
                    }
                    o2 = b0;
                }
                ((v.a)o2).q((TimeTableEntity)i);
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    private final void I2() {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        ((ViewGroup)l1.findViewById(com.untis.mobile.c.i.Lc)).setBackgroundColor(d.f((Context)this.H, 2131100020));
        final AppCompatImageView appCompatImageView = (AppCompatImageView)l1.findViewById(com.untis.mobile.c.i.Ec);
        ((ImageView)appCompatImageView).setVisibility(h.U(v.f0 = this.X0().I(this.a2()), 0, 1, null));
        ((ImageView)appCompatImageView).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.r(this));
        ((ImageView)l1.findViewById(com.untis.mobile.c.i.Mc)).setOnClickListener((View$OnClickListener)new m(l1, this));
        ((ImageView)l1.findViewById(com.untis.mobile.c.i.Nc)).setOnClickListener((View$OnClickListener)new n(l1, this));
    }
    
    public static final /* synthetic */ TimeTableEntity J() {
        return v.d0;
    }
    
    private final int J0() {
        final View l1 = this.l1();
        final boolean b = false;
        if (l1 == null) {
            return 0;
        }
        final k i = this.I;
        if (i == null) {
            k0.S("timeTableService");
            throw null;
        }
        final int d = i.d(v.d0);
        final k j = this.I;
        if (j != null) {
            final int f = j.F(this.Y0(((SyncedViewPager)l1.findViewById(com.untis.mobile.c.i.Vc)).getCurrentItem()));
            int n = b ? 1 : 0;
            if (f + 1 <= d) {
                n = (b ? 1 : 0);
                if (d <= 1434) {
                    n = 1;
                }
            }
            int n2;
            if (n != 0) {
                n2 = d;
            }
            else {
                n2 = f;
            }
            return n2;
        }
        k0.S("timeTableService");
        throw null;
    }
    
    private static final void J2(final v v, final View view) {
        k0.p(v, "this$0");
        v.q2();
    }
    
    public static final /* synthetic */ com.untis.mobile.ui.activities.timetable.navigation.e K(final v v) {
        return v.X;
    }
    
    private final int K0() {
        final View l1 = this.l1();
        if (l1 == null) {
            return 0;
        }
        final k i = this.I;
        if (i == null) {
            k0.S("timeTableService");
            throw null;
        }
        final int o = i.o(v.d0);
        final k j = this.I;
        if (j != null) {
            int f = j.f(this.Y0(((SyncedViewPager)l1.findViewById(com.untis.mobile.c.i.Vc)).getCurrentItem()));
            if (o < f && o != 0) {
                f = o;
            }
            return f;
        }
        k0.S("timeTableService");
        throw null;
    }
    
    private final boolean K1(final Profile profile) {
        return profile.getEntityType() == EntityType.NONE && (profile.getUserHasTimeTableAccess() ^ true);
    }
    
    private static final void K2(final View view, final v v, final View view2) {
        k0.p(view, "$view");
        k0.p(v, "this$0");
        ((EditText)view.findViewById(com.untis.mobile.c.i.Tc)).setText((CharSequence)"");
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Lc)).setVisibility(8);
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Sc)).setVisibility(0);
        ((LinearLayout)view.findViewById(com.untis.mobile.c.i.ca)).setVisibility(8);
        v.a1().hideKeyboard(view);
    }
    
    public static final /* synthetic */ i L(final v v) {
        return v.Y;
    }
    
    private final void L0() {
        final View inflate = ((Activity)this.H).getLayoutInflater().inflate(2131493064, (ViewGroup)null, false);
        final androidx.appcompat.app.d o = new d$a((Context)this.H, 2131952204).M(inflate).O();
        ((ViewGroup)inflate.findViewById(com.untis.mobile.c.i.Ql)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.e(this, o));
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Rl)).setVisibility(h.U(this.e1() == 1, 0, 1, null));
        ((ViewGroup)inflate.findViewById(com.untis.mobile.c.i.Sl)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.d(this, o));
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Tl)).setVisibility(h.U(this.e1() == 7, 0, 1, null));
    }
    
    private final void L1(final Child child) {
        this.k2(new TimeTableEntity(EntityType.STUDENT, child.getId(), false, 0, 0L, null, 60, null));
        this.H0();
    }
    
    private static final void L2(final View view, final v v, final View view2) {
        k0.p(view, "$view");
        k0.p(v, "this$0");
        ((EditText)view.findViewById(com.untis.mobile.c.i.Tc)).setText((CharSequence)"");
        v.a1().hideKeyboard(view);
    }
    
    public static final /* synthetic */ k M(final v v) {
        return v.I;
    }
    
    private static final void M0(final v v, final androidx.appcompat.app.d d, final View view) {
        k0.p(v, "this$0");
        f2(v, 1, null, 2, null);
        ((androidx.appcompat.app.i)d).dismiss();
    }
    
    private final void M1() {
        this.G.startActivityForResult(ProfileEntityActivity.I.a((Context)this.H, v.c0), 160);
    }
    
    public static final /* synthetic */ HashMap N(final v v) {
        return v.W;
    }
    
    private static final void N0(final v v, final androidx.appcompat.app.d d, final View view) {
        k0.p(v, "this$0");
        f2(v, 7, null, 2, null);
        ((androidx.appcompat.app.i)d).dismiss();
    }
    
    private final void N1() {
        this.G.startActivityForResult(KlassenTimeTableSelectionActivity.t((Context)this.H, this.a2()), 400);
        this.H0();
    }
    
    private final void N2(final t t, final boolean b) {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        if (b) {
            final SyncedViewPager syncedViewPager = (SyncedViewPager)l1.findViewById(com.untis.mobile.c.i.Vc);
            final FragmentManager childFragmentManager = this.G.getChildFragmentManager();
            k0.o(childFragmentManager, "fragment.childFragmentManager");
            syncedViewPager.setAdapter((androidx.viewpager.widget.a)new g0(childFragmentManager, v.c0, v.d0, this));
            final androidx.fragment.app.a0 r = this.G.getChildFragmentManager().r();
            k0.o(r, "fragment.childFragmentManager.beginTransaction()");
            final List g0 = this.G.getChildFragmentManager().G0();
            k0.o(g0, "fragment.childFragmentManager.fragments");
            for (final Fragment fragment : g0) {
                if (fragment instanceof TimeTableFragment) {
                    r.C(fragment);
                }
            }
            r.s();
        }
        final List g2 = this.G.getChildFragmentManager().G0();
        k0.o(g2, "fragment.childFragmentManager.fragments");
        for (final Fragment fragment2 : g2) {
            if (fragment2 instanceof TimeTableHeaderFragment) {
                ((TimeTableHeaderFragment)fragment2).z(-2);
            }
            else {
                if (!(fragment2 instanceof TimeTableFragment)) {
                    continue;
                }
                ((TimeTableFragment)fragment2).O(-2);
            }
        }
        int g3;
        if (t != null) {
            g3 = this.g1(t);
        }
        else {
            g3 = 250;
        }
        final int pc = com.untis.mobile.c.i.Pc;
        ((SyncedViewPager)l1.findViewById(pc)).setCurrentItem(g3, false);
        final int vc = com.untis.mobile.c.i.Vc;
        ((SyncedViewPager)l1.findViewById(vc)).setCurrentItem(g3, false);
        final androidx.viewpager.widget.a adapter = ((SyncedViewPager)l1.findViewById(pc)).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        final androidx.viewpager.widget.a adapter2 = ((SyncedViewPager)l1.findViewById(vc)).getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }
    
    private final DatePickerDialog$OnDateSetListener O0() {
        return (DatePickerDialog$OnDateSetListener)new com.untis.mobile.ui.activities.timetable.c(this);
    }
    
    static /* synthetic */ void O2(final v v, t t, boolean b, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            t = null;
        }
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        v.N2(t, b);
    }
    
    private static final void P0(final v v, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(v, "this$0");
        v.i0 = new t(n, n2 + 1, n3);
        v.c2();
    }
    
    private final void P1() {
        final Profile a2 = this.a2();
        if (this.K1(a2)) {
            this.M1();
            return;
        }
        this.k2(new TimeTableEntity(a2.getEntityType(), a2.getEntityId(), false, 0, 0L, null, 60, null));
        this.H0();
    }
    
    private final float Q0() {
        final View l1 = this.l1();
        if (l1 == null) {
            return 0.0f;
        }
        final float n = this.m1(this.b1()) - ((VerticalZoomableScrollView)l1.findViewById(com.untis.mobile.c.i.Wc)).getHeight() + ((TextView)l1.findViewById(com.untis.mobile.c.i.Rc)).getHeight();
        if (n < this.R0()) {
            return this.R0();
        }
        return n;
    }
    
    private final float R0() {
        return this.m1(this.c1());
    }
    
    private final t S0() {
        return this.Y0(this.T0());
    }
    
    private final int T0() {
        final View l1 = this.l1();
        int currentItem = 250;
        if (l1 != null) {
            final SyncedViewPager syncedViewPager = (SyncedViewPager)l1.findViewById(com.untis.mobile.c.i.Vc);
            if (syncedViewPager != null) {
                currentItem = syncedViewPager.getCurrentItem();
            }
        }
        return currentItem;
    }
    
    private final void U1() {
        this.G.startActivityForResult(RoomSelectionActivity.H.a((Context)this.H), 400);
        this.H0();
    }
    
    private final int V0() {
        final TimeGridUnit timeGridUnit = kotlin.collections.v.t2((List<? extends TimeGridUnit>)this.u2());
        int j0 = 420;
        if (timeGridUnit != null) {
            final org.joda.time.v start = timeGridUnit.getStart();
            if (start != null) {
                j0 = start.j0(org.joda.time.g.P());
            }
        }
        return (int)this.m1(j0);
    }
    
    private final void W1() {
        this.G.startActivityForResult(SubjectTimeTableSelectionActivity.v((Context)this.H, this.a2()), 400);
        this.H0();
    }
    
    private final com.untis.mobile.utils.a X0() {
        return this.Z.getValue();
    }
    
    private final void X1() {
        this.G.startActivityForResult(TeacherTimeTableSelectionActivity.v((Context)this.H, this.a2()), 400);
        this.H0();
    }
    
    private final void Y1(final TimeTableEntity timeTableEntity) {
        this.k2(timeTableEntity);
        this.H0();
    }
    
    private final List<DisplayableEntity> Z0(final Profile profile) {
        final ArrayList<DisplayableEntity> list = new ArrayList<DisplayableEntity>();
        final com.untis.mobile.services.masterdata.a j = this.J;
        if (j == null) {
            k0.S("masterDataService");
            throw null;
        }
        list.addAll(j.f(true));
        final com.untis.mobile.services.masterdata.a i = this.J;
        if (i == null) {
            k0.S("masterDataService");
            throw null;
        }
        list.addAll(i.h(true, com.untis.mobile.utils.time.a.b()));
        final com.untis.mobile.services.masterdata.a k = this.J;
        if (k == null) {
            k0.S("masterDataService");
            throw null;
        }
        list.addAll(k.e(this.b2(profile)));
        final com.untis.mobile.services.masterdata.a l = this.J;
        if (l == null) {
            k0.S("masterDataService");
            throw null;
        }
        list.addAll(l.m(true));
        final com.untis.mobile.services.masterdata.a m = this.J;
        if (m != null) {
            list.addAll(m.x(true));
            return list;
        }
        k0.S("masterDataService");
        throw null;
    }
    
    private final void Z1() {
        final View l1 = this.l1();
        if (l1 != null) {
            final DrawerLayout drawerLayout = (DrawerLayout)l1.findViewById(com.untis.mobile.c.i.Kc);
            if (drawerLayout != null) {
                drawerLayout.K(8388611);
            }
        }
    }
    
    private final int b1() {
        final int r = this.R;
        if (r > -1) {
            return r;
        }
        return this.R = this.J0();
    }
    
    private final List<Long> b2(final Profile profile) {
        final ArrayList<Long> list = new ArrayList<Long>();
        if (profile == null) {
            return list;
        }
        final Set<Child> userChildren = profile.getUserChildren();
        final ArrayList<Child> list2 = new ArrayList<Child>();
        for (final Child next : userChildren) {
            if (next.getHasTimeTableAccess()) {
                list2.add(next);
            }
        }
        final Iterator<Object> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list.add(iterator2.next().getId());
        }
        return list;
    }
    
    private final int c1() {
        try {
            final int q = this.Q;
            if (q > -1) {
                return q;
            }
            return this.Q = this.K0();
        }
        catch (Exception ex) {
            return 0;
        }
    }
    
    private final void c2() {
        final int g1 = this.g1(v.i0);
        final View l1 = this.l1();
        if (l1 != null) {
            final SyncedViewPager syncedViewPager = (SyncedViewPager)l1.findViewById(com.untis.mobile.c.i.Vc);
            if (syncedViewPager != null) {
                syncedViewPager.setCurrentItem(g1, true);
            }
        }
    }
    
    private final int d1() {
        final int size = new com.untis.mobile.services.messages.e(v.c0).l(true).size();
        int n = 0;
        final com.untis.mobile.services.infocenter.w w = new com.untis.mobile.services.infocenter.w(v.c0);
        final org.joda.time.c f0 = com.untis.mobile.utils.v.a.g().F0();
        k0.o(f0, "Date.today().toDateTimeAtStartOfDay()");
        final List<OfficeHour> h = w.h(f0);
        if (!(h instanceof Collection) || !h.isEmpty()) {
            final Iterator<Object> iterator = h.iterator();
            n = 0;
            while (iterator.hasNext()) {
                final OfficeHour officeHour = iterator.next();
                if (officeHour.getRegistered() && ((org.joda.time.base.e)officeHour.getStart().h1()).p((n0)com.untis.mobile.utils.v.a.g())) {
                    final int n2 = n + 1;
                    if ((n = n2) >= 0) {
                        continue;
                    }
                    kotlin.collections.v.V();
                    n = n2;
                }
            }
        }
        return size + 0 + n;
    }
    
    public static /* synthetic */ void f2(final v v, final int n, t t, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            t = null;
        }
        v.e2(n, t);
    }
    
    private final int g1(final t t) {
        final t s0 = com.untis.mobile.utils.time.a.b().S0(1);
        if (v.g0 == 7) {
            if (((org.joda.time.base.e)t).o((n0)s0)) {
                return 250 - org.joda.time.s0.B0((n0)t, (n0)com.untis.mobile.utils.time.a.b().S0(7)).U();
            }
            return org.joda.time.s0.B0((n0)s0, (n0)t).U() + 250;
        }
        else {
            if (((org.joda.time.base.e)t).o((n0)s0)) {
                return 250 - org.joda.time.j.V((n0)t, (n0)s0).c0();
            }
            return org.joda.time.j.V((n0)s0, (n0)t).c0() + 250;
        }
    }
    
    public static final /* synthetic */ void h0(final t i0) {
        v.i0 = i0;
    }
    
    public static final /* synthetic */ void i0(final v v, final View v2) {
        v.V = v2;
    }
    
    private final String i1() {
        final StringBuilder sb = new StringBuilder();
        sb.append((int)(this.L * 100 / (this.K * 1.0f)));
        sb.append(" %");
        return sb.toString();
    }
    
    public static final /* synthetic */ void j0(final v h0) {
        v.h0 = h0;
    }
    
    public static final /* synthetic */ void k0(final v v, final int r) {
        v.R = r;
    }
    
    public static final /* synthetic */ void l0(final boolean e0) {
        v.e0 = e0;
    }
    
    public static final /* synthetic */ void m0(final v v, final int q) {
        v.Q = q;
    }
    
    public static final /* synthetic */ void n0(final int g0) {
        v.g0 = g0;
    }
    
    private final void n2() {
        final DatePickerDialog datePickerDialog = new DatePickerDialog((Context)this.H, this.O0(), v.i0.k2(), v.i0.f3() - 1, v.i0.X3());
        datePickerDialog.getDatePicker().setMinDate(((org.joda.time.base.g)this.Y0(0).F0()).n());
        datePickerDialog.getDatePicker().setMaxDate(((org.joda.time.base.g)this.Y0(500).F0()).n());
        datePickerDialog.show();
    }
    
    public static final /* synthetic */ void o0(final String c0) {
        v.c0 = c0;
    }
    
    public static final /* synthetic */ void p0(final boolean f0) {
        v.f0 = f0;
    }
    
    private final void p1() {
        final View l1 = this.l1();
        if (l1 != null) {
            final AppCompatImageView appCompatImageView = (AppCompatImageView)l1.findViewById(com.untis.mobile.c.i.Ac);
            if (appCompatImageView != null) {
                ((ImageView)appCompatImageView).setOnClickListener((View$OnClickListener)new q(this));
            }
        }
    }
    
    public static final /* synthetic */ void q0(final TimeTableEntity d0) {
        v.d0 = d0;
    }
    
    private static final void q1(final v v, final View view) {
        k0.p(v, "this$0");
        v.n2();
    }
    
    private final void q2() {
        s.a.J((n6.a<?>)new n6.a<List<? extends DisplayableEntity>>() {
            final /* synthetic */ v G;
            
            @e
            public final List<DisplayableEntity> a() {
                final v g = this.G;
                return g.Z0(g.a2());
            }
        }, (n6.l<? super Object, j2>)new n6.l<List<? extends DisplayableEntity>, j2>() {
            final /* synthetic */ v G;
            
            public final void a(@e final List<? extends DisplayableEntity> list) {
                k0.p(list, "entities");
                final View l1 = this.G.l1();
                if (l1 == null) {
                    return;
                }
                final int tc = com.untis.mobile.c.i.Tc;
                ((EditText)l1.findViewById(tc)).setText((CharSequence)"");
                ((ViewGroup)l1.findViewById(com.untis.mobile.c.i.Lc)).setVisibility(0);
                ((ViewGroup)l1.findViewById(com.untis.mobile.c.i.Sc)).setVisibility(4);
                final com.untis.mobile.ui.adapters.search.d adapter = new com.untis.mobile.ui.adapters.search.d(this.G.W0()) {
                    final /* synthetic */ v p = v$z.this.G;
                    
                    @Override
                    public void s(@e final DisplayableEntity displayableEntity) {
                        k0.p(displayableEntity, "displayableEntity");
                        kotlinx.coroutines.h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ v H;
                            final /* synthetic */ DisplayableEntity I;
                            
                            @org.jetbrains.annotations.e
                            @Override
                            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                    int G;
                                    final /* synthetic */ v H = this.H;
                                    final /* synthetic */ DisplayableEntity I = this.I;
                                };
                            }
                            
                            @f
                            @Override
                            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                                return ((v$z$b$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                                    final k m = v.M(this.H);
                                    if (m == null) {
                                        k0.S("timeTableService");
                                        throw null;
                                    }
                                    final EntityType entityType = this.I.entityType();
                                    final long entityId = this.I.entityId();
                                    this.G = 1;
                                    if (com.untis.mobile.services.timetable.placeholder.k.a.a(m, entityType, entityId, false, this, 4, null) == h) {
                                        return h;
                                    }
                                }
                                return j2.a;
                            }
                        }, 1, (Object)null);
                        this.p.x2();
                    }
                    
                    @Override
                    public void t(@e final DisplayableEntity displayableEntity) {
                        k0.p(displayableEntity, "displayableEntity");
                        this.p.k2(new TimeTableEntity(displayableEntity.entityType(), displayableEntity.entityId(), false, 0, 0L, null, 60, null));
                        ((LinearLayout)l1.findViewById(com.untis.mobile.c.i.ca)).setVisibility(8);
                        ((ViewGroup)l1.findViewById(com.untis.mobile.c.i.Lc)).setVisibility(8);
                        ((ViewGroup)l1.findViewById(com.untis.mobile.c.i.Sc)).setVisibility(0);
                        this.p.a1().hideKeyboard(l1);
                        ((EditText)l1.findViewById(com.untis.mobile.c.i.Tc)).setText((CharSequence)"");
                    }
                };
                ((RecyclerView)l1.findViewById(com.untis.mobile.c.i.ba)).setAdapter((RecyclerView$h)adapter);
                final AppCompatEditText appCompatEditText = (AppCompatEditText)l1.findViewById(tc);
                k0.o(appCompatEditText, "view.activity_time_table_toolbar_search");
                h.A(appCompatEditText, new l<String, j2>() {
                    public final void invoke(@e final String s) {
                        k0.p(s, "it");
                        adapter.u(s);
                        final LinearLayout linearLayout = (LinearLayout)l1.findViewById(com.untis.mobile.c.i.ca);
                        final int length = s.length();
                        final int n = 0;
                        int visibility;
                        if (length == 0) {
                            visibility = 8;
                        }
                        else {
                            visibility = 0;
                        }
                        linearLayout.setVisibility(visibility);
                        final TextView textView = (TextView)l1.findViewById(com.untis.mobile.c.i.aa);
                        int visibility2;
                        if (adapter.getItemCount() == 0) {
                            visibility2 = n;
                        }
                        else {
                            visibility2 = 8;
                        }
                        textView.setVisibility(visibility2);
                    }
                });
                ((EditText)l1.findViewById(tc)).requestFocus();
                UmFragment.showKeyboard$default(this.G.a1(), null, 1, null);
            }
        });
    }
    
    public static final /* synthetic */ void r0(final v v, final com.untis.mobile.ui.activities.timetable.navigation.e x) {
        v.X = x;
    }
    
    private final void r1() {
        s.a.J((n6.a<?>)new n6.a<Integer>() {
            final /* synthetic */ v G;
            
            public final int a() {
                v.this.V0();
                return (int)this.G.m1(1440);
            }
        }, (n6.l<? super Object, j2>)new n6.l<Integer, j2>() {
            final /* synthetic */ v G;
            
            public final void a(final int height) {
                final View l1 = this.G.l1();
                if (l1 == null) {
                    return;
                }
                final int minimumHeight = ((VerticalZoomableScrollView)l1.findViewById(com.untis.mobile.c.i.Wc)).getHeight() + 1;
                final int qc = com.untis.mobile.c.i.Qc;
                ((TimeTableGridView)l1.findViewById(qc)).getLayoutParams().height = height;
                ((TimeTableGridView)l1.findViewById(qc)).setMinimumHeight(minimumHeight);
                final int oc = com.untis.mobile.c.i.Oc;
                ((ImageView)l1.findViewById(oc)).getLayoutParams().height = height;
                ((ImageView)l1.findViewById(oc)).setMinimumHeight(minimumHeight);
                final int vc = com.untis.mobile.c.i.Vc;
                ((ViewGroup)l1.findViewById(vc)).getLayoutParams().height = height;
                ((ViewGroup)l1.findViewById(vc)).setMinimumHeight(minimumHeight);
            }
        });
    }
    
    private final void r2() {
        this.a0 = new com.untis.mobile.services.billing.i((Activity)this.H, (com.untis.mobile.services.billing.i.b)new com.untis.mobile.ui.activities.timetable.h(this));
    }
    
    public static final /* synthetic */ void s0(final v v, final i y) {
        v.Y = y;
    }
    
    private final void s1() {
        s.a.J((n6.a<?>)v$k.G, (n6.l<? super Object, j2>)new n6.l<j2, j2>() {
            final /* synthetic */ v G;
            
            private static final void c(final v v, final View view) {
                k0.p(v, "this$0");
                v.Z1();
            }
            
            public final void b(@e final j2 j2) {
                k0.p(j2, "it");
                final View l1 = this.G.l1();
                if (l1 == null) {
                    return;
                }
                ((ImageView)l1.findViewById(com.untis.mobile.c.i.Bc)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.w(this.G));
                final LayoutInflater layoutInflater = ((Activity)this.G.W0()).getLayoutInflater();
                final int ic = com.untis.mobile.c.i.Ic;
                final View inflate = layoutInflater.inflate(2131493336, (ViewGroup)l1.findViewById(ic), false);
                final v g = this.G;
                k0.o(inflate, "header");
                g.t1(inflate);
                if (v.B(this.G) != null) {
                    final NavigationView navigationView = (NavigationView)l1.findViewById(ic);
                    final View b = v.B(this.G);
                    k0.m(b);
                    navigationView.k(b);
                }
                v.i0(this.G, inflate);
                ((NavigationView)l1.findViewById(ic)).d(inflate);
                ((FrameLayout)l1.findViewById(ic)).bringToFront();
            }
        });
    }
    
    private static final void s2(final v v, final com.untis.mobile.services.billing.b b) {
        k0.p(v, "this$0");
        k0.p(b, "it");
        v.A0(b);
    }
    
    private final void t1(final View view) {
        this.D1(view);
    }
    
    private final void u1() {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        final int dimensionPixelOffset = this.H.getResources().getDimensionPixelOffset(2131165658);
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this.H);
        final boolean t = a.T();
        final int j9 = com.untis.mobile.c.i.J9;
        ((LinearLayout)l1.findViewById(j9)).setEnabled(true);
        ((LinearLayout)l1.findViewById(j9)).setVisibility(0);
        final int p9 = com.untis.mobile.c.i.P9;
        final SeekBar seekBar = (SeekBar)l1.findViewById(p9);
        final com.untis.mobile.services.masterdata.a i = this.J;
        if (i != null) {
            final TimeGrid y = i.y(com.untis.mobile.utils.time.a.b());
            int size = 7;
            if (y != null) {
                final List<TimeGridDay> days = y.getDays();
                if (days != null) {
                    size = days.size();
                }
            }
            seekBar.setMax(size - 1);
            ((SeekBar)l1.findViewById(p9)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new SeekBar$OnSeekBarChangeListener() {
                final /* synthetic */ v b;
                
                public void onProgressChanged(@e final SeekBar seekBar, int n, final boolean b) {
                    k0.p(seekBar, "seekBar");
                    final int max = ((SeekBar)l1.findViewById(com.untis.mobile.c.i.P9)).getMax();
                    final int n2 = 1;
                    if (n >= max) {
                        v.f2(this.b, 7, null, 2, null);
                    }
                    else {
                        v.f2(this.b, n + 1, null, 2, null);
                    }
                    final a b2 = v.b0;
                    TextView textView;
                    com.untis.mobile.ui.activities.common.b b3;
                    if (b2.g() == 1) {
                        textView = (TextView)l1.findViewById(com.untis.mobile.c.i.N9);
                        b3 = this.b.W0();
                        n = 2131886751;
                    }
                    else {
                        if (b2.g() != 7) {
                            final com.untis.mobile.services.masterdata.a d = v.D(this.b);
                            if (d == null) {
                                k0.S("masterDataService");
                                throw null;
                            }
                            final TimeGrid y = d.y(com.untis.mobile.utils.time.a.b());
                            Label_0189: {
                                if (y != null) {
                                    final List<TimeGridDay> days = y.getDays();
                                    if (days != null) {
                                        if (days.size() == b2.g()) {
                                            n = n2;
                                            break Label_0189;
                                        }
                                    }
                                }
                                n = 0;
                            }
                            if (n == 0) {
                                final TextView textView2 = (TextView)l1.findViewById(com.untis.mobile.c.i.N9);
                                final String string = ((Activity)this.b.W0()).getString(2131886795);
                                k0.o(string, "activity.getString(R.string.shared_xDays_text)");
                                textView2.setText((CharSequence)kotlin.text.s.k2(string, "{0}", String.valueOf(b2.g()), false, 4, (Object)null));
                                return;
                            }
                        }
                        textView = (TextView)l1.findViewById(com.untis.mobile.c.i.N9);
                        b3 = this.b.W0();
                        n = 2131886794;
                    }
                    textView.setText((CharSequence)((Activity)b3).getString(n));
                }
                
                public void onStartTrackingTouch(@e final SeekBar seekBar) {
                    k0.p(seekBar, "seekBar");
                }
                
                public void onStopTrackingTouch(@e final SeekBar seekBar) {
                    k0.p(seekBar, "seekBar");
                }
            });
            ((FrameLayout)l1.findViewById(com.untis.mobile.c.i.L9)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                private boolean G = b;
                private boolean H;
                
                private final void a() {
                    final View k = l1;
                    final int j9 = com.untis.mobile.c.i.J9;
                    final int n = ((LinearLayout)k.findViewById(j9)).getHeight() - dimensionPixelOffset;
                    final float n2 = 0;
                    final float n3 = 180;
                    final View i = l1;
                    final int k2 = com.untis.mobile.c.i.K9;
                    final AppCompatImageView appCompatImageView = (AppCompatImageView)i.findViewById(k2);
                    k0.m(appCompatImageView);
                    final RotateAnimation rotateAnimation = new RotateAnimation(n2, n3, ((ImageView)appCompatImageView).getPivotX(), ((ImageView)l1.findViewById(k2)).getPivotY());
                    rotateAnimation.setDuration((long)150);
                    rotateAnimation.setFillEnabled(false);
                    rotateAnimation.setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
                        public void onAnimationEnd(@e final Animation animation) {
                            k0.p(animation, "animation");
                            final View a = l1;
                            final int k9 = com.untis.mobile.c.i.K9;
                            ((ImageView)a.findViewById(k9)).clearAnimation();
                            ((ImageView)l1.findViewById(k9)).setRotation((float)180);
                        }
                        
                        public void onAnimationRepeat(@e final Animation animation) {
                            k0.p(animation, "animation");
                        }
                        
                        public void onAnimationStart(@e final Animation animation) {
                            k0.p(animation, "animation");
                        }
                    });
                    final TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 0, (float)n);
                    translateAnimation.setDuration((long)150);
                    translateAnimation.setFillEnabled(false);
                    translateAnimation.setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
                        final /* synthetic */ v$n a;
                        
                        public void onAnimationEnd(@e final Animation animation) {
                            k0.p(animation, "animation");
                            this.a.e(false);
                            final View b = l1;
                            final int j9 = com.untis.mobile.c.i.J9;
                            ((LinearLayout)b.findViewById(j9)).clearAnimation();
                            final ConstraintLayout$b layoutParams = new ConstraintLayout$b(-1, -2);
                            layoutParams.j = ((FrameLayout)l1.findViewById(com.untis.mobile.c.i.Gc)).getId();
                            ((LinearLayout)l1.findViewById(j9)).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                            ((LinearLayout)l1.findViewById(j9)).setTranslationY((float)n);
                        }
                        
                        public void onAnimationRepeat(@e final Animation animation) {
                            k0.p(animation, "animation");
                        }
                        
                        public void onAnimationStart(@e final Animation animation) {
                            k0.p(animation, "animation");
                        }
                    });
                    ((LinearLayout)l1.findViewById(j9)).startAnimation((Animation)translateAnimation);
                    ((ImageView)l1.findViewById(k2)).startAnimation((Animation)rotateAnimation);
                }
                
                private final void b() {
                    final View k = l1;
                    final int j9 = com.untis.mobile.c.i.J9;
                    final int height = ((LinearLayout)k.findViewById(j9)).getHeight();
                    final int l = dimensionPixelOffset;
                    final float n = 180;
                    final float n2 = 0;
                    final View i = l1;
                    final int k2 = com.untis.mobile.c.i.K9;
                    final AppCompatImageView appCompatImageView = (AppCompatImageView)i.findViewById(k2);
                    k0.m(appCompatImageView);
                    final RotateAnimation rotateAnimation = new RotateAnimation(n, n2, ((ImageView)appCompatImageView).getPivotX(), ((ImageView)l1.findViewById(k2)).getPivotY());
                    rotateAnimation.setDuration((long)150);
                    rotateAnimation.setFillEnabled(false);
                    rotateAnimation.setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
                        public void onAnimationEnd(@e final Animation animation) {
                            k0.p(animation, "animation");
                            final View a = l1;
                            final int k9 = com.untis.mobile.c.i.K9;
                            ((ImageView)a.findViewById(k9)).clearAnimation();
                            ((ImageView)l1.findViewById(k9)).setRotation((float)0);
                        }
                        
                        public void onAnimationRepeat(@e final Animation animation) {
                            k0.p(animation, "animation");
                        }
                        
                        public void onAnimationStart(@e final Animation animation) {
                            k0.p(animation, "animation");
                        }
                    });
                    final TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 0, (float)(-(height - l)));
                    translateAnimation.setDuration((long)150);
                    translateAnimation.setFillEnabled(false);
                    translateAnimation.setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
                        final /* synthetic */ v$n a;
                        
                        public void onAnimationEnd(@e final Animation animation) {
                            k0.p(animation, "animation");
                            this.a.e(false);
                            final View b = l1;
                            final int j9 = com.untis.mobile.c.i.J9;
                            ((LinearLayout)b.findViewById(j9)).clearAnimation();
                            final ConstraintLayout$b layoutParams = new ConstraintLayout$b(-1, -2);
                            layoutParams.j = ((FrameLayout)l1.findViewById(com.untis.mobile.c.i.Gc)).getId();
                            ((LinearLayout)l1.findViewById(j9)).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                            ((LinearLayout)l1.findViewById(j9)).setTranslationY(0.0f);
                        }
                        
                        public void onAnimationRepeat(@e final Animation animation) {
                            k0.p(animation, "animation");
                        }
                        
                        public void onAnimationStart(@e final Animation animation) {
                            k0.p(animation, "animation");
                        }
                    });
                    ((LinearLayout)l1.findViewById(j9)).startAnimation((Animation)translateAnimation);
                    ((ImageView)l1.findViewById(k2)).startAnimation((Animation)rotateAnimation);
                }
                
                public final boolean c() {
                    return this.H;
                }
                
                public final boolean d() {
                    return this.G;
                }
                
                public final void e(final boolean h) {
                    this.H = h;
                }
                
                public final void f(final boolean g) {
                    this.G = g;
                }
                
                public void onClick(@e final View view) {
                    k0.p(view, "view1");
                    if (this.H) {
                        return;
                    }
                    boolean g = true;
                    this.H = true;
                    if (this.G) {
                        this.a();
                        g = false;
                    }
                    else {
                        this.b();
                    }
                    this.G = g;
                    a.c1(this.G);
                }
            });
            if (!t) {
                ((LinearLayout)l1.findViewById(j9)).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
                    private boolean G = true;
                    
                    public final boolean a() {
                        return this.G;
                    }
                    
                    public final void b(final boolean g) {
                        this.G = g;
                    }
                    
                    public void onGlobalLayout() {
                        try {
                            Log.d("untis_log", "onGlobalLayout slider");
                            final View h = l1;
                            final int k9 = com.untis.mobile.c.i.K9;
                            if (h.findViewById(k9) == null) {
                                return;
                            }
                            if (this.G) {
                                Log.d("untis_log", "onGlobalLayout slider working");
                                ((ImageView)l1.findViewById(k9)).clearAnimation();
                                ((ImageView)l1.findViewById(k9)).setRotation((float)180);
                                final View h2 = l1;
                                final int j9 = com.untis.mobile.c.i.J9;
                                ((LinearLayout)h2.findViewById(j9)).clearAnimation();
                                final ConstraintLayout$b layoutParams = new ConstraintLayout$b(-1, -2);
                                layoutParams.j = ((FrameLayout)l1.findViewById(com.untis.mobile.c.i.Gc)).getId();
                                ((ViewGroup$MarginLayoutParams)layoutParams).bottomMargin = -(((LinearLayout)l1.findViewById(j9)).getHeight() - dimensionPixelOffset);
                                ((LinearLayout)l1.findViewById(j9)).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                                ((LinearLayout)l1.findViewById(j9)).setTranslationY((float)(((LinearLayout)l1.findViewById(j9)).getHeight() - dimensionPixelOffset));
                                this.G = false;
                            }
                        }
                        catch (Exception ex) {
                            Log.e("untis_log", "error while on global layout", (Throwable)ex);
                        }
                    }
                });
            }
            this.B2();
            return;
        }
        k0.S("masterDataService");
        throw null;
    }
    
    private final void v1() {
        final Profile a2 = this.a2();
        final boolean a3 = com.untis.mobile.utils.g0.a((Context)this.H);
        final int n = 1;
        int visibility = 0;
        int n2 = n;
        if (a3) {
            if (a2.hasAnyState(ProfileState.InvalidApiSharedSecret, ProfileState.ServerDownForMaintenance)) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        final int v8 = com.untis.mobile.c.i.V8;
        final RelativeLayout relativeLayout = (RelativeLayout)l1.findViewById(v8);
        if (n2 == 0) {
            visibility = 8;
        }
        relativeLayout.setVisibility(visibility);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)l1.findViewById(com.untis.mobile.c.i.wJ);
        final StringBuilder sb = new StringBuilder();
        if (n2 != 0) {
            sb.append(((Activity)this.W0()).getString(2131886710));
        }
        ((TextView)appCompatTextView).setText((CharSequence)sb.toString());
        ((RelativeLayout)l1.findViewById(v8)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.timetable.f(this, a2));
    }
    
    private static final int v2(final TimeGridUnit timeGridUnit, final TimeGridUnit timeGridUnit2) {
        return timeGridUnit.getStart().b((n0)timeGridUnit2.getStart());
    }
    
    private static final void w1(final v v, final Profile profile, final View view) {
        k0.p(v, "this$0");
        k0.p(profile, "$profile");
        v.W0().onOfflineMessageClick(profile);
    }
    
    private final void x1() {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        ((VerticalZoomableScrollView)l1.findViewById(com.untis.mobile.c.i.Wc)).getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)new com.untis.mobile.ui.activities.timetable.g(l1, this));
    }
    
    private static final void y1(final View view, final v v) {
        k0.p(view, "$view");
        k0.p(v, "this$0");
        final int wc = com.untis.mobile.c.i.Wc;
        final int scrollY = ((VerticalZoomableScrollView)view.findViewById(wc)).getScrollY();
        final float r0 = v.R0();
        final float q0 = v.Q0();
        final float n = (float)scrollY;
        if (n < r0) {
            ((VerticalZoomableScrollView)view.findViewById(wc)).smoothScrollBy(0, 0);
            ((VerticalZoomableScrollView)view.findViewById(wc)).scrollTo(((VerticalZoomableScrollView)view.findViewById(wc)).getScrollX(), (int)r0);
        }
        else if (n > q0) {
            ((VerticalZoomableScrollView)view.findViewById(wc)).smoothScrollBy(0, 0);
            ((VerticalZoomableScrollView)view.findViewById(wc)).scrollTo(((VerticalZoomableScrollView)view.findViewById(wc)).getScrollX(), (int)q0);
        }
    }
    
    private final void y2() {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        AppCompatImageView appCompatImageView;
        com.untis.mobile.ui.activities.common.b b;
        int n;
        if (v.g0 == 7) {
            appCompatImageView = (AppCompatImageView)l1.findViewById(com.untis.mobile.c.i.Dc);
            b = this.H;
            n = 2131231123;
        }
        else {
            appCompatImageView = (AppCompatImageView)l1.findViewById(com.untis.mobile.c.i.Dc);
            b = this.H;
            n = 2131231121;
        }
        appCompatImageView.setImageDrawable(d.i((Context)b, n));
    }
    
    public static final /* synthetic */ t z() {
        return v.i0;
    }
    
    private final void z1() {
        s.a.J((n6.a<?>)new n6.a<String>() {
            final /* synthetic */ v G;
            
            @e
            public final String a() {
                final a d = v.D(this.G);
                if (d != null) {
                    final v.a b0 = v.b0;
                    final DisplayableEntity v = d.v(b0.j().getEntityType(), b0.j().getEntityId());
                    String s = "";
                    if (v != null) {
                        final String displayableTitle = v.getDisplayableTitle();
                        if (displayableTitle != null) {
                            s = displayableTitle;
                        }
                    }
                    return s;
                }
                k0.S("masterDataService");
                throw null;
            }
        }, (n6.l<? super Object, j2>)new n6.l<String, j2>() {
            final /* synthetic */ v G;
            
            public final void invoke(@e final String text) {
                k0.p(text, "title");
                final View l1 = this.G.l1();
                Object o;
                if (l1 == null) {
                    o = null;
                }
                else {
                    o = l1.findViewById(com.untis.mobile.c.i.Uc);
                }
                if (o != null) {
                    ((TextView)o).setText((CharSequence)text);
                }
                v.this.I2();
                v.this.G2();
                v.this.E2();
            }
        });
    }
    
    private final void z2(final View view) {
        final Profile a2 = this.a2();
        final TimeTableEntity k1 = this.k1();
        final EntityType entityType = k1.getEntityType();
        final EntityType none = EntityType.NONE;
        final int n = 0;
        final boolean b = entityType != none && a2.getEntityType() == k1.getEntityType() && a2.getEntityId() == k1.getEntityId();
        ((LinearLayout)view.findViewById(com.untis.mobile.c.i.UH)).setVisibility(h.U(a2.getEntityType().isParentRole() ^ true, 0, 1, null));
        final AppCompatImageView appCompatImageView = (AppCompatImageView)view.findViewById(com.untis.mobile.c.i.VH);
        int colorFilter;
        if (b) {
            colorFilter = this.U;
        }
        else {
            colorFilter = this.T;
        }
        ((ImageView)appCompatImageView).setColorFilter(colorFilter);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(com.untis.mobile.c.i.XH);
        int textColor;
        if (b) {
            textColor = this.U;
        }
        else {
            textColor = this.S;
        }
        ((TextView)appCompatTextView).setTextColor(textColor);
        final AppCompatImageView appCompatImageView2 = (AppCompatImageView)view.findViewById(com.untis.mobile.c.i.WH);
        int visibility;
        if (a2.getEntityType() == none) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        ((ImageView)appCompatImageView2).setVisibility(visibility);
    }
    
    public final void A2() {
        s.a.J((n6.a<?>)new n6.a<Drawable>() {
            final /* synthetic */ v G;
            
            @f
            public final Drawable a() {
                return com.untis.mobile.utils.extension.e.e((Context)this.G.W0(), 2131231132, v.this.d1());
            }
        }, (n6.l<? super Object, j2>)new n6.l<Drawable, j2>() {
            final /* synthetic */ v G;
            
            public final void a(@f final Drawable icon) {
                final View l1 = this.G.l1();
                if (l1 == null) {
                    return;
                }
                final MenuItem item = ((com.google.android.material.navigation.e)l1.findViewById(com.untis.mobile.c.i.Gc)).getMenu().findItem(2131298446);
                if (item != null) {
                    item.setIcon(icon);
                }
            }
        });
    }
    
    public final void C2() {
        this.s1();
        this.u1();
        this.I2();
        this.E1();
    }
    
    public final void I1(final int n) {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        final int t0 = this.T0();
        final int g0 = v.g0;
        if (n >= t0 - g0 && n <= t0 + g0) {
            s.a.x(new n6.a<j2>() {
                final /* synthetic */ v G;
                
                public final void invoke() {
                    final v g = this.G;
                    v.m0(g, g.K0());
                    final v g2 = this.G;
                    v.k0(g2, g2.J0());
                    final float x = v.this.R0();
                    final View h = l1;
                    final int wc = com.untis.mobile.c.i.Wc;
                    if (((VerticalZoomableScrollView)h.findViewById(wc)).getScrollY() < x) {
                        ((VerticalZoomableScrollView)l1.findViewById(wc)).smoothScrollBy(0, 0);
                        ((VerticalZoomableScrollView)l1.findViewById(wc)).scrollTo(((VerticalZoomableScrollView)l1.findViewById(wc)).getScrollX(), (int)x);
                    }
                    v.this.G0();
                    v.this.r1();
                    v.this.A1();
                }
            });
        }
    }
    
    public final void J1() {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        v.i0 = com.untis.mobile.utils.v.a.g();
        SyncedViewPager syncedViewPager;
        int g1;
        if (v.g0 == 7) {
            syncedViewPager = (SyncedViewPager)l1.findViewById(com.untis.mobile.c.i.Vc);
            g1 = 250;
        }
        else {
            syncedViewPager = (SyncedViewPager)l1.findViewById(com.untis.mobile.c.i.Vc);
            g1 = this.g1(com.untis.mobile.utils.time.a.b());
        }
        syncedViewPager.setCurrentItem(g1, true);
    }
    
    public final void M2(@e final View view) {
        k0.p(view, "view");
        ((ImageView)view.findViewById(com.untis.mobile.c.i.Ec)).setVisibility(h.U(v.f0, 0, 1, null));
        ((ImageView)view.findViewById(com.untis.mobile.c.i.Cc)).setVisibility(h.U(v.e0, 0, 1, null));
    }
    
    public final void O1() {
        final com.untis.mobile.messenger.a a = com.untis.mobile.messenger.a.a;
        if (a.h((Context)this.H)) {
            a.m((Context)this.H, this.a2(), null);
        }
        else {
            a.i((Context)this.H);
        }
    }
    
    public final void Q1() {
        com.untis.mobile.utils.a.a((Context)this.H).v0(this.L);
        com.untis.mobile.utils.a.a((Context)this.H).w0(v.g0);
        final com.untis.mobile.services.billing.i a0 = this.a0;
        if (a0 != null) {
            a0.onDestroy();
        }
        this.a0 = null;
    }
    
    public final void R1(@e final Profile profile, final boolean b) {
        k0.p(profile, "profile");
        this.H0();
        j0.G.h(profile);
        this.z0(v.b0.s((Context)this.H, profile, profile.createTimeTableEntity()).getExtras());
    }
    
    public final void T1() {
        if (kotlin.text.s.U1((CharSequence)v.c0)) {
            return;
        }
        final View l1 = this.l1();
        Object o;
        if (l1 == null) {
            o = null;
        }
        else {
            o = l1.findViewById(com.untis.mobile.c.i.Gc);
        }
        if (o != null) {
            ((com.google.android.material.navigation.e)o).setSelectedItemId(2131298447);
        }
        while (true) {
            try {
                final int n = v.g0 = com.untis.mobile.utils.a.a((Context)this.H).w(this.a2());
                this.L = this.K * 1.0f;
                if (n != 1 && n != 7) {
                    v.g0 = 7;
                }
                this.v1();
                this.x2();
                this.x2();
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final boolean U0(int i) {
        if (v.g0 != 7) {
            return true;
        }
        final t y0 = this.Y0(i);
        final com.untis.mobile.services.masterdata.a j = this.J;
        TimeGridDay timeGridDay = null;
        final TimeGridDay timeGridDay2 = null;
        if (j != null) {
            final TimeGrid y2 = j.y(y0);
            if (y2 != null) {
                final List<TimeGridDay> days = y2.getDays();
                if (days != null) {
                    final Iterator<Object> iterator = days.iterator();
                    TimeGridDay next;
                    do {
                        next = timeGridDay2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        next = iterator.next();
                        if (next.getWeekDay().getDateTimeConstant() == y0.p2()) {
                            i = 1;
                        }
                        else {
                            i = 0;
                        }
                    } while (i == 0);
                    timeGridDay = next;
                }
            }
            return timeGridDay != null;
        }
        k0.S("masterDataService");
        throw null;
    }
    
    public final void V1(@e final Bundle bundle) {
        k0.p(bundle, "save");
        bundle.putString("profile_id", v.c0);
        bundle.putInt("entity_type", v.d0.getEntityType().getWebuntisId());
        bundle.putLong("entity_id", v.d0.getEntityId());
    }
    
    @e
    public final com.untis.mobile.ui.activities.common.b W0() {
        return this.H;
    }
    
    @e
    public final t Y0(final int n) {
        t t;
        String s;
        if (v.g0 == 7) {
            t = com.untis.mobile.utils.time.a.b().S0(1).o0(n - 250);
            s = "localDate().withDayOfWeek(DateTimeConstants.MONDAY)\n                .plusWeeks(position - Constant.TimeTable.POSITION_START)";
        }
        else {
            t = com.untis.mobile.utils.time.a.b().S0(1).l0(n - 250);
            s = "localDate().withDayOfWeek(DateTimeConstants.MONDAY)\n            .plusDays(position - Constant.TimeTable.POSITION_START)";
        }
        k0.o(t, s);
        return t;
    }
    
    @e
    public final TimeTableActivity a1() {
        return this.G;
    }
    
    @e
    public final Profile a2() {
        final j0 g = j0.G;
        Profile profile;
        if ((profile = g.l(v.c0)) == null) {
            profile = g.n();
        }
        Profile profile2;
        if ((profile2 = profile) == null) {
            profile2 = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        return profile2;
    }
    
    public final void d2(final int i, final long l) {
        this.W.put(i, l);
        final View l2 = this.l1();
        boolean b = false;
        if (l2 != null) {
            final SyncedViewPager syncedViewPager = (SyncedViewPager)l2.findViewById(com.untis.mobile.c.i.Vc);
            if (syncedViewPager != null) {
                if (syncedViewPager.getCurrentItem() == i) {
                    b = true;
                }
            }
        }
        if (b) {
            this.D2(l);
        }
    }
    
    public final int e1() {
        return v.g0;
    }
    
    public final void e2(final int g0, @f final t t) {
        final int g2 = v.g0;
        if (g0 == g2) {
            return;
        }
        v.g0 = g0;
        if ((g2 == 7 && g0 != 7) || (g2 != 7 && g0 == 7)) {
            this.B1(t);
        }
        else {
            O2(this, t, false, 2, null);
        }
        com.untis.mobile.utils.a.a((Context)this.H).w0(v.g0);
        this.B2();
        this.y2();
    }
    
    public final int f1(int n) {
        final int g0 = v.g0;
        if (g0 != 7) {
            return g0;
        }
        final com.untis.mobile.services.masterdata.a j = this.J;
        Integer value = null;
        if (j != null) {
            final TimeGrid y = j.y(this.Y0(n));
            if (y != null) {
                final List<TimeGridDay> days = y.getDays();
                if (days != null) {
                    value = days.size();
                }
            }
            if (value == null) {
                n = v.g0;
            }
            else {
                n = value;
            }
            return n;
        }
        k0.S("masterDataService");
        throw null;
    }
    
    public final void g2() {
        final Profile n = j0.G.n();
        String uniqueId;
        if (n == null) {
            uniqueId = null;
        }
        else {
            uniqueId = n.getUniqueId();
        }
        String c0 = uniqueId;
        if (uniqueId == null) {
            c0 = v.c0;
        }
        v.c0 = c0;
        this.H0();
        final Profile a2 = this.a2();
        this.k2(new TimeTableEntity(a2.getEntityType(), a2.getEntityId(), false, 0, 0L, null, 60, null));
        this.s1();
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    public final float h1() {
        return this.L;
    }
    
    public final void h2(float l) {
        final float k = this.K;
        final float n = 0.5f * k;
        float n2 = l;
        if (l < n) {
            n2 = n;
        }
        final float n3 = k * 4.0f;
        l = n2;
        if (n2 > n3) {
            l = n3;
        }
        if (l == this.h1()) {
            return;
        }
        this.L = l;
        com.untis.mobile.utils.a.a((Context)this.H).v0(this.L);
        this.G0();
        final View l2 = this.l1();
        if (l2 == null) {
            return;
        }
        final int height = (int)this.m1(1440);
        ((TimeTableGridView)l2.findViewById(com.untis.mobile.c.i.Qc)).getLayoutParams().height = height;
        ((ImageView)l2.findViewById(com.untis.mobile.c.i.Oc)).getLayoutParams().height = height;
        ((ViewGroup)l2.findViewById(com.untis.mobile.c.i.Vc)).getLayoutParams().height = height;
        ((RelativeLayout)l2.findViewById(com.untis.mobile.c.i.Fc)).requestLayout();
    }
    
    public final void i2(final boolean b) {
        this.X0().H0(b);
    }
    
    public final float j1() {
        return this.M * com.untis.mobile.utils.a.a((Context)this.H).x();
    }
    
    public final void j2(final boolean b) {
        this.X0().P0(b);
    }
    
    @e
    public final TimeTableEntity k1() {
        return v.d0;
    }
    
    public final void k2(@e final TimeTableEntity d0) {
        k0.p(d0, "timeTableEntity");
        final k i = this.I;
        if (i != null) {
            i.p();
            final a b0 = v.b0;
            v.d0 = d0;
            final Profile a2 = this.a2();
            a2.setLastViewedEntityId(d0.getEntityId());
            a2.setLastViewedEntityType(d0.getEntityType());
            j0.G.d(a2);
            this.I0();
            this.G0();
            this.I1(250);
            this.z0(b0.s((Context)this.H, a2, d0).getExtras());
            return;
        }
        k0.S("timeTableService");
        throw null;
    }
    
    @f
    public final View l1() {
        return this.G.getView();
    }
    
    public final boolean l2() {
        if (com.untis.mobile.utils.a.a((Context)this.H).N(this.a2())) {
            final t t = new t();
            final com.untis.mobile.utils.v a = com.untis.mobile.utils.v.a;
            if (((org.joda.time.base.e)t).o((n0)a.b()) && ((org.joda.time.base.e)new t()).m((n0)a.c()) && this.X0().y()) {
                return true;
            }
        }
        return false;
    }
    
    public final float m1(final int i) {
        Float value;
        if ((value = this.O.get(i)) == null) {
            value = -1.0f;
        }
        final float floatValue = value.floatValue();
        final EntityType entityType = v.d0.getEntityType();
        final EntityType teacher = EntityType.TEACHER;
        final int n = 1;
        float n2 = 0.0f;
        Label_0352: {
            if (entityType != teacher) {
                n2 = floatValue;
                if (v.d0.getEntityType() != EntityType.ROOM) {
                    break Label_0352;
                }
            }
            if (this.N == null) {
                final ArrayList<r> n3 = new ArrayList<r>();
                final k j = this.I;
                if (j == null) {
                    k0.S("timeTableService");
                    throw null;
                }
                n3.addAll(j.x(v.d0));
                this.N = n3;
            }
            final boolean b = floatValue == -1.0f;
            n2 = floatValue;
            if (b) {
                float n4 = i * this.L;
                final ArrayList<r> n5 = this.N;
                if (n5 == null) {
                    n2 = n4;
                }
                else {
                    final Iterator<Object> iterator = n5.iterator();
                    while (true) {
                        n2 = n4;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final r r = iterator.next();
                        float n6;
                        float n7;
                        float l;
                        if (((org.joda.time.base.a)((org.joda.time.base.d)r).s()).p1() > i) {
                            if (i < ((org.joda.time.base.a)((org.joda.time.base.d)r).b()).p1()) {
                                continue;
                            }
                            n6 = n4 - (i - ((org.joda.time.base.a)((org.joda.time.base.d)r).b()).p1()) * this.L;
                            n7 = (float)(20 / ((org.joda.time.base.d)r).H().y() * (i - ((org.joda.time.base.a)((org.joda.time.base.d)r).b()).p1()));
                            l = this.L;
                        }
                        else {
                            final float n8 = (float)((org.joda.time.base.d)r).H().y();
                            final float k = this.L;
                            n6 = n4 - n8 * k;
                            final float n9 = 20;
                            l = k;
                            n7 = n9;
                        }
                        n4 = n6 + n7 * l;
                    }
                }
                this.O.put(i, n2);
            }
        }
        int n10;
        if (n2 == -1.0f) {
            n10 = n;
        }
        else {
            n10 = 0;
        }
        if (n10 != 0) {
            n2 = i * this.L;
            this.O.put(i, n2);
        }
        return n2;
    }
    
    public final boolean m2() {
        return com.untis.mobile.utils.a.a((Context)this.H).K() && this.a2().isEndOfPremium() && this.X0().A();
    }
    
    public final void n1() {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this.H, 2130771999);
        loadAnimation.setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
            public void onAnimationEnd(@e final Animation animation) {
                k0.p(animation, "animation");
                ((FrameLayout)l1.findViewById(com.untis.mobile.c.i.nd)).setVisibility(8);
            }
            
            public void onAnimationRepeat(@e final Animation animation) {
                k0.p(animation, "animation");
            }
            
            public void onAnimationStart(@e final Animation animation) {
                k0.p(animation, "animation");
            }
        });
        final Animation loadAnimation2 = AnimationUtils.loadAnimation((Context)this.H, 2130771997);
        loadAnimation2.setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
            public void onAnimationEnd(@e final Animation animation) {
                k0.p(animation, "animation");
                ((FrameLayout)l1.findViewById(com.untis.mobile.c.i.nd)).startAnimation(loadAnimation);
            }
            
            public void onAnimationRepeat(@e final Animation animation) {
                k0.p(animation, "animation");
            }
            
            public void onAnimationStart(@e final Animation animation) {
                k0.p(animation, "animation");
                ((FrameLayout)l1.findViewById(com.untis.mobile.c.i.nd)).setVisibility(0);
            }
        });
        ((Button)l1.findViewById(com.untis.mobile.c.i.kd)).setText((CharSequence)this.i1());
        ((FrameLayout)l1.findViewById(com.untis.mobile.c.i.nd)).startAnimation(loadAnimation2);
    }
    
    public final void o1(@f Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        final String string = bundle.getString("profile_id", v.c0);
        k0.o(string, "arguments.getString(\n                CoreActivity.ARGUMENT_PROFILE_ID,\n                profileId\n            )");
        v.c0 = string;
        final Profile a2 = this.a2();
        j0.G.h(a2);
        v.c0 = a2.getUniqueId();
        this.I = a2.getTimeTableService();
        this.J = a2.getMasterDataService();
        TimeTableEntity timeTableEntity;
        if (bundle.containsKey("entity_type") && bundle.containsKey("entity_id")) {
            timeTableEntity = new TimeTableEntity(EntityType.Companion.findBy(bundle.getInt("entity_type")), bundle.getLong("entity_id"), false, 0, 0L, null, 60, null);
        }
        else {
            timeTableEntity = a2.createTimeTableEntity();
        }
        v.d0 = timeTableEntity;
        v.g0 = com.untis.mobile.utils.a.a((Context)this.H).w(a2);
    }
    
    public final boolean o2() {
        final String p = this.X0().p();
        if (this.X0().k() && this.a2().isAfterEndOfPremium() && ((org.joda.time.base.e)new t()).p((n0)t.c0(p))) {
            this.X0().m0(new t().l0(3).toString());
            return true;
        }
        return false;
    }
    
    public final void p2() {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this.H, 2130771996);
        loadAnimation.setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
            final /* synthetic */ v b;
            
            public void onAnimationEnd(@e final Animation animation) {
                k0.p(animation, "animation");
                this.b.n1();
            }
            
            public void onAnimationRepeat(@e final Animation animation) {
                k0.p(animation, "animation");
            }
            
            public void onAnimationStart(@e final Animation animation) {
                k0.p(animation, "animation");
                ((FrameLayout)l1.findViewById(com.untis.mobile.c.i.nd)).setVisibility(0);
            }
        });
        ((Button)l1.findViewById(com.untis.mobile.c.i.kd)).setText((CharSequence)this.i1());
        ((FrameLayout)l1.findViewById(com.untis.mobile.c.i.nd)).startAnimation(loadAnimation);
    }
    
    public final void t2() {
        final View l1 = this.l1();
        if (l1 == null) {
            return;
        }
        if (v.d0.getEntityType() != EntityType.NONE && !this.a2().hasAnyRole(EntityType.TEACHER) && ((SyncedViewPager)l1.findViewById(com.untis.mobile.c.i.Vc)).getCurrentItem() == 250) {
            s.a.N(new n6.a<j2>() {
                public final void invoke() {
                    final View g = l1;
                    final int vc = com.untis.mobile.c.i.Vc;
                    ((SyncedViewPager)g.findViewById(vc)).setCurrentItem(((SyncedViewPager)l1.findViewById(vc)).getCurrentItem() + 1, false);
                    ((SyncedViewPager)l1.findViewById(com.untis.mobile.c.i.Pc)).setCurrentItem(((SyncedViewPager)l1.findViewById(vc)).getCurrentItem(), false);
                }
            });
        }
    }
    
    @e
    public final ArrayList<TimeGridUnit> u2() {
        if (this.P == null) {
            final ArrayList<Object> p = new ArrayList<Object>();
            final k i = this.I;
            if (i == null) {
                k0.S("timeTableService");
                throw null;
            }
            p.addAll(i.n(this.S0()));
            kotlin.collections.v.p0(p, com.untis.mobile.ui.activities.timetable.i.G);
            this.P = (ArrayList<TimeGridUnit>)p;
        }
        ArrayList<TimeGridUnit> p2;
        if ((p2 = this.P) == null) {
            p2 = new ArrayList<TimeGridUnit>();
        }
        return p2;
    }
    
    public final void w2(@e final t t) {
        k0.p(t, "date");
        final int g0 = v.g0;
        int n = 1;
        t s0 = t;
        if (g0 < 7) {
            s0 = t.S0(1);
        }
        if (v.g0 < 7) {
            n = 7;
        }
        this.e2(n, s0);
    }
    
    public final void x2() {
        final View v = this.V;
        if (v == null) {
            return;
        }
        this.D1(v);
    }
    
    public final void z0(@f final Bundle bundle) {
        this.o1(bundle);
        this.F0();
        s.a.J((n6.a<?>)new n6.a<j2>() {
            public final void invoke() {
                v.this.r2();
            }
        }, (n6.l<? super Object, j2>)new n6.l<j2, j2>() {
            public final void a(@e final j2 j2) {
                k0.p(j2, "it");
                v.this.I0();
                v.this.z1();
                v.this.v1();
                v.this.s1();
                v.this.r1();
                v.this.A1();
                v.this.B1(v.b0.a());
                v.this.u1();
                v.this.E1();
                v.this.x1();
                v.this.p1();
            }
        });
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010J.\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=¨\u0006C" }, d2 = { "com/untis/mobile/ui/activities/timetable/v$a", "", "Landroid/content/Intent;", "data", "Lcom/untis/mobile/persistence/models/EntityType;", "d", "", "c", "entityType", "entityId", "b", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "r", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "s", "", "appWidgetId", "Landroid/app/PendingIntent;", "t", "", "profileId", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "Lorg/joda/time/t;", "currentDate", "Lorg/joda/time/t;", "a", "()Lorg/joda/time/t;", "k", "(Lorg/joda/time/t;)V", "numberOfDays", "I", "g", "()I", "n", "(I)V", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "j", "()Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "q", "(Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;)V", "Lcom/untis/mobile/ui/activities/timetable/v;", "instance", "Lcom/untis/mobile/ui/activities/timetable/v;", "e", "()Lcom/untis/mobile/ui/activities/timetable/v;", "l", "(Lcom/untis/mobile/ui/activities/timetable/v;)V", "", "searchVisibility", "Z", "i", "()Z", "p", "(Z)V", "messengerVisibility", "f", "m", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final t a() {
            return v.z();
        }
        
        @e
        public final Intent b(@e final EntityType entityType, final long n) {
            k0.p(entityType, "entityType");
            final Intent intent = new Intent();
            intent.putExtra("entity_type", entityType.getWebuntisId());
            intent.putExtra("entity_id", n);
            return intent;
        }
        
        public final long c(@e final Intent intent) {
            k0.p(intent, "data");
            return intent.getLongExtra("entity_id", 0L);
        }
        
        @e
        public final EntityType d(@e final Intent intent) {
            k0.p(intent, "data");
            return EntityType.Companion.findBy(intent.getIntExtra("entity_type", 0));
        }
        
        @f
        public final v e() {
            return v.C();
        }
        
        public final boolean f() {
            return v.E();
        }
        
        public final int g() {
            return v.G();
        }
        
        @e
        public final String h() {
            return v.H();
        }
        
        public final boolean i() {
            return v.I();
        }
        
        @e
        public final TimeTableEntity j() {
            return v.J();
        }
        
        public final void k(@e final t t) {
            k0.p(t, "<set-?>");
            v.h0(t);
        }
        
        public final void l(@f final v v) {
            v.j0(v);
        }
        
        public final void m(final boolean b) {
            v.l0(b);
        }
        
        public final void n(final int n) {
            v.n0(n);
        }
        
        public final void o(@e final String s) {
            k0.p(s, "<set-?>");
            v.o0(s);
        }
        
        public final void p(final boolean b) {
            v.p0(b);
        }
        
        public final void q(@e final TimeTableEntity timeTableEntity) {
            k0.p(timeTableEntity, "<set-?>");
            v.q0(timeTableEntity);
        }
        
        @e
        public final Intent r(@e final Context context, @e final Profile profile) {
            k0.p(context, "context");
            k0.p(profile, "profile");
            final Intent intent = new Intent(context, (Class)CoreActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("profile_id", profile.getUniqueId());
            intent.putExtras(bundle);
            return intent;
        }
        
        @e
        public final Intent s(@e final Context context, @e final Profile profile, @e final TimeTableEntity timeTableEntity) {
            k0.p(context, "context");
            k0.p(profile, "profile");
            k0.p(timeTableEntity, "timeTableEntity");
            final Intent intent = new Intent(context, (Class)CoreActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("profile_id", profile.getUniqueId());
            bundle.putInt("entity_type", timeTableEntity.getEntityType().getWebuntisId());
            bundle.putLong("entity_id", timeTableEntity.getEntityId());
            intent.putExtras(bundle);
            return intent;
        }
        
        @e
        public final PendingIntent t(@e final Context context, final int n, @e final Profile profile, @e final EntityType entityType, final long n2) {
            k0.p(context, "context");
            k0.p(profile, "profile");
            k0.p(entityType, "entityType");
            final Intent intent = new Intent(context, (Class)CoreActivity.class);
            intent.setFlags(805339136);
            final Bundle bundle = new Bundle();
            bundle.putString("profile_id", profile.getUniqueId());
            bundle.putInt("entity_type", entityType.getWebuntisId());
            bundle.putLong("entity_id", n2);
            intent.putExtras(bundle);
            final PendingIntent activity = PendingIntent.getActivity(context, n, intent, 134217728);
            k0.o(activity, "getActivity(\n                context,\n                appWidgetId,\n                intent,\n                PendingIntent.FLAG_UPDATE_CURRENT\n            )");
            return activity;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u0019" }, d2 = { "com/untis/mobile/ui/activities/timetable/v$b", "", "", "e", "Z", "f", "()Z", "showSubjects", "showRooms", "d", "g", "showTeachers", "c", "showKlassen", "", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "b", "Ljava/util/List;", "()Ljava/util/List;", "histories", "a", "favorites", "showNoSchoolyearAndTimetablesMessage", "<init>", "(Ljava/util/List;Ljava/util/List;ZZZZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class b
    {
        @e
        private final List<TimeTableEntity> a;
        @e
        private final List<TimeTableEntity> b;
        private final boolean c;
        private final boolean d;
        private final boolean e;
        private final boolean f;
        private final boolean g;
        
        public b(@e final List<TimeTableEntity> a, @e final List<TimeTableEntity> b, final boolean c, final boolean d, final boolean e, final boolean f, final boolean g) {
            k0.p(a, "favorites");
            k0.p(b, "histories");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        @e
        public final List<TimeTableEntity> a() {
            return this.a;
        }
        
        @e
        public final List<TimeTableEntity> b() {
            return this.b;
        }
        
        public final boolean c() {
            return this.c;
        }
        
        public final boolean d() {
            return this.g;
        }
        
        public final boolean e() {
            return this.f;
        }
        
        public final boolean f() {
            return this.e;
        }
        
        public final boolean g() {
            return this.d;
        }
    }
}
