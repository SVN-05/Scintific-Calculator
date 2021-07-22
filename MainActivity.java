package com.example.mycaptain_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    int c;
    ImageButton t;
    LinearLayout l1,l2,h;

    TextView one,two,three,four,five,six,seven,eight,nine,zero,dzero;
    TextView tc,equal,add,sub,module,divide,multiply,dot;
    TextView input,output;
    TextView b1,b2,power,sin,cos,tan,log;
    ImageButton clear;
    ImageView sqrt,pi;

    RecyclerView rv;

    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //values
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        dzero = findViewById(R.id.dzero);

        //operations
        tc = findViewById(R.id.total_clear);
        equal = findViewById(R.id.equal);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        module = findViewById(R.id.percentage);
        clear = findViewById(R.id.clear);
        divide = findViewById(R.id.module);
        multiply = findViewById(R.id.multiply);
        dot = findViewById(R.id.dot);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        power = findViewById(R.id.power);
        sin = findViewById(R.id.sin);
        sqrt = findViewById(R.id.sqrt);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        log = findViewById(R.id.log);
        pi= findViewById(R.id.pi);

        input = findViewById(R.id.op_value);
        output = findViewById(R.id.ans);

        t = findViewById(R.id.tap);
        l1 = findViewById(R.id.value);
        l2 = findViewById(R.id.science);
        ViewGroup.LayoutParams params = l1.getLayoutParams();

        h = findViewById(R.id.history);
        rv = findViewById(R.id.rhistory);

        params.height= 0;
        l2.setVisibility(View.GONE);
        h.setVisibility(View.GONE);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"1");
                answer();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"2");
                answer();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"3");
                answer();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"4");
                answer();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"5");
                answer();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"6");
                answer();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"7");
                answer();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"8");
                answer();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"9");
                answer();
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"0");
                answer();
            }
        });
        dzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"00");
                answer();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"+");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"/");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"x");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+".");
            }
        });

        tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                data = data.substring(0, data.length() - 1);
                String cdata= data;
                cdata = cdata.substring(0, cdata.length() - 1);
                input.setText(data);
                output.setText(cdata);
            }
        });

        module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"%");
                answer();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"(");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+")");
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"^");

            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"sin(");
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"cos(");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"tan(");
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"log(");
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"√(");
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=input.getText().toString();
                input.setText(data+"π");
                answer();
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();

                data = data.replaceAll("x","*");
                data = data.replaceAll("%","/100");
                data = data.replaceAll("π","3.14");
                data = data.replaceAll("√","sqrt");

                Context rhino =Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalvalue="";

                Scriptable scriptable = rhino.initStandardObjects();
                finalvalue = rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();

                input.setText(finalvalue);
                output.setText("");
            }
        });

    }

    //function to clear the output view and display the final answer in the input view
    private void answer() {
        data = input.getText().toString();

        data = data.replaceAll("x","*");
        data = data.replaceAll("%","/100");
        data = data.replaceAll("π","3.14");
        data = data.replaceAll("√","sqrt");

        Context rhino =Context.enter();
        rhino.setOptimizationLevel(-1);

        String finalvalue="";

        Scriptable scriptable = rhino.initStandardObjects();
        finalvalue = rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();

        output.setText(finalvalue);

    }

    public void change(View view) {

        switch (c){
            case 1:
                ViewGroup.LayoutParams params = l1.getLayoutParams();
                params.height= 1000;
                l2.setVisibility(View.VISIBLE);
                break;

            case 2:
                params = l1.getLayoutParams();
                params.height= 0;
                l2.setVisibility(View.GONE);
                break;
        }
        c++;
        if (c==3){
            c=1;
        }
    }
}