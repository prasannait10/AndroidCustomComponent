package sampl.test.com.viewcontainer.factory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sampl.test.com.viewcontainer.R;
import sampl.test.com.viewcontainer.widget.component.customImage.CustomImageView;
import sampl.test.com.viewcontainer.widget.component.IView;

/**
 * This factory give all res based on type
 * eg: img then image layout will load
 */

public class CustomViewFactory {
    private static final CustomViewFactory ourInstance = new CustomViewFactory();
    public static final String TYPE_IMG = "type_img";
    public static final String TYPE_VID = "type_vid";
    public static final String TYPE_DOC = "type_doc";

    public static CustomViewFactory getInstance() {
        return ourInstance;
    }

    private CustomViewFactory() {
    }

    /**
     *
     * @param type  type need to be image/vide/doc
     * @return {@link IView} based on Type
     * @see IView
     */
    public IView getCustomView(String type, Context context) {
        IView customView = null;

        switch (type) {
            case TYPE_IMG:
                customView = new CustomImageView(context, CustomViewFactory.TYPE_IMG);
            case TYPE_DOC:
                //TODO need to add Custome view here
                customView = null;
            case TYPE_VID:
                //TODO need to add Custome view here
                customView = null;
            default:
                customView = null;
        }
        return customView;
    }

    /**
     *
     * @param type need to be image/vide/doc
     * @return respective layout
     */
    public View getViewBasedOnType(String type, Context context, View view) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        switch (type) {
            case TYPE_IMG:
                return inflater.inflate(R.layout.cutom_img_view, (ViewGroup) view, true);
            case TYPE_DOC:
                //TODO need to add layout if needed
                return null;
            case TYPE_VID:
                //TODO need to add layout if needed
                return null;
            default:
                return null;
        }
    }
}
