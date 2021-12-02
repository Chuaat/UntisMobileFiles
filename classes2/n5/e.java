// 
// Decompiled by Procyon v0.5.36
// 

package n5;

import android.widget.Button;
import com.untis.mobile.ui.activities.help.HelpActivity;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import androidx.appcompat.app.d$a;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.profile.legacy.j0;
import android.text.method.LinkMovementMethod;
import android.text.Html;
import org.jetbrains.annotations.f;
import android.widget.TextView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatButton;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.c;
import kotlin.jvm.internal.k0;
import android.content.DialogInterface;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import com.untis.mobile.ui.activities.timetable.v;
import android.view.View;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¨\u0006\b" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/TimeTableActivity;", "Landroid/view/View;", "view", "Lkotlin/j2;", "e", "g", "k", "i", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class e
{
    public static final void e(@org.jetbrains.annotations.e final TimeTableActivity timeTableActivity, @org.jetbrains.annotations.e final View view) {
        k0.p(timeTableActivity, "<this>");
        k0.p(view, "view");
        final v t = timeTableActivity.t();
        final boolean l2 = t.l2();
        final int wd = c.i.WD;
        view.findViewById(wd).setVisibility(h.U(l2, 0, 1, null));
        if (!l2) {
            k(timeTableActivity);
        }
        ((Button)view.findViewById(wd).findViewById(c.i.Bd)).setOnClickListener((View$OnClickListener)new n5.c(view, t, timeTableActivity));
    }
    
    private static final void f(final View view, final v v, final TimeTableActivity timeTableActivity, final View view2) {
        k0.p(view, "$view");
        k0.p(v, "$service");
        k0.p(timeTableActivity, "$this_initEndPremiumAnnouncement");
        view.findViewById(c.i.WD).setVisibility(8);
        v.i2(false);
        k(timeTableActivity);
    }
    
    public static final void g(@org.jetbrains.annotations.e final TimeTableActivity timeTableActivity, @org.jetbrains.annotations.e final View view) {
        k0.p(timeTableActivity, "<this>");
        k0.p(view, "view");
        final v t = timeTableActivity.t();
        final boolean m2 = t.m2();
        final int yd = c.i.YD;
        view.findViewById(yd).setVisibility(h.U(m2, 0, 1, null));
        if (!m2) {
            k(timeTableActivity);
        }
        ((TextView)view.findViewById(yd).findViewById(c.i.Cd)).setText((CharSequence)timeTableActivity.getString(2131886589));
        ((Button)view.findViewById(yd).findViewById(c.i.Bd)).setOnClickListener((View$OnClickListener)new d(view, t, timeTableActivity));
    }
    
    private static final void h(final View view, final v v, final TimeTableActivity timeTableActivity, final View view2) {
        k0.p(view, "$view");
        k0.p(v, "$service");
        k0.p(timeTableActivity, "$this_initRemovePremiumAnnouncement");
        view.findViewById(c.i.YD).setVisibility(8);
        v.j2(false);
        k(timeTableActivity);
    }
    
    public static final void i(@org.jetbrains.annotations.e final TimeTableActivity timeTableActivity, @f final View view) {
        k0.p(timeTableActivity, "<this>");
        final v t = timeTableActivity.t();
        if (view != null) {
            final int zd = c.i.ZD;
            ((TextView)view.findViewById(zd).findViewById(c.i.Fd)).setText((CharSequence)timeTableActivity.getString(2131886899));
            ((TextView)view.findViewById(zd).findViewById(c.i.Ed)).setText((CharSequence)timeTableActivity.getString(2131886898));
            final View viewById = view.findViewById(zd);
            final int cd = c.i.Cd;
            ((TextView)viewById.findViewById(cd)).setText((CharSequence)Html.fromHtml(timeTableActivity.getString(2131886897)));
            ((TextView)view.findViewById(zd).findViewById(cd)).setMovementMethod(LinkMovementMethod.getInstance());
            view.findViewById(zd).setVisibility(h.U(t.o2(), 0, 1, null));
            ((Button)view.findViewById(zd).findViewById(c.i.Bd)).setOnClickListener((View$OnClickListener)new b(view));
        }
    }
    
    private static final void j(final View view, final View view2) {
        k0.p(view, "$mainView");
        view.findViewById(c.i.ZD).setVisibility(8);
    }
    
    public static final void k(@org.jetbrains.annotations.e final TimeTableActivity timeTableActivity) {
        k0.p(timeTableActivity, "<this>");
        final v e = v.b0.e();
        if (e == null) {
            return;
        }
        final Profile n = j0.G.n();
        if (n == null) {
            return;
        }
        final View view = e.a1().getView();
        if (view == null) {
            return;
        }
        if (e.k1().getEntityType() == EntityType.NONE && n.getEntityType().isParentRole()) {
            new d$a((Context)e.W0(), 2131951624).L(2131493032).B(2131886660, (DialogInterface$OnClickListener)new a(e, n, view)).O();
            return;
        }
        if (e.e1() == 7) {
            HelpActivity.I.v(e.W0(), n, view);
        }
        else {
            HelpActivity.I.o(e.W0(), n, view);
        }
    }
    
    private static final void l(final v v, final Profile profile, final View view, final DialogInterface dialogInterface, final int n) {
        k0.p(v, "$service");
        k0.p(profile, "$profile");
        k0.p(view, "$view");
        dialogInterface.dismiss();
        if (v.e1() == 7) {
            HelpActivity.I.v(v.W0(), profile, view);
        }
        else {
            HelpActivity.I.o(v.W0(), profile, view);
        }
    }
}
