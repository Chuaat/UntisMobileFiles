// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.GestureDetector;
import android.os.Message;
import android.view.ViewConfiguration;
import android.view.VelocityTracker;
import android.view.GestureDetector$OnDoubleTapListener;
import android.view.MotionEvent;
import android.os.Build$VERSION;
import android.os.Handler;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;

public final class h
{
    private final a a;
    
    public h(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener) {
        this(context, gestureDetector$OnGestureListener, null);
    }
    
    public h(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener, final Handler handler) {
        a a;
        if (Build$VERSION.SDK_INT > 17) {
            a = new c(context, gestureDetector$OnGestureListener, handler);
        }
        else {
            a = new b(context, gestureDetector$OnGestureListener, handler);
        }
        this.a = a;
    }
    
    public boolean a() {
        return this.a.d();
    }
    
    public boolean b(final MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }
    
    public void c(final boolean b) {
        this.a.c(b);
    }
    
    public void d(final GestureDetector$OnDoubleTapListener gestureDetector$OnDoubleTapListener) {
        this.a.b(gestureDetector$OnDoubleTapListener);
    }
    
    interface a
    {
        boolean a(final MotionEvent p0);
        
        void b(final GestureDetector$OnDoubleTapListener p0);
        
        void c(final boolean p0);
        
        boolean d();
    }
    
    static class b implements h.a
    {
        private static final int v;
        private static final int w;
        private static final int x = 1;
        private static final int y = 2;
        private static final int z = 3;
        private int a;
        private int b;
        private int c;
        private int d;
        private final Handler e;
        final GestureDetector$OnGestureListener f;
        GestureDetector$OnDoubleTapListener g;
        boolean h;
        boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        MotionEvent m;
        private MotionEvent n;
        private boolean o;
        private float p;
        private float q;
        private float r;
        private float s;
        private boolean t;
        private VelocityTracker u;
        
        static {
            v = ViewConfiguration.getTapTimeout();
            w = ViewConfiguration.getDoubleTapTimeout();
        }
        
        b(final Context context, final GestureDetector$OnGestureListener f, final Handler handler) {
            if (handler != null) {
                this.e = new a(handler);
            }
            else {
                this.e = new a();
            }
            this.f = f;
            if (f instanceof GestureDetector$OnDoubleTapListener) {
                this.b((GestureDetector$OnDoubleTapListener)f);
            }
            this.h(context);
        }
        
        private void e() {
            this.e.removeMessages(1);
            this.e.removeMessages(2);
            this.e.removeMessages(3);
            this.u.recycle();
            this.u = null;
            this.o = false;
            this.h = false;
            this.k = false;
            this.l = false;
            this.i = false;
            if (this.j) {
                this.j = false;
            }
        }
        
        private void f() {
            this.e.removeMessages(1);
            this.e.removeMessages(2);
            this.e.removeMessages(3);
            this.o = false;
            this.k = false;
            this.l = false;
            this.i = false;
            if (this.j) {
                this.j = false;
            }
        }
        
        private void h(final Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f != null) {
                this.t = true;
                final ViewConfiguration value = ViewConfiguration.get(context);
                final int scaledTouchSlop = value.getScaledTouchSlop();
                final int scaledDoubleTapSlop = value.getScaledDoubleTapSlop();
                this.c = value.getScaledMinimumFlingVelocity();
                this.d = value.getScaledMaximumFlingVelocity();
                this.a = scaledTouchSlop * scaledTouchSlop;
                this.b = scaledDoubleTapSlop * scaledDoubleTapSlop;
                return;
            }
            throw new IllegalArgumentException("OnGestureListener must not be null");
        }
        
        private boolean i(final MotionEvent motionEvent, final MotionEvent motionEvent2, final MotionEvent motionEvent3) {
            final boolean l = this.l;
            boolean b = false;
            if (!l) {
                return false;
            }
            if (motionEvent3.getEventTime() - motionEvent2.getEventTime() > androidx.core.view.h.b.w) {
                return false;
            }
            final int n = (int)motionEvent.getX() - (int)motionEvent3.getX();
            final int n2 = (int)motionEvent.getY() - (int)motionEvent3.getY();
            if (n * n + n2 * n2 < this.b) {
                b = true;
            }
            return b;
        }
        
