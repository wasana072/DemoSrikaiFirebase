package ubu.java.demosrikaifirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // declare Buttons
    private Button bAddFood, bShowImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button: upload food
        //
        bAddFood = (Button) findViewById(R.id.bAddFood);
        bAddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddFood();
            }
        });

        // Button: show foods
        //
        bShowImages = (Button) findViewById(R.id.bShowFoods);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFoods();
            }
        });

    }

    private void showAddFood(){
        Intent intent = new Intent(MainActivity.this, AddFood.class);
        MainActivity.this.startActivity(intent);
    }

    private void showFoods(){
        Intent intent = new Intent(MainActivity.this, ShowFoods.class);
        MainActivity.this.startActivity(intent);
    }


}
