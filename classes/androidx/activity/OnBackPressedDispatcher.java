// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity;

import androidx.lifecycle.x;
import androidx.lifecycle.v;
import java.util.Iterator;
import android.annotation.SuppressLint;
import androidx.lifecycle.s;
import androidx.lifecycle.y;
import androidx.annotation.g0;
import androidx.annotation.j0;
import java.util.ArrayDeque;
import androidx.annotation.k0;

public final class OnBackPressedDispatcher
{
    @k0
    private final Runnable a;
    final ArrayDeque<c> b;
    
    public OnBackPressedDispatcher() {
        this(null);
    }
    
    public OnBackPressedDispatcher(@k0 final Runnable a) {
        this.b = new ArrayDeque<c>();
        this.a = a;
    }
    
    @g0
    public void a(@j0 final c c) {
        this.c(c);
    }
    
    @SuppressLint({ "LambdaLast" })
    @g0
    public void b(@j0 final y y, @j0 final c c) {
        final s lifecycle = y.getLifecycle();
        if (lifecycle.b() == s.c.G) {
            return;
        }
        c.addCancellable(new LifecycleOnBackPressedCancellable(lifecycle, c));
    }
    
    @g0
    @j0
    b c(@j0 final c e) {
        this.b.add(e);
        final a a = new a(e);
        e.addCancellable(a);
        return a;
    }
    
    @g0
    public boolean d() {
        final Iterator<c> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().isEnabled()) {
                return true;
            }
        }
        return false;
    }
    
    @g0
    public void e() {
        final Iterator<c> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            final c c = descendingIterator.next();
            if (c.isEnabled()) {
                c.handleOnBackPressed();
                return;
            }
        }
        final Runnable a = this.a;
        if (a != null) {
            a.run();
        }
    }
    
    private class LifecycleOnBackPressedCancellable implements v, b
    {
        private final s G;
        private final c H;
        @k0
        private b I;
        
        LifecycleOnBackPressedCancellable(@j0 final s g, final c h) {
            this.G = g;
            this.H = h;
            g.a(this);
        }
        
        @Override
        public void cancel() {
            this.G.c(this);
            this.H.removeCancellable(this);
            final b i = this.I;
            if (i != null) {
                i.cancel();
                this.I = null;
            }
        }
        
        @Override
        public void h(@j0 final y y, @j0 final s.b b) {
            if (b == s.b.ON_START) {
                this.I = OnBackPressedDispatcher.this.c(this.H);
            }
            else if (b == s.b.ON_STOP) {
                final b i = this.I;
                if (i != null) {
                    i.cancel();
                }
            }
            else if (b == s.b.ON_DESTROY) {
                this.cancel();
            }
        }
    }
    
    private class a implements b
    {
        private final c G;
        
        a(final c g) {
            this.G = g;
        }
        
        @Override
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.G);
            this.G.removeCancellable(this);
        }
    }
}
