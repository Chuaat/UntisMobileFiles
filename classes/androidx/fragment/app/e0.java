// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.core.os.c;
import androidx.core.view.d0;
import android.view.ViewParent;
import android.graphics.RectF;
import android.graphics.Rect;
import androidx.core.view.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import android.view.ViewGroup;
import androidx.core.view.j0;
import android.view.View;
import java.util.List;
import androidx.annotation.t0;
import android.annotation.SuppressLint;

@SuppressLint({ "UnknownNullness" })
@t0({ t0.a.I })
public abstract class e0
{
    protected static void d(final List<View> list, View child) {
        final int size = list.size();
        if (h(list, child, size)) {
            return;
        }
        if (j0.w0(child) != null) {
            list.add(child);
        }
        for (int i = size; i < list.size(); ++i) {
            child = list.get(i);
            if (child instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)child;
                for (int childCount = viewGroup.getChildCount(), j = 0; j < childCount; ++j) {
                    child = viewGroup.getChildAt(j);
                    if (!h(list, child, size) && j0.w0(child) != null) {
                        list.add(child);
                    }
                }
            }
        }
    }
    
    private static boolean h(final List<View> list, final View view, final int n) {
        for (int i = 0; i < n; ++i) {
            if (list.get(i) == view) {
                return true;
            }
        }
        return false;
    }
    
    static String i(final Map<String, String> map, final String s) {
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            if (s.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    protected static boolean l(final List list) {
        return list == null || list.isEmpty();
    }
    
    public abstract void A(final Object p0, final ArrayList<View> p1, final ArrayList<View> p2);
    
    public abstract Object B(final Object p0);
    
    public abstract void a(final Object p0, final View p1);
    
    public abstract void b(final Object p0, final ArrayList<View> p1);
    
    public abstract void c(final ViewGroup p0, final Object p1);
    
    public abstract boolean e(final Object p0);
    
    void f(final ArrayList<View> list, final View view) {
        if (view.getVisibility() == 0) {
            Object e = view;
            if (view instanceof ViewGroup) {
                e = view;
                if (!l0.c((ViewGroup)e)) {
                    for (int childCount = ((ViewGroup)e).getChildCount(), i = 0; i < childCount; ++i) {
                        this.f(list, ((ViewGroup)e).getChildAt(i));
                    }
                    return;
                }
            }
            list.add((View)e);
        }
    }
    
    public abstract Object g(final Object p0);
    
    void j(final Map<String, View> map, @androidx.annotation.j0 final View view) {
        if (view.getVisibility() == 0) {
            final String w0 = j0.w0(view);
            if (w0 != null) {
                map.put(w0, view);
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    this.j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }
    
    protected void k(final View view, final Rect rect) {
        if (!j0.N0(view)) {
            return;
        }
        final RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset((float)view.getLeft(), (float)view.getTop());
        View view2;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = view2.getParent()) {
            view2 = (View)viewParent;
            rectF.offset((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
            view2.getMatrix().mapRect(rectF);
            rectF.offset((float)view2.getLeft(), (float)view2.getTop());
        }
        final int[] array = new int[2];
        view.getRootView().getLocationOnScreen(array);
        rectF.offset((float)array[0], (float)array[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }
    
    public abstract Object m(final Object p0, final Object p1, final Object p2);
    
    public abstract Object n(final Object p0, final Object p1, final Object p2);
    
    ArrayList<String> o(final ArrayList<View> list) {
        final ArrayList<String> list2 = new ArrayList<String>();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final View view = list.get(i);
            list2.add(j0.w0(view));
            j0.r2(view, null);
        }
        return list2;
    }
    
    public abstract void p(final Object p0, final View p1);
    
    public abstract void q(final Object p0, final ArrayList<View> p1, final ArrayList<View> p2);
    
    public abstract void r(final Object p0, final View p1, final ArrayList<View> p2);
    
    void s(final ViewGroup viewGroup, final ArrayList<View> list, final Map<String, String> map) {
        d0.a((View)viewGroup, new Runnable() {
            @Override
            public void run() {
                for (int size = list.size(), i = 0; i < size; ++i) {
                    final View view = list.get(i);
                    j0.r2(view, (String)map.get(j0.w0(view)));
                }
            }
        });
    }
    
    public abstract void t(final Object p0, final Object p1, final ArrayList<View> p2, final Object p3, final ArrayList<View> p4, final Object p5, final ArrayList<View> p6);
    
    public abstract void u(final Object p0, final Rect p1);
    
    public abstract void v(final Object p0, final View p1);
    
    public void w(@androidx.annotation.j0 final Fragment fragment, @androidx.annotation.j0 final Object o, @androidx.annotation.j0 final c c, @androidx.annotation.j0 final Runnable runnable) {
        runnable.run();
    }
    
    void x(final View view, final ArrayList<View> list, final Map<String, String> map) {
        d0.a(view, new Runnable() {
            @Override
            public void run() {
                for (int size = list.size(), i = 0; i < size; ++i) {
                    final View view = list.get(i);
                    final String w0 = j0.w0(view);
                    if (w0 != null) {
                        j0.r2(view, e0.i(map, w0));
                    }
                }
            }
        });
    }
    
    void y(final View view, final ArrayList<View> list, final ArrayList<View> list2, final ArrayList<String> list3, final Map<String, String> map) {
        final int size = list2.size();
        final ArrayList<String> list4 = new ArrayList<String>();
        for (int i = 0; i < size; ++i) {
            final View view2 = list.get(i);
            final String w0 = j0.w0(view2);
            list4.add(w0);
            if (w0 != null) {
                j0.r2(view2, null);
                final String s = map.get(w0);
                for (int j = 0; j < size; ++j) {
                    if (s.equals(list3.get(j))) {
                        j0.r2(list2.get(j), w0);
                        break;
                    }
                }
            }
        }
        d0.a(view, new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < size; ++i) {
                    j0.r2((View)list2.get(i), (String)list3.get(i));
                    j0.r2((View)list.get(i), (String)list4.get(i));
                }
            }
        });
    }
    
    public abstract void z(final Object p0, final View p1, final ArrayList<View> p2);
}
