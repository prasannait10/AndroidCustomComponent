package sampl.test.com.viewcontainer.widget.component;

import android.view.View;

import sampl.test.com.viewcontainer.model.AttachmentDo;

/**
 *  Interface to decide what view loaded based on type
 *
 */

public interface ICustomView {
    public void initViews(View view);

    public void loadViews(AttachmentDo attachmentDo);

}
