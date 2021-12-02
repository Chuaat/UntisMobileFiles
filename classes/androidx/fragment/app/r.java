// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.annotation.k0;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.s;
import android.view.ViewGroup;
import androidx.annotation.j0;
import androidx.viewpager.widget.a;

@Deprecated
public abstract class r extends a
{
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private a0 mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;
    
    @Deprecated
    public r(@j0 final FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }
    
    public r(@j0 final FragmentManager mFragmentManager, final int mBehavior) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = mFragmentManager;
        this.mBehavior = mBehavior;
    }
    
    private static String makeFragmentName(final int i, final long lng) {
        final StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(lng);
        return sb.toString();
    }
    
    @Override
    public void destroyItem(@j0 final ViewGroup viewGroup, final int n, @j0 final Object o) {
        final Fragment fragment = (Fragment)o;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.r();
        }
        this.mCurTransaction.w(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }
    
    @Override
    public void finishUpdate(@j0 final ViewGroup viewGroup) {
        final a0 mCurTransaction = this.mCurTransaction;
        if (mCurTransaction != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    mCurTransaction.u();
                }
                finally {
                    this.mExecutingFinishUpdate = false;
                }
            }
            this.mCurTransaction = null;
        }
    }
    
    @j0
    public abstract Fragment getItem(final int p0);
    
    public long getItemId(final int n) {
        return n;
    }
    
    @j0
    @Override
    public Object instantiateItem(@j0 final ViewGroup viewGroup, final int n) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.r();
        }
        final long itemId = this.getItemId(n);
        final Fragment q0 = this.mFragmentManager.q0(makeFragmentName(viewGroup.getId(), itemId));
        Fragment fragment;
        if (q0 != null) {
            this.mCurTransaction.q(q0);
            fragment = q0;
        }
        else {
            final Fragment item = this.getItem(n);
            this.mCurTransaction.h(viewGroup.getId(), item, makeFragmentName(viewGroup.getId(), itemId));
            fragment = item;
        }
        if (fragment != this.mCurrentPrimaryItem) {
            fragment.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.P(fragment, s.c.J);
            }
            else {
                fragment.setUserVisibleHint(false);
            }
        }
        return fragment;
    }
    
    @Override
    public boolean isViewFromObject(@j0 final View view, @j0 final Object o) {
        return ((Fragment)o).getView() == view;
    }
    
    @Override
    public void restoreState(@k0 final Parcelable parcelable, @k0 final ClassLoader classLoader) {
    }
    
    @k0
    @Override
    public Parcelable saveState() {
        return null;
    }
    
    @Override
    public void setPrimaryItem(@j0 final ViewGroup viewGroup, final int n, @j0 final Object o) {
        final Fragment mCurrentPrimaryItem = (Fragment)o;
        final Fragment mCurrentPrimaryItem2 = this.mCurrentPrimaryItem;
        if (mCurrentPrimaryItem != mCurrentPrimaryItem2) {
            if (mCurrentPrimaryItem2 != null) {
                mCurrentPrimaryItem2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.r();
                    }
                    this.mCurTransaction.P(this.mCurrentPrimaryItem, s.c.J);
                }
                else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            mCurrentPrimaryItem.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.r();
                }
                this.mCurTransaction.P(mCurrentPrimaryItem, s.c.K);
            }
            else {
                mCurrentPrimaryItem.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = mCurrentPrimaryItem;
        }
    }
    
    @Override
    public void startUpdate(@j0 final ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ViewPager with adapter ");
        sb.append(this);
        sb.append(" requires a view id");
        throw new IllegalStateException(sb.toString());
    }
}
