package omerfaruk.dursun.coffe.shop.application;
/**
 * The Material class represents the ingredients that make up the different kinds of coffee.
 * @author Omer Faruk Dursun
 */
public class Material {

    private String name;

    /**
     * Material Constructor with name field
     * @param name Materials name
     */
    public Material(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
