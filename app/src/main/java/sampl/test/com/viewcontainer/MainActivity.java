package sampl.test.com.viewcontainer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sampl.test.com.viewcontainer.factory.CustomViewFactory;
import sampl.test.com.viewcontainer.model.AttachmentDo;
import sampl.test.com.viewcontainer.widget.component.customView.CustomView;

public class MainActivity extends AppCompatActivity {

    CustomView customView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            AttachmentDo attachmentDo = null;
            customView = (CustomView) findViewById(R.id.customView);
            customView.loadViewBasedOnType(CustomViewFactory.TYPE_IMG, attachmentDo);

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }

    }
}
