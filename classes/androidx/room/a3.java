// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import androidx.sqlite.db.h;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.annotation.t0;

@t0({ t0.a.I })
public abstract class a3
{
    private final r2 mDatabase;
    private final AtomicBoolean mLock;
    private volatile h mStmt;
    
    public a3(final r2 mDatabase) {
        this.mLock = new AtomicBoolean(false);
        this.mDatabase = mDatabase;
    }
    
    private h createNewStatement() {
        return this.mDatabase.h(this.createQuery());
    }
    
    private h getStmt(final boolean b) {
        h h;
        if (b) {
            if (this.mStmt == null) {
                this.mStmt = this.createNewStatement();
            }
            h = this.mStmt;
        }
        else {
            h = this.createNewStatement();
        }
        return h;
    }
    
    public h acquire() {
        this.assertNotMainThread();
        return this.getStmt(this.mLock.compareAndSet(false, true));
    }
    
    protected void assertNotMainThread() {
        this.mDatabase.c();
    }
    
    protected abstract String createQuery();
    
    public void release(final h h) {
        if (h == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
