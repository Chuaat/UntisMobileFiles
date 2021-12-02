// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs;

import android.widget.TextView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import com.untis.mobile.persistence.models.booking.ValidationError;
import java.util.List;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class l extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private final List<ValidationError> I;
    
    public l(@j0 Context applicationContext, @j0 final List<ValidationError> i) {
        applicationContext = applicationContext.getApplicationContext();
        this.G = applicationContext;
        this.H = LayoutInflater.from(applicationContext);
        this.I = i;
    }
    
    public ValidationError a(final int n) {
        return this.I.get(n);
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(int visibility, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final ValidationError a = this.a(visibility);
        visibility = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493265, viewGroup, false);
        }
        final TextView textView = (TextView)inflate.findViewById(2131298360);
        final TextView textView2 = (TextView)inflate.findViewById(2131298359);
        textView.setText((CharSequence)a.getTitle());
        if (a.getDetails().isEmpty()) {
            visibility = 8;
        }
        textView2.setVisibility(visibility);
        textView2.setText((CharSequence)a.getDetails());
        return inflate;
    }
}
