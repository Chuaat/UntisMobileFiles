// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.drive;

import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.List;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class b extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private final List<DriveAttachment> I;
    
    public b(@j0 final Context g, @j0 final List<DriveAttachment> i) {
        this.G = g;
        this.H = LayoutInflater.from(g);
        this.I = i;
    }
    
    public DriveAttachment b(final int n) {
        return this.I.get(n);
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final DriveAttachment b = this.b(n);
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493200, viewGroup, false);
        }
        ((TextView)inflate.findViewById(2131298074)).setText((CharSequence)b.getName());
        inflate.setOnClickListener((View$OnClickListener)new a(this, b));
        return inflate;
    }
}
