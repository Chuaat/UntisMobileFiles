// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import com.untis.mobile.api.enumeration.ElementType;
import com.untis.mobile.api.enumeration.DeviceOs;

public class GetUserDataRequest extends AuthenticatedRequest
{
    public String currentFcmToken;
    public DeviceOs deviceOs;
    public String deviceOsVersion;
    public long elementId;
    public ElementType elementType;
    public String imei;
    public String oldFcmToken;
}
