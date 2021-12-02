// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model;

import java.util.Iterator;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import android.os.Parcelable$Creator;
import b7.c;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u0007¢\u0006\u0004\b9\u0010:J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u001d\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u001d\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u0007H\u00c6\u0003J{\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u0007H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u001a\u0004\b0\u0010$\"\u0004\b1\u0010&R6\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R6\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106¨\u0006;" }, d2 = { "Lcom/untis/mobile/messages/data/model/Group;", "Landroid/os/Parcelable;", "", "component1", "component2", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "component3", "component4", "component5", "", "component6", "Lcom/untis/mobile/messages/data/model/Recipient;", "component7", "id", "details", "personIds", "subtitle", "title", "selected", "recipients", "copy", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "Ljava/lang/String;", "getDetails", "()Ljava/lang/String;", "setDetails", "(Ljava/lang/String;)V", "getSubtitle", "setSubtitle", "getTitle", "setTitle", "Z", "getSelected", "()Z", "setSelected", "(Z)V", "getId", "setId", "Ljava/util/ArrayList;", "getPersonIds", "()Ljava/util/ArrayList;", "setPersonIds", "(Ljava/util/ArrayList;)V", "getRecipients", "setRecipients", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@c
public final class Group implements Parcelable
{
    @e
    public static final Parcelable$Creator<Group> CREATOR;
    @SerializedName("details")
    @f
    private String details;
    @SerializedName("groupId")
    @e
    private String id;
    @SerializedName("personIds")
    @f
    private ArrayList<Integer> personIds;
    @f
    private ArrayList<Recipient> recipients;
    private boolean selected;
    @SerializedName("subtitle")
    @f
    private String subtitle;
    @SerializedName("title")
    @e
    private String title;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Group(@e final String id, @f final String details, @f final ArrayList<Integer> personIds, @f final String subtitle, @e final String title, final boolean selected, @f final ArrayList<Recipient> recipients) {
        k0.p(id, "id");
        k0.p(title, "title");
        this.id = id;
        this.details = details;
        this.personIds = personIds;
        this.subtitle = subtitle;
        this.title = title;
        this.selected = selected;
        this.recipients = recipients;
    }
    
    @e
    public final String component1() {
        return this.id;
    }
    
    @f
    public final String component2() {
        return this.details;
    }
    
    @f
    public final ArrayList<Integer> component3() {
        return this.personIds;
    }
    
    @f
    public final String component4() {
        return this.subtitle;
    }
    
    @e
    public final String component5() {
        return this.title;
    }
    
    public final boolean component6() {
        return this.selected;
    }
    
    @f
    public final ArrayList<Recipient> component7() {
        return this.recipients;
    }
    
    @e
    public final Group copy(@e final String s, @f final String s2, @f final ArrayList<Integer> list, @f final String s3, @e final String s4, final boolean b, @f final ArrayList<Recipient> list2) {
        k0.p(s, "id");
        k0.p(s4, "title");
        return new Group(s, s2, list, s3, s4, b, list2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Group)) {
            return false;
        }
        final Group group = (Group)o;
        return k0.g(this.id, group.id) && k0.g(this.details, group.details) && k0.g(this.personIds, group.personIds) && k0.g(this.subtitle, group.subtitle) && k0.g(this.title, group.title) && this.selected == group.selected && k0.g(this.recipients, group.recipients);
    }
    
    @f
    public final String getDetails() {
        return this.details;
    }
    
    @e
    public final String getId() {
        return this.id;
    }
    
    @f
    public final ArrayList<Integer> getPersonIds() {
        return this.personIds;
    }
    
    @f
    public final ArrayList<Recipient> getRecipients() {
        return this.recipients;
    }
    
    public final boolean getSelected() {
        return this.selected;
    }
    
    @f
    public final String getSubtitle() {
        return this.subtitle;
    }
    
    @e
    public final String getTitle() {
        return this.title;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String details = this.details;
        int hashCode2 = 0;
        int hashCode3;
        if (details == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = details.hashCode();
        }
        final ArrayList<Integer> personIds = this.personIds;
        int hashCode4;
        if (personIds == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = personIds.hashCode();
        }
        final String subtitle = this.subtitle;
        int hashCode5;
        if (subtitle == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = subtitle.hashCode();
        }
        final int hashCode6 = this.title.hashCode();
        int selected;
        if ((selected = (this.selected ? 1 : 0)) != 0) {
            selected = 1;
        }
        final ArrayList<Recipient> recipients = this.recipients;
        if (recipients != null) {
            hashCode2 = recipients.hashCode();
        }
        return (((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + selected) * 31 + hashCode2;
    }
    
    public final void setDetails(@f final String details) {
        this.details = details;
    }
    
    public final void setId(@e final String id) {
        k0.p(id, "<set-?>");
        this.id = id;
    }
    
    public final void setPersonIds(@f final ArrayList<Integer> personIds) {
        this.personIds = personIds;
    }
    
    public final void setRecipients(@f final ArrayList<Recipient> recipients) {
        this.recipients = recipients;
    }
    
    public final void setSelected(final boolean selected) {
        this.selected = selected;
    }
    
    public final void setSubtitle(@f final String subtitle) {
        this.subtitle = subtitle;
    }
    
    public final void setTitle(@e final String title) {
        k0.p(title, "<set-?>");
        this.title = title;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Group(id=");
        sb.append(this.id);
        sb.append(", details=");
        sb.append((Object)this.details);
        sb.append(", personIds=");
        sb.append(this.personIds);
        sb.append(", subtitle=");
        sb.append((Object)this.subtitle);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", selected=");
        sb.append(this.selected);
        sb.append(", recipients=");
        sb.append(this.recipients);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.details);
        final ArrayList<Integer> personIds = this.personIds;
        if (personIds == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt(personIds.size());
            final Iterator<Integer> iterator = personIds.iterator();
            while (iterator.hasNext()) {
                parcel.writeInt(iterator.next().intValue());
            }
        }
        parcel.writeString(this.subtitle);
        parcel.writeString(this.title);
        parcel.writeInt((int)(this.selected ? 1 : 0));
        final ArrayList<Recipient> recipients = this.recipients;
        if (recipients == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt(recipients.size());
            final Iterator<Recipient> iterator2 = recipients.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().writeToParcel(parcel, n);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class Creator implements Parcelable$Creator<Group>
    {
        @e
        public final Group createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final int int1 = parcel.readInt();
            final int n = 0;
            ArrayList<Integer> list;
            if (int1 == 0) {
                list = null;
            }
            else {
                final int int2 = parcel.readInt();
                final ArrayList list2 = new ArrayList<Integer>(int2);
                int n2 = 0;
                while (true) {
                    list = (ArrayList<Integer>)list2;
                    if (n2 == int2) {
                        break;
                    }
                    list2.add(parcel.readInt());
                    ++n2;
                }
            }
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final boolean b = parcel.readInt() != 0;
            ArrayList<Recipient> list3;
            if (parcel.readInt() == 0) {
                list3 = null;
            }
            else {
                final int int3 = parcel.readInt();
                final ArrayList list4 = new ArrayList<Recipient>(int3);
                int n3 = n;
                while (true) {
                    list3 = (ArrayList<Recipient>)list4;
                    if (n3 == int3) {
                        break;
                    }
                    list4.add((Recipient)Recipient.CREATOR.createFromParcel(parcel));
                    ++n3;
                }
            }
            return new Group(string, string2, list, string3, string4, b, list3);
        }
        
        @e
        public final Group[] newArray(final int n) {
            return new Group[n];
        }
    }
}
