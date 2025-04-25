package com.naman;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.cloud.firestore.*;
import java.io.FileInputStream;
import java.io.IOException;
public class DataFirebase 
{

	    public static Firestore connect() throws IOException 
	    {
	        FileInputStream serviceAccount = new FileInputStream("path-to-your-firebase-key.json");

	        FirebaseOptions options = new FirebaseOptions.Builder()
	                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
	                .build();

	        FirebaseApp.initializeApp(options);
	        return FirestoreClient.getFirestore();
	    }
	

}
