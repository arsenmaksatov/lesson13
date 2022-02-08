package com.example.lesson12;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

        ImageView imImage;
        Button btnCdlc, btnMustang, btnAcura;
        boolean isCdlc, isMustang, isAcura;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initi();
        setupListener();
    }

        private void initi() {
        imImage = findViewById(R.id.im_image);
        btnCdlc = findViewById(R.id.btn_cdlc);
        btnMustang = findViewById(R.id.btn_mustang);
        btnAcura = findViewById(R.id.btn_acura);
    }

        private void setupListener() {
        btnCdlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCdlc) {
                    Toast.makeText(MainActivity.this, "TRUE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnCdlc.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnCdlc.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnCdlc);
                } else {
                    Toast.makeText(MainActivity.this, "FALSE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnCdlc.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnCdlc.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnCdlc);
                }
            }
        });

        btnMustang.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if (isMustang) {
                    Toast.makeText(MainActivity.this, "TRUE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnMustang.setBackgroundColor(Color.GREEN);
                                }
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnMustang.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnMustang);

                } else {
                    Toast.makeText(MainActivity.this, "FALSE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnMustang.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnMustang.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnMustang);
                }
            }
        });
        btnAcura.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if (isAcura) {
                    Toast.makeText(MainActivity.this, "TRUE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnAcura.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnAcura.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnAcura);
                } else {
                    Toast.makeText(MainActivity.this, "FALSE", Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .repeat(5)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnAcura.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnAcura.setBackgroundColor(Color.BLUE);
                                }
                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnAcura);
                }
            }
        });
    }


        public void changeImage(View view) {
            switch (view.getId()) {
                case R.id.btn_one:
                    imImage.setImageResource(R.drawable.cdlc);
                    isCdlc = true;
                    isMustang = false;
                    isAcura = false;
                    break;

                case R.id.btn_two:
                    imImage.setImageResource(R.drawable.mustang);
                    isCdlc = false;
                    isMustang = true;
                    isAcura = false;
                    break;

                case R.id.btn_three:
                    imImage.setImageResource(R.drawable.acura);
                    isCdlc = false;
                    isMustang = false;
                    isAcura = true;
                    break;
            }
        }
}

