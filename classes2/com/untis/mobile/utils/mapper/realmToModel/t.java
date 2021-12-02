// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import com.untis.mobile.api.common.messenger.UMMessengerSettings;
import com.untis.mobile.api.common.messenger.UMMessengerChannel;
import com.untis.mobile.api.common.error.UMError;
import com.untis.mobile.utils.mapper.api.c;
import android.os.Parcelable;
import com.untis.mobile.persistence.models.booking.ValidationError;
import com.untis.mobile.persistence.models.messenger.MessengerChannelData;
import com.untis.mobile.api.dto.GetLessonChannelDataResponse;
import com.untis.mobile.persistence.models.messenger.MessengerCredential;
import com.untis.mobile.api.dto.GetMessengerCredentialsResponse;
import java.util.Iterator;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.text.s;
import com.untis.mobile.api.dto.LinkLessonChannelResponse;
import m6.k;
import com.untis.mobile.persistence.models.messenger.MessengerChannel;
import com.untis.mobile.api.dto.CreateLessonChannelResponse;
import com.untis.mobile.api.common.messenger.UMLessonOfChannel;
import java.util.List;
import com.untis.mobile.persistence.models.messenger.MessengerChannelCandidate;
import com.untis.mobile.api.common.messenger.UMLinkableMessengerChannel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.masterdata.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/t;", "", "Lcom/untis/mobile/api/common/messenger/UMLinkableMessengerChannel;", "channel", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannelCandidate;", "a", "", "Lcom/untis/mobile/api/common/messenger/UMLessonOfChannel;", "lessonsOfChannel", "", "e", "lesson", "d", "Lcom/untis/mobile/api/dto/GetLessonChannelDataResponse;", "response", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannelData;", "g", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "<init>", "(Lcom/untis/mobile/services/masterdata/a;)V", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class t
{
    @e
    public static final a b;
    @e
    private final com.untis.mobile.services.masterdata.a a;
    
    static {
        b = new a(null);
    }
    
    public t(@e final com.untis.mobile.services.masterdata.a a) {
        k0.p(a, "masterDataService");
        this.a = a;
    }
    
    private final MessengerChannelCandidate a(final UMLinkableMessengerChannel umLinkableMessengerChannel) {
        if (umLinkableMessengerChannel == null) {
            return null;
        }
        final String channelName = umLinkableMessengerChannel.channelName;
        if (channelName == null) {
            return null;
        }
        final String e = this.e(umLinkableMessengerChannel.lessonsOfChannel);
        final String channelId = umLinkableMessengerChannel.channelId;
        if (channelId == null) {
            return null;
        }
        return new MessengerChannelCandidate(channelName, e, channelId);
    }
    
    @k
    @e
    public static final MessengerChannel b(@e final CreateLessonChannelResponse createLessonChannelResponse) {
        return t.b.a(createLessonChannelResponse);
    }
    
    @k
    @e
    public static final MessengerChannel c(@e final LinkLessonChannelResponse linkLessonChannelResponse) {
        return t.b.b(linkLessonChannelResponse);
    }
    
    private final String d(final UMLessonOfChannel umLessonOfChannel) {
        final com.untis.mobile.services.masterdata.a a = this.a;
        final Long subjectId = umLessonOfChannel.subjectId;
        k0.o(subjectId, "lesson.subjectId");
        final Subject u = a.U(subjectId.longValue());
        String c = "";
        if (u != null) {
            c = k0.C("", u.getName());
        }
        final com.untis.mobile.services.masterdata.a a2 = this.a;
        final List<Long> klassenIds = umLessonOfChannel.klassenIds;
        k0.o(klassenIds, "lesson.klassenIds");
        final List<Klasse> d = a2.D(klassenIds);
        String c2 = c;
        if (d.isEmpty() ^ true) {
            String c3 = c;
            if (s.U1((CharSequence)c) ^ true) {
                c3 = k0.C(c, " - ");
            }
            final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)d, 10));
            final Iterator<Object> iterator = d.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().getDisplayableTitle());
            }
            final Iterator<String> iterator2 = list.iterator();
            if (!iterator2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            final String next = iterator2.next();
            if (iterator2.hasNext()) {
                final String s = iterator2.next();
                String c4;
                final String s2 = c4 = next;
                if (kotlin.text.s.U1((CharSequence)s2) ^ true) {
                    c4 = k0.C(s2, ", ");
                }
                return k0.C(c4, s);
            }
            c2 = k0.C(c3, next);
        }
        return c2;
    }
    
    private final String e(final List<? extends UMLessonOfChannel> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        final ArrayList<String> list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(this.d((UMLessonOfChannel)iterator.next()));
        }
        final Iterator<Object> iterator2 = list2.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                String c;
                final String s3 = c = s;
                if (kotlin.text.s.U1((CharSequence)s3) ^ true) {
                    c = k0.C(s3, ", ");
                }
                s = k0.C(c, s2);
            }
            return s;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    @k
    @e
    public static final MessengerCredential f(@e final GetMessengerCredentialsResponse getMessengerCredentialsResponse) {
        return t.b.c(getMessengerCredentialsResponse);
    }
    
    @e
    public final MessengerChannelData g(@e final GetLessonChannelDataResponse getLessonChannelDataResponse) {
        k0.p(getLessonChannelDataResponse, "response");
        final List<UMLinkableMessengerChannel> linkableChannels = getLessonChannelDataResponse.linkableChannels;
        ArrayList<MessengerChannelCandidate> list;
        if (linkableChannels == null) {
            list = null;
        }
        else {
            final ArrayList<MessengerChannelCandidate> list2 = new ArrayList<MessengerChannelCandidate>();
            final Iterator<Object> iterator = linkableChannels.iterator();
            while (true) {
                list = list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final MessengerChannelCandidate a = this.a(iterator.next());
                if (a == null) {
                    continue;
                }
                list2.add(a);
            }
        }
        List<MessengerChannelCandidate> e;
        if ((e = list) == null) {
            e = v.E();
        }
        String suggestedName;
        if ((suggestedName = getLessonChannelDataResponse.suggestedName) == null) {
            suggestedName = "";
        }
        return new MessengerChannelData(suggestedName, e, null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\tH\u0007¨\u0006\r" }, d2 = { "com/untis/mobile/utils/mapper/realmToModel/t$a", "", "Lcom/untis/mobile/api/dto/GetMessengerCredentialsResponse;", "response", "Lcom/untis/mobile/persistence/models/messenger/MessengerCredential;", "c", "Lcom/untis/mobile/api/dto/CreateLessonChannelResponse;", "Lcom/untis/mobile/persistence/models/messenger/MessengerChannel;", "a", "Lcom/untis/mobile/api/dto/LinkLessonChannelResponse;", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final MessengerChannel a(@e final CreateLessonChannelResponse createLessonChannelResponse) {
            k0.p(createLessonChannelResponse, "response");
            final List<UMError> errors = createLessonChannelResponse.errors;
            if (errors != null) {
                k0.o(errors, "response.errors");
                if (errors.isEmpty() ^ true) {
                    throw new f5.a((List<ValidationError>)c.j().g(createLessonChannelResponse.errors));
                }
            }
            final UMMessengerChannel channel = createLessonChannelResponse.channel;
            String s = "";
            if (channel != null) {
                final String id = channel.id;
                if (id != null) {
                    s = id;
                }
            }
            return new MessengerChannel(s);
        }
        
        @k
        @e
        public final MessengerChannel b(@e final LinkLessonChannelResponse linkLessonChannelResponse) {
            k0.p(linkLessonChannelResponse, "response");
            final List<UMError> errors = linkLessonChannelResponse.errors;
            if (errors != null) {
                k0.o(errors, "response.errors");
                if (errors.isEmpty() ^ true) {
                    throw new f5.a((List<ValidationError>)c.j().g(linkLessonChannelResponse.errors));
                }
            }
            final UMMessengerChannel channel = linkLessonChannelResponse.channel;
            String s = "";
            if (channel != null) {
                final String id = channel.id;
                if (id != null) {
                    s = id;
                }
            }
            return new MessengerChannel(s);
        }
        
        @k
        @e
        public final MessengerCredential c(@e final GetMessengerCredentialsResponse getMessengerCredentialsResponse) {
            k0.p(getMessengerCredentialsResponse, "response");
            final List<UMError> errors = getMessengerCredentialsResponse.errors;
            if (errors != null) {
                k0.o(errors, "response.errors");
                if (errors.isEmpty() ^ true) {
                    throw new f5.a((List<ValidationError>)c.j().g(getMessengerCredentialsResponse.errors));
                }
            }
            final String authToken = getMessengerCredentialsResponse.authToken;
            String s = "";
            String s2;
            if ((s2 = authToken) == null) {
                s2 = "";
            }
            final UMMessengerSettings settings = getMessengerCredentialsResponse.settings;
            String serverUrl;
            if (settings == null || (serverUrl = settings.serverUrl) == null) {
                serverUrl = "";
            }
            if (settings != null) {
                final String organizationId = settings.organizationId;
                if (organizationId != null) {
                    s = organizationId;
                }
            }
            return new MessengerCredential(s2, serverUrl, s);
        }
    }
}
