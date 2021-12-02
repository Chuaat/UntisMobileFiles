// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.parentday;

import org.joda.time.base.c;
import android.app.Activity;
import android.widget.ImageView;
import com.untis.mobile.persistence.models.EntityType;
import androidx.annotation.k0;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$g0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collection;
import org.joda.time.l0;
import org.joda.time.r;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.parentday.ParentDayStudent;
import android.widget.LinearLayout;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import android.widget.TextView;
import com.untis.mobile.persistence.models.masterdata.Room;
import androidx.core.content.d;
import android.view.View$OnClickListener;
import android.view.View;
import android.content.Context;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.parentday.ParentDayAppointment;
import java.util.List;
import com.untis.mobile.persistence.models.parentday.ParentDay;
import android.view.LayoutInflater;
import com.untis.mobile.services.masterdata.a;
import androidx.annotation.j0;
import com.untis.mobile.ui.activities.common.b;
import androidx.recyclerview.widget.RecyclerView$h;

public class h extends RecyclerView$h<a>
{
    @j0
    private final b a;
    private final com.untis.mobile.services.masterdata.a b;
    @j0
    private final LayoutInflater c;
    @j0
    private final ParentDay d;
    @j0
    private final List<ParentDayAppointment> e;
    @j0
    private final Profile f;
    private int g;
    private int h;
    
    public h(@j0 final b a, @j0 final Profile f, @j0 final ParentDay d) {
        this.a = a;
        this.c = LayoutInflater.from((Context)a);
        this.d = d;
        this.e = this.n(d);
        this.f = f;
        this.g = a.getResources().getDimensionPixelSize(2131165267);
        this.h = a.getResources().getDimensionPixelSize(2131165266);
        this.b = f.getMasterDataService();
    }
    
    private void k(@j0 final ParentDayAppointment parentDayAppointment, @j0 final a a) {
        final Room p2 = this.b.P(parentDayAppointment.getRoomId());
        String text;
        if (p2 != null) {
            text = p2.getDisplayName();
        }
        else {
            text = ((Activity)this.a).getString(2131886740);
        }
        final TextView d = a.d;
        int visibility;
        if (text.isEmpty()) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        d.setVisibility(visibility);
        a.d.setText((CharSequence)text);
        final Teacher k = this.b.k(parentDayAppointment.getTeacherId());
        String displayName;
        if (k != null) {
            displayName = k.getDisplayName();
        }
        else {
            displayName = "";
        }
        final TextView c = a.c;
        int visibility2;
        if (displayName.isEmpty()) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        c.setVisibility(visibility2);
        a.c.setText((CharSequence)displayName);
        if (parentDayAppointment.getStudents().size() > 0) {
            a.f.setVisibility(0);
            a.a.setOnClickListener((View$OnClickListener)new e(this, parentDayAppointment));
        }
        else {
            a.f.setVisibility(8);
        }
        final LinearLayout b = a.b;
        final int h = this.h;
        b.setPadding(h, h, h, h);
        final TextView e = a.e;
        final int h2 = this.h;
        e.setPadding(h2, h2, h2, h2);
        final View a2 = a.a;
        a2.setBackgroundColor(androidx.core.content.d.f(a2.getContext(), 2131099678));
    }
    
    private void l(@j0 final ParentDayAppointment parentDayAppointment, @j0 final a a) {
        final List<ParentDayStudent> studentsWithSubjects = parentDayAppointment.getStudentsWithSubjects();
        String text;
        if (studentsWithSubjects.size() > 0) {
            text = com.untis.mobile.utils.time.b.a(this.b, studentsWithSubjects);
        }
        else {
            text = com.untis.mobile.utils.time.b.a(this.b, parentDayAppointment.getStudents());
        }
        a.c.setVisibility(0);
        a.c.setText((CharSequence)text);
        if (text.contains(",")) {
            a.f.setVisibility(0);
            a.a.setOnClickListener((View$OnClickListener)new f(this, parentDayAppointment));
        }
        else {
            a.f.setVisibility(8);
        }
        final Room p2 = this.b.P(parentDayAppointment.getRoomId());
        String text2;
        if (p2 != null) {
            text2 = p2.getDisplayName();
        }
        else {
            text2 = ((Activity)this.a).getString(2131886740);
        }
        a.d.setVisibility(0);
        a.d.setText((CharSequence)text2);
        final LinearLayout b = a.b;
        final int h = this.h;
        b.setPadding(h, h, h, h);
        final TextView e = a.e;
        final int h2 = this.h;
        e.setPadding(h2, h2, h2, h2);
        final View a2 = a.a;
        a2.setBackgroundColor(androidx.core.content.d.f(a2.getContext(), 2131099678));
    }
    
    private void m(@j0 final ParentDayAppointment parentDayAppointment, @j0 final a a) {
        a.c.setVisibility(8);
        a.d.setVisibility(0);
        a.d.setText(2131886722);
        a.f.setVisibility(8);
        final View a2 = a.a;
        a2.setBackgroundColor(androidx.core.content.d.f(a2.getContext(), 2131099796));
        final LinearLayout b = a.b;
        final int h = this.h;
        final int g = this.g;
        b.setPadding(h, g, h, g);
        final TextView e = a.e;
        final int h2 = this.h;
        final int g2 = this.g;
        e.setPadding(h2, g2, h2, g2);
    }
    
