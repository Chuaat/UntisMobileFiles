// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity;

import java.util.Iterator;
import androidx.annotation.g0;
import androidx.annotation.j0;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class c
{
    private CopyOnWriteArrayList<b> mCancellables;
    private boolean mEnabled;
    
    public c(final boolean mEnabled) {
        this.mCancellables = new CopyOnWriteArrayList<b>();
        this.mEnabled = mEnabled;
    }
    
    void addCancellable(@j0 final b e) {
        this.mCancellables.add(e);
    }
    
    @g0
    public abstract void handleOnBackPressed();
    
    @g0
    public final boolean isEnabled() {
        return this.mEnabled;
    }
    
    @g0
    public final void remove() {
        final Iterator<b> iterator = this.mCancellables.iterator();
        while (iterator.hasNext()) {
            iterator.next().cancel();
        }
    }
    
    void removeCancellable(@j0 final b o) {
        this.mCancellables.remove(o);
    }
    
    @g0
    public final void setEnabled(final boolean mEnabled) {
        this.mEnabled = mEnabled;
    }
}
