// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.MenuItem;
import android.os.Build$VERSION;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager;
import android.view.MenuItem$OnMenuItemClickListener;
import android.view.SubMenu;
import c.a;
import android.util.TypedValue;
import android.view.View;
import android.content.Context;
import androidx.core.view.b;

public class n0 extends androidx.core.view.b
{
    private static final int k = 4;
    public static final String l = "share_history.xml";
    private int e;
    private final c f;
    final Context g;
    String h;
    a i;
    private d.f j;
    
    public n0(final Context g) {
        super(g);
        this.e = 4;
        this.f = new c();
        this.h = "share_history.xml";
        this.g = g;
    }
    
    private void n() {
        if (this.i == null) {
            return;
        }
        if (this.j == null) {
            this.j = new b();
        }
        androidx.appcompat.widget.d.d(this.g, this.h).u(this.j);
    }
    
    @Override
    public boolean b() {
        return true;
    }
    
    @Override
    public View d() {
        final ActivityChooserView activityChooserView = new ActivityChooserView(this.g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(androidx.appcompat.widget.d.d(this.g, this.h));
        }
        final TypedValue typedValue = new TypedValue();
        this.g.getTheme().resolveAttribute(c.a.c.A, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(androidx.appcompat.content.res.a.d(this.g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(c.a.l.z);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(c.a.l.y);
        return (View)activityChooserView;
    }
    
    @Override
    public void g(SubMenu addSubMenu) {
        addSubMenu.clear();
        final d d = androidx.appcompat.widget.d.d(this.g, this.h);
        final PackageManager packageManager = this.g.getPackageManager();
        final int f = d.f();
        final int min = Math.min(f, this.e);
        for (int i = 0; i < min; ++i) {
            final ResolveInfo e = d.e(i);
            addSubMenu.add(0, i, i, e.loadLabel(packageManager)).setIcon(e.loadIcon(packageManager)).setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)this.f);
        }
        if (min < f) {
            addSubMenu = addSubMenu.addSubMenu(0, min, min, (CharSequence)this.g.getString(c.a.l.e));
            for (int j = 0; j < f; ++j) {
                final ResolveInfo e2 = d.e(j);
                addSubMenu.add(0, j, j, e2.loadLabel(packageManager)).setIcon(e2.loadIcon(packageManager)).setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)this.f);
            }
        }
    }
    
    public void o(final a i) {
        this.i = i;
        this.n();
    }
    
    public void p(final String h) {
        this.h = h;
        this.n();
    }
    
    public void q(final Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                this.r(intent);
            }
        }
        androidx.appcompat.widget.d.d(this.g, this.h).t(intent);
    }
    
    void r(final Intent intent) {
        int n;
        if (Build$VERSION.SDK_INT >= 21) {
            n = 134742016;
        }
        else {
            n = 524288;
        }
        intent.addFlags(n);
    }
    
    public interface a
    {
        boolean a(final n0 p0, final Intent p1);
    }
    
    private class b implements f
    {
        b() {
        }
        
        @Override
        public boolean a(final d d, final Intent intent) {
            final n0 a = n0.this;
            final n0.a i = a.i;
            if (i != null) {
                i.a(a, intent);
            }
            return false;
        }
    }
    
    private class c implements MenuItem$OnMenuItemClickListener
    {
        c() {
        }
        
        public boolean onMenuItemClick(final MenuItem menuItem) {
            final n0 g = n0.this;
            final Intent b = androidx.appcompat.widget.d.d(g.g, g.h).b(menuItem.getItemId());
            if (b != null) {
                final String action = b.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    n0.this.r(b);
                }
                n0.this.g.startActivity(b);
            }
            return true;
        }
    }
}
