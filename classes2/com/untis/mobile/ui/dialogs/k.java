// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.dialogs;

import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.DisplayableEntity;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/ui/dialogs/k;", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "", "getDisplayableTitle", "getDisplayableDescription", "", "getDisplayableTextColor", "getDisplayableBackColor", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "I", "Ljava/lang/String;", "title", "G", "J", "id", "H", "Lcom/untis/mobile/persistence/models/EntityType;", "type", "subtitle", "<init>", "(JLcom/untis/mobile/persistence/models/EntityType;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "(Lcom/untis/mobile/persistence/models/profile/Profile;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k implements DisplayableEntity
{
    private final long G;
    @e
    private final EntityType H;
    @e
    private final String I;
    @e
    private final String J;
    
    public k(final long g, @e final EntityType h, @e final String i, @e final String j) {
        k0.p(h, "type");
        k0.p(i, "title");
        k0.p(j, "subtitle");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public k(@e final Profile profile) {
        k0.p(profile, "profile");
        this(profile.getId(), EntityType.PROFILE, profile.getDisplayName(), profile.getSchoolDisplayName());
    }
    
    @Override
    public long entityId() {
        return this.G;
    }
    
    @e
    @Override
    public EntityType entityType() {
        return this.H;
    }
    
    @Override
    public int getDisplayableBackColor() {
        return 0;
    }
    
    @e
    @Override
    public String getDisplayableDescription() {
        return this.J;
    }
    
    @Override
    public int getDisplayableTextColor() {
        return 0;
    }
    
    @e
    @Override
    public String getDisplayableTitle() {
        return this.I;
    }
}
