package sampl.test.com.viewcontainer.widget.component;

import android.view.View;

import sampl.test.com.viewcontainer.model.AttachmentDo;

/**
 * Created by dev on 24-03-2017.
 */

public interface IView {
    public void initViews(View view);

    public void loadViews(AttachmentDo attachmentDo);

}
