public class Member {
    String name;
    String surname;
     double weight;
     double height;

    Member(String name, String surname, double weight, double height){
        this.name=name;
        this.surname=surname;
        this.weight=weight;
        this.height=height;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:"+ name + "surname"+ surname+ "weight" + weight + "height" + height;
    }

    public double bmiMethod () {
        double bmi=weight/Math.pow(height/100,2);
        return bmi;
    }

    public void weightStatus(){
        String status;
        if (bmiMethod() <18.5){
            status="Thin";
        } else if (bmiMethod() < 25) {
            status="Normal";
        } else if (bmiMethod() < 30) {
            status="Fat";
        } else {
            status="Obese";
        }
        System.out.println(status);

    }
}