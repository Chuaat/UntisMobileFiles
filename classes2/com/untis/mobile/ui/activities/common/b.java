// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.common;

import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.view.Window;
import com.untis.mobile.utils.extension.h;
import androidx.core.content.d;
import android.os.Build$VERSION;
import java.util.Iterator;
import android.view.MenuItem;
import android.content.Context;
import com.untis.mobile.ui.activities.profile.InvalidApiKeyActivity;
import com.untis.mobile.persistence.models.profile.ProfileState;
import com.untis.mobile.persistence.models.profile.Profile;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import androidx.appcompat.app.a;
import android.view.View;
import android.app.Application;
import com.untis.mobile.UntisMobileApplication;
import java.util.ArrayList;
import rx.o;
import java.util.List;
import kotlin.Metadata;
import androidx.appcompat.app.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\u0012\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bJ\u001c\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0017\u001a\u00020\u0006H\u0014J\b\u0010\u0018\u001a\u00020\u0006H\u0014J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0004R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!" }, d2 = { "Lcom/untis/mobile/ui/activities/common/b;", "Landroidx/appcompat/app/e;", "Lcom/untis/mobile/UntisMobileApplication;", "getUntisApplication", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/j2;", "onCreate", "Landroid/view/View;", "currentFocusedView", "hideKeyBoard", "showKeyBoard", "", "title", "subTitle", "setUpTopActionBar", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "onOfflineMessageClick", "onPause", "onResume", "Lrx/o;", "subscription", "addSubscription", "", "subscriptions", "Ljava/util/List;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public abstract class b extends e
{
    @org.jetbrains.annotations.e
    private final List<o> subscriptions;
    
    public b() {
        this.subscriptions = new ArrayList<o>();
    }
    
    private final UntisMobileApplication getUntisApplication() {
        final Application application = ((Activity)this).getApplication();
        UntisMobileApplication untisMobileApplication;
        if (application instanceof UntisMobileApplication) {
            untisMobileApplication = (UntisMobileApplication)application;
        }
        else {
            untisMobileApplication = null;
        }
        return untisMobileApplication;
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    protected final void addSubscription(@org.jetbrains.annotations.e final o o) {
        k0.p(o, "subscription");
        this.subscriptions.add(o);
    }
    
    public final void hideKeyBoard(@f View currentFocus) {
        View view = currentFocus;
        if (currentFocus == null) {
            currentFocus = ((Activity)this).getCurrentFocus();
            if ((view = currentFocus) == null) {
                return;
            }
        }
        final Object systemService = ((Activity)this).getSystemService("input_method");
        InputMethodManager inputMethodManager;
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager)systemService;
        }
        else {
            inputMethodManager = null;
        }
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 1);
    }
    
    @SuppressLint({ "SourceLockedOrientationActivity" })
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        if (this.getResources().getBoolean(2131034124)) {
            return;
        }
        try {
            ((Activity)this).setRequestedOrientation(1);
        }
        catch (Exception ex) {}
    }
    
    public final void onOfflineMessageClick(@org.jetbrains.annotations.e final Profile profile) {
        k0.p(profile, "profile");
        if (profile.hasAnyState(ProfileState.InvalidApiSharedSecret)) {
            ((Activity)this).startActivity(InvalidApiKeyActivity.H.a((Context)this, profile.getUniqueId()));
        }
    }
    
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        boolean onOptionsItemSelected;
        if (menuItem.getItemId() == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            onOptionsItemSelected = true;
        }
        else {
            onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        }
        return onOptionsItemSelected;
    }
    
    protected void onPause() {
        super.onPause();
        final UntisMobileApplication untisApplication = this.getUntisApplication();
        if (untisApplication != null) {
            untisApplication.l(false);
        }
        if (((Activity)this).isFinishing()) {
            for (final o o : this.subscriptions) {
                if (!o.g()) {
                    o.i();
                }
            }
            this.subscriptions.clear();
        }
    }
    
    protected void onResume() {
        super.onResume();
        final UntisMobileApplication untisApplication = this.getUntisApplication();
        if (untisApplication != null) {
            untisApplication.l(true);
        }
    }
    
    public final void setUpTopActionBar(@org.jetbrains.annotations.e final String s, @f final String s2) {
        k0.p(s, "title");
        final Window window = ((Activity)this).getWindow();
        if (window == null) {
            return;
        }
        window.setFlags(67108864, 67108864);
        if (Build$VERSION.SDK_INT >= 21) {
            window.clearFlags(Integer.MIN_VALUE);
        }
        final a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0((CharSequence)h.M(s, d.f((Context)this, 2131100016)));
            Object m;
            if (s2 == null) {
                m = null;
            }
            else {
                m = h.M(s2, d.f((Context)this, 2131100008));
            }
            supportActionBar.y0((CharSequence)m);
            supportActionBar.l0(d.i((Context)this, 2131231071));
        }
    }
    
    public final void showKeyBoard(@f View currentFocus) {
        View view = currentFocus;
        if (currentFocus == null) {
            currentFocus = ((Activity)this).getCurrentFocus();
            if ((view = currentFocus) == null) {
                return;
            }
        }
        final Object systemService = ((Activity)this).getSystemService("input_method");
        InputMethodManager inputMethodManager;
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager)systemService;
        }
        else {
            inputMethodManager = null;
        }
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }
}
