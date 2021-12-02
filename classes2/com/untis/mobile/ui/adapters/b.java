// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters;

import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.database.Cursor;
import android.content.Context;
import android.widget.CursorAdapter;

public class b extends CursorAdapter
{
    public static final int G = 1;
    
    public b(final Context context, final Cursor cursor, final int n) {
        super(context, cursor, n);
    }
    
    public void bindView(final View view, final Context context, final Cursor cursor) {
        ((a)view.getTag()).a.setText((CharSequence)cursor.getString(1));
    }
    
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(context).inflate(2131493203, viewGroup, false);
        inflate.setTag((Object)new a(inflate));
        return inflate;
    }
    
    public static class a
    {
        public final TextView a;
        
        public a(final View view) {
            this.a = (TextView)((ViewGroup)view).getChildAt(0);
        }
    }
}
