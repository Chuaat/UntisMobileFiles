// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import com.untis.mobile.api.enumeration.ElementType;

public class GetHomeWorkRequest extends AuthenticatedRequest
{
    public String endDate;
    public long id;
    public String startDate;
    public ElementType type;
}
