// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.ktx;

import org.jetbrains.annotations.f;
import android.content.Context;
import com.google.firebase.o;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001a\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b\u001a\"\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001\"\u0017\u0010\t\u001a\u00020\b*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0010\u001a\u00020\u0003*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0012\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0013" }, d2 = { "Lcom/google/firebase/ktx/b;", "", "name", "Lcom/google/firebase/e;", "a", "Landroid/content/Context;", "context", "d", "Lcom/google/firebase/o;", "options", "e", "f", "c", "(Lcom/google/firebase/ktx/b;)Lcom/google/firebase/o;", "b", "(Lcom/google/firebase/ktx/b;)Lcom/google/firebase/e;", "app", "Ljava/lang/String;", "LIBRARY_NAME", "com.google.firebase-firebase-common-ktx" }, k = 2, mv = { 1, 4, 0 })
public final class c
{
    @e
    public static final String a = "fire-core-ktx";
    
    @e
    public static final com.google.firebase.e a(@e final b b, @e final String s) {
        k0.q(b, "receiver$0");
        k0.q(s, "name");
        final com.google.firebase.e p2 = com.google.firebase.e.p(s);
        k0.h(p2, "FirebaseApp.getInstance(name)");
        return p2;
    }
    
    @e
    public static final com.google.firebase.e b(@e final b b) {
        k0.q(b, "receiver$0");
        final com.google.firebase.e o = com.google.firebase.e.o();
        k0.h(o, "FirebaseApp.getInstance()");
        return o;
    }
    
    @e
    public static final o c(@e final b b) {
        k0.q(b, "receiver$0");
        final o r = b(b.a).r();
        k0.h(r, "Firebase.app.options");
        return r;
    }
    
    @f
    public static final com.google.firebase.e d(@e final b b, @e final Context context) {
        k0.q(b, "receiver$0");
        k0.q(context, "context");
        return com.google.firebase.e.w(context);
    }
    
    @e
    public static final com.google.firebase.e e(@e final b b, @e final Context context, @e final o o) {
        k0.q(b, "receiver$0");
        k0.q(context, "context");
        k0.q(o, "options");
        final com.google.firebase.e x = com.google.firebase.e.x(context, o);
        k0.h(x, "FirebaseApp.initializeApp(context, options)");
        return x;
    }
    
    @e
    public static final com.google.firebase.e f(@e final b b, @e final Context context, @e final o o, @e final String s) {
        k0.q(b, "receiver$0");
        k0.q(context, "context");
        k0.q(o, "options");
        k0.q(s, "name");
        final com.google.firebase.e y = com.google.firebase.e.y(context, o, s);
        k0.h(y, "FirebaseApp.initializeApp(context, options, name)");
        return y;
    }
}
