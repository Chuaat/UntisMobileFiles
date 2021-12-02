// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import com.untis.mobile.api.common.UMAuthenticationToken;
import java.io.Serializable;

public abstract class AuthenticatedRequest implements Serializable
{
    public UMAuthenticationToken auth;
}
