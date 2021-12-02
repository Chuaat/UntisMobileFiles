// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.domstorage;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.protocol.module.DOMStorage;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import android.content.SharedPreferences;
import java.util.Iterator;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.List;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import android.content.Context;
import com.facebook.stetho.inspector.helper.ChromePeerManager;

public class DOMStoragePeerManager extends ChromePeerManager
{
    private final Context mContext;
    private final PeerRegistrationListener mPeerListener;
    
    public DOMStoragePeerManager(final Context mContext) {
        final PeersRegisteredListener peersRegisteredListener = new PeersRegisteredListener() {
            private final List<DevToolsSharedPreferencesListener> mPrefsListeners = new ArrayList<DevToolsSharedPreferencesListener>();
            
            @Override
            protected void onFirstPeerRegistered() {
                synchronized (this) {
                    for (final String s : SharedPreferencesHelper.getSharedPreferenceTags(DOMStoragePeerManager.this.mContext)) {
                        final SharedPreferences sharedPreferences = DOMStoragePeerManager.this.mContext.getSharedPreferences(s, 0);
                        final DevToolsSharedPreferencesListener devToolsSharedPreferencesListener = new DevToolsSharedPreferencesListener(sharedPreferences, s);
                        sharedPreferences.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)devToolsSharedPreferencesListener);
                        this.mPrefsListeners.add(devToolsSharedPreferencesListener);
                    }
                }
            }
            
            @Override
            protected void onLastPeerUnregistered() {
                synchronized (this) {
                    final Iterator<DevToolsSharedPreferencesListener> iterator = this.mPrefsListeners.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().unregister();
                    }
                    this.mPrefsListeners.clear();
                }
            }
        };
        this.mPeerListener = peersRegisteredListener;
        this.mContext = mContext;
        this.setListener(peersRegisteredListener);
    }
    
    private static Map<String, Object> prefsCopy(final Map<String, ?> map) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>(map.size());
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String key = entry.getKey();
            Object value;
            final V v = (V)(value = entry.getValue());
            if (v instanceof Set) {
                value = shallowCopy((Set<Object>)v);
            }
            hashMap.put(key, value);
        }
        return hashMap;
    }
    
    private static <T> Set<T> shallowCopy(final Set<T> set) {
        final HashSet<T> set2 = new HashSet<T>();
        final Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()) {
            set2.add(iterator.next());
        }
        return set2;
    }
    
    public void signalItemAdded(final DOMStorage.StorageId storageId, final String key, final String newValue) {
        final DOMStorage.DomStorageItemAddedParams domStorageItemAddedParams = new DOMStorage.DomStorageItemAddedParams();
        domStorageItemAddedParams.storageId = storageId;
        domStorageItemAddedParams.key = key;
        domStorageItemAddedParams.newValue = newValue;
        this.sendNotificationToPeers("DOMStorage.domStorageItemAdded", domStorageItemAddedParams);
    }
    
    public void signalItemRemoved(final DOMStorage.StorageId storageId, final String key) {
        final DOMStorage.DomStorageItemRemovedParams domStorageItemRemovedParams = new DOMStorage.DomStorageItemRemovedParams();
        domStorageItemRemovedParams.storageId = storageId;
        domStorageItemRemovedParams.key = key;
        this.sendNotificationToPeers("DOMStorage.domStorageItemRemoved", domStorageItemRemovedParams);
    }
    
    public void signalItemUpdated(final DOMStorage.StorageId storageId, final String key, final String oldValue, final String newValue) {
        final DOMStorage.DomStorageItemUpdatedParams domStorageItemUpdatedParams = new DOMStorage.DomStorageItemUpdatedParams();
        domStorageItemUpdatedParams.storageId = storageId;
        domStorageItemUpdatedParams.key = key;
        domStorageItemUpdatedParams.oldValue = oldValue;
        domStorageItemUpdatedParams.newValue = newValue;
        this.sendNotificationToPeers("DOMStorage.domStorageItemUpdated", domStorageItemUpdatedParams);
    }
    
    private class DevToolsSharedPreferencesListener implements SharedPreferences$OnSharedPreferenceChangeListener
    {
        private final Map<String, Object> mCopy;
        private final SharedPreferences mPrefs;
        private final DOMStorage.StorageId mStorageId;
        
        public DevToolsSharedPreferencesListener(final SharedPreferences mPrefs, final String securityOrigin) {
            this.mPrefs = mPrefs;
            final DOMStorage.StorageId mStorageId = new DOMStorage.StorageId();
            this.mStorageId = mStorageId;
            mStorageId.securityOrigin = securityOrigin;
            mStorageId.isLocalStorage = true;
            this.mCopy = prefsCopy(mPrefs.getAll());
        }
        
        public void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
            final Map all = sharedPreferences.getAll();
            final boolean containsKey = this.mCopy.containsKey(s);
            final boolean containsKey2 = all.containsKey(s);
            Object value;
            if (containsKey2) {
                value = all.get(s);
            }
            else {
                value = null;
            }
            if (containsKey && containsKey2) {
                DOMStoragePeerManager.this.signalItemUpdated(this.mStorageId, s, SharedPreferencesHelper.valueToString(this.mCopy.get(s)), SharedPreferencesHelper.valueToString(value));
            }
            else {
                if (containsKey) {
                    DOMStoragePeerManager.this.signalItemRemoved(this.mStorageId, s);
                    this.mCopy.remove(s);
                    return;
                }
                if (!containsKey2) {
                    LogUtil.i("Detected rapid put/remove of %s", s);
                    return;
                }
                DOMStoragePeerManager.this.signalItemAdded(this.mStorageId, s, SharedPreferencesHelper.valueToString(value));
            }
            this.mCopy.put(s, value);
        }
        
        public void unregister() {
            this.mPrefs.unregisterOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)this);
        }
    }
}
