// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import m6.g;
import java.util.Objects;
import n6.a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewGroup;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.d;
import kotlin.sequences.o;
import n6.p;
import kotlin.sequences.m;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.view.View$OnLayoutChangeListener;
import android.view.View$OnAttachStateChangeListener;
import kotlin.j2;
import n6.l;
import androidx.annotation.p0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u00f8\u0001\u0000\u001a5\u0010\b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u00f8\u0001\u0000\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u00f8\u0001\u0000\u001a5\u0010\u000b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u00f8\u0001\u0000\u001a5\u0010\f\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u00f8\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\u0087\b\u001a5\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\u0086\b\u001a\u0017\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\rH\u0086\b\u001a(\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0086\b\u00f8\u0001\u0000\u001a(\u0010\u001d\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0087\b\u00f8\u0001\u0000\u001a\u0014\u0010!\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a)\u0010%\u001a\u00020\u0005*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\u0086\b\u00f8\u0001\u0000\u001a<\u0010'\u001a\u00020\u0005\"\n\b\u0000\u0010&\u0018\u0001*\u00020\"*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(\"\u0018\u0010+\u001a\u00020\r*\u00020\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b)\u0010*\"*\u00102\u001a\u00020,*\u00020\u00002\u0006\u0010-\u001a\u00020,8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\"*\u00105\u001a\u00020,*\u00020\u00002\u0006\u0010-\u001a\u00020,8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010/\"\u0004\b4\u00101\"\u0018\u00107\u001a\u00020\r*\u00020\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b6\u0010*\"\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000008*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b9\u0010:\"*\u0010>\u001a\u00020,*\u00020\u00002\u0006\u0010-\u001a\u00020,8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010/\"\u0004\b=\u00101\"\u0018\u0010@\u001a\u00020\r*\u00020\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010*\"\u0018\u0010B\u001a\u00020\r*\u00020\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\bA\u0010*\"\u0018\u0010D\u001a\u00020\r*\u00020\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\bC\u0010*\"\u0018\u0010F\u001a\u00020\r*\u00020\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\bE\u0010*\"\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020G08*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\bH\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006J" }, d2 = { "Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "view", "Lkotlin/j2;", "action", "d", "c", "Landroidx/core/view/d0;", "e", "a", "b", "", "start", "top", "end", "bottom", "C", "left", "right", "A", "size", "w", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "s", "t", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "f", "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/s;", "block", "y", "T", "z", "(Landroid/view/View;Ln6/l;)V", "l", "(Landroid/view/View;)I", "marginLeft", "", "value", "q", "(Landroid/view/View;)Z", "v", "(Landroid/view/View;Z)V", "isInvisible", "r", "x", "isVisible", "n", "marginStart", "Lkotlin/sequences/m;", "h", "(Landroid/view/View;)Lkotlin/sequences/m;", "allViews", "p", "u", "isGone", "m", "marginRight", "j", "marginBottom", "o", "marginTop", "k", "marginEnd", "Landroid/view/ViewParent;", "i", "ancestors", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class n0
{
    public static final void A(@e final View view, @androidx.annotation.n0 final int n, @androidx.annotation.n0 final int n2, @androidx.annotation.n0 final int n3, @androidx.annotation.n0 final int n4) {
        k0.p((Object)view, "<this>");
        view.setPadding(n, n2, n3, n4);
    }
    
    @p0(17)
    public static final void C(@e final View view, @androidx.annotation.n0 final int n, @androidx.annotation.n0 final int n2, @androidx.annotation.n0 final int n3, @androidx.annotation.n0 final int n4) {
        k0.p((Object)view, "<this>");
        view.setPaddingRelative(n, n2, n3, n4);
    }
    
    public static final void a(@e final View view, @e final l<? super View, j2> l) {
        k0.p((Object)view, "<this>");
        k0.p((Object)l, "action");
        if (j0.N0(view)) {
            l.invoke((Object)view);
        }
        else {
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(@e final View view) {
                    k0.p((Object)view, "view");
                    view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                    l.invoke((Object)view);
                }
                
                public void onViewDetachedFromWindow(@e final View view) {
                    k0.p((Object)view, "view");
                }
            });
        }
    }
    
    public static final void b(@e final View view, @e final l<? super View, j2> l) {
        k0.p((Object)view, "<this>");
        k0.p((Object)l, "action");
        if (!j0.N0(view)) {
            l.invoke((Object)view);
        }
        else {
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(@e final View view) {
                    k0.p((Object)view, "view");
                }
                
                public void onViewDetachedFromWindow(@e final View view) {
                    k0.p((Object)view, "view");
                    view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                    l.invoke((Object)view);
                }
            });
        }
    }
    
    public static final void c(@e final View view, @e final l<? super View, j2> l) {
        k0.p((Object)view, "<this>");
        k0.p((Object)l, "action");
        if (j0.T0(view) && !view.isLayoutRequested()) {
            l.invoke((Object)view);
        }
        else {
            view.addOnLayoutChangeListener((View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
                public void onLayoutChange(@e final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
                    k0.p((Object)view, "view");
                    view.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                    l.invoke((Object)view);
                }
            });
        }
    }
    
    public static final void d(@e final View view, @e final l<? super View, j2> l) {
        k0.p((Object)view, "<this>");
        k0.p((Object)l, "action");
        view.addOnLayoutChangeListener((View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
            public void onLayoutChange(@e final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
                k0.p((Object)view, "view");
                view.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                l.invoke((Object)view);
            }
        });
    }
    
    @e
    public static final d0 e(@e final View view, @e final l<? super View, j2> l) {
        k0.p((Object)view, "<this>");
        k0.p((Object)l, "action");
        final d0 a = d0.a(view, new Runnable() {
            @Override
            public final void run() {
                l.invoke((Object)view);
            }
        });
        k0.o((Object)a, "View.doOnPreDraw(\n    crossinline action: (view: View) -> Unit\n): OneShotPreDrawListener = OneShotPreDrawListener.add(this) { action(this) }");
        return a;
    }
    
    @e
    public static final Bitmap f(@e final View view, @e final Bitmap$Config bitmap$Config) {
        k0.p((Object)view, "<this>");
        k0.p((Object)bitmap$Config, "config");
        if (j0.T0(view)) {
            final Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), bitmap$Config);
            k0.o((Object)bitmap, "createBitmap(width, height, config)");
            final Canvas canvas = new Canvas(bitmap);
            canvas.translate(-(float)view.getScrollX(), -(float)view.getScrollY());
            view.draw(canvas);
            return bitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }
    
    @e
    public static final m<View> h(@e final View view) {
        k0.p((Object)view, "<this>");
        return (m<View>)kotlin.sequences.p.e((p)new p<o<? super View>, d<? super j2>, Object>() {
            int H;
            private /* synthetic */ Object I;
            final /* synthetic */ View J;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object i, @e final d<?> d) {
                final p<o<? super View>, d<? super j2>, Object> p2 = (p<o<? super View>, d<? super j2>, Object>)new p<o<? super View>, d<? super j2>, Object>() {
                    int H;
                    private /* synthetic */ Object I;
                    final /* synthetic */ View J = this.J;
                };
                p2.I = i;
                return (d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = b.h();
                final int h2 = this.H;
                o o3;
                if (h2 != 0) {
                    if (h2 != 1) {
                        if (h2 == 2) {
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final o o2 = (o)this.I;
                        c1.n(o);
                        o3 = o2;
                    }
                }
                else {
                    c1.n(o);
                    final o i = (o)this.I;
                    final View j = this.J;
                    this.I = i;
                    this.H = 1;
                    o3 = i;
                    if (i.b((Object)j, (d)this) == h) {
                        return h;
                    }
                }
                final View k = this.J;
                if (k instanceof ViewGroup) {
                    final m<View> f = m0.f((ViewGroup)k);
                    this.I = null;
                    this.H = 2;
                    if (o3.f((m)f, (d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
            
            @org.jetbrains.annotations.f
            public final Object n(@e final o<? super View> o, @org.jetbrains.annotations.f final d<? super j2> d) {
                return ((n0$a)this.create(o, d)).invokeSuspend(j2.a);
            }
        });
    }
    
    @e
    public static final m<ViewParent> i(@e final View view) {
        k0.p((Object)view, "<this>");
        return (m<ViewParent>)kotlin.sequences.p.o((Object)view.getParent(), (l)n0$b.G);
    }
    
    public static final int j(@e final View view) {
        k0.p((Object)view, "<this>");
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
        }
        else {
            viewGroup$MarginLayoutParams = null;
        }
        int bottomMargin;
        if (viewGroup$MarginLayoutParams == null) {
            bottomMargin = 0;
        }
        else {
            bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
        }
        return bottomMargin;
    }
    
    public static final int k(@e final View view) {
        k0.p((Object)view, "<this>");
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        int b;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            b = n.b((ViewGroup$MarginLayoutParams)layoutParams);
        }
        else {
            b = 0;
        }
        return b;
    }
    
    public static final int l(@e final View view) {
        k0.p((Object)view, "<this>");
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
        }
        else {
            viewGroup$MarginLayoutParams = null;
        }
        int leftMargin;
        if (viewGroup$MarginLayoutParams == null) {
            leftMargin = 0;
        }
        else {
            leftMargin = viewGroup$MarginLayoutParams.leftMargin;
        }
        return leftMargin;
    }
    
    public static final int m(@e final View view) {
        k0.p((Object)view, "<this>");
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
        }
        else {
            viewGroup$MarginLayoutParams = null;
        }
        int rightMargin;
        if (viewGroup$MarginLayoutParams == null) {
            rightMargin = 0;
        }
        else {
            rightMargin = viewGroup$MarginLayoutParams.rightMargin;
        }
        return rightMargin;
    }
    
    public static final int n(@e final View view) {
        k0.p((Object)view, "<this>");
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        int c;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            c = n.c((ViewGroup$MarginLayoutParams)layoutParams);
        }
        else {
            c = 0;
        }
        return c;
    }
    
    public static final int o(@e final View view) {
        k0.p((Object)view, "<this>");
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
        }
        else {
            viewGroup$MarginLayoutParams = null;
        }
        int topMargin;
        if (viewGroup$MarginLayoutParams == null) {
            topMargin = 0;
        }
        else {
            topMargin = viewGroup$MarginLayoutParams.topMargin;
        }
        return topMargin;
    }
    
    public static final boolean p(@e final View view) {
        k0.p((Object)view, "<this>");
        return view.getVisibility() == 8;
    }
    
    public static final boolean q(@e final View view) {
        k0.p((Object)view, "<this>");
        return view.getVisibility() == 4;
    }
    
    public static final boolean r(@e final View view) {
        k0.p((Object)view, "<this>");
        return view.getVisibility() == 0;
    }
    
    @e
    public static final Runnable s(@e final View view, final long n, @e final a<j2> a) {
        k0.p((Object)view, "<this>");
        k0.p((Object)a, "action");
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                a.invoke();
            }
        };
        view.postDelayed((Runnable)runnable, n);
        return runnable;
    }
    
    @p0(16)
    @e
    public static final Runnable t(@e final View view, final long n, @e final a<j2> a) {
        k0.p((Object)view, "<this>");
        k0.p((Object)a, "action");
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                a.invoke();
            }
        };
        view.postOnAnimationDelayed((Runnable)runnable, n);
        return runnable;
    }
    
    public static final void u(@e final View view, final boolean b) {
        k0.p((Object)view, "<this>");
        int visibility;
        if (b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        view.setVisibility(visibility);
    }
    
    public static final void v(@e final View view, final boolean b) {
        k0.p((Object)view, "<this>");
        int visibility;
        if (b) {
            visibility = 4;
        }
        else {
            visibility = 0;
        }
        view.setVisibility(visibility);
    }
    
    public static final void w(@e final View view, @androidx.annotation.n0 final int n) {
        k0.p((Object)view, "<this>");
        view.setPadding(n, n, n, n);
    }
    
    public static final void x(@e final View view, final boolean b) {
        k0.p((Object)view, "<this>");
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        view.setVisibility(visibility);
    }
    
    public static final void y(@e final View view, @e final l<? super ViewGroup$LayoutParams, j2> l) {
        k0.p((Object)view, "<this>");
        k0.p((Object)l, "block");
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        l.invoke((Object)layoutParams);
        view.setLayoutParams(layoutParams);
    }
}
