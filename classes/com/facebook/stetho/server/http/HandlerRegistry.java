// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server.http;

import androidx.annotation.k0;
import java.util.ArrayList;

public class HandlerRegistry
{
    private final ArrayList<HttpHandler> mHttpHandlers;
    private final ArrayList<PathMatcher> mPathMatchers;
    
    public HandlerRegistry() {
        this.mPathMatchers = new ArrayList<PathMatcher>();
        this.mHttpHandlers = new ArrayList<HttpHandler>();
    }
    
    @k0
    public HttpHandler lookup(final String s) {
        // monitorenter(this)
        int i = 0;
        try {
            while (i < this.mPathMatchers.size()) {
                if (this.mPathMatchers.get(i).match(s)) {
                    return this.mHttpHandlers.get(i);
                }
                ++i;
            }
            return null;
        }
        finally {
        }
        // monitorexit(this)
    }
    
    public void register(final PathMatcher e, final HttpHandler e2) {
        synchronized (this) {
            this.mPathMatchers.add(e);
            this.mHttpHandlers.add(e2);
        }
    }
    
    public boolean unregister(final PathMatcher o, final HttpHandler httpHandler) {
        synchronized (this) {
            final int index = this.mPathMatchers.indexOf(o);
            boolean b;
            if (index >= 0 && httpHandler == this.mHttpHandlers.get(index)) {
                this.mPathMatchers.remove(index);
                this.mHttpHandlers.remove(index);
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
    }
}
