// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters;

import org.joda.time.base.e;
import android.app.Activity;
import com.untis.mobile.persistence.models.masterdata.Subject;
import android.graphics.drawable.Drawable;
import com.untis.mobile.persistence.models.masterdata.Student;
import android.view.View$OnClickListener;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import org.joda.time.n0;
import android.graphics.PorterDuff$Mode;
import com.untis.mobile.persistence.models.EntityType;
import android.widget.ImageView;
import android.view.ViewGroup;
import com.untis.mobile.ui.dialogs.InfoCenterNotificationDialog;
import android.util.Log;
import org.joda.time.c;
import org.joda.time.l0;
import java.util.Iterator;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import android.widget.TextView;
import android.view.View;
import com.untis.mobile.services.infocenter.w;
import com.untis.mobile.systemNotifications.d;
import android.content.Context;
import java.util.Comparator;
import java.util.Collections;
import com.untis.mobile.services.infocenter.a;
import java.util.List;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.j0;
import com.untis.mobile.ui.activities.common.b;
import android.widget.BaseAdapter;

public class h extends BaseAdapter
{
    @j0
    private b G;
    @j0
    private Profile H;
    @k0
    private Child I;
    @j0
    private LayoutInflater J;
    @j0
    private FragmentManager K;
    @j0
    private List<j.a> L;
    private com.untis.mobile.systemNotifications.b M;
    private a N;
    private com.untis.mobile.services.masterdata.a O;
    
    public h(@j0 final b g, final FragmentManager k, final Child i, @j0 final List<j.a> l) {
        this.G = g;
        this.I = i;
        Collections.sort(this.L = l, new g(this));
        this.J = LayoutInflater.from((Context)g);
        this.K = k;
        this.H = com.untis.mobile.services.profile.legacy.j0.G.n();
        this.M = new d().a();
        this.N = new w(this.H.getUniqueId());
        this.O = this.H.getMasterDataService();
    }
    
    private void c(final TextView textView, final TextView textView2, final TextView textView3, final String s, final String s2) {
        if (textView.getText().toString().isEmpty()) {
            textView.setText((CharSequence)s);
            textView2.setText((CharSequence)s2);
        }
        else {
            textView2.setText((CharSequence)s);
            textView3.setText((CharSequence)s2);
        }
        if (textView2.getText().toString().isEmpty()) {
            textView2.setVisibility(8);
        }
        else {
            textView2.setVisibility(0);
        }
        if (textView3.getText().toString().isEmpty()) {
            textView3.setVisibility(8);
        }
        else {
            textView3.setVisibility(0);
        }
    }
    
