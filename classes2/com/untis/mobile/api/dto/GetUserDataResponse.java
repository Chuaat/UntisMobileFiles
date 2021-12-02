// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import com.untis.mobile.api.common.UMUserData;
import com.untis.mobile.api.common.UMSettings;
import com.untis.mobile.api.common.messenger.UMMessengerSettings;
import com.untis.mobile.api.common.UMMasterData;
import java.io.Serializable;

public class GetUserDataResponse implements Serializable
{
    public UMMasterData masterData;
    public UMMessengerSettings messengerSettings;
    public UMSettings settings;
    public UMUserData userData;
}
