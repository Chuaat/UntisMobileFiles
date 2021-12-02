// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import x1.b;
import android.content.Context;
import java.io.IOException;
import com.google.android.datatransport.runtime.scheduling.persistence.c;
import com.google.android.datatransport.runtime.scheduling.h;
import com.google.android.datatransport.runtime.scheduling.persistence.e;
import x1.d;
import e6.f;
import java.io.Closeable;

@f
@d(modules = { com.google.android.datatransport.runtime.backends.f.class, e.class, j.class, h.class, com.google.android.datatransport.runtime.scheduling.f.class, com.google.android.datatransport.runtime.time.d.class })
abstract class u implements Closeable
{
    abstract c a();
    
    abstract t b();
    
    @Override
    public void close() throws IOException {
        this.a().close();
    }
    
    @d.a
    interface a
    {
        @b
        a a(final Context p0);
        
        u h();
    }
}
