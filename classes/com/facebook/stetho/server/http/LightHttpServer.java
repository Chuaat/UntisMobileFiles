// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server.http;

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import com.facebook.stetho.server.LeakyBufferedInputStream;
import java.io.OutputStream;
import androidx.annotation.k0;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import com.facebook.stetho.server.SocketLike;

public class LightHttpServer
{
    private static final String TAG = "LightHttpServer";
    private final HandlerRegistry mHandlerRegistry;
    
    public LightHttpServer(final HandlerRegistry mHandlerRegistry) {
        this.mHandlerRegistry = mHandlerRegistry;
    }
    
    private boolean dispatchToHandler(SocketLike string, final LightHttpRequest lightHttpRequest, final LightHttpResponse lightHttpResponse) throws IOException {
        final HttpHandler lookup = this.mHandlerRegistry.lookup(lightHttpRequest.uri.getPath());
        if (lookup == null) {
            lightHttpResponse.code = 404;
            lightHttpResponse.reasonPhrase = "Not found";
            string = (SocketLike)"No handler found\n";
        }
        else {
            try {
                return lookup.handleRequest(string, lightHttpRequest, lightHttpResponse);
            }
            catch (RuntimeException ex) {
                lightHttpResponse.code = 500;
                lightHttpResponse.reasonPhrase = "Internal Server Error";
                final StringWriter out = new StringWriter();
                string = (SocketLike)new PrintWriter(out);
                try {
                    ex.printStackTrace((PrintWriter)string);
                    ((PrintWriter)string).close();
                    string = (SocketLike)out.toString();
                }
                finally {
                    ((PrintWriter)string).close();
                }
            }
        }
        lightHttpResponse.body = LightHttpBody.create((String)string, "text/plain");
        return true;
    }
    
    private static void readHeaders(final LightHttpMessage lightHttpMessage, final HttpMessageReader httpMessageReader) throws IOException {
        while (true) {
            final String line = httpMessageReader.readLine();
            if (line == null) {
                throw new EOFException();
            }
            if ("".equals(line)) {
                return;
            }
            final String[] split = line.split(": ", 2);
            if (split.length != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Malformed header: ");
                sb.append(line);
                throw new IOException(sb.toString());
            }
            final String e = split[0];
            final String e2 = split[1];
            lightHttpMessage.headerNames.add(e);
            lightHttpMessage.headerValues.add(e2);
        }
    }
    
    @k0
    private static LightHttpRequest readRequestMessage(final LightHttpRequest lightHttpRequest, final HttpMessageReader httpMessageReader) throws IOException {
        lightHttpRequest.reset();
        final String line = httpMessageReader.readLine();
        if (line == null) {
            return null;
        }
        final String[] split = line.split(" ", 3);
        if (split.length == 3) {
            lightHttpRequest.method = split[0];
            lightHttpRequest.uri = Uri.parse(split[1]);
            lightHttpRequest.protocol = split[2];
            readHeaders(lightHttpRequest, httpMessageReader);
            return lightHttpRequest;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid request line: ");
        sb.append(line);
        throw new IOException(sb.toString());
    }
    
    private static void writeFullResponse(final LightHttpResponse lightHttpResponse, final HttpMessageWriter httpMessageWriter, final OutputStream outputStream) throws IOException {
        lightHttpResponse.prepare();
        writeResponseMessage(lightHttpResponse, httpMessageWriter);
        final LightHttpBody body = lightHttpResponse.body;
        if (body != null) {
            body.writeTo(outputStream);
        }
    }
    
    public static void writeResponseMessage(final LightHttpResponse lightHttpResponse, final HttpMessageWriter httpMessageWriter) throws IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 ");
        sb.append(lightHttpResponse.code);
        sb.append(" ");
        sb.append(lightHttpResponse.reasonPhrase);
        httpMessageWriter.writeLine(sb.toString());
        for (int size = lightHttpResponse.headerNames.size(), i = 0; i < size; ++i) {
            final String str = lightHttpResponse.headerNames.get(i);
            final String str2 = lightHttpResponse.headerValues.get(i);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(": ");
            sb2.append(str2);
            httpMessageWriter.writeLine(sb2.toString());
        }
        httpMessageWriter.writeLine();
        httpMessageWriter.flush();
    }
    
