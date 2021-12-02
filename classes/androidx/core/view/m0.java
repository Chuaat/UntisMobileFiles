// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import androidx.annotation.p0;
import androidx.annotation.n0;
import android.view.ViewGroup$MarginLayoutParams;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.d;
import kotlin.sequences.o;
import java.util.Iterator;
import kotlin.sequences.m;
import n6.p;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.k0;
import android.view.View;
import org.jetbrains.annotations.e;
import android.view.ViewGroup;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a3\u0010\u0011\u001a\u00020\b*\u00020\u00002!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\rH\u0086\b\u00f8\u0001\u0000\u001aH\u0010\u0013\u001a\u00020\b*\u00020\u000026\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0012H\u0086\b\u00f8\u0001\u0000\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014*\u00020\u0000H\u0086\u0002\u001a\u0017\u0010\u0018\u001a\u00020\b*\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0001H\u0086\b\u001a5\u0010\u001d\u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001b\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\u0086\b\u001a5\u0010 \u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u001e\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001f\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\u0087\b\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030!*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030!*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010#\"\u0018\u0010\u0017\u001a\u00020\u0001*\u00020\u00008\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)" }, d2 = { "Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "d", "view", "", "a", "Lkotlin/j2;", "l", "k", "h", "i", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "action", "b", "Lkotlin/Function2;", "c", "", "j", "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "m", "left", "top", "right", "bottom", "n", "start", "end", "p", "Lkotlin/sequences/m;", "f", "(Landroid/view/ViewGroup;)Lkotlin/sequences/m;", "descendants", "e", "children", "g", "(Landroid/view/ViewGroup;)I", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class m0
{
    public static final boolean a(@e final ViewGroup viewGroup, @e final View view) {
        k0.p((Object)viewGroup, "<this>");
        k0.p((Object)view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }
    
    public static final void b(@e final ViewGroup viewGroup, @e final l<? super View, j2> l) {
        k0.p((Object)viewGroup, "<this>");
        k0.p((Object)l, "action");
        final int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                final View child = viewGroup.getChildAt(n);
                k0.o((Object)child, "getChildAt(index)");
                l.invoke((Object)child);
                if (n2 >= childCount) {
                    break;
                }
                n = n2;
            }
        }
    }
    
    public static final void c(@e final ViewGroup viewGroup, @e final p<? super Integer, ? super View, j2> p2) {
        k0.p((Object)viewGroup, "<this>");
        k0.p((Object)p2, "action");
        final int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                final int n = i + 1;
                final View child = viewGroup.getChildAt(i);
                k0.o((Object)child, "getChildAt(index)");
                p2.invoke((Object)i, (Object)child);
                if (n >= childCount) {
                    break;
                }
                i = n;
            }
        }
    }
    
    @e
    public static final View d(@e final ViewGroup viewGroup, final int i) {
        k0.p((Object)viewGroup, "<this>");
        final View child = viewGroup.getChildAt(i);
        if (child != null) {
            return child;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @e
    public static final m<View> e(@e final ViewGroup viewGroup) {
        k0.p((Object)viewGroup, "<this>");
        return (m<View>)new m<View>() {
            @e
            public Iterator<View> iterator() {
                return m0.j(viewGroup);
            }
        };
    }
    
    @e
    public static final m<View> f(@e final ViewGroup viewGroup) {
        k0.p((Object)viewGroup, "<this>");
        return (m<View>)kotlin.sequences.p.e((p)new p<o<? super View>, d<? super j2>, Object>() {
            Object H;
            Object I;
            int J;
            int K;
            int L;
            private /* synthetic */ Object M;
            final /* synthetic */ ViewGroup N;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object m, @e final d<?> d) {
                final p<o<? super View>, d<? super j2>, Object> p2 = (p<o<? super View>, d<? super j2>, Object>)new p<o<? super View>, d<? super j2>, Object>() {
                    Object H;
                    Object I;
                    int J;
                    int K;
                    int L;
                    private /* synthetic */ Object M;
                    final /* synthetic */ ViewGroup N = this.N;
                };
                p2.M = m;
                return (d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = b.h();
                final int l = this.L;
                while (true) {
                    int n3 = 0;
                    int n4 = 0;
                    Label_0342: {
                        int k = 0;
                        int j = 0;
                        o o4 = null;
                        Object o5 = null;
                        ViewGroup viewGroup2 = null;
                        Label_0311: {
                            View child = null;
                            ViewGroup n = null;
                            o o2 = null;
                            Object o3 = null;
                            Label_0232: {
                                int n2;
                                int childCount;
                                if (l != 0) {
                                    if (l == 1) {
                                        k = this.K;
                                        j = this.J;
                                        child = (View)this.I;
                                        n = (ViewGroup)this.H;
                                        o2 = (o)this.M;
                                        c1.n(o);
                                        o3 = this;
                                        break Label_0232;
                                    }
                                    if (l == 2) {
                                        k = this.K;
                                        j = this.J;
                                        final ViewGroup viewGroup = (ViewGroup)this.H;
                                        o4 = (o)this.M;
                                        c1.n(o);
                                        o5 = this;
                                        viewGroup2 = viewGroup;
                                        break Label_0311;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                else {
                                    c1.n(o);
                                    o2 = (o)this.M;
                                    n = this.N;
                                    n2 = 0;
                                    childCount = n.getChildCount();
                                    if (childCount <= 0) {
                                        return j2.a;
                                    }
                                    o3 = this;
                                }
                                final int i = n2 + 1;
                                child = n.getChildAt(n2);
                                k0.o((Object)child, "getChildAt(index)");
                                ((m0$b)o3).M = o2;
                                ((m0$b)o3).H = n;
                                ((m0$b)o3).I = child;
                                ((m0$b)o3).J = i;
                                ((m0$b)o3).K = childCount;
                                ((m0$b)o3).L = 1;
                                if (o2.b((Object)child, (d)o3) == h) {
                                    return h;
                                }
                                k = childCount;
                                j = i;
                            }
                            if (!(child instanceof ViewGroup)) {
                                n3 = k;
                                n4 = j;
                                break Label_0342;
                            }
                            final m<View> f = m0.f((ViewGroup)child);
                            ((m0$b)o3).M = o2;
                            ((m0$b)o3).H = n;
                            ((m0$b)o3).I = null;
                            ((m0$b)o3).J = j;
                            ((m0$b)o3).K = k;
                            ((m0$b)o3).L = 2;
                            if (o2.f((m)f, (d)o3) == h) {
                                return h;
                            }
                            final ViewGroup viewGroup3 = n;
                            o4 = o2;
                            o5 = o3;
                            viewGroup2 = viewGroup3;
                        }
                        final o o6 = o4;
                        n3 = k;
                        ViewGroup n = viewGroup2;
                        n4 = j;
                        Object o3 = o5;
                        o o2 = o6;
                    }
                    int n2 = n4;
                    int childCount = n3;
                    if (n4 < n3) {
                        continue;
                    }
                    break;
                }
                return j2.a;
            }
            
            @org.jetbrains.annotations.f
            public final Object n(@e final o<? super View> o, @org.jetbrains.annotations.f final d<? super j2> d) {
                return ((m0$b)this.create(o, d)).invokeSuspend(j2.a);
            }
        });
    }
    
    public static final int g(@e final ViewGroup viewGroup) {
        k0.p((Object)viewGroup, "<this>");
        return viewGroup.getChildCount();
    }
    
    public static final boolean h(@e final ViewGroup viewGroup) {
        k0.p((Object)viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }
    
    public static final boolean i(@e final ViewGroup viewGroup) {
        k0.p((Object)viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }
    
    @e
    public static final Iterator<View> j(@e final ViewGroup viewGroup) {
        k0.p((Object)viewGroup, "<this>");
        return new Iterator<View>() {
            private int G;
            
            @e
            public View a() {
                final View child = viewGroup.getChildAt(this.G++);
                if (child != null) {
                    return child;
                }
                throw new IndexOutOfBoundsException();
            }
            
            @Override
            public boolean hasNext() {
                return this.G < viewGroup.getChildCount();
            }
            
            @Override
            public void remove() {
                viewGroup.removeViewAt(--this.G);
            }
        };
    }
    
    public static final void k(@e final ViewGroup viewGroup, @e final View view) {
        k0.p((Object)viewGroup, "<this>");
        k0.p((Object)view, "view");
        viewGroup.removeView(view);
    }
    
    public static final void l(@e final ViewGroup viewGroup, @e final View view) {
        k0.p((Object)viewGroup, "<this>");
        k0.p((Object)view, "view");
        viewGroup.addView(view);
    }
    
    public static final void m(@e final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, @n0 final int n) {
        k0.p((Object)viewGroup$MarginLayoutParams, "<this>");
        viewGroup$MarginLayoutParams.setMargins(n, n, n, n);
    }
    
    public static final void n(@e final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, @n0 final int n, @n0 final int n2, @n0 final int n3, @n0 final int n4) {
        k0.p((Object)viewGroup$MarginLayoutParams, "<this>");
        viewGroup$MarginLayoutParams.setMargins(n, n2, n3, n4);
    }
    
    @p0(17)
    public static final void p(@e final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, @n0 final int marginStart, @n0 final int topMargin, @n0 final int marginEnd, @n0 final int bottomMargin) {
        k0.p((Object)viewGroup$MarginLayoutParams, "<this>");
        viewGroup$MarginLayoutParams.setMarginStart(marginStart);
        viewGroup$MarginLayoutParams.topMargin = topMargin;
        viewGroup$MarginLayoutParams.setMarginEnd(marginEnd);
        viewGroup$MarginLayoutParams.bottomMargin = bottomMargin;
    }
}
