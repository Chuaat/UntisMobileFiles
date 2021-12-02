// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.okhttp3;

import okio.p0;
import c6.h;
import okio.n;
import okhttp3.f0;
import okhttp3.y;
import okio.d0;
import okio.o;
import java.io.InputStream;
import okhttp3.j;
import okhttp3.e0;
import java.io.IOException;
import okhttp3.h0;
import com.facebook.stetho.inspector.network.ResponseHandler;
import com.facebook.stetho.inspector.network.DefaultResponseHandler;
import com.facebook.stetho.inspector.network.RequestBodyHelper;
import okhttp3.g0;
import okhttp3.x$a;
import com.facebook.stetho.inspector.network.NetworkEventReporterImpl;
import com.facebook.stetho.inspector.network.NetworkEventReporter;
import okhttp3.x;

public class StethoInterceptor implements x
{
    private final NetworkEventReporter mEventReporter;
    
    public StethoInterceptor() {
        this.mEventReporter = NetworkEventReporterImpl.get();
    }
    
    public g0 intercept(final x$a x$a) throws IOException {
        final String nextRequestId = this.mEventReporter.nextRequestId();
        final e0 k = x$a.k();
        final boolean enabled = this.mEventReporter.isEnabled();
        final String s = null;
        RequestBodyHelper requestBodyHelper;
        if (enabled) {
            requestBodyHelper = new RequestBodyHelper(this.mEventReporter, nextRequestId);
            this.mEventReporter.requestWillBeSent((NetworkEventReporter.InspectorRequest)new OkHttpInspectorRequest(nextRequestId, k, requestBodyHelper));
        }
        else {
            requestBodyHelper = null;
        }
        try {
            g0 g2;
            final g0 g0 = g2 = x$a.e(k);
            if (this.mEventReporter.isEnabled()) {
                if (requestBodyHelper != null && requestBodyHelper.hasBody()) {
                    requestBodyHelper.reportDataSent();
                }
                final j f = x$a.f();
                if (f == null) {
                    throw new IllegalStateException("No connection associated with this request; did you use addInterceptor instead of addNetworkInterceptor?");
                }
                this.mEventReporter.responseHeadersReceived((NetworkEventReporter.InspectorResponse)new OkHttpInspectorResponse(nextRequestId, k, g0, f));
                final h0 r = g0.r();
                Object contentType;
                InputStream byteStream;
                if (r != null) {
                    contentType = r.contentType();
                    byteStream = r.byteStream();
                }
                else {
                    contentType = (byteStream = null);
                }
                final NetworkEventReporter mEventReporter = this.mEventReporter;
                String string = s;
                if (contentType != null) {
                    string = ((y)contentType).toString();
                }
                final InputStream interpretResponseStream = mEventReporter.interpretResponseStream(nextRequestId, string, g0.D("Content-Encoding"), byteStream, new DefaultResponseHandler(this.mEventReporter, nextRequestId));
                g2 = g0;
                if (interpretResponseStream != null) {
                    g2 = g0.Q().b((h0)new ForwardingResponseBody(r, interpretResponseStream)).c();
                }
            }
            return g2;
        }
        catch (IOException ex) {
            if (this.mEventReporter.isEnabled()) {
                this.mEventReporter.httpExchangeFailed(nextRequestId, ex.toString());
            }
            throw ex;
        }
    }
    
    private static class ForwardingResponseBody extends h0
    {
        private final h0 mBody;
        private final o mInterceptedSource;
        
        public ForwardingResponseBody(final h0 mBody, final InputStream inputStream) {
            this.mBody = mBody;
            this.mInterceptedSource = d0.d(d0.s(inputStream));
        }
        
        public long contentLength() {
            return this.mBody.contentLength();
        }
        
        public y contentType() {
            return this.mBody.contentType();
        }
        
        public o source() {
            return this.mInterceptedSource;
        }
    }
    
    private static class OkHttpInspectorRequest implements InspectorRequest
    {
        private final e0 mRequest;
        private RequestBodyHelper mRequestBodyHelper;
        private final String mRequestId;
        
        public OkHttpInspectorRequest(final String mRequestId, final e0 mRequest, final RequestBodyHelper mRequestBodyHelper) {
            this.mRequestId = mRequestId;
            this.mRequest = mRequest;
            this.mRequestBodyHelper = mRequestBodyHelper;
        }
        
        @h
        @Override
        public byte[] body() throws IOException {
            final f0 f = this.mRequest.f();
            if (f == null) {
                return null;
            }
            final n c = d0.c(d0.n(this.mRequestBodyHelper.createBodySink(this.firstHeaderValue("Content-Encoding"))));
            try {
                f.r(c);
                ((p0)c).close();
                return this.mRequestBodyHelper.getDisplayBody();
            }
            finally {
                ((p0)c).close();
            }
        }
        
        @h
        @Override
        public String firstHeaderValue(final String s) {
            return this.mRequest.i(s);
        }
        
        @Override
        public String friendlyName() {
            return null;
        }
        
        @h
        @Override
        public Integer friendlyNameExtra() {
            return null;
        }
        
        @Override
        public int headerCount() {
            return this.mRequest.k().size();
        }
        
        @Override
        public String headerName(final int n) {
            return this.mRequest.k().n(n);
        }
        
        @Override
        public String headerValue(final int n) {
            return this.mRequest.k().v(n);
        }
        
        @Override
        public String id() {
            return this.mRequestId;
        }
        
        @Override
        public String method() {
            return this.mRequest.m();
        }
        
        @Override
        public String url() {
            return this.mRequest.q().toString();
        }
    }
    
    private static class OkHttpInspectorResponse implements InspectorResponse
    {
        @h
        private final j mConnection;
        private final e0 mRequest;
        private final String mRequestId;
        private final g0 mResponse;
        
        public OkHttpInspectorResponse(final String mRequestId, final e0 mRequest, final g0 mResponse, @h final j mConnection) {
            this.mRequestId = mRequestId;
            this.mRequest = mRequest;
            this.mResponse = mResponse;
            this.mConnection = mConnection;
        }
        
        @Override
        public int connectionId() {
            final j mConnection = this.mConnection;
            int hashCode;
            if (mConnection == null) {
                hashCode = 0;
            }
            else {
                hashCode = mConnection.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public boolean connectionReused() {
            return false;
        }
        
        @h
        @Override
        public String firstHeaderValue(final String s) {
            return this.mResponse.D(s);
        }
        
        @Override
        public boolean fromDiskCache() {
            return this.mResponse.t() != null;
        }
        
        @Override
        public int headerCount() {
            return this.mResponse.J().size();
        }
        
        @Override
        public String headerName(final int n) {
            return this.mResponse.J().n(n);
        }
        
        @Override
        public String headerValue(final int n) {
            return this.mResponse.J().v(n);
        }
        
        @Override
        public String reasonPhrase() {
            return this.mResponse.M();
        }
        
        @Override
        public String requestId() {
            return this.mRequestId;
        }
        
        @Override
        public int statusCode() {
            return this.mResponse.x();
        }
        
        @Override
        public String url() {
            return this.mRequest.q().toString();
        }
    }
}
