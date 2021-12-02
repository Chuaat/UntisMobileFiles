// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.view.LayoutInflater;
import androidx.lifecycle.c1;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import android.view.Window;
import androidx.activity.e;
import androidx.lifecycle.d1;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.app.Activity;
import androidx.core.app.b0;
import androidx.annotation.t0;
import android.annotation.SuppressLint;
import android.view.MenuItem;
import android.view.Menu;
import android.content.res.Configuration;
import androidx.annotation.g0;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.AttributeSet;
import androidx.annotation.k0;
import android.view.View;
import java.util.Iterator;
import android.content.Context;
import a.c;
import androidx.annotation.j0;
import android.os.Parcelable;
import androidx.lifecycle.s;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.annotation.o;
import androidx.annotation.e0;
import androidx.lifecycle.y;
import androidx.lifecycle.a0;
import androidx.core.app.a;
import androidx.activity.ComponentActivity;

public class d extends ComponentActivity implements androidx.core.app.a.d, f
{
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final a0 mFragmentLifecycleRegistry;
    final androidx.fragment.app.g mFragments;
    boolean mResumed;
    boolean mStopped;
    
    public d() {
        this.mFragments = androidx.fragment.app.g.b(new c());
        this.mFragmentLifecycleRegistry = new a0(this);
        this.mStopped = true;
        this.init();
    }
    
    @o
    public d(@e0 final int n) {
        super(n);
        this.mFragments = androidx.fragment.app.g.b(new c());
        this.mFragmentLifecycleRegistry = new a0(this);
        this.mStopped = true;
        this.init();
    }
    
    private void init() {
        this.getSavedStateRegistry().e("android:support:fragments", (SavedStateRegistry.b)new SavedStateRegistry.b() {
            @j0
            @Override
            public Bundle a() {
                final Bundle bundle = new Bundle();
                d.this.markFragmentsCreated();
                d.this.mFragmentLifecycleRegistry.j(s.b.ON_STOP);
                final Parcelable p = d.this.mFragments.P();
                if (p != null) {
                    bundle.putParcelable("android:support:fragments", p);
                }
                return bundle;
            }
        });
        this.addOnContextAvailableListener(new a.c() {
            @Override
            public void a(@j0 final Context context) {
                d.this.mFragments.a(null);
                final Bundle a = d.this.getSavedStateRegistry().a("android:support:fragments");
                if (a != null) {
                    d.this.mFragments.L(a.getParcelable("android:support:fragments"));
                }
            }
        });
    }
    
