public class Dog {
    private String Breed;
    private String Color;
    private int weight;
    private int height;
    public void layDown(){
        System.out.println("The "+Breed+" is laying down.");
    };

    public void sit(){
        System.out.println("The "+Breed+" awaits another command whilst sitting.");
    };

    public void shake(){
        System.out.println("The "+Breed+" extends its left paw.");
    };

    public Dog(String Breed, String Color, int weight, int height){
        this.Breed=Breed;
        this.Color=Color;
        this.weight = weight;
        this.height = height;

        System.out.println("The "+Color+" "+Breed+" weighs "+weight+" lbs.");
    }



    public static void main(String[] args){
        Dog myDog = new Dog("Hound", "Brown", 60,24);

        myDog.sit();


    }

}
