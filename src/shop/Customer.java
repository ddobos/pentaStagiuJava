package shop;

public class Customer {
    private int id;
    private String name;
    private MemberShip memberShip;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.memberShip = MemberShip.NONE;
    }

    public Customer(int id, String name, MemberShip memberShip) {
        this.id = id;
        this.name = name;
        this.memberShip = memberShip;
    }

    public MemberShip getMemberShip() {
        return memberShip;
    }

    public void setMemberShip(MemberShip memberShip) {
        this.memberShip = memberShip;
    }

    public int getId() {
        return this.id;
    }
}
