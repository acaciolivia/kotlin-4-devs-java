package interoperabilidade;

public class Animal {
    private  String name;
    private  String kind;
    private  Integer weight;

    public Animal(String name, String kind, Integer weight) {
        this.name = name;
        this.kind = kind;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String show() {
        return name + "ia a " + kind + " and weighs " + weight + " kg!";
    }
}
