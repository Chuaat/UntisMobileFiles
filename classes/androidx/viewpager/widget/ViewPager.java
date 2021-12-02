// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import androidx.annotation.n0;
import android.os.Bundle;
import android.content.res.TypedArray;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Inherited;
import java.lang.annotation.Annotation;
import androidx.core.content.d;
import androidx.annotation.s;
import android.database.DataSetObserver;
import android.content.res.Resources$NotFoundException;
import androidx.annotation.i;
import android.view.View$MeasureSpec;
import androidx.core.view.x0;
import androidx.core.view.a0;
import android.view.ViewConfiguration;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.os.SystemClock;
import android.view.SoundEffectConstants;
import android.view.FocusFinder;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import java.util.Collections;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.graphics.Paint;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.Rect;
import android.widget.Scroller;
import android.os.Parcelable;
import android.graphics.drawable.Drawable;
import android.widget.EdgeEffect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import android.view.animation.Interpolator;
import java.util.Comparator;
import android.view.ViewGroup;

public class ViewPager extends ViewGroup
{
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<f> COMPARATOR;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    static final int[] LAYOUT_ATTRS;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator;
    private static final o sPositionComparator;
    private int mActivePointerId;
    a mAdapter;
    private List<i> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private j mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<f> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private l mObserver;
    private int mOffscreenPageLimit;
    private j mOnPageChangeListener;
    private List<j> mOnPageChangeListeners;
    private int mPageMargin;
    private k mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final f mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    
    static {
        LAYOUT_ATTRS = new int[] { 16842931 };
        COMPARATOR = new Comparator<f>() {
            public int a(final f f, final f f2) {
                return f.b - f2.b;
            }
        };
        sInterpolator = (Interpolator)new Interpolator() {
            public float getInterpolation(float n) {
                --n;
                return n * n * n * n * n + 1.0f;
            }
        };
        sPositionComparator = new o();
    }
    
    public ViewPager(@j0 final Context context) {
        super(context);
        this.mItems = new ArrayList<f>();
        this.mTempItem = new f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() {
            @Override
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        this.initViewPager();
    }
    
    public ViewPager(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.mItems = new ArrayList<f>();
        this.mTempItem = new f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() {
            @Override
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        this.initViewPager();
    }
    
    private void calculatePageOffsets(f f, int n, f f2) {
        int count = this.mAdapter.getCount();
        final int clientWidth = this.getClientWidth();
        float n2;
        if (clientWidth > 0) {
            n2 = this.mPageMargin / (float)clientWidth;
        }
        else {
            n2 = 0.0f;
        }
        if (f2 != null) {
            int b = f2.b;
            final int b2 = f.b;
            if (b < b2) {
                float n3 = f2.e + f2.d + n2;
                ++b;
                int i;
                for (int index = 0; b <= f.b && index < this.mItems.size(); b = i + 1) {
                    float e;
                    while (true) {
                        f2 = this.mItems.get(index);
                        i = b;
                        e = n3;
                        if (b <= f2.b) {
                            break;
                        }
                        i = b;
                        e = n3;
                        if (index >= this.mItems.size() - 1) {
                            break;
                        }
                        ++index;
                    }
                    while (i < f2.b) {
                        e += this.mAdapter.getPageWidth(i) + n2;
                        ++i;
                    }
                    f2.e = e;
                    n3 = e + (f2.d + n2);
                }
            }
            else if (b > b2) {
                int index2 = this.mItems.size() - 1;
                float e2 = f2.e;
                --b;
                while (b >= f.b && index2 >= 0) {
                    int j;
                    float n4;
                    while (true) {
                        f2 = this.mItems.get(index2);
                        j = b;
                        n4 = e2;
                        if (b >= f2.b) {
                            break;
                        }
                        j = b;
                        n4 = e2;
                        if (index2 <= 0) {
                            break;
                        }
                        --index2;
                    }
                    while (j > f2.b) {
                        n4 -= this.mAdapter.getPageWidth(j) + n2;
                        --j;
                    }
                    e2 = n4 - (f2.d + n2);
                    f2.e = e2;
                    b = j - 1;
                }
            }
        }
        final int size = this.mItems.size();
        float e3 = f.e;
        final int b3 = f.b;
        int n5 = b3 - 1;
        float mFirstOffset;
        if (b3 == 0) {
            mFirstOffset = e3;
        }
        else {
            mFirstOffset = -3.4028235E38f;
        }
        this.mFirstOffset = mFirstOffset;
        --count;
        float mLastOffset;
        if (b3 == count) {
            mLastOffset = f.d + e3 - 1.0f;
        }
        else {
            mLastOffset = Float.MAX_VALUE;
        }
        this.mLastOffset = mLastOffset;
        for (int k = n - 1; k >= 0; --k, --n5) {
            f2 = this.mItems.get(k);
            int b4;
            while (true) {
                b4 = f2.b;
                if (n5 <= b4) {
                    break;
                }
                e3 -= this.mAdapter.getPageWidth(n5) + n2;
                --n5;
            }
            e3 -= f2.d + n2;
            f2.e = e3;
            if (b4 == 0) {
                this.mFirstOffset = e3;
            }
        }
        float e4 = f.e + f.d + n2;
        final int n6 = f.b + 1;
        int l;
        int b5;
        for (l = n + 1, n = n6; l < size; ++l, ++n) {
            f = this.mItems.get(l);
            while (true) {
                b5 = f.b;
                if (n >= b5) {
                    break;
                }
                e4 += this.mAdapter.getPageWidth(n) + n2;
                ++n;
            }
            if (b5 == count) {
                this.mLastOffset = f.d + e4 - 1.0f;
            }
            f.e = e4;
            e4 += f.d + n2;
        }
        this.mNeedCalculatePageOffsets = false;
    }
    
    private void completeScroll(final boolean b) {
        int n;
        if (this.mScrollState == 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.setScrollingCacheEnabled(false);
            if (this.mScroller.isFinished() ^ true) {
                this.mScroller.abortAnimation();
                final int scrollX = this.getScrollX();
                final int scrollY = this.getScrollY();
                final int currX = this.mScroller.getCurrX();
                final int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    this.scrollTo(currX, currY);
                    if (currX != scrollX) {
                        this.pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); ++i) {
            final f f = this.mItems.get(i);
            if (f.c) {
                f.c = false;
                n = 1;
            }
        }
        if (n != 0) {
            if (b) {
                androidx.core.view.j0.n1((View)this, this.mEndScrollRunnable);
            }
            else {
                this.mEndScrollRunnable.run();
            }
        }
    }
    
    private int determineTargetPage(int a, final float n, int max, final int a2) {
        if (Math.abs(a2) > this.mFlingDistance && Math.abs(max) > this.mMinimumVelocity) {
            if (max <= 0) {
                ++a;
            }
        }
        else {
            float n2;
            if (a >= this.mCurItem) {
                n2 = 0.4f;
            }
            else {
                n2 = 0.6f;
            }
            a += (int)(n + n2);
        }
        max = a;
        if (this.mItems.size() > 0) {
            final f f = this.mItems.get(0);
            final ArrayList<f> mItems = this.mItems;
            max = Math.max(f.b, Math.min(a, mItems.get(mItems.size() - 1).b));
        }
        return max;
    }
    
    private void dispatchOnPageScrolled(final int n, final float n2, final int n3) {
        final j mOnPageChangeListener = this.mOnPageChangeListener;
        if (mOnPageChangeListener != null) {
            mOnPageChangeListener.b(n, n2, n3);
        }
        final List<j> mOnPageChangeListeners = this.mOnPageChangeListeners;
        if (mOnPageChangeListeners != null) {
            for (int i = 0; i < mOnPageChangeListeners.size(); ++i) {
                final j j = this.mOnPageChangeListeners.get(i);
                if (j != null) {
                    j.b(n, n2, n3);
                }
            }
        }
        final j mInternalPageChangeListener = this.mInternalPageChangeListener;
        if (mInternalPageChangeListener != null) {
            mInternalPageChangeListener.b(n, n2, n3);
        }
    }
    
    private void dispatchOnPageSelected(final int n) {
        final j mOnPageChangeListener = this.mOnPageChangeListener;
        if (mOnPageChangeListener != null) {
            mOnPageChangeListener.l(n);
        }
        final List<j> mOnPageChangeListeners = this.mOnPageChangeListeners;
        if (mOnPageChangeListeners != null) {
            for (int i = 0; i < mOnPageChangeListeners.size(); ++i) {
                final j j = this.mOnPageChangeListeners.get(i);
                if (j != null) {
                    j.l(n);
                }
            }
        }
        final j mInternalPageChangeListener = this.mInternalPageChangeListener;
        if (mInternalPageChangeListener != null) {
            mInternalPageChangeListener.l(n);
        }
    }
    
    private void dispatchOnScrollStateChanged(final int n) {
        final j mOnPageChangeListener = this.mOnPageChangeListener;
        if (mOnPageChangeListener != null) {
            mOnPageChangeListener.k(n);
        }
        final List<j> mOnPageChangeListeners = this.mOnPageChangeListeners;
        if (mOnPageChangeListeners != null) {
            for (int i = 0; i < mOnPageChangeListeners.size(); ++i) {
                final j j = this.mOnPageChangeListeners.get(i);
                if (j != null) {
                    j.k(n);
                }
            }
        }
        final j mInternalPageChangeListener = this.mInternalPageChangeListener;
        if (mInternalPageChangeListener != null) {
            mInternalPageChangeListener.k(n);
        }
    }
    
    private void enableLayers(final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            int mPageTransformerLayerType;
            if (b) {
                mPageTransformerLayerType = this.mPageTransformerLayerType;
            }
            else {
                mPageTransformerLayerType = 0;
            }
            this.getChildAt(i).setLayerType(mPageTransformerLayerType, (Paint)null);
        }
    }
    
    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        final VelocityTracker mVelocityTracker = this.mVelocityTracker;
        if (mVelocityTracker != null) {
            mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }
    
    private Rect getChildRectInPagerCoordinates(final Rect rect, final View view) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager viewPager;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof ViewGroup && viewParent != this; viewParent = viewPager.getParent()) {
            viewPager = (ViewPager)viewParent;
            rect2.left += viewPager.getLeft();
            rect2.right += viewPager.getRight();
            rect2.top += viewPager.getTop();
            rect2.bottom += viewPager.getBottom();
        }
        return rect2;
    }
    
