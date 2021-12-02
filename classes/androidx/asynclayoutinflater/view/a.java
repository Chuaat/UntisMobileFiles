// 
// Decompiled by Procyon v0.5.36
// 

package androidx.asynclayoutinflater.view;

import android.util.Log;
import androidx.core.util.m;
import java.util.concurrent.ArrayBlockingQueue;
import android.view.View;
import android.util.AttributeSet;
import androidx.annotation.a1;
import java.util.Objects;
import androidx.annotation.k0;
import android.view.ViewGroup;
import androidx.annotation.e0;
import android.os.Message;
import androidx.annotation.j0;
import android.content.Context;
import android.os.Handler$Callback;
import android.os.Handler;
import android.view.LayoutInflater;

public final class a
{
    private static final String e = "AsyncLayoutInflater";
    LayoutInflater a;
    Handler b;
    d c;
    private Handler$Callback d;
    
    public a(@j0 final Context context) {
        this.d = (Handler$Callback)new Handler$Callback() {
            public boolean handleMessage(final Message message) {
                final c c = (c)message.obj;
                if (c.d == null) {
                    c.d = androidx.asynclayoutinflater.view.a.this.a.inflate(c.c, c.b, false);
                }
                c.e.a(c.d, c.c, c.b);
                androidx.asynclayoutinflater.view.a.this.c.d(c);
                return true;
            }
        };
        this.a = new b(context);
        this.b = new Handler(this.d);
        this.c = androidx.asynclayoutinflater.view.a.d.b();
    }
    
    @a1
    public void a(@e0 final int c, @k0 final ViewGroup b, @j0 final e e) {
        Objects.requireNonNull(e, "callback argument may not be null!");
        final c c2 = this.c.c();
        c2.a = this;
        c2.c = c;
        c2.b = b;
        c2.e = e;
        this.c.a(c2);
    }
    
    private static class b extends LayoutInflater
    {
        private static final String[] a;
        
        static {
            a = new String[] { "android.widget.", "android.webkit.", "android.app." };
        }
        
        b(final Context context) {
            super(context);
        }
        
        public LayoutInflater cloneInContext(final Context context) {
            return new b(context);
        }
        
        protected View onCreateView(final String s, final AttributeSet set) throws ClassNotFoundException {
            final String[] a = b.a;
            final int length = a.length;
            int n = 0;
        Label_0042_Outer:
            while (true) {
                Label_0048: {
                    if (n >= length) {
                        break Label_0048;
                    }
                    final String s2 = a[n];
                    while (true) {
                        try {
                            final View view = this.createView(s, s2, set);
                            if (view != null) {
                                return view;
                            }
                            ++n;
                            continue Label_0042_Outer;
                            return super.onCreateView(s, set);
                        }
                        catch (ClassNotFoundException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    private static class c
    {
        a a;
        ViewGroup b;
        int c;
        View d;
        e e;
        
        c() {
        }
    }
    
    private static class d extends Thread
    {
        private static final d I;
        private ArrayBlockingQueue<c> G;
        private m.c<c> H;
        
        static {
            (I = new d()).start();
        }
        
        private d() {
            this.G = new ArrayBlockingQueue<c>(10);
            this.H = (m.c<c>)new m.c(10);
        }
        
        public static d b() {
            return d.I;
        }
        
        public void a(final c e) {
            try {
                this.G.put(e);
            }
            catch (InterruptedException cause) {
                throw new RuntimeException("Failed to enqueue async inflate request", cause);
            }
        }
        
        public c c() {
            c c;
            if ((c = this.H.b()) == null) {
                c = new c();
            }
            return c;
        }
        
        public void d(final c c) {
            c.e = null;
            c.a = null;
            c.b = null;
            c.c = 0;
            c.d = null;
            this.H.a(c);
        }
        
        public void e() {
            try {
                final c c = this.G.take();
                try {
                    c.d = c.a.a.inflate(c.c, c.b, false);
                }
                catch (RuntimeException ex) {
                    Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", (Throwable)ex);
                }
                Message.obtain(c.a.b, 0, (Object)c).sendToTarget();
            }
            catch (InterruptedException ex2) {
                Log.w("AsyncLayoutInflater", (Throwable)ex2);
            }
        }
        
        @Override
        public void run() {
            while (true) {
                this.e();
            }
        }
    }
    
    public interface e
    {
        void a(@j0 final View p0, @e0 final int p1, @k0 final ViewGroup p2);
    }
}
