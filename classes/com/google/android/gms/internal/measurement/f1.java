// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamic.d;
import java.util.Map;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;

public interface f1 extends IInterface
{
    void beginAdUnitExposure(final String p0, final long p1) throws RemoteException;
    
    void clearConditionalUserProperty(final String p0, final String p1, final Bundle p2) throws RemoteException;
    
    void clearMeasurementEnabled(final long p0) throws RemoteException;
    
    void endAdUnitExposure(final String p0, final long p1) throws RemoteException;
    
    void generateEventId(final i1 p0) throws RemoteException;
    
    void getAppInstanceId(final i1 p0) throws RemoteException;
    
    void getCachedAppInstanceId(final i1 p0) throws RemoteException;
    
    void getConditionalUserProperties(final String p0, final String p1, final i1 p2) throws RemoteException;
    
    void getCurrentScreenClass(final i1 p0) throws RemoteException;
    
    void getCurrentScreenName(final i1 p0) throws RemoteException;
    
    void getGmpAppId(final i1 p0) throws RemoteException;
    
    void getMaxUserProperties(final String p0, final i1 p1) throws RemoteException;
    
    void getTestFlag(final i1 p0, final int p1) throws RemoteException;
    
    void getUserProperties(final String p0, final String p1, final boolean p2, final i1 p3) throws RemoteException;
    
    void initForTests(final Map p0) throws RemoteException;
    
    void initialize(final d p0, final o1 p1, final long p2) throws RemoteException;
    
    void isDataCollectionEnabled(final i1 p0) throws RemoteException;
    
    void logEvent(final String p0, final String p1, final Bundle p2, final boolean p3, final boolean p4, final long p5) throws RemoteException;
    
    void logEventAndBundle(final String p0, final String p1, final Bundle p2, final i1 p3, final long p4) throws RemoteException;
    
    void logHealthData(final int p0, final String p1, final d p2, final d p3, final d p4) throws RemoteException;
    
    void onActivityCreated(final d p0, final Bundle p1, final long p2) throws RemoteException;
    
    void onActivityDestroyed(final d p0, final long p1) throws RemoteException;
    
    void onActivityPaused(final d p0, final long p1) throws RemoteException;
    
    void onActivityResumed(final d p0, final long p1) throws RemoteException;
    
    void onActivitySaveInstanceState(final d p0, final i1 p1, final long p2) throws RemoteException;
    
    void onActivityStarted(final d p0, final long p1) throws RemoteException;
    
    void onActivityStopped(final d p0, final long p1) throws RemoteException;
    
    void performAction(final Bundle p0, final i1 p1, final long p2) throws RemoteException;
    
    void registerOnMeasurementEventListener(final l1 p0) throws RemoteException;
    
    void resetAnalyticsData(final long p0) throws RemoteException;
    
    void setConditionalUserProperty(final Bundle p0, final long p1) throws RemoteException;
    
    void setConsent(final Bundle p0, final long p1) throws RemoteException;
    
    void setConsentThirdParty(final Bundle p0, final long p1) throws RemoteException;
    
    void setCurrentScreen(final d p0, final String p1, final String p2, final long p3) throws RemoteException;
    
    void setDataCollectionEnabled(final boolean p0) throws RemoteException;
    
    void setDefaultEventParameters(final Bundle p0) throws RemoteException;
    
    void setEventInterceptor(final l1 p0) throws RemoteException;
    
    void setInstanceIdProvider(final n1 p0) throws RemoteException;
    
    void setMeasurementEnabled(final boolean p0, final long p1) throws RemoteException;
    
    void setMinimumSessionDuration(final long p0) throws RemoteException;
    
    void setSessionTimeoutDuration(final long p0) throws RemoteException;
    
    void setUserId(final String p0, final long p1) throws RemoteException;
    
    void setUserProperty(final String p0, final String p1, final d p2, final boolean p3, final long p4) throws RemoteException;
    
    void unregisterOnMeasurementEventListener(final l1 p0) throws RemoteException;
}
