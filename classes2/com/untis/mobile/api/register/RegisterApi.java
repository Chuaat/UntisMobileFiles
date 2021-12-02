// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.register;

import retrofit2.u$b;
import kotlin.jvm.internal.k0;
import okhttp3.c0;
import retrofit2.f$a;
import retrofit2.c$a;
import p7.o;
import p7.h;
import retrofit2.t;
import rx.g;
import p7.a;
import com.untis.mobile.api.common.MobileDeviceDTO;
import p7.i;
import p7.y;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/api/register/RegisterApi;", "", "", "url", "authorization", "Lcom/untis/mobile/api/common/MobileDeviceDTO;", "mobileDeviceDTO", "Lrx/g;", "Lcom/untis/mobile/api/register/RegisterMobileDeviceDtoResult;", "registerMobileDeviceDto", "Lretrofit2/t;", "Ljava/lang/Void;", "deregisterMobileDeviceDto", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface RegisterApi
{
    @e
    public static final Companion Companion = RegisterApi.Companion.$$INSTANCE;
    
    @h(hasBody = true, method = "DELETE")
    @e
    g<t<Void>> deregisterMobileDeviceDto(@y @e final String p0, @i("Authorization") @e final String p1, @a @e final MobileDeviceDTO p2);
    
    @o
    @e
    g<RegisterMobileDeviceDtoResult> registerMobileDeviceDto(@y @e final String p0, @i("Authorization") @e final String p1, @a @e final MobileDeviceDTO p2);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/api/register/RegisterApi$Companion;", "", "Lretrofit2/c$a;", "callAdapterFactory", "Lretrofit2/f$a;", "converterFactory", "Lokhttp3/c0;", "client", "Lcom/untis/mobile/api/register/RegisterApi;", "newInstance", "", "HEADER_AUTHORIZATION", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        static final /* synthetic */ Companion $$INSTANCE;
        @e
        private static final String HEADER_AUTHORIZATION = "Authorization";
        
        static {
            $$INSTANCE = new Companion();
        }
        
        private Companion() {
        }
        
        @e
        public final RegisterApi newInstance(@e final c$a c$a, @e final f$a f$a, @e final c0 c0) {
            k0.p(c$a, "callAdapterFactory");
            k0.p(f$a, "converterFactory");
            k0.p(c0, "client");
            final Object g = new u$b().c("https://www.untis.at").a(c$a).b(f$a).j(c0).f().g((Class)RegisterApi.class);
            k0.o(g, "Builder()\n                    .baseUrl(\"https://www.untis.at\")\n                    .addCallAdapterFactory(callAdapterFactory)\n                    .addConverterFactory(converterFactory)\n                    .client(client)\n                    .build()\n                    .create(RegisterApi::class.java)");
            return (RegisterApi)g;
        }
    }
}
