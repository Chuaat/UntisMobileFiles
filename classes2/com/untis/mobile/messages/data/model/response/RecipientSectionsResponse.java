// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model.response;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.data.model.Section;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u00c6\u0003J)\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/messages/data/model/response/RecipientSectionsResponse;", "", "", "Lcom/untis/mobile/messages/data/model/Section;", "component1", "Lcom/untis/mobile/messages/data/model/Recipient;", "component2", "sections", "persons", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "setSections", "(Ljava/util/List;)V", "getPersons", "setPersons", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class RecipientSectionsResponse
{
    @SerializedName("persons")
    @e
    private List<Recipient> persons;
    @SerializedName("sections")
    @e
    private List<Section> sections;
    
    public RecipientSectionsResponse(@e final List<Section> sections, @e final List<Recipient> persons) {
        k0.p(sections, "sections");
        k0.p(persons, "persons");
        this.sections = sections;
        this.persons = persons;
    }
    
    @e
    public final List<Section> component1() {
        return this.sections;
    }
    
    @e
    public final List<Recipient> component2() {
        return this.persons;
    }
    
    @e
    public final RecipientSectionsResponse copy(@e final List<Section> list, @e final List<Recipient> list2) {
        k0.p(list, "sections");
        k0.p(list2, "persons");
        return new RecipientSectionsResponse(list, list2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecipientSectionsResponse)) {
            return false;
        }
        final RecipientSectionsResponse recipientSectionsResponse = (RecipientSectionsResponse)o;
        return k0.g(this.sections, recipientSectionsResponse.sections) && k0.g(this.persons, recipientSectionsResponse.persons);
    }
    
    @e
    public final List<Recipient> getPersons() {
        return this.persons;
    }
    
    @e
    public final List<Section> getSections() {
        return this.sections;
    }
    
    @Override
    public int hashCode() {
        return this.sections.hashCode() * 31 + this.persons.hashCode();
    }
    
    public final void setPersons(@e final List<Recipient> persons) {
        k0.p(persons, "<set-?>");
        this.persons = persons;
    }
    
    public final void setSections(@e final List<Section> sections) {
        k0.p(sections, "<set-?>");
        this.sections = sections;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RecipientSectionsResponse(sections=");
        sb.append(this.sections);
        sb.append(", persons=");
        sb.append(this.persons);
        sb.append(')');
        return sb.toString();
    }
}
