package com.cleverua.bb.fields;

import net.rim.device.api.ui.component.PasswordEditField;

import com.cleverua.bb.utils.FieldDecorUtils;


public class CustomPasswordEditField extends PasswordEditField {
    public CustomPasswordEditField() {
        super();
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    public CustomPasswordEditField(String label) {
        this();
        setLabel(label);
    }
    
    public CustomPasswordEditField(String label, String initialValue) {
        super(label, initialValue);
        FieldDecorUtils.setVisualStateBorderAndBg(this);
    }
    
    public CustomPasswordEditField(String label, String initialValue, int maxNumChars, long style) {
        super(label, initialValue, maxNumChars, style);
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
