// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.Iterator;
import java.util.Collection;

public class OsSchemaInfo implements k
{
    private static final long I;
    private long G;
    private final OsSharedRealm H;
    
    static {
        I = nativeGetFinalizerPtr();
    }
    
    OsSchemaInfo(final long g, final OsSharedRealm h) {
        this.G = g;
        this.H = h;
    }
    
    public OsSchemaInfo(final Collection<OsObjectSchemaInfo> collection) {
        this.G = nativeCreateFromList(a(collection));
        j.c.a(this);
        this.H = null;
    }
    
    private static long[] a(final Collection<OsObjectSchemaInfo> collection) {
        final long[] array = new long[collection.size()];
        final Iterator<OsObjectSchemaInfo> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            array[n] = iterator.next().getNativePtr();
            ++n;
        }
        return array;
    }
    
    private static native long nativeCreateFromList(final long[] p0);
    
    private static native long nativeGetFinalizerPtr();
    
    private static native long nativeGetObjectSchemaInfo(final long p0, final String p1);
    
    public OsObjectSchemaInfo b(final String s) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.G, s));
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return OsSchemaInfo.I;
    }
    
    @Override
    public long getNativePtr() {
        return this.G;
    }
}
