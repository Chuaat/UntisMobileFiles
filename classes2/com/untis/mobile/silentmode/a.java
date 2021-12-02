// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.silentmode;

import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0006H&J\b\u0010\u0011\u001a\u00020\u0006H&¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/silentmode/a;", "", "", "d", "Landroid/content/Context;", "context", "Lkotlin/j2;", "a", "", "profileId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "c", "stop", "e", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    void a(@e final Context p0);
    
    void b();
    
    void c(@e final String p0, @e final EntityType p1, final long p2);
    
    boolean d();
    
    void e();
    
    void stop();
}
