// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class PeersRegisteredListener implements PeerRegistrationListener
{
    private AtomicInteger mPeers;
    
    public PeersRegisteredListener() {
        this.mPeers = new AtomicInteger(0);
    }
    
    protected abstract void onFirstPeerRegistered();
    
    protected abstract void onLastPeerUnregistered();
    
    protected void onPeerAdded(final JsonRpcPeer jsonRpcPeer) {
    }
    
    @Override
    public final void onPeerRegistered(final JsonRpcPeer jsonRpcPeer) {
        if (this.mPeers.incrementAndGet() == 1) {
            this.onFirstPeerRegistered();
        }
        this.onPeerAdded(jsonRpcPeer);
    }
    
    protected void onPeerRemoved(final JsonRpcPeer jsonRpcPeer) {
    }
    
    @Override
    public final void onPeerUnregistered(final JsonRpcPeer jsonRpcPeer) {
        if (this.mPeers.decrementAndGet() == 0) {
            this.onLastPeerUnregistered();
        }
        this.onPeerRemoved(jsonRpcPeer);
    }
}