    private static boolean markState(final FragmentManager fragmentManager, final s.c c) {
        final Iterator<Fragment> iterator = fragmentManager.G0().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Fragment fragment = iterator.next();
            if (fragment == null) {
                continue;
            }
            boolean b = n != 0;
            if (fragment.getHost() != null) {
                b = ((n | (markState(fragment.getChildFragmentManager(), c) ? 1 : 0)) != 0x0);
            }
            final f0 mViewLifecycleOwner = fragment.mViewLifecycleOwner;
            n = (b ? 1 : 0);
            if (mViewLifecycleOwner != null) {
                n = (b ? 1 : 0);
                if (mViewLifecycleOwner.getLifecycle().b().b(s.c.J)) {
                    fragment.mViewLifecycleOwner.f(c);
                    n = (true ? 1 : 0);
                }
            }
            if (!fragment.mLifecycleRegistry.b().b(s.c.J)) {
                continue;
            }
            fragment.mLifecycleRegistry.q(c);
            n = (true ? 1 : 0);
        }
        return n != 0;
    }
    
    @k0
    final View dispatchFragmentsOnCreateView(@k0 final View view, @j0 final String s, @j0 final Context context, @j0 final AttributeSet set) {
        return this.mFragments.G(view, s, context, set);
    }
    
    public void dump(@j0 final String s, @k0 final FileDescriptor fileDescriptor, @j0 final PrintWriter printWriter, @k0 final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        printWriter.print(s);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("  ");
        final String string = sb.toString();
        printWriter.print(string);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (this.getApplication() != null) {
            androidx.loader.app.a.d(this).b(string, fileDescriptor, printWriter, array);
        }
        this.mFragments.D().b0(s, fileDescriptor, printWriter, array);
    }
    
    @j0
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.D();
    }
    
    @Deprecated
    @j0
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.d(this);
    }
    
    void markFragmentsCreated() {
        while (markState(this.getSupportFragmentManager(), s.c.I)) {}
    }
    
    @androidx.annotation.i
    @Override
    protected void onActivityResult(final int n, final int n2, @k0 final Intent intent) {
        this.mFragments.F();
        super.onActivityResult(n, n2, intent);
    }
    
    @Deprecated
    @g0
    public void onAttachFragment(@j0 final Fragment fragment) {
    }
    
    public void onConfigurationChanged(@j0 final Configuration configuration) {
        this.mFragments.F();
        super.onConfigurationChanged(configuration);
        this.mFragments.d(configuration);
    }
    
    @Override
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.j(s.b.ON_CREATE);
        this.mFragments.f();
    }
    
    public boolean onCreatePanelMenu(final int n, @j0 final Menu menu) {
        if (n == 0) {
            return super.onCreatePanelMenu(n, menu) | this.mFragments.g(menu, this.getMenuInflater());
        }
        return super.onCreatePanelMenu(n, menu);
    }
    
    @k0
    public View onCreateView(@k0 final View view, @j0 final String s, @j0 final Context context, @j0 final AttributeSet set) {
        final View dispatchFragmentsOnCreateView = this.dispatchFragmentsOnCreateView(view, s, context, set);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, s, context, set);
        }
        return dispatchFragmentsOnCreateView;
    }
    
    @k0
    public View onCreateView(@j0 final String s, @j0 final Context context, @j0 final AttributeSet set) {
        final View dispatchFragmentsOnCreateView = this.dispatchFragmentsOnCreateView(null, s, context, set);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(s, context, set);
        }
        return dispatchFragmentsOnCreateView;
    }
    
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.j(s.b.ON_DESTROY);
    }
    
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.j();
    }
    
    public boolean onMenuItemSelected(final int n, @j0 final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        if (n != 0) {
            return n == 6 && this.mFragments.e(menuItem);
        }
        return this.mFragments.l(menuItem);
    }
    
    @androidx.annotation.i
    public void onMultiWindowModeChanged(final boolean b) {
        this.mFragments.k(b);
    }
    
    @androidx.annotation.i
    protected void onNewIntent(@SuppressLint({ "UnknownNullness" }) final Intent intent) {
        this.mFragments.F();
        super.onNewIntent(intent);
    }
    
    public void onPanelClosed(final int n, @j0 final Menu menu) {
        if (n == 0) {
            this.mFragments.m(menu);
        }
        super.onPanelClosed(n, menu);
    }
    
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.n();
        this.mFragmentLifecycleRegistry.j(s.b.ON_PAUSE);
    }
    
    @androidx.annotation.i
    public void onPictureInPictureModeChanged(final boolean b) {
        this.mFragments.o(b);
    }
    
    protected void onPostResume() {
        super.onPostResume();
        this.onResumeFragments();
    }
    
    @Deprecated
    @t0({ t0.a.I })
    protected boolean onPrepareOptionsPanel(@k0 final View view, @j0 final Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }
    
    public boolean onPreparePanel(final int n, @k0 final View view, @j0 final Menu menu) {
        if (n == 0) {
            return this.onPrepareOptionsPanel(view, menu) | this.mFragments.p(menu);
        }
        return super.onPreparePanel(n, view, menu);
    }
    
    @androidx.annotation.i
    @Override
    public void onRequestPermissionsResult(final int n, @j0 final String[] array, @j0 final int[] array2) {
        this.mFragments.F();
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    protected void onResume() {
        this.mFragments.F();
        super.onResume();
        this.mResumed = true;
        this.mFragments.z();
    }
    
    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.j(s.b.ON_RESUME);
        this.mFragments.r();
    }
    
    protected void onStart() {
        this.mFragments.F();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.z();
        this.mFragmentLifecycleRegistry.j(s.b.ON_START);
        this.mFragments.s();
    }
    
    public void onStateNotSaved() {
        this.mFragments.F();
    }
    
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        this.markFragmentsCreated();
        this.mFragments.t();
        this.mFragmentLifecycleRegistry.j(s.b.ON_STOP);
    }
    
    public void setEnterSharedElementCallback(@k0 final b0 b0) {
        a.F(this, b0);
    }
    
    public void setExitSharedElementCallback(@k0 final b0 b0) {
        a.G(this, b0);
    }
    
    public void startActivityFromFragment(@j0 final Fragment fragment, @SuppressLint({ "UnknownNullness" }) final Intent intent, final int n) {
        this.startActivityFromFragment(fragment, intent, n, null);
    }
    
    public void startActivityFromFragment(@j0 final Fragment fragment, @SuppressLint({ "UnknownNullness" }) final Intent intent, final int n, @k0 final Bundle bundle) {
        if (n == -1) {
            a.K(this, intent, -1, bundle);
            return;
        }
        fragment.startActivityForResult(intent, n, bundle);
    }
    
    @Deprecated
    public void startIntentSenderFromFragment(@j0 final Fragment fragment, @SuppressLint({ "UnknownNullness" }) final IntentSender intentSender, final int n, @k0 final Intent intent, final int n2, final int n3, final int n4, @k0 final Bundle bundle) throws IntentSender$SendIntentException {
        if (n == -1) {
            a.L(this, intentSender, n, intent, n2, n3, n4, bundle);
            return;
        }
        fragment.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public void supportFinishAfterTransition() {
        a.w(this);
    }
    
    @Deprecated
    public void supportInvalidateOptionsMenu() {
        this.invalidateOptionsMenu();
    }
    
    public void supportPostponeEnterTransition() {
        a.A(this);
    }
    
    public void supportStartPostponedEnterTransition() {
        a.M(this);
    }
    
    @Deprecated
    @Override
    public final void validateRequestPermissionsRequestCode(final int n) {
    }
    
    class c extends i<d> implements d1, e, androidx.activity.result.e, q
    {
        public c() {
            super(d.this);
        }
        
        @Override
        public void a(@j0 final FragmentManager fragmentManager, @j0 final Fragment fragment) {
            d.this.onAttachFragment(fragment);
        }
        
        @k0
        @Override
        public View c(final int n) {
            return d.this.findViewById(n);
        }
        
        @Override
        public boolean d() {
            final Window window = d.this.getWindow();
            return window != null && window.peekDecorView() != null;
        }
        
        @j0
        @Override
        public ActivityResultRegistry getActivityResultRegistry() {
            return d.this.getActivityResultRegistry();
        }
        
        @j0
        @Override
        public s getLifecycle() {
            return d.this.mFragmentLifecycleRegistry;
        }
        
        @j0
        @Override
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return d.this.getOnBackPressedDispatcher();
        }
        
        @j0
        @Override
        public c1 getViewModelStore() {
            return d.this.getViewModelStore();
        }
        
        @Override
        public void h(@j0 final String s, @k0 final FileDescriptor fileDescriptor, @j0 final PrintWriter printWriter, @k0 final String[] array) {
            d.this.dump(s, fileDescriptor, printWriter, array);
        }
        
        @j0
        @Override
        public LayoutInflater j() {
            return d.this.getLayoutInflater().cloneInContext((Context)d.this);
        }
        
        @Override
        public int k() {
            final Window window = d.this.getWindow();
            int windowAnimations;
            if (window == null) {
                windowAnimations = 0;
            }
            else {
                windowAnimations = window.getAttributes().windowAnimations;
            }
            return windowAnimations;
        }
        
        @Override
        public boolean l() {
            return d.this.getWindow() != null;
        }
        
        @Override
        public boolean n(@j0 final Fragment fragment) {
            return d.this.isFinishing() ^ true;
        }
        
        @Override
        public boolean o(@j0 final String s) {
            return a.J(d.this, s);
        }
        
        @Override
        public void s() {
            d.this.supportInvalidateOptionsMenu();
        }
        
        public d t() {
            return d.this;
        }
    }
}
