// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.notification;

import org.joda.time.c;
import java.util.List;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH&J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH&J0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0006H&J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0006H&¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/persistence/dao/notification/a;", "", "", "profileId", "", "id", "Lcom/untis/mobile/systemNotifications/a;", "a", "", "homeworkId", "", "b", "examId", "d", "periodId", "f", "Lorg/joda/time/c;", "start", "end", "", "includeDeleted", "c", "systemNotification", "Lkotlin/j2;", "e", "g", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @f
    a a(@e final String p0, final int p1);
    
    @e
    List<a> b(@e final String p0, final long p1);
    
    @e
    List<a> c(@e final String p0, @e final c p1, @e final c p2, final boolean p3);
    
    @e
    List<a> d(@e final String p0, final long p1);
    
    void e(@e final a p0);
    
    @e
    List<a> f(@e final String p0, final long p1);
    
    void g(@e final a p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
    }
}
