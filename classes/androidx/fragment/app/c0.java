// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.transition.n;
import androidx.core.os.c;
import android.graphics.Rect;
import java.util.Map;
import androidx.core.app.b0;
import java.util.List;
import java.util.Collection;
import android.view.ViewGroup;
import android.util.SparseArray;
import androidx.annotation.j0;
import android.content.Context;
import java.util.ArrayList;
import android.view.View;
import androidx.collection.a;
import android.os.Build$VERSION;

class c0
{
    private static final int[] a;
    static final e0 b;
    static final e0 c;
    
    static {
        a = new int[] { 0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10 };
        d0 b2;
        if (Build$VERSION.SDK_INT >= 21) {
            b2 = new d0();
        }
        else {
            b2 = null;
        }
        b = b2;
        c = x();
    }
    
    private c0() {
    }
    
    private static void A(final e0 e0, final Object o, final Object o2, final a<String, View> a, final boolean b, final androidx.fragment.app.a a2) {
        final ArrayList<String> p6 = a2.p;
        if (p6 != null && !p6.isEmpty()) {
            ArrayList<String> list;
            if (b) {
                list = a2.q;
            }
            else {
                list = a2.p;
            }
            final View view = a.get(list.get(0));
            e0.v(o, view);
            if (o2 != null) {
                e0.v(o2, view);
            }
        }
    }
    
    static void B(final ArrayList<View> list, final int visibility) {
        if (list == null) {
            return;
        }
        for (int i = list.size() - 1; i >= 0; --i) {
            list.get(i).setVisibility(visibility);
        }
    }
    
    static void C(@j0 final Context context, @j0 final f f, final ArrayList<androidx.fragment.app.a> list, final ArrayList<Boolean> list2, final int n, final int n2, final boolean b, final g g) {
        final SparseArray sparseArray = new SparseArray();
        for (int i = n; i < n2; ++i) {
            final androidx.fragment.app.a a = list.get(i);
            if (list2.get(i)) {
                e(a, (SparseArray<h>)sparseArray, b);
            }
            else {
                c(a, (SparseArray<h>)sparseArray, b);
            }
        }
        if (sparseArray.size() != 0) {
            final View view = new View(context);
            for (int size = sparseArray.size(), j = 0; j < size; ++j) {
                final int key = sparseArray.keyAt(j);
                final a<String, String> d = d(key, list, list2, n, n2);
                final h h = (h)sparseArray.valueAt(j);
                if (f.d()) {
                    final ViewGroup viewGroup = (ViewGroup)f.c(key);
                    if (viewGroup != null) {
                        if (b) {
                            o(viewGroup, h, view, d, g);
                        }
                        else {
                            n(viewGroup, h, view, d, g);
                        }
                    }
                }
            }
        }
    }
    
    static boolean D() {
        return c0.b != null || c0.c != null;
    }
    
    private static void a(final ArrayList<View> list, final a<String, View> a, final Collection<String> collection) {
        for (int i = a.size() - 1; i >= 0; --i) {
            final View e = a.o(i);
            if (collection.contains(androidx.core.view.j0.w0(e))) {
                list.add(e);
            }
        }
    }
    
