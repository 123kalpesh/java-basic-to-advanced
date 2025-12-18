public class employee {
    private int id; //Private here only access the method of that class
    private String name ;
    protected int salary ; //protected is access in the same package and sub class
    constructor(){  // constructor is use to initialize the object 
        this.id = 1;
        this.name = "KALPESH-DESALE";
        this.salary = 10000;
    }

    public String gEtName(){
        return name;
    }
    public void setName(){
        this.name = "KALPESH-DESALE" ;
    }

    public void setName(String n){
        this.name = n;
    }
    
}
