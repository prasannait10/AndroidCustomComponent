package sampl.test.com.viewcontainer.widget.component.customImage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import sampl.test.com.viewcontainer.R;
import sampl.test.com.viewcontainer.model.AttachmentDo;
import sampl.test.com.viewcontainer.widget.component.customView.CustomView;
import sampl.test.com.viewcontainer.widget.component.IView;

/**
 * This component load and perform for Image type
 */


public class CustomImageView extends CustomView implements IView {


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
