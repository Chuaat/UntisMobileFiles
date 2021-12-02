// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamic.d;
import java.util.Map;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

public final class d1 extends o0 implements f1
{
    d1(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }
    
    @Override
    public final void beginAdUnitExposure(final String s, final long n) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeLong(n);
        this.y2(23, h);
    }
    
    @Override
    public final void clearConditionalUserProperty(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeString(s2);
        q0.d(h, (Parcelable)bundle);
        this.y2(9, h);
    }
    
    @Override
    public final void clearMeasurementEnabled(final long n) throws RemoteException {
        final Parcel h = this.H();
        h.writeLong(n);
        this.y2(43, h);
    }
    
    @Override
    public final void endAdUnitExposure(final String s, final long n) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeLong(n);
        this.y2(24, h);
    }
    
    @Override
    public final void generateEventId(final i1 i1) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)i1);
        this.y2(22, h);
    }
    
    @Override
    public final void getAppInstanceId(final i1 i1) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)i1);
        this.y2(20, h);
    }
    
    @Override
    public final void getCachedAppInstanceId(final i1 i1) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)i1);
        this.y2(19, h);
    }
    
    @Override
    public final void getConditionalUserProperties(final String s, final String s2, final i1 i1) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeString(s2);
        q0.e(h, (IInterface)i1);
        this.y2(10, h);
    }
    
    @Override
    public final void getCurrentScreenClass(final i1 i1) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)i1);
        this.y2(17, h);
    }
    
    @Override
    public final void getCurrentScreenName(final i1 i1) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)i1);
        this.y2(16, h);
    }
    
    @Override
    public final void getGmpAppId(final i1 i1) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)i1);
        this.y2(21, h);
    }
    
    @Override
    public final void getMaxUserProperties(final String s, final i1 i1) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        q0.e(h, (IInterface)i1);
        this.y2(6, h);
    }
    
    @Override
    public final void getTestFlag(final i1 i1, final int n) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)i1);
        h.writeInt(n);
        this.y2(38, h);
    }
    
    @Override
    public final void getUserProperties(final String s, final String s2, final boolean b, final i1 i1) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeString(s2);
        q0.c(h, b);
        q0.e(h, (IInterface)i1);
        this.y2(5, h);
    }
    
    @Override
    public final void initForTests(final Map map) throws RemoteException {
        throw null;
    }
    
    @Override
    public final void initialize(final d d, final o1 o1, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)d);
        q0.d(h, (Parcelable)o1);
        h.writeLong(n);
        this.y2(1, h);
    }
    
    @Override
    public final void isDataCollectionEnabled(final i1 i1) throws RemoteException {
        throw null;
    }
    
    @Override
    public final void logEvent(final String s, final String s2, final Bundle bundle, final boolean b, final boolean b2, final long n) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeString(s2);
        q0.d(h, (Parcelable)bundle);
        q0.c(h, b);
        q0.c(h, b2);
        h.writeLong(n);
        this.y2(2, h);
    }
    
    @Override
    public final void logEventAndBundle(final String s, final String s2, final Bundle bundle, final i1 i1, final long n) throws RemoteException {
        throw null;
    }
    
    @Override
    public final void logHealthData(final int n, final String s, final d d, final d d2, final d d3) throws RemoteException {
        final Parcel h = this.H();
        h.writeInt(5);
        h.writeString(s);
        q0.e(h, (IInterface)d);
        q0.e(h, (IInterface)d2);
        q0.e(h, (IInterface)d3);
        this.y2(33, h);
    }
    
    @Override
    public final void onActivityCreated(final d d, final Bundle bundle, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)d);
        q0.d(h, (Parcelable)bundle);
        h.writeLong(n);
        this.y2(27, h);
    }
    
    @Override
    public final void onActivityDestroyed(final d d, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)d);
        h.writeLong(n);
        this.y2(28, h);
    }
    
    @Override
    public final void onActivityPaused(final d d, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)d);
        h.writeLong(n);
        this.y2(29, h);
    }
    
    @Override
    public final void onActivityResumed(final d d, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)d);
        h.writeLong(n);
        this.y2(30, h);
    }
    
    @Override
    public final void onActivitySaveInstanceState(final d d, final i1 i1, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)d);
        q0.e(h, (IInterface)i1);
        h.writeLong(n);
        this.y2(31, h);
    }
    
    @Override
    public final void onActivityStarted(final d d, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)d);
        h.writeLong(n);
        this.y2(25, h);
    }
    
    @Override
    public final void onActivityStopped(final d d, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)d);
        h.writeLong(n);
        this.y2(26, h);
    }
    
    @Override
    public final void performAction(final Bundle bundle, final i1 i1, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)bundle);
        q0.e(h, (IInterface)i1);
        h.writeLong(n);
        this.y2(32, h);
    }
    
    @Override
    public final void registerOnMeasurementEventListener(final l1 l1) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)l1);
        this.y2(35, h);
    }
    
    @Override
    public final void resetAnalyticsData(final long n) throws RemoteException {
        final Parcel h = this.H();
        h.writeLong(n);
        this.y2(12, h);
    }
    
    @Override
    public final void setConditionalUserProperty(final Bundle bundle, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)bundle);
        h.writeLong(n);
        this.y2(8, h);
    }
    
    @Override
    public final void setConsent(final Bundle bundle, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)bundle);
        h.writeLong(n);
        this.y2(44, h);
    }
    
    @Override
    public final void setConsentThirdParty(final Bundle bundle, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)bundle);
        h.writeLong(n);
        this.y2(45, h);
    }
    
    @Override
    public final void setCurrentScreen(final d d, final String s, final String s2, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)d);
        h.writeString(s);
        h.writeString(s2);
        h.writeLong(n);
        this.y2(15, h);
    }
    
    @Override
    public final void setDataCollectionEnabled(final boolean b) throws RemoteException {
        final Parcel h = this.H();
        q0.c(h, b);
        this.y2(39, h);
    }
    
    @Override
    public final void setDefaultEventParameters(final Bundle bundle) throws RemoteException {
        final Parcel h = this.H();
        q0.d(h, (Parcelable)bundle);
        this.y2(42, h);
    }
    
    @Override
    public final void setEventInterceptor(final l1 l1) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)l1);
        this.y2(34, h);
    }
    
    @Override
    public final void setInstanceIdProvider(final n1 n1) throws RemoteException {
        throw null;
    }
    
    @Override
    public final void setMeasurementEnabled(final boolean b, final long n) throws RemoteException {
        final Parcel h = this.H();
        q0.c(h, b);
        h.writeLong(n);
        this.y2(11, h);
    }
    
    @Override
    public final void setMinimumSessionDuration(final long n) throws RemoteException {
        throw null;
    }
    
    @Override
    public final void setSessionTimeoutDuration(final long n) throws RemoteException {
        final Parcel h = this.H();
        h.writeLong(n);
        this.y2(14, h);
    }
    
    @Override
    public final void setUserId(final String s, final long n) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeLong(n);
        this.y2(7, h);
    }
    
    @Override
    public final void setUserProperty(final String s, final String s2, final d d, final boolean b, final long n) throws RemoteException {
        final Parcel h = this.H();
        h.writeString(s);
        h.writeString(s2);
        q0.e(h, (IInterface)d);
        q0.c(h, b);
        h.writeLong(n);
        this.y2(4, h);
    }
    
    @Override
    public final void unregisterOnMeasurementEventListener(final l1 l1) throws RemoteException {
        final Parcel h = this.H();
        q0.e(h, (IInterface)l1);
        this.y2(36, h);
    }
}
