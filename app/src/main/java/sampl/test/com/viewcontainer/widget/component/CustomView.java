package sampl.test.com.viewcontainer.widget.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import sampl.test.com.viewcontainer.factory.CusomViewFactory;
import sampl.test.com.viewcontainer.model.AttachmentDo;

/**
 * Created by dev on 24-03-2017.
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
        mView = CusomViewFactory.getInstance().getViewBasedOnType(type, getContext(), this);
        // Load custom view based on Type
        mIView = CusomViewFactory.getInstance().getCustomView(type, getContext());
        // init the sub view based on type
        mIView.initViews(mView);
        // load data
        mIView.loadViews(attachmentDo);

    }







}
