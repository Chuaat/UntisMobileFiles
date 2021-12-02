// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity;

import android.content.IntentSender;
import androidx.lifecycle.q0;
import androidx.annotation.g0;
import androidx.annotation.i;
import android.app.Application;
import androidx.lifecycle.s0;
import android.view.ViewGroup$LayoutParams;
import androidx.savedstate.d;
import androidx.lifecycle.g1;
import androidx.lifecycle.f1;
import androidx.annotation.o;
import android.annotation.SuppressLint;
import androidx.savedstate.SavedStateRegistry;
import androidx.lifecycle.x;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import android.os.Build$VERSION;
import android.os.Bundle;
import java.io.Serializable;
import android.content.Intent;
import android.content.IntentSender$SendIntentException;
import androidx.activity.result.f;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.text.TextUtils;
import androidx.lifecycle.c1;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.lifecycle.a0;
import androidx.lifecycle.z0;
import a.b;
import androidx.annotation.e0;
import androidx.activity.result.ActivityResultRegistry;
import androidx.savedstate.c;
import androidx.lifecycle.r;
import androidx.lifecycle.d1;
import androidx.lifecycle.y;
import a.a;
import androidx.core.app.j;

public class ComponentActivity extends j implements a, y, d1, r, c, androidx.activity.e, androidx.activity.result.e, androidx.activity.result.c
{
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    @e0
    private int mContentLayoutId;
    final b mContextAwareHelper;
    private z0.b mDefaultFactory;
    private final a0 mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final androidx.savedstate.b mSavedStateRegistryController;
    private c1 mViewModelStore;
    
