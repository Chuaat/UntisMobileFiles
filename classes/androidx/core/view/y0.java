// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsController$OnControllableInsetsChangedListener;
import androidx.collection.m;
import android.view.inputmethod.InputMethodManager;
import android.os.CancellationSignal;
import androidx.annotation.k0;
import android.view.animation.Interpolator;
import androidx.annotation.p0;
import android.view.WindowInsetsController;
import android.os.Build$VERSION;
import android.view.View;
import androidx.annotation.j0;
import android.view.Window;

public final class y0
{
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    private final e a;
    
    public y0(@j0 final Window window, @j0 final View view) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            this.a = (e)new d(window, this);
        }
        else {
            e a;
            if (sdk_INT >= 26) {
                a = new c(window, view);
            }
            else if (sdk_INT >= 23) {
                a = new b(window, view);
            }
            else {
                if (sdk_INT < 20) {
                    this.a = new e();
                    return;
                }
                a = new a(window, view);
            }
            this.a = a;
        }
    }
    
    @p0(30)
    private y0(@j0 final WindowInsetsController windowInsetsController) {
        if (Build$VERSION.SDK_INT >= 30) {
            this.a = (e)new d(windowInsetsController, this);
        }
        else {
            this.a = new e();
        }
    }
    
    @j0
    @p0(30)
    public static y0 l(@j0 final WindowInsetsController windowInsetsController) {
        return new y0(windowInsetsController);
    }
    
    public void a(@j0 final f f) {
        this.a.a(f);
    }
    
    public void b(final int n, final long n2, @k0 final Interpolator interpolator, @k0 final CancellationSignal cancellationSignal, @j0 final v0 v0) {
        this.a.b(n, n2, interpolator, cancellationSignal, v0);
    }
    
    public int c() {
        return this.a.c();
    }
    
    public void d(final int n) {
        this.a.d(n);
    }
    
    public boolean e() {
        return this.a.e();
    }
    
    public boolean f() {
        return this.a.f();
    }
    
    public void g(@j0 final f f) {
        this.a.g(f);
    }
    
    public void h(final boolean b) {
        this.a.h(b);
    }
    
    public void i(final boolean b) {
        this.a.i(b);
    }
    
    public void j(final int n) {
        this.a.j(n);
    }
    
    public void k(final int n) {
        this.a.k(n);
    }
    
    @p0(20)
    private static class a extends e
    {
        @j0
        protected final Window a;
        @k0
        private final View b;
        
        a(@j0 final Window a, @k0 final View b) {
            this.a = a;
            this.b = b;
        }
        
        private void l(final int n) {
            if (n == 1) {
                this.m(4);
                return;
            }
            if (n != 2) {
                if (n == 8) {
                    ((InputMethodManager)this.a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getDecorView().getWindowToken(), 0);
                }
                return;
            }
            this.m(2);
        }
        
        private void o(final int n) {
            if (n == 1) {
                this.p(4);
                this.q(1024);
                return;
            }
            if (n != 2) {
                if (n == 8) {
                    View view = this.b;
                    if (view != null && (view.isInEditMode() || view.onCheckIsTextEditor())) {
                        view.requestFocus();
                    }
                    else {
                        view = this.a.getCurrentFocus();
                    }
                    View viewById = view;
                    if (view == null) {
                        viewById = this.a.findViewById(16908290);
                    }
                    if (viewById != null && viewById.hasWindowFocus()) {
                        viewById.post((Runnable)new Runnable() {
                            @Override
                            public void run() {
                                ((InputMethodManager)viewById.getContext().getSystemService("input_method")).showSoftInput(viewById, 0);
                            }
                        });
                    }
                }
                return;
            }
            this.p(2);
        }
        
        @Override
        void a(final f f) {
        }
        
        @Override
        void b(final int n, final long n2, final Interpolator interpolator, final CancellationSignal cancellationSignal, final v0 v0) {
        }
        
        @Override
        int c() {
            return 0;
        }
        
        @Override
        void d(final int n) {
            for (int i = 1; i <= 256; i <<= 1) {
                if ((n & i) != 0x0) {
                    this.l(i);
                }
            }
        }
        
        @Override
        void g(@j0 final f f) {
        }
        
        @Override
        void j(final int n) {
            if (n != 0) {
                if (n != 1) {
                    if (n == 2) {
                        this.p(2048);
                        this.m(4096);
                    }
                }
                else {
                    this.p(4096);
                    this.m(2048);
                }
            }
            else {
                this.p(6144);
            }
        }
        
        @Override
        void k(final int n) {
            for (int i = 1; i <= 256; i <<= 1) {
                if ((n & i) != 0x0) {
                    this.o(i);
                }
            }
        }
        
        protected void m(final int n) {
            final View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(n | decorView.getSystemUiVisibility());
        }
        
        protected void n(final int n) {
            this.a.addFlags(n);
        }
        
        protected void p(final int n) {
            final View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(~n & decorView.getSystemUiVisibility());
        }
        
        protected void q(final int n) {
            this.a.clearFlags(n);
        }
    }
    
    @p0(23)
    private static class b extends a
    {
        b(@j0 final Window window, @k0 final View view) {
            super(window, view);
        }
        
        @Override
        public boolean f() {
            return (super.a.getDecorView().getSystemUiVisibility() & 0x2000) != 0x0;
        }
        
        @Override
        public void i(final boolean b) {
            if (b) {
                ((a)this).q(67108864);
                ((a)this).n(Integer.MIN_VALUE);
                ((a)this).m(8192);
            }
            else {
                ((a)this).p(8192);
            }
        }
    }
    
    @p0(26)
    private static class c extends b
    {
        c(@j0 final Window window, @k0 final View view) {
            super(window, view);
        }
        
        @Override
        public boolean e() {
            return (super.a.getDecorView().getSystemUiVisibility() & 0x10) != 0x0;
        }
        
        @Override
        public void h(final boolean b) {
            if (b) {
                ((a)this).q(134217728);
                ((a)this).n(Integer.MIN_VALUE);
                ((a)this).m(16);
            }
            else {
                ((a)this).p(16);
            }
        }
    }
    
    @p0(30)
    private static class d extends e
    {
        final y0 a;
        final WindowInsetsController b;
        private final m<f, WindowInsetsController$OnControllableInsetsChangedListener> c;
        
        d(@j0 final Window window, @j0 final y0 y0) {
            this(window.getInsetsController(), y0);
        }
        
        d(@j0 final WindowInsetsController b, @j0 final y0 a) {
            this.c = new m<f, WindowInsetsController$OnControllableInsetsChangedListener>();
            this.b = b;
            this.a = a;
        }
        
        @Override
        void a(@j0 final f f) {
            if (this.c.containsKey(f)) {
                return;
            }
            final WindowInsetsController$OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListener = (WindowInsetsController$OnControllableInsetsChangedListener)new WindowInsetsController$OnControllableInsetsChangedListener() {
                public void onControllableInsetsChanged(@j0 final WindowInsetsController windowInsetsController, final int n) {
                    final d b = d.this;
                    if (b.b == windowInsetsController) {
                        f.a(b.a, n);
                    }
                }
            };
            this.c.put(f, (WindowInsetsController$OnControllableInsetsChangedListener)windowInsetsController$OnControllableInsetsChangedListener);
            this.b.addOnControllableInsetsChangedListener((WindowInsetsController$OnControllableInsetsChangedListener)windowInsetsController$OnControllableInsetsChangedListener);
        }
        
        @Override
        void b(final int n, final long n2, @k0 final Interpolator interpolator, @k0 final CancellationSignal cancellationSignal, @j0 final v0 v0) {
            this.b.controlWindowInsetsAnimation(n, n2, interpolator, cancellationSignal, (WindowInsetsAnimationControlListener)new WindowInsetsAnimationControlListener() {
                private w0 a = null;
                
                public void onCancelled(@k0 final WindowInsetsAnimationController windowInsetsAnimationController) {
                    final v0 b = v0;
                    w0 a;
                    if (windowInsetsAnimationController == null) {
                        a = null;
                    }
                    else {
                        a = this.a;
                    }
                    b.a(a);
                }
                
                public void onFinished(@j0 final WindowInsetsAnimationController windowInsetsAnimationController) {
                    v0.c(this.a);
                }
                
                public void onReady(@j0 final WindowInsetsAnimationController windowInsetsAnimationController, final int n) {
                    final w0 a = new w0(windowInsetsAnimationController);
                    this.a = a;
                    v0.b(a, n);
                }
            });
        }
        
        @Override
        int c() {
            return this.b.getSystemBarsBehavior();
        }
        
        @Override
        void d(final int n) {
            this.b.hide(n);
        }
        
        @Override
        public boolean e() {
            return (this.b.getSystemBarsAppearance() & 0x10) != 0x0;
        }
        
        @Override
        public boolean f() {
            return (this.b.getSystemBarsAppearance() & 0x8) != 0x0;
        }
        
        @Override
        void g(@j0 final f f) {
            final WindowInsetsController$OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListener = this.c.remove(f);
            if (windowInsetsController$OnControllableInsetsChangedListener != null) {
                this.b.removeOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
            }
        }
        
        @Override
        public void h(final boolean b) {
            if (b) {
                this.b.setSystemBarsAppearance(16, 16);
            }
            else {
                this.b.setSystemBarsAppearance(0, 16);
            }
        }
        
        @Override
        public void i(final boolean b) {
            if (b) {
                this.b.setSystemBarsAppearance(8, 8);
            }
            else {
                this.b.setSystemBarsAppearance(0, 8);
            }
        }
        
        @Override
        void j(final int systemBarsBehavior) {
            this.b.setSystemBarsBehavior(systemBarsBehavior);
        }
        
        @Override
        void k(final int n) {
            this.b.show(n);
        }
    }
    
    private static class e
    {
        e() {
        }
        
        void a(final f f) {
        }
        
        void b(final int n, final long n2, final Interpolator interpolator, final CancellationSignal cancellationSignal, final v0 v0) {
        }
        
        int c() {
            return 0;
        }
        
        void d(final int n) {
        }
        
        public boolean e() {
            return false;
        }
        
        public boolean f() {
            return false;
        }
        
        void g(@j0 final f f) {
        }
        
        public void h(final boolean b) {
        }
        
        public void i(final boolean b) {
        }
        
        void j(final int n) {
        }
        
        void k(final int n) {
        }
    }
    
    public interface f
    {
        void a(@j0 final y0 p0, final int p1);
    }
}
