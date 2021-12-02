// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.conflicts;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.annotation.SuppressLint;
import android.view.View$OnTouchListener;
import android.graphics.Canvas;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$g0;
import androidx.recyclerview.widget.o$f;
import androidx.recyclerview.widget.o;
import kotlin.jvm.internal.k0;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.recyclerview.widget.o$i;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J@\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0016J@\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'" }, d2 = { "Lcom/untis/mobile/substitutionplanning/conflicts/b;", "Landroidx/recyclerview/widget/o$i;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "viewHolder", "", "dX", "Lkotlin/j2;", "L", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "dY", "", "actionState", "", "currentlyActive", "M", "Landroid/view/View;", "view", "rawX", "K", "J", "target", "A", "l", "D", "flags", "layoutDirection", "d", "isCurrentlyActive", "w", "Lcom/untis/mobile/substitutionplanning/conflicts/b$a;", "k", "Lcom/untis/mobile/substitutionplanning/conflicts/b$a;", "status", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends o$i
{
    @e
    private a k;
    
    public b(@e final RecyclerView recyclerView) {
        k0.p(recyclerView, "recyclerView");
        super(0, 20);
        this.k = a.G;
        new o((o$f)this).m(recyclerView);
    }
    
    private final float J(final RecyclerView$g0 recyclerView$g0) {
        final View itemView = recyclerView$g0.itemView;
        final int kc = c.i.KC;
        final int visibility = ((ImageView)itemView.findViewById(kc)).getVisibility();
        float n = 0.0f;
        if (visibility == 0) {
            n = 0.0f + ((ImageView)recyclerView$g0.itemView.findViewById(kc)).getWidth();
        }
        final View itemView2 = recyclerView$g0.itemView;
        final int lc = c.i.LC;
        float n2 = n;
        if (((ImageView)itemView2.findViewById(lc)).getVisibility() == 0) {
            n2 = n + ((ImageView)recyclerView$g0.itemView.findViewById(lc)).getWidth();
        }
        return n2;
    }
    
    private final boolean K(final View view, final float n) {
        final float x = view.getX();
        final float n2 = (float)view.getWidth();
        return n > x && n < n2 + x;
    }
    
    private final void L(final RecyclerView$g0 recyclerView$g0, final float n) {
        final float n2 = -this.J(recyclerView$g0);
        float translationX = n;
        if (n < n2) {
            translationX = n2;
        }
        ((ViewGroup)recyclerView$g0.itemView.findViewById(c.i.MC)).setTranslationX(translationX);
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    private final void M(final Canvas canvas, final RecyclerView recyclerView, final RecyclerView$g0 recyclerView$g0, final float n, final float n2, final int n3, final boolean b) {
        ((ViewGroup)recyclerView).setOnTouchListener((View$OnTouchListener)new com.untis.mobile.substitutionplanning.conflicts.a(this, n, recyclerView$g0));
    }
    
    private static final boolean N(final b b, final float n, final RecyclerView$g0 recyclerView$g0, View itemView, final MotionEvent motionEvent) {
        k0.p(b, "this$0");
        k0.p(recyclerView$g0, "$viewHolder");
        final int action = motionEvent.getAction();
        final int n2 = 1;
        final boolean b2 = action == 1;
        int n3 = n2;
        if (motionEvent.getAction() != 3) {
            if (b2) {
                n3 = n2;
            }
            else {
                n3 = 0;
            }
        }
        if (b.k == a.H && n3 != 0) {
            a k;
            if (n <= -b.J(recyclerView$g0)) {
                k = a.G;
            }
            else {
                k = a.I;
            }
            b.k = k;
        }
        else if (b2) {
            itemView = recyclerView$g0.itemView;
            final int lc = c.i.LC;
            final AppCompatImageView appCompatImageView = (AppCompatImageView)itemView.findViewById(lc);
            k0.o(appCompatImageView, "viewHolder.itemView.item_teacher_absence_conflict_action_publish");
            if (b.K((View)appCompatImageView, motionEvent.getRawX())) {
                ((ImageView)recyclerView$g0.itemView.findViewById(lc)).performClick();
            }
        }
        return false;
    }
    
    public boolean A(@e final RecyclerView recyclerView, @e final RecyclerView$g0 recyclerView$g0, @e final RecyclerView$g0 recyclerView$g2) {
        k0.p(recyclerView, "recyclerView");
        k0.p(recyclerView$g0, "viewHolder");
        k0.p(recyclerView$g2, "target");
        return false;
    }
    
    public void D(@e final RecyclerView$g0 recyclerView$g0, final int n) {
        k0.p(recyclerView$g0, "viewHolder");
    }
    
    public int d(final int n, final int n2) {
        if (this.k == a.H) {
            this.k = a.G;
            return 0;
        }
        return super.d(n, n2);
    }
    
    public int l(@e final RecyclerView recyclerView, @e final RecyclerView$g0 recyclerView$g0) {
        k0.p(recyclerView, "recyclerView");
        k0.p(recyclerView$g0, "viewHolder");
        return o$f.v(0, 20);
    }
    
    public void w(@e final Canvas canvas, @e final RecyclerView recyclerView, @e final RecyclerView$g0 recyclerView$g0, final float n, final float n2, final int n3, final boolean b) {
        k0.p(canvas, "canvas");
        k0.p(recyclerView, "recyclerView");
        k0.p(recyclerView$g0, "viewHolder");
        if (n3 == 1) {
            this.M(canvas, recyclerView, recyclerView$g0, n, n2, n3, b);
        }
        this.L(recyclerView$g0, n);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/substitutionplanning/conflicts/b$a", "", "Lcom/untis/mobile/substitutionplanning/conflicts/b$a;", "<init>", "(Ljava/lang/String;I)V", "Idle", "Swiping", "FixedOnButton", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum a
    {
        G, 
        H, 
        I;
        
        static {
            J = b();
        }
        
        private static final /* synthetic */ a[] b() {
            return new a[] { a.G, a.H, a.I };
        }
    }
}
