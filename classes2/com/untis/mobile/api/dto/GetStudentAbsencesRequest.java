// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

public class GetStudentAbsencesRequest extends AuthenticatedRequest
{
    public String endDate;
    public boolean includeExcused;
    public boolean includeUnExcused;
    public String startDate;
}
