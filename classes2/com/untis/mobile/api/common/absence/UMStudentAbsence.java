// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.absence;

import com.untis.mobile.api.common.masterdata.UMExcuse;
import java.io.Serializable;

public class UMStudentAbsence implements Serializable
{
    public String absenceReason;
    public long absenceReasonId;
    public String endDateTime;
    public UMExcuse excuse;
    public boolean excused;
    public long id;
    public long klasseId;
    public boolean owner;
    public String startDateTime;
    public long studentId;
    public String text;
}
