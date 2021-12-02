// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.absences.detail;

import android.widget.TextView;
import android.widget.ImageButton;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.content.Intent;
import android.content.Context;
import com.untis.mobile.substitutionplanning.model.PeriodGroupDto;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.substitutionplanning.absences.d;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageButton;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import com.untis.mobile.substitutionplanning.absences.h;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010" }, d2 = { "Lcom/untis/mobile/substitutionplanning/absences/detail/TeacherOwnAbsenceDetailActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/j2;", "onCreate", "Lcom/untis/mobile/substitutionplanning/absences/h;", "G", "Lkotlin/b0;", "r", "()Lcom/untis/mobile/substitutionplanning/absences/h;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TeacherOwnAbsenceDetailActivity extends b
{
    @e
    public static final a H;
    @e
    private static final String I = "position";
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public TeacherOwnAbsenceDetailActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<h>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final h invoke() {
                return (h)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(h.class), null, null);
            }
        });
    }
    
    private final h r() {
        return this.G.getValue();
    }
    
    private static final void s(final TeacherOwnAbsenceDetailActivity teacherOwnAbsenceDetailActivity, final View view) {
        k0.p(teacherOwnAbsenceDetailActivity, "this$0");
        ((ComponentActivity)teacherOwnAbsenceDetailActivity).onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492935);
        final PeriodGroupDto f = this.r().f(((Activity)this).getIntent().getIntExtra("position", 0));
        if (f == null) {
            return;
        }
        ((ImageButton)this.findViewById(c.i.z7)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.absences.detail.b(this));
        ((TextView)this.findViewById(c.i.C7)).setText((CharSequence)d.e(f));
        ((RecyclerView)this.findViewById(c.i.B7)).setAdapter((RecyclerView$h)new com.untis.mobile.substitutionplanning.absences.detail.c(f));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "com/untis/mobile/substitutionplanning/absences/detail/TeacherOwnAbsenceDetailActivity$a", "", "Landroid/content/Context;", "context", "", "position", "Landroid/content/Intent;", "a", "", "ARGUMENT_POSITION", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, final int n) {
            k0.p(context, "context");
            final Intent intent = new Intent(context, (Class)TeacherOwnAbsenceDetailActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putInt("position", n);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
