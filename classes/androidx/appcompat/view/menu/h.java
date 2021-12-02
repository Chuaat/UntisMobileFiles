// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.view.KeyEvent$DispatcherState;
import android.view.Window;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.content.DialogInterface;
import androidx.annotation.j0;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import c.a;
import android.os.IBinder;
import androidx.appcompat.app.d;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnKeyListener;

class h implements DialogInterface$OnKeyListener, DialogInterface$OnClickListener, DialogInterface$OnDismissListener, a
{
    private g G;
    private d H;
    e I;
    private a J;
    
    public h(final g g) {
        this.G = g;
    }
    
    public void a() {
        final d h = this.H;
        if (h != null) {
            h.dismiss();
        }
    }
    
    public void b(final a j) {
        this.J = j;
    }
    
    public void c(final IBinder token) {
        final g g = this.G;
        final d.a a = new d.a(g.x());
        (this.I = new e(a.b(), c.a.k.q)).i(this);
        this.G.b(this.I);
        a.c(this.I.a(), (DialogInterface$OnClickListener)this);
        final View b = g.B();
        if (b != null) {
            a.f(b);
        }
        else {
            a.h(g.z()).K(g.A());
        }
        a.A((DialogInterface$OnKeyListener)this);
        (this.H = a.a()).setOnDismissListener((DialogInterface$OnDismissListener)this);
        final WindowManager$LayoutParams attributes = this.H.getWindow().getAttributes();
        attributes.type = 1003;
        if (token != null) {
            attributes.token = token;
        }
        attributes.flags |= 0x20000;
        this.H.show();
    }
    
    public void d(@j0 final g g, final boolean b) {
        if (b || g == this.G) {
            this.a();
        }
        final a j = this.J;
        if (j != null) {
            j.d(g, b);
        }
    }
    
    public boolean e(@j0 final g g) {
        final a j = this.J;
        return j != null && j.e(g);
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.G.O((MenuItem)this.I.a().getItem(n), 0);
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        this.I.d(this.G, true);
    }
    
    public boolean onKey(final DialogInterface dialogInterface, final int n, final KeyEvent keyEvent) {
        if (n == 82 || n == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final Window window = this.H.getWindow();
                if (window != null) {
                    final View decorView = window.getDecorView();
                    if (decorView != null) {
                        final KeyEvent$DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, (Object)this);
                            return true;
                        }
                    }
                }
            }
            else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                final Window window2 = this.H.getWindow();
                if (window2 != null) {
                    final View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        final KeyEvent$DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.G.f(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.G.performShortcut(n, keyEvent, 0);
    }
}
