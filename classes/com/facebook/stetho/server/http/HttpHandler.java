// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server.http;

import java.io.IOException;
import com.facebook.stetho.server.SocketLike;

public interface HttpHandler
{
    boolean handleRequest(final SocketLike p0, final LightHttpRequest p1, final LightHttpResponse p2) throws IOException;
}
