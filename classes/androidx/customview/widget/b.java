// 
// Decompiled by Procyon v0.5.36
// 

package androidx.customview.widget;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.graphics.Rect;

class b
{
    private b() {
    }
    
    private static boolean a(final int n, @j0 final Rect rect, @j0 final Rect rect2, @j0 final Rect rect3) {
        final boolean b = b(n, rect, rect2);
        final boolean b2 = b(n, rect, rect3);
        boolean b3 = false;
        if (b2 || !b) {
            return false;
        }
        if (!j(n, rect, rect3)) {
            return true;
        }
        if (n != 17 && n != 66) {
            if (k(n, rect, rect2) < m(n, rect, rect3)) {
                b3 = true;
            }
            return b3;
        }
        return true;
    }
    
    private static boolean b(final int n, @j0 final Rect rect, @j0 final Rect rect2) {
        final boolean b = true;
        boolean b2 = true;
        if (n != 17) {
            if (n != 33) {
                if (n == 66) {
                    return rect2.bottom >= rect.top && rect2.top <= rect.bottom && b;
                }
                if (n != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                b2 = false;
            }
            return b2;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom && b;
    }
    
    public static <L, T> T c(@j0 final L l, @j0 final b<L, T> b, @j0 final a<T> a, @k0 final T t, @j0 final Rect rect, final int n) {
        final Rect rect2 = new Rect(rect);
        final int n2 = 0;
        Label_0116: {
            int n3 = 0;
            Label_0108: {
                if (n != 17) {
                    int n4;
                    if (n != 33) {
                        if (n == 66) {
                            n3 = -(rect.width() + 1);
                            break Label_0108;
                        }
                        if (n != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        n4 = -(rect.height() + 1);
                    }
                    else {
                        n4 = rect.height() + 1;
                    }
                    rect2.offset(0, n4);
                    break Label_0116;
                }
                n3 = rect.width() + 1;
            }
            rect2.offset(n3, 0);
        }
        T t2 = null;
        final int b2 = b.b(l);
        final Rect rect3 = new Rect();
        for (int i = n2; i < b2; ++i) {
            final T a2 = b.a(l, i);
            if (a2 != t) {
                a.a(a2, rect3);
                if (h(n, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a2;
                }
            }
        }
        return t2;
    }
    
    public static <L, T> T d(@j0 final L l, @j0 final b<L, T> b, @j0 final a<T> a, @k0 final T t, final int n, final boolean b2, final boolean b3) {
        final int b4 = b.b(l);
        final ArrayList list = new ArrayList<T>(b4);
        for (int i = 0; i < b4; ++i) {
            list.add(b.a(l, i));
        }
        Collections.sort((List<T>)list, new c<Object>(b2, (a<? super T>)a));
        if (n == 1) {
            return f(t, (ArrayList<T>)list, b3);
        }
        if (n == 2) {
            return e(t, (ArrayList<T>)list, b3);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }
    
    private static <T> T e(final T o, final ArrayList<T> list, final boolean b) {
        final int size = list.size();
        int lastIndex;
        if (o == null) {
            lastIndex = -1;
        }
        else {
            lastIndex = list.lastIndexOf(o);
        }
        if (++lastIndex < size) {
            return list.get(lastIndex);
        }
        if (b && size > 0) {
            return list.get(0);
        }
        return null;
    }
    
    private static <T> T f(final T o, final ArrayList<T> list, final boolean b) {
        final int size = list.size();
        int index;
        if (o == null) {
            index = size;
        }
        else {
            index = list.indexOf(o);
        }
        if (--index >= 0) {
            return list.get(index);
        }
        if (b && size > 0) {
            return list.get(size - 1);
        }
        return null;
    }
    
    private static int g(final int n, final int n2) {
        return n * 13 * n + n2 * n2;
    }
    
    private static boolean h(final int n, @j0 final Rect rect, @j0 final Rect rect2, @j0 final Rect rect3) {
        final boolean i = i(rect, rect2, n);
        boolean b = false;
        if (!i) {
            return false;
        }
        if (!i(rect, rect3, n)) {
            return true;
        }
        if (a(n, rect, rect2, rect3)) {
            return true;
        }
        if (a(n, rect, rect3, rect2)) {
            return false;
        }
        if (g(k(n, rect, rect2), o(n, rect, rect2)) < g(k(n, rect, rect3), o(n, rect, rect3))) {
            b = true;
        }
        return b;
    }
    
    private static boolean i(@j0 final Rect rect, @j0 final Rect rect2, int n) {
        final boolean b = true;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = true;
        if (n == 17) {
            n = rect.right;
            final int right = rect2.right;
            return (n > right || rect.left >= right) && rect.left > rect2.left && b3;
        }
        if (n == 33) {
            n = rect.bottom;
            final int bottom = rect2.bottom;
            return (n > bottom || rect.top >= bottom) && rect.top > rect2.top && b2;
        }
        if (n == 66) {
            final int left = rect.left;
            n = rect2.left;
            return (left < n || rect.right <= n) && rect.right < rect2.right && b;
        }
        if (n == 130) {
            n = rect.top;
            final int top = rect2.top;
            if ((n >= top && rect.bottom > top) || rect.bottom >= rect2.bottom) {
                b4 = false;
            }
            return b4;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }
    
    private static boolean j(final int n, @j0 final Rect rect, @j0 final Rect rect2) {
        final boolean b = true;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = true;
        if (n == 17) {
            return rect.left >= rect2.right && b3;
        }
        if (n == 33) {
            return rect.top >= rect2.bottom && b2;
        }
        if (n == 66) {
            return rect.right <= rect2.left && b;
        }
        if (n == 130) {
            if (rect.bottom > rect2.top) {
                b4 = false;
            }
            return b4;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }
    
    private static int k(final int n, @j0 final Rect rect, @j0 final Rect rect2) {
        return Math.max(0, l(n, rect, rect2));
    }
    
    private static int l(int n, @j0 final Rect rect, @j0 final Rect rect2) {
        int n2;
        if (n != 17) {
            if (n != 33) {
                if (n != 66) {
                    if (n != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    n = rect2.top;
                    n2 = rect.bottom;
                }
                else {
                    n = rect2.left;
                    n2 = rect.right;
                }
            }
            else {
                n = rect.top;
                n2 = rect2.bottom;
            }
        }
        else {
            n = rect.left;
            n2 = rect2.right;
        }
        return n - n2;
    }
    
    private static int m(final int n, @j0 final Rect rect, @j0 final Rect rect2) {
        return Math.max(1, n(n, rect, rect2));
    }
    
    private static int n(int n, @j0 final Rect rect, @j0 final Rect rect2) {
        int n2;
        if (n != 17) {
            if (n != 33) {
                if (n != 66) {
                    if (n != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    n = rect2.bottom;
                    n2 = rect.bottom;
                }
                else {
                    n = rect2.right;
                    n2 = rect.right;
                }
            }
            else {
                n = rect.top;
                n2 = rect2.top;
            }
        }
        else {
            n = rect.left;
            n2 = rect2.left;
        }
        return n - n2;
    }
    
    private static int o(int n, @j0 final Rect rect, @j0 final Rect rect2) {
        Label_0073: {
            if (n == 17) {
                break Label_0073;
            }
            if (n != 33) {
                if (n == 66) {
                    break Label_0073;
                }
                if (n != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            n = rect.left + rect.width() / 2;
            final int n2 = rect2.left;
            final int n3 = rect2.width();
            return Math.abs(n - (n2 + n3 / 2));
        }
        n = rect.top + rect.height() / 2;
        final int n2 = rect2.top;
        final int n3 = rect2.height();
        return Math.abs(n - (n2 + n3 / 2));
    }
    
    public interface a<T>
    {
        void a(final T p0, final Rect p1);
    }
    
    public interface b<T, V>
    {
        V a(final T p0, final int p1);
        
        int b(final T p0);
    }
    
    private static class c<T> implements Comparator<T>
    {
        private final Rect G;
        private final Rect H;
        private final boolean I;
        private final a<T> J;
        
        c(final boolean i, final a<T> j) {
            this.G = new Rect();
            this.H = new Rect();
            this.I = i;
            this.J = j;
        }
        
        @Override
        public int compare(final T t, final T t2) {
            final Rect g = this.G;
            final Rect h = this.H;
            this.J.a(t, g);
            this.J.a(t2, h);
            final int top = g.top;
            final int top2 = h.top;
            int n = -1;
            if (top < top2) {
                return -1;
            }
            if (top > top2) {
                return 1;
            }
            final int left = g.left;
            final int left2 = h.left;
            if (left < left2) {
                if (this.I) {
                    n = 1;
                }
                return n;
            }
            if (left > left2) {
                if (!this.I) {
                    n = 1;
                }
                return n;
            }
            final int bottom = g.bottom;
            final int bottom2 = h.bottom;
            if (bottom < bottom2) {
                return -1;
            }
            if (bottom > bottom2) {
                return 1;
            }
            final int right = g.right;
            final int right2 = h.right;
            if (right < right2) {
                if (this.I) {
                    n = 1;
                }
                return n;
            }
            if (right > right2) {
                if (!this.I) {
                    n = 1;
                }
                return n;
            }
            return 0;
        }
    }
}
