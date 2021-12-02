// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import android.database.Cursor;
import android.content.ContentValues;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.net.Uri;
import androidx.annotation.t0;
import android.content.ContentProvider;

@t0({ t0.a.I })
public class ProcessLifecycleOwnerInitializer extends ContentProvider
{
    public int delete(@j0 final Uri uri, final String s, final String[] array) {
        return 0;
    }
    
    @k0
    public String getType(@j0 final Uri uri) {
        return null;
    }
    
    @k0
    public Uri insert(@j0 final Uri uri, final ContentValues contentValues) {
        return null;
    }
    
    public boolean onCreate() {
        u.a(this.getContext());
        p0.i(this.getContext());
        return true;
    }
    
    @k0
    public Cursor query(@j0 final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        return null;
    }
    
    public int update(@j0 final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        return 0;
    }
}
