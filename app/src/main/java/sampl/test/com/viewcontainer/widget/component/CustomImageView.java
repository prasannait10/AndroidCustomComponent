package sampl.test.com.viewcontainer.widget.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import sampl.test.com.viewcontainer.R;
import sampl.test.com.viewcontainer.model.AttachmentDo;

/**
 * Created by dev on 24-03-2017.
 */


public class CustomImageView extends CustomView implements IView{


    private ImageView profile;
    public CustomImageView(Context context, String type) {
        super(context, type);
    }

    @Override
    public void initViews(View view){
        profile = (ImageView) view.findViewById(R.id.profile);

    }

    @Override
    public void loadViews(AttachmentDo attachmentDo) {
        CustomImageUtils.setImageView(profile, attachmentDo.getContentId());
    }
}
