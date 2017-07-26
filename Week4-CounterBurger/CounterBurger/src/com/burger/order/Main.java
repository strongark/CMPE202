package com.burger.order;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------- Burger 1 --------------");
        Burger burger1 = new Beef();

        burger1 = new OneThirdSize(burger1);

        burger1 = new OnABunServe(burger1);

        burger1 = new DanishBlueCheese(burger1);

        burger1 = new HoreseRadishCheddar(burger1);

        //Toppings
        burger1 = new BermudaRedOnion(burger1);

        burger1 = new BlackOlives(burger1);

        burger1 = new CarrotStrings(burger1);

        burger1 = new ColeSlaw(burger1);

        //Premium Topping
        burger1 = new ApplewoodSmokedBacon(burger1);

        burger1 = new ApricotSauce(burger1);

        System.out.println(burger1.getDescription() +" $ " + burger1.cost());


        System.out.println("------------- Burger 2 --------------");
        Burger burger2 = new Turkey();
        burger2 = new OneSize(burger2);
        burger2 = new InABowlServe(burger2);
        burger2 = new GreekFeta(burger2);
        burger2 = new DriedCranberries(burger2);
        burger2 = new GrilledOnions(burger2);
        burger2 = new LettuceBlend(burger2);
        burger2 = new Scallions(burger2);
        burger2 = new SweetBBQSauce(burger2);
        System.out.println(burger2.getDescription() +" $ " + burger2.cost());


        System.out.println("------------- Burger 3 --------------");
        Burger burger3 = new Veggie();
        burger3 = new TwoThirdSize(burger3);
        burger3 = new OnABunServe(burger3);
        burger3 = new HerbGoatCheeseSpread(burger3);
        burger3 = new ImportedSwiss(burger3);
        burger3 = new JalapenoJack(burger3);
        burger3 = new BermudaRedOnion(burger3);
        burger3 = new DilliPickleChips(burger3);
        burger3 = new HoneyMustard(burger3);
        burger3  = new ChipotleAioli(burger3);
        System.out.println(burger3.getDescription() +" $ " + burger3.cost());



    }
}
