// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.widget.link;

import android.widget.TextView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import android.content.Context;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.List;
import androidx.annotation.j0;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public class m extends BaseAdapter
{
    @j0
    private final LayoutInflater G;
    @j0
    private final List<Profile> H;
    
    public m(@j0 final Context context, @j0 final List<Profile> h) {
        this.G = LayoutInflater.from(context.getApplicationContext());
        this.H = h;
    }
    
    public Profile a(final int n) {
        return this.H.get(n);
    }
    
    public int getCount() {
        return this.H.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final Profile a = this.a(n);
        View inflate = view;
        if (view == null) {
            inflate = this.G.inflate(2131493271, viewGroup, false);
        }
        final TextView textView = (TextView)inflate.findViewById(2131298371);
        final TextView textView2 = (TextView)inflate.findViewById(2131298370);
        textView.setText((CharSequence)a.getUserDisplayName());
        textView2.setText((CharSequence)a.getSchoolDisplayName());
        return inflate;
    }
}