    private int getClientWidth() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }
    
    private f infoForCurrentScrollPosition() {
        final int clientWidth = this.getClientWidth();
        float e = 0.0f;
        float n;
        if (clientWidth > 0) {
            n = this.getScrollX() / (float)clientWidth;
        }
        else {
            n = 0.0f;
        }
        float n2;
        if (clientWidth > 0) {
            n2 = this.mPageMargin / (float)clientWidth;
        }
        else {
            n2 = 0.0f;
        }
        f f = null;
        float d = 0.0f;
        int b = -1;
        int i = 0;
        int n3 = 1;
        while (i < this.mItems.size()) {
            final f f2 = this.mItems.get(i);
            int n4 = i;
            f mTempItem = f2;
            if (n3 == 0) {
                final int b2 = f2.b;
                ++b;
                n4 = i;
                mTempItem = f2;
                if (b2 != b) {
                    mTempItem = this.mTempItem;
                    mTempItem.e = e + d + n2;
                    mTempItem.b = b;
                    mTempItem.d = this.mAdapter.getPageWidth(b);
                    n4 = i - 1;
                }
            }
            e = mTempItem.e;
            final float d2 = mTempItem.d;
            if (n3 == 0 && n < e) {
                return f;
            }
            if (n < d2 + e + n2 || n4 == this.mItems.size() - 1) {
                return mTempItem;
            }
            b = mTempItem.b;
            d = mTempItem.d;
            i = n4 + 1;
            n3 = 0;
            f = mTempItem;
        }
        return f;
    }
    
    private static boolean isDecorView(@j0 final View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }
    
    private boolean isGutterDrag(final float n, final float n2) {
        return (n < this.mGutterSize && n2 > 0.0f) || (n > this.getWidth() - this.mGutterSize && n2 < 0.0f);
    }
    
    private void onSecondaryPointerUp(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.mLastMotionX = motionEvent.getX(n);
            this.mActivePointerId = motionEvent.getPointerId(n);
            final VelocityTracker mVelocityTracker = this.mVelocityTracker;
            if (mVelocityTracker != null) {
                mVelocityTracker.clear();
            }
        }
    }
    
    private boolean pageScrolled(int n) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            this.onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        else {
            final f infoForCurrentScrollPosition = this.infoForCurrentScrollPosition();
            final int clientWidth = this.getClientWidth();
            final int mPageMargin = this.mPageMargin;
            final float n2 = (float)mPageMargin;
            final float n3 = (float)clientWidth;
            final float n4 = n2 / n3;
            final int b = infoForCurrentScrollPosition.b;
            final float n5 = (n / n3 - infoForCurrentScrollPosition.e) / (infoForCurrentScrollPosition.d + n4);
            n = (int)((clientWidth + mPageMargin) * n5);
            this.mCalledSuper = false;
            this.onPageScrolled(b, n5, n);
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }
    
    private boolean performDrag(float mLastMotionX) {
        final float mLastMotionX2 = this.mLastMotionX;
        this.mLastMotionX = mLastMotionX;
        final float n = this.getScrollX() + (mLastMotionX2 - mLastMotionX);
        final float n2 = (float)this.getClientWidth();
        mLastMotionX = this.mFirstOffset * n2;
        float n3 = this.mLastOffset * n2;
        final ArrayList<f> mItems = this.mItems;
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        final f f = mItems.get(0);
        final ArrayList<f> mItems2 = this.mItems;
        final f f2 = mItems2.get(mItems2.size() - 1);
        boolean b4;
        if (f.b != 0) {
            mLastMotionX = f.e * n2;
            b4 = false;
        }
        else {
            b4 = true;
        }
        boolean b5;
        if (f2.b != this.mAdapter.getCount() - 1) {
            n3 = f2.e * n2;
            b5 = false;
        }
        else {
            b5 = true;
        }
        if (n < mLastMotionX) {
            if (b4) {
                this.mLeftEdge.onPull(Math.abs(mLastMotionX - n) / n2);
                b3 = true;
            }
        }
        else {
            b3 = b2;
            mLastMotionX = n;
            if (n > n3) {
                b3 = b;
                if (b5) {
                    this.mRightEdge.onPull(Math.abs(n - n3) / n2);
                    b3 = true;
                }
                mLastMotionX = n3;
            }
        }
        final float mLastMotionX3 = this.mLastMotionX;
        final int n4 = (int)mLastMotionX;
        this.mLastMotionX = mLastMotionX3 + (mLastMotionX - n4);
        this.scrollTo(n4, this.getScrollY());
        this.pageScrolled(n4);
        return b3;
    }
    
    private void recomputeScrollPosition(int n, final int n2, final int n3, final int n4) {
        if (n2 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(this.getCurrentItem() * this.getClientWidth());
                return;
            }
            n = (int)(this.getScrollX() / (float)(n2 - this.getPaddingLeft() - this.getPaddingRight() + n4) * (n - this.getPaddingLeft() - this.getPaddingRight() + n3));
        }
        else {
            final f infoForPosition = this.infoForPosition(this.mCurItem);
            float min;
            if (infoForPosition != null) {
                min = Math.min(infoForPosition.e, this.mLastOffset);
            }
            else {
                min = 0.0f;
            }
            n = (int)(min * (n - this.getPaddingLeft() - this.getPaddingRight()));
            if (n == this.getScrollX()) {
                return;
            }
            this.completeScroll(false);
        }
        this.scrollTo(n, this.getScrollY());
    }
    
    private void removeNonDecorViews() {
        int n;
        for (int i = 0; i < this.getChildCount(); i = n + 1) {
            n = i;
            if (!((g)this.getChildAt(i).getLayoutParams()).a) {
                this.removeViewAt(i);
                n = i - 1;
            }
        }
    }
    
    private void requestParentDisallowInterceptTouchEvent(final boolean b) {
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(b);
        }
    }
    
    private boolean resetTouch() {
        this.mActivePointerId = -1;
        this.endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }
    
    private void scrollToItem(final int n, final boolean b, final int n2, final boolean b2) {
        final f infoForPosition = this.infoForPosition(n);
        int n3;
        if (infoForPosition != null) {
            n3 = (int)(this.getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.e, this.mLastOffset)));
        }
        else {
            n3 = 0;
        }
        if (b) {
            this.smoothScrollTo(n3, 0, n2);
            if (b2) {
                this.dispatchOnPageSelected(n);
            }
        }
        else {
            if (b2) {
                this.dispatchOnPageSelected(n);
            }
            this.completeScroll(false);
            this.scrollTo(n3, 0);
            this.pageScrolled(n3);
        }
    }
    
    private void setScrollingCacheEnabled(final boolean mScrollingCacheEnabled) {
        if (this.mScrollingCacheEnabled != mScrollingCacheEnabled) {
            this.mScrollingCacheEnabled = mScrollingCacheEnabled;
        }
    }
    
    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            final ArrayList<View> mDrawingOrderedChildren = this.mDrawingOrderedChildren;
            if (mDrawingOrderedChildren == null) {
                this.mDrawingOrderedChildren = new ArrayList<View>();
            }
            else {
                mDrawingOrderedChildren.clear();
            }
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.mDrawingOrderedChildren.add(this.getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, ViewPager.sPositionComparator);
        }
    }
    
    public void addFocusables(final ArrayList<View> list, final int n, final int n2) {
        final int size = list.size();
        final int descendantFocusability = this.getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (child.getVisibility() == 0) {
                    final f infoForChild = this.infoForChild(child);
                    if (infoForChild != null && infoForChild.b == this.mCurItem) {
                        child.addFocusables((ArrayList)list, n, n2);
                    }
                }
            }
        }
        if (descendantFocusability != 262144 || size == list.size()) {
            if (!this.isFocusable()) {
                return;
            }
            if ((n2 & 0x1) == 0x1 && this.isInTouchMode() && !this.isFocusableInTouchMode()) {
                return;
            }
            list.add((View)this);
        }
    }
    
    f addNewItem(final int b, final int index) {
        final f f = new f();
        f.b = b;
        f.a = this.mAdapter.instantiateItem(this, b);
        f.d = this.mAdapter.getPageWidth(b);
        if (index >= 0 && index < this.mItems.size()) {
            this.mItems.add(index, f);
        }
        else {
            this.mItems.add(f);
        }
        return f;
    }
    
    public void addOnAdapterChangeListener(@j0 final i i) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList<i>();
        }
        this.mAdapterChangeListeners.add(i);
    }
    
    public void addOnPageChangeListener(@j0 final j j) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList<j>();
        }
        this.mOnPageChangeListeners.add(j);
    }
    
    public void addTouchables(final ArrayList<View> list) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final f infoForChild = this.infoForChild(child);
                if (infoForChild != null && infoForChild.b == this.mCurItem) {
                    child.addTouchables((ArrayList)list);
                }
            }
        }
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        ViewGroup$LayoutParams generateLayoutParams = viewGroup$LayoutParams;
        if (!this.checkLayoutParams(viewGroup$LayoutParams)) {
            generateLayoutParams = this.generateLayoutParams(viewGroup$LayoutParams);
        }
        final g g = (g)generateLayoutParams;
        final boolean a = g.a | isDecorView(view);
        g.a = a;
        if (this.mInLayout) {
            if (a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            g.d = true;
            this.addViewInLayout(view, n, generateLayoutParams);
        }
        else {
            super.addView(view, n, generateLayoutParams);
        }
    }
    
    public boolean arrowScroll(final int n) {
        final View focus = this.findFocus();
        boolean b = false;
        View view = null;
        Label_0188: {
            Label_0012: {
                if (focus != this) {
                    if ((view = focus) != null) {
                        ViewParent viewParent = focus.getParent();
                        while (true) {
                            while (viewParent instanceof ViewGroup) {
                                if (viewParent == this) {
                                    final boolean b2 = true;
                                    view = focus;
                                    if (!b2) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(focus.getClass().getSimpleName());
                                        for (ViewParent viewParent2 = focus.getParent(); viewParent2 instanceof ViewGroup; viewParent2 = viewParent2.getParent()) {
                                            sb.append(" => ");
                                            sb.append(viewParent2.getClass().getSimpleName());
                                        }
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                                        sb2.append(sb.toString());
                                        Log.e("ViewPager", sb2.toString());
                                        break Label_0012;
                                    }
                                    break Label_0188;
                                }
                                else {
                                    viewParent = viewParent.getParent();
                                }
                            }
                            final boolean b2 = false;
                            continue;
                        }
                    }
                    break Label_0188;
                }
            }
            view = null;
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, n);
        Label_0365: {
            if (nextFocus != null && nextFocus != view) {
                Label_0269: {
                    if (n == 17) {
                        final int left = this.getChildRectInPagerCoordinates(this.mTempRect, nextFocus).left;
                        final int left2 = this.getChildRectInPagerCoordinates(this.mTempRect, view).left;
                        if (view != null && left >= left2) {
                            b = this.pageLeft();
                            break Label_0269;
                        }
                    }
                    else {
                        if (n != 66) {
                            break Label_0365;
                        }
                        final int left3 = this.getChildRectInPagerCoordinates(this.mTempRect, nextFocus).left;
                        final int left4 = this.getChildRectInPagerCoordinates(this.mTempRect, view).left;
                        if (view != null && left3 <= left4) {
                            b = this.pageRight();
                            break Label_0269;
                        }
                    }
                    b = nextFocus.requestFocus();
                }
            }
            else if (n != 17 && n != 1) {
                if (n == 66 || n == 2) {
                    b = this.pageRight();
                }
            }
            else {
                b = this.pageLeft();
            }
        }
        if (b) {
            this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(n));
        }
        return b;
    }
    
    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        this.setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        final VelocityTracker mVelocityTracker = this.mVelocityTracker;
        if (mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        else {
            mVelocityTracker.clear();
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }
    
    protected boolean canScroll(final View view, final boolean b, final int n, final int n2, final int n3) {
        final boolean b2 = view instanceof ViewGroup;
        final boolean b3 = true;
        if (b2) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                final int n4 = n2 + scrollX;
                if (n4 >= child.getLeft() && n4 < child.getRight()) {
                    final int n5 = n3 + scrollY;
                    if (n5 >= child.getTop() && n5 < child.getBottom() && this.canScroll(child, true, n, n4 - child.getLeft(), n5 - child.getTop())) {
                        return true;
                    }
                }
            }
        }
        return b && view.canScrollHorizontally(-n) && b3;
    }
    
    public boolean canScrollHorizontally(final int n) {
        final a mAdapter = this.mAdapter;
        final boolean b = false;
        boolean b2 = false;
        if (mAdapter == null) {
            return false;
        }
        final int clientWidth = this.getClientWidth();
        final int scrollX = this.getScrollX();
        if (n < 0) {
            if (scrollX > (int)(clientWidth * this.mFirstOffset)) {
                b2 = true;
            }
            return b2;
        }
        boolean b3 = b;
        if (n > 0) {
            b3 = b;
            if (scrollX < (int)(clientWidth * this.mLastOffset)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof g && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void clearOnPageChangeListeners() {
        final List<j> mOnPageChangeListeners = this.mOnPageChangeListeners;
        if (mOnPageChangeListeners != null) {
            mOnPageChangeListeners.clear();
        }
    }
    
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.mScroller.getCurrX();
            final int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
                if (!this.pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    this.scrollTo(0, currY);
                }
            }
            androidx.core.view.j0.l1((View)this);
            return;
        }
        this.completeScroll(true);
    }
    
    void dataSetChanged() {
        final int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean b = this.mItems.size() < this.mOffscreenPageLimit * 2 + 1 && this.mItems.size() < count;
        int n = this.mCurItem;
        int i = 0;
        int n2 = 0;
        while (i < this.mItems.size()) {
            final f f = this.mItems.get(i);
            final int itemPosition = this.mAdapter.getItemPosition(f.a);
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            Label_0285: {
                if (itemPosition == -1) {
                    n3 = n;
                    n4 = i;
                    n5 = n2;
                }
                else {
                    if (itemPosition == -2) {
                        this.mItems.remove(i);
                        final int n6 = i - 1;
                        int n7;
                        if ((n7 = n2) == 0) {
                            this.mAdapter.startUpdate(this);
                            n7 = 1;
                        }
                        this.mAdapter.destroyItem(this, f.b, f.a);
                        final int mCurItem = this.mCurItem;
                        i = n6;
                        n2 = n7;
                        if (mCurItem == f.b) {
                            n = Math.max(0, Math.min(mCurItem, count - 1));
                            n2 = n7;
                            i = n6;
                        }
                    }
                    else {
                        final int b2 = f.b;
                        n3 = n;
                        n4 = i;
                        n5 = n2;
                        if (b2 == itemPosition) {
                            break Label_0285;
                        }
                        if (b2 == this.mCurItem) {
                            n = itemPosition;
                        }
                        f.b = itemPosition;
                    }
                    b = true;
                    n3 = n;
                    n4 = i;
                    n5 = n2;
                }
            }
            i = n4 + 1;
            n = n3;
            n2 = n5;
        }
        if (n2 != 0) {
            this.mAdapter.finishUpdate(this);
        }
        Collections.sort(this.mItems, ViewPager.COMPARATOR);
        if (b) {
            for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
                final g g = (g)this.getChildAt(j).getLayoutParams();
                if (!g.a) {
                    g.c = 0.0f;
                }
            }
            this.setCurrentItemInternal(n, false, true);
            this.requestLayout();
        }
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.executeKeyEvent(keyEvent);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final f infoForChild = this.infoForChild(child);
                if (infoForChild != null && infoForChild.b == this.mCurItem && child.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    float distanceInfluenceForSnapDuration(final float n) {
        return (float)Math.sin((n - 0.5f) * 0.47123894f);
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        final int overScrollMode = this.getOverScrollMode();
        int n = 0;
        int n2 = 0;
        Label_0255: {
            Label_0064: {
                if (overScrollMode != 0) {
                    if (overScrollMode == 1) {
                        final a mAdapter = this.mAdapter;
                        if (mAdapter != null && mAdapter.getCount() > 1) {
                            break Label_0064;
                        }
                    }
                    this.mLeftEdge.finish();
                    this.mRightEdge.finish();
                    break Label_0255;
                }
            }
            if (!this.mLeftEdge.isFinished()) {
                final int save = canvas.save();
                final int n3 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                final int width = this.getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float)(-n3 + this.getPaddingTop()), this.mFirstOffset * width);
                this.mLeftEdge.setSize(n3, width);
                n2 = ((false | this.mLeftEdge.draw(canvas)) ? 1 : 0);
                canvas.restoreToCount(save);
            }
            n = n2;
            if (!this.mRightEdge.isFinished()) {
                final int save2 = canvas.save();
                final int width2 = this.getWidth();
                final int height = this.getHeight();
                final int paddingTop = this.getPaddingTop();
                final int paddingBottom = this.getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float)(-this.getPaddingTop()), -(this.mLastOffset + 1.0f) * width2);
                this.mRightEdge.setSize(height - paddingTop - paddingBottom, width2);
                n = (n2 | (this.mRightEdge.draw(canvas) ? 1 : 0));
                canvas.restoreToCount(save2);
            }
        }
        if (n != 0) {
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable mMarginDrawable = this.mMarginDrawable;
        if (mMarginDrawable != null && mMarginDrawable.isStateful()) {
            mMarginDrawable.setState(this.getDrawableState());
        }
    }
    
    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                final VelocityTracker mVelocityTracker = this.mVelocityTracker;
                mVelocityTracker.computeCurrentVelocity(1000, (float)this.mMaximumVelocity);
                final int n = (int)mVelocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                final int clientWidth = this.getClientWidth();
                final int scrollX = this.getScrollX();
                final f infoForCurrentScrollPosition = this.infoForCurrentScrollPosition();
                this.setCurrentItemInternal(this.determineTargetPage(infoForCurrentScrollPosition.b, (scrollX / (float)clientWidth - infoForCurrentScrollPosition.e) / infoForCurrentScrollPosition.d, n, (int)(this.mLastMotionX - this.mInitialMotionX)), true, true, n);
            }
            this.endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }
    
    public boolean executeKeyEvent(@j0 final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            final int keyCode = keyEvent.getKeyCode();
            int n;
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode != 61) {
                        return false;
                    }
                    if (keyEvent.hasNoModifiers()) {
                        return this.arrowScroll(2);
                    }
                    if (keyEvent.hasModifiers(1)) {
                        return this.arrowScroll(1);
                    }
                    return false;
                }
                else {
                    if (keyEvent.hasModifiers(2)) {
                        return this.pageRight();
                    }
                    n = 66;
                }
            }
            else {
                if (keyEvent.hasModifiers(2)) {
                    return this.pageLeft();
                }
                n = 17;
            }
            return this.arrowScroll(n);
        }
        return false;
    }
    
    public void fakeDragBy(float n) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += n;
        final float n2 = this.getScrollX() - n;
        final float n3 = (float)this.getClientWidth();
        n = this.mFirstOffset * n3;
        float n4 = this.mLastOffset * n3;
        final f f = this.mItems.get(0);
        final ArrayList<f> mItems = this.mItems;
        final f f2 = mItems.get(mItems.size() - 1);
        if (f.b != 0) {
            n = f.e * n3;
        }
        if (f2.b != this.mAdapter.getCount() - 1) {
            n4 = f2.e * n3;
        }
        if (n2 >= n) {
            n = n2;
            if (n2 > n4) {
                n = n4;
            }
        }
        final float mLastMotionX = this.mLastMotionX;
        final int n5 = (int)n;
        this.mLastMotionX = mLastMotionX + (n - n5);
        this.scrollTo(n5, this.getScrollY());
        this.pageScrolled(n5);
        final MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new g();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new g(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return this.generateDefaultLayoutParams();
    }
    
    @k0
    public a getAdapter() {
        return this.mAdapter;
    }
    
    protected int getChildDrawingOrder(final int n, final int n2) {
        int index = n2;
        if (this.mDrawingOrder == 2) {
            index = n - 1 - n2;
        }
        return ((g)this.mDrawingOrderedChildren.get(index).getLayoutParams()).f;
    }
    
    public int getCurrentItem() {
        return this.mCurItem;
    }
    
    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }
    
    public int getPageMargin() {
        return this.mPageMargin;
    }
    
    f infoForAnyChild(View view) {
        while (true) {
            final ViewParent parent = view.getParent();
            if (parent == this) {
                return this.infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View)parent;
        }
    }
    
    f infoForChild(final View view) {
        for (int i = 0; i < this.mItems.size(); ++i) {
            final f f = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, f.a)) {
                return f;
            }
        }
        return null;
    }
    
    f infoForPosition(final int n) {
        for (int i = 0; i < this.mItems.size(); ++i) {
            final f f = this.mItems.get(i);
            if (f.b == n) {
                return f;
            }
        }
        return null;
    }
    
    void initViewPager() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        final Context context = this.getContext();
        this.mScroller = new Scroller(context, ViewPager.sInterpolator);
        final ViewConfiguration value = ViewConfiguration.get(context);
        final float density = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = value.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int)(400.0f * density);
        this.mMaximumVelocity = value.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int)(25.0f * density);
        this.mCloseEnough = (int)(2.0f * density);
        this.mDefaultGutterSize = (int)(density * 16.0f);
        androidx.core.view.j0.z1((View)this, new h());
        if (androidx.core.view.j0.T((View)this) == 0) {
            androidx.core.view.j0.P1((View)this, 1);
        }
        androidx.core.view.j0.Y1((View)this, new a0() {
            private final Rect a = new Rect();
            
            @Override
            public x0 a(final View view, x0 e1) {
                e1 = androidx.core.view.j0.e1(view, e1);
                if (e1.A()) {
                    return e1;
                }
                final Rect a = this.a;
                a.left = e1.p();
                a.top = e1.r();
                a.right = e1.q();
                a.bottom = e1.o();
                for (int i = 0; i < ViewPager.this.getChildCount(); ++i) {
                    final x0 o = androidx.core.view.j0.o(ViewPager.this.getChildAt(i), e1);
                    a.left = Math.min(o.p(), a.left);
                    a.top = Math.min(o.r(), a.top);
                    a.right = Math.min(o.q(), a.right);
                    a.bottom = Math.min(o.o(), a.bottom);
                }
                return e1.D(a.left, a.top, a.right, a.bottom);
            }
        });
    }
    
    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }
    
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.mEndScrollRunnable);
        final Scroller mScroller = this.mScroller;
        if (mScroller != null && !mScroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            final int scrollX = this.getScrollX();
            final int width = this.getWidth();
            final float n = (float)this.mPageMargin;
            final float n2 = (float)width;
            final float n3 = n / n2;
            final ArrayList<f> mItems = this.mItems;
            int index = 0;
            f f = mItems.get(0);
            float e = f.e;
            for (int size = this.mItems.size(), i = f.b; i < this.mItems.get(size - 1).b; ++i) {
                int b;
                while (true) {
                    b = f.b;
                    if (i <= b || index >= size) {
                        break;
                    }
                    final ArrayList<f> mItems2 = this.mItems;
                    ++index;
                    f = mItems2.get(index);
                }
                float a;
                if (i == b) {
                    final float e2 = f.e;
                    final float d = f.d;
                    a = (e2 + d) * n2;
                    e = e2 + d + n3;
                }
                else {
                    final float pageWidth = this.mAdapter.getPageWidth(i);
                    a = (e + pageWidth) * n2;
                    e += pageWidth + n3;
                }
                if (this.mPageMargin + a > scrollX) {
                    this.mMarginDrawable.setBounds(Math.round(a), this.mTopPageBounds, Math.round(this.mPageMargin + a), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                }
                if (a > scrollX + width) {
                    break;
                }
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int n = motionEvent.getAction() & 0xFF;
        if (n != 3 && n != 1) {
            if (n != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (n != 0) {
                if (n != 2) {
                    if (n == 6) {
                        this.onSecondaryPointerUp(motionEvent);
                    }
                }
                else {
                    final int mActivePointerId = this.mActivePointerId;
                    if (mActivePointerId != -1) {
                        final int pointerIndex = motionEvent.findPointerIndex(mActivePointerId);
                        final float x = motionEvent.getX(pointerIndex);
                        final float a = x - this.mLastMotionX;
                        final float abs = Math.abs(a);
                        final float y = motionEvent.getY(pointerIndex);
                        final float abs2 = Math.abs(y - this.mInitialMotionY);
                        final float n2 = fcmpl(a, 0.0f);
                        if (n2 != 0 && !this.isGutterDrag(this.mLastMotionX, a) && this.canScroll((View)this, false, (int)a, (int)x, (int)y)) {
                            this.mLastMotionX = x;
                            this.mLastMotionY = y;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        final int mTouchSlop = this.mTouchSlop;
                        if (abs > mTouchSlop && abs * 0.5f > abs2) {
                            this.requestParentDisallowInterceptTouchEvent(this.mIsBeingDragged = true);
                            this.setScrollState(1);
                            final float mInitialMotionX = this.mInitialMotionX;
                            final float n3 = (float)this.mTouchSlop;
                            float mLastMotionX;
                            if (n2 > 0) {
                                mLastMotionX = mInitialMotionX + n3;
                            }
                            else {
                                mLastMotionX = mInitialMotionX - n3;
                            }
                            this.mLastMotionX = mLastMotionX;
                            this.mLastMotionY = y;
                            this.setScrollingCacheEnabled(true);
                        }
                        else if (abs2 > mTouchSlop) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && this.performDrag(x)) {
                            androidx.core.view.j0.l1((View)this);
                        }
                    }
                }
            }
            else {
                final float x2 = motionEvent.getX();
                this.mInitialMotionX = x2;
                this.mLastMotionX = x2;
                final float y2 = motionEvent.getY();
                this.mInitialMotionY = y2;
                this.mLastMotionY = y2;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    this.populate();
                    this.requestParentDisallowInterceptTouchEvent(this.mIsBeingDragged = true);
                    this.setScrollState(1);
                }
                else {
                    this.completeScroll(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        this.resetTouch();
        return false;
    }
    
    protected void onLayout(final boolean b, int paddingTop, int paddingLeft, int paddingBottom, int paddingRight) {
        final int childCount = this.getChildCount();
        final int n = paddingBottom - paddingTop;
        final int n2 = paddingRight - paddingLeft;
        paddingLeft = this.getPaddingLeft();
        paddingTop = this.getPaddingTop();
        paddingRight = this.getPaddingRight();
        paddingBottom = this.getPaddingBottom();
        final int scrollX = this.getScrollX();
        int i = 0;
        int mDecorChildCount = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n3 = paddingLeft;
            int n4 = paddingTop;
            int n5 = paddingRight;
            int n6 = paddingBottom;
            int n7 = mDecorChildCount;
            if (child.getVisibility() != 8) {
                final g g = (g)child.getLayoutParams();
                n3 = paddingLeft;
                n4 = paddingTop;
                n5 = paddingRight;
                n6 = paddingBottom;
                n7 = mDecorChildCount;
                if (g.a) {
                    final int b2 = g.b;
                    final int n8 = b2 & 0x7;
                    final int n9 = b2 & 0x70;
                    int n11 = 0;
                    Label_0246: {
                        int max;
                        if (n8 != 1) {
                            if (n8 == 3) {
                                final int n10 = child.getMeasuredWidth() + paddingLeft;
                                n11 = paddingLeft;
                                paddingLeft = n10;
                                break Label_0246;
                            }
                            if (n8 != 5) {
                                final int n12 = paddingLeft;
                                n11 = paddingLeft;
                                paddingLeft = n12;
                                break Label_0246;
                            }
                            max = n - paddingRight - child.getMeasuredWidth();
                            paddingRight += child.getMeasuredWidth();
                        }
                        else {
                            max = Math.max((n - child.getMeasuredWidth()) / 2, paddingLeft);
                        }
                        n11 = max;
                    }
                    int max2;
                    if (n9 != 16) {
                        if (n9 != 48) {
                            if (n9 != 80) {
                                final int n13 = paddingTop;
                                max2 = paddingTop;
                                paddingTop = n13;
                            }
                            else {
                                max2 = n2 - paddingBottom - child.getMeasuredHeight();
                                paddingBottom += child.getMeasuredHeight();
                            }
                        }
                        else {
                            final int n14 = child.getMeasuredHeight() + paddingTop;
                            max2 = paddingTop;
                            paddingTop = n14;
                        }
                    }
                    else {
                        max2 = Math.max((n2 - child.getMeasuredHeight()) / 2, paddingTop);
                    }
                    final int n15 = n11 + scrollX;
                    child.layout(n15, max2, child.getMeasuredWidth() + n15, max2 + child.getMeasuredHeight());
                    n7 = mDecorChildCount + 1;
                    n6 = paddingBottom;
                    n5 = paddingRight;
                    n4 = paddingTop;
                    n3 = paddingLeft;
                }
            }
            ++i;
            paddingLeft = n3;
            paddingTop = n4;
            paddingRight = n5;
            paddingBottom = n6;
            mDecorChildCount = n7;
        }
        for (int j = 0; j < childCount; ++j) {
            final View child2 = this.getChildAt(j);
            if (child2.getVisibility() != 8) {
                final g g2 = (g)child2.getLayoutParams();
                if (!g2.a) {
                    final f infoForChild = this.infoForChild(child2);
                    if (infoForChild != null) {
                        final float n16 = (float)(n - paddingLeft - paddingRight);
                        final int n17 = (int)(infoForChild.e * n16) + paddingLeft;
                        if (g2.d) {
                            g2.d = false;
                            child2.measure(View$MeasureSpec.makeMeasureSpec((int)(n16 * g2.c), 1073741824), View$MeasureSpec.makeMeasureSpec(n2 - paddingTop - paddingBottom, 1073741824));
                        }
                        child2.layout(n17, paddingTop, child2.getMeasuredWidth() + n17, child2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = n2 - paddingBottom;
        this.mDecorChildCount = mDecorChildCount;
        if (this.mFirstLayout) {
            this.scrollToItem(this.mCurItem, false, 0, false);
        }
        this.mFirstLayout = false;
    }
    
    protected void onMeasure(int measuredWidth, int i) {
        final int n = 0;
        this.setMeasuredDimension(ViewGroup.getDefaultSize(0, measuredWidth), ViewGroup.getDefaultSize(0, i));
        measuredWidth = this.getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        measuredWidth = measuredWidth - this.getPaddingLeft() - this.getPaddingRight();
        i = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        final int childCount = this.getChildCount();
        int n2 = 0;
        while (true) {
            final int n3 = 1;
            int n4 = 1073741824;
            if (n2 >= childCount) {
                break;
            }
            final View child = this.getChildAt(n2);
            int n5 = measuredWidth;
            int n6 = i;
            if (child.getVisibility() != 8) {
                final g g = (g)child.getLayoutParams();
                n5 = measuredWidth;
                n6 = i;
                if (g != null) {
                    n5 = measuredWidth;
                    n6 = i;
                    if (g.a) {
                        final int b = g.b;
                        final int n7 = b & 0x7;
                        final int n8 = b & 0x70;
                        final boolean b2 = n8 == 48 || n8 == 80;
                        int n9 = n3;
                        if (n7 != 3) {
                            if (n7 == 5) {
                                n9 = n3;
                            }
                            else {
                                n9 = 0;
                            }
                        }
                        final int n10 = Integer.MIN_VALUE;
                        int n11 = 0;
                        int n13 = 0;
                        Label_0267: {
                            if (b2) {
                                n11 = 1073741824;
                            }
                            else {
                                n11 = n10;
                                if (n9 != 0) {
                                    final int n12 = 1073741824;
                                    n11 = n10;
                                    n13 = n12;
                                    break Label_0267;
                                }
                            }
                            n13 = Integer.MIN_VALUE;
                        }
                        final int width = g.width;
                        int n15;
                        int n16;
                        if (width != -2) {
                            int n14;
                            if (width != -1) {
                                n14 = width;
                            }
                            else {
                                n14 = measuredWidth;
                            }
                            n15 = 1073741824;
                            n16 = n14;
                        }
                        else {
                            n16 = measuredWidth;
                            n15 = n11;
                        }
                        final int height = g.height;
                        int n17;
                        if (height != -2) {
                            if (height != -1) {
                                n17 = height;
                            }
                            else {
                                n17 = i;
                            }
                        }
                        else {
                            final int n18 = i;
                            n4 = n13;
                            n17 = n18;
                        }
                        child.measure(View$MeasureSpec.makeMeasureSpec(n16, n15), View$MeasureSpec.makeMeasureSpec(n17, n4));
                        if (b2) {
                            n6 = i - child.getMeasuredHeight();
                            n5 = measuredWidth;
                        }
                        else {
                            n5 = measuredWidth;
                            n6 = i;
                            if (n9 != 0) {
                                n5 = measuredWidth - child.getMeasuredWidth();
                                n6 = i;
                            }
                        }
                    }
                }
            }
            ++n2;
            measuredWidth = n5;
            i = n6;
        }
        this.mChildWidthMeasureSpec = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.mChildHeightMeasureSpec = View$MeasureSpec.makeMeasureSpec(i, 1073741824);
        this.mInLayout = true;
        this.populate();
        this.mInLayout = false;
        int childCount2;
        View child2;
        g g2;
        for (childCount2 = this.getChildCount(), i = n; i < childCount2; ++i) {
            child2 = this.getChildAt(i);
            if (child2.getVisibility() != 8) {
                g2 = (g)child2.getLayoutParams();
                if (g2 == null || !g2.a) {
                    child2.measure(View$MeasureSpec.makeMeasureSpec((int)(measuredWidth * g2.c), 1073741824), this.mChildHeightMeasureSpec);
                }
            }
        }
    }
    
    @androidx.annotation.i
    protected void onPageScrolled(int i, float n, int childCount) {
        final int mDecorChildCount = this.mDecorChildCount;
        final int n2 = 0;
        if (mDecorChildCount > 0) {
            final int scrollX = this.getScrollX();
            int paddingLeft = this.getPaddingLeft();
            int paddingRight = this.getPaddingRight();
            final int width = this.getWidth();
            for (int childCount2 = this.getChildCount(), j = 0; j < childCount2; ++j) {
                final View child = this.getChildAt(j);
                final g g = (g)child.getLayoutParams();
                if (g.a) {
                    final int n3 = g.b & 0x7;
                    int max;
                    if (n3 != 1) {
                        if (n3 != 3) {
                            if (n3 != 5) {
                                final int n4 = paddingLeft;
                                max = paddingLeft;
                                paddingLeft = n4;
                            }
                            else {
                                max = width - paddingRight - child.getMeasuredWidth();
                                paddingRight += child.getMeasuredWidth();
                            }
                        }
                        else {
                            final int n5 = child.getWidth() + paddingLeft;
                            max = paddingLeft;
                            paddingLeft = n5;
                        }
                    }
                    else {
                        max = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    final int n6 = max + scrollX - child.getLeft();
                    if (n6 != 0) {
                        child.offsetLeftAndRight(n6);
                    }
                }
            }
        }
        this.dispatchOnPageScrolled(i, n, childCount);
        if (this.mPageTransformer != null) {
            final int scrollX2 = this.getScrollX();
            View child2;
            for (childCount = this.getChildCount(), i = n2; i < childCount; ++i) {
                child2 = this.getChildAt(i);
                if (!((g)child2.getLayoutParams()).a) {
                    n = (child2.getLeft() - scrollX2) / (float)this.getClientWidth();
                    this.mPageTransformer.a(child2, n);
                }
            }
        }
        this.mCalledSuper = true;
    }
    
    protected boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int i = this.getChildCount();
        int n2 = -1;
        int n3;
        if ((n & 0x2) != 0x0) {
            n2 = i;
            i = 0;
            n3 = 1;
        }
        else {
            --i;
            n3 = -1;
        }
        while (i != n2) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final f infoForChild = this.infoForChild(child);
                if (infoForChild != null && infoForChild.b == this.mCurItem && child.requestFocus(n, rect)) {
                    return true;
                }
            }
            i += n3;
        }
        return false;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final m m = (m)parcelable;
        super.onRestoreInstanceState(m.a());
        final a mAdapter = this.mAdapter;
        if (mAdapter != null) {
            mAdapter.restoreState(m.J, m.K);
            this.setCurrentItemInternal(m.I, false, true);
        }
        else {
            this.mRestoredCurItem = m.I;
            this.mRestoredAdapterState = m.J;
            this.mRestoredClassLoader = m.K;
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final m m = new m(super.onSaveInstanceState());
        m.I = this.mCurItem;
        final a mAdapter = this.mAdapter;
        if (mAdapter != null) {
            m.J = mAdapter.saveState();
        }
        return (Parcelable)m;
    }
    
    protected void onSizeChanged(final int n, int mPageMargin, final int n2, final int n3) {
        super.onSizeChanged(n, mPageMargin, n2, n3);
        if (n != n2) {
            mPageMargin = this.mPageMargin;
            this.recomputeScrollPosition(n, n2, mPageMargin, mPageMargin);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.mFakeDragging) {
            return true;
        }
        final int action = motionEvent.getAction();
        boolean resetTouch = false;
        if (action == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        final a mAdapter = this.mAdapter;
        if (mAdapter != null && mAdapter.getCount() != 0) {
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            final int n = motionEvent.getAction() & 0xFF;
            Label_0590: {
                int mActivePointerId = 0;
                Label_0585: {
                    if (n != 0) {
                        Label_0519: {
                            if (n != 1) {
                                if (n != 2) {
                                    if (n != 3) {
                                        if (n == 5) {
                                            final int actionIndex = motionEvent.getActionIndex();
                                            this.mLastMotionX = motionEvent.getX(actionIndex);
                                            mActivePointerId = motionEvent.getPointerId(actionIndex);
                                            break Label_0585;
                                        }
                                        if (n != 6) {
                                            break Label_0590;
                                        }
                                        this.onSecondaryPointerUp(motionEvent);
                                        this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                                        break Label_0590;
                                    }
                                    else {
                                        if (!this.mIsBeingDragged) {
                                            break Label_0590;
                                        }
                                        this.scrollToItem(this.mCurItem, true, 0, false);
                                    }
                                }
                                else {
                                    if (!this.mIsBeingDragged) {
                                        final int pointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                                        if (pointerIndex == -1) {
                                            break Label_0519;
                                        }
                                        final float x = motionEvent.getX(pointerIndex);
                                        final float abs = Math.abs(x - this.mLastMotionX);
                                        final float y = motionEvent.getY(pointerIndex);
                                        final float abs2 = Math.abs(y - this.mLastMotionY);
                                        if (abs > this.mTouchSlop && abs > abs2) {
                                            this.requestParentDisallowInterceptTouchEvent(this.mIsBeingDragged = true);
                                            final float mInitialMotionX = this.mInitialMotionX;
                                            float mLastMotionX;
                                            if (x - mInitialMotionX > 0.0f) {
                                                mLastMotionX = mInitialMotionX + this.mTouchSlop;
                                            }
                                            else {
                                                mLastMotionX = mInitialMotionX - this.mTouchSlop;
                                            }
                                            this.mLastMotionX = mLastMotionX;
                                            this.mLastMotionY = y;
                                            this.setScrollState(1);
                                            this.setScrollingCacheEnabled(true);
                                            final ViewParent parent = this.getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                    if (this.mIsBeingDragged) {
                                        resetTouch = (false | this.performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId))));
                                    }
                                    break Label_0590;
                                }
                            }
                            else {
                                if (!this.mIsBeingDragged) {
                                    break Label_0590;
                                }
                                final VelocityTracker mVelocityTracker = this.mVelocityTracker;
                                mVelocityTracker.computeCurrentVelocity(1000, (float)this.mMaximumVelocity);
                                final int n2 = (int)mVelocityTracker.getXVelocity(this.mActivePointerId);
                                this.mPopulatePending = true;
                                final int clientWidth = this.getClientWidth();
                                final int scrollX = this.getScrollX();
                                final f infoForCurrentScrollPosition = this.infoForCurrentScrollPosition();
                                final float n3 = (float)this.mPageMargin;
                                final float n4 = (float)clientWidth;
                                this.setCurrentItemInternal(this.determineTargetPage(infoForCurrentScrollPosition.b, (scrollX / n4 - infoForCurrentScrollPosition.e) / (infoForCurrentScrollPosition.d + n3 / n4), n2, (int)(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, n2);
                            }
                        }
                        resetTouch = this.resetTouch();
                        break Label_0590;
                    }
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    this.populate();
                    final float x2 = motionEvent.getX();
                    this.mInitialMotionX = x2;
                    this.mLastMotionX = x2;
                    final float y2 = motionEvent.getY();
                    this.mInitialMotionY = y2;
                    this.mLastMotionY = y2;
                    mActivePointerId = motionEvent.getPointerId(0);
                }
                this.mActivePointerId = mActivePointerId;
            }
            if (resetTouch) {
                androidx.core.view.j0.l1((View)this);
            }
            return true;
        }
        return false;
    }
    
    boolean pageLeft() {
        final int mCurItem = this.mCurItem;
        if (mCurItem > 0) {
            this.setCurrentItem(mCurItem - 1, true);
            return true;
        }
        return false;
    }
    
    boolean pageRight() {
        final a mAdapter = this.mAdapter;
        if (mAdapter != null && this.mCurItem < mAdapter.getCount() - 1) {
            this.setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }
    
    void populate() {
        this.populate(this.mCurItem);
    }
    
    void populate(int i) {
        final int mCurItem = this.mCurItem;
        f infoForPosition;
        if (mCurItem != i) {
            infoForPosition = this.infoForPosition(mCurItem);
            this.mCurItem = i;
        }
        else {
            infoForPosition = null;
        }
        if (this.mAdapter == null) {
            this.sortChildDrawingOrder();
            return;
        }
        if (this.mPopulatePending) {
            this.sortChildDrawingOrder();
            return;
        }
        if (this.getWindowToken() == null) {
            return;
        }
        this.mAdapter.startUpdate(this);
        i = this.mOffscreenPageLimit;
        final int max = Math.max(0, this.mCurItem - i);
        final int count = this.mAdapter.getCount();
        final int min = Math.min(count - 1, this.mCurItem + i);
        if (count == this.mExpectedAdapterCount) {
            i = 0;
            while (true) {
                while (i < this.mItems.size()) {
                    final f f = this.mItems.get(i);
                    final int b = f.b;
                    final int mCurItem2 = this.mCurItem;
                    if (b >= mCurItem2) {
                        if (b == mCurItem2) {
                            f addNewItem = f;
                            if (f == null) {
                                addNewItem = f;
                                if (count > 0) {
                                    addNewItem = this.addNewItem(this.mCurItem, i);
                                }
                            }
                            if (addNewItem != null) {
                                int index = i - 1;
                                f f2;
                                if (index >= 0) {
                                    f2 = this.mItems.get(index);
                                }
                                else {
                                    f2 = null;
                                }
                                final int clientWidth = this.getClientWidth();
                                float n;
                                if (clientWidth <= 0) {
                                    n = 0.0f;
                                }
                                else {
                                    n = 2.0f - addNewItem.d + this.getPaddingLeft() / (float)clientWidth;
                                }
                                int j = this.mCurItem - 1;
                                float n2 = 0.0f;
                                while (j >= 0) {
                                    int n3 = 0;
                                    int n4 = 0;
                                    f f3 = null;
                                    float n5 = 0.0f;
                                    Label_0534: {
                                        f f4 = null;
                                        Label_0524: {
                                            int n6 = 0;
                                            int n7 = 0;
                                            Label_0515: {
                                                if (n2 >= n && j < max) {
                                                    if (f2 == null) {
                                                        break;
                                                    }
                                                    n3 = i;
                                                    n4 = index;
                                                    f3 = f2;
                                                    n5 = n2;
                                                    if (j != f2.b) {
                                                        break Label_0534;
                                                    }
                                                    n3 = i;
                                                    n4 = index;
                                                    f3 = f2;
                                                    n5 = n2;
                                                    if (f2.c) {
                                                        break Label_0534;
                                                    }
                                                    this.mItems.remove(index);
                                                    this.mAdapter.destroyItem(this, j, f2.a);
                                                    --index;
                                                    n6 = --i;
                                                    n7 = index;
                                                    n5 = n2;
                                                    if (index < 0) {
                                                        break Label_0515;
                                                    }
                                                }
                                                else if (f2 != null && j == f2.b) {
                                                    n2 += f2.d;
                                                    --index;
                                                    n6 = i;
                                                    n7 = index;
                                                    n5 = n2;
                                                    if (index < 0) {
                                                        break Label_0515;
                                                    }
                                                }
                                                else {
                                                    n2 += this.addNewItem(j, index + 1).d;
                                                    n6 = ++i;
                                                    n7 = index;
                                                    n5 = n2;
                                                    if (index < 0) {
                                                        break Label_0515;
                                                    }
                                                }
                                                f4 = this.mItems.get(index);
                                                n5 = n2;
                                                break Label_0524;
                                            }
                                            f4 = null;
                                            index = n7;
                                            i = n6;
                                        }
                                        f3 = f4;
                                        n4 = index;
                                        n3 = i;
                                    }
                                    --j;
                                    i = n3;
                                    index = n4;
                                    f2 = f3;
                                    n2 = n5;
                                }
                                float d = addNewItem.d;
                                int index2 = i + 1;
                                if (d < 2.0f) {
                                    f f5;
                                    if (index2 < this.mItems.size()) {
                                        f5 = this.mItems.get(index2);
                                    }
                                    else {
                                        f5 = null;
                                    }
                                    float n8;
                                    if (clientWidth <= 0) {
                                        n8 = 0.0f;
                                    }
                                    else {
                                        n8 = this.getPaddingRight() / (float)clientWidth + 2.0f;
                                    }
                                    int mCurItem3 = this.mCurItem;
                                    f f6 = f5;
                                    while (true) {
                                        final int n9 = mCurItem3 + 1;
                                        if (n9 >= count) {
                                            break;
                                        }
                                        float n10 = 0.0f;
                                        int n11 = 0;
                                        f f7 = null;
                                        Label_0875: {
                                            Label_0777: {
                                                if (d >= n8 && n9 > min) {
                                                    if (f6 == null) {
                                                        break;
                                                    }
                                                    n10 = d;
                                                    n11 = index2;
                                                    f7 = f6;
                                                    if (n9 != f6.b) {
                                                        break Label_0875;
                                                    }
                                                    n10 = d;
                                                    n11 = index2;
                                                    f7 = f6;
                                                    if (f6.c) {
                                                        break Label_0875;
                                                    }
                                                    this.mItems.remove(index2);
                                                    this.mAdapter.destroyItem(this, n9, f6.a);
                                                    n10 = d;
                                                    if ((n11 = index2) >= this.mItems.size()) {
                                                        break Label_0777;
                                                    }
                                                }
                                                else if (f6 != null && n9 == f6.b) {
                                                    d += f6.d;
                                                    ++index2;
                                                    n10 = d;
                                                    if ((n11 = index2) >= this.mItems.size()) {
                                                        break Label_0777;
                                                    }
                                                }
                                                else {
                                                    final f addNewItem2 = this.addNewItem(n9, index2);
                                                    ++index2;
                                                    d = (n10 = d + addNewItem2.d);
                                                    if ((n11 = index2) >= this.mItems.size()) {
                                                        break Label_0777;
                                                    }
                                                }
                                                f7 = this.mItems.get(index2);
                                                n10 = d;
                                                n11 = index2;
                                                break Label_0875;
                                            }
                                            f7 = null;
                                        }
                                        d = n10;
                                        index2 = n11;
                                        f6 = f7;
                                        mCurItem3 = n9;
                                    }
                                }
                                this.calculatePageOffsets(addNewItem, i, infoForPosition);
                                this.mAdapter.setPrimaryItem(this, this.mCurItem, addNewItem.a);
                            }
                            this.mAdapter.finishUpdate(this);
                            int childCount;
                            View child;
                            g g;
                            f infoForChild;
                            for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                                child = this.getChildAt(i);
                                g = (g)child.getLayoutParams();
                                g.f = i;
                                if (!g.a && g.c == 0.0f) {
                                    infoForChild = this.infoForChild(child);
                                    if (infoForChild != null) {
                                        g.c = infoForChild.d;
                                        g.e = infoForChild.b;
                                    }
                                }
                            }
                            this.sortChildDrawingOrder();
                            if (this.hasFocus()) {
                                final View focus = this.findFocus();
                                f infoForAnyChild;
                                if (focus != null) {
                                    infoForAnyChild = this.infoForAnyChild(focus);
                                }
                                else {
                                    infoForAnyChild = null;
                                }
                                if (infoForAnyChild == null || infoForAnyChild.b != this.mCurItem) {
                                    View child2;
                                    f infoForChild2;
                                    for (i = 0; i < this.getChildCount(); ++i) {
                                        child2 = this.getChildAt(i);
                                        infoForChild2 = this.infoForChild(child2);
                                        if (infoForChild2 != null && infoForChild2.b == this.mCurItem && child2.requestFocus(2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        break;
                    }
                    else {
                        ++i;
                    }
                }
                final f f = null;
                continue;
            }
        }
        String str;
        try {
            str = this.getResources().getResourceName(this.getId());
        }
        catch (Resources$NotFoundException ex) {
            str = Integer.toHexString(this.getId());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
        sb.append(this.mExpectedAdapterCount);
        sb.append(", found: ");
        sb.append(count);
        sb.append(" Pager id: ");
        sb.append(str);
        sb.append(" Pager class: ");
        sb.append(this.getClass());
        sb.append(" Problematic adapter: ");
        sb.append(this.mAdapter.getClass());
        throw new IllegalStateException(sb.toString());
    }
    
    public void removeOnAdapterChangeListener(@j0 final i i) {
        final List<i> mAdapterChangeListeners = this.mAdapterChangeListeners;
        if (mAdapterChangeListeners != null) {
            mAdapterChangeListeners.remove(i);
        }
    }
    
    public void removeOnPageChangeListener(@j0 final j j) {
        final List<j> mOnPageChangeListeners = this.mOnPageChangeListeners;
        if (mOnPageChangeListeners != null) {
            mOnPageChangeListeners.remove(j);
        }
    }
    
    public void removeView(final View view) {
        if (this.mInLayout) {
            this.removeViewInLayout(view);
        }
        else {
            super.removeView(view);
        }
    }
    
    public void setAdapter(@k0 final a mAdapter) {
        final a mAdapter2 = this.mAdapter;
        final int n = 0;
        if (mAdapter2 != null) {
            mAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate(this);
            for (int i = 0; i < this.mItems.size(); ++i) {
                final f f = this.mItems.get(i);
                this.mAdapter.destroyItem(this, f.b, f.a);
            }
            this.mAdapter.finishUpdate(this);
            this.mItems.clear();
            this.removeNonDecorViews();
            this.scrollTo(this.mCurItem = 0, 0);
        }
        final a mAdapter3 = this.mAdapter;
        this.mAdapter = mAdapter;
        this.mExpectedAdapterCount = 0;
        if (mAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new l();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            final boolean mFirstLayout = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                this.setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            }
            else if (!mFirstLayout) {
                this.populate();
            }
            else {
                this.requestLayout();
            }
        }
        final List<i> mAdapterChangeListeners = this.mAdapterChangeListeners;
        if (mAdapterChangeListeners != null && !mAdapterChangeListeners.isEmpty()) {
            for (int size = this.mAdapterChangeListeners.size(), j = n; j < size; ++j) {
                this.mAdapterChangeListeners.get(j).a(this, mAdapter3, mAdapter);
            }
        }
    }
    
    public void setCurrentItem(final int n) {
        this.mPopulatePending = false;
        this.setCurrentItemInternal(n, this.mFirstLayout ^ true, false);
    }
    
    public void setCurrentItem(final int n, final boolean b) {
        this.setCurrentItemInternal(n, b, this.mPopulatePending = false);
    }
    
    void setCurrentItemInternal(final int n, final boolean b, final boolean b2) {
        this.setCurrentItemInternal(n, b, b2, 0);
    }
    
    void setCurrentItemInternal(int i, final boolean b, final boolean b2, final int n) {
        final a mAdapter = this.mAdapter;
        final boolean b3 = false;
        if (mAdapter == null || mAdapter.getCount() <= 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if (!b2 && this.mCurItem == i && this.mItems.size() != 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        int mCurItem;
        if (i < 0) {
            mCurItem = 0;
        }
        else if ((mCurItem = i) >= this.mAdapter.getCount()) {
            mCurItem = this.mAdapter.getCount() - 1;
        }
        final int mOffscreenPageLimit = this.mOffscreenPageLimit;
        i = this.mCurItem;
        if (mCurItem > i + mOffscreenPageLimit || mCurItem < i - mOffscreenPageLimit) {
            for (i = 0; i < this.mItems.size(); ++i) {
                this.mItems.get(i).c = true;
            }
        }
        boolean b4 = b3;
        if (this.mCurItem != mCurItem) {
            b4 = true;
        }
        if (this.mFirstLayout) {
            this.mCurItem = mCurItem;
            if (b4) {
                this.dispatchOnPageSelected(mCurItem);
            }
            this.requestLayout();
        }
        else {
            this.populate(mCurItem);
            this.scrollToItem(mCurItem, b, n, b4);
        }
    }
    
    j setInternalPageChangeListener(final j mInternalPageChangeListener) {
        final j mInternalPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = mInternalPageChangeListener;
        return mInternalPageChangeListener2;
    }
    
    public void setOffscreenPageLimit(final int i) {
        int mOffscreenPageLimit = i;
        if (i < 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            mOffscreenPageLimit = 1;
        }
        if (mOffscreenPageLimit != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = mOffscreenPageLimit;
            this.populate();
        }
    }
    
    @Deprecated
    public void setOnPageChangeListener(final j mOnPageChangeListener) {
        this.mOnPageChangeListener = mOnPageChangeListener;
    }
    
    public void setPageMargin(final int mPageMargin) {
        final int mPageMargin2 = this.mPageMargin;
        this.mPageMargin = mPageMargin;
        final int width = this.getWidth();
        this.recomputeScrollPosition(width, width, mPageMargin, mPageMargin2);
        this.requestLayout();
    }
    
    public void setPageMarginDrawable(@s final int n) {
        this.setPageMarginDrawable(d.i(this.getContext(), n));
    }
    
    public void setPageMarginDrawable(@k0 final Drawable mMarginDrawable) {
        this.mMarginDrawable = mMarginDrawable;
        if (mMarginDrawable != null) {
            this.refreshDrawableState();
        }
        this.setWillNotDraw(mMarginDrawable == null);
        this.invalidate();
    }
    
    public void setPageTransformer(final boolean b, @k0 final k k) {
        this.setPageTransformer(b, k, 2);
    }
    
    public void setPageTransformer(final boolean b, @k0 final k mPageTransformer, final int mPageTransformerLayerType) {
        int mDrawingOrder = 1;
        final boolean childrenDrawingOrderEnabled = mPageTransformer != null;
        final boolean b2 = childrenDrawingOrderEnabled != (this.mPageTransformer != null);
        this.mPageTransformer = mPageTransformer;
        this.setChildrenDrawingOrderEnabled(childrenDrawingOrderEnabled);
        if (childrenDrawingOrderEnabled) {
            if (b) {
                mDrawingOrder = 2;
            }
            this.mDrawingOrder = mDrawingOrder;
            this.mPageTransformerLayerType = mPageTransformerLayerType;
        }
        else {
            this.mDrawingOrder = 0;
        }
        if (b2) {
            this.populate();
        }
    }
    
    void setScrollState(final int mScrollState) {
        if (this.mScrollState == mScrollState) {
            return;
        }
        this.mScrollState = mScrollState;
        if (this.mPageTransformer != null) {
            this.enableLayers(mScrollState != 0);
        }
        this.dispatchOnScrollStateChanged(mScrollState);
    }
    
    void smoothScrollTo(final int n, final int n2) {
        this.smoothScrollTo(n, n2, 0);
    }
    
    void smoothScrollTo(int a, int n, final int a2) {
        if (this.getChildCount() == 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        final Scroller mScroller = this.mScroller;
        int n2;
        if (mScroller != null && !mScroller.isFinished()) {
            if (this.mIsScrollStarted) {
                n2 = this.mScroller.getCurrX();
            }
            else {
                n2 = this.mScroller.getStartX();
            }
            this.mScroller.abortAnimation();
            this.setScrollingCacheEnabled(false);
        }
        else {
            n2 = this.getScrollX();
        }
        final int scrollY = this.getScrollY();
        final int n3 = a - n2;
        n -= scrollY;
        if (n3 == 0 && n == 0) {
            this.completeScroll(false);
            this.populate();
            this.setScrollState(0);
            return;
        }
        this.setScrollingCacheEnabled(true);
        this.setScrollState(2);
        a = this.getClientWidth();
        final int n4 = a / 2;
        final float n5 = (float)Math.abs(n3);
        final float n6 = (float)a;
        final float min = Math.min(1.0f, n5 * 1.0f / n6);
        final float n7 = (float)n4;
        final float distanceInfluenceForSnapDuration = this.distanceInfluenceForSnapDuration(min);
        a = Math.abs(a2);
        if (a > 0) {
            a = Math.round(Math.abs((n7 + distanceInfluenceForSnapDuration * n7) / a) * 1000.0f) * 4;
        }
        else {
            a = (int)((Math.abs(n3) / (n6 * this.mAdapter.getPageWidth(this.mCurItem) + this.mPageMargin) + 1.0f) * 100.0f);
        }
        a = Math.min(a, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(n2, scrollY, n3, n, a);
        androidx.core.view.j0.l1((View)this);
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }
    
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ ElementType.TYPE })
    public @interface e {
    }
    
    static class f
    {
        Object a;
        int b;
        boolean c;
        float d;
        float e;
    }
    
    public static class g extends ViewGroup$LayoutParams
    {
        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;
        
        public g() {
            super(-1, -1);
            this.c = 0.0f;
        }
        
        public g(final Context context, final AttributeSet set) {
            super(context, set);
            this.c = 0.0f;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ViewPager.LAYOUT_ATTRS);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }
    
    class h extends androidx.core.view.a
    {
        private boolean n() {
            final a mAdapter = ViewPager.this.mAdapter;
            boolean b = true;
            if (mAdapter == null || mAdapter.getCount() <= 1) {
                b = false;
            }
            return b;
        }
        
        @Override
        public void f(final View view, final AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)ViewPager.class.getName());
            accessibilityEvent.setScrollable(this.n());
            if (accessibilityEvent.getEventType() == 4096) {
                final a mAdapter = ViewPager.this.mAdapter;
                if (mAdapter != null) {
                    accessibilityEvent.setItemCount(mAdapter.getCount());
                    accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                    accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
                }
            }
        }
        
        @Override
        public void g(final View view, final androidx.core.view.accessibility.d d) {
            super.g(view, d);
            d.U0(ViewPager.class.getName());
            d.D1(this.n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                d.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                d.a(8192);
            }
        }
        
        @Override
        public boolean j(final View view, int currentItem, final Bundle bundle) {
            if (super.j(view, currentItem, bundle)) {
                return true;
            }
            ViewPager viewPager;
            if (currentItem != 4096) {
                if (currentItem != 8192) {
                    return false;
                }
                if (!ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                currentItem = viewPager.mCurItem - 1;
            }
            else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                currentItem = viewPager.mCurItem + 1;
            }
            viewPager.setCurrentItem(currentItem);
            return true;
        }
    }
    
    public interface i
    {
        void a(@j0 final ViewPager p0, @k0 final a p1, @k0 final a p2);
    }
    
    public interface j
    {
        void b(final int p0, final float p1, @n0 final int p2);
        
        void k(final int p0);
        
        void l(final int p0);
    }
    
    public interface k
    {
        void a(@j0 final View p0, final float p1);
    }
    
    private class l extends DataSetObserver
    {
        l() {
        }
        
        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }
        
        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }
    
    public static class m extends a
    {
        public static final Parcelable$Creator<m> CREATOR;
        int I;
        Parcelable J;
        ClassLoader K;
        
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
        
        m(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            ClassLoader classLoader2 = classLoader;
            if (classLoader == null) {
                classLoader2 = this.getClass().getClassLoader();
            }
            this.I = parcel.readInt();
            this.J = parcel.readParcelable(classLoader2);
            this.K = classLoader2;
        }
        
        public m(@j0 final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.I);
            sb.append("}");
            return sb.toString();
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.I);
            parcel.writeParcelable(this.J, n);
        }
    }
    
    public static class n implements j
    {
        @Override
        public void b(final int n, final float n2, final int n3) {
        }
        
        @Override
        public void k(final int n) {
        }
        
        @Override
        public void l(final int n) {
        }
    }
    
    static class o implements Comparator<View>
    {
        public int a(final View view, final View view2) {
            final g g = (g)view.getLayoutParams();
            final g g2 = (g)view2.getLayoutParams();
            final boolean a = g.a;
            if (a != g2.a) {
                int n;
                if (a) {
                    n = 1;
                }
                else {
                    n = -1;
                }
                return n;
            }
            return g.e - g2.e;
        }
    }
}