    @j0
    private List<ParentDayAppointment> n(@j0 final ParentDay parentDay) {
        final ArrayList<ParentDayAppointment> list = new ArrayList<ParentDayAppointment>();
        final List<ParentDayAppointment> appointments = parentDay.getAppointments();
        Collections.sort((List<Object>)appointments, com.untis.mobile.ui.activities.parentday.g.G);
        for (final ParentDayAppointment parentDayAppointment : appointments) {
            final r r = new r((l0)parentDayAppointment.getStart(), (l0)parentDayAppointment.getEnd());
            if (list.size() == 0 && ((c)parentDay.getStart()).C((l0)((org.joda.time.base.d)r).b())) {
                list.add(new ParentDayAppointment(0L, parentDay.getStart(), ((org.joda.time.base.d)r).b(), 0L, 0L, false, new ArrayList<ParentDayStudent>()));
            }
            if (list.size() > 0) {
                final ParentDayAppointment parentDayAppointment2 = list.get(list.size() - 1);
                final r r2 = new r((l0)parentDayAppointment2.getStart(), (l0)parentDayAppointment2.getEnd());
                if (((c)((org.joda.time.base.d)r2).s()).X4((l0)((org.joda.time.base.d)r).b())) {
                    if (this.p(parentDayAppointment2, parentDayAppointment)) {
                        parentDayAppointment2.setEnd(((org.joda.time.base.d)r).s());
                        continue;
                    }
                }
                else if (((c)((org.joda.time.base.d)r2).s()).C((l0)((org.joda.time.base.d)r).b())) {
                    list.add(new ParentDayAppointment(0L, ((org.joda.time.base.d)r2).s(), ((org.joda.time.base.d)r).b(), 0L, 0L, false, new ArrayList<ParentDayStudent>()));
                }
            }
            list.add(new ParentDayAppointment(parentDayAppointment.getId(), parentDayAppointment.getStart(), parentDayAppointment.getEnd(), parentDayAppointment.getTeacherId(), parentDayAppointment.getRoomId(), parentDayAppointment.getCancelled(), new ArrayList<ParentDayStudent>(parentDayAppointment.getStudents())));
        }
        if (list.size() == 0) {
            return appointments;
        }
        if (((c)((ParentDayAppointment)list.get(list.size() - 1)).getEnd()).C((l0)parentDay.getEnd())) {
            list.add(new ParentDayAppointment(0L, ((ParentDayAppointment)list.get(list.size() - 1)).getEnd(), parentDay.getEnd(), 0L, 0L, false, new ArrayList<ParentDayStudent>()));
        }
        return list;
    }
    
    private boolean o(final ParentDayAppointment parentDayAppointment, final ParentDayAppointment parentDayAppointment2) {
        final HashSet<Long> set = new HashSet<Long>();
        final HashSet<Object> set2 = new HashSet<Object>();
        final boolean b = false;
        try {
            final Iterator<ParentDayStudent> iterator = parentDayAppointment.getStudents().iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next().getStudentId());
            }
            final Iterator<ParentDayStudent> iterator2 = parentDayAppointment2.getStudents().iterator();
            while (iterator2.hasNext()) {
                set2.add(iterator2.next().getStudentId());
            }
            final boolean containsAll = set.containsAll(set2);
            final boolean containsAll2 = set2.containsAll(set);
            boolean b2 = b;
            if (containsAll) {
                b2 = b;
                if (containsAll2) {
                    b2 = true;
                }
            }
            return b2;
        }
        catch (Exception ex) {
            return b;
        }
    }
    
    private boolean p(@j0 final ParentDayAppointment parentDayAppointment, @j0 final ParentDayAppointment parentDayAppointment2) {
        return parentDayAppointment.getCancelled() == parentDayAppointment2.getCancelled() && parentDayAppointment.getTeacherId() == parentDayAppointment2.getTeacherId() && parentDayAppointment.getRoomId() == parentDayAppointment2.getRoomId() && this.o(parentDayAppointment, parentDayAppointment2);
    }
    
    public int getItemCount() {
        return this.e.size();
    }
    
    public void t(final a a, final int n) {
        final ParentDayAppointment parentDayAppointment = this.e.get(n);
        a.e.setText((CharSequence)com.untis.mobile.utils.time.b.f(parentDayAppointment.getStart().j1(), parentDayAppointment.getEnd().j1()));
        if (parentDayAppointment.getId() == 0L) {
            this.m(parentDayAppointment, a);
        }
        else if (this.f.hasAnyRole(EntityType.TEACHER)) {
            this.l(parentDayAppointment, a);
        }
        else {
            this.k(parentDayAppointment, a);
        }
    }
    
    public a u(@k0 final ViewGroup viewGroup, final int n) {
        return new a(this.c.inflate(2131493237, viewGroup, false));
    }
    
    public static class a extends RecyclerView$g0
    {
        @j0
        public View a;
        @j0
        public LinearLayout b;
        @j0
        public TextView c;
        @j0
        public TextView d;
        @j0
        public TextView e;
        @j0
        public ImageView f;
        
        public a(@j0 final View a) {
            super(a);
            this.a = a;
            this.b = (LinearLayout)a.findViewById(2131298236);
            this.c = (TextView)a.findViewById(2131298235);
            this.d = (TextView)a.findViewById(2131298233);
            this.e = (TextView)a.findViewById(2131298234);
            this.f = (ImageView)a.findViewById(2131298230);
        }
    }
}
