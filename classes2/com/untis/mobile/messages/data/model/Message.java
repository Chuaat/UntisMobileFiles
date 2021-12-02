// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.Serializable;
import android.os.Parcel;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import com.untis.mobile.utils.jsonadapter.h;
import com.google.gson.annotations.JsonAdapter;
import org.jetbrains.annotations.f;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import android.os.Parcelable$Creator;
import b7.c;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bF\b\u0087\b\u0018\u00002\u00020\u0001B\u00ff\u0001\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010&\u001a\u00020\b\u0012\b\b\u0002\u0010'\u001a\u00020\n\u0012\u0006\u0010(\u001a\u00020\n\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010,\u001a\u00020\n\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\r\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\r\u0012\b\b\u0002\u0010/\u001a\u00020\u0016\u0012\b\u00100\u001a\u0004\u0018\u00010\u0018\u0012\b\u00101\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u00102\u001a\u00020\n\u0012\b\b\u0002\u00103\u001a\u00020\n\u0012\b\b\u0002\u00104\u001a\u00020\n\u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\r\u0012\b\b\u0002\u00106\u001a\u00020\n\u0012\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u00000\r¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\f\u001a\u00020\nH\u00c6\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\nH\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\rH\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\rH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0016H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\rH\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00000\rH\u00c6\u0003J\u0093\u0002\u00108\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\n2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010,\u001a\u00020\n2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\b\b\u0002\u0010/\u001a\u00020\u00162\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u00102\u001a\u00020\n2\b\b\u0002\u00103\u001a\u00020\n2\b\b\u0002\u00104\u001a\u00020\n2\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\b\b\u0002\u00106\u001a\u00020\n2\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u00000\rH\u00c6\u0001J\t\u00109\u001a\u00020\u0002H\u00d6\u0001J\t\u0010:\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010=\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010;H\u00d6\u0003J\t\u0010>\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0016H\u00d6\u0001R\"\u0010/\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u00104\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010N\u001a\u0004\b4\u0010O\"\u0004\bP\u0010QR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010I\u001a\u0004\bR\u0010K\"\u0004\bS\u0010MR(\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR(\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010T\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR(\u00107\u001a\b\u0012\u0004\u0012\u00020\u00000\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u00102\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010N\u001a\u0004\b]\u0010O\"\u0004\b^\u0010QR\"\u0010'\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010N\u001a\u0004\b'\u0010O\"\u0004\b_\u0010QR$\u0010+\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010&\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u00100\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u00101\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010(\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010N\u001a\u0004\bt\u0010O\"\u0004\bu\u0010QR(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010T\u001a\u0004\bv\u0010V\"\u0004\bw\u0010XR$\u0010*\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010I\u001a\u0004\bx\u0010K\"\u0004\by\u0010MR$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010I\u001a\u0004\bz\u0010K\"\u0004\b{\u0010MR\"\u0010,\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010N\u001a\u0004\b,\u0010O\"\u0004\b|\u0010QR&\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b#\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R,\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b)\u0010T\u001a\u0005\b\u0082\u0001\u0010V\"\u0005\b\u0083\u0001\u0010XR#\u00103\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b3\u0010N\u001a\u0004\b3\u0010O\"\u0005\b\u0084\u0001\u0010QR#\u00106\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b6\u0010N\u001a\u0004\b6\u0010O\"\u0005\b\u0085\u0001\u0010Q¨\u0006\u0088\u0001" }, d2 = { "Lcom/untis/mobile/messages/data/model/Message;", "Landroid/os/Parcelable;", "", "component1", "Lcom/untis/mobile/messages/data/model/Sender;", "component2", "component3", "component4", "Lorg/joda/time/c;", "component5", "", "component6", "component7", "", "Lcom/untis/mobile/messages/data/model/MessageAttachment;", "component8", "component9", "component10", "component11", "Lcom/untis/mobile/messages/data/model/Recipient;", "component12", "component13", "", "component14", "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "component15", "Lcom/untis/mobile/messages/data/model/RequestConfirmationStatus;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "id", "sender", "subject", "contentPreview", "sentDateTime", "isRead", "hasAttachments", "attachments", "content", "messageBlobAttachment", "isReportMessage", "recipientGroups", "recipientPersons", "numberOfRecipients", "messageRequestConfirmation", "requestConfirmationStatus", "allowMessageDeletion", "isReply", "isReplyAllowed", "recipients", "isRevoked", "replyHistory", "copy", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "I", "getNumberOfRecipients", "()I", "setNumberOfRecipients", "(I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Z", "()Z", "setReplyAllowed", "(Z)V", "getContentPreview", "setContentPreview", "Ljava/util/List;", "getRecipients", "()Ljava/util/List;", "setRecipients", "(Ljava/util/List;)V", "getRecipientGroups", "setRecipientGroups", "getReplyHistory", "setReplyHistory", "getAllowMessageDeletion", "setAllowMessageDeletion", "setRead", "Lcom/untis/mobile/messages/data/model/MessageAttachment;", "getMessageBlobAttachment", "()Lcom/untis/mobile/messages/data/model/MessageAttachment;", "setMessageBlobAttachment", "(Lcom/untis/mobile/messages/data/model/MessageAttachment;)V", "Lorg/joda/time/c;", "getSentDateTime", "()Lorg/joda/time/c;", "setSentDateTime", "(Lorg/joda/time/c;)V", "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "getMessageRequestConfirmation", "()Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "setMessageRequestConfirmation", "(Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;)V", "Lcom/untis/mobile/messages/data/model/RequestConfirmationStatus;", "getRequestConfirmationStatus", "()Lcom/untis/mobile/messages/data/model/RequestConfirmationStatus;", "setRequestConfirmationStatus", "(Lcom/untis/mobile/messages/data/model/RequestConfirmationStatus;)V", "getHasAttachments", "setHasAttachments", "getRecipientPersons", "setRecipientPersons", "getContent", "setContent", "getSubject", "setSubject", "setReportMessage", "Lcom/untis/mobile/messages/data/model/Sender;", "getSender", "()Lcom/untis/mobile/messages/data/model/Sender;", "setSender", "(Lcom/untis/mobile/messages/data/model/Sender;)V", "getAttachments", "setAttachments", "setReply", "setRevoked", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/messages/data/model/Sender;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/c;ZZLjava/util/List;Ljava/lang/String;Lcom/untis/mobile/messages/data/model/MessageAttachment;ZLjava/util/List;Ljava/util/List;ILcom/untis/mobile/messages/data/model/MessageRequestConfirmation;Lcom/untis/mobile/messages/data/model/RequestConfirmationStatus;ZZZLjava/util/List;ZLjava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@c
public final class Message implements Parcelable
{
    @e
    public static final Parcelable$Creator<Message> CREATOR;
    @SerializedName("allowMessageDeletion")
    private boolean allowMessageDeletion;
    @SerializedName("attachments")
    @f
    private List<MessageAttachment> attachments;
    @SerializedName("content")
    @f
    private String content;
    @SerializedName("contentPreview")
    @f
    private String contentPreview;
    @SerializedName("hasAttachments")
    private boolean hasAttachments;
    @SerializedName("id")
    @e
    private String id;
    @SerializedName("isMessageRead")
    private boolean isRead;
    @SerializedName("isReply")
    private boolean isReply;
    @SerializedName("isReplyAllowed")
    private boolean isReplyAllowed;
    @SerializedName("isReportMessage")
    private boolean isReportMessage;
    @SerializedName("isRevoked")
    private boolean isRevoked;
    @SerializedName("blobAttachment")
    @f
    private MessageAttachment messageBlobAttachment;
    @SerializedName("requestConfirmation")
    @f
    private MessageRequestConfirmation messageRequestConfirmation;
    @SerializedName("numberOfRecipients")
    private int numberOfRecipients;
    @SerializedName("recipientGroups")
    @e
    private List<Recipient> recipientGroups;
    @SerializedName("recipientPersons")
    @e
    private List<Recipient> recipientPersons;
    @SerializedName("recipients")
    @e
    private List<Recipient> recipients;
    @SerializedName("replyHistory")
    @e
    private List<Message> replyHistory;
    @SerializedName("requestConfirmationStatus")
    @f
    private RequestConfirmationStatus requestConfirmationStatus;
    @SerializedName("sender")
    @f
    private Sender sender;
    @JsonAdapter(h.class)
    @SerializedName("sentDateTime")
    @e
    private org.joda.time.c sentDateTime;
    @SerializedName("subject")
    @f
    private String subject;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Message(@e final String id, @f final Sender sender, @f final String subject, @f final String contentPreview, @e final org.joda.time.c sentDateTime, final boolean isRead, final boolean hasAttachments, @f final List<MessageAttachment> attachments, @f final String content, @f final MessageAttachment messageBlobAttachment, final boolean isReportMessage, @e final List<Recipient> recipientGroups, @e final List<Recipient> recipientPersons, final int numberOfRecipients, @f final MessageRequestConfirmation messageRequestConfirmation, @f final RequestConfirmationStatus requestConfirmationStatus, final boolean allowMessageDeletion, final boolean isReply, final boolean isReplyAllowed, @e final List<Recipient> recipients, final boolean isRevoked, @e final List<Message> replyHistory) {
        k0.p(id, "id");
        k0.p(sentDateTime, "sentDateTime");
        k0.p(recipientGroups, "recipientGroups");
        k0.p(recipientPersons, "recipientPersons");
        k0.p(recipients, "recipients");
        k0.p(replyHistory, "replyHistory");
        this.id = id;
        this.sender = sender;
        this.subject = subject;
        this.contentPreview = contentPreview;
        this.sentDateTime = sentDateTime;
        this.isRead = isRead;
        this.hasAttachments = hasAttachments;
        this.attachments = attachments;
        this.content = content;
        this.messageBlobAttachment = messageBlobAttachment;
        this.isReportMessage = isReportMessage;
        this.recipientGroups = recipientGroups;
        this.recipientPersons = recipientPersons;
        this.numberOfRecipients = numberOfRecipients;
        this.messageRequestConfirmation = messageRequestConfirmation;
        this.requestConfirmationStatus = requestConfirmationStatus;
        this.allowMessageDeletion = allowMessageDeletion;
        this.isReply = isReply;
        this.isReplyAllowed = isReplyAllowed;
        this.recipients = recipients;
        this.isRevoked = isRevoked;
        this.replyHistory = replyHistory;
    }
    
