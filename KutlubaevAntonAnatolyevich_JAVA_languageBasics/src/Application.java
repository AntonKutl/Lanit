import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1=new Kotik();
        kotik1.setPrettiness(4);
        kotik1.setName("Пушок");
        kotik1.setWeight(10);
        kotik1.setMeow("Мяу");
        Kotik kotik2=new Kotik(3,"Васька",8,"Мяу");

        System.out.println(kotik1.getName()+" весит-"+kotik1.getWeight());
        kotik1.liveAnotherDay();

        if (kotik1.getMeow().equals(kotik2.getMeow())){
            System.out.println("Котики говорят одинакова");
        }else {System.out.println("Котики говорят по разному");}

        System.out.println("создано "+Kotik.getCounterKotik()+" кота");

    }
}
