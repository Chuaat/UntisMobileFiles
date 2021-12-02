// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import com.untis.mobile.api.common.UMTimetable;
import com.untis.mobile.api.common.UMMasterData;
import java.io.Serializable;

public class GetTimetableResponse implements Serializable
{
    public UMMasterData masterData;
    public UMTimetable timetable;
}
