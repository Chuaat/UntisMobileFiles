// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.widget;

import androidx.annotation.j0;
import com.untis.mobile.persistence.models.EntityType;
import java.io.Serializable;

public class ScheduleLinkWidgetContext implements Serializable
{
    private long entityId;
    @j0
    private EntityType entityType;
    @j0
    private String profileId;
    private int widgetId;
    
    public ScheduleLinkWidgetContext() {
        this.profileId = "";
        this.entityType = EntityType.NONE;
    }
    
    public ScheduleLinkWidgetContext(final int widgetId, @j0 final String profileId, @j0 final EntityType entityType, final long entityId) {
        this.widgetId = widgetId;
        this.profileId = profileId;
        this.entityType = entityType;
        this.entityId = entityId;
    }
    
    public long getEntityId() {
        return this.entityId;
    }
    
    @j0
    public EntityType getEntityType() {
        return this.entityType;
    }
    
    @j0
    public String getProfileId() {
        return this.profileId;
    }
    
    public int getWidgetId() {
        return this.widgetId;
    }
    
    public void setEntityId(final long entityId) {
        this.entityId = entityId;
    }
    
    public void setEntityType(@j0 final EntityType entityType) {
        this.entityType = entityType;
    }
    
    public void setProfileId(@j0 final String profileId) {
        this.profileId = profileId;
    }
    
    public void setWidgetId(final int widgetId) {
        this.widgetId = widgetId;
    }
}
