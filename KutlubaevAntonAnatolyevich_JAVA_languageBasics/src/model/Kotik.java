package model;

public class Kotik {

    private int prettiness;
    private String name;
    private int weight;
    private String meow;
    private int satiety = (int) (Math.random() * 10 + 1);

    public static int getCounterKotik() {
        return counterKotik;
    }

    private static int counterKotik = 0;

    public Kotik() {
        counterKotik++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        counterKotik++;
    }

    private boolean play() {
        return functions("играет");
    }


    private boolean sleep() {
        return functions("спит");
    }


    private boolean chaseMouse() {
        return functions("гоняеться за мышью");
    }


    private boolean purr() {
        return functions("мурлычит");
    }


    private boolean washesUp() {
        return functions("умываеться");
    }


    private void eat(int satiety) {
        this.satiety += satiety;
        System.out.println("Котик ест. Сытость увеличина на " + satiety);
    }


    private void eat(int satiety, String meal) {
        this.satiety += satiety;
        System.out.println("Котик ест " + meal + " Сытость увеличина на " + satiety);
    }


    private void eat() {
        eat(8, "колбоса");
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            switch ((int) (Math.random() * 5 + 1)) {
                case 1:
                    if (!play()) {
                        eat();
                    }
                    break;
                case 2:
                    if (!sleep()) {
                        eat(5);
                    }
                    break;
                case 3:
                    if (!chaseMouse()) {
                        eat(10, "вискас");
                    }
                    break;
                case 4:
                    if (!purr()) {
                        eat(15);
                    }
                    break;

                case 5:
                    if (!washesUp()) {
                        eat();
                    }
                    break;
            }
        }
    }

    private boolean functions(String actions) {
        if (satiety > 0) {
            System.out.println(name + " " + actions);
            satiety--;
            return true;
        } else {
            System.out.println(name + " голоден. Покормите котика");
            return false;
        }
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

}