        @Override
        public boolean a(MotionEvent n) {
            final int action = n.getAction();
            if (this.u == null) {
                this.u = VelocityTracker.obtain();
            }
            this.u.addMovement(n);
            final int n2 = action & 0xFF;
            final boolean b = false;
            final boolean b2 = n2 == 6;
            int actionIndex;
            if (b2) {
                actionIndex = n.getActionIndex();
            }
            else {
                actionIndex = -1;
            }
            final int pointerCount = n.getPointerCount();
            int i = 0;
            float n3 = 0.0f;
            float n4 = 0.0f;
            while (i < pointerCount) {
                if (actionIndex != i) {
                    n3 += n.getX(i);
                    n4 += n.getY(i);
                }
                ++i;
            }
            int n5;
            if (b2) {
                n5 = pointerCount - 1;
            }
            else {
                n5 = pointerCount;
            }
            final float n6 = (float)n5;
            final float n7 = n3 / n6;
            final float n8 = n4 / n6;
            boolean onScroll;
            if (n2 != 0) {
                boolean b3;
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 == 3) {
                            this.e();
                            onScroll = b;
                            return onScroll;
                        }
                        if (n2 == 5) {
                            this.p = n7;
                            this.r = n7;
                            this.q = n8;
                            this.s = n8;
                            this.f();
                            onScroll = b;
                            return onScroll;
                        }
                        if (n2 != 6) {
                            onScroll = b;
                            return onScroll;
                        }
                        this.p = n7;
                        this.r = n7;
                        this.q = n8;
                        this.s = n8;
                        this.u.computeCurrentVelocity(1000, (float)this.d);
                        final int actionIndex2 = n.getActionIndex();
                        final int pointerId = n.getPointerId(actionIndex2);
                        final float xVelocity = this.u.getXVelocity(pointerId);
                        final float yVelocity = this.u.getYVelocity(pointerId);
                        int n9 = 0;
                        while (true) {
                            onScroll = b;
                            if (n9 >= pointerCount) {
                                return onScroll;
                            }
                            if (n9 != actionIndex2) {
                                final int pointerId2 = n.getPointerId(n9);
                                if (this.u.getXVelocity(pointerId2) * xVelocity + this.u.getYVelocity(pointerId2) * yVelocity < 0.0f) {
                                    this.u.clear();
                                    onScroll = b;
                                    return onScroll;
                                }
                            }
                            ++n9;
                        }
                    }
                    else {
                        if (this.j) {
                            onScroll = b;
                            return onScroll;
                        }
                        final float a = this.p - n7;
                        final float a2 = this.q - n8;
                        if (this.o) {
                            onScroll = (false | this.g.onDoubleTapEvent(n));
                            return onScroll;
                        }
                        if (!this.k) {
                            if (Math.abs(a) < 1.0f) {
                                onScroll = b;
                                if (Math.abs(a2) < 1.0f) {
                                    return onScroll;
                                }
                            }
                            onScroll = this.f.onScroll(this.m, n, a, a2);
                            this.p = n7;
                            this.q = n8;
                            return onScroll;
                        }
                        final int n10 = (int)(n7 - this.r);
                        final int n11 = (int)(n8 - this.s);
                        final int n12 = n10 * n10 + n11 * n11;
                        boolean onScroll2;
                        if (n12 > this.a) {
                            onScroll2 = this.f.onScroll(this.m, n, a, a2);
                            this.p = n7;
                            this.q = n8;
                            this.k = false;
                            this.e.removeMessages(3);
                            this.e.removeMessages(1);
                            this.e.removeMessages(2);
                        }
                        else {
                            onScroll2 = false;
                        }
                        b3 = onScroll2;
                        if (n12 > this.a) {
                            this.l = false;
                            b3 = onScroll2;
                        }
                    }
                }
                else {
                    this.h = false;
                    final MotionEvent obtain = MotionEvent.obtain(n);
                    boolean b4 = false;
                    Label_0846: {
                        if (this.o) {
                            b4 = (this.g.onDoubleTapEvent(n) | false);
                        }
                        else {
                            if (this.j) {
                                this.e.removeMessages(3);
                                this.j = false;
                            }
                            else {
                                if (this.k) {
                                    b4 = this.f.onSingleTapUp(n);
                                    if (this.i) {
                                        final GestureDetector$OnDoubleTapListener g = this.g;
                                        if (g != null) {
                                            g.onSingleTapConfirmed(n);
                                        }
                                    }
                                    break Label_0846;
                                }
                                final VelocityTracker u = this.u;
                                final int pointerId3 = n.getPointerId(0);
                                u.computeCurrentVelocity(1000, (float)this.d);
                                final float yVelocity2 = u.getYVelocity(pointerId3);
                                final float xVelocity2 = u.getXVelocity(pointerId3);
                                if (Math.abs(yVelocity2) > this.c || Math.abs(xVelocity2) > this.c) {
                                    b4 = this.f.onFling(this.m, n, xVelocity2, yVelocity2);
                                    break Label_0846;
                                }
                            }
                            b4 = false;
                        }
                    }
                    n = this.n;
                    if (n != null) {
                        n.recycle();
                    }
                    this.n = obtain;
                    final VelocityTracker u2 = this.u;
                    if (u2 != null) {
                        u2.recycle();
                        this.u = null;
                    }
                    this.o = false;
                    this.i = false;
                    this.e.removeMessages(1);
                    this.e.removeMessages(2);
                    b3 = b4;
                }
                onScroll = b3;
            }
            else {
                boolean b5 = false;
                Label_1039: {
                    if (this.g != null) {
                        final boolean hasMessages = this.e.hasMessages(3);
                        if (hasMessages) {
                            this.e.removeMessages(3);
                        }
                        final MotionEvent m = this.m;
                        if (m != null) {
                            final MotionEvent n13 = this.n;
                            if (n13 != null && hasMessages && this.i(m, n13, n)) {
                                this.o = true;
                                b5 = (this.g.onDoubleTap(this.m) | false | this.g.onDoubleTapEvent(n));
                                break Label_1039;
                            }
                        }
                        this.e.sendEmptyMessageDelayed(3, (long)androidx.core.view.h.b.w);
                    }
                    b5 = false;
                }
                this.p = n7;
                this.r = n7;
                this.q = n8;
                this.s = n8;
                final MotionEvent j = this.m;
                if (j != null) {
                    j.recycle();
                }
                this.m = MotionEvent.obtain(n);
                this.k = true;
                this.l = true;
                this.h = true;
                this.j = false;
                this.i = false;
                if (this.t) {
                    this.e.removeMessages(2);
                    this.e.sendEmptyMessageAtTime(2, this.m.getDownTime() + androidx.core.view.h.b.v + ViewConfiguration.getLongPressTimeout());
                }
                this.e.sendEmptyMessageAtTime(1, this.m.getDownTime() + androidx.core.view.h.b.v);
                onScroll = (b5 | this.f.onDown(n));
            }
            return onScroll;
        }
        
        @Override
        public void b(final GestureDetector$OnDoubleTapListener g) {
            this.g = g;
        }
        
        @Override
        public void c(final boolean t) {
            this.t = t;
        }
        
        @Override
        public boolean d() {
            return this.t;
        }
        
        void g() {
            this.e.removeMessages(3);
            this.i = false;
            this.j = true;
            this.f.onLongPress(this.m);
        }
        
        private class a extends Handler
        {
            a() {
            }
            
            a(final Handler handler) {
                super(handler.getLooper());
            }
            
            public void handleMessage(final Message obj) {
                final int what = obj.what;
                if (what != 1) {
                    if (what != 2) {
                        if (what != 3) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unknown message ");
                            sb.append(obj);
                            throw new RuntimeException(sb.toString());
                        }
                        final b a = androidx.core.view.h.b.this;
                        final GestureDetector$OnDoubleTapListener g = a.g;
                        if (g != null) {
                            if (!a.h) {
                                g.onSingleTapConfirmed(a.m);
                            }
                            else {
                                a.i = true;
                            }
                        }
                    }
                    else {
                        androidx.core.view.h.b.this.g();
                    }
                }
                else {
                    final b a2 = androidx.core.view.h.b.this;
                    a2.f.onShowPress(a2.m);
                }
            }
        }
    }
    
    static class c implements h.a
    {
        private final GestureDetector a;
        
        c(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener, final Handler handler) {
            this.a = new GestureDetector(context, gestureDetector$OnGestureListener, handler);
        }
        
        @Override
        public boolean a(final MotionEvent motionEvent) {
            return this.a.onTouchEvent(motionEvent);
        }
        
        @Override
        public void b(final GestureDetector$OnDoubleTapListener onDoubleTapListener) {
            this.a.setOnDoubleTapListener(onDoubleTapListener);
        }
        
        @Override
        public void c(final boolean isLongpressEnabled) {
            this.a.setIsLongpressEnabled(isLongpressEnabled);
        }
        
        @Override
        public boolean d() {
            return this.a.isLongpressEnabled();
        }
    }
}