    @e
    public final String component1() {
        return this.id;
    }
    
    @f
    public final MessageAttachment component10() {
        return this.messageBlobAttachment;
    }
    
    public final boolean component11() {
        return this.isReportMessage;
    }
    
    @e
    public final List<Recipient> component12() {
        return this.recipientGroups;
    }
    
    @e
    public final List<Recipient> component13() {
        return this.recipientPersons;
    }
    
    public final int component14() {
        return this.numberOfRecipients;
    }
    
    @f
    public final MessageRequestConfirmation component15() {
        return this.messageRequestConfirmation;
    }
    
    @f
    public final RequestConfirmationStatus component16() {
        return this.requestConfirmationStatus;
    }
    
    public final boolean component17() {
        return this.allowMessageDeletion;
    }
    
    public final boolean component18() {
        return this.isReply;
    }
    
    public final boolean component19() {
        return this.isReplyAllowed;
    }
    
    @f
    public final Sender component2() {
        return this.sender;
    }
    
    @e
    public final List<Recipient> component20() {
        return this.recipients;
    }
    
    public final boolean component21() {
        return this.isRevoked;
    }
    
    @e
    public final List<Message> component22() {
        return this.replyHistory;
    }
    
    @f
    public final String component3() {
        return this.subject;
    }
    
