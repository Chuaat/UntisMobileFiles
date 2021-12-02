// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.help;

import android.app.Activity;
import androidx.fragment.app.d;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import android.content.Context;
import android.content.Intent;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.Arrays;
import kotlin.jvm.internal.p1;
import android.view.ViewGroup$LayoutParams;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup$MarginLayoutParams;
import android.os.PersistableBundle;
import java.util.Collection;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import m6.k;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.List;
import com.viewpagerindicator.CirclePageIndicator;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/ui/activities/help/HelpActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "r", "q", "Landroid/os/Bundle;", "save", "onCreate", "outState", "Landroid/os/PersistableBundle;", "outPersistentState", "onSaveInstanceState", "onBackPressed", "Landroidx/viewpager/widget/ViewPager;", "H", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "Ljava/util/ArrayList;", "Lcom/untis/mobile/ui/activities/help/b;", "G", "Ljava/util/ArrayList;", "contexts", "<init>", "()V", "I", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class HelpActivity extends b
{
    @e
    public static final a I;
    @e
    private static final String J = "context";
    @e
    private final ArrayList<com.untis.mobile.ui.activities.help.b> G;
    @f
    private ViewPager H;
    
    static {
        I = new a(null);
    }
    
    public HelpActivity() {
        this.G = new ArrayList<com.untis.mobile.ui.activities.help.b>();
    }
    
    private final void q() {
        this.setContentView(2131492918);
        this.H = (ViewPager)this.findViewById(2131296589);
        final CirclePageIndicator circlePageIndicator = (CirclePageIndicator)this.findViewById(2131296587);
        final ViewPager h = this.H;
        if (h != null) {
            h.setAdapter((androidx.viewpager.widget.a)new com.untis.mobile.ui.activities.help.a(((d)this).getSupportFragmentManager(), this.G));
        }
        circlePageIndicator.setViewPager(this.H);
    }
    
    private final void r() {
        this.setContentView(2131492916);
        ((d)this).getSupportFragmentManager().r().h(2131296588, (Fragment)HelpPageFragment.v(this.G.get(0), true), "help_page").r();
    }
    
    @k
    public static final void s(@e final b b, @e final View view) {
        HelpActivity.I.n(b, view);
    }
    
    @k
    public static final void t(@e final b b, @e final View view) {
        HelpActivity.I.p(b, view);
    }
    
    @k
    public static final void u(@e final b b, @e final View view) {
        HelpActivity.I.q(b, view);
    }
    
    @k
    public static final void v(@e final b b, @e final View view) {
        HelpActivity.I.r(b, view);
    }
    
    @k
    public static final void w(@e final b b, @f final Profile profile, @e final View view) {
        HelpActivity.I.u(b, profile, view);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onBackPressed() {
        final ViewPager h = this.H;
        if (h != null) {
            k0.m(h);
            if (h.getCurrentItem() + 1 < this.G.size()) {
                final ViewPager h2 = this.H;
                k0.m(h2);
                final ViewPager h3 = this.H;
                k0.m(h3);
                h2.setCurrentItem(h3.getCurrentItem() + 1);
                return;
            }
        }
        super.onBackPressed();
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (extras != null) {
            final ArrayList parcelableArrayList = extras.getParcelableArrayList("context");
            if (parcelableArrayList != null) {
                this.G.addAll(parcelableArrayList);
            }
        }
        if (this.G.size() == 0) {
            ((Activity)this).finish();
            return;
        }
        if (this.G.size() == 1) {
            this.r();
        }
        else {
            this.q();
        }
        if (this.G.size() == 0) {
            ((Activity)this).finish();
        }
    }
    
    public void onSaveInstanceState(@e final Bundle bundle, @e final PersistableBundle persistableBundle) {
        k0.p(bundle, "outState");
        k0.p(persistableBundle, "outPersistentState");
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putParcelableArrayList("context", (ArrayList)this.G);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b;\u0010<J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0002J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J&\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J \u0010%\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0018\u0010'\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0018\u0010(\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0018\u0010)\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0018\u0010*\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0016\u0010+\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001fJ6\u00101\u001a\u00020\"2\u0006\u0010,\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tJ\u001e\u00102\u001a\u00020\"2\u0006\u0010,\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\tJ \u00105\u001a\u00020\"2\u0006\u0010,\u001a\u00020&2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010 \u001a\u00020\u001fJ \u00106\u001a\u00020\"2\u0006\u0010,\u001a\u00020&2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010 \u001a\u00020\u001fJ\"\u00107\u001a\u00020\"2\u0006\u0010,\u001a\u00020&2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010 \u001a\u00020\u001fH\u0007R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006=" }, d2 = { "com/untis/mobile/ui/activities/help/HelpActivity$a", "", "Ljava/util/ArrayList;", "Lcom/untis/mobile/ui/activities/help/b;", "e", "j", "d", "i", "h", "", "showRoomSearchHelp", "showLessonTopicHelp", "showAbsencesHelp", "showPeriodCustomNotificationHelp", "showHomeworkHelp", "f", "showClassbookHelp", "showClassRoleHelp", "b", "showWeeklyViewHelp", "showSearchPlanHelp", "showTimeTableZoomHelp", "showDatePickerHelp", "yearlyPremiumRenewing", "k", "c", "showTimeTableSearch", "showTimeTableFavorite", "g", "Landroidx/appcompat/app/e;", "activity", "Landroid/view/View;", "root", "contexts", "Lkotlin/j2;", "w", "helpPageContext", "l", "Lcom/untis/mobile/ui/activities/common/b;", "r", "q", "p", "n", "t", "umActivity", "showRoomSearch", "showLessonTopic", "showAbsences", "showHomeWorks", "s", "m", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "v", "o", "u", "", "BUNDLE_CONTEXT_LIST", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        private final ArrayList<com.untis.mobile.ui.activities.help.b> b(final boolean b, final boolean b2) {
            final ArrayList<com.untis.mobile.ui.activities.help.b> list = new ArrayList<com.untis.mobile.ui.activities.help.b>();
            if (b) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131297915, 2131493133, com.untis.mobile.ui.activities.help.k.I));
                list.add(new com.untis.mobile.ui.activities.help.b(2131297915, 2131493134, com.untis.mobile.ui.activities.help.k.J));
                list.add(new com.untis.mobile.ui.activities.help.b(2131298431, 2131493136, com.untis.mobile.ui.activities.help.k.G));
            }
            if (b2) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131298432, 2131493135, com.untis.mobile.ui.activities.help.k.G));
            }
            return list;
        }
        
        private final ArrayList<com.untis.mobile.ui.activities.help.b> c(final boolean b, final boolean b2, final boolean b3) {
            final ArrayList<com.untis.mobile.ui.activities.help.b> list = new ArrayList<com.untis.mobile.ui.activities.help.b>();
            if (b3) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131296958, 2131493140, com.untis.mobile.ui.activities.help.k.G));
            }
            if (b) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131298442, 2131493153, com.untis.mobile.ui.activities.help.k.G));
            }
            if (b2) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131493156));
            }
            return list;
        }
        
        private final ArrayList<com.untis.mobile.ui.activities.help.b> d() {
            final ArrayList<com.untis.mobile.ui.activities.help.b> list = new ArrayList<com.untis.mobile.ui.activities.help.b>();
            list.add(new com.untis.mobile.ui.activities.help.b(2131493142));
            return list;
        }
        
        private final ArrayList<com.untis.mobile.ui.activities.help.b> e() {
            final ArrayList<com.untis.mobile.ui.activities.help.b> list = new ArrayList<com.untis.mobile.ui.activities.help.b>();
            list.add(new com.untis.mobile.ui.activities.help.b(2131493143));
            return list;
        }
        
        private final ArrayList<com.untis.mobile.ui.activities.help.b> f(final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
            final ArrayList<com.untis.mobile.ui.activities.help.b> list = new ArrayList<com.untis.mobile.ui.activities.help.b>();
            if (b4) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131298439, 2131493146, com.untis.mobile.ui.activities.help.k.G));
            }
            if (b) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131297745, 2131493149, com.untis.mobile.ui.activities.help.k.G));
            }
            if (b2) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131297725, 2131493148, com.untis.mobile.ui.activities.help.k.H));
            }
            if (b3) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131297723, 2131493145, com.untis.mobile.ui.activities.help.k.H));
            }
            if (b5) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131297724, 2131493147, com.untis.mobile.ui.activities.help.k.H));
            }
            return list;
        }
        
        private final ArrayList<com.untis.mobile.ui.activities.help.b> g(final boolean b, final boolean b2) {
            final ArrayList<com.untis.mobile.ui.activities.help.b> list = new ArrayList<com.untis.mobile.ui.activities.help.b>();
            if (b) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131298452, 2131493155, com.untis.mobile.ui.activities.help.k.G));
            }
            if (b2) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131298079, 2131493154, com.untis.mobile.ui.activities.help.k.G));
            }
            return list;
        }
        
        private final ArrayList<com.untis.mobile.ui.activities.help.b> h() {
            final ArrayList<com.untis.mobile.ui.activities.help.b> list = new ArrayList<com.untis.mobile.ui.activities.help.b>();
            list.add(new com.untis.mobile.ui.activities.help.b(2131493150));
            return list;
        }
        
        private final ArrayList<com.untis.mobile.ui.activities.help.b> i() {
            final ArrayList<com.untis.mobile.ui.activities.help.b> list = new ArrayList<com.untis.mobile.ui.activities.help.b>();
            final com.untis.mobile.ui.activities.help.k g = com.untis.mobile.ui.activities.help.k.G;
            list.add(new com.untis.mobile.ui.activities.help.b(2131298434, 2131493138, g));
            list.add(new com.untis.mobile.ui.activities.help.b(2131298433, 2131493137, g));
            return list;
        }
        
        private final ArrayList<com.untis.mobile.ui.activities.help.b> j() {
            final ArrayList<com.untis.mobile.ui.activities.help.b> list = new ArrayList<com.untis.mobile.ui.activities.help.b>();
            list.add(new com.untis.mobile.ui.activities.help.b(2131297698, 2131493151, com.untis.mobile.ui.activities.help.k.G));
            return list;
        }
        
        private final ArrayList<com.untis.mobile.ui.activities.help.b> k(final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
            final ArrayList<com.untis.mobile.ui.activities.help.b> list = new ArrayList<com.untis.mobile.ui.activities.help.b>();
            if (b4) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131296965, 2131493140, com.untis.mobile.ui.activities.help.k.G));
            }
            if (b) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131296967, 2131493157, com.untis.mobile.ui.activities.help.k.H));
            }
            if (b2) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131298442, 2131493153, com.untis.mobile.ui.activities.help.k.G));
            }
            if (b3) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131493156));
            }
            if (b5) {
                list.add(new com.untis.mobile.ui.activities.help.b(2131493159));
            }
            return list;
        }
        
        private final boolean l(View viewById, final com.untis.mobile.ui.activities.help.b b, final androidx.appcompat.app.e e) {
            if (b.d() == 0) {
                return true;
            }
            viewById = viewById.findViewById(b.d());
            if (viewById != null) {
                final int[] array = new int[2];
                viewById.getLocationInWindow(array);
                float n = 0.0f;
                final ViewGroup$LayoutParams layoutParams = viewById.getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                    final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                    final int topMargin = viewGroup$MarginLayoutParams.topMargin;
                    final int bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
                    if (topMargin > bottomMargin) {
                        n = (float)topMargin;
                    }
                    else {
                        n = (float)bottomMargin;
                    }
                }
                final float n2 = (float)array[0];
                final float n3 = array[0] + (float)viewById.getWidth();
                final float n4 = array[1] - viewById.getHeight() * 0.5f + n;
                final float n5 = array[1] + viewById.getHeight() * 0.5f + n;
                final float applyDimension = TypedValue.applyDimension(1, 1.0f, e.getResources().getDisplayMetrics());
                final com.untis.mobile.ui.activities.help.k b2 = b.b();
                int n6;
                if (b2 == null) {
                    n6 = -1;
                }
                else {
                    n6 = HelpActivity.a.a.a[b2.ordinal()];
                }
                j j;
                if (n6 != 1) {
                    if (n6 != 2) {
                        if (n6 != 3) {
                            if (n6 != 4) {
                                Log.e("HelpActivity", "holeViewShape does not exists");
                                return true;
                            }
                            final float n7 = (float)array[0];
                            final float n8 = (float)array[1];
                            final float n9 = (float)viewById.getWidth();
                            int n10;
                            if (viewById.getWidth() < viewById.getHeight()) {
                                n10 = viewById.getHeight();
                            }
                            else {
                                n10 = viewById.getWidth();
                            }
                            j = new com.untis.mobile.ui.activities.help.f(n7 + n9 * 0.5f, n8 - viewById.getPaddingTop() * 0.5f, n10 * 0.5f);
                        }
                        else {
                            j = new i(n2, n4, n3, n5, applyDimension);
                        }
                    }
                    else {
                        j = new h(n2, n4, n3, n5, applyDimension);
                    }
                }
                else {
                    j = new g(n2, n4, n3, n5);
                }
                b.e(j);
            }
            return true;
        }
        
        private final void w(final androidx.appcompat.app.e e, final View view, final ArrayList<com.untis.mobile.ui.activities.help.b> list) {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver == null) {
                final p1 a = p1.a;
                final String format = String.format("treeobserver is null", Arrays.copyOf(new Object[0], 0));
                k0.o(format, "java.lang.String.format(format, *args)");
                Log.e("untis_log", format);
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    final Iterator<com.untis.mobile.ui.activities.help.b> iterator = list.iterator();
                    boolean b = true;
                    while (iterator.hasNext()) {
                        final com.untis.mobile.ui.activities.help.b b2 = iterator.next();
                        final HelpActivity.a i = HelpActivity.I;
                        final View h = view;
                        k0.o(b2, "helpPageContext");
                        if (!i.l(h, b2, e)) {
                            b = false;
                        }
                    }
                    if (b) {
                        final Intent intent = new Intent((Context)e, (Class)HelpActivity.class);
                        final Bundle bundle = new Bundle();
                        intent.putParcelableArrayListExtra("context", (ArrayList)list);
                        intent.putExtras(bundle);
                        ((Activity)e).startActivity(intent);
                        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                        }
                    }
                }
            });
        }
        
        public final void m(@e final b b, @e final View view, final boolean b2) {
            k0.p(b, "umActivity");
            k0.p(view, "root");
            final boolean k1 = com.untis.mobile.utils.a.a((Context)b).k1();
            if (k1) {
                com.untis.mobile.utils.a.a((Context)b).A0(false);
            }
            final boolean b3 = b2 && com.untis.mobile.utils.a.a((Context)b).l1();
            if (b3) {
                com.untis.mobile.utils.a.a((Context)b).B0(false);
            }
            if (k1 || b3) {
                this.w(b, view, this.b(k1, b3));
            }
        }
        
        @k
        public final void n(@e final b b, @e final View view) {
            k0.p(b, "activity");
            k0.p(view, "root");
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
            final boolean o = a.O();
            if (o) {
                a.C0(false);
            }
            if (o) {
                this.w(b, view, this.i());
            }
        }
        
        public final void o(@e final b b, @f final Profile profile, @e final View view) {
            k0.p(b, "umActivity");
            k0.p(view, "root");
            if (profile == null) {
                return;
            }
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
            final boolean o1 = a.o1();
            if (o1) {
                a.G0(false);
            }
            final boolean s1 = a.s1();
            boolean b2 = true;
            final boolean b3 = s1 && a.I(profile);
            if (b3) {
                a.e0(false);
            }
            if (!a.G1() || !a.I(profile)) {
                b2 = false;
            }
            if (b2) {
                a.V0(false);
            }
            if (b3 || b2 || o1) {
                this.w(b, view, this.c(b3, b2, o1));
            }
        }
        
        @k
        public final void p(@e final b b, @e final View view) {
            k0.p(b, "activity");
            k0.p(view, "root");
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
            final boolean y1 = a.y1();
            if (y1) {
                a.O0(false);
            }
            if (y1) {
                this.w(b, view, this.d());
            }
        }
        
        @k
        public final void q(@e final b b, @e final View view) {
            k0.p(b, "activity");
            k0.p(view, "root");
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
            final boolean e1 = a.E1();
            if (e1) {
                a.T0(false);
            }
            if (e1) {
                this.w(b, view, this.j());
            }
        }
        
        @k
        public final void r(@e final b b, @e final View view) {
            k0.p(b, "activity");
            k0.p(view, "root");
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
            final boolean w1 = a.w1();
            if (w1) {
                a.M0(false);
            }
            if (w1) {
                this.w(b, view, this.e());
            }
        }
        
        public final void s(@e final b b, @e final View view, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
            k0.p(b, "umActivity");
            k0.p(view, "root");
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
            final boolean p6 = a.P();
            if (p6) {
                a.E0(false);
            }
            final boolean b6 = b2 && a.z1();
            if (b6) {
                a.Q0(false);
            }
            final boolean b7 = b3 && a.x1();
            if (b7) {
                a.N0(false);
            }
            final boolean b8 = b4 && a.h1();
            if (b8) {
                a.z0(false);
            }
            final boolean b9 = b5 && a.u1();
            if (b9) {
                a.K0(false);
            }
            if (b6 || b7 || b8 || b9 || p6) {
                this.w(b, view, this.f(b6, b7, b8, p6, b9));
            }
        }
        
        public final void t(@e final b b, @e final View view) {
            k0.p(b, "activity");
            k0.p(view, "root");
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
            final boolean m1 = a.m1();
            if (m1) {
                a.D0(false);
            }
            if (m1) {
                this.w(b, view, this.h());
            }
        }
        
        @k
        public final void u(@e final b b, @f final Profile profile, @e final View view) {
            k0.p(b, "umActivity");
            k0.p(view, "root");
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
            final boolean c1 = a.C1();
            if (c1) {
                a.y0(false);
            }
            final boolean b2 = a.D1() && a.I(profile);
            if (b2) {
                a.S0(false);
            }
            if (c1 || b2) {
                this.w(b, view, this.g(c1, b2));
            }
        }
        
        public final void v(@e final b b, @f final Profile profile, @e final View view) {
            k0.p(b, "umActivity");
            k0.p(view, "root");
            if (profile == null) {
                return;
            }
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)b);
            final boolean o1 = a.o1();
            if (o1) {
                a.G0(false);
            }
            final boolean h1 = a.H1();
            if (h1) {
                a.W0(false);
            }
            final boolean s1 = a.s1();
            boolean b2 = true;
            final boolean b3 = s1 && a.I(profile);
            if (b3) {
                a.e0(false);
            }
            if (!a.G1() || !a.I(profile)) {
                b2 = false;
            }
            if (b2) {
                a.V0(false);
            }
            final boolean e = a.E();
            if (h1 || b3 || b2 || o1 || e) {
                this.w(b, view, this.k(h1, b3, b2, o1, e));
            }
        }
    }
}
