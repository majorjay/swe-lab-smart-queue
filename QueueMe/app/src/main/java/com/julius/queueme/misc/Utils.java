package com.julius.queueMe.misc;

// TODO: POPULATE COMMONLY USED FUNCTIONS HERE.

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;

public class Utils {
    private static final int PICK_IMAGE_REQUEST = 1;

    public static String getFileExtension(Uri uri, Context context) {
        ContentResolver cR = context.getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cR.getType(uri));
    }

}
