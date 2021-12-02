// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import java.util.List;
import java.util.Set;
import java.util.Iterator;
import io.realm.l0;
import com.untis.mobile.persistence.models.profile.ProfileState;
import com.untis.mobile.persistence.realm.b;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.persistence.realm.a;
import com.untis.mobile.persistence.models.profile.Right;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import z4.c;
import kotlin.text.s;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/b0;", "", "", "iso", "Lorg/joda/time/t;", "a", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lz4/c;", "c", "realmProfile", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b0
{
    @e
    public static final b0 a;
    
    static {
        a = new b0();
    }
    
    private b0() {
    }
    
    private final t a(final String s) {
        final t t = null;
        if (s == null) {
            return null;
        }
        try {
            return org.joda.time.t.c0(s.k2(s, "Z", "", false, 4, (Object)null));
        }
        catch (Exception ex) {
            return t;
        }
    }
    
    @e
    public final Profile b(@e final c c) {
        k0.p(c, "realmProfile");
        final long t8 = c.t8();
        final String j9 = c.j9();
        final String e9 = c.e9();
        final String y8 = c.Y8();
        final long d9 = c.d9();
        final EntityType.Companion companion = EntityType.Companion;
        final EntityType by = companion.findBy(c.l9());
        final long k9 = c.k9();
        EntityType by2;
        if (c.c9() != null) {
            final Integer c2 = c.c9();
            int intValue;
            if (c2 == null) {
                intValue = 0;
            }
            else {
                intValue = c2;
            }
            by2 = companion.findBy(intValue);
        }
        else {
            by2 = null;
        }
        final Long b9 = c.b9();
        final l0<a> m9 = c.m9();
        final ArrayList list = new ArrayList<Right>(v.Y((Iterable<?>)m9, 10));
        final Iterator<Object> iterator = m9.iterator();
        while (iterator.hasNext()) {
            list.add(Right.Companion.fromValue(iterator.next().s8()));
        }
        final Set<Right> m10 = v.M5((Iterable<? extends Right>)list);
        final l0<z4.a> z8 = c.Z8();
        final ArrayList list2 = new ArrayList<Child>(v.Y((Iterable<?>)z8, 10));
        for (final z4.a a : z8) {
            list2.add(new Child(a.u8(), a.s8(), a.v8(), a.t8()));
        }
        final Set<Child> n5 = v.N5((Iterable<? extends Child>)list2);
        final l0<b> a2 = c.a9();
        final ArrayList list3 = new ArrayList<Long>(v.Y((Iterable<?>)a2, 10));
        final Iterator<Object> iterator3 = a2.iterator();
        while (iterator3.hasNext()) {
            list3.add(Long.valueOf(iterator3.next().s8()));
        }
        final Set<Long> n6 = v.N5((Iterable<? extends Long>)list3);
        final boolean f9 = c.f9();
        final boolean h9 = c.h9();
        final t a3 = this.a(c.i9());
        final long g9 = c.g9();
        final String l8 = c.L8();
        final String j10 = c.J8();
        final long k10 = c.K8();
        final String q8 = c.Q8();
        final boolean r8 = c.R8();
        final String m11 = c.M8();
        final long p = c.P8();
        final int i8 = c.I8();
        final String o8 = c.O8();
        final String n7 = c.N8();
        final boolean x8 = c.X8();
        final boolean w8 = c.W8();
        final long f10 = c.F8();
        final long z9 = c.z8();
        final long d10 = c.D8();
        final long e10 = c.E8();
        final long a4 = c.A8();
        final long n8 = c.n9();
        final EntityType by3 = EntityType.Companion.findBy(c.w8());
        final long v8 = c.v8();
        final l0<a> u8 = c.U8();
        final ArrayList list4 = new ArrayList<ProfileState>(v.Y((Iterable<?>)u8, 10));
        final Iterator<Object> iterator4 = u8.iterator();
        while (iterator4.hasNext()) {
            list4.add(ProfileState.Companion.fromValue(iterator4.next().s8()));
        }
        final Set<ProfileState> m12 = v.M5((Iterable<? extends ProfileState>)list4);
        final long s8 = c.S8();
        final boolean x9 = c.x8();
        final l0<a> y9 = c.y8();
        final ArrayList list5 = new ArrayList<Integer>(v.Y((Iterable<?>)y9, 10));
        final Iterator<Object> iterator5 = y9.iterator();
        while (iterator5.hasNext()) {
            list5.add(Integer.valueOf(iterator5.next().s8()));
        }
        return new Profile(t8, j9, e9, y8, d9, by, k9, by2, b9, m10, n5, n6, f9, h9, g9, a3, l8, j10, k10, q8, r8, m11, p, i8, o8, n7, x8, w8, f10, z9, d10, e10, a4, n8, by3, v8, m12, s8, x9, v.M5((Iterable<? extends Integer>)list5), c.C8(), c.B8(), c.V8(), c.H8(), c.s8(), c.u8(), c.T8(), c.G8());
    }
    
    @e
    public final c c(@e final Profile profile) {
        k0.p(profile, "profile");
        final long id = profile.getId();
        final String userLogin = profile.getUserLogin();
        final String userDisplayName = profile.getUserDisplayName();
        final String userAppSharedSecret = profile.getUserAppSharedSecret();
        final long userDepartmentId = profile.getUserDepartmentId();
        final int webuntisId = profile.getUserOriginalEntityType().getWebuntisId();
        final long userOriginalEntityId = profile.getUserOriginalEntityId();
        final EntityType userCustomEntityType = profile.getUserCustomEntityType();
        Integer value;
        if (userCustomEntityType == null) {
            value = null;
        }
        else {
            value = userCustomEntityType.getWebuntisId();
        }
        final Long userCustomEntityId = profile.getUserCustomEntityId();
        final Set<Right> userRights = profile.getUserRights();
        final ArrayList list = new ArrayList<a>(v.Y((Iterable<?>)userRights, 10));
        final Iterator<Object> iterator = userRights.iterator();
        while (iterator.hasNext()) {
            list.add(new a(iterator.next().getValue()));
        }
        final l0<a> h = com.untis.mobile.utils.mapper.common.b.h((List<a>)list);
        final Set<Child> userChildren = profile.getUserChildren();
        final ArrayList list2 = new ArrayList<z4.a>(v.Y((Iterable<?>)userChildren, 10));
        for (final Child child : userChildren) {
            list2.add(new z4.a(child.getId(), child.getFirstName(), child.getLastName(), child.getHasTimeTableAccess()));
        }
        final l0<z4.a> h2 = com.untis.mobile.utils.mapper.common.b.h((List<z4.a>)list2);
        final Set<Long> userClasses = profile.getUserClasses();
        final ArrayList list3 = new ArrayList<b>(v.Y((Iterable<?>)userClasses, 10));
        final Iterator<Number> iterator3 = userClasses.iterator();
        while (iterator3.hasNext()) {
            list3.add(new b(iterator3.next().longValue()));
        }
        final l0<b> h3 = com.untis.mobile.utils.mapper.common.b.h((List<b>)list3);
        final boolean userHasTimeTableAccess = profile.getUserHasTimeTableAccess();
        final boolean userPremium = profile.getUserPremium();
        final t userPremiumEnd = profile.getUserPremiumEnd();
        String string;
        if (userPremiumEnd == null) {
            string = null;
        }
        else {
            string = userPremiumEnd.toString();
        }
        final long userId = profile.getUserId();
        final String schoolLogin = profile.getSchoolLogin();
        final String schoolDisplayName = profile.getSchoolDisplayName();
        final long schoolId = profile.getSchoolId();
        final String schoolServerUrl = profile.getSchoolServerUrl();
        final boolean schoolUseMobileService = profile.getSchoolUseMobileService();
        final String schoolMobileServiceUrl = profile.getSchoolMobileServiceUrl();
        final long schoolServerDelta = profile.getSchoolServerDelta();
        final int schoolApiVersion = profile.getSchoolApiVersion();
        final String schoolSemanticApiVersion = profile.getSchoolSemanticApiVersion();
        final String schoolSemanticWuVersion = profile.getSchoolSemanticWuVersion();
        final boolean usable = profile.getUsable();
        final boolean updated = profile.getUpdated();
        final long periodDataTimestamp = profile.getPeriodDataTimestamp();
        final long masterDataTimestamp = profile.getMasterDataTimestamp();
        final long officeHourTimestamp = profile.getOfficeHourTimestamp();
        final long parentDayTimestamp = profile.getParentDayTimestamp();
        final long messagesOfDayTimestamp = profile.getMessagesOfDayTimestamp();
        final long widgetTimestamp = profile.getWidgetTimestamp();
        final int webuntisId2 = profile.getLastViewedEntityType().getWebuntisId();
        final long lastViewedEntityId = profile.getLastViewedEntityId();
        final Set<ProfileState> states = profile.getStates();
        final ArrayList list4 = new ArrayList<a>(v.Y((Iterable<?>)states, 10));
        final Iterator<Object> iterator4 = states.iterator();
        while (iterator4.hasNext()) {
            list4.add(new a(iterator4.next().getValue()));
        }
        final l0<a> h4 = com.untis.mobile.utils.mapper.common.b.h((List<a>)list4);
        final long serverDownTimestamp = profile.getServerDownTimestamp();
        final boolean lockScreen = profile.getLockScreen();
        final Set<Integer> lockScreenIds = profile.getLockScreenIds();
        final ArrayList list5 = new ArrayList<a>(v.Y((Iterable<?>)lockScreenIds, 10));
        final Iterator<Number> iterator5 = lockScreenIds.iterator();
        while (iterator5.hasNext()) {
            list5.add(new a(iterator5.next().intValue()));
        }
        final l0<a> h5 = com.untis.mobile.utils.mapper.common.b.h((List<a>)list5);
        final long infoCenterTimestamp = profile.getInfoCenterTimestamp();
        final String messengerServerUrl = profile.getMessengerServerUrl();
        final String messengerOrganizationId = profile.getMessengerOrganizationId();
        final String registrationUrl = profile.getRegistrationUrl();
        final String authenticationToken = profile.getAuthenticationToken();
        final String substitutionPlanningUrl = profile.getSubstitutionPlanningUrl();
        final boolean showCalendarDetails = profile.getShowCalendarDetails();
        final long registered = profile.getRegistered();
        k0.o(h, "toRealmList(profile.userRights.map { right -> RealmInteger(right.value) })");
        k0.o(h2, "toRealmList(profile.userChildren.map { child -> RealmChild(child.id, child.firstName, child.lastName, child.hasTimeTableAccess) })");
        k0.o(h3, "toRealmList(profile.userClasses.map { id -> RealmLong((id)) })");
        k0.o(h4, "toRealmList(profile.states.map { state -> RealmInteger(state.value) })");
        k0.o(h5, "toRealmList(profile.lockScreenIds.map { RealmInteger(it) })");
        return new c(id, userLogin, userDisplayName, userAppSharedSecret, userDepartmentId, webuntisId, userOriginalEntityId, value, userCustomEntityId, h, h2, h3, userHasTimeTableAccess, userPremium, string, userId, schoolLogin, schoolDisplayName, schoolId, schoolServerUrl, schoolUseMobileService, schoolMobileServiceUrl, schoolServerDelta, schoolApiVersion, schoolSemanticWuVersion, schoolSemanticApiVersion, usable, updated, periodDataTimestamp, masterDataTimestamp, officeHourTimestamp, parentDayTimestamp, messagesOfDayTimestamp, widgetTimestamp, webuntisId2, lastViewedEntityId, h4, serverDownTimestamp, lockScreen, h5, messengerServerUrl, messengerOrganizationId, substitutionPlanningUrl, registrationUrl, authenticationToken, infoCenterTimestamp, showCalendarDetails, registered);
    }
}
