// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import android.os.Bundle;
import android.app.Application$ActivityLifecycleCallbacks;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.app.Application;
import java.util.Iterator;
import android.os.Looper;
import com.facebook.stetho.common.Util;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collections;
import c6.h;
import java.util.List;
import d6.a;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import d6.c;

@c
public final class ActivityTracker
{
    private static final ActivityTracker sInstance;
    @a("Looper.getMainLooper()")
    private final ArrayList<WeakReference<Activity>> mActivities;
    private final List<WeakReference<Activity>> mActivitiesUnmodifiable;
    @h
    private AutomaticTracker mAutomaticTracker;
    private final List<Listener> mListeners;
    
    static {
        sInstance = new ActivityTracker();
    }
    
    public ActivityTracker() {
        final ArrayList<WeakReference<Activity>> list = new ArrayList<WeakReference<Activity>>();
        this.mActivities = list;
        this.mActivitiesUnmodifiable = (List<WeakReference<Activity>>)Collections.unmodifiableList((List<?>)list);
        this.mListeners = new CopyOnWriteArrayList<Listener>();
    }
    
    public static ActivityTracker get() {
        return ActivityTracker.sInstance;
    }
    
    private static <T> boolean removeFromWeakList(final ArrayList<WeakReference<T>> list, final T t) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (list.get(i).get() == t) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public void add(final Activity referent) {
        Util.throwIfNull(referent);
        Util.throwIfNot(Looper.myLooper() == Looper.getMainLooper());
        this.mActivities.add(new WeakReference<Activity>(referent));
        final Iterator<Listener> iterator = this.mListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().onActivityAdded(referent);
        }
    }
    
    public boolean beginTrackingIfPossible(final Application application) {
        if (this.mAutomaticTracker == null) {
            final AutomaticTracker instanceIfPossible = AutomaticTracker.newInstanceIfPossible(application, this);
            if (instanceIfPossible != null) {
                instanceIfPossible.register();
                this.mAutomaticTracker = instanceIfPossible;
                return true;
            }
        }
        return false;
    }
    
    public boolean endTracking() {
        final AutomaticTracker mAutomaticTracker = this.mAutomaticTracker;
        if (mAutomaticTracker != null) {
            mAutomaticTracker.unregister();
            this.mAutomaticTracker = null;
            return true;
        }
        return false;
    }
    
    public List<WeakReference<Activity>> getActivitiesView() {
        return this.mActivitiesUnmodifiable;
    }
    
    public void registerListener(final Listener listener) {
        this.mListeners.add(listener);
    }
    
    public void remove(final Activity activity) {
        Util.throwIfNull(activity);
        Util.throwIfNot(Looper.myLooper() == Looper.getMainLooper());
        if (removeFromWeakList(this.mActivities, activity)) {
            final Iterator<Listener> iterator = this.mListeners.iterator();
            while (iterator.hasNext()) {
                iterator.next().onActivityRemoved(activity);
            }
        }
    }
    
    @h
    public Activity tryGetTopActivity() {
        if (this.mActivitiesUnmodifiable.isEmpty()) {
            return null;
        }
        for (int i = this.mActivitiesUnmodifiable.size() - 1; i >= 0; --i) {
            final Activity activity = this.mActivitiesUnmodifiable.get(i).get();
            if (activity != null) {
                return activity;
            }
        }
        return null;
    }
    
    public void unregisterListener(final Listener listener) {
        this.mListeners.remove(listener);
    }
    
    private abstract static class AutomaticTracker
    {
        @h
        public static AutomaticTracker newInstanceIfPossible(final Application application, final ActivityTracker activityTracker) {
            if (Build$VERSION.SDK_INT >= 14) {
                return new AutomaticTrackerICSAndBeyond(application, activityTracker);
            }
            return null;
        }
        
        public abstract void register();
        
        public abstract void unregister();
        
        @TargetApi(14)
        private static class AutomaticTrackerICSAndBeyond extends AutomaticTracker
        {
            private final Application mApplication;
            private final Application$ActivityLifecycleCallbacks mLifecycleCallbacks;
            private final ActivityTracker mTracker;
            
            public AutomaticTrackerICSAndBeyond(final Application mApplication, final ActivityTracker mTracker) {
                this.mLifecycleCallbacks = (Application$ActivityLifecycleCallbacks)new Application$ActivityLifecycleCallbacks() {
                    public void onActivityCreated(final Activity activity, final Bundle bundle) {
                        AutomaticTrackerICSAndBeyond.this.mTracker.add(activity);
                    }
                    
                    public void onActivityDestroyed(final Activity activity) {
                        AutomaticTrackerICSAndBeyond.this.mTracker.remove(activity);
                    }
                    
                    public void onActivityPaused(final Activity activity) {
                    }
                    
                    public void onActivityResumed(final Activity activity) {
                    }
                    
                    public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
                    }
                    
                    public void onActivityStarted(final Activity activity) {
                    }
                    
                    public void onActivityStopped(final Activity activity) {
                    }
                };
                this.mApplication = mApplication;
                this.mTracker = mTracker;
            }
            
            @Override
            public void register() {
                this.mApplication.registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
            }
            
            @Override
            public void unregister() {
                this.mApplication.unregisterActivityLifecycleCallbacks(this.mLifecycleCallbacks);
            }
        }
    }
    
    public interface Listener
    {
        void onActivityAdded(final Activity p0);
        
        void onActivityRemoved(final Activity p0);
    }
}
