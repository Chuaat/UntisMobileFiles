// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToModel;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import com.untis.mobile.api.common.UMDriveFileDescriptor;
import com.untis.mobile.utils.mapper.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b" }, d2 = { "Lcom/untis/mobile/utils/mapper/apiToModel/f;", "Lcom/untis/mobile/utils/mapper/common/b;", "Lcom/untis/mobile/api/common/UMDriveFileDescriptor;", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "source", "i", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f extends b<UMDriveFileDescriptor, DriveAttachment>
{
    @e
    public static final f a;
    
    static {
        a = new f();
    }
    
    private f() {
    }
    
    @e
    public DriveAttachment i(@e final UMDriveFileDescriptor umDriveFileDescriptor) {
        k0.p(umDriveFileDescriptor, "source");
        final long id = umDriveFileDescriptor.id;
        final String name = umDriveFileDescriptor.name;
        final String s = "";
        String s2 = name;
        if (name == null) {
            s2 = "";
        }
        String url = umDriveFileDescriptor.url;
        if (url == null) {
            url = s;
        }
        return new DriveAttachment(id, s2, url);
    }
}
