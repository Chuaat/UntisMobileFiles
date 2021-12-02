// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.phenotype;

import android.os.IBinder;
import android.os.IInterface;

public class a implements IInterface
{
    private final IBinder e;
    private final String f;
    
    protected a(final IBinder e, final String f) {
        this.e = e;
        this.f = f;
    }
    
    public IBinder asBinder() {
        return this.e;
    }
}
