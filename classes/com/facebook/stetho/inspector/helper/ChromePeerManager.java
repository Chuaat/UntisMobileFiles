// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.common.Util;
import java.nio.channels.NotYetConnectedException;
import com.facebook.stetho.common.LogRedirector;
import c6.h;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import java.util.HashMap;
import com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.Map;
import d6.a;

public class ChromePeerManager
{
    private static final String TAG = "ChromePeerManager";
    @a("this")
    private PeerRegistrationListener mListener;
    @a("this")
    private final Map<JsonRpcPeer, DisconnectReceiver> mReceivingPeers;
    @a("this")
    private JsonRpcPeer[] mReceivingPeersSnapshot;
    
    public ChromePeerManager() {
        this.mReceivingPeers = new HashMap<JsonRpcPeer, DisconnectReceiver>();
    }
    
    private JsonRpcPeer[] getReceivingPeersSnapshot() {
        synchronized (this) {
            if (this.mReceivingPeersSnapshot == null) {
                this.mReceivingPeersSnapshot = this.mReceivingPeers.keySet().toArray(new JsonRpcPeer[this.mReceivingPeers.size()]);
            }
            return this.mReceivingPeersSnapshot;
        }
    }
    
    private void sendMessageToPeers(final String s, final Object o, @h final PendingRequestCallback pendingRequestCallback) {
        for (final JsonRpcPeer jsonRpcPeer : this.getReceivingPeersSnapshot()) {
            try {
                jsonRpcPeer.invokeMethod(s, o, pendingRequestCallback);
            }
            catch (NotYetConnectedException ex) {
                LogRedirector.e("ChromePeerManager", "Error delivering data to Chrome", ex);
            }
        }
    }
    
    public boolean addPeer(final JsonRpcPeer jsonRpcPeer) {
        synchronized (this) {
            boolean b;
            if (this.mReceivingPeers.containsKey(jsonRpcPeer)) {
                b = false;
            }
            else {
                final UnregisterOnDisconnect unregisterOnDisconnect = new UnregisterOnDisconnect(jsonRpcPeer);
                jsonRpcPeer.registerDisconnectReceiver(unregisterOnDisconnect);
                this.mReceivingPeers.put(jsonRpcPeer, unregisterOnDisconnect);
                this.mReceivingPeersSnapshot = null;
                final PeerRegistrationListener mListener = this.mListener;
                if (mListener != null) {
                    mListener.onPeerRegistered(jsonRpcPeer);
                }
                b = true;
            }
            return b;
        }
    }
    
    public boolean hasRegisteredPeers() {
        synchronized (this) {
            return this.mReceivingPeers.isEmpty() ^ true;
        }
    }
    
    public void invokeMethodOnPeers(final String s, final Object o, final PendingRequestCallback pendingRequestCallback) {
        Util.throwIfNull(pendingRequestCallback);
        this.sendMessageToPeers(s, o, pendingRequestCallback);
    }
    
    public void removePeer(final JsonRpcPeer jsonRpcPeer) {
        synchronized (this) {
            if (this.mReceivingPeers.remove(jsonRpcPeer) != null) {
                this.mReceivingPeersSnapshot = null;
                final PeerRegistrationListener mListener = this.mListener;
                if (mListener != null) {
                    mListener.onPeerUnregistered(jsonRpcPeer);
                }
            }
        }
    }
    
    public void sendNotificationToPeers(final String s, final Object o) {
        this.sendMessageToPeers(s, o, null);
    }
    
    public void setListener(final PeerRegistrationListener mListener) {
        synchronized (this) {
            this.mListener = mListener;
        }
    }
    
    private class UnregisterOnDisconnect implements DisconnectReceiver
    {
        private final JsonRpcPeer mPeer;
        
        public UnregisterOnDisconnect(final JsonRpcPeer mPeer) {
            this.mPeer = mPeer;
        }
        
        @Override
        public void onDisconnect() {
            ChromePeerManager.this.removePeer(this.mPeer);
        }
    }
}
