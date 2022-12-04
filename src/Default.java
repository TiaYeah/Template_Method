public class Default extends House {
    public Default() {
        super(1, house_material.Дерево, "Двускатная", false);
    }

    @Override
    protected boolean getBasement() {
        return false;
    }

    @Override
    protected String getRoofType() {
        return "Двускатная";
    }

    @Override
    protected house_material getHouseMaterial() {
        return house_material.Дерево;
    }

    @Override
    protected int getFloorNum() {
        return 1;
    }
}
