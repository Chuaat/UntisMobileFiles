// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.views;

import m6.h;
import kotlin.jvm.internal.w;
import android.util.AttributeSet;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.content.Context;
import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;
import androidx.core.widget.NestedScrollView;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014R?\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/ui/activities/views/NestedScrollViewWithListener;", "Landroidx/core/widget/NestedScrollView;", "", "l", "t", "oldl", "oldt", "Lkotlin/j2;", "onScrollChanged", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "top", "listener", "Ln6/l;", "getListener", "()Ln6/l;", "setListener", "(Ln6/l;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class NestedScrollViewWithListener extends NestedScrollView
{
    @f
    private l<? super Integer, j2> q0;
    
    @h
    public NestedScrollViewWithListener(@e final Context context) {
        k0.p(context, "context");
        this(context, null, 0, 6, null);
    }
    
    @h
    public NestedScrollViewWithListener(@e final Context context, @f final AttributeSet set) {
        k0.p(context, "context");
        this(context, set, 0, 4, null);
    }
    
    @h
    public NestedScrollViewWithListener(@e final Context context, @f final AttributeSet set, final int n) {
        k0.p(context, "context");
        super(context, set, n);
    }
    
    public void X() {
    }
    
    @f
    public final l<Integer, j2> getListener() {
        return (l<Integer, j2>)this.q0;
    }
    
    protected void onScrollChanged(final int n, final int i, final int n2, final int n3) {
        super.onScrollChanged(n, i, n2, n3);
        final l<? super Integer, j2> q0 = this.q0;
        if (q0 != null) {
            q0.invoke(i);
        }
    }
    
    public final void setListener(@f final l<? super Integer, j2> q0) {
        this.q0 = q0;
    }
}
