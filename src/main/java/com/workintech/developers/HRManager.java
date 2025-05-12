package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public  HRManager(long id, String name , double salary){
        super(id,name,salary);

    }
    @Override
    public void work(){
        System.out.println("HRManager starts to working");
    }


    public void addEmployee(long id,String name, double salary, int index, String developerLevel){
        if(developerLevel.equals("junior")){

            if(index<0 || index> juniorDevelopers.length ){
                System.out.println("Hata: İlgili index Junior Developers dizisinin sınırları dışında.");
            }else if(juniorDevelopers[index] != null){
                System.out.println("Junior Developers dizisindeki ilgili index boş değil.");
            }else{
                JuniorDeveloper juniorDev = new JuniorDeveloper(id,name,salary);
                juniorDevelopers[index] = juniorDev;
            }
        }else if(developerLevel.equals("midlevel")){

            if(index<0 || index> midDevelopers.length ){
                System.out.println("Hata: İlgili index Mid-Level Developers dizisinin sınırları dışında.");
            }else if(midDevelopers[index] != null){
                System.out.println("Mid-Level Developers dizisindeki ilgili index boş değil.");
            }else{
                MidDeveloper midLevelDev = new MidDeveloper(id,name,salary);
                midDevelopers[index] = midLevelDev;
            }

        }else if(developerLevel.equals("senior")){
            if(index<0 || index> seniorDevelopers.length ){
                System.out.println("Hata: İlgili index Senior Developers dizisinin sınırları dışında.");
            }else if(seniorDevelopers[index] != null){
                System.out.println("Senior Developers dizisindeki ilgili index boş değil.");
            }else{
                SeniorDeveloper seniorDev = new SeniorDeveloper(id,name,salary);
                seniorDevelopers[index] = seniorDev;
            }
        }else {
            System.out.println("Developer leveli şunlardan biri olmalıdır; 'junior' 'midlevel' 'senior");
        }
    }
}
