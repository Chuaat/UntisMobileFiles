// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import androidx.annotation.e0;
import androidx.appcompat.view.b;
import androidx.annotation.t0;
import androidx.annotation.k0;
import androidx.annotation.y;
import android.view.Window$Callback;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import c.a;
import android.util.TypedValue;
import android.content.DialogInterface$OnCancelListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.content.Context;
import androidx.core.view.k;
import android.app.Dialog;

public class i extends Dialog implements f
{
    private g G;
    private final k.a H;
    
    public i(final Context context) {
        this(context, 0);
    }
    
    public i(final Context context, final int n) {
        super(context, c(context, n));
        this.H = new k.a() {
            @Override
            public boolean superDispatchKeyEvent(final KeyEvent keyEvent) {
                return i.this.d(keyEvent);
            }
        };
        final g a = this.a();
        a.R(c(context, n));
        a.z(null);
    }
    
    protected i(final Context context, final boolean b, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        super(context, b, dialogInterface$OnCancelListener);
        this.H = new k.a() {
            @Override
            public boolean superDispatchKeyEvent(final KeyEvent keyEvent) {
                return i.this.d(keyEvent);
            }
        };
    }
    
    private static int c(final Context context, final int n) {
        int resourceId = n;
        if (n == 0) {
            final TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(a.c.X0, typedValue, true);
            resourceId = typedValue.resourceId;
        }
        return resourceId;
    }
    
    public g a() {
        if (this.G == null) {
            this.G = g.j(this, this);
        }
        return this.G;
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.a().d(view, viewGroup$LayoutParams);
    }
    
    public androidx.appcompat.app.a b() {
        return this.a().s();
    }
    
    boolean d(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public void dismiss() {
        super.dismiss();
        this.a().A();
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return k.e(this.H, this.getWindow().getDecorView(), (Window$Callback)this, keyEvent);
    }
    
    public boolean e(final int n) {
        return this.a().I(n);
    }
    
    @k0
    public <T extends View> T findViewById(@y final int n) {
        return this.a().n(n);
    }
    
    @t0({ t0.a.I })
    public void invalidateOptionsMenu() {
        this.a().v();
    }
    
    protected void onCreate(final Bundle bundle) {
        this.a().u();
        super.onCreate(bundle);
        this.a().z(bundle);
    }
    
    protected void onStop() {
        super.onStop();
        this.a().F();
    }
    
    public void onSupportActionModeFinished(final b b) {
    }
    
    public void onSupportActionModeStarted(final b b) {
    }
    
    @k0
    public b onWindowStartingSupportActionMode(final b.a a) {
        return null;
    }
    
    public void setContentView(@e0 final int n) {
        this.a().K(n);
    }
    
    public void setContentView(final View view) {
        this.a().L(view);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.a().M(view, viewGroup$LayoutParams);
    }
    
    public void setTitle(final int title) {
        super.setTitle(title);
        this.a().S(this.getContext().getString(title));
    }
    
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.a().S(title);
    }
}
