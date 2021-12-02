// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.net.InetAddress;
import java.io.IOException;
import javax.net.ssl.SSLSocket;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

final class ia extends SSLSocketFactory
{
    private final SSLSocketFactory a;
    
    ia() {
        final SSLSocketFactory defaultSSLSocketFactory = HttpsURLConnection.getDefaultSSLSocketFactory();
        this.a = defaultSSLSocketFactory;
    }
    
    ia(final SSLSocketFactory a) {
        this.a = a;
    }
    
    @Override
    public final Socket createSocket() throws IOException {
        return new ha(this, (SSLSocket)this.a.createSocket());
    }
    
    @Override
    public final Socket createSocket(final String s, final int n) throws IOException {
        return new ha(this, (SSLSocket)this.a.createSocket(s, n));
    }
    
    @Override
    public final Socket createSocket(final String s, final int n, final InetAddress inetAddress, final int n2) throws IOException {
        return new ha(this, (SSLSocket)this.a.createSocket(s, n, inetAddress, n2));
    }
    
    @Override
    public final Socket createSocket(final InetAddress inetAddress, final int n) throws IOException {
        return new ha(this, (SSLSocket)this.a.createSocket(inetAddress, n));
    }
    
    @Override
    public final Socket createSocket(final InetAddress inetAddress, final int n, final InetAddress inetAddress2, final int n2) throws IOException {
        return new ha(this, (SSLSocket)this.a.createSocket(inetAddress, n, inetAddress2, n2));
    }
    
    @Override
    public final Socket createSocket(final Socket socket, final String s, final int n, final boolean b) throws IOException {
        return new ha(this, (SSLSocket)this.a.createSocket(socket, s, n, b));
    }
    
    @Override
    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }
    
    @Override
    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }
}
