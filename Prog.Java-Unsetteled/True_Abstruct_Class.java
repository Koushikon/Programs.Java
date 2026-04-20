abstract class Animal
{
    abstract void soundOfAnimal();  // It is just an idea
}
 
class Cat extends Animal
{
    void soundOfAnimal()
    {
        System.out.println("Meoh");
        //Implementation of the idea according to requirements of sub class
    }
}
 
class Dog extends Animal
{
    void soundOfAnimal()
    {
        System.out.println("Bow Bow");
        //Implementation of the idea according to requirements of sub class
    }
}
class True_Abstruct_Class    //The main class... without this class program is right but not runnable
{
    public static void main(String []args)
    {
        Cat c=new Cat();
        Dog d=new Dog();
        c.soundOfAnimal();
        d.soundOfAnimal();
    }
}