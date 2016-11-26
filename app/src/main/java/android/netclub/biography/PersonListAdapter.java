package android.netclub.biography;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by usernames on 26/11/16.
 */

public class PersonListAdapter extends ArrayAdapter<Person>{
    public PersonListAdapter(Context context, List<Person> personList) {
        super(context, R.layout.card_person, personList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View cardPerson = layoutInflater.inflate(R.layout.card_person, parent, false);

        Person person = getItem(position);

        TextView tvName = (TextView) cardPerson.findViewById(R.id.tv_name);
        TextView tvAge = (TextView) cardPerson.findViewById(R.id.tv_age);
        ImageView ivAvatar = (ImageView) cardPerson.findViewById(R.id.iv_avatar);

        tvName.setText(person.getName());
        tvAge.setText(person.getAge());
        ivAvatar.setImageResource(person.getAvatar());

        return cardPerson;
    }
}