    public ComponentActivity() {
        this.mContextAwareHelper = new b();
        this.mLifecycleRegistry = new a0(this);
        this.mSavedStateRegistryController = androidx.savedstate.b.a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() {
            @Override
            public void run() {
                try {
                    ComponentActivity.access$001(ComponentActivity.this);
                }
                catch (IllegalStateException ex) {
                    if (!TextUtils.equals((CharSequence)ex.getMessage(), (CharSequence)"Can not perform this action after onSaveInstanceState")) {
                        throw ex;
                    }
                }
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new ActivityResultRegistry() {
            @Override
            public <I, O> void f(final int n, @j0 final androidx.activity.result.contract.a<I, O> a, final I n2, @k0 final androidx.core.app.c c) {
                final ComponentActivity p4 = ComponentActivity.this;
                final a.a<O> b = a.b((Context)p4, n2);
                if (b != null) {
                    new Handler(Looper.getMainLooper()).post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            ActivityResultRegistry.this.c(n, b.a());
                        }
                    });
                    return;
                }
                final Intent a2 = a.a((Context)p4, n2);
                Bundle bundle = null;
                if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                    a2.setExtrasClassLoader(p4.getClassLoader());
                }
                if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundle = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                }
                else if (c != null) {
                    bundle = c.l();
                }
                if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                    String[] stringArrayExtra;
                    if ((stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS")) == null) {
                        stringArrayExtra = new String[0];
                    }
                    androidx.core.app.a.D(p4, stringArrayExtra, n);
                }
                else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                    final f f = (f)a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
                        androidx.core.app.a.L(p4, f.d(), n, f.a(), f.b(), f.c(), 0, bundle);
                    }
                    catch (IntentSender$SendIntentException ex) {
                        new Handler(Looper.getMainLooper()).post((Runnable)new Runnable() {
                            @Override
                            public void run() {
                                ActivityResultRegistry.this.b(n, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)ex));
                            }
                        });
                    }
                }
                else {
                    androidx.core.app.a.K(p4, a2, n, bundle);
                }
            }
        };
        if (this.getLifecycle() != null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 19) {
                this.getLifecycle().a(new v() {
                    @Override
                    public void h(@j0 final y y, @j0 final s.b b) {
                        if (b == s.b.ON_STOP) {
                            final Window window = ComponentActivity.this.getWindow();
                            View peekDecorView;
                            if (window != null) {
                                peekDecorView = window.peekDecorView();
                            }
                            else {
                                peekDecorView = null;
                            }
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            this.getLifecycle().a(new v() {
                @Override
                public void h(@j0 final y y, @j0 final s.b b) {
                    if (b == s.b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            this.getLifecycle().a(new v() {
                @Override
                public void h(@j0 final y y, @j0 final s.b b) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().c(this);
                }
            });
            if (19 <= sdk_INT && sdk_INT <= 23) {
                this.getLifecycle().a(new ImmLeaksCleaner(this));
            }
            this.getSavedStateRegistry().e("android:support:activity-result", (SavedStateRegistry.b)new SavedStateRegistry.b() {
                @SuppressLint({ "SyntheticAccessor" })
                @j0
                @Override
                public Bundle a() {
                    final Bundle bundle = new Bundle();
                    ComponentActivity.this.mActivityResultRegistry.h(bundle);
                    return bundle;
                }
            });
            this.addOnContextAvailableListener(new a.c() {
                @SuppressLint({ "SyntheticAccessor" })
                @Override
                public void a(@j0 final Context context) {
                    final Bundle a = ComponentActivity.this.getSavedStateRegistry().a("android:support:activity-result");
                    if (a != null) {
                        ComponentActivity.this.mActivityResultRegistry.g(a);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }
    
    @o
    public ComponentActivity(@e0 final int mContentLayoutId) {
        this();
        this.mContentLayoutId = mContentLayoutId;
    }
    
    static /* synthetic */ void access$001(final ComponentActivity componentActivity) {
        componentActivity.onBackPressed();
    }
    
    private void initViewTreeOwners() {
        f1.b(this.getWindow().getDecorView(), this);
        g1.b(this.getWindow().getDecorView(), this);
        androidx.savedstate.d.b(this.getWindow().getDecorView(), this);
    }
    
    public void addContentView(@SuppressLint({ "UnknownNullness", "MissingNullability" }) final View view, @SuppressLint({ "UnknownNullness", "MissingNullability" }) final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        super.addContentView(view, viewGroup$LayoutParams);
    }
    
    @Override
    public final void addOnContextAvailableListener(@j0 final a.c c) {
        this.mContextAwareHelper.a(c);
    }
    
    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            final e e = (e)this.getLastNonConfigurationInstance();
            if (e != null) {
                this.mViewModelStore = e.b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new c1();
            }
        }
    }
    
    @j0
    @Override
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }
    
    @j0
    @Override
    public z0.b getDefaultViewModelProviderFactory() {
        if (this.getApplication() != null) {
            if (this.mDefaultFactory == null) {
                final Application application = this.getApplication();
                Bundle extras;
                if (this.getIntent() != null) {
                    extras = this.getIntent().getExtras();
                }
                else {
                    extras = null;
                }
                this.mDefaultFactory = new s0(application, this, extras);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }
    
    @Deprecated
    @k0
    public Object getLastCustomNonConfigurationInstance() {
        final e e = (e)this.getLastNonConfigurationInstance();
        Object a;
        if (e != null) {
            a = e.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    @j0
    @Override
    public s getLifecycle() {
        return this.mLifecycleRegistry;
    }
    
    @j0
    @Override
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }
    
    @j0
    @Override
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }
    
    @j0
    @Override
    public c1 getViewModelStore() {
        if (this.getApplication() != null) {
            this.ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }
    
    @Deprecated
    @i
    protected void onActivityResult(final int n, final int n2, @k0 final Intent intent) {
        if (!this.mActivityResultRegistry.b(n, n2, intent)) {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    @g0
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.e();
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        this.mSavedStateRegistryController.c(bundle);
        this.mContextAwareHelper.c((Context)this);
        super.onCreate(bundle);
        q0.g(this);
        final int mContentLayoutId = this.mContentLayoutId;
        if (mContentLayoutId != 0) {
            this.setContentView(mContentLayoutId);
        }
    }
    
    @Deprecated
    @i
    public void onRequestPermissionsResult(final int n, @j0 final String[] array, @j0 final int[] array2) {
        if (!this.mActivityResultRegistry.b(n, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", array).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", array2)) && Build$VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(n, array, array2);
        }
    }
    
    @Deprecated
    @k0
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }
    
    @k0
    public final Object onRetainNonConfigurationInstance() {
        final Object onRetainCustomNonConfigurationInstance = this.onRetainCustomNonConfigurationInstance();
        c1 b;
        final c1 c1 = b = this.mViewModelStore;
        if (c1 == null) {
            final e e = (e)this.getLastNonConfigurationInstance();
            b = c1;
            if (e != null) {
                b = e.b;
            }
        }
        if (b == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        final e e2 = new e();
        e2.a = onRetainCustomNonConfigurationInstance;
        e2.b = b;
        return e2;
    }
    
    @i
    @Override
    protected void onSaveInstanceState(@j0 final Bundle bundle) {
        final s lifecycle = this.getLifecycle();
        if (lifecycle instanceof a0) {
            ((a0)lifecycle).q(s.c.I);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.d(bundle);
    }
    
    @k0
    @Override
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }
    
    @j0
    @Override
    public final <I, O> androidx.activity.result.d<I> registerForActivityResult(@j0 final androidx.activity.result.contract.a<I, O> a, @j0 final ActivityResultRegistry activityResultRegistry, @j0 final androidx.activity.result.b<O> b) {
        final StringBuilder sb = new StringBuilder();
        sb.append("activity_rq#");
        sb.append(this.mNextLocalRequestCode.getAndIncrement());
        return activityResultRegistry.j(sb.toString(), this, a, b);
    }
    
    @j0
    @Override
    public final <I, O> androidx.activity.result.d<I> registerForActivityResult(@j0 final androidx.activity.result.contract.a<I, O> a, @j0 final androidx.activity.result.b<O> b) {
        return this.registerForActivityResult(a, this.mActivityResultRegistry, b);
    }
    
    @Override
    public final void removeOnContextAvailableListener(@j0 final a.c c) {
        this.mContextAwareHelper.e(c);
    }
    
    public void reportFullyDrawn() {
        try {
            if (androidx.tracing.b.h()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("reportFullyDrawn() for ");
                sb.append(this.getComponentName());
                androidx.tracing.b.c(sb.toString());
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT > 19 || (sdk_INT == 19 && androidx.core.content.d.a((Context)this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        }
        finally {
            androidx.tracing.b.f();
        }
    }
    
    public void setContentView(@e0 final int contentView) {
        this.initViewTreeOwners();
        super.setContentView(contentView);
    }
    
    public void setContentView(@SuppressLint({ "UnknownNullness", "MissingNullability" }) final View contentView) {
        this.initViewTreeOwners();
        super.setContentView(contentView);
    }
    
    public void setContentView(@SuppressLint({ "UnknownNullness", "MissingNullability" }) final View view, @SuppressLint({ "UnknownNullness", "MissingNullability" }) final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        super.setContentView(view, viewGroup$LayoutParams);
    }
    
    @Deprecated
    public void startActivityForResult(@SuppressLint({ "UnknownNullness" }) final Intent intent, final int n) {
        super.startActivityForResult(intent, n);
    }
    
    @Deprecated
    public void startActivityForResult(@SuppressLint({ "UnknownNullness" }) final Intent intent, final int n, @k0 final Bundle bundle) {
        super.startActivityForResult(intent, n, bundle);
    }
    
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({ "UnknownNullness" }) final IntentSender intentSender, final int n, @k0 final Intent intent, final int n2, final int n3, final int n4) throws IntentSender$SendIntentException {
        super.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4);
    }
    
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({ "UnknownNullness" }) final IntentSender intentSender, final int n, @k0 final Intent intent, final int n2, final int n3, final int n4, @k0 final Bundle bundle) throws IntentSender$SendIntentException {
        super.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    static final class e
    {
        Object a;
        c1 b;
    }
}
