package com.example.hanan.nim_gp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


private DatabaseReference shaz ;

    private Player p = new Player("Lyan","11/10/2002",18 , "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr2a7_Z5dQPXg-YUxdCwwVCx-dDJQk_jvBQhPu9WirCaNVWPOu","Saudi Arabia");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        shaz= FirebaseDatabase.getInstance().getReference();
        shaz.child("players").push().setValue(p);
    }


}
