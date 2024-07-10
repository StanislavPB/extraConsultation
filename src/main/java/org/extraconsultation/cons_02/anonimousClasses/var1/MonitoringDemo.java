package org.extraconsultation.cons_02.anonimousClasses.var1;

public class MonitoringDemo {
    public static void main(String[] args) {
        GeneralIndicatorMonitorModule generalIndicatorMonitorModule = new GeneralIndicatorMonitorModule();
        ErrorMonitorModule errorMonitorModule = new ErrorMonitorModule();
        SecurityMonitorModule securityMonitorModule = new SecurityMonitorModule();

        generalIndicatorMonitorModule.startMonitoring();
        errorMonitorModule.startMonitoring();
        securityMonitorModule.startMonitoring();
    }
}
