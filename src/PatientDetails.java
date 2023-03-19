import java.util.Scanner;

public class PatientDetails {
    public void detailOfpatient(){
        Patient patient = new Patient("Goodluck", 16, new Eye("Left eye", "Short sighted", "brown", true),
                new Eye("Right eye", "Normal", "brown", true),
                new Heart("Heart", "Normal",65),
                new Stomach("Stomach", "PUD", false),
                new Skin("Skin", "Burnt", "Brown", 65));

        System.out.println("Name: "+ patient.getName());
        System.out.println("Age: "+ patient.getAge());

        Scanner takeInput = new Scanner(System.in);

        boolean shouldFinish = false;
        while (!shouldFinish){
            System.out.println("Choose an Organ: "+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit");
            int userChoice = takeInput.nextInt();
            switch (userChoice){
                case 1:
                    patient.getLefteye().getDetails();
                    if (patient.getLefteye().isEyeOpen()){
                        System.out.println("\t\t1. close the Eye");
                        if (takeInput.nextInt()==1){
                            patient.getLefteye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the Eye");
                        if (takeInput.nextInt()==1){
                            patient.getLefteye().open();
                        }else {
                            continue;
                        }
                    }

                    break;
                case 2:
                    patient.getRighteye().getDetails();
                    if (patient.getRighteye().isEyeOpen()){
                        System.out.println("\t\t1. close the Eye");
                        if (takeInput.nextInt()==1){
                            patient.getRighteye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the Eye");
                        if (takeInput.nextInt()==1){
                            patient.getRighteye().open();
                        }else {
                            continue;
                        }
                    }

                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if (takeInput.nextInt()==1){
                        System.out.println("Enter the new Heart rate: ");
                        int newHeartRate =takeInput.nextInt();
                        patient.getHeart().setRateOfHeartBeat(newHeartRate);
                        System.out.println("Heart rate change to "+newHeartRate);
                    }else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (takeInput.nextInt()==1){
                        patient.getStomach().digest();
                    }else{
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish=true;
                    break;
            }
        }
    }
}
