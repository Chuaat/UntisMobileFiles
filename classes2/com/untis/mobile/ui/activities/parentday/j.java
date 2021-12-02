// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.parentday;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$g0;
import androidx.annotation.k0;
import android.view.ViewGroup;
import android.widget.TextView;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.services.masterdata.b;
import com.untis.mobile.persistence.models.parentday.ParentDayStudent;
import java.util.List;
import android.view.LayoutInflater;
import com.untis.mobile.services.masterdata.a;
import androidx.annotation.j0;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$h;

public class j extends RecyclerView$h<a>
{
    @j0
    private final Context a;
    private final com.untis.mobile.services.masterdata.a b;
    @j0
    private final LayoutInflater c;
    @j0
    private final List<ParentDayStudent> d;
    
    public j(@j0 Context applicationContext, final String s, @j0 final List<ParentDayStudent> d) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = applicationContext;
        this.c = LayoutInflater.from(applicationContext);
        this.d = d;
        this.b = com.untis.mobile.services.masterdata.b.Z.a(s);
    }
    
    public int getItemCount() {
        return this.d.size();
    }
    
    public void h(final a a, int n) {
        final ParentDayStudent parentDayStudent = this.d.get(n);
        final Student v = this.b.V(parentDayStudent.getStudentId());
        String displayName;
        if (v != null) {
            displayName = v.getDisplayName();
        }
        else {
            displayName = "";
        }
        a.b.setText((CharSequence)displayName);
        final TextView b = a.b;
        final boolean empty = displayName.isEmpty();
        final int n2 = 8;
        if (empty) {
            n = 8;
        }
        else {
            n = 0;
        }
        b.setVisibility(n);
        a.c.setText((CharSequence)com.untis.mobile.utils.time.b.b(this.b.a(parentDayStudent.getSubjectIds())));
        final TextView c = a.c;
        if (c.getText().toString().trim().isEmpty()) {
            n = n2;
        }
        else {
            n = 0;
        }
        c.setVisibility(n);
    }
    
    public a i(@k0 final ViewGroup viewGroup, final int n) {
        return new a(this.c.inflate(2131493238, viewGroup, false));
    }
    
    public static class a extends RecyclerView$g0
    {
        public View a;
        public TextView b;
        public TextView c;
        
        public a(final View a) {
            super(a);
            this.a = a;
            this.b = (TextView)a.findViewById(2131298232);
            this.c = (TextView)a.findViewById(2131298231);
        }
    }
}
