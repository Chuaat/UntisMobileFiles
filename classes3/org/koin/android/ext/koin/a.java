// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.android.ext.koin;

import android.content.res.AssetManager;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.j2;
import java.io.InputStream;
import kotlin.collections.m;
import java.util.Properties;
import android.app.Application;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import n6.p;
import org.koin.core.definition.d;
import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.e;
import org.koin.core.b;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007¨\u0006\n" }, d2 = { "Lorg/koin/core/b;", "Lorg/koin/core/logger/b;", "level", "d", "Landroid/content/Context;", "androidContext", "a", "", "koinPropertyFile", "b", "koin-android_release" }, k = 2, mv = { 1, 4, 0 })
public final class a
{
    @e
    public static final b a(@e final b b, @e final Context context) {
        k0.q((Object)b, "$this$androidContext");
        k0.q((Object)context, "androidContext");
        final b.a c = b.c;
        if (c.b().e(org.koin.core.logger.b.H)) {
            c.b().d("[init] declare Android Context");
        }
        final m7.a a = b.j().y().A();
        final d a2 = d.a;
        final p<org.koin.core.scope.a, org.koin.core.parameter.a, Context> p2 = (p<org.koin.core.scope.a, org.koin.core.parameter.a, Context>)new p<org.koin.core.scope.a, org.koin.core.parameter.a, Context>() {
            @e
            public final Context a(@e final org.koin.core.scope.a a, @e final org.koin.core.parameter.a a2) {
                k0.q((Object)a, "$receiver");
                k0.q((Object)a2, "it");
                return context;
            }
        };
        final org.koin.core.definition.e g = org.koin.core.definition.e.G;
        final org.koin.core.definition.b<Object> b2 = new org.koin.core.definition.b<Object>(null, null, (kotlin.reflect.d<?>)k1.d((Class)Context.class));
        b2.p((n6.p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ?>)p2);
        b2.r(g);
        a.t(b2);
        if (context instanceof Application) {
            final m7.a a3 = b.j().y().A();
            final p<org.koin.core.scope.a, org.koin.core.parameter.a, Application> p3 = (p<org.koin.core.scope.a, org.koin.core.parameter.a, Application>)new p<org.koin.core.scope.a, org.koin.core.parameter.a, Application>() {
                @e
                public final Application a(@e final org.koin.core.scope.a a, @e final org.koin.core.parameter.a a2) {
                    k0.q((Object)a, "$receiver");
                    k0.q((Object)a2, "it");
                    return (Application)context;
                }
            };
            final org.koin.core.definition.b<Object> b3 = new org.koin.core.definition.b<Object>(null, null, (kotlin.reflect.d<?>)k1.d((Class)Application.class));
            b3.p((n6.p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ?>)p3);
            b3.r(g);
            a3.t(b3);
        }
        return b;
    }
    
    @e
    public static final b b(@e final b b, @e final String s) {
        k0.q((Object)b, "$this$androidFileProperties");
        k0.q((Object)s, "koinPropertyFile");
        final Properties properties = new Properties();
        final Context context = b.j().y().t((kotlin.reflect.d<?>)k1.d((Class)Context.class), null, null);
        try {
            final AssetManager assets = context.getAssets();
            boolean p = false;
            Label_0080: {
                if (assets != null) {
                    final String[] list = assets.list("");
                    if (list != null) {
                        p = m.P7((Object[])list, (Object)s);
                        break Label_0080;
                    }
                }
                p = false;
            }
            if (p) {
                try {
                    Object inStream = context.getAssets().open(s);
                    try {
                        properties.load((InputStream)inStream);
                        final j2 a = j2.a;
                        c.a((Closeable)inStream, (Throwable)null);
                        b.j().x().g(properties);
                        final b.a c = b.c;
                        if (c.b().e(org.koin.core.logger.b.H)) {
                            inStream = c.b();
                            final StringBuilder sb = new StringBuilder();
                            sb.append("[Android-Properties] loaded ");
                            sb.append(a);
                            sb.append(" properties from assets/koin.properties");
                            ((org.koin.core.logger.c)inStream).d(sb.toString());
                            return b;
                        }
                        return b;
                    }
                    finally {
                        try {}
                        finally {
                            c.a((Closeable)inStream, (Throwable)s);
                        }
                    }
                }
                catch (Exception obj) {
                    final org.koin.core.logger.c b2 = b.c.b();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("[Android-Properties] error for binding properties : ");
                    sb2.append(obj);
                    b2.b(sb2.toString());
                    return b;
                }
            }
            final b.a c2 = b.c;
            if (c2.b().e(org.koin.core.logger.b.H)) {
                c2.b().d("[Android-Properties] no assets/koin.properties file to load");
            }
        }
        catch (Exception obj2) {
            final org.koin.core.logger.c b3 = b.c.b();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("[Android-Properties] error while loading properties from assets/koin.properties : ");
            sb3.append(obj2);
            b3.b(sb3.toString());
        }
        return b;
    }
    
    @e
    public static final b d(@e final b b, @e final org.koin.core.logger.b b2) {
        k0.q((Object)b, "$this$androidLogger");
        k0.q((Object)b2, "level");
        b.c.c(new org.koin.android.logger.b(b2));
        return b;
    }
}
