package UsandoArrayListPOO;

public class Empleado {
    private String name;
    private int age;
    private float salary;

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
