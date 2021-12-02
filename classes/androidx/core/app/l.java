// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.p0;
import androidx.annotation.k0;
import android.util.SparseIntArray;
import androidx.annotation.j0;
import android.app.Activity;
import android.os.Build$VERSION;

public class l
{
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private static final int k = 8;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 4;
    public static final int o = 8;
    public static final int p = 16;
    public static final int q = 32;
    public static final int r = 64;
    public static final int s = 128;
    public static final int t = 256;
    public static final int u = 511;
    private b a;
    
    public l() {
        this(1);
    }
    
    public l(final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            this.a = (b)new a(n);
        }
        else {
            this.a = new b();
        }
    }
    
    public void a(@j0 final Activity activity) {
        this.a.a(activity);
    }
    
    @k0
    public SparseIntArray[] b() {
        return this.a.b();
    }
    
    @k0
    public SparseIntArray[] c(@j0 final Activity activity) {
        return this.a.c(activity);
    }
    
    @k0
    public SparseIntArray[] d() {
        return this.a.d();
    }
    
    @k0
    public SparseIntArray[] e() {
        return this.a.e();
    }
    
    @p0(24)
    private static class a extends b
    {
        private static final int e = 1000000;
        private static final int f = 500000;
        private static HandlerThread g;
        private static Handler h;
        int a;
        SparseIntArray[] b;
        private ArrayList<WeakReference<Activity>> c;
        Window$OnFrameMetricsAvailableListener d;
        
        a(final int a) {
            this.b = new SparseIntArray[9];
            this.c = new ArrayList<WeakReference<Activity>>();
            this.d = (Window$OnFrameMetricsAvailableListener)new Window$OnFrameMetricsAvailableListener() {
                public void onFrameMetricsAvailable(final Window window, final FrameMetrics frameMetrics, final int n) {
                    final a a = androidx.core.app.l.a.this;
                    if ((a.a & 0x1) != 0x0) {
                        a.f(a.b[0], frameMetrics.getMetric(8));
                    }
                    final a a2 = androidx.core.app.l.a.this;
                    if ((a2.a & 0x2) != 0x0) {
                        a2.f(a2.b[1], frameMetrics.getMetric(1));
                    }
                    final a a3 = androidx.core.app.l.a.this;
                    if ((a3.a & 0x4) != 0x0) {
                        a3.f(a3.b[2], frameMetrics.getMetric(3));
                    }
                    final a a4 = androidx.core.app.l.a.this;
                    if ((a4.a & 0x8) != 0x0) {
                        a4.f(a4.b[3], frameMetrics.getMetric(4));
                    }
                    final a a5 = androidx.core.app.l.a.this;
                    if ((a5.a & 0x10) != 0x0) {
                        a5.f(a5.b[4], frameMetrics.getMetric(5));
                    }
                    final a a6 = androidx.core.app.l.a.this;
                    if ((a6.a & 0x40) != 0x0) {
                        a6.f(a6.b[6], frameMetrics.getMetric(7));
                    }
                    final a a7 = androidx.core.app.l.a.this;
                    if ((a7.a & 0x20) != 0x0) {
                        a7.f(a7.b[5], frameMetrics.getMetric(6));
                    }
                    final a a8 = androidx.core.app.l.a.this;
                    if ((a8.a & 0x80) != 0x0) {
                        a8.f(a8.b[7], frameMetrics.getMetric(0));
                    }
                    final a a9 = androidx.core.app.l.a.this;
                    if ((a9.a & 0x100) != 0x0) {
                        a9.f(a9.b[8], frameMetrics.getMetric(2));
                    }
                }
            };
            this.a = a;
        }
        
        @Override
        public void a(final Activity referent) {
            if (androidx.core.app.l.a.g == null) {
                (androidx.core.app.l.a.g = new HandlerThread("FrameMetricsAggregator")).start();
                androidx.core.app.l.a.h = new Handler(androidx.core.app.l.a.g.getLooper());
            }
            for (int i = 0; i <= 8; ++i) {
                final SparseIntArray[] b = this.b;
                if (b[i] == null && (this.a & 1 << i) != 0x0) {
                    b[i] = new SparseIntArray();
                }
            }
            referent.getWindow().addOnFrameMetricsAvailableListener(this.d, androidx.core.app.l.a.h);
            this.c.add(new WeakReference<Activity>(referent));
        }
        
        @Override
        public SparseIntArray[] b() {
            return this.b;
        }
        
        @Override
        public SparseIntArray[] c(final Activity activity) {
            for (final WeakReference<Activity> o : this.c) {
                if (o.get() == activity) {
                    this.c.remove(o);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
            return this.b;
        }
        
        @Override
        public SparseIntArray[] d() {
            final SparseIntArray[] b = this.b;
            this.b = new SparseIntArray[9];
            return b;
        }
        
        @Override
        public SparseIntArray[] e() {
            for (int i = this.c.size() - 1; i >= 0; --i) {
                final WeakReference<Activity> weakReference = this.c.get(i);
                final Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
                    this.c.remove(i);
                }
            }
            return this.b;
        }
        
        void f(final SparseIntArray sparseIntArray, final long n) {
            if (sparseIntArray != null) {
                final int n2 = (int)((500000L + n) / 1000000L);
                if (n >= 0L) {
                    sparseIntArray.put(n2, sparseIntArray.get(n2) + 1);
                }
            }
        }
    }
    
    private static class b
    {
        b() {
        }
        
        public void a(final Activity activity) {
        }
        
        public SparseIntArray[] b() {
            return null;
        }
        
        public SparseIntArray[] c(final Activity activity) {
            return null;
        }
        
        public SparseIntArray[] d() {
            return null;
        }
        
        public SparseIntArray[] e() {
            return null;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface c {
    }
}
