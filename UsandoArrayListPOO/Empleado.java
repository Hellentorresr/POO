package UsandoArrayListPOO;

public class Empleado {
    private final String name;
    private final int age;
    private final float salary;

    public Empleado(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

  public String getData(){
        return "The name of the Employee is: "+name+"\n"
                +"The Age is: "+age+"\n"
                +"The salary is: "+salary;
  }
}
