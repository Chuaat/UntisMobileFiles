// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import android.util.Log;
import rx.g;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.j0;
import android.content.Context;

public class DynamicApiCallCreator<Result>
{
    @j0
    private final Context context;
    @j0
    private final DynamicApiCall<Result> dynamicApiCall;
    @j0
    private Profile profile;
    
    private DynamicApiCallCreator(@j0 final Context context, @j0 final Profile profile, @j0 final DynamicApiCall<Result> dynamicApiCall) {
        this.context = context;
        this.profile = profile;
        this.dynamicApiCall = dynamicApiCall;
    }
    
    @j0
    public static <Result> DynamicApiCallCreator<Result> dynamicApiCall(@j0 final Context context, @j0 final Profile profile, @j0 final DynamicApiCall<Result> dynamicApiCall) {
        return new DynamicApiCallCreator<Result>(context, profile, dynamicApiCall);
    }
    
    @j0
    public g<JsonRpcResponse<Result>> call() {
        try {
            final Profile l = com.untis.mobile.services.profile.legacy.j0.G.l(this.profile.getUniqueId());
            if (l != null) {
                return this.dynamicApiCall.create(l);
            }
        }
        catch (Exception ex) {
            Log.e("untis_log", "error on call", (Throwable)ex);
        }
        return this.dynamicApiCall.create(this.profile);
    }
    
    @j0
    public g<JsonRpcResponse<Result>> call(final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("setting profile deltatime to '");
        sb.append(n);
        sb.append("'");
        Log.d("untis_log", sb.toString());
        Profile profile;
        try {
            profile = com.untis.mobile.services.profile.legacy.j0.G.l(this.profile.getUniqueId());
        }
        catch (Exception ex) {
            profile = this.profile;
        }
        Profile profile2 = profile;
        if (profile == null) {
            profile2 = this.profile;
        }
        profile2.setSchoolServerDelta(n);
        com.untis.mobile.services.profile.legacy.j0.G.d(profile2);
        return this.dynamicApiCall.create(profile2);
    }
    
    @j0
    public Profile getProfile() {
        return this.profile;
    }
    
    public interface DynamicApiCall<Result>
    {
        @j0
        g<JsonRpcResponse<Result>> create(@j0 final Profile p0);
    }
}
