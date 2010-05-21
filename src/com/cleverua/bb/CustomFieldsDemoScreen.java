package com.cleverua.bb;

import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.MainScreen;

import com.cleverua.bb.fields.CustomCheckBoxField;
import com.cleverua.bb.fields.CustomEditField;
import com.cleverua.bb.fields.CustomEmailAddressEditField;
import com.cleverua.bb.fields.CustomObjectChoiceField;
import com.cleverua.bb.fields.CustomPasswordEditField;
import com.cleverua.bb.fields.CustomVerticalFieldManager;

public class CustomFieldsDemoScreen extends MainScreen {
    private static final String SCREEN_TITLE        = "Custom Fields Demo";
    private static final String CHOICE_FIELD_LABEL  = "Fruits:";
    private static final String EDIT_FIELD_LABEL    = "Name: ";
    private static final String PASSWORD_LABEL      = "Password: ";
    private static final String CHECKBOX_LABEL      = "Is active?";
    private static final String EMAIL_FIELD_LABEL   = "Email:\n";
    private static final int EMAIL_MAX_NUM_CHARS    = 300;

    private static final String[] FRUITS = {"Apple", "Orange", "Banana", "Miniola"};
    
    private CustomVerticalFieldManager container;
    private CustomEditField editField;
    private CustomPasswordEditField passwordField;
    private CustomEmailAddressEditField emailEditField;
    private CustomObjectChoiceField objectChoiceField;
    private CustomCheckBoxField checkboxField;
    
    public CustomFieldsDemoScreen() {
        super();
        initUI();
    }

    private void initUI() {
        setTitle(new LabelField(SCREEN_TITLE, FIELD_HCENTER));
        
        container = new CustomVerticalFieldManager();
        
        editField = new CustomEditField(EDIT_FIELD_LABEL);
        passwordField = new CustomPasswordEditField(PASSWORD_LABEL);
        emailEditField = new CustomEmailAddressEditField(EMAIL_FIELD_LABEL, null, EMAIL_MAX_NUM_CHARS);
        objectChoiceField = new CustomObjectChoiceField(CHOICE_FIELD_LABEL, FRUITS, 0);
        checkboxField = new CustomCheckBoxField(CHECKBOX_LABEL, true, USE_ALL_WIDTH);
        
        container.add(editField);
        container.add(passwordField);
        container.add(emailEditField);
        container.add(objectChoiceField);
        container.add(checkboxField);
        
        add(container);
    }
    
    protected boolean onSavePrompt() {
        return true;
    }
}
