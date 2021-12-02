// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.core.view.l0;
import androidx.core.app.b0;
import androidx.core.view.d0;
import java.util.Collection;
import androidx.collection.a;
import android.graphics.Rect;
import java.util.HashMap;
import androidx.annotation.k0;
import java.util.Iterator;
import android.content.Context;
import android.view.animation.Animation$AnimationListener;
import androidx.core.util.n;
import android.view.animation.Animation;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import androidx.annotation.j0;
import android.view.ViewGroup;

class c extends i0
{
    c(@j0 final ViewGroup viewGroup) {
        super(viewGroup);
    }
    
    private void w(@j0 final List<k> list, @j0 final List<e> list2, final boolean b, @j0 final Map<e, Boolean> map) {
        final ViewGroup m = this.m();
        final Context context = m.getContext();
        final ArrayList<k> list3 = new ArrayList<k>();
        final Iterator<k> iterator = list.iterator();
        boolean b2 = false;
        while (iterator.hasNext()) {
            final k e = iterator.next();
            if (!((l)e).d()) {
                final androidx.fragment.app.e.d e2 = e.e(context);
                if (e2 != null) {
                    final Animator b3 = e2.b;
                    if (b3 == null) {
                        list3.add(e);
                        continue;
                    }
                    final e b4 = ((l)e).b();
                    final Fragment f = b4.f();
                    if (Boolean.TRUE.equals(map.get(b4))) {
                        if (FragmentManager.T0(2)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring Animator set on ");
                            sb.append(f);
                            sb.append(" as this Fragment was involved in a Transition.");
                            Log.v("FragmentManager", sb.toString());
                        }
                        ((l)e).a();
                        continue;
                    }
                    final boolean b5 = b4.e() == i0.e.c.I;
                    if (b5) {
                        list2.remove(b4);
                    }
                    final View mView = f.mView;
                    m.startViewTransition(mView);
                    b3.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                        public void onAnimationEnd(final Animator animator) {
                            m.endViewTransition(mView);
                            if (b5) {
                                b4.e().b(mView);
                            }
                            ((l)e).a();
                        }
                    });
                    b3.setTarget((Object)mView);
                    b3.start();
                    ((l)e).c().d((androidx.core.os.c.a)new androidx.core.os.c.a() {
                        @Override
                        public void onCancel() {
                            b3.end();
                        }
                    });
                    b2 = true;
                    continue;
                }
            }
            ((l)e).a();
        }
        for (final k k : list3) {
            final e b6 = ((l)k).b();
            final Fragment f2 = b6.f();
            Label_0393: {
                StringBuilder sb2;
                String str;
                if (b) {
                    if (!FragmentManager.T0(2)) {
                        break Label_0393;
                    }
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f2);
                    str = " as Animations cannot run alongside Transitions.";
                }
                else {
                    if (!b2) {
                        final View mView2 = f2.mView;
                        final Animation animation = n.g(n.g(k.e(context)).a);
                        if (b6.e() != i0.e.c.G) {
                            mView2.startAnimation(animation);
                            ((l)k).a();
                        }
                        else {
                            m.startViewTransition(mView2);
                            final androidx.fragment.app.e.e e3 = new androidx.fragment.app.e.e(animation, m, mView2);
                            ((Animation)e3).setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
                                public void onAnimationEnd(final Animation animation) {
                                    m.post((Runnable)new Runnable() {
                                        @Override
                                        public void run() {
                                            final Animation$AnimationListener g = (Animation$AnimationListener)Animation$AnimationListener.this;
                                            m.endViewTransition(mView2);
                                            ((l)k).a();
                                        }
                                    });
                                }
                                
                                public void onAnimationRepeat(final Animation animation) {
                                }
                                
                                public void onAnimationStart(final Animation animation) {
                                }
                            });
                            mView2.startAnimation((Animation)e3);
                        }
                        ((l)k).c().d((androidx.core.os.c.a)new androidx.core.os.c.a() {
                            @Override
                            public void onCancel() {
                                mView2.clearAnimation();
                                m.endViewTransition(mView2);
                                ((l)k).a();
                            }
                        });
                        continue;
                    }
                    if (!FragmentManager.T0(2)) {
                        break Label_0393;
                    }
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f2);
                    str = " as Animations cannot run alongside Animators.";
                }
                sb2.append(str);
                Log.v("FragmentManager", sb2.toString());
            }
            ((l)k).a();
        }
    }
    
    @j0
    private Map<e, Boolean> x(@j0 final List<m> list, @j0 final List<e> list2, final boolean b, @k0 final e e, @k0 e e2) {
        c c = this;
        e e3 = e;
        e e4 = e2;
        final HashMap<e, Boolean> hashMap = new HashMap<e, Boolean>();
        final Iterator<m> iterator = list.iterator();
        e0 e5 = null;
        while (iterator.hasNext()) {
            final m m = iterator.next();
            if (((l)m).d()) {
                continue;
            }
            final e0 e6 = m.e();
            if (e5 == null) {
                e5 = e6;
            }
            else {
                if (e6 == null) {
                    continue;
                }
                if (e5 == e6) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(((l)m).b().f());
                sb.append(" returned Transition ");
                sb.append(m.h());
                sb.append(" which uses a different Transition  type than other Fragments.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (e5 == null) {
            for (final m i : list) {
                hashMap.put(((l)i).b(), Boolean.FALSE);
                ((l)i).a();
            }
            return hashMap;
        }
        final View view = new View(this.m().getContext());
        final Rect rect = new Rect();
        final ArrayList<View> list3 = new ArrayList<View>();
        final ArrayList<View> list4 = new ArrayList<View>();
        final a<Object, String> a = new a<Object, String>();
        final Iterator<m> iterator3 = list.iterator();
        Object o = null;
        View view2 = null;
        boolean b2 = false;
        final e0 e7 = e5;
        View view3 = view;
        while (iterator3.hasNext()) {
            final m j = iterator3.next();
            e e8;
            c c2;
            View view7;
            if (j.i() && e3 != null && e4 != null) {
                final Object b3 = e7.B(e7.g(j.g()));
                final ArrayList<String> sharedElementSourceNames = e2.f().getSharedElementSourceNames();
                final ArrayList<String> sharedElementSourceNames2 = e.f().getSharedElementSourceNames();
                final ArrayList<String> sharedElementTargetNames = e.f().getSharedElementTargetNames();
                for (int k = 0; k < sharedElementTargetNames.size(); ++k) {
                    final int index = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(k));
                    if (index != -1) {
                        sharedElementSourceNames.set(index, sharedElementSourceNames2.get(k));
                    }
                }
                final ArrayList<String> sharedElementTargetNames2 = e2.f().getSharedElementTargetNames();
                final Fragment f = e.f();
                b0 b4;
                b0 b5;
                if (!b) {
                    b4 = f.getExitTransitionCallback();
                    b5 = e2.f().getEnterTransitionCallback();
                }
                else {
                    b4 = f.getEnterTransitionCallback();
                    b5 = e2.f().getExitTransitionCallback();
                }
                for (int size = sharedElementSourceNames.size(), l = 0; l < size; ++l) {
                    a.put(sharedElementSourceNames.get(l), sharedElementTargetNames2.get(l));
                }
                final a<Object, View> a2 = new a<Object, View>();
                c.u((Map<String, View>)a2, e.f().mView);
                a2.s(sharedElementSourceNames);
                if (b4 != null) {
                    b4.d(sharedElementSourceNames, (Map<String, View>)a2);
                    for (int index2 = sharedElementSourceNames.size() - 1; index2 >= 0; --index2) {
                        final String s = sharedElementSourceNames.get(index2);
                        final View view4 = a2.get(s);
                        if (view4 == null) {
                            a.remove(s);
                        }
                        else if (!s.equals(androidx.core.view.j0.w0(view4))) {
                            a.put(androidx.core.view.j0.w0(view4), a.remove(s));
                        }
                    }
                }
                else {
                    a.s(a2.keySet());
                }
                final a<Object, View> a3 = new a<Object, View>();
                c.u((Map<String, View>)a3, e2.f().mView);
                a3.s(sharedElementTargetNames2);
                a3.s(a.values());
                if (b5 != null) {
                    b5.d(sharedElementTargetNames2, (Map<String, View>)a3);
                    for (int index3 = sharedElementTargetNames2.size() - 1; index3 >= 0; --index3) {
                        final String s2 = sharedElementTargetNames2.get(index3);
                        final View view5 = a3.get(s2);
                        if (view5 == null) {
                            final String q = c0.q((a<String, String>)a, s2);
                            if (q != null) {
                                a.remove(q);
                            }
                        }
                        else if (!s2.equals(androidx.core.view.j0.w0(view5))) {
                            final String q2 = c0.q((a<String, String>)a, s2);
                            if (q2 != null) {
                                a.put(q2, (Object)androidx.core.view.j0.w0(view5));
                            }
                        }
                    }
                }
                else {
                    c0.y((a<String, String>)a, (a<String, View>)a3);
                }
                c.v((a<String, View>)a2, (Collection<String>)a.keySet());
                c.v((a<String, View>)a3, a.values());
                if (a.isEmpty()) {
                    list3.clear();
                    list4.clear();
                    final View view6 = view3;
                    o = null;
                    e4 = e2;
                    e8 = e;
                    c2 = c;
                    view7 = view6;
                }
                else {
                    c0.f(e2.f(), e.f(), b, (a<String, View>)a2, true);
                    d0.a((View)this.m(), new Runnable() {
                        @Override
                        public void run() {
                            c0.f(e2.f(), e.f(), b, a3, false);
                        }
                    });
                    list3.addAll(a2.values());
                    if (!sharedElementSourceNames.isEmpty()) {
                        view2 = (View)a2.get(sharedElementSourceNames.get(0));
                        e7.v(b3, view2);
                    }
                    final Collection<View> values = a3.values();
                    final ArrayList<View> list5 = list4;
                    list5.addAll(values);
                    if (!sharedElementTargetNames2.isEmpty()) {
                        final View view8 = a3.get(sharedElementTargetNames2.get(0));
                        if (view8 != null) {
                            d0.a((View)this.m(), new Runnable() {
                                @Override
                                public void run() {
                                    e7.k(view8, rect);
                                }
                            });
                            b2 = true;
                        }
                    }
                    c2 = this;
                    e7.z(b3, view3, list3);
                    view7 = view3;
                    e7.t(b3, null, null, null, null, b3, list5);
                    final Boolean true = Boolean.TRUE;
                    e8 = e;
                    hashMap.put(e8, true);
                    e4 = e2;
                    hashMap.put(e4, true);
                    o = b3;
                }
            }
            else {
                final c c3 = c;
                final e e9 = e3;
                view7 = view3;
                c2 = c3;
                e8 = e9;
            }
            final View view9 = view7;
            c = c2;
            e3 = e8;
            view3 = view9;
        }
        final View view10 = view2;
        final ArrayList<View> c4 = list4;
        final ArrayList<View> c5 = list3;
        e2 = e4;
        final View view11 = view3;
        final ArrayList<View> list6 = new ArrayList<View>();
        final Iterator<m> iterator4 = list.iterator();
        final Object o2 = null;
        final Object o3 = null;
        final View view12 = view10;
        final e e10 = e2;
        Object n = o3;
        Object n2 = o2;
        while (iterator4.hasNext()) {
            final m m2 = iterator4.next();
            if (((l)m2).d()) {
                hashMap.put(((l)m2).b(), Boolean.FALSE);
                ((l)m2).a();
            }
            else {
                final Object g = e7.g(m2.h());
                final e b6 = ((l)m2).b();
                final boolean b7 = o != null && (b6 == e3 || b6 == e10);
                if (g == null) {
                    if (b7) {
                        continue;
                    }
                    hashMap.put(b6, Boolean.FALSE);
                    ((l)m2).a();
                }
                else {
                    final ArrayList<View> list7 = new ArrayList<View>();
                    c.t(list7, b6.f().mView);
                    if (b7) {
                        if (b6 == e3) {
                            list7.removeAll(c5);
                        }
                        else {
                            list7.removeAll(c4);
                        }
                    }
                    if (list7.isEmpty()) {
                        e7.a(g, view11);
                    }
                    else {
                        e7.b(g, list7);
                        e7.t(g, g, list7, null, null, null, null);
                        if (b6.e() == i0.e.c.I) {
                            final e e11 = b6;
                            list2.remove(e11);
                            final ArrayList list8 = new ArrayList<View>(list7);
                            list8.remove(e11.f().mView);
                            e7.r(g, e11.f().mView, (ArrayList<View>)list8);
                            d0.a((View)this.m(), new Runnable() {
                                @Override
                                public void run() {
                                    c0.B(list7, 4);
                                }
                            });
                        }
                    }
                    if (b6.e() == i0.e.c.H) {
                        list6.addAll(list7);
                        if (b2) {
                            e7.u(g, rect);
                        }
                    }
                    else {
                        e7.v(g, view12);
                    }
                    hashMap.put(b6, Boolean.TRUE);
                    if (m2.j()) {
                        n = e7.n(n, g, null);
                    }
                    else {
                        n2 = e7.n(n2, g, null);
                    }
                }
            }
        }
        final Object m3 = e7.m(n, n2, o);
        for (final m m4 : list) {
            if (((l)m4).d()) {
                continue;
            }
            final Object h = m4.h();
            final e b8 = ((l)m4).b();
            final boolean b9 = o != null && (b8 == e3 || b8 == e10);
            if (h == null && !b9) {
                continue;
            }
            if (!androidx.core.view.j0.T0((View)this.m())) {
                if (FragmentManager.T0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: Container ");
                    sb2.append(this.m());
                    sb2.append(" has not been laid out. Completing operation ");
                    sb2.append(b8);
                    Log.v("FragmentManager", sb2.toString());
                }
                ((l)m4).a();
            }
            else {
                e7.w(((l)m4).b().f(), m3, ((l)m4).c(), new Runnable() {
                    @Override
                    public void run() {
                        ((l)m4).a();
                    }
                });
            }
        }
        if (!androidx.core.view.j0.T0((View)this.m())) {
            return hashMap;
        }
        c0.B(list6, 4);
        final ArrayList<String> o4 = e7.o(c4);
        e7.c(this.m(), m3);
        e7.y((View)this.m(), c5, c4, o4, (Map<String, String>)a);
        c0.B(list6, 0);
        e7.A(o, c5, c4);
        return hashMap;
    }
    
    @Override
    void f(@j0 final List<e> c, final boolean b) {
        final Iterator<e> iterator = c.iterator();
        e e2;
        e e = e2 = null;
        while (iterator.hasNext()) {
            final e e3 = iterator.next();
            final e.c f = i0.e.c.f(e3.f().mView);
            final int n = c$a.a[e3.e().ordinal()];
            if (n != 1 && n != 2 && n != 3) {
                if (n != 4) {
                    continue;
                }
                if (f == i0.e.c.H) {
                    continue;
                }
                e2 = e3;
            }
            else {
                if (f != i0.e.c.H || e != null) {
                    continue;
                }
                e = e3;
            }
        }
        final ArrayList<k> list = new ArrayList<k>();
        final ArrayList<m> list2 = new ArrayList<m>();
        final ArrayList<e> list3 = new ArrayList<e>(c);
        for (final e e4 : c) {
            final androidx.core.os.c c2 = new androidx.core.os.c();
            e4.j(c2);
            list.add(new k(e4, c2, b));
            final androidx.core.os.c c3 = new androidx.core.os.c();
            e4.j(c3);
            boolean b2 = false;
            Label_0252: {
                if (b) {
                    if (e4 != e) {
                        break Label_0252;
                    }
                }
                else if (e4 != e2) {
                    break Label_0252;
                }
                b2 = true;
            }
            list2.add(new m(e4, c3, b, b2));
            e4.a(new Runnable() {
                @Override
                public void run() {
                    if (list3.contains(e4)) {
                        list3.remove(e4);
                        c.this.s(e4);
                    }
                }
            });
        }
        final Map<e, Boolean> x = this.x(list2, list3, b, e, e2);
        this.w(list, list3, x.containsValue(Boolean.TRUE), x);
        final Iterator<Object> iterator3 = list3.iterator();
        while (iterator3.hasNext()) {
            this.s(iterator3.next());
        }
        list3.clear();
    }
    
    void s(@j0 final e e) {
        e.e().b(e.f().mView);
    }
    
    void t(final ArrayList<View> list, View child) {
        if (child instanceof ViewGroup) {
            final ViewGroup e = (ViewGroup)child;
            if (l0.c(e)) {
                if (!list.contains(child)) {
                    list.add((View)e);
                }
            }
            else {
                for (int childCount = e.getChildCount(), i = 0; i < childCount; ++i) {
                    child = e.getChildAt(i);
                    if (child.getVisibility() == 0) {
                        this.t(list, child);
                    }
                }
            }
        }
        else if (!list.contains(child)) {
            list.add(child);
        }
    }
    
    void u(final Map<String, View> map, @j0 final View view) {
        final String w0 = androidx.core.view.j0.w0(view);
        if (w0 != null) {
            map.put(w0, view);
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    this.u(map, child);
                }
            }
        }
    }
    
    void v(@j0 final a<String, View> a, @j0 final Collection<String> collection) {
        final Iterator<Map.Entry<String, View>> iterator = a.entrySet().iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(androidx.core.view.j0.w0(((Map.Entry<String, View>)iterator.next()).getValue()))) {
                iterator.remove();
            }
        }
    }
    
    private static class k extends l
    {
        private boolean c;
        private boolean d;
        @k0
        private androidx.fragment.app.e.d e;
        
        k(@j0 final e e, @j0 final androidx.core.os.c c, final boolean c2) {
            super(e, c);
            this.d = false;
            this.c = c2;
        }
        
        @k0
        androidx.fragment.app.e.d e(@j0 final Context context) {
            if (this.d) {
                return this.e;
            }
            final androidx.fragment.app.e.d c = androidx.fragment.app.e.c(context, ((l)this).b().f(), ((l)this).b().e() == i0.e.c.H, this.c);
            this.e = c;
            this.d = true;
            return c;
        }
    }
    
    private static class l
    {
        @j0
        private final e a;
        @j0
        private final androidx.core.os.c b;
        
        l(@j0 final e a, @j0 final androidx.core.os.c b) {
            this.a = a;
            this.b = b;
        }
        
        void a() {
            this.a.d(this.b);
        }
        
        @j0
        e b() {
            return this.a;
        }
        
        @j0
        androidx.core.os.c c() {
            return this.b;
        }
        
        boolean d() {
            final e.c f = i0.e.c.f(this.a.f().mView);
            final e.c e = this.a.e();
            if (f != e) {
                final e.c h = i0.e.c.H;
                if (f == h || e == h) {
                    return false;
                }
            }
            return true;
        }
    }
    
    private static class m extends l
    {
        @k0
        private final Object c;
        private final boolean d;
        @k0
        private final Object e;
        
        m(@j0 final e e, @j0 final androidx.core.os.c c, final boolean b, final boolean b2) {
            super(e, c);
            boolean d;
            if (e.e() == e.c.H) {
                final Fragment f = e.f();
                Object c2;
                if (b) {
                    c2 = f.getReenterTransition();
                }
                else {
                    c2 = f.getEnterTransition();
                }
                this.c = c2;
                final Fragment f2 = e.f();
                if (b) {
                    d = f2.getAllowReturnTransitionOverlap();
                }
                else {
                    d = f2.getAllowEnterTransitionOverlap();
                }
            }
            else {
                final Fragment f3 = e.f();
                Object c3;
                if (b) {
                    c3 = f3.getReturnTransition();
                }
                else {
                    c3 = f3.getExitTransition();
                }
                this.c = c3;
                d = true;
            }
            this.d = d;
            Object e2;
            if (b2) {
                final Fragment f4 = e.f();
                if (b) {
                    e2 = f4.getSharedElementReturnTransition();
                }
                else {
                    e2 = f4.getSharedElementEnterTransition();
                }
            }
            else {
                e2 = null;
            }
            this.e = e2;
        }
        
        @k0
        private e0 f(final Object obj) {
            if (obj == null) {
                return null;
            }
            final e0 b = c0.b;
            if (b != null && b.e(obj)) {
                return b;
            }
            final e0 c = c0.c;
            if (c != null && c.e(obj)) {
                return c;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Transition ");
            sb.append(obj);
            sb.append(" for fragment ");
            sb.append(((l)this).b().f());
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
        
        @k0
        e0 e() {
            e0 f = this.f(this.c);
            final e0 f2 = this.f(this.e);
            if (f != null && f2 != null && f != f2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(((l)this).b().f());
                sb.append(" returned Transition ");
                sb.append(this.c);
                sb.append(" which uses a different Transition  type than its shared element transition ");
                sb.append(this.e);
                throw new IllegalArgumentException(sb.toString());
            }
            if (f == null) {
                f = f2;
            }
            return f;
        }
        
        @k0
        public Object g() {
            return this.e;
        }
        
        @k0
        Object h() {
            return this.c;
        }
        
        public boolean i() {
            return this.e != null;
        }
        
        boolean j() {
            return this.d;
        }
    }
}
