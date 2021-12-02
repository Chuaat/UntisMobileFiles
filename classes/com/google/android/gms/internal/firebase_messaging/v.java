// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.Reference;
import java.util.Vector;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class v
{
    private final ConcurrentHashMap<u, List<Throwable>> a;
    private final ReferenceQueue<Throwable> b;
    
    v() {
        this.a = new ConcurrentHashMap<u, List<Throwable>>(16, 0.75f, 10);
        this.b = new ReferenceQueue<Throwable>();
    }
    
    public final List<Throwable> a(final Throwable t, final boolean b) {
        while (true) {
            final Reference<? extends Throwable> poll = this.b.poll();
            if (poll == null) {
                break;
            }
            this.a.remove(poll);
        }
        final List<Throwable> list = this.a.get(new u(t, null));
        if (list != null) {
            return list;
        }
        final Vector<Throwable> value = new Vector<Throwable>(2);
        final Vector<Throwable> vector = this.a.putIfAbsent(new u(t, this.b), value);
        if (vector == null) {
            return value;
        }
        return vector;
    }
}
