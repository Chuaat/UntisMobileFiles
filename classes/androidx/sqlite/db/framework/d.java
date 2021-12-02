// 
// Decompiled by Procyon v0.5.36
// 

package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.e;

class d implements e
{
    private final SQLiteProgram G;
    
    d(final SQLiteProgram g) {
        this.G = g;
    }
    
    @Override
    public void H2(final int n, final byte[] array) {
        this.G.bindBlob(n, array);
    }
    
    @Override
    public void K0(final int n, final String s) {
        this.G.bindString(n, s);
    }
    
    @Override
    public void c4(final int n) {
        this.G.bindNull(n);
    }
    
    @Override
    public void close() {
        this.G.close();
    }
    
    @Override
    public void l2(final int n, final long n2) {
        this.G.bindLong(n, n2);
    }
    
    @Override
    public void m5() {
        this.G.clearBindings();
    }
    
    @Override
    public void r1(final int n, final double n2) {
        this.G.bindDouble(n, n2);
    }
}
