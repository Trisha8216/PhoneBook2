package com.trisha.phonebook;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView=(ImageView)findViewById(R.id.imageView);
        textView1=(TextView)findViewById(R.id.txtView1);
        textView2=(TextView)findViewById(R.id.txtView2);

        String getName=getIntent().getExtras().getString("name");

        if(getName.equals("Friend1"))
        {
            imageView.setImageResource(R.drawable.pic1);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic1);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd1);
            textView2.setText(R.string.frnd1_des);
        }
        else if(getName.equals("Friend2"))
        {
            imageView.setImageResource(R.drawable.pic2);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic2);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd2);
            textView2.setText(R.string.frnd2_des);
        }
        else if(getName.equals("Friend3"))
        {
            imageView.setImageResource(R.drawable.pic3);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic3);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd3);
            textView2.setText(R.string.frnd3_des);
        }
        else if(getName.equals("Friend4"))
        {
            imageView.setImageResource(R.drawable.pic4);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic4);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd4);
            textView2.setText(R.string.frnd4_des);
        }
        else if(getName.equals("Friend5"))
        {
            imageView.setImageResource(R.drawable.pic1);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic1);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd5);
            textView2.setText(R.string.frnd5_des);
        }
        else if(getName.equals("Friend6"))
        {
            imageView.setImageResource(R.drawable.pic2);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic2);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd6);
            textView2.setText(R.string.frnd6_des);
        }
        else if(getName.equals("Friend7"))
        {
            imageView.setImageResource(R.drawable.pic3);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic3);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd7);
            textView2.setText(R.string.frnd7_des);
        }
        else if(getName.equals("Friend8"))
        {
            imageView.setImageResource(R.drawable.pic4);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic4);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd8);
            textView2.setText(R.string.frnd8_des);
        }
        else if(getName.equals("Friend9"))
        {
            imageView.setImageResource(R.drawable.pic1);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic1);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd9);
            textView2.setText(R.string.frnd9_des);
        }
        else if(getName.equals("Friend10"))
        {
            imageView.setImageResource(R.drawable.pic2);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic2);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd10);
            textView2.setText(R.string.frnd10_des);
        }
        else if(getName.equals("Friend11"))
        {
            imageView.setImageResource(R.drawable.pic3);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic3);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd11);
            textView2.setText(R.string.frnd11_des);
        }
        else if(getName.equals("Friend12"))
        {
            imageView.setImageResource(R.drawable.pic4);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic4);
            RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
            roundedBitmapDrawable.setCircular(true);
            imageView.setImageDrawable(roundedBitmapDrawable);
            textView1.setText(R.string.frnd12);
            textView2.setText(R.string.frnd12_des);
        }

    }
}
