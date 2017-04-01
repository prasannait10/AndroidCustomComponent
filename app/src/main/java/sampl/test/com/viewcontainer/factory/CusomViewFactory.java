package sampl.test.com.viewcontainer.factory;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sampl.test.com.viewcontainer.R;
import sampl.test.com.viewcontainer.widget.component.CustomImageView;
import sampl.test.com.viewcontainer.widget.component.CustomView;
import sampl.test.com.viewcontainer.widget.component.IView;

/**
 * Created by dev on 24-03-2017.
 */

public class CusomViewFactory {
    private static final CusomViewFactory ourInstance = new CusomViewFactory();
    public static final String TYPE_IMG = "type_img";
    public static final String TYPE_VID = "type_vid";
    public static final String TYPE_DOC = "type_doc";

    public static CusomViewFactory getInstance() {
        return ourInstance;
    }

    private CusomViewFactory() {
    }

    public IView getCustomView(String type, Context context) {
        IView customView = null;
        if (CusomViewFactory.TYPE_IMG.equalsIgnoreCase(type)){
            return new CustomImageView(context, CusomViewFactory.TYPE_IMG);
        }
        return customView;
    }

    public View getViewBasedOnType(String type, Context context, View view){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (TYPE_IMG.equalsIgnoreCase(type)){
            return inflater.inflate(R.layout.cutom_img_view, (ViewGroup) view, true);
        }
        return null;
    }
}
