// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import androidx.annotation.j0;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.io.File;
import androidx.annotation.k0;
import androidx.sqlite.db.d;

class z2 implements c
{
    @k0
    private final String a;
    @k0
    private final File b;
    @k0
    private final Callable<InputStream> c;
    @j0
    private final c d;
    
    z2(@k0 final String a, @k0 final File b, @k0 final Callable<InputStream> c, @j0 final c d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @j0
    @Override
    public d a(final b b) {
        return new y2(b.a, this.a, this.b, this.c, b.c.a, this.d.a(b));
    }
}
