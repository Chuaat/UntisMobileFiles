// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.classbook.absence.Exemption;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&J\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H&J\u001e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/i;", "", "", "profileId", "", "Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;", "b", "", "id", "a", "", "ids", "f", "exemptions", "Lkotlin/j2;", "c", "exemption", "d", "e", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface i
{
    @f
    Exemption a(@e final String p0, final long p1);
    
    @e
    List<Exemption> b(@e final String p0);
    
    void c(@e final String p0, @e final List<Exemption> p1);
    
    void d(@e final String p0, @e final Exemption p1);
    
    void e(@e final String p0, @e final List<Exemption> p1);
    
    @e
    List<Exemption> f(@e final String p0, @e final Collection<Long> p1);
}
