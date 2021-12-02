// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textfield;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import com.google.android.material.internal.g;
import android.graphics.Point;
import android.view.ViewParent;
import android.view.View;
import android.text.Editable;
import android.os.Build$VERSION;
import android.text.TextUtils;
import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import o2.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.graphics.Rect;
import androidx.appcompat.widget.AppCompatEditText;

public class TextInputEditText extends AppCompatEditText
{
    private final Rect K;
    private boolean L;
    
    public TextInputEditText(@j0 final Context context) {
        this(context, null);
    }
    
    public TextInputEditText(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.E4);
    }
    
    public TextInputEditText(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(com.google.android.material.theme.overlay.a.c(context, set, n, 0), set, n);
        this.K = new Rect();
        final TypedArray j = t.j(context, set, a.o.ys, n, a.n.Ba, new int[0]);
        this.setTextInputLayoutFocusedRectEnabled(j.getBoolean(a.o.zs, false));
        j.recycle();
    }
    
    @j0
    private String b(@j0 final TextInputLayout textInputLayout) {
        final Editable text = this.getText();
        final CharSequence hint = textInputLayout.getHint();
        final boolean empty = TextUtils.isEmpty((CharSequence)text);
        final boolean empty2 = TextUtils.isEmpty(hint);
        if (Build$VERSION.SDK_INT >= 17) {
            this.setLabelFor(a.h.x5);
        }
        String string = "";
        String string2;
        if (empty2 ^ true) {
            string2 = hint.toString();
        }
        else {
            string2 = "";
        }
        if (empty ^ true) {
            final StringBuilder sb = new StringBuilder();
            sb.append(text);
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(", ");
                sb2.append(string2);
                string = sb2.toString();
            }
            sb.append(string);
            return sb.toString();
        }
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            return string2;
        }
        return "";
    }
    
    @k0
    private CharSequence getHintFromLayout() {
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        CharSequence hint;
        if (textInputLayout != null) {
            hint = textInputLayout.getHint();
        }
        else {
            hint = null;
        }
        return hint;
    }
    
    @k0
    private TextInputLayout getTextInputLayout() {
        for (ViewParent viewParent = this.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
            if (viewParent instanceof TextInputLayout) {
                return (TextInputLayout)viewParent;
            }
        }
        return null;
    }
    
    public boolean c() {
        return this.L;
    }
    
    public void getFocusedRect(@k0 final Rect rect) {
        super.getFocusedRect(rect);
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && this.L && rect != null) {
            textInputLayout.getFocusedRect(this.K);
            rect.bottom = this.K.bottom;
        }
    }
    
    public boolean getGlobalVisibleRect(@k0 final Rect rect, @k0 final Point point) {
        final boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && this.L && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.K, point);
            rect.bottom = this.K.bottom;
        }
        return globalVisibleRect;
    }
    
    @k0
    public CharSequence getHint() {
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && textInputLayout.Z()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && textInputLayout.Z() && super.getHint() == null && g.c()) {
            this.setHint((CharSequence)"");
        }
    }
    
    @k0
    @Override
    public InputConnection onCreateInputConnection(@j0 final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = this.getHintFromLayout();
        }
        return onCreateInputConnection;
    }
    
    public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (Build$VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText((CharSequence)this.b(textInputLayout));
        }
    }
    
    public boolean requestRectangleOnScreen(@k0 final Rect rect) {
        final boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        final TextInputLayout textInputLayout = this.getTextInputLayout();
        if (textInputLayout != null && this.L) {
            this.K.set(0, textInputLayout.getHeight() - this.getResources().getDimensionPixelOffset(a.f.w4), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.K, true);
        }
        return requestRectangleOnScreen;
    }
    
    public void setTextInputLayoutFocusedRectEnabled(final boolean l) {
        this.L = l;
    }
}
