// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util.recyclerviewswipeutil;

import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import com.untis.mobile.c;
import android.util.AttributeSet;
import androidx.core.view.j0;
import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.GestureDetector$OnGestureListener;
import androidx.core.view.h;
import androidx.customview.widget.d$c;
import androidx.customview.widget.d;
import android.annotation.SuppressLint;
import android.view.ViewGroup;

@SuppressLint({ "RtlHardcoded" })
public class SwipeRevealLayout extends ViewGroup
{
    private static final int DEFAULT_MIN_DIST_REQUEST_DISALLOW_PARENT = 1;
    private static final int DEFAULT_MIN_FLING_VELOCITY = 300;
    public static final int DRAG_EDGE_BOTTOM = 8;
    public static final int DRAG_EDGE_LEFT = 1;
    public static final int DRAG_EDGE_RIGHT = 2;
    public static final int DRAG_EDGE_TOP = 4;
    public static final int MODE_NORMAL = 0;
    public static final int MODE_SAME_LEVEL = 1;
    protected static final int STATE_CLOSE = 0;
    protected static final int STATE_CLOSING = 1;
    protected static final int STATE_DRAGGING = 4;
    protected static final int STATE_OPEN = 2;
    protected static final int STATE_OPENING = 3;
    private volatile boolean mAborted;
    private float mDragDist;
    private int mDragEdge;
    private d mDragHelper;
    private final d$c mDragHelperCallback;
    private DragStateChangeListener mDragStateChangeListener;
    private h mGestureDetector;
    private final GestureDetector$OnGestureListener mGestureListener;
    private boolean mIsOpenBeforeInit;
    private volatile boolean mIsScrolling;
    private int mLastMainLeft;
    private int mLastMainTop;
    private volatile boolean mLockDrag;
    private View mMainView;
    private int mMinDistRequestDisallowParent;
    private int mMinFlingVelocity;
    private int mMode;
    private int mOnLayoutCount;
    private float mPrevX;
    private float mPrevY;
    private final Rect mRectMainClose;
    private Rect mRectMainOpen;
    private Rect mRectSecClose;
    private Rect mRectSecOpen;
    private View mSecondaryView;
    private int mState;
    private SwipeListener mSwipeListener;
    
