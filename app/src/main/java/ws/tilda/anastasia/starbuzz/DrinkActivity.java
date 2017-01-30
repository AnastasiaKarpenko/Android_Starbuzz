package ws.tilda.anastasia.starbuzz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static ws.tilda.anastasia.starbuzz.Drink.drinks;

public class DrinkActivity extends Activity {
    public static final String EXTRA_DRINKNO = "drinkNo'";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);
        Drink drink = drinks[drinkNo];

        //To set the image of the drink
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        //To set the name of the drink
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        //To set the description of the drink
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());
    }


}
