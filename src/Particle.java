public class Particle {
    double px;
    double py;
    double pz;
    double mass;

    public Particle(double px, double py, double pz, double mass) {
        this.px = px;
        this.py = py;
        this.pz = pz;
        this.mass = mass;
    }

    public double getPx() {
        return px;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public double getPy() {
        return py;
    }

    public void setPy(double py) {
        this.py = py;
    }

    public double getPz() {
        return pz;
    }

    public void setPz(double pz) {
        this.pz = pz;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    double kineticEnergy() {
        double vx = px / mass, vy = py / mass, vz = pz / mass;
        return 0.5 * mass * (vx * vx + vy * vy + vz * vz);
    }
}
