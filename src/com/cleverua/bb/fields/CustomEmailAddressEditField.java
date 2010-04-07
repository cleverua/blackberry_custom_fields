package com.cleverua.bb.fields;

import net.rim.device.api.ui.component.EmailAddressEditField;

import com.cleverua.bb.utils.FieldDecorUtils;

public class CustomEmailAddressEditField extends EmailAddressEditField {
    public CustomEmailAddressEditField(String label, String initialText, int maxNumChars) {
        super(label, initialText, maxNumChars);
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    protected void onFocus(int direction) {
        super.onFocus(direction);
        invalidate();
    }
    
    protected void onUnfocus() {
        super.onUnfocus();
        invalidate();
    }
}
