// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.ActionMode$Callback;
import androidx.annotation.s;
import android.graphics.drawable.Drawable;
import android.view.DragEvent;
import androidx.core.view.inputmethod.b;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.textclassifier.TextClassifier;
import android.os.Build$VERSION;
import android.text.Editable;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.t0;
import android.content.res.ColorStateList;
import androidx.core.view.c;
import android.widget.TextView;
import android.view.View;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.widget.t;
import androidx.core.view.c0;
import androidx.core.view.h0;
import android.widget.EditText;

public class AppCompatEditText extends EditText implements h0, c0
{
    private final f G;
    private final w H;
    private final v I;
    private final t J;
    
    public AppCompatEditText(@j0 final Context context) {
        this(context, null);
    }
    
    public AppCompatEditText(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.r1);
    }
    
    public AppCompatEditText(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(r0.b(context), set, n);
        p0.a((View)this, this.getContext());
        (this.G = new f((View)this)).e(set, n);
        final w h = new w((TextView)this);
        (this.H = h).m(set, n);
        h.b();
        this.I = new v((TextView)this);
        this.J = new t();
    }
    
    @k0
    public c a(@j0 final c c) {
        return this.J.a((View)this, c);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final f g = this.G;
        if (g != null) {
            g.b();
        }
        final w h = this.H;
        if (h != null) {
            h.b();
        }
    }
    
    @k0
    @t0({ t0.a.I })
    public ColorStateList getSupportBackgroundTintList() {
        final f g = this.G;
        ColorStateList c;
        if (g != null) {
            c = g.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    @k0
    @t0({ t0.a.I })
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final f g = this.G;
        PorterDuff$Mode d;
        if (g != null) {
            d = g.d();
        }
        else {
            d = null;
        }
        return d;
    }
    
    @k0
    public Editable getText() {
        if (Build$VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
    
    @j0
    @androidx.annotation.p0(api = 26)
    public TextClassifier getTextClassifier() {
        if (Build$VERSION.SDK_INT < 28) {
            final v i = this.I;
            if (i != null) {
                return i.a();
            }
        }
        return super.getTextClassifier();
    }
    
    @k0
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.H.r((TextView)this, onCreateInputConnection, editorInfo);
        final InputConnection a = k.a(onCreateInputConnection, editorInfo, (View)this);
        final String[] f0 = androidx.core.view.j0.f0((View)this);
        InputConnection b = a;
        if (a != null) {
            b = a;
            if (f0 != null) {
                androidx.core.view.inputmethod.a.h(editorInfo, f0);
                b = androidx.core.view.inputmethod.b.b(a, editorInfo, r.a((View)this));
            }
        }
        return b;
    }
    
    public boolean onDragEvent(final DragEvent dragEvent) {
        return r.b((View)this, dragEvent) || super.onDragEvent(dragEvent);
    }
    
    public boolean onTextContextMenuItem(final int n) {
        return r.c((TextView)this, n) || super.onTextContextMenuItem(n);
    }
    
    public void setBackgroundDrawable(@k0 final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final f g = this.G;
        if (g != null) {
            g.f(backgroundDrawable);
        }
    }
    
    public void setBackgroundResource(@s final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final f g = this.G;
        if (g != null) {
            g.g(backgroundResource);
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.r.H((TextView)this, actionMode$Callback));
    }
    
    @t0({ t0.a.I })
    public void setSupportBackgroundTintList(@k0 final ColorStateList list) {
        final f g = this.G;
        if (g != null) {
            g.i(list);
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportBackgroundTintMode(@k0 final PorterDuff$Mode porterDuff$Mode) {
        final f g = this.G;
        if (g != null) {
            g.j(porterDuff$Mode);
        }
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final w h = this.H;
        if (h != null) {
            h.q(context, n);
        }
    }
    
    @androidx.annotation.p0(api = 26)
    public void setTextClassifier(@k0 final TextClassifier textClassifier) {
        if (Build$VERSION.SDK_INT < 28) {
            final v i = this.I;
            if (i != null) {
                i.b(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }
}
