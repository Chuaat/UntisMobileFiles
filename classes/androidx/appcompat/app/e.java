// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import androidx.annotation.x0;
import androidx.appcompat.widget.Toolbar;
import androidx.annotation.i;
import android.view.Menu;
import android.view.MenuItem;
import android.content.res.Configuration;
import androidx.core.app.n;
import android.content.Intent;
import androidx.appcompat.widget.z0;
import android.view.MenuInflater;
import androidx.annotation.k0;
import android.app.Activity;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.Window;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import androidx.lifecycle.d1;
import androidx.lifecycle.g1;
import androidx.lifecycle.y;
import androidx.lifecycle.f1;
import android.content.Context;
import a.c;
import androidx.annotation.j0;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.annotation.o;
import androidx.annotation.e0;
import android.content.res.Resources;
import androidx.core.app.c0;
import androidx.fragment.app.d;

public class e extends d implements f, c0.a, b.c
{
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;
    
    public e() {
        this.initDelegate();
    }
    
    @o
    public e(@e0 final int n) {
        super(n);
        this.initDelegate();
    }
    
    private void initDelegate() {
        this.getSavedStateRegistry().e("androidx:appcompat", (SavedStateRegistry.b)new SavedStateRegistry.b() {
            @j0
            @Override
            public Bundle a() {
                final Bundle bundle = new Bundle();
                e.this.getDelegate().D(bundle);
                return bundle;
            }
        });
        this.addOnContextAvailableListener(new c() {
            @Override
            public void a(@j0 final Context context) {
                final g delegate = e.this.getDelegate();
                delegate.u();
                delegate.z(e.this.getSavedStateRegistry().a("androidx:appcompat"));
            }
        });
    }
    
    private void initViewTreeOwners() {
        f1.b(this.getWindow().getDecorView(), this);
        g1.b(this.getWindow().getDecorView(), this);
        androidx.savedstate.d.b(this.getWindow().getDecorView(), this);
    }
    
    private boolean performMenuItemShortcut(final KeyEvent keyEvent) {
        if (Build$VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            final Window window = this.getWindow();
            if (window != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        this.getDelegate().d(view, viewGroup$LayoutParams);
    }
    
    protected void attachBaseContext(final Context context) {
        super.attachBaseContext(this.getDelegate().h(context));
    }
    
    public void closeOptionsMenu() {
        final a supportActionBar = this.getSupportActionBar();
        if (this.getWindow().hasFeature(0) && (supportActionBar == null || !supportActionBar.l())) {
            super.closeOptionsMenu();
        }
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        final a supportActionBar = this.getSupportActionBar();
        return (keyCode == 82 && supportActionBar != null && supportActionBar.L(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }
    
    public <T extends View> T findViewById(@androidx.annotation.y final int n) {
        return this.getDelegate().n(n);
    }
    
    @j0
    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.i(this, this);
        }
        return this.mDelegate;
    }
    
    @k0
    @Override
    public b.b getDrawerToggleDelegate() {
        return this.getDelegate().p();
    }
    
    @j0
    public MenuInflater getMenuInflater() {
        return this.getDelegate().r();
    }
    
    public Resources getResources() {
        if (this.mResources == null && androidx.appcompat.widget.z0.c()) {
            this.mResources = new z0((Context)this, super.getResources());
        }
        Resources resources;
        if ((resources = this.mResources) == null) {
            resources = super.getResources();
        }
        return resources;
    }
    
    @k0
    public a getSupportActionBar() {
        return this.getDelegate().s();
    }
    
    @k0
    @Override
    public Intent getSupportParentActivityIntent() {
        return n.a(this);
    }
    
    public void invalidateOptionsMenu() {
        this.getDelegate().v();
    }
    
    @Override
    public void onConfigurationChanged(@j0 final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        this.getDelegate().y(configuration);
    }
    
    public void onContentChanged() {
        this.onSupportContentChanged();
    }
    
    public void onCreateSupportNavigateUpTaskStack(@j0 final c0 c0) {
        c0.h(this);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.getDelegate().A();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return this.performMenuItemShortcut(keyEvent) || super.onKeyDown(n, keyEvent);
    }
    
    @Override
    public final boolean onMenuItemSelected(final int n, @j0 final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        final a supportActionBar = this.getSupportActionBar();
        return menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.p() & 0x4) != 0x0 && this.onSupportNavigateUp();
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return super.onMenuOpened(n, menu);
    }
    
    protected void onNightModeChanged(final int n) {
    }
    
    @Override
    public void onPanelClosed(final int n, @j0 final Menu menu) {
        super.onPanelClosed(n, menu);
    }
    
    protected void onPostCreate(@k0 final Bundle bundle) {
        super.onPostCreate(bundle);
        this.getDelegate().B(bundle);
    }
    
    @Override
    protected void onPostResume() {
        super.onPostResume();
        this.getDelegate().C();
    }
    
    public void onPrepareSupportNavigateUpTaskStack(@j0 final c0 c0) {
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        this.getDelegate().E();
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        this.getDelegate().F();
    }
    
    @i
    @Override
    public void onSupportActionModeFinished(@j0 final androidx.appcompat.view.b b) {
    }
    
    @i
    @Override
    public void onSupportActionModeStarted(@j0 final androidx.appcompat.view.b b) {
    }
    
    @Deprecated
    public void onSupportContentChanged() {
    }
    
    public boolean onSupportNavigateUp() {
        final Intent supportParentActivityIntent = this.getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (this.supportShouldUpRecreateTask(supportParentActivityIntent)) {
                final c0 l = c0.l((Context)this);
                this.onCreateSupportNavigateUpTaskStack(l);
                this.onPrepareSupportNavigateUpTaskStack(l);
                l.v();
                try {
                    androidx.core.app.a.v(this);
                }
                catch (IllegalStateException ex) {
                    this.finish();
                }
            }
            else {
                this.supportNavigateUpTo(supportParentActivityIntent);
            }
            return true;
        }
        return false;
    }
    
