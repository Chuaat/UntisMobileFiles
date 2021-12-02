// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.timetable;

import java.util.ArrayList;
import com.untis.mobile.api.common.messenger.UMMessengerChannel;
import com.untis.mobile.api.enumeration.UMPeriodState;
import com.untis.mobile.api.common.classreg.UMHomeWork;
import com.untis.mobile.api.enumeration.UMPeriodRight;
import java.util.List;
import java.io.Serializable;

public class UMPeriod implements Serializable
{
    public String backColor;
    public List<UMPeriodRight> can;
    public List<UMPeriodElement> elements;
    public String endDateTime;
    public UMPeriodExam exam;
    public String foreColor;
    public List<UMHomeWork> homeWorks;
    public long id;
    public String innerBackColor;
    public String innerForeColor;
    public List<UMPeriodState> is;
    public boolean isOnlinePeriod;
    public long lessonId;
    public UMMessengerChannel messengerChannel;
    public String startDateTime;
    public UMPeriodText text;
    
    public UMPeriod() {
        this.elements = new ArrayList<UMPeriodElement>();
        this.can = new ArrayList<UMPeriodRight>();
        this.is = new ArrayList<UMPeriodState>();
    }
}
