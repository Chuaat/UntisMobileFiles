// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.api;

import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import com.untis.mobile.api.common.UMDriveFileDescriptor;

public class b extends com.untis.mobile.utils.mapper.common.b<UMDriveFileDescriptor, DriveAttachment>
{
    @j0
    private static final b a;
    
    static {
        a = new b();
    }
    
    private b() {
    }
    
    @j0
    public static com.untis.mobile.utils.mapper.common.b<UMDriveFileDescriptor, DriveAttachment> j() {
        return b.a;
    }
    
    @k0
    public DriveAttachment i(@j0 final UMDriveFileDescriptor umDriveFileDescriptor) {
        return new DriveAttachment(umDriveFileDescriptor.id, h0.f(umDriveFileDescriptor.name), h0.f(umDriveFileDescriptor.url));
    }
}
