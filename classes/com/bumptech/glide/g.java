// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide;

import androidx.annotation.s;
import androidx.annotation.o0;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import androidx.annotation.j0;
import android.net.Uri;
import androidx.annotation.j;
import androidx.annotation.k0;
import java.net.URL;

interface g<T>
{
    @Deprecated
    @j
    T d(@k0 final URL p0);
    
    @j0
    @j
    T g(@k0 final Uri p0);
    
    @j0
    @j
    T i(@k0 final byte[] p0);
    
    @j0
    @j
    T j(@k0 final File p0);
    
    @j0
    @j
    T l(@k0 final Drawable p0);
    
    @j0
    @j
    T m(@k0 final Bitmap p0);
    
    @j0
    @j
    T n(@k0 final Object p0);
    
    @j0
    @j
    T q(@k0 @o0 @s final Integer p0);
    
    @j0
    @j
    T s(@k0 final String p0);
}
