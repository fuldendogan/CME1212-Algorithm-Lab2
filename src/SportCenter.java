public class SportCenter {

    String nameofSportCenter;
    Member[] members=new Member[3];
    int count = 0;

    SportCenter(String nameofSportCenter) {
        this.nameofSportCenter = nameofSportCenter;
    }

    public void addMember(Member newMember) {
        members[count] = newMember;
        count++;
    }

    public void search(String name, String surname) {
        boolean found=false;
        for (Member member : members) {
            if (member.name == name & member.surname == surname) {
                System.out.println("Weight:" + member.weight + "Height:" + member.height);
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Boyle bir uye bulunamadi");
        }
    }

    public void printAllMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
