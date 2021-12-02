// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

public final class x
{
    public static final String a = "https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch";
    
    private x() {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final String N0 = "experimentId";
        public static final String O0 = "variantId";
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final String P0 = "appInstanceId";
        public static final String Q0 = "appInstanceIdToken";
        public static final String R0 = "appId";
        public static final String S0 = "countryCode";
        public static final String T0 = "languageCode";
        public static final String U0 = "platformVersion";
        public static final String V0 = "timeZone";
        public static final String W0 = "appVersion";
        public static final String X0 = "packageName";
        public static final String Y0 = "sdkVersion";
        public static final String Z0 = "analyticsUserProperties";
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
        public static final String a1 = "entries";
        public static final String b1 = "experimentDescriptions";
        public static final String c1 = "personalizationMetadata";
        public static final String d1 = "state";
    }
}
