// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import com.untis.mobile.persistence.models.profile.ClassbookSettings;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\t" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/c;", "", "", "profileId", "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "b", "classbookSettings", "Lkotlin/j2;", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface c
{
    void a(@e final String p0, @e final ClassbookSettings p1);
    
    @e
    ClassbookSettings b(@e final String p0);
}
