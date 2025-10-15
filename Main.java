public class Main{
    String name;
    int alter;
   
    public Cat(String name,int alter){
        this.name = "Unknown";
        this.alter = 0;
    }
        
    public static void main(String[] args){
        Cat bea = new Cat("Bea",3);

        System.out.println("Cat heisst "+ bea.name + "und ist " + bea.alter);
    }

}
