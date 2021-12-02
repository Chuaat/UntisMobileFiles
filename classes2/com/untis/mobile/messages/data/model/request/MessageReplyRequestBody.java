// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model.request;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/messages/data/model/request/MessageReplyRequestBody;", "", "", "component1", "component2", "content", "subject", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getSubject", "setSubject", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessageReplyRequestBody
{
    @e
    private String content;
    @e
    private String subject;
    
    public MessageReplyRequestBody(@e final String content, @e final String subject) {
        k0.p(content, "content");
        k0.p(subject, "subject");
        this.content = content;
        this.subject = subject;
    }
    
    @e
    public final String component1() {
        return this.content;
    }
    
    @e
    public final String component2() {
        return this.subject;
    }
    
    @e
    public final MessageReplyRequestBody copy(@e final String s, @e final String s2) {
        k0.p(s, "content");
        k0.p(s2, "subject");
        return new MessageReplyRequestBody(s, s2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageReplyRequestBody)) {
            return false;
        }
        final MessageReplyRequestBody messageReplyRequestBody = (MessageReplyRequestBody)o;
        return k0.g(this.content, messageReplyRequestBody.content) && k0.g(this.subject, messageReplyRequestBody.subject);
    }
    
    @e
    public final String getContent() {
        return this.content;
    }
    
    @e
    public final String getSubject() {
        return this.subject;
    }
    
    @Override
    public int hashCode() {
        return this.content.hashCode() * 31 + this.subject.hashCode();
    }
    
    public final void setContent(@e final String content) {
        k0.p(content, "<set-?>");
        this.content = content;
    }
    
    public final void setSubject(@e final String subject) {
        k0.p(subject, "<set-?>");
        this.subject = subject;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MessageReplyRequestBody(content=");
        sb.append(this.content);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(')');
        return sb.toString();
    }
}