    protected void onTitleChanged(final CharSequence charSequence, final int n) {
        super.onTitleChanged(charSequence, n);
        this.getDelegate().S(charSequence);
    }
    
    @k0
    @Override
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(@j0 final b.a a) {
        return null;
    }
    
    public void openOptionsMenu() {
        final a supportActionBar = this.getSupportActionBar();
        if (this.getWindow().hasFeature(0) && (supportActionBar == null || !supportActionBar.M())) {
            super.openOptionsMenu();
        }
    }
    
    @Override
    public void setContentView(@e0 final int n) {
        this.initViewTreeOwners();
        this.getDelegate().K(n);
    }
    
    @Override
    public void setContentView(final View view) {
        this.initViewTreeOwners();
        this.getDelegate().L(view);
    }
    
    @Override
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        this.getDelegate().M(view, viewGroup$LayoutParams);
    }
    
    public void setSupportActionBar(@k0 final Toolbar toolbar) {
        this.getDelegate().Q(toolbar);
    }
    
    @Deprecated
    public void setSupportProgress(final int n) {
    }
    
    @Deprecated
    public void setSupportProgressBarIndeterminate(final boolean b) {
    }
    
    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(final boolean b) {
    }
    
    @Deprecated
    public void setSupportProgressBarVisibility(final boolean b) {
    }
    
    public void setTheme(@x0 final int theme) {
        super.setTheme(theme);
        this.getDelegate().R(theme);
    }
    
    @k0
    public androidx.appcompat.view.b startSupportActionMode(@j0 final b.a a) {
        return this.getDelegate().T(a);
    }
    
    @Override
    public void supportInvalidateOptionsMenu() {
        this.getDelegate().v();
    }
    
    public void supportNavigateUpTo(@j0 final Intent intent) {
        n.g(this, intent);
    }
    
    public boolean supportRequestWindowFeature(final int n) {
        return this.getDelegate().I(n);
    }
    
    public boolean supportShouldUpRecreateTask(@j0 final Intent intent) {
        return n.h(this, intent);
    }
}
