// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import com.google.android.gms.internal.common.b;
import androidx.annotation.RecentlyNonNull;
import android.os.IBinder;
import com.google.android.gms.internal.common.a;
import android.os.IInterface;

public interface d extends IInterface
{
    public static class a extends a implements d
    {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }
        
        @RecentlyNonNull
        public static d x2(@RecentlyNonNull final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof d) {
                return (d)queryLocalInterface;
            }
            return new d.a.a(binder);
        }
        
        public static final class a extends b implements d
        {
            a(final IBinder binder) {
                super(binder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }
    }
}
