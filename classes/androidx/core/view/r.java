// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.MotionEvent;

public final class r
{
    @Deprecated
    public static final int A = 17;
    @Deprecated
    public static final int B = 18;
    @Deprecated
    public static final int C = 19;
    @Deprecated
    public static final int D = 20;
    @Deprecated
    public static final int E = 21;
    @Deprecated
    public static final int F = 22;
    @Deprecated
    public static final int G = 23;
    @Deprecated
    public static final int H = 24;
    @Deprecated
    public static final int I = 25;
    public static final int J = 26;
    public static final int K = 27;
    public static final int L = 28;
    @Deprecated
    public static final int M = 32;
    @Deprecated
    public static final int N = 33;
    @Deprecated
    public static final int O = 34;
    @Deprecated
    public static final int P = 35;
    @Deprecated
    public static final int Q = 36;
    @Deprecated
    public static final int R = 37;
    @Deprecated
    public static final int S = 38;
    @Deprecated
    public static final int T = 39;
    @Deprecated
    public static final int U = 40;
    @Deprecated
    public static final int V = 41;
    @Deprecated
    public static final int W = 42;
    @Deprecated
    public static final int X = 43;
    @Deprecated
    public static final int Y = 44;
    @Deprecated
    public static final int Z = 45;
    @Deprecated
    public static final int a = 255;
    @Deprecated
    public static final int a0 = 46;
    @Deprecated
    public static final int b = 5;
    @Deprecated
    public static final int b0 = 47;
    @Deprecated
    public static final int c = 6;
    @Deprecated
    public static final int c0 = 1;
    @Deprecated
    public static final int d = 7;
    @Deprecated
    public static final int e = 8;
    @Deprecated
    public static final int f = 65280;
    @Deprecated
    public static final int g = 8;
    @Deprecated
    public static final int h = 9;
    @Deprecated
    public static final int i = 10;
    @Deprecated
    public static final int j = 0;
    @Deprecated
    public static final int k = 1;
    @Deprecated
    public static final int l = 2;
    @Deprecated
    public static final int m = 3;
    @Deprecated
    public static final int n = 4;
    @Deprecated
    public static final int o = 5;
    @Deprecated
    public static final int p = 6;
    @Deprecated
    public static final int q = 7;
    @Deprecated
    public static final int r = 8;
    @Deprecated
    public static final int s = 9;
    @Deprecated
    public static final int t = 10;
    @Deprecated
    public static final int u = 11;
    @Deprecated
    public static final int v = 12;
    @Deprecated
    public static final int w = 13;
    @Deprecated
    public static final int x = 14;
    @Deprecated
    public static final int y = 15;
    @Deprecated
    public static final int z = 16;
    
    private r() {
    }
    
    @Deprecated
    public static int a(final MotionEvent motionEvent, final int n) {
        return motionEvent.findPointerIndex(n);
    }
    
    @Deprecated
    public static int b(final MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }
    
    @Deprecated
    public static int c(final MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }
    
    @Deprecated
    public static float d(final MotionEvent motionEvent, final int n) {
        return motionEvent.getAxisValue(n);
    }
    
    @Deprecated
    public static float e(final MotionEvent motionEvent, final int n, final int n2) {
        return motionEvent.getAxisValue(n, n2);
    }
    
    @Deprecated
    public static int f(final MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }
    
    @Deprecated
    public static int g(final MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }
    
    @Deprecated
    public static int h(final MotionEvent motionEvent, final int n) {
        return motionEvent.getPointerId(n);
    }
    
    @Deprecated
    public static int i(final MotionEvent motionEvent) {
        return motionEvent.getSource();
    }
    
    @Deprecated
    public static float j(final MotionEvent motionEvent, final int n) {
        return motionEvent.getX(n);
    }
    
    @Deprecated
    public static float k(final MotionEvent motionEvent, final int n) {
        return motionEvent.getY(n);
    }
    
    public static boolean l(final MotionEvent motionEvent, final int n) {
        return (motionEvent.getSource() & n) == n;
    }
}
