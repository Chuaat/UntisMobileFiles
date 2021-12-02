// 
// Decompiled by Procyon v0.5.36
// 

package androidx.legacy.app;

import androidx.annotation.j0;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.InsetDrawable;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import androidx.annotation.k0;
import android.view.MenuItem;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageView;
import android.util.Log;
import android.content.res.TypedArray;
import android.app.ActionBar;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import androidx.core.content.d;
import android.content.Context;
import androidx.annotation.w0;
import androidx.annotation.s;
import android.graphics.drawable.Drawable;
import android.app.Activity;
import androidx.drawerlayout.widget.DrawerLayout;

@Deprecated
public class a implements e
{
    private static final String m = "ActionBarDrawerToggle";
    private static final int[] n;
    private static final float o = 0.33333334f;
    private static final int p = 16908332;
    final Activity a;
    private final a b;
    private final DrawerLayout c;
    private boolean d;
    private boolean e;
    private Drawable f;
    private Drawable g;
    private d h;
    private final int i;
    private final int j;
    private final int k;
    private c l;
    
    static {
        n = new int[] { 16843531 };
    }
    
    public a(final Activity activity, final DrawerLayout drawerLayout, @s final int n, @w0 final int n2, @w0 final int n3) {
        this(activity, drawerLayout, e((Context)activity) ^ true, n, n2, n3);
    }
    
    public a(final Activity a, final DrawerLayout c, final boolean b, @s final int i, @w0 final int j, @w0 final int k) {
        this.d = true;
        this.a = a;
        Object drawerToggleDelegate;
        if (a instanceof b) {
            drawerToggleDelegate = ((b)a).getDrawerToggleDelegate();
        }
        else {
            drawerToggleDelegate = null;
        }
        this.b = (a)drawerToggleDelegate;
        this.c = c;
        this.i = i;
        this.j = j;
        this.k = k;
        this.f = this.f();
        this.g = androidx.core.content.d.i((Context)a, i);
        final d h = new d(this.g);
        this.h = h;
        float n;
        if (b) {
            n = 0.33333334f;
        }
        else {
            n = 0.0f;
        }
        h.b(n);
    }
    
    private static boolean e(final Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21 && Build$VERSION.SDK_INT >= 21;
    }
    
    private Drawable f() {
        final a b = this.b;
        if (b != null) {
            return b.b();
        }
        TypedArray typedArray;
        if (Build$VERSION.SDK_INT >= 18) {
            final ActionBar actionBar = this.a.getActionBar();
            Object o;
            if (actionBar != null) {
                o = actionBar.getThemedContext();
            }
            else {
                o = this.a;
            }
            typedArray = ((Context)o).obtainStyledAttributes((AttributeSet)null, androidx.legacy.app.a.n, 16843470, 0);
        }
        else {
            typedArray = this.a.obtainStyledAttributes(androidx.legacy.app.a.n);
        }
        final Drawable drawable = typedArray.getDrawable(0);
        typedArray.recycle();
        return drawable;
    }
    
