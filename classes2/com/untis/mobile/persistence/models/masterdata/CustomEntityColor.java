// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.masterdata;

import org.jetbrains.annotations.e;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.Entity;
import java.io.Serializable;

public class CustomEntityColor implements Serializable, Entity
{
    private int backColor;
    private long entityId;
    @j0
    private EntityType entityType;
    private int textColor;
    
    public CustomEntityColor() {
        this(EntityType.NONE, 0L, -12303292, 0);
    }
    
    public CustomEntityColor(@j0 final EntityType entityType, final long entityId, final int textColor, final int backColor) {
        this.entityType = entityType;
        this.entityId = entityId;
        this.textColor = textColor;
        this.backColor = backColor;
    }
    
    @Override
    public long entityId() {
        return this.entityId;
    }
    
    @e
    @Override
    public EntityType entityType() {
        return this.entityType;
    }
    
    public int getBackColor() {
        return this.backColor;
    }
    
    public long getEntityId() {
        return this.entityId;
    }
    
    @j0
    public EntityType getEntityType() {
        return this.entityType;
    }
    
    public int getTextColor() {
        return this.textColor;
    }
    
    public void setBackColor(final int backColor) {
        this.backColor = backColor;
    }
    
    public void setEntityId(final long entityId) {
        this.entityId = entityId;
    }
    
    public void setEntityType(@j0 final EntityType entityType) {
        this.entityType = entityType;
    }
    
    public void setTextColor(final int textColor) {
        this.textColor = textColor;
    }
}
