// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import androidx.activity.result.e;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import androidx.lifecycle.g1;
import androidx.lifecycle.f1;
import androidx.lifecycle.x;
import androidx.lifecycle.v;
import android.os.Build$VERSION;
import java.util.Iterator;
import androidx.annotation.a1;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.view.animation.Animation;
import android.view.MenuItem;
import android.content.res.Configuration;
import android.app.Activity;
import android.content.Intent;
import android.annotation.SuppressLint;
import androidx.lifecycle.c1;
import androidx.lifecycle.LiveData;
import androidx.annotation.g0;
import androidx.annotation.w0;
import androidx.savedstate.SavedStateRegistry;
import android.content.res.Resources;
import androidx.annotation.t0;
import androidx.core.app.b0;
import androidx.lifecycle.s0;
import android.app.Application;
import android.content.ContextWrapper;
import android.animation.Animator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import androidx.activity.result.d;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.a;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import androidx.annotation.o;
import java.util.UUID;
import android.view.View;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.k0;
import androidx.savedstate.b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.lifecycle.s;
import androidx.lifecycle.a0;
import android.view.LayoutInflater;
import androidx.lifecycle.z0;
import androidx.annotation.e0;
import android.view.ViewGroup;
import androidx.annotation.j0;
import android.os.Bundle;
import androidx.savedstate.c;
import androidx.lifecycle.r;
import androidx.lifecycle.d1;
import androidx.lifecycle.y;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

public class Fragment implements ComponentCallbacks, View$OnCreateContextMenuListener, y, d1, r, c, androidx.activity.result.c
{
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    i mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    @j0
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    @e0
    private int mContentLayoutId;
    z0.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    androidx.fragment.app.i<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    a0 mLifecycleRegistry;
    s.c mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<k> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    b mSavedStateRegistryController;
    @k0
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    @k0
    f0 mViewLifecycleOwner;
    androidx.lifecycle.k0<y> mViewLifecycleOwnerLiveData;
    @j0
    String mWho;
    
    static {
        USE_DEFAULT_TRANSITION = new Object();
    }
    
    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new androidx.fragment.app.l();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() {
            @Override
            public void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = s.c.K;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.k0<y>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<k>();
        this.initLifecycle();
    }
    
    @o
    public Fragment(@e0 final int mContentLayoutId) {
        this();
        this.mContentLayoutId = mContentLayoutId;
    }
    
