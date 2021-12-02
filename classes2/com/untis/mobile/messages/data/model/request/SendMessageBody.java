// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model.request;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0011\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\f\u001a\u00020\nH\u00c6\u0003Ja\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nH\u00c6\u0001J\t\u0010\u0015\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"¨\u00062" }, d2 = { "Lcom/untis/mobile/messages/data/model/request/SendMessageBody;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "", "component6", "component7", "recipientOption", "recipientGroupIds", "subject", "content", "recipientPersonIds", "copyToStudent", "requestConfirmation", "copy", "toString", "hashCode", "other", "equals", "Z", "getRequestConfirmation", "()Z", "setRequestConfirmation", "(Z)V", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getCopyToStudent", "setCopyToStudent", "Ljava/util/List;", "getRecipientPersonIds", "()Ljava/util/List;", "setRecipientPersonIds", "(Ljava/util/List;)V", "getRecipientOption", "setRecipientOption", "getRecipientGroupIds", "setRecipientGroupIds", "getSubject", "setSubject", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SendMessageBody
{
    @f
    private String content;
    private boolean copyToStudent;
    @f
    private List<String> recipientGroupIds;
    @e
    private String recipientOption;
    @f
    private List<Integer> recipientPersonIds;
    private boolean requestConfirmation;
    @e
    private String subject;
    
    public SendMessageBody(@e final String recipientOption, @f final List<String> recipientGroupIds, @e final String subject, @f final String content, @f final List<Integer> recipientPersonIds, final boolean copyToStudent, final boolean requestConfirmation) {
        k0.p(recipientOption, "recipientOption");
        k0.p(subject, "subject");
        this.recipientOption = recipientOption;
        this.recipientGroupIds = recipientGroupIds;
        this.subject = subject;
        this.content = content;
        this.recipientPersonIds = recipientPersonIds;
        this.copyToStudent = copyToStudent;
        this.requestConfirmation = requestConfirmation;
    }
    
    @e
    public final String component1() {
        return this.recipientOption;
    }
    
    @f
    public final List<String> component2() {
        return this.recipientGroupIds;
    }
    
    @e
    public final String component3() {
        return this.subject;
    }
    
    @f
    public final String component4() {
        return this.content;
    }
    
    @f
    public final List<Integer> component5() {
        return this.recipientPersonIds;
    }
    
    public final boolean component6() {
        return this.copyToStudent;
    }
    
    public final boolean component7() {
        return this.requestConfirmation;
    }
    
    @e
    public final SendMessageBody copy(@e final String s, @f final List<String> list, @e final String s2, @f final String s3, @f final List<Integer> list2, final boolean b, final boolean b2) {
        k0.p(s, "recipientOption");
        k0.p(s2, "subject");
        return new SendMessageBody(s, list, s2, s3, list2, b, b2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SendMessageBody)) {
            return false;
        }
        final SendMessageBody sendMessageBody = (SendMessageBody)o;
        return k0.g(this.recipientOption, sendMessageBody.recipientOption) && k0.g(this.recipientGroupIds, sendMessageBody.recipientGroupIds) && k0.g(this.subject, sendMessageBody.subject) && k0.g(this.content, sendMessageBody.content) && k0.g(this.recipientPersonIds, sendMessageBody.recipientPersonIds) && this.copyToStudent == sendMessageBody.copyToStudent && this.requestConfirmation == sendMessageBody.requestConfirmation;
    }
    
    @f
    public final String getContent() {
        return this.content;
    }
    
    public final boolean getCopyToStudent() {
        return this.copyToStudent;
    }
    
    @f
    public final List<String> getRecipientGroupIds() {
        return this.recipientGroupIds;
    }
    
    @e
    public final String getRecipientOption() {
        return this.recipientOption;
    }
    
    @f
    public final List<Integer> getRecipientPersonIds() {
        return this.recipientPersonIds;
    }
    
    public final boolean getRequestConfirmation() {
        return this.requestConfirmation;
    }
    
    @e
    public final String getSubject() {
        return this.subject;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.recipientOption.hashCode();
        final List<String> recipientGroupIds = this.recipientGroupIds;
        int hashCode2 = 0;
        int hashCode3;
        if (recipientGroupIds == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = recipientGroupIds.hashCode();
        }
        final int hashCode4 = this.subject.hashCode();
        final String content = this.content;
        int hashCode5;
        if (content == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = content.hashCode();
        }
        final List<Integer> recipientPersonIds = this.recipientPersonIds;
        if (recipientPersonIds != null) {
            hashCode2 = recipientPersonIds.hashCode();
        }
        final int copyToStudent = this.copyToStudent ? 1 : 0;
        int n = 1;
        int n2 = copyToStudent;
        if (copyToStudent != 0) {
            n2 = 1;
        }
        final int requestConfirmation = this.requestConfirmation ? 1 : 0;
        if (requestConfirmation == 0) {
            n = requestConfirmation;
        }
        return (((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2) * 31 + n2) * 31 + n;
    }
    
    public final void setContent(@f final String content) {
        this.content = content;
    }
    
    public final void setCopyToStudent(final boolean copyToStudent) {
        this.copyToStudent = copyToStudent;
    }
    
    public final void setRecipientGroupIds(@f final List<String> recipientGroupIds) {
        this.recipientGroupIds = recipientGroupIds;
    }
    
    public final void setRecipientOption(@e final String recipientOption) {
        k0.p(recipientOption, "<set-?>");
        this.recipientOption = recipientOption;
    }
    
    public final void setRecipientPersonIds(@f final List<Integer> recipientPersonIds) {
        this.recipientPersonIds = recipientPersonIds;
    }
    
    public final void setRequestConfirmation(final boolean requestConfirmation) {
        this.requestConfirmation = requestConfirmation;
    }
    
    public final void setSubject(@e final String subject) {
        k0.p(subject, "<set-?>");
        this.subject = subject;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SendMessageBody(recipientOption=");
        sb.append(this.recipientOption);
        sb.append(", recipientGroupIds=");
        sb.append(this.recipientGroupIds);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", content=");
        sb.append((Object)this.content);
        sb.append(", recipientPersonIds=");
        sb.append(this.recipientPersonIds);
        sb.append(", copyToStudent=");
        sb.append(this.copyToStudent);
        sb.append(", requestConfirmation=");
        sb.append(this.requestConfirmation);
        sb.append(')');
        return sb.toString();
    }
}
