// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import androidx.annotation.j0;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.c;
import com.untis.mobile.a;

public class u
{
    public static final String a = "https://substitution.webuntis.com";
    public static final String b = "https://push.webuntis.com";
    public static final String c = "wss://events.webuntis.com";
    public static final int d;
    public static final String e = "untis_log";
    public static final String f = "herodemomobile";
    public static final float g = 1.0f;
    public static final float h = 0.5f;
    public static final float i = 4.0f;
    public static final String j = "https://play.google.com/store/apps/details?id=com.grupet.web.app";
    
    static {
        d = com.untis.mobile.a.g;
    }
    
    @Deprecated
    public static class b
    {
        public static final String a = "student";
        public static final String b = "absences";
    }
    
    public static class c
    {
        public static final int A = 1500;
        public static final int B = 1600;
        public static final int C = 1700;
        public static final int D = 1800;
        public static final int a = 110;
        public static final int b = 120;
        public static final int c = 121;
        public static final int d = 122;
        public static final int e = 130;
        public static final int f = 131;
        public static final int g = 150;
        public static final int h = 160;
        public static final int i = 161;
        public static final int j = 162;
        public static final int k = 164;
        public static final int l = 223;
        public static final int m = 224;
        public static final int n = 300;
        public static final int o = 400;
        public static final int p = 600;
        public static final int q = 700;
        public static final int r = 800;
        public static final int s = 900;
        public static final int t = 1000;
        public static final int u = 1200;
        public static final int v = 1300;
        public static final int w = 1301;
        public static final int x = 1400;
        public static final int y = 1401;
        public static final int z = 1402;
    }
    
    public static class d
    {
        public static final String A = "getUserMessages2017";
        public static final String B = "getVersion";
        public static final String C = "submitAbsences";
        public static final String D = "submitClassRegEvents";
        public static final String E = "submitExcuse2017";
        public static final String F = "submitHomeWork";
        public static final String G = "submitLessonTopic";
        public static final String H = "submitRoomChange2017";
        public static final String I = "submitOfficeHourRegistration2017";
        public static final String J = "deleteOfficeHourRegistration2017";
        public static final String K = "submitOwnAbsence2017";
        public static final String L = "submitPeriodInfo2017";
        public static final String M = "submitAbsencesChecked2017";
        public static final String N = "createImmediateAbsence2017";
        public static final String O = "createImmediateLateness2017";
        public static final String P = "createAbsences2017";
        public static final String Q = "deleteAbsence2017";
        public static final String R = "editAbsence2017";
        public static final String S = "createLessonChannel";
        public static final String T = "changeLessonChannel";
        public static final String U = "getLessonChannelMeta";
        public static final String V = "isPremiumAvailable";
        public static final String W = "getAuthToken";
        public static final String a = "https://mobile.webuntis.com/ms/schoolquery2/";
        public static final String b = "searchSchool";
        public static final String c = "getAppSharedSecret";
        public static final String d = "getAppInfo";
        public static final String e = "requestPasswordReset";
        public static final String f = "getAvailableRooms2017";
        public static final String g = "getClassregData2017";
        public static final String h = "getClassRegEvents";
        public static final String i = "getColors2017";
        public static final String j = "getMessengerCredentials";
        public static final String k = "getLessonChannelData";
        public static final String l = "createLessonChannel";
        public static final String m = "linkLessonChannel";
        public static final String n = "getExams2017";
        public static final String o = "getHomeWork2017";
        public static final String p = "getLessonTopic2017";
        public static final String q = "getMessagesOfDay2017";
        public static final String r = "getMessagesOfDay";
        public static final String s = "getRoomChangeData2017";
        public static final String t = "getOfficeHours2017";
        public static final String u = "getOfficeHourRegistrations2017";
        public static final String v = "getPeriodData2017";
        public static final String w = "getPDayAppointments";
        public static final String x = "getStudentAbsences2017";
        public static final String y = "getTimetable2017";
        public static final String z = "getUserData2017";
    }
    
    public static class e
    {
        public static final String a = "https://substitution-beta.webuntis.com";
        public static final String b = "https://push-beta.webuntis.com";
        public static final String c = "wss://events-beta.webuntis.com";
    }
    
    public static class f
    {
        public static final String a = "untismobile";
        public static final String b = "untismobile_important";
        public static final String c = "untismobile_messages";
    }
    
    public static class g
    {
        public static final int a = 0;
        public static final int b = 255;
    }
    
    public static class h
    {
        public static final int a;
        public static final String b = "units.db";
        
        static {
            a = com.untis.mobile.a.f;
        }
    }
    
    public static class i
    {
        public static final String a = "https://substitution.nightly.webuntis.com";
        public static final String b = "https://push.nightly.webuntis.com";
        public static final String c = "wss://events.nightly.webuntis.com";
    }
    
    public static class j
    {
        public static final String a = "school";
        public static final String b = "user";
        public static final String c = "key";
        public static final String d = "url";
        public static final String e = "schoolNumber";
    }
    
    public static class k
    {
        public static final String a = "https://substitution.staging.webuntis.com";
        public static final String b = "https://push.staging.webuntis.com";
        public static final String c = "wss://events.staging.webuntis.com";
    }
    
    public static class l
    {
        public static final String a = "H:mm";
        public static final String b = "dd.MM.yyyy";
        public static final String c = "E, dd.MM.yyyy";
        public static final String d = "H:mm, dd.MM.yyyy";
        public static final String e = "E, H:mm, dd.MM.yyyy";
        public static final String f = "yyyy-MM-dd";
        public static final String g = "'T'HH:mm";
        public static final String h = "yyyy-MM-dd'T'HH:mm'Z'";
        public static final int i = 300000;
        public static final org.joda.time.c j;
        public static final org.joda.time.c k;
        
        static {
            j = new org.joda.time.c(0, 1, 1, 0, 0);
            k = new org.joda.time.c(2999, 12, 31, 23, 59);
        }
    }
    
    public static class m
    {
        public static final int a = 15;
        public static final int b = 500;
        public static final int c = 250;
        
        public static class a
        {
            public static final EntityType[] a;
            public static final EntityType[] b;
            public static final EntityType[] c;
            public static final EntityType[] d;
            
            static {
                final EntityType subject = EntityType.SUBJECT;
                final EntityType teacher = EntityType.TEACHER;
                final EntityType room = EntityType.ROOM;
                final EntityType class1 = EntityType.CLASS;
                a = new EntityType[] { subject, teacher, room, class1 };
                b = new EntityType[] { class1, subject, room, teacher };
                c = new EntityType[] { class1, teacher, room, subject };
                d = new EntityType[] { teacher, class1, subject, room };
            }
            
            public static EntityType[] a(@j0 final EntityType entityType) {
                final int n = u$a.a[entityType.ordinal()];
                if (n == 1) {
                    return m.a.b;
                }
                if (n == 2) {
                    return m.a.c;
                }
                if (n != 3) {
                    return m.a.a;
                }
                return m.a.d;
            }
        }
        
        public static class b
        {
            public static float a = 0.75f;
            public static float b = 1.0f;
            public static float c = 1.25f;
            public static float d = 1.5f;
        }
    }
    
    public static class n
    {
        public static final String a = "IDC_ANONYMOUSUSER";
        public static final String b = "#anonymous#";
    }
}
