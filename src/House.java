abstract class House {
    int floor_num;
    house_material houseMaterial;
    String roof_type;
    boolean basement;

    public House(int floor_num, house_material houseMaterial, String roof_type, boolean basement) {
        this.floor_num = floor_num;
        this.houseMaterial = houseMaterial;
        this.roof_type = roof_type;
        this.basement = basement;
    }

    public void proectHouse()
    {
        System.out.println("Количество этажей: " + getFloorNum());
        System.out.println("Материал дома: " + getHouseMaterial());
        System.out.println("Тип крыши:" + getRoofType());
        if (getBasement()) {
            System.out.println("C подвалом ");
        } else {
            System.out.println("Без подвала");
        }
    }

    private void getHouseDecoration() {}

    protected abstract boolean getBasement();

    protected abstract String getRoofType();

    protected abstract house_material getHouseMaterial();

    protected abstract int getFloorNum();
}
