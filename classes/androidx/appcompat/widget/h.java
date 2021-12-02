// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.core.widget.r;
import android.view.ActionMode$Callback;
import androidx.appcompat.content.res.a;
import androidx.annotation.s;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.view.View;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.CheckedTextView;

public class h extends CheckedTextView
{
    private static final int[] H;
    private final w G;
    
    static {
        H = new int[] { 16843016 };
    }
    
    public h(@j0 final Context context) {
        this(context, null);
    }
    
    public h(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 16843720);
    }
    
    public h(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(r0.b(context), set, n);
        p0.a((View)this, this.getContext());
        final w g = new w((TextView)this);
        (this.G = g).m(set, n);
        g.b();
        final u0 g2 = u0.G(this.getContext(), set, h.H, n, 0);
        this.setCheckMarkDrawable(g2.h(0));
        g2.I();
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final w g = this.G;
        if (g != null) {
            g.b();
        }
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, (View)this);
    }
    
    public void setCheckMarkDrawable(@s final int n) {
        this.setCheckMarkDrawable(a.d(this.getContext(), n));
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(r.H((TextView)this, actionMode$Callback));
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final w g = this.G;
        if (g != null) {
            g.q(context, n);
        }
    }
}
