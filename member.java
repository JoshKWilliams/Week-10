package ChristmasClub;

import java.util.ArrayList;

public class member {

    private String name;
    private int contribution;

    private ArrayList<christmasClub> christmasClub;
    public member() {
        name = null;
        name = null;
    }

    public member(String name, int contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    public String getName() {
        return name;
    }

    public int getContribution() {
        return contribution;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }

        public int displayContribution() {
            return this.getContribution();
    }


    @Override
    public String toString() {
        return "member{" +
                "name='" + name + '\'' +
                ", contribution=" + contribution +
                '}';
    }
}
