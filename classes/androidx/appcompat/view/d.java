// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view;

import c.a;
import android.content.res.AssetManager;
import android.os.Build$VERSION;
import androidx.annotation.x0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.content.res.Resources$Theme;
import android.content.ContextWrapper;

public class d extends ContextWrapper
{
    private int a;
    private Resources$Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;
    
    public d() {
        super((Context)null);
    }
    
    public d(final Context context, @x0 final int a) {
        super(context);
        this.a = a;
    }
    
    public d(final Context context, final Resources$Theme b) {
        super(context);
        this.b = b;
    }
    
    private Resources b() {
        if (this.e == null) {
            final Configuration d = this.d;
            Resources e;
            if (d == null) {
                e = super.getResources();
            }
            else {
                if (Build$VERSION.SDK_INT < 17) {
                    final Resources resources = super.getResources();
                    final Configuration configuration = new Configuration(resources.getConfiguration());
                    configuration.updateFrom(this.d);
                    this.e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration);
                    return this.e;
                }
                e = this.createConfigurationContext(d).getResources();
            }
            this.e = e;
        }
        return this.e;
    }
    
    private void d() {
        final boolean b = this.b == null;
        if (b) {
            this.b = this.getResources().newTheme();
            final Resources$Theme theme = this.getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.e(this.b, this.a, b);
    }
    
    public void a(final Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d == null) {
            this.d = new Configuration(configuration);
            return;
        }
        throw new IllegalStateException("Override configuration has already been set");
    }
    
    protected void attachBaseContext(final Context context) {
        super.attachBaseContext(context);
    }
    
    public int c() {
        return this.a;
    }
    
    protected void e(final Resources$Theme resources$Theme, final int n, final boolean b) {
        resources$Theme.applyStyle(n, true);
    }
    
    public AssetManager getAssets() {
        return this.getResources().getAssets();
    }
    
    public Resources getResources() {
        return this.b();
    }
    
    public Object getSystemService(final String anObject) {
        if ("layout_inflater".equals(anObject)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(this.getBaseContext()).cloneInContext((Context)this);
            }
            return this.c;
        }
        return this.getBaseContext().getSystemService(anObject);
    }
    
    public Resources$Theme getTheme() {
        final Resources$Theme b = this.b;
        if (b != null) {
            return b;
        }
        if (this.a == 0) {
            this.a = c.a.m.h4;
        }
        this.d();
        return this.b;
    }
    
    public void setTheme(final int a) {
        if (this.a != a) {
            this.a = a;
            this.d();
        }
    }
}