    private void j(final int n) {
        final a b = this.b;
        if (b != null) {
            b.c(n);
            return;
        }
        if (Build$VERSION.SDK_INT >= 18) {
            final ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(n);
            }
        }
        else {
            if (this.l == null) {
                this.l = new c(this.a);
            }
            if (this.l.a != null) {
                try {
                    final ActionBar actionBar2 = this.a.getActionBar();
                    this.l.b.invoke(actionBar2, n);
                    actionBar2.setSubtitle(actionBar2.getSubtitle());
                }
                catch (Exception ex) {
                    Log.w("ActionBarDrawerToggle", "Couldn't set content description via JB-MR2 API", (Throwable)ex);
                }
            }
        }
    }
    
    private void k(final Drawable drawable, final int n) {
        final a b = this.b;
        if (b != null) {
            b.a(drawable, n);
            return;
        }
        if (Build$VERSION.SDK_INT >= 18) {
            final ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(n);
            }
        }
        else {
            if (this.l == null) {
                this.l = new c(this.a);
            }
            final c l = this.l;
            if (l.a != null) {
                try {
                    final ActionBar actionBar2 = this.a.getActionBar();
                    this.l.a.invoke(actionBar2, drawable);
                    this.l.b.invoke(actionBar2, n);
                }
                catch (Exception ex) {
                    Log.w("ActionBarDrawerToggle", "Couldn't set home-as-up indicator via JB-MR2 API", (Throwable)ex);
                }
            }
            else {
                final ImageView c = l.c;
                if (c != null) {
                    c.setImageDrawable(drawable);
                }
                else {
                    Log.w("ActionBarDrawerToggle", "Couldn't set home-as-up indicator");
                }
            }
        }
    }
    
    @Override
    public void a(final View view) {
        this.h.c(1.0f);
        if (this.d) {
            this.j(this.k);
        }
    }
    
    @Override
    public void b(final View view) {
        this.h.c(0.0f);
        if (this.d) {
            this.j(this.j);
        }
    }
    
    @Override
    public void c(final int n) {
    }
    
    @Override
    public void d(final View view, float n) {
        final float a = this.h.a();
        if (n > 0.5f) {
            n = Math.max(a, Math.max(0.0f, n - 0.5f) * 2.0f);
        }
        else {
            n = Math.min(a, n * 2.0f);
        }
        this.h.c(n);
    }
    
    public boolean g() {
        return this.d;
    }
    
    public void h(final Configuration configuration) {
        if (!this.e) {
            this.f = this.f();
        }
        this.g = androidx.core.content.d.i((Context)this.a, this.i);
        this.o();
    }
    
    public boolean i(final MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.d) {
            if (this.c.F(8388611)) {
                this.c.d(8388611);
            }
            else {
                this.c.K(8388611);
            }
            return true;
        }
        return false;
    }
    
    public void l(final boolean d) {
        if (d != this.d) {
            Object o;
            int n;
            if (d) {
                o = this.h;
                if (this.c.C(8388611)) {
                    n = this.k;
                }
                else {
                    n = this.j;
                }
            }
            else {
                o = this.f;
                n = 0;
            }
            this.k((Drawable)o, n);
            this.d = d;
        }
    }
    
    public void m(final int n) {
        Drawable i;
        if (n != 0) {
            i = androidx.core.content.d.i((Context)this.a, n);
        }
        else {
            i = null;
        }
        this.n(i);
    }
    
    public void n(final Drawable f) {
        if (f == null) {
            this.f = this.f();
            this.e = false;
        }
        else {
            this.f = f;
            this.e = true;
        }
        if (!this.d) {
            this.k(this.f, 0);
        }
    }
    
    public void o() {
        d d;
        float n;
        if (this.c.C(8388611)) {
            d = this.h;
            n = 1.0f;
        }
        else {
            d = this.h;
            n = 0.0f;
        }
        d.c(n);
        if (this.d) {
            final d h = this.h;
            int n2;
            if (this.c.C(8388611)) {
                n2 = this.k;
            }
            else {
                n2 = this.j;
            }
            this.k((Drawable)h, n2);
        }
    }
    
    @Deprecated
    public interface a
    {
        void a(final Drawable p0, @w0 final int p1);
        
        @k0
        Drawable b();
        
        void c(@w0 final int p0);
    }
    
    @Deprecated
    public interface b
    {
        @k0
        a getDrawerToggleDelegate();
    }
    
    private static class c
    {
        Method a;
        Method b;
        ImageView c;
        
        c(final Activity activity) {
            try {
                this.a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            }
            catch (NoSuchMethodException ex) {
                final View viewById = activity.findViewById(16908332);
                if (viewById == null) {
                    return;
                }
                final ViewGroup viewGroup = (ViewGroup)viewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                final View child = viewGroup.getChildAt(0);
                final View child2 = viewGroup.getChildAt(1);
                Object o = child;
                if (child.getId() == 16908332) {
                    o = child2;
                }
                if (o instanceof ImageView) {
                    this.c = (ImageView)o;
                }
            }
        }
    }
    
    private class d extends InsetDrawable implements Drawable$Callback
    {
        private final boolean G;
        private final Rect H;
        private float I;
        private float J;
        
        d(final Drawable drawable) {
            boolean g = false;
            super(drawable, 0);
            if (Build$VERSION.SDK_INT > 18) {
                g = true;
            }
            this.G = g;
            this.H = new Rect();
        }
        
        public float a() {
            return this.I;
        }
        
        public void b(final float j) {
            this.J = j;
            this.invalidateSelf();
        }
        
        public void c(final float i) {
            this.I = i;
            this.invalidateSelf();
        }
        
        public void draw(@j0 final Canvas canvas) {
            this.copyBounds(this.H);
            canvas.save();
            final int x = androidx.core.view.j0.X(androidx.legacy.app.a.this.a.getWindow().getDecorView());
            int n = 1;
            final boolean b = x == 1;
            if (b) {
                n = -1;
            }
            final int width = this.H.width();
            final float n2 = -this.J;
            final float n3 = (float)width;
            canvas.translate(n2 * n3 * this.I * n, 0.0f);
            if (b && !this.G) {
                canvas.translate(n3, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }
}
