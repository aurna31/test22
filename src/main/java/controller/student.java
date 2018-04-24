package controller;

public class student {
    int id=5;
    public String name="aurna";

    public student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String isNext()
    {
       return "new";
    }
}
