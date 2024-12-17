package com.example.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ImplicitIntentsReceiver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intents_receiver);

        // Get the intent and extract the data (URI)
        Intent intent = getIntent();
        Uri uri = intent.getData();  // Correct Uri declaration

        if (uri != null) {
            // Concatenate the URI with the label from strings.xml
            String uriString = getString(R.string.uri_label) + uri.toString();
            TextView textView = findViewById(R.id.text_uri_message);
            textView.setText(uriString);
        }
    }
}
