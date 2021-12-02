// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.silentmode;

import java.util.HashSet;
import androidx.annotation.k0;
import java.util.Set;
import java.io.Serializable;

public class SilentModeSettings implements Serializable
{
    public long end;
    public long entityId;
    public String entityName;
    public int entityType;
    public boolean isVibrate;
    @k0
    public Set<Integer> jobIds;
    public int muteOnBreak;
    public int notificationMode;
    public String profileId;
    public String schoolName;
    public long start;
    public int userRingerMode;
    
    public SilentModeSettings() {
        this.profileId = "";
        this.entityName = "";
        this.schoolName = "";
        this.userRingerMode = 2;
    }
    
    public void addJobId(final int i) {
        if (this.jobIds == null) {
            this.jobIds = new HashSet<Integer>();
        }
        this.jobIds.add(i);
    }
    
    public void clearJobIds() {
        final Set<Integer> jobIds = this.jobIds;
        if (jobIds == null) {
            this.jobIds = new HashSet<Integer>();
        }
        else {
            jobIds.clear();
        }
    }
    
    public void deleteJobId(final int i) {
        if (this.jobIds == null) {
            this.jobIds = new HashSet<Integer>();
        }
        this.jobIds.remove(i);
    }
}
