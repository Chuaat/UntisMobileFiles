// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face.internal.client;

import androidx.annotation.p0;
import android.media.Image$Plane;
import com.google.android.gms.internal.vision.oa;
import java.nio.ByteBuffer;
import android.util.Log;
import androidx.annotation.k0;
import android.os.RemoteException;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.vision.qa;
import com.google.android.gms.dynamite.DynamiteModule;
import android.graphics.PointF;
import com.google.android.gms.vision.face.b;
import android.content.Context;
import com.google.android.gms.internal.vision.pa;

public final class d extends pa<j>
{
    private final h i;
    
    public d(final Context context, final h i) {
        super(context, "FaceNativeHandle", "face");
        this.i = i;
        this.e();
    }
    
    private static b f(final a a) {
        final int h = a.H;
        final PointF pointF = new PointF(a.I, a.J);
        final float k = a.K;
        final float l = a.L;
        final float m = a.M;
        final float n = a.N;
        final float o = a.O;
        final com.google.android.gms.vision.face.internal.client.b[] p = a.P;
        com.google.android.gms.vision.face.d[] array;
        if (p == null) {
            array = new com.google.android.gms.vision.face.d[0];
        }
        else {
            final com.google.android.gms.vision.face.d[] array2 = new com.google.android.gms.vision.face.d[p.length];
            for (int i = 0; i < p.length; ++i) {
                final com.google.android.gms.vision.face.internal.client.b b = p[i];
                array2[i] = new com.google.android.gms.vision.face.d(new PointF(b.H, b.I), b.J);
            }
            array = array2;
        }
        final c[] t = a.T;
        int j = 0;
        com.google.android.gms.vision.face.a[] array3;
        if (t == null) {
            array3 = new com.google.android.gms.vision.face.a[0];
        }
        else {
            array3 = new com.google.android.gms.vision.face.a[t.length];
            while (j < t.length) {
                final c c = t[j];
                array3[j] = new com.google.android.gms.vision.face.a(c.G, c.H);
                ++j;
            }
        }
        return new b(h, pointF, k, l, m, n, o, array, array3, a.Q, a.R, a.S, a.U);
    }
    
    @Override
    protected final void b() throws RemoteException {
        x.k(this.e()).zza();
    }
    
    public final boolean g(final int n) {
        if (!this.c()) {
            return false;
        }
        try {
            return x.k(this.e()).d(n);
        }
        catch (RemoteException ex) {
            Log.e("FaceNativeHandle", "Could not call native face detector", (Throwable)ex);
            return false;
        }
    }
    
    public final b[] h(final ByteBuffer byteBuffer, final oa oa) {
        final boolean c = this.c();
        int i = 0;
        if (!c) {
            return new b[0];
        }
        try {
            final a[] y = x.k(this.e()).y(com.google.android.gms.dynamic.f.z2(byteBuffer), oa);
            final b[] array = new b[y.length];
            while (i < y.length) {
                array[i] = f(y[i]);
                ++i;
            }
            return array;
        }
        catch (RemoteException ex) {
            Log.e("FaceNativeHandle", "Could not call native face detector", (Throwable)ex);
            return new b[0];
        }
    }
    
    @p0(19)
    public final b[] i(final Image$Plane[] array, final oa oa) {
        final boolean c = this.c();
        int i = 0;
        if (!c) {
            Log.e("FaceNativeHandle", "Native handle is not ready to be used.");
        }
        else {
            if (array != null) {
                if (array.length != 3) {
                    throw new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
                }
            }
            try {
                final a[] a1 = x.k(this.e()).A1(com.google.android.gms.dynamic.f.z2(array[0].getBuffer()), com.google.android.gms.dynamic.f.z2(array[1].getBuffer()), com.google.android.gms.dynamic.f.z2(array[2].getBuffer()), array[0].getPixelStride(), array[1].getPixelStride(), array[2].getPixelStride(), array[0].getRowStride(), array[1].getRowStride(), array[2].getRowStride(), oa);
                final b[] array2 = new b[a1.length];
                while (i < a1.length) {
                    array2[i] = f(a1[i]);
                    ++i;
                }
                return array2;
            }
            catch (RemoteException ex) {
                Log.e("FaceNativeHandle", "Could not call native face detector", (Throwable)ex);
            }
        }
        return new b[0];
    }
}