    private static void b(final androidx.fragment.app.a a, final a0.a a2, final SparseArray<h> sparseArray, final boolean b, final boolean b2) {
        final Fragment b3 = a2.b;
        if (b3 == null) {
            return;
        }
        final int mContainerId = b3.mContainerId;
        if (mContainerId == 0) {
            return;
        }
        int a3;
        if (b) {
            a3 = c0.a[a2.a];
        }
        else {
            a3 = a2.a;
        }
        int n = 0;
        final int n2 = 0;
        final int n3 = 1;
    Label_0248:
        while (true) {
            int n4 = 0;
            int n6 = 0;
            boolean b4 = false;
        Label_0336:
            while (true) {
                Label_0329: {
                    Label_0326: {
                        Label_0320: {
                            Label_0289: {
                                if (a3 != 1) {
                                    int n5 = 0;
                                    Label_0276: {
                                        Label_0254: {
                                            if (a3 != 3) {
                                                if (a3 != 4) {
                                                    if (a3 != 5) {
                                                        if (a3 != 6) {
                                                            if (a3 != 7) {
                                                                n4 = 0;
                                                                n = n2;
                                                                break Label_0102;
                                                            }
                                                            break Label_0289;
                                                        }
                                                    }
                                                    else {
                                                        if (!b2) {
                                                            n = (b3.mHidden ? 1 : 0);
                                                            break Label_0329;
                                                        }
                                                        if (b3.mHiddenChanged && !b3.mHidden && b3.mAdded) {
                                                            break Label_0320;
                                                        }
                                                        break Label_0326;
                                                    }
                                                }
                                                else {
                                                    if (b2 ? (b3.mHiddenChanged && b3.mAdded && b3.mHidden) : (b3.mAdded && !b3.mHidden)) {
                                                        break Label_0248;
                                                    }
                                                    break Label_0254;
                                                }
                                            }
                                            final boolean mAdded = b3.mAdded;
                                            if (b2) {
                                                if (mAdded) {
                                                    break Label_0254;
                                                }
                                                final View mView = b3.mView;
                                                if (mView == null || mView.getVisibility() != 0 || b3.mPostponedAlpha < 0.0f) {
                                                    break Label_0254;
                                                }
                                            }
                                            else if (!mAdded || b3.mHidden) {
                                                break Label_0254;
                                            }
                                            n5 = 1;
                                            break Label_0276;
                                        }
                                        n5 = 0;
                                    }
                                    n6 = n5;
                                    b4 = true;
                                    n4 = 0;
                                    break Label_0336;
                                }
                                break Label_0289;
                                b4 = false;
                                n6 = 0;
                                break Label_0336;
                            }
                            if (b2) {
                                n = (b3.mIsNewlyAdded ? 1 : 0);
                                break Label_0329;
                            }
                            if (b3.mAdded || b3.mHidden) {
                                break Label_0326;
                            }
                        }
                        n = 1;
                        break Label_0329;
                    }
                    n = 0;
                }
                n4 = n3;
                continue;
            }
            h p5;
            final h h = p5 = (h)sparseArray.get(mContainerId);
            if (n != 0) {
                p5 = p(h, sparseArray, mContainerId);
                p5.a = b3;
                p5.b = b;
                p5.c = a;
            }
            if (!b2 && n4 != 0) {
                if (p5 != null && p5.d == b3) {
                    p5.d = null;
                }
                if (!a.r) {
                    final FragmentManager l = a.L;
                    l.F0().q(l.A(b3));
                    l.f1(b3);
                }
            }
            h p6 = p5;
            Label_0497: {
                if (n6 != 0) {
                    if (p5 != null) {
                        p6 = p5;
                        if (p5.d != null) {
                            break Label_0497;
                        }
                    }
                    p6 = p(p5, sparseArray, mContainerId);
                    p6.d = b3;
                    p6.e = b;
                    p6.f = a;
                }
            }
            if (!b2 && b4 && p6 != null && p6.a == b3) {
                p6.a = null;
            }
            return;
            continue Label_0248;
        }
    }
    
    public static void c(final androidx.fragment.app.a a, final SparseArray<h> sparseArray, final boolean b) {
        for (int size = a.c.size(), i = 0; i < size; ++i) {
            b(a, a.c.get(i), sparseArray, false, b);
        }
    }
    
    private static a<String, String> d(final int n, final ArrayList<androidx.fragment.app.a> list, final ArrayList<Boolean> list2, final int n2, int i) {
        final a<Object, String> a = new a<Object, String>();
        --i;
        while (i >= n2) {
            final androidx.fragment.app.a a2 = list.get(i);
            if (a2.c0(n)) {
                final boolean booleanValue = list2.get(i);
                final ArrayList<String> p5 = a2.p;
                if (p5 != null) {
                    final int size = p5.size();
                    ArrayList<String> list3;
                    ArrayList<String> list4;
                    if (booleanValue) {
                        list3 = a2.p;
                        list4 = a2.q;
                    }
                    else {
                        list4 = a2.p;
                        list3 = a2.q;
                    }
                    for (int j = 0; j < size; ++j) {
                        final String s = list4.get(j);
                        final String s2 = list3.get(j);
                        final String s3 = a.remove(s2);
                        if (s3 != null) {
                            a.put(s, s3);
                        }
                        else {
                            a.put(s, s2);
                        }
                    }
                }
            }
            --i;
        }
        return (a<String, String>)a;
    }
    
