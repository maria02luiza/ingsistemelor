package ro.ulbs.paradigme.lab2;

public class Form  {
    private String color;
     public Form(){            //constructorul fara parametri care initializeaza culoarea alb
         this.color = "white";
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
}
