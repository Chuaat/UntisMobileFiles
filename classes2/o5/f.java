// 
// Decompiled by Procyon v0.5.36
// 

package o5;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.app.Activity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.d;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.content.Intent;
import android.content.Context;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import com.untis.mobile.services.profile.legacy.j0;
import android.content.DialogInterface;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import com.untis.mobile.utils.a;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.List;
import org.jetbrains.annotations.e;
import com.untis.mobile.ui.activities.profile.ProfilesActivity;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0014\u0010\u0017\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015¨\u0006\u001c" }, d2 = { "Lo5/f;", "Landroid/widget/BaseAdapter;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lkotlin/j2;", "k", "o", "l", "", "j", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "f", "", "getItemId", "getCount", "", "profiles", "p", "Lcom/untis/mobile/ui/activities/profile/ProfilesActivity;", "parentActivity", "<init>", "(Lcom/untis/mobile/ui/activities/profile/ProfilesActivity;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f extends BaseAdapter
{
    @e
    private final ProfilesActivity G;
    @e
    private List<Profile> H;
    @e
    private LayoutInflater I;
    private boolean J;
    
    public f(@e final ProfilesActivity g, @e final List<Profile> h) {
        k0.p(g, "parentActivity");
        k0.p(h, "profiles");
        this.G = g;
        this.H = h;
        final LayoutInflater from = LayoutInflater.from(((Activity)g).getApplicationContext());
        k0.o(from, "from(parentActivity.applicationContext)");
        this.I = from;
        this.J = a.a(((Activity)g).getApplicationContext()).K();
    }
    
    private static final void g(final f f, final Profile profile, final View view) {
        k0.p(f, "this$0");
        k0.p(profile, "$profile");
        f.k(profile);
    }
    
    private static final void h(final f f, final Profile profile, final View view) {
        k0.p(f, "this$0");
        k0.p(profile, "$profile");
        f.o(profile);
    }
    
    private static final void i(final f f, final Profile profile, final View view) {
        k0.p(f, "this$0");
        k0.p(profile, "$profile");
        f.l(profile);
    }
    
    private final boolean j(final Profile profile) {
        final Profile n = j0.G.n();
        String s = "";
        if (n != null) {
            final String uniqueId = n.getUniqueId();
            if (uniqueId != null) {
                s = uniqueId;
            }
        }
        return k0.g(s, profile.getUniqueId());
    }
    
    private final void k(final Profile profile) {
        j0.G.h(profile);
        final Intent d = TimeTableActivity.L.d((Context)this.G, profile);
        d.setFlags(805339136);
        ((Activity)this.G).startActivity(d);
    }
    
    private final void l(final Profile profile) {
        new AlertDialog$Builder((Context)this.G).setMessage(2131886553).setNegativeButton(2131886649, (DialogInterface$OnClickListener)b.G).setPositiveButton(2131886653, (DialogInterface$OnClickListener)new o5.a(this, profile)).show();
    }
    
    private static final void m(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private static final void n(final f f, final Profile profile, final DialogInterface dialogInterface, final int n) {
        k0.p(f, "this$0");
        k0.p(profile, "$profile");
        f.G.s(profile);
        dialogInterface.dismiss();
    }
    
    private final void o(final Profile profile) {
        this.G.t(profile);
    }
    
    @e
    public Profile f(final int n) {
        return this.H.get(n);
    }
    
    public int getCount() {
        return this.H.size() + ((this.H.isEmpty() ^ true) ? 1 : 0);
    }
    
    public long getItemId(final int n) {
        return this.H.get(n).getId();
    }
    
    @e
    public View getView(int sb, @org.jetbrains.annotations.f final View view, @org.jetbrains.annotations.f final ViewGroup viewGroup) {
        final int n = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.I.inflate(2131493240, viewGroup, false);
        }
        final int size = this.H.size();
        final int n2 = 4;
        if (sb == size) {
            inflate.setVisibility(4);
        }
        else {
            final Profile f = this.f(sb);
            final boolean j = this.j(f);
            ((LinearLayout)inflate.findViewById(c.i.pB)).setOnClickListener((View$OnClickListener)new o5.c(this, f));
            final AppCompatImageView appCompatImageView = (AppCompatImageView)inflate.findViewById(c.i.oB);
            sb = n2;
            if (j) {
                sb = 0;
            }
            ((ImageView)appCompatImageView).setVisibility(sb);
            sb = c.i.sB;
            ((TextView)inflate.findViewById(sb)).setText((CharSequence)f.getDisplayName());
            final TextView textView = (TextView)inflate.findViewById(sb);
            final ProfilesActivity g = this.G;
            if (j) {
                sb = 2131099677;
            }
            else {
                sb = 2131099995;
            }
            textView.setTextColor(d.f((Context)g, sb));
            ((TextView)inflate.findViewById(c.i.qB)).setText((CharSequence)f.getDisplayableDescription());
            if (f.isEndOfPremium()) {
                ((TextView)inflate.findViewById(c.i.rB)).setVisibility(8);
            }
            else {
                final a a = com.untis.mobile.utils.a.a(inflate.getContext().getApplicationContext());
                final TextView textView2 = (TextView)inflate.findViewById(c.i.rB);
                if (a.I(f) && !this.J) {
                    sb = n;
                }
                else {
                    sb = 8;
                }
                textView2.setVisibility(sb);
            }
            ((ImageButton)inflate.findViewById(c.i.lB)).setOnClickListener((View$OnClickListener)new o5.d(this, f));
            ((ImageButton)inflate.findViewById(c.i.kB)).setOnClickListener((View$OnClickListener)new o5.e(this, f));
        }
        k0.o(inflate, "view");
        return inflate;
    }
    
    public final void p(@e final List<Profile> h) {
        k0.p(h, "profiles");
        this.H = h;
        this.notifyDataSetChanged();
    }
}
