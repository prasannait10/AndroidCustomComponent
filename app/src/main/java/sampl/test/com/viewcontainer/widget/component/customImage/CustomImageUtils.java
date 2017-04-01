package sampl.test.com.viewcontainer.widget.component.customImage;

import android.widget.ImageView;

import sampl.test.com.viewcontainer.R;

/**
 * This Utils responsible to  process for {@link CustomImageView}
 * @see CustomImageView
 */

public class CustomImageUtils {


    public static void setImageView(ImageView imageView, String contentId){

        imageView.setImageResource(R.drawable.images);
    }
}