    private String d(@j0 final List<Klasse> list) {
        final StringBuilder sb = new StringBuilder();
        for (final Klasse klasse : list) {
            if (klasse == null) {
                continue;
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(klasse.getName());
        }
        return sb.toString();
    }
    
    private int g(final j.a a, final j.a a2) {
        c c;
        if (a.j()) {
            c = a.g();
        }
        else {
            c = a.b();
        }
        c c2;
        if (a2.j()) {
            c2 = a2.g();
        }
        else {
            c2 = a2.b();
        }
        if (((org.joda.time.base.c)c).C((l0)c2)) {
            return -1;
        }
        if (((org.joda.time.base.c)c).R((l0)c2)) {
            return 1;
        }
        return 0;
    }
    
    private void h(@k0 final View view, @j0 final j.a a) {
        Log.d("untis_log", "InfoCenterThingsToDoListAdapter.startAlertDialog");
        InfoCenterNotificationDialog.k0.a(this.H, a).L(this.K, "thatShouldBeFun");
    }
    
    public j.a e(final int i) {
        try {
            return this.L.get(i);
        }
        catch (Exception ex) {
            Log.e("untis_log", String.format("error while InfoCenterTHingsToDoListAdapter.getItem(%d)", i), (Throwable)ex);
            return null;
        }
    }
    
    public int getCount() {
        return this.L.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(int visibility, final View view, final ViewGroup viewGroup) {
        final j.a e = this.e(visibility);
        if (e == null) {
            return null;
        }
        final Student v = this.O.V(e.h());
        if (this.I == null && v != null) {
            visibility = 1;
        }
        else {
            visibility = 0;
        }
        View inflate = view;
        if (view == null) {
            inflate = this.J.inflate(2131493215, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131298128);
        final TextView textView = (TextView)inflate.findViewById(2131298132);
        final TextView textView2 = (TextView)inflate.findViewById(2131298131);
        final TextView textView3 = (TextView)inflate.findViewById(2131298127);
        final TextView textView4 = (TextView)inflate.findViewById(2131298129);
        final TextView textView5 = (TextView)inflate.findViewById(2131298130);
        final ImageView imageView2 = (ImageView)inflate.findViewById(2131298126);
        String text;
        if (visibility != 0) {
            text = v.getDisplayName();
        }
        else if (e.j() && this.H.hasAnyRole(EntityType.TEACHER)) {
            text = this.d(e.c().getKlasses());
        }
        else {
            text = "";
        }
        textView.setText((CharSequence)text);
        Label_0430: {
            Drawable i;
            if (e.j()) {
                final Drawable mutate = androidx.core.content.d.i((Context)this.G, 2131230870).mutate();
                b b;
                if (((org.joda.time.base.c)e.c().getEnd()).C((l0)com.untis.mobile.utils.time.a.a())) {
                    b = this.G;
                    visibility = 2131099741;
                }
                else {
                    b = this.G;
                    visibility = 2131099727;
                }
                mutate.setColorFilter(androidx.core.content.d.f((Context)b, visibility), PorterDuff$Mode.SRC_ATOP);
                imageView.setColorFilter(androidx.core.content.d.f((Context)this.G, visibility));
                i = mutate;
            }
            else {
                if (!e.k()) {
                    break Label_0430;
                }
                imageView.clearColorFilter();
                b b2;
                if (e.d().getLocal()) {
                    if (e.d().getCompletedStatus()) {
                        b2 = this.G;
                        visibility = 2131230902;
                    }
                    else {
                        b2 = this.G;
                        visibility = 2131230901;
                    }
                }
                else if (e.d().getCompletedStatus()) {
                    b2 = this.G;
                    visibility = 2131230900;
                }
                else {
                    b2 = this.G;
                    visibility = 2131230899;
                }
                i = androidx.core.content.d.i((Context)b2, visibility);
            }
            imageView.setImageDrawable(i);
        }
        textView2.setText((CharSequence)com.untis.mobile.utils.time.b.f(e.g().j1(), e.b().j1()));
        if (e.j()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        textView2.setVisibility(visibility);
        Label_0576: {
            String text2;
            if (e.j()) {
                text2 = com.untis.mobile.utils.time.b.e(e.g().h1(), e.b().h1());
            }
            else {
                if (!e.k()) {
                    break Label_0576;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(((Activity)this.G).getString(2131886294));
                sb.append(" ");
                sb.append(((org.joda.time.base.a)e.b()).g4("dd.MM.yyyy"));
                text2 = sb.toString();
            }
            textView3.setText((CharSequence)text2);
        }
        Label_0801: {
            String s;
            String s2;
            if (e.j()) {
                final Subject subject = e.c().getSubject();
                if (subject != null && !e.c().getName().contains(subject.getDisplayableTitle())) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("(");
                    sb2.append(subject.getDisplayableTitle());
                    sb2.append(") ");
                    sb2.append(e.c().getName());
                    s = sb2.toString();
                }
                else {
                    s = e.c().getName();
                }
                s2 = e.c().getText();
            }
            else {
                if (!e.k()) {
                    break Label_0801;
                }
                final Subject d = this.N.d(e.d());
                if (d != null) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(d.getDisplayableDescription());
                    sb3.append(" (");
                    sb3.append(d.getDisplayableTitle());
                    sb3.append(")");
                    s = sb3.toString();
                    s2 = e.d().getText();
                }
                else {
                    s = e.d().getText();
                    s2 = "";
                }
            }
            this.c(textView, textView4, textView5, s, s2);
        }
        visibility = ((e.j() && (this.M.o(this.H.getUniqueId(), e.e()).isEmpty() ^ true)) ? 1 : 0);
        if (e.k()) {
            visibility = ((this.M.k(this.H.getUniqueId(), e.e()).isEmpty() ^ true) ? 1 : 0);
        }
        if ((e.j() && ((e)e.g().h1()).o((n0)com.untis.mobile.utils.time.a.b().l0(2))) || (e.k() && ((e)e.b().h1()).o((n0)com.untis.mobile.utils.time.a.b().l0(2)))) {
            inflate.setClickable(false);
            final Drawable mutate2 = androidx.core.content.d.i((Context)this.G, 2131230860).mutate();
            mutate2.setColorFilter((ColorFilter)new PorterDuffColorFilter(androidx.core.content.d.f((Context)this.G, 2131099680), PorterDuff$Mode.SRC_ATOP));
            imageView2.setImageDrawable(mutate2);
            imageView2.setColorFilter(androidx.core.content.d.f((Context)this.G, 2131099680));
        }
        else {
            Drawable imageDrawable;
            PorterDuffColorFilter colorFilter;
            if (visibility != 0) {
                imageDrawable = androidx.core.content.d.i((Context)this.G, 2131230861).mutate();
                final b g = this.G;
                visibility = 2131099677;
                colorFilter = new PorterDuffColorFilter(androidx.core.content.d.f((Context)g, 2131099677), PorterDuff$Mode.SRC_ATOP);
            }
            else {
                imageDrawable = androidx.core.content.d.i((Context)this.G, 2131230859).mutate();
                final b g2 = this.G;
                visibility = 2131099684;
                colorFilter = new PorterDuffColorFilter(androidx.core.content.d.f((Context)g2, 2131099684), PorterDuff$Mode.SRC_ATOP);
            }
            imageDrawable.setColorFilter((ColorFilter)colorFilter);
            imageView2.setColorFilter(androidx.core.content.d.f((Context)this.G, visibility));
            imageView2.setImageDrawable(imageDrawable);
            inflate.setClickable(true);
            inflate.setOnClickListener((View$OnClickListener)new f(this, e));
        }
        return inflate;
    }
}