    @f
    public final String component4() {
        return this.contentPreview;
    }
    
    @e
    public final org.joda.time.c component5() {
        return this.sentDateTime;
    }
    
    public final boolean component6() {
        return this.isRead;
    }
    
    public final boolean component7() {
        return this.hasAttachments;
    }
    
    @f
    public final List<MessageAttachment> component8() {
        return this.attachments;
    }
    
    @f
    public final String component9() {
        return this.content;
    }
    
    @e
    public final Message copy(@e final String s, @f final Sender sender, @f final String s2, @f final String s3, @e final org.joda.time.c c, final boolean b, final boolean b2, @f final List<MessageAttachment> list, @f final String s4, @f final MessageAttachment messageAttachment, final boolean b3, @e final List<Recipient> list2, @e final List<Recipient> list3, final int n, @f final MessageRequestConfirmation messageRequestConfirmation, @f final RequestConfirmationStatus requestConfirmationStatus, final boolean b4, final boolean b5, final boolean b6, @e final List<Recipient> list4, final boolean b7, @e final List<Message> list5) {
        k0.p(s, "id");
        k0.p(c, "sentDateTime");
        k0.p(list2, "recipientGroups");
        k0.p(list3, "recipientPersons");
        k0.p(list4, "recipients");
        k0.p(list5, "replyHistory");
        return new Message(s, sender, s2, s3, c, b, b2, list, s4, messageAttachment, b3, list2, list3, n, messageRequestConfirmation, requestConfirmationStatus, b4, b5, b6, list4, b7, list5);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Message)) {
            return false;
        }
        final Message message = (Message)o;
        return k0.g(this.id, message.id) && k0.g(this.sender, message.sender) && k0.g(this.subject, message.subject) && k0.g(this.contentPreview, message.contentPreview) && k0.g(this.sentDateTime, message.sentDateTime) && this.isRead == message.isRead && this.hasAttachments == message.hasAttachments && k0.g(this.attachments, message.attachments) && k0.g(this.content, message.content) && k0.g(this.messageBlobAttachment, message.messageBlobAttachment) && this.isReportMessage == message.isReportMessage && k0.g(this.recipientGroups, message.recipientGroups) && k0.g(this.recipientPersons, message.recipientPersons) && this.numberOfRecipients == message.numberOfRecipients && k0.g(this.messageRequestConfirmation, message.messageRequestConfirmation) && k0.g(this.requestConfirmationStatus, message.requestConfirmationStatus) && this.allowMessageDeletion == message.allowMessageDeletion && this.isReply == message.isReply && this.isReplyAllowed == message.isReplyAllowed && k0.g(this.recipients, message.recipients) && this.isRevoked == message.isRevoked && k0.g(this.replyHistory, message.replyHistory);
    }
    
    public final boolean getAllowMessageDeletion() {
        return this.allowMessageDeletion;
    }
    
    @f
    public final List<MessageAttachment> getAttachments() {
        return this.attachments;
    }
    
    @f
    public final String getContent() {
        return this.content;
    }
    
    @f
    public final String getContentPreview() {
        return this.contentPreview;
    }
    
    public final boolean getHasAttachments() {
        return this.hasAttachments;
    }
    
    @e
    public final String getId() {
        return this.id;
    }
    
    @f
    public final MessageAttachment getMessageBlobAttachment() {
        return this.messageBlobAttachment;
    }
    
    @f
    public final MessageRequestConfirmation getMessageRequestConfirmation() {
        return this.messageRequestConfirmation;
    }
    
    public final int getNumberOfRecipients() {
        return this.numberOfRecipients;
    }
    
    @e
    public final List<Recipient> getRecipientGroups() {
        return this.recipientGroups;
    }
    
    @e
    public final List<Recipient> getRecipientPersons() {
        return this.recipientPersons;
    }
    
    @e
    public final List<Recipient> getRecipients() {
        return this.recipients;
    }
    
    @e
    public final List<Message> getReplyHistory() {
        return this.replyHistory;
    }
    
    @f
    public final RequestConfirmationStatus getRequestConfirmationStatus() {
        return this.requestConfirmationStatus;
    }
    
    @f
    public final Sender getSender() {
        return this.sender;
    }
    
    @e
    public final org.joda.time.c getSentDateTime() {
        return this.sentDateTime;
    }
    
    @f
    public final String getSubject() {
        return this.subject;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final Sender sender = this.sender;
        int hashCode2 = 0;
        int hashCode3;
        if (sender == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = sender.hashCode();
        }
        final String subject = this.subject;
        int hashCode4;
        if (subject == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = subject.hashCode();
        }
        final String contentPreview = this.contentPreview;
        int hashCode5;
        if (contentPreview == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = contentPreview.hashCode();
        }
        final int hashCode6 = ((org.joda.time.base.c)this.sentDateTime).hashCode();
        final int isRead = this.isRead ? 1 : 0;
        int n = 1;
        int n2 = isRead;
        if (isRead != 0) {
            n2 = 1;
        }
        int hasAttachments;
        if ((hasAttachments = (this.hasAttachments ? 1 : 0)) != 0) {
            hasAttachments = 1;
        }
        final List<MessageAttachment> attachments = this.attachments;
        int hashCode7;
        if (attachments == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = attachments.hashCode();
        }
        final String content = this.content;
        int hashCode8;
        if (content == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = content.hashCode();
        }
        final MessageAttachment messageBlobAttachment = this.messageBlobAttachment;
        int hashCode9;
        if (messageBlobAttachment == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = messageBlobAttachment.hashCode();
        }
        int isReportMessage;
        if ((isReportMessage = (this.isReportMessage ? 1 : 0)) != 0) {
            isReportMessage = 1;
        }
        final int hashCode10 = this.recipientGroups.hashCode();
        final int hashCode11 = this.recipientPersons.hashCode();
        final int numberOfRecipients = this.numberOfRecipients;
        final MessageRequestConfirmation messageRequestConfirmation = this.messageRequestConfirmation;
        int hashCode12;
        if (messageRequestConfirmation == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = messageRequestConfirmation.hashCode();
        }
        final RequestConfirmationStatus requestConfirmationStatus = this.requestConfirmationStatus;
        if (requestConfirmationStatus != null) {
            hashCode2 = requestConfirmationStatus.hashCode();
        }
        int allowMessageDeletion;
        if ((allowMessageDeletion = (this.allowMessageDeletion ? 1 : 0)) != 0) {
            allowMessageDeletion = 1;
        }
        int isReply;
        if ((isReply = (this.isReply ? 1 : 0)) != 0) {
            isReply = 1;
        }
        int isReplyAllowed;
        if ((isReplyAllowed = (this.isReplyAllowed ? 1 : 0)) != 0) {
            isReplyAllowed = 1;
        }
        final int hashCode13 = this.recipients.hashCode();
        final int isRevoked = this.isRevoked ? 1 : 0;
        if (isRevoked == 0) {
            n = isRevoked;
        }
        return ((((((((((((((((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + n2) * 31 + hasAttachments) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + isReportMessage) * 31 + hashCode10) * 31 + hashCode11) * 31 + numberOfRecipients) * 31 + hashCode12) * 31 + hashCode2) * 31 + allowMessageDeletion) * 31 + isReply) * 31 + isReplyAllowed) * 31 + hashCode13) * 31 + n) * 31 + this.replyHistory.hashCode();
    }
    
    public final boolean isRead() {
        return this.isRead;
    }
    
    public final boolean isReply() {
        return this.isReply;
    }
    
    public final boolean isReplyAllowed() {
        return this.isReplyAllowed;
    }
    
    public final boolean isReportMessage() {
        return this.isReportMessage;
    }
    
    public final boolean isRevoked() {
        return this.isRevoked;
    }
    
    public final void setAllowMessageDeletion(final boolean allowMessageDeletion) {
        this.allowMessageDeletion = allowMessageDeletion;
    }
    
    public final void setAttachments(@f final List<MessageAttachment> attachments) {
        this.attachments = attachments;
    }
    
    public final void setContent(@f final String content) {
        this.content = content;
    }
    
    public final void setContentPreview(@f final String contentPreview) {
        this.contentPreview = contentPreview;
    }
    
    public final void setHasAttachments(final boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }
    
    public final void setId(@e final String id) {
        k0.p(id, "<set-?>");
        this.id = id;
    }
    
    public final void setMessageBlobAttachment(@f final MessageAttachment messageBlobAttachment) {
        this.messageBlobAttachment = messageBlobAttachment;
    }
    
    public final void setMessageRequestConfirmation(@f final MessageRequestConfirmation messageRequestConfirmation) {
        this.messageRequestConfirmation = messageRequestConfirmation;
    }
    
    public final void setNumberOfRecipients(final int numberOfRecipients) {
        this.numberOfRecipients = numberOfRecipients;
    }
    
    public final void setRead(final boolean isRead) {
        this.isRead = isRead;
    }
    
    public final void setRecipientGroups(@e final List<Recipient> recipientGroups) {
        k0.p(recipientGroups, "<set-?>");
        this.recipientGroups = recipientGroups;
    }
    
    public final void setRecipientPersons(@e final List<Recipient> recipientPersons) {
        k0.p(recipientPersons, "<set-?>");
        this.recipientPersons = recipientPersons;
    }
    
    public final void setRecipients(@e final List<Recipient> recipients) {
        k0.p(recipients, "<set-?>");
        this.recipients = recipients;
    }
    
    public final void setReply(final boolean isReply) {
        this.isReply = isReply;
    }
    
    public final void setReplyAllowed(final boolean isReplyAllowed) {
        this.isReplyAllowed = isReplyAllowed;
    }
    
    public final void setReplyHistory(@e final List<Message> replyHistory) {
        k0.p(replyHistory, "<set-?>");
        this.replyHistory = replyHistory;
    }
    
    public final void setReportMessage(final boolean isReportMessage) {
        this.isReportMessage = isReportMessage;
    }
    
    public final void setRequestConfirmationStatus(@f final RequestConfirmationStatus requestConfirmationStatus) {
        this.requestConfirmationStatus = requestConfirmationStatus;
    }
    
    public final void setRevoked(final boolean isRevoked) {
        this.isRevoked = isRevoked;
    }
    
    public final void setSender(@f final Sender sender) {
        this.sender = sender;
    }
    
    public final void setSentDateTime(@e final org.joda.time.c sentDateTime) {
        k0.p(sentDateTime, "<set-?>");
        this.sentDateTime = sentDateTime;
    }
    
    public final void setSubject(@f final String subject) {
        this.subject = subject;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Message(id=");
        sb.append(this.id);
        sb.append(", sender=");
        sb.append(this.sender);
        sb.append(", subject=");
        sb.append((Object)this.subject);
        sb.append(", contentPreview=");
        sb.append((Object)this.contentPreview);
        sb.append(", sentDateTime=");
        sb.append(this.sentDateTime);
        sb.append(", isRead=");
        sb.append(this.isRead);
        sb.append(", hasAttachments=");
        sb.append(this.hasAttachments);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", content=");
        sb.append((Object)this.content);
        sb.append(", messageBlobAttachment=");
        sb.append(this.messageBlobAttachment);
        sb.append(", isReportMessage=");
        sb.append(this.isReportMessage);
        sb.append(", recipientGroups=");
        sb.append(this.recipientGroups);
        sb.append(", recipientPersons=");
        sb.append(this.recipientPersons);
        sb.append(", numberOfRecipients=");
        sb.append(this.numberOfRecipients);
        sb.append(", messageRequestConfirmation=");
        sb.append(this.messageRequestConfirmation);
        sb.append(", requestConfirmationStatus=");
        sb.append(this.requestConfirmationStatus);
        sb.append(", allowMessageDeletion=");
        sb.append(this.allowMessageDeletion);
        sb.append(", isReply=");
        sb.append(this.isReply);
        sb.append(", isReplyAllowed=");
        sb.append(this.isReplyAllowed);
        sb.append(", recipients=");
        sb.append(this.recipients);
        sb.append(", isRevoked=");
        sb.append(this.isRevoked);
        sb.append(", replyHistory=");
        sb.append(this.replyHistory);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "out");
        parcel.writeString(this.id);
        final Sender sender = this.sender;
        if (sender == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            sender.writeToParcel(parcel, n);
        }
        parcel.writeString(this.subject);
        parcel.writeString(this.contentPreview);
        parcel.writeSerializable((Serializable)this.sentDateTime);
        parcel.writeInt((int)(this.isRead ? 1 : 0));
        parcel.writeInt((int)(this.hasAttachments ? 1 : 0));
        final List<MessageAttachment> attachments = this.attachments;
        if (attachments == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt(attachments.size());
            final Iterator<MessageAttachment> iterator = attachments.iterator();
            while (iterator.hasNext()) {
                iterator.next().writeToParcel(parcel, n);
            }
        }
        parcel.writeString(this.content);
        final MessageAttachment messageBlobAttachment = this.messageBlobAttachment;
        if (messageBlobAttachment == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            messageBlobAttachment.writeToParcel(parcel, n);
        }
        parcel.writeInt((int)(this.isReportMessage ? 1 : 0));
        final List<Recipient> recipientGroups = this.recipientGroups;
        parcel.writeInt(recipientGroups.size());
        final Iterator<Recipient> iterator2 = recipientGroups.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().writeToParcel(parcel, n);
        }
        final List<Recipient> recipientPersons = this.recipientPersons;
        parcel.writeInt(recipientPersons.size());
        final Iterator<Recipient> iterator3 = recipientPersons.iterator();
        while (iterator3.hasNext()) {
            iterator3.next().writeToParcel(parcel, n);
        }
        parcel.writeInt(this.numberOfRecipients);
        final MessageRequestConfirmation messageRequestConfirmation = this.messageRequestConfirmation;
        if (messageRequestConfirmation == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            messageRequestConfirmation.writeToParcel(parcel, n);
        }
        final RequestConfirmationStatus requestConfirmationStatus = this.requestConfirmationStatus;
        if (requestConfirmationStatus == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            requestConfirmationStatus.writeToParcel(parcel, n);
        }
        parcel.writeInt((int)(this.allowMessageDeletion ? 1 : 0));
        parcel.writeInt((int)(this.isReply ? 1 : 0));
        parcel.writeInt((int)(this.isReplyAllowed ? 1 : 0));
        final List<Recipient> recipients = this.recipients;
        parcel.writeInt(recipients.size());
        final Iterator<Recipient> iterator4 = recipients.iterator();
        while (iterator4.hasNext()) {
            iterator4.next().writeToParcel(parcel, n);
        }
        parcel.writeInt((int)(this.isRevoked ? 1 : 0));
        final List<Message> replyHistory = this.replyHistory;
        parcel.writeInt(replyHistory.size());
        final Iterator<Message> iterator5 = replyHistory.iterator();
        while (iterator5.hasNext()) {
            iterator5.next().writeToParcel(parcel, n);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class Creator implements Parcelable$Creator<Message>
    {
        @e
        public final Message createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            final String string = parcel.readString();
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = Sender.CREATOR.createFromParcel(parcel);
            }
            final Sender sender = (Sender)fromParcel;
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final org.joda.time.c c = (org.joda.time.c)parcel.readSerializable();
            final boolean b = parcel.readInt() != 0;
            final boolean b2 = parcel.readInt() != 0;
            List<MessageAttachment> list;
            if (parcel.readInt() == 0) {
                list = null;
            }
            else {
                final int int1 = parcel.readInt();
                final ArrayList list2 = new ArrayList<MessageAttachment>(int1);
                int n = 0;
                while (true) {
                    list = (List<MessageAttachment>)list2;
                    if (n == int1) {
                        break;
                    }
                    list2.add((MessageAttachment)MessageAttachment.CREATOR.createFromParcel(parcel));
                    ++n;
                }
            }
            final String string4 = parcel.readString();
            Object fromParcel2;
            if (parcel.readInt() == 0) {
                fromParcel2 = null;
            }
            else {
                fromParcel2 = MessageAttachment.CREATOR.createFromParcel(parcel);
            }
            final MessageAttachment messageAttachment = (MessageAttachment)fromParcel2;
            final boolean b3 = parcel.readInt() != 0;
            final int int2 = parcel.readInt();
            final ArrayList list3 = new ArrayList<Recipient>(int2);
            for (int i = 0; i != int2; ++i) {
                list3.add((Recipient)Recipient.CREATOR.createFromParcel(parcel));
            }
            final int int3 = parcel.readInt();
            final ArrayList list4 = new ArrayList<Recipient>(int3);
            for (int j = 0; j != int3; ++j) {
                list4.add((Recipient)Recipient.CREATOR.createFromParcel(parcel));
            }
            final int int4 = parcel.readInt();
            Object fromParcel3;
            if (parcel.readInt() == 0) {
                fromParcel3 = null;
            }
            else {
                fromParcel3 = MessageRequestConfirmation.CREATOR.createFromParcel(parcel);
            }
            final MessageRequestConfirmation messageRequestConfirmation = (MessageRequestConfirmation)fromParcel3;
            Object fromParcel4;
            if (parcel.readInt() == 0) {
                fromParcel4 = null;
            }
            else {
                fromParcel4 = RequestConfirmationStatus.CREATOR.createFromParcel(parcel);
            }
            final RequestConfirmationStatus requestConfirmationStatus = (RequestConfirmationStatus)fromParcel4;
            final boolean b4 = parcel.readInt() != 0;
            final boolean b5 = parcel.readInt() != 0;
            final boolean b6 = parcel.readInt() != 0;
            final int int5 = parcel.readInt();
            final ArrayList list5 = new ArrayList<Recipient>(int5);
            for (int k = 0; k != int5; ++k) {
                list5.add((Recipient)Recipient.CREATOR.createFromParcel(parcel));
            }
            final boolean b7 = parcel.readInt() != 0;
            final int int6 = parcel.readInt();
            final ArrayList list6 = new ArrayList<Message>(int6);
            for (int l = 0; l != int6; ++l) {
                list6.add((Message)Message.CREATOR.createFromParcel(parcel));
            }
            return new Message(string, sender, string2, string3, c, b, b2, list, string4, messageAttachment, b3, (List<Recipient>)list3, (List<Recipient>)list4, int4, messageRequestConfirmation, requestConfirmationStatus, b4, b5, b6, (List<Recipient>)list5, b7, (List<Message>)list6);
        }
        
        @e
        public final Message[] newArray(final int n) {
            return new Message[n];
        }
    }
}
