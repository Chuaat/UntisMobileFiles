// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement;

import com.google.android.gms.measurement.internal.l7;
import com.google.android.gms.measurement.internal.w5;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.measurement.internal.a6;
import com.google.android.gms.measurement.internal.b6;
import com.google.android.gms.common.util.d0;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.c1;
import java.util.Map;
import androidx.annotation.u0;
import androidx.annotation.s0;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.o1;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import android.content.Context;
import com.google.android.gms.measurement.internal.z4;
import com.google.android.gms.measurement.internal.f7;
import androidx.annotation.j0;
import f2.a;
import com.google.android.gms.common.internal.b0;

@Deprecated
@b0
@f2.a
public class AppMeasurement
{
    @j0
    @b0
    @f2.a
    public static final String b = "crash";
    @j0
    @b0
    @f2.a
    public static final String c = "fcm";
    @j0
    @b0
    @f2.a
    public static final String d = "fiam";
    private static volatile AppMeasurement e;
    private final e a;
    
    public AppMeasurement(final f7 f7) {
        this.a = new c(f7);
    }
    
    public AppMeasurement(final z4 z4) {
        this.a = new com.google.android.gms.measurement.b(z4);
    }
    
    @Deprecated
    @Keep
    @j0
    @s0(allOf = { "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK" })
    @b0
    @f2.a
    public static AppMeasurement getInstance(@j0 final Context context) {
        if (AppMeasurement.e == null) {
            synchronized (AppMeasurement.class) {
                if (AppMeasurement.e == null) {
                    f7 f7;
                    try {
                        f7 = (f7)FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    }
                    catch (Exception ex) {
                        f7 = null;
                    }
                    if (f7 != null) {
                        AppMeasurement.e = new AppMeasurement(f7);
                    }
                    else {
                        AppMeasurement.e = new AppMeasurement(z4.E(context, new o1(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return AppMeasurement.e;
    }
    
    @j0
    @f2.a
    public Boolean a() {
        return this.a.p();
    }
    
    @j0
    @f2.a
    public Double b() {
        return this.a.q();
    }
    
    @Keep
    public void beginAdUnitExposure(@j0 @u0(min = 1L) final String s) {
        this.a.l(s);
    }
    
    @j0
    @f2.a
    public Integer c() {
        return this.a.s();
    }
    
    @Keep
    @b0
    @f2.a
    public void clearConditionalUserProperty(@j0 @u0(max = 24L, min = 1L) final String s, @j0 final String s2, @j0 final Bundle bundle) {
        this.a.m(s, s2, bundle);
    }
    
    @j0
    @f2.a
    public Long d() {
        return this.a.t();
    }
    
    @j0
    @f2.a
    public String e() {
        return this.a.u();
    }
    
    @Keep
    public void endAdUnitExposure(@j0 @u0(min = 1L) final String s) {
        this.a.o(s);
    }
    
    @c1
    @j0
    @b0
    @f2.a
    public Map<String, Object> f(final boolean b) {
        return this.a.v(b);
    }
    
    @b0
    @f2.a
    public void g(@j0 final String s, @j0 final String s2, @j0 final Bundle bundle, final long n) {
        this.a.e(s, s2, bundle, n);
    }
    
    @Keep
    public long generateEventId() {
        return this.a.zzb();
    }
    
    @Keep
    @j0
    public String getAppInstanceId() {
        return this.a.g();
    }
    
    @Keep
    @c1
    @j0
    @b0
    @f2.a
    public List<ConditionalUserProperty> getConditionalUserProperties(@j0 final String s, @j0 @u0(max = 23L, min = 1L) final String s2) {
        final List<Bundle> c = this.a.c(s, s2);
        int size;
        if (c == null) {
            size = 0;
        }
        else {
            size = c.size();
        }
        final ArrayList list = new ArrayList<ConditionalUserProperty>(size);
        final Iterator<Bundle> iterator = c.iterator();
        while (iterator.hasNext()) {
            list.add(new ConditionalUserProperty(iterator.next()));
        }
        return (List<ConditionalUserProperty>)list;
    }
    
    @Keep
    @j0
    public String getCurrentScreenClass() {
        return this.a.k();
    }
    
    @Keep
    @j0
    public String getCurrentScreenName() {
        return this.a.r();
    }
    
    @Keep
    @j0
    public String getGmpAppId() {
        return this.a.i();
    }
    
    @Keep
    @c1
    @b0
    @f2.a
    public int getMaxUserProperties(@j0 @u0(min = 1L) final String s) {
        return this.a.a(s);
    }
    
    @Keep
    @c1
    @j0
    @d0
    protected Map<String, Object> getUserProperties(@j0 final String s, @j0 @u0(max = 24L, min = 1L) final String s2, final boolean b) {
        return this.a.d(s, s2, b);
    }
    
    @b0
    @f2.a
    public void h(@j0 final b b) {
        this.a.n(b);
    }
    
    @c1
    @b0
    @f2.a
    public void i(@j0 final a a) {
        this.a.j(a);
    }
    
    @b0
    @f2.a
    public void j(@j0 final b b) {
        this.a.b(b);
    }
    
    @Keep
    @b0
    public void logEventInternal(@j0 final String s, @j0 final String s2, @j0 final Bundle bundle) {
        this.a.h(s, s2, bundle);
    }
    
    @Keep
    @b0
    @f2.a
    public void setConditionalUserProperty(@j0 final ConditionalUserProperty conditionalUserProperty) {
        x.k(conditionalUserProperty);
        final e a = this.a;
        final Bundle bundle = new Bundle();
        final String mAppId = conditionalUserProperty.mAppId;
        if (mAppId != null) {
            bundle.putString("app_id", mAppId);
        }
        final String mOrigin = conditionalUserProperty.mOrigin;
        if (mOrigin != null) {
            bundle.putString("origin", mOrigin);
        }
        final String mName = conditionalUserProperty.mName;
        if (mName != null) {
            bundle.putString("name", mName);
        }
        final Object mValue = conditionalUserProperty.mValue;
        if (mValue != null) {
            w5.b(bundle, mValue);
        }
        final String mTriggerEventName = conditionalUserProperty.mTriggerEventName;
        if (mTriggerEventName != null) {
            bundle.putString("trigger_event_name", mTriggerEventName);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        final String mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
        if (mTimedOutEventName != null) {
            bundle.putString("timed_out_event_name", mTimedOutEventName);
        }
        final Bundle mTimedOutEventParams = conditionalUserProperty.mTimedOutEventParams;
        if (mTimedOutEventParams != null) {
            bundle.putBundle("timed_out_event_params", mTimedOutEventParams);
        }
        final String mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
        if (mTriggeredEventName != null) {
            bundle.putString("triggered_event_name", mTriggeredEventName);
        }
        final Bundle mTriggeredEventParams = conditionalUserProperty.mTriggeredEventParams;
        if (mTriggeredEventParams != null) {
            bundle.putBundle("triggered_event_params", mTriggeredEventParams);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        final String mExpiredEventName = conditionalUserProperty.mExpiredEventName;
        if (mExpiredEventName != null) {
            bundle.putString("expired_event_name", mExpiredEventName);
        }
        final Bundle mExpiredEventParams = conditionalUserProperty.mExpiredEventParams;
        if (mExpiredEventParams != null) {
            bundle.putBundle("expired_event_params", mExpiredEventParams);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        a.f(bundle);
    }
    
    @b0
    @f2.a
    public static class ConditionalUserProperty
    {
        @Keep
        @b0
        @f2.a
        public boolean mActive;
        @Keep
        @j0
        @b0
        @f2.a
        public String mAppId;
        @Keep
        @b0
        @f2.a
        public long mCreationTimestamp;
        @Keep
        @j0
        public String mExpiredEventName;
        @Keep
        @j0
        public Bundle mExpiredEventParams;
        @Keep
        @j0
        @b0
        @f2.a
        public String mName;
        @Keep
        @j0
        @b0
        @f2.a
        public String mOrigin;
        @Keep
        @b0
        @f2.a
        public long mTimeToLive;
        @Keep
        @j0
        public String mTimedOutEventName;
        @Keep
        @j0
        public Bundle mTimedOutEventParams;
        @Keep
        @j0
        @b0
        @f2.a
        public String mTriggerEventName;
        @Keep
        @b0
        @f2.a
        public long mTriggerTimeout;
        @Keep
        @j0
        public String mTriggeredEventName;
        @Keep
        @j0
        public Bundle mTriggeredEventParams;
        @Keep
        @b0
        @f2.a
        public long mTriggeredTimestamp;
        @Keep
        @j0
        @b0
        @f2.a
        public Object mValue;
        
        @f2.a
        public ConditionalUserProperty() {
        }
        
        @d0
        ConditionalUserProperty(@j0 final Bundle bundle) {
            x.k(bundle);
            this.mAppId = w5.a(bundle, "app_id", String.class, null);
            this.mOrigin = w5.a(bundle, "origin", String.class, null);
            this.mName = w5.a(bundle, "name", String.class, null);
            this.mValue = w5.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = w5.a(bundle, "trigger_event_name", String.class, null);
            final Long value = 0L;
            this.mTriggerTimeout = w5.a(bundle, "trigger_timeout", Long.class, value);
            this.mTimedOutEventName = w5.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = w5.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = w5.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = w5.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = w5.a(bundle, "time_to_live", Long.class, value);
            this.mExpiredEventName = w5.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = w5.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = w5.a(bundle, "active", Boolean.class, Boolean.FALSE);
            this.mCreationTimestamp = w5.a(bundle, "creation_timestamp", Long.class, value);
            this.mTriggeredTimestamp = w5.a(bundle, "triggered_timestamp", Long.class, value);
        }
        
        @f2.a
        public ConditionalUserProperty(@j0 final ConditionalUserProperty conditionalUserProperty) {
            x.k(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            final Object mValue = conditionalUserProperty.mValue;
            if (mValue != null && (this.mValue = l7.a(mValue)) == null) {
                this.mValue = conditionalUserProperty.mValue;
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            final Bundle mTimedOutEventParams = conditionalUserProperty.mTimedOutEventParams;
            if (mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            final Bundle mTriggeredEventParams = conditionalUserProperty.mTriggeredEventParams;
            if (mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            final Bundle mExpiredEventParams = conditionalUserProperty.mExpiredEventParams;
            if (mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(mExpiredEventParams);
            }
        }
    }
    
    @b0
    @f2.a
    public interface a extends a6
    {
        @c1
        @b0
        @f2.a
        void a(@j0 final String p0, @j0 final String p1, @j0 final Bundle p2, final long p3);
    }
    
    @b0
    @f2.a
    public interface b extends b6
    {
        @c1
        @b0
        @f2.a
        void a(@j0 final String p0, @j0 final String p1, @j0 final Bundle p2, final long p3);
    }
}
