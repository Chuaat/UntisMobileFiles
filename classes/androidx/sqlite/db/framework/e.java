// 
// Decompiled by Procyon v0.5.36
// 

package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.h;

class e extends d implements h
{
    private final SQLiteStatement H;
    
    e(final SQLiteStatement h) {
        super((SQLiteProgram)h);
        this.H = h;
    }
    
    @Override
    public long F5() {
        return this.H.executeInsert();
    }
    
    @Override
    public String R2() {
        return this.H.simpleQueryForString();
    }
    
    @Override
    public int c1() {
        return this.H.executeUpdateDelete();
    }
    
    @Override
    public void p() {
        this.H.execute();
    }
    
    @Override
    public long z0() {
        return this.H.simpleQueryForLong();
    }
}
