package com.rafaelkarlo.workmode.mainscreen.config;

import com.rafaelkarlo.workmode.mainscreen.service.alarm.WorkModeAlarmOnBootScheduler;
import com.rafaelkarlo.workmode.mainscreen.service.alarm.WorkModeAlarmReceiver;
import com.rafaelkarlo.workmode.mainscreen.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AndroidModule.class,
        WorkModeModule.class
})
public interface MainActivityComponent {
    void inject(MainActivity mainScreenActivity);
    void inject(WorkModeAlarmReceiver workModeAlarmReceiver);
    void inject(WorkModeAlarmOnBootScheduler workModeAlarmOnBootScheduler);
}
