package labs.Week_09;

public class Duck extends Animal {

    /**
     * Constructor requiring the animal's name.
     * 
     * @param name the name of the animal.
     */
    public Duck(String name) {
	super(name);
	System.out.println("In Duck constructor");
    }

    /**
     * @return the animal's name.
     * 
     */
    @Override
    public String getName() {
	return super.getName() + " is my duck name";
    }
}