    public SwipeRevealLayout(final Context context) {
        super(context);
        this.mRectMainClose = new Rect();
        this.mRectMainOpen = new Rect();
        this.mRectSecClose = new Rect();
        this.mRectSecOpen = new Rect();
        this.mMinDistRequestDisallowParent = 0;
        this.mIsOpenBeforeInit = false;
        this.mAborted = false;
        this.mIsScrolling = false;
        this.mLockDrag = false;
        this.mMinFlingVelocity = 300;
        this.mState = 0;
        this.mMode = 0;
        this.mLastMainLeft = 0;
        this.mLastMainTop = 0;
        this.mDragEdge = 1;
        this.mDragDist = 0.0f;
        this.mPrevX = -1.0f;
        this.mPrevY = -1.0f;
        this.mOnLayoutCount = 0;
        this.mGestureListener = (GestureDetector$OnGestureListener)new GestureDetector$SimpleOnGestureListener() {
            boolean hasDisallowed;
            
            {
                this.hasDisallowed = false;
            }
            
            public boolean onDown(final MotionEvent motionEvent) {
                SwipeRevealLayout.this.mIsScrolling = false;
                this.hasDisallowed = false;
                return true;
            }
            
            public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
                SwipeRevealLayout.this.mIsScrolling = true;
                return false;
            }
            
            public boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
                final SwipeRevealLayout this$0 = SwipeRevealLayout.this;
                boolean b = true;
                this$0.mIsScrolling = true;
                if (SwipeRevealLayout.this.getParent() != null) {
                    if (!this.hasDisallowed) {
                        b = (SwipeRevealLayout.this.getDistToClosestEdge() >= SwipeRevealLayout.this.mMinDistRequestDisallowParent);
                        if (b) {
                            this.hasDisallowed = true;
                        }
                    }
                    SwipeRevealLayout.this.getParent().requestDisallowInterceptTouchEvent(b);
                }
                return false;
            }
        };
        this.mDragHelperCallback = new d$c() {
            private float getSlideOffset() {
                final int access$700 = SwipeRevealLayout.this.mDragEdge;
                int n = 0;
                int n2 = 0;
                Label_0121: {
                    if (access$700 == 1) {
                        n = SwipeRevealLayout.this.mMainView.getLeft();
                        n2 = SwipeRevealLayout.this.mRectMainClose.left;
                        break Label_0121;
                    }
                    if (access$700 == 2) {
                        n = SwipeRevealLayout.this.mRectMainClose.left;
                        n2 = SwipeRevealLayout.this.mMainView.getLeft();
                        break Label_0121;
                    }
                    int n3;
                    int n4;
                    if (access$700 != 4) {
                        if (access$700 != 8) {
                            return 0.0f;
                        }
                        n3 = SwipeRevealLayout.this.mRectMainClose.top;
                        n4 = SwipeRevealLayout.this.mMainView.getTop();
                    }
                    else {
                        n3 = SwipeRevealLayout.this.mMainView.getTop();
                        n4 = SwipeRevealLayout.this.mRectMainClose.top;
                    }
                    final float n5 = (float)(n3 - n4);
                    final int n6 = SwipeRevealLayout.this.mSecondaryView.getHeight();
                    return n5 / n6;
                }
                final float n5 = (float)(n - n2);
                final int n6 = SwipeRevealLayout.this.mSecondaryView.getWidth();
                return n5 / n6;
            }
            
            public int clampViewPositionHorizontal(final View view, int left, int a) {
                a = SwipeRevealLayout.this.mDragEdge;
                if (a != 1) {
                    if (a != 2) {
                        return view.getLeft();
                    }
                    a = Math.min(left, SwipeRevealLayout.this.mRectMainClose.left);
                    left = SwipeRevealLayout.this.mRectMainClose.left - SwipeRevealLayout.this.mSecondaryView.getWidth();
                }
                else {
                    a = Math.min(left, SwipeRevealLayout.this.mRectMainClose.left + SwipeRevealLayout.this.mSecondaryView.getWidth());
                    left = SwipeRevealLayout.this.mRectMainClose.left;
                }
                return Math.max(a, left);
            }
            
            public int clampViewPositionVertical(final View view, int top, int a) {
                a = SwipeRevealLayout.this.mDragEdge;
                if (a != 4) {
                    if (a != 8) {
                        return view.getTop();
                    }
                    a = Math.min(top, SwipeRevealLayout.this.mRectMainClose.top);
                    top = SwipeRevealLayout.this.mRectMainClose.top - SwipeRevealLayout.this.mSecondaryView.getHeight();
                }
                else {
                    a = Math.min(top, SwipeRevealLayout.this.mRectMainClose.top + SwipeRevealLayout.this.mSecondaryView.getHeight());
                    top = SwipeRevealLayout.this.mRectMainClose.top;
                }
                return Math.max(a, top);
            }
            
            public void onEdgeDragStarted(final int n, final int n2) {
                super.onEdgeDragStarted(n, n2);
                if (SwipeRevealLayout.this.mLockDrag) {
                    return;
                }
                final int access$700 = SwipeRevealLayout.this.mDragEdge;
                final int n3 = 0;
                final boolean b = access$700 == 2 && n == 1;
                final boolean b2 = SwipeRevealLayout.this.mDragEdge == 1 && n == 2;
                final boolean b3 = SwipeRevealLayout.this.mDragEdge == 8 && n == 4;
                int n4 = n3;
                if (SwipeRevealLayout.this.mDragEdge == 4) {
                    n4 = n3;
                    if (n == 8) {
                        n4 = 1;
                    }
                }
                if (b || b2 || b3 || n4 != 0) {
                    SwipeRevealLayout.this.mDragHelper.d(SwipeRevealLayout.this.mMainView, n2);
                }
            }
            
            public void onViewDragStateChanged(final int n) {
                super.onViewDragStateChanged(n);
                final int access$1900 = SwipeRevealLayout.this.mState;
                Label_0132: {
                    if (n != 0) {
                        if (n == 1) {
                            SwipeRevealLayout.this.mState = 4;
                        }
                    }
                    else {
                        Label_0123: {
                            if (SwipeRevealLayout.this.mDragEdge != 1 && SwipeRevealLayout.this.mDragEdge != 2) {
                                if (SwipeRevealLayout.this.mMainView.getTop() != SwipeRevealLayout.this.mRectMainClose.top) {
                                    break Label_0123;
                                }
                            }
                            else if (SwipeRevealLayout.this.mMainView.getLeft() != SwipeRevealLayout.this.mRectMainClose.left) {
                                break Label_0123;
                            }
                            SwipeRevealLayout.this.mState = 0;
                            break Label_0132;
                        }
                        SwipeRevealLayout.this.mState = 2;
                    }
                }
                if (SwipeRevealLayout.this.mDragStateChangeListener != null && !SwipeRevealLayout.this.mAborted && access$1900 != SwipeRevealLayout.this.mState) {
                    SwipeRevealLayout.this.mDragStateChangeListener.onDragStateChanged(SwipeRevealLayout.this.mState);
                }
            }
            
            public void onViewPositionChanged(final View view, int access$1400, int n, final int n2, final int n3) {
                super.onViewPositionChanged(view, access$1400, n, n2, n3);
                access$1400 = SwipeRevealLayout.this.mMode;
                n = 1;
                if (access$1400 == 1) {
                    if (SwipeRevealLayout.this.mDragEdge != 1 && SwipeRevealLayout.this.mDragEdge != 2) {
                        SwipeRevealLayout.this.mSecondaryView.offsetTopAndBottom(n3);
                    }
                    else {
                        SwipeRevealLayout.this.mSecondaryView.offsetLeftAndRight(n2);
                    }
                }
                access$1400 = n;
                if (SwipeRevealLayout.this.mMainView.getLeft() == SwipeRevealLayout.this.mLastMainLeft) {
                    if (SwipeRevealLayout.this.mMainView.getTop() != SwipeRevealLayout.this.mLastMainTop) {
                        access$1400 = n;
                    }
                    else {
                        access$1400 = 0;
                    }
                }
                if (SwipeRevealLayout.this.mSwipeListener != null && access$1400 != 0) {
                    if (SwipeRevealLayout.this.mMainView.getLeft() == SwipeRevealLayout.this.mRectMainClose.left && SwipeRevealLayout.this.mMainView.getTop() == SwipeRevealLayout.this.mRectMainClose.top) {
                        SwipeRevealLayout.this.mSwipeListener.onClosed(SwipeRevealLayout.this);
                    }
                    else if (SwipeRevealLayout.this.mMainView.getLeft() == SwipeRevealLayout.this.mRectMainOpen.left && SwipeRevealLayout.this.mMainView.getTop() == SwipeRevealLayout.this.mRectMainOpen.top) {
                        SwipeRevealLayout.this.mSwipeListener.onOpened(SwipeRevealLayout.this);
                    }
                    else {
                        SwipeRevealLayout.this.mSwipeListener.onSlide(SwipeRevealLayout.this, this.getSlideOffset());
                    }
                }
                final SwipeRevealLayout this$0 = SwipeRevealLayout.this;
                this$0.mLastMainLeft = this$0.mMainView.getLeft();
                final SwipeRevealLayout this$2 = SwipeRevealLayout.this;
                this$2.mLastMainTop = this$2.mMainView.getTop();
                j0.l1((View)SwipeRevealLayout.this);
            }
            
            public void onViewReleased(final View view, final float n, final float n2) {
                final SwipeRevealLayout this$0 = SwipeRevealLayout.this;
                final int n3 = (int)n;
                final int access$1000 = this$0.pxToDp(n3);
                final int access$1001 = SwipeRevealLayout.this.mMinFlingVelocity;
                boolean b = false;
                final boolean b2 = access$1000 >= access$1001;
                final boolean b3 = SwipeRevealLayout.this.pxToDp(n3) <= -SwipeRevealLayout.this.mMinFlingVelocity;
                final SwipeRevealLayout this$2 = SwipeRevealLayout.this;
                final int n4 = (int)n2;
                final boolean b4 = this$2.pxToDp(n4) <= -SwipeRevealLayout.this.mMinFlingVelocity;
                if (SwipeRevealLayout.this.pxToDp(n4) >= SwipeRevealLayout.this.mMinFlingVelocity) {
                    b = true;
                }
                final int access$1002 = SwipeRevealLayout.this.getHalfwayPivotHorizontal();
                final int access$1003 = SwipeRevealLayout.this.getHalfwayPivotVertical();
                final int access$1004 = SwipeRevealLayout.this.mDragEdge;
                Label_0301: {
                    if (access$1004 != 1) {
                        if (access$1004 != 2) {
                            if (access$1004 != 4) {
                                if (access$1004 != 8) {
                                    return;
                                }
                                if (b4) {
                                    break Label_0301;
                                }
                                if (!b) {
                                    if (SwipeRevealLayout.this.mMainView.getBottom() < access$1003) {
                                        break Label_0301;
                                    }
                                }
                            }
                            else if (!b4) {
                                if (b) {
                                    break Label_0301;
                                }
                                if (SwipeRevealLayout.this.mMainView.getTop() >= access$1003) {
                                    break Label_0301;
                                }
                            }
                        }
                        else if (!b2) {
                            if (b3) {
                                break Label_0301;
                            }
                            if (SwipeRevealLayout.this.mMainView.getRight() < access$1002) {
                                break Label_0301;
                            }
                        }
                    }
                    else {
                        if (b2) {
                            break Label_0301;
                        }
                        if (!b3) {
                            if (SwipeRevealLayout.this.mMainView.getLeft() >= access$1002) {
                                break Label_0301;
                            }
                        }
                    }
                    SwipeRevealLayout.this.close(true);
                    return;
                }
                SwipeRevealLayout.this.open(true);
            }
            
            public boolean tryCaptureView(final View view, final int n) {
                SwipeRevealLayout.this.mAborted = false;
                if (SwipeRevealLayout.this.mLockDrag) {
                    return false;
                }
                SwipeRevealLayout.this.mDragHelper.d(SwipeRevealLayout.this.mMainView, n);
                return false;
            }
        };
        this.init(context, null);
    }
    
    public SwipeRevealLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.mRectMainClose = new Rect();
        this.mRectMainOpen = new Rect();
        this.mRectSecClose = new Rect();
        this.mRectSecOpen = new Rect();
        this.mMinDistRequestDisallowParent = 0;
        this.mIsOpenBeforeInit = false;
        this.mAborted = false;
        this.mIsScrolling = false;
        this.mLockDrag = false;
        this.mMinFlingVelocity = 300;
        this.mState = 0;
        this.mMode = 0;
        this.mLastMainLeft = 0;
        this.mLastMainTop = 0;
        this.mDragEdge = 1;
        this.mDragDist = 0.0f;
        this.mPrevX = -1.0f;
        this.mPrevY = -1.0f;
        this.mOnLayoutCount = 0;
        this.mGestureListener = (GestureDetector$OnGestureListener)new GestureDetector$SimpleOnGestureListener() {
            boolean hasDisallowed;
            
            {
                this.hasDisallowed = false;
            }
            
            public boolean onDown(final MotionEvent motionEvent) {
                SwipeRevealLayout.this.mIsScrolling = false;
                this.hasDisallowed = false;
                return true;
            }
            
            public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
                SwipeRevealLayout.this.mIsScrolling = true;
                return false;
            }
            
            public boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
                final SwipeRevealLayout this$0 = SwipeRevealLayout.this;
                boolean b = true;
                this$0.mIsScrolling = true;
                if (SwipeRevealLayout.this.getParent() != null) {
                    if (!this.hasDisallowed) {
                        b = (SwipeRevealLayout.this.getDistToClosestEdge() >= SwipeRevealLayout.this.mMinDistRequestDisallowParent);
                        if (b) {
                            this.hasDisallowed = true;
                        }
                    }
                    SwipeRevealLayout.this.getParent().requestDisallowInterceptTouchEvent(b);
                }
                return false;
            }
        };
        this.mDragHelperCallback = new d$c() {
            private float getSlideOffset() {
                final int access$700 = SwipeRevealLayout.this.mDragEdge;
                int n = 0;
                int n2 = 0;
                Label_0121: {
                    if (access$700 == 1) {
                        n = SwipeRevealLayout.this.mMainView.getLeft();
                        n2 = SwipeRevealLayout.this.mRectMainClose.left;
                        break Label_0121;
                    }
                    if (access$700 == 2) {
                        n = SwipeRevealLayout.this.mRectMainClose.left;
                        n2 = SwipeRevealLayout.this.mMainView.getLeft();
                        break Label_0121;
                    }
                    int n3;
                    int n4;
                    if (access$700 != 4) {
                        if (access$700 != 8) {
                            return 0.0f;
                        }
                        n3 = SwipeRevealLayout.this.mRectMainClose.top;
                        n4 = SwipeRevealLayout.this.mMainView.getTop();
                    }
                    else {
                        n3 = SwipeRevealLayout.this.mMainView.getTop();
                        n4 = SwipeRevealLayout.this.mRectMainClose.top;
                    }
                    final float n5 = (float)(n3 - n4);
                    final int n6 = SwipeRevealLayout.this.mSecondaryView.getHeight();
                    return n5 / n6;
                }
                final float n5 = (float)(n - n2);
                final int n6 = SwipeRevealLayout.this.mSecondaryView.getWidth();
                return n5 / n6;
            }
            
            public int clampViewPositionHorizontal(final View view, int left, int a) {
                a = SwipeRevealLayout.this.mDragEdge;
                if (a != 1) {
                    if (a != 2) {
                        return view.getLeft();
                    }
                    a = Math.min(left, SwipeRevealLayout.this.mRectMainClose.left);
                    left = SwipeRevealLayout.this.mRectMainClose.left - SwipeRevealLayout.this.mSecondaryView.getWidth();
                }
                else {
                    a = Math.min(left, SwipeRevealLayout.this.mRectMainClose.left + SwipeRevealLayout.this.mSecondaryView.getWidth());
                    left = SwipeRevealLayout.this.mRectMainClose.left;
                }
                return Math.max(a, left);
            }
            
            public int clampViewPositionVertical(final View view, int top, int a) {
                a = SwipeRevealLayout.this.mDragEdge;
                if (a != 4) {
                    if (a != 8) {
                        return view.getTop();
                    }
                    a = Math.min(top, SwipeRevealLayout.this.mRectMainClose.top);
                    top = SwipeRevealLayout.this.mRectMainClose.top - SwipeRevealLayout.this.mSecondaryView.getHeight();
                }
                else {
                    a = Math.min(top, SwipeRevealLayout.this.mRectMainClose.top + SwipeRevealLayout.this.mSecondaryView.getHeight());
                    top = SwipeRevealLayout.this.mRectMainClose.top;
                }
                return Math.max(a, top);
            }
            
            public void onEdgeDragStarted(final int n, final int n2) {
                super.onEdgeDragStarted(n, n2);
                if (SwipeRevealLayout.this.mLockDrag) {
                    return;
                }
                final int access$700 = SwipeRevealLayout.this.mDragEdge;
                final int n3 = 0;
                final boolean b = access$700 == 2 && n == 1;
                final boolean b2 = SwipeRevealLayout.this.mDragEdge == 1 && n == 2;
                final boolean b3 = SwipeRevealLayout.this.mDragEdge == 8 && n == 4;
                int n4 = n3;
                if (SwipeRevealLayout.this.mDragEdge == 4) {
                    n4 = n3;
                    if (n == 8) {
                        n4 = 1;
                    }
                }
                if (b || b2 || b3 || n4 != 0) {
                    SwipeRevealLayout.this.mDragHelper.d(SwipeRevealLayout.this.mMainView, n2);
                }
            }
            
            public void onViewDragStateChanged(final int n) {
                super.onViewDragStateChanged(n);
                final int access$1900 = SwipeRevealLayout.this.mState;
                Label_0132: {
                    if (n != 0) {
                        if (n == 1) {
                            SwipeRevealLayout.this.mState = 4;
                        }
                    }
                    else {
                        Label_0123: {
                            if (SwipeRevealLayout.this.mDragEdge != 1 && SwipeRevealLayout.this.mDragEdge != 2) {
                                if (SwipeRevealLayout.this.mMainView.getTop() != SwipeRevealLayout.this.mRectMainClose.top) {
                                    break Label_0123;
                                }
                            }
                            else if (SwipeRevealLayout.this.mMainView.getLeft() != SwipeRevealLayout.this.mRectMainClose.left) {
                                break Label_0123;
                            }
                            SwipeRevealLayout.this.mState = 0;
                            break Label_0132;
                        }
                        SwipeRevealLayout.this.mState = 2;
                    }
                }
                if (SwipeRevealLayout.this.mDragStateChangeListener != null && !SwipeRevealLayout.this.mAborted && access$1900 != SwipeRevealLayout.this.mState) {
                    SwipeRevealLayout.this.mDragStateChangeListener.onDragStateChanged(SwipeRevealLayout.this.mState);
                }
            }
            
            public void onViewPositionChanged(final View view, int access$1400, int n, final int n2, final int n3) {
                super.onViewPositionChanged(view, access$1400, n, n2, n3);
                access$1400 = SwipeRevealLayout.this.mMode;
                n = 1;
                if (access$1400 == 1) {
                    if (SwipeRevealLayout.this.mDragEdge != 1 && SwipeRevealLayout.this.mDragEdge != 2) {
                        SwipeRevealLayout.this.mSecondaryView.offsetTopAndBottom(n3);
                    }
                    else {
                        SwipeRevealLayout.this.mSecondaryView.offsetLeftAndRight(n2);
                    }
                }
                access$1400 = n;
                if (SwipeRevealLayout.this.mMainView.getLeft() == SwipeRevealLayout.this.mLastMainLeft) {
                    if (SwipeRevealLayout.this.mMainView.getTop() != SwipeRevealLayout.this.mLastMainTop) {
                        access$1400 = n;
                    }
                    else {
                        access$1400 = 0;
                    }
                }
                if (SwipeRevealLayout.this.mSwipeListener != null && access$1400 != 0) {
                    if (SwipeRevealLayout.this.mMainView.getLeft() == SwipeRevealLayout.this.mRectMainClose.left && SwipeRevealLayout.this.mMainView.getTop() == SwipeRevealLayout.this.mRectMainClose.top) {
                        SwipeRevealLayout.this.mSwipeListener.onClosed(SwipeRevealLayout.this);
                    }
                    else if (SwipeRevealLayout.this.mMainView.getLeft() == SwipeRevealLayout.this.mRectMainOpen.left && SwipeRevealLayout.this.mMainView.getTop() == SwipeRevealLayout.this.mRectMainOpen.top) {
                        SwipeRevealLayout.this.mSwipeListener.onOpened(SwipeRevealLayout.this);
                    }
                    else {
                        SwipeRevealLayout.this.mSwipeListener.onSlide(SwipeRevealLayout.this, this.getSlideOffset());
                    }
                }
                final SwipeRevealLayout this$0 = SwipeRevealLayout.this;
                this$0.mLastMainLeft = this$0.mMainView.getLeft();
                final SwipeRevealLayout this$2 = SwipeRevealLayout.this;
                this$2.mLastMainTop = this$2.mMainView.getTop();
                j0.l1((View)SwipeRevealLayout.this);
            }
            
            public void onViewReleased(final View view, final float n, final float n2) {
                final SwipeRevealLayout this$0 = SwipeRevealLayout.this;
                final int n3 = (int)n;
                final int access$1000 = this$0.pxToDp(n3);
                final int access$1001 = SwipeRevealLayout.this.mMinFlingVelocity;
                boolean b = false;
                final boolean b2 = access$1000 >= access$1001;
                final boolean b3 = SwipeRevealLayout.this.pxToDp(n3) <= -SwipeRevealLayout.this.mMinFlingVelocity;
                final SwipeRevealLayout this$2 = SwipeRevealLayout.this;
                final int n4 = (int)n2;
                final boolean b4 = this$2.pxToDp(n4) <= -SwipeRevealLayout.this.mMinFlingVelocity;
                if (SwipeRevealLayout.this.pxToDp(n4) >= SwipeRevealLayout.this.mMinFlingVelocity) {
                    b = true;
                }
                final int access$1002 = SwipeRevealLayout.this.getHalfwayPivotHorizontal();
                final int access$1003 = SwipeRevealLayout.this.getHalfwayPivotVertical();
                final int access$1004 = SwipeRevealLayout.this.mDragEdge;
                Label_0301: {
                    if (access$1004 != 1) {
                        if (access$1004 != 2) {
                            if (access$1004 != 4) {
                                if (access$1004 != 8) {
                                    return;
                                }
                                if (b4) {
                                    break Label_0301;
                                }
                                if (!b) {
                                    if (SwipeRevealLayout.this.mMainView.getBottom() < access$1003) {
                                        break Label_0301;
                                    }
                                }
                            }
                            else if (!b4) {
                                if (b) {
                                    break Label_0301;
                                }
                                if (SwipeRevealLayout.this.mMainView.getTop() >= access$1003) {
                                    break Label_0301;
                                }
                            }
                        }
                        else if (!b2) {
                            if (b3) {
                                break Label_0301;
                            }
                            if (SwipeRevealLayout.this.mMainView.getRight() < access$1002) {
                                break Label_0301;
                            }
                        }
                    }
                    else {
                        if (b2) {
                            break Label_0301;
                        }
                        if (!b3) {
                            if (SwipeRevealLayout.this.mMainView.getLeft() >= access$1002) {
                                break Label_0301;
                            }
                        }
                    }
                    SwipeRevealLayout.this.close(true);
                    return;
                }
                SwipeRevealLayout.this.open(true);
            }
            
            public boolean tryCaptureView(final View view, final int n) {
                SwipeRevealLayout.this.mAborted = false;
                if (SwipeRevealLayout.this.mLockDrag) {
                    return false;
                }
                SwipeRevealLayout.this.mDragHelper.d(SwipeRevealLayout.this.mMainView, n);
                return false;
            }
        };
        this.init(context, set);
    }
    
    public SwipeRevealLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mRectMainClose = new Rect();
        this.mRectMainOpen = new Rect();
        this.mRectSecClose = new Rect();
        this.mRectSecOpen = new Rect();
        this.mMinDistRequestDisallowParent = 0;
        this.mIsOpenBeforeInit = false;
        this.mAborted = false;
        this.mIsScrolling = false;
        this.mLockDrag = false;
        this.mMinFlingVelocity = 300;
        this.mState = 0;
        this.mMode = 0;
        this.mLastMainLeft = 0;
        this.mLastMainTop = 0;
        this.mDragEdge = 1;
        this.mDragDist = 0.0f;
        this.mPrevX = -1.0f;
        this.mPrevY = -1.0f;
        this.mOnLayoutCount = 0;
        this.mGestureListener = (GestureDetector$OnGestureListener)new GestureDetector$SimpleOnGestureListener() {
            boolean hasDisallowed = false;
            
            public boolean onDown(final MotionEvent motionEvent) {
                SwipeRevealLayout.this.mIsScrolling = false;
                this.hasDisallowed = false;
                return true;
            }
            
            public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
                SwipeRevealLayout.this.mIsScrolling = true;
                return false;
            }
            
            public boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
                final SwipeRevealLayout this$0 = SwipeRevealLayout.this;
                boolean b = true;
                this$0.mIsScrolling = true;
                if (SwipeRevealLayout.this.getParent() != null) {
                    if (!this.hasDisallowed) {
                        b = (SwipeRevealLayout.this.getDistToClosestEdge() >= SwipeRevealLayout.this.mMinDistRequestDisallowParent);
                        if (b) {
                            this.hasDisallowed = true;
                        }
                    }
                    SwipeRevealLayout.this.getParent().requestDisallowInterceptTouchEvent(b);
                }
                return false;
            }
        };
        this.mDragHelperCallback = new d$c() {
            private float getSlideOffset() {
                final int access$700 = SwipeRevealLayout.this.mDragEdge;
                int n = 0;
                int n2 = 0;
                Label_0121: {
                    if (access$700 == 1) {
                        n = SwipeRevealLayout.this.mMainView.getLeft();
                        n2 = SwipeRevealLayout.this.mRectMainClose.left;
                        break Label_0121;
                    }
                    if (access$700 == 2) {
                        n = SwipeRevealLayout.this.mRectMainClose.left;
                        n2 = SwipeRevealLayout.this.mMainView.getLeft();
                        break Label_0121;
                    }
                    int n3;
                    int n4;
                    if (access$700 != 4) {
                        if (access$700 != 8) {
                            return 0.0f;
                        }
                        n3 = SwipeRevealLayout.this.mRectMainClose.top;
                        n4 = SwipeRevealLayout.this.mMainView.getTop();
                    }
                    else {
                        n3 = SwipeRevealLayout.this.mMainView.getTop();
                        n4 = SwipeRevealLayout.this.mRectMainClose.top;
                    }
                    final float n5 = (float)(n3 - n4);
                    final int n6 = SwipeRevealLayout.this.mSecondaryView.getHeight();
                    return n5 / n6;
                }
                final float n5 = (float)(n - n2);
                final int n6 = SwipeRevealLayout.this.mSecondaryView.getWidth();
                return n5 / n6;
            }
            
            public int clampViewPositionHorizontal(final View view, int left, int a) {
                a = SwipeRevealLayout.this.mDragEdge;
                if (a != 1) {
                    if (a != 2) {
                        return view.getLeft();
                    }
                    a = Math.min(left, SwipeRevealLayout.this.mRectMainClose.left);
                    left = SwipeRevealLayout.this.mRectMainClose.left - SwipeRevealLayout.this.mSecondaryView.getWidth();
                }
                else {
                    a = Math.min(left, SwipeRevealLayout.this.mRectMainClose.left + SwipeRevealLayout.this.mSecondaryView.getWidth());
                    left = SwipeRevealLayout.this.mRectMainClose.left;
                }
                return Math.max(a, left);
            }
            
            public int clampViewPositionVertical(final View view, int top, int a) {
                a = SwipeRevealLayout.this.mDragEdge;
                if (a != 4) {
                    if (a != 8) {
                        return view.getTop();
                    }
                    a = Math.min(top, SwipeRevealLayout.this.mRectMainClose.top);
                    top = SwipeRevealLayout.this.mRectMainClose.top - SwipeRevealLayout.this.mSecondaryView.getHeight();
                }
                else {
                    a = Math.min(top, SwipeRevealLayout.this.mRectMainClose.top + SwipeRevealLayout.this.mSecondaryView.getHeight());
                    top = SwipeRevealLayout.this.mRectMainClose.top;
                }
                return Math.max(a, top);
            }
            
            public void onEdgeDragStarted(final int n, final int n2) {
                super.onEdgeDragStarted(n, n2);
                if (SwipeRevealLayout.this.mLockDrag) {
                    return;
                }
                final int access$700 = SwipeRevealLayout.this.mDragEdge;
                final int n3 = 0;
                final boolean b = access$700 == 2 && n == 1;
                final boolean b2 = SwipeRevealLayout.this.mDragEdge == 1 && n == 2;
                final boolean b3 = SwipeRevealLayout.this.mDragEdge == 8 && n == 4;
                int n4 = n3;
                if (SwipeRevealLayout.this.mDragEdge == 4) {
                    n4 = n3;
                    if (n == 8) {
                        n4 = 1;
                    }
                }
                if (b || b2 || b3 || n4 != 0) {
                    SwipeRevealLayout.this.mDragHelper.d(SwipeRevealLayout.this.mMainView, n2);
                }
            }
            
            public void onViewDragStateChanged(final int n) {
                super.onViewDragStateChanged(n);
                final int access$1900 = SwipeRevealLayout.this.mState;
                Label_0132: {
                    if (n != 0) {
                        if (n == 1) {
                            SwipeRevealLayout.this.mState = 4;
                        }
                    }
                    else {
                        Label_0123: {
                            if (SwipeRevealLayout.this.mDragEdge != 1 && SwipeRevealLayout.this.mDragEdge != 2) {
                                if (SwipeRevealLayout.this.mMainView.getTop() != SwipeRevealLayout.this.mRectMainClose.top) {
                                    break Label_0123;
                                }
                            }
                            else if (SwipeRevealLayout.this.mMainView.getLeft() != SwipeRevealLayout.this.mRectMainClose.left) {
                                break Label_0123;
                            }
                            SwipeRevealLayout.this.mState = 0;
                            break Label_0132;
                        }
                        SwipeRevealLayout.this.mState = 2;
                    }
                }
                if (SwipeRevealLayout.this.mDragStateChangeListener != null && !SwipeRevealLayout.this.mAborted && access$1900 != SwipeRevealLayout.this.mState) {
                    SwipeRevealLayout.this.mDragStateChangeListener.onDragStateChanged(SwipeRevealLayout.this.mState);
                }
            }
            
            public void onViewPositionChanged(final View view, int access$1400, int n, final int n2, final int n3) {
                super.onViewPositionChanged(view, access$1400, n, n2, n3);
                access$1400 = SwipeRevealLayout.this.mMode;
                n = 1;
                if (access$1400 == 1) {
                    if (SwipeRevealLayout.this.mDragEdge != 1 && SwipeRevealLayout.this.mDragEdge != 2) {
                        SwipeRevealLayout.this.mSecondaryView.offsetTopAndBottom(n3);
                    }
                    else {
                        SwipeRevealLayout.this.mSecondaryView.offsetLeftAndRight(n2);
                    }
                }
                access$1400 = n;
                if (SwipeRevealLayout.this.mMainView.getLeft() == SwipeRevealLayout.this.mLastMainLeft) {
                    if (SwipeRevealLayout.this.mMainView.getTop() != SwipeRevealLayout.this.mLastMainTop) {
                        access$1400 = n;
                    }
                    else {
                        access$1400 = 0;
                    }
                }
                if (SwipeRevealLayout.this.mSwipeListener != null && access$1400 != 0) {
                    if (SwipeRevealLayout.this.mMainView.getLeft() == SwipeRevealLayout.this.mRectMainClose.left && SwipeRevealLayout.this.mMainView.getTop() == SwipeRevealLayout.this.mRectMainClose.top) {
                        SwipeRevealLayout.this.mSwipeListener.onClosed(SwipeRevealLayout.this);
                    }
                    else if (SwipeRevealLayout.this.mMainView.getLeft() == SwipeRevealLayout.this.mRectMainOpen.left && SwipeRevealLayout.this.mMainView.getTop() == SwipeRevealLayout.this.mRectMainOpen.top) {
                        SwipeRevealLayout.this.mSwipeListener.onOpened(SwipeRevealLayout.this);
                    }
                    else {
                        SwipeRevealLayout.this.mSwipeListener.onSlide(SwipeRevealLayout.this, this.getSlideOffset());
                    }
                }
                final SwipeRevealLayout this$0 = SwipeRevealLayout.this;
                this$0.mLastMainLeft = this$0.mMainView.getLeft();
                final SwipeRevealLayout this$2 = SwipeRevealLayout.this;
                this$2.mLastMainTop = this$2.mMainView.getTop();
                j0.l1((View)SwipeRevealLayout.this);
            }
            
            public void onViewReleased(final View view, final float n, final float n2) {
                final SwipeRevealLayout this$0 = SwipeRevealLayout.this;
                final int n3 = (int)n;
                final int access$1000 = this$0.pxToDp(n3);
                final int access$1001 = SwipeRevealLayout.this.mMinFlingVelocity;
                boolean b = false;
                final boolean b2 = access$1000 >= access$1001;
                final boolean b3 = SwipeRevealLayout.this.pxToDp(n3) <= -SwipeRevealLayout.this.mMinFlingVelocity;
                final SwipeRevealLayout this$2 = SwipeRevealLayout.this;
                final int n4 = (int)n2;
                final boolean b4 = this$2.pxToDp(n4) <= -SwipeRevealLayout.this.mMinFlingVelocity;
                if (SwipeRevealLayout.this.pxToDp(n4) >= SwipeRevealLayout.this.mMinFlingVelocity) {
                    b = true;
                }
                final int access$1002 = SwipeRevealLayout.this.getHalfwayPivotHorizontal();
                final int access$1003 = SwipeRevealLayout.this.getHalfwayPivotVertical();
                final int access$1004 = SwipeRevealLayout.this.mDragEdge;
                Label_0301: {
                    if (access$1004 != 1) {
                        if (access$1004 != 2) {
                            if (access$1004 != 4) {
                                if (access$1004 != 8) {
                                    return;
                                }
                                if (b4) {
                                    break Label_0301;
                                }
                                if (!b) {
                                    if (SwipeRevealLayout.this.mMainView.getBottom() < access$1003) {
                                        break Label_0301;
                                    }
                                }
                            }
                            else if (!b4) {
                                if (b) {
                                    break Label_0301;
                                }
                                if (SwipeRevealLayout.this.mMainView.getTop() >= access$1003) {
                                    break Label_0301;
                                }
                            }
                        }
                        else if (!b2) {
                            if (b3) {
                                break Label_0301;
                            }
                            if (SwipeRevealLayout.this.mMainView.getRight() < access$1002) {
                                break Label_0301;
                            }
                        }
                    }
                    else {
                        if (b2) {
                            break Label_0301;
                        }
                        if (!b3) {
                            if (SwipeRevealLayout.this.mMainView.getLeft() >= access$1002) {
                                break Label_0301;
                            }
                        }
                    }
                    SwipeRevealLayout.this.close(true);
                    return;
                }
                SwipeRevealLayout.this.open(true);
            }
            
            public boolean tryCaptureView(final View view, final int n) {
                SwipeRevealLayout.this.mAborted = false;
                if (SwipeRevealLayout.this.mLockDrag) {
                    return false;
                }
                SwipeRevealLayout.this.mDragHelper.d(SwipeRevealLayout.this.mMainView, n);
                return false;
            }
        };
    }
    
    private void accumulateDragDist(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mDragDist = 0.0f;
            return;
        }
        final int dragEdge = this.getDragEdge();
        int n = 1;
        if (dragEdge != 1) {
            if (this.getDragEdge() == 2) {
                n = n;
            }
            else {
                n = 0;
            }
        }
        float n2;
        float n3;
        if (n != 0) {
            n2 = motionEvent.getX();
            n3 = this.mPrevX;
        }
        else {
            n2 = motionEvent.getY();
            n3 = this.mPrevY;
        }
        this.mDragDist += Math.abs(n2 - n3);
    }
    
    private boolean couldBecomeClick(final MotionEvent motionEvent) {
        return this.isInMainView(motionEvent) && !this.shouldInitiateADrag();
    }
    
    private int dpToPx(final int n) {
        return (int)(n * (this.getContext().getResources().getDisplayMetrics().densityDpi / 160.0f));
    }
    
    private int getDistToClosestEdge() {
        final int mDragEdge = this.mDragEdge;
        if (mDragEdge == 1) {
            return Math.min(this.mMainView.getLeft() - this.mRectMainClose.left, this.mRectMainClose.left + this.mSecondaryView.getWidth() - this.mMainView.getLeft());
        }
        if (mDragEdge == 2) {
            return Math.min(this.mMainView.getRight() - (this.mRectMainClose.right - this.mSecondaryView.getWidth()), this.mRectMainClose.right - this.mMainView.getRight());
        }
        if (mDragEdge == 4) {
            final int n = this.mRectMainClose.top + this.mSecondaryView.getHeight();
            return Math.min(this.mMainView.getBottom() - n, n - this.mMainView.getTop());
        }
        if (mDragEdge != 8) {
            return 0;
        }
        return Math.min(this.mRectMainClose.bottom - this.mMainView.getBottom(), this.mMainView.getBottom() - (this.mRectMainClose.bottom - this.mSecondaryView.getHeight()));
    }
    
    private int getHalfwayPivotHorizontal() {
        if (this.mDragEdge == 1) {
            return this.mRectMainClose.left + this.mSecondaryView.getWidth() / 2;
        }
        return this.mRectMainClose.right - this.mSecondaryView.getWidth() / 2;
    }
    
    private int getHalfwayPivotVertical() {
        if (this.mDragEdge == 4) {
            return this.mRectMainClose.top + this.mSecondaryView.getHeight() / 2;
        }
        return this.mRectMainClose.bottom - this.mSecondaryView.getHeight() / 2;
    }
    
    private int getMainOpenLeft() {
        final int mDragEdge = this.mDragEdge;
        if (mDragEdge == 1) {
            return this.mRectMainClose.left + this.mSecondaryView.getWidth();
        }
        if (mDragEdge == 2) {
            return this.mRectMainClose.left - this.mSecondaryView.getWidth();
        }
        if (mDragEdge == 4) {
            return this.mRectMainClose.left;
        }
        if (mDragEdge != 8) {
            return 0;
        }
        return this.mRectMainClose.left;
    }
    
    private int getMainOpenTop() {
        final int mDragEdge = this.mDragEdge;
        if (mDragEdge == 1) {
            return this.mRectMainClose.top;
        }
        if (mDragEdge == 2) {
            return this.mRectMainClose.top;
        }
        if (mDragEdge == 4) {
            return this.mRectMainClose.top + this.mSecondaryView.getHeight();
        }
        if (mDragEdge != 8) {
            return 0;
        }
        return this.mRectMainClose.top - this.mSecondaryView.getHeight();
    }
    
    private int getSecOpenLeft() {
        if (this.mMode != 0) {
            final int mDragEdge = this.mDragEdge;
            if (mDragEdge != 8) {
                if (mDragEdge != 4) {
                    if (mDragEdge == 1) {
                        return this.mRectSecClose.left + this.mSecondaryView.getWidth();
                    }
                    return this.mRectSecClose.left - this.mSecondaryView.getWidth();
                }
            }
        }
        return this.mRectSecClose.left;
    }
    
    private int getSecOpenTop() {
        if (this.mMode != 0) {
            final int mDragEdge = this.mDragEdge;
            if (mDragEdge != 1) {
                if (mDragEdge != 2) {
                    if (mDragEdge == 4) {
                        return this.mRectSecClose.top + this.mSecondaryView.getHeight();
                    }
                    return this.mRectSecClose.top - this.mSecondaryView.getHeight();
                }
            }
        }
        return this.mRectSecClose.top;
    }
    
    public static String getStateString(final int n) {
        if (n == 0) {
            return "state_close";
        }
        if (n == 1) {
            return "state_closing";
        }
        if (n == 2) {
            return "state_open";
        }
        if (n == 3) {
            return "state_opening";
        }
        if (n != 4) {
            return "undefined";
        }
        return "state_dragging";
    }
    
    private void init(final Context context, final AttributeSet set) {
        if (set != null && context != null) {
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, c.t.Ly, 0, 0);
            this.mDragEdge = obtainStyledAttributes.getInteger(0, 1);
            this.mMinFlingVelocity = obtainStyledAttributes.getInteger(1, 300);
            this.mMode = obtainStyledAttributes.getInteger(3, 0);
            this.mMinDistRequestDisallowParent = obtainStyledAttributes.getDimensionPixelSize(2, this.dpToPx(1));
        }
        (this.mDragHelper = d.p((ViewGroup)this, 1.0f, this.mDragHelperCallback)).T(15);
        this.mGestureDetector = new h(context, this.mGestureListener);
    }
    
    private void initRects() {
        this.mRectMainClose.set(this.mMainView.getLeft(), this.mMainView.getTop(), this.mMainView.getRight(), this.mMainView.getBottom());
        this.mRectSecClose.set(this.mSecondaryView.getLeft(), this.mSecondaryView.getTop(), this.mSecondaryView.getRight(), this.mSecondaryView.getBottom());
        this.mRectMainOpen.set(this.getMainOpenLeft(), this.getMainOpenTop(), this.getMainOpenLeft() + this.mMainView.getWidth(), this.getMainOpenTop() + this.mMainView.getHeight());
        this.mRectSecOpen.set(this.getSecOpenLeft(), this.getSecOpenTop(), this.getSecOpenLeft() + this.mSecondaryView.getWidth(), this.getSecOpenTop() + this.mSecondaryView.getHeight());
    }
    
    private boolean isInMainView(final MotionEvent motionEvent) {
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        final float n = (float)this.mMainView.getTop();
        boolean b = true;
        final boolean b2 = n <= y && y <= this.mMainView.getBottom();
        final boolean b3 = this.mMainView.getLeft() <= x && x <= this.mMainView.getRight();
        if (!b2 || !b3) {
            b = false;
        }
        return b;
    }
    
    private int pxToDp(final int n) {
        return (int)(n / (this.getContext().getResources().getDisplayMetrics().densityDpi / 160.0f));
    }
    
    private boolean shouldInitiateADrag() {
        return this.mDragDist >= this.mDragHelper.E();
    }
    
    protected void abort() {
        this.mAborted = true;
        this.mDragHelper.a();
    }
    
    public void close(final boolean b) {
        this.mIsOpenBeforeInit = false;
        this.mAborted = false;
        if (b) {
            this.mState = 1;
            final d mDragHelper = this.mDragHelper;
            final View mMainView = this.mMainView;
            final Rect mRectMainClose = this.mRectMainClose;
            mDragHelper.X(mMainView, mRectMainClose.left, mRectMainClose.top);
            final DragStateChangeListener mDragStateChangeListener = this.mDragStateChangeListener;
            if (mDragStateChangeListener != null) {
                mDragStateChangeListener.onDragStateChanged(this.mState);
            }
        }
        else {
            this.mState = 0;
            this.mDragHelper.a();
            final View mMainView2 = this.mMainView;
            final Rect mRectMainClose2 = this.mRectMainClose;
            mMainView2.layout(mRectMainClose2.left, mRectMainClose2.top, mRectMainClose2.right, mRectMainClose2.bottom);
            final View mSecondaryView = this.mSecondaryView;
            final Rect mRectSecClose = this.mRectSecClose;
            mSecondaryView.layout(mRectSecClose.left, mRectSecClose.top, mRectSecClose.right, mRectSecClose.bottom);
        }
        j0.l1((View)this);
    }
    
    public void computeScroll() {
        if (this.mDragHelper.o(true)) {
            j0.l1((View)this);
        }
    }
    
    public int getDragEdge() {
        return this.mDragEdge;
    }
    
    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }
    
    public boolean isClosed() {
        return this.mState == 0;
    }
    
    public boolean isDragLocked() {
        return this.mLockDrag;
    }
    
    public boolean isOpened() {
        return this.mState == 2;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        View mMainView;
        if (this.getChildCount() >= 2) {
            this.mSecondaryView = this.getChildAt(0);
            mMainView = this.getChildAt(1);
        }
        else {
            if (this.getChildCount() != 1) {
                return;
            }
            mMainView = this.getChildAt(0);
        }
        this.mMainView = mMainView;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.isDragLocked()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.mDragHelper.M(motionEvent);
        this.mGestureDetector.b(motionEvent);
        this.accumulateDragDist(motionEvent);
        final boolean couldBecomeClick = this.couldBecomeClick(motionEvent);
        final int f = this.mDragHelper.F();
        final boolean b = true;
        final boolean b2 = f == 2;
        final boolean b3 = this.mDragHelper.F() == 0 && this.mIsScrolling;
        this.mPrevX = motionEvent.getX();
        this.mPrevY = motionEvent.getY();
        if (!couldBecomeClick) {
            boolean b4 = b;
            if (b2) {
                return b4;
            }
            if (b3) {
                b4 = b;
                return b4;
            }
        }
        return false;
    }
    
    protected void onLayout(final boolean b, int n, final int n2, final int n3, final int n4) {
        this.mAborted = false;
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            final int paddingLeft = this.getPaddingLeft();
            final int max = Math.max(n3 - this.getPaddingRight() - n, 0);
            final int paddingTop = this.getPaddingTop();
            final int max2 = Math.max(n4 - this.getPaddingBottom() - n2, 0);
            int measuredHeight = child.getMeasuredHeight();
            final int measuredWidth = child.getMeasuredWidth();
            final ViewGroup$LayoutParams layoutParams = child.getLayoutParams();
            boolean b2;
            boolean b3;
            if (layoutParams != null) {
                final int height = layoutParams.height;
                b2 = (height == -1 || height == -1);
                final int width = layoutParams.width;
                b3 = (width == -1 || width == -1);
            }
            else {
                b3 = false;
                b2 = false;
            }
            if (b2) {
                measuredHeight = max2 - paddingTop;
                layoutParams.height = measuredHeight;
            }
            int width2 = measuredWidth;
            if (b3) {
                width2 = max - paddingLeft;
                layoutParams.width = width2;
            }
            final int mDragEdge = this.mDragEdge;
            int n5 = 0;
            int min = 0;
            int n6 = 0;
            int n7 = 0;
            Label_0426: {
                Label_0412: {
                    if (mDragEdge != 1) {
                        if (mDragEdge == 2) {
                            n5 = Math.max(n3 - width2 - this.getPaddingRight() - n, paddingLeft);
                            min = Math.min(this.getPaddingTop(), max2);
                            n6 = Math.max(n3 - this.getPaddingRight() - n, paddingLeft);
                            break Label_0412;
                        }
                        if (mDragEdge != 4) {
                            if (mDragEdge != 8) {
                                n5 = 0;
                                min = 0;
                                n6 = 0;
                                n7 = 0;
                                break Label_0426;
                            }
                            n5 = Math.min(this.getPaddingLeft(), max);
                            final int max3 = Math.max(n4 - measuredHeight - this.getPaddingBottom() - n2, paddingTop);
                            final int min2 = Math.min(width2 + this.getPaddingLeft(), max);
                            n7 = Math.max(n4 - this.getPaddingBottom() - n2, paddingTop);
                            min = max3;
                            n6 = min2;
                            break Label_0426;
                        }
                    }
                    n5 = Math.min(this.getPaddingLeft(), max);
                    final int min3 = Math.min(this.getPaddingTop(), max2);
                    n6 = Math.min(width2 + this.getPaddingLeft(), max);
                    min = min3;
                }
                n7 = Math.min(measuredHeight + this.getPaddingTop(), max2);
            }
            child.layout(n5, min, n6, n7);
        }
        Label_0553: {
            if (this.mMode == 1) {
                n = this.mDragEdge;
                View view2;
                if (n != 1) {
                    if (n != 2) {
                        View view;
                        if (n != 4) {
                            if (n != 8) {
                                break Label_0553;
                            }
                            view = this.mSecondaryView;
                            n = view.getHeight();
                        }
                        else {
                            view = this.mSecondaryView;
                            n = -view.getHeight();
                        }
                        view.offsetTopAndBottom(n);
                        break Label_0553;
                    }
                    view2 = this.mSecondaryView;
                    n = view2.getWidth();
                }
                else {
                    view2 = this.mSecondaryView;
                    n = -view2.getWidth();
                }
                view2.offsetLeftAndRight(n);
            }
        }
        this.initRects();
        if (this.mIsOpenBeforeInit) {
            this.open(false);
        }
        else {
            this.close(false);
        }
        this.mLastMainLeft = this.mMainView.getLeft();
        this.mLastMainTop = this.mMainView.getTop();
        ++this.mOnLayoutCount;
    }
    
    protected void onMeasure(int i, int size) {
        if (this.getChildCount() >= 2) {
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            final int mode = View$MeasureSpec.getMode(i);
            final int mode2 = View$MeasureSpec.getMode(size);
            int j = 0;
            int max = 0;
            int max2 = 0;
            int max3 = 0;
            int max4 = 0;
            while (j < this.getChildCount()) {
                final View child = this.getChildAt(j);
                final ViewGroup$LayoutParams layoutParams2 = child.getLayoutParams();
                this.measureChild(child, i, size);
                Label_0127: {
                    if (layoutParams2.height == -2) {
                        final int mDragEdge = this.mDragEdge;
                        if (mDragEdge == 1 || mDragEdge == 2) {
                            max = Math.max(child.getMeasuredHeight(), max);
                            break Label_0127;
                        }
                    }
                    max4 = Math.max(child.getMeasuredHeight(), max4);
                }
                Label_0183: {
                    if (layoutParams2.width == -2) {
                        final int mDragEdge2 = this.mDragEdge;
                        if (mDragEdge2 == 4 || mDragEdge2 == 8) {
                            max2 = Math.max(child.getMeasuredWidth(), max2);
                            break Label_0183;
                        }
                    }
                    max3 = Math.max(child.getMeasuredWidth(), max3);
                }
                ++j;
            }
            if (max == 0) {
                max = max4;
            }
            if (max2 == 0) {
                max2 = max3;
            }
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(max2, mode);
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(max, 1073741824);
            size = View$MeasureSpec.getSize(measureSpec2);
            int size2 = View$MeasureSpec.getSize(measureSpec);
            View child2;
            ViewGroup$LayoutParams layoutParams3;
            for (i = 0; i < this.getChildCount(); ++i) {
                child2 = this.getChildAt(i);
                layoutParams3 = child2.getLayoutParams();
                if (layoutParams3 != null) {
                    if (layoutParams3.height != -2) {
                        layoutParams3.height = size;
                    }
                    if (layoutParams3.width == -1) {
                        layoutParams3.width = size2;
                    }
                }
                this.measureChild(child2, measureSpec, measureSpec2);
            }
            i = max2 + (this.getPaddingLeft() + this.getPaddingRight());
            final int n = max + (this.getPaddingTop() + this.getPaddingBottom());
            if (mode != 1073741824) {
                if (layoutParams.width == -1) {
                    i = size2;
                }
                if (mode != Integer.MIN_VALUE || i <= size2) {
                    size2 = i;
                }
            }
            if (mode2 != 1073741824) {
                i = n;
                if (layoutParams.height == -1) {
                    i = size;
                }
                if (mode2 != Integer.MIN_VALUE || i <= size) {
                    size = i;
                }
            }
            this.setMeasuredDimension(size2, size);
            return;
        }
        throw new RuntimeException("Layout must have two children");
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        this.mGestureDetector.b(motionEvent);
        this.mDragHelper.M(motionEvent);
        return true;
    }
    
    public void open(final boolean b) {
        this.mIsOpenBeforeInit = true;
        this.mAborted = false;
        if (b) {
            this.mState = 3;
            final d mDragHelper = this.mDragHelper;
            final View mMainView = this.mMainView;
            final Rect mRectMainOpen = this.mRectMainOpen;
            mDragHelper.X(mMainView, mRectMainOpen.left, mRectMainOpen.top);
            final DragStateChangeListener mDragStateChangeListener = this.mDragStateChangeListener;
            if (mDragStateChangeListener != null) {
                mDragStateChangeListener.onDragStateChanged(this.mState);
            }
        }
        else {
            this.mState = 2;
            this.mDragHelper.a();
            final View mMainView2 = this.mMainView;
            final Rect mRectMainOpen2 = this.mRectMainOpen;
            mMainView2.layout(mRectMainOpen2.left, mRectMainOpen2.top, mRectMainOpen2.right, mRectMainOpen2.bottom);
            final View mSecondaryView = this.mSecondaryView;
            final Rect mRectSecOpen = this.mRectSecOpen;
            mSecondaryView.layout(mRectSecOpen.left, mRectSecOpen.top, mRectSecOpen.right, mRectSecOpen.bottom);
        }
        j0.l1((View)this);
    }
    
    public void setDragEdge(final int mDragEdge) {
        this.mDragEdge = mDragEdge;
    }
    
    void setDragStateChangeListener(final DragStateChangeListener mDragStateChangeListener) {
        this.mDragStateChangeListener = mDragStateChangeListener;
    }
    
    public void setLockDrag(final boolean mLockDrag) {
        this.mLockDrag = mLockDrag;
    }
    
    public void setMinFlingVelocity(final int mMinFlingVelocity) {
        this.mMinFlingVelocity = mMinFlingVelocity;
    }
    
    public void setSwipeListener(final SwipeListener mSwipeListener) {
        this.mSwipeListener = mSwipeListener;
    }
    
    protected boolean shouldRequestLayout() {
        return this.mOnLayoutCount < 2;
    }
    
    interface DragStateChangeListener
    {
        void onDragStateChanged(final int p0);
    }
    
    public static class SimpleSwipeListener implements SwipeListener
    {
        @Override
        public void onClosed(final SwipeRevealLayout swipeRevealLayout) {
        }
        
        @Override
        public void onOpened(final SwipeRevealLayout swipeRevealLayout) {
        }
        
        @Override
        public void onSlide(final SwipeRevealLayout swipeRevealLayout, final float n) {
        }
    }
    
    public interface SwipeListener
    {
        void onClosed(final SwipeRevealLayout p0);
        
        void onOpened(final SwipeRevealLayout p0);
        
        void onSlide(final SwipeRevealLayout p0, final float p1);
    }
}
