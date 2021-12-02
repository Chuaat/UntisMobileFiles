// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSession;
import java.io.OutputStream;
import java.net.SocketException;
import java.io.InputStream;
import java.net.InetAddress;
import java.nio.channels.SocketChannel;
import java.io.IOException;
import java.net.SocketAddress;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;

final class ha extends SSLSocket
{
    private final SSLSocket G;
    
    ha(final ia ia, final SSLSocket g) {
        this.G = g;
    }
    
    @Override
    public final void addHandshakeCompletedListener(final HandshakeCompletedListener handshakeCompletedListener) {
        this.G.addHandshakeCompletedListener(handshakeCompletedListener);
    }
    
    @Override
    public final void bind(final SocketAddress bindpoint) throws IOException {
        this.G.bind(bindpoint);
    }
    
    @Override
    public final void close() throws IOException {
        synchronized (this) {
            this.G.close();
        }
    }
    
    @Override
    public final void connect(final SocketAddress endpoint) throws IOException {
        this.G.connect(endpoint);
    }
    
    @Override
    public final void connect(final SocketAddress endpoint, final int timeout) throws IOException {
        this.G.connect(endpoint, timeout);
    }
    
    @Override
    public final boolean equals(final Object obj) {
        return this.G.equals(obj);
    }
    
    @Override
    public final SocketChannel getChannel() {
        return this.G.getChannel();
    }
    
    @Override
    public final boolean getEnableSessionCreation() {
        return this.G.getEnableSessionCreation();
    }
    
    @Override
    public final String[] getEnabledCipherSuites() {
        return this.G.getEnabledCipherSuites();
    }
    
    @Override
    public final String[] getEnabledProtocols() {
        return this.G.getEnabledProtocols();
    }
    
    @Override
    public final InetAddress getInetAddress() {
        return this.G.getInetAddress();
    }
    
    @Override
    public final InputStream getInputStream() throws IOException {
        return this.G.getInputStream();
    }
    
    @Override
    public final boolean getKeepAlive() throws SocketException {
        return this.G.getKeepAlive();
    }
    
    @Override
    public final InetAddress getLocalAddress() {
        return this.G.getLocalAddress();
    }
    
    @Override
    public final int getLocalPort() {
        return this.G.getLocalPort();
    }
    
    @Override
    public final SocketAddress getLocalSocketAddress() {
        return this.G.getLocalSocketAddress();
    }
    
    @Override
    public final boolean getNeedClientAuth() {
        return this.G.getNeedClientAuth();
    }
    
    @Override
    public final boolean getOOBInline() throws SocketException {
        return this.G.getOOBInline();
    }
    
    @Override
    public final OutputStream getOutputStream() throws IOException {
        return this.G.getOutputStream();
    }
    
    @Override
    public final int getPort() {
        return this.G.getPort();
    }
    
    @Override
    public final int getReceiveBufferSize() throws SocketException {
        synchronized (this) {
            return this.G.getReceiveBufferSize();
        }
    }
    
    @Override
    public final SocketAddress getRemoteSocketAddress() {
        return this.G.getRemoteSocketAddress();
    }
    
    @Override
    public final boolean getReuseAddress() throws SocketException {
        return this.G.getReuseAddress();
    }
    
    @Override
    public final int getSendBufferSize() throws SocketException {
        synchronized (this) {
            return this.G.getSendBufferSize();
        }
    }
    
    @Override
    public final SSLSession getSession() {
        return this.G.getSession();
    }
    
    @Override
    public final int getSoLinger() throws SocketException {
        return this.G.getSoLinger();
    }
    
    @Override
    public final int getSoTimeout() throws SocketException {
        synchronized (this) {
            return this.G.getSoTimeout();
        }
    }
    
    @Override
    public final String[] getSupportedCipherSuites() {
        return this.G.getSupportedCipherSuites();
    }
    
    @Override
    public final String[] getSupportedProtocols() {
        return this.G.getSupportedProtocols();
    }
    
    @Override
    public final boolean getTcpNoDelay() throws SocketException {
        return this.G.getTcpNoDelay();
    }
    
    @Override
    public final int getTrafficClass() throws SocketException {
        return this.G.getTrafficClass();
    }
    
    @Override
    public final boolean getUseClientMode() {
        return this.G.getUseClientMode();
    }
    
