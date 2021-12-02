// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.android.ext.koin;

import android.content.Context;
import kotlin.reflect.d;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.k0;
import android.app.Application;
import org.koin.core.scope.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\"\u0016\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\b" }, d2 = { "Lorg/koin/core/scope/a;", "Landroid/content/Context;", "b", "Landroid/app/Application;", "a", "", "Ljava/lang/String;", "ERROR_MSG", "koin-android_release" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    @e
    public static final String a = "Please use androidContext() function in your KoinApplication configuration.";
    
    @e
    public static final Application a(@e final a a) {
        k0.q((Object)a, "$this$androidApplication");
        try {
            return a.t((d<?>)k1.d((Class)Application.class), null, null);
        }
        catch (Exception ex) {
            throw new i7.a("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
    
    @e
    public static final Context b(@e final a a) {
        k0.q((Object)a, "$this$androidContext");
        try {
            return a.t((d<?>)k1.d((Class)Context.class), null, null);
        }
        catch (Exception ex) {
            throw new i7.a("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
