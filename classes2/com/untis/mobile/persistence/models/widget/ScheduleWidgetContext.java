// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.widget;

import java.util.ArrayList;
import java.util.List;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.EntityType;

public class ScheduleWidgetContext
{
    public long entityId;
    public String entityName;
    public EntityType entityType;
    @k0
    public String isoEnd;
    @k0
    public String isoStart;
    public long lastUpdate;
    public List<Long> periodIds;
    public String profileId;
    public String schoolName;
    public int widgetId;
    
    public ScheduleWidgetContext() {
        this.periodIds = new ArrayList<Long>();
    }
}