    public static void e(final androidx.fragment.app.a a, final SparseArray<h> sparseArray, final boolean b) {
        if (!a.L.B0().d()) {
            return;
        }
        for (int i = a.c.size() - 1; i >= 0; --i) {
            b(a, a.c.get(i), sparseArray, true, b);
        }
    }
    
    static void f(final Fragment fragment, final Fragment fragment2, final boolean b, final a<String, View> a, final boolean b2) {
        b0 b3;
        if (b) {
            b3 = fragment2.getEnterTransitionCallback();
        }
        else {
            b3 = fragment.getEnterTransitionCallback();
        }
        if (b3 != null) {
            final ArrayList<View> list = new ArrayList<View>();
            final ArrayList<String> list2 = new ArrayList<String>();
            int i = 0;
            int size;
            if (a == null) {
                size = 0;
            }
            else {
                size = a.size();
            }
            while (i < size) {
                list2.add(a.i(i));
                list.add(a.o(i));
                ++i;
            }
            if (b2) {
                b3.g(list2, list, null);
            }
            else {
                b3.f(list2, list, null);
            }
        }
    }
    
    private static boolean g(final e0 e0, final List<Object> list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (!e0.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    static a<String, View> h(final e0 e0, final a<String, String> a, final Object o, final h h) {
        final Fragment a2 = h.a;
        final View view = a2.getView();
        if (!a.isEmpty() && o != null && view != null) {
            final a<Object, View> a3 = new a<Object, View>();
            e0.j((Map<String, View>)a3, view);
            final androidx.fragment.app.a c = h.c;
            b0 b0;
            ArrayList<String> list;
            if (h.b) {
                b0 = a2.getExitTransitionCallback();
                list = c.p;
            }
            else {
                b0 = a2.getEnterTransitionCallback();
                list = c.q;
            }
            if (list != null) {
                a3.s(list);
                a3.s(a.values());
            }
            if (b0 != null) {
                b0.d(list, (Map<String, View>)a3);
                for (int i = list.size() - 1; i >= 0; --i) {
                    final String s = list.get(i);
                    final View view2 = a3.get(s);
                    if (view2 == null) {
                        final String q = q(a, s);
                        if (q != null) {
                            a.remove(q);
                        }
                    }
                    else if (!s.equals(androidx.core.view.j0.w0(view2))) {
                        final String q2 = q(a, s);
                        if (q2 != null) {
                            a.put(q2, androidx.core.view.j0.w0(view2));
                        }
                    }
                }
            }
            else {
                y(a, (a<String, View>)a3);
            }
            return (a<String, View>)a3;
        }
        a.clear();
        return null;
    }
    
    private static a<String, View> i(final e0 e0, final a<String, String> a, final Object o, final h h) {
        if (!a.isEmpty() && o != null) {
            final Fragment d = h.d;
            final a<Object, Object> a2 = new a<Object, Object>();
            e0.j((Map<String, View>)a2, d.requireView());
            final androidx.fragment.app.a f = h.f;
            b0 b0;
            ArrayList<String> list;
            if (h.e) {
                b0 = d.getEnterTransitionCallback();
                list = f.q;
            }
            else {
                b0 = d.getExitTransitionCallback();
                list = f.p;
            }
            if (list != null) {
                a2.s(list);
            }
            if (b0 != null) {
                b0.d(list, (Map<String, View>)a2);
                for (int i = list.size() - 1; i >= 0; --i) {
                    final String s = list.get(i);
                    final View view = a2.get(s);
                    if (view == null) {
                        a.remove(s);
                    }
                    else if (!s.equals(androidx.core.view.j0.w0(view))) {
                        a.put(androidx.core.view.j0.w0(view), a.remove(s));
                    }
                }
            }
            else {
                a.s(a2.keySet());
            }
            return (a<String, View>)a2;
        }
        a.clear();
        return null;
    }
    
    private static e0 j(final Fragment fragment, final Fragment fragment2) {
        final ArrayList<Object> list = new ArrayList<Object>();
        if (fragment != null) {
            final Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                list.add(exitTransition);
            }
            final Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                list.add(returnTransition);
            }
            final Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                list.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            final Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                list.add(enterTransition);
            }
            final Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                list.add(reenterTransition);
            }
            final Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                list.add(sharedElementEnterTransition);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        final e0 b = c0.b;
        if (b != null && g(b, list)) {
            return b;
        }
        final e0 c = c0.c;
        if (c != null && g(c, list)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }
    
