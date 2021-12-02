// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.provider;

import android.database.Cursor;
import android.util.Log;
import com.google.firebase.e;
import android.content.ContentValues;
import androidx.annotation.k0;
import android.net.Uri;
import android.content.Context;
import com.google.android.gms.common.internal.x;
import androidx.annotation.j0;
import android.content.pm.ProviderInfo;
import androidx.annotation.b1;
import android.content.ContentProvider;

public class FirebaseInitProvider extends ContentProvider
{
    private static final String G = "FirebaseInitProvider";
    @b1
    static final String H = "com.google.firebase.firebaseinitprovider";
    
    private static void a(@j0 final ProviderInfo providerInfo) {
        x.l((Object)providerInfo, (Object)"FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }
    
    public void attachInfo(@j0 final Context context, @j0 final ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }
    
    public int delete(@j0 final Uri uri, @k0 final String s, @k0 final String[] array) {
        return 0;
    }
    
    @k0
    public String getType(@j0 final Uri uri) {
        return null;
    }
    
    @k0
    public Uri insert(@j0 final Uri uri, @k0 final ContentValues contentValues) {
        return null;
    }
    
    public boolean onCreate() {
        String s;
        if (e.w(this.getContext()) == null) {
            s = "FirebaseApp initialization unsuccessful";
        }
        else {
            s = "FirebaseApp initialization successful";
        }
        Log.i("FirebaseInitProvider", s);
        return false;
    }
    
    @k0
    public Cursor query(@j0 final Uri uri, @k0 final String[] array, @k0 final String s, @k0 final String[] array2, @k0 final String s2) {
        return null;
    }
    
    public int update(@j0 final Uri uri, @k0 final ContentValues contentValues, @k0 final String s, @k0 final String[] array) {
        return 0;
    }
}
