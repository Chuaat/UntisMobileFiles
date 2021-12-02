// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.network;

import java.io.IOException;
import java.util.zip.InflaterOutputStream;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.protocol.module.Console;
import c6.h;
import java.io.OutputStream;
import java.io.InputStream;

public class DecompressionHelper
{
    static final String DEFLATE_ENCODING = "deflate";
    static final String GZIP_ENCODING = "gzip";
    
    public static InputStream teeInputWithDecompression(final NetworkPeerManager networkPeerManager, final String str, final InputStream inputStream, OutputStream create, @h final String str2, final ResponseHandler responseHandler) throws IOException {
        if (str2 != null) {
            final boolean equals = "gzip".equals(str2);
            final boolean equals2 = "deflate".equals(str2);
            if (!equals && !equals2) {
                final Console.MessageLevel warning = Console.MessageLevel.WARNING;
                final Console.MessageSource network = Console.MessageSource.NETWORK;
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported Content-Encoding in response for request #");
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                CLog.writeToConsole(networkPeerManager, warning, network, sb.toString());
            }
            else {
                final CountingOutputStream out = new CountingOutputStream(create);
                if (equals) {
                    create = GunzippingOutputStream.create(out);
                    final CountingOutputStream countingOutputStream = out;
                    return new ResponseHandlingInputStream(inputStream, str, create, countingOutputStream, networkPeerManager, responseHandler);
                }
                CountingOutputStream countingOutputStream = out;
                if (equals2) {
                    create = new InflaterOutputStream(out);
                    countingOutputStream = out;
                    return new ResponseHandlingInputStream(inputStream, str, create, countingOutputStream, networkPeerManager, responseHandler);
                }
                return new ResponseHandlingInputStream(inputStream, str, create, countingOutputStream, networkPeerManager, responseHandler);
            }
        }
        CountingOutputStream countingOutputStream = null;
        return new ResponseHandlingInputStream(inputStream, str, create, countingOutputStream, networkPeerManager, responseHandler);
    }
}
