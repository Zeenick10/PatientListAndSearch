
import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PatientListAndSearch {


    public static void Sorting(List<Integer> ID, List<String> Name, List<Integer> Age, List<String> Disease, List<String>Date_Show, List<Integer> Phone, List<String> Doctor) {
        // Using Bubble Sort Algorithm
        for (int i = 0; i < ID.size()-1; i++){ //external loop
            for (int j=0; j < ID.size()-i-1; j++){ //internal loop
                if (ID.get(j) > ID.get(j+1))
                {

                    int tempID = ID.get(j);
                    String tempName = Name.get(j);
                    int tempAge = Age.get(j);
                    String tempDisease = Disease.get(j);
                    String tempDate = Date_Show.get(i);
                    int tempPhone = Phone.get(j);
                    String tempDoctor = Doctor.get(i);

                    ID.set(j,ID.get(j+1));
                    Name.set(j,Name.get(j+1));
                    Age.set(j,Age.get(j+1));
                    Disease.set(j,Disease.get(j+1));
                    Date_Show.set(j,Date_Show.get(j+1));
                    Phone.set(j,Phone.get(j+1));
                    Doctor.set(i,Doctor.get(j+1));

                    ID.set(j+1,tempID);
                    Name.set(j+1,tempName);
                    Age.set(j+1,tempAge);
                    Disease.set(j+1,tempDisease);
                    Date_Show.set(j+1,tempDate);
                    Phone.set(j+1,tempPhone);
                    Doctor.set(j+1,tempDoctor);

                }
            }
        }
    }

    public static void bubbleSort(List<Integer>ID, List<String> Name, List<Integer> Age, List<String> Disease, List<String>Date_Show, List<Integer> Phone, List<String> Doctor) {
        for (int i = 0; i < Name.size()-1; i++){ //external loop
            for (int j=0; j < Name.size()-i-1; j++){ //internal loop
                if (Name.get(j).compareTo(Name.get(j+1)) > 0)
                {

                    int tempID = ID.get(j);
                    String tempName = Name.get(j);
                    int tempAge = Age.get(j);
                    String tempDisease = Disease.get(j);
                    String tempDate = Date_Show.get(i);
                    int tempPhone = Phone.get(j);
                    String tempDoctor = Doctor.get(i);

                    ID.set(j,ID.get(j+1));
                    Name.set(j,Name.get(j+1));
                    Age.set(j,Age.get(j+1));
                    Disease.set(j,Disease.get(j+1));
                    Date_Show.set(j,Date_Show.get(j+1));
                    Phone.set(j,Phone.get(j+1));
                    Doctor.set(i,Doctor.get(j+1));

                    ID.set(j+1,tempID);
                    Name.set(j+1,tempName);
                    Age.set(j+1,tempAge);
                    Disease.set(j+1,tempDisease);
                    Date_Show.set(j+1,tempDate);
                    Phone.set(j+1,tempPhone);
                    Doctor.set(j+1,tempDoctor);

                }
            }
        }
    }

    public static void diseaseSort(List<Integer>ID, List<String> Name, List<Integer> Age, List<String> Disease, List<String>Date_Show, List<Integer> Phone, List<String> Doctor) {
        for (int i = 0; i < Disease.size()-1; i++){ //external loop
            for (int j=0; j < Disease.size()-i-1; j++){ //internal loop
                if (Disease.get(j).compareTo(Disease.get(j+1)) > 0)
                {

                    int tempID = ID.get(j);
                    String tempName = Name.get(j);
                    int tempAge = Age.get(j);
                    String tempDisease = Disease.get(j);
                    String tempDate = Date_Show.get(i);
                    int tempPhone = Phone.get(j);
                    String tempDoctor = Doctor.get(i);

                    ID.set(j,ID.get(j+1));
                    Name.set(j,Name.get(j+1));
                    Age.set(j,Age.get(j+1));
                    Disease.set(j,Disease.get(j+1));
                    Date_Show.set(j,Date_Show.get(j+1));
                    Phone.set(j,Phone.get(j+1));
                    Doctor.set(i,Doctor.get(j+1));

                    ID.set(j+1,tempID);
                    Name.set(j+1,tempName);
                    Age.set(j+1,tempAge);
                    Disease.set(j+1,tempDisease);
                    Date_Show.set(j+1,tempDate);
                    Phone.set(j+1,tempPhone);
                    Doctor.set(j+1,tempDoctor);

                }
            }
        }
    }

    public static int Searching(List<Integer> id, int ID) {
        //Using Binary Search Algorithm
        int small = 0; //array's index
        int large = id.size() - 1;

        while (large >= small) {
            int middle = (small + large) / 2; //find middle point
            if (id.get(middle) == ID)
            {
                return middle;
            }
            else if (id.get(middle) < ID) {
                small = middle + 1;
            }
            else if (id.get(middle) > ID) {
                large = middle - 1;
            }
        } return -1;
    }

    public static int SearchingName(List<String>name, String Name) {
        int small = 0; //array's index
        int large = name.size() - 1;

        while (large >= small) {
            int middle = (small + large) / 2; //find middle point
            if (name.get(middle).equals(Name))
            {
                return middle;
            }
            else if (name.get(middle).compareTo(Name) < 0) {
                small = middle + 1;
            }
            else if (name.get(middle).compareTo(Name) > 0) {
                large = middle - 1;
            }
        }return -1;
    }

    public static int SearchingDisease(List<String>disease, String Disease) {
        int small = 0; //array's index
        int large = disease.size() - 1;

        while (large >= small) {
            int middle = (small + large) / 2; //find middle point
            if (disease.get(middle).equals(Disease))
            {
                return middle;
            }
            else if (disease.get(middle).compareTo(Disease) < 0) {
                small = middle + 1;
            }
            else if (disease.get(middle).compareTo(Disease) > 0) {
                large = middle - 1;
            }
        }return -1;
    }


    public static void main(String[] args) {

        System.out.println("``Welcome to our Patient Booking System``");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of patients - ");
        int arraySize = s.nextInt();

//        List<Integer> patientInfo = new ArrayList<>(arraySize);

//        int[]  = new int[arraySize];
        List<Integer> ID = new ArrayList<>();
//        String[]  = new String[arraySize];
        List<String> Name = new ArrayList<>();
//        int[]  = new int[arraySize];
        List<Integer> Age = new ArrayList<>();
//        String[]  = new String[arraySize];
        List<String> Disease = new ArrayList<>();
//        int[]  = new int[arraySize];
        List<Integer> Phone = new ArrayList<>();

        List<String> Date_Show = new ArrayList<>();

        List<String> Doctor = new ArrayList<>();

        for (int i = 0; i < arraySize; i++){

            System.out.print("Enter patient ID - ");
            int Patient_ID = s.nextInt();
            ID.add(i,Patient_ID);

            Scanner nameScan = new Scanner(System.in);
            System.out.print("Enter patient Name - ");
            String Patient_Name = nameScan.nextLine();
            Name.add(i,Patient_Name);

            System.out.print("Enter patient Age - ");
            int Patient_Age = s.nextInt();
            Age.add(i,Patient_Age);

            Scanner diseaseScan = new Scanner(System.in);
            System.out.print("Enter the name of the patient's Disease - ");
            String Patient_Disease = diseaseScan.nextLine();
            Disease.add(i,Patient_Disease);

            Scanner dateScan = new Scanner(System.in);
            System.out.print("Enter a Doctor's appointment - ");
            String Show_Date = dateScan.nextLine();
            Date_Show.add(i,Show_Date);

            System.out.print("Enter patient Phone Number +959");
            int Patient_Phone = s.nextInt();
            Phone.add(i,Patient_Phone);

            Scanner doctorScan = new Scanner(System.in);
            System.out.print("Enter Doctor Name - ");
            String Doctor_Name = doctorScan.nextLine();
            Doctor.add(i,Doctor_Name);

            System.out.println("----------------------------------------------");
        }

        while (true){

            System.out.println("Choose the one you like!");
            System.out.println("1. Show Patient ID list. \n" + "2. To search Patient");
            int ans=s.nextInt();
            System.out.println("----------------------------------------------");

            while (ans < 1 || ans > 2){
                System.out.println("You can only enter 1 or 2; Please, Enter Again: ");
                ans=s.nextInt();
                System.out.println("----------------------------------------------");
            }

            if (ans == 1){
                Sorting(ID,Name,Age,Disease,Date_Show,Phone,Doctor); //call sorting method
                System.out.printf("%-15s %-19s %-15s %-15s %-20s %25s \n", "ID", "Name", "Age", "Disease", "Doctor's appointment", "Phone");
                for (int i = 0; i < ID.size(); i++) {
                    System.out.printf("%-15s %-19s %-15d %-15s %-20s %25s \n", ID.get(i), Name.get(i), Age.get(i), Disease.get(i), Date_Show.get(i), Phone.get(i));
                }
            }else{

                Scanner conScan = new Scanner(System.in);
                System.out.println("How do you want to find patient? \n1. Find 'ID', type 1 \n2. Find 'Name', type 2");
                System.out.print("Enter 1 for 'ID' or 2 for 'Name' - ");
                int condition = conScan.nextInt();
                System.out.println("----------------------------------------------");

                while (condition < 1 || condition > 3) {
                    System.out.println("Enter Again!! \nYou need to type 1 or 2 or 3");
                    System.out.print("Enter 1 or 2 or 3 - ");
                    condition = conScan.nextInt();
                    System.out.println("----------------------------------------------");
                }

                if (condition == 1){
//                    Searching with ID
                    System.out.println("Enter you want to search Patient's ID - ");
                    int id=s.nextInt();
                    Sorting(ID,Name,Age,Disease,Date_Show,Phone,Doctor); //call sorting method
                    int index= Searching(ID, id); //call searching method
                    System.out.println("----------------------------------------------");

                    if (index == -1){
                        System.out.println("You want to search Patient's ID " + "'" + id + "'" + " is not found ");
                    }
                    else{
                        System.out.printf("%-5s %-19s %-5s %-15s %-20s %15s \n", "ID", "Name", "Age", "Disease", "Doctor's appointment", "Phone");
                        System.out.printf("%-5s %-19s %-5d %-15s %-20s %15s \n", ID.get(index), Name.get(index), Age.get(index), Disease.get(index), Date_Show.get(index), Phone.get(index));
                        System.out.println("----------------------------------------------");
                    }
                }else if (condition == 2){
                    //Searching with Name
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter you want to search patient's Name");
                    String p_name = scanner.nextLine();
                    System.out.println("----------------------------------------------");

                    bubbleSort(ID,Name,Age,Disease,Date_Show,Phone,Doctor); //call sorting method
                    int indexName= SearchingName(Name, p_name); //call searching method

                    if (indexName == -1){
                        System.out.println("You want to search Patient's Name " + "'" + p_name + "'" + " is not found.");
                        System.out.println("----------------------------------------------");
                    }else{
                        System.out.printf("%-5s %-19s %-5s %-15s %-20s %15s \n", "ID", "Name", "Age", "Disease", "Doctor's appointment", "Phone");
                        System.out.printf("%-5s %-19s %-5d %-15s %-20s %15s \n", ID.get(indexName), Name.get(indexName), Age.get(indexName), Disease.get(indexName), Date_Show.get(indexName), Phone.get(indexName));
                        System.out.println("----------------------------------------------");
                    }
                }else{
                    //Searching with Disease
                    Scanner searchDisease = new Scanner(System.in);
                    System.out.println("Search Patient's Disease - ");
                    String diseaseSearch = searchDisease.nextLine();

                    diseaseSort(ID,Name,Age,Disease,Date_Show,Phone,Doctor); //call sorting method
                    int indexDisease= SearchingDisease(Disease, diseaseSearch); //call searching method

                    if (indexDisease == -1){
                        System.out.println("You want to search Patient's Disease " + "'" + diseaseSearch + "'" + " is not found ");
                        System.out.println("----------------------------------------------");
                    }else{
                        System.out.printf("%-5s %-19s %-5s %-15s %-20s %15s \n", "ID", "Name", "Age", "Disease", "Doctor's appointment", "Phone");
                        for (int i = 0; i < Disease.size(); i++){
                            if (Disease.get(i).equals(diseaseSearch)){
                                System.out.printf("%-5s %-19s %-5d %-15s %-20s %15s \n", ID.get(i), Name.get(i), Age.get(i), Disease.get(i), Date_Show.get(i), Phone.get(i));
                            }
                        }
                        System.out.println("----------------------------------------------");
                    }
                }
            }
            // Search Again Part
            System.out.println("Would you like search again? \"Yes\" or \"No\"");
            Scanner YesNo = new Scanner(System.in);
            String YesNo_String = YesNo.nextLine();

            if (YesNo_String.equalsIgnoreCase("yes"))    {
                System.out.println("----------------------------------------------");
            }else{
                System.out.println("----------------------------------------------");
                System.out.println ("Goodbye!");
                break;
            }
        }
    }
}