package com.example.book_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.book_04.Models.Author;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    EditText title,year,editorial,author;
    Button register, filter_1,filter_2,filter_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title= findViewById(R.id.editTextTitle);
        year=findViewById(R.id.editTextYear);
        editorial=findViewById(R.id.editTextEditorial);
        author=findViewById(R.id.editTextAuthor);
        register=findViewById(R.id.button);
        filter_1=findViewById(R.id.button2);
        filter_2=findViewById(R.id.button3);
        filter_3=findViewById(R.id.button4);

    }

    public HashMap<String, Author> llenarModeloAuthor(){
        String [] ids= {"14","15","200","63","56","89","65","101","01","99"};
        String [] name={"Gabriel","J.K","Dan","Miguel","Madeline","George","Julio","Rick","Azimot","Mario"};
        String [] nation={"Colombiana","Inglesa","Estadounidense","Estadounidense","Estadounidense","Argentino","Estadounidense","Estadounidense","Colombiana"};

        HashMap<String,Author> authors= new HashMap<>();
        for (int i=0;i<ids.length;i++){
            Author author=new Author(ids[i],name[i],nation[i]);
            authors.put(ids[i],author);
        }
        return authors;
    }

    public void llenarModeloEditorial(){

    }




}