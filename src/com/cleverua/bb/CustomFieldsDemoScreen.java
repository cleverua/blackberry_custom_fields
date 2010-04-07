package com.cleverua.bb;

import net.rim.device.api.ui.container.MainScreen;

import com.cleverua.bb.fields.CustomCheckBoxField;
import com.cleverua.bb.fields.CustomEditField;
import com.cleverua.bb.fields.CustomEmailAddressEditField;
import com.cleverua.bb.fields.CustomObjectChoiceField;

public class CustomFieldsDemoScreen extends MainScreen {
    private static final String[] FRUITS = {"Apple", "Orange", "Banana", "Miniola"};
    
    private static final String CHOICE_FIELD_LABEL  = "Fruits:";
    private static final String EDIT_FIELD_LABEL    = "Name: ";
    private static final String CHECKBOX_LABEL      = "Is active?";
    private static final String EMAIL_FIELD_LABEL = "Email:\n";
    private static final int EMAIL_MAX_NUM_CHARS = 300;
    
    private CustomEditField editField;
    private CustomEmailAddressEditField emailEditField;
    private CustomObjectChoiceField objectChoiceField;
    private CustomCheckBoxField checkboxField;
    
    public CustomFieldsDemoScreen() {
        super();
        initUI();
    }

    private void initUI() {
        editField = new CustomEditField(EDIT_FIELD_LABEL);
        emailEditField = new CustomEmailAddressEditField(EMAIL_FIELD_LABEL, null, EMAIL_MAX_NUM_CHARS);
        objectChoiceField = new CustomObjectChoiceField(CHOICE_FIELD_LABEL, FRUITS, 0);
        checkboxField = new CustomCheckBoxField(CHECKBOX_LABEL, true);
        
        add(editField);
        add(emailEditField);
        add(objectChoiceField);
        add(checkboxField);
    }
    
    protected boolean onSavePrompt() {
        return true;
    }
}
