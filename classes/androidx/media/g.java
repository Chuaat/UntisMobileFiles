// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.p0;

@p0(21)
class g extends i
{
    g(final Context a) {
        super(a);
        super.a = a;
    }
    
    private boolean d(@j0 final c c) {
        return this.getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", c.b(), c.a()) == 0;
    }
    
    @Override
    public boolean a(@j0 final c c) {
        return this.d(c) || super.a(c);
    }
}
