// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import androidx.annotation.j0;

public enum JsonRpcErrorType
{
    AccessDenied(-42000), 
    AccessDeniedApp(-42002), 
    AccessDeniedCustom(-42001), 
    AccessDeniedServerMaintenance(-42003), 
    ApiKeyChangedAndWorkingOffline(-50001), 
    AuthenticationError(-8521), 
    InvalidClientTime(-8524), 
    InvalidDate(-7004), 
    InvalidElementId(-7002), 
    InvalidPassword(-8504), 
    InvalidPersonType(-7003), 
    InvalidSchool(-8500), 
    InvalidTimeTableType(-7001), 
    InvalidUserRole(-8526), 
    InvalidUserStatus(-8525), 
    LockedAccess(-8511), 
    MethodNotFound(-32601), 
    NoPeriod(-8508), 
    NoPublicAccess(-8523), 
    NoResult(10000), 
    NoRight(-8509), 
    NoSpecifiedUser(-8502), 
    NoSuccess(9000), 
    RequestPasswordResetEmailCouldNotBeSend(-7512), 
    RequestPasswordResetInvalidCredentials(-7510), 
    RequestPasswordResetNoResetAllowed(-7511), 
    Require2FactorAuthenticationToken(-8519), 
    RequiredAuthentication(-8520), 
    RollBackToLegacyApi(-42100), 
    TooManySchoolSearchResults(-6003), 
    UnspecifiedError(-8998);
    
    private final int code;
    
    private JsonRpcErrorType(final int code) {
        this.code = code;
    }
    
    @j0
    public static JsonRpcErrorType getJsonRpcErrorTypeFrom(final int n) {
        for (final JsonRpcErrorType jsonRpcErrorType : values()) {
            if (n == jsonRpcErrorType.getCode()) {
                return jsonRpcErrorType;
            }
        }
        return JsonRpcErrorType.UnspecifiedError;
    }
    
    public int getCode() {
        return this.code;
    }
}
