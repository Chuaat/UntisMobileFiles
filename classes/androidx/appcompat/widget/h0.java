// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.f;
import android.widget.HeaderViewListAdapter;
import android.view.MotionEvent;
import android.content.res.Configuration;
import android.transition.Transition;
import android.view.MenuItem;
import androidx.appcompat.view.menu.g;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.util.Log;
import android.widget.PopupWindow;
import android.os.Build$VERSION;
import java.lang.reflect.Method;
import androidx.annotation.t0;

@t0({ androidx.annotation.t0.a.I })
public class h0 extends f0 implements g0
{
    private static final String A0 = "MenuPopupWindow";
    private static Method B0;
    private g0 z0;
    
    static {
        try {
            if (Build$VERSION.SDK_INT <= 28) {
                h0.B0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        }
        catch (NoSuchMethodException ex) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }
    
    public h0(@j0 final Context context, @k0 final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    @Override
    public void e(@j0 final androidx.appcompat.view.menu.g g, @j0 final MenuItem menuItem) {
        final g0 z0 = this.z0;
        if (z0 != null) {
            z0.e(g, menuItem);
        }
    }
    
    @Override
    public void h(@j0 final androidx.appcompat.view.menu.g g, @j0 final MenuItem menuItem) {
        final g0 z0 = this.z0;
        if (z0 != null) {
            z0.h(g, menuItem);
        }
    }
    
    public void p0(final Object o) {
        if (Build$VERSION.SDK_INT >= 23) {
            super.l0.setEnterTransition((Transition)o);
        }
    }
    
    public void q0(final Object o) {
        if (Build$VERSION.SDK_INT >= 23) {
            super.l0.setExitTransition((Transition)o);
        }
    }
    
    public void r0(final g0 z0) {
        this.z0 = z0;
    }
    
    public void s0(final boolean b) {
        if (Build$VERSION.SDK_INT <= 28) {
            final Method b2 = h0.B0;
            if (b2 != null) {
                try {
                    b2.invoke(super.l0, b);
                }
                catch (Exception ex) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        }
        else {
            super.l0.setTouchModal(b);
        }
    }
    
    @j0
    @Override
    c0 u(final Context context, final boolean b) {
        final a a = new a(context, b);
        a.setHoverListener(this);
        return a;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public static class a extends c0
    {
        final int W;
        final int a0;
        private g0 b0;
        private MenuItem c0;
        
        public a(final Context context, final boolean b) {
            super(context, b);
            final Configuration configuration = context.getResources().getConfiguration();
            if (Build$VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.W = 21;
                this.a0 = 22;
            }
            else {
                this.W = 22;
                this.a0 = 21;
            }
        }
        
        public void m() {
            this.setSelection(-1);
        }
        
        @Override
        public boolean onHoverEvent(final MotionEvent motionEvent) {
            if (this.b0 != null) {
                ListAdapter listAdapter = this.getAdapter();
                int headersCount;
                if (listAdapter instanceof HeaderViewListAdapter) {
                    final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)listAdapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    listAdapter = headerViewListAdapter.getWrappedAdapter();
                }
                else {
                    headersCount = 0;
                }
                final androidx.appcompat.view.menu.f f = (androidx.appcompat.view.menu.f)listAdapter;
                Object d;
                final Object o = d = null;
                if (motionEvent.getAction() != 10) {
                    final int pointToPosition = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
                    d = o;
                    if (pointToPosition != -1) {
                        final int n = pointToPosition - headersCount;
                        d = o;
                        if (n >= 0) {
                            d = o;
                            if (n < f.getCount()) {
                                d = f.d(n);
                            }
                        }
                    }
                }
                final MenuItem c0 = this.c0;
                if (c0 != d) {
                    final androidx.appcompat.view.menu.g b = f.b();
                    if (c0 != null) {
                        this.b0.h(b, c0);
                    }
                    if ((this.c0 = (MenuItem)d) != null) {
                        this.b0.e(b, (MenuItem)d);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
        
        public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
            final ListMenuItemView listMenuItemView = (ListMenuItemView)this.getSelectedView();
            if (listMenuItemView != null && n == this.W) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    this.performItemClick((View)listMenuItemView, this.getSelectedItemPosition(), this.getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && n == this.a0) {
                this.setSelection(-1);
                ListAdapter listAdapter2;
                final ListAdapter listAdapter = listAdapter2 = this.getAdapter();
                if (listAdapter instanceof HeaderViewListAdapter) {
                    listAdapter2 = ((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
                }
                ((androidx.appcompat.view.menu.f)listAdapter2).b().f(false);
                return true;
            }
            return super.onKeyDown(n, keyEvent);
        }
        
        public void setHoverListener(final g0 b0) {
            this.b0 = b0;
        }
    }
}
