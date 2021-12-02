// 
// Decompiled by Procyon v0.5.36
// 

package androidx.cursoradapter.widget;

import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.content.Context;
import android.view.LayoutInflater;

public abstract class c extends a
{
    private int R;
    private int S;
    private LayoutInflater T;
    
    @Deprecated
    public c(final Context context, final int n, final Cursor cursor) {
        super(context, cursor);
        this.S = n;
        this.R = n;
        this.T = (LayoutInflater)context.getSystemService("layout_inflater");
    }
    
    public c(final Context context, final int n, final Cursor cursor, final int n2) {
        super(context, cursor, n2);
        this.S = n;
        this.R = n;
        this.T = (LayoutInflater)context.getSystemService("layout_inflater");
    }
    
    @Deprecated
    public c(final Context context, final int n, final Cursor cursor, final boolean b) {
        super(context, cursor, b);
        this.S = n;
        this.R = n;
        this.T = (LayoutInflater)context.getSystemService("layout_inflater");
    }
    
    @Override
    public View i(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.T.inflate(this.S, viewGroup, false);
    }
    
    @Override
    public View j(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.T.inflate(this.R, viewGroup, false);
    }
    
    public void n(final int s) {
        this.S = s;
    }
    
    public void o(final int r) {
        this.R = r;
    }
}
