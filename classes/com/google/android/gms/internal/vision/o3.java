// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.util.Vector;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class o3
{
    private final ConcurrentHashMap<n3, List<Throwable>> a;
    private final ReferenceQueue<Throwable> b;
    
    o3() {
        this.a = new ConcurrentHashMap<n3, List<Throwable>>(16, 0.75f, 10);
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
        final List<Throwable> list = this.a.get(new n3(t, null));
        if (!b) {
            return list;
        }
        if (list != null) {
            return list;
        }
        final Vector<Throwable> value = new Vector<Throwable>(2);
        final Vector<Throwable> vector = this.a.putIfAbsent(new n3(t, this.b), value);
        if (vector == null) {
            return value;
        }
        return vector;
    }
}
