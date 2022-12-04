public class HouseType2 extends House{

    public HouseType2() {
        super(3, house_material.Камень, "Четырехскатная", true);
    }

    @Override
    protected boolean getBasement() {
        return true;
    }

    @Override
    protected String getRoofType() {
        return "Четырехскатная";
    }

    @Override
    protected house_material getHouseMaterial() {
        return house_material.Камень;
    }

    @Override
    protected int getFloorNum() {
        return 3;
    }
}
