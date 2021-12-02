// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util.recyclerviewswipeutil;

import android.os.Bundle;
import java.util.List;
import java.util.Collection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewBinderHelper
{
    private static final String BUNDLE_MAP_KEY = "ViewBinderHelper_Bundle_Map_Key";
    private Set<String> lockedSwipeSet;
    private Map<String, SwipeRevealLayout> mapLayouts;
    private Map<String, Integer> mapStates;
    private volatile boolean openOnlyOne;
    private final Object stateChangeLock;
    
    public ViewBinderHelper() {
        this.mapStates = Collections.synchronizedMap(new HashMap<String, Integer>());
        this.mapLayouts = Collections.synchronizedMap(new HashMap<String, SwipeRevealLayout>());
        this.lockedSwipeSet = Collections.synchronizedSet(new HashSet<String>());
        this.openOnlyOne = false;
        this.stateChangeLock = new Object();
    }
    
    private void closeOthers(final String anObject, final SwipeRevealLayout swipeRevealLayout) {
        synchronized (this.stateChangeLock) {
            if (this.getOpenCount() > 1) {
                for (final Map.Entry<String, Integer> entry : this.mapStates.entrySet()) {
                    if (!entry.getKey().equals(anObject)) {
                        entry.setValue(0);
                    }
                }
                for (final SwipeRevealLayout swipeRevealLayout2 : this.mapLayouts.values()) {
                    if (swipeRevealLayout2 != swipeRevealLayout) {
                        swipeRevealLayout2.close(true);
                    }
                }
            }
        }
    }
    
    private int getOpenCount() {
        final Iterator<Integer> iterator = this.mapStates.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final int intValue = iterator.next();
            if (intValue == 2 || intValue == 3) {
                ++n;
            }
        }
        return n;
    }
    
    private void setLockSwipe(final boolean lockDrag, final String... a) {
        if (a != null) {
            if (a.length != 0) {
                final Set<String> lockedSwipeSet = this.lockedSwipeSet;
                final List<String> list = Arrays.asList(a);
                if (lockDrag) {
                    lockedSwipeSet.addAll(list);
                }
                else {
                    lockedSwipeSet.removeAll(list);
                }
                for (int length = a.length, i = 0; i < length; ++i) {
                    final SwipeRevealLayout swipeRevealLayout = this.mapLayouts.get(a[i]);
                    if (swipeRevealLayout != null) {
                        swipeRevealLayout.setLockDrag(lockDrag);
                    }
                }
            }
        }
    }
    
    public void bind(final SwipeRevealLayout swipeRevealLayout, final String s) {
        if (swipeRevealLayout.shouldRequestLayout()) {
            swipeRevealLayout.requestLayout();
        }
        this.mapLayouts.values().remove(swipeRevealLayout);
        this.mapLayouts.put(s, swipeRevealLayout);
        swipeRevealLayout.abort();
        swipeRevealLayout.setDragStateChangeListener((SwipeRevealLayout.DragStateChangeListener)new SwipeRevealLayout.DragStateChangeListener() {
            @Override
            public void onDragStateChanged(final int i) {
                ViewBinderHelper.this.mapStates.put(s, i);
                if (ViewBinderHelper.this.openOnlyOne) {
                    ViewBinderHelper.this.closeOthers(s, swipeRevealLayout);
                }
            }
        });
        Label_0132: {
            if (!this.mapStates.containsKey(s)) {
                this.mapStates.put(s, 0);
            }
            else {
                final int intValue = this.mapStates.get(s);
                if (intValue != 0 && intValue != 1) {
                    if (intValue != 4) {
                        swipeRevealLayout.open(false);
                        break Label_0132;
                    }
                }
            }
            swipeRevealLayout.close(false);
        }
        swipeRevealLayout.setLockDrag(this.lockedSwipeSet.contains(s));
    }
    
    public void closeLayout(final String s) {
        synchronized (this.stateChangeLock) {
            this.mapStates.put(s, 0);
            if (this.mapLayouts.containsKey(s)) {
                this.mapLayouts.get(s).close(true);
            }
        }
    }
    
    public void lockSwipe(final String... array) {
        this.setLockSwipe(true, array);
    }
    
    public void openLayout(final String s) {
        synchronized (this.stateChangeLock) {
            this.mapStates.put(s, 2);
            if (this.mapLayouts.containsKey(s)) {
                this.mapLayouts.get(s).open(true);
            }
            else if (this.openOnlyOne) {
                this.closeOthers(s, this.mapLayouts.get(s));
            }
        }
    }
    
    public void restoreStates(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("ViewBinderHelper_Bundle_Map_Key")) {
            final HashMap<String, Integer> mapStates = new HashMap<String, Integer>();
            bundle = bundle.getBundle("ViewBinderHelper_Bundle_Map_Key");
            final Set keySet = bundle.keySet();
            if (keySet != null) {
                for (final String key : keySet) {
                    mapStates.put(key, bundle.getInt(key));
                }
            }
            this.mapStates = mapStates;
        }
    }
    
    public void saveStates(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        final Bundle bundle2 = new Bundle();
        for (final Map.Entry<String, Integer> entry : this.mapStates.entrySet()) {
            bundle2.putInt((String)entry.getKey(), (int)entry.getValue());
        }
        bundle.putBundle("ViewBinderHelper_Bundle_Map_Key", bundle2);
    }
    
    public void setOpenOnlyOne(final boolean openOnlyOne) {
        this.openOnlyOne = openOnlyOne;
    }
    
    public void unlockSwipe(final String... array) {
        this.setLockSwipe(false, array);
    }
}