    static ArrayList<View> k(final e0 e0, final Object o, final Fragment fragment, final ArrayList<View> c, final View e2) {
        ArrayList<View> list2;
        if (o != null) {
            final ArrayList<View> list = new ArrayList<View>();
            final View view = fragment.getView();
            if (view != null) {
                e0.f(list, view);
            }
            if (c != null) {
                list.removeAll(c);
            }
            list2 = list;
            if (!list.isEmpty()) {
                list.add(e2);
                e0.b(o, list);
                list2 = list;
            }
        }
        else {
            list2 = null;
        }
        return list2;
    }
    
    private static Object l(final e0 e0, final ViewGroup viewGroup, final View view, final a<String, String> a, final h h, final ArrayList<View> list, final ArrayList<View> list2, final Object o, Object o2) {
        final Fragment a2 = h.a;
        final Fragment d = h.d;
        if (a2 == null || d == null) {
            return null;
        }
        final boolean b = h.b;
        Object u;
        if (a.isEmpty()) {
            u = null;
        }
        else {
            u = u(e0, a2, d, b);
        }
        final a<String, View> i = i(e0, a, u, h);
        if (a.isEmpty()) {
            u = null;
        }
        else {
            list.addAll(i.values());
        }
        if (o == null && o2 == null && u == null) {
            return null;
        }
        f(a2, d, b, i, true);
        if (u != null) {
            final Rect rect = new Rect();
            e0.z(u, view, list);
            A(e0, u, o2, i, h.e, h.f);
            o2 = rect;
            if (o != null) {
                e0.u(o, rect);
                o2 = rect;
            }
        }
        else {
            o2 = null;
        }
        androidx.core.view.d0.a((View)viewGroup, new Runnable() {
            @Override
            public void run() {
                final a<String, View> h = c0.h(e0, a, u, h);
                if (h != null) {
                    list2.addAll(h.values());
                    list2.add(view);
                }
                c0.f(a2, d, b, h, false);
                final Object i = u;
                if (i != null) {
                    e0.A(i, list, list2);
                    final View t = c0.t(h, h, o, b);
                    if (t != null) {
                        e0.k(t, o2);
                    }
                }
            }
        });
        return u;
    }
    
    private static Object m(final e0 e0, final ViewGroup viewGroup, final View e2, final a<String, String> a, final h h, final ArrayList<View> list, final ArrayList<View> list2, final Object o, final Object o2) {
        final Fragment a2 = h.a;
        final Fragment d = h.d;
        if (a2 != null) {
            a2.requireView().setVisibility(0);
        }
        if (a2 == null || d == null) {
            return null;
        }
        final boolean b = h.b;
        Object u;
        if (a.isEmpty()) {
            u = null;
        }
        else {
            u = u(e0, a2, d, b);
        }
        final a<String, View> i = i(e0, a, u, h);
        final a<String, View> h2 = h(e0, a, u, h);
        Object o3;
        if (a.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            o3 = null;
        }
        else {
            a(list, i, a.keySet());
            a(list2, h2, a.values());
            o3 = u;
        }
        if (o == null && o2 == null && o3 == null) {
            return null;
        }
        f(a2, d, b, i, true);
        Rect rect;
        Object t;
        if (o3 != null) {
            list2.add(e2);
            e0.z(o3, e2, list);
            A(e0, o3, o2, i, h.e, h.f);
            rect = new Rect();
            t = t(h2, h, o, b);
            if (t != null) {
                e0.u(o, rect);
            }
        }
        else {
            t = (rect = null);
        }
        androidx.core.view.d0.a((View)viewGroup, new Runnable() {
            @Override
            public void run() {
                c0.f(a2, d, b, h2, false);
                final View k = (View)t;
                if (k != null) {
                    e0.k(k, rect);
                }
            }
        });
        return o3;
    }
    
