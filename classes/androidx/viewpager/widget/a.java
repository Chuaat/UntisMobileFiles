// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager.widget;

import android.os.Parcelable;
import androidx.annotation.k0;
import android.view.ViewGroup;
import androidx.annotation.j0;
import android.view.View;
import android.database.DataSetObserver;
import android.database.DataSetObservable;

public abstract class a
{
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private final DataSetObservable mObservable;
    private DataSetObserver mViewPagerObserver;
    
    public a() {
        this.mObservable = new DataSetObservable();
    }
    
    @Deprecated
    public void destroyItem(@j0 final View view, final int n, @j0 final Object o) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
    
    public void destroyItem(@j0 final ViewGroup viewGroup, final int n, @j0 final Object o) {
        this.destroyItem((View)viewGroup, n, o);
    }
    
    @Deprecated
    public void finishUpdate(@j0 final View view) {
    }
    
    public void finishUpdate(@j0 final ViewGroup viewGroup) {
        this.finishUpdate((View)viewGroup);
    }
    
    public abstract int getCount();
    
    public int getItemPosition(@j0 final Object o) {
        return -1;
    }
    
    @k0
    public CharSequence getPageTitle(final int n) {
        return null;
    }
    
    public float getPageWidth(final int n) {
        return 1.0f;
    }
    
    @Deprecated
    @j0
    public Object instantiateItem(@j0 final View view, final int n) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }
    
    @j0
    public Object instantiateItem(@j0 final ViewGroup viewGroup, final int n) {
        return this.instantiateItem((View)viewGroup, n);
    }
    
    public abstract boolean isViewFromObject(@j0 final View p0, @j0 final Object p1);
    
    public void notifyDataSetChanged() {
        synchronized (this) {
            final DataSetObserver mViewPagerObserver = this.mViewPagerObserver;
            if (mViewPagerObserver != null) {
                mViewPagerObserver.onChanged();
            }
            // monitorexit(this)
            this.mObservable.notifyChanged();
        }
    }
    
    public void registerDataSetObserver(@j0 final DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver((Object)dataSetObserver);
    }
    
    public void restoreState(@k0 final Parcelable parcelable, @k0 final ClassLoader classLoader) {
    }
    
    @k0
    public Parcelable saveState() {
        return null;
    }
    
    @Deprecated
    public void setPrimaryItem(@j0 final View view, final int n, @j0 final Object o) {
    }
    
    public void setPrimaryItem(@j0 final ViewGroup viewGroup, final int n, @j0 final Object o) {
        this.setPrimaryItem((View)viewGroup, n, o);
    }
    
    void setViewPagerObserver(final DataSetObserver mViewPagerObserver) {
        synchronized (this) {
            this.mViewPagerObserver = mViewPagerObserver;
        }
    }
    
    @Deprecated
    public void startUpdate(@j0 final View view) {
    }
    
    public void startUpdate(@j0 final ViewGroup viewGroup) {
        this.startUpdate((View)viewGroup);
    }
    
    public void unregisterDataSetObserver(@j0 final DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver((Object)dataSetObserver);
    }
}
