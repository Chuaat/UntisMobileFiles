// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import com.untis.mobile.utils.h0;
import androidx.annotation.j0;
import java.util.Iterator;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import com.untis.mobile.api.common.UMDriveFileDescriptor;
import java.util.List;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import com.untis.mobile.api.common.timetable.UMPeriodText;
import com.untis.mobile.utils.mapper.common.b;

public class m extends b<UMPeriodText, PeriodInfo>
{
    private final long a;
    
    private m(final long a) {
        this.a = a;
    }
    
    @j0
    private List<DriveAttachment> j(final List<UMDriveFileDescriptor> list) {
        final ArrayList<DriveAttachment> list2 = new ArrayList<DriveAttachment>();
        if (list == null) {
            return list2;
        }
        for (final UMDriveFileDescriptor umDriveFileDescriptor : list) {
            list2.add(new DriveAttachment(umDriveFileDescriptor.id, umDriveFileDescriptor.name, umDriveFileDescriptor.url));
        }
        return list2;
    }
    
    public static m k(final long n) {
        return new m(n);
    }
    
    @j0
    public PeriodInfo i(@j0 final UMPeriodText umPeriodText) {
        return new PeriodInfo(this.a, h0.f(umPeriodText.info), h0.f(umPeriodText.substitution), h0.f(umPeriodText.lesson), "", true, this.j(umPeriodText.attachments));
    }
}
