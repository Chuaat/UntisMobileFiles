// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import java.util.Map;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

public abstract class e1 extends p0 implements f1
{
    public e1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }
    
    public static f1 asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof f1) {
            return (f1)queryLocalInterface;
        }
        return new d1(binder);
    }
    
    @Override
    protected final boolean H(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        final i1 i1 = null;
        final l1 l1 = null;
        final l1 l2 = null;
        final l1 l3 = null;
        final i1 i2 = null;
        final i1 i3 = null;
        final i1 i4 = null;
        final i1 i5 = null;
        final i1 i6 = null;
        final i1 i7 = null;
        final n1 n3 = null;
        final i1 i8 = null;
        final i1 i9 = null;
        final i1 i10 = null;
        final i1 i11 = null;
        final i1 i12 = null;
        final i1 i13 = null;
        switch (n) {
            default: {
                return false;
            }
            case 45: {
                this.setConsentThirdParty(q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR), parcel.readLong());
                break;
            }
            case 44: {
                this.setConsent(q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR), parcel.readLong());
                break;
            }
            case 43: {
                this.clearMeasurementEnabled(parcel.readLong());
                break;
            }
            case 42: {
                this.setDefaultEventParameters(q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR));
                break;
            }
            case 40: {
                final IBinder strongBinder = parcel.readStrongBinder();
                i1 i14;
                if (strongBinder == null) {
                    i14 = i13;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof i1) {
                        i14 = (i1)queryLocalInterface;
                    }
                    else {
                        i14 = new g1(strongBinder);
                    }
                }
                this.isDataCollectionEnabled(i14);
                break;
            }
            case 39: {
                this.setDataCollectionEnabled(q0.f(parcel));
                break;
            }
            case 38: {
                final IBinder strongBinder2 = parcel.readStrongBinder();
                i1 i15;
                if (strongBinder2 == null) {
                    i15 = i1;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof i1) {
                        i15 = (i1)queryLocalInterface2;
                    }
                    else {
                        i15 = new g1(strongBinder2);
                    }
                }
                this.getTestFlag(i15, parcel.readInt());
                break;
            }
            case 37: {
                this.initForTests(q0.b(parcel));
                break;
            }
            case 36: {
                final IBinder strongBinder3 = parcel.readStrongBinder();
                l1 l4;
                if (strongBinder3 == null) {
                    l4 = l1;
                }
                else {
                    final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface3 instanceof l1) {
                        l4 = (l1)queryLocalInterface3;
                    }
                    else {
                        l4 = new j1(strongBinder3);
                    }
                }
                this.unregisterOnMeasurementEventListener(l4);
                break;
            }
            case 35: {
                final IBinder strongBinder4 = parcel.readStrongBinder();
                l1 l5;
                if (strongBinder4 == null) {
                    l5 = l2;
                }
                else {
                    final IInterface queryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface4 instanceof l1) {
                        l5 = (l1)queryLocalInterface4;
                    }
                    else {
                        l5 = new j1(strongBinder4);
                    }
                }
                this.registerOnMeasurementEventListener(l5);
                break;
            }
            case 34: {
                final IBinder strongBinder5 = parcel.readStrongBinder();
                l1 eventInterceptor;
                if (strongBinder5 == null) {
                    eventInterceptor = l3;
                }
                else {
                    final IInterface queryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface5 instanceof l1) {
                        eventInterceptor = (l1)queryLocalInterface5;
                    }
                    else {
                        eventInterceptor = new j1(strongBinder5);
                    }
                }
                this.setEventInterceptor(eventInterceptor);
                break;
            }
            case 33: {
                this.logHealthData(parcel.readInt(), parcel.readString(), d.a.x2(parcel.readStrongBinder()), d.a.x2(parcel.readStrongBinder()), d.a.x2(parcel.readStrongBinder()));
                break;
            }
            case 32: {
                final Bundle bundle = q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
                final IBinder strongBinder6 = parcel.readStrongBinder();
                i1 i16;
                if (strongBinder6 == null) {
                    i16 = i2;
                }
                else {
                    final IInterface queryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof i1) {
                        i16 = (i1)queryLocalInterface6;
                    }
                    else {
                        i16 = new g1(strongBinder6);
                    }
                }
                this.performAction(bundle, i16, parcel.readLong());
                break;
            }
            case 31: {
                final d x2 = d.a.x2(parcel.readStrongBinder());
                final IBinder strongBinder7 = parcel.readStrongBinder();
                i1 i17;
                if (strongBinder7 == null) {
                    i17 = i3;
                }
                else {
                    final IInterface queryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface7 instanceof i1) {
                        i17 = (i1)queryLocalInterface7;
                    }
                    else {
                        i17 = new g1(strongBinder7);
                    }
                }
                this.onActivitySaveInstanceState(x2, i17, parcel.readLong());
                break;
            }
            case 30: {
                this.onActivityResumed(d.a.x2(parcel.readStrongBinder()), parcel.readLong());
                break;
            }
            case 29: {
                this.onActivityPaused(d.a.x2(parcel.readStrongBinder()), parcel.readLong());
                break;
            }
            case 28: {
                this.onActivityDestroyed(d.a.x2(parcel.readStrongBinder()), parcel.readLong());
                break;
            }
            case 27: {
                this.onActivityCreated(d.a.x2(parcel.readStrongBinder()), q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR), parcel.readLong());
                break;
            }
            case 26: {
                this.onActivityStopped(d.a.x2(parcel.readStrongBinder()), parcel.readLong());
                break;
            }
            case 25: {
                this.onActivityStarted(d.a.x2(parcel.readStrongBinder()), parcel.readLong());
                break;
            }
            case 24: {
                this.endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            }
            case 23: {
                this.beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            }
            case 22: {
                final IBinder strongBinder8 = parcel.readStrongBinder();
                i1 i18;
                if (strongBinder8 == null) {
                    i18 = i4;
                }
                else {
                    final IInterface queryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof i1) {
                        i18 = (i1)queryLocalInterface8;
                    }
                    else {
                        i18 = new g1(strongBinder8);
                    }
                }
                this.generateEventId(i18);
                break;
            }
            case 21: {
                final IBinder strongBinder9 = parcel.readStrongBinder();
                i1 i19;
                if (strongBinder9 == null) {
                    i19 = i5;
                }
                else {
                    final IInterface queryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof i1) {
                        i19 = (i1)queryLocalInterface9;
                    }
                    else {
                        i19 = new g1(strongBinder9);
                    }
                }
                this.getGmpAppId(i19);
                break;
            }
            case 20: {
                final IBinder strongBinder10 = parcel.readStrongBinder();
                i1 i20;
                if (strongBinder10 == null) {
                    i20 = i6;
                }
                else {
                    final IInterface queryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof i1) {
                        i20 = (i1)queryLocalInterface10;
                    }
                    else {
                        i20 = new g1(strongBinder10);
                    }
                }
                this.getAppInstanceId(i20);
                break;
            }
            case 19: {
                final IBinder strongBinder11 = parcel.readStrongBinder();
                i1 i21;
                if (strongBinder11 == null) {
                    i21 = i7;
                }
                else {
                    final IInterface queryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof i1) {
                        i21 = (i1)queryLocalInterface11;
                    }
                    else {
                        i21 = new g1(strongBinder11);
                    }
                }
                this.getCachedAppInstanceId(i21);
                break;
            }
            case 18: {
                final IBinder strongBinder12 = parcel.readStrongBinder();
                n1 instanceIdProvider;
                if (strongBinder12 == null) {
                    instanceIdProvider = n3;
                }
                else {
                    final IInterface queryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface12 instanceof n1) {
                        instanceIdProvider = (n1)queryLocalInterface12;
                    }
                    else {
                        instanceIdProvider = new m1(strongBinder12);
                    }
                }
                this.setInstanceIdProvider(instanceIdProvider);
                break;
            }
            case 17: {
                final IBinder strongBinder13 = parcel.readStrongBinder();
                i1 i22;
                if (strongBinder13 == null) {
                    i22 = i8;
                }
                else {
                    final IInterface queryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof i1) {
                        i22 = (i1)queryLocalInterface13;
                    }
                    else {
                        i22 = new g1(strongBinder13);
                    }
                }
                this.getCurrentScreenClass(i22);
                break;
            }
            case 16: {
                final IBinder strongBinder14 = parcel.readStrongBinder();
                i1 i23;
                if (strongBinder14 == null) {
                    i23 = i9;
                }
                else {
                    final IInterface queryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface14 instanceof i1) {
                        i23 = (i1)queryLocalInterface14;
                    }
                    else {
                        i23 = new g1(strongBinder14);
                    }
                }
                this.getCurrentScreenName(i23);
                break;
            }
            case 15: {
                this.setCurrentScreen(d.a.x2(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            }
            case 14: {
                this.setSessionTimeoutDuration(parcel.readLong());
                break;
            }
            case 13: {
                this.setMinimumSessionDuration(parcel.readLong());
                break;
            }
            case 12: {
                this.resetAnalyticsData(parcel.readLong());
                break;
            }
            case 11: {
                this.setMeasurementEnabled(q0.f(parcel), parcel.readLong());
                break;
            }
            case 10: {
                final String string = parcel.readString();
                final String string2 = parcel.readString();
                final IBinder strongBinder15 = parcel.readStrongBinder();
                i1 i24;
                if (strongBinder15 == null) {
                    i24 = i10;
                }
                else {
                    final IInterface queryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface15 instanceof i1) {
                        i24 = (i1)queryLocalInterface15;
                    }
                    else {
                        i24 = new g1(strongBinder15);
                    }
                }
                this.getConditionalUserProperties(string, string2, i24);
                break;
            }
            case 9: {
                this.clearConditionalUserProperty(parcel.readString(), parcel.readString(), q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR));
                break;
            }
            case 8: {
                this.setConditionalUserProperty(q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR), parcel.readLong());
                break;
            }
            case 7: {
                this.setUserId(parcel.readString(), parcel.readLong());
                break;
            }
            case 6: {
                final String string3 = parcel.readString();
                final IBinder strongBinder16 = parcel.readStrongBinder();
                i1 i25;
                if (strongBinder16 == null) {
                    i25 = i11;
                }
                else {
                    final IInterface queryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface16 instanceof i1) {
                        i25 = (i1)queryLocalInterface16;
                    }
                    else {
                        i25 = new g1(strongBinder16);
                    }
                }
                this.getMaxUserProperties(string3, i25);
                break;
            }
            case 5: {
                final String string4 = parcel.readString();
                final String string5 = parcel.readString();
                final boolean f = q0.f(parcel);
                final IBinder strongBinder17 = parcel.readStrongBinder();
                i1 i26;
                if (strongBinder17 == null) {
                    i26 = i12;
                }
                else {
                    final IInterface queryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof i1) {
                        i26 = (i1)queryLocalInterface17;
                    }
                    else {
                        i26 = new g1(strongBinder17);
                    }
                }
                this.getUserProperties(string4, string5, f, i26);
                break;
            }
            case 4: {
                this.setUserProperty(parcel.readString(), parcel.readString(), d.a.x2(parcel.readStrongBinder()), q0.f(parcel), parcel.readLong());
                break;
            }
            case 3: {
                final String string6 = parcel.readString();
                final String string7 = parcel.readString();
                final Bundle bundle2 = q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR);
                final IBinder strongBinder18 = parcel.readStrongBinder();
                i1 i27;
                if (strongBinder18 == null) {
                    i27 = null;
                }
                else {
                    final IInterface queryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof i1) {
                        i27 = (i1)queryLocalInterface18;
                    }
                    else {
                        i27 = new g1(strongBinder18);
                    }
                }
                this.logEventAndBundle(string6, string7, bundle2, i27, parcel.readLong());
                break;
            }
            case 2: {
                this.logEvent(parcel.readString(), parcel.readString(), q0.a(parcel, (android.os.Parcelable$Creator<Bundle>)Bundle.CREATOR), q0.f(parcel), q0.f(parcel), parcel.readLong());
                break;
            }
            case 1: {
                this.initialize(d.a.x2(parcel.readStrongBinder()), q0.a(parcel, o1.CREATOR), parcel.readLong());
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
