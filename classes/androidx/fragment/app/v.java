// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.os.Parcelable;
import androidx.annotation.k0;
import java.util.Iterator;
import android.app.Activity;
import androidx.lifecycle.d1;
import android.view.LayoutInflater;
import android.view.View$OnAttachStateChangeListener;
import y.a;
import android.content.res.Resources$NotFoundException;
import android.view.ViewGroup;
import android.util.SparseArray;
import android.view.ViewParent;
import android.view.View;
import android.util.Log;
import androidx.lifecycle.s;
import android.os.Bundle;
import androidx.annotation.j0;

class v
{
    private static final String f = "FragmentManager";
    private static final String g = "android:target_req_state";
    private static final String h = "android:target_state";
    private static final String i = "android:view_state";
    private static final String j = "android:view_registry_state";
    private static final String k = "android:user_visible_hint";
    private final k a;
    private final y b;
    @j0
    private final Fragment c;
    private boolean d;
    private int e;
    
    v(@j0 final k a, @j0 final y b, @j0 final Fragment c) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    v(@j0 final k a, @j0 final y b, @j0 final Fragment c, @j0 final u u) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        c.mSavedViewState = null;
        c.mSavedViewRegistryState = null;
        c.mBackStackNesting = 0;
        c.mInLayout = false;
        c.mAdded = false;
        final Fragment mTarget = c.mTarget;
        String mWho;
        if (mTarget != null) {
            mWho = mTarget.mWho;
        }
        else {
            mWho = null;
        }
        c.mTargetWho = mWho;
        c.mTarget = null;
        Bundle s = u.S;
        if (s == null) {
            s = new Bundle();
        }
        c.mSavedFragmentState = s;
    }
    
    v(@j0 final k a, @j0 final y b, @j0 final ClassLoader classLoader, @j0 final h h, @j0 final u u) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        final Fragment a2 = h.a(classLoader, u.G);
        this.c = a2;
        final Bundle p5 = u.P;
        if (p5 != null) {
            p5.setClassLoader(classLoader);
        }
        a2.setArguments(u.P);
        a2.mWho = u.H;
        a2.mFromLayout = u.I;
        a2.mRestored = true;
        a2.mFragmentId = u.J;
        a2.mContainerId = u.K;
        a2.mTag = u.L;
        a2.mRetainInstance = u.M;
        a2.mRemoving = u.N;
        a2.mDetached = u.O;
        a2.mHidden = u.Q;
        a2.mMaxState = s.c.values()[u.R];
        Bundle s = u.S;
        if (s == null) {
            s = new Bundle();
        }
        a2.mSavedFragmentState = s;
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(a2);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    private boolean l(@j0 final View view) {
        if (view == this.c.mView) {
            return true;
        }
        for (ViewParent viewParent = view.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (viewParent == this.c.mView) {
                return true;
            }
        }
        return false;
    }
    
    private Bundle q() {
        final Bundle bundle = new Bundle();
        this.c.performSaveInstanceState(bundle);
        this.a.j(this.c, bundle, false);
        Bundle bundle2 = bundle;
        if (bundle.isEmpty()) {
            bundle2 = null;
        }
        if (this.c.mView != null) {
            this.t();
        }
        Bundle bundle3 = bundle2;
        if (this.c.mSavedViewState != null) {
            if ((bundle3 = bundle2) == null) {
                bundle3 = new Bundle();
            }
            bundle3.putSparseParcelableArray("android:view_state", (SparseArray)this.c.mSavedViewState);
        }
        Bundle bundle4 = bundle3;
        if (this.c.mSavedViewRegistryState != null) {
            if ((bundle4 = bundle3) == null) {
                bundle4 = new Bundle();
            }
            bundle4.putBundle("android:view_registry_state", this.c.mSavedViewRegistryState);
        }
        Bundle bundle5 = bundle4;
        if (!this.c.mUserVisibleHint) {
            if ((bundle5 = bundle4) == null) {
                bundle5 = new Bundle();
            }
            bundle5.putBoolean("android:user_visible_hint", this.c.mUserVisibleHint);
        }
        return bundle5;
    }
    
    void a() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        c.performActivityCreated(c.mSavedFragmentState);
        final k a = this.a;
        final Fragment c2 = this.c;
        a.a(c2, c2.mSavedFragmentState, false);
    }
    
    void b() {
        final int j = this.b.j(this.c);
        final Fragment c = this.c;
        c.mContainer.addView(c.mView, j);
    }
    
    void c() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        final Fragment mTarget = c.mTarget;
        v v = null;
        if (mTarget != null) {
            v = this.b.n(mTarget.mWho);
            if (v == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(this.c);
                sb2.append(" declared target fragment ");
                sb2.append(this.c.mTarget);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
            final Fragment c2 = this.c;
            c2.mTargetWho = c2.mTarget.mWho;
            c2.mTarget = null;
        }
        else {
            final String mTargetWho = c.mTargetWho;
            if (mTargetWho != null) {
                v = this.b.n(mTargetWho);
                if (v == null) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Fragment ");
                    sb3.append(this.c);
                    sb3.append(" declared target fragment ");
                    sb3.append(this.c.mTargetWho);
                    sb3.append(" that does not belong to this FragmentManager!");
                    throw new IllegalStateException(sb3.toString());
                }
            }
        }
        if (v != null && (FragmentManager.Q || v.k().mState < 1)) {
            v.m();
        }
        final Fragment c3 = this.c;
        c3.mHost = c3.mFragmentManager.H0();
        final Fragment c4 = this.c;
        c4.mParentFragment = c4.mFragmentManager.K0();
        this.a.g(this.c, false);
        this.c.performAttach();
        this.a.b(this.c, false);
    }
    
    int d() {
        final Fragment c = this.c;
        if (c.mFragmentManager == null) {
            return c.mState;
        }
        final int e = this.e;
        final int n = v$b.a[c.mMaxState.ordinal()];
        int n2 = e;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        n2 = Math.min(e, -1);
                    }
                    else {
                        n2 = Math.min(e, 0);
                    }
                }
                else {
                    n2 = Math.min(e, 1);
                }
            }
            else {
                n2 = Math.min(e, 5);
            }
        }
        final Fragment c2 = this.c;
        int a = n2;
        if (c2.mFromLayout) {
            if (c2.mInLayout) {
                final int max = Math.max(this.e, 2);
                final View mView = this.c.mView;
                a = max;
                if (mView != null) {
                    a = max;
                    if (mView.getParent() == null) {
                        a = Math.min(max, 2);
                    }
                }
            }
            else if (this.e < 4) {
                a = Math.min(n2, c2.mState);
            }
            else {
                a = Math.min(n2, 1);
            }
        }
        int min = a;
        if (!this.c.mAdded) {
            min = Math.min(a, 1);
        }
        Enum<i0.e.b> l;
        final Enum<i0.e.b> enum1 = l = null;
        if (FragmentManager.Q) {
            final Fragment c3 = this.c;
            final ViewGroup mContainer = c3.mContainer;
            l = enum1;
            if (mContainer != null) {
                l = i0.n(mContainer, c3.getParentFragmentManager()).l(this);
            }
        }
        int a2;
        if (l == i0.e.b.H) {
            a2 = Math.min(min, 6);
        }
        else if (l == i0.e.b.I) {
            a2 = Math.max(min, 3);
        }
        else {
            final Fragment c4 = this.c;
            a2 = min;
            if (c4.mRemoving) {
                if (c4.isInBackStack()) {
                    a2 = Math.min(min, 1);
                }
                else {
                    a2 = Math.min(min, -1);
                }
            }
        }
        final Fragment c5 = this.c;
        int min2 = a2;
        if (c5.mDeferStart) {
            min2 = a2;
            if (c5.mState < 5) {
                min2 = Math.min(a2, 4);
            }
        }
        if (FragmentManager.T0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(min2);
            sb.append(" for ");
            sb.append(this.c);
            Log.v("FragmentManager", sb.toString());
        }
        return min2;
    }
    
    void e() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        if (!c.mIsCreated) {
            this.a.h(c, c.mSavedFragmentState, false);
            final Fragment c2 = this.c;
            c2.performCreate(c2.mSavedFragmentState);
            final k a = this.a;
            final Fragment c3 = this.c;
            a.c(c3, c3.mSavedFragmentState, false);
        }
        else {
            c.restoreChildFragmentState(c.mSavedFragmentState);
            this.c.mState = 1;
        }
    }
    
    void f() {
        if (this.c.mFromLayout) {
            return;
        }
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        final LayoutInflater performGetLayoutInflater = c.performGetLayoutInflater(c.mSavedFragmentState);
        final ViewGroup viewGroup = null;
        final Fragment c2 = this.c;
        ViewGroup mContainer = c2.mContainer;
        if (mContainer == null) {
            final int mContainerId = c2.mContainerId;
            mContainer = viewGroup;
            if (mContainerId != 0) {
                if (mContainerId == -1) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Cannot create fragment ");
                    sb2.append(this.c);
                    sb2.append(" for a container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final ViewGroup viewGroup2 = (ViewGroup)c2.mFragmentManager.B0().c(this.c.mContainerId);
                if ((mContainer = viewGroup2) == null) {
                    final Fragment c3 = this.c;
                    if (!c3.mRestored) {
                        String resourceName;
                        try {
                            resourceName = c3.getResources().getResourceName(this.c.mContainerId);
                        }
                        catch (Resources$NotFoundException ex) {
                            resourceName = "unknown";
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("No view found for id 0x");
                        sb3.append(Integer.toHexString(this.c.mContainerId));
                        sb3.append(" (");
                        sb3.append(resourceName);
                        sb3.append(") for fragment ");
                        sb3.append(this.c);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    mContainer = viewGroup2;
                }
            }
        }
        final Fragment c4 = this.c;
        c4.performCreateView(performGetLayoutInflater, c4.mContainer = mContainer, c4.mSavedFragmentState);
        final View mView = this.c.mView;
        if (mView != null) {
            final boolean b = false;
            mView.setSaveFromParentEnabled(false);
            final Fragment c5 = this.c;
            c5.mView.setTag(y.a.g.R, (Object)c5);
            if (mContainer != null) {
                this.b();
            }
            final Fragment c6 = this.c;
            if (c6.mHidden) {
                c6.mView.setVisibility(8);
            }
            if (androidx.core.view.j0.N0(this.c.mView)) {
                androidx.core.view.j0.t1(this.c.mView);
            }
            else {
                final View mView2 = this.c.mView;
                mView2.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
                    public void onViewAttachedToWindow(final View view) {
                        mView2.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                        androidx.core.view.j0.t1(mView2);
                    }
                    
                    public void onViewDetachedFromWindow(final View view) {
                    }
                });
            }
            this.c.performViewCreated();
            final k a = this.a;
            final Fragment c7 = this.c;
            a.m(c7, c7.mView, c7.mSavedFragmentState, false);
            final int visibility = this.c.mView.getVisibility();
            final float alpha = this.c.mView.getAlpha();
            if (FragmentManager.Q) {
                this.c.setPostOnViewCreatedAlpha(alpha);
                final Fragment c8 = this.c;
                if (c8.mContainer != null && visibility == 0) {
                    final View focus = c8.mView.findFocus();
                    if (focus != null) {
                        this.c.setFocusedView(focus);
                        if (FragmentManager.T0(2)) {
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("requestFocus: Saved focused view ");
                            sb4.append(focus);
                            sb4.append(" for Fragment ");
                            sb4.append(this.c);
                            Log.v("FragmentManager", sb4.toString());
                        }
                    }
                    this.c.mView.setAlpha(0.0f);
                }
            }
            else {
                final Fragment c9 = this.c;
                boolean mIsNewlyAdded = b;
                if (visibility == 0) {
                    mIsNewlyAdded = b;
                    if (c9.mContainer != null) {
                        mIsNewlyAdded = true;
                    }
                }
                c9.mIsNewlyAdded = mIsNewlyAdded;
            }
        }
        this.c.mState = 2;
    }
    
    void g() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        final boolean mRemoving = c.mRemoving;
        boolean i = true;
        final boolean b = mRemoving && !c.isInBackStack();
        if (b || this.b.p().m(this.c)) {
            final i<?> mHost = this.c.mHost;
            if (mHost instanceof d1) {
                i = this.b.p().i();
            }
            else if (mHost.f() instanceof Activity) {
                i = (true ^ ((Activity)mHost.f()).isChangingConfigurations());
            }
            if (b || i) {
                this.b.p().b(this.c);
            }
            this.c.performDestroy();
            this.a.d(this.c, false);
            for (final v v : this.b.l()) {
                if (v != null) {
                    final Fragment k = v.k();
                    if (!this.c.mWho.equals(k.mTargetWho)) {
                        continue;
                    }
                    k.mTarget = this.c;
                    k.mTargetWho = null;
                }
            }
            final Fragment c2 = this.c;
            final String mTargetWho = c2.mTargetWho;
            if (mTargetWho != null) {
                c2.mTarget = this.b.f(mTargetWho);
            }
            this.b.r(this);
        }
        else {
            final String mTargetWho2 = this.c.mTargetWho;
            if (mTargetWho2 != null) {
                final Fragment f = this.b.f(mTargetWho2);
                if (f != null && f.mRetainInstance) {
                    this.c.mTarget = f;
                }
            }
            this.c.mState = 0;
        }
    }
    
    void h() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Fragment c = this.c;
        final ViewGroup mContainer = c.mContainer;
        if (mContainer != null) {
            final View mView = c.mView;
            if (mView != null) {
                mContainer.removeView(mView);
            }
        }
        this.c.performDestroyView();
        this.a.n(this.c, false);
        final Fragment c2 = this.c;
        c2.mContainer = null;
        c2.mView = null;
        c2.mViewLifecycleOwner = null;
        c2.mViewLifecycleOwnerLiveData.q(null);
        this.c.mInLayout = false;
    }
    
    void i() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.performDetach();
        final k a = this.a;
        final Fragment c = this.c;
        final int n = 0;
        a.e(c, false);
        final Fragment c2 = this.c;
        c2.mState = -1;
        c2.mHost = null;
        c2.mParentFragment = null;
        c2.mFragmentManager = null;
        int n2 = n;
        if (c2.mRemoving) {
            n2 = n;
            if (!c2.isInBackStack()) {
                n2 = 1;
            }
        }
        if (n2 != 0 || this.b.p().m(this.c)) {
            if (FragmentManager.T0(3)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.c);
                Log.d("FragmentManager", sb2.toString());
            }
            this.c.initState();
        }
    }
    
    void j() {
        final Fragment c = this.c;
        if (c.mFromLayout && c.mInLayout && !c.mPerformedCreateView) {
            if (FragmentManager.T0(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.c);
                Log.d("FragmentManager", sb.toString());
            }
            final Fragment c2 = this.c;
            c2.performCreateView(c2.performGetLayoutInflater(c2.mSavedFragmentState), null, this.c.mSavedFragmentState);
            final View mView = this.c.mView;
            if (mView != null) {
                mView.setSaveFromParentEnabled(false);
                final Fragment c3 = this.c;
                c3.mView.setTag(y.a.g.R, (Object)c3);
                final Fragment c4 = this.c;
                if (c4.mHidden) {
                    c4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                final k a = this.a;
                final Fragment c5 = this.c;
                a.m(c5, c5.mView, c5.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }
    
    @j0
    Fragment k() {
        return this.c;
    }
    
    void m() {
        if (this.d) {
            if (FragmentManager.T0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(this.k());
                Log.v("FragmentManager", sb.toString());
            }
            return;
        }
        try {
            this.d = true;
            Fragment c;
            while (true) {
                final int d = this.d();
                c = this.c;
                final int mState = c.mState;
                if (d == mState) {
                    break;
                }
                if (d > mState) {
                    switch (mState + 1) {
                        default: {
                            continue;
                        }
                        case 7: {
                            this.p();
                            continue;
                        }
                        case 6: {
                            c.mState = 6;
                            continue;
                        }
                        case 5: {
                            this.v();
                            continue;
                        }
                        case 4: {
                            if (c.mView != null) {
                                final ViewGroup mContainer = c.mContainer;
                                if (mContainer != null) {
                                    i0.n(mContainer, c.getParentFragmentManager()).b(i0.e.c.d(this.c.mView.getVisibility()), this);
                                }
                            }
                            this.c.mState = 4;
                            continue;
                        }
                        case 3: {
                            this.a();
                            continue;
                        }
                        case 2: {
                            this.j();
                            this.f();
                            continue;
                        }
                        case 1: {
                            this.e();
                            continue;
                        }
                        case 0: {
                            this.c();
                            continue;
                        }
                    }
                }
                else {
                    switch (mState - 1) {
                        default: {
                            continue;
                        }
                        case 6: {
                            this.n();
                            continue;
                        }
                        case 5: {
                            c.mState = 5;
                            continue;
                        }
                        case 4: {
                            this.w();
                            continue;
                        }
                        case 3: {
                            if (FragmentManager.T0(3)) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("movefrom ACTIVITY_CREATED: ");
                                sb2.append(this.c);
                                Log.d("FragmentManager", sb2.toString());
                            }
                            final Fragment c2 = this.c;
                            if (c2.mView != null && c2.mSavedViewState == null) {
                                this.t();
                            }
                            final Fragment c3 = this.c;
                            if (c3.mView != null) {
                                final ViewGroup mContainer2 = c3.mContainer;
                                if (mContainer2 != null) {
                                    i0.n(mContainer2, c3.getParentFragmentManager()).d(this);
                                }
                            }
                            this.c.mState = 3;
                            continue;
                        }
                        case 2: {
                            c.mInLayout = false;
                            c.mState = 2;
                            continue;
                        }
                        case 1: {
                            this.h();
                            this.c.mState = 1;
                            continue;
                        }
                        case 0: {
                            this.g();
                            continue;
                        }
                        case -1: {
                            this.i();
                            continue;
                        }
                    }
                }
            }
            if (FragmentManager.Q && c.mHiddenChanged) {
                if (c.mView != null) {
                    final ViewGroup mContainer3 = c.mContainer;
                    if (mContainer3 != null) {
                        final i0 n = i0.n(mContainer3, c.getParentFragmentManager());
                        if (this.c.mHidden) {
                            n.c(this);
                        }
                        else {
                            n.e(this);
                        }
                    }
                }
                final Fragment c4 = this.c;
                final FragmentManager mFragmentManager = c4.mFragmentManager;
                if (mFragmentManager != null) {
                    mFragmentManager.R0(c4);
                }
                final Fragment c5 = this.c;
                c5.mHiddenChanged = false;
                c5.onHiddenChanged(c5.mHidden);
            }
        }
        finally {
            this.d = false;
        }
    }
    
    void n() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.performPause();
        this.a.f(this.c, false);
    }
    
    void o(@j0 final ClassLoader classLoader) {
        final Bundle mSavedFragmentState = this.c.mSavedFragmentState;
        if (mSavedFragmentState == null) {
            return;
        }
        mSavedFragmentState.setClassLoader(classLoader);
        final Fragment c = this.c;
        c.mSavedViewState = (SparseArray<Parcelable>)c.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        final Fragment c2 = this.c;
        c2.mSavedViewRegistryState = c2.mSavedFragmentState.getBundle("android:view_registry_state");
        final Fragment c3 = this.c;
        c3.mTargetWho = c3.mSavedFragmentState.getString("android:target_state");
        final Fragment c4 = this.c;
        if (c4.mTargetWho != null) {
            c4.mTargetRequestCode = c4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        final Fragment c5 = this.c;
        final Boolean mSavedUserVisibleHint = c5.mSavedUserVisibleHint;
        if (mSavedUserVisibleHint != null) {
            c5.mUserVisibleHint = mSavedUserVisibleHint;
            this.c.mSavedUserVisibleHint = null;
        }
        else {
            c5.mUserVisibleHint = c5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        final Fragment c6 = this.c;
        if (!c6.mUserVisibleHint) {
            c6.mDeferStart = true;
        }
    }
    
    void p() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final View focusedView = this.c.getFocusedView();
        if (focusedView != null && this.l(focusedView)) {
            final boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.T0(2)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                String str;
                if (requestFocus) {
                    str = "succeeded";
                }
                else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.c.setFocusedView(null);
        this.c.performResume();
        this.a.i(this.c, false);
        final Fragment c = this.c;
        c.mSavedFragmentState = null;
        c.mSavedViewState = null;
        c.mSavedViewRegistryState = null;
    }
    
    @k0
    Fragment.m r() {
        final int mState = this.c.mState;
        Object o = null;
        if (mState > -1) {
            final Bundle q = this.q();
            o = o;
            if (q != null) {
                o = new Fragment.m(q);
            }
        }
        return (Fragment.m)o;
    }
    
    @j0
    u s() {
        final u u = new u(this.c);
        final Fragment c = this.c;
        if (c.mState > -1 && u.S == null) {
            final Bundle q = this.q();
            u.S = q;
            if (this.c.mTargetWho != null) {
                if (q == null) {
                    u.S = new Bundle();
                }
                u.S.putString("android:target_state", this.c.mTargetWho);
                final int mTargetRequestCode = this.c.mTargetRequestCode;
                if (mTargetRequestCode != 0) {
                    u.S.putInt("android:target_req_state", mTargetRequestCode);
                }
            }
        }
        else {
            u.S = c.mSavedFragmentState;
        }
        return u;
    }
    
    void t() {
        if (this.c.mView == null) {
            return;
        }
        final SparseArray mSavedViewState = new SparseArray();
        this.c.mView.saveHierarchyState(mSavedViewState);
        if (mSavedViewState.size() > 0) {
            this.c.mSavedViewState = (SparseArray<Parcelable>)mSavedViewState;
        }
        final Bundle mSavedViewRegistryState = new Bundle();
        this.c.mViewLifecycleOwner.e(mSavedViewRegistryState);
        if (!mSavedViewRegistryState.isEmpty()) {
            this.c.mSavedViewRegistryState = mSavedViewRegistryState;
        }
    }
    
    void u(final int e) {
        this.e = e;
    }
    
    void v() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.performStart();
        this.a.k(this.c, false);
    }
    
    void w() {
        if (FragmentManager.T0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.performStop();
        this.a.l(this.c, false);
    }
}
