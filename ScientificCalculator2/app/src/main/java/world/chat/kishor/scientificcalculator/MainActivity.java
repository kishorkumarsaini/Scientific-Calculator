package world.chat.kishor.scientificcalculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static java.lang.Double.NaN;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button one ,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,sqr,sin,cos,tan,dot,clear,e,equal,fact,lg,ln,pi,power,
    back;
    EditText resut;
    Double res;
    double fristvalue,secoundvalue;
    String opt;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=(Button)findViewById(R.id.oneButton);
        two=(Button)findViewById(R.id.twoButton);
        three=(Button)findViewById(R.id.threeButton);
        four=(Button)findViewById(R.id.fourButton);
        five=(Button)findViewById(R.id.fiveButton);
        six=(Button)findViewById(R.id.sixButton);
        seven=(Button)findViewById(R.id.sevenButton);
        eight=(Button)findViewById(R.id.eightButton);
        nine=(Button)findViewById(R.id.nineButton);
        zero=(Button)findViewById(R.id.zeroButton);
        add=(Button)findViewById(R.id.plusButton);
        sub=(Button)findViewById(R.id.minusButton);
        mul=(Button)findViewById(R.id.multiplyButton);
        div=(Button)findViewById(R.id.divisonButton);
        sin=(Button)findViewById(R.id.sinButton);
        cos=(Button)findViewById(R.id.cosButton);
        tan=(Button)findViewById(R.id.tanButton);
        equal=(Button)findViewById(R.id.equalButton);
        clear=(Button)findViewById(R.id.clearButton);
        lg=(Button)findViewById(R.id.lgButton);
        ln=(Button)findViewById(R.id.lnButton);
        fact=(Button)findViewById(R.id.factButton);
        sqr=(Button)findViewById(R.id.sqrButton);
        e=(Button)findViewById(R.id.eButton);
        dot=(Button)findViewById(R.id.dotButton);
        pi=(Button)findViewById(R.id.piButton);
        power=(Button)findViewById(R.id.powerButton);
        back=(Button)findViewById(R.id.backspace);
        resut=(EditText)findViewById(R.id.inputresult);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        ln.setOnClickListener(this);
        lg.setOnClickListener(this);
        sqr.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        power.setOnClickListener(this);
        pi.setOnClickListener(this);
        fact.setOnClickListener(this);
        clear.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
        e.setOnClickListener(this);
        back.setOnClickListener(this);
        sin.setEnabled(true);
        cos.setEnabled(true);
        tan.setEnabled(true);

        resut.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b)
            {
                if(b)
                {
                    InputMethodManager in= (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(resut.getWindowToken(),0);
                }

            }
        });

    }



    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.oneButton)
        {
            resut.setText(resut.getText()+"1");

        }else if(view.getId()==R.id.twoButton)
        {
            resut.setText(resut.getText()+"2");
        }
        else if(view.getId()==R.id.threeButton)
        {
            resut.setText(resut.getText()+"3");
        }
        else if(view.getId()==R.id.fourButton)
        {
            resut.setText(resut.getText()+"4");
        }
        else if(view.getId()==R.id.fiveButton)
        {
            resut.setText(resut.getText()+"5");
        }
        else if(view.getId()==R.id.sixButton)
        {
            resut.setText(resut.getText()+"6");
        }
        else if(view.getId()==R.id.sevenButton)
        {
            resut.setText(resut.getText()+"7");
        }
        else if(view.getId()==R.id.eightButton)
        {
            resut.setText(resut.getText()+"8");
        }
        else if(view.getId()==R.id.nineButton)
        {
            resut.setText(resut.getText()+"9");
        }
        else if(view.getId()==R.id.zeroButton)
        {
            resut.setText(resut.getText()+"0");
        }
        else if(view.getId()==R.id.dotButton)
        {
            resut.setText(resut.getText()+".");
        }
        else if(view.getId()==R.id.backspace)
        {
            if(!resut.getText().toString().equals(""))
            {
                String value=resut.getText().toString();
                if(value.length()>0)
                {
                    value=value.substring(0,value.length()-1);
                    resut.setText(value);
                }


            }
        }
        else if(view.getId()==R.id.clearButton)
        {
            resut.setText("");
        }

        else if(view.getId()==R.id.plusButton)
        {
                if(resut.getText().toString().equals(""))
                {
                    resut.setText("");
                }
                else {
                    fristvalue = Double.parseDouble(resut.getText().toString());
                    opt = "+";
                    resut.setText("");
                }

        }
        else if(view.getId()==R.id.minusButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else
            {
                fristvalue = Double.parseDouble(resut.getText().toString());
                opt = "-";
                resut.setText("");

            }
        }
        else if(view.getId()==R.id.multiplyButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else {
                fristvalue = Double.parseDouble(resut.getText().toString());
                opt = "*";
                resut.setText("");
            }
        }
        else if(view.getId()==R.id.divisonButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else
            {
                fristvalue = Double.parseDouble(resut.getText().toString());
                opt = "/";
                resut.setText("");
            }
        }
        else if(view.getId()==R.id.powerButton)
        {

            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else {
                fristvalue = Double.parseDouble(resut.getText().toString());
                opt = "power";
                resut.setText("");
            }
        }
        else if(view.getId()==R.id.equalButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else {
                secoundvalue = Double.parseDouble(resut.getText().toString());
                switch (opt) {
                    case "+":
                        res = fristvalue + secoundvalue;
                        resut.setText(res + "");
                        break;
                    case "-":
                        res = fristvalue - secoundvalue;
                        resut.setText(res + "");
                        break;
                    case "*":
                        res = fristvalue * secoundvalue;
                        resut.setText(res + "");
                        break;
                    case "/":
                        res = fristvalue / secoundvalue;
                        resut.setText(res + "");
                        break;
                    case "power":
                        res = Math.pow(fristvalue, secoundvalue);
                        resut.setText(res + "");
                        break;
                }
            }
        }
        else if(view.getId()==R.id.sqrButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else {
                double value = Double.parseDouble(resut.getText().toString());
                double ress = Math.sqrt(value);
                resut.setText(ress + "");
            }
        }

        else if(view.getId()==R.id.factButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else {
                double factt = Double.parseDouble(resut.getText().toString());
                int i;
                double fact = 1;
                for (i = 2; i <= factt; i++) {
                    fact = fact * i;
                    resut.setText(fact + "");
                }
            }

        }
        else if(view.getId()==R.id.sinButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else {
                fristvalue = Double.parseDouble(resut.getText().toString());
                double Sin = Math.sin(fristvalue);
                resut.setText(String.valueOf(Sin));
            }
        }
        else if(view.getId()==R.id.cosButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else {
                fristvalue = Double.parseDouble(resut.getText().toString());
                double Cos = Math.cos(fristvalue);
                resut.setText(String.valueOf(Cos));
            }
        }
        else if(view.getId()==R.id.tanButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else {
                if (resut.getText().toString().equals("")) {
                    resut.setText("");
                } else {
                    fristvalue = Double.parseDouble(resut.getText().toString());
                    double tan = Math.tan(fristvalue);
                    resut.setText(tan + "");
                }
            }
        }
        else if (view.getId()==R.id.lgButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else {
                fristvalue = Double.parseDouble(resut.getText().toString());
                if (fristvalue != 0) {
                    double i = 10;
                    double j = Math.log(10);
                    double ln = Math.log(fristvalue);
                    double log = ln / j;
                    resut.setText(log + "");
                } else {
                    resut.setText("error");
                }
            }

        }
        else if(view.getId()==R.id.lnButton)
        {
            if(resut.getText().toString().equals(""))
            {
                resut.setText("");
            }
            else {

                fristvalue = Double.parseDouble(resut.getText().toString());
                if (fristvalue != 0) {
                    double lg = Math.log(fristvalue);
                    resut.setText(lg + "");
                } else {
                    resut.setText("error");
                }
            }
        }
        else if(view.getId()==R.id.eButton) {
            if (resut.getText().toString().equals("")) {
                resut.setText("");
            } else {
                fristvalue = Double.parseDouble(resut.getText().toString());
                double e = Math.exp(fristvalue);
                resut.setText(e + "");
            }
            }
        else if (view.getId() == R.id.piButton)
        {
                double pi = Math.PI;
                resut.setText(pi + "");
            }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);
        String filename="scientific";
        switch (item.getItemId())
        {
            case R.id.save:

                String e1=resut.getText().toString();
                byte b[]=e1.getBytes();
                try {
                    FileOutputStream out=openFileOutput(filename,MODE_PRIVATE);
                    out.write(b);
                    out.close();

                }
                catch (java.io.IOException e2) {
                    e2.printStackTrace();
                }
                resut.setText(null);
                //Toast.makeText(this,"History Save",Toast.LENGTH_SHORT).show();
                break;
            case R.id.read:

                String str="";
                    try {
                        FileInputStream fin = openFileInput(filename);
                        int i = 0;
                        while ((i = fin.read()) != -1) {
                            char ch = (char) i;
                            str += Character.toString(ch);
                        }
                        fin.close();
                    } catch (java.io.IOException e2) {
                        e2.printStackTrace();
                    }
                    resut.setText(str);
                break;
            case R.id.clear:
                resut.setText(null);

        }
        return  true;
    }


}
