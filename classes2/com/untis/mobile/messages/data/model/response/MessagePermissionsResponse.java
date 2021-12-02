// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model.response;

import org.jetbrains.annotations.f;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.util.SendMessageTypes;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0005H\u00c6\u0003J7\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'" }, d2 = { "Lcom/untis/mobile/messages/data/model/response/MessagePermissionsResponse;", "", "", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "component1", "", "component2", "", "component3", "component4", "permissions", "allowRequestReadConfirmation", "recipientSearchMaxResult", "showSentTab", "copy", "", "toString", "hashCode", "other", "equals", "Z", "getAllowRequestReadConfirmation", "()Z", "setAllowRequestReadConfirmation", "(Z)V", "I", "getRecipientSearchMaxResult", "()I", "setRecipientSearchMaxResult", "(I)V", "getShowSentTab", "setShowSentTab", "Ljava/util/List;", "getPermissions", "()Ljava/util/List;", "setPermissions", "(Ljava/util/List;)V", "<init>", "(Ljava/util/List;ZIZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessagePermissionsResponse
{
    @SerializedName("allowRequestReadConfirmation")
    private boolean allowRequestReadConfirmation;
    @SerializedName("recipientOptions")
    @e
    private List<? extends SendMessageTypes> permissions;
    @SerializedName("recipientSearchMaxResult")
    private int recipientSearchMaxResult;
    @SerializedName("showSentTab")
    private boolean showSentTab;
    
    public MessagePermissionsResponse() {
        this(null, false, 0, false, 15, null);
    }
    
    public MessagePermissionsResponse(@e final List<? extends SendMessageTypes> permissions, final boolean allowRequestReadConfirmation, final int recipientSearchMaxResult, final boolean showSentTab) {
        k0.p(permissions, "permissions");
        this.permissions = permissions;
        this.allowRequestReadConfirmation = allowRequestReadConfirmation;
        this.recipientSearchMaxResult = recipientSearchMaxResult;
        this.showSentTab = showSentTab;
    }
    
    @e
    public final List<SendMessageTypes> component1() {
        return (List<SendMessageTypes>)this.permissions;
    }
    
    public final boolean component2() {
        return this.allowRequestReadConfirmation;
    }
    
    public final int component3() {
        return this.recipientSearchMaxResult;
    }
    
    public final boolean component4() {
        return this.showSentTab;
    }
    
    @e
    public final MessagePermissionsResponse copy(@e final List<? extends SendMessageTypes> list, final boolean b, final int n, final boolean b2) {
        k0.p(list, "permissions");
        return new MessagePermissionsResponse(list, b, n, b2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessagePermissionsResponse)) {
            return false;
        }
        final MessagePermissionsResponse messagePermissionsResponse = (MessagePermissionsResponse)o;
        return k0.g(this.permissions, messagePermissionsResponse.permissions) && this.allowRequestReadConfirmation == messagePermissionsResponse.allowRequestReadConfirmation && this.recipientSearchMaxResult == messagePermissionsResponse.recipientSearchMaxResult && this.showSentTab == messagePermissionsResponse.showSentTab;
    }
    
    public final boolean getAllowRequestReadConfirmation() {
        return this.allowRequestReadConfirmation;
    }
    
    @e
    public final List<SendMessageTypes> getPermissions() {
        return (List<SendMessageTypes>)this.permissions;
    }
    
    public final int getRecipientSearchMaxResult() {
        return this.recipientSearchMaxResult;
    }
    
    public final boolean getShowSentTab() {
        return this.showSentTab;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.permissions.hashCode();
        final int allowRequestReadConfirmation = this.allowRequestReadConfirmation ? 1 : 0;
        int n = 1;
        int n2 = allowRequestReadConfirmation;
        if (allowRequestReadConfirmation != 0) {
            n2 = 1;
        }
        final int recipientSearchMaxResult = this.recipientSearchMaxResult;
        final int showSentTab = this.showSentTab ? 1 : 0;
        if (showSentTab == 0) {
            n = showSentTab;
        }
        return ((hashCode * 31 + n2) * 31 + recipientSearchMaxResult) * 31 + n;
    }
    
    public final void setAllowRequestReadConfirmation(final boolean allowRequestReadConfirmation) {
        this.allowRequestReadConfirmation = allowRequestReadConfirmation;
    }
    
    public final void setPermissions(@e final List<? extends SendMessageTypes> permissions) {
        k0.p(permissions, "<set-?>");
        this.permissions = permissions;
    }
    
    public final void setRecipientSearchMaxResult(final int recipientSearchMaxResult) {
        this.recipientSearchMaxResult = recipientSearchMaxResult;
    }
    
    public final void setShowSentTab(final boolean showSentTab) {
        this.showSentTab = showSentTab;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MessagePermissionsResponse(permissions=");
        sb.append(this.permissions);
        sb.append(", allowRequestReadConfirmation=");
        sb.append(this.allowRequestReadConfirmation);
        sb.append(", recipientSearchMaxResult=");
        sb.append(this.recipientSearchMaxResult);
        sb.append(", showSentTab=");
        sb.append(this.showSentTab);
        sb.append(')');
        return sb.toString();
    }
}
