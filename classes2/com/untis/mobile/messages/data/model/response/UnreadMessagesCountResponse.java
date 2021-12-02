// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model.response;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\b\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/messages/data/model/response/UnreadMessagesCountResponse;", "", "", "component1", "unreadMessagesCount", "copy", "", "toString", "hashCode", "other", "", "equals", "I", "getUnreadMessagesCount", "()I", "setUnreadMessagesCount", "(I)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class UnreadMessagesCountResponse
{
    @SerializedName("unreadMessagesCount")
    private int unreadMessagesCount;
    
    public UnreadMessagesCountResponse(final int unreadMessagesCount) {
        this.unreadMessagesCount = unreadMessagesCount;
    }
    
    public final int component1() {
        return this.unreadMessagesCount;
    }
    
    @e
    public final UnreadMessagesCountResponse copy(final int n) {
        return new UnreadMessagesCountResponse(n);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof UnreadMessagesCountResponse && this.unreadMessagesCount == ((UnreadMessagesCountResponse)o).unreadMessagesCount);
    }
    
    public final int getUnreadMessagesCount() {
        return this.unreadMessagesCount;
    }
    
    @Override
    public int hashCode() {
        return this.unreadMessagesCount;
    }
    
    public final void setUnreadMessagesCount(final int unreadMessagesCount) {
        this.unreadMessagesCount = unreadMessagesCount;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UnreadMessagesCountResponse(unreadMessagesCount=");
        sb.append(this.unreadMessagesCount);
        sb.append(')');
        return sb.toString();
    }
}
