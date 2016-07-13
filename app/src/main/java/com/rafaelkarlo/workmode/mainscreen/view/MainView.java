package com.rafaelkarlo.workmode.mainscreen.view;

public interface MainView {

    void onWorkModeActivation();
    void onWorkModeDeactivation();
    void onSetStartDate(String startDate);
    void onSetEndDate(String endDate);
    void displayErrorOnMissingWorkHours();
    void displayErrorOnInvalidWorkHours();

}
