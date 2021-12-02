// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model.serialization;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import com.google.firebase.crashlytics.internal.model.b0;
import android.util.Base64;
import java.io.IOException;
import com.google.firebase.crashlytics.internal.model.a0;
import androidx.annotation.j0;
import android.util.JsonReader;
import com.google.firebase.encoders.json.e;
import com.google.firebase.encoders.a;

public class g
{
    private static final com.google.firebase.encoders.a a;
    
    static {
        a = new e().k(com.google.firebase.crashlytics.internal.model.a.b).l(true).j();
    }
    
    @j0
    private static a0.e A(@j0 final JsonReader jsonReader) throws IOException {
        final a0.e.a a = a0.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("files")) {
                if (!nextName.equals("orgId")) {
                    jsonReader.skipValue();
                }
                else {
                    a.c(jsonReader.nextString());
                }
            }
            else {
                a.b(m(jsonReader, (a<a0.e.b>)d.a));
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.e B(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.e.a a = a0.f.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "platform": {
                    n = 3;
                    break;
                }
                case "version": {
                    n = 2;
                    break;
                }
                case "jailbroken": {
                    n = 1;
                    break;
                }
                case "buildVersion": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 3: {
                    a.d(jsonReader.nextInt());
                    continue;
                }
                case 2: {
                    a.e(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    a.c(jsonReader.nextBoolean());
                    continue;
                }
                case 0: {
                    a.b(jsonReader.nextString());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0 C(@j0 final JsonReader jsonReader) throws IOException {
        final a0.c b = a0.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "session": {
                    n = 7;
                    break;
                }
                case "displayVersion": {
                    n = 6;
                    break;
                }
                case "platform": {
                    n = 5;
                    break;
                }
                case "installationUuid": {
                    n = 4;
                    break;
                }
                case "gmpAppId": {
                    n = 3;
                    break;
                }
                case "buildVersion": {
                    n = 2;
                    break;
                }
                case "sdkVersion": {
                    n = 1;
                    break;
                }
                case "ndkPayload": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 7: {
                    b.i(D(jsonReader));
                    continue;
                }
                case 6: {
                    b.c(jsonReader.nextString());
                    continue;
                }
                case 5: {
                    b.g(jsonReader.nextInt());
                    continue;
                }
                case 4: {
                    b.e(jsonReader.nextString());
                    continue;
                }
                case 3: {
                    b.d(jsonReader.nextString());
                    continue;
                }
                case 2: {
                    b.b(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    b.h(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    b.f(A(jsonReader));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return b.a();
    }
    
    @j0
    private static a0.f D(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.b a = a0.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "generatorType": {
                    n = 10;
                    break;
                }
                case "crashed": {
                    n = 9;
                    break;
                }
                case "generator": {
                    n = 8;
                    break;
                }
                case "user": {
                    n = 7;
                    break;
                }
                case "app": {
                    n = 6;
                    break;
                }
                case "os": {
                    n = 5;
                    break;
                }
                case "events": {
                    n = 4;
                    break;
                }
                case "device": {
                    n = 3;
                    break;
                }
                case "endedAt": {
                    n = 2;
                    break;
                }
                case "identifier": {
                    n = 1;
                    break;
                }
                case "startedAt": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 10: {
                    a.h(jsonReader.nextInt());
                    continue;
                }
                case 9: {
                    a.c(jsonReader.nextBoolean());
                    continue;
                }
                case 8: {
                    a.g(jsonReader.nextString());
                    continue;
                }
                case 7: {
                    a.m(E(jsonReader));
                    continue;
                }
                case 6: {
                    a.b(k(jsonReader));
                    continue;
                }
                case 5: {
                    a.k(B(jsonReader));
                    continue;
                }
                case 4: {
                    a.f(m(jsonReader, (a<a0.f.d>)com.google.firebase.crashlytics.internal.model.serialization.a.a));
                    continue;
                }
                case 3: {
                    a.d(o(jsonReader));
                    continue;
                }
                case 2: {
                    a.e(jsonReader.nextLong());
                    continue;
                }
                case 1: {
                    a.j(Base64.decode(jsonReader.nextString(), 2));
                    continue;
                }
                case 0: {
                    a.l(jsonReader.nextLong());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.f E(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.f.a a = a0.f.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            }
            else {
                a.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.a k(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.a.a a = a0.f.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "displayVersion": {
                    n = 5;
                    break;
                }
                case "installationUuid": {
                    n = 4;
                    break;
                }
                case "version": {
                    n = 3;
                    break;
                }
                case "developmentPlatformVersion": {
                    n = 2;
                    break;
                }
                case "developmentPlatform": {
                    n = 1;
                    break;
                }
                case "identifier": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 5: {
                    a.d(jsonReader.nextString());
                    continue;
                }
                case 4: {
                    a.f(jsonReader.nextString());
                    continue;
                }
                case 3: {
                    a.h(jsonReader.nextString());
                    continue;
                }
                case 2: {
                    a.c(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    a.b(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.e(jsonReader.nextString());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.a l(@j0 final JsonReader jsonReader) throws IOException {
        final a0.a.a a = a0.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "importance": {
                    n = 7;
                    break;
                }
                case "traceFile": {
                    n = 6;
                    break;
                }
                case "reasonCode": {
                    n = 5;
                    break;
                }
                case "processName": {
                    n = 4;
                    break;
                }
                case "timestamp": {
                    n = 3;
                    break;
                }
                case "rss": {
                    n = 2;
                    break;
                }
                case "pss": {
                    n = 1;
                    break;
                }
                case "pid": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 7: {
                    a.b(jsonReader.nextInt());
                    continue;
                }
                case 6: {
                    a.i(jsonReader.nextString());
                    continue;
                }
                case 5: {
                    a.f(jsonReader.nextInt());
                    continue;
                }
                case 4: {
                    a.d(jsonReader.nextString());
                    continue;
                }
                case 3: {
                    a.h(jsonReader.nextLong());
                    continue;
                }
                case 2: {
                    a.g(jsonReader.nextLong());
                    continue;
                }
                case 1: {
                    a.e(jsonReader.nextLong());
                    continue;
                }
                case 0: {
                    a.c(jsonReader.nextInt());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static <T> b0<T> m(@j0 final JsonReader jsonReader, @j0 final a<T> a) throws IOException {
        final ArrayList<T> list = new ArrayList<T>();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            list.add(a.a(jsonReader));
        }
        jsonReader.endArray();
        return b0.b(list);
    }
    
    @j0
    private static a0.d n(@j0 final JsonReader jsonReader) throws IOException {
        final a0.d.a a = a0.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                }
                else {
                    a.c(jsonReader.nextString());
                }
            }
            else {
                a.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.c o(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.c.a a = a0.f.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "modelClass": {
                    n = 8;
                    break;
                }
                case "state": {
                    n = 7;
                    break;
                }
                case "model": {
                    n = 6;
                    break;
                }
                case "cores": {
                    n = 5;
                    break;
                }
                case "diskSpace": {
                    n = 4;
                    break;
                }
                case "arch": {
                    n = 3;
                    break;
                }
                case "ram": {
                    n = 2;
                    break;
                }
                case "manufacturer": {
                    n = 1;
                    break;
                }
                case "simulator": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 8: {
                    a.g(jsonReader.nextString());
                    continue;
                }
                case 7: {
                    a.j(jsonReader.nextInt());
                    continue;
                }
                case 6: {
                    a.f(jsonReader.nextString());
                    continue;
                }
                case 5: {
                    a.c(jsonReader.nextInt());
                    continue;
                }
                case 4: {
                    a.d(jsonReader.nextLong());
                    continue;
                }
                case 3: {
                    a.b(jsonReader.nextInt());
                    continue;
                }
                case 2: {
                    a.h(jsonReader.nextLong());
                    continue;
                }
                case 1: {
                    a.e(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.i(jsonReader.nextBoolean());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.d p(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.d.b a = a0.f.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "timestamp": {
                    n = 4;
                    break;
                }
                case "type": {
                    n = 3;
                    break;
                }
                case "log": {
                    n = 2;
                    break;
                }
                case "app": {
                    n = 1;
                    break;
                }
                case "device": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    a.e(jsonReader.nextLong());
                    continue;
                }
                case 3: {
                    a.f(jsonReader.nextString());
                    continue;
                }
                case 2: {
                    a.d(w(jsonReader));
                    continue;
                }
                case 1: {
                    a.b(q(jsonReader));
                    continue;
                }
                case 0: {
                    a.c(s(jsonReader));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.d.a q(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.d.a.a a = a0.f.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "uiOrientation": {
                    n = 4;
                    break;
                }
                case "customAttributes": {
                    n = 3;
                    break;
                }
                case "internalKeys": {
                    n = 2;
                    break;
                }
                case "execution": {
                    n = 1;
                    break;
                }
                case "background": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    a.f(jsonReader.nextInt());
                    continue;
                }
                case 3: {
                    a.c(m(jsonReader, (a<a0.d>)f.a));
                    continue;
                }
                case 2: {
                    a.e(m(jsonReader, (a<a0.d>)f.a));
                    continue;
                }
                case 1: {
                    a.d(t(jsonReader));
                    continue;
                }
                case 0: {
                    a.b(jsonReader.nextBoolean());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.d.a.b.a r(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.d.a.b.a.a a = a0.f.d.a.b.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "baseAddress": {
                    n = 3;
                    break;
                }
                case "uuid": {
                    n = 2;
                    break;
                }
                case "size": {
                    n = 1;
                    break;
                }
                case "name": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 3: {
                    a.b(jsonReader.nextLong());
                    continue;
                }
                case 2: {
                    a.f(Base64.decode(jsonReader.nextString(), 2));
                    continue;
                }
                case 1: {
                    a.d(jsonReader.nextLong());
                    continue;
                }
                case 0: {
                    a.c(jsonReader.nextString());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.d.c s(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.d.c.a a = a0.f.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "proximityOn": {
                    n = 5;
                    break;
                }
                case "ramUsed": {
                    n = 4;
                    break;
                }
                case "diskUsed": {
                    n = 3;
                    break;
                }
                case "orientation": {
                    n = 2;
                    break;
                }
                case "batteryVelocity": {
                    n = 1;
                    break;
                }
                case "batteryLevel": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 5: {
                    a.f(jsonReader.nextBoolean());
                    continue;
                }
                case 4: {
                    a.g(jsonReader.nextLong());
                    continue;
                }
                case 3: {
                    a.d(jsonReader.nextLong());
                    continue;
                }
                case 2: {
                    a.e(jsonReader.nextInt());
                    continue;
                }
                case 1: {
                    a.c(jsonReader.nextInt());
                    continue;
                }
                case 0: {
                    a.b(jsonReader.nextDouble());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.d.a.b t(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.d.a.b.b a = a0.f.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "exception": {
                    n = 4;
                    break;
                }
                case "binaries": {
                    n = 3;
                    break;
                }
                case "signal": {
                    n = 2;
                    break;
                }
                case "threads": {
                    n = 1;
                    break;
                }
                case "appExitInfo": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    a.d(u(jsonReader));
                    continue;
                }
                case 3: {
                    a.c(m(jsonReader, (a<a0.f.d.a.b.a>)com.google.firebase.crashlytics.internal.model.serialization.e.a));
                    continue;
                }
                case 2: {
                    a.e(x(jsonReader));
                    continue;
                }
                case 1: {
                    a.f(m(jsonReader, (a<a0.f.d.a.b.e>)c.a));
                    continue;
                }
                case 0: {
                    a.b(l(jsonReader));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.d.a.b.c u(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.d.a.b.c.a a = a0.f.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "overflowCount": {
                    n = 4;
                    break;
                }
                case "causedBy": {
                    n = 3;
                    break;
                }
                case "type": {
                    n = 2;
                    break;
                }
                case "reason": {
                    n = 1;
                    break;
                }
                case "frames": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    a.d(jsonReader.nextInt());
                    continue;
                }
                case 3: {
                    a.b(u(jsonReader));
                    continue;
                }
                case 2: {
                    a.f(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    a.e(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.c(m(jsonReader, (a<a0.f.d.a.b.e.b>)b.a));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.d.a.b.e.b v(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.d.a.b.e.b.a a = a0.f.d.a.b.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "importance": {
                    n = 4;
                    break;
                }
                case "file": {
                    n = 3;
                    break;
                }
                case "pc": {
                    n = 2;
                    break;
                }
                case "symbol": {
                    n = 1;
                    break;
                }
                case "offset": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    a.c(jsonReader.nextInt());
                    continue;
                }
                case 3: {
                    a.b(jsonReader.nextString());
                    continue;
                }
                case 2: {
                    a.e(jsonReader.nextLong());
                    continue;
                }
                case 1: {
                    a.f(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.d(jsonReader.nextLong());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.d.d w(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.d.d.a a = a0.f.d.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            }
            else {
                a.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.d.a.b.d x(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.d.a.b.d.a a = a0.f.d.a.b.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "name": {
                    n = 2;
                    break;
                }
                case "code": {
                    n = 1;
                    break;
                }
                case "address": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 2: {
                    a.d(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    a.c(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.b(jsonReader.nextLong());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.f.d.a.b.e y(@j0 final JsonReader jsonReader) throws IOException {
        final a0.f.d.a.b.e.a a = a0.f.d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            int n = -1;
            switch (nextName) {
                case "importance": {
                    n = 2;
                    break;
                }
                case "name": {
                    n = 1;
                    break;
                }
                case "frames": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 2: {
                    a.c(jsonReader.nextInt());
                    continue;
                }
                case 1: {
                    a.d(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.b(m(jsonReader, (a<a0.f.d.a.b.e.b>)b.a));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    private static a0.e.b z(@j0 final JsonReader jsonReader) throws IOException {
        final a0.e.b.a a = a0.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("filename")) {
                if (!nextName.equals("contents")) {
                    jsonReader.skipValue();
                }
                else {
                    a.b(Base64.decode(jsonReader.nextString(), 2));
                }
            }
            else {
                a.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    @j0
    public a0 F(@j0 final String s) throws IOException {
        try {
            final JsonReader jsonReader = new JsonReader((Reader)new StringReader(s));
            try {
                final a0 c = C(jsonReader);
                jsonReader.close();
                return c;
            }
            finally {
                try {
                    jsonReader.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)s).addSuppressed(exception);
                }
            }
        }
        catch (IllegalStateException cause) {
            throw new IOException(cause);
        }
    }
    
    @j0
    public String G(@j0 final a0 a0) {
        return g.a.a(a0);
    }
    
    @j0
    public a0.a g(@j0 final String s) throws IOException {
        try {
            final JsonReader jsonReader = new JsonReader((Reader)new StringReader(s));
            try {
                final a0.a l = l(jsonReader);
                jsonReader.close();
                return l;
            }
            finally {
                try {
                    jsonReader.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)s).addSuppressed(exception);
                }
            }
        }
        catch (IllegalStateException cause) {
            throw new IOException(cause);
        }
    }
    
    @j0
    public String h(@j0 final a0.a a) {
        return g.a.a(a);
    }
    
    @j0
    public a0.f.d i(@j0 final String s) throws IOException {
        try {
            final JsonReader jsonReader = new JsonReader((Reader)new StringReader(s));
            try {
                final a0.f.d p = p(jsonReader);
                jsonReader.close();
                return p;
            }
            finally {
                try {
                    jsonReader.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)s).addSuppressed(exception);
                }
            }
        }
        catch (IllegalStateException cause) {
            throw new IOException(cause);
        }
    }
    
    @j0
    public String j(@j0 final a0.f.d d) {
        return g.a.a(d);
    }
    
    private interface a<T>
    {
        T a(@j0 final JsonReader p0) throws IOException;
    }
}
