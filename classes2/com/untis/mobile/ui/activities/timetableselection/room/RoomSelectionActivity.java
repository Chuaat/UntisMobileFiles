// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection.room;

import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.widget.TextView;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import android.content.Context;
import kotlinx.coroutines.CoroutineExceptionHandler;
import androidx.lifecycle.l0;
import com.google.android.material.tabs.c$b;
import com.google.android.material.tabs.TabLayout$f;
import com.untis.mobile.utils.extension.h;
import kotlin.j2;
import n6.l;
import com.google.android.material.tabs.TabLayout;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.viewpager2.widget.ViewPager2;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.collections.v;
import com.google.android.material.tabs.TabLayout$i;
import android.view.View;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import androidx.fragment.app.a0;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.k0;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.lifecycle.y;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/ui/activities/timetableselection/room/RoomSelectionActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/ui/activities/timetableselection/room/i;", "data", "Lkotlin/j2;", "C", "B", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/untis/mobile/ui/activities/timetableselection/room/z;", "G", "Lkotlin/b0;", "v", "()Lcom/untis/mobile/ui/activities/timetableselection/room/z;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class RoomSelectionActivity extends b
{
    @e
    public static final a H;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public RoomSelectionActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<z>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final z invoke() {
                return (z)org.koin.androidx.viewmodel.ext.android.b.b(this.G, k1.d(z.class), null, null);
            }
        });
    }
    
    private static final void A(final AppCompatTextView appCompatTextView, final RoomSelectionActivity roomSelectionActivity, final com.untis.mobile.ui.activities.timetableselection.room.a a) {
        k0.p(roomSelectionActivity, "this$0");
        ((TextView)appCompatTextView).setText((CharSequence)roomSelectionActivity.v().l());
    }
    
    private final void B() {
        final a0 r = ((androidx.fragment.app.d)this).getSupportFragmentManager().r();
        k0.o(r, "supportFragmentManager.beginTransaction()");
        r.h(2131296801, (Fragment)RoomSelectionFilterFragment.H.a(), "room_selection_filter");
        r.p("room_selection_filter");
        r.r();
    }
    
    private final void C(final i i) {
        final Room h = i.h();
        if (h == null) {
            return;
        }
        ((Activity)this).setResult(-1, TimeTableActivity.L.a(EntityType.ROOM, h.getId()));
        ((Activity)this).finish();
    }
    
    private final z v() {
        return this.G.getValue();
    }
    
    private static final void w(final RoomSelectionActivity roomSelectionActivity, final View view) {
        k0.p(roomSelectionActivity, "this$0");
        ((ComponentActivity)roomSelectionActivity).onBackPressed();
    }
    
    private static final void x(final RoomSelectionActivity roomSelectionActivity, final View view) {
        k0.p(roomSelectionActivity, "this$0");
        roomSelectionActivity.B();
    }
    
    private static final void y(final RoomSelectionActivity roomSelectionActivity, final TabLayout$i tabLayout$i, final int n) {
        k0.p(roomSelectionActivity, "this$0");
        k0.p(tabLayout$i, "tab");
        tabLayout$i.D((CharSequence)v.L(((Activity)roomSelectionActivity).getString(2131886670), ((Activity)roomSelectionActivity).getString(2131886170)).get(n));
    }
    
    private static final void z(final RoomSelectionActivity roomSelectionActivity, final i i) {
        k0.p(roomSelectionActivity, "this$0");
        k0.o(i, "it");
        roomSelectionActivity.C(i);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492952);
        ((ImageView)this.findViewById(2131296799)).setOnClickListener((View$OnClickListener)new d(this));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(2131296802);
        ((TextView)appCompatTextView).setText((CharSequence)this.v().l());
        final AppCompatImageView appCompatImageView = (AppCompatImageView)this.findViewById(2131296800);
        ((ImageView)appCompatImageView).setOnClickListener((View$OnClickListener)new c(this));
        final ViewPager2 viewPager2 = (ViewPager2)this.findViewById(2131296805);
        final FragmentManager supportFragmentManager = ((androidx.fragment.app.d)this).getSupportFragmentManager();
        k0.o(supportFragmentManager, "supportFragmentManager");
        final androidx.lifecycle.s lifecycle = ((ComponentActivity)this).getLifecycle();
        k0.o(lifecycle, "lifecycle");
        viewPager2.setAdapter((RecyclerView$h)new s(supportFragmentManager, lifecycle));
        final TabLayout tabLayout = (TabLayout)this.findViewById(2131296803);
        tabLayout.d((TabLayout$f)new com.untis.mobile.utils.m0(new l<TabLayout$i, j2>() {
            public final void a(@e final TabLayout$i tabLayout$i) {
                k0.p(tabLayout$i, "tab");
                ((TextView)appCompatTextView).setVisibility(h.U(tabLayout$i.k() == 1, 0, 1, null));
                ((ImageView)appCompatImageView).setVisibility(h.U(tabLayout$i.k() == 1, 0, 1, null));
            }
        }));
        new com.google.android.material.tabs.c(tabLayout, viewPager2, (c$b)new g(this)).a();
        this.v().m().j((y)this, (l0)new com.untis.mobile.ui.activities.timetableselection.room.f(this));
        this.v().n((CoroutineExceptionHandler)new CoroutineExceptionHandler(CoroutineExceptionHandler.s) {
            final /* synthetic */ RoomSelectionActivity G;
            
            public void handleException(@e final g g, @e final Throwable t) {
                h.l((Context)this.G, t);
            }
        });
        this.v().i().j((y)this, (l0)new com.untis.mobile.ui.activities.timetableselection.room.e(appCompatTextView, this));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/timetableselection/room/RoomSelectionActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)RoomSelectionActivity.class);
        }
    }
}
