// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters.timetableselection;

import com.untis.mobile.utils.comparator.b;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.EntityType;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.k0;
import java.util.Iterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Collections;
import org.joda.time.n0;
import org.joda.time.base.e;
import org.joda.time.t;
import java.util.HashMap;
import com.untis.mobile.utils.time.a;
import android.widget.TextView;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.d;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.services.timetable.placeholder.k;
import java.util.List;
import android.view.LayoutInflater;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class f extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final Profile H;
    @j0
    private final LayoutInflater I;
    @j0
    private final List J;
    @j0
    private final List K;
    @j0
    private String L;
    private final int M;
    private k N;
    
    public f(@j0 Context applicationContext, @j0 final Profile h, @j0 final List<Klasse> list) {
        this.K = new ArrayList();
        this.L = "";
        applicationContext = applicationContext.getApplicationContext();
        this.G = applicationContext;
        this.H = h;
        this.I = LayoutInflater.from(applicationContext);
        this.M = d.f(applicationContext, 2131099692);
        this.J = this.e(list);
        this.n("");
        this.N = h.getTimeTableService();
    }
    
    @j0
    private Spannable c(@j0 final String s) {
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        if (!this.L.isEmpty()) {
            final int index = s.toLowerCase().indexOf(this.L.toLowerCase(), 0);
            if (index > -1) {
                spannableString.setSpan((Object)new ForegroundColorSpan(this.M), index, this.L.length() + index, 256);
            }
        }
        return (Spannable)spannableString;
    }
    
    private void d(@j0 final Klasse klasse, @j0 final TextView textView, @j0 final TextView textView2) {
        textView.setText((CharSequence)this.c(klasse.getName()));
        textView2.setText((CharSequence)this.c(klasse.getLongName()));
    }
    
    @j0
    private List e(@j0 final List<Klasse> list) {
        final ArrayList<Object> list2 = new ArrayList<Object>();
        final t b = a.b();
        final HashMap<t, List<? extends e>> hashMap = (HashMap<t, List<? extends e>>)new HashMap<t, List<e>>();
        final ArrayList<t> list3 = (ArrayList<t>)new ArrayList<Comparable>();
        for (final Klasse klasse : list) {
            t start;
            if (((e)klasse.getStart()).o((n0)b)) {
                start = b;
            }
            else {
                start = klasse.getStart();
            }
            List<e> list4;
            if ((list4 = hashMap.get(start)) == null) {
                list4 = new ArrayList<e>();
                hashMap.put(start, list4);
                list3.add(start);
            }
            list4.add((e)klasse);
        }
        Collections.sort((List<Comparable>)list3);
        for (final t t : list3) {
            final List<e> list5 = hashMap.get(t);
            Collections.sort((List<Object>)list5, com.untis.mobile.ui.adapters.timetableselection.e.G);
            if (((e)t).m((n0)b)) {
                list2.add(t);
            }
            list2.addAll(list5);
        }
        return list2;
    }
    
    @j0
    private View f(@k0 View inflate, @k0 final ViewGroup viewGroup, @j0 final Klasse klasse) {
        inflate = this.I.inflate(2131493204, viewGroup, false);
        final ImageView imageView = (ImageView)inflate.findViewById(2131298080);
        final TextView textView = (TextView)inflate.findViewById(2131298083);
        final TextView textView2 = (TextView)inflate.findViewById(2131298082);
        final ImageView imageView2 = (ImageView)inflate.findViewById(2131298079);
        imageView.setVisibility(8);
        this.d(klasse, textView, textView2);
        if (com.untis.mobile.utils.a.a(this.G).I(this.H)) {
            if (this.i(this.H, klasse.getId())) {
                imageView2.setVisibility(4);
            }
            else {
                imageView2.setVisibility(0);
                this.m(imageView2, this.h(klasse.getId()));
                imageView2.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.adapters.timetableselection.d(this, klasse, imageView2));
            }
        }
        else {
            imageView2.setVisibility(8);
        }
        return inflate;
    }
    
    @j0
    private View g(@k0 View inflate, @k0 final ViewGroup viewGroup, @j0 final t t) {
        inflate = this.I.inflate(2131493205, viewGroup, false);
        ((TextView)inflate.findViewById(2131298081)).setText((CharSequence)this.G.getResources().getString(2131886723).replace("{0}", t.g4("dd.MM.yyyy")));
        return inflate;
    }
    
    private boolean h(final long n) {
        final TimeTableEntity w = this.N.w(EntityType.CLASS, n);
        return w != null && w.getFavorite();
    }
    
    private boolean i(@j0 final Profile profile, final long n) {
        boolean b = true;
        if (!profile.hasAnyRole(EntityType.CLASS) || profile.getEntityId() != n) {
            b = false;
        }
        return b;
    }
    
    private void l(final long n) {
        h.a.a(this.N, EntityType.CLASS, n);
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
    
    public int getCount() {
        return this.K.size();
    }
    
    public Object getItem(final int n) {
        return this.K.get(n);
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final Object item = this.getItem(n);
        if (item instanceof t) {
            return this.g(view, viewGroup, (t)item);
        }
        if (item instanceof Klasse) {
            return this.f(view, viewGroup, (Klasse)item);
        }
        return null;
    }
    
    public void n(@j0 final String l) {
        this.K.clear();
        final HashMap<t, List<Klasse>> hashMap = (HashMap<t, List<Klasse>>)new HashMap<Object, Object>();
        final t b = a.b();
        for (final Klasse next : this.J) {
            if (next instanceof Klasse) {
                final Klasse klasse = next;
                if (!klasse.getName().toLowerCase().contains(l.toLowerCase()) && !klasse.getLongName().toLowerCase().contains(l.toLowerCase())) {
                    continue;
                }
                t start;
                if (((e)klasse.getStart()).o((n0)b)) {
                    start = b;
                }
                else {
                    start = klasse.getStart();
                }
                List<Klasse> list;
                if ((list = hashMap.get(start)) == null) {
                    list = new ArrayList<Klasse>();
                    hashMap.put(start, list);
                }
                list.add(klasse);
            }
        }
        final ArrayList list2 = new ArrayList<Object>(hashMap.keySet());
        Collections.sort((List<Comparable>)list2);
        for (final t t : list2) {
            if (((e)t).m((n0)b)) {
                this.K.add(t);
            }
            this.K.addAll(hashMap.get(t));
        }
        this.L = l;
        this.notifyDataSetChanged();
    }
}
