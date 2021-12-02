// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.absences;

import android.widget.ImageView;
import android.widget.ImageButton;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import java.util.List;
import android.view.ViewGroup;
import com.untis.mobile.api.websocket.WsEvent;
import androidx.lifecycle.l0;
import androidx.lifecycle.y;
import kotlin.j2;
import n6.l;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageButton;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.content.Intent;
import com.untis.mobile.substitutionplanning.absences.detail.TeacherOwnAbsenceDetailActivity;
import com.untis.mobile.substitutionplanning.add.AddTeacherOwnAbsenceActivity;
import kotlin.jvm.internal.k0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.collections.v;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.substitutionplanning.model.PeriodGroupCollectionDto;
import android.content.Context;
import kotlin.coroutines.g;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.websocket.OnWsEventListener;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\"\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0014R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'" }, d2 = { "Lcom/untis/mobile/substitutionplanning/absences/TeacherOwnAbsencesActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/api/websocket/OnWsEventListener;", "", "position", "Lkotlin/j2;", "z", "y", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupCollectionDto;", "periodGroupCollectionDto", "A", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/untis/mobile/api/websocket/WsEvent;", "wsEvent", "onWsEvent", "code", "onClosingWs", "onPause", "Lcom/untis/mobile/substitutionplanning/absences/h;", "G", "Lkotlin/b0;", "u", "()Lcom/untis/mobile/substitutionplanning/absences/h;", "viewModel", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "H", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "<init>", "()V", "I", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TeacherOwnAbsencesActivity extends b implements OnWsEventListener
{
    @e
    public static final a I;
    private static final int J = 1001;
    @e
    private final b0 G;
    @e
    private final CoroutineExceptionHandler H;
    
    static {
        I = new a(null);
    }
    
    public TeacherOwnAbsencesActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<h>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final h invoke() {
                return (h)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(h.class), null, null);
            }
        });
        this.H = (CoroutineExceptionHandler)new CoroutineExceptionHandler(CoroutineExceptionHandler.s) {
            final /* synthetic */ TeacherOwnAbsencesActivity G;
            
            public void handleException(@e final g g, @e final Throwable t) {
                com.untis.mobile.utils.extension.h.l((Context)this.G, t);
            }
        };
    }
    
    private final void A(final PeriodGroupCollectionDto periodGroupCollectionDto) {
        if (periodGroupCollectionDto == null) {
            return;
        }
        ((ViewGroup)this.findViewById(c.i.F7)).setVisibility(8);
        Object o;
        if ((o = periodGroupCollectionDto.getGroups()) == null) {
            o = v.E();
        }
        final LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat)this.findViewById(c.i.K7);
        final boolean empty = ((List)o).isEmpty();
        com.untis.mobile.substitutionplanning.absences.a a = null;
        ((ViewGroup)linearLayoutCompat).setVisibility(com.untis.mobile.utils.extension.h.U(empty, 0, 1, null));
        final RecyclerView$h adapter = ((RecyclerView)this.findViewById(c.i.E7)).getAdapter();
        if (adapter instanceof com.untis.mobile.substitutionplanning.absences.a) {
            a = (com.untis.mobile.substitutionplanning.absences.a)adapter;
        }
        if (a == null) {
            return;
        }
        a.k(periodGroupCollectionDto);
    }
    
    private final h u() {
        return this.G.getValue();
    }
    
    private static final void v(final TeacherOwnAbsencesActivity teacherOwnAbsencesActivity, final View view) {
        k0.p(teacherOwnAbsencesActivity, "this$0");
        ((ComponentActivity)teacherOwnAbsencesActivity).onBackPressed();
    }
    
    private static final void w(final TeacherOwnAbsencesActivity teacherOwnAbsencesActivity, final View view) {
        k0.p(teacherOwnAbsencesActivity, "this$0");
        teacherOwnAbsencesActivity.y();
    }
    
    private static final void x(final TeacherOwnAbsencesActivity teacherOwnAbsencesActivity, final PeriodGroupCollectionDto periodGroupCollectionDto) {
        k0.p(teacherOwnAbsencesActivity, "this$0");
        teacherOwnAbsencesActivity.A(periodGroupCollectionDto);
    }
    
    private final void y() {
        ((ComponentActivity)this).startActivityForResult(AddTeacherOwnAbsenceActivity.H.a((Context)this), 1001);
    }
    
    private final void z(final int n) {
        ((Activity)this).startActivity(TeacherOwnAbsenceDetailActivity.H.a((Context)this, n));
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, int n2, @f final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n2 == -1) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0 && n == 1001) {
            ((ViewGroup)this.findViewById(c.i.F7)).setVisibility(0);
            this.u().h(this.H, true);
        }
    }
    
    @Override
    public void onClosingWs(final int n) {
        if (n == 1001) {
            this.u().j(this);
        }
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131493380);
        ((ImageButton)this.findViewById(c.i.y7)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.absences.e(this));
        final int x7 = c.i.x7;
        ((ImageView)this.findViewById(x7)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.absences.f(this));
        ((ImageView)this.findViewById(x7)).setVisibility(com.untis.mobile.utils.extension.h.U(this.u().d(), 0, 1, null));
        ((RecyclerView)this.findViewById(c.i.E7)).setAdapter((RecyclerView$h)new com.untis.mobile.substitutionplanning.absences.a(null, new l<Integer, j2>() {
            public final void a(final int n) {
                TeacherOwnAbsencesActivity.this.z(n);
            }
        }, 1, null));
        ((ViewGroup)this.findViewById(c.i.F7)).setVisibility(0);
        h.i(this.u(), this.H, false, 2, null);
        this.u().g().j((y)this, (l0)new com.untis.mobile.substitutionplanning.absences.g(this));
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        if (((Activity)this).isFinishing()) {
            this.u().e();
        }
    }
    
    @Override
    public void onWsEvent(@e final WsEvent wsEvent) {
        k0.p(wsEvent, "wsEvent");
        ((ViewGroup)this.findViewById(c.i.F7)).setVisibility(0);
        this.u().h(this.H, true);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "com/untis/mobile/substitutionplanning/absences/TeacherOwnAbsencesActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "", "REQUEST_CODE_ADD", "I", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)TeacherOwnAbsencesActivity.class);
        }
    }
}
