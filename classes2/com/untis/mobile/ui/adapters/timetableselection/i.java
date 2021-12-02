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
import com.untis.mobile.persistence.models.masterdata.Subject;

public class i extends c<Subject>
{
    public i(@j0 final Context context, @j0 final Profile profile, @j0 final List<Subject> list) {
        super(context, profile, list);
    }
    
    @j0
    @Override
    protected Drawable f(@j0 final Context context) {
        return d.i(context, 2131230951);
    }
    
    @j0
    @Override
    protected EntityType g() {
        return EntityType.SUBJECT;
    }
    
    public long getItemId(final int n) {
        return this.getItem(n).getId();
    }
    
    protected void p(@j0 final Subject subject, @j0 final TextView textView, @j0 final TextView textView2) {
        textView.setText((CharSequence)this.b(subject.getName()));
        textView2.setText((CharSequence)this.b(subject.getLongName()));
    }
    
    protected boolean q(@j0 final Subject subject, @j0 final String s) {
        return subject.getName().toLowerCase().contains(s.toLowerCase()) || subject.getLongName().toLowerCase().contains(s.toLowerCase());
    }
    
    protected int r(@j0 final Subject subject, @j0 final Subject subject2) {
        return b.G.b(subject.getDisplayName(), subject2.getDisplayName());
    }
}
