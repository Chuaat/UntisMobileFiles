// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import android.util.Log;
import com.google.android.gms.vision.barcode.a;
import android.graphics.Bitmap;
import androidx.annotation.k0;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.dynamite.DynamiteModule;
import android.content.Context;

public final class q9 extends pa<p8>
{
    private final o7 i;
    
    public q9(final Context context, final o7 i) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.i = i;
        this.e();
    }
    
    @Override
    protected final void b() throws RemoteException {
        if (this.c()) {
            x.k(this.e()).zza();
        }
    }
    
    public final a[] f(final Bitmap bitmap, final oa oa) {
        if (!this.c()) {
            return new a[0];
        }
        try {
            return x.k(this.e()).H0(com.google.android.gms.dynamic.f.z2(bitmap), oa);
        }
        catch (RemoteException ex) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", (Throwable)ex);
            return new a[0];
        }
    }
    
    public final a[] g(final ByteBuffer byteBuffer, final oa oa) {
        if (!this.c()) {
            return new a[0];
        }
        try {
            return x.k(this.e()).y(com.google.android.gms.dynamic.f.z2(byteBuffer), oa);
        }
        catch (RemoteException ex) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", (Throwable)ex);
            return new a[0];
        }
    }
}
