// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import java.util.HashMap;
import android.content.ContentValues;

final class n extends a
{
    n(final String[] array, final String s) {
        super(array, null, null);
    }
    
    @Override
    public final a c(final ContentValues contentValues) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }
    
    @Override
    public final a d(final HashMap<String, Object> hashMap) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }
}
