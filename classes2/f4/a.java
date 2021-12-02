// 
// Decompiled by Procyon v0.5.36
// 

package f4;

import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.SchoolColor;
import com.untis.mobile.persistence.models.SchoolColorType;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000e" }, d2 = { "Lf4/a;", "", "", "profileId", "Lcom/untis/mobile/persistence/models/SchoolColorType;", "schoolColorType", "Lcom/untis/mobile/persistence/models/SchoolColor;", "a", "", "b", "schoolColors", "Lkotlin/j2;", "c", "d", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @f
    SchoolColor a(@e final String p0, @e final SchoolColorType p1);
    
    @e
    List<SchoolColor> b(@e final String p0);
    
    void c(@e final String p0, @e final List<SchoolColor> p1);
    
    void d(@e final String p0);
}
