// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase;

import com.google.firebase.platforminfo.e;
import com.google.firebase.platforminfo.h$a;
import android.os.Build;
import com.google.firebase.heartbeatinfo.h;
import com.google.firebase.platforminfo.c;
import java.util.ArrayList;
import com.google.firebase.components.f;
import java.util.List;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import com.google.firebase.components.k;

public class FirebaseCommonRegistrar implements k
{
    private static final String a = "fire-android";
    private static final String b = "fire-core";
    private static final String c = "device-name";
    private static final String d = "device-model";
    private static final String e = "device-brand";
    private static final String f = "android-target-sdk";
    private static final String g = "android-min-sdk";
    private static final String h = "android-platform";
    private static final String i = "android-installer";
    private static final String j = "kotlin";
    
    private static String i(final String s) {
        return s.replace(' ', '_').replace('/', '_');
    }
    
    @Override
    public List<f<?>> getComponents() {
        final ArrayList<f> list = (ArrayList<f>)new ArrayList<f<?>>();
        list.add(com.google.firebase.platforminfo.c.c());
        list.add(com.google.firebase.heartbeatinfo.h.i());
        list.add(com.google.firebase.platforminfo.h.b("fire-android", String.valueOf(Build$VERSION.SDK_INT)));
        list.add(com.google.firebase.platforminfo.h.b("fire-core", "20.0.0"));
        list.add(com.google.firebase.platforminfo.h.b("device-name", i(Build.PRODUCT)));
        list.add(com.google.firebase.platforminfo.h.b("device-model", i(Build.DEVICE)));
        list.add(com.google.firebase.platforminfo.h.b("device-brand", i(Build.BRAND)));
        list.add(com.google.firebase.platforminfo.h.c("android-target-sdk", (h$a)com.google.firebase.h.a));
        list.add(com.google.firebase.platforminfo.h.c("android-min-sdk", (h$a)com.google.firebase.i.a));
        list.add(com.google.firebase.platforminfo.h.c("android-platform", (h$a)com.google.firebase.j.a));
        list.add(com.google.firebase.platforminfo.h.c("android-installer", (h$a)com.google.firebase.g.a));
        final String a = com.google.firebase.platforminfo.e.a();
        if (a != null) {
            list.add(com.google.firebase.platforminfo.h.b("kotlin", a));
        }
        return (List<f<?>>)list;
    }
}
