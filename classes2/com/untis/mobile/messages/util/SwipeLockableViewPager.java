// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util;

import android.annotation.SuppressLint;
import kotlin.h0;
import android.view.MotionEvent;
import kotlin.jvm.internal.k0;
import android.util.AttributeSet;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import androidx.viewpager.widget.ViewPager;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/messages/util/SwipeLockableViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "onInterceptTouchEvent", "swipeEnabled", "Lkotlin/j2;", "setSwipePagingEnabled", "Z", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SwipeLockableViewPager extends ViewPager
{
    private boolean swipeEnabled;
    
    public SwipeLockableViewPager(@e final Context context, @e final AttributeSet set) {
        k0.p(context, "context");
        k0.p(set, "attrs");
        super(context, set);
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    public boolean onInterceptTouchEvent(@e final MotionEvent motionEvent) {
        k0.p(motionEvent, "event");
        final boolean swipeEnabled = this.swipeEnabled;
        boolean onInterceptTouchEvent;
        if (swipeEnabled) {
            onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        }
        else {
            if (swipeEnabled) {
                throw new h0();
            }
            onInterceptTouchEvent = false;
        }
        return onInterceptTouchEvent;
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public boolean onTouchEvent(@e final MotionEvent motionEvent) {
        k0.p(motionEvent, "event");
        final boolean swipeEnabled = this.swipeEnabled;
        boolean onTouchEvent;
        if (swipeEnabled) {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        else {
            if (swipeEnabled) {
                throw new h0();
            }
            onTouchEvent = false;
        }
        return onTouchEvent;
    }
    
    public final void setSwipePagingEnabled(final boolean swipeEnabled) {
        this.swipeEnabled = swipeEnabled;
    }
}
