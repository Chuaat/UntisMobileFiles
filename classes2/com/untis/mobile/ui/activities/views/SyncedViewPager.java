// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.views;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.MotionEvent;
import kotlin.jvm.internal.k0;
import android.util.AttributeSet;
import org.jetbrains.annotations.e;
import android.content.Context;
import org.jetbrains.annotations.f;
import kotlin.Metadata;
import androidx.viewpager.widget.ViewPager;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0017J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0016R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/ui/activities/views/SyncedViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "onTouchEvent", "", "item", "Lkotlin/j2;", "setCurrentItem", "smoothScroll", "H", "Z", "forSuper", "G", "Lcom/untis/mobile/ui/activities/views/SyncedViewPager;", "getOtherViewPager", "()Lcom/untis/mobile/ui/activities/views/SyncedViewPager;", "setOtherViewPager", "(Lcom/untis/mobile/ui/activities/views/SyncedViewPager;)V", "otherViewPager", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SyncedViewPager extends ViewPager
{
    @f
    private SyncedViewPager G;
    private boolean H;
    
    public SyncedViewPager(@e final Context context, @e final AttributeSet set) {
        k0.p(context, "context");
        k0.p(set, "attrs");
        super(context, set);
    }
    
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public final SyncedViewPager getOtherViewPager() {
        return this.G;
    }
    
    public boolean onInterceptTouchEvent(@f final MotionEvent motionEvent) {
        final boolean h = this.H;
        boolean onInterceptTouchEvent = false;
        if (!h) {
            final SyncedViewPager g = this.G;
            if (g != null) {
                g.H = true;
            }
            if (g != null) {
                g.onInterceptTouchEvent(motionEvent);
            }
            final SyncedViewPager g2 = this.G;
            if (g2 != null) {
                g2.H = false;
            }
        }
        Log.d("untis_log", k0.C("SyncedViewPager onInterceptTouchEvent, forSuper : ", this.H));
        try {
            onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        }
        catch (Exception ex) {
            Log.e("untis_log", "error on synced viewpager onInterceptTouchEvent", (Throwable)ex);
        }
        return onInterceptTouchEvent;
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public boolean onTouchEvent(@f final MotionEvent motionEvent) {
        final boolean h = this.H;
        boolean onTouchEvent = true;
        if (!h) {
            final SyncedViewPager g = this.G;
            if (g != null) {
                g.H = true;
            }
            if (g != null) {
                g.onTouchEvent(motionEvent);
            }
            final SyncedViewPager g2 = this.G;
            if (g2 != null) {
                g2.H = false;
            }
        }
        Log.d("untis_log", k0.C("SyncedViewPager onTouchEvent, forSuper : ", this.H));
        try {
            onTouchEvent = super.onTouchEvent(motionEvent);
            return onTouchEvent;
        }
        catch (Exception ex) {
            return onTouchEvent;
        }
    }
    
    public void setCurrentItem(final int n) {
        if (!this.H) {
            final SyncedViewPager g = this.G;
            if (g != null) {
                g.H = true;
            }
            if (g != null) {
                g.setCurrentItem(n);
            }
            final SyncedViewPager g2 = this.G;
            if (g2 != null) {
                g2.H = false;
            }
        }
        Log.d("untis_log", k0.C("SyncedViewPager setCurrentItem, forSuper : ", this.H));
        try {
            super.setCurrentItem(n);
        }
        catch (Exception ex) {}
    }
    
    public void setCurrentItem(final int n, final boolean b) {
        if (!this.H) {
            final SyncedViewPager g = this.G;
            if (g != null) {
                g.H = true;
            }
            if (g != null) {
                g.setCurrentItem(n, b);
            }
            final SyncedViewPager g2 = this.G;
            if (g2 != null) {
                g2.H = false;
            }
        }
        Log.d("untis_log", k0.C("SyncedViewPager setCurrentItem(smoothScroll), forSuper : ", this.H));
        try {
            super.setCurrentItem(n, b);
        }
        catch (Exception ex) {}
    }
    
    public final void setOtherViewPager(@f final SyncedViewPager g) {
        this.G = g;
    }
}
