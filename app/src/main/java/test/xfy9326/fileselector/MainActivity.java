package test.xfy9326.fileselector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import lib.xfy9326.fileselector.SelectFile;

public class MainActivity extends Activity 
{
    private String DefaultPath = "";
    private TextView pathshow;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        dataset();
    }

    private void dataset ()
    {
        pathshow = (TextView) findViewById(R.id.selectpath);
        pathshow.setText(DefaultPath);
        Button select = (Button) findViewById(R.id.selectbutton);
        select.setOnClickListener(new OnClickListener(){
                public void onClick (View v)
                {
                    SelectFile file = new SelectFile(2, SelectFile.TYPE_ChooseFile);
                    //file.setFileType("js");
                    file.start(MainActivity.this);
                }
            });
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 2)
        {
            pathshow.setText(data.getStringExtra("FilePath"));
        }
    }

}
