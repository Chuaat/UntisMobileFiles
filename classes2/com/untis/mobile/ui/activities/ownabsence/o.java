// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.ownabsence;

import android.widget.TextView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import android.content.Context;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.List;
import androidx.annotation.j0;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public class o extends BaseAdapter
{
    @j0
    private final LayoutInflater G;
    @j0
    private final List<Student> H;
    
    public o(@j0 final Context context, @j0 final List<Student> h) {
        this.G = LayoutInflater.from(context);
        this.H = h;
    }
    
    public Student a(final int n) {
        return this.H.get(n);
    }
    
    public int getCount() {
        return this.H.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final Student a = this.a(n);
        View inflate = view;
        if (view == null) {
            inflate = this.G.inflate(2131493253, viewGroup, false);
        }
        final TextView textView = (TextView)inflate.findViewById(2131298280);
        ((TextView)inflate.findViewById(2131298279)).setVisibility(8);
        textView.setText((CharSequence)a.getDisplayName());
        return inflate;
    }
}