    private i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new i();
        }
        return this.mAnimationInfo;
    }
    
    private int getMinimumMaxLifecycleState() {
        final s.c mMaxState = this.mMaxState;
        if (mMaxState != s.c.H && this.mParentFragment != null) {
            return Math.min(mMaxState.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return mMaxState.ordinal();
    }
    
    private void initLifecycle() {
        this.mLifecycleRegistry = new a0(this);
        this.mSavedStateRegistryController = b.a(this);
        this.mDefaultFactory = null;
    }
    
    @Deprecated
    @j0
    public static Fragment instantiate(@j0 final Context context, @j0 final String s) {
        return instantiate(context, s, null);
    }
    
    @Deprecated
    @j0
    public static Fragment instantiate(@j0 final Context context, @j0 final String s, @k0 final Bundle arguments) {
        try {
            final Fragment fragment = (Fragment)h.d(context.getClassLoader(), s).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            if (arguments != null) {
                arguments.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(arguments);
            }
            return fragment;
        }
        catch (InvocationTargetException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to instantiate fragment ");
            sb.append(s);
            sb.append(": calling Fragment constructor caused an exception");
            throw new j(sb.toString(), ex);
        }
        catch (NoSuchMethodException ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to instantiate fragment ");
            sb2.append(s);
            sb2.append(": could not find Fragment constructor");
            throw new j(sb2.toString(), ex2);
        }
        catch (IllegalAccessException ex3) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to instantiate fragment ");
            sb3.append(s);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new j(sb3.toString(), ex3);
        }
        catch (InstantiationException ex4) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Unable to instantiate fragment ");
            sb4.append(s);
            sb4.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new j(sb4.toString(), ex4);
        }
    }
    
    @j0
    private <I, O> d<I> prepareCallInternal(@j0 final a<I, O> a, @j0 final g.a<Void, ActivityResultRegistry> a2, @j0 final androidx.activity.result.b<O> b) {
        if (this.mState <= 1) {
            final AtomicReference atomicReference = new AtomicReference();
            this.registerOnPreAttachListener((k)new k() {
                @Override
                void a() {
                    atomicReference.set(a2.apply(null).j(Fragment.this.generateActivityResultKey(), Fragment.this, (a<Object, Object>)a, b));
                }
            });
            return new d<I>() {
                @j0
                @Override
                public a<I, ?> a() {
                    return a;
                }
                
                @Override
                public void c(final I n, @k0 final androidx.core.app.c c) {
                    final d<I> d = atomicReference.get();
                    if (d != null) {
                        d.c(n, c);
                        return;
                    }
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
                
                @Override
                public void d() {
                    final d d = atomicReference.getAndSet(null);
                    if (d != null) {
                        d.d();
                    }
                }
            };
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(sb.toString());
    }
    
    private void registerOnPreAttachListener(@j0 final k e) {
        if (this.mState >= 0) {
            e.a();
        }
        else {
            this.mOnPreAttachedListeners.add(e);
        }
    }
    
    private void restoreViewState() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        if (this.mView != null) {
            this.restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }
    
    void callStartTransitionListener(final boolean b) {
        final i mAnimationInfo = this.mAnimationInfo;
        Object x = null;
        if (mAnimationInfo != null) {
            mAnimationInfo.w = false;
            x = mAnimationInfo.x;
            mAnimationInfo.x = null;
        }
        if (x != null) {
            ((l)x).b();
        }
        else if (FragmentManager.Q && this.mView != null) {
            final ViewGroup mContainer = this.mContainer;
            if (mContainer != null) {
                final FragmentManager mFragmentManager = this.mFragmentManager;
                if (mFragmentManager != null) {
                    final i0 n = i0.n(mContainer, mFragmentManager);
                    n.p();
                    if (b) {
                        this.mHost.g().post((Runnable)new Runnable() {
                            @Override
                            public void run() {
                                n.g();
                            }
                        });
                    }
                    else {
                        n.g();
                    }
                }
            }
        }
    }
    
    @j0
    f createFragmentContainer() {
        return new f() {
            @k0
            @Override
            public View c(final int n) {
                final View mView = Fragment.this.mView;
                if (mView != null) {
                    return mView.findViewById(n);
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(Fragment.this);
                sb.append(" does not have a view");
                throw new IllegalStateException(sb.toString());
            }
            
            @Override
            public boolean d() {
                return Fragment.this.mView != null;
            }
        };
    }
    
    public void dump(@j0 final String str, @k0 final FileDescriptor fileDescriptor, @j0 final PrintWriter printWriter, @k0 final String[] array) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        final Fragment targetFragment = this.getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(this.getPopDirection());
        if (this.getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(this.getEnterAnim());
        }
        if (this.getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(this.getExitAnim());
        }
        if (this.getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(this.getPopEnterAnim());
        }
        if (this.getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(this.getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.getAnimatingAway());
        }
        if (this.getContext() != null) {
            androidx.loader.app.a.d(this).b(str, fileDescriptor, printWriter, array);
        }
        printWriter.print(str);
        final StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.mChildFragmentManager);
        sb.append(":");
        printWriter.println(sb.toString());
        final FragmentManager mChildFragmentManager = this.mChildFragmentManager;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        mChildFragmentManager.b0(sb2.toString(), fileDescriptor, printWriter, array);
    }
    
    @Override
    public final boolean equals(@k0 final Object obj) {
        return super.equals(obj);
    }
    
    @k0
    Fragment findFragmentByWho(@j0 final String s) {
        if (s.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.r0(s);
    }
    
    @j0
    String generateActivityResultKey() {
        final StringBuilder sb = new StringBuilder();
        sb.append("fragment_");
        sb.append(this.mWho);
        sb.append("_rq#");
        sb.append(this.mNextLocalRequestCode.getAndIncrement());
        return sb.toString();
    }
    
    @k0
    public final androidx.fragment.app.d getActivity() {
        final androidx.fragment.app.i<?> mHost = this.mHost;
        androidx.fragment.app.d d;
        if (mHost == null) {
            d = null;
        }
        else {
            d = (androidx.fragment.app.d)mHost.e();
        }
        return d;
    }
    
    public boolean getAllowEnterTransitionOverlap() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo != null) {
            final Boolean r = mAnimationInfo.r;
            if (r != null) {
                return r;
            }
        }
        return true;
    }
    
    public boolean getAllowReturnTransitionOverlap() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo != null) {
            final Boolean q = mAnimationInfo.q;
            if (q != null) {
                return q;
            }
        }
        return true;
    }
    
    View getAnimatingAway() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.a;
    }
    
    Animator getAnimator() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.b;
    }
    
    @k0
    public final Bundle getArguments() {
        return this.mArguments;
    }
    
    @j0
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }
    
    @k0
    public Context getContext() {
        final androidx.fragment.app.i<?> mHost = this.mHost;
        Context f;
        if (mHost == null) {
            f = null;
        }
        else {
            f = mHost.f();
        }
        return f;
    }
    
    @j0
    public z0.b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                final Application application = null;
                Context context = this.requireContext().getApplicationContext();
                Application application2;
                while (true) {
                    application2 = application;
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof Application) {
                        application2 = (Application)context;
                        break;
                    }
                    context = ((ContextWrapper)context).getBaseContext();
                }
                if (application2 == null && FragmentManager.T0(3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Could not find Application instance from Context ");
                    sb.append(this.requireContext().getApplicationContext());
                    sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                    Log.d("FragmentManager", sb.toString());
                }
                this.mDefaultFactory = new s0(application2, this, this.getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }
    
    int getEnterAnim() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return 0;
        }
        return mAnimationInfo.d;
    }
    
    @k0
    public Object getEnterTransition() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.k;
    }
    
    b0 getEnterTransitionCallback() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.s;
    }
    
    int getExitAnim() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return 0;
        }
        return mAnimationInfo.e;
    }
    
    @k0
    public Object getExitTransition() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.m;
    }
    
    b0 getExitTransitionCallback() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.t;
    }
    
    View getFocusedView() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.v;
    }
    
    @Deprecated
    @k0
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }
    
    @k0
    public final Object getHost() {
        final androidx.fragment.app.i<?> mHost = this.mHost;
        Object i;
        if (mHost == null) {
            i = null;
        }
        else {
            i = mHost.i();
        }
        return i;
    }
    
    public final int getId() {
        return this.mFragmentId;
    }
    
    @j0
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater;
        if ((layoutInflater = this.mLayoutInflater) == null) {
            layoutInflater = this.performGetLayoutInflater(null);
        }
        return layoutInflater;
    }
    
    @Deprecated
    @j0
    @t0({ t0.a.I })
    public LayoutInflater getLayoutInflater(@k0 final Bundle bundle) {
        final androidx.fragment.app.i<?> mHost = this.mHost;
        if (mHost != null) {
            final LayoutInflater j = mHost.j();
            androidx.core.view.l.d(j, this.mChildFragmentManager.I0());
            return j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }
    
    @j0
    public s getLifecycle() {
        return this.mLifecycleRegistry;
    }
    
    @Deprecated
    @j0
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.d(this);
    }
    
    int getNextTransition() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return 0;
        }
        return mAnimationInfo.h;
    }
    
    @k0
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }
    
    @j0
    public final FragmentManager getParentFragmentManager() {
        final FragmentManager mFragmentManager = this.mFragmentManager;
        if (mFragmentManager != null) {
            return mFragmentManager;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }
    
    boolean getPopDirection() {
        final i mAnimationInfo = this.mAnimationInfo;
        return mAnimationInfo != null && mAnimationInfo.c;
    }
    
    int getPopEnterAnim() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return 0;
        }
        return mAnimationInfo.f;
    }
    
    int getPopExitAnim() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return 0;
        }
        return mAnimationInfo.g;
    }
    
    float getPostOnViewCreatedAlpha() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return 1.0f;
        }
        return mAnimationInfo.u;
    }
    
    @k0
    public Object getReenterTransition() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        Object o;
        if ((o = mAnimationInfo.n) == Fragment.USE_DEFAULT_TRANSITION) {
            o = this.getExitTransition();
        }
        return o;
    }
    
    @j0
    public final Resources getResources() {
        return this.requireContext().getResources();
    }
    
    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }
    
    @k0
    public Object getReturnTransition() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        Object o;
        if ((o = mAnimationInfo.l) == Fragment.USE_DEFAULT_TRANSITION) {
            o = this.getEnterTransition();
        }
        return o;
    }
    
    @j0
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }
    
    @k0
    public Object getSharedElementEnterTransition() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.o;
    }
    
    @k0
    public Object getSharedElementReturnTransition() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        Object o;
        if ((o = mAnimationInfo.p) == Fragment.USE_DEFAULT_TRANSITION) {
            o = this.getSharedElementEnterTransition();
        }
        return o;
    }
    
    @j0
    ArrayList<String> getSharedElementSourceNames() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo != null) {
            final ArrayList<String> i = mAnimationInfo.i;
            if (i != null) {
                return i;
            }
        }
        return new ArrayList<String>();
    }
    
    @j0
    ArrayList<String> getSharedElementTargetNames() {
        final i mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo != null) {
            final ArrayList<String> j = mAnimationInfo.j;
            if (j != null) {
                return j;
            }
        }
        return new ArrayList<String>();
    }
    
    @j0
    public final String getString(@w0 final int n) {
        return this.getResources().getString(n);
    }
    
    @j0
    public final String getString(@w0 final int n, @k0 final Object... array) {
        return this.getResources().getString(n, array);
    }
    
    @k0
    public final String getTag() {
        return this.mTag;
    }
    
    @Deprecated
    @k0
    public final Fragment getTargetFragment() {
        final Fragment mTarget = this.mTarget;
        if (mTarget != null) {
            return mTarget;
        }
        final FragmentManager mFragmentManager = this.mFragmentManager;
        if (mFragmentManager != null) {
            final String mTargetWho = this.mTargetWho;
            if (mTargetWho != null) {
                return mFragmentManager.n0(mTargetWho);
            }
        }
        return null;
    }
    
    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }
    
    @j0
    public final CharSequence getText(@w0 final int n) {
        return this.getResources().getText(n);
    }
    
    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }
    
    @k0
    public View getView() {
        return this.mView;
    }
    
    @g0
    @j0
    public y getViewLifecycleOwner() {
        final f0 mViewLifecycleOwner = this.mViewLifecycleOwner;
        if (mViewLifecycleOwner != null) {
            return mViewLifecycleOwner;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }
    
    @j0
    public LiveData<y> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }
    
    @j0
    public c1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.getMinimumMaxLifecycleState() != s.c.H.ordinal()) {
            return this.mFragmentManager.O0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }
    
    @SuppressLint({ "KotlinPropertyAccess" })
    @t0({ t0.a.I })
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    void initState() {
        this.initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new androidx.fragment.app.l();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }
    
    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }
    
    public final boolean isDetached() {
        return this.mDetached;
    }
    
    public final boolean isHidden() {
        return this.mHidden;
    }
    
    boolean isHideReplaced() {
        final i mAnimationInfo = this.mAnimationInfo;
        return mAnimationInfo != null && mAnimationInfo.y;
    }
    
    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }
    
    public final boolean isInLayout() {
        return this.mInLayout;
    }
    
    @t0({ t0.a.I })
    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            final FragmentManager mFragmentManager = this.mFragmentManager;
            if (mFragmentManager == null || mFragmentManager.V0(this.mParentFragment)) {
                return true;
            }
        }
        return false;
    }
    
    boolean isPostponed() {
        final i mAnimationInfo = this.mAnimationInfo;
        return mAnimationInfo != null && mAnimationInfo.w;
    }
    
    public final boolean isRemoving() {
        return this.mRemoving;
    }
    
    final boolean isRemovingParent() {
        final Fragment parentFragment = this.getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }
    
    public final boolean isResumed() {
        return this.mState >= 7;
    }
    
    public final boolean isStateSaved() {
        final FragmentManager mFragmentManager = this.mFragmentManager;
        return mFragmentManager != null && mFragmentManager.Y0();
    }
    
    public final boolean isVisible() {
        if (this.isAdded() && !this.isHidden()) {
            final View mView = this.mView;
            if (mView != null && mView.getWindowToken() != null && this.mView.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }
    
    void noteStateNotSaved() {
        this.mChildFragmentManager.h1();
    }
    
    @Deprecated
    @g0
    @androidx.annotation.i
    public void onActivityCreated(@k0 final Bundle bundle) {
        this.mCalled = true;
    }
    
    @Deprecated
    public void onActivityResult(final int i, final int j, @k0 final Intent obj) {
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(j);
            sb.append(" data: ");
            sb.append(obj);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    @Deprecated
    @g0
    @androidx.annotation.i
    public void onAttach(@j0 final Activity activity) {
        this.mCalled = true;
    }
    
    @g0
    @androidx.annotation.i
    public void onAttach(@j0 final Context context) {
        this.mCalled = true;
        final androidx.fragment.app.i<?> mHost = this.mHost;
        Activity e;
        if (mHost == null) {
            e = null;
        }
        else {
            e = mHost.e();
        }
        if (e != null) {
            this.mCalled = false;
            this.onAttach(e);
        }
    }
    
    @Deprecated
    @g0
    public void onAttachFragment(@j0 final Fragment fragment) {
    }
    
    @androidx.annotation.i
    public void onConfigurationChanged(@j0 final Configuration configuration) {
        this.mCalled = true;
    }
    
    @g0
    public boolean onContextItemSelected(@j0 final MenuItem menuItem) {
        return false;
    }
    
    @g0
    @androidx.annotation.i
    public void onCreate(@k0 final Bundle bundle) {
        this.mCalled = true;
        this.restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.X0(1)) {
            this.mChildFragmentManager.H();
        }
    }
    
    @g0
    @k0
    public Animation onCreateAnimation(final int n, final boolean b, final int n2) {
        return null;
    }
    
    @g0
    @k0
    public Animator onCreateAnimator(final int n, final boolean b, final int n2) {
        return null;
    }
    
    @g0
    public void onCreateContextMenu(@j0 final ContextMenu contextMenu, @j0 final View view, @k0 final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        this.requireActivity().onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    @g0
    public void onCreateOptionsMenu(@j0 final Menu menu, @j0 final MenuInflater menuInflater) {
    }
    
    @g0
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final int mContentLayoutId = this.mContentLayoutId;
        if (mContentLayoutId != 0) {
            return layoutInflater.inflate(mContentLayoutId, viewGroup, false);
        }
        return null;
    }
    
    @g0
    @androidx.annotation.i
    public void onDestroy() {
        this.mCalled = true;
    }
    
    @g0
    public void onDestroyOptionsMenu() {
    }
    
    @g0
    @androidx.annotation.i
    public void onDestroyView() {
        this.mCalled = true;
    }
    
    @g0
    @androidx.annotation.i
    public void onDetach() {
        this.mCalled = true;
    }
    
    @j0
    public LayoutInflater onGetLayoutInflater(@k0 final Bundle bundle) {
        return this.getLayoutInflater(bundle);
    }
    
    @g0
    public void onHiddenChanged(final boolean b) {
    }
    
    @Deprecated
    @a1
    @androidx.annotation.i
    public void onInflate(@j0 final Activity activity, @j0 final AttributeSet set, @k0 final Bundle bundle) {
        this.mCalled = true;
    }
    
    @a1
    @androidx.annotation.i
    public void onInflate(@j0 final Context context, @j0 final AttributeSet set, @k0 final Bundle bundle) {
        this.mCalled = true;
        final androidx.fragment.app.i<?> mHost = this.mHost;
        Activity e;
        if (mHost == null) {
            e = null;
        }
        else {
            e = mHost.e();
        }
        if (e != null) {
            this.mCalled = false;
            this.onInflate(e, set, bundle);
        }
    }
    
    @g0
    @androidx.annotation.i
    public void onLowMemory() {
        this.mCalled = true;
    }
    
    public void onMultiWindowModeChanged(final boolean b) {
    }
    
    @g0
    public boolean onOptionsItemSelected(@j0 final MenuItem menuItem) {
        return false;
    }
    
    @g0
    public void onOptionsMenuClosed(@j0 final Menu menu) {
    }
    
    @g0
    @androidx.annotation.i
    public void onPause() {
        this.mCalled = true;
    }
    
    public void onPictureInPictureModeChanged(final boolean b) {
    }
    
    @g0
    public void onPrepareOptionsMenu(@j0 final Menu menu) {
    }
    
    @g0
    public void onPrimaryNavigationFragmentChanged(final boolean b) {
    }
    
    @Deprecated
    public void onRequestPermissionsResult(final int n, @j0 final String[] array, @j0 final int[] array2) {
    }
    
    @g0
    @androidx.annotation.i
    public void onResume() {
        this.mCalled = true;
    }
    
    @g0
    public void onSaveInstanceState(@j0 final Bundle bundle) {
    }
    
    @g0
    @androidx.annotation.i
    public void onStart() {
        this.mCalled = true;
    }
    
    @g0
    @androidx.annotation.i
    public void onStop() {
        this.mCalled = true;
    }
    
    @g0
    public void onViewCreated(@j0 final View view, @k0 final Bundle bundle) {
    }
    
    @g0
    @androidx.annotation.i
    public void onViewStateRestored(@k0 final Bundle bundle) {
        this.mCalled = true;
    }
    
    void performActivityCreated(final Bundle bundle) {
        this.mChildFragmentManager.h1();
        this.mState = 3;
        this.mCalled = false;
        this.onActivityCreated(bundle);
        if (this.mCalled) {
            this.restoreViewState();
            this.mChildFragmentManager.D();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    void performAttach() {
        final Iterator<k> iterator = this.mOnPreAttachedListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.p(this.mHost, this.createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        this.onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.N(this);
            this.mChildFragmentManager.E();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onAttach()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    void performConfigurationChanged(@j0 final Configuration configuration) {
        this.onConfigurationChanged(configuration);
        this.mChildFragmentManager.F(configuration);
    }
    
    boolean performContextItemSelected(@j0 final MenuItem menuItem) {
        return !this.mHidden && (this.onContextItemSelected(menuItem) || this.mChildFragmentManager.G(menuItem));
    }
    
    void performCreate(final Bundle bundle) {
        this.mChildFragmentManager.h1();
        this.mState = 1;
        this.mCalled = false;
        if (Build$VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.a(new v() {
                @Override
                public void h(@j0 final y y, @j0 final s.b b) {
                    if (b == s.b.ON_STOP) {
                        final View mView = Fragment.this.mView;
                        if (mView != null) {
                            mView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        this.mSavedStateRegistryController.c(bundle);
        this.onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.j(s.b.ON_CREATE);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    boolean performCreateOptionsMenu(@j0 final Menu menu, @j0 final MenuInflater menuInflater) {
        final boolean mHidden = this.mHidden;
        boolean b = false;
        final boolean b2 = false;
        if (!mHidden) {
            boolean b3 = b2;
            if (this.mHasMenu) {
                b3 = b2;
                if (this.mMenuVisible) {
                    b3 = true;
                    this.onCreateOptionsMenu(menu, menuInflater);
                }
            }
            b = (b3 | this.mChildFragmentManager.I(menu, menuInflater));
        }
        return b;
    }
    
    void performCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        this.mChildFragmentManager.h1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new f0(this, this.getViewModelStore());
        final View onCreateView = this.onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            f1.b(this.mView, this.mViewLifecycleOwner);
            g1.b(this.mView, this.mViewLifecycleOwner);
            androidx.savedstate.d.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.q(this.mViewLifecycleOwner);
        }
        else {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        }
    }
    
    void performDestroy() {
        this.mChildFragmentManager.J();
        this.mLifecycleRegistry.j(s.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        this.onDestroy();
        if (this.mCalled) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    void performDestroyView() {
        this.mChildFragmentManager.K();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().b(s.c.I)) {
            this.mViewLifecycleOwner.a(s.b.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        this.onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.d(this).h();
            this.mPerformedCreateView = false;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        this.onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (!this.mChildFragmentManager.S0()) {
                this.mChildFragmentManager.J();
                this.mChildFragmentManager = new androidx.fragment.app.l();
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDetach()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    @j0
    LayoutInflater performGetLayoutInflater(@k0 final Bundle bundle) {
        return this.mLayoutInflater = this.onGetLayoutInflater(bundle);
    }
    
    void performLowMemory() {
        this.onLowMemory();
        this.mChildFragmentManager.L();
    }
    
    void performMultiWindowModeChanged(final boolean b) {
        this.onMultiWindowModeChanged(b);
        this.mChildFragmentManager.M(b);
    }
    
    boolean performOptionsItemSelected(@j0 final MenuItem menuItem) {
        return !this.mHidden && ((this.mHasMenu && this.mMenuVisible && this.onOptionsItemSelected(menuItem)) || this.mChildFragmentManager.O(menuItem));
    }
    
    void performOptionsMenuClosed(@j0 final Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                this.onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.P(menu);
        }
    }
    
    void performPause() {
        this.mChildFragmentManager.R();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(s.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.j(s.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        this.onPause();
        if (this.mCalled) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onPause()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    void performPictureInPictureModeChanged(final boolean b) {
        this.onPictureInPictureModeChanged(b);
        this.mChildFragmentManager.S(b);
    }
    
    boolean performPrepareOptionsMenu(@j0 final Menu menu) {
        final boolean mHidden = this.mHidden;
        boolean b = false;
        final boolean b2 = false;
        if (!mHidden) {
            boolean b3 = b2;
            if (this.mHasMenu) {
                b3 = b2;
                if (this.mMenuVisible) {
                    b3 = true;
                    this.onPrepareOptionsMenu(menu);
                }
            }
            b = (b3 | this.mChildFragmentManager.T(menu));
        }
        return b;
    }
    
    void performPrimaryNavigationFragmentChanged() {
        final boolean w0 = this.mFragmentManager.W0(this);
        final Boolean mIsPrimaryNavigationFragment = this.mIsPrimaryNavigationFragment;
        if (mIsPrimaryNavigationFragment == null || mIsPrimaryNavigationFragment != w0) {
            this.mIsPrimaryNavigationFragment = w0;
            this.onPrimaryNavigationFragmentChanged(w0);
            this.mChildFragmentManager.U();
        }
    }
    
    void performResume() {
        this.mChildFragmentManager.h1();
        this.mChildFragmentManager.h0(true);
        this.mState = 7;
        this.mCalled = false;
        this.onResume();
        if (this.mCalled) {
            final a0 mLifecycleRegistry = this.mLifecycleRegistry;
            final s.b on_RESUME = s.b.ON_RESUME;
            mLifecycleRegistry.j(on_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(on_RESUME);
            }
            this.mChildFragmentManager.V();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    void performSaveInstanceState(final Bundle bundle) {
        this.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.d(bundle);
        final Parcelable h1 = this.mChildFragmentManager.H1();
        if (h1 != null) {
            bundle.putParcelable("android:support:fragments", h1);
        }
    }
    
    void performStart() {
        this.mChildFragmentManager.h1();
        this.mChildFragmentManager.h0(true);
        this.mState = 5;
        this.mCalled = false;
        this.onStart();
        if (this.mCalled) {
            final a0 mLifecycleRegistry = this.mLifecycleRegistry;
            final s.b on_START = s.b.ON_START;
            mLifecycleRegistry.j(on_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(on_START);
            }
            this.mChildFragmentManager.W();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    void performStop() {
        this.mChildFragmentManager.Y();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(s.b.ON_STOP);
        }
        this.mLifecycleRegistry.j(s.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        this.onStop();
        if (this.mCalled) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStop()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    void performViewCreated() {
        this.onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.Z();
    }
    
    public void postponeEnterTransition() {
        this.ensureAnimationInfo().w = true;
    }
    
    public final void postponeEnterTransition(final long duration, @j0 final TimeUnit timeUnit) {
        this.ensureAnimationInfo().w = true;
        final FragmentManager mFragmentManager = this.mFragmentManager;
        Handler g;
        if (mFragmentManager != null) {
            g = mFragmentManager.H0().g();
        }
        else {
            g = new Handler(Looper.getMainLooper());
        }
        g.removeCallbacks(this.mPostponedDurationRunnable);
        g.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(duration));
    }
    
    @g0
    @j0
    public final <I, O> d<I> registerForActivityResult(@j0 final a<I, O> a, @j0 final ActivityResultRegistry activityResultRegistry, @j0 final androidx.activity.result.b<O> b) {
        return this.prepareCallInternal(a, new g.a<Void, ActivityResultRegistry>() {
            public ActivityResultRegistry a(final Void void1) {
                return activityResultRegistry;
            }
        }, b);
    }
    
    @g0
    @j0
    public final <I, O> d<I> registerForActivityResult(@j0 final a<I, O> a, @j0 final androidx.activity.result.b<O> b) {
        return this.prepareCallInternal(a, new g.a<Void, ActivityResultRegistry>() {
            public ActivityResultRegistry a(final Void void1) {
                final Fragment a = Fragment.this;
                final androidx.fragment.app.i<?> mHost = a.mHost;
                if (mHost instanceof e) {
                    return ((e)mHost).getActivityResultRegistry();
                }
                return a.requireActivity().getActivityResultRegistry();
            }
        }, b);
    }
    
    public void registerForContextMenu(@j0 final View view) {
        view.setOnCreateContextMenuListener((View$OnCreateContextMenuListener)this);
    }
    
    @Deprecated
    public final void requestPermissions(@j0 final String[] array, final int n) {
        if (this.mHost != null) {
            this.getParentFragmentManager().Z0(this, array, n);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    @j0
    public final androidx.fragment.app.d requireActivity() {
        final androidx.fragment.app.d activity = this.getActivity();
        if (activity != null) {
            return activity;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }
    
    @j0
    public final Bundle requireArguments() {
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            return arguments;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }
    
    @j0
    public final Context requireContext() {
        final Context context = this.getContext();
        if (context != null) {
            return context;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }
    
    @Deprecated
    @j0
    public final FragmentManager requireFragmentManager() {
        return this.getParentFragmentManager();
    }
    
    @j0
    public final Object requireHost() {
        final Object host = this.getHost();
        if (host != null) {
            return host;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a host.");
        throw new IllegalStateException(sb.toString());
    }
    
    @j0
    public final Fragment requireParentFragment() {
        final Fragment parentFragment = this.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (this.getContext() == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" is not attached to any Fragment or host");
            throw new IllegalStateException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment ");
        sb2.append(this);
        sb2.append(" is not a child Fragment, it is directly attached to ");
        sb2.append(this.getContext());
        throw new IllegalStateException(sb2.toString());
    }
    
    @j0
    public final View requireView() {
        final View view = this.getView();
        if (view != null) {
            return view;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }
    
    void restoreChildFragmentState(@k0 final Bundle bundle) {
        if (bundle != null) {
            final Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.mChildFragmentManager.E1(parcelable);
                this.mChildFragmentManager.H();
            }
        }
    }
    
    final void restoreViewState(final Bundle bundle) {
        final SparseArray<Parcelable> mSavedViewState = this.mSavedViewState;
        if (mSavedViewState != null) {
            this.mView.restoreHierarchyState((SparseArray)mSavedViewState);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        this.onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(s.b.ON_CREATE);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onViewStateRestored()");
        throw new androidx.fragment.app.k0(sb.toString());
    }
    
    public void setAllowEnterTransitionOverlap(final boolean b) {
        this.ensureAnimationInfo().r = b;
    }
    
    public void setAllowReturnTransitionOverlap(final boolean b) {
        this.ensureAnimationInfo().q = b;
    }
    
    void setAnimatingAway(final View a) {
        this.ensureAnimationInfo().a = a;
    }
    
    void setAnimations(final int d, final int e, final int f, final int g) {
        if (this.mAnimationInfo == null && d == 0 && e == 0 && f == 0 && g == 0) {
            return;
        }
        this.ensureAnimationInfo().d = d;
        this.ensureAnimationInfo().e = e;
        this.ensureAnimationInfo().f = f;
        this.ensureAnimationInfo().g = g;
    }
    
    void setAnimator(final Animator b) {
        this.ensureAnimationInfo().b = b;
    }
    
    public void setArguments(@k0 final Bundle mArguments) {
        if (this.mFragmentManager != null && this.isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = mArguments;
    }
    
    public void setEnterSharedElementCallback(@k0 final b0 s) {
        this.ensureAnimationInfo().s = s;
    }
    
    public void setEnterTransition(@k0 final Object k) {
        this.ensureAnimationInfo().k = k;
    }
    
    public void setExitSharedElementCallback(@k0 final b0 t) {
        this.ensureAnimationInfo().t = t;
    }
    
    public void setExitTransition(@k0 final Object m) {
        this.ensureAnimationInfo().m = m;
    }
    
    void setFocusedView(final View v) {
        this.ensureAnimationInfo().v = v;
    }
    
    public void setHasOptionsMenu(final boolean mHasMenu) {
        if (this.mHasMenu != mHasMenu) {
            this.mHasMenu = mHasMenu;
            if (this.isAdded() && !this.isHidden()) {
                this.mHost.s();
            }
        }
    }
    
    void setHideReplaced(final boolean y) {
        this.ensureAnimationInfo().y = y;
    }
    
    public void setInitialSavedState(@k0 final m m) {
        if (this.mFragmentManager == null) {
            Bundle g = null;
            Label_0025: {
                if (m != null) {
                    g = m.G;
                    if (g != null) {
                        break Label_0025;
                    }
                }
                g = null;
            }
            this.mSavedFragmentState = g;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }
    
    public void setMenuVisibility(final boolean mMenuVisible) {
        if (this.mMenuVisible != mMenuVisible) {
            this.mMenuVisible = mMenuVisible;
            if (this.mHasMenu && this.isAdded() && !this.isHidden()) {
                this.mHost.s();
            }
        }
    }
    
    void setNextTransition(final int h) {
        if (this.mAnimationInfo == null && h == 0) {
            return;
        }
        this.ensureAnimationInfo();
        this.mAnimationInfo.h = h;
    }
    
    void setOnStartEnterTransitionListener(final l x) {
        this.ensureAnimationInfo();
        final i mAnimationInfo = this.mAnimationInfo;
        final l x2 = mAnimationInfo.x;
        if (x == x2) {
            return;
        }
        if (x != null && x2 != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        if (mAnimationInfo.w) {
            mAnimationInfo.x = x;
        }
        if (x != null) {
            x.a();
        }
    }
    
    void setPopDirection(final boolean c) {
        if (this.mAnimationInfo == null) {
            return;
        }
        this.ensureAnimationInfo().c = c;
    }
    
    void setPostOnViewCreatedAlpha(final float u) {
        this.ensureAnimationInfo().u = u;
    }
    
    public void setReenterTransition(@k0 final Object n) {
        this.ensureAnimationInfo().n = n;
    }
    
    @Deprecated
    public void setRetainInstance(final boolean mRetainInstance) {
        this.mRetainInstance = mRetainInstance;
        final FragmentManager mFragmentManager = this.mFragmentManager;
        if (mFragmentManager != null) {
            if (mRetainInstance) {
                mFragmentManager.n(this);
            }
            else {
                mFragmentManager.B1(this);
            }
        }
        else {
            this.mRetainInstanceChangedWhileDetached = true;
        }
    }
    
    public void setReturnTransition(@k0 final Object l) {
        this.ensureAnimationInfo().l = l;
    }
    
    public void setSharedElementEnterTransition(@k0 final Object o) {
        this.ensureAnimationInfo().o = o;
    }
    
    void setSharedElementNames(@k0 final ArrayList<String> i, @k0 final ArrayList<String> j) {
        this.ensureAnimationInfo();
        final i mAnimationInfo = this.mAnimationInfo;
        mAnimationInfo.i = i;
        mAnimationInfo.j = j;
    }
    
    public void setSharedElementReturnTransition(@k0 final Object p) {
        this.ensureAnimationInfo().p = p;
    }
    
    @Deprecated
    public void setTargetFragment(@k0 final Fragment mTarget, final int mTargetRequestCode) {
        final FragmentManager mFragmentManager = this.mFragmentManager;
        FragmentManager mFragmentManager2;
        if (mTarget != null) {
            mFragmentManager2 = mTarget.mFragmentManager;
        }
        else {
            mFragmentManager2 = null;
        }
        if (mFragmentManager != null && mFragmentManager2 != null && mFragmentManager != mFragmentManager2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(mTarget);
            sb.append(" must share the same FragmentManager to be set as a target fragment");
            throw new IllegalArgumentException(sb.toString());
        }
        for (Fragment targetFragment = mTarget; targetFragment != null; targetFragment = targetFragment.getTargetFragment()) {
            if (targetFragment.equals(this)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting ");
                sb2.append(mTarget);
                sb2.append(" as the target of ");
                sb2.append(this);
                sb2.append(" would create a target cycle");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        Label_0228: {
            if (mTarget == null) {
                this.mTargetWho = null;
            }
            else {
                if (this.mFragmentManager == null || mTarget.mFragmentManager == null) {
                    this.mTargetWho = null;
                    this.mTarget = mTarget;
                    break Label_0228;
                }
                this.mTargetWho = mTarget.mWho;
            }
            this.mTarget = null;
        }
        this.mTargetRequestCode = mTargetRequestCode;
    }
    
    @Deprecated
    public void setUserVisibleHint(final boolean b) {
        if (!this.mUserVisibleHint && b && this.mState < 5 && this.mFragmentManager != null && this.isAdded() && this.mIsCreated) {
            final FragmentManager mFragmentManager = this.mFragmentManager;
            mFragmentManager.k1(mFragmentManager.A(this));
        }
        this.mUserVisibleHint = b;
        this.mDeferStart = (this.mState < 5 && !b);
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = b;
        }
    }
    
    public boolean shouldShowRequestPermissionRationale(@j0 final String s) {
        final androidx.fragment.app.i<?> mHost = this.mHost;
        return mHost != null && mHost.o(s);
    }
    
    public void startActivity(@SuppressLint({ "UnknownNullness" }) final Intent intent) {
        this.startActivity(intent, null);
    }
    
    public void startActivity(@SuppressLint({ "UnknownNullness" }) final Intent intent, @k0 final Bundle bundle) {
        final androidx.fragment.app.i<?> mHost = this.mHost;
        if (mHost != null) {
            mHost.q(this, intent, -1, bundle);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    @Deprecated
    public void startActivityForResult(@SuppressLint({ "UnknownNullness" }) final Intent intent, final int n) {
        this.startActivityForResult(intent, n, null);
    }
    
    @Deprecated
    public void startActivityForResult(@SuppressLint({ "UnknownNullness" }) final Intent intent, final int n, @k0 final Bundle bundle) {
        if (this.mHost != null) {
            this.getParentFragmentManager().a1(this, intent, n, bundle);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({ "UnknownNullness" }) final IntentSender obj, final int i, @k0 final Intent obj2, final int n, final int n2, final int n3, @k0 final Bundle obj3) throws IntentSender$SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.T0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                sb.append(i);
                sb.append(" IntentSender: ");
                sb.append(obj);
                sb.append(" fillInIntent: ");
                sb.append(obj2);
                sb.append(" options: ");
                sb.append(obj3);
                Log.v("FragmentManager", sb.toString());
            }
            this.getParentFragmentManager().b1(this, obj, i, obj2, n, n2, n3, obj3);
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment ");
        sb2.append(this);
        sb2.append(" not attached to Activity");
        throw new IllegalStateException(sb2.toString());
    }
    
    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null) {
            if (this.ensureAnimationInfo().w) {
                if (this.mHost == null) {
                    this.ensureAnimationInfo().w = false;
                }
                else if (Looper.myLooper() != this.mHost.g().getLooper()) {
                    this.mHost.g().postAtFrontOfQueue((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            Fragment.this.callStartTransitionListener(false);
                        }
                    });
                }
                else {
                    this.callStartTransitionListener(true);
                }
            }
        }
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }
    
    public void unregisterForContextMenu(@j0 final View view) {
        view.setOnCreateContextMenuListener((View$OnCreateContextMenuListener)null);
    }
    
    static class i
    {
        View a;
        Animator b;
        boolean c;
        int d;
        int e;
        int f;
        int g;
        int h;
        ArrayList<String> i;
        ArrayList<String> j;
        Object k;
        Object l;
        Object m;
        Object n;
        Object o;
        Object p;
        Boolean q;
        Boolean r;
        b0 s;
        b0 t;
        float u;
        View v;
        boolean w;
        l x;
        boolean y;
        
        i() {
            this.k = null;
            final Object use_DEFAULT_TRANSITION = Fragment.USE_DEFAULT_TRANSITION;
            this.l = use_DEFAULT_TRANSITION;
            this.m = null;
            this.n = use_DEFAULT_TRANSITION;
            this.o = null;
            this.p = use_DEFAULT_TRANSITION;
            this.s = null;
            this.t = null;
            this.u = 1.0f;
            this.v = null;
        }
    }
    
    public static class j extends RuntimeException
    {
        public j(@j0 final String message, @k0 final Exception cause) {
            super(message, cause);
        }
    }
    
    private abstract static class k
    {
        abstract void a();
    }
    
    interface l
    {
        void a();
        
        void b();
    }
    
    @SuppressLint({ "BanParcelableUsage, ParcelClassLoader" })
    public static class m implements Parcelable
    {
        @j0
        public static final Parcelable$Creator<m> CREATOR;
        final Bundle G;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<m>() {
                public m a(final Parcel parcel) {
                    return new m(parcel, null);
                }
                
                public m b(final Parcel parcel, final ClassLoader classLoader) {
                    return new m(parcel, classLoader);
                }
                
                public m[] c(final int n) {
                    return new m[n];
                }
            };
        }
        
        m(final Bundle g) {
            this.G = g;
        }
        
        m(@j0 final Parcel parcel, @k0 final ClassLoader classLoader) {
            final Bundle bundle = parcel.readBundle();
            this.G = bundle;
            if (classLoader != null && bundle != null) {
                bundle.setClassLoader(classLoader);
            }
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            parcel.writeBundle(this.G);
        }
    }
}
