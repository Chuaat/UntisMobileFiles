// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters.officehour;

import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import androidx.annotation.w0;
import android.graphics.drawable.Drawable;
import androidx.core.content.d;
import com.untis.mobile.persistence.models.officehour.OfficeHourTimeSlotState;
import com.untis.mobile.persistence.models.officehour.OfficeHourTimeSlot;
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
    private final List<OfficeHourTimeSlot> I;
    
    public a(@j0 Context applicationContext, @j0 final List<OfficeHourTimeSlot> i) {
        applicationContext = applicationContext.getApplicationContext();
        this.G = applicationContext;
        this.H = LayoutInflater.from(applicationContext);
        this.I = i;
    }
    
    private int a(@j0 final OfficeHourTimeSlotState officeHourTimeSlotState) {
        final int n = a$a.a[officeHourTimeSlotState.ordinal()];
        Context context;
        int n2;
        if (n != 1) {
            if (n != 2) {
                context = this.G;
                n2 = 2131099700;
            }
            else {
                context = this.G;
                n2 = 2131099701;
            }
        }
        else {
            context = this.G;
            n2 = 2131099699;
        }
        return d.f(context, n2);
    }
    
    @j0
    private Drawable b(@j0 final OfficeHourTimeSlotState officeHourTimeSlotState) {
        final int n = a$a.a[officeHourTimeSlotState.ordinal()];
        Context context;
        int n2;
        if (n != 1) {
            if (n != 2) {
                context = this.G;
                n2 = 2131230925;
            }
            else {
                context = this.G;
                n2 = 2131230873;
            }
        }
        else {
            context = this.G;
            n2 = 2131230912;
        }
        return d.i(context, n2);
    }
    
    @w0
    private int d(@j0 final OfficeHourTimeSlotState officeHourTimeSlotState) {
        final int n = a$a.a[officeHourTimeSlotState.ordinal()];
        if (n == 1) {
            return 2131886246;
        }
        if (n != 2) {
            return 2131886253;
        }
        return 2131886249;
    }
    
    @j0
    public OfficeHourTimeSlot c(final int n) {
        return this.I.get(n);
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @j0
    public View getView(int visibility, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final OfficeHourTimeSlot c = this.c(visibility);
        visibility = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493234, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131298220);
        final TextView textView = (TextView)inflate.findViewById(2131298219);
        final TextView textView2 = (TextView)inflate.findViewById(2131298221);
        final StringBuilder sb = new StringBuilder();
        sb.append(((org.joda.time.base.a)c.getStart()).g4("H:mm"));
        sb.append(" - ");
        sb.append(((org.joda.time.base.a)c.getEnd()).g4("H:mm"));
        textView.setText((CharSequence)sb.toString());
        if (OfficeHourTimeSlotState.FREE.equals(c.getState())) {
            visibility = 4;
        }
        imageView.setVisibility(visibility);
        imageView.setImageDrawable(this.b(c.getState()));
        imageView.setColorFilter(this.a(c.getState()));
        textView2.setText(this.d(c.getState()));
        textView2.setTextColor(this.a(c.getState()));
        return inflate;
    }
}
