// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.api;

import com.untis.mobile.substitutionplanning.model.PeriodGroupCollectionDto;
import kotlin.coroutines.d;
import com.untis.mobile.substitutionplanning.model.AskTeacherViewDto;
import com.untis.wu.rest.model.TeacherAbsenceUpdateDto;
import p7.b;
import p7.f;
import com.untis.wu.rest.model.TeacherAbsenceViewDto;
import com.untis.wu.rest.model.TeacherAbsenceDto;
import p7.o;
import retrofit2.t;
import rx.g;
import p7.i;
import p7.y;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ1\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'J2\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'J<\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0016H'J2\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/substitutionplanning/api/a;", "", "", "url", "tenantId", "authorization", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupCollectionDto;", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lrx/g;", "Lretrofit2/t;", "Ljava/lang/Void;", "a", "e", "Lcom/untis/mobile/substitutionplanning/model/AskTeacherViewDto;", "g", "school", "Lcom/untis/wu/rest/model/TeacherAbsenceViewDto;", "c", "Lcom/untis/wu/rest/model/TeacherAbsenceDto;", "teacherAbsence", "b", "Lcom/untis/wu/rest/model/TeacherAbsenceUpdateDto;", "f", "d", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @e
    public static final a a = com.untis.mobile.substitutionplanning.api.a.a.a;
    
    @o
    @e
    g<t<Void>> a(@y @e final String p0, @i("X-TenantID") @e final String p1, @i("Authorization") @e final String p2);
    
    @o
    @e
    g<TeacherAbsenceDto> b(@y @e final String p0, @i("Authorization") @e final String p1, @p7.t(encoded = true, value = "school") @e final String p2, @a @e final TeacherAbsenceDto p3);
    
    @f
    @e
    g<TeacherAbsenceViewDto> c(@y @e final String p0, @i("Authorization") @e final String p1, @p7.t(encoded = true, value = "school") @e final String p2);
    
    @b
    @e
    g<t<Void>> d(@y @e final String p0, @i("Authorization") @e final String p1, @p7.t(encoded = true, value = "school") @e final String p2);
    
    @o
    @e
    g<t<Void>> e(@y @e final String p0, @i("X-TenantID") @e final String p1, @i("Authorization") @e final String p2);
    
    @o
    @e
    g<t<Void>> f(@y @e final String p0, @i("Authorization") @e final String p1, @p7.t(encoded = true, value = "school") @e final String p2, @a @e final TeacherAbsenceUpdateDto p3);
    
    @f
    @e
    g<AskTeacherViewDto> g(@y @e final String p0, @i("X-TenantID") @e final String p1, @i("Authorization") @e final String p2);
    
    @f
    @org.jetbrains.annotations.f
    Object h(@y @e final String p0, @i("X-TenantID") @e final String p1, @i("Authorization") @e final String p2, @e final d<? super PeriodGroupCollectionDto> p3);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n" }, d2 = { "com/untis/mobile/substitutionplanning/api/a$a", "", "", "c", "Ljava/lang/String;", "HEADER_X_TENANT", "b", "HEADER_AUTHORIZATION", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        static final /* synthetic */ a a;
        @e
        private static final String b = "Authorization";
        @e
        private static final String c = "X-TenantID";
        
        static {
            a = new a();
        }
        
        private a() {
        }
    }
}