    private static void n(@j0 final ViewGroup viewGroup, final h h, final View view, final a<String, String> a, final g g) {
        final Fragment a2 = h.a;
        final Fragment d = h.d;
        final e0 j = j(d, a2);
        if (j == null) {
            return;
        }
        final boolean b = h.b;
        final boolean e = h.e;
        final Object r = r(j, a2, b);
        Object s = s(j, d, e);
        final ArrayList<View> list = new ArrayList<View>();
        final ArrayList<View> list2 = new ArrayList<View>();
        final Object l = l(j, viewGroup, view, a, h, list, list2, r, s);
        if (r == null && l == null && s == null) {
            return;
        }
        final ArrayList<View> k = k(j, s, d, list, view);
        if (k == null || k.isEmpty()) {
            s = null;
        }
        j.a(r, view);
        final Object v = v(j, r, s, l, a2, h.b);
        if (d != null && k != null && (k.size() > 0 || list.size() > 0)) {
            final c c = new c();
            g.b(d, c);
            j.w(d, v, c, new Runnable() {
                @Override
                public void run() {
                    g.a(d, c);
                }
            });
        }
        if (v != null) {
            final ArrayList<View> list3 = new ArrayList<View>();
            j.t(v, r, list3, s, k, l, list2);
            z(j, viewGroup, a2, view, list2, r, list3, s, k);
            j.x((View)viewGroup, list2, a);
            j.c(viewGroup, v);
            j.s(viewGroup, list2, a);
        }
    }
    
    private static void o(@j0 final ViewGroup viewGroup, final h h, final View view, final a<String, String> a, final g g) {
        final Fragment a2 = h.a;
        final Fragment d = h.d;
        final e0 j = j(d, a2);
        if (j == null) {
            return;
        }
        final boolean b = h.b;
        final boolean e = h.e;
        final ArrayList<View> list = new ArrayList<View>();
        final ArrayList<View> list2 = new ArrayList<View>();
        final Object r = r(j, a2, b);
        final Object s = s(j, d, e);
        final Object m = m(j, viewGroup, view, a, h, list2, list, r, s);
        if (r == null && m == null && s == null) {
            return;
        }
        final Object o = s;
        final ArrayList<View> k = k(j, o, d, list2, view);
        final ArrayList<View> i = k(j, r, a2, list, view);
        B(i, 4);
        final Object v = v(j, r, o, m, a2, b);
        if (d != null && k != null && (k.size() > 0 || list2.size() > 0)) {
            final c c = new c();
            g.b(d, c);
            j.w(d, v, c, new Runnable() {
                @Override
                public void run() {
                    g.a(d, c);
                }
            });
        }
        if (v != null) {
            w(j, o, d, k);
            final ArrayList<String> o2 = j.o(list);
            j.t(v, r, i, o, k, m, list);
            j.c(viewGroup, v);
            j.y((View)viewGroup, list2, list, o2, a);
            B(i, 0);
            j.A(m, list2, list);
        }
    }
    
    private static h p(final h h, final SparseArray<h> sparseArray, final int n) {
        h h2 = h;
        if (h == null) {
            h2 = new h();
            sparseArray.put(n, (Object)h2);
        }
        return h2;
    }
    
