// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters.timetableselection;

import com.untis.mobile.utils.comparator.b;
import com.untis.mobile.persistence.models.EntityType;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.j0;
import android.content.Context;
import com.untis.mobile.persistence.models.masterdata.Teacher;

public class j extends c<Teacher>
{
    public j(@j0 final Context context, @j0 final Profile profile, @j0 final List<Teacher> list) {
        super(context, profile, list);
    }
    
    @j0
    @Override
    protected Drawable f(@j0 final Context context) {
        return d.i(context, 2131230952);
    }
    
    @j0
    @Override
    protected EntityType g() {
        return EntityType.TEACHER;
    }
    
    public long getItemId(final int n) {
        return this.getItem(n).getId();
    }
    
    protected void p(@j0 final Teacher teacher, @j0 final TextView textView, @j0 final TextView textView2) {
        textView.setText((CharSequence)this.b(teacher.getName()));
        final StringBuilder sb = new StringBuilder();
        sb.append(teacher.getFirstName());
        sb.append(" ");
        sb.append(teacher.getLastName());
        textView2.setText((CharSequence)this.b(sb.toString().trim()));
    }
    
    protected boolean q(@j0 final Teacher teacher, @j0 final String s) {
        if (!teacher.getName().toLowerCase().contains(s.toLowerCase())) {
            final StringBuilder sb = new StringBuilder();
            sb.append(teacher.getFirstName());
            sb.append(" ");
            sb.append(teacher.getLastName());
            if (!sb.toString().toLowerCase().trim().contains(s.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
    
    protected int r(@j0 final Teacher teacher, @j0 final Teacher teacher2) {
        String s;
        if (teacher.getLastName().isEmpty()) {
            s = teacher.getDisplayName();
        }
        else {
            s = teacher.getLastName();
        }
        String s2;
        if (teacher2.getLastName().isEmpty()) {
            s2 = teacher2.getDisplayName();
        }
        else {
            s2 = teacher2.getLastName();
        }
        return b.G.b(s, s2);
    }
}
