/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.*;
import java.awt.Component;
import java.awt.Container;
import java.text.NumberFormat;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import javax.swing.text.NumberFormatter;


/**
 *
 * @author alift
 */
public class Controller {
    
    private PopUpFrame popUpFrame;
    private MainFrame mainFrame;
    
    public Controller(){
//        loginView = new LoginView(this);
//        registerView = new RegisterView(this);
//        loginView.setVisible(true);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        mainFrame = new MainFrame(this);
        popUpFrame = new PopUpFrame(this);
        
    }
    
    public void showLoginView(){
        mainFrame.getRegisterPanel().setVisible(false);
        mainFrame.getLoginPanel().setVisible(true);
    }
    
    public void showRegisterView(){
        LoginPanel loginPanel = mainFrame.getLoginPanel();
        RegisterPanel registerPanel = mainFrame.getRegisterPanel();
        
        loginPanel.setVisible(false);
        showPanel(mainFrame, registerPanel);
        
//        if(!isComponentAdded(mainFrame, registerPanel)){
//            mainFrame.getContentPane().add(registerPanel);
//        }
//        registerPanel.setVisible(true);
    }
    
    public void login(){
        MenuPanel menuPanel = mainFrame.getMenuPanel();
        
        mainFrame.getLoginPanel().setVisible(false);
        mainFrame.getContentPane().add(menuPanel);
        menuPanel.setVisible(true);
    }
    
    public void logout(){
        mainFrame.getMenuPanel().setVisible(false);
        showLoginView();
    }
    
    public void addSchedule(){
        popUpFrame.setAllVisibleFalse();
        showPanel(popUpFrame, popUpFrame.getCreateSchedulePanel());
        popUpFrame.pack();
        popUpFrame.setVisible(true);
    }
    
    public void removeSchedule(){
        popUpFrame.setAllVisibleFalse();
        showPanel(popUpFrame, popUpFrame.getRemoveSchedulePanel());
        popUpFrame.pack();
        popUpFrame.setVisible(true);
    }
    
    public void createRecipe(){
        popUpFrame.setAllVisibleFalse();
        showPanel(popUpFrame, popUpFrame.getCreateRecipePanel());
        popUpFrame.pack();
        popUpFrame.setVisible(true);
    }
    
    public void removeRecipe(){
        popUpFrame.setAllVisibleFalse();
        showPanel(popUpFrame, popUpFrame.getRemoveRecipePanel());
        popUpFrame.pack();
        popUpFrame.setVisible(true);
    }
    
    public static boolean isComponentAdded(Container container, Component component) {
        Component[] components = container.getComponents();
        for (Component comp : components) {
            if (comp == component) {
                return true;
            }
        }
        return false;
    }
    
    public static void numberOnlySpinner(JSpinner spinner){
        JSpinner.NumberEditor editor = (JSpinner.NumberEditor) spinner.getEditor();
        NumberFormat format = editor.getFormat();
        format.setGroupingUsed(false);
        format.setMaximumFractionDigits(0);
        format.setMinimumFractionDigits(0);
        ((NumberFormatter) editor.getTextField().getFormatter()).setAllowsInvalid(false);
    }
    
    private void showPanel(Container container, Component component){
        if(!isComponentAdded(container, component)){
            container.add(component);
        }
        component.setVisible(true);
    }
    
    
}
