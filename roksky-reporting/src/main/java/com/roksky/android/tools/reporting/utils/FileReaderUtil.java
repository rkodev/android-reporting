package com.roksky.android.tools.reporting.utils;

import android.content.Context;

import androidx.annotation.Nullable;

import com.roksky.android.tools.reporting.model.xml.DashBoard;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public final class FileReaderUtil {

    @Nullable
    public static String readAssetFile(String formIdentity, Context context) {
        if (context != null) {
            try {
                InputStream inputStream
                        = context.getApplicationContext().getAssets()
                        .open(formIdentity);
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(inputStream));
                String jsonString;
                StringBuilder stringBuilder = new StringBuilder();

                while ((jsonString = reader.readLine()) != null) {
                    stringBuilder.append(jsonString);
                }
                inputStream.close();

                return stringBuilder.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static DashBoard getDashBoard(String formIdentity, Context context) throws Exception {
        String xmlData = readAssetFile(formIdentity, context);
        Serializer serializer = new Persister();
        Reader reader = new StringReader(xmlData);
        return serializer.read(DashBoard.class, reader, false);
    }
}
