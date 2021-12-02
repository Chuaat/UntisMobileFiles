// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.injection.component;

import com.untis.mobile.utils.jsonadapter.MoshiJodaTimeAdapter;
import com.squareup.moshi.h;
import com.squareup.moshi.kotlin.reflect.b;
import com.squareup.moshi.x;
import kotlin.jvm.internal.k0;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b" }, d2 = { "Lcom/untis/mobile/injection/component/a;", "", "Lcom/google/gson/Gson;", "a", "Lcom/squareup/moshi/x;", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @e
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    @e
    public final Gson a() {
        final Gson create = new GsonBuilder().enableComplexMapKeySerialization().create();
        k0.o(create, "GsonBuilder()\n            .enableComplexMapKeySerialization()\n            .create()");
        return create;
    }
    
    @e
    public final x b() {
        final x i = new x.c().a(new b()).b(new MoshiJodaTimeAdapter()).i();
        k0.o(i, "Builder()\n            .add(KotlinJsonAdapterFactory())\n            .add(MoshiJodaTimeAdapter())\n            .build()");
        return i;
    }
}
