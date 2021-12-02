// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import android.database.Cursor;
import androidx.work.d0;
import androidx.work.b;
import android.content.ContentValues;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.net.Uri;
import androidx.annotation.t0;
import android.content.ContentProvider;

@t0({ t0.a.H })
public class WorkManagerInitializer extends ContentProvider
{
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
        d0.A(this.getContext(), new b.a().a());
        return true;
    }
    
    @k0
    public Cursor query(@j0 final Uri uri, @k0 final String[] array, @k0 final String s, @k0 final String[] array2, @k0 final String s2) {
        return null;
    }
    
    public int update(@j0 final Uri uri, @k0 final ContentValues contentValues, @k0 final String s, @k0 final String[] array) {
        return 0;
    }
}
