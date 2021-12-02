// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.timetable;

import java.util.List;
import java.io.Serializable;

public class UMLesson implements Serializable
{
    public long id;
    public List<Long> klassenIds;
    public long subjectId;
    public List<Long> teacherIds;
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof UMLesson)) {
            return false;
        }
        if (this.id != ((UMLesson)o).id) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        final long id = this.id;
        return (int)(id ^ id >>> 32);
    }
}
