// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.views;

import android.view.View$OnTouchListener;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.view.ScaleGestureDetector$SimpleOnScaleGestureListener;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.utils.a;
import android.util.AttributeSet;
import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import android.view.ScaleGestureDetector;
import org.jetbrains.annotations.f;
import com.untis.mobile.ui.activities.timetable.v;
import kotlin.Metadata;
import android.widget.ScrollView;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0019\u0010\u001dB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0019\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006!" }, d2 = { "Lcom/untis/mobile/ui/activities/views/VerticalZoomableScrollView;", "Landroid/widget/ScrollView;", "", "scale", "Lkotlin/j2;", "h", "Lcom/untis/mobile/ui/activities/timetable/v;", "timeTableActivityService", "setTimeTableActivityAndInit", "G", "Lcom/untis/mobile/ui/activities/timetable/v;", "J", "F", "Lcom/untis/mobile/persistence/models/profile/Profile;", "K", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Landroid/view/ScaleGestureDetector;", "H", "Landroid/view/ScaleGestureDetector;", "scaleGestureDetector", "I", "scaleCorrection", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class VerticalZoomableScrollView extends ScrollView
{
    @f
    private v G;
    @f
    private ScaleGestureDetector H;
    private float I;
    private float J;
    @e
    private Profile K;
    
    public VerticalZoomableScrollView(@e final Context context) {
        k0.p(context, "context");
        this(context, null);
    }
    
    public VerticalZoomableScrollView(@e final Context context, @f final AttributeSet set) {
        k0.p(context, "context");
        this(context, set, 0);
    }
    
    public VerticalZoomableScrollView(@e final Context context, @f final AttributeSet set, final int n) {
        k0.p(context, "context");
        super(context, set, n);
        this.I = 1.0f;
        this.J = 1.0f * 0.5f;
        final float u = a.a(context).u();
        this.I = u;
        this.J = u * 0.5f;
        Profile n2;
        if ((n2 = j0.G.n()) == null) {
            n2 = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        this.K = n2;
    }
    
    public static final /* synthetic */ Profile c(final VerticalZoomableScrollView verticalZoomableScrollView) {
        return verticalZoomableScrollView.K;
    }
    
    public static final /* synthetic */ float d(final VerticalZoomableScrollView verticalZoomableScrollView) {
        return verticalZoomableScrollView.J;
    }
    
    public static final /* synthetic */ float e(final VerticalZoomableScrollView verticalZoomableScrollView) {
        return verticalZoomableScrollView.I;
    }
    
    public static final /* synthetic */ void f(final VerticalZoomableScrollView verticalZoomableScrollView, final float j) {
        verticalZoomableScrollView.J = j;
    }
    
    private static final boolean g(final VerticalZoomableScrollView verticalZoomableScrollView, final View view, final MotionEvent motionEvent) {
        k0.p(verticalZoomableScrollView, "this$0");
        if (motionEvent == null) {
            return false;
        }
        try {
            final ScaleGestureDetector h = verticalZoomableScrollView.H;
            if (h != null) {
                h.onTouchEvent(motionEvent);
            }
            final ScaleGestureDetector h2 = verticalZoomableScrollView.H;
            if (h2 != null && h2.isInProgress()) {
                return true;
            }
        }
        catch (Exception ex) {
            Log.e("untis_log", "error on scalegesturedetector.ontouchevent", (Throwable)ex);
        }
        return false;
    }
    
    public void b() {
    }
    
    public final void h(final float j) {
        this.J = j;
    }
    
    public final void setTimeTableActivityAndInit(@e final v g) {
        k0.p(g, "timeTableActivityService");
        this.G = g;
        this.J = g.h1();
        this.H = new ScaleGestureDetector(this.getContext(), (ScaleGestureDetector$OnScaleGestureListener)new ScaleGestureDetector$SimpleOnScaleGestureListener() {
            private float a = VerticalZoomableScrollView.d(VerticalZoomableScrollView.this);
            private float b = VerticalZoomableScrollView.d(VerticalZoomableScrollView.this);
            private float c = VerticalZoomableScrollView.d(VerticalZoomableScrollView.this);
            final /* synthetic */ VerticalZoomableScrollView d;
            
            public boolean onScale(@f final ScaleGestureDetector scaleGestureDetector) {
                if (scaleGestureDetector == null) {
                    return true;
                }
                if (!com.untis.mobile.utils.a.a(this.d.getContext()).I(VerticalZoomableScrollView.c(this.d))) {
                    return true;
                }
                final float n = this.b * scaleGestureDetector.getCurrentSpan() / this.a;
                final float n2 = VerticalZoomableScrollView.e(this.d) * 4.0f;
                final float n3 = VerticalZoomableScrollView.e(this.d) * 0.5f;
                if (VerticalZoomableScrollView.d(this.d) >= n2 && n > VerticalZoomableScrollView.d(this.d)) {
                    return true;
                }
                if (VerticalZoomableScrollView.d(this.d) <= n3 && n < VerticalZoomableScrollView.d(this.d)) {
                    return true;
                }
                float c = n;
                if (n > n2) {
                    c = n2;
                }
                if (c < n3) {
                    c = n3;
                }
                g.h2(c);
                final int n4 = (int)scaleGestureDetector.getFocusY();
                final VerticalZoomableScrollView d = this.d;
                d.scrollTo(d.getScrollX(), (int)((this.d.getScrollY() + n4) * (c / this.c)) - n4);
                this.c = c;
                return true;
            }
            
            public boolean onScaleBegin(@f final ScaleGestureDetector scaleGestureDetector) {
                if (scaleGestureDetector == null) {
                    return true;
                }
                if (!com.untis.mobile.utils.a.a(this.d.getContext()).I(VerticalZoomableScrollView.c(this.d))) {
                    return true;
                }
                this.a = scaleGestureDetector.getCurrentSpan();
                this.b = VerticalZoomableScrollView.d(this.d);
                this.c = VerticalZoomableScrollView.d(this.d);
                g.p2();
                return true;
            }
            
            public void onScaleEnd(@f final ScaleGestureDetector scaleGestureDetector) {
                if (!com.untis.mobile.utils.a.a(this.d.getContext()).I(VerticalZoomableScrollView.c(this.d))) {
                    return;
                }
                VerticalZoomableScrollView.f(this.d, this.c);
                g.n1();
            }
        });
        this.setOnTouchListener((View$OnTouchListener)new g(this));
    }
}
