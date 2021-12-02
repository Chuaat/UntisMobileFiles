// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.Util;
import android.content.Context;
import c6.h;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import com.facebook.stetho.inspector.helper.ChromePeerManager;

public class NetworkPeerManager extends ChromePeerManager
{
    private static NetworkPeerManager sInstance;
    private AsyncPrettyPrinterRegistry mAsyncPrettyPrinterRegistry;
    private AsyncPrettyPrinterInitializer mPrettyPrinterInitializer;
    private final ResponseBodyFileManager mResponseBodyFileManager;
    private final PeersRegisteredListener mTempFileCleanup;
    
    public NetworkPeerManager(final ResponseBodyFileManager mResponseBodyFileManager) {
        final PeersRegisteredListener peersRegisteredListener = new PeersRegisteredListener() {
            @Override
            protected void onFirstPeerRegistered() {
                AsyncPrettyPrinterExecutorHolder.ensureInitialized();
                if (NetworkPeerManager.this.mAsyncPrettyPrinterRegistry == null && NetworkPeerManager.this.mPrettyPrinterInitializer != null) {
                    NetworkPeerManager.this.mAsyncPrettyPrinterRegistry = new AsyncPrettyPrinterRegistry();
                    NetworkPeerManager.this.mPrettyPrinterInitializer.populatePrettyPrinters(NetworkPeerManager.this.mAsyncPrettyPrinterRegistry);
                }
                NetworkPeerManager.this.mResponseBodyFileManager.cleanupFiles();
            }
            
            @Override
            protected void onLastPeerUnregistered() {
                NetworkPeerManager.this.mResponseBodyFileManager.cleanupFiles();
                AsyncPrettyPrinterExecutorHolder.shutdown();
            }
        };
        this.mTempFileCleanup = peersRegisteredListener;
        this.mResponseBodyFileManager = mResponseBodyFileManager;
        this.setListener(peersRegisteredListener);
    }
    
    @h
    public static NetworkPeerManager getInstanceOrNull() {
        synchronized (NetworkPeerManager.class) {
            return NetworkPeerManager.sInstance;
        }
    }
    
    public static NetworkPeerManager getOrCreateInstance(final Context context) {
        synchronized (NetworkPeerManager.class) {
            if (NetworkPeerManager.sInstance == null) {
                NetworkPeerManager.sInstance = new NetworkPeerManager(new ResponseBodyFileManager(context.getApplicationContext()));
            }
            return NetworkPeerManager.sInstance;
        }
    }
    
    @h
    public AsyncPrettyPrinterRegistry getAsyncPrettyPrinterRegistry() {
        return this.mAsyncPrettyPrinterRegistry;
    }
    
    public ResponseBodyFileManager getResponseBodyFileManager() {
        return this.mResponseBodyFileManager;
    }
    
    public void setPrettyPrinterInitializer(final AsyncPrettyPrinterInitializer asyncPrettyPrinterInitializer) {
        Util.throwIfNotNull(this.mPrettyPrinterInitializer);
        this.mPrettyPrinterInitializer = Util.throwIfNull(asyncPrettyPrinterInitializer);
    }
}
