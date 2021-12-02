// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.profile;

import org.jetbrains.annotations.f;
import org.joda.time.t;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/PremiumContext;", "", "", "premium", "Z", "getPremium", "()Z", "setPremium", "(Z)V", "Lorg/joda/time/t;", "end", "Lorg/joda/time/t;", "getEnd", "()Lorg/joda/time/t;", "setEnd", "(Lorg/joda/time/t;)V", "<init>", "(ZLorg/joda/time/t;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PremiumContext
{
    @f
    private t end;
    private boolean premium;
    
    public PremiumContext(final boolean premium, @f final t end) {
        this.premium = premium;
        this.end = end;
    }
    
    @f
    public final t getEnd() {
        return this.end;
    }
    
    public final boolean getPremium() {
        return this.premium;
    }
    
    public final void setEnd(@f final t end) {
        this.end = end;
    }
    
    public final void setPremium(final boolean premium) {
        this.premium = premium;
    }
}
