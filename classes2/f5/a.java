// 
// Decompiled by Procyon v0.5.36
// 

package f5;

import com.untis.mobile.utils.mapper.api.c;
import com.untis.mobile.api.common.error.UMError;
import java.util.Collection;
import java.util.ArrayList;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.booking.ValidationError;
import java.util.List;

public class a extends RuntimeException
{
    @j0
    private final List<ValidationError> G;
    
    public a(@j0 final List<ValidationError> list) {
        (this.G = new ArrayList<ValidationError>()).addAll(list);
    }
    
    @j0
    public static a b(@j0 final List<UMError> list) {
        return new a((List<ValidationError>)c.j().g(list));
    }
    
    @j0
    public List<ValidationError> a() {
        return this.G;
    }
}
