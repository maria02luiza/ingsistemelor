package ro.ulbs.paradigme.lab2;

public class Form  {
    private String color;
    public static int counter=0;
     public Form(){            //constructorul fara parametri care initializeaza culoarea alb
         this.color = "white";
         counter++;
     }
    public Form(String color){//constructor cu parametri
         this.color = color;
    }
   public float getArea(){
         return 0;
   }

    @Override
    public String toString() {
        return "this form has the color: " + color;
    }

     /*Adaugati in clasa Form din laboratorul anterior un membru (camp) static numit
           ‘counter’ care va numara instantele create. Adaugat in constructor incrementarea acestuia.
            Adaugat o functie public getter si apoi afisati in main valoarea acestui contor.*/

    public static int getCounter(){
        return counter;

    }

}
