// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.PhantomReference;

final class NativeObjectReference extends PhantomReference<k>
{
    private static b f;
    private final long a;
    private final long b;
    private final j c;
    private NativeObjectReference d;
    private NativeObjectReference e;
    
    static {
        NativeObjectReference.f = new b();
    }
    
    NativeObjectReference(final j c, final k referent, final ReferenceQueue<? super k> q) {
        super(referent, q);
        this.a = referent.getNativePtr();
        this.b = referent.getNativeFinalizerPtr();
        this.c = c;
        NativeObjectReference.f.a(this);
    }
    
    private static native void nativeCleanUp(final long p0, final long p1);
    
    void e() {
        synchronized (this.c) {
            nativeCleanUp(this.b, this.a);
            // monitorexit(this.c)
            NativeObjectReference.f.b(this);
        }
    }
    
    private static class b
    {
        NativeObjectReference a;
        
        void a(final NativeObjectReference a) {
            synchronized (this) {
                a.d = null;
                a.e = this.a;
                final NativeObjectReference a2 = this.a;
                if (a2 != null) {
                    a2.d = a;
                }
                this.a = a;
            }
        }
        
        void b(final NativeObjectReference nativeObjectReference) {
            synchronized (this) {
                final NativeObjectReference c = nativeObjectReference.e;
                final NativeObjectReference a = nativeObjectReference.d;
                nativeObjectReference.e = null;
                nativeObjectReference.d = null;
                if (a != null) {
                    a.e = c;
                }
                else {
                    this.a = c;
                }
                if (c != null) {
                    c.d = a;
                }
            }
        }
    }
}
