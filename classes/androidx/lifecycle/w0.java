// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.g0;
import java.util.Iterator;
import java.io.IOException;
import java.io.Closeable;
import java.util.HashMap;
import androidx.annotation.k0;
import java.util.Map;

public abstract class w0
{
    @k0
    private final Map<String, Object> mBagOfTags;
    private volatile boolean mCleared;
    
    public w0() {
        this.mBagOfTags = new HashMap<String, Object>();
        this.mCleared = false;
    }
    
    private static void closeWithRuntimeException(final Object o) {
        if (o instanceof Closeable) {
            try {
                ((Closeable)o).close();
            }
            catch (IOException cause) {
                throw new RuntimeException(cause);
            }
        }
    }
    
    @g0
    final void clear() {
        this.mCleared = true;
        final Map<String, Object> mBagOfTags = this.mBagOfTags;
        if (mBagOfTags != null) {
            synchronized (mBagOfTags) {
                final Iterator<Object> iterator = this.mBagOfTags.values().iterator();
                while (iterator.hasNext()) {
                    closeWithRuntimeException(iterator.next());
                }
            }
        }
        this.onCleared();
    }
    
     <T> T getTag(final String s) {
        final Map<String, Object> mBagOfTags = this.mBagOfTags;
        if (mBagOfTags == null) {
            return null;
        }
        synchronized (mBagOfTags) {
            return (T)this.mBagOfTags.get(s);
        }
    }
    
    protected void onCleared() {
    }
    
     <T> T setTagIfAbsent(final String s, final T t) {
        synchronized (this.mBagOfTags) {
            final Object value = this.mBagOfTags.get(s);
            if (value == null) {
                this.mBagOfTags.put(s, t);
            }
            // monitorexit(this.mBagOfTags)
            Object o;
            if (value == null) {
                o = t;
            }
            else {
                o = value;
            }
            if (this.mCleared) {
                closeWithRuntimeException(o);
            }
            return (T)o;
        }
    }
}
