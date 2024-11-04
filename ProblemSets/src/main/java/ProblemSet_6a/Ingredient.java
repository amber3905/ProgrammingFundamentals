package ProblemSet_6a;

public class Ingredient {

	private String name;
	private IngredientType type;
	private Supplier supplier;
	private double rawWeight;

	public Ingredient(String name, IngredientType type,
			Supplier supplier, double rawWeight) {
		super();
		this.name = name;
		this.type = type;
		this.supplier = supplier;
		this.rawWeight = rawWeight;
	}

	public String getName() {
		return this.name;
	}

	public IngredientType getType() {
		return this.type;
	}

	public String getSupplier() {
		return this.supplier.toString();
	}

	public double getRawWeight() {
		return this.rawWeight;
	}

	public double getCookedWeight() {
		return this.rawWeight * 0.8;
	}
}
