// 
// Decompiled by Procyon v0.5.36
// 

package androidx.cursoradapter.widget;

import android.os.Handler;
import android.widget.Filter;
import android.view.ViewGroup;
import android.database.ContentObserver;
import android.view.View;
import android.widget.FilterQueryProvider;
import android.database.DataSetObserver;
import android.content.Context;
import android.database.Cursor;
import androidx.annotation.t0;
import android.widget.Filterable;
import android.widget.BaseAdapter;

public abstract class a extends BaseAdapter implements Filterable, androidx.cursoradapter.widget.b.a
{
    @Deprecated
    public static final int P = 1;
    public static final int Q = 2;
    @t0({ t0.a.H })
    protected boolean G;
    @t0({ t0.a.H })
    protected boolean H;
    @t0({ t0.a.H })
    protected Cursor I;
    @t0({ t0.a.H })
    protected Context J;
    @t0({ t0.a.H })
    protected int K;
    @t0({ t0.a.H })
    protected a L;
    @t0({ t0.a.H })
    protected DataSetObserver M;
    @t0({ t0.a.H })
    protected androidx.cursoradapter.widget.b N;
    @t0({ t0.a.H })
    protected FilterQueryProvider O;
    
    @Deprecated
    public a(final Context context, final Cursor cursor) {
        this.g(context, cursor, 1);
    }
    
    public a(final Context context, final Cursor cursor, final int n) {
        this.g(context, cursor, n);
    }
    
    public a(final Context context, final Cursor cursor, final boolean b) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        this.g(context, cursor, n);
    }
    
    public CharSequence a(final Cursor cursor) {
        String string;
        if (cursor == null) {
            string = "";
        }
        else {
            string = cursor.toString();
        }
        return string;
    }
    
    public void b(Cursor m) {
        m = this.m(m);
        if (m != null) {
            m.close();
        }
    }
    
    public Cursor c() {
        return this.I;
    }
    
    public Cursor d(final CharSequence charSequence) {
        final FilterQueryProvider o = this.O;
        if (o != null) {
            return o.runQuery(charSequence);
        }
        return this.I;
    }
    
    public abstract void e(final View p0, final Context p1, final Cursor p2);
    
    public FilterQueryProvider f() {
        return this.O;
    }
    
    void g(final Context j, final Cursor i, int n) {
        boolean g = false;
        if ((n & 0x1) == 0x1) {
            n |= 0x2;
            this.H = true;
        }
        else {
            this.H = false;
        }
        if (i != null) {
            g = true;
        }
        this.I = i;
        this.G = g;
        this.J = j;
        int columnIndexOrThrow;
        if (g) {
            columnIndexOrThrow = i.getColumnIndexOrThrow("_id");
        }
        else {
            columnIndexOrThrow = -1;
        }
        this.K = columnIndexOrThrow;
        DataSetObserver m;
        if ((n & 0x2) == 0x2) {
            this.L = new a();
            m = new b();
        }
        else {
            m = null;
            this.L = null;
        }
        this.M = m;
        if (g) {
            final a l = this.L;
            if (l != null) {
                i.registerContentObserver((ContentObserver)l);
            }
            final DataSetObserver k = this.M;
            if (k != null) {
                i.registerDataSetObserver(k);
            }
        }
    }
    
    public int getCount() {
        if (this.G) {
            final Cursor i = this.I;
            if (i != null) {
                return i.getCount();
            }
        }
        return 0;
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        if (this.G) {
            this.I.moveToPosition(n);
            View i;
            if ((i = view) == null) {
                i = this.i(this.J, this.I, viewGroup);
            }
            this.e(i, this.J, this.I);
            return i;
        }
        return null;
    }
    
    public Filter getFilter() {
        if (this.N == null) {
            this.N = new androidx.cursoradapter.widget.b((androidx.cursoradapter.widget.b.a)this);
        }
        return this.N;
    }
    
    public Object getItem(final int n) {
        if (this.G) {
            final Cursor i = this.I;
            if (i != null) {
                i.moveToPosition(n);
                return this.I;
            }
        }
        return null;
    }
    
    public long getItemId(final int n) {
        if (this.G) {
            final Cursor i = this.I;
            if (i != null && i.moveToPosition(n)) {
                return this.I.getLong(this.K);
            }
        }
        return 0L;
    }
    
    public View getView(final int i, final View view, final ViewGroup viewGroup) {
        if (!this.G) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.I.moveToPosition(i)) {
            View j;
            if ((j = view) == null) {
                j = this.j(this.J, this.I, viewGroup);
            }
            this.e(j, this.J, this.I);
            return j;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("couldn't move cursor to position ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
    
    @Deprecated
    protected void h(final Context context, final Cursor cursor, final boolean b) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        this.g(context, cursor, n);
    }
    
    public boolean hasStableIds() {
        return true;
    }
    
    public View i(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.j(context, cursor, viewGroup);
    }
    
    public abstract View j(final Context p0, final Cursor p1, final ViewGroup p2);
    
    protected void k() {
        if (this.H) {
            final Cursor i = this.I;
            if (i != null && !i.isClosed()) {
                this.G = this.I.requery();
            }
        }
    }
    
    public void l(final FilterQueryProvider o) {
        this.O = o;
    }
    
    public Cursor m(final Cursor i) {
        final Cursor j = this.I;
        if (i == j) {
            return null;
        }
        if (j != null) {
            final a l = this.L;
            if (l != null) {
                j.unregisterContentObserver((ContentObserver)l);
            }
            final DataSetObserver m = this.M;
            if (m != null) {
                j.unregisterDataSetObserver(m);
            }
        }
        if ((this.I = i) != null) {
            final a k = this.L;
            if (k != null) {
                i.registerContentObserver((ContentObserver)k);
            }
            final DataSetObserver m2 = this.M;
            if (m2 != null) {
                i.registerDataSetObserver(m2);
            }
            this.K = i.getColumnIndexOrThrow("_id");
            this.G = true;
            this.notifyDataSetChanged();
        }
        else {
            this.K = -1;
            this.G = false;
            this.notifyDataSetInvalidated();
        }
        return j;
    }
    
    private class a extends ContentObserver
    {
        a() {
            super(new Handler());
        }
        
        public boolean deliverSelfNotifications() {
            return true;
        }
        
        public void onChange(final boolean b) {
            androidx.cursoradapter.widget.a.this.k();
        }
    }
    
    private class b extends DataSetObserver
    {
        b() {
        }
        
        public void onChanged() {
            final a a = androidx.cursoradapter.widget.a.this;
            a.G = true;
            a.notifyDataSetChanged();
        }
        
        public void onInvalidated() {
            final a a = androidx.cursoradapter.widget.a.this;
            a.G = false;
            a.notifyDataSetInvalidated();
        }
    }
}
