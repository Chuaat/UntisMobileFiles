// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.inspector.elements.NodeType;
import android.content.Context;
import com.facebook.stetho.inspector.elements.android.window.WindowRootViewCompat;
import com.facebook.stetho.common.Accumulator;
import java.util.Iterator;
import com.facebook.stetho.common.Util;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.List;
import android.view.View;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import android.app.Application;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

final class ApplicationDescriptor extends AbstractChainedDescriptor<Application>
{
    private final ActivityTracker mActivityTracker;
    private final Map<Application, ElementContext> mElementToContextMap;
    
    ApplicationDescriptor() {
        this.mElementToContextMap = Collections.synchronizedMap(new IdentityHashMap<Application, ElementContext>());
        this.mActivityTracker = ActivityTracker.get();
    }
    
    private ElementContext getContext(final Application application) {
        return this.mElementToContextMap.get(application);
    }
    
    private static boolean isDecorViewOfActivity(final View view, final List<WeakReference<Activity>> list) {
        Util.throwIfNull(list);
        final Iterator<WeakReference<Activity>> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Activity activity = iterator.next().get();
            if (activity == null) {
                continue;
            }
            if (activity.getWindow().getDecorView() == view) {
                return true;
            }
        }
        return false;
    }
    
    private void storeWindowIfNeeded(final Application application, final Accumulator<Object> accumulator, final List<WeakReference<Activity>> list) {
        for (final View view : WindowRootViewCompat.get((Context)application).getRootViews()) {
            if (!isDecorViewOfActivity(view, list)) {
                accumulator.store(view);
            }
        }
    }
    
    @Override
    protected void onGetChildren(final Application application, final Accumulator<Object> accumulator) {
        final List<WeakReference<Activity>> activitiesList = this.getContext(application).getActivitiesList();
        for (int i = activitiesList.size() - 1; i >= 0; --i) {
            final Activity activity = activitiesList.get(i).get();
            if (activity != null) {
                accumulator.store(activity);
            }
        }
        this.storeWindowIfNeeded(application, accumulator, activitiesList);
    }
    
    @Override
    protected NodeType onGetNodeType(final Application application) {
        return NodeType.ELEMENT_NODE;
    }
    
    @Override
    protected void onHook(final Application application) {
        final ElementContext elementContext = new ElementContext();
        elementContext.hook(application);
        this.mElementToContextMap.put(application, elementContext);
    }
    
    @Override
    protected void onUnhook(final Application application) {
        this.mElementToContextMap.remove(application).unhook();
    }
    
    private class ElementContext
    {
        private Application mElement;
        private final ActivityTracker.Listener mListener;
        
        public ElementContext() {
            this.mListener = new ActivityTracker.Listener() {
                @Override
                public void onActivityAdded(final Activity activity) {
                }
                
                @Override
                public void onActivityRemoved(final Activity activity) {
                }
            };
        }
        
        public List<WeakReference<Activity>> getActivitiesList() {
            return ApplicationDescriptor.this.mActivityTracker.getActivitiesView();
        }
        
        public void hook(final Application mElement) {
            this.mElement = mElement;
            ApplicationDescriptor.this.mActivityTracker.registerListener(this.mListener);
        }
        
        public void unhook() {
            ApplicationDescriptor.this.mActivityTracker.unregisterListener(this.mListener);
            this.mElement = null;
        }
    }
}
