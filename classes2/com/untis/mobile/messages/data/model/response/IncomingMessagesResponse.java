// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model.response;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.messages.data.model.Message;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J)\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/messages/data/model/response/IncomingMessagesResponse;", "", "", "Lcom/untis/mobile/messages/data/model/Message;", "component1", "component2", "incomeMessages", "readConfirmationMessages", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getIncomeMessages", "()Ljava/util/List;", "setIncomeMessages", "(Ljava/util/List;)V", "getReadConfirmationMessages", "setReadConfirmationMessages", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class IncomingMessagesResponse
{
    @SerializedName("incomingMessages")
    @e
    private List<Message> incomeMessages;
    @SerializedName("readConfirmationMessages")
    @e
    private List<Message> readConfirmationMessages;
    
    public IncomingMessagesResponse(@e final List<Message> incomeMessages, @e final List<Message> readConfirmationMessages) {
        k0.p(incomeMessages, "incomeMessages");
        k0.p(readConfirmationMessages, "readConfirmationMessages");
        this.incomeMessages = incomeMessages;
        this.readConfirmationMessages = readConfirmationMessages;
    }
    
    @e
    public final List<Message> component1() {
        return this.incomeMessages;
    }
    
    @e
    public final List<Message> component2() {
        return this.readConfirmationMessages;
    }
    
    @e
    public final IncomingMessagesResponse copy(@e final List<Message> list, @e final List<Message> list2) {
        k0.p(list, "incomeMessages");
        k0.p(list2, "readConfirmationMessages");
        return new IncomingMessagesResponse(list, list2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IncomingMessagesResponse)) {
            return false;
        }
        final IncomingMessagesResponse incomingMessagesResponse = (IncomingMessagesResponse)o;
        return k0.g(this.incomeMessages, incomingMessagesResponse.incomeMessages) && k0.g(this.readConfirmationMessages, incomingMessagesResponse.readConfirmationMessages);
    }
    
    @e
    public final List<Message> getIncomeMessages() {
        return this.incomeMessages;
    }
    
    @e
    public final List<Message> getReadConfirmationMessages() {
        return this.readConfirmationMessages;
    }
    
    @Override
    public int hashCode() {
        return this.incomeMessages.hashCode() * 31 + this.readConfirmationMessages.hashCode();
    }
    
    public final void setIncomeMessages(@e final List<Message> incomeMessages) {
        k0.p(incomeMessages, "<set-?>");
        this.incomeMessages = incomeMessages;
    }
    
    public final void setReadConfirmationMessages(@e final List<Message> readConfirmationMessages) {
        k0.p(readConfirmationMessages, "<set-?>");
        this.readConfirmationMessages = readConfirmationMessages;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("IncomingMessagesResponse(incomeMessages=");
        sb.append(this.incomeMessages);
        sb.append(", readConfirmationMessages=");
        sb.append(this.readConfirmationMessages);
        sb.append(')');
        return sb.toString();
    }
}
