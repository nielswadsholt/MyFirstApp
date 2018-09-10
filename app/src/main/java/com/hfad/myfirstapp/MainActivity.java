package com.hfad.myfirstapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person("Universe", 42);
        Log.d("Person", person.toString());

        Context context = getApplicationContext();
        CharSequence text = person.toString();
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 180);
        toast.show();

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Hans", 13));
        persons.add(new Person("Grethe", 9));
        persons.add(new Person("Konfutse", 551 + Calendar.getInstance().get(Calendar.YEAR)));
        persons.add(new Person("Einstein", Calendar.getInstance().get(Calendar.YEAR) - 1879));

        for (Person p : persons) {
            Log.d("Person", p.toString());
        }

        CharSequence multiText = "";

        for (Person p : persons) {
            multiText = multiText + "\n" + p.getName();
        }

        Log.d("Persons", multiText.toString());

        Toast multiToast = Toast.makeText(context, multiText, Toast.LENGTH_LONG);
        multiToast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
        multiToast.show();

        final Button button = findViewById(R.id.btnHello);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Hello, " + context.getText(R.string.user_name);
                Toast toastHello = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toastHello.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
                toastHello.show();
            }
        });

        final Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = context.getText(R.string.btn_2) + " pressed";
                Toast toast2 = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast2.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
                toast2.show();
            }
        });

        // Week 3 exercise 1
        ArrayList<Person> mixedPersons = new ArrayList<>();
        mixedPersons.add(new Person("John Doe", 42));
        mixedPersons.add(new Worker("Tom Joad", 27, 23.44f));
        mixedPersons.add(new Pensioner("Sean Connery", 88, 2006));

        for (Person p : mixedPersons) {
            Log.d("Person", p.toString());
        }

        CharSequence multiTextMixed = "";

        for (Person p : mixedPersons) {
            multiTextMixed = multiTextMixed + "\n" + p.getName();
        }

        Log.d("Persons", multiTextMixed.toString());

        Toast multiToastMixed = Toast.makeText(context, multiTextMixed, Toast.LENGTH_LONG);
        multiToastMixed.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
        multiToastMixed.show();

        // Week 3 exercise 2
        for (Person p : persons) {
            Log.d("Person", p.getName() + " is" + (p.isTeenager() ? " " : " not ") + "a teenager");
        }
    }
}
