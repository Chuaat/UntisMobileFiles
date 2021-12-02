// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services;

import f4.b;
import com.untis.mobile.persistence.realm.d;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.SchoolColor;
import com.untis.mobile.persistence.models.SchoolColorType;
import kotlin.jvm.internal.w;
import f4.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r" }, d2 = { "Lcom/untis/mobile/services/f;", "Lcom/untis/mobile/services/e;", "Lcom/untis/mobile/persistence/models/SchoolColorType;", "schoolColorType", "Lcom/untis/mobile/persistence/models/SchoolColor;", "b", "", "profileId", "a", "Lf4/a;", "schoolColorDao", "<init>", "(Lf4/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f implements e
{
    @org.jetbrains.annotations.e
    public static final a b;
    @org.jetbrains.annotations.e
    private final f4.a a;
    
    static {
        b = new a(null);
    }
    
    private f(final f4.a a) {
        this.a = a;
    }
    
    private final SchoolColor b(final SchoolColorType schoolColorType) {
        return new SchoolColor(schoolColorType, -12303292, schoolColorType.getBackground());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public SchoolColor a(@org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final SchoolColorType schoolColorType) {
        k0.p(s, "profileId");
        k0.p(schoolColorType, "schoolColorType");
        SchoolColor schoolColor;
        if ((schoolColor = this.a.a(s, schoolColorType)) == null) {
            schoolColor = this.b(schoolColorType);
        }
        return schoolColor;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/services/f$a", "", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "Lcom/untis/mobile/services/e;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.e
        public final e a(@org.jetbrains.annotations.e final d d) {
            k0.p(d, "realmService");
            return new f(new b(d), null);
        }
    }
}
