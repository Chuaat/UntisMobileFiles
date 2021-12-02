// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import androidx.annotation.k0;
import androidx.sqlite.db.c;
import androidx.annotation.j0;
import java.util.concurrent.Executor;
import androidx.sqlite.db.d;

final class b2 implements d, p0
{
    private final d G;
    private final r2.f H;
    private final Executor I;
    
    b2(@j0 final d g, @j0 final r2.f h, @j0 final Executor i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public androidx.sqlite.db.c E2() {
        return new a2(this.G.E2(), this.H, this.I);
    }
    
    @Override
    public androidx.sqlite.db.c T2() {
        return new a2(this.G.T2(), this.H, this.I);
    }
    
    @Override
    public void close() {
        this.G.close();
    }
    
    @j0
    @Override
    public d f() {
        return this.G;
    }
    
    @k0
    @Override
    public String getDatabaseName() {
        return this.G.getDatabaseName();
    }
    
    @androidx.annotation.p0(api = 16)
    @Override
    public void setWriteAheadLoggingEnabled(final boolean writeAheadLoggingEnabled) {
        this.G.setWriteAheadLoggingEnabled(writeAheadLoggingEnabled);
    }
}
