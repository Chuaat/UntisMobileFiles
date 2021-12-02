// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import com.untis.mobile.api.enumeration.DefaultAbsenceEndTime;
import java.io.Serializable;

public class UMSettings implements Serializable
{
    public boolean absenceCheckRequired;
    public String customAbsenceEndTime;
    public DefaultAbsenceEndTime defaultAbsenceEndTime;
    public long defaultAbsenceReasonId;
    public long defaultLatenessReasonId;
    public boolean showAbsenceReason;
    public boolean showAbsenceText;
    public boolean showCalendarDetails;
}