    public void serve(final SocketLike socketLike) throws IOException {
        final LeakyBufferedInputStream leakyBufferedInputStream = new LeakyBufferedInputStream(socketLike.getInput(), 1024);
        final OutputStream output = socketLike.getOutput();
        final HttpMessageReader httpMessageReader = new HttpMessageReader(leakyBufferedInputStream);
        final HttpMessageWriter httpMessageWriter = new HttpMessageWriter(new BufferedOutputStream(output));
        final SocketLike socketLike2 = new SocketLike(socketLike, leakyBufferedInputStream);
        final LightHttpRequest lightHttpRequest = new LightHttpRequest();
        final LightHttpResponse lightHttpResponse = new LightHttpResponse();
        while (true) {
            final LightHttpRequest requestMessage = readRequestMessage(lightHttpRequest, httpMessageReader);
            if (requestMessage == null) {
                break;
            }
            lightHttpResponse.reset();
            if (!this.dispatchToHandler(socketLike2, requestMessage, lightHttpResponse)) {
                break;
            }
            writeFullResponse(lightHttpResponse, httpMessageWriter, output);
        }
    }
    
    private static class HttpMessageReader
    {
        private final StringBuilder mBuffer;
        private final BufferedInputStream mIn;
        private final NewLineDetector mNewLineDetector;
        
        public HttpMessageReader(final BufferedInputStream mIn) {
            this.mBuffer = new StringBuilder();
            this.mNewLineDetector = new NewLineDetector();
            this.mIn = mIn;
        }
        
        @k0
        public String readLine() throws IOException {
            while (true) {
                final int read = this.mIn.read();
                if (read < 0) {
                    return null;
                }
                final char c = (char)read;
                this.mNewLineDetector.accept(c);
                final int state = this.mNewLineDetector.state();
                if (state != 1) {
                    if (state != 3) {
                        continue;
                    }
                    final String string = this.mBuffer.toString();
                    this.mBuffer.setLength(0);
                    return string;
                }
                else {
                    this.mBuffer.append(c);
                }
            }
        }
        
        private static class NewLineDetector
        {
            private static final int STATE_ON_CR = 2;
            private static final int STATE_ON_CRLF = 3;
            private static final int STATE_ON_OTHER = 1;
            private int state;
            
            private NewLineDetector() {
                this.state = 1;
            }
            
            public void accept(final char c) {
                final int state = this.state;
                Label_0093: {
                    if (state != 1) {
                        if (state != 2) {
                            if (state != 3) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Unknown state: ");
                                sb.append(this.state);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (c == '\r') {
                                break Label_0093;
                            }
                        }
                        else if (c == '\n') {
                            this.state = 3;
                            return;
                        }
                        this.state = 1;
                        return;
                    }
                    if (c != '\r') {
                        return;
                    }
                }
                this.state = 2;
            }
            
            public int state() {
                return this.state;
            }
        }
    }
    
    public static class HttpMessageWriter
    {
        private static final byte[] CRLF;
        private final BufferedOutputStream mOut;
        
        static {
            CRLF = "\r\n".getBytes();
        }
        
        public HttpMessageWriter(final BufferedOutputStream mOut) {
            this.mOut = mOut;
        }
        
        public void flush() throws IOException {
            this.mOut.flush();
        }
        
        public void writeLine() throws IOException {
            this.mOut.write(HttpMessageWriter.CRLF);
        }
        
        public void writeLine(final String s) throws IOException {
            for (int length = s.length(), i = 0; i < length; ++i) {
                this.mOut.write(s.charAt(i));
            }
            this.mOut.write(HttpMessageWriter.CRLF);
        }
    }
}
