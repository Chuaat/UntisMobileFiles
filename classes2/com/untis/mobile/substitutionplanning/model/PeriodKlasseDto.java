// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/PeriodKlasseDto;", "", "Lcom/untis/mobile/substitutionplanning/model/KlasseRefDto;", "component1", "", "component2", "klasse", "hasOpenConflicts", "copy", "", "toString", "", "hashCode", "other", "equals", "Lcom/untis/mobile/substitutionplanning/model/KlasseRefDto;", "getKlasse", "()Lcom/untis/mobile/substitutionplanning/model/KlasseRefDto;", "setKlasse", "(Lcom/untis/mobile/substitutionplanning/model/KlasseRefDto;)V", "Z", "getHasOpenConflicts", "()Z", "setHasOpenConflicts", "(Z)V", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/KlasseRefDto;Z)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodKlasseDto
{
    private boolean hasOpenConflicts;
    @e
    private KlasseRefDto klasse;
    
    public PeriodKlasseDto(@e final KlasseRefDto klasse, final boolean hasOpenConflicts) {
        k0.p(klasse, "klasse");
        this.klasse = klasse;
        this.hasOpenConflicts = hasOpenConflicts;
    }
    
    @e
    public final KlasseRefDto component1() {
        return this.klasse;
    }
    
    public final boolean component2() {
        return this.hasOpenConflicts;
    }
    
    @e
    public final PeriodKlasseDto copy(@e final KlasseRefDto klasseRefDto, final boolean b) {
        k0.p(klasseRefDto, "klasse");
        return new PeriodKlasseDto(klasseRefDto, b);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeriodKlasseDto)) {
            return false;
        }
        final PeriodKlasseDto periodKlasseDto = (PeriodKlasseDto)o;
        return k0.g(this.klasse, periodKlasseDto.klasse) && this.hasOpenConflicts == periodKlasseDto.hasOpenConflicts;
    }
    
    public final boolean getHasOpenConflicts() {
        return this.hasOpenConflicts;
    }
    
    @e
    public final KlasseRefDto getKlasse() {
        return this.klasse;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.klasse.hashCode();
        int hasOpenConflicts;
        if ((hasOpenConflicts = (this.hasOpenConflicts ? 1 : 0)) != 0) {
            hasOpenConflicts = 1;
        }
        return hashCode * 31 + hasOpenConflicts;
    }
    
    public final void setHasOpenConflicts(final boolean hasOpenConflicts) {
        this.hasOpenConflicts = hasOpenConflicts;
    }
    
    public final void setKlasse(@e final KlasseRefDto klasse) {
        k0.p(klasse, "<set-?>");
        this.klasse = klasse;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriodKlasseDto(klasse=");
        sb.append(this.klasse);
        sb.append(", hasOpenConflicts=");
        sb.append(this.hasOpenConflicts);
        sb.append(')');
        return sb.toString();
    }
}
