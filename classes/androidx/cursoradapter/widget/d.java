// 
// Decompiled by Procyon v0.5.36
// 

package androidx.cursoradapter.widget;

import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.database.Cursor;
import android.content.Context;
import androidx.annotation.t0;

public class d extends c
{
    @t0({ t0.a.H })
    protected int[] U;
    @t0({ t0.a.H })
    protected int[] V;
    private int W;
    private a X;
    private b Y;
    String[] Z;
    
    @Deprecated
    public d(final Context context, final int n, final Cursor cursor, final String[] z, final int[] v) {
        super(context, n, cursor);
        this.W = -1;
        this.V = v;
        this.q(cursor, this.Z = z);
    }
    
    public d(final Context context, final int n, final Cursor cursor, final String[] z, final int[] v, final int n2) {
        super(context, n, cursor, n2);
        this.W = -1;
        this.V = v;
        this.q(cursor, this.Z = z);
    }
    
    private void q(final Cursor cursor, final String[] array) {
        if (cursor != null) {
            final int length = array.length;
            final int[] u = this.U;
            if (u == null || u.length != length) {
                this.U = new int[length];
            }
            for (int i = 0; i < length; ++i) {
                this.U[i] = cursor.getColumnIndexOrThrow(array[i]);
            }
        }
        else {
            this.U = null;
        }
    }
    
    @Override
    public CharSequence a(final Cursor cursor) {
        final a x = this.X;
        if (x != null) {
            return x.a(cursor);
        }
        final int w = this.W;
        if (w > -1) {
            return cursor.getString(w);
        }
        return super.a(cursor);
    }
    
    @Override
    public void e(final View view, final Context context, final Cursor cursor) {
        final b y = this.Y;
        final int[] v = this.V;
        final int length = v.length;
        final int[] u = this.U;
        for (int i = 0; i < length; ++i) {
            final View viewById = view.findViewById(v[i]);
            if (viewById != null && (y == null || !y.a(viewById, cursor, u[i]))) {
                String string;
                if ((string = cursor.getString(u[i])) == null) {
                    string = "";
                }
                if (viewById instanceof TextView) {
                    this.y((TextView)viewById, string);
                }
                else {
                    if (!(viewById instanceof ImageView)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(((ImageView)viewById).getClass().getName());
                        sb.append(" is not a ");
                        sb.append(" view that can be bounds by this SimpleCursorAdapter");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.x((ImageView)viewById, string);
                }
            }
        }
    }
    
    @Override
    public Cursor m(final Cursor cursor) {
        this.q(cursor, this.Z);
        return super.m(cursor);
    }
    
    public void p(final Cursor cursor, final String[] z, final int[] v) {
        this.Z = z;
        this.V = v;
        this.q(cursor, z);
        super.b(cursor);
    }
    
    public a r() {
        return this.X;
    }
    
    public int s() {
        return this.W;
    }
    
    public b t() {
        return this.Y;
    }
    
    public void u(final a x) {
        this.X = x;
    }
    
    public void v(final int w) {
        this.W = w;
    }
    
    public void w(final b y) {
        this.Y = y;
    }
    
    public void x(final ImageView imageView, final String s) {
        try {
            imageView.setImageResource(Integer.parseInt(s));
        }
        catch (NumberFormatException ex) {
            imageView.setImageURI(Uri.parse(s));
        }
    }
    
    public void y(final TextView textView, final String text) {
        textView.setText((CharSequence)text);
    }
    
    public interface a
    {
        CharSequence a(final Cursor p0);
    }
    
    public interface b
    {
        boolean a(final View p0, final Cursor p1, final int p2);
    }
}
