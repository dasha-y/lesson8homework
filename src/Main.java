import clinic.Patient;
import clinic.Surgeon;
import clinic.Therapist;
import clinic.Dentist;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задаиние 1: ");

        Therapist therapist = new Therapist();


        Patient patient = new Patient();
        patient.setTreatment(1);
        therapist.treatment(patient );

        patient.setTreatment(2);
        therapist.treatment(patient );

        patient.setTreatment(3);
        therapist.treatment(patient );

        System.out.println();
        System.out.println("Задание 2: ");
        Apple apple = new Apple("White");


        try {
            Field field = apple.getClass().getDeclaredField("color");

            field.setAccessible(true);
            String name = (String) field.get(apple);
            System.out.println("Изначальное значение: "+name);

            field.set(apple, (String) "Black");
            name = (String) field.get(apple);
            System.out.println("Новое значение: "+name);
        } catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }






    }
}