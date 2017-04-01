package sampl.test.com.viewcontainer.widget.component.customView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import sampl.test.com.viewcontainer.factory.CustomViewFactory;
import sampl.test.com.viewcontainer.model.AttachmentDo;
import sampl.test.com.viewcontainer.widget.component.IView;

/**
 * This class load any view based on type wat client mentioned
 *
 * like type: image/ video / Document
 */

public  class CustomView extends RelativeLayout  {

    private String mType;
    private View mView;
    private IView mIView;
    public CustomView(Context context, String type) {
        super(context);
        mType = type;

    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public void loadViewBasedOnType(String type, AttachmentDo attachmentDo){
        // load Layout container based on Type
        mView = CustomViewFactory.getInstance().getViewBasedOnType(type, getContext(), this);
        // Load custom view based on Type
        mIView = CustomViewFactory.getInstance().getCustomView(type, getContext());
        // init the sub view based on type
        mIView.initViews(mView);
        // load data
        mIView.loadViews(attachmentDo);

    }







}
