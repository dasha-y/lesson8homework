package clinic;

public class Therapist {


    public void cure(){
        System.out.println("Терапевт лечит");
    }
    public void treatment(Patient patient ){
        if (patient.getTreatment() == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.cure();
            patient.setDoctor("Хирург");
        } else if (patient.getTreatment() == 2) {
            Dentist dentist = new Dentist();
            dentist.cure();
            patient.setDoctor("Дантист");
        } else {
            cure();
            patient.setDoctor("Терапевт");
        }
    }
}
