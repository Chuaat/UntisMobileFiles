// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.b;
import android.content.Context;
import android.os.ParcelFileDescriptor;

@Deprecated
public class i0 extends j0<ParcelFileDescriptor>
{
    public i0(final Context context) {
        this(com.bumptech.glide.b.d(context).g());
    }
    
    public i0(final com.bumptech.glide.load.engine.bitmap_recycle.e e) {
        super(e, (f)new g());
    }
}
