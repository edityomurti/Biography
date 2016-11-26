package android.netclub.biography;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvPerson = (ListView) findViewById(R.id.lv_person);

        List<Person> personList = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("Alan Turing");
        person1.setAge("50");
        person1.setAvatar(R.mipmap.ic_launcher);
        person1.setBio("Alan Turing adalah orang inggris penemu mesin Enigma");
        personList.add(person1);

        Person person2 = new Person();
        person2.setName("Edityomurti");
        person2.setAge("30");
        person2.setAvatar(R.mipmap.ic_launcher);
        person2.setBio("Edityomurti bukan siapa-siapa");
        personList.add(person2);

        PersonListAdapter personListAdapter = new PersonListAdapter(this, personList);
        lvPerson.setAdapter(personListAdapter);

        lvPerson.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Person person = (Person) adapterView.getItemAtPosition(i);
                Toast.makeText(MainActivity.this, person.getBio(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
