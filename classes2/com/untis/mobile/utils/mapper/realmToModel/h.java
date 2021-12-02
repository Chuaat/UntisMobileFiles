// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import o4.a;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import com.untis.mobile.api.common.UMDriveFileDescriptor;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/h;", "", "Lo4/a;", "realmDriveAttachment", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "b", "driveAttachment", "d", "Lcom/untis/mobile/api/common/UMDriveFileDescriptor;", "umDriveFileDescriptor", "c", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h
{
    @e
    public static final h a;
    
    static {
        a = new h();
    }
    
    private h() {
    }
    
    @e
    public final DriveAttachment a(@e final UMDriveFileDescriptor umDriveFileDescriptor) {
        k0.p(umDriveFileDescriptor, "umDriveFileDescriptor");
        final long id = umDriveFileDescriptor.id;
        final String url = umDriveFileDescriptor.url;
        final String s = "";
        String s2 = url;
        if (url == null) {
            s2 = "";
        }
        String name = umDriveFileDescriptor.name;
        if (name == null) {
            name = s;
        }
        return new DriveAttachment(id, name, s2);
    }
    
    @e
    public final DriveAttachment b(@e final a a) {
        k0.p(a, "realmDriveAttachment");
        return new DriveAttachment(a.s8(), a.t8(), a.u8());
    }
    
    @e
    public final a c(@e final UMDriveFileDescriptor umDriveFileDescriptor) {
        k0.p(umDriveFileDescriptor, "umDriveFileDescriptor");
        final long id = umDriveFileDescriptor.id;
        final String url = umDriveFileDescriptor.url;
        final String s = "";
        String s2 = url;
        if (url == null) {
            s2 = "";
        }
        String name = umDriveFileDescriptor.name;
        if (name == null) {
            name = s;
        }
        return new a(id, name, s2);
    }
    
    @e
    public final a d(@e final DriveAttachment driveAttachment) {
        k0.p(driveAttachment, "driveAttachment");
        return new a(driveAttachment.getId(), driveAttachment.getName(), driveAttachment.getUrl());
    }
}
