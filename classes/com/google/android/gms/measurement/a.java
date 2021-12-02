// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement;

import android.database.Cursor;
import com.google.android.gms.internal.measurement.o1;
import com.google.android.gms.measurement.internal.z4;
import com.google.android.gms.common.internal.x;
import android.content.ContentValues;
import android.net.Uri;
import android.content.pm.ProviderInfo;
import androidx.annotation.j0;
import android.content.Context;
import android.content.ContentProvider;

@Deprecated
public class a extends ContentProvider
{
    public void attachInfo(@j0 final Context context, @j0 final ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!"com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }
    
    public int delete(@j0 final Uri uri, @j0 final String s, @j0 final String[] array) {
        return 0;
    }
    
    @j0
    public String getType(@j0 final Uri uri) {
        return null;
    }
    
    @j0
    public Uri insert(@j0 final Uri uri, @j0 final ContentValues contentValues) {
        return null;
    }
    
    public boolean onCreate() {
        final Context context = this.getContext();
        x.k(context);
        z4.E(context, null, null);
        return false;
    }
    
    @j0
    public Cursor query(@j0 final Uri uri, @j0 final String[] array, @j0 final String s, @j0 final String[] array2, @j0 final String s2) {
        return null;
    }
    
    public int update(@j0 final Uri uri, @j0 final ContentValues contentValues, @j0 final String s, @j0 final String[] array) {
        return 0;
    }
}
