package org.extraconsultation.cons_02.anonimousClasses.var2;

public class MonitoringDemoWithAnonymous{
    public static void main(String[] args) {

        int age = 10;

        MonitoringSystem general = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println(age);
                // логика работы этого модуля
            }
        };

        MonitoringSystem error = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                // логика работы этого модуля
            }
        };

        MonitoringSystem security = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                // логика работы этого модуля
            }
        };

        general.startMonitoring();
        error.startMonitoring();
        security.startMonitoring();

    }
}
