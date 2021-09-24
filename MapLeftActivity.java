package com.example.guroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MapLeftActivity extends AppCompatActivity {

    TextView textName, textUrl, textEx;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_left);

        getIntent();

        textName = (TextView)findViewById(R.id.name);
        textUrl = (TextView)findViewById(R.id.url);
        textEx = (TextView)findViewById(R.id.ex);
        button = findViewById(R.id.homepage);

        ImageView right = findViewById(R.id.right_button);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapLeftActivity.this, MapRightActivity.class);
                startActivity(intent);
            }
        });

        /*marker*/

        //1번째 마커
        ImageView marker1 = findViewById(R.id.marker1);
        marker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company1_name));
                textUrl.setText(getText(R.string.company1_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company1_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company1_ex);
            }
        });

        //2번째 마커
        ImageView marker2 = findViewById(R.id.marker2);
        marker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company2_name));
                textUrl.setText(getText(R.string.company2_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company2_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company2_ex);
            }
        });

        //3번째 마커
        ImageView marker3 = findViewById(R.id.marker3);
        marker3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company3_name));
                textUrl.setText(getText(R.string.company3_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + getText(R.string.company3_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company3_ex);
            }
        });

        //4번째 마커
        ImageView marker4 = findViewById(R.id.marker4);
        marker4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company4_name));
                textUrl.setText(getText(R.string.company4_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company4_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company4_ex);
            }
        });

        //5,6,7번째 마커
        ImageView marker567 = findViewById(R.id.marker567);
        marker567.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company5_name));
                textUrl.setText(getText(R.string.company5_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company5_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company5_ex);
                Toast.makeText(getApplicationContext(), "다중마커입니다. 5초마다 텍스트가 전환됩니다.", Toast.LENGTH_SHORT).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textName.setText(getText(R.string.company6_name));
                        textUrl.setText(getText(R.string.company6_url));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company6_url).toString()));
                                startActivity(intent);
                            }
                        });
                        textEx.setText(R.string.company6_ex);
                    }
                }, 5000); //딜레이 타임 조절
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textName.setText(getText(R.string.company7_name));
                        textUrl.setText(getText(R.string.company7_url));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company7_url).toString()));
                                startActivity(intent);
                            }
                        });
                        textEx.setText(R.string.company7_ex);
                    }
                }, 10000); //딜레이 타임 조절
            }
        });

        //8,11,12,13,20번째 마커
        ImageView marker811121320 = findViewById(R.id.marker811121320);
        marker811121320.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company8_name));
                textUrl.setText(getText(R.string.company8_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company8_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company8_ex);
                Toast.makeText(getApplicationContext(), "다중마커입니다. 5초마다 텍스트가 전환됩니다.", Toast.LENGTH_SHORT).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textName.setText(getText(R.string.company11_name));
                        textUrl.setText(getText(R.string.company11_url));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company11_url).toString()));
                                startActivity(intent);
                            }
                        });
                        textEx.setText(R.string.company11_ex);
                    }
                }, 5000); //딜레이 타임 조절
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textName.setText(getText(R.string.company12_name));
                        textUrl.setText(getText(R.string.company12_url));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company12_url).toString()));
                                startActivity(intent);
                            }
                        });
                        textEx.setText(R.string.company12_ex);
                    }
                }, 10000); //딜레이 타임 조절
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textName.setText(getText(R.string.company13_name));
                        textUrl.setText(getText(R.string.company13_url));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company13_url).toString()));
                                startActivity(intent);
                            }
                        });
                        textEx.setText(R.string.company13_ex);
                    }
                }, 15000); //딜레이 타임 조절
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textName.setText(getText(R.string.company20_name));
                        textUrl.setText(getText(R.string.company20_url));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company20_url).toString()));
                                startActivity(intent);
                            }
                        });
                        textEx.setText(R.string.company20_ex);
                    }
                }, 20000); //딜레이 타임 조절
            }
        });

        //9번째 마커
        ImageView marker9 = findViewById(R.id.marker9);
        marker9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company9_name));
                textUrl.setText(getText(R.string.company9_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company9_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company9_ex);
            }
        });

        //10번째 마커
        ImageView marker10 = findViewById(R.id.marker10);
        marker10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company10_name));
                textUrl.setText(getText(R.string.company10_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company10_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company10_ex);
            }
        });

        //14번째 마커
        ImageView marker14 = findViewById(R.id.marker14);
        marker14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company14_name));
                textUrl.setText(getText(R.string.company14_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + getText(R.string.company14_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company14_ex);
            }
        });

    }
}