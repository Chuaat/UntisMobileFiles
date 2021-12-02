// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto.legacy;

import java.util.List;
import com.untis.mobile.api.dto.AuthenticatedRequest;

public class SubmitAbsencesRequest extends AuthenticatedRequest
{
    public long periodId;
    public List<JsonStudentPeriodState> studentAbsenceCollection;
}
