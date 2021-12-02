// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters.timetableselection;

import android.view.View$OnClickListener;
import com.untis.mobile.utils.a;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.text.Spannable;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import androidx.core.content.d;
import java.util.ArrayList;
import com.untis.mobile.services.timetable.placeholder.k;
import java.util.List;
import android.view.LayoutInflater;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public abstract class c<Entity> extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final Profile H;
    @j0
    private final LayoutInflater I;
    @j0
    private List<Entity> J;
    @j0
    private List<Entity> K;
    @j0
    private String L;
    private final int M;
    private k N;
    
    public c(@j0 Context applicationContext, @j0 final Profile h, @j0 final List<Entity> list) {
        this.J = new ArrayList<Entity>();
        this.K = new ArrayList<Entity>();
        this.L = "";
        applicationContext = applicationContext.getApplicationContext();
        this.G = applicationContext;
        this.H = h;
        this.I = LayoutInflater.from(applicationContext);
        this.M = d.f(applicationContext, 2131099692);
        for (final Entity next : list) {
            if (next == null) {
                continue;
            }
            this.J.add(next);
        }
        Collections.sort(this.J, new b(this));
        this.n("");
        this.N = h.getTimeTableService();
    }
    
    private boolean h(final int n) {
        final TimeTableEntity w = this.N.w(this.g(), this.getItemId(n));
        return w != null && w.getFavorite();
    }
    
    private boolean i(@j0 final Profile profile, @j0 final Entity entity) {
        if (!(entity instanceof Student)) {
            return false;
        }
        final Iterator<Child> iterator = profile.getUserChildren().iterator();
        while (iterator.hasNext()) {
            if (((Student)entity).getId() == iterator.next().getId()) {
                return true;
            }
        }
        return false;
    }
    
    private boolean j(@j0 final Profile profile, final int n) {
        boolean b = true;
        if (!profile.hasAnyRole(this.g()) || profile.getEntityId() != this.getItemId(n)) {
            b = false;
        }
        return b;
    }
    
    private void l(final int n) {
        h.a.a(this.N, this.g(), this.getItemId(n));
    }
    
    private void m(@j0 final ImageView imageView, final boolean b) {
        Context context;
        int n;
        if (b) {
            context = this.G;
            n = 2131230948;
        }
        else {
            context = this.G;
            n = 2131230949;
        }
        imageView.setImageDrawable(d.i(context, n));
    }
    
    @j0
    Spannable b(@j0 final String s) {
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        if (!this.L.isEmpty()) {
            final int index = s.toLowerCase().indexOf(this.L.toLowerCase(), 0);
            if (index > -1) {
                spannableString.setSpan((Object)new ForegroundColorSpan(this.M), index, this.L.length() + index, 256);
            }
        }
        return (Spannable)spannableString;
    }
    
    protected abstract void c(@j0 final Entity p0, @j0 final TextView p1, @j0 final TextView p2);
    
    protected abstract boolean d(@j0 final Entity p0, @j0 final String p1);
    
    @j0
    public List<Entity> e() {
        return this.K;
    }
    
    @j0
    protected abstract Drawable f(@j0 final Context p0);
    
    @j0
    protected abstract EntityType g();
    
    public int getCount() {
        return this.e().size();
    }
    
    public Entity getItem(final int n) {
        return this.e().get(n);
    }
    
    public View getView(int visibility, final View view, final ViewGroup viewGroup) {
        final Entity item = this.getItem(visibility);
        View inflate = view;
        if (view == null) {
            inflate = this.I.inflate(2131493204, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131298080);
        final TextView textView = (TextView)inflate.findViewById(2131298083);
        final TextView textView2 = (TextView)inflate.findViewById(2131298082);
        final ImageView imageView2 = (ImageView)inflate.findViewById(2131298079);
        imageView.setImageDrawable(this.f(this.G));
        this.c(item, textView, textView2);
        if (a.a(this.G).I(this.H)) {
            if (!this.j(this.H, visibility) && !this.i(this.H, item)) {
                imageView2.setVisibility(0);
                this.m(imageView2, this.h(visibility));
                imageView2.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.adapters.timetableselection.a(this, visibility, imageView2));
                return inflate;
            }
            visibility = 4;
        }
        else {
            visibility = 8;
        }
        imageView2.setVisibility(visibility);
        return inflate;
    }
    
    public void n(@j0 final String l) {
        final ArrayList<Entity> k = new ArrayList<Entity>();
        for (final Entity next : this.J) {
            if (this.d(next, l)) {
                k.add(next);
            }
        }
        this.K = k;
        this.L = l;
        this.notifyDataSetChanged();
    }
    
    protected abstract int o(@j0 final Entity p0, @j0 final Entity p1);
}
