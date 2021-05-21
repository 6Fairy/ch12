package edu.xcdq.beans;

public class Courier  extends  Person {
    //独有的属性id
    private  String id;

    public Courier() {
    }

    public Courier(String id) {
        this.id = id;
    }

    public Courier(String name, String sex, int age, String pwd, String phone, String id) {
        super(name, sex, age, pwd, phone);
        this.id = id;
    }

    public  String getId(){
        return  id;
    }
    public  void setId(String id){
        this.id=id;
    }
    @Override
    public String toString() {
        return "Courier{" +
                "id='" + id + '\'' +
                '}';
    }
}
