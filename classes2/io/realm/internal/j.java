// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.lang.ref.ReferenceQueue;

public class j
{
    private static final ReferenceQueue<k> a;
    private static final Thread b;
    public static final j c;
    
    static {
        final Thread thread = b = new Thread(new e(a = new ReferenceQueue<k>()));
        c = new j();
        thread.setName("RealmFinalizingDaemon");
        thread.start();
    }
    
    public void a(final k k) {
        new NativeObjectReference(this, k, j.a);
    }
}
