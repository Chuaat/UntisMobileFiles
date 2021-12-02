// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements;

import c6.h;
import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.common.Util;
import java.util.HashMap;
import java.util.Map;

public abstract class Descriptor<E> implements NodeDescriptor<E>
{
    private Host mHost;
    
    protected Descriptor() {
    }
    
    protected static Map<String, String> parseSetAttributesAsTextArg(final String s) {
        final StringBuilder sb = new StringBuilder();
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final int length = s.length();
        String string = "";
        String string2 = "";
        int i = 0;
        int n = 0;
        while (i < length) {
            final char char1 = s.charAt(i);
            if (char1 == '=') {
                string = sb.toString();
                sb.setLength(0);
            }
            else if (char1 == '\"') {
                if (n != 0) {
                    string2 = sb.toString();
                    sb.setLength(0);
                }
                n ^= 0x1;
            }
            else if (char1 == ' ' && n == 0) {
                hashMap.put(string, string2);
            }
            else {
                sb.append(char1);
            }
            ++i;
        }
        if (!string.isEmpty() && !string2.isEmpty()) {
            hashMap.put(string, string2);
        }
        return hashMap;
    }
    
    @Override
    public final boolean checkThreadAccess() {
        return this.getHost().checkThreadAccess();
    }
    
    protected final Host getHost() {
        return this.mHost;
    }
    
    final void initialize(final Host mHost) {
        Util.throwIfNull(mHost);
        Util.throwIfNotNull(this.mHost);
        this.mHost = mHost;
    }
    
    final boolean isInitialized() {
        return this.mHost != null;
    }
    
    @Override
    public final <V> V postAndWait(final UncheckedCallable<V> uncheckedCallable) {
        return this.getHost().postAndWait(uncheckedCallable);
    }
    
    @Override
    public final void postAndWait(final Runnable runnable) {
        this.getHost().postAndWait(runnable);
    }
    
    @Override
    public final void postDelayed(final Runnable runnable, final long n) {
        this.getHost().postDelayed(runnable, n);
    }
    
    @Override
    public final void removeCallbacks(final Runnable runnable) {
        this.getHost().removeCallbacks(runnable);
    }
    
    @Override
    public final void verifyThreadAccess() {
        this.getHost().verifyThreadAccess();
    }
    
    public interface Host extends ThreadBound
    {
        @h
        Descriptor<?> getDescriptor(@h final Object p0);
        
        void onAttributeModified(final Object p0, final String p1, final String p2);
        
        void onAttributeRemoved(final Object p0, final String p1);
    }
}