    @Override
    public final boolean getWantClientAuth() {
        return this.G.getWantClientAuth();
    }
    
    @Override
    public final boolean isBound() {
        return this.G.isBound();
    }
    
    @Override
    public final boolean isClosed() {
        return this.G.isClosed();
    }
    
    @Override
    public final boolean isConnected() {
        return this.G.isConnected();
    }
    
    @Override
    public final boolean isInputShutdown() {
        return this.G.isInputShutdown();
    }
    
    @Override
    public final boolean isOutputShutdown() {
        return this.G.isOutputShutdown();
    }
    
    @Override
    public final void removeHandshakeCompletedListener(final HandshakeCompletedListener handshakeCompletedListener) {
        this.G.removeHandshakeCompletedListener(handshakeCompletedListener);
    }
    
    @Override
    public final void sendUrgentData(final int data) throws IOException {
        this.G.sendUrgentData(data);
    }
    
    @Override
    public final void setEnableSessionCreation(final boolean enableSessionCreation) {
        this.G.setEnableSessionCreation(enableSessionCreation);
    }
    
    @Override
    public final void setEnabledCipherSuites(final String[] enabledCipherSuites) {
        this.G.setEnabledCipherSuites(enabledCipherSuites);
    }
    
    @Override
    public final void setEnabledProtocols(final String[] a) {
        String[] enabledProtocols = a;
        if (a != null) {
            enabledProtocols = a;
            if (Arrays.asList(a).contains("SSLv3")) {
                final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(this.G.getEnabledProtocols()));
                if (list.size() > 1) {
                    list.remove("SSLv3");
                }
                enabledProtocols = (String[])list.toArray(new String[list.size()]);
            }
        }
        this.G.setEnabledProtocols(enabledProtocols);
    }
    
    @Override
    public final void setKeepAlive(final boolean keepAlive) throws SocketException {
        this.G.setKeepAlive(keepAlive);
    }
    
    @Override
    public final void setNeedClientAuth(final boolean needClientAuth) {
        this.G.setNeedClientAuth(needClientAuth);
    }
    
    @Override
    public final void setOOBInline(final boolean oobInline) throws SocketException {
        this.G.setOOBInline(oobInline);
    }
    
    @Override
    public final void setPerformancePreferences(final int connectionTime, final int latency, final int bandwidth) {
        this.G.setPerformancePreferences(connectionTime, latency, bandwidth);
    }
    
    @Override
    public final void setReceiveBufferSize(final int receiveBufferSize) throws SocketException {
        synchronized (this) {
            this.G.setReceiveBufferSize(receiveBufferSize);
        }
    }
    
    @Override
    public final void setReuseAddress(final boolean reuseAddress) throws SocketException {
        this.G.setReuseAddress(reuseAddress);
    }
    
    @Override
    public final void setSendBufferSize(final int sendBufferSize) throws SocketException {
        synchronized (this) {
            this.G.setSendBufferSize(sendBufferSize);
        }
    }
    
    @Override
    public final void setSoLinger(final boolean on, final int linger) throws SocketException {
        this.G.setSoLinger(on, linger);
    }
    
    @Override
    public final void setSoTimeout(final int soTimeout) throws SocketException {
        synchronized (this) {
            this.G.setSoTimeout(soTimeout);
        }
    }
    
    @Override
    public final void setTcpNoDelay(final boolean tcpNoDelay) throws SocketException {
        this.G.setTcpNoDelay(tcpNoDelay);
    }
    
    @Override
    public final void setTrafficClass(final int trafficClass) throws SocketException {
        this.G.setTrafficClass(trafficClass);
    }
    
    @Override
    public final void setUseClientMode(final boolean useClientMode) {
        this.G.setUseClientMode(useClientMode);
    }
    
    @Override
    public final void setWantClientAuth(final boolean wantClientAuth) {
        this.G.setWantClientAuth(wantClientAuth);
    }
    
    @Override
    public final void shutdownInput() throws IOException {
        this.G.shutdownInput();
    }
    
    @Override
    public final void shutdownOutput() throws IOException {
        this.G.shutdownOutput();
    }
    
    @Override
    public final void startHandshake() throws IOException {
        this.G.startHandshake();
    }
    
    @Override
    public final String toString() {
        return this.G.toString();
    }
}
