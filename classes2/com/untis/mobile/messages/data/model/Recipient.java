// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model;

import java.util.LinkedHashSet;
import java.util.Iterator;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.ui.send.RecipientsTypes;
import java.util.Set;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import android.os.Parcelable$Creator;
import b7.c;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012¢\u0006\u0004\bW\u0010XJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\n\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012H\u00c6\u0003J´\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00122\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012H\u00c6\u0001¢\u0006\u0004\b\"\u0010#J\t\u0010$\u001a\u00020\u0002H\u00d6\u0001J\t\u0010%\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010)\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0004H\u00d6\u0001R$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010/\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u00102R*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00108\u001a\u0004\bB\u0010:\"\u0004\bC\u0010<R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u00108\u001a\u0004\bD\u0010:\"\u0004\bE\u0010<R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00108\u001a\u0004\bF\u0010:\"\u0004\bG\u0010<R$\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u00108\u001a\u0004\bM\u0010:\"\u0004\bN\u0010<R*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00103\u001a\u0004\bO\u00105\"\u0004\bP\u00107R$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010/\u001a\u0004\bQ\u0010\u0006\"\u0004\bR\u00102R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u00108\u001a\u0004\bU\u0010:\"\u0004\bV\u0010<¨\u0006Y" }, d2 = { "Lcom/untis/mobile/messages/data/model/Recipient;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "", "component8", "Lcom/untis/mobile/messages/ui/send/RecipientsTypes;", "component9", "component10", "component11", "", "component12", "component13", "displayName", "id", "imageUrl", "userId", "className", "personId", "role", "selected", "type", "groupId", "subtitle", "groupRecipients", "groupSelectedRecipients", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLcom/untis/mobile/messages/ui/send/RecipientsTypes;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)Lcom/untis/mobile/messages/data/model/Recipient;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/util/Set;", "getGroupRecipients", "()Ljava/util/Set;", "setGroupRecipients", "(Ljava/util/Set;)V", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "Z", "getSelected", "()Z", "setSelected", "(Z)V", "getGroupId", "setGroupId", "getUserId", "setUserId", "getRole", "setRole", "Lcom/untis/mobile/messages/ui/send/RecipientsTypes;", "getType", "()Lcom/untis/mobile/messages/ui/send/RecipientsTypes;", "setType", "(Lcom/untis/mobile/messages/ui/send/RecipientsTypes;)V", "getClassName", "setClassName", "getGroupSelectedRecipients", "setGroupSelectedRecipients", "getPersonId", "setPersonId", "getSubtitle", "setSubtitle", "getDisplayName", "setDisplayName", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLcom/untis/mobile/messages/ui/send/RecipientsTypes;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@c
public final class Recipient implements Parcelable
{
    @e
    public static final Parcelable$Creator<Recipient> CREATOR;
    @SerializedName("className")
    @f
    private String className;
    @SerializedName("displayName")
    @e
    private String displayName;
    @f
    private String groupId;
    @f
    private Set<Recipient> groupRecipients;
    @f
    private Set<Recipient> groupSelectedRecipients;
    @SerializedName("id")
    @f
    private Integer id;
    @SerializedName("imageUrl")
    @f
    private String imageUrl;
    @SerializedName("personId")
    @f
    private Integer personId;
    @SerializedName("role")
    @f
    private String role;
    private boolean selected;
    @f
    private String subtitle;
    @f
    private RecipientsTypes type;
    @SerializedName("userId")
    @f
    private String userId;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Recipient(@e final String displayName, @f final Integer id, @f final String imageUrl, @f final String userId, @f final String className, @f final Integer personId, @f final String role, final boolean selected, @f final RecipientsTypes type, @f final String groupId, @f final String subtitle, @f final Set<Recipient> groupRecipients, @f final Set<Recipient> groupSelectedRecipients) {
        k0.p(displayName, "displayName");
        this.displayName = displayName;
        this.id = id;
        this.imageUrl = imageUrl;
        this.userId = userId;
        this.className = className;
        this.personId = personId;
        this.role = role;
        this.selected = selected;
        this.type = type;
        this.groupId = groupId;
        this.subtitle = subtitle;
        this.groupRecipients = groupRecipients;
        this.groupSelectedRecipients = groupSelectedRecipients;
    }
    
    @e
    public final String component1() {
        return this.displayName;
    }
    
    @f
    public final String component10() {
        return this.groupId;
    }
    
    @f
    public final String component11() {
        return this.subtitle;
    }
    
    @f
    public final Set<Recipient> component12() {
        return this.groupRecipients;
    }
    
    @f
    public final Set<Recipient> component13() {
        return this.groupSelectedRecipients;
    }
    
    @f
    public final Integer component2() {
        return this.id;
    }
    
    @f
    public final String component3() {
        return this.imageUrl;
    }
    
    @f
    public final String component4() {
        return this.userId;
    }
    
    @f
    public final String component5() {
        return this.className;
    }
    
    @f
    public final Integer component6() {
        return this.personId;
    }
    
    @f
    public final String component7() {
        return this.role;
    }
    
    public final boolean component8() {
        return this.selected;
    }
    
    @f
    public final RecipientsTypes component9() {
        return this.type;
    }
    
    @e
    public final Recipient copy(@e final String s, @f final Integer n, @f final String s2, @f final String s3, @f final String s4, @f final Integer n2, @f final String s5, final boolean b, @f final RecipientsTypes recipientsTypes, @f final String s6, @f final String s7, @f final Set<Recipient> set, @f final Set<Recipient> set2) {
        k0.p(s, "displayName");
        return new Recipient(s, n, s2, s3, s4, n2, s5, b, recipientsTypes, s6, s7, set, set2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Recipient)) {
            return false;
        }
        final Recipient recipient = (Recipient)o;
        return k0.g(this.displayName, recipient.displayName) && k0.g(this.id, recipient.id) && k0.g(this.imageUrl, recipient.imageUrl) && k0.g(this.userId, recipient.userId) && k0.g(this.className, recipient.className) && k0.g(this.personId, recipient.personId) && k0.g(this.role, recipient.role) && this.selected == recipient.selected && this.type == recipient.type && k0.g(this.groupId, recipient.groupId) && k0.g(this.subtitle, recipient.subtitle) && k0.g(this.groupRecipients, recipient.groupRecipients) && k0.g(this.groupSelectedRecipients, recipient.groupSelectedRecipients);
    }
    
    @f
    public final String getClassName() {
        return this.className;
    }
    
    @e
    public final String getDisplayName() {
        return this.displayName;
    }
    
    @f
    public final String getGroupId() {
        return this.groupId;
    }
    
    @f
    public final Set<Recipient> getGroupRecipients() {
        return this.groupRecipients;
    }
    
    @f
    public final Set<Recipient> getGroupSelectedRecipients() {
        return this.groupSelectedRecipients;
    }
    
    @f
    public final Integer getId() {
        return this.id;
    }
    
    @f
    public final String getImageUrl() {
        return this.imageUrl;
    }
    
    @f
    public final Integer getPersonId() {
        return this.personId;
    }
    
    @f
    public final String getRole() {
        return this.role;
    }
    
    public final boolean getSelected() {
        return this.selected;
    }
    
    @f
    public final String getSubtitle() {
        return this.subtitle;
    }
    
    @f
    public final RecipientsTypes getType() {
        return this.type;
    }
    
    @f
    public final String getUserId() {
        return this.userId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.displayName.hashCode();
        final Integer id = this.id;
        int hashCode2 = 0;
        int hashCode3;
        if (id == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = id.hashCode();
        }
        final String imageUrl = this.imageUrl;
        int hashCode4;
        if (imageUrl == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = imageUrl.hashCode();
        }
        final String userId = this.userId;
        int hashCode5;
        if (userId == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = userId.hashCode();
        }
        final String className = this.className;
        int hashCode6;
        if (className == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = className.hashCode();
        }
        final Integer personId = this.personId;
        int hashCode7;
        if (personId == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = personId.hashCode();
        }
        final String role = this.role;
        int hashCode8;
        if (role == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = role.hashCode();
        }
        int selected;
        if ((selected = (this.selected ? 1 : 0)) != 0) {
            selected = 1;
        }
        final RecipientsTypes type = this.type;
        int hashCode9;
        if (type == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = type.hashCode();
        }
        final String groupId = this.groupId;
        int hashCode10;
        if (groupId == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = groupId.hashCode();
        }
        final String subtitle = this.subtitle;
        int hashCode11;
        if (subtitle == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = subtitle.hashCode();
        }
        final Set<Recipient> groupRecipients = this.groupRecipients;
        int hashCode12;
        if (groupRecipients == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = groupRecipients.hashCode();
        }
        final Set<Recipient> groupSelectedRecipients = this.groupSelectedRecipients;
        if (groupSelectedRecipients != null) {
            hashCode2 = groupSelectedRecipients.hashCode();
        }
        return (((((((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + selected) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode2;
    }
    
    public final void setClassName(@f final String className) {
        this.className = className;
    }
    
    public final void setDisplayName(@e final String displayName) {
        k0.p(displayName, "<set-?>");
        this.displayName = displayName;
    }
    
    public final void setGroupId(@f final String groupId) {
        this.groupId = groupId;
    }
    
    public final void setGroupRecipients(@f final Set<Recipient> groupRecipients) {
        this.groupRecipients = groupRecipients;
    }
    
    public final void setGroupSelectedRecipients(@f final Set<Recipient> groupSelectedRecipients) {
        this.groupSelectedRecipients = groupSelectedRecipients;
    }
    
    public final void setId(@f final Integer id) {
        this.id = id;
    }
    
    public final void setImageUrl(@f final String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    public final void setPersonId(@f final Integer personId) {
        this.personId = personId;
    }
    
    public final void setRole(@f final String role) {
        this.role = role;
    }
    
    public final void setSelected(final boolean selected) {
        this.selected = selected;
    }
    
    public final void setSubtitle(@f final String subtitle) {
        this.subtitle = subtitle;
    }
    
    public final void setType(@f final RecipientsTypes type) {
        this.type = type;
    }
    
    public final void setUserId(@f final String userId) {
        this.userId = userId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Recipient(displayName=");
        sb.append(this.displayName);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", imageUrl=");
        sb.append((Object)this.imageUrl);
        sb.append(", userId=");
        sb.append((Object)this.userId);
        sb.append(", className=");
        sb.append((Object)this.className);
        sb.append(", personId=");
        sb.append(this.personId);
        sb.append(", role=");
        sb.append((Object)this.role);
        sb.append(", selected=");
        sb.append(this.selected);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", groupId=");
        sb.append((Object)this.groupId);
        sb.append(", subtitle=");
        sb.append((Object)this.subtitle);
        sb.append(", groupRecipients=");
        sb.append(this.groupRecipients);
        sb.append(", groupSelectedRecipients=");
        sb.append(this.groupSelectedRecipients);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "out");
        parcel.writeString(this.displayName);
        final Integer id = this.id;
        if (id == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt((int)id);
        }
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.userId);
        parcel.writeString(this.className);
        final Integer personId = this.personId;
        if (personId == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt((int)personId);
        }
        parcel.writeString(this.role);
        parcel.writeInt((int)(this.selected ? 1 : 0));
        final RecipientsTypes type = this.type;
        if (type == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeString(type.name());
        }
        parcel.writeString(this.groupId);
        parcel.writeString(this.subtitle);
        final Set<Recipient> groupRecipients = this.groupRecipients;
        if (groupRecipients == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt(groupRecipients.size());
            final Iterator<Recipient> iterator = groupRecipients.iterator();
            while (iterator.hasNext()) {
                iterator.next().writeToParcel(parcel, n);
            }
        }
        final Set<Recipient> groupSelectedRecipients = this.groupSelectedRecipients;
        if (groupSelectedRecipients == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt(groupSelectedRecipients.size());
            final Iterator<Recipient> iterator2 = groupSelectedRecipients.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().writeToParcel(parcel, n);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class Creator implements Parcelable$Creator<Recipient>
    {
        @e
        public final Recipient createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            final String string = parcel.readString();
            Integer value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = parcel.readInt();
            }
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            Integer value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readInt();
            }
            final String string5 = parcel.readString();
            final boolean b = parcel.readInt() != 0;
            RecipientsTypes value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = RecipientsTypes.valueOf(parcel.readString());
            }
            final String string6 = parcel.readString();
            final String string7 = parcel.readString();
            LinkedHashSet set;
            if (parcel.readInt() == 0) {
                set = null;
            }
            else {
                final int int1 = parcel.readInt();
                set = new LinkedHashSet<Recipient>(int1);
                for (int i = 0; i != int1; ++i) {
                    set.add((Recipient)Recipient.CREATOR.createFromParcel(parcel));
                }
            }
            Set<Recipient> set2;
            if (parcel.readInt() == 0) {
                set2 = null;
            }
            else {
                final int int2 = parcel.readInt();
                final LinkedHashSet set3 = new LinkedHashSet<Recipient>(int2);
                for (int j = 0; j != int2; ++j) {
                    set3.add((Recipient)Recipient.CREATOR.createFromParcel(parcel));
                }
                set2 = (Set<Recipient>)set3;
            }
            return new Recipient(string, value, string2, string3, string4, value2, string5, b, value3, string6, string7, (Set<Recipient>)set, set2);
        }
        
        @e
        public final Recipient[] newArray(final int n) {
            return new Recipient[n];
        }
    }
}
