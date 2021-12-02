// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.dumpapp;

import java.io.PrintStream;
import java.util.List;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import com.facebook.stetho.server.http.LightHttpBody;
import com.facebook.stetho.server.http.LightHttpResponse;
import com.facebook.stetho.server.http.LightHttpRequest;
import java.io.IOException;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.http.HttpHandler;
import com.facebook.stetho.server.http.PathMatcher;
import com.facebook.stetho.server.http.ExactPathMatcher;
import com.facebook.stetho.server.http.HandlerRegistry;
import com.facebook.stetho.server.http.LightHttpServer;
import com.facebook.stetho.server.SocketLikeHandler;

@Deprecated
public class DumpappHttpSocketLikeHandler implements SocketLikeHandler
{
    private final LightHttpServer mServer;
    
    public DumpappHttpSocketLikeHandler(final Dumper dumper) {
        final HandlerRegistry handlerRegistry = new HandlerRegistry();
        handlerRegistry.register(new ExactPathMatcher("/dumpapp"), new DumpappLegacyHttpHandler(dumper));
        this.mServer = new LightHttpServer(handlerRegistry);
    }
    
    @Override
    public void onAccepted(final SocketLike socketLike) throws IOException {
        this.mServer.serve(socketLike);
    }
    
    private static class DumpappLegacyHttpHandler implements HttpHandler
    {
        private static final String CONTENT_TYPE = "application/octet-stream";
        private static final String QUERY_PARAM_ARGV = "argv";
        private static final String RESPONSE_HEADER_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
        private final Dumper mDumper;
        
        public DumpappLegacyHttpHandler(final Dumper mDumper) {
            this.mDumper = mDumper;
        }
        
        @Override
        public boolean handleRequest(final SocketLike socketLike, final LightHttpRequest lightHttpRequest, final LightHttpResponse lightHttpResponse) throws IOException {
            final boolean equals = "POST".equals(lightHttpRequest.method);
            final boolean b = !equals && "GET".equals(lightHttpRequest.method);
            LightHttpBody body;
            if (!b && !equals) {
                lightHttpResponse.code = 501;
                lightHttpResponse.reasonPhrase = "Not implemented";
                final StringBuilder sb = new StringBuilder();
                sb.append(lightHttpRequest.method);
                sb.append(" not implemented");
                body = LightHttpBody.create(sb.toString(), "text/plain");
            }
            else {
                final List queryParameters = lightHttpRequest.uri.getQueryParameters("argv");
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final Framer framer = new Framer(new ByteArrayInputStream(new byte[0]), byteArrayOutputStream);
                String str;
                if (equals) {
                    str = "ERROR";
                }
                else {
                    str = "WARNING";
                }
                final PrintStream stderr = framer.getStderr();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("*** ");
                sb2.append(str);
                sb2.append(": Using legacy HTTP protocol; update dumpapp script! ***");
                stderr.println(sb2.toString());
                if (b) {
                    DumpappSocketLikeHandler.dump(this.mDumper, framer, queryParameters.toArray(new String[queryParameters.size()]));
                }
                else {
                    framer.writeExitCode(1);
                }
                lightHttpResponse.code = 200;
                lightHttpResponse.reasonPhrase = "OK";
                lightHttpResponse.addHeader("Access-Control-Allow-Origin", "*");
                body = LightHttpBody.create(byteArrayOutputStream.toByteArray(), "application/octet-stream");
            }
            lightHttpResponse.body = body;
            return true;
        }
    }
}
