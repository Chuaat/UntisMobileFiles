// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.profile;

import java.util.ArrayList;
import java.util.HashSet;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.SimpleEntity;
import java.util.List;
import androidx.annotation.k0;
import java.util.Set;

public class LegacyProfile
{
    @k0
    public Set<Right> can;
    @k0
    public List<LegacyChild> children;
    public long department;
    @k0
    public String displayName;
    @k0
    public List<SimpleEntity> existingPersonTimetables;
    public long id;
    @k0
    public String key;
    @k0
    public List<Long> klassenIds;
    public long lastOfficeHoursLoaded;
    public long lastParentDayLoaded;
    public long lastPeriodDataSync;
    public long lastWidgetUpdate;
    public long masterDataTimestamp;
    @k0
    public String mobileServiceUrl;
    @k0
    public EntityType profileType;
    @k0
    public String school;
    @k0
    public String schoolDisplayName;
    public long schoolId;
    public long serverDelta;
    @k0
    public String serverUrl;
    public boolean updateDone;
    public boolean useMobileServiceUrlAndroid;
    @k0
    public String user;
    
    public LegacyProfile() {
        this.id = -1L;
        this.updateDone = true;
        this.can = new HashSet<Right>();
        this.children = new ArrayList<LegacyChild>();
        this.existingPersonTimetables = new ArrayList<SimpleEntity>();
        this.klassenIds = new ArrayList<Long>();
        this.lastOfficeHoursLoaded = 0L;
        this.lastParentDayLoaded = 0L;
        this.lastWidgetUpdate = 0L;
    }
}
