// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.ownabsence;

import android.widget.TextView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import java.util.List;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class a extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private final List<AbsenceReason> I;
    
    public a(@j0 final Context g, @j0 final List<AbsenceReason> i) {
        this.G = g;
        this.H = LayoutInflater.from(g);
        this.I = i;
    }
    
    public AbsenceReason a(final int n) {
        return this.I.get(n);
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final AbsenceReason a = this.a(n);
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493253, viewGroup, false);
        }
        final TextView textView = (TextView)inflate.findViewById(2131298280);
        ((TextView)inflate.findViewById(2131298279)).setVisibility(8);
        textView.setText((CharSequence)a.getDisplayName());
        return inflate;
    }
}
