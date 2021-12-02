// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.annotation.t0;
import java.lang.reflect.InvocationTargetException;
import android.view.ViewParent;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.Rect;
import java.util.ArrayList;
import java.lang.reflect.Method;
import androidx.annotation.j0;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

class v0 implements x0
{
    protected a a;
    
    v0(final Context context, final ViewGroup viewGroup, final View view) {
        this.a = new a(context, viewGroup, view, this);
    }
    
    static v0 e(final View view) {
        final ViewGroup f = f(view);
        if (f != null) {
            for (int childCount = f.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = f.getChildAt(i);
                if (child instanceof a) {
                    return ((a)child).J;
                }
            }
            return new q0(f.getContext(), f, view);
        }
        return null;
    }
    
    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && view instanceof ViewGroup) {
                return (ViewGroup)view;
            }
            if (!(view.getParent() instanceof ViewGroup)) {
                continue;
            }
            view = (View)view.getParent();
        }
        return null;
    }
    
    @Override
    public void a(@j0 final Drawable drawable) {
        this.a.a(drawable);
    }
    
    @Override
    public void b(@j0 final Drawable drawable) {
        this.a.g(drawable);
    }
    
    static class a extends ViewGroup
    {
        static Method L;
        ViewGroup G;
        View H;
        ArrayList<Drawable> I;
        v0 J;
        private boolean K;
        
        static {
            try {
                final Class<Integer> type = Integer.TYPE;
                a.L = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", type, type, Rect.class);
            }
            catch (NoSuchMethodException ex) {}
        }
        
        a(final Context context, final ViewGroup g, final View h, final v0 j) {
            super(context);
            this.I = null;
            this.G = g;
            this.H = h;
            this.setRight(g.getWidth());
            this.setBottom(g.getHeight());
            g.addView((View)this);
            this.J = j;
        }
        
        private void c() {
            if (!this.K) {
                return;
            }
            throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
        }
        
        private void d() {
            if (this.getChildCount() == 0) {
                final ArrayList<Drawable> i = this.I;
                if (i == null || i.size() == 0) {
                    this.K = true;
                    this.G.removeView((View)this);
                }
            }
        }
        
        private void e(final int[] array) {
            final int[] array2 = new int[2];
            final int[] array3 = new int[2];
            this.G.getLocationOnScreen(array2);
            this.H.getLocationOnScreen(array3);
            array[0] = array3[0] - array2[0];
            array[1] = array3[1] - array2[1];
        }
        
        public void a(final Drawable drawable) {
            this.c();
            if (this.I == null) {
                this.I = new ArrayList<Drawable>();
            }
            if (!this.I.contains(drawable)) {
                this.I.add(drawable);
                this.invalidate(drawable.getBounds());
                drawable.setCallback((Drawable$Callback)this);
            }
        }
        
        public void b(final View view) {
            this.c();
            if (view.getParent() instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view.getParent();
                if (viewGroup != this.G && viewGroup.getParent() != null && androidx.core.view.j0.N0((View)viewGroup)) {
                    final int[] array = new int[2];
                    final int[] array2 = new int[2];
                    viewGroup.getLocationOnScreen(array);
                    this.G.getLocationOnScreen(array2);
                    androidx.core.view.j0.c1(view, array[0] - array2[0]);
                    androidx.core.view.j0.d1(view, array[1] - array2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }
        
        protected void dispatchDraw(final Canvas canvas) {
            final int[] array = new int[2];
            final int[] array2 = new int[2];
            this.G.getLocationOnScreen(array);
            this.H.getLocationOnScreen(array2);
            int i = 0;
            canvas.translate((float)(array2[0] - array[0]), (float)(array2[1] - array[1]));
            canvas.clipRect(new Rect(0, 0, this.H.getWidth(), this.H.getHeight()));
            super.dispatchDraw(canvas);
            final ArrayList<Drawable> j = this.I;
            int size;
            if (j == null) {
                size = 0;
            }
            else {
                size = j.size();
            }
            while (i < size) {
                this.I.get(i).draw(canvas);
                ++i;
            }
        }
        
        public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
            return false;
        }
        
        @t0({ t0.a.I })
        protected ViewParent f(final int i, final int j, final Rect rect) {
            if (this.G instanceof ViewGroup && a.L != null) {
                try {
                    this.e(new int[2]);
                    a.L.invoke(this.G, i, j, rect);
                }
                catch (InvocationTargetException ex) {
                    ex.printStackTrace();
                }
                catch (IllegalAccessException ex2) {
                    ex2.printStackTrace();
                }
            }
            return null;
        }
        
        public void g(final Drawable o) {
            final ArrayList<Drawable> i = this.I;
            if (i != null) {
                i.remove(o);
                this.invalidate(o.getBounds());
                o.setCallback((Drawable$Callback)null);
                this.d();
            }
        }
        
        public void h(final View view) {
            super.removeView(view);
            this.d();
        }
        
        public ViewParent invalidateChildInParent(final int[] array, final Rect rect) {
            if (this.G != null) {
                rect.offset(array[0], array[1]);
                if (this.G instanceof ViewGroup) {
                    array[1] = (array[0] = 0);
                    final int[] array2 = new int[2];
                    this.e(array2);
                    rect.offset(array2[0], array2[1]);
                    return super.invalidateChildInParent(array, rect);
                }
                this.invalidate(rect);
            }
            return null;
        }
        
        public void invalidateDrawable(@j0 final Drawable drawable) {
            this.invalidate(drawable.getBounds());
        }
        
        protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        }
        
        protected boolean verifyDrawable(@j0 final Drawable o) {
            if (!super.verifyDrawable(o)) {
                final ArrayList<Drawable> i = this.I;
                if (i == null || !i.contains(o)) {
                    return false;
                }
            }
            return true;
        }
    }
}