    static String q(final a<String, String> a, final String s) {
        for (int size = a.size(), i = 0; i < size; ++i) {
            if (s.equals(a.o(i))) {
                return a.i(i);
            }
        }
        return null;
    }
    
    private static Object r(final e0 e0, final Fragment fragment, final boolean b) {
        if (fragment == null) {
            return null;
        }
        Object o;
        if (b) {
            o = fragment.getReenterTransition();
        }
        else {
            o = fragment.getEnterTransition();
        }
        return e0.g(o);
    }
    
    private static Object s(final e0 e0, final Fragment fragment, final boolean b) {
        if (fragment == null) {
            return null;
        }
        Object o;
        if (b) {
            o = fragment.getReturnTransition();
        }
        else {
            o = fragment.getExitTransition();
        }
        return e0.g(o);
    }
    
    static View t(final a<String, View> a, final h h, final Object o, final boolean b) {
        final androidx.fragment.app.a c = h.c;
        if (o != null && a != null) {
            final ArrayList<String> p4 = c.p;
            if (p4 != null && !p4.isEmpty()) {
                ArrayList<String> list;
                if (b) {
                    list = c.p;
                }
                else {
                    list = c.q;
                }
                return a.get(list.get(0));
            }
        }
        return null;
    }
    
    private static Object u(final e0 e0, final Fragment fragment, final Fragment fragment2, final boolean b) {
        if (fragment != null && fragment2 != null) {
            Object o;
            if (b) {
                o = fragment2.getSharedElementReturnTransition();
            }
            else {
                o = fragment.getSharedElementEnterTransition();
            }
            return e0.B(e0.g(o));
        }
        return null;
    }
    
    private static Object v(final e0 e0, final Object o, final Object o2, final Object o3, final Fragment fragment, final boolean b) {
        boolean b2;
        if (o != null && o2 != null && fragment != null) {
            if (b) {
                b2 = fragment.getAllowReturnTransitionOverlap();
            }
            else {
                b2 = fragment.getAllowEnterTransitionOverlap();
            }
        }
        else {
            b2 = true;
        }
        Object o4;
        if (b2) {
            o4 = e0.n(o2, o, o3);
        }
        else {
            o4 = e0.m(o2, o, o3);
        }
        return o4;
    }
    
    private static void w(final e0 e0, final Object o, final Fragment fragment, final ArrayList<View> list) {
        if (fragment != null && o != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            e0.r(o, fragment.getView(), list);
            androidx.core.view.d0.a((View)fragment.mContainer, new Runnable() {
                @Override
                public void run() {
                    c0.B(list, 4);
                }
            });
        }
    }
    
    private static e0 x() {
        try {
            return n.class.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    static void y(@j0 final a<String, String> a, @j0 final a<String, View> a2) {
        for (int i = a.size() - 1; i >= 0; --i) {
            if (!a2.containsKey(a.o(i))) {
                a.k(i);
            }
        }
    }
    
    private static void z(final e0 e0, final ViewGroup viewGroup, final Fragment fragment, final View view, final ArrayList<View> list, final Object o, final ArrayList<View> list2, final Object o2, final ArrayList<View> list3) {
        androidx.core.view.d0.a((View)viewGroup, new Runnable() {
            @Override
            public void run() {
                final Object g = o;
                if (g != null) {
                    e0.p(g, view);
                    list2.addAll(c0.k(e0, o, fragment, list, view));
                }
                if (list3 != null) {
                    if (o2 != null) {
                        final ArrayList<View> list = new ArrayList<View>();
                        list.add(view);
                        e0.q(o2, list3, list);
                    }
                    list3.clear();
                    list3.add(view);
                }
            }
        });
    }
    
    interface g
    {
        void a(@j0 final Fragment p0, @j0 final c p1);
        
        void b(@j0 final Fragment p0, @j0 final c p1);
    }
    
    static class h
    {
        public Fragment a;
        public boolean b;
        public androidx.fragment.app.a c;
        public Fragment d;
        public boolean e;
        public androidx.fragment.app.a f;
    }
}
