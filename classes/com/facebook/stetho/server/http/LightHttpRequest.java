// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server.http;

import android.net.Uri;

public class LightHttpRequest extends LightHttpMessage
{
    public String method;
    public String protocol;
    public Uri uri;
    
    @Override
    public void reset() {
        super.reset();
        this.method = null;
        this.uri = null;
        this.protocol = null;
    }
}
