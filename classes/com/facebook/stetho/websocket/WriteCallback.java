// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.websocket;

import java.io.IOException;

interface WriteCallback
{
    void onFailure(final IOException p0);
    
    void onSuccess();
}
