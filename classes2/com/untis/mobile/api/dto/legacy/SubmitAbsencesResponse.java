// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto.legacy;

import com.untis.mobile.api.common.absence.UMStudentAbsence;
import java.util.List;
import java.io.Serializable;

public class SubmitAbsencesResponse implements Serializable
{
    public List<UMStudentAbsence> absences;
    public boolean success;
}
