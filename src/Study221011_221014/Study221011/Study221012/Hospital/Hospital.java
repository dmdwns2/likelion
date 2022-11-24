package Study221011_221014.Study221011.Study221012.Hospital;

public class Hospital {

    final private String id;
    final private String address;
    final private String district;
    final private String category;
    final private int emergency_room;
    final private String name;
    final private String subdivision;

    public Hospital(String id, String address, String district, String category, String emergency_room, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.district = district;
        this.category = category;
        this.emergency_room = Integer.parseInt(emergency_room);
        this.name = name;
        this.subdivision = subdivision;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public int getEmergency_room() {
        return emergency_room;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}
