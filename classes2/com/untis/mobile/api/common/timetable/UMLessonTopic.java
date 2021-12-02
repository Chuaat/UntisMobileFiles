// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.timetable;

import com.untis.mobile.api.common.UMDriveFileDescriptor;
import java.util.List;
import java.io.Serializable;

public class UMLessonTopic implements Serializable
{
    public List<UMDriveFileDescriptor> attachments;
    public String endDateTime;
    public long periodId;
    public String startDateTime;
    public long teachingMethodId;
    public String text;
}
