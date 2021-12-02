// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.parentday;

import org.joda.time.base.e;
import android.app.Activity;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$g0;
import androidx.annotation.k0;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import org.joda.time.n0;
import android.view.View;
import android.content.Context;
import com.untis.mobile.persistence.models.parentday.ParentDay;
import java.util.List;
import android.view.LayoutInflater;
import com.untis.mobile.ui.activities.common.b;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.recyclerview.widget.RecyclerView$h;

public class d extends RecyclerView$h<a>
{
    @j0
    private final Profile a;
    @j0
    private final b b;
    @j0
    private final LayoutInflater c;
    @j0
    private final List<ParentDay> d;
    
    public d(@j0 final b b, @j0 final Profile a, @j0 final List<ParentDay> d) {
        this.a = a;
        this.b = b;
        this.c = LayoutInflater.from((Context)b);
        this.d = d;
    }
    
    private static boolean l(final ParentDay parentDay) {
        return ((e)parentDay.getStart().h1()).p((n0)parentDay.getEnd().h1()) ^ true;
    }
    
    public int getItemCount() {
        return this.d.size();
    }
    
    public void j(final a a, final int n) {
        final ParentDay parentDay = this.d.get(n);
        a.b.setText((CharSequence)parentDay.getName());
        a.c.setText((CharSequence)com.untis.mobile.utils.time.b.c(parentDay.getStart(), parentDay.getEnd()));
        a.a.setOnClickListener((View$OnClickListener)new c(this, parentDay));
    }
    
    public a k(@k0 final ViewGroup viewGroup, final int n) {
        return new a(this.c.inflate(2131493236, viewGroup, false));
    }
    
    public static class a extends RecyclerView$g0
    {
        public View a;
        public TextView b;
        public TextView c;
        
        public a(final View a) {
            super(a);
            this.a = a;
            this.b = (TextView)a.findViewById(2131298238);
            this.c = (TextView)a.findViewById(2131298237);
        }
    }
}
