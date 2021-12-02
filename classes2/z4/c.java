// 
// Decompiled by Procyon v0.5.36
// 

package z4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.realm.b;
import com.untis.mobile.persistence.realm.a;
import io.realm.l0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import io.realm.m5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b*\b\u0016\u0018\u00002\u00020\u0001B\u009c\u0004\u0012\t\b\u0002\u0010¬\u0001\u001a\u00020\t\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u0010l\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0091\u0001\u001a\u00020\t\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010`\u001a\u00020\t\u0012\u000b\b\u0002\u0010 \u0001\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0010\b\u0002\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010\u0017\u0012\u000e\b\u0002\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u0017\u0012\b\b\u0002\u0010J\u001a\u00020\u0010\u0012\b\b\u0002\u0010,\u001a\u00020\u0010\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010r\u001a\u00020\t\u0012\t\b\u0002\u0010\u0094\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u009d\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010©\u0001\u001a\u00020\t\u0012\b\b\u0002\u00108\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u0002\u0012\b\b\u0002\u0010]\u001a\u00020\t\u0012\b\b\u0002\u0010G\u001a\u00020%\u0012\b\b\u0002\u0010f\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\b\b\u0002\u0010c\u001a\u00020\u0010\u0012\b\b\u0002\u0010D\u001a\u00020\t\u0012\t\b\u0002\u0010\u0097\u0001\u001a\u00020\t\u0012\b\b\u0002\u0010i\u001a\u00020\t\u0012\b\b\u0002\u0010o\u001a\u00020\t\u0012\t\b\u0002\u0010\u009a\u0001\u001a\u00020\t\u0012\t\b\u0002\u0010¦\u0001\u001a\u00020\t\u0012\b\b\u0002\u0010;\u001a\u00020%\u0012\b\b\u0002\u0010>\u001a\u00020\t\u0012\u000e\b\u0002\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\t\b\u0002\u0010\u0084\u0001\u001a\u00020\t\u0012\b\b\u0002\u0010\"\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\t\b\u0002\u0010\u008b\u0001\u001a\u00020\u0002\u0012\b\b\u0002\u0010S\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u008e\u0001\u001a\u00020\u0002\u0012\b\b\u0002\u0010x\u001a\u00020\u0002\u0012\b\b\u0002\u0010A\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010M\u001a\u00020\u0010\u0012\b\b\u0002\u0010V\u001a\u00020\t¢\u0006\u0006\b¯\u0001\u0010°\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\"\u0010\"\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\"\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\"\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR$\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\"\u00108\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\"\u0010;\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010'\u001a\u0004\b<\u0010)\"\u0004\b=\u0010+R\"\u0010>\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u000b\u001a\u0004\b?\u0010\r\"\u0004\b@\u0010\u000fR\"\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR\"\u0010D\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u000b\u001a\u0004\bE\u0010\r\"\u0004\bF\u0010\u000fR\"\u0010G\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010'\u001a\u0004\bH\u0010)\"\u0004\bI\u0010+R\"\u0010J\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0012\u001a\u0004\bK\u0010\u0014\"\u0004\bL\u0010\u0016R\"\u0010M\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0012\u001a\u0004\bN\u0010\u0014\"\u0004\bO\u0010\u0016R(\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u001a\u001a\u0004\bQ\u0010\u001c\"\u0004\bR\u0010\u001eR\"\u0010S\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010\bR\"\u0010V\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010\u000b\u001a\u0004\bW\u0010\r\"\u0004\bX\u0010\u000fR(\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u001a\u001a\u0004\b[\u0010\u001c\"\u0004\b\\\u0010\u001eR\"\u0010]\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u000b\u001a\u0004\b^\u0010\r\"\u0004\b_\u0010\u000fR\"\u0010`\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010\u000b\u001a\u0004\ba\u0010\r\"\u0004\bb\u0010\u000fR\"\u0010c\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0012\u001a\u0004\bd\u0010\u0014\"\u0004\be\u0010\u0016R\"\u0010f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\u0004\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\"\u0010i\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010\u000b\u001a\u0004\bj\u0010\r\"\u0004\bk\u0010\u000fR\"\u0010l\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010\u0004\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\bR\"\u0010o\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010\u000b\u001a\u0004\bp\u0010\r\"\u0004\bq\u0010\u000fR\"\u0010r\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010\u000b\u001a\u0004\bs\u0010\r\"\u0004\bt\u0010\u000fR(\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010\u001a\u001a\u0004\bv\u0010\u001c\"\u0004\bw\u0010\u001eR\"\u0010x\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010\u0004\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\bR%\u0010{\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0081\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010\u0004\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR&\u0010\u0084\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010\u000b\u001a\u0005\b\u0085\u0001\u0010\r\"\u0005\b\u0086\u0001\u0010\u000fR-\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010\u001a\u001a\u0005\b\u0089\u0001\u0010\u001c\"\u0005\b\u008a\u0001\u0010\u001eR&\u0010\u008b\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010\u0004\u001a\u0005\b\u008c\u0001\u0010\u0006\"\u0005\b\u008d\u0001\u0010\bR&\u0010\u008e\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010\u0004\u001a\u0005\b\u008f\u0001\u0010\u0006\"\u0005\b\u0090\u0001\u0010\bR&\u0010\u0091\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010\u000b\u001a\u0005\b\u0092\u0001\u0010\r\"\u0005\b\u0093\u0001\u0010\u000fR&\u0010\u0094\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010\u0004\u001a\u0005\b\u0095\u0001\u0010\u0006\"\u0005\b\u0096\u0001\u0010\bR&\u0010\u0097\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010\u000b\u001a\u0005\b\u0098\u0001\u0010\r\"\u0005\b\u0099\u0001\u0010\u000fR&\u0010\u009a\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010\u000b\u001a\u0005\b\u009b\u0001\u0010\r\"\u0005\b\u009c\u0001\u0010\u000fR&\u0010\u009d\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010\u0004\u001a\u0005\b\u009e\u0001\u0010\u0006\"\u0005\b\u009f\u0001\u0010\bR+\u0010 \u0001\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R&\u0010¦\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010\u000b\u001a\u0005\b§\u0001\u0010\r\"\u0005\b¨\u0001\u0010\u000fR&\u0010©\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b©\u0001\u0010\u000b\u001a\u0005\bª\u0001\u0010\r\"\u0005\b«\u0001\u0010\u000fR&\u0010¬\u0001\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010\u000b\u001a\u0005\b\u00ad\u0001\u0010\r\"\u0005\b®\u0001\u0010\u000f¨\u0006±\u0001" }, d2 = { "Lz4/c;", "Lio/realm/p0;", "", "userAppSharedSecret", "Ljava/lang/String;", "Y8", "()Ljava/lang/String;", "U9", "(Ljava/lang/String;)V", "", "infoCenterTimestamp", "J", "u8", "()J", "q9", "(J)V", "", "schoolUseMobileService", "Z", "R8", "()Z", "N9", "(Z)V", "Lio/realm/l0;", "Lcom/untis/mobile/persistence/realm/a;", "userRights", "Lio/realm/l0;", "m9", "()Lio/realm/l0;", "ia", "(Lio/realm/l0;)V", "usable", "X8", "T9", "lockScreen", "x8", "t9", "", "userOriginalEntityType", "I", "l9", "()I", "ha", "(I)V", "userJupiter", "h9", "da", "userLogin", "j9", "fa", "schoolSemanticApiVersion", "N8", "J9", "userJupiterEclipse", "i9", "ea", "schoolServerUrl", "Q8", "M9", "lastViewedEntityType", "w8", "s9", "lastViewedEntityId", "v8", "r9", "authenticationToken", "s8", "o9", "periodDataTimestamp", "F8", "B9", "schoolApiVersion", "I8", "E9", "userHasTimeTableAccess", "f9", "ba", "showCalendarDetails", "T8", "P9", "lockScreenIds", "y8", "u9", "messengerOrganizationId", "B8", "x9", "registered", "G8", "C9", "Lcom/untis/mobile/persistence/realm/b;", "userClasses", "a9", "W9", "schoolServerDelta", "P8", "L9", "userOriginalEntityId", "k9", "ga", "updated", "W8", "S9", "schoolSemanticWuVersion", "O8", "K9", "officeHourTimestamp", "D8", "z9", "userDisplayName", "e9", "aa", "parentDayTimestamp", "E8", "A9", "userId", "g9", "ca", "states", "U8", "Q9", "registrationUrl", "H8", "D9", "userCustomEntityId", "Ljava/lang/Long;", "b9", "()Ljava/lang/Long;", "X9", "(Ljava/lang/Long;)V", "schoolMobileServiceUrl", "M8", "I9", "serverDownTimestamp", "S8", "O9", "Lz4/a;", "userChildren", "Z8", "V9", "messengerServerUrl", "C8", "y9", "substitutionPlanningUrl", "V8", "R9", "userDepartmentId", "d9", "Z9", "schoolLogin", "L8", "H9", "masterDataTimestamp", "z8", "v9", "messagesOfDayTimestamp", "A8", "w9", "schoolDisplayName", "J8", "F9", "userCustomEntityType", "Ljava/lang/Integer;", "c9", "()Ljava/lang/Integer;", "Y9", "(Ljava/lang/Integer;)V", "widgetTimestamp", "n9", "ja", "schoolId", "K8", "G9", "id", "t8", "p9", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIJLjava/lang/Integer;Ljava/lang/Long;Lio/realm/l0;Lio/realm/l0;Lio/realm/l0;ZZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;JILjava/lang/String;Ljava/lang/String;ZZJJJJJJIJLio/realm/l0;JZLio/realm/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class c extends p0 implements m5
{
    @e
    private String A0;
    @e
    private String B0;
    private long C0;
    private boolean D0;
    private long E0;
    @io.realm.annotations.e
    private long J;
    @e
    private String K;
    @e
    private String L;
    @e
    private String M;
    private long N;
    private int O;
    private long P;
    @f
    private Integer Q;
    @f
    private Long R;
    @e
    private l0<a> S;
    @e
    private l0<z4.a> T;
    @e
    private l0<b> U;
    private boolean V;
    private boolean W;
    @f
    private String X;
    private long Y;
    @e
    private String Z;
    @e
    private String a0;
    private long b0;
    @e
    private String c0;
    private boolean d0;
    @e
    private String e0;
    private long f0;
    private int g0;
    @e
    private String h0;
    @e
    private String i0;
    private boolean j0;
    private boolean k0;
    private long l0;
    private long m0;
    private long n0;
    private long o0;
    private long p0;
    private long q0;
    private int r0;
    private long s0;
    @e
    private l0<a> t0;
    private long u0;
    private boolean v0;
    @e
    private l0<a> w0;
    @e
    private String x0;
    @e
    private String y0;
    @e
    private String z0;
    
    public c() {
        this(0L, null, null, null, 0L, 0, 0L, null, null, null, null, null, false, false, null, 0L, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, 0, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public c(final long n, @e final String s, @e final String s2, @e final String s3, final long n2, final int n3, final long n4, @f final Integer n5, @f final Long n6, @e final l0<a> l0, @e final l0<z4.a> l2, @e final l0<b> l3, final boolean b, final boolean b2, @f final String s4, final long n7, @e final String s5, @e final String s6, final long n8, @e final String s7, final boolean b3, @e final String s8, final long n9, final int n10, @e final String s9, @e final String s10, final boolean b4, final boolean b5, final long n11, final long n12, final long n13, final long n14, final long n15, final long n16, final int n17, final long n18, @e final l0<a> l4, final long n19, final boolean b6, @e final l0<a> l5, @e final String s11, @e final String s12, @e final String s13, @e final String s14, @e final String s15, final long n20, final boolean b7, final long n21) {
        kotlin.jvm.internal.k0.p(s, "userLogin");
        kotlin.jvm.internal.k0.p(s2, "userDisplayName");
        kotlin.jvm.internal.k0.p(s3, "userAppSharedSecret");
        kotlin.jvm.internal.k0.p(l0, "userRights");
        kotlin.jvm.internal.k0.p(l2, "userChildren");
        kotlin.jvm.internal.k0.p(l3, "userClasses");
        kotlin.jvm.internal.k0.p(s5, "schoolLogin");
        kotlin.jvm.internal.k0.p(s6, "schoolDisplayName");
        kotlin.jvm.internal.k0.p(s7, "schoolServerUrl");
        kotlin.jvm.internal.k0.p(s8, "schoolMobileServiceUrl");
        kotlin.jvm.internal.k0.p(s9, "schoolSemanticWuVersion");
        kotlin.jvm.internal.k0.p(s10, "schoolSemanticApiVersion");
        kotlin.jvm.internal.k0.p(l4, "states");
        kotlin.jvm.internal.k0.p(l5, "lockScreenIds");
        kotlin.jvm.internal.k0.p(s11, "messengerServerUrl");
        kotlin.jvm.internal.k0.p(s12, "messengerOrganizationId");
        kotlin.jvm.internal.k0.p(s13, "substitutionPlanningUrl");
        kotlin.jvm.internal.k0.p(s14, "registrationUrl");
        kotlin.jvm.internal.k0.p(s15, "authenticationToken");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.C7(s);
        this.r5(s2);
        this.Q3(s3);
        this.m6(n2);
        this.e4(n3);
        this.x2(n4);
        this.R1(n5);
        this.B2(n6);
        this.W4(l0);
        this.T1(l2);
        this.U4(l3);
        this.o4(b);
        this.W2(b2);
        this.L2(s4);
        this.N2(n7);
        this.l3(s5);
        this.A5(s6);
        this.j4(n8);
        this.L6(s7);
        this.D6(b3);
        this.K3(s8);
        this.k3(n9);
        this.f5(n10);
        this.o7(s9);
        this.d7(s10);
        this.Y1(b4);
        this.T5(b5);
        this.f2(n11);
        this.O5(n12);
        this.L4(n13);
        this.a6(n14);
        this.u6(n15);
        this.w4(n16);
        this.A6(n17);
        this.z2(n18);
        this.j1(l4);
        this.N3(n19);
        this.e3(b6);
        this.F4(l5);
        this.H4(s11);
        this.h3(s12);
        this.B7(s13);
        this.s4(s14);
        this.I7(s15);
        this.h6(n20);
        this.p3(b7);
        this.P4(n21);
    }
    
    @Override
    public long A0() {
        return this.E0;
    }
    
    @Override
    public void A5(final String a0) {
        this.a0 = a0;
    }
    
    @Override
    public void A6(final int r0) {
        this.r0 = r0;
    }
    
    public final long A8() {
        return this.j6();
    }
    
    public final void A9(final long n) {
        this.a6(n);
    }
    
    @Override
    public void B2(final Long r) {
        this.R = r;
    }
    
    @Override
    public void B7(final String z0) {
        this.z0 = z0;
    }
    
    @e
    public final String B8() {
        return this.L5();
    }
    
    public final void B9(final long n) {
        this.f2(n);
    }
    
    @Override
    public long C2() {
        return this.b0;
    }
    
    @Override
    public void C7(final String k) {
        this.K = k;
    }
    
    @e
    public final String C8() {
        return this.k4();
    }
    
    public final void C9(final long n) {
        this.P4(n);
    }
    
    @Override
    public long D3() {
        return this.l0;
    }
    
    @Override
    public void D6(final boolean d0) {
        this.d0 = d0;
    }
    
    public final long D8() {
        return this.U6();
    }
    
    public final void D9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.s4(s);
    }
    
    @Override
    public boolean E7() {
        return this.V;
    }
    
    public final long E8() {
        return this.V2();
    }
    
    public final void E9(final int n) {
        this.f5(n);
    }
    
    @Override
    public void F4(final l0 w0) {
        this.w0 = (l0<a>)w0;
    }
    
    @Override
    public Long F6() {
        return this.R;
    }
    
    public final long F8() {
        return this.D3();
    }
    
    public final void F9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.A5(s);
    }
    
    public final long G8() {
        return this.A0();
    }
    
    public final void G9(final long n) {
        this.j4(n);
    }
    
    @Override
    public boolean H2() {
        return this.k0;
    }
    
    @Override
    public void H4(final String x0) {
        this.x0 = x0;
    }
    
    @e
    public final String H8() {
        return this.m4();
    }
    
    public final void H9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.l3(s);
    }
    
    @Override
    public l0 I3() {
        return this.T;
    }
    
    @Override
    public int I6() {
        return this.O;
    }
    
    @Override
    public void I7(final String b0) {
        this.B0 = b0;
    }
    
    public final int I8() {
        return this.S4();
    }
    
    public final void I9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.K3(s);
    }
    
    @Override
    public Integer J3() {
        return this.Q;
    }
    
    @Override
    public boolean J4() {
        return this.D0;
    }
    
    @e
    public final String J8() {
        return this.O7();
    }
    
    public final void J9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.d7(s);
    }
    
    @Override
    public void K3(final String e0) {
        this.e0 = e0;
    }
    
    @Override
    public String K5() {
        return this.K;
    }
    
    public final long K8() {
        return this.C2();
    }
    
    public final void K9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.o7(s);
    }
    
    @Override
    public void L2(final String x) {
        this.X = x;
    }
    
    @Override
    public String L3() {
        return this.M;
    }
    
    @Override
    public void L4(final long n0) {
        this.n0 = n0;
    }
    
    @Override
    public String L5() {
        return this.y0;
    }
    
    @Override
    public void L6(final String c0) {
        this.c0 = c0;
    }
    
    @e
    public final String L8() {
        return this.z7();
    }
    
    public final void L9(final long n) {
        this.k3(n);
    }
    
    @e
    public final String M8() {
        return this.Y5();
    }
    
    public final void M9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.L6(s);
    }
    
    @Override
    public void N2(final long y) {
        this.Y = y;
    }
    
    @Override
    public void N3(final long u0) {
        this.u0 = u0;
    }
    
    @Override
    public String N4() {
        return this.z0;
    }
    
    @Override
    public String N5() {
        return this.i0;
    }
    
    @e
    public final String N8() {
        return this.N5();
    }
    
    public final void N9(final boolean b) {
        this.D6(b);
    }
    
    @Override
    public String O4() {
        return this.B0;
    }
    
    @Override
    public void O5(final long m0) {
        this.m0 = m0;
    }
    
    @Override
    public String O7() {
        return this.a0;
    }
    
    @e
    public final String O8() {
        return this.q4();
    }
    
    public final void O9(final long n) {
        this.N3(n);
    }
    
    @Override
    public void P4(final long e0) {
        this.E0 = e0;
    }
    
    @Override
    public long P6() {
        return this.C0;
    }
    
    public final long P8() {
        return this.p4();
    }
    
    public final void P9(final boolean b) {
        this.p3(b);
    }
    
    @Override
    public void Q3(final String m) {
        this.M = m;
    }
    
    @Override
    public long Q6() {
        return this.N;
    }
    
    @e
    public final String Q8() {
        return this.l2();
    }
    
    public final void Q9(@e final l0<a> l0) {
        kotlin.jvm.internal.k0.p(l0, "<set-?>");
        this.j1(l0);
    }
    
    @Override
    public void R1(final Integer q) {
        this.Q = q;
    }
    
    public final boolean R8() {
        return this.X3();
    }
    
    public final void R9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.B7(s);
    }
    
    @Override
    public long S2() {
        return this.q0;
    }
    
    @Override
    public long S3() {
        return this.m0;
    }
    
    @Override
    public int S4() {
        return this.g0;
    }
    
    public final long S8() {
        return this.m3();
    }
    
    public final void S9(final boolean b) {
        this.T5(b);
    }
    
    @Override
    public void T1(final l0 t) {
        this.T = (l0<z4.a>)t;
    }
    
    @Override
    public void T5(final boolean k0) {
        this.k0 = k0;
    }
    
    public final boolean T8() {
        return this.J4();
    }
    
    public final void T9(final boolean b) {
        this.Y1(b);
    }
    
    @Override
    public l0 U2() {
        return this.S;
    }
    
    @Override
    public long U3() {
        return this.P;
    }
    
    @Override
    public void U4(final l0 u) {
        this.U = (l0<b>)u;
    }
    
    @Override
    public long U6() {
        return this.n0;
    }
    
    @e
    public final l0<a> U8() {
        return (l0<a>)this.b1();
    }
    
    public final void U9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.Q3(s);
    }
    
    @Override
    public long V2() {
        return this.o0;
    }
    
    @Override
    public boolean V5() {
        return this.j0;
    }
    
    @e
    public final String V8() {
        return this.N4();
    }
    
    public final void V9(@e final l0<z4.a> l0) {
        kotlin.jvm.internal.k0.p(l0, "<set-?>");
        this.T1(l0);
    }
    
    @Override
    public void W2(final boolean w) {
        this.W = w;
    }
    
    @Override
    public void W4(final l0 s) {
        this.S = (l0<a>)s;
    }
    
    public final boolean W8() {
        return this.H2();
    }
    
    public final void W9(@e final l0<b> l0) {
        kotlin.jvm.internal.k0.p(l0, "<set-?>");
        this.U4(l0);
    }
    
    @Override
    public boolean X3() {
        return this.d0;
    }
    
    public final boolean X8() {
        return this.V5();
    }
    
    public final void X9(@f final Long n) {
        this.B2(n);
    }
    
    @Override
    public void Y1(final boolean j0) {
        this.j0 = j0;
    }
    
    @Override
    public String Y5() {
        return this.e0;
    }
    
    @e
    public final String Y8() {
        return this.L3();
    }
    
    public final void Y9(@f final Integer n) {
        this.R1(n);
    }
    
    @e
    public final l0<z4.a> Z8() {
        return (l0<z4.a>)this.I3();
    }
    
    public final void Z9(final long n) {
        this.m6(n);
    }
    
    @Override
    public long a() {
        return this.J;
    }
    
    @Override
    public void a6(final long o0) {
        this.o0 = o0;
    }
    
    @e
    public final l0<b> a9() {
        return (l0<b>)this.y6();
    }
    
    public final void aa(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.r5(s);
    }
    
    @Override
    public void b(final long j) {
        this.J = j;
    }
    
    @Override
    public l0 b1() {
        return this.t0;
    }
    
    @f
    public final Long b9() {
        return this.F6();
    }
    
    public final void ba(final boolean b) {
        this.o4(b);
    }
    
    @f
    public final Integer c9() {
        return this.J3();
    }
    
    public final void ca(final long n) {
        this.N2(n);
    }
    
    @Override
    public void d7(final String i0) {
        this.i0 = i0;
    }
    
    public final long d9() {
        return this.Q6();
    }
    
    public final void da(final boolean b) {
        this.W2(b);
    }
    
    @Override
    public void e3(final boolean v0) {
        this.v0 = v0;
    }
    
    @Override
    public void e4(final int o) {
        this.O = o;
    }
    
    @e
    public final String e9() {
        return this.t4();
    }
    
    public final void ea(@f final String s) {
        this.L2(s);
    }
    
    @Override
    public void f2(final long l0) {
        this.l0 = l0;
    }
    
    @Override
    public long f4() {
        return this.Y;
    }
    
    @Override
    public void f5(final int g0) {
        this.g0 = g0;
    }
    
    public final boolean f9() {
        return this.E7();
    }
    
    public final void fa(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.C7(s);
    }
    
    @Override
    public boolean g4() {
        return this.v0;
    }
    
    @Override
    public long g5() {
        return this.s0;
    }
    
    @Override
    public String g7() {
        return this.X;
    }
    
    public final long g9() {
        return this.f4();
    }
    
    public final void ga(final long n) {
        this.x2(n);
    }
    
    @Override
    public void h3(final String y0) {
        this.y0 = y0;
    }
    
    @Override
    public int h4() {
        return this.r0;
    }
    
    @Override
    public void h6(final long c0) {
        this.C0 = c0;
    }
    
    public final boolean h9() {
        return this.l5();
    }
    
    public final void ha(final int n) {
        this.e4(n);
    }
    
    @f
    public final String i9() {
        return this.g7();
    }
    
    public final void ia(@e final l0<a> l0) {
        kotlin.jvm.internal.k0.p(l0, "<set-?>");
        this.W4(l0);
    }
    
    @Override
    public void j1(final l0 t0) {
        this.t0 = (l0<a>)t0;
    }
    
    @Override
    public void j4(final long b0) {
        this.b0 = b0;
    }
    
    @Override
    public long j6() {
        return this.p0;
    }
    
    @e
    public final String j9() {
        return this.K5();
    }
    
    public final void ja(final long n) {
        this.w4(n);
    }
    
    @Override
    public void k3(final long f0) {
        this.f0 = f0;
    }
    
    @Override
    public String k4() {
        return this.x0;
    }
    
    public final long k9() {
        return this.U3();
    }
    
    @Override
    public String l2() {
        return this.c0;
    }
    
    @Override
    public void l3(final String z) {
        this.Z = z;
    }
    
    @Override
    public boolean l5() {
        return this.W;
    }
    
    public final int l9() {
        return this.I6();
    }
    
    @Override
    public long m3() {
        return this.u0;
    }
    
    @Override
    public String m4() {
        return this.A0;
    }
    
    @Override
    public void m6(final long n) {
        this.N = n;
    }
    
    @e
    public final l0<a> m9() {
        return (l0<a>)this.U2();
    }
    
    public final long n9() {
        return this.S2();
    }
    
    @Override
    public void o4(final boolean v) {
        this.V = v;
    }
    
    @Override
    public void o7(final String h0) {
        this.h0 = h0;
    }
    
    public final void o9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.I7(s);
    }
    
    @Override
    public void p3(final boolean d0) {
        this.D0 = d0;
    }
    
    @Override
    public long p4() {
        return this.f0;
    }
    
    public final void p9(final long n) {
        this.b(n);
    }
    
    @Override
    public String q4() {
        return this.h0;
    }
    
    @Override
    public l0 q7() {
        return this.w0;
    }
    
    public final void q9(final long n) {
        this.h6(n);
    }
    
    @Override
    public void r5(final String l) {
        this.L = l;
    }
    
    public final void r9(final long n) {
        this.z2(n);
    }
    
    @Override
    public void s4(final String a0) {
        this.A0 = a0;
    }
    
    @e
    public final String s8() {
        return this.O4();
    }
    
    public final void s9(final int n) {
        this.A6(n);
    }
    
    @Override
    public String t4() {
        return this.L;
    }
    
    public final long t8() {
        return this.a();
    }
    
    public final void t9(final boolean b) {
        this.e3(b);
    }
    
    @Override
    public void u6(final long p) {
        this.p0 = p;
    }
    
    public final long u8() {
        return this.P6();
    }
    
    public final void u9(@e final l0<a> l0) {
        kotlin.jvm.internal.k0.p(l0, "<set-?>");
        this.F4(l0);
    }
    
    public final long v8() {
        return this.g5();
    }
    
    public final void v9(final long n) {
        this.O5(n);
    }
    
    @Override
    public void w4(final long q0) {
        this.q0 = q0;
    }
    
    public final int w8() {
        return this.h4();
    }
    
    public final void w9(final long n) {
        this.u6(n);
    }
    
    @Override
    public void x2(final long p) {
        this.P = p;
    }
    
    public final boolean x8() {
        return this.g4();
    }
    
    public final void x9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.h3(s);
    }
    
    @Override
    public l0 y6() {
        return this.U;
    }
    
    @e
    public final l0<a> y8() {
        return (l0<a>)this.q7();
    }
    
    public final void y9(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "<set-?>");
        this.H4(s);
    }
    
    @Override
    public void z2(final long s0) {
        this.s0 = s0;
    }
    
    @Override
    public String z7() {
        return this.Z;
    }
    
    public final long z8() {
        return this.S3();
    }
    
    public final void z9(final long n) {
        this.L4(n);
    }
}
