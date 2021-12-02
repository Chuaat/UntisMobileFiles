// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.api;

import com.google.gson.Gson;
import com.untis.mobile.injection.component.b;
import retrofit2.f$a;
import com.untis.mobile.persistence.models.profile.Profile;
import retrofit2.u$b;
import com.google.gson.GsonBuilder;
import android.content.Context;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.utils.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "Lcom/untis/mobile/messages/api/MessagesApiProvider;", "", "Landroid/content/Context;", "context", "Lcom/untis/mobile/messages/api/MessagesApi;", "getMessagesApi", "Lcom/untis/mobile/messages/api/SendMessageApi;", "getSendMessageApi", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/services/profile/legacy/a;", "Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/utils/a;", "<init>", "(Lcom/untis/mobile/utils/a;Lcom/untis/mobile/services/profile/legacy/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessagesApiProvider
{
    @e
    private final a appSettings;
    @e
    private final com.untis.mobile.services.profile.legacy.a profileService;
    
    public MessagesApiProvider(@e final a appSettings, @e final com.untis.mobile.services.profile.legacy.a profileService) {
        k0.p(appSettings, "appSettings");
        k0.p(profileService, "profileService");
        this.appSettings = appSettings;
        this.profileService = profileService;
    }
    
    @e
    public final MessagesApi getMessagesApi(@e final Context context) {
        k0.p(context, "context");
        final Gson create = new GsonBuilder().create();
        final u$b u$b = new u$b();
        final Profile i = this.appSettings.i();
        k0.o(i, "appSettings.currentProfile");
        final u$b b = u$b.c(Profile.getWuRestApiUrl$default(i, null, 1, null)).b((f$a)retrofit2.converter.gson.a.g(create));
        final b a = com.untis.mobile.injection.component.b.a;
        final Profile j = this.appSettings.i();
        k0.o(j, "appSettings.currentProfile");
        k0.o(create, "gson");
        final Object g = b.j(a.e(context, j, create, this.profileService)).f().g((Class)MessagesApi.class);
        k0.o(g, "Builder()\n                .baseUrl(appSettings.currentProfile.getWuRestApiUrl())\n                .addConverterFactory(GsonConverterFactory.create(gson))\n                .client(OkHttpClientComponent.createCalendarApiClient(context, appSettings.currentProfile, gson, profileService))\n                .build()\n                .create(MessagesApi::class.java)");
        return (MessagesApi)g;
    }
    
    @e
    public final SendMessageApi getSendMessageApi(@e final Context context) {
        k0.p(context, "context");
        final Gson create = new GsonBuilder().create();
        final u$b u$b = new u$b();
        final Profile i = this.appSettings.i();
        k0.o(i, "appSettings.currentProfile");
        final u$b b = u$b.c(Profile.getWuRestApiUrl$default(i, null, 1, null)).b((f$a)retrofit2.converter.gson.a.g(create));
        final b a = com.untis.mobile.injection.component.b.a;
        final Profile j = this.appSettings.i();
        k0.o(j, "appSettings.currentProfile");
        k0.o(create, "gson");
        final Object g = b.j(a.e(context, j, create, this.profileService)).f().g((Class)SendMessageApi.class);
        k0.o(g, "Builder()\n                .baseUrl(appSettings.currentProfile.getWuRestApiUrl())\n                .addConverterFactory(GsonConverterFactory.create(gson))\n                .client(OkHttpClientComponent.createCalendarApiClient(context, appSettings.currentProfile, gson, profileService))\n                .build()\n                .create(SendMessageApi::class.java)");
        return (SendMessageApi)g;
    }
}
