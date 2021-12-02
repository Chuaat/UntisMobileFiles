// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.classreg;

import com.untis.mobile.api.common.UMDriveFileDescriptor;
import java.util.List;
import java.io.Serializable;

public class UMHomeWork implements Serializable
{
    public List<UMDriveFileDescriptor> attachments;
    public boolean completed;
    public String endDate;
    public long id;
    public long lessonId;
    public String remark;
    public String startDate;
    public String text;
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            if (this.id != ((UMHomeWork)o).id) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long id = this.id;
        return (int)(id ^ id >>> 32);
    }
}
