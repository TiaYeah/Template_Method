public class HouseType1 extends House{

    public HouseType1() {
        super(2, house_material.Дерево, "Односкатная", false);
    }

    @Override
    protected boolean getBasement() {
        return false;
    }

    @Override
    protected String getRoofType() {
        return "Односкатная";
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
