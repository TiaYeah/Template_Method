public class HouseType3 extends House{
    public HouseType3() {
        super(1, house_material.Дерево, "Двускатная", false);
    }

    @Override
    protected boolean getBasement() {
        return true;
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
        return 2;
    }
}
