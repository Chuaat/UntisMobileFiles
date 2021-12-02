// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.util.Log;
import android.graphics.Bitmap;
import androidx.annotation.k0;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.dynamite.DynamiteModule;
import android.content.Context;

public final class o extends pa<e>
{
    private final n i;
    
    public o(final Context context, final n i) {
        super(context, "TextNativeHandle", "ocr");
        this.i = i;
        this.e();
    }
    
    @Override
    protected final void b() throws RemoteException {
        x.k(this.e()).zzb();
    }
    
    public final i[] f(final Bitmap bitmap, final oa oa, final k k) {
        if (!this.c()) {
            return new i[0];
        }
        try {
            return x.k(this.e()).i2(com.google.android.gms.dynamic.f.z2(bitmap), oa, k);
        }
        catch (RemoteException ex) {
            Log.e("TextNativeHandle", "Error calling native text recognizer", (Throwable)ex);
            return new i[0];
        }
    }
}
