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

public class MapRightActivity extends AppCompatActivity {

    TextView textName, textUrl, textEx;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_right);

        getIntent();

        textName = (TextView)findViewById(R.id.name);
        textUrl = (TextView)findViewById(R.id.url);
        textEx = (TextView)findViewById(R.id.ex);
        button = findViewById(R.id.homepage);

        ImageView left = findViewById(R.id.left_button);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapRightActivity.this, MapLeftActivity.class);
                startActivity(intent);
            }
        });

        /*marker*/
        //15번째 마커
        ImageView marker15 = findViewById(R.id.marker15);
        marker15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company15_name));
                textUrl.setText(getText(R.string.company15_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company15_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company15_ex);
            }
        });

        //16,17,18번째 마커
        ImageView marker161718 = findViewById(R.id.marker161718);
        marker161718.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company16_name));
                textUrl.setText(getText(R.string.company16_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company16_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company16_ex);
                Toast.makeText(getApplicationContext(), "다중마커입니다. 5초마다 텍스트가 전환됩니다.", Toast.LENGTH_SHORT).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textName.setText(getText(R.string.company17_name));
                        textUrl.setText(getText(R.string.company17_url));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company17_url).toString()));
                                startActivity(intent);
                            }
                        });
                        textEx.setText(R.string.company17_ex);
                    }
                }, 5000); //딜레이 타임 조절
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textName.setText(getText(R.string.company18_name));
                        textUrl.setText(getText(R.string.company18_url));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company18_url).toString()));
                                startActivity(intent);
                            }
                        });
                        textEx.setText(R.string.company18_ex);
                    }
                }, 10000); //딜레이 타임 조절
            }
        });

        //19번째 마커
        ImageView marker19 = findViewById(R.id.marker19);
        marker19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company19_name));
                textUrl.setText(getText(R.string.company19_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company19_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company19_ex);
            }
        });

        //21번째 마커
        ImageView marker21 = findViewById(R.id.marker21);
        marker21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company21_name));
                textUrl.setText(getText(R.string.company21_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + getText(R.string.company21_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company21_ex);
            }
        });

        //22번째 마커
        ImageView marker22 = findViewById(R.id.marker22);
        marker22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company22_name));
                textUrl.setText(getText(R.string.company22_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company22_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company22_ex);
            }
        });

        //23,24번째 마커
        ImageView marker2324 = findViewById(R.id.marker2324);
        marker2324.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company23_name));
                textUrl.setText(getText(R.string.company23_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company23_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company23_ex);
                Toast.makeText(getApplicationContext(), "다중마커입니다. 5초마다 텍스트가 전환됩니다.", Toast.LENGTH_SHORT).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textName.setText(getText(R.string.company24_name));
                        textUrl.setText(getText(R.string.company24_url));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company24_url).toString()));
                                startActivity(intent);
                            }
                        });
                        textEx.setText(R.string.company24_ex);
                    }
                }, 5000); //딜레이 타임 조절
            }
        });

        //25번째 마커
        ImageView marker25 = findViewById(R.id.marker25);
        marker25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company25_name));
                textUrl.setText(getText(R.string.company25_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company25_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company25_ex);
            }
        });

        //26번째 마커
        ImageView marker26 = findViewById(R.id.marker26);
        marker26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company26_name));
                textUrl.setText(getText(R.string.company26_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company26_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company26_ex);
            }
        });

        //27번째 마커
        ImageView marker27 = findViewById(R.id.marker27);
        marker27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company27_name));
                textUrl.setText(getText(R.string.company27_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company27_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company27_ex);
            }
        });

        //28번째 마커
        ImageView marker28 = findViewById(R.id.marker28);
        marker28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company28_name));
                textUrl.setText(getText(R.string.company28_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company28_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company28_ex);
            }
        });

        //29,30번째 마커
        ImageView marker2930 = findViewById(R.id.marker2930);
        marker2930.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company29_name));
                textUrl.setText(getText(R.string.company29_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company29_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company29_ex);
                Toast.makeText(getApplicationContext(), "다중마커입니다. 5초마다 텍스트가 전환됩니다.", Toast.LENGTH_SHORT).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textName.setText(getText(R.string.company30_name));
                        textUrl.setText(getText(R.string.company30_url));
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company30_url).toString()));
                                startActivity(intent);
                            }
                        });
                        textEx.setText(R.string.company30_ex);
                    }
                }, 5000); //딜레이 타임 조절
            }
        });

        //31번째 마커
        ImageView marker31 = findViewById(R.id.marker31);
        marker31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company31_name));
                textUrl.setText(getText(R.string.company31_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company31_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company31_ex);
            }
        });

        //32번째 마커
        ImageView marker32 = findViewById(R.id.marker32);
        marker32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company32_name));
                textUrl.setText(getText(R.string.company32_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company32_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company32_ex);
            }
        });

        //33번째 마커
        ImageView marker33 = findViewById(R.id.marker33);
        marker33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company33_name));
                textUrl.setText(getText(R.string.company33_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company33_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company33_ex);
            }
        });

        //34번째 마커
        ImageView marker34 = findViewById(R.id.marker34);
        marker34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText(getText(R.string.company34_name));
                textUrl.setText(getText(R.string.company34_url));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + getText(R.string.company34_url).toString()));
                        startActivity(intent);
                    }
                });
                textEx.setText(R.string.company34_ex);
            }
        });

    }
}