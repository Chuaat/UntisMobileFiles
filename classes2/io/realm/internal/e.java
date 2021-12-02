// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

class e implements Runnable
{
    private final ReferenceQueue<k> G;
    
    e(final ReferenceQueue<k> g) {
        this.G = g;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                ((NativeObjectReference)this.G.remove()).e();
            }
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            RealmLog.i("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
        }
    }
}
