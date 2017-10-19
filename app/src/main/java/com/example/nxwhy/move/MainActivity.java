package com.example.nxwhy.move;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean move1=false;
    AnimationDrawable back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image =(ImageView) findViewById(R.id.imageView);
        image.setBackgroundResource(R.drawable.move);
        back = (AnimationDrawable)image.getBackground();

        Button click = (Button)findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(move1)
                {
                    back.stop();;
                    move1=false;
                }
                else
                {
                    Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
                    back.start();
                    move1=true;

                    ImageView spaceshipImage = (ImageView) findViewById(R.id.imageView2);
                    Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                    spaceshipImage.startAnimation(hyperspaceJumpAnimation);
                }
            }
        });
    }
}
